// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			Lifecycle

public static final class Lifecycle$Event extends Enum
{

	public static Lifecycle$Event valueOf(String s)
	{
		return (Lifecycle$Event)Enum.valueOf(android/arch/lifecycle/Lifecycle$Event, s);
	//    0    0:ldc1            #2   <Class Lifecycle$Event>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Lifecycle$Event>
	//    4    9:areturn         
	}

	public static Lifecycle$Event[] values()
	{
		return (Lifecycle$Event[])((Lifecycle$Event []) ($VALUES)).clone();
	//    0    0:getstatic       #47  <Field Lifecycle$Event[] $VALUES>
	//    1    3:invokevirtual   #62  <Method Object _5B_Landroid.arch.lifecycle.Lifecycle$Event_3B_.clone()>
	//    2    6:checkcast       #58  <Class Lifecycle$Event[]>
	//    3    9:areturn         
	}

	private static final Lifecycle$Event $VALUES[];
	public static final Lifecycle$Event ON_ANY;
	public static final Lifecycle$Event ON_CREATE;
	public static final Lifecycle$Event ON_DESTROY;
	public static final Lifecycle$Event ON_PAUSE;
	public static final Lifecycle$Event ON_RESUME;
	public static final Lifecycle$Event ON_START;
	public static final Lifecycle$Event ON_STOP;

	static 
	{
		ON_CREATE = new Lifecycle$Event("ON_CREATE", 0);
	//    0    0:new             #2   <Class Lifecycle$Event>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "ON_CREATE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
	//    5   10:putstatic       #27  <Field Lifecycle$Event ON_CREATE>
		ON_START = new Lifecycle$Event("ON_START", 1);
	//    6   13:new             #2   <Class Lifecycle$Event>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "ON_START">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
	//   11   23:putstatic       #30  <Field Lifecycle$Event ON_START>
		ON_RESUME = new Lifecycle$Event("ON_RESUME", 2);
	//   12   26:new             #2   <Class Lifecycle$Event>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "ON_RESUME">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
	//   17   36:putstatic       #33  <Field Lifecycle$Event ON_RESUME>
		ON_PAUSE = new Lifecycle$Event("ON_PAUSE", 3);
	//   18   39:new             #2   <Class Lifecycle$Event>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "ON_PAUSE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
	//   23   49:putstatic       #36  <Field Lifecycle$Event ON_PAUSE>
		ON_STOP = new Lifecycle$Event("ON_STOP", 4);
	//   24   52:new             #2   <Class Lifecycle$Event>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "ON_STOP">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
	//   29   62:putstatic       #39  <Field Lifecycle$Event ON_STOP>
		ON_DESTROY = new Lifecycle$Event("ON_DESTROY", 5);
	//   30   65:new             #2   <Class Lifecycle$Event>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "ON_DESTROY">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
	//   35   75:putstatic       #42  <Field Lifecycle$Event ON_DESTROY>
		ON_ANY = new Lifecycle$Event("ON_ANY", 6);
	//   36   78:new             #2   <Class Lifecycle$Event>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "ON_ANY">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
	//   41   89:putstatic       #45  <Field Lifecycle$Event ON_ANY>
		$VALUES = (new Lifecycle$Event[] {
			ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY
		});
	//   42   92:bipush          7
	//   43   94:anewarray       Lifecycle$Event[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #27  <Field Lifecycle$Event ON_CREATE>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #30  <Field Lifecycle$Event ON_START>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #33  <Field Lifecycle$Event ON_RESUME>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #36  <Field Lifecycle$Event ON_PAUSE>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #39  <Field Lifecycle$Event ON_STOP>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #42  <Field Lifecycle$Event ON_DESTROY>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #45  <Field Lifecycle$Event ON_ANY>
	//   71  139:aastore         
	//   72  140:putstatic       #47  <Field Lifecycle$Event[] $VALUES>
	//*  73  143:return          
	}

	private Lifecycle$Event(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
