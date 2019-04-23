// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.safeparcel;

import android.os.*;
import android.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class SafeParcelWriter
{

	private SafeParcelWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int beginObjectHeader(Parcel parcel)
	{
		return zza(parcel, 20293);
	//    0    0:aload_0         
	//    1    1:sipush          20293
	//    2    4:invokestatic    #15  <Method int zza(Parcel, int)>
	//    3    7:ireturn         
	}

	public static void finishObjectHeader(Parcel parcel, int i)
	{
		zzb(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #20  <Method void zzb(Parcel, int)>
	//    3    5:return          
	}

	public static void writeBigDecimal(Parcel parcel, int i, BigDecimal bigdecimal, boolean flag)
	{
		if(bigdecimal == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeByteArray(bigdecimal.unscaledValue().toByteArray());
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #31  <Method BigInteger BigDecimal.unscaledValue()>
	//   16   26:invokevirtual   #37  <Method byte[] BigInteger.toByteArray()>
	//   17   29:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>
			parcel.writeInt(bigdecimal.scale());
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #47  <Method int BigDecimal.scale()>
	//   21   37:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			zzb(parcel, i);
	//   22   40:aload_0         
	//   23   41:iload_1         
	//   24   42:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   25   45:return          
		}
	}

	public static void writeBigDecimalArray(Parcel parcel, int i, BigDecimal abigdecimal[], boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(abigdecimal == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = abigdecimal.length;
	//   15   25:aload_2         
	//   16   26:arraylength     
	//   17   27:istore          6
		parcel.writeInt(k);
	//   18   29:aload_0         
	//   19   30:iload           6
	//   20   32:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   35:iload           4
	//*  22   37:istore_1        
	//*  23   38:iload_1         
	//*  24   39:iload           6
	//*  25   41:icmpge          74
		{
			parcel.writeByteArray(abigdecimal[i].unscaledValue().toByteArray());
	//   26   44:aload_0         
	//   27   45:aload_2         
	//   28   46:iload_1         
	//   29   47:aaload          
	//   30   48:invokevirtual   #31  <Method BigInteger BigDecimal.unscaledValue()>
	//   31   51:invokevirtual   #37  <Method byte[] BigInteger.toByteArray()>
	//   32   54:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>
			parcel.writeInt(abigdecimal[i].scale());
	//   33   57:aload_0         
	//   34   58:aload_2         
	//   35   59:iload_1         
	//   36   60:aaload          
	//   37   61:invokevirtual   #47  <Method int BigDecimal.scale()>
	//   38   64:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		}

	//   39   67:iload_1         
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:istore_1        
	//*  43   71:goto            38
		zzb(parcel, j);
	//   44   74:aload_0         
	//   45   75:iload           5
	//   46   77:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   47   80:return          
	}

	public static void writeBigInteger(Parcel parcel, int i, BigInteger biginteger, boolean flag)
	{
		if(biginteger == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeByteArray(biginteger.toByteArray());
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #37  <Method byte[] BigInteger.toByteArray()>
	//   16   26:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>
			zzb(parcel, i);
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   20   34:return          
		}
	}

	public static void writeBigIntegerArray(Parcel parcel, int i, BigInteger abiginteger[], boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(abiginteger == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = abiginteger.length;
	//   15   25:aload_2         
	//   16   26:arraylength     
	//   17   27:istore          6
		parcel.writeInt(k);
	//   18   29:aload_0         
	//   19   30:iload           6
	//   20   32:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   35:iload           4
	//*  22   37:istore_1        
	//*  23   38:iload_1         
	//*  24   39:iload           6
	//*  25   41:icmpge          61
			parcel.writeByteArray(abiginteger[i].toByteArray());
	//   26   44:aload_0         
	//   27   45:aload_2         
	//   28   46:iload_1         
	//   29   47:aaload          
	//   30   48:invokevirtual   #37  <Method byte[] BigInteger.toByteArray()>
	//   31   51:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>

	//   32   54:iload_1         
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:istore_1        
	//*  36   58:goto            38
		zzb(parcel, j);
	//   37   61:aload_0         
	//   38   62:iload           5
	//   39   64:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   40   67:return          
	}

	public static void writeBoolean(Parcel parcel, int i, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #61  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #63  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #68  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static void writeBooleanArray(Parcel parcel, int i, boolean aflag[], boolean flag)
	{
		if(aflag == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeBooleanArray(aflag);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #73  <Method void Parcel.writeBooleanArray(boolean[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeBooleanList(Parcel parcel, int i, List list, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #61  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #68  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static void writeBooleanObject(Parcel parcel, int i, Boolean boolean1, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #61  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #68  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static void writeBundle(Parcel parcel, int i, Bundle bundle, boolean flag)
	{
		if(bundle == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeBundle(bundle);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #86  <Method void Parcel.writeBundle(Bundle)>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeByte(Parcel parcel, int i, byte byte0)
	{
		zzb(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #25  <Method void zzb(Parcel, int, int)>
		parcel.writeInt(((int) (byte0)));
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #51  <Method void Parcel.writeInt(int)>
	//    7   11:return          
	}

	public static void writeByteArray(Parcel parcel, int i, byte abyte0[], boolean flag)
	{
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeByteArray(abyte0);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeByteArrayArray(Parcel parcel, int i, byte abyte0[][], boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(abyte0 == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = abyte0.length;
	//   15   25:aload_2         
	//   16   26:arraylength     
	//   17   27:istore          6
		parcel.writeInt(k);
	//   18   29:aload_0         
	//   19   30:iload           6
	//   20   32:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   35:iload           4
	//*  22   37:istore_1        
	//*  23   38:iload_1         
	//*  24   39:iload           6
	//*  25   41:icmpge          58
			parcel.writeByteArray(abyte0[i]);
	//   26   44:aload_0         
	//   27   45:aload_2         
	//   28   46:iload_1         
	//   29   47:aaload          
	//   30   48:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>

	//   31   51:iload_1         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore_1        
	//*  35   55:goto            38
		zzb(parcel, j);
	//   36   58:aload_0         
	//   37   59:iload           5
	//   38   61:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   39   64:return          
	}

	public static void writeByteArraySparseArray(Parcel parcel, int i, SparseArray sparsearray, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sparsearray == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = sparsearray.size();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #98  <Method int SparseArray.size()>
	//   17   29:istore          6
		parcel.writeInt(k);
	//   18   31:aload_0         
	//   19   32:iload           6
	//   20   34:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   37:iload           4
	//*  22   39:istore_1        
	//*  23   40:iload_1         
	//*  24   41:iload           6
	//*  25   43:icmpge          74
		{
			parcel.writeInt(sparsearray.keyAt(i));
	//   26   46:aload_0         
	//   27   47:aload_2         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #102 <Method int SparseArray.keyAt(int)>
	//   30   52:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeByteArray((byte[])sparsearray.valueAt(i));
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:iload_1         
	//   34   58:invokevirtual   #106 <Method Object SparseArray.valueAt(int)>
	//   35   61:checkcast       #108 <Class byte[]>
	//   36   64:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>
		}

	//   37   67:iload_1         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_1        
	//*  41   71:goto            40
		zzb(parcel, j);
	//   42   74:aload_0         
	//   43   75:iload           5
	//   44   77:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   45   80:return          
	}

	public static void writeChar(Parcel parcel, int i, char c)
	{
		zzb(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #25  <Method void zzb(Parcel, int, int)>
		parcel.writeInt(((int) (c)));
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #51  <Method void Parcel.writeInt(int)>
	//    7   11:return          
	}

	public static void writeCharArray(Parcel parcel, int i, char ac[], boolean flag)
	{
		if(ac == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeCharArray(ac);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #116 <Method void Parcel.writeCharArray(char[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeDouble(Parcel parcel, int i, double d)
	{
		zzb(parcel, i, 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:invokestatic    #25  <Method void zzb(Parcel, int, int)>
		parcel.writeDouble(d);
	//    4    7:aload_0         
	//    5    8:dload_2         
	//    6    9:invokevirtual   #121 <Method void Parcel.writeDouble(double)>
	//    7   12:return          
	}

	public static void writeDoubleArray(Parcel parcel, int i, double ad[], boolean flag)
	{
		if(ad == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeDoubleArray(ad);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #126 <Method void Parcel.writeDoubleArray(double[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeDoubleList(Parcel parcel, int i, List list, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(list == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = list.size();
	//   15   25:aload_2         
	//   16   26:invokeinterface #130 <Method int List.size()>
	//   17   31:istore          6
		parcel.writeInt(k);
	//   18   33:aload_0         
	//   19   34:iload           6
	//   20   36:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   39:iload           4
	//*  22   41:istore_1        
	//*  23   42:iload_1         
	//*  24   43:iload           6
	//*  25   45:icmpge          72
			parcel.writeDouble(((Double)list.get(i)).doubleValue());
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:iload_1         
	//   29   51:invokeinterface #133 <Method Object List.get(int)>
	//   30   56:checkcast       #135 <Class Double>
	//   31   59:invokevirtual   #139 <Method double Double.doubleValue()>
	//   32   62:invokevirtual   #121 <Method void Parcel.writeDouble(double)>

	//   33   65:iload_1         
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore_1        
	//*  37   69:goto            42
		zzb(parcel, j);
	//   38   72:aload_0         
	//   39   73:iload           5
	//   40   75:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   41   78:return          
	}

	public static void writeDoubleObject(Parcel parcel, int i, Double double1, boolean flag)
	{
		if(double1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			zzb(parcel, i, 8);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:bipush          8
	//   12   19:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			parcel.writeDouble(double1.doubleValue());
	//   13   22:aload_0         
	//   14   23:aload_2         
	//   15   24:invokevirtual   #139 <Method double Double.doubleValue()>
	//   16   27:invokevirtual   #121 <Method void Parcel.writeDouble(double)>
			return;
	//   17   30:return          
		}
	}

	public static void writeDoubleSparseArray(Parcel parcel, int i, SparseArray sparsearray, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sparsearray == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = sparsearray.size();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #98  <Method int SparseArray.size()>
	//   17   29:istore          6
		parcel.writeInt(k);
	//   18   31:aload_0         
	//   19   32:iload           6
	//   20   34:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   37:iload           4
	//*  22   39:istore_1        
	//*  23   40:iload_1         
	//*  24   41:iload           6
	//*  25   43:icmpge          77
		{
			parcel.writeInt(sparsearray.keyAt(i));
	//   26   46:aload_0         
	//   27   47:aload_2         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #102 <Method int SparseArray.keyAt(int)>
	//   30   52:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeDouble(((Double)sparsearray.valueAt(i)).doubleValue());
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:iload_1         
	//   34   58:invokevirtual   #106 <Method Object SparseArray.valueAt(int)>
	//   35   61:checkcast       #135 <Class Double>
	//   36   64:invokevirtual   #139 <Method double Double.doubleValue()>
	//   37   67:invokevirtual   #121 <Method void Parcel.writeDouble(double)>
		}

	//   38   70:iload_1         
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore_1        
	//*  42   74:goto            40
		zzb(parcel, j);
	//   43   77:aload_0         
	//   44   78:iload           5
	//   45   80:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   46   83:return          
	}

	public static void writeFloat(Parcel parcel, int i, float f)
	{
		zzb(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #25  <Method void zzb(Parcel, int, int)>
		parcel.writeFloat(f);
	//    4    6:aload_0         
	//    5    7:fload_2         
	//    6    8:invokevirtual   #149 <Method void Parcel.writeFloat(float)>
	//    7   11:return          
	}

	public static void writeFloatArray(Parcel parcel, int i, float af[], boolean flag)
	{
		if(af == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeFloatArray(af);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #154 <Method void Parcel.writeFloatArray(float[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeFloatList(Parcel parcel, int i, List list, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(list == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = list.size();
	//   15   25:aload_2         
	//   16   26:invokeinterface #130 <Method int List.size()>
	//   17   31:istore          6
		parcel.writeInt(k);
	//   18   33:aload_0         
	//   19   34:iload           6
	//   20   36:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   39:iload           4
	//*  22   41:istore_1        
	//*  23   42:iload_1         
	//*  24   43:iload           6
	//*  25   45:icmpge          72
			parcel.writeFloat(((Float)list.get(i)).floatValue());
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:iload_1         
	//   29   51:invokeinterface #133 <Method Object List.get(int)>
	//   30   56:checkcast       #157 <Class Float>
	//   31   59:invokevirtual   #161 <Method float Float.floatValue()>
	//   32   62:invokevirtual   #149 <Method void Parcel.writeFloat(float)>

	//   33   65:iload_1         
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore_1        
	//*  37   69:goto            42
		zzb(parcel, j);
	//   38   72:aload_0         
	//   39   73:iload           5
	//   40   75:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   41   78:return          
	}

	public static void writeFloatObject(Parcel parcel, int i, Float float1, boolean flag)
	{
		if(float1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			zzb(parcel, i, 4);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iconst_4        
	//   12   18:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			parcel.writeFloat(float1.floatValue());
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #161 <Method float Float.floatValue()>
	//   16   26:invokevirtual   #149 <Method void Parcel.writeFloat(float)>
			return;
	//   17   29:return          
		}
	}

	public static void writeFloatSparseArray(Parcel parcel, int i, SparseArray sparsearray, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sparsearray == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = sparsearray.size();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #98  <Method int SparseArray.size()>
	//   17   29:istore          6
		parcel.writeInt(k);
	//   18   31:aload_0         
	//   19   32:iload           6
	//   20   34:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   37:iload           4
	//*  22   39:istore_1        
	//*  23   40:iload_1         
	//*  24   41:iload           6
	//*  25   43:icmpge          77
		{
			parcel.writeInt(sparsearray.keyAt(i));
	//   26   46:aload_0         
	//   27   47:aload_2         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #102 <Method int SparseArray.keyAt(int)>
	//   30   52:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(((Float)sparsearray.valueAt(i)).floatValue());
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:iload_1         
	//   34   58:invokevirtual   #106 <Method Object SparseArray.valueAt(int)>
	//   35   61:checkcast       #157 <Class Float>
	//   36   64:invokevirtual   #161 <Method float Float.floatValue()>
	//   37   67:invokevirtual   #149 <Method void Parcel.writeFloat(float)>
		}

	//   38   70:iload_1         
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore_1        
	//*  42   74:goto            40
		zzb(parcel, j);
	//   43   77:aload_0         
	//   44   78:iload           5
	//   45   80:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   46   83:return          
	}

	public static void writeIBinder(Parcel parcel, int i, IBinder ibinder, boolean flag)
	{
		if(ibinder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeStrongBinder(ibinder);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #172 <Method void Parcel.writeStrongBinder(IBinder)>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeIBinderArray(Parcel parcel, int i, IBinder aibinder[], boolean flag)
	{
		if(aibinder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeBinderArray(aibinder);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #178 <Method void Parcel.writeBinderArray(IBinder[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeIBinderList(Parcel parcel, int i, List list, boolean flag)
	{
		if(list == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeBinderList(list);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #183 <Method void Parcel.writeBinderList(List)>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeIBinderSparseArray(Parcel parcel, int i, SparseArray sparsearray, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sparsearray == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = sparsearray.size();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #98  <Method int SparseArray.size()>
	//   17   29:istore          6
		parcel.writeInt(k);
	//   18   31:aload_0         
	//   19   32:iload           6
	//   20   34:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   37:iload           4
	//*  22   39:istore_1        
	//*  23   40:iload_1         
	//*  24   41:iload           6
	//*  25   43:icmpge          74
		{
			parcel.writeInt(sparsearray.keyAt(i));
	//   26   46:aload_0         
	//   27   47:aload_2         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #102 <Method int SparseArray.keyAt(int)>
	//   30   52:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeStrongBinder((IBinder)sparsearray.valueAt(i));
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:iload_1         
	//   34   58:invokevirtual   #106 <Method Object SparseArray.valueAt(int)>
	//   35   61:checkcast       #187 <Class IBinder>
	//   36   64:invokevirtual   #172 <Method void Parcel.writeStrongBinder(IBinder)>
		}

	//   37   67:iload_1         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_1        
	//*  41   71:goto            40
		zzb(parcel, j);
	//   42   74:aload_0         
	//   43   75:iload           5
	//   44   77:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   45   80:return          
	}

	public static void writeInt(Parcel parcel, int i, int j)
	{
		zzb(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #25  <Method void zzb(Parcel, int, int)>
		parcel.writeInt(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #51  <Method void Parcel.writeInt(int)>
	//    7   11:return          
	}

	public static void writeIntArray(Parcel parcel, int i, int ai[], boolean flag)
	{
		if(ai == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeIntArray(ai);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #193 <Method void Parcel.writeIntArray(int[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeIntegerList(Parcel parcel, int i, List list, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(list == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = list.size();
	//   15   25:aload_2         
	//   16   26:invokeinterface #130 <Method int List.size()>
	//   17   31:istore          6
		parcel.writeInt(k);
	//   18   33:aload_0         
	//   19   34:iload           6
	//   20   36:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   39:iload           4
	//*  22   41:istore_1        
	//*  23   42:iload_1         
	//*  24   43:iload           6
	//*  25   45:icmpge          72
			parcel.writeInt(((Integer)list.get(i)).intValue());
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:iload_1         
	//   29   51:invokeinterface #133 <Method Object List.get(int)>
	//   30   56:checkcast       #196 <Class Integer>
	//   31   59:invokevirtual   #199 <Method int Integer.intValue()>
	//   32   62:invokevirtual   #51  <Method void Parcel.writeInt(int)>

	//   33   65:iload_1         
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore_1        
	//*  37   69:goto            42
		zzb(parcel, j);
	//   38   72:aload_0         
	//   39   73:iload           5
	//   40   75:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   41   78:return          
	}

	public static void writeIntegerObject(Parcel parcel, int i, Integer integer, boolean flag)
	{
		if(integer == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			zzb(parcel, i, 4);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iconst_4        
	//   12   18:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			parcel.writeInt(integer.intValue());
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #199 <Method int Integer.intValue()>
	//   16   26:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			return;
	//   17   29:return          
		}
	}

	public static void writeList(Parcel parcel, int i, List list, boolean flag)
	{
		if(list == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeList(list);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #205 <Method void Parcel.writeList(List)>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeLong(Parcel parcel, int i, long l)
	{
		zzb(parcel, i, 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:invokestatic    #25  <Method void zzb(Parcel, int, int)>
		parcel.writeLong(l);
	//    4    7:aload_0         
	//    5    8:lload_2         
	//    6    9:invokevirtual   #210 <Method void Parcel.writeLong(long)>
	//    7   12:return          
	}

	public static void writeLongArray(Parcel parcel, int i, long al[], boolean flag)
	{
		if(al == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeLongArray(al);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #215 <Method void Parcel.writeLongArray(long[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeLongList(Parcel parcel, int i, List list, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(list == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = list.size();
	//   15   25:aload_2         
	//   16   26:invokeinterface #130 <Method int List.size()>
	//   17   31:istore          6
		parcel.writeInt(k);
	//   18   33:aload_0         
	//   19   34:iload           6
	//   20   36:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   39:iload           4
	//*  22   41:istore_1        
	//*  23   42:iload_1         
	//*  24   43:iload           6
	//*  25   45:icmpge          72
			parcel.writeLong(((Long)list.get(i)).longValue());
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:iload_1         
	//   29   51:invokeinterface #133 <Method Object List.get(int)>
	//   30   56:checkcast       #218 <Class Long>
	//   31   59:invokevirtual   #222 <Method long Long.longValue()>
	//   32   62:invokevirtual   #210 <Method void Parcel.writeLong(long)>

	//   33   65:iload_1         
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore_1        
	//*  37   69:goto            42
		zzb(parcel, j);
	//   38   72:aload_0         
	//   39   73:iload           5
	//   40   75:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   41   78:return          
	}

	public static void writeLongObject(Parcel parcel, int i, Long long1, boolean flag)
	{
		if(long1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			zzb(parcel, i, 8);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:bipush          8
	//   12   19:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			parcel.writeLong(long1.longValue());
	//   13   22:aload_0         
	//   14   23:aload_2         
	//   15   24:invokevirtual   #222 <Method long Long.longValue()>
	//   16   27:invokevirtual   #210 <Method void Parcel.writeLong(long)>
			return;
	//   17   30:return          
		}
	}

	public static void writeParcel(Parcel parcel, int i, Parcel parcel1, boolean flag)
	{
		if(parcel1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.appendFrom(parcel1, 0, parcel1.dataSize());
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:iconst_0        
	//   16   24:aload_2         
	//   17   25:invokevirtual   #230 <Method int Parcel.dataSize()>
	//   18   28:invokevirtual   #233 <Method void Parcel.appendFrom(Parcel, int, int)>
			zzb(parcel, i);
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   22   36:return          
		}
	}

	public static void writeParcelArray(Parcel parcel, int i, Parcel aparcel[], boolean flag)
	{
		if(aparcel == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		}
		int j = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore          4
		int k = aparcel.length;
	//   13   22:aload_2         
	//   14   23:arraylength     
	//   15   24:istore          5
		parcel.writeInt(k);
	//   16   26:aload_0         
	//   17   27:iload           5
	//   18   29:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = 0; i < k; i++)
	//*  19   32:iconst_0        
	//*  20   33:istore_1        
	//*  21   34:iload_1         
	//*  22   35:iload           5
	//*  23   37:icmpge          86
		{
			Parcel parcel1 = aparcel[i];
	//   24   40:aload_2         
	//   25   41:iload_1         
	//   26   42:aaload          
	//   27   43:astore          6
			if(parcel1 != null)
	//*  28   45:aload           6
	//*  29   47:ifnull          74
			{
				parcel.writeInt(parcel1.dataSize());
	//   30   50:aload_0         
	//   31   51:aload           6
	//   32   53:invokevirtual   #230 <Method int Parcel.dataSize()>
	//   33   56:invokevirtual   #51  <Method void Parcel.writeInt(int)>
				parcel.appendFrom(parcel1, 0, parcel1.dataSize());
	//   34   59:aload_0         
	//   35   60:aload           6
	//   36   62:iconst_0        
	//   37   63:aload           6
	//   38   65:invokevirtual   #230 <Method int Parcel.dataSize()>
	//   39   68:invokevirtual   #233 <Method void Parcel.appendFrom(Parcel, int, int)>
			} else
	//*  40   71:goto            79
			{
				parcel.writeInt(0);
	//   41   74:aload_0         
	//   42   75:iconst_0        
	//   43   76:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			}
		}

	//   44   79:iload_1         
	//   45   80:iconst_1        
	//   46   81:iadd            
	//   47   82:istore_1        
	//*  48   83:goto            34
		zzb(parcel, j);
	//   49   86:aload_0         
	//   50   87:iload           4
	//   51   89:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   52   92:return          
	}

	public static void writeParcelList(Parcel parcel, int i, List list, boolean flag)
	{
		if(list == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		}
		int j = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore          4
		int k = list.size();
	//   13   22:aload_2         
	//   14   23:invokeinterface #130 <Method int List.size()>
	//   15   28:istore          5
		parcel.writeInt(k);
	//   16   30:aload_0         
	//   17   31:iload           5
	//   18   33:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = 0; i < k; i++)
	//*  19   36:iconst_0        
	//*  20   37:istore_1        
	//*  21   38:iload_1         
	//*  22   39:iload           5
	//*  23   41:icmpge          97
		{
			Parcel parcel1 = (Parcel)list.get(i);
	//   24   44:aload_2         
	//   25   45:iload_1         
	//   26   46:invokeinterface #133 <Method Object List.get(int)>
	//   27   51:checkcast       #39  <Class Parcel>
	//   28   54:astore          6
			if(parcel1 != null)
	//*  29   56:aload           6
	//*  30   58:ifnull          85
			{
				parcel.writeInt(parcel1.dataSize());
	//   31   61:aload_0         
	//   32   62:aload           6
	//   33   64:invokevirtual   #230 <Method int Parcel.dataSize()>
	//   34   67:invokevirtual   #51  <Method void Parcel.writeInt(int)>
				parcel.appendFrom(parcel1, 0, parcel1.dataSize());
	//   35   70:aload_0         
	//   36   71:aload           6
	//   37   73:iconst_0        
	//   38   74:aload           6
	//   39   76:invokevirtual   #230 <Method int Parcel.dataSize()>
	//   40   79:invokevirtual   #233 <Method void Parcel.appendFrom(Parcel, int, int)>
			} else
	//*  41   82:goto            90
			{
				parcel.writeInt(0);
	//   42   85:aload_0         
	//   43   86:iconst_0        
	//   44   87:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			}
		}

	//   45   90:iload_1         
	//   46   91:iconst_1        
	//   47   92:iadd            
	//   48   93:istore_1        
	//*  49   94:goto            38
		zzb(parcel, j);
	//   50   97:aload_0         
	//   51   98:iload           4
	//   52  100:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   53  103:return          
	}

	public static void writeParcelSparseArray(Parcel parcel, int i, SparseArray sparsearray, boolean flag)
	{
		if(sparsearray == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		}
		int j = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore          4
		int k = sparsearray.size();
	//   13   22:aload_2         
	//   14   23:invokevirtual   #98  <Method int SparseArray.size()>
	//   15   26:istore          5
		parcel.writeInt(k);
	//   16   28:aload_0         
	//   17   29:iload           5
	//   18   31:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = 0; i < k; i++)
	//*  19   34:iconst_0        
	//*  20   35:istore_1        
	//*  21   36:iload_1         
	//*  22   37:iload           5
	//*  23   39:icmpge          102
		{
			parcel.writeInt(sparsearray.keyAt(i));
	//   24   42:aload_0         
	//   25   43:aload_2         
	//   26   44:iload_1         
	//   27   45:invokevirtual   #102 <Method int SparseArray.keyAt(int)>
	//   28   48:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			Parcel parcel1 = (Parcel)sparsearray.valueAt(i);
	//   29   51:aload_2         
	//   30   52:iload_1         
	//   31   53:invokevirtual   #106 <Method Object SparseArray.valueAt(int)>
	//   32   56:checkcast       #39  <Class Parcel>
	//   33   59:astore          6
			if(parcel1 != null)
	//*  34   61:aload           6
	//*  35   63:ifnull          90
			{
				parcel.writeInt(parcel1.dataSize());
	//   36   66:aload_0         
	//   37   67:aload           6
	//   38   69:invokevirtual   #230 <Method int Parcel.dataSize()>
	//   39   72:invokevirtual   #51  <Method void Parcel.writeInt(int)>
				parcel.appendFrom(parcel1, 0, parcel1.dataSize());
	//   40   75:aload_0         
	//   41   76:aload           6
	//   42   78:iconst_0        
	//   43   79:aload           6
	//   44   81:invokevirtual   #230 <Method int Parcel.dataSize()>
	//   45   84:invokevirtual   #233 <Method void Parcel.appendFrom(Parcel, int, int)>
			} else
	//*  46   87:goto            95
			{
				parcel.writeInt(0);
	//   47   90:aload_0         
	//   48   91:iconst_0        
	//   49   92:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			}
		}

	//   50   95:iload_1         
	//   51   96:iconst_1        
	//   52   97:iadd            
	//   53   98:istore_1        
	//*  54   99:goto            36
		zzb(parcel, j);
	//   55  102:aload_0         
	//   56  103:iload           4
	//   57  105:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   58  108:return          
	}

	public static void writeParcelable(Parcel parcel, int i, Parcelable parcelable, int j, boolean flag)
	{
		if(parcelable == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
		{
			if(flag)
	//*   2    4:iload           4
	//*   3    6:ifeq            15
				zzb(parcel, i, 0);
	//    4    9:aload_0         
	//    5   10:iload_1         
	//    6   11:iconst_0        
	//    7   12:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   15:return          
		} else
		{
			i = zza(parcel, i);
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   21:istore_1        
			parcelable.writeToParcel(parcel, j);
	//   13   22:aload_2         
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokeinterface #246 <Method void Parcelable.writeToParcel(Parcel, int)>
			zzb(parcel, i);
	//   17   30:aload_0         
	//   18   31:iload_1         
	//   19   32:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   20   35:return          
		}
	}

	public static void writeShort(Parcel parcel, int i, short word0)
	{
		zzb(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #25  <Method void zzb(Parcel, int, int)>
		parcel.writeInt(((int) (word0)));
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #51  <Method void Parcel.writeInt(int)>
	//    7   11:return          
	}

	public static void writeSparseBooleanArray(Parcel parcel, int i, SparseBooleanArray sparsebooleanarray, boolean flag)
	{
		if(sparsebooleanarray == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeSparseBooleanArray(sparsebooleanarray);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #253 <Method void Parcel.writeSparseBooleanArray(SparseBooleanArray)>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeSparseIntArray(Parcel parcel, int i, SparseIntArray sparseintarray, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sparseintarray == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = sparseintarray.size();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #258 <Method int SparseIntArray.size()>
	//   17   29:istore          6
		parcel.writeInt(k);
	//   18   31:aload_0         
	//   19   32:iload           6
	//   20   34:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   37:iload           4
	//*  22   39:istore_1        
	//*  23   40:iload_1         
	//*  24   41:iload           6
	//*  25   43:icmpge          71
		{
			parcel.writeInt(sparseintarray.keyAt(i));
	//   26   46:aload_0         
	//   27   47:aload_2         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #259 <Method int SparseIntArray.keyAt(int)>
	//   30   52:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeInt(sparseintarray.valueAt(i));
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:iload_1         
	//   34   58:invokevirtual   #261 <Method int SparseIntArray.valueAt(int)>
	//   35   61:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		}

	//   36   64:iload_1         
	//   37   65:iconst_1        
	//   38   66:iadd            
	//   39   67:istore_1        
	//*  40   68:goto            40
		zzb(parcel, j);
	//   41   71:aload_0         
	//   42   72:iload           5
	//   43   74:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   44   77:return          
	}

	public static void writeSparseLongArray(Parcel parcel, int i, SparseLongArray sparselongarray, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sparselongarray == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = sparselongarray.size();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #266 <Method int SparseLongArray.size()>
	//   17   29:istore          6
		parcel.writeInt(k);
	//   18   31:aload_0         
	//   19   32:iload           6
	//   20   34:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   37:iload           4
	//*  22   39:istore_1        
	//*  23   40:iload_1         
	//*  24   41:iload           6
	//*  25   43:icmpge          71
		{
			parcel.writeInt(sparselongarray.keyAt(i));
	//   26   46:aload_0         
	//   27   47:aload_2         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #267 <Method int SparseLongArray.keyAt(int)>
	//   30   52:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeLong(sparselongarray.valueAt(i));
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:iload_1         
	//   34   58:invokevirtual   #270 <Method long SparseLongArray.valueAt(int)>
	//   35   61:invokevirtual   #210 <Method void Parcel.writeLong(long)>
		}

	//   36   64:iload_1         
	//   37   65:iconst_1        
	//   38   66:iadd            
	//   39   67:istore_1        
	//*  40   68:goto            40
		zzb(parcel, j);
	//   41   71:aload_0         
	//   42   72:iload           5
	//   43   74:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   44   77:return          
	}

	public static void writeString(Parcel parcel, int i, String s, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeString(s);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #274 <Method void Parcel.writeString(String)>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeStringArray(Parcel parcel, int i, String as[], boolean flag)
	{
		if(as == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeStringArray(as);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #279 <Method void Parcel.writeStringArray(String[])>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeStringList(Parcel parcel, int i, List list, boolean flag)
	{
		if(list == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		} else
		{
			i = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore_1        
			parcel.writeStringList(list);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #282 <Method void Parcel.writeStringList(List)>
			zzb(parcel, i);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:invokestatic    #20  <Method void zzb(Parcel, int)>
			return;
	//   19   31:return          
		}
	}

	public static void writeStringSparseArray(Parcel parcel, int i, SparseArray sparsearray, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sparsearray == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       18
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				zzb(parcel, i, 0);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//   10   17:return          
		}
		int j = zza(parcel, i);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:invokestatic    #15  <Method int zza(Parcel, int)>
	//   14   23:istore          5
		int k = sparsearray.size();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #98  <Method int SparseArray.size()>
	//   17   29:istore          6
		parcel.writeInt(k);
	//   18   31:aload_0         
	//   19   32:iload           6
	//   20   34:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = ((int) (flag1)); i < k; i++)
	//*  21   37:iload           4
	//*  22   39:istore_1        
	//*  23   40:iload_1         
	//*  24   41:iload           6
	//*  25   43:icmpge          74
		{
			parcel.writeInt(sparsearray.keyAt(i));
	//   26   46:aload_0         
	//   27   47:aload_2         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #102 <Method int SparseArray.keyAt(int)>
	//   30   52:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeString((String)sparsearray.valueAt(i));
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:iload_1         
	//   34   58:invokevirtual   #106 <Method Object SparseArray.valueAt(int)>
	//   35   61:checkcast       #286 <Class String>
	//   36   64:invokevirtual   #274 <Method void Parcel.writeString(String)>
		}

	//   37   67:iload_1         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_1        
	//*  41   71:goto            40
		zzb(parcel, j);
	//   42   74:aload_0         
	//   43   75:iload           5
	//   44   77:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   45   80:return          
	}

	public static void writeTypedArray(Parcel parcel, int i, Parcelable aparcelable[], int j, boolean flag)
	{
		if(aparcelable == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
		{
			if(flag)
	//*   2    4:iload           4
	//*   3    6:ifeq            15
				zzb(parcel, i, 0);
	//    4    9:aload_0         
	//    5   10:iload_1         
	//    6   11:iconst_0        
	//    7   12:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   15:return          
		}
		int k = zza(parcel, i);
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   21:istore          5
		int l = aparcelable.length;
	//   13   23:aload_2         
	//   14   24:arraylength     
	//   15   25:istore          6
		parcel.writeInt(l);
	//   16   27:aload_0         
	//   17   28:iload           6
	//   18   30:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = 0; i < l; i++)
	//*  19   33:iconst_0        
	//*  20   34:istore_1        
	//*  21   35:iload_1         
	//*  22   36:iload           6
	//*  23   38:icmpge          73
		{
			Parcelable parcelable = aparcelable[i];
	//   24   41:aload_2         
	//   25   42:iload_1         
	//   26   43:aaload          
	//   27   44:astore          7
			if(parcelable == null)
	//*  28   46:aload           7
	//*  29   48:ifnonnull       59
				parcel.writeInt(0);
	//   30   51:aload_0         
	//   31   52:iconst_0        
	//   32   53:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			else
	//*  33   56:goto            66
				zza(parcel, parcelable, j);
	//   34   59:aload_0         
	//   35   60:aload           7
	//   36   62:iload_3         
	//   37   63:invokestatic    #292 <Method void zza(Parcel, Parcelable, int)>
		}

	//   38   66:iload_1         
	//   39   67:iconst_1        
	//   40   68:iadd            
	//   41   69:istore_1        
	//*  42   70:goto            35
		zzb(parcel, k);
	//   43   73:aload_0         
	//   44   74:iload           5
	//   45   76:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   46   79:return          
	}

	public static void writeTypedList(Parcel parcel, int i, List list, boolean flag)
	{
		if(list == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		}
		int j = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore          4
		int k = list.size();
	//   13   22:aload_2         
	//   14   23:invokeinterface #130 <Method int List.size()>
	//   15   28:istore          5
		parcel.writeInt(k);
	//   16   30:aload_0         
	//   17   31:iload           5
	//   18   33:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = 0; i < k; i++)
	//*  19   36:iconst_0        
	//*  20   37:istore_1        
	//*  21   38:iload_1         
	//*  22   39:iload           5
	//*  23   41:icmpge          83
		{
			Parcelable parcelable = (Parcelable)list.get(i);
	//   24   44:aload_2         
	//   25   45:iload_1         
	//   26   46:invokeinterface #133 <Method Object List.get(int)>
	//   27   51:checkcast       #243 <Class Parcelable>
	//   28   54:astore          6
			if(parcelable == null)
	//*  29   56:aload           6
	//*  30   58:ifnonnull       69
				parcel.writeInt(0);
	//   31   61:aload_0         
	//   32   62:iconst_0        
	//   33   63:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			else
	//*  34   66:goto            76
				zza(parcel, parcelable, 0);
	//   35   69:aload_0         
	//   36   70:aload           6
	//   37   72:iconst_0        
	//   38   73:invokestatic    #292 <Method void zza(Parcel, Parcelable, int)>
		}

	//   39   76:iload_1         
	//   40   77:iconst_1        
	//   41   78:iadd            
	//   42   79:istore_1        
	//*  43   80:goto            38
		zzb(parcel, j);
	//   44   83:aload_0         
	//   45   84:iload           4
	//   46   86:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   47   89:return          
	}

	public static void writeTypedSparseArray(Parcel parcel, int i, SparseArray sparsearray, boolean flag)
	{
		if(sparsearray == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
				zzb(parcel, i, 0);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #25  <Method void zzb(Parcel, int, int)>
			return;
	//    8   14:return          
		}
		int j = zza(parcel, i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokestatic    #15  <Method int zza(Parcel, int)>
	//   12   20:istore          4
		int k = sparsearray.size();
	//   13   22:aload_2         
	//   14   23:invokevirtual   #98  <Method int SparseArray.size()>
	//   15   26:istore          5
		parcel.writeInt(k);
	//   16   28:aload_0         
	//   17   29:iload           5
	//   18   31:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		for(i = 0; i < k; i++)
	//*  19   34:iconst_0        
	//*  20   35:istore_1        
	//*  21   36:iload_1         
	//*  22   37:iload           5
	//*  23   39:icmpge          88
		{
			parcel.writeInt(sparsearray.keyAt(i));
	//   24   42:aload_0         
	//   25   43:aload_2         
	//   26   44:iload_1         
	//   27   45:invokevirtual   #102 <Method int SparseArray.keyAt(int)>
	//   28   48:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			Parcelable parcelable = (Parcelable)sparsearray.valueAt(i);
	//   29   51:aload_2         
	//   30   52:iload_1         
	//   31   53:invokevirtual   #106 <Method Object SparseArray.valueAt(int)>
	//   32   56:checkcast       #243 <Class Parcelable>
	//   33   59:astore          6
			if(parcelable == null)
	//*  34   61:aload           6
	//*  35   63:ifnonnull       74
				parcel.writeInt(0);
	//   36   66:aload_0         
	//   37   67:iconst_0        
	//   38   68:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			else
	//*  39   71:goto            81
				zza(parcel, parcelable, 0);
	//   40   74:aload_0         
	//   41   75:aload           6
	//   42   77:iconst_0        
	//   43   78:invokestatic    #292 <Method void zza(Parcel, Parcelable, int)>
		}

	//   44   81:iload_1         
	//   45   82:iconst_1        
	//   46   83:iadd            
	//   47   84:istore_1        
	//*  48   85:goto            36
		zzb(parcel, j);
	//   49   88:aload_0         
	//   50   89:iload           4
	//   51   91:invokestatic    #20  <Method void zzb(Parcel, int)>
	//   52   94:return          
	}

	private static int zza(Parcel parcel, int i)
	{
		parcel.writeInt(i | 0xffff0000);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2            #298 <Int 0xffff0000>
	//    3    5:ior             
	//    4    6:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		parcel.writeInt(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		return parcel.dataPosition();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #301 <Method int Parcel.dataPosition()>
	//   10   18:ireturn         
	}

	private static void zza(Parcel parcel, Parcelable parcelable, int i)
	{
		int j = parcel.dataPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method int Parcel.dataPosition()>
	//    2    4:istore_3        
		parcel.writeInt(1);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		int k = parcel.dataPosition();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #301 <Method int Parcel.dataPosition()>
	//    8   14:istore          4
		parcelable.writeToParcel(parcel, i);
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:invokeinterface #246 <Method void Parcelable.writeToParcel(Parcel, int)>
		i = parcel.dataPosition();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #301 <Method int Parcel.dataPosition()>
	//   15   28:istore_2        
		parcel.setDataPosition(j);
	//   16   29:aload_0         
	//   17   30:iload_3         
	//   18   31:invokevirtual   #304 <Method void Parcel.setDataPosition(int)>
		parcel.writeInt(i - k);
	//   19   34:aload_0         
	//   20   35:iload_2         
	//   21   36:iload           4
	//   22   38:isub            
	//   23   39:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		parcel.setDataPosition(i);
	//   24   42:aload_0         
	//   25   43:iload_2         
	//   26   44:invokevirtual   #304 <Method void Parcel.setDataPosition(int)>
	//   27   47:return          
	}

	private static void zzb(Parcel parcel, int i)
	{
		int j = parcel.dataPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method int Parcel.dataPosition()>
	//    2    4:istore_2        
		parcel.setDataPosition(i - 4);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_4        
	//    6    8:isub            
	//    7    9:invokevirtual   #304 <Method void Parcel.setDataPosition(int)>
		parcel.writeInt(j - i);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:iload_1         
	//   11   15:isub            
	//   12   16:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		parcel.setDataPosition(j);
	//   13   19:aload_0         
	//   14   20:iload_2         
	//   15   21:invokevirtual   #304 <Method void Parcel.setDataPosition(int)>
	//   16   24:return          
	}

	private static void zzb(Parcel parcel, int i, int j)
	{
		if(j >= 65535)
	//*   0    0:iload_2         
	//*   1    1:ldc2            #306 <Int 65535>
	//*   2    4:icmplt          22
		{
			parcel.writeInt(i | 0xffff0000);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:ldc2            #298 <Int 0xffff0000>
	//    6   12:ior             
	//    7   13:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			return;
	//   11   21:return          
		} else
		{
			parcel.writeInt(i | j << 16);
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:bipush          16
	//   16   27:ishl            
	//   17   28:ior             
	//   18   29:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			return;
	//   19   32:return          
		}
	}
}
