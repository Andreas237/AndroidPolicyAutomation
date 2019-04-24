// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

public final class EditorInfoCompat
{

	public EditorInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static String[] getContentMimeTypes(EditorInfo editorinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 25)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmplt          23
		{
			editorinfo = ((EditorInfo) (editorinfo.contentMimeTypes));
	//    3    8:aload_0         
	//    4    9:getfield        #38  <Field String[] EditorInfo.contentMimeTypes>
	//    5   12:astore_0        
			if(editorinfo != null)
	//*   6   13:aload_0         
	//*   7   14:ifnull          19
				return ((String []) (editorinfo));
	//    8   17:aload_0         
	//    9   18:areturn         
			else
				return EMPTY_STRING_ARRAY;
	//   10   19:getstatic       #21  <Field String[] EMPTY_STRING_ARRAY>
	//   11   22:areturn         
		}
		if(editorinfo.extras == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #42  <Field Bundle EditorInfo.extras>
	//*  14   27:ifnonnull       34
			return EMPTY_STRING_ARRAY;
	//   15   30:getstatic       #21  <Field String[] EMPTY_STRING_ARRAY>
	//   16   33:areturn         
		editorinfo = ((EditorInfo) (editorinfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")));
	//   17   34:aload_0         
	//   18   35:getfield        #42  <Field Bundle EditorInfo.extras>
	//   19   38:ldc1            #8   <String "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES">
	//   20   40:invokevirtual   #48  <Method String[] Bundle.getStringArray(String)>
	//   21   43:astore_0        
		if(editorinfo != null)
	//*  22   44:aload_0         
	//*  23   45:ifnull          50
			return ((String []) (editorinfo));
	//   24   48:aload_0         
	//   25   49:areturn         
		else
			return EMPTY_STRING_ARRAY;
	//   26   50:getstatic       #21  <Field String[] EMPTY_STRING_ARRAY>
	//   27   53:areturn         
	}

	public static void setContentMimeTypes(EditorInfo editorinfo, String as[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 25)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmplt          14
		{
			editorinfo.contentMimeTypes = as;
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:putfield        #38  <Field String[] EditorInfo.contentMimeTypes>
			return;
	//    6   13:return          
		}
		if(editorinfo.extras == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #42  <Field Bundle EditorInfo.extras>
	//*   9   18:ifnonnull       32
			editorinfo.extras = new Bundle();
	//   10   21:aload_0         
	//   11   22:new             #44  <Class Bundle>
	//   12   25:dup             
	//   13   26:invokespecial   #53  <Method void Bundle()>
	//   14   29:putfield        #42  <Field Bundle EditorInfo.extras>
		editorinfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", as);
	//   15   32:aload_0         
	//   16   33:getfield        #42  <Field Bundle EditorInfo.extras>
	//   17   36:ldc1            #8   <String "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES">
	//   18   38:aload_1         
	//   19   39:invokevirtual   #57  <Method void Bundle.putStringArray(String, String[])>
	//   20   42:return          
	}

	private static final String CONTENT_MIME_TYPES_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
	private static final String EMPTY_STRING_ARRAY[] = new String[0];
	public static final int IME_FLAG_FORCE_ASCII = 0x80000000;
	public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 0x1000000;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:putstatic       #21  <Field String[] EMPTY_STRING_ARRAY>
	//*   3    7:return          
	}
}
