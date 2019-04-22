// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatsEvent, ConnectionEventCreator

public final class ConnectionEvent extends StatsEvent
{

	ConnectionEvent(int i, long l, int j, String s, String s1, String s2, 
			String s3, String s4, String s5, long l1, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void StatsEvent()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #66  <Field int zzal>
		zzxv = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #68  <Field long zzxv>
		zzxw = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #70  <Field int zzxw>
		zzxx = s;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #72  <Field String zzxx>
		zzxy = s1;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #74  <Field String zzxy>
		zzxz = s2;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #76  <Field String zzxz>
		zzya = s3;
	//   20   38:aload_0         
	//   21   39:aload           8
	//   22   41:putfield        #78  <Field String zzya>
		zzyf = -1L;
	//   23   44:aload_0         
	//   24   45:ldc2w           #79  <Long -1L>
	//   25   48:putfield        #82  <Field long zzyf>
		zzyb = s4;
	//   26   51:aload_0         
	//   27   52:aload           9
	//   28   54:putfield        #84  <Field String zzyb>
		zzyc = s5;
	//   29   57:aload_0         
	//   30   58:aload           10
	//   31   60:putfield        #86  <Field String zzyc>
		zzyd = l1;
	//   32   63:aload_0         
	//   33   64:lload           11
	//   34   66:putfield        #88  <Field long zzyd>
		zzye = l2;
	//   35   69:aload_0         
	//   36   70:lload           13
	//   37   72:putfield        #90  <Field long zzye>
	//   38   75:return          
	}

	public ConnectionEvent(long l, int i, String s, String s1, String s2, String s3, 
			String s4, String s5, long l1, long l2)
	{
		this(1, l, i, s, s1, s2, s3, s4, s5, l1, l2);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:lload_1         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:aload           9
	//   10   16:lload           10
	//   11   18:lload           12
	//   12   20:invokespecial   #95  <Method void ConnectionEvent(int, long, int, String, String, String, String, String, String, long, long)>
	//   13   23:return          
	}

	public ConnectionEvent(ConnectionEvent connectionevent)
	{
		this(connectionevent.zzal, ((StatsEvent) (connectionevent)).getTimeMillis(), ((StatsEvent) (connectionevent)).getEventType(), connectionevent.getCallingProcess(), connectionevent.getCallingService(), connectionevent.getTargetProcess(), connectionevent.getTargetService(), connectionevent.getStackTrace(), ((StatsEvent) (connectionevent)).getEventKey(), ((StatsEvent) (connectionevent)).getElapsedRealtime(), connectionevent.getHeapAlloc());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #66  <Field int zzal>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #99  <Method long StatsEvent.getTimeMillis()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #105 <Method String getCallingProcess()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #107 <Method String getCallingService()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #109 <Method String getTargetProcess()>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #111 <Method String getTargetService()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #113 <Method String getStackTrace()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #115 <Method String StatsEvent.getEventKey()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #117 <Method long StatsEvent.getElapsedRealtime()>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #119 <Method long getHeapAlloc()>
	//   23   45:invokespecial   #95  <Method void ConnectionEvent(int, long, int, String, String, String, String, String, String, long, long)>
	//   24   48:return          
	}

	public static boolean checkEventType(StatsEvent statsevent)
	{
		if(2 != statsevent.getEventType() && 3 != statsevent.getEventType() && 4 != statsevent.getEventType() && 1 != statsevent.getEventType() && 6 != statsevent.getEventType() && 13 != statsevent.getEventType() && 14 != statsevent.getEventType())
	//*   0    0:iconst_2        
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//*   3    5:icmpeq          72
	//*   4    8:iconst_3        
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//*   7   13:icmpeq          72
	//*   8   16:iconst_4        
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//*  11   21:icmpeq          72
	//*  12   24:iconst_1        
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//*  15   29:icmpeq          72
	//*  16   32:bipush          6
	//*  17   34:aload_0         
	//*  18   35:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//*  19   38:icmpeq          72
	//*  20   41:bipush          13
	//*  21   43:aload_0         
	//*  22   44:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//*  23   47:icmpeq          72
	//*  24   50:bipush          14
	//*  25   52:aload_0         
	//*  26   53:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//*  27   56:icmpeq          72
			return 15 == statsevent.getEventType();
	//   28   59:bipush          15
	//   29   61:aload_0         
	//   30   62:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//   31   65:icmpne          70
	//   32   68:iconst_1        
	//   33   69:ireturn         
	//   34   70:iconst_0        
	//   35   71:ireturn         
		else
			return true;
	//   36   72:iconst_1        
	//   37   73:ireturn         
	}

