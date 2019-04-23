// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			boq, bmq, ny, bwq, 
//			byq, bxr

public class uy extends boq
{

	public uy(int i, String s, byq byq1, bxr bxr)
	{
		super(i, s, bxr);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #13  <Method void boq(int, String, bxr)>
	//    5    8:aload_0         
	//    6    9:new             #15  <Class Object>
	//    7   12:dup             
	//    8   13:invokespecial   #18  <Method void Object()>
	//    9   16:putfield        #20  <Field Object a>
		b = byq1;
	//   10   19:aload_0         
	//   11   20:aload_3         
	//   12   21:putfield        #22  <Field byq b>
	//   13   24:return          
	}

	protected final bwq a(bmq bmq1)
	{
		Object obj;
		byte abyte0[];
		abyte0 = bmq1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #31  <Field byte[] bmq.b>
	//    2    4:astore          5
		obj = ((Object) (bmq1.c));
	//    3    6:aload_1         
	//    4    7:getfield        #35  <Field Map bmq.c>
	//    5   10:astore_3        
		String s = "ISO-8859-1";
	//    6   11:ldc1            #37  <String "ISO-8859-1">
	//    7   13:astore          4
		String s1 = (String)((Map) (obj)).get("Content-Type");
	//    8   15:aload_3         
	//    9   16:ldc1            #39  <String "Content-Type">
	//   10   18:invokeinterface #45  <Method Object Map.get(Object)>
	//   11   23:checkcast       #47  <Class String>
	//   12   26:astore          6
		obj = ((Object) (s));
	//   13   28:aload           4
	//   14   30:astore_3        
		if(s1 == null) goto _L2; else goto _L1
	//   15   31:aload           6
	//   16   33:ifnull          96
_L1:
		String as[] = s1.split(";", 0);
	//   17   36:aload           6
	//   18   38:ldc1            #49  <String ";">
	//   19   40:iconst_0        
	//   20   41:invokevirtual   #53  <Method String[] String.split(String, int)>
	//   21   44:astore          6
		int i = 1;
	//   22   46:iconst_1        
	//   23   47:istore_2        
_L7:
		obj = ((Object) (s));
	//   24   48:aload           4
	//   25   50:astore_3        
		if(i >= as.length) goto _L2; else goto _L3
	//   26   51:iload_2         
	//   27   52:aload           6
	//   28   54:arraylength     
	//   29   55:icmpge          96
_L3:
		obj = ((Object) (as[i].trim().split("=", 0)));
	//   30   58:aload           6
	//   31   60:iload_2         
	//   32   61:aaload          
	//   33   62:invokevirtual   #57  <Method String String.trim()>
	//   34   65:ldc1            #59  <String "=">
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #53  <Method String[] String.split(String, int)>
	//   37   71:astore_3        
		if(obj.length != 2 || !((String) (obj[0])).equals("charset")) goto _L5; else goto _L4
	//   38   72:aload_3         
	//   39   73:arraylength     
	//   40   74:iconst_2        
	//   41   75:icmpne          135
	//   42   78:aload_3         
	//   43   79:iconst_0        
	//   44   80:aaload          
	//   45   81:ldc1            #61  <String "charset">
	//   46   83:invokevirtual   #65  <Method boolean String.equals(Object)>
	//   47   86:ifeq            135
_L4:
		obj = ((Object) (obj[1]));
	//   48   89:aload_3         
	//   49   90:iconst_1        
	//   50   91:aaload          
	//   51   92:astore_3        
	//*  52   93:goto            96
_L2:
		UnsupportedEncodingException unsupportedencodingexception;
		try
		{
			obj = ((Object) (new String(abyte0, ((String) (obj)))));
	//   53   96:new             #47  <Class String>
	//   54   99:dup             
	//   55  100:aload           5
	//   56  102:aload_3         
	//   57  103:invokespecial   #68  <Method void String(byte[], String)>
	//   58  106:astore_3        
		}
	//*  59  107:goto            122
	//*  60  110:new             #47  <Class String>
	//*  61  113:dup             
	//*  62  114:aload_1         
	//*  63  115:getfield        #31  <Field byte[] bmq.b>
	//*  64  118:invokespecial   #71  <Method void String(byte[])>
	//*  65  121:astore_3        
	//*  66  122:aload_3         
	//*  67  123:aload_1         
	//*  68  124:invokestatic    #76  <Method azi ny.a(bmq)>
	//*  69  127:invokestatic    #81  <Method bwq bwq.a(Object, azi)>
	//*  70  130:areturn         
		// Misplaced declaration of an exception variable
		catch(UnsupportedEncodingException unsupportedencodingexception)
		{
			obj = ((Object) (new String(bmq1.b)));
		}
		return bwq.a(obj, ny.a(bmq1));
	//*  71  131:astore_3        
	//*  72  132:goto            110
_L5:
		i++;
	//   73  135:iload_2         
	//   74  136:iconst_1        
	//   75  137:iadd            
	//   76  138:istore_2        
		if(true) goto _L7; else goto _L6
	//   77  139:goto            48
_L6:
	}

	protected void a(Object obj)
	{
		a((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #47  <Class String>
	//    3    5:invokevirtual   #85  <Method void a(String)>
	//    4    8:return          
	}

	protected void a(String s)
	{
		byq byq1;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			byq1 = b;
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field byq b>
	//    7   11:astore_3        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		if(byq1 != null)
	//*  10   14:aload_3         
	//*  11   15:ifnull          25
			byq1.a(((Object) (s)));
	//   12   18:aload_3         
	//   13   19:aload_1         
	//   14   20:invokeinterface #89  <Method void byq.a(Object)>
		return;
	//   15   25:return          
		s;
	//   16   26:astore_1        
		obj;
	//   17   27:aload_2         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw s;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	private final Object a = new Object();
	private byq b;
}
