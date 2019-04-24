// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming.plugin;

import android.util.Log;
import com.comscore.analytics.Core;
import com.comscore.streaming.*;
import com.comscore.utils.task.TaskExecutor;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.comscore.streaming.plugin:
//			a, StreamSensePluginListener, StreamSensePlayer

public class StreamSensePlugin extends StreamSense
{

	public StreamSensePlugin(HashMap hashmap, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void StreamSense()>
		b = "1.0.1";
	//    2    4:aload_0         
	//    3    5:ldc1            #140 <String "1.0.1">
	//    4    7:putfield        #142 <Field String b>
		c = 10;
	//    5   10:aload_0         
	//    6   11:bipush          10
	//    7   13:putfield        #144 <Field int c>
		d = 500;
	//    8   16:aload_0         
	//    9   17:sipush          500
	//   10   20:putfield        #146 <Field int d>
		f = 1.25F;
	//   11   23:aload_0         
	//   12   24:ldc1            #147 <Float 1.25F>
	//   13   26:putfield        #149 <Field float f>
		g = 2;
	//   14   29:aload_0         
	//   15   30:iconst_2        
	//   16   31:putfield        #151 <Field int g>
		h = 300;
	//   17   34:aload_0         
	//   18   35:sipush          300
	//   19   38:putfield        #153 <Field int h>
		i = 6;
	//   20   41:aload_0         
	//   21   42:bipush          6
	//   22   44:putfield        #155 <Field int i>
		k = ((List) (new ArrayList()));
	//   23   47:aload_0         
	//   24   48:new             #157 <Class ArrayList>
	//   25   51:dup             
	//   26   52:invokespecial   #158 <Method void ArrayList()>
	//   27   55:putfield        #160 <Field List k>
		l = ((List) (new ArrayList()));
	//   28   58:aload_0         
	//   29   59:new             #157 <Class ArrayList>
	//   30   62:dup             
	//   31   63:invokespecial   #158 <Method void ArrayList()>
	//   32   66:putfield        #162 <Field List l>
		m = 0L;
	//   33   69:aload_0         
	//   34   70:lconst_0        
	//   35   71:putfield        #164 <Field long m>
		n = false;
	//   36   74:aload_0         
	//   37   75:iconst_0        
	//   38   76:putfield        #166 <Field boolean n>
		o = ((List) (new ArrayList()));
	//   39   79:aload_0         
	//   40   80:new             #157 <Class ArrayList>
	//   41   83:dup             
	//   42   84:invokespecial   #158 <Method void ArrayList()>
	//   43   87:putfield        #168 <Field List o>
		p = false;
	//   44   90:aload_0         
	//   45   91:iconst_0        
	//   46   92:putfield        #170 <Field boolean p>
		q = false;
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:putfield        #172 <Field boolean q>
		r = false;
	//   50  100:aload_0         
	//   51  101:iconst_0        
	//   52  102:putfield        #174 <Field boolean r>
		s = false;
	//   53  105:aload_0         
	//   54  106:iconst_0        
	//   55  107:putfield        #176 <Field boolean s>
		t = false;
	//   56  110:aload_0         
	//   57  111:iconst_0        
	//   58  112:putfield        #178 <Field boolean t>
		v = false;
	//   59  115:aload_0         
	//   60  116:iconst_0        
	//   61  117:putfield        #180 <Field boolean v>
		w = false;
	//   62  120:aload_0         
	//   63  121:iconst_0        
	//   64  122:putfield        #182 <Field boolean w>
		x = false;
	//   65  125:aload_0         
	//   66  126:iconst_0        
	//   67  127:putfield        #184 <Field boolean x>
		y = new HashMap();
	//   68  130:aload_0         
	//   69  131:new             #186 <Class HashMap>
	//   70  134:dup             
	//   71  135:invokespecial   #187 <Method void HashMap()>
	//   72  138:putfield        #189 <Field HashMap y>
		z = new HashMap();
	//   73  141:aload_0         
	//   74  142:new             #186 <Class HashMap>
	//   75  145:dup             
	//   76  146:invokespecial   #187 <Method void HashMap()>
	//   77  149:putfield        #191 <Field HashMap z>
		A = new HashMap();
	//   78  152:aload_0         
	//   79  153:new             #186 <Class HashMap>
	//   80  156:dup             
	//   81  157:invokespecial   #187 <Method void HashMap()>
	//   82  160:putfield        #193 <Field HashMap A>
		B = false;
	//   83  163:aload_0         
	//   84  164:iconst_0        
	//   85  165:putfield        #195 <Field boolean B>
		C = false;
	//   86  168:aload_0         
	//   87  169:iconst_0        
	//   88  170:putfield        #197 <Field boolean C>
		D = false;
	//   89  173:aload_0         
	//   90  174:iconst_0        
	//   91  175:putfield        #199 <Field boolean D>
	//   92  178:aload_0         
	//   93  179:ldc1            #201 <String "_all_">
	//   94  181:putfield        #203 <Field String E>
		F = null;
	//   95  184:aload_0         
	//   96  185:aconst_null     
	//   97  186:putfield        #205 <Field String[] F>
		G = -1;
	//   98  189:aload_0         
	//   99  190:iconst_m1       
	//  100  191:putfield        #207 <Field int G>
		H = null;
	//  101  194:aload_0         
	//  102  195:aconst_null     
	//  103  196:putfield        #209 <Field String[] H>
		I = -1;
	//  104  199:aload_0         
	//  105  200:iconst_m1       
	//  106  201:putfield        #211 <Field int I>
		J = new HashMap();
	//  107  204:aload_0         
	//  108  205:new             #186 <Class HashMap>
	//  109  208:dup             
	//  110  209:invokespecial   #187 <Method void HashMap()>
	//  111  212:putfield        #213 <Field HashMap J>
		if(hashmap != null && hashmap.size() > 0)
	//* 112  215:aload_1         
	//* 113  216:ifnull          231
	//* 114  219:aload_1         
	//* 115  220:invokevirtual   #217 <Method int HashMap.size()>
	//* 116  223:ifle            231
			b(hashmap);
	//  117  226:aload_0         
	//  118  227:aload_1         
	//  119  228:invokespecial   #220 <Method void b(HashMap)>
		setLabel("ns_st_mp", s1, true);
	//  120  231:aload_0         
	//  121  232:ldc1            #222 <String "ns_st_mp">
	//  122  234:aload_2         
	//  123  235:iconst_1        
	//  124  236:invokevirtual   #226 <Method void setLabel(String, String, boolean)>
		setLabel("ns_st_pv", s2, true);
	//  125  239:aload_0         
	//  126  240:ldc1            #228 <String "ns_st_pv">
	//  127  242:aload_3         
	//  128  243:iconst_1        
	//  129  244:invokevirtual   #226 <Method void setLabel(String, String, boolean)>
		setLabel("ns_st_mv", s3, true);
	//  130  247:aload_0         
	//  131  248:ldc1            #230 <String "ns_st_mv">
	//  132  250:aload           4
	//  133  252:iconst_1        
	//  134  253:invokevirtual   #226 <Method void setLabel(String, String, boolean)>
	//  135  256:return          
	}

	private long a(int i1)
	{
		return ((Long)k.get(k.size() - 1 - i1)).longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field List k>
	//    2    4:aload_0         
	//    3    5:getfield        #160 <Field List k>
	//    4    8:invokeinterface #237 <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:iload_1         
	//    8   16:isub            
	//    9   17:invokeinterface #241 <Method Object List.get(int)>
	//   10   22:checkcast       #243 <Class Long>
	//   11   25:invokevirtual   #247 <Method long Long.longValue()>
	//   12   28:lreturn         
	}

	static long a(StreamSensePlugin streamsenseplugin, int i1)
	{
		return streamsenseplugin.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #250 <Method long a(int)>
	//    3    5:lreturn         
	}

	private HashMap a(HashMap hashmap, HashMap hashmap1)
	{
		Object obj1 = ((Object) (new HashMap()));
	//    0    0:new             #186 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void HashMap()>
	//    3    7:astore          7
		Object obj = obj1;
	//    4    9:aload           7
	//    5   11:astore          6
		if(hashmap1 != null)
	//*   6   13:aload_2         
	//*   7   14:ifnull          38
		{
			obj = obj1;
	//    8   17:aload           7
	//    9   19:astore          6
			if(hashmap1.size() > 0)
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #217 <Method int HashMap.size()>
	//*  12   25:ifle            38
				obj = ((Object) (new HashMap(((java.util.Map) (hashmap1)))));
	//   13   28:new             #186 <Class HashMap>
	//   14   31:dup             
	//   15   32:aload_2         
	//   16   33:invokespecial   #254 <Method void HashMap(java.util.Map)>
	//   17   36:astore          6
		}
		hashmap1 = ((HashMap) (H));
	//   18   38:aload_0         
	//   19   39:getfield        #209 <Field String[] H>
	//   20   42:astore_2        
		boolean flag = true;
	//   21   43:iconst_1        
	//   22   44:istore_3        
		if(hashmap1 == null || H.length != 1 || !H[0].equals("_all_"))
	//*  23   45:aload_2         
	//*  24   46:ifnull          75
	//*  25   49:aload_0         
	//*  26   50:getfield        #209 <Field String[] H>
	//*  27   53:arraylength     
	//*  28   54:iconst_1        
	//*  29   55:icmpne          75
	//*  30   58:aload_0         
	//*  31   59:getfield        #209 <Field String[] H>
	//*  32   62:iconst_0        
	//*  33   63:aaload          
	//*  34   64:ldc1            #201 <String "_all_">
	//*  35   66:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  36   69:ifeq            75
	//*  37   72:goto            77
			flag = false;
	//   38   75:iconst_0        
	//   39   76:istore_3        
		obj1 = obj;
	//   40   77:aload           6
	//   41   79:astore          7
		if(hashmap.size() > 0)
	//*  42   81:aload_1         
	//*  43   82:invokevirtual   #217 <Method int HashMap.size()>
	//*  44   85:ifle            255
		{
			hashmap1 = ((HashMap) (obj));
	//   45   88:aload           6
	//   46   90:astore_2        
			if(!flag)
	//*  47   91:iload_3         
	//*  48   92:ifne            143
				if(((HashMap) (obj)).size() > 0)
	//*  49   95:aload           6
	//*  50   97:invokevirtual   #217 <Method int HashMap.size()>
	//*  51  100:ifle            128
				{
					((HashMap) (obj)).putAll(((java.util.Map) (c((HashMap)hashmap.get("")))));
	//   52  103:aload           6
	//   53  105:aload_0         
	//   54  106:aload_1         
	//   55  107:ldc2            #262 <String "">
	//   56  110:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   57  113:checkcast       #186 <Class HashMap>
	//   58  116:invokespecial   #268 <Method HashMap c(HashMap)>
	//   59  119:invokevirtual   #271 <Method void HashMap.putAll(java.util.Map)>
					hashmap1 = ((HashMap) (obj));
	//   60  122:aload           6
	//   61  124:astore_2        
				} else
	//*  62  125:goto            143
				{
					hashmap1 = c((HashMap)hashmap.get(""));
	//   63  128:aload_0         
	//   64  129:aload_1         
	//   65  130:ldc2            #262 <String "">
	//   66  133:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   67  136:checkcast       #186 <Class HashMap>
	//   68  139:invokespecial   #268 <Method HashMap c(HashMap)>
	//   69  142:astore_2        
				}
			obj = ((Object) (((HashMap)hashmap.get("")).keySet().iterator()));
	//   70  143:aload_1         
	//   71  144:ldc2            #262 <String "">
	//   72  147:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   73  150:checkcast       #186 <Class HashMap>
	//   74  153:invokevirtual   #275 <Method Set HashMap.keySet()>
	//   75  156:invokeinterface #281 <Method Iterator Set.iterator()>
	//   76  161:astore          6
			do
			{
				obj1 = ((Object) (hashmap1));
	//   77  163:aload_2         
	//   78  164:astore          7
				if(!((Iterator) (obj)).hasNext())
					break;
	//   79  166:aload           6
	//   80  168:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//   81  173:ifeq            255
				obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//   82  176:aload           6
	//   83  178:invokeinterface #291 <Method Object Iterator.next()>
	//   84  183:checkcast       #256 <Class String>
	//   85  186:astore          7
				boolean flag1 = Pattern.compile("^([Cc][A-Da-d]_)?ns_st_.+").matcher(((CharSequence) (obj1))).find();
	//   86  188:ldc2            #293 <String "^([Cc][A-Da-d]_)?ns_st_.+">
	//   87  191:invokestatic    #299 <Method Pattern Pattern.compile(String)>
	//   88  194:aload           7
	//   89  196:invokevirtual   #303 <Method Matcher Pattern.matcher(CharSequence)>
	//   90  199:invokevirtual   #308 <Method boolean Matcher.find()>
	//   91  202:istore          4
				boolean flag2 = Pattern.compile("^[Cc][A-Da-d]?([1-9]|1[0-9]|20)$").matcher(((CharSequence) (obj1))).find();
	//   92  204:ldc2            #310 <String "^[Cc][A-Da-d]?([1-9]|1[0-9]|20)$">
	//   93  207:invokestatic    #299 <Method Pattern Pattern.compile(String)>
	//   94  210:aload           7
	//   95  212:invokevirtual   #303 <Method Matcher Pattern.matcher(CharSequence)>
	//   96  215:invokevirtual   #308 <Method boolean Matcher.find()>
	//   97  218:istore          5
				if(flag1 || flag2)
	//*  98  220:iload           4
	//*  99  222:ifne            230
	//* 100  225:iload           5
	//* 101  227:ifeq            163
					hashmap1.put(obj1, ((HashMap)hashmap.get("")).get(obj1));
	//  102  230:aload_2         
	//  103  231:aload           7
	//  104  233:aload_1         
	//  105  234:ldc2            #262 <String "">
	//  106  237:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//  107  240:checkcast       #186 <Class HashMap>
	//  108  243:aload           7
	//  109  245:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//  110  248:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//  111  251:pop             
			} while(true);
	//  112  252:goto            163
		}
		return ((HashMap) (obj1));
	//  113  255:aload           7
	//  114  257:areturn         
	}

