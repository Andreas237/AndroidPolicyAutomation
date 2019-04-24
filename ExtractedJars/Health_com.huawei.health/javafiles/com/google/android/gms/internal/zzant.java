// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zzant
{

	public static long zza(long l, TimeUnit timeunit, TimeUnit timeunit1)
	{
		return timeunit.convert(timeunit1.convert(l, timeunit), timeunit1);
	//    0    0:aload_2         
	//    1    1:aload_3         
	//    2    2:lload_0         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #48  <Method long TimeUnit.convert(long, TimeUnit)>
	//    5    7:aload_3         
	//    6    8:invokevirtual   #48  <Method long TimeUnit.convert(long, TimeUnit)>
	//    7   11:lreturn         
	}

	public static boolean zza(TimeUnit timeunit)
	{
		return zza(timeunit, TimeUnit.MILLISECONDS);
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    2    4:invokestatic    #52  <Method boolean zza(TimeUnit, TimeUnit)>
	//    3    7:ireturn         
	}

	private static boolean zza(TimeUnit timeunit, TimeUnit timeunit1)
	{
		return zzaSm.indexOf(((Object) (timeunit))) < zzaSm.indexOf(((Object) (timeunit1)));
	//    0    0:getstatic       #41  <Field List zzaSm>
	//    1    3:aload_0         
	//    2    4:invokeinterface #58  <Method int List.indexOf(Object)>
	//    3    9:getstatic       #41  <Field List zzaSm>
	//    4   12:aload_1         
	//    5   13:invokeinterface #58  <Method int List.indexOf(Object)>
	//    6   18:icmpge          23
	//    7   21:iconst_1        
	//    8   22:ireturn         
	//    9   23:iconst_0        
	//   10   24:ireturn         
	}

	private static final List zzaSm;

	static 
	{
		zzaSm = Arrays.asList(((Object []) (new TimeUnit[] {
			TimeUnit.NANOSECONDS, TimeUnit.MICROSECONDS, TimeUnit.MILLISECONDS, TimeUnit.SECONDS, TimeUnit.MINUTES, TimeUnit.HOURS, TimeUnit.DAYS
		})));
	//    0    0:bipush          7
	//    1    2:anewarray       TimeUnit[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:getstatic       #15  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    5   10:aastore         
	//    6   11:dup             
	//    7   12:iconst_1        
	//    8   13:getstatic       #18  <Field TimeUnit TimeUnit.MICROSECONDS>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_2        
	//   12   19:getstatic       #21  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_3        
	//   16   25:getstatic       #24  <Field TimeUnit TimeUnit.SECONDS>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_4        
	//   20   31:getstatic       #27  <Field TimeUnit TimeUnit.MINUTES>
	//   21   34:aastore         
	//   22   35:dup             
	//   23   36:iconst_5        
	//   24   37:getstatic       #30  <Field TimeUnit TimeUnit.HOURS>
	//   25   40:aastore         
	//   26   41:dup             
	//   27   42:bipush          6
	//   28   44:getstatic       #33  <Field TimeUnit TimeUnit.DAYS>
	//   29   47:aastore         
	//   30   48:invokestatic    #39  <Method List Arrays.asList(Object[])>
	//   31   51:putstatic       #41  <Field List zzaSm>
	//*  32   54:return          
	}
}
