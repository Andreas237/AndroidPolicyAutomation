// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.e:
//			n, m, f, d, 
//			a

public final class d
	implements n
{
	public static class a
		implements a.b
	{

		public a.b appState(String s)
		{
			appState = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #48  <Field String appState>
			return ((a.b) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public com.google.ads.interactivemedia.v3.impl.data.a build()
		{
			String s2 = "";
		//    0    0:ldc1            #93  <String "">
		//    1    2:astore_2        
			if(queryId == null)
		//*   2    3:aload_0         
		//*   3    4:getfield        #36  <Field String queryId>
		//*   4    7:ifnonnull       21
				s2 = String.valueOf("").concat(" queryId");
		//    5   10:ldc1            #93  <String "">
		//    6   12:invokestatic    #98  <Method String String.valueOf(Object)>
		//    7   15:ldc1            #100 <String " queryId">
		//    8   17:invokevirtual   #104 <Method String String.concat(String)>
		//    9   20:astore_2        
			String s = s2;
		//   10   21:aload_2         
		//   11   22:astore_1        
			if(eventId == null)
		//*  12   23:aload_0         
		//*  13   24:getfield        #40  <Field String eventId>
		//*  14   27:ifnonnull       40
				s = String.valueOf(((Object) (s2))).concat(" eventId");
		//   15   30:aload_2         
		//   16   31:invokestatic    #98  <Method String String.valueOf(Object)>
		//   17   34:ldc1            #106 <String " eventId">
		//   18   36:invokevirtual   #104 <Method String String.concat(String)>
		//   19   39:astore_1        
			s2 = s;
		//   20   40:aload_1         
		//   21   41:astore_2        
			if(vastEvent == null)
		//*  22   42:aload_0         
		//*  23   43:getfield        #44  <Field String vastEvent>
		//*  24   46:ifnonnull       59
				s2 = String.valueOf(((Object) (s))).concat(" vastEvent");
		//   25   49:aload_1         
		//   26   50:invokestatic    #98  <Method String String.valueOf(Object)>
		//   27   53:ldc1            #108 <String " vastEvent">
		//   28   55:invokevirtual   #104 <Method String String.concat(String)>
		//   29   58:astore_2        
			s = s2;
		//   30   59:aload_2         
		//   31   60:astore_1        
			if(appState == null)
		//*  32   61:aload_0         
		//*  33   62:getfield        #48  <Field String appState>
		//*  34   65:ifnonnull       78
				s = String.valueOf(((Object) (s2))).concat(" appState");
		//   35   68:aload_2         
		//   36   69:invokestatic    #98  <Method String String.valueOf(Object)>
		//   37   72:ldc1            #110 <String " appState">
		//   38   74:invokevirtual   #104 <Method String String.concat(String)>
		//   39   77:astore_1        
			s2 = s;
		//   40   78:aload_1         
		//   41   79:astore_2        
			if(nativeTime == null)
		//*  42   80:aload_0         
		//*  43   81:getfield        #59  <Field Long nativeTime>
		//*  44   84:ifnonnull       97
				s2 = String.valueOf(((Object) (s))).concat(" nativeTime");
		//   45   87:aload_1         
		//   46   88:invokestatic    #98  <Method String String.valueOf(Object)>
		//   47   91:ldc1            #112 <String " nativeTime">
		//   48   93:invokevirtual   #104 <Method String String.concat(String)>
		//   49   96:astore_2        
			s = s2;
		//   50   97:aload_2         
		//   51   98:astore_1        
			if(nativeVolume == null)
		//*  52   99:aload_0         
		//*  53  100:getfield        #69  <Field Double nativeVolume>
		//*  54  103:ifnonnull       116
				s = String.valueOf(((Object) (s2))).concat(" nativeVolume");
		//   55  106:aload_2         
		//   56  107:invokestatic    #98  <Method String String.valueOf(Object)>
		//   57  110:ldc1            #114 <String " nativeVolume">
		//   58  112:invokevirtual   #104 <Method String String.concat(String)>
		//   59  115:astore_1        
			s2 = s;
		//   60  116:aload_1         
		//   61  117:astore_2        
			if(nativeViewHidden == null)
		//*  62  118:aload_0         
		//*  63  119:getfield        #79  <Field Boolean nativeViewHidden>
		//*  64  122:ifnonnull       135
				s2 = String.valueOf(((Object) (s))).concat(" nativeViewHidden");
		//   65  125:aload_1         
		//   66  126:invokestatic    #98  <Method String String.valueOf(Object)>
		//   67  129:ldc1            #116 <String " nativeViewHidden">
		//   68  131:invokevirtual   #104 <Method String String.concat(String)>
		//   69  134:astore_2        
			s = s2;
		//   70  135:aload_2         
		//   71  136:astore_1        
			if(nativeViewBounds == null)
		//*  72  137:aload_0         
		//*  73  138:getfield        #84  <Field a$a nativeViewBounds>
		//*  74  141:ifnonnull       154
				s = String.valueOf(((Object) (s2))).concat(" nativeViewBounds");
		//   75  144:aload_2         
		//   76  145:invokestatic    #98  <Method String String.valueOf(Object)>
		//   77  148:ldc1            #118 <String " nativeViewBounds">
		//   78  150:invokevirtual   #104 <Method String String.concat(String)>
		//   79  153:astore_1        
			s2 = s;
		//   80  154:aload_1         
		//   81  155:astore_2        
			if(nativeViewVisibleBounds == null)
		//*  82  156:aload_0         
		//*  83  157:getfield        #88  <Field a$a nativeViewVisibleBounds>
		//*  84  160:ifnonnull       173
				s2 = String.valueOf(((Object) (s))).concat(" nativeViewVisibleBounds");
		//   85  163:aload_1         
		//   86  164:invokestatic    #98  <Method String String.valueOf(Object)>
		//   87  167:ldc1            #120 <String " nativeViewVisibleBounds">
		//   88  169:invokevirtual   #104 <Method String String.concat(String)>
		//   89  172:astore_2        
			if(!s2.isEmpty())
		//*  90  173:aload_2         
		//*  91  174:invokevirtual   #123 <Method boolean String.isEmpty()>
		//*  92  177:ifne            221
			{
				String s1 = String.valueOf(((Object) (s2)));
		//   93  180:aload_2         
		//   94  181:invokestatic    #98  <Method String String.valueOf(Object)>
		//   95  184:astore_1        
				if(s1.length() != 0)
		//*  96  185:aload_1         
		//*  97  186:invokevirtual   #127 <Method int String.length()>
		//*  98  189:ifeq            202
					s1 = "Missing required properties:".concat(s1);
		//   99  192:ldc1            #129 <String "Missing required properties:">
		//  100  194:aload_1         
		//  101  195:invokevirtual   #104 <Method String String.concat(String)>
		//  102  198:astore_1        
				else
		//* 103  199:goto            212
					s1 = new String("Missing required properties:");
		//  104  202:new             #95  <Class String>
		//  105  205:dup             
		//  106  206:ldc1            #129 <String "Missing required properties:">
		//  107  208:invokespecial   #132 <Method void String(String)>
		//  108  211:astore_1        
				throw new IllegalStateException(s1);
		//  109  212:new             #134 <Class IllegalStateException>
		//  110  215:dup             
		//  111  216:aload_1         
		//  112  217:invokespecial   #135 <Method void IllegalStateException(String)>
		//  113  220:athrow          
			} else
			{
				return ((com.google.ads.interactivemedia.v3.impl.data.a) (new d(queryId, eventId, vastEvent, appState, nativeTime.longValue(), nativeVolume.doubleValue(), nativeViewHidden.booleanValue(), nativeViewBounds, nativeViewVisibleBounds, ((_cls1) (null)))));
		//  114  221:new             #8   <Class d>
		//  115  224:dup             
		//  116  225:aload_0         
		//  117  226:getfield        #36  <Field String queryId>
		//  118  229:aload_0         
		//  119  230:getfield        #40  <Field String eventId>
		//  120  233:aload_0         
		//  121  234:getfield        #44  <Field String vastEvent>
		//  122  237:aload_0         
		//  123  238:getfield        #48  <Field String appState>
		//  124  241:aload_0         
		//  125  242:getfield        #59  <Field Long nativeTime>
		//  126  245:invokevirtual   #138 <Method long Long.longValue()>
		//  127  248:aload_0         
		//  128  249:getfield        #69  <Field Double nativeVolume>
		//  129  252:invokevirtual   #141 <Method double Double.doubleValue()>
		//  130  255:aload_0         
		//  131  256:getfield        #79  <Field Boolean nativeViewHidden>
		//  132  259:invokevirtual   #144 <Method boolean Boolean.booleanValue()>
		//  133  262:aload_0         
		//  134  263:getfield        #84  <Field a$a nativeViewBounds>
		//  135  266:aload_0         
		//  136  267:getfield        #88  <Field a$a nativeViewVisibleBounds>
		//  137  270:aconst_null     
		//  138  271:invokespecial   #147 <Method void d(String, String, String, String, long, double, boolean, a$a, a$a, d$1)>
		//  139  274:areturn         
			}
		}

		public a.b eventId(String s)
		{
			eventId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field String eventId>
			return ((a.b) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a.b nativeTime(long l)
		{
			nativeTime = Long.valueOf(l);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokestatic    #57  <Method Long Long.valueOf(long)>
		//    3    5:putfield        #59  <Field Long nativeTime>
			return ((a.b) (this));
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a.b nativeViewBounds(a.a a1)
		{
			nativeViewBounds = a1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #84  <Field a$a nativeViewBounds>
			return ((a.b) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a.b nativeViewHidden(boolean flag)
		{
			nativeViewHidden = Boolean.valueOf(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
		//    3    5:putfield        #79  <Field Boolean nativeViewHidden>
			return ((a.b) (this));
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a.b nativeViewVisibleBounds(a.a a1)
		{
			nativeViewVisibleBounds = a1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #88  <Field a$a nativeViewVisibleBounds>
			return ((a.b) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a.b nativeVolume(double d1)
		{
			nativeVolume = Double.valueOf(d1);
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:invokestatic    #67  <Method Double Double.valueOf(double)>
		//    3    5:putfield        #69  <Field Double nativeVolume>
			return ((a.b) (this));
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a.b queryId(String s)
		{
			queryId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field String queryId>
			return ((a.b) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a.b vastEvent(String s)
		{
			vastEvent = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field String vastEvent>
			return ((a.b) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String appState;
		private String eventId;
		private Long nativeTime;
		private a.a nativeViewBounds;
		private Boolean nativeViewHidden;
		private a.a nativeViewVisibleBounds;
		private Double nativeVolume;
		private String queryId;
		private String vastEvent;

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:return          
		}

		private a(com.google.ads.interactivemedia.v3.impl.data.a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			queryId = a1.queryId();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #34  <Method String a.queryId()>
		//    5    9:putfield        #36  <Field String queryId>
			eventId = a1.eventId();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #38  <Method String a.eventId()>
		//    9   17:putfield        #40  <Field String eventId>
			vastEvent = a1.vastEvent();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #42  <Method String a.vastEvent()>
		//   13   25:putfield        #44  <Field String vastEvent>
			appState = a1.appState();
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokevirtual   #46  <Method String a.appState()>
		//   17   33:putfield        #48  <Field String appState>
			nativeTime = Long.valueOf(a1.nativeTime());
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokevirtual   #51  <Method long a.nativeTime()>
		//   21   41:invokestatic    #57  <Method Long Long.valueOf(long)>
		//   22   44:putfield        #59  <Field Long nativeTime>
			nativeVolume = Double.valueOf(a1.nativeVolume());
		//   23   47:aload_0         
		//   24   48:aload_1         
		//   25   49:invokevirtual   #62  <Method double a.nativeVolume()>
		//   26   52:invokestatic    #67  <Method Double Double.valueOf(double)>
		//   27   55:putfield        #69  <Field Double nativeVolume>
			nativeViewHidden = Boolean.valueOf(a1.nativeViewHidden());
		//   28   58:aload_0         
		//   29   59:aload_1         
		//   30   60:invokevirtual   #72  <Method boolean a.nativeViewHidden()>
		//   31   63:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
		//   32   66:putfield        #79  <Field Boolean nativeViewHidden>
			nativeViewBounds = a1.nativeViewBounds();
		//   33   69:aload_0         
		//   34   70:aload_1         
		//   35   71:invokevirtual   #82  <Method a$a a.nativeViewBounds()>
		//   36   74:putfield        #84  <Field a$a nativeViewBounds>
			nativeViewVisibleBounds = a1.nativeViewVisibleBounds();
		//   37   77:aload_0         
		//   38   78:aload_1         
		//   39   79:invokevirtual   #86  <Method a$a a.nativeViewVisibleBounds()>
		//   40   82:putfield        #88  <Field a$a nativeViewVisibleBounds>
		//   41   85:return          
		}
	}


	public d(Context context, m m1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = context.getContentResolver();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method ContentResolver Context.getContentResolver()>
	//    5    9:putfield        #35  <Field ContentResolver a>
		b = m1;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #37  <Field m b>
	//    9   17:return          
	}

	public int a(byte abyte0[], int i, int j)
		throws a
	{
		long l;
		long l2;
		l = f;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long f>
	//    2    4:lstore          4
		if(l == 0L)
	//*   3    6:lload           4
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		if(l == -1L)
	//*   9   15:lload           4
	//*  10   17:ldc2w           #44  <Long -1L>
	//*  11   20:lcmp            
	//*  12   21:ifne            27
			break MISSING_BLOCK_LABEL_40;
	//   13   24:goto            40
		l2 = j;
	//   14   27:iload_3         
	//   15   28:i2l             
	//   16   29:lstore          6
		j = (int)Math.min(l, l2);
	//   17   31:lload           4
	//   18   33:lload           6
	//   19   35:invokestatic    #51  <Method long Math.min(long, long)>
	//   20   38:l2i             
	//   21   39:istore_3        
		i = d.read(abyte0, i, j);
	//   22   40:aload_0         
	//   23   41:getfield        #53  <Field InputStream d>
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:iload_3         
	//   27   47:invokevirtual   #58  <Method int InputStream.read(byte[], int, int)>
	//   28   50:istore_2        
		if(i > 0)
	//*  29   51:iload_2         
	//*  30   52:ifle            95
		{
			long l1 = f;
	//   31   55:aload_0         
	//   32   56:getfield        #43  <Field long f>
	//   33   59:lstore          4
			if(l1 != -1L)
	//*  34   61:lload           4
	//*  35   63:ldc2w           #44  <Long -1L>
	//*  36   66:lcmp            
	//*  37   67:ifeq            79
				f = l1 - (long)i;
	//   38   70:aload_0         
	//   39   71:lload           4
	//   40   73:iload_2         
	//   41   74:i2l             
	//   42   75:lsub            
	//   43   76:putfield        #43  <Field long f>
			abyte0 = ((byte []) (b));
	//   44   79:aload_0         
	//   45   80:getfield        #37  <Field m b>
	//   46   83:astore_1        
			if(abyte0 != null)
	//*  47   84:aload_1         
	//*  48   85:ifnull          95
				((m) (abyte0)).a(i);
	//   49   88:aload_1         
	//   50   89:iload_2         
	//   51   90:invokeinterface #63  <Method void m.a(int)>
		}
		return i;
	//   52   95:iload_2         
	//   53   96:ireturn         
		abyte0;
	//   54   97:astore_1        
		throw new a(((IOException) (abyte0)));
	//   55   98:new             #8   <Class d$a>
	//   56  101:dup             
	//   57  102:aload_1         
	//   58  103:invokespecial   #66  <Method void d$a(IOException)>
	//   59  106:athrow          
	}

	public long a(f f1)
		throws a
	{
label0:
		{
label1:
			{
				e = f1.a.toString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #73  <Field Uri f.a>
	//    3    5:invokevirtual   #79  <Method String Uri.toString()>
	//    4    8:putfield        #81  <Field String e>
				c = a.openAssetFileDescriptor(f1.a, "r");
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field ContentResolver a>
	//    8   16:aload_1         
	//    9   17:getfield        #73  <Field Uri f.a>
	//   10   20:ldc1            #83  <String "r">
	//   11   22:invokevirtual   #89  <Method AssetFileDescriptor ContentResolver.openAssetFileDescriptor(Uri, String)>
	//   12   25:putfield        #91  <Field AssetFileDescriptor c>
				d = ((InputStream) (new FileInputStream(c.getFileDescriptor())));
	//   13   28:aload_0         
	//   14   29:new             #93  <Class FileInputStream>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:getfield        #91  <Field AssetFileDescriptor c>
	//   18   37:invokevirtual   #99  <Method java.io.FileDescriptor AssetFileDescriptor.getFileDescriptor()>
	//   19   40:invokespecial   #102 <Method void FileInputStream(java.io.FileDescriptor)>
	//   20   43:putfield        #53  <Field InputStream d>
				if(d.skip(f1.d) < f1.d)
					break label0;
	//   21   46:aload_0         
	//   22   47:getfield        #53  <Field InputStream d>
	//   23   50:aload_1         
	//   24   51:getfield        #104 <Field long f.d>
	//   25   54:invokevirtual   #108 <Method long InputStream.skip(long)>
	//   26   57:aload_1         
	//   27   58:getfield        #104 <Field long f.d>
	//   28   61:lcmp            
	//   29   62:iflt            140
				if(f1.e != -1L)
	//*  30   65:aload_1         
	//*  31   66:getfield        #110 <Field long f.e>
	//*  32   69:ldc2w           #44  <Long -1L>
	//*  33   72:lcmp            
	//*  34   73:ifeq            87
				{
					f = f1.e;
	//   35   76:aload_0         
	//   36   77:aload_1         
	//   37   78:getfield        #110 <Field long f.e>
	//   38   81:putfield        #43  <Field long f>
					break label1;
	//   39   84:goto            115
				}
				try
				{
					f = d.available();
	//   40   87:aload_0         
	//   41   88:aload_0         
	//   42   89:getfield        #53  <Field InputStream d>
	//   43   92:invokevirtual   #114 <Method int InputStream.available()>
	//   44   95:i2l             
	//   45   96:putfield        #43  <Field long f>
					if(f == 0L)
	//*  46   99:aload_0         
	//*  47  100:getfield        #43  <Field long f>
	//*  48  103:lconst_0        
	//*  49  104:lcmp            
	//*  50  105:ifne            115
						f = -1L;
	//   51  108:aload_0         
	//   52  109:ldc2w           #44  <Long -1L>
	//   53  112:putfield        #43  <Field long f>
				}
	//*  54  115:aload_0         
	//*  55  116:iconst_1        
	//*  56  117:putfield        #116 <Field boolean g>
	//*  57  120:aload_0         
	//*  58  121:getfield        #37  <Field m b>
	//*  59  124:astore_1        
	//*  60  125:aload_1         
	//*  61  126:ifnull          135
	//*  62  129:aload_1         
	//*  63  130:invokeinterface #118 <Method void m.a()>
	//*  64  135:aload_0         
	//*  65  136:getfield        #43  <Field long f>
	//*  66  139:lreturn         
	//*  67  140:new             #120 <Class EOFException>
	//*  68  143:dup             
	//*  69  144:invokespecial   #121 <Method void EOFException()>
	//*  70  147:athrow          
				// Misplaced declaration of an exception variable
				catch(f f1)
	//*  71  148:astore_1        
				{
					throw new a(((IOException) (f1)));
	//   72  149:new             #8   <Class d$a>
	//   73  152:dup             
	//   74  153:aload_1         
	//   75  154:invokespecial   #66  <Method void d$a(IOException)>
	//   76  157:athrow          
				}
			}
			g = true;
			f1 = ((f) (b));
			if(f1 != null)
				((m) (f1)).a();
			return f;
		}
		throw new EOFException();
	}

	public void a()
		throws a
	{
		e = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #81  <Field String e>
		if(d != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #53  <Field InputStream d>
	//*   5    9:ifnull          19
			d.close();
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field InputStream d>
	//    8   16:invokevirtual   #124 <Method void InputStream.close()>
		d = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #53  <Field InputStream d>
		if(c != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #91  <Field AssetFileDescriptor c>
	//*  14   28:ifnull          38
			c.close();
	//   15   31:aload_0         
	//   16   32:getfield        #91  <Field AssetFileDescriptor c>
	//   17   35:invokevirtual   #125 <Method void AssetFileDescriptor.close()>
		c = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #91  <Field AssetFileDescriptor c>
		if(g)
	//*  21   43:aload_0         
	//*  22   44:getfield        #116 <Field boolean g>
	//*  23   47:ifeq            70
		{
			g = false;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #116 <Field boolean g>
			m m1 = b;
	//   27   55:aload_0         
	//   28   56:getfield        #37  <Field m b>
	//   29   59:astore_1        
			if(m1 != null)
	//*  30   60:aload_1         
	//*  31   61:ifnull          70
				m1.b();
	//   32   64:aload_1         
	//   33   65:invokeinterface #127 <Method void m.b()>
		}
		return;
	//   34   70:return          
		Object obj;
		obj;
	//   35   71:astore_1        
		break MISSING_BLOCK_LABEL_85;
	//   36   72:goto            85
		obj;
	//   37   75:astore_1        
		throw new a(((IOException) (obj)));
	//   38   76:new             #8   <Class d$a>
	//   39   79:dup             
	//   40   80:aload_1         
	//   41   81:invokespecial   #66  <Method void d$a(IOException)>
	//   42   84:athrow          
		c = null;
	//   43   85:aload_0         
	//   44   86:aconst_null     
	//   45   87:putfield        #91  <Field AssetFileDescriptor c>
		if(g)
	//*  46   90:aload_0         
	//*  47   91:getfield        #116 <Field boolean g>
	//*  48   94:ifeq            117
		{
			g = false;
	//   49   97:aload_0         
	//   50   98:iconst_0        
	//   51   99:putfield        #116 <Field boolean g>
			m m2 = b;
	//   52  102:aload_0         
	//   53  103:getfield        #37  <Field m b>
	//   54  106:astore_2        
			if(m2 != null)
	//*  55  107:aload_2         
	//*  56  108:ifnull          117
				m2.b();
	//   57  111:aload_2         
	//   58  112:invokeinterface #127 <Method void m.b()>
		}
		throw obj;
	//   59  117:aload_1         
	//   60  118:athrow          
		obj;
	//   61  119:astore_1        
		break MISSING_BLOCK_LABEL_133;
	//   62  120:goto            133
		obj;
	//   63  123:astore_1        
		throw new a(((IOException) (obj)));
	//   64  124:new             #8   <Class d$a>
	//   65  127:dup             
	//   66  128:aload_1         
	//   67  129:invokespecial   #66  <Method void d$a(IOException)>
	//   68  132:athrow          
		d = null;
	//   69  133:aload_0         
	//   70  134:aconst_null     
	//   71  135:putfield        #53  <Field InputStream d>
		if(c != null)
	//*  72  138:aload_0         
	//*  73  139:getfield        #91  <Field AssetFileDescriptor c>
	//*  74  142:ifnull          152
			c.close();
	//   75  145:aload_0         
	//   76  146:getfield        #91  <Field AssetFileDescriptor c>
	//   77  149:invokevirtual   #125 <Method void AssetFileDescriptor.close()>
		c = null;
	//   78  152:aload_0         
	//   79  153:aconst_null     
	//   80  154:putfield        #91  <Field AssetFileDescriptor c>
		if(g)
	//*  81  157:aload_0         
	//*  82  158:getfield        #116 <Field boolean g>
	//*  83  161:ifeq            184
		{
			g = false;
	//   84  164:aload_0         
	//   85  165:iconst_0        
	//   86  166:putfield        #116 <Field boolean g>
			m m3 = b;
	//   87  169:aload_0         
	//   88  170:getfield        #37  <Field m b>
	//   89  173:astore_2        
			if(m3 != null)
	//*  90  174:aload_2         
	//*  91  175:ifnull          184
				m3.b();
	//   92  178:aload_2         
	//   93  179:invokeinterface #127 <Method void m.b()>
		}
		throw obj;
	//   94  184:aload_1         
	//   95  185:athrow          
		obj;
	//   96  186:astore_1        
		break MISSING_BLOCK_LABEL_200;
	//   97  187:goto            200
		obj;
	//   98  190:astore_1        
		throw new a(((IOException) (obj)));
	//   99  191:new             #8   <Class d$a>
	//  100  194:dup             
	//  101  195:aload_1         
	//  102  196:invokespecial   #66  <Method void d$a(IOException)>
	//  103  199:athrow          
		c = null;
	//  104  200:aload_0         
	//  105  201:aconst_null     
	//  106  202:putfield        #91  <Field AssetFileDescriptor c>
		if(g)
	//* 107  205:aload_0         
	//* 108  206:getfield        #116 <Field boolean g>
	//* 109  209:ifeq            232
		{
			g = false;
	//  110  212:aload_0         
	//  111  213:iconst_0        
	//  112  214:putfield        #116 <Field boolean g>
			m m4 = b;
	//  113  217:aload_0         
	//  114  218:getfield        #37  <Field m b>
	//  115  221:astore_2        
			if(m4 != null)
	//* 116  222:aload_2         
	//* 117  223:ifnull          232
				m4.b();
	//  118  226:aload_2         
	//  119  227:invokeinterface #127 <Method void m.b()>
		}
		throw obj;
	//  120  232:aload_1         
	//  121  233:athrow          
	}

	private final ContentResolver a;
	private final m b;
	private AssetFileDescriptor c;
	private InputStream d;
	private String e;
	private long f;
	private boolean g;
}
