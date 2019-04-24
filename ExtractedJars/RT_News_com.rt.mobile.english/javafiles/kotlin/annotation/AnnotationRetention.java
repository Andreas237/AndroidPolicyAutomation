// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.annotation;


public final class AnnotationRetention extends Enum
{

	protected AnnotationRetention(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AnnotationRetention valueOf(String s)
	{
		return (AnnotationRetention)Enum.valueOf(kotlin/annotation/AnnotationRetention, s);
	//    0    0:ldc1            #2   <Class AnnotationRetention>
	//    1    2:aload_0         
	//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AnnotationRetention>
	//    4    9:areturn         
	}

	public static AnnotationRetention[] values()
	{
		return (AnnotationRetention[])((AnnotationRetention []) ($VALUES)).clone();
	//    0    0:getstatic       #41  <Field AnnotationRetention[] $VALUES>
	//    1    3:invokevirtual   #56  <Method Object _5B_Lkotlin.annotation.AnnotationRetention_3B_.clone()>
	//    2    6:checkcast       #52  <Class AnnotationRetention[]>
	//    3    9:areturn         
	}

	private static final AnnotationRetention $VALUES[];
	public static final AnnotationRetention BINARY;
	public static final AnnotationRetention RUNTIME;
	public static final AnnotationRetention SOURCE;

	static 
	{
		AnnotationRetention annotationretention = new AnnotationRetention("SOURCE", 0);
	//    0    0:new             #2   <Class AnnotationRetention>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "SOURCE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #31  <Method void AnnotationRetention(String, int)>
	//    5   10:astore_0        
		SOURCE = annotationretention;
	//    6   11:aload_0         
	//    7   12:putstatic       #33  <Field AnnotationRetention SOURCE>
		AnnotationRetention annotationretention1 = new AnnotationRetention("BINARY", 1);
	//    8   15:new             #2   <Class AnnotationRetention>
	//    9   18:dup             
	//   10   19:ldc1            #34  <String "BINARY">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #31  <Method void AnnotationRetention(String, int)>
	//   13   25:astore_1        
		BINARY = annotationretention1;
	//   14   26:aload_1         
	//   15   27:putstatic       #36  <Field AnnotationRetention BINARY>
		AnnotationRetention annotationretention2 = new AnnotationRetention("RUNTIME", 2);
	//   16   30:new             #2   <Class AnnotationRetention>
	//   17   33:dup             
	//   18   34:ldc1            #37  <String "RUNTIME">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #31  <Method void AnnotationRetention(String, int)>
	//   21   40:astore_2        
		RUNTIME = annotationretention2;
	//   22   41:aload_2         
	//   23   42:putstatic       #39  <Field AnnotationRetention RUNTIME>
		$VALUES = (new AnnotationRetention[] {
			annotationretention, annotationretention1, annotationretention2
		});
	//   24   45:iconst_3        
	//   25   46:anewarray       AnnotationRetention[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:aload_0         
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_1        
	//   32   55:aload_1         
	//   33   56:aastore         
	//   34   57:dup             
	//   35   58:iconst_2        
	//   36   59:aload_2         
	//   37   60:aastore         
	//   38   61:putstatic       #41  <Field AnnotationRetention[] $VALUES>
	//*  39   64:return          
	}
}
