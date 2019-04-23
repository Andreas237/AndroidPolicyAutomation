// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.location.Location;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.internal:
//			RadarState

public final class Stopped extends RadarState
{

	public Stopped(Location location1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//    0    0:aload_1         
	//    1    1:ldc1            #38  <String "location">
	//    2    3:invokestatic    #44  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:invokespecial   #47  <Method void RadarState(kotlin.jvm.internal.DefaultConstructorMarker)>
		location = location1;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #49  <Field Location location>
		justStopped = flag;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:putfield        #51  <Field boolean justStopped>
	//   12   21:return          
	}

	public static Stopped copy$default(Stopped stopped, Location location1, boolean flag, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			location1 = stopped.getLocation();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #57  <Method Location getLocation()>
	//    6   10:astore_1        
		if((i & 2) != 0)
	//*   7   11:iload_3         
	//*   8   12:iconst_2        
	//*   9   13:iand            
	//*  10   14:ifeq            22
			flag = stopped.justStopped;
	//   11   17:aload_0         
	//   12   18:getfield        #51  <Field boolean justStopped>
	//   13   21:istore_2        
		return stopped.copy(location1, flag);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:invokevirtual   #60  <Method Stopped copy(Location, boolean)>
	//   18   28:areturn         
	}

	public final Location component1()
	{
		return getLocation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Location getLocation()>
	//    2    4:areturn         
	}

	public final boolean component2()
	{
		return justStopped;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean justStopped>
	//    2    4:ireturn         
	}

	public final Stopped copy(Location location1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//    0    0:aload_1         
	//    1    1:ldc1            #38  <String "location">
	//    2    3:invokestatic    #44  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return new Stopped(location1, flag);
	//    3    6:new             #2   <Class Stopped>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:iload_2         
	//    7   12:invokespecial   #63  <Method void Stopped(Location, boolean)>
	//    8   15:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpeq       57
		{
			if(obj instanceof Stopped)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #2   <Class Stopped>
	//*   5    9:ifeq            55
			{
				obj = ((Object) ((Stopped)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class Stopped>
	//    8   16:astore_1        
				if(Intrinsics.areEqual(((Object) (getLocation())), ((Object) (((Stopped) (obj)).getLocation()))))
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #57  <Method Location getLocation()>
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #57  <Method Location getLocation()>
	//*  13   25:invokestatic    #69  <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  14   28:ifeq            55
				{
					boolean flag;
					if(justStopped == ((Stopped) (obj)).justStopped)
	//*  15   31:aload_0         
	//*  16   32:getfield        #51  <Field boolean justStopped>
	//*  17   35:aload_1         
	//*  18   36:getfield        #51  <Field boolean justStopped>
	//*  19   39:icmpne          47
						flag = true;
	//   20   42:iconst_1        
	//   21   43:istore_2        
					else
	//*  22   44:goto            49
						flag = false;
	//   23   47:iconst_0        
	//   24   48:istore_2        
					if(flag)
	//*  25   49:iload_2         
	//*  26   50:ifeq            55
						return true;
	//   27   53:iconst_1        
	//   28   54:ireturn         
				}
			}
			return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
		} else
		{
			return true;
	//   31   57:iconst_1        
	//   32   58:ireturn         
		}
	}

	public final boolean getJustStopped()
	{
		return justStopped;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean justStopped>
	//    2    4:ireturn         
	}

	public Location getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Location location>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #72  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #74  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #79  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Stopped(location=");
	//    4    8:aload_1         
	//    5    9:ldc1            #87  <String "Stopped(location=">
	//    6   11:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (getLocation())));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #57  <Method Location getLocation()>
	//   11   20:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", justStopped=");
	//   13   24:aload_1         
	//   14   25:ldc1            #96  <String ", justStopped=">
	//   15   27:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(justStopped);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #51  <Field boolean justStopped>
	//   20   36:invokevirtual   #99  <Method StringBuilder StringBuilder.append(boolean)>
	//   21   39:pop             
		stringbuilder.append(")");
	//   22   40:aload_1         
	//   23   41:ldc1            #101 <String ")">
	//   24   43:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	private final boolean justStopped;
	private final Location location;
}
