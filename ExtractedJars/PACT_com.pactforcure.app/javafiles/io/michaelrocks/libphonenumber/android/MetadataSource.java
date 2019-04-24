// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;


interface MetadataSource
{

	public abstract Phonemetadata.PhoneMetadata getAlternateFormatsForCountry(int i);

	public abstract Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i);

	public abstract Phonemetadata.PhoneMetadata getMetadataForRegion(String s);

	public abstract Phonemetadata.PhoneMetadata getShortNumberMetadataForRegion(String s);
}
