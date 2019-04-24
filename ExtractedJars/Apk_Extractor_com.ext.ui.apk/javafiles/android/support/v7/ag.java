// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			x, aw, ae

public abstract class ag extends x
	implements aw
{

	public ag()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void x()>
	//    2    4:return          
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
			if(obj instanceof ag)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ag>
	//*   7   11:ifeq            77
	//*   8   14:aload_1         
	//*   9   15:checkcast       #2   <Class ag>
	//*  10   18:astore_1        
			{
				if(!((Object) (a())).equals(((Object) (((ag) (obj = ((Object) ((ag)obj)))).a()))) || !b().equals(((Object) (((ag) (obj)).b()))) || !c().equals(((Object) (((ag) (obj)).c()))) || !ae.a(e(), ((ag) (obj)).e()))
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #17  <Method au a()>
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #17  <Method au a()>
	//*  15   27:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            75
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #25  <Method String b()>
	//*  19   37:aload_1         
	//*  20   38:invokevirtual   #25  <Method String b()>
	//*  21   41:invokevirtual   #28  <Method boolean String.equals(Object)>
	//*  22   44:ifeq            75
	//*  23   47:aload_0         
	//*  24   48:invokevirtual   #31  <Method String c()>
	//*  25   51:aload_1         
	//*  26   52:invokevirtual   #31  <Method String c()>
	//*  27   55:invokevirtual   #28  <Method boolean String.equals(Object)>
	//*  28   58:ifeq            75
	//*  29   61:aload_0         
	//*  30   62:invokevirtual   #35  <Method Object e()>
	//*  31   65:aload_1         
	//*  32   66:invokevirtual   #35  <Method Object e()>
	//*  33   69:invokestatic    #40  <Method boolean ae.a(Object, Object)>
	//*  34   72:ifne            5
					return false;
	//   35   75:iconst_0        
	//   36   76:ireturn         
			} else
			if(obj instanceof aw)
	//*  37   77:aload_1         
	//*  38   78:instanceof      #6   <Class aw>
	//*  39   81:ifeq            93
				return obj.equals(((Object) (f())));
	//   40   84:aload_1         
	//   41   85:aload_0         
	//   42   86:invokevirtual   #44  <Method as f()>
	//   43   89:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//   44   92:ireturn         
			else
				return false;
	//   45   93:iconst_0        
	//   46   94:ireturn         
		return true;
	}

	public int hashCode()
	{
		return (((Object) (a())).hashCode() * 31 + b().hashCode()) * 31 + c().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method au a()>
	//    2    4:invokevirtual   #48  <Method int Object.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:invokevirtual   #25  <Method String b()>
	//    7   14:invokevirtual   #49  <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:bipush          31
	//   10   20:imul            
	//   11   21:aload_0         
	//   12   22:invokevirtual   #31  <Method String c()>
	//   13   25:invokevirtual   #49  <Method int String.hashCode()>
	//   14   28:iadd            
	//   15   29:ireturn         
	}

	public String toString()
	{
		as as = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method as f()>
	//    2    4:astore_1        
		if(as != this)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:if_acmpeq       15
			return ((Object) (as)).toString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #52  <Method String Object.toString()>
	//    8   14:areturn         
		else
			return (new StringBuilder()).append("property ").append(b()).append(" (Kotlin reflection is not available)").toString();
	//    9   15:new             #54  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #55  <Method void StringBuilder()>
	//   12   22:ldc1            #57  <String "property ">
	//   13   24:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:aload_0         
	//   15   28:invokevirtual   #25  <Method String b()>
	//   16   31:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:ldc1            #63  <String " (Kotlin reflection is not available)">
	//   18   36:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   20   42:areturn         
	}
}
