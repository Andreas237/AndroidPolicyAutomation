// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			PeriodicityType

public class RollingCalendar extends GregorianCalendar
{

	public RollingCalendar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void GregorianCalendar()>
		periodicityType = PeriodicityType.ERRONEOUS;
	//    2    4:aload_0         
	//    3    5:getstatic       #35  <Field PeriodicityType PeriodicityType.ERRONEOUS>
	//    4    8:putfield        #37  <Field PeriodicityType periodicityType>
	//    5   11:return          
	}

	public RollingCalendar(TimeZone timezone, Locale locale)
	{
		super(timezone, locale);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void GregorianCalendar(TimeZone, Locale)>
		periodicityType = PeriodicityType.ERRONEOUS;
	//    4    6:aload_0         
	//    5    7:getstatic       #35  <Field PeriodicityType PeriodicityType.ERRONEOUS>
	//    6   10:putfield        #37  <Field PeriodicityType periodicityType>
	//    7   13:return          
	}

	public static int diffInMonths(long l, long l1)
	{
		if(l > l1)
	//*   0    0:lload_0         
	//*   1    1:lload_2         
	//*   2    2:lcmp            
	//*   3    3:ifle            16
		{
			throw new IllegalArgumentException("startTime cannot be larger than endTime");
	//    4    6:new             #44  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #46  <String "startTime cannot be larger than endTime">
	//    7   12:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		} else
		{
			Calendar calendar = Calendar.getInstance();
	//    9   16:invokestatic    #55  <Method Calendar Calendar.getInstance()>
	//   10   19:astore          4
			calendar.setTimeInMillis(l);
	//   11   21:aload           4
	//   12   23:lload_0         
	//   13   24:invokevirtual   #59  <Method void Calendar.setTimeInMillis(long)>
			Calendar calendar1 = Calendar.getInstance();
	//   14   27:invokestatic    #55  <Method Calendar Calendar.getInstance()>
	//   15   30:astore          5
			calendar1.setTimeInMillis(l1);
	//   16   32:aload           5
	//   17   34:lload_2         
	//   18   35:invokevirtual   #59  <Method void Calendar.setTimeInMillis(long)>
			return (calendar1.get(1) - calendar.get(1)) * 12 + (calendar1.get(2) - calendar.get(2));
	//   19   38:aload           5
	//   20   40:iconst_1        
	//   21   41:invokevirtual   #63  <Method int Calendar.get(int)>
	//   22   44:aload           4
	//   23   46:iconst_1        
	//   24   47:invokevirtual   #63  <Method int Calendar.get(int)>
	//   25   50:isub            
	//   26   51:bipush          12
	//   27   53:imul            
	//   28   54:aload           5
	//   29   56:iconst_2        
	//   30   57:invokevirtual   #63  <Method int Calendar.get(int)>
	//   31   60:aload           4
	//   32   62:iconst_2        
	//   33   63:invokevirtual   #63  <Method int Calendar.get(int)>
	//   34   66:isub            
	//   35   67:iadd            
	//   36   68:ireturn         
		}
	}

	private void setPeriodicityType(PeriodicityType periodicitytype)
	{
		periodicityType = periodicitytype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field PeriodicityType periodicityType>
	//    3    5:return          
	}

	public PeriodicityType computePeriodicityType(String s)
	{
		RollingCalendar rollingcalendar = new RollingCalendar(GMT_TIMEZONE, Locale.getDefault());
	//    0    0:new             #2   <Class RollingCalendar>
	//    1    3:dup             
	//    2    4:getstatic       #26  <Field TimeZone GMT_TIMEZONE>
	//    3    7:invokestatic    #73  <Method Locale Locale.getDefault()>
	//    4   10:invokespecial   #74  <Method void RollingCalendar(TimeZone, Locale)>
	//    5   13:astore          4
		Date date = new Date(0L);
	//    6   15:new             #76  <Class Date>
	//    7   18:dup             
	//    8   19:lconst_0        
	//    9   20:invokespecial   #78  <Method void Date(long)>
	//   10   23:astore          5
		if(s != null)
	//*  11   25:aload_1         
	//*  12   26:ifnull          136
		{
			PeriodicityType aperiodicitytype[] = PeriodicityType.VALID_ORDERED_LIST;
	//   13   29:getstatic       #82  <Field PeriodicityType[] PeriodicityType.VALID_ORDERED_LIST>
	//   14   32:astore          6
			int j = aperiodicitytype.length;
	//   15   34:aload           6
	//   16   36:arraylength     
	//   17   37:istore_3        
			for(int i = 0; i < j; i++)
	//*  18   38:iconst_0        
	//*  19   39:istore_2        
	//*  20   40:iload_2         
	//*  21   41:iload_3         
	//*  22   42:icmpge          136
			{
				PeriodicityType periodicitytype = aperiodicitytype[i];
	//   23   45:aload           6
	//   24   47:iload_2         
	//   25   48:aaload          
	//   26   49:astore          7
				Object obj = ((Object) (new SimpleDateFormat(s)));
	//   27   51:new             #84  <Class SimpleDateFormat>
	//   28   54:dup             
	//   29   55:aload_1         
	//   30   56:invokespecial   #85  <Method void SimpleDateFormat(String)>
	//   31   59:astore          9
				((SimpleDateFormat) (obj)).setTimeZone(GMT_TIMEZONE);
	//   32   61:aload           9
	//   33   63:getstatic       #26  <Field TimeZone GMT_TIMEZONE>
	//   34   66:invokevirtual   #89  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
				String s1 = ((SimpleDateFormat) (obj)).format(date);
	//   35   69:aload           9
	//   36   71:aload           5
	//   37   73:invokevirtual   #93  <Method String SimpleDateFormat.format(Date)>
	//   38   76:astore          8
				rollingcalendar.setPeriodicityType(periodicitytype);
	//   39   78:aload           4
	//   40   80:aload           7
	//   41   82:invokespecial   #95  <Method void setPeriodicityType(PeriodicityType)>
				obj = ((Object) (((SimpleDateFormat) (obj)).format(new Date(rollingcalendar.getNextTriggeringMillis(date)))));
	//   42   85:aload           9
	//   43   87:new             #76  <Class Date>
	//   44   90:dup             
	//   45   91:aload           4
	//   46   93:aload           5
	//   47   95:invokevirtual   #99  <Method long getNextTriggeringMillis(Date)>
	//   48   98:invokespecial   #78  <Method void Date(long)>
	//   49  101:invokevirtual   #93  <Method String SimpleDateFormat.format(Date)>
	//   50  104:astore          9
				if(s1 != null && obj != null && !s1.equals(obj))
	//*  51  106:aload           8
	//*  52  108:ifnull          129
	//*  53  111:aload           9
	//*  54  113:ifnull          129
	//*  55  116:aload           8
	//*  56  118:aload           9
	//*  57  120:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  58  123:ifne            129
					return periodicitytype;
	//   59  126:aload           7
	//   60  128:areturn         
			}

	//   61  129:iload_2         
	//   62  130:iconst_1        
	//   63  131:iadd            
	//   64  132:istore_2        
		}
	//*  65  133:goto            40
		return PeriodicityType.ERRONEOUS;
	//   66  136:getstatic       #35  <Field PeriodicityType PeriodicityType.ERRONEOUS>
	//   67  139:areturn         
	}

	public Date getNextTriggeringDate(Date date)
	{
		return getRelativeDate(date, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #111 <Method Date getRelativeDate(Date, int)>
	//    4    6:areturn         
	}

	public long getNextTriggeringMillis(Date date)
	{
		return getNextTriggeringDate(date).getTime();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method Date getNextTriggeringDate(Date)>
	//    3    5:invokevirtual   #117 <Method long Date.getTime()>
	//    4    8:lreturn         
	}

	public PeriodicityType getPeriodicityType()
	{
		return periodicityType;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field PeriodicityType periodicityType>
	//    2    4:areturn         
	}

	public Date getRelativeDate(Date date, int i)
	{
label0:
		{
label1:
			{
label2:
				{
label3:
					{
label4:
						{
label5:
							{
								setTime(date);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #123 <Method void setTime(Date)>
								static class _cls1
								{

									static final int $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[];

									static 
									{
										$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType = new int[PeriodicityType.values().length];
									//    0    0:invokestatic    #18  <Method PeriodicityType[] PeriodicityType.values()>
									//    1    3:arraylength     
									//    2    4:newarray        int[]
									//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MILLISECOND.ordinal()] = 1;
									//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//    5   12:getstatic       #24  <Field PeriodicityType PeriodicityType.TOP_OF_MILLISECOND>
									//    6   15:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//    7   18:iconst_1        
									//    8   19:iastore         
										}
									//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//*  10   23:getstatic       #31  <Field PeriodicityType PeriodicityType.TOP_OF_SECOND>
									//*  11   26:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//*  12   29:iconst_2        
									//*  13   30:iastore         
									//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//*  15   34:getstatic       #34  <Field PeriodicityType PeriodicityType.TOP_OF_MINUTE>
									//*  16   37:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//*  17   40:iconst_3        
									//*  18   41:iastore         
									//*  19   42:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//*  20   45:getstatic       #37  <Field PeriodicityType PeriodicityType.TOP_OF_HOUR>
									//*  21   48:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//*  22   51:iconst_4        
									//*  23   52:iastore         
									//*  24   53:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//*  25   56:getstatic       #40  <Field PeriodicityType PeriodicityType.HALF_DAY>
									//*  26   59:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//*  27   62:iconst_5        
									//*  28   63:iastore         
									//*  29   64:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//*  30   67:getstatic       #43  <Field PeriodicityType PeriodicityType.TOP_OF_DAY>
									//*  31   70:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//*  32   73:bipush          6
									//*  33   75:iastore         
									//*  34   76:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//*  35   79:getstatic       #46  <Field PeriodicityType PeriodicityType.TOP_OF_WEEK>
									//*  36   82:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//*  37   85:bipush          7
									//*  38   87:iastore         
									//*  39   88:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
									//*  40   91:getstatic       #49  <Field PeriodicityType PeriodicityType.TOP_OF_MONTH>
									//*  41   94:invokevirtual   #28  <Method int PeriodicityType.ordinal()>
									//*  42   97:bipush          8
									//*  43   99:iastore         
									//*  44  100:return          
										catch(NoSuchFieldError nosuchfielderror) { }
									//   45  101:astore_0        
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_SECOND.ordinal()] = 2;
										}
									//*  46  102:goto            20
										catch(NoSuchFieldError nosuchfielderror1) { }
									//   47  105:astore_0        
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MINUTE.ordinal()] = 3;
										}
									//*  48  106:goto            31
										catch(NoSuchFieldError nosuchfielderror2) { }
									//   49  109:astore_0        
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_HOUR.ordinal()] = 4;
										}
									//*  50  110:goto            42
										catch(NoSuchFieldError nosuchfielderror3) { }
									//   51  113:astore_0        
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.HALF_DAY.ordinal()] = 5;
										}
									//*  52  114:goto            53
										catch(NoSuchFieldError nosuchfielderror4) { }
									//   53  117:astore_0        
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_DAY.ordinal()] = 6;
										}
									//*  54  118:goto            64
										catch(NoSuchFieldError nosuchfielderror5) { }
									//   55  121:astore_0        
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_WEEK.ordinal()] = 7;
										}
									//*  56  122:goto            76
										catch(NoSuchFieldError nosuchfielderror6) { }
									//   57  125:astore_0        
										try
										{
											$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MONTH.ordinal()] = 8;
										}
									//*  58  126:goto            88
										catch(NoSuchFieldError nosuchfielderror7) { }
									//   59  129:astore_0        
									//*  60  130:return          
									}
								}

								byte byte0;
								switch(_cls1..SwitchMap.ch.qos.logback.core.rolling.helper.PeriodicityType[periodicityType.ordinal()])
	//*   3    5:getstatic       #127 <Field int[] RollingCalendar$1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field PeriodicityType periodicityType>
	//*   6   12:invokevirtual   #131 <Method int PeriodicityType.ordinal()>
	//*   7   15:iaload          
								{
	//*   8   16:tableswitch     1 8: default 64
	//	               1 271
	//	               2 254
	//	               3 230
	//	               4 199
	//	               5 64
	//	               6 162
	//	               7 113
	//	               8 74
								case 5: // '\005'
								default:
									throw new IllegalStateException("Unknown periodicity type.");
	//    9   64:new             #133 <Class IllegalStateException>
	//   10   67:dup             
	//   11   68:ldc1            #135 <String "Unknown periodicity type.">
	//   12   70:invokespecial   #136 <Method void IllegalStateException(String)>
	//   13   73:athrow          

								case 1: // '\001'
									break label1;

								case 2: // '\002'
									break label2;

								case 3: // '\003'
									break label3;

								case 4: // '\004'
									break label4;

								case 6: // '\006'
									break label5;

								case 8: // '\b'
									set(5, 1);
	//   14   74:aload_0         
	//   15   75:iconst_5        
	//   16   76:iconst_1        
	//   17   77:invokevirtual   #140 <Method void set(int, int)>
									set(11, 0);
	//   18   80:aload_0         
	//   19   81:bipush          11
	//   20   83:iconst_0        
	//   21   84:invokevirtual   #140 <Method void set(int, int)>
									set(12, 0);
	//   22   87:aload_0         
	//   23   88:bipush          12
	//   24   90:iconst_0        
	//   25   91:invokevirtual   #140 <Method void set(int, int)>
									set(13, 0);
	//   26   94:aload_0         
	//   27   95:bipush          13
	//   28   97:iconst_0        
	//   29   98:invokevirtual   #140 <Method void set(int, int)>
									set(14, 0);
	//   30  101:aload_0         
	//   31  102:bipush          14
	//   32  104:iconst_0        
	//   33  105:invokevirtual   #140 <Method void set(int, int)>
									byte0 = 2;
	//   34  108:iconst_2        
	//   35  109:istore_3        
									break;
	//   36  110:goto            153

								case 7: // '\007'
									set(7, getFirstDayOfWeek());
	//   37  113:aload_0         
	//   38  114:bipush          7
	//   39  116:aload_0         
	//   40  117:invokevirtual   #143 <Method int getFirstDayOfWeek()>
	//   41  120:invokevirtual   #140 <Method void set(int, int)>
									set(11, 0);
	//   42  123:aload_0         
	//   43  124:bipush          11
	//   44  126:iconst_0        
	//   45  127:invokevirtual   #140 <Method void set(int, int)>
									set(12, 0);
	//   46  130:aload_0         
	//   47  131:bipush          12
	//   48  133:iconst_0        
	//   49  134:invokevirtual   #140 <Method void set(int, int)>
									set(13, 0);
	//   50  137:aload_0         
	//   51  138:bipush          13
	//   52  140:iconst_0        
	//   53  141:invokevirtual   #140 <Method void set(int, int)>
									set(14, 0);
	//   54  144:aload_0         
	//   55  145:bipush          14
	//   56  147:iconst_0        
	//   57  148:invokevirtual   #140 <Method void set(int, int)>
									byte0 = 3;
	//   58  151:iconst_3        
	//   59  152:istore_3        
									break;
								}
								add(((int) (byte0)), i);
	//   60  153:aload_0         
	//   61  154:iload_3         
	//   62  155:iload_2         
	//   63  156:invokevirtual   #146 <Method void add(int, int)>
								break label0;
	//   64  159:goto            278
							}
							set(11, 0);
	//   65  162:aload_0         
	//   66  163:bipush          11
	//   67  165:iconst_0        
	//   68  166:invokevirtual   #140 <Method void set(int, int)>
							set(12, 0);
	//   69  169:aload_0         
	//   70  170:bipush          12
	//   71  172:iconst_0        
	//   72  173:invokevirtual   #140 <Method void set(int, int)>
							set(13, 0);
	//   73  176:aload_0         
	//   74  177:bipush          13
	//   75  179:iconst_0        
	//   76  180:invokevirtual   #140 <Method void set(int, int)>
							set(14, 0);
	//   77  183:aload_0         
	//   78  184:bipush          14
	//   79  186:iconst_0        
	//   80  187:invokevirtual   #140 <Method void set(int, int)>
							add(5, i);
	//   81  190:aload_0         
	//   82  191:iconst_5        
	//   83  192:iload_2         
	//   84  193:invokevirtual   #146 <Method void add(int, int)>
							break label0;
	//   85  196:goto            278
						}
						set(12, 0);
	//   86  199:aload_0         
	//   87  200:bipush          12
	//   88  202:iconst_0        
	//   89  203:invokevirtual   #140 <Method void set(int, int)>
						set(13, 0);
	//   90  206:aload_0         
	//   91  207:bipush          13
	//   92  209:iconst_0        
	//   93  210:invokevirtual   #140 <Method void set(int, int)>
						set(14, 0);
	//   94  213:aload_0         
	//   95  214:bipush          14
	//   96  216:iconst_0        
	//   97  217:invokevirtual   #140 <Method void set(int, int)>
						add(11, i);
	//   98  220:aload_0         
	//   99  221:bipush          11
	//  100  223:iload_2         
	//  101  224:invokevirtual   #146 <Method void add(int, int)>
						break label0;
	//  102  227:goto            278
					}
					set(13, 0);
	//  103  230:aload_0         
	//  104  231:bipush          13
	//  105  233:iconst_0        
	//  106  234:invokevirtual   #140 <Method void set(int, int)>
					set(14, 0);
	//  107  237:aload_0         
	//  108  238:bipush          14
	//  109  240:iconst_0        
	//  110  241:invokevirtual   #140 <Method void set(int, int)>
					add(12, i);
	//  111  244:aload_0         
	//  112  245:bipush          12
	//  113  247:iload_2         
	//  114  248:invokevirtual   #146 <Method void add(int, int)>
					break label0;
	//  115  251:goto            278
				}
				set(14, 0);
	//  116  254:aload_0         
	//  117  255:bipush          14
	//  118  257:iconst_0        
	//  119  258:invokevirtual   #140 <Method void set(int, int)>
				add(13, i);
	//  120  261:aload_0         
	//  121  262:bipush          13
	//  122  264:iload_2         
	//  123  265:invokevirtual   #146 <Method void add(int, int)>
				break label0;
	//  124  268:goto            278
			}
			add(14, i);
	//  125  271:aload_0         
	//  126  272:bipush          14
	//  127  274:iload_2         
	//  128  275:invokevirtual   #146 <Method void add(int, int)>
		}
		return getTime();
	//  129  278:aload_0         
	//  130  279:invokevirtual   #149 <Method Date getTime()>
	//  131  282:areturn         
	}

	public void init(String s)
	{
		periodicityType = computePeriodicityType(s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #152 <Method PeriodicityType computePeriodicityType(String)>
	//    4    6:putfield        #37  <Field PeriodicityType periodicityType>
	//    5    9:return          
	}

	public long periodsElapsed(long l, long l1)
	{
		long l2;
		if(l > l1)
	//*   0    0:lload_1         
	//*   1    1:lload_3         
	//*   2    2:lcmp            
	//*   3    3:ifle            16
			throw new IllegalArgumentException("Start cannot come before end");
	//    4    6:new             #44  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #156 <String "Start cannot come before end">
	//    7   12:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		l2 = l1 - l;
	//    9   16:lload_3         
	//   10   17:lload_1         
	//   11   18:lsub            
	//   12   19:lstore          6
		_cls1..SwitchMap.ch.qos.logback.core.rolling.helper.PeriodicityType[periodicityType.ordinal()];
	//   13   21:getstatic       #127 <Field int[] RollingCalendar$1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
	//   14   24:aload_0         
	//   15   25:getfield        #37  <Field PeriodicityType periodicityType>
	//   16   28:invokevirtual   #131 <Method int PeriodicityType.ordinal()>
	//   17   31:iaload          
		JVM INSTR tableswitch 1 8: default 80
	//	               1 142
	//	               2 135
	//	               3 128
	//	               4 117
	//	               5 80
	//	               6 110
	//	               7 101
	//	               8 90;
	//   18   32:tableswitch     1 8: default 80
	//	               1 142
	//	               2 135
	//	               3 128
	//	               4 117
	//	               5 80
	//	               6 110
	//	               7 101
	//	               8 90
		   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8
_L1:
		throw new IllegalStateException("Unknown periodicity type.");
	//   19   80:new             #133 <Class IllegalStateException>
	//   20   83:dup             
	//   21   84:ldc1            #135 <String "Unknown periodicity type.">
	//   22   86:invokespecial   #136 <Method void IllegalStateException(String)>
	//   23   89:athrow          
_L8:
		int i = diffInMonths(l, l1);
	//   24   90:lload_1         
	//   25   91:lload_3         
	//   26   92:invokestatic    #158 <Method int diffInMonths(long, long)>
	//   27   95:istore          5
_L11:
		return (long)i;
	//   28   97:iload           5
	//   29   99:i2l             
	//   30  100:lreturn         
_L7:
		l = 0x240c8400L;
	//   31  101:ldc2w           #159 <Long 0x240c8400L>
	//   32  104:lstore_1        
_L9:
		return l2 / l;
	//   33  105:lload           6
	//   34  107:lload_1         
	//   35  108:ldiv            
	//   36  109:lreturn         
_L6:
		l = 0x5265c00L;
	//   37  110:ldc2w           #161 <Long 0x5265c00L>
	//   38  113:lstore_1        
		continue; /* Loop/switch isn't completed */
	//   39  114:goto            105
_L5:
		i = (int)l2 / 0x36ee80;
	//   40  117:lload           6
	//   41  119:l2i             
	//   42  120:ldc1            #163 <Int 0x36ee80>
	//   43  122:idiv            
	//   44  123:istore          5
		continue; /* Loop/switch isn't completed */
	//   45  125:goto            97
_L4:
		l = 60000L;
	//   46  128:ldc2w           #164 <Long 60000L>
	//   47  131:lstore_1        
		continue; /* Loop/switch isn't completed */
	//   48  132:goto            105
_L3:
		l = 1000L;
	//   49  135:ldc2w           #166 <Long 1000L>
	//   50  138:lstore_1        
		if(true) goto _L9; else goto _L2
	//   51  139:goto            105
_L2:
		return l2;
	//   52  142:lload           6
	//   53  144:lreturn         
		if(true) goto _L11; else goto _L10
_L10:
	}

	public void printPeriodicity(ContextAwareBase contextawarebase)
	{
		_cls1..SwitchMap.ch.qos.logback.core.rolling.helper.PeriodicityType[periodicityType.ordinal()];
	//    0    0:getstatic       #127 <Field int[] RollingCalendar$1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType>
	//    1    3:aload_0         
	//    2    4:getfield        #37  <Field PeriodicityType periodicityType>
	//    3    7:invokevirtual   #131 <Method int PeriodicityType.ordinal()>
	//    4   10:iaload          
		JVM INSTR tableswitch 1 8: default 56
	//	               1 107
	//	               2 101
	//	               3 95
	//	               4 89
	//	               5 83
	//	               6 77
	//	               7 71
	//	               8 65;
	//    5   11:tableswitch     1 8: default 56
	//	               1 107
	//	               2 101
	//	               3 95
	//	               4 89
	//	               5 83
	//	               6 77
	//	               7 71
	//	               8 65
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
		String s = "Unknown periodicity.";
	//    6   56:ldc1            #171 <String "Unknown periodicity.">
	//    7   58:astore_2        
_L11:
		contextawarebase.addInfo(s);
	//    8   59:aload_1         
	//    9   60:aload_2         
	//   10   61:invokevirtual   #176 <Method void ContextAwareBase.addInfo(String)>
		return;
	//   11   64:return          
_L9:
		s = "Rollover at start of every month.";
	//   12   65:ldc1            #178 <String "Rollover at start of every month.">
	//   13   67:astore_2        
		continue; /* Loop/switch isn't completed */
	//   14   68:goto            59
_L8:
		s = "Rollover at the start of week.";
	//   15   71:ldc1            #180 <String "Rollover at the start of week.">
	//   16   73:astore_2        
		continue; /* Loop/switch isn't completed */
	//   17   74:goto            59
_L7:
		s = "Roll-over at midnight.";
	//   18   77:ldc1            #182 <String "Roll-over at midnight.">
	//   19   79:astore_2        
		continue; /* Loop/switch isn't completed */
	//   20   80:goto            59
_L6:
		s = "Roll-over at midday and midnight.";
	//   21   83:ldc1            #184 <String "Roll-over at midday and midnight.">
	//   22   85:astore_2        
		continue; /* Loop/switch isn't completed */
	//   23   86:goto            59
_L5:
		s = "Roll-over at the top of every hour.";
	//   24   89:ldc1            #186 <String "Roll-over at the top of every hour.">
	//   25   91:astore_2        
		continue; /* Loop/switch isn't completed */
	//   26   92:goto            59
_L4:
		s = "Roll-over every minute.";
	//   27   95:ldc1            #188 <String "Roll-over every minute.">
	//   28   97:astore_2        
		continue; /* Loop/switch isn't completed */
	//   29   98:goto            59
_L3:
		s = "Roll-over every second.";
	//   30  101:ldc1            #190 <String "Roll-over every second.">
	//   31  103:astore_2        
		continue; /* Loop/switch isn't completed */
	//   32  104:goto            59
_L2:
		s = "Roll-over every millisecond.";
	//   33  107:ldc1            #192 <String "Roll-over every millisecond.">
	//   34  109:astore_2        
		if(true) goto _L11; else goto _L10
	//   35  110:goto            59
_L10:
	}

	static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");
	private static final long serialVersionUID = 0xfafa44fL;
	PeriodicityType periodicityType;

	static 
	{
	//    0    0:ldc1            #18  <String "GMT">
	//    1    2:invokestatic    #24  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #26  <Field TimeZone GMT_TIMEZONE>
	//*   3    8:return          
	}
}
