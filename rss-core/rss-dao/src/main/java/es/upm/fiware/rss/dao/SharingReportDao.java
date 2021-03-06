/**
 * Copyright (C) 2015 CoNWeT Lab., Universidad Politécnica de Madrid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package es.upm.fiware.rss.dao;

import es.upm.fiware.rss.model.SharingReport;

import java.util.List;
import java.util.Optional;

public interface SharingReportDao extends GenericDao<SharingReport, Integer> {

    /**
     * Get getRevenueModelsByProviderId.
     * 
     * @param providerId
     */

    Optional<List<SharingReport>> getSharingReportsByParameters(String aggregator, String providerId, String productClass, boolean all, int offset, int size);
}
