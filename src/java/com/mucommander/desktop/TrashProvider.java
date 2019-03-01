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
@BUG HighPriority - ovei (3 of 3) ->|
@BUG HighPriority - ovei (3 of 3) ->|package com.mucommander.desktop;
@BUG HighPriority - ovei (3 of 3) ->|
/**
 * TrashProvider provides a way to instantiate {@link AbstractTrash} implementations.
 *
 * <p>Trash providers can be registered with {@link DesktopManager#setTrashProvider(TrashProvider)}
 * for them to become the default trash one.</p>
 *
 * @see com.mucommander.desktop.AbstractTrash
 * @see DesktopManager#setTrashProvider(TrashProvider)
 * @author Nicolas Rinaudo
 */
public interface TrashProvider {

    /**
     * Returns a trash instance.
     * 
     * @return a trash instance
     */
@BUG MediumPriority - zwpe (1 of 2) ->|    public AbstractTrash getTrash();
@BUG MediumPriority - zwpe (1 of 2) ->|
}
