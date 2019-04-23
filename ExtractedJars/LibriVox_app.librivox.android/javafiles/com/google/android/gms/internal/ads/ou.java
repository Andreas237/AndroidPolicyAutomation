// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			pe, ze, ov, wx, 
//			at, bj

public final class ou
	implements pe
{

	public ou()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final bj a(ov ov1, JSONObject jsonobject)
	{
		JSONObject jsonobject1 = ze.a(jsonobject, new String[] {
			"html_containers", "instream"
		});
	//    0    0:aload_2         
	//    1    1:iconst_2        
	//    2    2:anewarray       String[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:ldc1            #18  <String "html_containers">
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:ldc1            #20  <String "instream">
	//   10   14:aastore         
	//   11   15:invokestatic    #25  <Method JSONObject ze.a(JSONObject, String[])>
	//   12   18:astore_3        
		if(jsonobject1 == null)
	//*  13   19:aload_3         
	//*  14   20:ifnonnull       34
			ov1 = ((ov) (ov1.a(jsonobject, "video")));
	//   15   23:aload_1         
	//   16   24:aload_2         
	//   17   25:ldc1            #27  <String "video">
	//   18   27:invokevirtual   #32  <Method abe ov.a(JSONObject, String)>
	//   19   30:astore_1        
		else
	//*  20   31:goto            52
			ov1 = ((ov) (ov1.a(jsonobject1.optString("base_url"), jsonobject1.optString("html"), true)));
	//   21   34:aload_1         
	//   22   35:aload_3         
	//   23   36:ldc1            #34  <String "base_url">
	//   24   38:invokevirtual   #40  <Method String JSONObject.optString(String)>
	//   25   41:aload_3         
	//   26   42:ldc1            #42  <String "html">
	//   27   44:invokevirtual   #40  <Method String JSONObject.optString(String)>
	//   28   47:iconst_1        
	//   29   48:invokevirtual   #45  <Method abe ov.a(String, String, boolean)>
	//   30   51:astore_1        
		ov1 = ((ov) (ov.a(((abe) (ov1)))));
	//   31   52:aload_1         
	//   32   53:invokestatic    #48  <Method afn ov.a(abe)>
	//   33   56:astore_1        
		if(ov1 == null)
	//*  34   57:aload_1         
	//*  35   58:ifnonnull       68
		{
			wx.e("Can not get video view for instream ad.");
	//   36   61:ldc1            #50  <String "Can not get video view for instream ad.">
	//   37   63:invokestatic    #56  <Method void wx.e(String)>
			return null;
	//   38   66:aconst_null     
	//   39   67:areturn         
		} else
		{
			return ((bj) (new at(((afn) (ov1)))));
	//   40   68:new             #58  <Class at>
	//   41   71:dup             
	//   42   72:aload_1         
	//   43   73:invokespecial   #61  <Method void at(afn)>
	//   44   76:areturn         
		}
	}
}
