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
	//    2    4:lstore          4
		String s = String.valueOf("\t");
	//    3    6:ldc1            #21  <String "\t">
	//    4    8:invokestatic    #27  <Method String String.valueOf(Object)>
	//    5   11:astore          8
		int i = getEventType();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #29  <Method int getEventType()>
	//    8   17:istore_1        
		String s1 = String.valueOf("\t");
	//    9   18:ldc1            #21  <String "\t">
	//   10   20:invokestatic    #27  <Method String String.valueOf(Object)>
	//   11   23:astore          9
		long l1 = zzyK();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #32  <Method long zzyK()>
	//   14   29:lstore          6
		String s2 = String.valueOf(((Object) (zzyL())));
	//   15   31:aload_0         
	//   16   32:invokevirtual   #35  <Method String zzyL()>
	//   17   35:invokestatic    #27  <Method String String.valueOf(Object)>
	//   18   38:astore          10
		int j = String.valueOf(((Object) (s))).length();
	//   19   40:aload           8
	//   20   42:invokestatic    #27  <Method String String.valueOf(Object)>
	//   21   45:invokevirtual   #38  <Method int String.length()>
	//   22   48:istore_2        
		int k = String.valueOf(((Object) (s1))).length();
	//   23   49:aload           9
	//   24   51:invokestatic    #27  <Method String String.valueOf(Object)>
	//   25   54:invokevirtual   #38  <Method int String.length()>
	//   26   57:istore_3        
		return (new StringBuilder(String.valueOf(((Object) (s2))).length() + (j + 51 + k))).append(l).append(s).append(i).append(s1).append(l1).append(s2).toString();
	//   27   58:new             #40  <Class StringBuilder>
	//   28   61:dup             
	//   29   62:aload           10
	//   30   64:invokestatic    #27  <Method String String.valueOf(Object)>
	//   31   67:invokevirtual   #38  <Method int String.length()>
	//   32   70:iload_2         
	//   33   71:bipush          51
	//   34   73:iadd            
	//   35   74:iload_3         
	//   36   75:iadd            
	//   37   76:iadd            
	//   38   77:invokespecial   #43  <Method void StringBuilder(int)>
	//   39   80:lload           4
	//   40   82:invokevirtual   #47  <Method StringBuilder StringBuilder.append(long)>
	//   41   85:aload           8
	//   42   87:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   43   90:iload_1         
	//   44   91:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   45   94:aload           9
	//   46   96:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   47   99:lload           6
	//   48  101:invokevirtual   #47  <Method StringBuilder StringBuilder.append(long)>
	//   49  104:aload           10
	//   50  106:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   51  109:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   52  112:areturn         
	}

	public abstract long zzyK();

	public abstract String zzyL();
}