	public final StatsEvent ReconstructCloseEvent(StatsEvent statsevent)
	{
		Object obj = ((Object) (statsevent));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(statsevent instanceof ConnectionEvent)
	//*   2    2:aload_1         
	//*   3    3:instanceof      #2   <Class ConnectionEvent>
	//*   4    6:ifeq            48
		{
			statsevent = ((StatsEvent) ((ConnectionEvent)statsevent));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class ConnectionEvent>
	//    7   13:astore_1        
			obj = ((Object) ((ConnectionEvent)((StatsEvent) ((ConnectionEvent)((StatsEvent) (new ConnectionEvent(((ConnectionEvent) (statsevent))))).setEventType(((StatsEvent)this).getEventType()))).setDurationMillis(((StatsEvent)this).getElapsedRealtime() - statsevent.getElapsedRealtime())));
	//    8   14:new             #2   <Class ConnectionEvent>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #125 <Method void ConnectionEvent(ConnectionEvent)>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//   14   26:invokevirtual   #129 <Method StatsEvent StatsEvent.setEventType(int)>
	//   15   29:checkcast       #2   <Class ConnectionEvent>
	//   16   32:aload_0         
	//   17   33:invokevirtual   #117 <Method long StatsEvent.getElapsedRealtime()>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #117 <Method long StatsEvent.getElapsedRealtime()>
	//   20   40:lsub            
	//   21   41:invokevirtual   #133 <Method StatsEvent StatsEvent.setDurationMillis(long)>
	//   22   44:checkcast       #2   <Class ConnectionEvent>
	//   23   47:astore_2        
		}
		return ((StatsEvent) (obj));
	//   24   48:aload_2         
	//   25   49:areturn         
	}

	public final String getCallingProcess()
	{
		return zzxx;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String zzxx>
	//    2    4:areturn         
	}

	public final String getCallingService()
	{
		return zzxy;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String zzxy>
	//    2    4:areturn         
	}

	public final long getDurationMillis()
	{
		return zzyf;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field long zzyf>
	//    2    4:lreturn         
	}

	public final long getElapsedRealtime()
	{
		return zzyd;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field long zzyd>
	//    2    4:lreturn         
	}

	public final String getEventKey()
	{
		return zzyc;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String zzyc>
	//    2    4:areturn         
	}

	public final int getEventType()
	{
		return zzxw;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int zzxw>
	//    2    4:ireturn         
	}

	public final long getHeapAlloc()
	{
		return zzye;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field long zzye>
	//    2    4:lreturn         
	}

