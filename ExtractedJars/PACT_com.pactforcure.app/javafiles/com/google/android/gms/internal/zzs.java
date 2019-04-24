// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.*;

public class zzs
{
	static class zza
	{

		private long getTotalDuration()
		{
			if(zzaj.size() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field List zzaj>
		//*   2    4:invokeinterface #41  <Method int List.size()>
		//*   3    9:ifne            14
			{
				return 0L;
		//    4   12:lconst_0        
		//    5   13:lreturn         
			} else
			{
				long l = ((zza)zzaj.get(0)).time;
		//    6   14:aload_0         
		//    7   15:getfield        #31  <Field List zzaj>
		//    8   18:iconst_0        
		//    9   19:invokeinterface #45  <Method Object List.get(int)>
		//   10   24:checkcast       #9   <Class zzs$zza$zza>
		//   11   27:getfield        #49  <Field long zzs$zza$zza.time>
		//   12   30:lstore_1        
				return ((zza)zzaj.get(zzaj.size() - 1)).time - l;
		//   13   31:aload_0         
		//   14   32:getfield        #31  <Field List zzaj>
		//   15   35:aload_0         
		//   16   36:getfield        #31  <Field List zzaj>
		//   17   39:invokeinterface #41  <Method int List.size()>
		//   18   44:iconst_1        
		//   19   45:isub            
		//   20   46:invokeinterface #45  <Method Object List.get(int)>
		//   21   51:checkcast       #9   <Class zzs$zza$zza>
		//   22   54:getfield        #49  <Field long zzs$zza$zza.time>
		//   23   57:lload_1         
		//   24   58:lsub            
		//   25   59:lreturn         
			}
		}

		protected void finalize()
			throws Throwable
		{
			if(!zzak)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field boolean zzak>
		//*   2    4:ifne            22
			{
				zzd("Request on the loose");
		//    3    7:aload_0         
		//    4    8:ldc1            #54  <String "Request on the loose">
		//    5   10:invokevirtual   #58  <Method void zzd(String)>
				zzs.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
		//    6   13:ldc1            #60  <String "Marker log finalized without finish() - uncaught exit point for request">
		//    7   15:iconst_0        
		//    8   16:anewarray       Object[]
		//    9   19:invokestatic    #64  <Method void zzs.zzc(String, Object[])>
			}
		//   10   22:return          
		}

		public void zza(String s, long l)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(zzak)
		//*   2    2:aload_0         
		//*   3    3:getfield        #33  <Field boolean zzak>
		//*   4    6:ifeq            24
				throw new IllegalStateException("Marker added to finished log");
		//    5    9:new             #68  <Class IllegalStateException>
		//    6   12:dup             
		//    7   13:ldc1            #70  <String "Marker added to finished log">
		//    8   15:invokespecial   #72  <Method void IllegalStateException(String)>
		//    9   18:athrow          
			break MISSING_BLOCK_LABEL_24;
			s;
		//   10   19:astore_1        
			this;
		//   11   20:aload_0         
			JVM INSTR monitorexit ;
		//   12   21:monitorexit     
			throw s;
		//   13   22:aload_1         
		//   14   23:athrow          
			zzaj.add(((Object) (new zza(s, l, SystemClock.elapsedRealtime()))));
		//   15   24:aload_0         
		//   16   25:getfield        #31  <Field List zzaj>
		//   17   28:new             #9   <Class zzs$zza$zza>
		//   18   31:dup             
		//   19   32:aload_1         
		//   20   33:lload_2         
		//   21   34:invokestatic    #77  <Method long SystemClock.elapsedRealtime()>
		//   22   37:invokespecial   #80  <Method void zzs$zza$zza(String, long, long)>
		//   23   40:invokeinterface #84  <Method boolean List.add(Object)>
		//   24   45:pop             
			this;
		//   25   46:aload_0         
			JVM INSTR monitorexit ;
		//   26   47:monitorexit     
		//   27   48:return          
		}

