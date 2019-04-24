// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public abstract class StatsEvent extends zza
	implements ReflectedParcelable
{

	public StatsEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void zza()>
	//    2    4:return          
	}

	public abstract int getEventType();

	public abstract long getTimeMillis();

	public String toString()
	{
		long l = getTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method long getTimeMillis()>
	//    2    4:lstore_2        
		String s = String.valueOf("\t");
	//    3    5:ldc1            #21  <String "\t">
	//    4    7:invokestatic    #27  <Method String String.valueOf(Object)>
	//    5   10:astore          6
		int i = getEventType();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #29  <Method int getEventType()>
	//    8   16:istore_1        
		String s1 = String.valueOf("\t");
	//    9   17:ldc1            #21  <String "\t">
	//   10   19:invokestatic    #27  <Method String String.valueOf(Object)>
	//   11   22:astore          7
		long l1 = zzye();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #32  <Method long zzye()>
	//   14   28:lstore          4
		String s2 = String.valueOf(((Object) (zzyf())));
	//   15   30:aload_0         
	//   16   31:invokevirtual   #35  <Method String zzyf()>
	//   17   34:invokestatic    #27  <Method String String.valueOf(Object)>
	//   18   37:astore          8
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 51 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length())).append(l).append(s).append(i).append(s1).append(l1).append(s2).toString();
	//   19   39:new             #37  <Class StringBuilder>
	//   20   42:dup             
	//   21   43:aload           6
	//   22   45:invokestatic    #27  <Method String String.valueOf(Object)>
	//   23   48:invokevirtual   #40  <Method int String.length()>
	//   24   51:bipush          51
	//   25   53:iadd            
	//   26   54:aload           7
	//   27   56:invokestatic    #27  <Method String String.valueOf(Object)>
	//   28   59:invokevirtual   #40  <Method int String.length()>
	//   29   62:iadd            
	//   30   63:aload           8
	//   31   65:invokestatic    #27  <Method String String.valueOf(Object)>
	//   32   68:invokevirtual   #40  <Method int String.length()>
	//   33   71:iadd            
	//   34   72:invokespecial   #43  <Method void StringBuilder(int)>
	//   35   75:lload_2         
	//   36   76:invokevirtual   #47  <Method StringBuilder StringBuilder.append(long)>
	//   37   79:aload           6
	//   38   81:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   39   84:iload_1         
	//   40   85:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   41   88:aload           7
	//   42   90:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   43   93:lload           4
	//   44   95:invokevirtual   #47  <Method StringBuilder StringBuilder.append(long)>
	//   45   98:aload           8
	//   46  100:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   47  103:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   48  106:areturn         
	}

	public abstract long zzye();

	public abstract String zzyf();
}
