// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatsEvent, WakeLockEventCreator

public final class WakeLockEvent extends StatsEvent
{

	WakeLockEvent(int i, long l, int j, String s, int k, List list, 
			String s1, long l1, int i1, String s2, String s3, float f, 
			long l2, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void StatsEvent()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #78  <Field int zzal>
		zzxv = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #80  <Field long zzxv>
		zzxw = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #82  <Field int zzxw>
		zzyq = s;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #84  <Field String zzyq>
		zzyr = s2;
	//   14   26:aload_0         
	//   15   27:aload           12
	//   16   29:putfield        #86  <Field String zzyr>
		zzys = s4;
	//   17   32:aload_0         
	//   18   33:aload           17
	//   19   35:putfield        #88  <Field String zzys>
		zzyt = k;
	//   20   38:aload_0         
	//   21   39:iload           6
	//   22   41:putfield        #90  <Field int zzyt>
		zzyf = -1L;
	//   23   44:aload_0         
	//   24   45:ldc2w           #91  <Long -1L>
	//   25   48:putfield        #94  <Field long zzyf>
		zzyu = list;
	//   26   51:aload_0         
	//   27   52:aload           7
	//   28   54:putfield        #96  <Field List zzyu>
		zzyv = s1;
	//   29   57:aload_0         
	//   30   58:aload           8
	//   31   60:putfield        #98  <Field String zzyv>
		zzyd = l1;
	//   32   63:aload_0         
	//   33   64:lload           9
	//   34   66:putfield        #100 <Field long zzyd>
		zzyw = i1;
	//   35   69:aload_0         
	//   36   70:iload           11
	//   37   72:putfield        #102 <Field int zzyw>
		zzyx = s3;
	//   38   75:aload_0         
	//   39   76:aload           13
	//   40   78:putfield        #104 <Field String zzyx>
		zzyy = f;
	//   41   81:aload_0         
	//   42   82:fload           14
	//   43   84:putfield        #106 <Field float zzyy>
		mTimeout = l2;
	//   44   87:aload_0         
	//   45   88:lload           15
	//   46   90:putfield        #108 <Field long mTimeout>
	//   47   93:return          
	}

	public WakeLockEvent(long l, int i, String s, int j, List list, String s1, 
			long l1, int k, String s2, String s3, float f, long l2, String s4)
	{
		this(2, l, i, s, j, list, s1, l1, k, s2, s3, f, l2, s4);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:lload_1         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:lload           8
	//    9   14:iload           10
	//   10   16:aload           11
	//   11   18:aload           12
	//   12   20:fload           13
	//   13   22:lload           14
	//   14   24:aload           16
	//   15   26:invokespecial   #115 <Method void WakeLockEvent(int, long, int, String, int, List, String, long, int, String, String, float, long, String)>
	//   16   29:return          
	}

	public WakeLockEvent(WakeLockEvent wakelockevent)
	{
		this(wakelockevent.zzal, ((StatsEvent) (wakelockevent)).getTimeMillis(), ((StatsEvent) (wakelockevent)).getEventType(), wakelockevent.getWakeLockName(), wakelockevent.getWakeLockType(), wakelockevent.getCallingPackages(), ((StatsEvent) (wakelockevent)).getEventKey(), ((StatsEvent) (wakelockevent)).getElapsedRealtime(), wakelockevent.getDeviceState(), wakelockevent.getSecondaryWakeLockName(), wakelockevent.getHostPackage(), wakelockevent.getBeginPowerPercentage(), ((StatsEvent) (wakelockevent)).getTimeout(), wakelockevent.getCodePackage());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #78  <Field int zzal>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #120 <Method long StatsEvent.getTimeMillis()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method String getWakeLockName()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #128 <Method int getWakeLockType()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #131 <Method List getCallingPackages()>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #133 <Method String StatsEvent.getEventKey()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #135 <Method long StatsEvent.getElapsedRealtime()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #137 <Method int getDeviceState()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #139 <Method String getSecondaryWakeLockName()>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #141 <Method String getHostPackage()>
	//   23   45:aload_1         
	//   24   46:invokevirtual   #144 <Method float getBeginPowerPercentage()>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #146 <Method long StatsEvent.getTimeout()>
	//   27   53:aload_1         
	//   28   54:invokevirtual   #148 <Method String getCodePackage()>
	//   29   57:invokespecial   #115 <Method void WakeLockEvent(int, long, int, String, int, List, String, long, int, String, String, float, long, String)>
	//   30   60:return          
	}

