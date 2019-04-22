// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.core.Path;

public interface Event
{
	public static final class EventType extends Enum
	{

		public static EventType valueOf(String s)
		{
			return (EventType)Enum.valueOf(com/firebase/client/core/view/Event$EventType, s);
		//    0    0:ldc1            #2   <Class Event$EventType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Event$EventType>
		//    4    9:areturn         
		}

		public static EventType[] values()
		{
			return (EventType[])((EventType []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field Event$EventType[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.firebase.client.core.view.Event$EventType_3B_.clone()>
		//    2    6:checkcast       #50  <Class Event$EventType[]>
		//    3    9:areturn         
		}

		private static final EventType $VALUES[];
		public static final EventType CHILD_ADDED;
		public static final EventType CHILD_CHANGED;
		public static final EventType CHILD_MOVED;
		public static final EventType CHILD_REMOVED;
		public static final EventType VALUE;

		static 
		{
			CHILD_REMOVED = new EventType("CHILD_REMOVED", 0);
		//    0    0:new             #2   <Class Event$EventType>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "CHILD_REMOVED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void Event$EventType(String, int)>
		//    5   10:putstatic       #25  <Field Event$EventType CHILD_REMOVED>
			CHILD_ADDED = new EventType("CHILD_ADDED", 1);
		//    6   13:new             #2   <Class Event$EventType>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CHILD_ADDED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void Event$EventType(String, int)>
		//   11   23:putstatic       #28  <Field Event$EventType CHILD_ADDED>
			CHILD_MOVED = new EventType("CHILD_MOVED", 2);
		//   12   26:new             #2   <Class Event$EventType>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "CHILD_MOVED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void Event$EventType(String, int)>
		//   17   36:putstatic       #31  <Field Event$EventType CHILD_MOVED>
			CHILD_CHANGED = new EventType("CHILD_CHANGED", 3);
		//   18   39:new             #2   <Class Event$EventType>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "CHILD_CHANGED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void Event$EventType(String, int)>
		//   23   49:putstatic       #34  <Field Event$EventType CHILD_CHANGED>
			VALUE = new EventType("VALUE", 4);
		//   24   52:new             #2   <Class Event$EventType>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "VALUE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void Event$EventType(String, int)>
		//   29   62:putstatic       #37  <Field Event$EventType VALUE>
			$VALUES = (new EventType[] {
				CHILD_REMOVED, CHILD_ADDED, CHILD_MOVED, CHILD_CHANGED, VALUE
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       EventType[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field Event$EventType CHILD_REMOVED>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field Event$EventType CHILD_ADDED>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field Event$EventType CHILD_MOVED>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field Event$EventType CHILD_CHANGED>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field Event$EventType VALUE>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field Event$EventType[] $VALUES>
		//*  53  102:return          
		}

		private EventType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract void fire();

	public abstract Path getPath();

	public abstract String toString();
}
