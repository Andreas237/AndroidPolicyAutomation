// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static interface Types
	{

		public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
		public static final int EVENT_TYPE_BIND = 2;
		public static final int EVENT_TYPE_CONNECT = 3;
		public static final int EVENT_TYPE_CONNECTION_TIME_OUT = 6;
		public static final int EVENT_TYPE_DISCONNECT = 4;
		public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
		public static final int EVENT_TYPE_START_SERVICE = 13;
		public static final int EVENT_TYPE_STOP_ALL_SERVICE = 15;
		public static final int EVENT_TYPE_STOP_SERVICE = 14;
		public static final int EVENT_TYPE_SYNC_END = 11;
		public static final int EVENT_TYPE_SYNC_START = 10;
		public static final int EVENT_TYPE_SYNC_TIME_OUT = 12;
		public static final int EVENT_TYPE_UNBIND = 1;
		public static final int EVENT_TYPE_UNKNOWN = -1;
		public static final int EVENT_TYPE_WAKE_LOCK_TIME_OUT = 9;
	}


	public StatsEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractSafeParcelable()>
	//    2    4:return          
	}

	public abstract StatsEvent ReconstructCloseEvent(StatsEvent statsevent);

	public abstract long getDurationMillis();

	public abstract long getElapsedRealtime();

	public abstract String getEventKey();

	public abstract int getEventType();

	public abstract String getSpecificString();

	public abstract long getTimeMillis();

	public abstract long getTimeout();

	public abstract StatsEvent markTimeOut();

	public abstract StatsEvent setDurationMillis(long l);

	public abstract StatsEvent setEventType(int i);

	public String toString()
	{
		long l = getTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method long getTimeMillis()>
	//    2    4:lstore_2        
		int i = getEventType();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #37  <Method int getEventType()>
	//    5    9:istore_1        
		long l1 = getDurationMillis();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #39  <Method long getDurationMillis()>
	//    8   14:lstore          4
		String s = getSpecificString();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #41  <Method String getSpecificString()>
	//   11   20:astore          6
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 53);
	//   12   22:new             #43  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:aload           6
	//   15   28:invokestatic    #49  <Method String String.valueOf(Object)>
	//   16   31:invokevirtual   #52  <Method int String.length()>
	//   17   34:bipush          53
	//   18   36:iadd            
	//   19   37:invokespecial   #55  <Method void StringBuilder(int)>
	//   20   40:astore          7
		stringbuilder.append(l);
	//   21   42:aload           7
	//   22   44:lload_2         
	//   23   45:invokevirtual   #59  <Method StringBuilder StringBuilder.append(long)>
	//   24   48:pop             
		stringbuilder.append("\t");
	//   25   49:aload           7
	//   26   51:ldc1            #61  <String "\t">
	//   27   53:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(i);
	//   29   57:aload           7
	//   30   59:iload_1         
	//   31   60:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   32   63:pop             
		stringbuilder.append("\t");
	//   33   64:aload           7
	//   34   66:ldc1            #61  <String "\t">
	//   35   68:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
		stringbuilder.append(l1);
	//   37   72:aload           7
	//   38   74:lload           4
	//   39   76:invokevirtual   #59  <Method StringBuilder StringBuilder.append(long)>
	//   40   79:pop             
		stringbuilder.append(s);
	//   41   80:aload           7
	//   42   82:aload           6
	//   43   84:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
		return stringbuilder.toString();
	//   45   88:aload           7
	//   46   90:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   47   93:areturn         
	}
}