	public static boolean checkEventType(StatsEvent statsevent)
	{
		return 7 == statsevent.getEventType() || 8 == statsevent.getEventType() || 9 == statsevent.getEventType() || 10 == statsevent.getEventType() || 11 == statsevent.getEventType() || 12 == statsevent.getEventType();
	//    0    0:bipush          7
	//    1    2:aload_0         
	//    2    3:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//    3    6:icmpeq          59
	//    4    9:bipush          8
	//    5   11:aload_0         
	//    6   12:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//    7   15:icmpeq          59
	//    8   18:bipush          9
	//    9   20:aload_0         
	//   10   21:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//   11   24:icmpeq          59
	//   12   27:bipush          10
	//   13   29:aload_0         
	//   14   30:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//   15   33:icmpeq          59
	//   16   36:bipush          11
	//   17   38:aload_0         
	//   18   39:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//   19   42:icmpeq          59
	//   20   45:bipush          12
	//   21   47:aload_0         
	//   22   48:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//   23   51:icmpne          57
	//   24   54:goto            59
	//   25   57:iconst_0        
	//   26   58:ireturn         
	//   27   59:iconst_1        
	//   28   60:ireturn         
	}

	public final StatsEvent ReconstructCloseEvent(StatsEvent statsevent)
	{
		StatsEvent statsevent1 = statsevent;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(statsevent instanceof WakeLockEvent)
	//*   2    2:aload_1         
	//*   3    3:instanceof      #2   <Class WakeLockEvent>
	//*   4    6:ifeq            42
		{
			statsevent = ((StatsEvent) ((WakeLockEvent)statsevent));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class WakeLockEvent>
	//    7   13:astore_1        
			statsevent1 = ((StatsEvent) (new WakeLockEvent(((WakeLockEvent) (statsevent))))).setEventType(((StatsEvent)this).getEventType()).setDurationMillis(((StatsEvent)this).getElapsedRealtime() - statsevent.getElapsedRealtime());
	//    8   14:new             #2   <Class WakeLockEvent>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #154 <Method void WakeLockEvent(WakeLockEvent)>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//   14   26:invokevirtual   #158 <Method StatsEvent StatsEvent.setEventType(int)>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #135 <Method long StatsEvent.getElapsedRealtime()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #135 <Method long StatsEvent.getElapsedRealtime()>
	//   19   37:lsub            
	//   20   38:invokevirtual   #162 <Method StatsEvent StatsEvent.setDurationMillis(long)>
	//   21   41:astore_2        
		}
		return statsevent1;
	//   22   42:aload_2         
	//   23   43:areturn         
	}

	public final float getBeginPowerPercentage()
	{
		return zzyy;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field float zzyy>
	//    2    4:freturn         
	}

	public final List getCallingPackages()
	{
		return zzyu;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field List zzyu>
	//    2    4:areturn         
	}

	public final String getCodePackage()
	{
		return zzys;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String zzys>
	//    2    4:areturn         
	}

	public final int getDeviceState()
	{
		return zzyw;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int zzyw>
	//    2    4:ireturn         
	}

	public final long getDurationMillis()
	{
		return zzyf;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field long zzyf>
	//    2    4:lreturn         
	}

	public final long getElapsedRealtime()
	{
		return zzyd;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field long zzyd>
	//    2    4:lreturn         
	}

	public final String getEventKey()
	{
		return zzyv;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String zzyv>
	//    2    4:areturn         
	}

	public final int getEventType()
	{
		return zzxw;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int zzxw>
	//    2    4:ireturn         
	}

	public final String getHostPackage()
	{
		return zzyx;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String zzyx>
	//    2    4:areturn         
	}

	public final String getSecondaryWakeLockName()
	{
		return zzyr;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String zzyr>
	//    2    4:areturn         
	}

