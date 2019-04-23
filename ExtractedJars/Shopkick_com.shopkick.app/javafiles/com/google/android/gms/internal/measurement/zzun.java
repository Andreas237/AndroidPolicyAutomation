// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvu, zzuo, zzvt

final class zzun
	implements zzvu
{

	private zzun()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static zzun zzwe()
	{
		return zzbyc;
	//    0    0:getstatic       #15  <Field zzun zzbyc>
	//    1    3:areturn         
	}

	public final boolean zze(Class class1)
	{
		return ((Class) (com/google/android/gms/internal/measurement/zzuo)).isAssignableFrom(class1);
	//    0    0:ldc1            #23  <Class zzuo>
	//    1    2:aload_1         
	//    2    3:invokevirtual   #28  <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ireturn         
	}

	public final zzvt zzf(Class class1)
	{
		if(!((Class) (com/google/android/gms/internal/measurement/zzuo)).isAssignableFrom(class1))
	//*   0    0:ldc1            #23  <Class zzuo>
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #28  <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifne            53
		{
			class1 = ((Class) (String.valueOf(((Object) (class1.getName())))));
	//    4    9:aload_1         
	//    5   10:invokevirtual   #38  <Method String Class.getName()>
	//    6   13:invokestatic    #44  <Method String String.valueOf(Object)>
	//    7   16:astore_1        
			if(((String) (class1)).length() != 0)
	//*   8   17:aload_1         
	//*   9   18:invokevirtual   #48  <Method int String.length()>
	//*  10   21:ifeq            34
				class1 = ((Class) ("Unsupported message type: ".concat(((String) (class1)))));
	//   11   24:ldc1            #50  <String "Unsupported message type: ">
	//   12   26:aload_1         
	//   13   27:invokevirtual   #54  <Method String String.concat(String)>
	//   14   30:astore_1        
			else
	//*  15   31:goto            44
				class1 = ((Class) (new String("Unsupported message type: ")));
	//   16   34:new             #40  <Class String>
	//   17   37:dup             
	//   18   38:ldc1            #50  <String "Unsupported message type: ">
	//   19   40:invokespecial   #57  <Method void String(String)>
	//   20   43:astore_1        
			throw new IllegalArgumentException(((String) (class1)));
	//   21   44:new             #59  <Class IllegalArgumentException>
	//   22   47:dup             
	//   23   48:aload_1         
	//   24   49:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   25   52:athrow          
		}
		zzvt zzvt1;
		try
		{
			zzvt1 = (zzvt)zzuo.zzg(class1.asSubclass(com/google/android/gms/internal/measurement/zzuo)).zza(zzuo.zze.zzbym, ((Object) (null)), ((Object) (null)));
	//   26   53:aload_1         
	//   27   54:ldc1            #23  <Class zzuo>
	//   28   56:invokevirtual   #64  <Method Class Class.asSubclass(Class)>
	//   29   59:invokestatic    #68  <Method zzuo zzuo.zzg(Class)>
	//   30   62:getstatic       #74  <Field int zzuo$zze.zzbym>
	//   31   65:aconst_null     
	//   32   66:aconst_null     
	//   33   67:invokevirtual   #78  <Method Object zzuo.zza(int, Object, Object)>
	//   34   70:checkcast       #80  <Class zzvt>
	//   35   73:astore_2        
		}
	//*  36   74:aload_2         
	//*  37   75:areturn         
		catch(Exception exception)
	//*  38   76:astore_2        
		{
			class1 = ((Class) (String.valueOf(((Object) (class1.getName())))));
	//   39   77:aload_1         
	//   40   78:invokevirtual   #38  <Method String Class.getName()>
	//   41   81:invokestatic    #44  <Method String String.valueOf(Object)>
	//   42   84:astore_1        
			if(((String) (class1)).length() != 0)
	//*  43   85:aload_1         
	//*  44   86:invokevirtual   #48  <Method int String.length()>
	//*  45   89:ifeq            102
				class1 = ((Class) ("Unable to get message info for ".concat(((String) (class1)))));
	//   46   92:ldc1            #82  <String "Unable to get message info for ">
	//   47   94:aload_1         
	//   48   95:invokevirtual   #54  <Method String String.concat(String)>
	//   49   98:astore_1        
			else
	//*  50   99:goto            112
				class1 = ((Class) (new String("Unable to get message info for ")));
	//   51  102:new             #40  <Class String>
	//   52  105:dup             
	//   53  106:ldc1            #82  <String "Unable to get message info for ">
	//   54  108:invokespecial   #57  <Method void String(String)>
	//   55  111:astore_1        
			throw new RuntimeException(((String) (class1)), ((Throwable) (exception)));
	//   56  112:new             #84  <Class RuntimeException>
	//   57  115:dup             
	//   58  116:aload_1         
	//   59  117:aload_2         
	//   60  118:invokespecial   #87  <Method void RuntimeException(String, Throwable)>
	//   61  121:athrow          
		}
		return zzvt1;
	}

	private static final zzun zzbyc = new zzun();

	static 
	{
	//    0    0:new             #2   <Class zzun>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzun()>
	//    3    7:putstatic       #15  <Field zzun zzbyc>
	//*   4   10:return          
	}
}
