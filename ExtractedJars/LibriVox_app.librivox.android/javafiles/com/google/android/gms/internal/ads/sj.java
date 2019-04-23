// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.gmsg.al;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, sb

public final class sj
	implements ag
{

	public sj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final void zza(Object obj, Map map)
	{
		String s = (String)map.get("request_id");
	//    0    0:aload_2         
	//    1    1:ldc1            #15  <String "request_id">
	//    2    3:invokeinterface #21  <Method Object Map.get(Object)>
	//    3    8:checkcast       #23  <Class String>
	//    4   11:astore_3        
		obj = ((Object) (String.valueOf(((Object) ((String)map.get("errors"))))));
	//    5   12:aload_2         
	//    6   13:ldc1            #25  <String "errors">
	//    7   15:invokeinterface #21  <Method Object Map.get(Object)>
	//    8   20:checkcast       #23  <Class String>
	//    9   23:invokestatic    #29  <Method String String.valueOf(Object)>
	//   10   26:astore_1        
		if(((String) (obj)).length() != 0)
	//*  11   27:aload_1         
	//*  12   28:invokevirtual   #33  <Method int String.length()>
	//*  13   31:ifeq            44
			obj = ((Object) ("Invalid request: ".concat(((String) (obj)))));
	//   14   34:ldc1            #35  <String "Invalid request: ">
	//   15   36:aload_1         
	//   16   37:invokevirtual   #39  <Method String String.concat(String)>
	//   17   40:astore_1        
		else
	//*  18   41:goto            54
			obj = ((Object) (new String("Invalid request: ")));
	//   19   44:new             #23  <Class String>
	//   20   47:dup             
	//   21   48:ldc1            #35  <String "Invalid request: ">
	//   22   50:invokespecial   #42  <Method void String(String)>
	//   23   53:astore_1        
		wx.e(((String) (obj)));
	//   24   54:aload_1         
	//   25   55:invokestatic    #47  <Method void wx.e(String)>
		sb.d().b(s);
	//   26   58:invokestatic    #53  <Method al sb.d()>
	//   27   61:aload_3         
	//   28   62:invokevirtual   #58  <Method void al.b(String)>
	//   29   65:return          
	}
}
