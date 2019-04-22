// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//			d, a

static final class d$a
	implements a$b
{

	public a$b appState(String s)
	{
		appState = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String appState>
		return ((a$b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public a build()
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
			return ((a) (new d(queryId, eventId, vastEvent, appState, nativeTime.longValue(), nativeVolume.doubleValue(), nativeViewHidden.booleanValue(), nativeViewBounds, nativeViewVisibleBounds, ((d$1) (null)))));
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

	public a$b eventId(String s)
	{
		eventId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String eventId>
		return ((a$b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public a$b nativeTime(long l)
	{
		nativeTime = Long.valueOf(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #57  <Method Long Long.valueOf(long)>
	//    3    5:putfield        #59  <Field Long nativeTime>
		return ((a$b) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public a$b nativeViewBounds(a$a a$a)
	{
		nativeViewBounds = a$a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field a$a nativeViewBounds>
		return ((a$b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public a$b nativeViewHidden(boolean flag)
	{
		nativeViewHidden = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #79  <Field Boolean nativeViewHidden>
		return ((a$b) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public a$b nativeViewVisibleBounds(a$a a$a)
	{
		nativeViewVisibleBounds = a$a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field a$a nativeViewVisibleBounds>
		return ((a$b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public a$b nativeVolume(double d1)
	{
		nativeVolume = Double.valueOf(d1);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #67  <Method Double Double.valueOf(double)>
	//    3    5:putfield        #69  <Field Double nativeVolume>
		return ((a$b) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public a$b queryId(String s)
	{
		queryId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String queryId>
		return ((a$b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public a$b vastEvent(String s)
	{
		vastEvent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String vastEvent>
		return ((a$b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String appState;
	private String eventId;
	private Long nativeTime;
	private a$a nativeViewBounds;
	private Boolean nativeViewHidden;
	private a$a nativeViewVisibleBounds;
	private Double nativeVolume;
	private String queryId;
	private String vastEvent;

	d$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	private d$a(a a1)
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
