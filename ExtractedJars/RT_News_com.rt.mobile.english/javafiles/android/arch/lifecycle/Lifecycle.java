// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LifecycleObserver

public abstract class Lifecycle
{
	public static final class Event extends Enum
	{

		public static Event valueOf(String s)
		{
			return (Event)Enum.valueOf(android/arch/lifecycle/Lifecycle$Event, s);
		//    0    0:ldc1            #2   <Class Lifecycle$Event>
		//    1    2:aload_0         
		//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Lifecycle$Event>
		//    4    9:areturn         
		}

		public static Event[] values()
		{
			return (Event[])((Event []) ($VALUES)).clone();
		//    0    0:getstatic       #47  <Field Lifecycle$Event[] $VALUES>
		//    1    3:invokevirtual   #62  <Method Object _5B_Landroid.arch.lifecycle.Lifecycle$Event_3B_.clone()>
		//    2    6:checkcast       #58  <Class Lifecycle$Event[]>
		//    3    9:areturn         
		}

		private static final Event $VALUES[];
		public static final Event ON_ANY;
		public static final Event ON_CREATE;
		public static final Event ON_DESTROY;
		public static final Event ON_PAUSE;
		public static final Event ON_RESUME;
		public static final Event ON_START;
		public static final Event ON_STOP;

		static 
		{
			ON_CREATE = new Event("ON_CREATE", 0);
		//    0    0:new             #2   <Class Lifecycle$Event>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "ON_CREATE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
		//    5   10:putstatic       #27  <Field Lifecycle$Event ON_CREATE>
			ON_START = new Event("ON_START", 1);
		//    6   13:new             #2   <Class Lifecycle$Event>
		//    7   16:dup             
		//    8   17:ldc1            #28  <String "ON_START">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
		//   11   23:putstatic       #30  <Field Lifecycle$Event ON_START>
			ON_RESUME = new Event("ON_RESUME", 2);
		//   12   26:new             #2   <Class Lifecycle$Event>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "ON_RESUME">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
		//   17   36:putstatic       #33  <Field Lifecycle$Event ON_RESUME>
			ON_PAUSE = new Event("ON_PAUSE", 3);
		//   18   39:new             #2   <Class Lifecycle$Event>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "ON_PAUSE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
		//   23   49:putstatic       #36  <Field Lifecycle$Event ON_PAUSE>
			ON_STOP = new Event("ON_STOP", 4);
		//   24   52:new             #2   <Class Lifecycle$Event>
		//   25   55:dup             
		//   26   56:ldc1            #37  <String "ON_STOP">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
		//   29   62:putstatic       #39  <Field Lifecycle$Event ON_STOP>
			ON_DESTROY = new Event("ON_DESTROY", 5);
		//   30   65:new             #2   <Class Lifecycle$Event>
		//   31   68:dup             
		//   32   69:ldc1            #40  <String "ON_DESTROY">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
		//   35   75:putstatic       #42  <Field Lifecycle$Event ON_DESTROY>
			ON_ANY = new Event("ON_ANY", 6);
		//   36   78:new             #2   <Class Lifecycle$Event>
		//   37   81:dup             
		//   38   82:ldc1            #43  <String "ON_ANY">
		//   39   84:bipush          6
		//   40   86:invokespecial   #25  <Method void Lifecycle$Event(String, int)>
		//   41   89:putstatic       #45  <Field Lifecycle$Event ON_ANY>
			$VALUES = (new Event[] {
				ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY
			});
		//   42   92:bipush          7
		//   43   94:anewarray       Event[]
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

		private Event(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class State extends Enum
	{

		public static State valueOf(String s)
		{
			return (State)Enum.valueOf(android/arch/lifecycle/Lifecycle$State, s);
		//    0    0:ldc1            #2   <Class Lifecycle$State>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Lifecycle$State>
		//    4    9:areturn         
		}

		public static State[] values()
		{
			return (State[])((State []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field Lifecycle$State[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Landroid.arch.lifecycle.Lifecycle$State_3B_.clone()>
		//    2    6:checkcast       #50  <Class Lifecycle$State[]>
		//    3    9:areturn         
		}

		public boolean isAtLeast(State state)
		{
			return compareTo(((Enum) (state))) >= 0;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #61  <Method int compareTo(Enum)>
		//    3    5:iflt            10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		private static final State $VALUES[];
		public static final State CREATED;
		public static final State DESTROYED;
		public static final State INITIALIZED;
		public static final State RESUMED;
		public static final State STARTED;

		static 
		{
			DESTROYED = new State("DESTROYED", 0);
		//    0    0:new             #2   <Class Lifecycle$State>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "DESTROYED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void Lifecycle$State(String, int)>
		//    5   10:putstatic       #25  <Field Lifecycle$State DESTROYED>
			INITIALIZED = new State("INITIALIZED", 1);
		//    6   13:new             #2   <Class Lifecycle$State>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "INITIALIZED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void Lifecycle$State(String, int)>
		//   11   23:putstatic       #28  <Field Lifecycle$State INITIALIZED>
			CREATED = new State("CREATED", 2);
		//   12   26:new             #2   <Class Lifecycle$State>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "CREATED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void Lifecycle$State(String, int)>
		//   17   36:putstatic       #31  <Field Lifecycle$State CREATED>
			STARTED = new State("STARTED", 3);
		//   18   39:new             #2   <Class Lifecycle$State>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "STARTED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void Lifecycle$State(String, int)>
		//   23   49:putstatic       #34  <Field Lifecycle$State STARTED>
			RESUMED = new State("RESUMED", 4);
		//   24   52:new             #2   <Class Lifecycle$State>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "RESUMED">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void Lifecycle$State(String, int)>
		//   29   62:putstatic       #37  <Field Lifecycle$State RESUMED>
			$VALUES = (new State[] {
				DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       State[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field Lifecycle$State DESTROYED>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field Lifecycle$State INITIALIZED>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field Lifecycle$State CREATED>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field Lifecycle$State STARTED>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field Lifecycle$State RESUMED>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field Lifecycle$State[] $VALUES>
		//*  53  102:return          
		}

		private State(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Lifecycle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public abstract void addObserver(LifecycleObserver lifecycleobserver);

	public abstract State getCurrentState();

	public abstract void removeObserver(LifecycleObserver lifecycleobserver);
}
