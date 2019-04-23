// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzgu, zzhx, zzga, zzhw

final class zzhs
{

	private zzhs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #25  <Field ConcurrentMap zzzy>
		zzhx zzhx1 = null;
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
			zzhx zzhx2 = zzr((new String[] {
				"com.google.protobuf.AndroidProto3SchemaFactory"
			})[0]);
	//   13   23:iconst_1        
	//   14   24:anewarray       String[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:ldc1            #29  <String "com.google.protobuf.AndroidProto3SchemaFactory">
	//   18   31:aastore         
	//   19   32:iconst_0        
	//   20   33:aaload          
	//   21   34:invokestatic    #33  <Method zzhx zzr(String)>
	//   22   37:astore_3        
			zzhx1 = zzhx2;
	//   23   38:aload_3         
	//   24   39:astore_2        
			if(zzhx2 != null)
				break;
	//   25   40:aload_3         
	//   26   41:ifnonnull       53
			i++;
	//   27   44:iload_1         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore_1        
			zzhx1 = zzhx2;
	//   31   48:aload_3         
	//   32   49:astore_2        
		} while(true);
	//   33   50:goto            19
		Object obj = ((Object) (zzhx1));
	//   34   53:aload_2         
	//   35   54:astore_3        
		if(zzhx1 == null)
	//*  36   55:aload_2         
	//*  37   56:ifnonnull       67
			obj = ((Object) (new zzgu()));
	//   38   59:new             #35  <Class zzgu>
	//   39   62:dup             
	//   40   63:invokespecial   #36  <Method void zzgu()>
	//   41   66:astore_3        
		zzzx = ((zzhx) (obj));
	//   42   67:aload_0         
	//   43   68:aload_3         
	//   44   69:putfield        #38  <Field zzhx zzzx>
	//   45   72:return          
	}

	public static zzhs zzgl()
	{
		return zzzw;
	//    0    0:getstatic       #18  <Field zzhs zzzw>
	//    1    3:areturn         
	}

	private static zzhx zzr(String s)
	{
		try
		{
			s = ((String) ((zzhx)Class.forName(s).getConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_0         
	//    1    1:invokestatic    #48  <Method Class Class.forName(String)>
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #52  <Method Constructor Class.getConstructor(Class[])>
	//    5   11:iconst_0        
	//    6   12:anewarray       Object[]
	//    7   15:invokevirtual   #58  <Method Object Constructor.newInstance(Object[])>
	//    8   18:checkcast       #60  <Class zzhx>
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
		return ((zzhx) (s));
	//*  14   26:astore_0        
	//*  15   27:goto            24
	}

	public final zzhw zzf(Class class1)
	{
		zzga.zza(((Object) (class1)), "messageType");
	//    0    0:aload_1         
	//    1    1:ldc1            #64  <String "messageType">
	//    2    3:invokestatic    #70  <Method Object zzga.zza(Object, String)>
	//    3    6:pop             
		zzhw zzhw1 = (zzhw)zzzy.get(((Object) (class1)));
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field ConcurrentMap zzzy>
	//    6   11:aload_1         
	//    7   12:invokeinterface #76  <Method Object ConcurrentMap.get(Object)>
	//    8   17:checkcast       #78  <Class zzhw>
	//    9   20:astore_3        
		Object obj = ((Object) (zzhw1));
	//   10   21:aload_3         
	//   11   22:astore_2        
		if(zzhw1 == null)
	//*  12   23:aload_3         
	//*  13   24:ifnonnull       73
		{
			obj = ((Object) (zzzx.zze(class1)));
	//   14   27:aload_0         
	//   15   28:getfield        #38  <Field zzhx zzzx>
	//   16   31:aload_1         
	//   17   32:invokeinterface #81  <Method zzhw zzhx.zze(Class)>
	//   18   37:astore_2        
			zzga.zza(((Object) (class1)), "messageType");
	//   19   38:aload_1         
	//   20   39:ldc1            #64  <String "messageType">
	//   21   41:invokestatic    #70  <Method Object zzga.zza(Object, String)>
	//   22   44:pop             
			zzga.zza(obj, "schema");
	//   23   45:aload_2         
	//   24   46:ldc1            #83  <String "schema">
	//   25   48:invokestatic    #70  <Method Object zzga.zza(Object, String)>
	//   26   51:pop             
			class1 = ((Class) ((zzhw)zzzy.putIfAbsent(((Object) (class1)), obj)));
	//   27   52:aload_0         
	//   28   53:getfield        #25  <Field ConcurrentMap zzzy>
	//   29   56:aload_1         
	//   30   57:aload_2         
	//   31   58:invokeinterface #87  <Method Object ConcurrentMap.putIfAbsent(Object, Object)>
	//   32   63:checkcast       #78  <Class zzhw>
	//   33   66:astore_1        
			if(class1 != null)
	//*  34   67:aload_1         
	//*  35   68:ifnull          73
				obj = ((Object) (class1));
	//   36   71:aload_1         
	//   37   72:astore_2        
		}
		return ((zzhw) (obj));
	//   38   73:aload_2         
	//   39   74:areturn         
	}

	public final zzhw zzs(Object obj)
	{
		return zzf(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method Class Object.getClass()>
	//    3    5:invokevirtual   #97  <Method zzhw zzf(Class)>
	//    4    8:areturn         
	}

	private static final zzhs zzzw = new zzhs();
	private final zzhx zzzx;
	private final ConcurrentMap zzzy = new ConcurrentHashMap();

	static 
	{
	//    0    0:new             #2   <Class zzhs>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzhs()>
	//    3    7:putstatic       #18  <Field zzhs zzzw>
	//*   4   10:return          
	}
}
