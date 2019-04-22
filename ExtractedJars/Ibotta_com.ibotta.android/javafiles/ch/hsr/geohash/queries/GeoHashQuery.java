// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.hsr.geohash.queries;

import ch.hsr.geohash.GeoHash;
import ch.hsr.geohash.WGS84Point;
import java.util.List;

public interface GeoHashQuery
{

	public abstract boolean contains(GeoHash geohash);

	public abstract boolean contains(WGS84Point wgs84point);

	public abstract List getSearchHashes();

	public abstract String getWktBox();
}
