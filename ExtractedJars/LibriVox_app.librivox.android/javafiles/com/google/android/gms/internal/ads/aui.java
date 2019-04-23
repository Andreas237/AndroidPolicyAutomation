// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			atk, auo, aso, aun

final class aui
{

	private aui()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #24  <Field ConcurrentMap c>
		auo auo1 = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		do
		{
			if(i > 0)
				break;
	//   11   19:iload_1         
	//   12   20:ifgt            53
			auo auo2 = a((new String[] {
				"com.google.protobuf.AndroidProto3SchemaFactory"
			})[0]);
	//   13   23:iconst_1        
	//   14   24:anewarray       String[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:ldc1            #28  <String "com.google.protobuf.AndroidProto3SchemaFactory">
	//   18   31:aastore         
	//   19   32:iconst_0        
	//   20   33:aaload          
	//   21   34:invokestatic    #31  <Method auo a(String)>
	//   22   37:astore_3        
			auo1 = auo2;
	//   23   38:aload_3         
	//   24   39:astore_2        
			if(auo2 != null)
				break;
	//   25   40:aload_3         
	//   26   41:ifnonnull       53
			i++;
	//   27   44:iload_1         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore_1        
			auo1 = auo2;
	//   31   48:aload_3         
	//   32   49:astore_2        
		} while(true);
	//   33   50:goto            19
		Object obj = ((Object) (auo1));
	//   34   53:aload_2         
	//   35   54:astore_3        
		if(auo1 == null)
	//*  36   55:aload_2         
	//*  37   56:ifnonnull       67
			obj = ((Object) (new atk()));
	//   38   59:new             #33  <Class atk>
	//   39   62:dup             
	//   40   63:invokespecial   #34  <Method void atk()>
	//   41   66:astore_3        
		b = ((auo) (obj));
	//   42   67:aload_0         
	//   43   68:aload_3         
	//   44   69:putfield        #36  <Field auo b>
	//   45   72:return          
	}

	public static aui a()
	{
		return a;
	//    0    0:getstatic       #17  <Field aui a>
	//    1    3:areturn         
	}

	private static auo a(String s)
	{
		try
		{
			s = ((String) ((auo)Class.forName(s).getConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_0         
	//    1    1:invokestatic    #45  <Method Class Class.forName(String)>
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #49  <Method Constructor Class.getConstructor(Class[])>
	//    5   11:iconst_0        
	//    6   12:anewarray       Object[]
	//    7   15:invokevirtual   #55  <Method Object Constructor.newInstance(Object[])>
	//    8   18:checkcast       #57  <Class auo>
	//    9   21:astore_0        
		}
	//*  10   22:aload_0         
	//*  11   23:areturn         
	//*  12   24:aconst_null     
	//*  13   25:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((auo) (s));
	//*  14   26:astore_0        
	//*  15   27:goto            24
	}

	public final aun a(Class class1)
	{
		aso.a(((Object) (class1)), "messageType");
	//    0    0:aload_1         
	//    1    1:ldc1            #60  <String "messageType">
	//    2    3:invokestatic    #65  <Method Object aso.a(Object, String)>
	//    3    6:pop             
		aun aun1 = (aun)c.get(((Object) (class1)));
	//    4    7:aload_0         
	//    5    8:getfield        #24  <Field ConcurrentMap c>
	//    6   11:aload_1         
	//    7   12:invokeinterface #71  <Method Object ConcurrentMap.get(Object)>
	//    8   17:checkcast       #73  <Class aun>
	//    9   20:astore_3        
		Object obj = ((Object) (aun1));
	//   10   21:aload_3         
	//   11   22:astore_2        
		if(aun1 == null)
	//*  12   23:aload_3         
	//*  13   24:ifnonnull       73
		{
			obj = ((Object) (b.a(class1)));
	//   14   27:aload_0         
	//   15   28:getfield        #36  <Field auo b>
	//   16   31:aload_1         
	//   17   32:invokeinterface #75  <Method aun auo.a(Class)>
	//   18   37:astore_2        
			aso.a(((Object) (class1)), "messageType");
	//   19   38:aload_1         
	//   20   39:ldc1            #60  <String "messageType">
	//   21   41:invokestatic    #65  <Method Object aso.a(Object, String)>
	//   22   44:pop             
			aso.a(obj, "schema");
	//   23   45:aload_2         
	//   24   46:ldc1            #77  <String "schema">
	//   25   48:invokestatic    #65  <Method Object aso.a(Object, String)>
	//   26   51:pop             
			class1 = ((Class) ((aun)c.putIfAbsent(((Object) (class1)), obj)));
	//   27   52:aload_0         
	//   28   53:getfield        #24  <Field ConcurrentMap c>
	//   29   56:aload_1         
	//   30   57:aload_2         
	//   31   58:invokeinterface #81  <Method Object ConcurrentMap.putIfAbsent(Object, Object)>
	//   32   63:checkcast       #73  <Class aun>
	//   33   66:astore_1        
			if(class1 != null)
	//*  34   67:aload_1         
	//*  35   68:ifnull          73
				obj = ((Object) (class1));
	//   36   71:aload_1         
	//   37   72:astore_2        
		}
		return ((aun) (obj));
	//   38   73:aload_2         
	//   39   74:areturn         
	}

	public final aun a(Object obj)
	{
		return a(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method Class Object.getClass()>
	//    3    5:invokevirtual   #87  <Method aun a(Class)>
	//    4    8:areturn         
	}

	private static final aui a = new aui();
	private final auo b;
	private final ConcurrentMap c = new ConcurrentHashMap();

	static 
	{
	//    0    0:new             #2   <Class aui>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void aui()>
	//    3    7:putstatic       #17  <Field aui a>
	//*   4   10:return          
	}
}