		public void zzd(String s)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			long l1;
			zzak = true;
		//    2    2:aload_0         
		//    3    3:iconst_1        
		//    4    4:putfield        #33  <Field boolean zzak>
			l1 = getTotalDuration();
		//    5    7:aload_0         
		//    6    8:invokespecial   #86  <Method long getTotalDuration()>
		//    7   11:lstore          4
			if(l1 > 0L) goto _L2; else goto _L1
		//    8   13:lload           4
		//    9   15:lconst_0        
		//   10   16:lcmp            
		//   11   17:ifgt            23
_L1:
			this;
		//   12   20:aload_0         
			JVM INSTR monitorexit ;
		//   13   21:monitorexit     
			return;
		//   14   22:return          
_L2:
			long l;
			l = ((zza)zzaj.get(0)).time;
		//   15   23:aload_0         
		//   16   24:getfield        #31  <Field List zzaj>
		//   17   27:iconst_0        
		//   18   28:invokeinterface #45  <Method Object List.get(int)>
		//   19   33:checkcast       #9   <Class zzs$zza$zza>
		//   20   36:getfield        #49  <Field long zzs$zza$zza.time>
		//   21   39:lstore_2        
			zzs.zzb("(%-4d ms) %s", new Object[] {
				Long.valueOf(l1), s
			});
		//   22   40:ldc1            #88  <String "(%-4d ms) %s">
		//   23   42:iconst_2        
		//   24   43:anewarray       Object[]
		//   25   46:dup             
		//   26   47:iconst_0        
		//   27   48:lload           4
		//   28   50:invokestatic    #94  <Method Long Long.valueOf(long)>
		//   29   53:aastore         
		//   30   54:dup             
		//   31   55:iconst_1        
		//   32   56:aload_1         
		//   33   57:aastore         
		//   34   58:invokestatic    #97  <Method void zzs.zzb(String, Object[])>
			s = ((String) (zzaj.iterator()));
		//   35   61:aload_0         
		//   36   62:getfield        #31  <Field List zzaj>
		//   37   65:invokeinterface #101 <Method Iterator List.iterator()>
		//   38   70:astore_1        
_L4:
			if(!((Iterator) (s)).hasNext())
				break; /* Loop/switch isn't completed */
		//   39   71:aload_1         
		//   40   72:invokeinterface #107 <Method boolean Iterator.hasNext()>
		//   41   77:ifeq            20
			zza zza1 = (zza)((Iterator) (s)).next();
		//   42   80:aload_1         
		//   43   81:invokeinterface #111 <Method Object Iterator.next()>
		//   44   86:checkcast       #9   <Class zzs$zza$zza>
		//   45   89:astore          6
			l1 = zza1.time;
		//   46   91:aload           6
		//   47   93:getfield        #49  <Field long zzs$zza$zza.time>
		//   48   96:lstore          4
			zzs.zzb("(+%-4d) [%2d] %s", new Object[] {
				Long.valueOf(l1 - l), Long.valueOf(zza1.zzal), zza1.name
			});
		//   49   98:ldc1            #113 <String "(+%-4d) [%2d] %s">
		//   50  100:iconst_3        
		//   51  101:anewarray       Object[]
		//   52  104:dup             
		//   53  105:iconst_0        
		//   54  106:lload           4
		//   55  108:lload_2         
		//   56  109:lsub            
		//   57  110:invokestatic    #94  <Method Long Long.valueOf(long)>
		//   58  113:aastore         
		//   59  114:dup             
		//   60  115:iconst_1        
		//   61  116:aload           6
		//   62  118:getfield        #116 <Field long zzs$zza$zza.zzal>
		//   63  121:invokestatic    #94  <Method Long Long.valueOf(long)>
		//   64  124:aastore         
		//   65  125:dup             
		//   66  126:iconst_2        
		//   67  127:aload           6
		//   68  129:getfield        #120 <Field String zzs$zza$zza.name>
		//   69  132:aastore         
		//   70  133:invokestatic    #97  <Method void zzs.zzb(String, Object[])>
			l = l1;
		//   71  136:lload           4
		//   72  138:lstore_2        
			if(true) goto _L4; else goto _L3
_L3:
			if(true) goto _L1; else goto _L5
_L5:
		//*  73  139:goto            71
			s;
		//   74  142:astore_1        
		//*  75  143:aload_0         
			throw s;
		//   76  144:monitorexit     
		//   77  145:aload_1         
		//   78  146:athrow          
		}

		public static final boolean zzai;
		private final List zzaj = new ArrayList();
		private boolean zzak;

		static 
		{
			zzai = zzs.DEBUG;
		//    0    0:getstatic       #20  <Field boolean zzs.DEBUG>
		//    1    3:putstatic       #22  <Field boolean zzai>
		//*   2    6:return          
		}

		zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #28  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void ArrayList()>
		//    6   12:putfield        #31  <Field List zzaj>
			zzak = false;
		//    7   15:aload_0         
		//    8   16:iconst_0        
		//    9   17:putfield        #33  <Field boolean zzak>
		//   10   20:return          
		}
	}

	private static class zza.zza
	{

		public final String name;
		public final long time;
		public final long zzal;

		public zza.zza(String s, long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String name>
			zzal = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #23  <Field long zzal>
			time = l1;
		//    8   14:aload_0         
		//    9   15:lload           4
		//   10   17:putfield        #25  <Field long time>
		//   11   20:return          
		}
	}


	public zzs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static transient void zza(String s, Object aobj[])
	{
		if(DEBUG)
	//*   0    0:getstatic       #27  <Field boolean DEBUG>
	//*   1    3:ifeq            18
			Log.v(TAG, zzd(s, aobj));
	//    2    6:getstatic       #19  <Field String TAG>
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:invokestatic    #36  <Method String zzd(String, Object[])>
	//    6   14:invokestatic    #40  <Method int Log.v(String, String)>
	//    7   17:pop             
	//    8   18:return          
	}

	public static transient void zza(Throwable throwable, String s, Object aobj[])
	{
		Log.e(TAG, zzd(s, aobj), throwable);
	//    0    0:getstatic       #19  <Field String TAG>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokestatic    #36  <Method String zzd(String, Object[])>
	//    4    8:aload_0         
	//    5    9:invokestatic    #45  <Method int Log.e(String, String, Throwable)>
	//    6   12:pop             
	//    7   13:return          
	}

	public static transient void zzb(String s, Object aobj[])
	{
		Log.d(TAG, zzd(s, aobj));
	//    0    0:getstatic       #19  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #36  <Method String zzd(String, Object[])>
	//    4    8:invokestatic    #49  <Method int Log.d(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	public static transient void zzc(String s, Object aobj[])
	{
		Log.e(TAG, zzd(s, aobj));
	//    0    0:getstatic       #19  <Field String TAG>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #36  <Method String zzd(String, Object[])>
	//    4    8:invokestatic    #52  <Method int Log.e(String, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	private static transient String zzd(String s, Object aobj[])
	{
		int i;
		String s1;
		if(aobj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       157
	//*   2    4:new             #54  <Class Throwable>
	//*   3    7:dup             
	//*   4    8:invokespecial   #55  <Method void Throwable()>
	//*   5   11:invokevirtual   #59  <Method Throwable Throwable.fillInStackTrace()>
	//*   6   14:invokevirtual   #63  <Method StackTraceElement[] Throwable.getStackTrace()>
	//*   7   17:astore_1        
	//*   8   18:iconst_2        
	//*   9   19:istore_2        
	//*  10   20:iload_2         
	//*  11   21:aload_1         
	//*  12   22:arraylength     
	//*  13   23:icmpge          176
	//*  14   26:aload_1         
	//*  15   27:iload_2         
	//*  16   28:aaload          
	//*  17   29:invokevirtual   #67  <Method Class Object.getClass()>
	//*  18   32:ldc1            #2   <Class zzs>
	//*  19   34:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//*  20   37:ifne            169
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:aaload          
	//*  24   43:invokevirtual   #77  <Method String StackTraceElement.getClassName()>
	//*  25   46:astore_3        
	//*  26   47:aload_3         
	//*  27   48:aload_3         
	//*  28   49:bipush          46
	//*  29   51:invokevirtual   #83  <Method int String.lastIndexOf(int)>
	//*  30   54:iconst_1        
	//*  31   55:iadd            
	//*  32   56:invokevirtual   #87  <Method String String.substring(int)>
	//*  33   59:astore_3        
	//*  34   60:aload_3         
	//*  35   61:aload_3         
	//*  36   62:bipush          36
	//*  37   64:invokevirtual   #83  <Method int String.lastIndexOf(int)>
	//*  38   67:iconst_1        
	//*  39   68:iadd            
	//*  40   69:invokevirtual   #87  <Method String String.substring(int)>
	//*  41   72:astore_3        
	//*  42   73:aload_1         
	//*  43   74:iload_2         
	//*  44   75:aaload          
	//*  45   76:invokevirtual   #90  <Method String StackTraceElement.getMethodName()>
	//*  46   79:invokestatic    #94  <Method String String.valueOf(Object)>
	//*  47   82:astore_1        
	//*  48   83:new             #96  <Class StringBuilder>
	//*  49   86:dup             
	//*  50   87:aload_3         
	//*  51   88:invokestatic    #94  <Method String String.valueOf(Object)>
	//*  52   91:invokevirtual   #100 <Method int String.length()>
	//*  53   94:iconst_1        
	//*  54   95:iadd            
	//*  55   96:aload_1         
	//*  56   97:invokestatic    #94  <Method String String.valueOf(Object)>
	//*  57  100:invokevirtual   #100 <Method int String.length()>
	//*  58  103:iadd            
	//*  59  104:invokespecial   #103 <Method void StringBuilder(int)>
	//*  60  107:aload_3         
	//*  61  108:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  62  111:ldc1            #109 <String ".">
	//*  63  113:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  64  116:aload_1         
	//*  65  117:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  66  120:invokevirtual   #112 <Method String StringBuilder.toString()>
	//*  67  123:astore_1        
	//*  68  124:getstatic       #118 <Field Locale Locale.US>
	//*  69  127:ldc1            #120 <String "[%d] %s: %s">
	//*  70  129:iconst_3        
	//*  71  130:anewarray       Object[]
	//*  72  133:dup             
	//*  73  134:iconst_0        
	//*  74  135:invokestatic    #126 <Method Thread Thread.currentThread()>
	//*  75  138:invokevirtual   #130 <Method long Thread.getId()>
	//*  76  141:invokestatic    #135 <Method Long Long.valueOf(long)>
	//*  77  144:aastore         
	//*  78  145:dup             
	//*  79  146:iconst_1        
	//*  80  147:aload_1         
	//*  81  148:aastore         
	//*  82  149:dup             
	//*  83  150:iconst_2        
	//*  84  151:aload_0         
	//*  85  152:aastore         
	//*  86  153:invokestatic    #139 <Method String String.format(Locale, String, Object[])>
	//*  87  156:areturn         
			s = String.format(Locale.US, s, aobj);
	//   88  157:getstatic       #118 <Field Locale Locale.US>
	//   89  160:aload_0         
	//   90  161:aload_1         
	//   91  162:invokestatic    #139 <Method String String.format(Locale, String, Object[])>
	//   92  165:astore_0        
		aobj = ((Object []) ((new Throwable()).fillInStackTrace().getStackTrace()));
		i = 2;
_L3:
		if(i >= aobj.length)
			break MISSING_BLOCK_LABEL_176;
		if(((Object) (aobj[i].getClass())).equals(com/google/android/gms/internal/zzs)) goto _L2; else goto _L1
_L1:
		s1 = ((StackTraceElement) (aobj[i])).getClassName();
		s1 = s1.substring(s1.lastIndexOf('.') + 1);
		s1 = s1.substring(s1.lastIndexOf('$') + 1);
		aobj = ((Object []) (String.valueOf(((Object) (((StackTraceElement) (aobj[i])).getMethodName())))));
		aobj = ((Object []) ((new StringBuilder(String.valueOf(((Object) (s1))).length() + 1 + String.valueOf(((Object) (aobj))).length())).append(s1).append(".").append(((String) (aobj))).toString()));
_L4:
		return String.format(Locale.US, "[%d] %s: %s", new Object[] {
			Long.valueOf(Thread.currentThread().getId()), aobj, s
		});
	//*  93  166:goto            4
_L2:
		i++;
	//   94  169:iload_2         
	//   95  170:iconst_1        
	//   96  171:iadd            
	//   97  172:istore_2        
		  goto _L3
	//*  98  173:goto            20
		aobj = "<unknown>";
	//   99  176:ldc1            #141 <String "<unknown>">
	//  100  178:astore_1        
		  goto _L4
	//* 101  179:goto            124
	}

	public static boolean DEBUG;
	public static String TAG;

	static 
	{
		TAG = "Volley";
	//    0    0:ldc1            #17  <String "Volley">
	//    1    2:putstatic       #19  <Field String TAG>
		DEBUG = Log.isLoggable(TAG, 2);
	//    2    5:getstatic       #19  <Field String TAG>
	//    3    8:iconst_2        
	//    4    9:invokestatic    #25  <Method boolean Log.isLoggable(String, int)>
	//    5   12:putstatic       #27  <Field boolean DEBUG>
	//*   6   15:return          
	}
}
