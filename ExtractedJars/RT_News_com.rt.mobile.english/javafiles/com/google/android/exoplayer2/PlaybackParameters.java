// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;

public final class PlaybackParameters
{

	public PlaybackParameters(float f)
	{
		this(f, 1.0F, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fconst_1        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #25  <Method void PlaybackParameters(float, float, boolean)>
	//    5    7:return          
	}

	public PlaybackParameters(float f, float f1)
	{
		this(f, f1, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #25  <Method void PlaybackParameters(float, float, boolean)>
	//    5    7:return          
	}

	public PlaybackParameters(float f, float f1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		boolean flag2 = false;
	//    2    4:iconst_0        
	//    3    5:istore          5
		boolean flag1;
		if(f > 0.0F)
	//*   4    7:fload_1         
	//*   5    8:fconst_0        
	//*   6    9:fcmpl           
	//*   7   10:ifle            19
			flag1 = true;
	//    8   13:iconst_1        
	//    9   14:istore          4
		else
	//*  10   16:goto            22
			flag1 = false;
	//   11   19:iconst_0        
	//   12   20:istore          4
		Assertions.checkArgument(flag1);
	//   13   22:iload           4
	//   14   24:invokestatic    #34  <Method void Assertions.checkArgument(boolean)>
		flag1 = flag2;
	//   15   27:iload           5
	//   16   29:istore          4
		if(f1 > 0.0F)
	//*  17   31:fload_2         
	//*  18   32:fconst_0        
	//*  19   33:fcmpl           
	//*  20   34:ifle            40
			flag1 = true;
	//   21   37:iconst_1        
	//   22   38:istore          4
		Assertions.checkArgument(flag1);
	//   23   40:iload           4
	//   24   42:invokestatic    #34  <Method void Assertions.checkArgument(boolean)>
		speed = f;
	//   25   45:aload_0         
	//   26   46:fload_1         
	//   27   47:putfield        #36  <Field float speed>
		pitch = f1;
	//   28   50:aload_0         
	//   29   51:fload_2         
	//   30   52:putfield        #38  <Field float pitch>
		skipSilence = flag;
	//   31   55:aload_0         
	//   32   56:iload_3         
	//   33   57:putfield        #40  <Field boolean skipSilence>
		scaledUsPerMs = Math.round(f * 1000F);
	//   34   60:aload_0         
	//   35   61:fload_1         
	//   36   62:ldc1            #41  <Float 1000F>
	//   37   64:fmul            
	//   38   65:invokestatic    #47  <Method int Math.round(float)>
	//   39   68:putfield        #49  <Field int scaledUsPerMs>
	//   40   71:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          68
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #56  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #56  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((PlaybackParameters)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class PlaybackParameters>
	//   16   28:astore_1        
			return speed == ((PlaybackParameters) (obj)).speed && pitch == ((PlaybackParameters) (obj)).pitch && skipSilence == ((PlaybackParameters) (obj)).skipSilence;
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field float speed>
	//   19   33:aload_1         
	//   20   34:getfield        #36  <Field float speed>
	//   21   37:fcmpl           
	//   22   38:ifne            66
	//   23   41:aload_0         
	//   24   42:getfield        #38  <Field float pitch>
	//   25   45:aload_1         
	//   26   46:getfield        #38  <Field float pitch>
	//   27   49:fcmpl           
	//   28   50:ifne            66
	//   29   53:aload_0         
	//   30   54:getfield        #40  <Field boolean skipSilence>
	//   31   57:aload_1         
	//   32   58:getfield        #40  <Field boolean skipSilence>
	//   33   61:icmpne          66
	//   34   64:iconst_1        
	//   35   65:ireturn         
	//   36   66:iconst_0        
	//   37   67:ireturn         
		} else
		{
			return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		}
	}

	public long getMediaTimeUsForPlayoutTimeMs(long l)
	{
		return l * (long)scaledUsPerMs;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field int scaledUsPerMs>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:lreturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #63  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #65  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #70  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0F);
	public final float pitch;
	private final int scaledUsPerMs;
	public final boolean skipSilence;
	public final float speed;

	static 
	{
	//    0    0:new             #2   <Class PlaybackParameters>
	//    1    3:dup             
	//    2    4:fconst_1        
	//    3    5:invokespecial   #19  <Method void PlaybackParameters(float)>
	//    4    8:putstatic       #21  <Field PlaybackParameters DEFAULT>
	//*   5   11:return          
	}
}
