// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;


// Referenced classes of package android.support.v4.content.res:
//			FontResourcesParserCompat

public static final class FontResourcesParserCompat$FontFamilyFilesResourceEntry
	implements FontResourcesParserCompat.FamilyResourceEntry
{

	public FontResourcesParserCompat.FontFileResourceEntry[] getEntries()
	{
		return mEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FontResourcesParserCompat$FontFileResourceEntry[] mEntries>
	//    2    4:areturn         
	}

	private final FontResourcesParserCompat.FontFileResourceEntry mEntries[];

	public FontResourcesParserCompat$FontFamilyFilesResourceEntry(FontResourcesParserCompat.FontFileResourceEntry afontfileresourceentry[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mEntries = afontfileresourceentry;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field FontResourcesParserCompat$FontFileResourceEntry[] mEntries>
	//    5    9:return          
	}
}
