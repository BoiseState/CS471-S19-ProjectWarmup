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
@BUG MediumPriority - qtpf (2 of 2) ->|
@BUG MediumPriority - qtpf (2 of 2) ->|/*
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

package com.mucommander.desktop.kde;

@BUG LowPriority - bwwo (1 of 1) ->|import com.mucommander.desktop.TrashProvider;

/**
 * @author Maxence Bernard
 */
abstract class Kde4DesktopAdapter extends KdeDesktopAdapter {

    static String BASE_COMMAND = "kioclient";

    @Override
    protected String getFileManagerName() {
        return "Dolphin";
    }

    @Override
@BUG HighPriority - clxp (1 of 3) ->|    protected String getBaseCommand() {
@BUG HighPriority - clxp (1 of 3) ->|        return BASE_COMMAND;
@BUG HighPriority - clxp (1 of 3) ->|    }

    @Override
    protected TrashProvider getTrashProvider() {
        return new Kde4TrashProvider();
    }
}
