// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;


// Referenced classes of package android.support.v4.content.res:
//			FontResourcesParserCompat

public static final class FontResourcesParserCompat$FontFileResourceEntry
{

	public String getFileName()
	{
		return mFileName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String mFileName>
	//    2    4:areturn         
	}

	public int getResourceId()
	{
		return mResourceId;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mResourceId>
	//    2    4:ireturn         
	}

	public int getTtcIndex()
	{
		return mTtcIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mTtcIndex>
	//    2    4:ireturn         
	}

	public String getVariationSettings()
	{
		return mVariationSettings;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String mVariationSettings>
	//    2    4:areturn         
	}

	public int getWeight()
	{
		return mWeight;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int mWeight>
	//    2    4:ireturn         
	}

	public boolean isItalic()
	{
		return mItalic;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean mItalic>
	//    2    4:ireturn         
	}

	private final String mFileName;
	private boolean mItalic;
	private int mResourceId;
	private int mTtcIndex;
	private String mVariationSettings;
	private int mWeight;

	public FontResourcesParserCompat$FontFileResourceEntry(String s, int i, boolean flag, String s1, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mFileName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String mFileName>
		mWeight = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field int mWeight>
		mItalic = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #29  <Field boolean mItalic>
		mVariationSettings = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field String mVariationSettings>
		mTtcIndex = j;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #33  <Field int mTtcIndex>
		mResourceId = k;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #35  <Field int mResourceId>
	//   20   37:return          
	}
}
