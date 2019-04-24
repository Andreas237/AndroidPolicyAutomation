// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuo, zzakk, zzakb

public final class zzup
{

	public static void zza(zzuo zzuo1, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder(3 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:aload_1         
	//    4    6:invokestatic    #14  <Method String String.valueOf(Object)>
	//    5    9:invokevirtual   #18  <Method int String.length()>
	//    6   12:iadd            
	//    7   13:aload_2         
	//    8   14:invokestatic    #14  <Method String String.valueOf(Object)>
	//    9   17:invokevirtual   #18  <Method int String.length()>
	//   10   20:iadd            
	//   11   21:invokespecial   #22  <Method void StringBuilder(int)>
	//   12   24:astore_3        
		stringbuilder.append(s);
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append("(");
	//   17   31:aload_3         
	//   18   32:ldc1            #28  <String "(">
	//   19   34:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(s1);
	//   21   38:aload_3         
	//   22   39:aload_2         
	//   23   40:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		stringbuilder.append(");");
	//   25   44:aload_3         
	//   26   45:ldc1            #30  <String ");">
	//   27   47:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
		zzuo1.zzbe(stringbuilder.toString());
	//   29   51:aload_0         
	//   30   52:aload_3         
	//   31   53:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   32   56:invokeinterface #40  <Method void zzuo.zzbe(String)>
	//   33   61:return          
	}

	public static void zza(zzuo zzuo1, String s, Map map)
	{
		try
		{
			map = ((Map) (zzbv.zzek().zzn(map)));
	//    0    0:invokestatic    #50  <Method zzakk zzbv.zzek()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #56  <Method JSONObject zzakk.zzn(Map)>
	//    3    7:astore_2        
		}
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:invokeinterface #59  <Method void zzuo.zza(String, JSONObject)>
	//*   8   16:return          
	//*   9   17:ldc1            #61  <String "Could not convert parameters to JSON.">
	//*  10   19:invokestatic    #66  <Method void zzakb.zzdk(String)>
	//*  11   22:return          
		// Misplaced declaration of an exception variable
		catch(zzuo zzuo1)
		{
			zzakb.zzdk("Could not convert parameters to JSON.");
			return;
		}
		zzuo1.zza(s, ((JSONObject) (map)));
	//*  12   23:astore_0        
	//*  13   24:goto            17
	}

	public static void zza(zzuo zzuo1, String s, JSONObject jsonobject)
	{
		JSONObject jsonobject1 = jsonobject;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonobject == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			jsonobject1 = new JSONObject();
	//    4    6:new             #69  <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #72  <Method void JSONObject()>
	//    7   13:astore_3        
		zzuo1.zzf(s, jsonobject1.toString());
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #73  <Method String JSONObject.toString()>
	//   12   20:invokeinterface #77  <Method void zzuo.zzf(String, String)>
	//   13   25:return          
	}

	public static void zzb(zzuo zzuo1, String s, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonobject == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new JSONObject()));
	//    4    6:new             #69  <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #72  <Method void JSONObject()>
	//    7   13:astore_3        
		obj = ((Object) (((JSONObject) (obj)).toString()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #73  <Method String JSONObject.toString()>
	//   10   18:astore_3        
		jsonobject = ((JSONObject) (new StringBuilder()));
	//   11   19:new             #8   <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #79  <Method void StringBuilder()>
	//   14   26:astore_2        
		((StringBuilder) (jsonobject)).append("(window.AFMA_ReceiveMessage || function() {})('");
	//   15   27:aload_2         
	//   16   28:ldc1            #81  <String "(window.AFMA_ReceiveMessage || function() {})('">
	//   17   30:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		((StringBuilder) (jsonobject)).append(s);
	//   19   34:aload_2         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
		((StringBuilder) (jsonobject)).append("'");
	//   23   40:aload_2         
	//   24   41:ldc1            #83  <String "'">
	//   25   43:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
		((StringBuilder) (jsonobject)).append(",");
	//   27   47:aload_2         
	//   28   48:ldc1            #85  <String ",">
	//   29   50:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   30   53:pop             
		((StringBuilder) (jsonobject)).append(((String) (obj)));
	//   31   54:aload_2         
	//   32   55:aload_3         
	//   33   56:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   34   59:pop             
		((StringBuilder) (jsonobject)).append(");");
	//   35   60:aload_2         
	//   36   61:ldc1            #30  <String ");">
	//   37   63:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
		s = String.valueOf(((Object) (((StringBuilder) (jsonobject)).toString())));
	//   39   67:aload_2         
	//   40   68:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   41   71:invokestatic    #14  <Method String String.valueOf(Object)>
	//   42   74:astore_1        
		if(s.length() != 0)
	//*  43   75:aload_1         
	//*  44   76:invokevirtual   #18  <Method int String.length()>
	//*  45   79:ifeq            92
			s = "Dispatching AFMA event: ".concat(s);
	//   46   82:ldc1            #87  <String "Dispatching AFMA event: ">
	//   47   84:aload_1         
	//   48   85:invokevirtual   #91  <Method String String.concat(String)>
	//   49   88:astore_1        
		else
	//*  50   89:goto            102
			s = new String("Dispatching AFMA event: ");
	//   51   92:new             #10  <Class String>
	//   52   95:dup             
	//   53   96:ldc1            #87  <String "Dispatching AFMA event: ">
	//   54   98:invokespecial   #93  <Method void String(String)>
	//   55  101:astore_1        
		zzakb.zzck(s);
	//   56  102:aload_1         
	//   57  103:invokestatic    #96  <Method void zzakb.zzck(String)>
		zzuo1.zzbe(((StringBuilder) (jsonobject)).toString());
	//   58  106:aload_0         
	//   59  107:aload_2         
	//   60  108:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   61  111:invokeinterface #40  <Method void zzuo.zzbe(String)>
	//   62  116:return          
	}
}