	public final String getSpecificString()
	{
		String s1 = getCallingProcess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method String getCallingProcess()>
	//    2    4:astore          5
		String s2 = getCallingService();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #107 <Method String getCallingService()>
	//    5   10:astore          6
		String s3 = getTargetProcess();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #109 <Method String getTargetProcess()>
	//    8   16:astore          7
		String s4 = getTargetService();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #111 <Method String getTargetService()>
	//   11   22:astore          8
		Object obj = ((Object) (zzyb));
	//   12   24:aload_0         
	//   13   25:getfield        #84  <Field String zzyb>
	//   14   28:astore          4
		String s = ((String) (obj));
	//   15   30:aload           4
	//   16   32:astore_3        
		if(obj == null)
	//*  17   33:aload           4
	//*  18   35:ifnonnull       41
			s = "";
	//   19   38:ldc1            #137 <String "">
	//   20   40:astore_3        
		long l = getHeapAlloc();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #119 <Method long getHeapAlloc()>
	//   23   45:lstore_1        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 26 + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length() + String.valueOf(((Object) (s4))).length() + String.valueOf(((Object) (s))).length())));
	//   24   46:new             #139 <Class StringBuilder>
	//   25   49:dup             
	//   26   50:aload           5
	//   27   52:invokestatic    #145 <Method String String.valueOf(Object)>
	//   28   55:invokevirtual   #148 <Method int String.length()>
	//   29   58:bipush          26
	//   30   60:iadd            
	//   31   61:aload           6
	//   32   63:invokestatic    #145 <Method String String.valueOf(Object)>
	//   33   66:invokevirtual   #148 <Method int String.length()>
	//   34   69:iadd            
	//   35   70:aload           7
	//   36   72:invokestatic    #145 <Method String String.valueOf(Object)>
	//   37   75:invokevirtual   #148 <Method int String.length()>
	//   38   78:iadd            
	//   39   79:aload           8
	//   40   81:invokestatic    #145 <Method String String.valueOf(Object)>
	//   41   84:invokevirtual   #148 <Method int String.length()>
	//   42   87:iadd            
	//   43   88:aload_3         
	//   44   89:invokestatic    #145 <Method String String.valueOf(Object)>
	//   45   92:invokevirtual   #148 <Method int String.length()>
	//   46   95:iadd            
	//   47   96:invokespecial   #151 <Method void StringBuilder(int)>
	//   48   99:astore          4
		((StringBuilder) (obj)).append("\t");
	//   49  101:aload           4
	//   50  103:ldc1            #153 <String "\t">
	//   51  105:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
		((StringBuilder) (obj)).append(s1);
	//   53  109:aload           4
	//   54  111:aload           5
	//   55  113:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   56  116:pop             
		((StringBuilder) (obj)).append("/");
	//   57  117:aload           4
	//   58  119:ldc1            #159 <String "/">
	//   59  121:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   60  124:pop             
		((StringBuilder) (obj)).append(s2);
	//   61  125:aload           4
	//   62  127:aload           6
	//   63  129:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   64  132:pop             
		((StringBuilder) (obj)).append("\t");
	//   65  133:aload           4
	//   66  135:ldc1            #153 <String "\t">
	//   67  137:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   68  140:pop             
		((StringBuilder) (obj)).append(s3);
	//   69  141:aload           4
	//   70  143:aload           7
	//   71  145:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   72  148:pop             
		((StringBuilder) (obj)).append("/");
	//   73  149:aload           4
	//   74  151:ldc1            #159 <String "/">
	//   75  153:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   76  156:pop             
		((StringBuilder) (obj)).append(s4);
	//   77  157:aload           4
	//   78  159:aload           8
	//   79  161:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
		((StringBuilder) (obj)).append("\t");
	//   81  165:aload           4
	//   82  167:ldc1            #153 <String "\t">
	//   83  169:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   84  172:pop             
		((StringBuilder) (obj)).append(s);
	//   85  173:aload           4
	//   86  175:aload_3         
	//   87  176:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   88  179:pop             
		((StringBuilder) (obj)).append("\t");
	//   89  180:aload           4
	//   90  182:ldc1            #153 <String "\t">
	//   91  184:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   92  187:pop             
		((StringBuilder) (obj)).append(l);
	//   93  188:aload           4
	//   94  190:lload_1         
	//   95  191:invokevirtual   #162 <Method StringBuilder StringBuilder.append(long)>
	//   96  194:pop             
		return ((StringBuilder) (obj)).toString();
	//   97  195:aload           4
	//   98  197:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   99  200:areturn         
	}

	public final String getStackTrace()
	{
		return zzyb;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzyb>
	//    2    4:areturn         
	}

	public final String getTargetProcess()
	{
		return zzxz;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String zzxz>
	//    2    4:areturn         
	}

	public final String getTargetService()
	{
		return zzya;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String zzya>
	//    2    4:areturn         
	}

