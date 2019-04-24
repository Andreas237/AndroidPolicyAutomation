// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import com.comscore.utils.Utils;
import java.util.HashMap;
import java.util.Set;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseEventType, StreamSenseState, StreamSenseUtils

public class StreamSenseClip
{

	public StreamSenseClip()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #23  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void HashMap()>
	//    6   12:putfield        #26  <Field HashMap a>
		reset();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #29  <Method void reset()>
	//    9   19:return          
	}

	private void a(String s, HashMap hashmap)
	{
		hashmap = ((HashMap) ((String)hashmap.get(((Object) (s)))));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//    3    5:checkcast       #37  <Class String>
	//    4    8:astore_2        
		if(hashmap != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          23
			a.put(((Object) (s)), ((Object) (hashmap)));
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field HashMap a>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   12   22:pop             
	//   13   23:return          
	}

	protected int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int b>
	//    2    4:ireturn         
	}

	protected HashMap a(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
	{
		if(hashmap == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          7
	//*   2    4:goto            15
			hashmap = new HashMap();
	//    3    7:new             #23  <Class HashMap>
	//    4   10:dup             
	//    5   11:invokespecial   #24  <Method void HashMap()>
	//    6   14:astore_2        
		hashmap.put("ns_st_cn", ((Object) (getClipId())));
	//    7   15:aload_2         
	//    8   16:ldc1            #49  <String "ns_st_cn">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #53  <Method String getClipId()>
	//   11   22:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   12   25:pop             
		hashmap.put("ns_st_bt", ((Object) (String.valueOf(e()))));
	//   13   26:aload_2         
	//   14   27:ldc1            #55  <String "ns_st_bt">
	//   15   29:aload_0         
	//   16   30:invokevirtual   #58  <Method long e()>
	//   17   33:invokestatic    #62  <Method String String.valueOf(long)>
	//   18   36:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   19   39:pop             
		if(streamsenseeventtype == StreamSenseEventType.PLAY || streamsenseeventtype == null)
	//*  20   40:aload_1         
	//*  21   41:getstatic       #68  <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//*  22   44:if_acmpeq       51
	//*  23   47:aload_1         
	//*  24   48:ifnonnull       65
			hashmap.put("ns_st_sq", ((Object) (String.valueOf(c))));
	//   25   51:aload_2         
	//   26   52:ldc1            #70  <String "ns_st_sq">
	//   27   54:aload_0         
	//   28   55:getfield        #72  <Field int c>
	//   29   58:invokestatic    #75  <Method String String.valueOf(int)>
	//   30   61:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   31   64:pop             
		if(streamsenseeventtype == StreamSenseEventType.PAUSE || streamsenseeventtype == StreamSenseEventType.END || streamsenseeventtype == StreamSenseEventType.KEEP_ALIVE || streamsenseeventtype == StreamSenseEventType.HEART_BEAT || streamsenseeventtype == null)
	//*  32   65:aload_1         
	//*  33   66:getstatic       #78  <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//*  34   69:if_acmpeq       97
	//*  35   72:aload_1         
	//*  36   73:getstatic       #81  <Field StreamSenseEventType StreamSenseEventType.END>
	//*  37   76:if_acmpeq       97
	//*  38   79:aload_1         
	//*  39   80:getstatic       #84  <Field StreamSenseEventType StreamSenseEventType.KEEP_ALIVE>
	//*  40   83:if_acmpeq       97
	//*  41   86:aload_1         
	//*  42   87:getstatic       #87  <Field StreamSenseEventType StreamSenseEventType.HEART_BEAT>
	//*  43   90:if_acmpeq       97
	//*  44   93:aload_1         
	//*  45   94:ifnonnull       125
		{
			hashmap.put("ns_st_pt", ((Object) (String.valueOf(f()))));
	//   46   97:aload_2         
	//   47   98:ldc1            #89  <String "ns_st_pt">
	//   48  100:aload_0         
	//   49  101:invokevirtual   #91  <Method long f()>
	//   50  104:invokestatic    #62  <Method String String.valueOf(long)>
	//   51  107:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   52  110:pop             
			hashmap.put("ns_st_pc", ((Object) (String.valueOf(b))));
	//   53  111:aload_2         
	//   54  112:ldc1            #93  <String "ns_st_pc">
	//   55  114:aload_0         
	//   56  115:getfield        #46  <Field int b>
	//   57  118:invokestatic    #75  <Method String String.valueOf(int)>
	//   58  121:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   59  124:pop             
		}
		hashmap.putAll(((java.util.Map) (getLabels())));
	//   60  125:aload_2         
	//   61  126:aload_0         
	//   62  127:invokevirtual   #97  <Method HashMap getLabels()>
	//   63  130:invokevirtual   #101 <Method void HashMap.putAll(java.util.Map)>
		return hashmap;
	//   64  133:aload_2         
	//   65  134:areturn         
	}

	protected void a(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field int b>
	//    3    5:return          
	}

	protected void a(long l)
	{
		d = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #106 <Field long d>
	//    3    5:return          
	}

	protected void a(HashMap hashmap, StreamSenseState streamsensestate)
	{
		if(hashmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			a.putAll(((java.util.Map) (hashmap)));
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field HashMap a>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #101 <Method void HashMap.putAll(java.util.Map)>
		b(a, streamsensestate);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field HashMap a>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #109 <Method void b(HashMap, StreamSenseState)>
	//   11   21:return          
	}

	protected void b()
	{
		b = b + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field int b>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #46  <Field int b>
	//    6   10:return          
	}

	protected void b(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int c>
	//    3    5:return          
	}

	protected void b(long l)
	{
		f = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #112 <Field long f>
	//    3    5:return          
	}

	protected void b(HashMap hashmap, StreamSenseState streamsensestate)
	{
		String s = (String)hashmap.get("ns_st_cn");
	//    0    0:aload_1         
	//    1    1:ldc1            #49  <String "ns_st_cn">
	//    2    3:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//    3    6:checkcast       #37  <Class String>
	//    4    9:astore_3        
		if(s != null)
	//*   5   10:aload_3         
	//*   6   11:ifnull          26
		{
			setClipId(s);
	//    7   14:aload_0         
	//    8   15:aload_3         
	//    9   16:invokevirtual   #118 <Method void setClipId(String)>
			hashmap.remove("ns_st_cn");
	//   10   19:aload_1         
	//   11   20:ldc1            #49  <String "ns_st_cn">
	//   12   22:invokevirtual   #121 <Method Object HashMap.remove(Object)>
	//   13   25:pop             
		}
		s = (String)hashmap.get("ns_st_bt");
	//   14   26:aload_1         
	//   15   27:ldc1            #55  <String "ns_st_bt">
	//   16   29:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//   17   32:checkcast       #37  <Class String>
	//   18   35:astore_3        
		if(s != null)
	//*  19   36:aload_3         
	//*  20   37:ifnull          55
			try
			{
				d = Long.parseLong(s);
	//   21   40:aload_0         
	//   22   41:aload_3         
	//   23   42:invokestatic    #127 <Method long Long.parseLong(String)>
	//   24   45:putfield        #106 <Field long d>
				hashmap.remove("ns_st_bt");
	//   25   48:aload_1         
	//   26   49:ldc1            #55  <String "ns_st_bt">
	//   27   51:invokevirtual   #121 <Method Object HashMap.remove(Object)>
	//   28   54:pop             
			}
	//*  29   55:aload_0         
	//*  30   56:ldc1            #129 <String "ns_st_cl">
	//*  31   58:aload_1         
	//*  32   59:invokespecial   #131 <Method void a(String, HashMap)>
	//*  33   62:aload_0         
	//*  34   63:ldc1            #133 <String "ns_st_pn">
	//*  35   65:aload_1         
	//*  36   66:invokespecial   #131 <Method void a(String, HashMap)>
	//*  37   69:aload_0         
	//*  38   70:ldc1            #135 <String "ns_st_tp">
	//*  39   72:aload_1         
	//*  40   73:invokespecial   #131 <Method void a(String, HashMap)>
	//*  41   76:aload_0         
	//*  42   77:ldc1            #137 <String "ns_st_ub">
	//*  43   79:aload_1         
	//*  44   80:invokespecial   #131 <Method void a(String, HashMap)>
	//*  45   83:aload_0         
	//*  46   84:ldc1            #139 <String "ns_st_br">
	//*  47   86:aload_1         
	//*  48   87:invokespecial   #131 <Method void a(String, HashMap)>
	//*  49   90:aload_2         
	//*  50   91:getstatic       #145 <Field StreamSenseState StreamSenseState.PLAYING>
	//*  51   94:if_acmpeq       101
	//*  52   97:aload_2         
	//*  53   98:ifnonnull       130
	//*  54  101:aload_1         
	//*  55  102:ldc1            #70  <String "ns_st_sq">
	//*  56  104:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//*  57  107:checkcast       #37  <Class String>
	//*  58  110:astore_3        
	//*  59  111:aload_3         
	//*  60  112:ifnull          130
	//*  61  115:aload_0         
	//*  62  116:aload_3         
	//*  63  117:invokestatic    #151 <Method int Integer.parseInt(String)>
	//*  64  120:putfield        #72  <Field int c>
	//*  65  123:aload_1         
	//*  66  124:ldc1            #70  <String "ns_st_sq">
	//*  67  126:invokevirtual   #121 <Method Object HashMap.remove(Object)>
	//*  68  129:pop             
	//*  69  130:aload_2         
	//*  70  131:getstatic       #154 <Field StreamSenseState StreamSenseState.BUFFERING>
	//*  71  134:if_acmpeq       166
	//*  72  137:aload_1         
	//*  73  138:ldc1            #89  <String "ns_st_pt">
	//*  74  140:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//*  75  143:checkcast       #37  <Class String>
	//*  76  146:astore_3        
	//*  77  147:aload_3         
	//*  78  148:ifnull          166
	//*  79  151:aload_0         
	//*  80  152:aload_3         
	//*  81  153:invokestatic    #127 <Method long Long.parseLong(String)>
	//*  82  156:putfield        #112 <Field long f>
	//*  83  159:aload_1         
	//*  84  160:ldc1            #89  <String "ns_st_pt">
	//*  85  162:invokevirtual   #121 <Method Object HashMap.remove(Object)>
	//*  86  165:pop             
	//*  87  166:aload_2         
	//*  88  167:getstatic       #157 <Field StreamSenseState StreamSenseState.PAUSED>
	//*  89  170:if_acmpeq       184
	//*  90  173:aload_2         
	//*  91  174:getstatic       #160 <Field StreamSenseState StreamSenseState.IDLE>
	//*  92  177:if_acmpeq       184
	//*  93  180:aload_2         
	//*  94  181:ifnonnull       213
	//*  95  184:aload_1         
	//*  96  185:ldc1            #93  <String "ns_st_pc">
	//*  97  187:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//*  98  190:checkcast       #37  <Class String>
	//*  99  193:astore_2        
	//* 100  194:aload_2         
	//* 101  195:ifnull          213
	//* 102  198:aload_0         
	//* 103  199:aload_2         
	//* 104  200:invokestatic    #151 <Method int Integer.parseInt(String)>
	//* 105  203:putfield        #46  <Field int b>
	//* 106  206:aload_1         
	//* 107  207:ldc1            #93  <String "ns_st_pc">
	//* 108  209:invokevirtual   #121 <Method Object HashMap.remove(Object)>
	//* 109  212:pop             
	//* 110  213:return          
			catch(NumberFormatException numberformatexception) { }
	//  111  214:astore_3        
		a("ns_st_cl", hashmap);
		a("ns_st_pn", hashmap);
		a("ns_st_tp", hashmap);
		a("ns_st_ub", hashmap);
		a("ns_st_br", hashmap);
		if(streamsensestate == StreamSenseState.PLAYING || streamsensestate == null)
		{
			String s1 = (String)hashmap.get("ns_st_sq");
			if(s1 != null)
				try
				{
					c = Integer.parseInt(s1);
					hashmap.remove("ns_st_sq");
				}
	//* 112  215:goto            55
				catch(NumberFormatException numberformatexception1) { }
	//  113  218:astore_3        
		}
		if(streamsensestate != StreamSenseState.BUFFERING)
		{
			s1 = (String)hashmap.get("ns_st_pt");
			if(s1 != null)
				try
				{
					f = Long.parseLong(s1);
					hashmap.remove("ns_st_pt");
				}
	//* 114  219:goto            130
				catch(NumberFormatException numberformatexception2) { }
	//  115  222:astore_3        
		}
		if(streamsensestate != StreamSenseState.PAUSED && streamsensestate != StreamSenseState.IDLE && streamsensestate != null)
			break MISSING_BLOCK_LABEL_213;
		streamsensestate = ((StreamSenseState) ((String)hashmap.get("ns_st_pc")));
		if(streamsensestate == null)
			break MISSING_BLOCK_LABEL_213;
		b = Integer.parseInt(((String) (streamsensestate)));
		hashmap.remove("ns_st_pc");
		return;
	//* 116  223:goto            166
		hashmap;
	//  117  226:astore_1        
	//  118  227:return          
	}

	protected int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int c>
	//    2    4:ireturn         
	}

	protected void c(long l)
	{
		g = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #162 <Field long g>
	//    3    5:return          
	}

	protected void d()
	{
		c = c + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field int c>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #72  <Field int c>
	//    6   10:return          
	}

	protected void d(long l)
	{
		e = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #164 <Field long e>
	//    3    5:return          
	}

	protected long e()
	{
		long l1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field long d>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(e >= 0L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #164 <Field long e>
	//*   7   11:lconst_0        
	//*   8   12:lcmp            
	//*   9   13:iflt            27
			l = l1 + (System.currentTimeMillis() - e);
	//   10   16:lload_3         
	//   11   17:invokestatic    #169 <Method long System.currentTimeMillis()>
	//   12   20:aload_0         
	//   13   21:getfield        #164 <Field long e>
	//   14   24:lsub            
	//   15   25:ladd            
	//   16   26:lstore_1        
		return l;
	//   17   27:lload_1         
	//   18   28:lreturn         
	}

	protected long f()
	{
		long l1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field long f>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(g >= 0L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #162 <Field long g>
	//*   7   11:lconst_0        
	//*   8   12:lcmp            
	//*   9   13:iflt            27
			l = l1 + (System.currentTimeMillis() - g);
	//   10   16:lload_3         
	//   11   17:invokestatic    #169 <Method long System.currentTimeMillis()>
	//   12   20:aload_0         
	//   13   21:getfield        #162 <Field long g>
	//   14   24:lsub            
	//   15   25:ladd            
	//   16   26:lstore_1        
		return l;
	//   17   27:lload_1         
	//   18   28:lreturn         
	}

	protected long g()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field long e>
	//    2    4:lreturn         
	}

	public String getClipId()
	{
		if(Utils.isEmpty(h))
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field String h>
	//*   2    4:invokestatic    #177 <Method boolean Utils.isEmpty(String)>
	//*   3    7:ifeq            16
			setClipId("1");
	//    4   10:aload_0         
	//    5   11:ldc1            #179 <String "1">
	//    6   13:invokevirtual   #118 <Method void setClipId(String)>
		return h;
	//    7   16:aload_0         
	//    8   17:getfield        #171 <Field String h>
	//    9   20:areturn         
	}

	public String getLabel(String s)
	{
		return (String)a.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field HashMap a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #37  <Class String>
	//    5   11:areturn         
	}

	public HashMap getLabels()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field HashMap a>
	//    2    4:areturn         
	}

	public long getPlaybackTimestamp()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field long g>
	//    2    4:lreturn         
	}

	public void reset()
	{
		reset(((Set) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #186 <Method void reset(Set)>
	//    3    5:return          
	}

	public void reset(Set set)
	{
		if(set != null && !set.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #191 <Method boolean Set.isEmpty()>
	//*   4   10:ifne            24
			StreamSenseUtils.filterMap(((java.util.Map) (a)), set);
	//    5   13:aload_0         
	//    6   14:getfield        #26  <Field HashMap a>
	//    7   17:aload_1         
	//    8   18:invokestatic    #197 <Method void StreamSenseUtils.filterMap(java.util.Map, Set)>
		else
	//*   9   21:goto            31
			a.clear();
	//   10   24:aload_0         
	//   11   25:getfield        #26  <Field HashMap a>
	//   12   28:invokevirtual   #200 <Method void HashMap.clear()>
		if(!a.containsKey("ns_st_cl"))
	//*  13   31:aload_0         
	//*  14   32:getfield        #26  <Field HashMap a>
	//*  15   35:ldc1            #129 <String "ns_st_cl">
	//*  16   37:invokevirtual   #204 <Method boolean HashMap.containsKey(Object)>
	//*  17   40:ifne            55
			a.put("ns_st_cl", "0");
	//   18   43:aload_0         
	//   19   44:getfield        #26  <Field HashMap a>
	//   20   47:ldc1            #129 <String "ns_st_cl">
	//   21   49:ldc1            #206 <String "0">
	//   22   51:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   23   54:pop             
		if(!a.containsKey("ns_st_pn"))
	//*  24   55:aload_0         
	//*  25   56:getfield        #26  <Field HashMap a>
	//*  26   59:ldc1            #133 <String "ns_st_pn">
	//*  27   61:invokevirtual   #204 <Method boolean HashMap.containsKey(Object)>
	//*  28   64:ifne            79
			a.put("ns_st_pn", "1");
	//   29   67:aload_0         
	//   30   68:getfield        #26  <Field HashMap a>
	//   31   71:ldc1            #133 <String "ns_st_pn">
	//   32   73:ldc1            #179 <String "1">
	//   33   75:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   34   78:pop             
		if(!a.containsKey("ns_st_tp"))
	//*  35   79:aload_0         
	//*  36   80:getfield        #26  <Field HashMap a>
	//*  37   83:ldc1            #135 <String "ns_st_tp">
	//*  38   85:invokevirtual   #204 <Method boolean HashMap.containsKey(Object)>
	//*  39   88:ifne            103
			a.put("ns_st_tp", "1");
	//   40   91:aload_0         
	//   41   92:getfield        #26  <Field HashMap a>
	//   42   95:ldc1            #135 <String "ns_st_tp">
	//   43   97:ldc1            #179 <String "1">
	//   44   99:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//   45  102:pop             
		a(0);
	//   46  103:aload_0         
	//   47  104:iconst_0        
	//   48  105:invokevirtual   #208 <Method void a(int)>
		b(0);
	//   49  108:aload_0         
	//   50  109:iconst_0        
	//   51  110:invokevirtual   #210 <Method void b(int)>
		a(0L);
	//   52  113:aload_0         
	//   53  114:lconst_0        
	//   54  115:invokevirtual   #212 <Method void a(long)>
		d(-1L);
	//   55  118:aload_0         
	//   56  119:ldc2w           #213 <Long -1L>
	//   57  122:invokevirtual   #216 <Method void d(long)>
		b(0L);
	//   58  125:aload_0         
	//   59  126:lconst_0        
	//   60  127:invokevirtual   #218 <Method void b(long)>
		c(-1L);
	//   61  130:aload_0         
	//   62  131:ldc2w           #213 <Long -1L>
	//   63  134:invokevirtual   #220 <Method void c(long)>
	//   64  137:return          
	}

	public void setClipId(String s)
	{
		h = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #171 <Field String h>
	//    3    5:return          
	}

	public void setLabel(String s, String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #23  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:astore_3        
		hashmap.put(((Object) (s)), ((Object) (s1)));
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #41  <Method Object HashMap.put(Object, Object)>
	//    8   14:pop             
		a(hashmap, ((StreamSenseState) (null)));
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:aconst_null     
	//   12   18:invokevirtual   #225 <Method void a(HashMap, StreamSenseState)>
	//   13   21:return          
	}

	public void setLabels(HashMap hashmap)
	{
		a(hashmap, ((StreamSenseState) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #225 <Method void a(HashMap, StreamSenseState)>
	//    4    6:return          
	}

	HashMap a;
	private int b;
	private int c;
	private long d;
	private long e;
	private long f;
	private long g;
	private String h;
}
