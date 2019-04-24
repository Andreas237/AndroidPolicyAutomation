// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import java.util.ArrayList;

public class zzel
{

	private zzel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static Parcelable zza(Parcel parcel, android.os.Parcelable.Creator creator)
	{
		if(parcel.readInt() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method int Parcel.readInt()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (Parcelable)creator.createFromParcel(parcel);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #34  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    8   16:checkcast       #36  <Class Parcelable>
	//    9   19:areturn         
	}

	public static void zza(Parcel parcel, IInterface iinterface)
	{
		if(iinterface == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			iinterface = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #43  <Method void Parcel.writeStrongBinder(android.os.IBinder)>
	//*   7   11:return          
			iinterface = ((IInterface) (iinterface.asBinder()));
	//    8   12:aload_1         
	//    9   13:invokeinterface #49  <Method android.os.IBinder IInterface.asBinder()>
	//   10   18:astore_1        
		parcel.writeStrongBinder(((android.os.IBinder) (iinterface)));
	//*  11   19:goto            6
	}

	public static void zza(Parcel parcel, Parcelable parcelable)
	{
		if(parcelable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			parcel.writeInt(0);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #54  <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		} else
		{
			parcel.writeInt(1);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #54  <Method void Parcel.writeInt(int)>
			parcelable.writeToParcel(parcel, 0);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:invokeinterface #58  <Method void Parcelable.writeToParcel(Parcel, int)>
			return;
	//   13   23:return          
		}
	}

	public static void zza(Parcel parcel, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #61  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #63  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #68  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static boolean zza(Parcel parcel)
	{
		return parcel.readInt() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method int Parcel.readInt()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static ArrayList zzb(Parcel parcel)
	{
		return parcel.readArrayList(zzui);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field ClassLoader zzui>
	//    2    4:invokevirtual   #75  <Method ArrayList Parcel.readArrayList(ClassLoader)>
	//    3    7:areturn         
	}

	public static void zzb(Parcel parcel, Parcelable parcelable)
	{
		if(parcelable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			parcel.writeInt(0);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #54  <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		} else
		{
			parcel.writeInt(1);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #54  <Method void Parcel.writeInt(int)>
			parcelable.writeToParcel(parcel, 1);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:invokeinterface #58  <Method void Parcelable.writeToParcel(Parcel, int)>
			return;
	//   13   23:return          
		}
	}

	private static final ClassLoader zzui = ((Class) (com/google/android/gms/internal/ads/zzel)).getClassLoader();

	static 
	{
	//    0    0:ldc1            #2   <Class zzel>
	//    1    2:invokevirtual   #14  <Method ClassLoader Class.getClassLoader()>
	//    2    5:putstatic       #16  <Field ClassLoader zzui>
	//*   3    8:return          
	}
}