	public final long getTimeMillis()
	{
		return zzxv;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long zzxv>
	//    2    4:lreturn         
	}

	public final long getTimeout()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public final ConnectionEvent markTimeOut()
	{
		zzxw = 6;
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:putfield        #70  <Field int zzxw>
		return this;
	//    3    6:aload_0         
	//    4    7:areturn         
	}

	public final volatile StatsEvent markTimeOut()
	{
		return ((StatsEvent) (markTimeOut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method ConnectionEvent markTimeOut()>
	//    2    4:areturn         
	}

	public final ConnectionEvent setDurationMillis(long l)
	{
		zzyf = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #82  <Field long zzyf>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final volatile StatsEvent setDurationMillis(long l)
	{
		return ((StatsEvent) (setDurationMillis(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #176 <Method ConnectionEvent setDurationMillis(long)>
	//    3    5:areturn         
	}

	public final ConnectionEvent setEventType(int i)
	{
		zzxw = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int zzxw>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final volatile StatsEvent setEventType(int i)
	{
		return ((StatsEvent) (setEventType(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #179 <Method ConnectionEvent setEventType(int)>
	//    3    5:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #187 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #66  <Field int zzal>
	//    7   11:invokestatic    #191 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 2, ((StatsEvent)this).getTimeMillis());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #99  <Method long StatsEvent.getTimeMillis()>
	//   12   20:invokestatic    #195 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 4, getCallingProcess(), false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #105 <Method String getCallingProcess()>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #199 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getCallingService(), false);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #107 <Method String getCallingService()>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #199 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getTargetProcess(), false);
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:invokevirtual   #109 <Method String getTargetProcess()>
	//   29   50:iconst_0        
	//   30   51:invokestatic    #199 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getTargetService(), false);
	//   31   54:aload_1         
	//   32   55:bipush          7
	//   33   57:aload_0         
	//   34   58:invokevirtual   #111 <Method String getTargetService()>
	//   35   61:iconst_0        
	//   36   62:invokestatic    #199 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 8, getStackTrace(), false);
	//   37   65:aload_1         
	//   38   66:bipush          8
	//   39   68:aload_0         
	//   40   69:invokevirtual   #113 <Method String getStackTrace()>
	//   41   72:iconst_0        
	//   42   73:invokestatic    #199 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 10, ((StatsEvent)this).getElapsedRealtime());
	//   43   76:aload_1         
	//   44   77:bipush          10
	//   45   79:aload_0         
	//   46   80:invokevirtual   #117 <Method long StatsEvent.getElapsedRealtime()>
	//   47   83:invokestatic    #195 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeLong(parcel, 11, getHeapAlloc());
	//   48   86:aload_1         
	//   49   87:bipush          11
	//   50   89:aload_0         
	//   51   90:invokevirtual   #119 <Method long getHeapAlloc()>
	//   52   93:invokestatic    #195 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeInt(parcel, 12, ((StatsEvent)this).getEventType());
	//   53   96:aload_1         
	//   54   97:bipush          12
	//   55   99:aload_0         
	//   56  100:invokevirtual   #102 <Method int StatsEvent.getEventType()>
	//   57  103:invokestatic    #191 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 13, ((StatsEvent)this).getEventKey(), false);
	//   58  106:aload_1         
	//   59  107:bipush          13
	//   60  109:aload_0         
	//   61  110:invokevirtual   #115 <Method String StatsEvent.getEventKey()>
	//   62  113:iconst_0        
	//   63  114:invokestatic    #199 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   64  117:aload_1         
	//   65  118:iload_2         
	//   66  119:invokestatic    #202 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   67  122:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ConnectionEventCreator();
	private final int zzal;
	private final long zzxv;
	private int zzxw;
	private final String zzxx;
	private final String zzxy;
	private final String zzxz;
	private final String zzya;
	private final String zzyb;
	private final String zzyc;
	private final long zzyd;
	private final long zzye;
	private long zzyf;

	static 
	{
	//    0    0:new             #54  <Class ConnectionEventCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void ConnectionEventCreator()>
	//    3    7:putstatic       #59  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
