/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2018 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
@BUG MediumPriority - ukej (2 of 2) ->|
@BUG MediumPriority - ukej (2 of 2) ->|package com.mucommander.desktop.gnome;

import com.mucommander.process.ProcessRunner;

/**
 * @author Nicolas Rinaudo
 */
public class ConfiguredGnomeDesktopAdapter extends GnomeDesktopAdapter {
    private static final String ENV_VAR = "GNOME_DESKTOP_SESSION_ID";

    public String toString() {return "Gnome Desktop";}

    @Override
    public boolean isAvailable() {
        String var = System.getenv(ENV_VAR);

        return var != null && !var.trim().equals("");
    }

    @Override
    protected String getFileOpenerCommand() {
        try {
            ProcessRunner.execute(GVFS_OPEN);
            return GVFS_OPEN;
        }
        catch(Exception e) {}

@BUG LowPriority - ztph (1 of 1) ->|        try {
            ProcessRunner.execute(GNOME_OPEN);
            return GNOME_OPEN;
        }
        catch(Exception e) {}

        return XDG_OPEN;
    }
}