	private void a(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          104
		{
			if(s1.length() == 0)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #319 <Method int String.length()>
	//*   4    8:ifne            12
				return;
	//    5   11:return          
			Matcher matcher = Pattern.compile("([^=, ]+)\\s*=(\\s*('([^']+?)'|[a-z0-9\\._-]+)\\s*\\+?)+\\s*", 2).matcher(((CharSequence) (s1)));
	//    6   12:ldc2            #321 <String "([^=, ]+)\\s*=(\\s*('([^']+?)'|[a-z0-9\\._-]+)\\s*\\+?)+\\s*">
	//    7   15:iconst_2        
	//    8   16:invokestatic    #324 <Method Pattern Pattern.compile(String, int)>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #303 <Method Matcher Pattern.matcher(CharSequence)>
	//   11   23:astore_2        
			do
			{
				if(!matcher.find())
					break;
	//   12   24:aload_2         
	//   13   25:invokevirtual   #308 <Method boolean Matcher.find()>
	//   14   28:ifeq            104
				String as[] = s1.substring(matcher.start(), matcher.end()).split("=", 2);
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #327 <Method int Matcher.start()>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #330 <Method int Matcher.end()>
	//   20   40:invokevirtual   #334 <Method String String.substring(int, int)>
	//   21   43:ldc2            #336 <String "=">
	//   22   46:iconst_2        
	//   23   47:invokevirtual   #340 <Method String[] String.split(String, int)>
	//   24   50:astore_3        
				if(as != null && as.length == 2)
	//*  25   51:aload_3         
	//*  26   52:ifnull          24
	//*  27   55:aload_3         
	//*  28   56:arraylength     
	//*  29   57:iconst_2        
	//*  30   58:icmpne          24
				{
					String s2 = as[0].replace(" ", "");
	//   31   61:aload_3         
	//   32   62:iconst_0        
	//   33   63:aaload          
	//   34   64:ldc2            #342 <String " ">
	//   35   67:ldc2            #262 <String "">
	//   36   70:invokevirtual   #346 <Method String String.replace(CharSequence, CharSequence)>
	//   37   73:astore          4
					if(s2 != null && s2.length() > 0)
	//*  38   75:aload           4
	//*  39   77:ifnull          24
	//*  40   80:aload           4
	//*  41   82:invokevirtual   #319 <Method int String.length()>
	//*  42   85:ifle            24
						J.put(((Object) (s2)), ((Object) (as[1])));
	//   43   88:aload_0         
	//   44   89:getfield        #213 <Field HashMap J>
	//   45   92:aload           4
	//   46   94:aload_3         
	//   47   95:iconst_1        
	//   48   96:aaload          
	//   49   97:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   50  100:pop             
				}
			} while(true);
	//   51  101:goto            24
		}
	//   52  104:return          
	}

	private boolean a(long l1)
	{
		return Long.parseLong(getClip().getLabel("ns_st_cl")) > 0L && (l1 > Long.parseLong(getClip().getLabel("ns_st_cl")) || Math.abs(l1 - Long.parseLong(getClip().getLabel("ns_st_cl"))) < (long)d);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method StreamSenseClip getClip()>
	//    2    4:ldc2            #353 <String "ns_st_cl">
	//    3    7:invokevirtual   #359 <Method String StreamSenseClip.getLabel(String)>
	//    4   10:invokestatic    #363 <Method long Long.parseLong(String)>
	//    5   13:lconst_0        
	//    6   14:lcmp            
	//    7   15:ifle            65
	//    8   18:lload_1         
	//    9   19:aload_0         
	//   10   20:invokevirtual   #351 <Method StreamSenseClip getClip()>
	//   11   23:ldc2            #353 <String "ns_st_cl">
	//   12   26:invokevirtual   #359 <Method String StreamSenseClip.getLabel(String)>
	//   13   29:invokestatic    #363 <Method long Long.parseLong(String)>
	//   14   32:lcmp            
	//   15   33:ifgt            63
	//   16   36:lload_1         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #351 <Method StreamSenseClip getClip()>
	//   19   41:ldc2            #353 <String "ns_st_cl">
	//   20   44:invokevirtual   #359 <Method String StreamSenseClip.getLabel(String)>
	//   21   47:invokestatic    #363 <Method long Long.parseLong(String)>
	//   22   50:lsub            
	//   23   51:invokestatic    #369 <Method long Math.abs(long)>
	//   24   54:aload_0         
	//   25   55:getfield        #146 <Field int d>
	//   26   58:i2l             
	//   27   59:lcmp            
	//   28   60:ifge            65
	//   29   63:iconst_1        
	//   30   64:ireturn         
	//   31   65:iconst_0        
	//   32   66:ireturn         
	}

	static boolean a(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.t;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field boolean t>
	//    2    4:ireturn         
	}

