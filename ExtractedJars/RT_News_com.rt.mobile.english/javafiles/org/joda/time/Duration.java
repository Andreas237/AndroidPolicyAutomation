// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time:
//			ReadableDuration, Days, Hours, Minutes, 
//			Seconds, ReadableInstant

public final class Duration extends BaseDuration
	implements ReadableDuration, Serializable
{

	public Duration(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #24  <Method void BaseDuration(long)>
	//    3    5:return          
	}

	public Duration(long l, long l1)
	{
		super(l, l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:invokespecial   #27  <Method void BaseDuration(long, long)>
	//    4    6:return          
	}

	public Duration(Object obj)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void BaseDuration(Object)>
	//    3    5:return          
	}

	public Duration(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		super(readableinstant, readableinstant1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void BaseDuration(ReadableInstant, ReadableInstant)>
	//    4    6:return          
	}

	public static Duration millis(long l)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            10
			return ZERO;
	//    4    6:getstatic       #22  <Field Duration ZERO>
	//    5    9:areturn         
		else
			return new Duration(l);
	//    6   10:new             #2   <Class Duration>
	//    7   13:dup             
	//    8   14:lload_0         
	//    9   15:invokespecial   #20  <Method void Duration(long)>
	//   10   18:areturn         
	}

	public static Duration parse(String s)
	{
		return new Duration(((Object) (s)));
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void Duration(Object)>
	//    4    8:areturn         
	}

	public static Duration standardDays(long l)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            10
			return ZERO;
	//    4    6:getstatic       #22  <Field Duration ZERO>
	//    5    9:areturn         
		else
			return new Duration(FieldUtils.safeMultiply(l, 0x5265c00));
	//    6   10:new             #2   <Class Duration>
	//    7   13:dup             
	//    8   14:lload_0         
	//    9   15:ldc1            #42  <Int 0x5265c00>
	//   10   17:invokestatic    #48  <Method long FieldUtils.safeMultiply(long, int)>
	//   11   20:invokespecial   #20  <Method void Duration(long)>
	//   12   23:areturn         
	}

	public static Duration standardHours(long l)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            10
			return ZERO;
	//    4    6:getstatic       #22  <Field Duration ZERO>
	//    5    9:areturn         
		else
			return new Duration(FieldUtils.safeMultiply(l, 0x36ee80));
	//    6   10:new             #2   <Class Duration>
	//    7   13:dup             
	//    8   14:lload_0         
	//    9   15:ldc1            #50  <Int 0x36ee80>
	//   10   17:invokestatic    #48  <Method long FieldUtils.safeMultiply(long, int)>
	//   11   20:invokespecial   #20  <Method void Duration(long)>
	//   12   23:areturn         
	}

	public static Duration standardMinutes(long l)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            10
			return ZERO;
	//    4    6:getstatic       #22  <Field Duration ZERO>
	//    5    9:areturn         
		else
			return new Duration(FieldUtils.safeMultiply(l, 60000));
	//    6   10:new             #2   <Class Duration>
	//    7   13:dup             
	//    8   14:lload_0         
	//    9   15:ldc1            #52  <Int 60000>
	//   10   17:invokestatic    #48  <Method long FieldUtils.safeMultiply(long, int)>
	//   11   20:invokespecial   #20  <Method void Duration(long)>
	//   12   23:areturn         
	}

	public static Duration standardSeconds(long l)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            10
			return ZERO;
	//    4    6:getstatic       #22  <Field Duration ZERO>
	//    5    9:areturn         
		else
			return new Duration(FieldUtils.safeMultiply(l, 1000));
	//    6   10:new             #2   <Class Duration>
	//    7   13:dup             
	//    8   14:lload_0         
	//    9   15:sipush          1000
	//   10   18:invokestatic    #48  <Method long FieldUtils.safeMultiply(long, int)>
	//   11   21:invokespecial   #20  <Method void Duration(long)>
	//   12   24:areturn         
	}

	public Duration dividedBy(long l)
	{
		if(l == 1L)
	//*   0    0:lload_1         
	//*   1    1:lconst_1        
	//*   2    2:lcmp            
	//*   3    3:ifne            8
			return this;
	//    4    6:aload_0         
	//    5    7:areturn         
		else
			return new Duration(FieldUtils.safeDivide(getMillis(), l));
	//    6    8:new             #2   <Class Duration>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokevirtual   #58  <Method long getMillis()>
	//   10   16:lload_1         
	//   11   17:invokestatic    #62  <Method long FieldUtils.safeDivide(long, long)>
	//   12   20:invokespecial   #20  <Method void Duration(long)>
	//   13   23:areturn         
	}

	public long getStandardDays()
	{
		return getMillis() / 0x5265c00L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method long getMillis()>
	//    2    4:ldc2w           #64  <Long 0x5265c00L>
	//    3    7:ldiv            
	//    4    8:lreturn         
	}

	public long getStandardHours()
	{
		return getMillis() / 0x36ee80L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method long getMillis()>
	//    2    4:ldc2w           #67  <Long 0x36ee80L>
	//    3    7:ldiv            
	//    4    8:lreturn         
	}

	public long getStandardMinutes()
	{
		return getMillis() / 60000L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method long getMillis()>
	//    2    4:ldc2w           #70  <Long 60000L>
	//    3    7:ldiv            
	//    4    8:lreturn         
	}

	public long getStandardSeconds()
	{
		return getMillis() / 1000L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method long getMillis()>
	//    2    4:ldc2w           #73  <Long 1000L>
	//    3    7:ldiv            
	//    4    8:lreturn         
	}

	public Duration minus(long l)
	{
		return withDurationAdded(l, -1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #79  <Method Duration withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public Duration minus(ReadableDuration readableduration)
	{
		if(readableduration == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withDurationAdded(readableduration.getMillis(), -1);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokeinterface #81  <Method long ReadableDuration.getMillis()>
	//    7   13:iconst_m1       
	//    8   14:invokevirtual   #79  <Method Duration withDurationAdded(long, int)>
	//    9   17:areturn         
	}

	public Duration multipliedBy(long l)
	{
		if(l == 1L)
	//*   0    0:lload_1         
	//*   1    1:lconst_1        
	//*   2    2:lcmp            
	//*   3    3:ifne            8
			return this;
	//    4    6:aload_0         
	//    5    7:areturn         
		else
			return new Duration(FieldUtils.safeMultiply(getMillis(), l));
	//    6    8:new             #2   <Class Duration>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokevirtual   #58  <Method long getMillis()>
	//   10   16:lload_1         
	//   11   17:invokestatic    #84  <Method long FieldUtils.safeMultiply(long, long)>
	//   12   20:invokespecial   #20  <Method void Duration(long)>
	//   13   23:areturn         
	}

	public Duration negated()
	{
		if(getMillis() == 0x0L)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #58  <Method long getMillis()>
	//*   2    4:ldc2w           #87  <Long 0x0L>
	//*   3    7:lcmp            
	//*   4    8:ifne            21
			throw new ArithmeticException("Negation of this duration would overflow");
	//    5   11:new             #90  <Class ArithmeticException>
	//    6   14:dup             
	//    7   15:ldc1            #92  <String "Negation of this duration would overflow">
	//    8   17:invokespecial   #95  <Method void ArithmeticException(String)>
	//    9   20:athrow          
		else
			return new Duration(-getMillis());
	//   10   21:new             #2   <Class Duration>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokevirtual   #58  <Method long getMillis()>
	//   14   29:lneg            
	//   15   30:invokespecial   #20  <Method void Duration(long)>
	//   16   33:areturn         
	}

	public Duration plus(long l)
	{
		return withDurationAdded(l, 1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #79  <Method Duration withDurationAdded(long, int)>
	//    4    6:areturn         
	}

	public Duration plus(ReadableDuration readableduration)
	{
		if(readableduration == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return withDurationAdded(readableduration.getMillis(), 1);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokeinterface #81  <Method long ReadableDuration.getMillis()>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #79  <Method Duration withDurationAdded(long, int)>
	//    9   17:areturn         
	}

	public Duration toDuration()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Days toStandardDays()
	{
		return Days.days(FieldUtils.safeToInt(getStandardDays()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method long getStandardDays()>
	//    2    4:invokestatic    #105 <Method int FieldUtils.safeToInt(long)>
	//    3    7:invokestatic    #111 <Method Days Days.days(int)>
	//    4   10:areturn         
	}

	public Hours toStandardHours()
	{
		return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method long getStandardHours()>
	//    2    4:invokestatic    #105 <Method int FieldUtils.safeToInt(long)>
	//    3    7:invokestatic    #121 <Method Hours Hours.hours(int)>
	//    4   10:areturn         
	}

	public Minutes toStandardMinutes()
	{
		return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method long getStandardMinutes()>
	//    2    4:invokestatic    #105 <Method int FieldUtils.safeToInt(long)>
	//    3    7:invokestatic    #131 <Method Minutes Minutes.minutes(int)>
	//    4   10:areturn         
	}

	public Seconds toStandardSeconds()
	{
		return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method long getStandardSeconds()>
	//    2    4:invokestatic    #105 <Method int FieldUtils.safeToInt(long)>
	//    3    7:invokestatic    #141 <Method Seconds Seconds.seconds(int)>
	//    4   10:areturn         
	}

	public Duration withDurationAdded(long l, int i)
	{
		if(l != 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifeq            34
		{
			if(i == 0)
	//*   4    6:iload_3         
	//*   5    7:ifne            12
			{
				return this;
	//    6   10:aload_0         
	//    7   11:areturn         
			} else
			{
				l = FieldUtils.safeMultiply(l, i);
	//    8   12:lload_1         
	//    9   13:iload_3         
	//   10   14:invokestatic    #48  <Method long FieldUtils.safeMultiply(long, int)>
	//   11   17:lstore_1        
				return new Duration(FieldUtils.safeAdd(getMillis(), l));
	//   12   18:new             #2   <Class Duration>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:invokevirtual   #58  <Method long getMillis()>
	//   16   26:lload_1         
	//   17   27:invokestatic    #144 <Method long FieldUtils.safeAdd(long, long)>
	//   18   30:invokespecial   #20  <Method void Duration(long)>
	//   19   33:areturn         
			}
		} else
		{
			return this;
	//   20   34:aload_0         
	//   21   35:areturn         
		}
	}

	public Duration withDurationAdded(ReadableDuration readableduration, int i)
	{
		if(readableduration != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
		{
			if(i == 0)
	//*   2    4:iload_2         
	//*   3    5:ifne            10
				return this;
	//    4    8:aload_0         
	//    5    9:areturn         
			else
				return withDurationAdded(readableduration.getMillis(), i);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #81  <Method long ReadableDuration.getMillis()>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #79  <Method Duration withDurationAdded(long, int)>
	//   11   21:areturn         
		} else
		{
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public Duration withMillis(long l)
	{
		if(l == getMillis())
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #58  <Method long getMillis()>
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return new Duration(l);
	//    7   11:new             #2   <Class Duration>
	//    8   14:dup             
	//    9   15:lload_1         
	//   10   16:invokespecial   #20  <Method void Duration(long)>
	//   11   19:areturn         
	}

	public static final Duration ZERO = new Duration(0L);
	private static final long serialVersionUID = 0x7a51ced6L;

	static 
	{
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:lconst_0        
	//    3    5:invokespecial   #20  <Method void Duration(long)>
	//    4    8:putstatic       #22  <Field Duration ZERO>
	//*   5   11:return          
	}
}
