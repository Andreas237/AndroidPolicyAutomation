// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation.meta;


public final class When extends Enum
{

	private When(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static When valueOf(String s)
	{
		return (When)Enum.valueOf(javax/annotation/meta/When, s);
	//    0    0:ldc1            #2   <Class When>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class When>
	//    4    9:areturn         
	}

	public static When[] values()
	{
		return (When[])((When []) ($VALUES)).clone();
	//    0    0:getstatic       #32  <Field When[] $VALUES>
	//    1    3:invokevirtual   #47  <Method Object _5B_Ljavax.annotation.meta.When_3B_.clone()>
	//    2    6:checkcast       #43  <Class When[]>
	//    3    9:areturn         
	}

	private static final When $VALUES[];
	public static final When ALWAYS;
	public static final When MAYBE;
	public static final When NEVER;
	public static final When UNKNOWN;

	static 
	{
		ALWAYS = new When("ALWAYS", 0);
	//    0    0:new             #2   <Class When>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "ALWAYS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void When(String, int)>
	//    5   10:putstatic       #21  <Field When ALWAYS>
		UNKNOWN = new When("UNKNOWN", 1);
	//    6   13:new             #2   <Class When>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "UNKNOWN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void When(String, int)>
	//   11   23:putstatic       #24  <Field When UNKNOWN>
		MAYBE = new When("MAYBE", 2);
	//   12   26:new             #2   <Class When>
	//   13   29:dup             
	//   14   30:ldc1            #25  <String "MAYBE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void When(String, int)>
	//   17   36:putstatic       #27  <Field When MAYBE>
		NEVER = new When("NEVER", 3);
	//   18   39:new             #2   <Class When>
	//   19   42:dup             
	//   20   43:ldc1            #28  <String "NEVER">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void When(String, int)>
	//   23   49:putstatic       #30  <Field When NEVER>
		$VALUES = (new When[] {
			ALWAYS, UNKNOWN, MAYBE, NEVER
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       When[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field When ALWAYS>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #24  <Field When UNKNOWN>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #27  <Field When MAYBE>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #30  <Field When NEVER>
	//   41   79:aastore         
	//   42   80:putstatic       #32  <Field When[] $VALUES>
	//*  43   83:return          
	}
}