	static boolean a(StreamSensePlugin streamsenseplugin, long l1)
	{
		return streamsenseplugin.a(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #373 <Method boolean a(long)>
	//    3    5:ireturn         
	}

	static boolean a(StreamSensePlugin streamsenseplugin, boolean flag)
	{
		streamsenseplugin.w = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #182 <Field boolean w>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private long b(int i1)
	{
		return ((Long)l.get(l.size() - 1 - i1)).longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field List l>
	//    2    4:aload_0         
	//    3    5:getfield        #162 <Field List l>
	//    4    8:invokeinterface #237 <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:iload_1         
	//    8   16:isub            
	//    9   17:invokeinterface #241 <Method Object List.get(int)>
	//   10   22:checkcast       #243 <Class Long>
	//   11   25:invokevirtual   #247 <Method long Long.longValue()>
	//   12   28:lreturn         
	}

	static long b(StreamSensePlugin streamsenseplugin, int i1)
	{
		return streamsenseplugin.b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #376 <Method long b(int)>
	//    3    5:lreturn         
	}

	static long b(StreamSensePlugin streamsenseplugin, long l1)
	{
		streamsenseplugin.m = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #164 <Field long m>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static StreamSensePlayer b(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.u;
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field StreamSensePlayer u>
	//    2    4:areturn         
	}

	private HashMap b(HashMap hashmap, HashMap hashmap1)
	{
		HashMap hashmap2;
		Iterator iterator;
		HashMap hashmap3 = new HashMap();
	//    0    0:new             #186 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void HashMap()>
	//    3    7:astore          5
		hashmap2 = hashmap3;
	//    4    9:aload           5
	//    5   11:astore          4
		if(hashmap1 != null)
	//*   6   13:aload_2         
	//*   7   14:ifnull          38
		{
			hashmap2 = hashmap3;
	//    8   17:aload           5
	//    9   19:astore          4
			if(hashmap1.size() > 0)
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #217 <Method int HashMap.size()>
	//*  12   25:ifle            38
				hashmap2 = new HashMap(((java.util.Map) (hashmap1)));
	//   13   28:new             #186 <Class HashMap>
	//   14   31:dup             
	//   15   32:aload_2         
	//   16   33:invokespecial   #254 <Method void HashMap(java.util.Map)>
	//   17   36:astore          4
		}
		iterator = J.keySet().iterator();
	//   18   38:aload_0         
	//   19   39:getfield        #213 <Field HashMap J>
	//   20   42:invokevirtual   #275 <Method Set HashMap.keySet()>
	//   21   45:invokeinterface #281 <Method Iterator Set.iterator()>
	//   22   50:astore          9
_L6:
		Object obj;
		String s2;
		Matcher matcher;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_362;
	//   23   52:aload           9
	//   24   54:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//   25   59:ifeq            362
		s2 = (String)iterator.next();
	//   26   62:aload           9
	//   27   64:invokeinterface #291 <Method Object Iterator.next()>
	//   28   69:checkcast       #256 <Class String>
	//   29   72:astore          10
		obj = "";
	//   30   74:ldc2            #262 <String "">
	//   31   77:astore          5
		matcher = Pattern.compile("'([^']+?)'|[a-z0-9\\._-]+\\s*", 2).matcher((CharSequence)J.get(((Object) (s2))));
	//   32   79:ldc2            #384 <String "'([^']+?)'|[a-z0-9\\._-]+\\s*">
	//   33   82:iconst_2        
	//   34   83:invokestatic    #324 <Method Pattern Pattern.compile(String, int)>
	//   35   86:aload_0         
	//   36   87:getfield        #213 <Field HashMap J>
	//   37   90:aload           10
	//   38   92:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   39   95:checkcast       #386 <Class CharSequence>
	//   40   98:invokevirtual   #303 <Method Matcher Pattern.matcher(CharSequence)>
	//   41  101:astore          11
_L4:
		Object obj2;
		if(!matcher.find())
			break; /* Loop/switch isn't completed */
	//   42  103:aload           11
	//   43  105:invokevirtual   #308 <Method boolean Matcher.find()>
	//   44  108:ifeq            52
		hashmap1 = ((HashMap) (((String)J.get(((Object) (s2)))).substring(matcher.start(), matcher.end()).replace(" ", "")));
	//   45  111:aload_0         
	//   46  112:getfield        #213 <Field HashMap J>
	//   47  115:aload           10
	//   48  117:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   49  120:checkcast       #256 <Class String>
	//   50  123:aload           11
	//   51  125:invokevirtual   #327 <Method int Matcher.start()>
	//   52  128:aload           11
	//   53  130:invokevirtual   #330 <Method int Matcher.end()>
	//   54  133:invokevirtual   #334 <Method String String.substring(int, int)>
	//   55  136:ldc2            #342 <String " ">
	//   56  139:ldc2            #262 <String "">
	//   57  142:invokevirtual   #346 <Method String String.replace(CharSequence, CharSequence)>
	//   58  145:astore_2        
		if(Pattern.compile("^'([^']+)'$", 2).matcher(((CharSequence) (hashmap1))).find())
	//*  59  146:ldc2            #388 <String "^'([^']+)'$">
	//*  60  149:iconst_2        
	//*  61  150:invokestatic    #324 <Method Pattern Pattern.compile(String, int)>
	//*  62  153:aload_2         
	//*  63  154:invokevirtual   #303 <Method Matcher Pattern.matcher(CharSequence)>
	//*  64  157:invokevirtual   #308 <Method boolean Matcher.find()>
	//*  65  160:ifeq            186
		{
			hashmap1 = ((HashMap) (((String) (hashmap1)).replaceFirst("^'+", "").replaceFirst("'+$", "")));
	//   66  163:aload_2         
	//   67  164:ldc2            #390 <String "^'+">
	//   68  167:ldc2            #262 <String "">
	//   69  170:invokevirtual   #394 <Method String String.replaceFirst(String, String)>
	//   70  173:ldc2            #396 <String "'+$">
	//   71  176:ldc2            #262 <String "">
	//   72  179:invokevirtual   #394 <Method String String.replaceFirst(String, String)>
	//   73  182:astore_2        
			break MISSING_BLOCK_LABEL_347;
	//   74  183:goto            347
		}
		obj2 = "";
	//   75  186:ldc2            #262 <String "">
	//   76  189:astore          8
		int i1 = ((String) (hashmap1)).lastIndexOf('.');
	//   77  191:aload_2         
	//   78  192:bipush          46
	//   79  194:invokevirtual   #400 <Method int String.lastIndexOf(int)>
	//   80  197:istore_3        
		String s1;
		Object obj1;
		obj1 = ((Object) (hashmap1));
	//   81  198:aload_2         
	//   82  199:astore          7
		s1 = ((String) (obj2));
	//   83  201:aload           8
	//   84  203:astore          6
		if(i1 < 1)
			break MISSING_BLOCK_LABEL_248;
	//   85  205:iload_3         
	//   86  206:iconst_1        
	//   87  207:icmplt          248
		obj1 = ((Object) (hashmap1));
	//   88  210:aload_2         
	//   89  211:astore          7
		s1 = ((String) (obj2));
	//   90  213:aload           8
	//   91  215:astore          6
		if(i1 < ((String) (hashmap1)).length() - 1)
	//*  92  217:iload_3         
	//*  93  218:aload_2         
	//*  94  219:invokevirtual   #319 <Method int String.length()>
	//*  95  222:iconst_1        
	//*  96  223:isub            
	//*  97  224:icmpge          248
		{
			s1 = ((String) (hashmap1)).substring(0, i1);
	//   98  227:aload_2         
	//   99  228:iconst_0        
	//  100  229:iload_3         
	//  101  230:invokevirtual   #334 <Method String String.substring(int, int)>
	//  102  233:astore          6
			obj1 = ((Object) (((String) (hashmap1)).substring(i1 + 1, ((String) (hashmap1)).length())));
	//  103  235:aload_2         
	//  104  236:iload_3         
	//  105  237:iconst_1        
	//  106  238:iadd            
	//  107  239:aload_2         
	//  108  240:invokevirtual   #319 <Method int String.length()>
	//  109  243:invokevirtual   #334 <Method String String.substring(int, int)>
	//  110  246:astore          7
		}
		obj2 = ((Object) (hashmap.keySet().iterator()));
	//  111  248:aload_1         
	//  112  249:invokevirtual   #275 <Method Set HashMap.keySet()>
	//  113  252:invokeinterface #281 <Method Iterator Set.iterator()>
	//  114  257:astore          8
_L2:
		hashmap1 = ((HashMap) (obj));
	//  115  259:aload           5
	//  116  261:astore_2        
		HashMap hashmap4;
		if(!((Iterator) (obj2)).hasNext())
			break MISSING_BLOCK_LABEL_347;
	//  117  262:aload           8
	//  118  264:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//  119  269:ifeq            347
		hashmap1 = ((HashMap) ((String)((Iterator) (obj2)).next()));
	//  120  272:aload           8
	//  121  274:invokeinterface #291 <Method Object Iterator.next()>
	//  122  279:checkcast       #256 <Class String>
	//  123  282:astore_2        
		hashmap4 = (HashMap)hashmap.get(((Object) (hashmap1)));
	//  124  283:aload_1         
	//  125  284:aload_2         
	//  126  285:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//  127  288:checkcast       #186 <Class HashMap>
	//  128  291:astore          12
		if(!((String) (hashmap1)).equals(((Object) (s1)))) goto _L2; else goto _L1
	//  129  293:aload_2         
	//  130  294:aload           6
	//  131  296:invokevirtual   #260 <Method boolean String.equals(Object)>
	//  132  299:ifeq            259
_L1:
		hashmap1 = ((HashMap) (obj));
	//  133  302:aload           5
	//  134  304:astore_2        
		if(hashmap4 != null)
	//* 135  305:aload           12
	//* 136  307:ifnull          347
		{
			hashmap1 = ((HashMap) (obj));
	//  137  310:aload           5
	//  138  312:astore_2        
			try
			{
				if(hashmap4.containsKey(obj1))
	//* 139  313:aload           12
	//* 140  315:aload           7
	//* 141  317:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//* 142  320:ifeq            347
					hashmap1 = ((HashMap) ((String)hashmap4.get(obj1)));
	//  143  323:aload           12
	//  144  325:aload           7
	//  145  327:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//  146  330:checkcast       #256 <Class String>
	//  147  333:astore_2        
			}
	//* 148  334:goto            347
	//* 149  337:aload_0         
	//* 150  338:ldc2            #405 <String "Exception occurred while processing mapped labels">
	//* 151  341:invokevirtual   #408 <Method void log(String)>
	//* 152  344:aload           5
	//* 153  346:astore_2        
	//* 154  347:aload           4
	//* 155  349:aload           10
	//* 156  351:aload_2         
	//* 157  352:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//* 158  355:pop             
	//* 159  356:aload_2         
	//* 160  357:astore          5
	//* 161  359:goto            103
	//* 162  362:aload           4
	//* 163  364:areturn         
			// Misplaced declaration of an exception variable
			catch(HashMap hashmap1)
			{
				log("Exception occurred while processing mapped labels");
				hashmap1 = ((HashMap) (obj));
			}
		}
		hashmap2.put(((Object) (s2)), ((Object) (hashmap1)));
		obj = ((Object) (hashmap1));
		if(true) goto _L4; else goto _L3
_L3:
		if(true) goto _L6; else goto _L5
_L5:
		return hashmap2;
	//* 164  365:astore_2        
	//* 165  366:goto            337
	}

	private void b(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          128
		{
			if(s1.length() == 0)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #319 <Method int String.length()>
	//*   4    8:ifne            12
				return;
	//    5   11:return          
			s1 = ((String) (s1.split(",")));
	//    6   12:aload_1         
	//    7   13:ldc2            #410 <String ",">
	//    8   16:invokevirtual   #413 <Method String[] String.split(String)>
	//    9   19:astore_1        
			int j1 = s1.length;
	//   10   20:aload_1         
	//   11   21:arraylength     
	//   12   22:istore_3        
			for(int i1 = 0; i1 < j1; i1++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          128
			{
				String as[] = ((String) (s1[i1])).split("=", 2);
	//   18   30:aload_1         
	//   19   31:iload_2         
	//   20   32:aaload          
	//   21   33:ldc2            #336 <String "=">
	//   22   36:iconst_2        
	//   23   37:invokevirtual   #340 <Method String[] String.split(String, int)>
	//   24   40:astore          5
				if(as.length != 2)
					continue;
	//   25   42:aload           5
	//   26   44:arraylength     
	//   27   45:iconst_2        
	//   28   46:icmpne          121
				String s2 = as[0].replace(" ", "");
	//   29   49:aload           5
	//   30   51:iconst_0        
	//   31   52:aaload          
	//   32   53:ldc2            #342 <String " ">
	//   33   56:ldc2            #262 <String "">
	//   34   59:invokevirtual   #346 <Method String String.replace(CharSequence, CharSequence)>
	//   35   62:astore          4
				if(s2 != null && s2.length() > 0)
	//*  36   64:aload           4
	//*  37   66:ifnull          121
	//*  38   69:aload           4
	//*  39   71:invokevirtual   #319 <Method int String.length()>
	//*  40   74:ifle            121
				{
					String s3 = as[1].replaceFirst("^'+", "").replaceFirst("'+$", "");
	//   41   77:aload           5
	//   42   79:iconst_1        
	//   43   80:aaload          
	//   44   81:ldc2            #390 <String "^'+">
	//   45   84:ldc2            #262 <String "">
	//   46   87:invokevirtual   #394 <Method String String.replaceFirst(String, String)>
	//   47   90:ldc2            #396 <String "'+$">
	//   48   93:ldc2            #262 <String "">
	//   49   96:invokevirtual   #394 <Method String String.replaceFirst(String, String)>
	//   50   99:astore          5
					setLabel(s2, s3);
	//   51  101:aload_0         
	//   52  102:aload           4
	//   53  104:aload           5
	//   54  106:invokevirtual   #416 <Method void setLabel(String, String)>
					A.put(((Object) (s2)), ((Object) (s3)));
	//   55  109:aload_0         
	//   56  110:getfield        #193 <Field HashMap A>
	//   57  113:aload           4
	//   58  115:aload           5
	//   59  117:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   60  120:pop             
				}
			}

	//   61  121:iload_2         
	//   62  122:iconst_1        
	//   63  123:iadd            
	//   64  124:istore_2        
		}
	//*  65  125:goto            25
	//   66  128:return          
	}

	private void b(HashMap hashmap)
	{
		D = Boolean.valueOf((String)hashmap.get("debug")).booleanValue();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #418 <String "debug">
	//    3    5:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #256 <Class String>
	//    5   11:invokestatic    #424 <Method Boolean Boolean.valueOf(String)>
	//    6   14:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//    7   17:putfield        #199 <Field boolean D>
		if(hashmap.containsKey("labelmapping"))
	//*   8   20:aload_1         
	//*   9   21:ldc2            #429 <String "labelmapping">
	//*  10   24:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//*  11   27:ifeq            44
			a((String)hashmap.get("labelmapping"));
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc2            #429 <String "labelmapping">
	//   15   35:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   16   38:checkcast       #256 <Class String>
	//   17   41:invokespecial   #431 <Method void a(String)>
		if(hashmap.containsKey("persistentlabels"))
	//*  18   44:aload_1         
	//*  19   45:ldc2            #433 <String "persistentlabels">
	//*  20   48:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//*  21   51:ifeq            68
			b((String)hashmap.get("persistentlabels"));
	//   22   54:aload_0         
	//   23   55:aload_1         
	//   24   56:ldc2            #433 <String "persistentlabels">
	//   25   59:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   26   62:checkcast       #256 <Class String>
	//   27   65:invokespecial   #435 <Method void b(String)>
		if(hashmap.containsKey("throttling") && Boolean.valueOf((String)hashmap.get("throttling")).booleanValue())
	//*  28   68:aload_1         
	//*  29   69:ldc2            #437 <String "throttling">
	//*  30   72:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//*  31   75:ifeq            105
	//*  32   78:aload_1         
	//*  33   79:ldc2            #437 <String "throttling">
	//*  34   82:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*  35   85:checkcast       #256 <Class String>
	//*  36   88:invokestatic    #424 <Method Boolean Boolean.valueOf(String)>
	//*  37   91:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//*  38   94:ifeq            105
			setPausePlaySwitchDelayEnabled(true);
	//   39   97:aload_0         
	//   40   98:iconst_1        
	//   41   99:invokevirtual   #441 <Method void setPausePlaySwitchDelayEnabled(boolean)>
		else
	//*  42  102:goto            110
			setPausePlaySwitchDelayEnabled(false);
	//   43  105:aload_0         
	//   44  106:iconst_0        
	//   45  107:invokevirtual   #441 <Method void setPausePlaySwitchDelayEnabled(boolean)>
		if(hashmap.containsKey("include"))
	//*  46  110:aload_1         
	//*  47  111:ldc2            #443 <String "include">
	//*  48  114:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//*  49  117:ifeq            174
		{
			String s1 = (String)hashmap.get("include");
	//   50  120:aload_1         
	//   51  121:ldc2            #443 <String "include">
	//   52  124:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   53  127:checkcast       #256 <Class String>
	//   54  130:astore_2        
			if(s1 == "_all_")
	//*  55  131:aload_2         
	//*  56  132:ldc1            #201 <String "_all_">
	//*  57  134:if_acmpne       156
			{
				F = new String[1];
	//   58  137:aload_0         
	//   59  138:iconst_1        
	//   60  139:anewarray       String[]
	//   61  142:putfield        #205 <Field String[] F>
				F[0] = "_all_";
	//   62  145:aload_0         
	//   63  146:getfield        #205 <Field String[] F>
	//   64  149:iconst_0        
	//   65  150:ldc1            #201 <String "_all_">
	//   66  152:aastore         
			} else
	//*  67  153:goto            174
			if(s1.length() > 0)
	//*  68  156:aload_2         
	//*  69  157:invokevirtual   #319 <Method int String.length()>
	//*  70  160:ifle            174
				F = s1.split(",");
	//   71  163:aload_0         
	//   72  164:aload_2         
	//   73  165:ldc2            #410 <String ",">
	//   74  168:invokevirtual   #413 <Method String[] String.split(String)>
	//   75  171:putfield        #205 <Field String[] F>
		}
		if((F == null || F.length == 0 || !F[0].equals("_all_")) && hashmap.containsKey("include_prefixes"))
	//*  76  174:aload_0         
	//*  77  175:getfield        #205 <Field String[] F>
	//*  78  178:ifnull          203
	//*  79  181:aload_0         
	//*  80  182:getfield        #205 <Field String[] F>
	//*  81  185:arraylength     
	//*  82  186:ifeq            203
	//*  83  189:aload_0         
	//*  84  190:getfield        #205 <Field String[] F>
	//*  85  193:iconst_0        
	//*  86  194:aaload          
	//*  87  195:ldc1            #201 <String "_all_">
	//*  88  197:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  89  200:ifne            343
	//*  90  203:aload_1         
	//*  91  204:ldc2            #445 <String "include_prefixes">
	//*  92  207:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//*  93  210:ifeq            343
		{
			String s2 = (String)hashmap.get("include_prefixes");
	//   94  213:aload_1         
	//   95  214:ldc2            #445 <String "include_prefixes">
	//   96  217:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   97  220:checkcast       #256 <Class String>
	//   98  223:astore_2        
			if(s2 != null && s2.length() > 0)
	//*  99  224:aload_2         
	//* 100  225:ifnull          343
	//* 101  228:aload_2         
	//* 102  229:invokevirtual   #319 <Method int String.length()>
	//* 103  232:ifle            343
				if(s2.equals("_all_"))
	//* 104  235:aload_2         
	//* 105  236:ldc1            #201 <String "_all_">
	//* 106  238:invokevirtual   #260 <Method boolean String.equals(Object)>
	//* 107  241:ifeq            263
				{
					F = new String[1];
	//  108  244:aload_0         
	//  109  245:iconst_1        
	//  110  246:anewarray       String[]
	//  111  249:putfield        #205 <Field String[] F>
					F[0] = "_all_";
	//  112  252:aload_0         
	//  113  253:getfield        #205 <Field String[] F>
	//  114  256:iconst_0        
	//  115  257:ldc1            #201 <String "_all_">
	//  116  259:aastore         
				} else
	//* 117  260:goto            343
				{
					if(F == null)
	//* 118  263:aload_0         
	//* 119  264:getfield        #205 <Field String[] F>
	//* 120  267:ifnonnull       278
						F = new String[0];
	//  121  270:aload_0         
	//  122  271:iconst_0        
	//  123  272:anewarray       String[]
	//  124  275:putfield        #205 <Field String[] F>
					G = F.length;
	//  125  278:aload_0         
	//  126  279:aload_0         
	//  127  280:getfield        #205 <Field String[] F>
	//  128  283:arraylength     
	//  129  284:putfield        #207 <Field int G>
					ArrayList arraylist1 = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (F))))));
	//  130  287:new             #157 <Class ArrayList>
	//  131  290:dup             
	//  132  291:aload_0         
	//  133  292:getfield        #205 <Field String[] F>
	//  134  295:invokestatic    #451 <Method List Arrays.asList(Object[])>
	//  135  298:invokespecial   #454 <Method void ArrayList(java.util.Collection)>
	//  136  301:astore_3        
					arraylist1.addAll(((java.util.Collection) (Arrays.asList(((Object []) (s2.split(",")))))));
	//  137  302:aload_3         
	//  138  303:aload_2         
	//  139  304:ldc2            #410 <String ",">
	//  140  307:invokevirtual   #413 <Method String[] String.split(String)>
	//  141  310:invokestatic    #451 <Method List Arrays.asList(Object[])>
	//  142  313:invokevirtual   #458 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  143  316:pop             
					F = new String[arraylist1.size()];
	//  144  317:aload_0         
	//  145  318:aload_3         
	//  146  319:invokevirtual   #459 <Method int ArrayList.size()>
	//  147  322:anewarray       String[]
	//  148  325:putfield        #205 <Field String[] F>
					F = (String[])arraylist1.toArray(((Object []) (F)));
	//  149  328:aload_0         
	//  150  329:aload_3         
	//  151  330:aload_0         
	//  152  331:getfield        #205 <Field String[] F>
	//  153  334:invokevirtual   #463 <Method Object[] ArrayList.toArray(Object[])>
	//  154  337:checkcast       #464 <Class String[]>
	//  155  340:putfield        #205 <Field String[] F>
				}
		}
		if(F == null)
	//* 156  343:aload_0         
	//* 157  344:getfield        #205 <Field String[] F>
	//* 158  347:ifnonnull       367
		{
			H = new String[1];
	//  159  350:aload_0         
	//  160  351:iconst_1        
	//  161  352:anewarray       String[]
	//  162  355:putfield        #209 <Field String[] H>
			H[0] = "_all_";
	//  163  358:aload_0         
	//  164  359:getfield        #209 <Field String[] H>
	//  165  362:iconst_0        
	//  166  363:ldc1            #201 <String "_all_">
	//  167  365:aastore         
			return;
	//  168  366:return          
		}
		if(hashmap.containsKey("exclude"))
	//* 169  367:aload_1         
	//* 170  368:ldc2            #466 <String "exclude">
	//* 171  371:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//* 172  374:ifeq            434
		{
			String s3 = (String)hashmap.get("exclude");
	//  173  377:aload_1         
	//  174  378:ldc2            #466 <String "exclude">
	//  175  381:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//  176  384:checkcast       #256 <Class String>
	//  177  387:astore_2        
			if(s3.equals("_all_"))
	//* 178  388:aload_2         
	//* 179  389:ldc1            #201 <String "_all_">
	//* 180  391:invokevirtual   #260 <Method boolean String.equals(Object)>
	//* 181  394:ifeq            416
			{
				H = new String[1];
	//  182  397:aload_0         
	//  183  398:iconst_1        
	//  184  399:anewarray       String[]
	//  185  402:putfield        #209 <Field String[] H>
				H[0] = "_all_";
	//  186  405:aload_0         
	//  187  406:getfield        #209 <Field String[] H>
	//  188  409:iconst_0        
	//  189  410:ldc1            #201 <String "_all_">
	//  190  412:aastore         
			} else
	//* 191  413:goto            434
			if(s3.length() > 0)
	//* 192  416:aload_2         
	//* 193  417:invokevirtual   #319 <Method int String.length()>
	//* 194  420:ifle            434
				H = s3.split(",");
	//  195  423:aload_0         
	//  196  424:aload_2         
	//  197  425:ldc2            #410 <String ",">
	//  198  428:invokevirtual   #413 <Method String[] String.split(String)>
	//  199  431:putfield        #209 <Field String[] H>
		}
		if((H == null || H.length == 0 || !H[0].equals("_all_")) && hashmap.containsKey("exclude_prefixes"))
	//* 200  434:aload_0         
	//* 201  435:getfield        #209 <Field String[] H>
	//* 202  438:ifnull          463
	//* 203  441:aload_0         
	//* 204  442:getfield        #209 <Field String[] H>
	//* 205  445:arraylength     
	//* 206  446:ifeq            463
	//* 207  449:aload_0         
	//* 208  450:getfield        #209 <Field String[] H>
	//* 209  453:iconst_0        
	//* 210  454:aaload          
	//* 211  455:ldc1            #201 <String "_all_">
	//* 212  457:invokevirtual   #260 <Method boolean String.equals(Object)>
	//* 213  460:ifne            590
	//* 214  463:aload_1         
	//* 215  464:ldc2            #468 <String "exclude_prefixes">
	//* 216  467:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//* 217  470:ifeq            590
		{
			hashmap = ((HashMap) ((String)hashmap.get("exclude_prefixes")));
	//  218  473:aload_1         
	//  219  474:ldc2            #468 <String "exclude_prefixes">
	//  220  477:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//  221  480:checkcast       #256 <Class String>
	//  222  483:astore_1        
			if(((String) (hashmap)).equals("_all_"))
	//* 223  484:aload_1         
	//* 224  485:ldc1            #201 <String "_all_">
	//* 225  487:invokevirtual   #260 <Method boolean String.equals(Object)>
	//* 226  490:ifeq            510
			{
				H = new String[1];
	//  227  493:aload_0         
	//  228  494:iconst_1        
	//  229  495:anewarray       String[]
	//  230  498:putfield        #209 <Field String[] H>
				H[0] = "_all_";
	//  231  501:aload_0         
	//  232  502:getfield        #209 <Field String[] H>
	//  233  505:iconst_0        
	//  234  506:ldc1            #201 <String "_all_">
	//  235  508:aastore         
				return;
	//  236  509:return          
			}
			if(H == null)
	//* 237  510:aload_0         
	//* 238  511:getfield        #209 <Field String[] H>
	//* 239  514:ifnonnull       525
				H = new String[0];
	//  240  517:aload_0         
	//  241  518:iconst_0        
	//  242  519:anewarray       String[]
	//  243  522:putfield        #209 <Field String[] H>
			I = H.length;
	//  244  525:aload_0         
	//  245  526:aload_0         
	//  246  527:getfield        #209 <Field String[] H>
	//  247  530:arraylength     
	//  248  531:putfield        #211 <Field int I>
			ArrayList arraylist = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (H))))));
	//  249  534:new             #157 <Class ArrayList>
	//  250  537:dup             
	//  251  538:aload_0         
	//  252  539:getfield        #209 <Field String[] H>
	//  253  542:invokestatic    #451 <Method List Arrays.asList(Object[])>
	//  254  545:invokespecial   #454 <Method void ArrayList(java.util.Collection)>
	//  255  548:astore_2        
			arraylist.addAll(((java.util.Collection) (Arrays.asList(((Object []) (((String) (hashmap)).split(",")))))));
	//  256  549:aload_2         
	//  257  550:aload_1         
	//  258  551:ldc2            #410 <String ",">
	//  259  554:invokevirtual   #413 <Method String[] String.split(String)>
	//  260  557:invokestatic    #451 <Method List Arrays.asList(Object[])>
	//  261  560:invokevirtual   #458 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  262  563:pop             
			H = new String[arraylist.size()];
	//  263  564:aload_0         
	//  264  565:aload_2         
	//  265  566:invokevirtual   #459 <Method int ArrayList.size()>
	//  266  569:anewarray       String[]
	//  267  572:putfield        #209 <Field String[] H>
			H = (String[])arraylist.toArray(((Object []) (H)));
	//  268  575:aload_0         
	//  269  576:aload_2         
	//  270  577:aload_0         
	//  271  578:getfield        #209 <Field String[] H>
	//  272  581:invokevirtual   #463 <Method Object[] ArrayList.toArray(Object[])>
	//  273  584:checkcast       #464 <Class String[]>
	//  274  587:putfield        #209 <Field String[] H>
		}
	//  275  590:return          
	}

	static boolean b(StreamSensePlugin streamsenseplugin, boolean flag)
	{
		streamsenseplugin.n = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #166 <Field boolean n>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private HashMap c(HashMap hashmap)
	{
		HashMap hashmap2 = new HashMap();
	//    0    0:new             #186 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void HashMap()>
	//    3    7:astore          7
		HashMap hashmap3 = new HashMap();
	//    4    9:new             #186 <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #187 <Method void HashMap()>
	//    7   16:astore          8
		HashMap hashmap1 = hashmap3;
	//    8   18:aload           8
	//    9   20:astore          6
		if(hashmap != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          47
		{
			hashmap1 = hashmap3;
	//   12   26:aload           8
	//   13   28:astore          6
			if(hashmap.size() > 0)
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #217 <Method int HashMap.size()>
	//*  16   34:ifle            47
				hashmap1 = new HashMap(((java.util.Map) (hashmap)));
	//   17   37:new             #186 <Class HashMap>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #254 <Method void HashMap(java.util.Map)>
	//   21   45:astore          6
		}
		if(H != null && H.length == 1 && H[0].equals("_all_"))
	//*  22   47:aload_0         
	//*  23   48:getfield        #209 <Field String[] H>
	//*  24   51:ifnull          85
	//*  25   54:aload_0         
	//*  26   55:getfield        #209 <Field String[] H>
	//*  27   58:arraylength     
	//*  28   59:iconst_1        
	//*  29   60:icmpne          85
	//*  30   63:aload_0         
	//*  31   64:getfield        #209 <Field String[] H>
	//*  32   67:iconst_0        
	//*  33   68:aaload          
	//*  34   69:ldc1            #201 <String "_all_">
	//*  35   71:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  36   74:ifeq            85
			return new HashMap();
	//   37   77:new             #186 <Class HashMap>
	//   38   80:dup             
	//   39   81:invokespecial   #187 <Method void HashMap()>
	//   40   84:areturn         
		hashmap = hashmap2;
	//   41   85:aload           7
	//   42   87:astore_1        
		if(F != null)
	//*  43   88:aload_0         
	//*  44   89:getfield        #205 <Field String[] F>
	//*  45   92:ifnull          334
		{
			hashmap = hashmap2;
	//   46   95:aload           7
	//   47   97:astore_1        
			if(F.length > 0)
	//*  48   98:aload_0         
	//*  49   99:getfield        #205 <Field String[] F>
	//*  50  102:arraylength     
	//*  51  103:ifle            334
			{
				hashmap = hashmap2;
	//   52  106:aload           7
	//   53  108:astore_1        
				if(!F[0].equals("_all_"))
	//*  54  109:aload_0         
	//*  55  110:getfield        #205 <Field String[] F>
	//*  56  113:iconst_0        
	//*  57  114:aaload          
	//*  58  115:ldc1            #201 <String "_all_">
	//*  59  117:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  60  120:ifne            334
				{
					int k1 = F.length;
	//   61  123:aload_0         
	//   62  124:getfield        #205 <Field String[] F>
	//   63  127:arraylength     
	//   64  128:istore          4
label0:
					for(int i1 = 0; i1 < k1; i1++)
	//*  65  130:iconst_0        
	//*  66  131:istore_2        
	//*  67  132:iload_2         
	//*  68  133:iload           4
	//*  69  135:icmpge          268
					{
						hashmap = ((HashMap) (F[i1]));
	//   70  138:aload_0         
	//   71  139:getfield        #205 <Field String[] F>
	//   72  142:iload_2         
	//   73  143:aaload          
	//   74  144:astore_1        
						boolean flag;
						if(G >= 0 && i1 >= G)
	//*  75  145:aload_0         
	//*  76  146:getfield        #207 <Field int G>
	//*  77  149:iflt            165
	//*  78  152:iload_2         
	//*  79  153:aload_0         
	//*  80  154:getfield        #207 <Field int G>
	//*  81  157:icmplt          165
							flag = true;
	//   82  160:iconst_1        
	//   83  161:istore_3        
						else
	//*  84  162:goto            167
							flag = false;
	//   85  165:iconst_0        
	//   86  166:istore_3        
						Iterator iterator = hashmap1.keySet().iterator();
	//   87  167:aload           6
	//   88  169:invokevirtual   #275 <Method Set HashMap.keySet()>
	//   89  172:invokeinterface #281 <Method Iterator Set.iterator()>
	//   90  177:astore          8
						do
						{
							if(!iterator.hasNext())
								continue label0;
	//   91  179:aload           8
	//   92  181:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//   93  186:ifeq            261
							String s3 = (String)iterator.next();
	//   94  189:aload           8
	//   95  191:invokeinterface #291 <Method Object Iterator.next()>
	//   96  196:checkcast       #256 <Class String>
	//   97  199:astore          9
							if(!hashmap2.containsKey(((Object) (s3))))
	//*  98  201:aload           7
	//*  99  203:aload           9
	//* 100  205:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//* 101  208:ifne            179
							{
								boolean flag2;
								if(flag ? s3.indexOf(((String) (hashmap))) == 0 : s3.equals(((Object) (hashmap))))
	//* 102  211:iload_3         
	//* 103  212:ifeq            227
	//* 104  215:aload           9
	//* 105  217:aload_1         
	//* 106  218:invokevirtual   #473 <Method int String.indexOf(String)>
	//* 107  221:ifeq            236
	//* 108  224:goto            242
	//* 109  227:aload           9
	//* 110  229:aload_1         
	//* 111  230:invokevirtual   #260 <Method boolean String.equals(Object)>
	//* 112  233:ifeq            242
									flag2 = true;
	//  113  236:iconst_1        
	//  114  237:istore          5
								else
	//* 115  239:goto            245
									flag2 = false;
	//  116  242:iconst_0        
	//  117  243:istore          5
								hashmap2.put(((Object) (s3)), ((Object) (Boolean.valueOf(flag2))));
	//  118  245:aload           7
	//  119  247:aload           9
	//  120  249:iload           5
	//  121  251:invokestatic    #476 <Method Boolean Boolean.valueOf(boolean)>
	//  122  254:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//  123  257:pop             
							}
						} while(true);
	//  124  258:goto            179
					}

	//  125  261:iload_2         
	//  126  262:iconst_1        
	//  127  263:iadd            
	//  128  264:istore_2        
	//* 129  265:goto            132
					hashmap = ((HashMap) (hashmap2.keySet().iterator()));
	//  130  268:aload           7
	//  131  270:invokevirtual   #275 <Method Set HashMap.keySet()>
	//  132  273:invokeinterface #281 <Method Iterator Set.iterator()>
	//  133  278:astore_1        
					do
					{
						if(!((Iterator) (hashmap)).hasNext())
							break;
	//  134  279:aload_1         
	//  135  280:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//  136  285:ifeq            326
						String s1 = (String)((Iterator) (hashmap)).next();
	//  137  288:aload_1         
	//  138  289:invokeinterface #291 <Method Object Iterator.next()>
	//  139  294:checkcast       #256 <Class String>
	//  140  297:astore          8
						if(!((Boolean)hashmap2.get(((Object) (s1)))).booleanValue())
	//* 141  299:aload           7
	//* 142  301:aload           8
	//* 143  303:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//* 144  306:checkcast       #420 <Class Boolean>
	//* 145  309:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//* 146  312:ifne            279
							hashmap1.remove(((Object) (s1)));
	//  147  315:aload           6
	//  148  317:aload           8
	//  149  319:invokevirtual   #479 <Method Object HashMap.remove(Object)>
	//  150  322:pop             
					} while(true);
	//  151  323:goto            279
					hashmap = new HashMap();
	//  152  326:new             #186 <Class HashMap>
	//  153  329:dup             
	//  154  330:invokespecial   #187 <Method void HashMap()>
	//  155  333:astore_1        
				}
			}
		}
		if(H != null && H.length > 0)
	//* 156  334:aload_0         
	//* 157  335:getfield        #209 <Field String[] H>
	//* 158  338:ifnull          547
	//* 159  341:aload_0         
	//* 160  342:getfield        #209 <Field String[] H>
	//* 161  345:arraylength     
	//* 162  346:ifle            547
		{
			int l1 = H.length;
	//  163  349:aload_0         
	//  164  350:getfield        #209 <Field String[] H>
	//  165  353:arraylength     
	//  166  354:istore          4
			for(int j1 = 0; j1 < l1; j1++)
	//* 167  356:iconst_0        
	//* 168  357:istore_2        
	//* 169  358:iload_2         
	//* 170  359:iload           4
	//* 171  361:icmpge          547
			{
				Object obj = ((Object) (H[j1]));
	//  172  364:aload_0         
	//  173  365:getfield        #209 <Field String[] H>
	//  174  368:iload_2         
	//  175  369:aaload          
	//  176  370:astore          7
				boolean flag1;
				if(I >= 0 && j1 >= I)
	//* 177  372:aload_0         
	//* 178  373:getfield        #211 <Field int I>
	//* 179  376:iflt            392
	//* 180  379:iload_2         
	//* 181  380:aload_0         
	//* 182  381:getfield        #211 <Field int I>
	//* 183  384:icmplt          392
					flag1 = true;
	//  184  387:iconst_1        
	//  185  388:istore_3        
				else
	//* 186  389:goto            394
					flag1 = false;
	//  187  392:iconst_0        
	//  188  393:istore_3        
				Iterator iterator1 = hashmap1.keySet().iterator();
	//  189  394:aload           6
	//  190  396:invokevirtual   #275 <Method Set HashMap.keySet()>
	//  191  399:invokeinterface #281 <Method Iterator Set.iterator()>
	//  192  404:astore          8
				do
				{
					if(!iterator1.hasNext())
						break;
	//  193  406:aload           8
	//  194  408:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//  195  413:ifeq            469
					String s4 = (String)iterator1.next();
	//  196  416:aload           8
	//  197  418:invokeinterface #291 <Method Object Iterator.next()>
	//  198  423:checkcast       #256 <Class String>
	//  199  426:astore          9
					if(flag1 ? s4.indexOf(((String) (obj))) == 0 : s4.equals(obj))
	//* 200  428:iload_3         
	//* 201  429:ifeq            445
	//* 202  432:aload           9
	//* 203  434:aload           7
	//* 204  436:invokevirtual   #473 <Method int String.indexOf(String)>
	//* 205  439:ifne            406
	//* 206  442:goto            455
	//* 207  445:aload           9
	//* 208  447:aload           7
	//* 209  449:invokevirtual   #260 <Method boolean String.equals(Object)>
	//* 210  452:ifeq            406
						hashmap.put(((Object) (s4)), ((Object) (Boolean.valueOf(true))));
	//  211  455:aload_1         
	//  212  456:aload           9
	//  213  458:iconst_1        
	//  214  459:invokestatic    #476 <Method Boolean Boolean.valueOf(boolean)>
	//  215  462:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//  216  465:pop             
				} while(true);
	//  217  466:goto            406
				obj = ((Object) (hashmap.keySet().iterator()));
	//  218  469:aload_1         
	//  219  470:invokevirtual   #275 <Method Set HashMap.keySet()>
	//  220  473:invokeinterface #281 <Method Iterator Set.iterator()>
	//  221  478:astore          7
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
	//  222  480:aload           7
	//  223  482:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//  224  487:ifeq            532
					String s2 = (String)((Iterator) (obj)).next();
	//  225  490:aload           7
	//  226  492:invokeinterface #291 <Method Object Iterator.next()>
	//  227  497:checkcast       #256 <Class String>
	//  228  500:astore          8
					if(hashmap.containsKey(((Object) (s2))) && hashmap1.containsKey(((Object) (s2))))
	//* 229  502:aload_1         
	//* 230  503:aload           8
	//* 231  505:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//* 232  508:ifeq            480
	//* 233  511:aload           6
	//* 234  513:aload           8
	//* 235  515:invokevirtual   #403 <Method boolean HashMap.containsKey(Object)>
	//* 236  518:ifeq            480
						hashmap1.remove(((Object) (s2)));
	//  237  521:aload           6
	//  238  523:aload           8
	//  239  525:invokevirtual   #479 <Method Object HashMap.remove(Object)>
	//  240  528:pop             
				} while(true);
	//  241  529:goto            480
				hashmap = new HashMap();
	//  242  532:new             #186 <Class HashMap>
	//  243  535:dup             
	//  244  536:invokespecial   #187 <Method void HashMap()>
	//  245  539:astore_1        
			}

	//  246  540:iload_2         
	//  247  541:iconst_1        
	//  248  542:iadd            
	//  249  543:istore_2        
		}
	//* 250  544:goto            358
		return hashmap1;
	//  251  547:aload           6
	//  252  549:areturn         
	}

	private void c()
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #482 <Field Runnable j>
	//*   2    4:ifnull          26
		{
			a.getTaskExecutor().removeEnqueuedTask(j);
	//    3    7:aload_0         
	//    4    8:getfield        #485 <Field Core a>
	//    5   11:invokevirtual   #491 <Method TaskExecutor Core.getTaskExecutor()>
	//    6   14:aload_0         
	//    7   15:getfield        #482 <Field Runnable j>
	//    8   18:invokevirtual   #497 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			j = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #482 <Field Runnable j>
		}
	//   12   26:return          
	}

	static void c(StreamSensePlugin streamsenseplugin)
	{
		streamsenseplugin.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #500 <Method void c()>
	//    2    4:return          
	}

	static boolean c(StreamSensePlugin streamsenseplugin, boolean flag)
	{
		streamsenseplugin.v = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #180 <Field boolean v>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void d()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #500 <Method void c()>
		if(t && u != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #178 <Field boolean t>
	//*   4    8:ifeq            48
	//*   5   11:aload_0         
	//*   6   12:getfield        #380 <Field StreamSensePlayer u>
	//*   7   15:ifnull          48
		{
			j = e();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:invokespecial   #503 <Method Runnable e()>
	//   11   23:putfield        #482 <Field Runnable j>
			a.getTaskExecutor().execute(j, 0L, true, h);
	//   12   26:aload_0         
	//   13   27:getfield        #485 <Field Core a>
	//   14   30:invokevirtual   #491 <Method TaskExecutor Core.getTaskExecutor()>
	//   15   33:aload_0         
	//   16   34:getfield        #482 <Field Runnable j>
	//   17   37:lconst_0        
	//   18   38:iconst_1        
	//   19   39:aload_0         
	//   20   40:getfield        #153 <Field int h>
	//   21   43:i2l             
	//   22   44:invokevirtual   #507 <Method boolean TaskExecutor.execute(Runnable, long, boolean, long)>
	//   23   47:pop             
		}
	//   24   48:return          
	}

	static boolean d(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.w;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field boolean w>
	//    2    4:ireturn         
	}

	private Runnable e()
	{
		return ((Runnable) (new a(this)));
	//    0    0:new             #509 <Class a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #511 <Method void a(StreamSensePlugin)>
	//    4    8:areturn         
	}

	static List e(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.k;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field List k>
	//    2    4:areturn         
	}

	static List f(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.l;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field List l>
	//    2    4:areturn         
	}

	private boolean f()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(a(0) < a(1))
	//*   2    3:aload_0         
	//*   3    4:iconst_0        
	//*   4    5:invokespecial   #250 <Method long a(int)>
	//*   5    8:aload_0         
	//*   6    9:iconst_1        
	//*   7   10:invokespecial   #250 <Method long a(int)>
	//*   8   13:lcmp            
	//*   9   14:ifge            19
			return true;
	//   10   17:iconst_1        
	//   11   18:ireturn         
		int j1 = h;
	//   12   19:aload_0         
	//   13   20:getfield        #153 <Field int h>
	//   14   23:istore_3        
		float f1 = 0.0F;
	//   15   24:fconst_0        
	//   16   25:fstore_1        
		for(int i1 = 0; i1 < k.size(); i1++)
	//*  17   26:iconst_0        
	//*  18   27:istore_2        
	//*  19   28:iload_2         
	//*  20   29:aload_0         
	//*  21   30:getfield        #160 <Field List k>
	//*  22   33:invokeinterface #237 <Method int List.size()>
	//*  23   38:icmpge          86
			f1 += e[k.size() - 2][i1] * (float)((Long)k.get(i1)).longValue();
	//   24   41:fload_1         
	//   25   42:getstatic       #133 <Field float[][] e>
	//   26   45:aload_0         
	//   27   46:getfield        #160 <Field List k>
	//   28   49:invokeinterface #237 <Method int List.size()>
	//   29   54:iconst_2        
	//   30   55:isub            
	//   31   56:aaload          
	//   32   57:iload_2         
	//   33   58:faload          
	//   34   59:aload_0         
	//   35   60:getfield        #160 <Field List k>
	//   36   63:iload_2         
	//   37   64:invokeinterface #241 <Method Object List.get(int)>
	//   38   69:checkcast       #243 <Class Long>
	//   39   72:invokevirtual   #247 <Method long Long.longValue()>
	//   40   75:l2f             
	//   41   76:fmul            
	//   42   77:fadd            
	//   43   78:fstore_1        

	//   44   79:iload_2         
	//   45   80:iconst_1        
	//   46   81:iadd            
	//   47   82:istore_2        
	//*  48   83:goto            28
		if(f1 / (float)j1 > f)
	//*  49   86:fload_1         
	//*  50   87:iload_3         
	//*  51   88:i2f             
	//*  52   89:fdiv            
	//*  53   90:aload_0         
	//*  54   91:getfield        #149 <Field float f>
	//*  55   94:fcmpl           
	//*  56   95:ifle            101
			flag = true;
	//   57   98:iconst_1        
	//   58   99:istore          4
		return flag;
	//   59  101:iload           4
	//   60  103:ireturn         
	}

	static boolean g(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.p;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field boolean p>
	//    2    4:ireturn         
	}

	static int h(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.g;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int g>
	//    2    4:ireturn         
	}

	static int i(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.i;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field int i>
	//    2    4:ireturn         
	}

	static boolean j(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #515 <Method boolean f()>
	//    2    4:ireturn         
	}

	static boolean k(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.r;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field boolean r>
	//    2    4:ireturn         
	}

	static long l(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.m;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field long m>
	//    2    4:lreturn         
	}

	static List m(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.o;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field List o>
	//    2    4:areturn         
	}

	static boolean n(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.n;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field boolean n>
	//    2    4:ireturn         
	}

	static boolean o(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.v;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field boolean v>
	//    2    4:ireturn         
	}

	static boolean p(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.s;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field boolean s>
	//    2    4:ireturn         
	}

	static boolean q(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.q;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field boolean q>
	//    2    4:ireturn         
	}

	static int r(StreamSensePlugin streamsenseplugin)
	{
		return streamsenseplugin.c;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field int c>
	//    2    4:ireturn         
	}

	public void addListener(StreamSensePluginListener streamsensepluginlistener)
	{
		o.add(((Object) (streamsensepluginlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field List o>
	//    2    4:aload_1         
	//    3    5:invokeinterface #521 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void clearAllListeners()
	{
		o.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field List o>
	//    2    4:invokeinterface #525 <Method void List.clear()>
	//    3    9:return          
	}

	public void clearListener(StreamSensePluginListener streamsensepluginlistener)
	{
		o.remove(((Object) (streamsensepluginlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field List o>
	//    2    4:aload_1         
	//    3    5:invokeinterface #528 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public String getGenericPluginVersion()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String b>
	//    2    4:areturn         
	}

	public StreamSensePlayer getPlayer()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field StreamSensePlayer u>
	//    2    4:areturn         
	}

	public void log(String s1)
	{
		if(D)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field boolean D>
	//*   2    4:ifeq            19
			Log.d(((Object)this).getClass().getSimpleName(), s1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #538 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #543 <Method String Class.getSimpleName()>
	//    6   14:aload_1         
	//    7   15:invokestatic    #548 <Method int Log.d(String, String)>
	//    8   18:pop             
	//    9   19:return          
	}

	public void notify(StreamSenseEventType streamsenseeventtype, HashMap hashmap, long l1)
	{
		if(!B)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field boolean B>
	//*   2    4:ifne            188
		{
			if(C)
	//*   3    7:aload_0         
	//*   4    8:getfield        #197 <Field boolean C>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			HashMap hashmap1 = hashmap;
	//    7   15:aload_2         
	//    8   16:astore          7
			if(hashmap == null)
	//*   9   18:aload_2         
	//*  10   19:ifnonnull       31
				hashmap1 = new HashMap();
	//   11   22:new             #186 <Class HashMap>
	//   12   25:dup             
	//   13   26:invokespecial   #187 <Method void HashMap()>
	//   14   29:astore          7
			for(hashmap = ((HashMap) (o.iterator())); ((Iterator) (hashmap)).hasNext(); ((StreamSensePluginListener)((Iterator) (hashmap)).next()).onGetLabels(streamsenseeventtype, hashmap1));
	//   15   31:aload_0         
	//   16   32:getfield        #168 <Field List o>
	//   17   35:invokeinterface #551 <Method Iterator List.iterator()>
	//   18   40:astore_2        
	//   19   41:aload_2         
	//   20   42:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//   21   47:ifeq            70
	//   22   50:aload_2         
	//   23   51:invokeinterface #291 <Method Object Iterator.next()>
	//   24   56:checkcast       #553 <Class StreamSensePluginListener>
	//   25   59:aload_1         
	//   26   60:aload           7
	//   27   62:invokeinterface #557 <Method void StreamSensePluginListener.onGetLabels(StreamSenseEventType, HashMap)>
	//*  28   67:goto            41
			if(l1 <= 0L)
	//*  29   70:lload_3         
	//*  30   71:lconst_0        
	//*  31   72:lcmp            
	//*  32   73:ifle            79
	//*  33   76:goto            101
				if(u != null)
	//*  34   79:aload_0         
	//*  35   80:getfield        #380 <Field StreamSensePlayer u>
	//*  36   83:ifnull          99
					l1 = u.getPosition();
	//   37   86:aload_0         
	//   38   87:getfield        #380 <Field StreamSensePlayer u>
	//   39   90:invokeinterface #562 <Method long StreamSensePlayer.getPosition()>
	//   40   95:lstore_3        
				else
	//*  41   96:goto            101
					l1 = 0L;
	//   42   99:lconst_0        
	//   43  100:lstore_3        
			long l2 = l1;
	//   44  101:lload_3         
	//   45  102:lstore          5
			if(l1 < 0L)
	//*  46  104:lload_3         
	//*  47  105:lconst_0        
	//*  48  106:lcmp            
	//*  49  107:ifge            113
				l2 = 0L;
	//   50  110:lconst_0        
	//   51  111:lstore          5
			if(streamsenseeventtype == StreamSenseEventType.END && t)
	//*  52  113:aload_1         
	//*  53  114:getstatic       #568 <Field StreamSenseEventType StreamSenseEventType.END>
	//*  54  117:if_acmpne       167
	//*  55  120:aload_0         
	//*  56  121:getfield        #178 <Field boolean t>
	//*  57  124:ifeq            167
			{
				k = ((List) (new ArrayList()));
	//   58  127:aload_0         
	//   59  128:new             #157 <Class ArrayList>
	//   60  131:dup             
	//   61  132:invokespecial   #158 <Method void ArrayList()>
	//   62  135:putfield        #160 <Field List k>
				l = ((List) (new ArrayList()));
	//   63  138:aload_0         
	//   64  139:new             #157 <Class ArrayList>
	//   65  142:dup             
	//   66  143:invokespecial   #158 <Method void ArrayList()>
	//   67  146:putfield        #162 <Field List l>
				n = false;
	//   68  149:aload_0         
	//   69  150:iconst_0        
	//   70  151:putfield        #166 <Field boolean n>
				v = true;
	//   71  154:aload_0         
	//   72  155:iconst_1        
	//   73  156:putfield        #180 <Field boolean v>
				w = true;
	//   74  159:aload_0         
	//   75  160:iconst_1        
	//   76  161:putfield        #182 <Field boolean w>
			} else
	//*  77  164:goto            179
			if(streamsenseeventtype == StreamSenseEventType.PLAY)
	//*  78  167:aload_1         
	//*  79  168:getstatic       #571 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//*  80  171:if_acmpne       179
				x = true;
	//   81  174:aload_0         
	//   82  175:iconst_1        
	//   83  176:putfield        #184 <Field boolean x>
			super.notify(streamsenseeventtype, hashmap1, l2);
	//   84  179:aload_0         
	//   85  180:aload_1         
	//   86  181:aload           7
	//   87  183:lload           5
	//   88  185:invokespecial   #573 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
		}
	//   89  188:return          
	}

	public void setBitRate(long l1)
	{
		String s1;
		if(l1 > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            14
			s1 = String.valueOf(l1);
	//    4    6:lload_1         
	//    5    7:invokestatic    #579 <Method String String.valueOf(long)>
	//    6   10:astore_3        
		else
	//*   7   11:goto            18
			s1 = "0";
	//    8   14:ldc2            #581 <String "0">
	//    9   17:astore_3        
		setLabel("ns_st_br", s1);
	//   10   18:aload_0         
	//   11   19:ldc2            #583 <String "ns_st_br">
	//   12   22:aload_3         
	//   13   23:invokevirtual   #416 <Method void setLabel(String, String)>
	//   14   26:return          
	}

	public Boolean setClip(HashMap hashmap, boolean flag, HashMap hashmap1)
	{
		return setClip(hashmap, flag, hashmap1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #588 <Method Boolean setClip(HashMap, boolean, HashMap, boolean)>
	//    6    8:areturn         
	}

	public Boolean setClip(HashMap hashmap, boolean flag, HashMap hashmap1, boolean flag1)
	{
		if(x && hashmap != null && hashmap.get("ns_st_ci") != getClip().getLabel("ns_st_ci"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field boolean x>
	//*   2    4:ifeq            52
	//*   3    7:aload_1         
	//*   4    8:ifnull          52
	//*   5   11:aload_1         
	//*   6   12:ldc2            #591 <String "ns_st_ci">
	//*   7   15:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #351 <Method StreamSenseClip getClip()>
	//*  10   22:ldc2            #591 <String "ns_st_ci">
	//*  11   25:invokevirtual   #359 <Method String StreamSenseClip.getLabel(String)>
	//*  12   28:if_acmpeq       52
		{
			notify(StreamSenseEventType.END, u.getPosition());
	//   13   31:aload_0         
	//   14   32:getstatic       #568 <Field StreamSenseEventType StreamSenseEventType.END>
	//   15   35:aload_0         
	//   16   36:getfield        #380 <Field StreamSensePlayer u>
	//   17   39:invokeinterface #562 <Method long StreamSensePlayer.getPosition()>
	//   18   44:invokevirtual   #594 <Method void notify(StreamSenseEventType, long)>
			x = false;
	//   19   47:aload_0         
	//   20   48:iconst_0        
	//   21   49:putfield        #184 <Field boolean x>
		}
		HashMap hashmap2 = hashmap;
	//   22   52:aload_1         
	//   23   53:astore          5
		if(hashmap1 != null)
	//*  24   55:aload_3         
	//*  25   56:ifnull          96
		{
			hashmap2 = hashmap;
	//   26   59:aload_1         
	//   27   60:astore          5
			if(hashmap1.size() > 0)
	//*  28   62:aload_3         
	//*  29   63:invokevirtual   #217 <Method int HashMap.size()>
	//*  30   66:ifle            96
				hashmap2 = b(hashmap1, new HashMap(((java.util.Map) (a(hashmap1, new HashMap(((java.util.Map) (hashmap))))))));
	//   31   69:aload_0         
	//   32   70:aload_3         
	//   33   71:new             #186 <Class HashMap>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:aload_3         
	//   37   77:new             #186 <Class HashMap>
	//   38   80:dup             
	//   39   81:aload_1         
	//   40   82:invokespecial   #254 <Method void HashMap(java.util.Map)>
	//   41   85:invokespecial   #596 <Method HashMap a(HashMap, HashMap)>
	//   42   88:invokespecial   #254 <Method void HashMap(java.util.Map)>
	//   43   91:invokespecial   #598 <Method HashMap b(HashMap, HashMap)>
	//   44   94:astore          5
		}
		if(flag1)
	//*  45   96:iload           4
	//*  46   98:ifeq            168
		{
			if(z != null && z.size() > 0)
	//*  47  101:aload_0         
	//*  48  102:getfield        #191 <Field HashMap z>
	//*  49  105:ifnull          240
	//*  50  108:aload_0         
	//*  51  109:getfield        #191 <Field HashMap z>
	//*  52  112:invokevirtual   #217 <Method int HashMap.size()>
	//*  53  115:ifle            240
				for(hashmap = ((HashMap) (z.keySet().iterator())); ((Iterator) (hashmap)).hasNext(); hashmap2.put(((Object) (hashmap1)), z.get(((Object) (hashmap1)))))
	//*  54  118:aload_0         
	//*  55  119:getfield        #191 <Field HashMap z>
	//*  56  122:invokevirtual   #275 <Method Set HashMap.keySet()>
	//*  57  125:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  58  130:astore_1        
	//*  59  131:aload_1         
	//*  60  132:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  61  137:ifeq            240
					hashmap1 = ((HashMap) ((String)((Iterator) (hashmap)).next()));
	//   62  140:aload_1         
	//   63  141:invokeinterface #291 <Method Object Iterator.next()>
	//   64  146:checkcast       #256 <Class String>
	//   65  149:astore_3        

	//   66  150:aload           5
	//   67  152:aload_3         
	//   68  153:aload_0         
	//   69  154:getfield        #191 <Field HashMap z>
	//   70  157:aload_3         
	//   71  158:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   72  161:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   73  164:pop             
		} else
	//*  74  165:goto            131
		{
			z = new HashMap();
	//   75  168:aload_0         
	//   76  169:new             #186 <Class HashMap>
	//   77  172:dup             
	//   78  173:invokespecial   #187 <Method void HashMap()>
	//   79  176:putfield        #191 <Field HashMap z>
			if(hashmap2 != null && hashmap2.size() > 0)
	//*  80  179:aload           5
	//*  81  181:ifnull          240
	//*  82  184:aload           5
	//*  83  186:invokevirtual   #217 <Method int HashMap.size()>
	//*  84  189:ifle            240
				for(hashmap = ((HashMap) (hashmap2.keySet().iterator())); ((Iterator) (hashmap)).hasNext(); z.put(((Object) (hashmap1)), hashmap2.get(((Object) (hashmap1)))))
	//*  85  192:aload           5
	//*  86  194:invokevirtual   #275 <Method Set HashMap.keySet()>
	//*  87  197:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  88  202:astore_1        
	//*  89  203:aload_1         
	//*  90  204:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  91  209:ifeq            240
					hashmap1 = ((HashMap) ((String)((Iterator) (hashmap)).next()));
	//   92  212:aload_1         
	//   93  213:invokeinterface #291 <Method Object Iterator.next()>
	//   94  218:checkcast       #256 <Class String>
	//   95  221:astore_3        

	//   96  222:aload_0         
	//   97  223:getfield        #191 <Field HashMap z>
	//   98  226:aload_3         
	//   99  227:aload           5
	//  100  229:aload_3         
	//  101  230:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//  102  233:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//  103  236:pop             
		}
	//* 104  237:goto            203
		if(hashmap2 != null && hashmap2.get("ns_st_skip") != null && Boolean.parseBoolean((String)hashmap2.get("ns_st_skip")))
	//* 105  240:aload           5
	//* 106  242:ifnull          281
	//* 107  245:aload           5
	//* 108  247:ldc2            #600 <String "ns_st_skip">
	//* 109  250:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//* 110  253:ifnull          281
	//* 111  256:aload           5
	//* 112  258:ldc2            #600 <String "ns_st_skip">
	//* 113  261:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//* 114  264:checkcast       #256 <Class String>
	//* 115  267:invokestatic    #604 <Method boolean Boolean.parseBoolean(String)>
	//* 116  270:ifeq            281
			B = true;
	//  117  273:aload_0         
	//  118  274:iconst_1        
	//  119  275:putfield        #195 <Field boolean B>
		else
	//* 120  278:goto            286
			B = false;
	//  121  281:aload_0         
	//  122  282:iconst_0        
	//  123  283:putfield        #195 <Field boolean B>
		return super.setClip(hashmap2, flag);
	//  124  286:aload_0         
	//  125  287:aload           5
	//  126  289:iload_2         
	//  127  290:invokespecial   #607 <Method Boolean StreamSense.setClip(HashMap, boolean)>
	//  128  293:areturn         
	}

	public void setClipLabel(String s1, String s2)
	{
		setClipLabel(s1, s2, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #611 <Method void setClipLabel(String, String, boolean)>
	//    5    7:return          
	}

	public void setClipLabel(String s1, String s2, boolean flag)
	{
label0:
		{
			if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            29
			{
				if(z.get(((Object) (s1))) != null || A.get(((Object) (s1))) != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #191 <Field HashMap z>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*   6   12:ifnonnull       48
	//*   7   15:aload_0         
	//*   8   16:getfield        #193 <Field HashMap A>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*  11   23:ifnonnull       48
					break label0;
	//   12   26:goto            39
			} else
			{
				z.put(((Object) (s1)), ((Object) (s2)));
	//   13   29:aload_0         
	//   14   30:getfield        #191 <Field HashMap z>
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   18   38:pop             
			}
			getClip().setLabel(s1, s2);
	//   19   39:aload_0         
	//   20   40:invokevirtual   #351 <Method StreamSenseClip getClip()>
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokevirtual   #612 <Method void StreamSenseClip.setLabel(String, String)>
		}
	//   24   48:return          
	}

	public void setDetectEnd(boolean flag)
	{
		s = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #176 <Field boolean s>
	//    3    5:return          
	}

	public void setDetectPause(boolean flag)
	{
		q = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #172 <Field boolean q>
	//    3    5:return          
	}

	public void setDetectPlay(boolean flag)
	{
		r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #174 <Field boolean r>
	//    3    5:return          
	}

	public void setDetectSeek(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #170 <Field boolean p>
	//    3    5:return          
	}

	public void setDuration(long l1)
	{
		StreamSenseClip streamsenseclip = getClip();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method StreamSenseClip getClip()>
	//    2    4:astore          4
		String s1;
		if(l1 >= 0L)
	//*   3    6:lload_1         
	//*   4    7:lconst_0        
	//*   5    8:lcmp            
	//*   6    9:iflt            20
			s1 = String.valueOf(l1);
	//    7   12:lload_1         
	//    8   13:invokestatic    #579 <Method String String.valueOf(long)>
	//    9   16:astore_3        
		else
	//*  10   17:goto            24
			s1 = "0";
	//   11   20:ldc2            #581 <String "0">
	//   12   23:astore_3        
		streamsenseclip.setLabel("ns_st_cl", s1);
	//   13   24:aload           4
	//   14   26:ldc2            #353 <String "ns_st_cl">
	//   15   29:aload_3         
	//   16   30:invokevirtual   #612 <Method void StreamSenseClip.setLabel(String, String)>
	//   17   33:return          
	}

	public void setEndDetectionErrorMargin(int i1)
	{
		d = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field int d>
	//    3    5:return          
	}

	public void setIsFullScreen(boolean flag)
	{
		String s1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			s1 = "full";
	//    2    4:ldc2            #622 <String "full">
	//    3    7:astore_2        
		else
	//*   4    8:goto            15
			s1 = "norm";
	//    5   11:ldc2            #624 <String "norm">
	//    6   14:astore_2        
		setLabel("ns_st_ws", s1);
	//    7   15:aload_0         
	//    8   16:ldc2            #626 <String "ns_st_ws">
	//    9   19:aload_2         
	//   10   20:invokevirtual   #416 <Method void setLabel(String, String)>
	//   11   23:return          
	}

	public void setLabel(String s1, String s2)
	{
		setLabel(s1, s2, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #226 <Method void setLabel(String, String, boolean)>
	//    5    7:return          
	}

	public void setLabel(String s1, String s2, boolean flag)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #186 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void HashMap()>
	//    3    7:astore          4
		hashmap.put(((Object) (s1)), ((Object) (s2)));
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//    8   16:pop             
		setLabels(hashmap, flag);
	//    9   17:aload_0         
	//   10   18:aload           4
	//   11   20:iload_3         
	//   12   21:invokevirtual   #630 <Method void setLabels(HashMap, boolean)>
	//   13   24:return          
	}

	public void setLabels(HashMap hashmap)
	{
		setLabels(hashmap, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #630 <Method void setLabels(HashMap, boolean)>
	//    4    6:return          
	}

	public void setLabels(HashMap hashmap, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            73
		{
			if(A != null && A.size() > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #193 <Field HashMap A>
	//*   4    8:ifnull          144
	//*   5   11:aload_0         
	//*   6   12:getfield        #193 <Field HashMap A>
	//*   7   15:invokevirtual   #217 <Method int HashMap.size()>
	//*   8   18:ifle            144
			{
				String s1;
				for(Iterator iterator = A.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s1)), A.get(((Object) (s1)))))
	//*   9   21:aload_0         
	//*  10   22:getfield        #193 <Field HashMap A>
	//*  11   25:invokevirtual   #275 <Method Set HashMap.keySet()>
	//*  12   28:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  13   33:astore_3        
	//*  14   34:aload_3         
	//*  15   35:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  16   40:ifeq            144
					s1 = (String)iterator.next();
	//   17   43:aload_3         
	//   18   44:invokeinterface #291 <Method Object Iterator.next()>
	//   19   49:checkcast       #256 <Class String>
	//   20   52:astore          4

	//   21   54:aload_1         
	//   22   55:aload           4
	//   23   57:aload_0         
	//   24   58:getfield        #193 <Field HashMap A>
	//   25   61:aload           4
	//   26   63:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   27   66:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   28   69:pop             
			}
		} else
	//*  29   70:goto            34
		{
			A = new HashMap();
	//   30   73:aload_0         
	//   31   74:new             #186 <Class HashMap>
	//   32   77:dup             
	//   33   78:invokespecial   #187 <Method void HashMap()>
	//   34   81:putfield        #193 <Field HashMap A>
			if(hashmap != null && hashmap.size() > 0)
	//*  35   84:aload_1         
	//*  36   85:ifnull          144
	//*  37   88:aload_1         
	//*  38   89:invokevirtual   #217 <Method int HashMap.size()>
	//*  39   92:ifle            144
			{
				String s2;
				for(Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); A.put(((Object) (s2)), hashmap.get(((Object) (s2)))))
	//*  40   95:aload_1         
	//*  41   96:invokevirtual   #275 <Method Set HashMap.keySet()>
	//*  42   99:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  43  104:astore_3        
	//*  44  105:aload_3         
	//*  45  106:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  46  111:ifeq            144
					s2 = (String)iterator1.next();
	//   47  114:aload_3         
	//   48  115:invokeinterface #291 <Method Object Iterator.next()>
	//   49  120:checkcast       #256 <Class String>
	//   50  123:astore          4

	//   51  125:aload_0         
	//   52  126:getfield        #193 <Field HashMap A>
	//   53  129:aload           4
	//   54  131:aload_1         
	//   55  132:aload           4
	//   56  134:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   57  137:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   58  140:pop             
			}
		}
	//*  59  141:goto            105
		super.setLabels(hashmap);
	//   60  144:aload_0         
	//   61  145:aload_1         
	//   62  146:invokespecial   #632 <Method void StreamSense.setLabels(HashMap)>
	//   63  149:return          
	}

	public void setMaximumNumberOfEntriesInHistory(int i1)
	{
		if(i1 >= 2 && i1 <= 13)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmplt          16
	//*   3    5:iload_1         
	//*   4    6:bipush          13
	//*   5    8:icmpgt          16
			i = i1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #155 <Field int i>
	//    9   16:return          
	}

	public void setMinimumNumberOfTimeUpdateEventsBeforeSensingAnything(int i1)
	{
		if(i1 >= 2 && i1 <= 13)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmplt          16
	//*   3    5:iload_1         
	//*   4    6:bipush          13
	//*   5    8:icmpgt          16
			g = i1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #151 <Field int g>
	//    9   16:return          
	}

	public void setPauseDetectionErrorMargin(int i1)
	{
		c = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #144 <Field int c>
	//    3    5:return          
	}

	public void setPlayer(StreamSensePlayer streamsenseplayer)
	{
		u = streamsenseplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #380 <Field StreamSensePlayer u>
	//    3    5:return          
	}

	public Boolean setPlaylist(HashMap hashmap)
	{
		return setPlaylist(hashmap, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #642 <Method Boolean setPlaylist(HashMap, boolean)>
	//    4    6:areturn         
	}

	public Boolean setPlaylist(HashMap hashmap, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            73
		{
			if(y != null && y.size() > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #189 <Field HashMap y>
	//*   4    8:ifnull          144
	//*   5   11:aload_0         
	//*   6   12:getfield        #189 <Field HashMap y>
	//*   7   15:invokevirtual   #217 <Method int HashMap.size()>
	//*   8   18:ifle            144
			{
				String s1;
				for(Iterator iterator = y.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s1)), y.get(((Object) (s1)))))
	//*   9   21:aload_0         
	//*  10   22:getfield        #189 <Field HashMap y>
	//*  11   25:invokevirtual   #275 <Method Set HashMap.keySet()>
	//*  12   28:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  13   33:astore_3        
	//*  14   34:aload_3         
	//*  15   35:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  16   40:ifeq            144
					s1 = (String)iterator.next();
	//   17   43:aload_3         
	//   18   44:invokeinterface #291 <Method Object Iterator.next()>
	//   19   49:checkcast       #256 <Class String>
	//   20   52:astore          4

	//   21   54:aload_1         
	//   22   55:aload           4
	//   23   57:aload_0         
	//   24   58:getfield        #189 <Field HashMap y>
	//   25   61:aload           4
	//   26   63:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   27   66:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   28   69:pop             
			}
		} else
	//*  29   70:goto            34
		{
			y = new HashMap();
	//   30   73:aload_0         
	//   31   74:new             #186 <Class HashMap>
	//   32   77:dup             
	//   33   78:invokespecial   #187 <Method void HashMap()>
	//   34   81:putfield        #189 <Field HashMap y>
			if(hashmap != null && hashmap.size() > 0)
	//*  35   84:aload_1         
	//*  36   85:ifnull          144
	//*  37   88:aload_1         
	//*  38   89:invokevirtual   #217 <Method int HashMap.size()>
	//*  39   92:ifle            144
			{
				String s2;
				for(Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); y.put(((Object) (s2)), hashmap.get(((Object) (s2)))))
	//*  40   95:aload_1         
	//*  41   96:invokevirtual   #275 <Method Set HashMap.keySet()>
	//*  42   99:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  43  104:astore_3        
	//*  44  105:aload_3         
	//*  45  106:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  46  111:ifeq            144
					s2 = (String)iterator1.next();
	//   47  114:aload_3         
	//   48  115:invokeinterface #291 <Method Object Iterator.next()>
	//   49  120:checkcast       #256 <Class String>
	//   50  123:astore          4

	//   51  125:aload_0         
	//   52  126:getfield        #189 <Field HashMap y>
	//   53  129:aload           4
	//   54  131:aload_1         
	//   55  132:aload           4
	//   56  134:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//   57  137:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   58  140:pop             
			}
		}
	//*  59  141:goto            105
		if(hashmap != null && hashmap.get("ns_st_skip") != null && Boolean.parseBoolean((String)hashmap.get("ns_st_skip")))
	//*  60  144:aload_1         
	//*  61  145:ifnull          179
	//*  62  148:aload_1         
	//*  63  149:ldc2            #600 <String "ns_st_skip">
	//*  64  152:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*  65  155:ifnull          179
	//*  66  158:aload_1         
	//*  67  159:ldc2            #600 <String "ns_st_skip">
	//*  68  162:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*  69  165:checkcast       #256 <Class String>
	//*  70  168:invokestatic    #604 <Method boolean Boolean.parseBoolean(String)>
	//*  71  171:ifeq            179
			flag = true;
	//   72  174:iconst_1        
	//   73  175:istore_2        
		else
	//*  74  176:goto            181
			flag = false;
	//   75  179:iconst_0        
	//   76  180:istore_2        
		C = flag;
	//   77  181:aload_0         
	//   78  182:iload_2         
	//   79  183:putfield        #197 <Field boolean C>
		return super.setPlaylist(hashmap);
	//   80  186:aload_0         
	//   81  187:aload_1         
	//   82  188:invokespecial   #645 <Method Boolean StreamSense.setPlaylist(HashMap)>
	//   83  191:areturn         
	}

	public void setPlaylistLabel(String s1, String s2)
	{
		setPlaylistLabel(s1, s2, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #649 <Method void setPlaylistLabel(String, String, boolean)>
	//    5    7:return          
	}

	public void setPlaylistLabel(String s1, String s2, boolean flag)
	{
label0:
		{
			if(flag && flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            34
	//*   2    4:iload_3         
	//*   3    5:iconst_1        
	//*   4    6:icmpne          34
			{
				if(y.get(((Object) (s1))) != null || A.get(((Object) (s1))) != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #189 <Field HashMap y>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*   9   17:ifnonnull       53
	//*  10   20:aload_0         
	//*  11   21:getfield        #193 <Field HashMap A>
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #265 <Method Object HashMap.get(Object)>
	//*  14   28:ifnonnull       53
					break label0;
	//   15   31:goto            44
			} else
			{
				y.put(((Object) (s1)), ((Object) (s2)));
	//   16   34:aload_0         
	//   17   35:getfield        #189 <Field HashMap y>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #314 <Method Object HashMap.put(Object, Object)>
	//   21   43:pop             
			}
			getPlaylist().setLabel(s1, s2);
	//   22   44:aload_0         
	//   23   45:invokevirtual   #653 <Method StreamSensePlaylist getPlaylist()>
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:invokevirtual   #656 <Method void StreamSensePlaylist.setLabel(String, String)>
		}
	//   27   53:return          
	}

	public void setPulseSamplingInterval(int i1)
	{
		if(i1 > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			h = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #153 <Field int h>
	//    5    9:return          
	}

	public void setSeekDetectionMinQuotient(float f1)
	{
		if(f1 > 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:ifle            11
			f = f1;
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:putfield        #149 <Field float f>
	//    7   11:return          
	}

	public void setSmartStateDetection(boolean flag)
	{
		boolean flag1 = t;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field boolean t>
	//    2    4:istore_2        
		t = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #178 <Field boolean t>
		if(!flag1 && flag)
	//*   6   10:iload_2         
	//*   7   11:ifne            23
	//*   8   14:iload_1         
	//*   9   15:ifeq            23
		{
			d();
	//   10   18:aload_0         
	//   11   19:invokespecial   #662 <Method void d()>
			return;
	//   12   22:return          
		}
		if(flag1 && !flag)
	//*  13   23:iload_2         
	//*  14   24:ifeq            35
	//*  15   27:iload_1         
	//*  16   28:ifne            35
			c();
	//   17   31:aload_0         
	//   18   32:invokespecial   #500 <Method void c()>
	//   19   35:return          
	}

	public void setVideoSize(String s1)
	{
		StreamSenseClip streamsenseclip = getClip();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method StreamSenseClip getClip()>
	//    2    4:astore_2        
		if(s1 == null || s1.length() <= 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #319 <Method int String.length()>
	//*   7   13:ifle            19
	//*   8   16:goto            23
			s1 = "0";
	//    9   19:ldc2            #581 <String "0">
	//   10   22:astore_1        
		streamsenseclip.setLabel("ns_st_cs", s1);
	//   11   23:aload_2         
	//   12   24:ldc2            #665 <String "ns_st_cs">
	//   13   27:aload_1         
	//   14   28:invokevirtual   #612 <Method void StreamSenseClip.setLabel(String, String)>
	//   15   31:return          
	}

	public void setVolume(int i1)
	{
		String s1;
		if(i1 >= 0 && i1 <= 100)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:bipush          100
	//*   4    7:icmpgt          18
			s1 = String.valueOf(i1);
	//    5   10:iload_1         
	//    6   11:invokestatic    #669 <Method String String.valueOf(int)>
	//    7   14:astore_2        
		else
	//*   8   15:goto            22
			s1 = "100";
	//    9   18:ldc2            #671 <String "100">
	//   10   21:astore_2        
		setLabel("ns_st_vo", s1);
	//   11   22:aload_0         
	//   12   23:ldc2            #673 <String "ns_st_vo">
	//   13   26:aload_2         
	//   14   27:invokevirtual   #416 <Method void setLabel(String, String)>
	//   15   30:return          
	}

	private static final float e[][] = {
		{
			-1F, 1.0F
		}, {
			-0.5F, 0.0F, 0.5F
		}, {
			-0.3F, -0.1F, 0.1F, 0.3F
		}, {
			-0.2F, -0.1F, 0.0F, 0.1F, 0.2F
		}, {
			-0.14286F, -0.08571F, -0.02857F, 0.02857F, 0.08571F, 0.14286F
		}, {
			-0.10714F, -0.07143F, -0.03571F, 0.0F, 0.03571F, 0.07143F, 0.10714F
		}, {
			-0.08333F, -0.05952F, -0.03571F, -0.0119F, 0.0119F, 0.03571F, 0.05952F, 0.08333F
		}, {
			-0.06667F, -0.05F, -0.03333F, -0.01667F, 0.0F, 0.01667F, 0.03333F, 0.05F, 0.06667F
		}, {
			-0.05455F, -0.04242F, -0.0303F, -0.01818F, -0.00606F, 0.00606F, 0.01818F, 0.0303F, 0.04242F, 0.05455F
		}, {
			-0.04545F, -0.03636F, -0.02727F, -0.01818F, -0.00909F, 0.0F, 0.00909F, 0.01818F, 0.02727F, 0.03636F, 
			0.04545F
		}, {
			-0.03846F, -0.03147F, -0.02448F, -0.01748F, -0.01049F, -0.0035F, 0.0035F, 0.01049F, 0.01748F, 0.02448F, 
			0.03147F, 0.03846F
		}, {
			-0.03297F, -0.02747F, -0.02198F, -0.01648F, -0.01099F, -0.00549F, 0.0F, 0.00549F, 0.01099F, 0.01648F, 
			0.02198F, 0.02747F, 0.03297F
		}
	};
	private HashMap A;
	private boolean B;
	private boolean C;
	private boolean D;
	private final String E = "_all_";
	private String F[];
	private int G;
	private String H[];
	private int I;
	private HashMap J;
	private String b;
	private int c;
	private int d;
	private float f;
	private int g;
	private int h;
	private int i;
	private Runnable j;
	private List k;
	private List l;
	private long m;
	private boolean n;
	private List o;
	private boolean p;
	private boolean q;
	private boolean r;
	private boolean s;
	private boolean t;
	private StreamSensePlayer u;
	private boolean v;
	private boolean w;
	private boolean x;
	private HashMap y;
	private HashMap z;

	static 
	{
	//    0    0:bipush          12
	//    1    2:anewarray       float[][]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:iconst_2        
	//    5    8:newarray        float[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #55  <Float -1F>
	//    9   14:fastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:fconst_1        
	//   13   18:fastore         
	//   14   19:aastore         
	//   15   20:dup             
	//   16   21:iconst_1        
	//   17   22:iconst_3        
	//   18   23:newarray        float[]
	//   19   25:dup             
	//   20   26:iconst_0        
	//   21   27:ldc1            #56  <Float -0.5F>
	//   22   29:fastore         
	//   23   30:dup             
	//   24   31:iconst_1        
	//   25   32:fconst_0        
	//   26   33:fastore         
	//   27   34:dup             
	//   28   35:iconst_2        
	//   29   36:ldc1            #57  <Float 0.5F>
	//   30   38:fastore         
	//   31   39:aastore         
	//   32   40:dup             
	//   33   41:iconst_2        
	//   34   42:iconst_4        
	//   35   43:newarray        float[]
	//   36   45:dup             
	//   37   46:iconst_0        
	//   38   47:ldc1            #58  <Float -0.3F>
	//   39   49:fastore         
	//   40   50:dup             
	//   41   51:iconst_1        
	//   42   52:ldc1            #59  <Float -0.1F>
	//   43   54:fastore         
	//   44   55:dup             
	//   45   56:iconst_2        
	//   46   57:ldc1            #60  <Float 0.1F>
	//   47   59:fastore         
	//   48   60:dup             
	//   49   61:iconst_3        
	//   50   62:ldc1            #61  <Float 0.3F>
	//   51   64:fastore         
	//   52   65:aastore         
	//   53   66:dup             
	//   54   67:iconst_3        
	//   55   68:iconst_5        
	//   56   69:newarray        float[]
	//   57   71:dup             
	//   58   72:iconst_0        
	//   59   73:ldc1            #62  <Float -0.2F>
	//   60   75:fastore         
	//   61   76:dup             
	//   62   77:iconst_1        
	//   63   78:ldc1            #59  <Float -0.1F>
	//   64   80:fastore         
	//   65   81:dup             
	//   66   82:iconst_2        
	//   67   83:fconst_0        
	//   68   84:fastore         
	//   69   85:dup             
	//   70   86:iconst_3        
	//   71   87:ldc1            #60  <Float 0.1F>
	//   72   89:fastore         
	//   73   90:dup             
	//   74   91:iconst_4        
	//   75   92:ldc1            #63  <Float 0.2F>
	//   76   94:fastore         
	//   77   95:aastore         
	//   78   96:dup             
	//   79   97:iconst_4        
	//   80   98:bipush          6
	//   81  100:newarray        float[]
	//   82  102:dup             
	//   83  103:iconst_0        
	//   84  104:ldc1            #64  <Float -0.14286F>
	//   85  106:fastore         
	//   86  107:dup             
	//   87  108:iconst_1        
	//   88  109:ldc1            #65  <Float -0.08571F>
	//   89  111:fastore         
	//   90  112:dup             
	//   91  113:iconst_2        
	//   92  114:ldc1            #66  <Float -0.02857F>
	//   93  116:fastore         
	//   94  117:dup             
	//   95  118:iconst_3        
	//   96  119:ldc1            #67  <Float 0.02857F>
	//   97  121:fastore         
	//   98  122:dup             
	//   99  123:iconst_4        
	//  100  124:ldc1            #68  <Float 0.08571F>
	//  101  126:fastore         
	//  102  127:dup             
	//  103  128:iconst_5        
	//  104  129:ldc1            #69  <Float 0.14286F>
	//  105  131:fastore         
	//  106  132:aastore         
	//  107  133:dup             
	//  108  134:iconst_5        
	//  109  135:bipush          7
	//  110  137:newarray        float[]
	//  111  139:dup             
	//  112  140:iconst_0        
	//  113  141:ldc1            #70  <Float -0.10714F>
	//  114  143:fastore         
	//  115  144:dup             
	//  116  145:iconst_1        
	//  117  146:ldc1            #71  <Float -0.07143F>
	//  118  148:fastore         
	//  119  149:dup             
	//  120  150:iconst_2        
	//  121  151:ldc1            #72  <Float -0.03571F>
	//  122  153:fastore         
	//  123  154:dup             
	//  124  155:iconst_3        
	//  125  156:fconst_0        
	//  126  157:fastore         
	//  127  158:dup             
	//  128  159:iconst_4        
	//  129  160:ldc1            #73  <Float 0.03571F>
	//  130  162:fastore         
	//  131  163:dup             
	//  132  164:iconst_5        
	//  133  165:ldc1            #74  <Float 0.07143F>
	//  134  167:fastore         
	//  135  168:dup             
	//  136  169:bipush          6
	//  137  171:ldc1            #75  <Float 0.10714F>
	//  138  173:fastore         
	//  139  174:aastore         
	//  140  175:dup             
	//  141  176:bipush          6
	//  142  178:bipush          8
	//  143  180:newarray        float[]
	//  144  182:dup             
	//  145  183:iconst_0        
	//  146  184:ldc1            #76  <Float -0.08333F>
	//  147  186:fastore         
	//  148  187:dup             
	//  149  188:iconst_1        
	//  150  189:ldc1            #77  <Float -0.05952F>
	//  151  191:fastore         
	//  152  192:dup             
	//  153  193:iconst_2        
	//  154  194:ldc1            #72  <Float -0.03571F>
	//  155  196:fastore         
	//  156  197:dup             
	//  157  198:iconst_3        
	//  158  199:ldc1            #78  <Float -0.0119F>
	//  159  201:fastore         
	//  160  202:dup             
	//  161  203:iconst_4        
	//  162  204:ldc1            #79  <Float 0.0119F>
	//  163  206:fastore         
	//  164  207:dup             
	//  165  208:iconst_5        
	//  166  209:ldc1            #73  <Float 0.03571F>
	//  167  211:fastore         
	//  168  212:dup             
	//  169  213:bipush          6
	//  170  215:ldc1            #80  <Float 0.05952F>
	//  171  217:fastore         
	//  172  218:dup             
	//  173  219:bipush          7
	//  174  221:ldc1            #81  <Float 0.08333F>
	//  175  223:fastore         
	//  176  224:aastore         
	//  177  225:dup             
	//  178  226:bipush          7
	//  179  228:bipush          9
	//  180  230:newarray        float[]
	//  181  232:dup             
	//  182  233:iconst_0        
	//  183  234:ldc1            #82  <Float -0.06667F>
	//  184  236:fastore         
	//  185  237:dup             
	//  186  238:iconst_1        
	//  187  239:ldc1            #83  <Float -0.05F>
	//  188  241:fastore         
	//  189  242:dup             
	//  190  243:iconst_2        
	//  191  244:ldc1            #84  <Float -0.03333F>
	//  192  246:fastore         
	//  193  247:dup             
	//  194  248:iconst_3        
	//  195  249:ldc1            #85  <Float -0.01667F>
	//  196  251:fastore         
	//  197  252:dup             
	//  198  253:iconst_4        
	//  199  254:fconst_0        
	//  200  255:fastore         
	//  201  256:dup             
	//  202  257:iconst_5        
	//  203  258:ldc1            #86  <Float 0.01667F>
	//  204  260:fastore         
	//  205  261:dup             
	//  206  262:bipush          6
	//  207  264:ldc1            #87  <Float 0.03333F>
	//  208  266:fastore         
	//  209  267:dup             
	//  210  268:bipush          7
	//  211  270:ldc1            #88  <Float 0.05F>
	//  212  272:fastore         
	//  213  273:dup             
	//  214  274:bipush          8
	//  215  276:ldc1            #89  <Float 0.06667F>
	//  216  278:fastore         
	//  217  279:aastore         
	//  218  280:dup             
	//  219  281:bipush          8
	//  220  283:bipush          10
	//  221  285:newarray        float[]
	//  222  287:dup             
	//  223  288:iconst_0        
	//  224  289:ldc1            #90  <Float -0.05455F>
	//  225  291:fastore         
	//  226  292:dup             
	//  227  293:iconst_1        
	//  228  294:ldc1            #91  <Float -0.04242F>
	//  229  296:fastore         
	//  230  297:dup             
	//  231  298:iconst_2        
	//  232  299:ldc1            #92  <Float -0.0303F>
	//  233  301:fastore         
	//  234  302:dup             
	//  235  303:iconst_3        
	//  236  304:ldc1            #93  <Float -0.01818F>
	//  237  306:fastore         
	//  238  307:dup             
	//  239  308:iconst_4        
	//  240  309:ldc1            #94  <Float -0.00606F>
	//  241  311:fastore         
	//  242  312:dup             
	//  243  313:iconst_5        
	//  244  314:ldc1            #95  <Float 0.00606F>
	//  245  316:fastore         
	//  246  317:dup             
	//  247  318:bipush          6
	//  248  320:ldc1            #96  <Float 0.01818F>
	//  249  322:fastore         
	//  250  323:dup             
	//  251  324:bipush          7
	//  252  326:ldc1            #97  <Float 0.0303F>
	//  253  328:fastore         
	//  254  329:dup             
	//  255  330:bipush          8
	//  256  332:ldc1            #98  <Float 0.04242F>
	//  257  334:fastore         
	//  258  335:dup             
	//  259  336:bipush          9
	//  260  338:ldc1            #99  <Float 0.05455F>
	//  261  340:fastore         
	//  262  341:aastore         
	//  263  342:dup             
	//  264  343:bipush          9
	//  265  345:bipush          11
	//  266  347:newarray        float[]
	//  267  349:dup             
	//  268  350:iconst_0        
	//  269  351:ldc1            #100 <Float -0.04545F>
	//  270  353:fastore         
	//  271  354:dup             
	//  272  355:iconst_1        
	//  273  356:ldc1            #101 <Float -0.03636F>
	//  274  358:fastore         
	//  275  359:dup             
	//  276  360:iconst_2        
	//  277  361:ldc1            #102 <Float -0.02727F>
	//  278  363:fastore         
	//  279  364:dup             
	//  280  365:iconst_3        
	//  281  366:ldc1            #93  <Float -0.01818F>
	//  282  368:fastore         
	//  283  369:dup             
	//  284  370:iconst_4        
	//  285  371:ldc1            #103 <Float -0.00909F>
	//  286  373:fastore         
	//  287  374:dup             
	//  288  375:iconst_5        
	//  289  376:fconst_0        
	//  290  377:fastore         
	//  291  378:dup             
	//  292  379:bipush          6
	//  293  381:ldc1            #104 <Float 0.00909F>
	//  294  383:fastore         
	//  295  384:dup             
	//  296  385:bipush          7
	//  297  387:ldc1            #96  <Float 0.01818F>
	//  298  389:fastore         
	//  299  390:dup             
	//  300  391:bipush          8
	//  301  393:ldc1            #105 <Float 0.02727F>
	//  302  395:fastore         
	//  303  396:dup             
	//  304  397:bipush          9
	//  305  399:ldc1            #106 <Float 0.03636F>
	//  306  401:fastore         
	//  307  402:dup             
	//  308  403:bipush          10
	//  309  405:ldc1            #107 <Float 0.04545F>
	//  310  407:fastore         
	//  311  408:aastore         
	//  312  409:dup             
	//  313  410:bipush          10
	//  314  412:bipush          12
	//  315  414:newarray        float[]
	//  316  416:dup             
	//  317  417:iconst_0        
	//  318  418:ldc1            #108 <Float -0.03846F>
	//  319  420:fastore         
	//  320  421:dup             
	//  321  422:iconst_1        
	//  322  423:ldc1            #109 <Float -0.03147F>
	//  323  425:fastore         
	//  324  426:dup             
	//  325  427:iconst_2        
	//  326  428:ldc1            #110 <Float -0.02448F>
	//  327  430:fastore         
	//  328  431:dup             
	//  329  432:iconst_3        
	//  330  433:ldc1            #111 <Float -0.01748F>
	//  331  435:fastore         
	//  332  436:dup             
	//  333  437:iconst_4        
	//  334  438:ldc1            #112 <Float -0.01049F>
	//  335  440:fastore         
	//  336  441:dup             
	//  337  442:iconst_5        
	//  338  443:ldc1            #113 <Float -0.0035F>
	//  339  445:fastore         
	//  340  446:dup             
	//  341  447:bipush          6
	//  342  449:ldc1            #114 <Float 0.0035F>
	//  343  451:fastore         
	//  344  452:dup             
	//  345  453:bipush          7
	//  346  455:ldc1            #115 <Float 0.01049F>
	//  347  457:fastore         
	//  348  458:dup             
	//  349  459:bipush          8
	//  350  461:ldc1            #116 <Float 0.01748F>
	//  351  463:fastore         
	//  352  464:dup             
	//  353  465:bipush          9
	//  354  467:ldc1            #117 <Float 0.02448F>
	//  355  469:fastore         
	//  356  470:dup             
	//  357  471:bipush          10
	//  358  473:ldc1            #118 <Float 0.03147F>
	//  359  475:fastore         
	//  360  476:dup             
	//  361  477:bipush          11
	//  362  479:ldc1            #119 <Float 0.03846F>
	//  363  481:fastore         
	//  364  482:aastore         
	//  365  483:dup             
	//  366  484:bipush          11
	//  367  486:bipush          13
	//  368  488:newarray        float[]
	//  369  490:dup             
	//  370  491:iconst_0        
	//  371  492:ldc1            #120 <Float -0.03297F>
	//  372  494:fastore         
	//  373  495:dup             
	//  374  496:iconst_1        
	//  375  497:ldc1            #121 <Float -0.02747F>
	//  376  499:fastore         
	//  377  500:dup             
	//  378  501:iconst_2        
	//  379  502:ldc1            #122 <Float -0.02198F>
	//  380  504:fastore         
	//  381  505:dup             
	//  382  506:iconst_3        
	//  383  507:ldc1            #123 <Float -0.01648F>
	//  384  509:fastore         
	//  385  510:dup             
	//  386  511:iconst_4        
	//  387  512:ldc1            #124 <Float -0.01099F>
	//  388  514:fastore         
	//  389  515:dup             
	//  390  516:iconst_5        
	//  391  517:ldc1            #125 <Float -0.00549F>
	//  392  519:fastore         
	//  393  520:dup             
	//  394  521:bipush          6
	//  395  523:fconst_0        
	//  396  524:fastore         
	//  397  525:dup             
	//  398  526:bipush          7
	//  399  528:ldc1            #126 <Float 0.00549F>
	//  400  530:fastore         
	//  401  531:dup             
	//  402  532:bipush          8
	//  403  534:ldc1            #127 <Float 0.01099F>
	//  404  536:fastore         
	//  405  537:dup             
	//  406  538:bipush          9
	//  407  540:ldc1            #128 <Float 0.01648F>
	//  408  542:fastore         
	//  409  543:dup             
	//  410  544:bipush          10
	//  411  546:ldc1            #129 <Float 0.02198F>
	//  412  548:fastore         
	//  413  549:dup             
	//  414  550:bipush          11
	//  415  552:ldc1            #130 <Float 0.02747F>
	//  416  554:fastore         
	//  417  555:dup             
	//  418  556:bipush          12
	//  419  558:ldc1            #131 <Float 0.03297F>
	//  420  560:fastore         
	//  421  561:aastore         
	//  422  562:putstatic       #133 <Field float[][] e>
	//* 423  565:return          
	}
}
