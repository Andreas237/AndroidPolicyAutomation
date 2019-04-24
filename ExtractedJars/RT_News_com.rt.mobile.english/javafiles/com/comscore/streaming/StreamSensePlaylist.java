// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import com.comscore.utils.CSLog;
import java.util.HashMap;
import java.util.Set;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseClip, StreamSenseEventType, StreamSenseState, StreamSenseUtils

public class StreamSensePlaylist
{

	public StreamSensePlaylist()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field StreamSenseClip a>
		j = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #29  <Field boolean j>
		a = new StreamSenseClip();
	//    8   14:aload_0         
	//    9   15:new             #31  <Class StreamSenseClip>
	//   10   18:dup             
	//   11   19:invokespecial   #32  <Method void StreamSenseClip()>
	//   12   22:putfield        #27  <Field StreamSenseClip a>
		h = new HashMap();
	//   13   25:aload_0         
	//   14   26:new             #34  <Class HashMap>
	//   15   29:dup             
	//   16   30:invokespecial   #35  <Method void HashMap()>
	//   17   33:putfield        #37  <Field HashMap h>
		reset();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #40  <Method void reset()>
	//   20   40:return          
	}

	protected int a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int c>
	//    2    4:ireturn         
	}

	protected HashMap a(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
	{
		if(hashmap == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          7
	//*   2    4:goto            15
			hashmap = new HashMap();
	//    3    7:new             #34  <Class HashMap>
	//    4   10:dup             
	//    5   11:invokespecial   #35  <Method void HashMap()>
	//    6   14:astore_2        
		hashmap.put("ns_st_bp", ((Object) (String.valueOf(c()))));
	//    7   15:aload_2         
	//    8   16:ldc1            #47  <String "ns_st_bp">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #50  <Method long c()>
	//   11   22:invokestatic    #56  <Method String String.valueOf(long)>
	//   12   25:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//   13   28:pop             
		hashmap.put("ns_st_sp", ((Object) (String.valueOf(c))));
	//   14   29:aload_2         
	//   15   30:ldc1            #62  <String "ns_st_sp">
	//   16   32:aload_0         
	//   17   33:getfield        #44  <Field int c>
	//   18   36:invokestatic    #65  <Method String String.valueOf(int)>
	//   19   39:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//   20   42:pop             
		hashmap.put("ns_st_id", ((Object) (String.valueOf(((Object) (b))))));
	//   21   43:aload_2         
	//   22   44:ldc1            #67  <String "ns_st_id">
	//   23   46:aload_0         
	//   24   47:getfield        #69  <Field String b>
	//   25   50:invokestatic    #72  <Method String String.valueOf(Object)>
	//   26   53:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//   27   56:pop             
		if(e > 0)
	//*  28   57:aload_0         
	//*  29   58:getfield        #74  <Field int e>
	//*  30   61:ifle            78
			hashmap.put("ns_st_bc", ((Object) (String.valueOf(e))));
	//   31   64:aload_2         
	//   32   65:ldc1            #76  <String "ns_st_bc">
	//   33   67:aload_0         
	//   34   68:getfield        #74  <Field int e>
	//   35   71:invokestatic    #65  <Method String String.valueOf(int)>
	//   36   74:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//   37   77:pop             
		if(streamsenseeventtype == StreamSenseEventType.PAUSE || streamsenseeventtype == StreamSenseEventType.END || streamsenseeventtype == StreamSenseEventType.KEEP_ALIVE || streamsenseeventtype == StreamSenseEventType.HEART_BEAT || streamsenseeventtype == null)
	//*  38   78:aload_1         
	//*  39   79:getstatic       #82  <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//*  40   82:if_acmpeq       110
	//*  41   85:aload_1         
	//*  42   86:getstatic       #85  <Field StreamSenseEventType StreamSenseEventType.END>
	//*  43   89:if_acmpeq       110
	//*  44   92:aload_1         
	//*  45   93:getstatic       #88  <Field StreamSenseEventType StreamSenseEventType.KEEP_ALIVE>
	//*  46   96:if_acmpeq       110
	//*  47   99:aload_1         
	//*  48  100:getstatic       #91  <Field StreamSenseEventType StreamSenseEventType.HEART_BEAT>
	//*  49  103:if_acmpeq       110
	//*  50  106:aload_1         
	//*  51  107:ifnonnull       138
		{
			hashmap.put("ns_st_pa", ((Object) (String.valueOf(d()))));
	//   52  110:aload_2         
	//   53  111:ldc1            #93  <String "ns_st_pa">
	//   54  113:aload_0         
	//   55  114:invokevirtual   #95  <Method long d()>
	//   56  117:invokestatic    #56  <Method String String.valueOf(long)>
	//   57  120:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//   58  123:pop             
			hashmap.put("ns_st_pp", ((Object) (String.valueOf(d))));
	//   59  124:aload_2         
	//   60  125:ldc1            #97  <String "ns_st_pp">
	//   61  127:aload_0         
	//   62  128:getfield        #99  <Field int d>
	//   63  131:invokestatic    #65  <Method String String.valueOf(int)>
	//   64  134:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//   65  137:pop             
		}
		if((streamsenseeventtype == StreamSenseEventType.PLAY || streamsenseeventtype == null) && !j())
	//*  66  138:aload_1         
	//*  67  139:getstatic       #102 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//*  68  142:if_acmpeq       149
	//*  69  145:aload_1         
	//*  70  146:ifnonnull       170
	//*  71  149:aload_0         
	//*  72  150:invokevirtual   #105 <Method boolean j()>
	//*  73  153:ifne            170
		{
			hashmap.put("ns_st_pb", "1");
	//   74  156:aload_2         
	//   75  157:ldc1            #107 <String "ns_st_pb">
	//   76  159:ldc1            #109 <String "1">
	//   77  161:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//   78  164:pop             
			a(true);
	//   79  165:aload_0         
	//   80  166:iconst_1        
	//   81  167:invokevirtual   #112 <Method void a(boolean)>
		}
		hashmap.putAll(((java.util.Map) (getLabels())));
	//   82  170:aload_2         
	//   83  171:aload_0         
	//   84  172:invokevirtual   #116 <Method HashMap getLabels()>
	//   85  175:invokevirtual   #120 <Method void HashMap.putAll(java.util.Map)>
		return hashmap;
	//   86  178:aload_2         
	//   87  179:areturn         
	}

	protected void a(int k)
	{
		c = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int c>
	//    3    5:return          
	}

	protected void a(long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #126 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("addPlaybackTime(");
	//    4    9:aload           5
	//    5   11:ldc1            #129 <String "addPlaybackTime(">
	//    6   13:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(l);
	//    8   17:aload           5
	//    9   19:lload_1         
	//   10   20:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//   11   23:pop             
		stringbuilder.append(")");
	//   12   24:aload           5
	//   13   26:ldc1            #138 <String ")">
	//   14   28:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   16   32:aload_0         
	//   17   33:aload           5
	//   18   35:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   19   38:invokestatic    #147 <Method void CSLog.d(Object, String)>
		if(a.getPlaybackTimestamp() >= 0L)
	//*  20   41:aload_0         
	//*  21   42:getfield        #27  <Field StreamSenseClip a>
	//*  22   45:invokevirtual   #150 <Method long StreamSenseClip.getPlaybackTimestamp()>
	//*  23   48:lconst_0        
	//*  24   49:lcmp            
	//*  25   50:iflt            147
		{
			long l1 = l - a.getPlaybackTimestamp();
	//   26   53:lload_1         
	//   27   54:aload_0         
	//   28   55:getfield        #27  <Field StreamSenseClip a>
	//   29   58:invokevirtual   #150 <Method long StreamSenseClip.getPlaybackTimestamp()>
	//   30   61:lsub            
	//   31   62:lstore_3        
			a.c(-1L);
	//   32   63:aload_0         
	//   33   64:getfield        #27  <Field StreamSenseClip a>
	//   34   67:ldc2w           #151 <Long -1L>
	//   35   70:invokevirtual   #154 <Method void StreamSenseClip.c(long)>
			a.b(a.f() + l1);
	//   36   73:aload_0         
	//   37   74:getfield        #27  <Field StreamSenseClip a>
	//   38   77:aload_0         
	//   39   78:getfield        #27  <Field StreamSenseClip a>
	//   40   81:invokevirtual   #156 <Method long StreamSenseClip.f()>
	//   41   84:lload_3         
	//   42   85:ladd            
	//   43   86:invokevirtual   #158 <Method void StreamSenseClip.b(long)>
			d(d() + l1);
	//   44   89:aload_0         
	//   45   90:aload_0         
	//   46   91:invokevirtual   #95  <Method long d()>
	//   47   94:lload_3         
	//   48   95:ladd            
	//   49   96:invokevirtual   #160 <Method void d(long)>
			StringBuilder stringbuilder1 = new StringBuilder();
	//   50   99:new             #126 <Class StringBuilder>
	//   51  102:dup             
	//   52  103:invokespecial   #127 <Method void StringBuilder()>
	//   53  106:astore          5
			stringbuilder1.append("addPlaybackTime(");
	//   54  108:aload           5
	//   55  110:ldc1            #129 <String "addPlaybackTime(">
	//   56  112:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
			stringbuilder1.append(l);
	//   58  116:aload           5
	//   59  118:lload_1         
	//   60  119:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//   61  122:pop             
			stringbuilder1.append(") ->");
	//   62  123:aload           5
	//   63  125:ldc1            #162 <String ") ->">
	//   64  127:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   65  130:pop             
			stringbuilder1.append(l1);
	//   66  131:aload           5
	//   67  133:lload_3         
	//   68  134:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//   69  137:pop             
			CSLog.d(((Object) (this)), stringbuilder1.toString());
	//   70  138:aload_0         
	//   71  139:aload           5
	//   72  141:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   73  144:invokestatic    #147 <Method void CSLog.d(Object, String)>
		}
	//   74  147:return          
	}

	protected void a(HashMap hashmap, StreamSenseState streamsensestate)
	{
		if(hashmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			h.putAll(((java.util.Map) (hashmap)));
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field HashMap h>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #120 <Method void HashMap.putAll(java.util.Map)>
		b(h, streamsensestate);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field HashMap h>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #165 <Method void b(HashMap, StreamSenseState)>
	//   11   21:return          
	}

	protected void a(boolean flag)
	{
		j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean j>
	//    3    5:return          
	}

	protected void b()
	{
		c = c + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int c>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #44  <Field int c>
	//    6   10:return          
	}

	protected void b(int k)
	{
		d = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field int d>
	//    3    5:return          
	}

	protected void b(long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #126 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("addBufferingTime(");
	//    4    9:aload           5
	//    5   11:ldc1            #168 <String "addBufferingTime(">
	//    6   13:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(l);
	//    8   17:aload           5
	//    9   19:lload_1         
	//   10   20:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//   11   23:pop             
		stringbuilder.append(")");
	//   12   24:aload           5
	//   13   26:ldc1            #138 <String ")">
	//   14   28:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   16   32:aload_0         
	//   17   33:aload           5
	//   18   35:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   19   38:invokestatic    #147 <Method void CSLog.d(Object, String)>
		if(a.g() >= 0L)
	//*  20   41:aload_0         
	//*  21   42:getfield        #27  <Field StreamSenseClip a>
	//*  22   45:invokevirtual   #170 <Method long StreamSenseClip.g()>
	//*  23   48:lconst_0        
	//*  24   49:lcmp            
	//*  25   50:iflt            147
		{
			long l1 = l - a.g();
	//   26   53:lload_1         
	//   27   54:aload_0         
	//   28   55:getfield        #27  <Field StreamSenseClip a>
	//   29   58:invokevirtual   #170 <Method long StreamSenseClip.g()>
	//   30   61:lsub            
	//   31   62:lstore_3        
			a.d(-1L);
	//   32   63:aload_0         
	//   33   64:getfield        #27  <Field StreamSenseClip a>
	//   34   67:ldc2w           #151 <Long -1L>
	//   35   70:invokevirtual   #171 <Method void StreamSenseClip.d(long)>
			a.a(a.e() + l1);
	//   36   73:aload_0         
	//   37   74:getfield        #27  <Field StreamSenseClip a>
	//   38   77:aload_0         
	//   39   78:getfield        #27  <Field StreamSenseClip a>
	//   40   81:invokevirtual   #173 <Method long StreamSenseClip.e()>
	//   41   84:lload_3         
	//   42   85:ladd            
	//   43   86:invokevirtual   #175 <Method void StreamSenseClip.a(long)>
			c(c() + l1);
	//   44   89:aload_0         
	//   45   90:aload_0         
	//   46   91:invokevirtual   #50  <Method long c()>
	//   47   94:lload_3         
	//   48   95:ladd            
	//   49   96:invokevirtual   #176 <Method void c(long)>
			StringBuilder stringbuilder1 = new StringBuilder();
	//   50   99:new             #126 <Class StringBuilder>
	//   51  102:dup             
	//   52  103:invokespecial   #127 <Method void StringBuilder()>
	//   53  106:astore          5
			stringbuilder1.append("addBufferingTime(");
	//   54  108:aload           5
	//   55  110:ldc1            #168 <String "addBufferingTime(">
	//   56  112:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
			stringbuilder1.append(l);
	//   58  116:aload           5
	//   59  118:lload_1         
	//   60  119:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//   61  122:pop             
			stringbuilder1.append(") ->");
	//   62  123:aload           5
	//   63  125:ldc1            #162 <String ") ->">
	//   64  127:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   65  130:pop             
			stringbuilder1.append(l1);
	//   66  131:aload           5
	//   67  133:lload_3         
	//   68  134:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//   69  137:pop             
			CSLog.d(((Object) (this)), stringbuilder1.toString());
	//   70  138:aload_0         
	//   71  139:aload           5
	//   72  141:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   73  144:invokestatic    #147 <Method void CSLog.d(Object, String)>
		}
	//   74  147:return          
	}

	protected void b(HashMap hashmap, StreamSenseState streamsensestate)
	{
		String s = (String)hashmap.get("ns_st_sp");
	//    0    0:aload_1         
	//    1    1:ldc1            #62  <String "ns_st_sp">
	//    2    3:invokevirtual   #182 <Method Object HashMap.get(Object)>
	//    3    6:checkcast       #52  <Class String>
	//    4    9:astore_3        
		if(s != null)
	//*   5   10:aload_3         
	//*   6   11:ifnull          29
			try
			{
				c = Integer.parseInt(s);
	//    7   14:aload_0         
	//    8   15:aload_3         
	//    9   16:invokestatic    #188 <Method int Integer.parseInt(String)>
	//   10   19:putfield        #44  <Field int c>
				hashmap.remove("ns_st_sp");
	//   11   22:aload_1         
	//   12   23:ldc1            #62  <String "ns_st_sp">
	//   13   25:invokevirtual   #191 <Method Object HashMap.remove(Object)>
	//   14   28:pop             
			}
	//*  15   29:aload_1         
	//*  16   30:ldc1            #76  <String "ns_st_bc">
	//*  17   32:invokevirtual   #182 <Method Object HashMap.get(Object)>
	//*  18   35:checkcast       #52  <Class String>
	//*  19   38:astore_3        
	//*  20   39:aload_3         
	//*  21   40:ifnull          58
	//*  22   43:aload_0         
	//*  23   44:aload_3         
	//*  24   45:invokestatic    #188 <Method int Integer.parseInt(String)>
	//*  25   48:putfield        #74  <Field int e>
	//*  26   51:aload_1         
	//*  27   52:ldc1            #76  <String "ns_st_bc">
	//*  28   54:invokevirtual   #191 <Method Object HashMap.remove(Object)>
	//*  29   57:pop             
	//*  30   58:aload_1         
	//*  31   59:ldc1            #47  <String "ns_st_bp">
	//*  32   61:invokevirtual   #182 <Method Object HashMap.get(Object)>
	//*  33   64:checkcast       #52  <Class String>
	//*  34   67:astore_3        
	//*  35   68:aload_3         
	//*  36   69:ifnull          87
	//*  37   72:aload_0         
	//*  38   73:aload_3         
	//*  39   74:invokestatic    #197 <Method long Long.parseLong(String)>
	//*  40   77:putfield        #199 <Field long f>
	//*  41   80:aload_1         
	//*  42   81:ldc1            #47  <String "ns_st_bp">
	//*  43   83:invokevirtual   #191 <Method Object HashMap.remove(Object)>
	//*  44   86:pop             
	//*  45   87:aload_1         
	//*  46   88:ldc1            #67  <String "ns_st_id">
	//*  47   90:invokevirtual   #182 <Method Object HashMap.get(Object)>
	//*  48   93:checkcast       #52  <Class String>
	//*  49   96:astore_3        
	//*  50   97:aload_3         
	//*  51   98:ifnull          113
	//*  52  101:aload_0         
	//*  53  102:aload_3         
	//*  54  103:putfield        #69  <Field String b>
	//*  55  106:aload_1         
	//*  56  107:ldc1            #67  <String "ns_st_id">
	//*  57  109:invokevirtual   #191 <Method Object HashMap.remove(Object)>
	//*  58  112:pop             
	//*  59  113:aload_2         
	//*  60  114:getstatic       #205 <Field StreamSenseState StreamSenseState.BUFFERING>
	//*  61  117:if_acmpeq       149
	//*  62  120:aload_1         
	//*  63  121:ldc1            #93  <String "ns_st_pa">
	//*  64  123:invokevirtual   #182 <Method Object HashMap.get(Object)>
	//*  65  126:checkcast       #52  <Class String>
	//*  66  129:astore_3        
	//*  67  130:aload_3         
	//*  68  131:ifnull          149
	//*  69  134:aload_0         
	//*  70  135:aload_3         
	//*  71  136:invokestatic    #197 <Method long Long.parseLong(String)>
	//*  72  139:putfield        #207 <Field long g>
	//*  73  142:aload_1         
	//*  74  143:ldc1            #93  <String "ns_st_pa">
	//*  75  145:invokevirtual   #191 <Method Object HashMap.remove(Object)>
	//*  76  148:pop             
	//*  77  149:aload_2         
	//*  78  150:getstatic       #210 <Field StreamSenseState StreamSenseState.PAUSED>
	//*  79  153:if_acmpeq       167
	//*  80  156:aload_2         
	//*  81  157:getstatic       #213 <Field StreamSenseState StreamSenseState.IDLE>
	//*  82  160:if_acmpeq       167
	//*  83  163:aload_2         
	//*  84  164:ifnonnull       196
	//*  85  167:aload_1         
	//*  86  168:ldc1            #97  <String "ns_st_pp">
	//*  87  170:invokevirtual   #182 <Method Object HashMap.get(Object)>
	//*  88  173:checkcast       #52  <Class String>
	//*  89  176:astore_2        
	//*  90  177:aload_2         
	//*  91  178:ifnull          196
	//*  92  181:aload_0         
	//*  93  182:aload_2         
	//*  94  183:invokestatic    #188 <Method int Integer.parseInt(String)>
	//*  95  186:putfield        #99  <Field int d>
	//*  96  189:aload_1         
	//*  97  190:ldc1            #97  <String "ns_st_pp">
	//*  98  192:invokevirtual   #191 <Method Object HashMap.remove(Object)>
	//*  99  195:pop             
	//* 100  196:return          
			catch(NumberFormatException numberformatexception) { }
	//  101  197:astore_3        
		s = (String)hashmap.get("ns_st_bc");
		if(s != null)
			try
			{
				e = Integer.parseInt(s);
				hashmap.remove("ns_st_bc");
			}
	//* 102  198:goto            29
			catch(NumberFormatException numberformatexception1) { }
	//  103  201:astore_3        
		s = (String)hashmap.get("ns_st_bp");
		if(s != null)
			try
			{
				f = Long.parseLong(s);
				hashmap.remove("ns_st_bp");
			}
	//* 104  202:goto            58
			catch(NumberFormatException numberformatexception2) { }
	//  105  205:astore_3        
		s = (String)hashmap.get("ns_st_id");
		if(s != null)
		{
			b = s;
			hashmap.remove("ns_st_id");
		}
		if(streamsensestate != StreamSenseState.BUFFERING)
		{
			String s1 = (String)hashmap.get("ns_st_pa");
			if(s1 != null)
				try
				{
					g = Long.parseLong(s1);
					hashmap.remove("ns_st_pa");
				}
	//* 106  206:goto            87
				catch(NumberFormatException numberformatexception3) { }
	//  107  209:astore_3        
		}
		if(streamsensestate != StreamSenseState.PAUSED && streamsensestate != StreamSenseState.IDLE && streamsensestate != null)
			break MISSING_BLOCK_LABEL_196;
		streamsensestate = ((StreamSenseState) ((String)hashmap.get("ns_st_pp")));
		if(streamsensestate == null)
			break MISSING_BLOCK_LABEL_196;
		d = Integer.parseInt(((String) (streamsensestate)));
		hashmap.remove("ns_st_pp");
		return;
	//* 108  210:goto            149
		hashmap;
	//  109  213:astore_1        
	//  110  214:return          
	}

	protected long c()
	{
		long l1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field long f>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(a.g() >= 0L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #27  <Field StreamSenseClip a>
	//*   7   11:invokevirtual   #170 <Method long StreamSenseClip.g()>
	//*   8   14:lconst_0        
	//*   9   15:lcmp            
	//*  10   16:iflt            33
			l = l1 + (System.currentTimeMillis() - a.g());
	//   11   19:lload_3         
	//   12   20:invokestatic    #218 <Method long System.currentTimeMillis()>
	//   13   23:aload_0         
	//   14   24:getfield        #27  <Field StreamSenseClip a>
	//   15   27:invokevirtual   #170 <Method long StreamSenseClip.g()>
	//   16   30:lsub            
	//   17   31:ladd            
	//   18   32:lstore_1        
		return l;
	//   19   33:lload_1         
	//   20   34:lreturn         
	}

	protected void c(int k)
	{
		e = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int e>
	//    3    5:return          
	}

	protected void c(long l)
	{
		f = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #199 <Field long f>
	//    3    5:return          
	}

	protected long d()
	{
		long l1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field long g>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(a.getPlaybackTimestamp() >= 0L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #27  <Field StreamSenseClip a>
	//*   7   11:invokevirtual   #150 <Method long StreamSenseClip.getPlaybackTimestamp()>
	//*   8   14:lconst_0        
	//*   9   15:lcmp            
	//*  10   16:iflt            33
			l = l1 + (System.currentTimeMillis() - a.getPlaybackTimestamp());
	//   11   19:lload_3         
	//   12   20:invokestatic    #218 <Method long System.currentTimeMillis()>
	//   13   23:aload_0         
	//   14   24:getfield        #27  <Field StreamSenseClip a>
	//   15   27:invokevirtual   #150 <Method long StreamSenseClip.getPlaybackTimestamp()>
	//   16   30:lsub            
	//   17   31:ladd            
	//   18   32:lstore_1        
		return l;
	//   19   33:lload_1         
	//   20   34:lreturn         
	}

	protected void d(int k)
	{
		i = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #220 <Field int i>
	//    3    5:return          
	}

	protected void d(long l)
	{
		g = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #207 <Field long g>
	//    3    5:return          
	}

	protected int e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int d>
	//    2    4:ireturn         
	}

	protected void f()
	{
		d = d + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #99  <Field int d>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #99  <Field int d>
		a.b();
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field StreamSenseClip a>
	//    8   14:invokevirtual   #222 <Method void StreamSenseClip.b()>
	//    9   17:return          
	}

	protected int g()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int e>
	//    2    4:ireturn         
	}

	public StreamSenseClip getClip()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field StreamSenseClip a>
	//    2    4:areturn         
	}

	public String getLabel(String s)
	{
		return (String)h.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field HashMap h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #182 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #52  <Class String>
	//    5   11:areturn         
	}

	public HashMap getLabels()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field HashMap h>
	//    2    4:areturn         
	}

	public String getPlaylistId()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String b>
	//    2    4:areturn         
	}

	protected void h()
	{
		e = e + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #74  <Field int e>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #74  <Field int e>
	//    6   10:return          
	}

	protected void i()
	{
		i = i + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #220 <Field int i>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #220 <Field int i>
	//    6   10:return          
	}

	protected boolean j()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean j>
	//    2    4:ireturn         
	}

	public void reset()
	{
		reset(((Set) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #231 <Method void reset(Set)>
	//    3    5:return          
	}

	public void reset(Set set)
	{
		if(set != null && !set.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #236 <Method boolean Set.isEmpty()>
	//*   4   10:ifne            24
			StreamSenseUtils.filterMap(((java.util.Map) (h)), set);
	//    5   13:aload_0         
	//    6   14:getfield        #37  <Field HashMap h>
	//    7   17:aload_1         
	//    8   18:invokestatic    #242 <Method void StreamSenseUtils.filterMap(java.util.Map, Set)>
		else
	//*   9   21:goto            31
			h.clear();
	//   10   24:aload_0         
	//   11   25:getfield        #37  <Field HashMap h>
	//   12   28:invokevirtual   #245 <Method void HashMap.clear()>
		set = ((Set) (new StringBuilder()));
	//   13   31:new             #126 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #127 <Method void StringBuilder()>
	//   16   38:astore_1        
		((StringBuilder) (set)).append(System.currentTimeMillis());
	//   17   39:aload_1         
	//   18   40:invokestatic    #218 <Method long System.currentTimeMillis()>
	//   19   43:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//   20   46:pop             
		((StringBuilder) (set)).append("_");
	//   21   47:aload_1         
	//   22   48:ldc1            #247 <String "_">
	//   23   50:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:pop             
		((StringBuilder) (set)).append(i);
	//   25   54:aload_1         
	//   26   55:aload_0         
	//   27   56:getfield        #220 <Field int i>
	//   28   59:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   29   62:pop             
		setPlaylistId(((StringBuilder) (set)).toString());
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   33   68:invokevirtual   #254 <Method void setPlaylistId(String)>
		c(0L);
	//   34   71:aload_0         
	//   35   72:lconst_0        
	//   36   73:invokevirtual   #176 <Method void c(long)>
		d(0L);
	//   37   76:aload_0         
	//   38   77:lconst_0        
	//   39   78:invokevirtual   #160 <Method void d(long)>
		b(0);
	//   40   81:aload_0         
	//   41   82:iconst_0        
	//   42   83:invokevirtual   #256 <Method void b(int)>
		a(0);
	//   43   86:aload_0         
	//   44   87:iconst_0        
	//   45   88:invokevirtual   #258 <Method void a(int)>
		c(0);
	//   46   91:aload_0         
	//   47   92:iconst_0        
	//   48   93:invokevirtual   #260 <Method void c(int)>
		j = false;
	//   49   96:aload_0         
	//   50   97:iconst_0        
	//   51   98:putfield        #29  <Field boolean j>
	//   52  101:return          
	}

	public void setLabel(String s, String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #34  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void HashMap()>
	//    3    7:astore_3        
		hashmap.put(((Object) (s)), ((Object) (s1)));
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//    8   14:pop             
		a(hashmap, ((StreamSenseState) (null)));
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:aconst_null     
	//   12   18:invokevirtual   #265 <Method void a(HashMap, StreamSenseState)>
	//   13   21:return          
	}

	public void setLabels(HashMap hashmap)
	{
		a(hashmap, ((StreamSenseState) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #265 <Method void a(HashMap, StreamSenseState)>
	//    4    6:return          
	}

	public void setPlaylistId(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field String b>
	//    3    5:return          
	}

	private StreamSenseClip a;
	private String b;
	private int c;
	private int d;
	private int e;
	private long f;
	private long g;
	private HashMap h;
	private int i;
	private boolean j;
}