	public final String getSpecificString()
	{
		String s4 = getWakeLockName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method String getWakeLockName()>
	//    2    4:astore          8
		int i = getWakeLockType();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #128 <Method int getWakeLockType()>
	//    5   10:istore_2        
		String s;
		if(getCallingPackages() == null)
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #131 <Method List getCallingPackages()>
	//*   8   15:ifnonnull       25
			s = "";
	//    9   18:ldc1            #169 <String "">
	//   10   20:astore          4
		else
	//*  11   22:goto            36
			s = TextUtils.join(",", ((Iterable) (getCallingPackages())));
	//   12   25:ldc1            #171 <String ",">
	//   13   27:aload_0         
	//   14   28:invokevirtual   #131 <Method List getCallingPackages()>
	//   15   31:invokestatic    #177 <Method String TextUtils.join(CharSequence, Iterable)>
	//   16   34:astore          4
		int j = getDeviceState();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #137 <Method int getDeviceState()>
	//   19   40:istore_3        
		String s1;
		if(getSecondaryWakeLockName() == null)
	//*  20   41:aload_0         
	//*  21   42:invokevirtual   #139 <Method String getSecondaryWakeLockName()>
	//*  22   45:ifnonnull       55
			s1 = "";
	//   23   48:ldc1            #169 <String "">
	//   24   50:astore          5
		else
	//*  25   52:goto            61
			s1 = getSecondaryWakeLockName();
	//   26   55:aload_0         
	//   27   56:invokevirtual   #139 <Method String getSecondaryWakeLockName()>
	//   28   59:astore          5
		String s2;
		if(getHostPackage() == null)
	//*  29   61:aload_0         
	//*  30   62:invokevirtual   #141 <Method String getHostPackage()>
	//*  31   65:ifnonnull       75
			s2 = "";
	//   32   68:ldc1            #169 <String "">
	//   33   70:astore          6
		else
	//*  34   72:goto            81
			s2 = getHostPackage();
	//   35   75:aload_0         
	//   36   76:invokevirtual   #141 <Method String getHostPackage()>
	//   37   79:astore          6
		float f = getBeginPowerPercentage();
	//   38   81:aload_0         
	//   39   82:invokevirtual   #144 <Method float getBeginPowerPercentage()>
	//   40   85:fstore_1        
		String s3;
		if(getCodePackage() == null)
	//*  41   86:aload_0         
	//*  42   87:invokevirtual   #148 <Method String getCodePackage()>
	//*  43   90:ifnonnull       100
			s3 = "";
	//   44   93:ldc1            #169 <String "">
	//   45   95:astore          7
		else
	//*  46   97:goto            106
			s3 = getCodePackage();
	//   47  100:aload_0         
	//   48  101:invokevirtual   #148 <Method String getCodePackage()>
	//   49  104:astore          7
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s4))).length() + 45 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length());
	//   50  106:new             #179 <Class StringBuilder>
	//   51  109:dup             
	//   52  110:aload           8
	//   53  112:invokestatic    #185 <Method String String.valueOf(Object)>
	//   54  115:invokevirtual   #188 <Method int String.length()>
	//   55  118:bipush          45
	//   56  120:iadd            
	//   57  121:aload           4
	//   58  123:invokestatic    #185 <Method String String.valueOf(Object)>
	//   59  126:invokevirtual   #188 <Method int String.length()>
	//   60  129:iadd            
	//   61  130:aload           5
	//   62  132:invokestatic    #185 <Method String String.valueOf(Object)>
	//   63  135:invokevirtual   #188 <Method int String.length()>
	//   64  138:iadd            
	//   65  139:aload           6
	//   66  141:invokestatic    #185 <Method String String.valueOf(Object)>
	//   67  144:invokevirtual   #188 <Method int String.length()>
	//   68  147:iadd            
	//   69  148:aload           7
	//   70  150:invokestatic    #185 <Method String String.valueOf(Object)>
	//   71  153:invokevirtual   #188 <Method int String.length()>
	//   72  156:iadd            
	//   73  157:invokespecial   #191 <Method void StringBuilder(int)>
	//   74  160:astore          9
		stringbuilder.append("\t");
	//   75  162:aload           9
	//   76  164:ldc1            #193 <String "\t">
	//   77  166:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   78  169:pop             
		stringbuilder.append(s4);
	//   79  170:aload           9
	//   80  172:aload           8
	//   81  174:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   82  177:pop             
		stringbuilder.append("\t");
	//   83  178:aload           9
	//   84  180:ldc1            #193 <String "\t">
	//   85  182:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   86  185:pop             
		stringbuilder.append(i);
	//   87  186:aload           9
	//   88  188:iload_2         
	//   89  189:invokevirtual   #200 <Method StringBuilder StringBuilder.append(int)>
	//   90  192:pop             
		stringbuilder.append("\t");
	//   91  193:aload           9
	//   92  195:ldc1            #193 <String "\t">
	//   93  197:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   94  200:pop             
		stringbuilder.append(s);
	//   95  201:aload           9
	//   96  203:aload           4
	//   97  205:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   98  208:pop             
		stringbuilder.append("\t");
	//   99  209:aload           9
	//  100  211:ldc1            #193 <String "\t">
	//  101  213:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  102  216:pop             
		stringbuilder.append(j);
	//  103  217:aload           9
	//  104  219:iload_3         
	//  105  220:invokevirtual   #200 <Method StringBuilder StringBuilder.append(int)>
	//  106  223:pop             
		stringbuilder.append("\t");
	//  107  224:aload           9
	//  108  226:ldc1            #193 <String "\t">
	//  109  228:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  110  231:pop             
		stringbuilder.append(s1);
	//  111  232:aload           9
	//  112  234:aload           5
	//  113  236:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  114  239:pop             
		stringbuilder.append("\t");
	//  115  240:aload           9
	//  116  242:ldc1            #193 <String "\t">
	//  117  244:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  118  247:pop             
		stringbuilder.append(s2);
	//  119  248:aload           9
	//  120  250:aload           6
	//  121  252:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  122  255:pop             
		stringbuilder.append("\t");
	//  123  256:aload           9
	//  124  258:ldc1            #193 <String "\t">
	//  125  260:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  126  263:pop             
		stringbuilder.append(f);
	//  127  264:aload           9
	//  128  266:fload_1         
	//  129  267:invokevirtual   #203 <Method StringBuilder StringBuilder.append(float)>
	//  130  270:pop             
		stringbuilder.append("\t");
	//  131  271:aload           9
	//  132  273:ldc1            #193 <String "\t">
	//  133  275:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  134  278:pop             
		stringbuilder.append(s3);
	//  135  279:aload           9
	//  136  281:aload           7
	//  137  283:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//  138  286:pop             
		return stringbuilder.toString();
	//  139  287:aload           9
	//  140  289:invokevirtual   #206 <Method String StringBuilder.toString()>
	//  141  292:areturn         
	}

	public final long getTimeMillis()
	{
		return zzxv;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field long zzxv>
	//    2    4:lreturn         
	}

	public final long getTimeout()
	{
		return mTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field long mTimeout>
	//    2    4:lreturn         
	}

	public final String getWakeLockName()
	{
		return zzyq;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzyq>
	//    2    4:areturn         
	}

	public final int getWakeLockType()
	{
		return zzyt;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int zzyt>
	//    2    4:ireturn         
	}

	public final volatile StatsEvent markTimeOut()
	{
		return ((StatsEvent) (markTimeOut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #211 <Method WakeLockEvent markTimeOut()>
	//    2    4:areturn         
	}

	public final WakeLockEvent markTimeOut()
	{
		long l = mTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field long mTimeout>
	//    2    4:lstore_2        
		if(l != 0L)
	//*   3    5:lload_2         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifeq            16
			zzyf = l;
	//    7   11:aload_0         
	//    8   12:lload_2         
	//    9   13:putfield        #94  <Field long zzyf>
		int i = zzxw;
	//   10   16:aload_0         
	//   11   17:getfield        #82  <Field int zzxw>
	//   12   20:istore_1        
		if(7 == i)
	//*  13   21:bipush          7
	//*  14   23:iload_1         
	//*  15   24:icmpne          37
			i = 9;
	//   16   27:bipush          9
	//   17   29:istore_1        
		else
	//*  18   30:aload_0         
	//*  19   31:iload_1         
	//*  20   32:putfield        #82  <Field int zzxw>
	//*  21   35:aload_0         
	//*  22   36:areturn         
		if(10 == i)
	//*  23   37:bipush          10
	//*  24   39:iload_1         
	//*  25   40:icmpne          49
			i = 12;
	//   26   43:bipush          12
	//   27   45:istore_1        
		else
	//*  28   46:goto            30
			return this;
	//   29   49:aload_0         
	//   30   50:areturn         
		zzxw = i;
		return this;
	}

	public final StatsEvent setDurationMillis(long l)
	{
		zzyf = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #94  <Field long zzyf>
		return ((StatsEvent) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final StatsEvent setEventType(int i)
	{
		zzxw = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field int zzxw>
		return ((StatsEvent) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #219 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #78  <Field int zzal>
	//    7   11:invokestatic    #223 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 2, ((StatsEvent)this).getTimeMillis());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #120 <Method long StatsEvent.getTimeMillis()>
	//   12   20:invokestatic    #227 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 4, getWakeLockName(), false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #126 <Method String getWakeLockName()>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #231 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 5, getWakeLockType());
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #128 <Method int getWakeLockType()>
	//   23   39:invokestatic    #223 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeStringList(parcel, 6, getCallingPackages(), false);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:invokevirtual   #131 <Method List getCallingPackages()>
	//   28   49:iconst_0        
	//   29   50:invokestatic    #235 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeLong(parcel, 8, ((StatsEvent)this).getElapsedRealtime());
	//   30   53:aload_1         
	//   31   54:bipush          8
	//   32   56:aload_0         
	//   33   57:invokevirtual   #135 <Method long StatsEvent.getElapsedRealtime()>
	//   34   60:invokestatic    #227 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 10, getSecondaryWakeLockName(), false);
	//   35   63:aload_1         
	//   36   64:bipush          10
	//   37   66:aload_0         
	//   38   67:invokevirtual   #139 <Method String getSecondaryWakeLockName()>
	//   39   70:iconst_0        
	//   40   71:invokestatic    #231 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 11, ((StatsEvent)this).getEventType());
	//   41   74:aload_1         
	//   42   75:bipush          11
	//   43   77:aload_0         
	//   44   78:invokevirtual   #123 <Method int StatsEvent.getEventType()>
	//   45   81:invokestatic    #223 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 12, ((StatsEvent)this).getEventKey(), false);
	//   46   84:aload_1         
	//   47   85:bipush          12
	//   48   87:aload_0         
	//   49   88:invokevirtual   #133 <Method String StatsEvent.getEventKey()>
	//   50   91:iconst_0        
	//   51   92:invokestatic    #231 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 13, getHostPackage(), false);
	//   52   95:aload_1         
	//   53   96:bipush          13
	//   54   98:aload_0         
	//   55   99:invokevirtual   #141 <Method String getHostPackage()>
	//   56  102:iconst_0        
	//   57  103:invokestatic    #231 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 14, getDeviceState());
	//   58  106:aload_1         
	//   59  107:bipush          14
	//   60  109:aload_0         
	//   61  110:invokevirtual   #137 <Method int getDeviceState()>
	//   62  113:invokestatic    #223 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloat(parcel, 15, getBeginPowerPercentage());
	//   63  116:aload_1         
	//   64  117:bipush          15
	//   65  119:aload_0         
	//   66  120:invokevirtual   #144 <Method float getBeginPowerPercentage()>
	//   67  123:invokestatic    #239 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeLong(parcel, 16, ((StatsEvent)this).getTimeout());
	//   68  126:aload_1         
	//   69  127:bipush          16
	//   70  129:aload_0         
	//   71  130:invokevirtual   #146 <Method long StatsEvent.getTimeout()>
	//   72  133:invokestatic    #227 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 17, getCodePackage(), false);
	//   73  136:aload_1         
	//   74  137:bipush          17
	//   75  139:aload_0         
	//   76  140:invokevirtual   #148 <Method String getCodePackage()>
	//   77  143:iconst_0        
	//   78  144:invokestatic    #231 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   79  147:aload_1         
	//   80  148:iload_2         
	//   81  149:invokestatic    #242 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   82  152:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new WakeLockEventCreator();
	private final long mTimeout;
	private final int zzal;
	private final long zzxv;
	private int zzxw;
	private final long zzyd;
	private long zzyf;
	private final String zzyq;
	private final String zzyr;
	private final String zzys;
	private final int zzyt;
	private final List zzyu;
	private final String zzyv;
	private int zzyw;
	private final String zzyx;
	private final float zzyy;

	static 
	{
	//    0    0:new             #66  <Class WakeLockEventCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void WakeLockEventCreator()>
	//    3    7:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
