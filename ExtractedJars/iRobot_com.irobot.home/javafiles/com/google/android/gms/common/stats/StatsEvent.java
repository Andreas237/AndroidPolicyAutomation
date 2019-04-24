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
		public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
	}


	public StatsEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AbstractSafeParcelable()>
	//    2    4:return          
	}

	public abstract int getEventType();

	public abstract long getTimeMillis();

	public String toString()
	{
		long l = getTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method long getTimeMillis()>
	//    2    4:lstore_2        
		int i = getEventType();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #25  <Method int getEventType()>
	//    5    9:istore_1        
		long l1 = zzu();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #28  <Method long zzu()>
	//    8   14:lstore          4
		String s = zzv();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #31  <Method String zzv()>
	//   11   20:astore          6
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 53);
	//   12   22:new             #33  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:aload           6
	//   15   28:invokestatic    #39  <Method String String.valueOf(Object)>
	//   16   31:invokevirtual   #42  <Method int String.length()>
	//   17   34:bipush          53
	//   18   36:iadd            
	//   19   37:invokespecial   #45  <Method void StringBuilder(int)>
	//   20   40:astore          7
		stringbuilder.append(l);
	//   21   42:aload           7
	//   22   44:lload_2         
	//   23   45:invokevirtual   #49  <Method StringBuilder StringBuilder.append(long)>
	//   24   48:pop             
		stringbuilder.append("\t");
	//   25   49:aload           7
	//   26   51:ldc1            #51  <String "\t">
	//   27   53:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(i);
	//   29   57:aload           7
	//   30   59:iload_1         
	//   31   60:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   32   63:pop             
		stringbuilder.append("\t");
	//   33   64:aload           7
	//   34   66:ldc1            #51  <String "\t">
	//   35   68:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
		stringbuilder.append(l1);
	//   37   72:aload           7
	//   38   74:lload           4
	//   39   76:invokevirtual   #49  <Method StringBuilder StringBuilder.append(long)>
	//   40   79:pop             
		stringbuilder.append(s);
	//   41   80:aload           7
	//   42   82:aload           6
	//   43   84:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
		return stringbuilder.toString();
	//   45   88:aload           7
	//   46   90:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   47   93:areturn         
	}

	public abstract long zzu();

	public abstract String zzv();
}
