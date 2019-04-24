// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.provider.BaseColumns;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

public static final class FontsContractCompat$Columns
	implements BaseColumns
{

	public static final String FILE_ID = "file_id";
	public static final String ITALIC = "font_italic";
	public static final String RESULT_CODE = "result_code";
	public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
	public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
	public static final int RESULT_CODE_MALFORMED_QUERY = 3;
	public static final int RESULT_CODE_OK = 0;
	public static final String TTC_INDEX = "font_ttc_index";
	public static final String VARIATION_SETTINGS = "font_variation_settings";
	public static final String WEIGHT = "font_weight";

	public FontsContractCompat$Columns()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}
}
