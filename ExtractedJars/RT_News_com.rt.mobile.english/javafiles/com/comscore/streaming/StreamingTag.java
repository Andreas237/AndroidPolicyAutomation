// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import com.comscore.utils.Date;
import com.comscore.utils.Utils;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//			p, StreamSense, StreamSenseState, StreamSenseEventType, 
//			StreamSenseClip, AdType, ContentType

public class StreamingTag
{

	public StreamingTag()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          11
	//    4    7:anewarray       String[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #28  <String "ns_st_ci">
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc1            #30  <String "c3">
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:ldc1            #32  <String "c4">
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_3        
	//   19   27:ldc1            #34  <String "c6">
	//   20   29:aastore         
	//   21   30:dup             
	//   22   31:iconst_4        
	//   23   32:ldc1            #36  <String "ns_st_st">
	//   24   34:aastore         
	//   25   35:dup             
	//   26   36:iconst_5        
	//   27   37:ldc1            #38  <String "ns_st_pu">
	//   28   39:aastore         
	//   29   40:dup             
	//   30   41:bipush          6
	//   31   43:ldc1            #40  <String "ns_st_pr">
	//   32   45:aastore         
	//   33   46:dup             
	//   34   47:bipush          7
	//   35   49:ldc1            #42  <String "ns_st_ep">
	//   36   51:aastore         
	//   37   52:dup             
	//   38   53:bipush          8
	//   39   55:ldc1            #44  <String "ns_st_sn">
	//   40   57:aastore         
	//   41   58:dup             
	//   42   59:bipush          9
	//   43   61:ldc1            #46  <String "ns_st_en">
	//   44   63:aastore         
	//   45   64:dup             
	//   46   65:bipush          10
	//   47   67:ldc1            #48  <String "ns_st_ct">
	//   48   69:aastore         
	//   49   70:putfield        #50  <Field String[] a>
		e = 0;
	//   50   73:aload_0         
	//   51   74:iconst_0        
	//   52   75:putfield        #52  <Field int e>
		c = 0L;
	//   53   78:aload_0         
	//   54   79:lconst_0        
	//   55   80:putfield        #54  <Field long c>
		d = 0L;
	//   56   83:aload_0         
	//   57   84:lconst_0        
	//   58   85:putfield        #56  <Field long d>
		f = null;
	//   59   88:aload_0         
	//   60   89:aconst_null     
	//   61   90:putfield        #58  <Field HashMap f>
		h = false;
	//   62   93:aload_0         
	//   63   94:iconst_0        
	//   64   95:putfield        #60  <Field boolean h>
		g = p.None;
	//   65   98:aload_0         
	//   66   99:getstatic       #65  <Field p p.None>
	//   67  102:putfield        #67  <Field p g>
		b = new StreamSense();
	//   68  105:aload_0         
	//   69  106:new             #69  <Class StreamSense>
	//   70  109:dup             
	//   71  110:invokespecial   #70  <Method void StreamSense()>
	//   72  113:putfield        #72  <Field StreamSense b>
		b.setLabel("ns_st_it", "r");
	//   73  116:aload_0         
	//   74  117:getfield        #72  <Field StreamSense b>
	//   75  120:ldc1            #74  <String "ns_st_it">
	//   76  122:ldc1            #76  <String "r">
	//   77  124:invokevirtual   #80  <Method void StreamSense.setLabel(String, String)>
	//   78  127:return          
	}

	private HashMap a(HashMap hashmap)
	{
		HashMap hashmap1 = Utils.mapOfStrings(((java.util.Map) (hashmap)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//    2    4:astore          4
		String as[] = a;
	//    3    6:aload_0         
	//    4    7:getfield        #50  <Field String[] a>
	//    5   10:astore          5
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		for(int j = as.length; i < j; i++)
	//*   8   14:aload           5
	//*   9   16:arraylength     
	//*  10   17:istore_3        
	//*  11   18:iload_2         
	//*  12   19:iload_3         
	//*  13   20:icmpge          74
		{
			String s = as[i];
	//   14   23:aload           5
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:astore          6
			if(hashmap1.containsKey(((Object) (s))))
				continue;
	//   18   29:aload           4
	//   19   31:aload           6
	//   20   33:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//   21   36:ifne            67
			if(s == "ns_st_ci")
	//*  22   39:aload           6
	//*  23   41:ldc1            #28  <String "ns_st_ci">
	//*  24   43:if_acmpne       61
				hashmap = "0";
	//   25   46:ldc1            #96  <String "0">
	//   26   48:astore_1        
			else
	//*  27   49:aload           4
	//*  28   51:aload           6
	//*  29   53:aload_1         
	//*  30   54:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//*  31   57:pop             
	//*  32   58:goto            67
				hashmap = "*null";
	//   33   61:ldc1            #102 <String "*null">
	//   34   63:astore_1        
			hashmap1.put(((Object) (s)), ((Object) (hashmap)));
		}

	//   35   64:goto            49
	//   36   67:iload_2         
	//   37   68:iconst_1        
	//   38   69:iadd            
	//   39   70:istore_2        
	//*  40   71:goto            18
		return hashmap1;
	//   41   74:aload           4
	//   42   76:areturn         
	}

	private void a(long l)
	{
		if(b.getState() != StreamSenseState.IDLE && b.getState() != StreamSenseState.PAUSED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field StreamSense b>
	//*   2    4:invokevirtual   #109 <Method StreamSenseState StreamSense.getState()>
	//*   3    7:getstatic       #115 <Field StreamSenseState StreamSenseState.IDLE>
	//*   4   10:if_acmpeq       42
	//*   5   13:aload_0         
	//*   6   14:getfield        #72  <Field StreamSense b>
	//*   7   17:invokevirtual   #109 <Method StreamSenseState StreamSense.getState()>
	//*   8   20:getstatic       #118 <Field StreamSenseState StreamSenseState.PAUSED>
	//*   9   23:if_acmpeq       42
		{
			b.notify(StreamSenseEventType.END, b(l));
	//   10   26:aload_0         
	//   11   27:getfield        #72  <Field StreamSense b>
	//   12   30:getstatic       #124 <Field StreamSenseEventType StreamSenseEventType.END>
	//   13   33:aload_0         
	//   14   34:lload_1         
	//   15   35:invokespecial   #127 <Method long b(long)>
	//   16   38:invokevirtual   #131 <Method void StreamSense.notify(StreamSenseEventType, long)>
			return;
	//   17   41:return          
		}
		if(b.getState() == StreamSenseState.PAUSED)
	//*  18   42:aload_0         
	//*  19   43:getfield        #72  <Field StreamSense b>
	//*  20   46:invokevirtual   #109 <Method StreamSenseState StreamSense.getState()>
	//*  21   49:getstatic       #118 <Field StreamSenseState StreamSenseState.PAUSED>
	//*  22   52:if_acmpne       69
			b.notify(StreamSenseEventType.END, d);
	//   23   55:aload_0         
	//   24   56:getfield        #72  <Field StreamSense b>
	//   25   59:getstatic       #124 <Field StreamSenseEventType StreamSenseEventType.END>
	//   26   62:aload_0         
	//   27   63:getfield        #56  <Field long d>
	//   28   66:invokevirtual   #131 <Method void StreamSense.notify(StreamSenseEventType, long)>
	//   29   69:return          
	}

	private void a(long l, HashMap hashmap)
	{
		a(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #134 <Method void a(long)>
		e = e + 1;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #52  <Field int e>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:putfield        #52  <Field int e>
		if(!hashmap.containsKey("ns_st_cn"))
	//*   9   15:aload_3         
	//*  10   16:ldc1            #136 <String "ns_st_cn">
	//*  11   18:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  12   21:ifne            38
			hashmap.put("ns_st_cn", ((Object) (String.valueOf(e))));
	//   13   24:aload_3         
	//   14   25:ldc1            #136 <String "ns_st_cn">
	//   15   27:aload_0         
	//   16   28:getfield        #52  <Field int e>
	//   17   31:invokestatic    #140 <Method String String.valueOf(int)>
	//   18   34:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   19   37:pop             
		if(!hashmap.containsKey("ns_st_pn"))
	//*  20   38:aload_3         
	//*  21   39:ldc1            #142 <String "ns_st_pn">
	//*  22   41:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  23   44:ifne            56
			hashmap.put("ns_st_pn", "1");
	//   24   47:aload_3         
	//   25   48:ldc1            #142 <String "ns_st_pn">
	//   26   50:ldc1            #144 <String "1">
	//   27   52:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   28   55:pop             
		if(!hashmap.containsKey("ns_st_tp"))
	//*  29   56:aload_3         
	//*  30   57:ldc1            #146 <String "ns_st_tp">
	//*  31   59:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  32   62:ifne            74
			hashmap.put("ns_st_tp", "0");
	//   33   65:aload_3         
	//   34   66:ldc1            #146 <String "ns_st_tp">
	//   35   68:ldc1            #96  <String "0">
	//   36   70:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   37   73:pop             
		b.setClip(hashmap);
	//   38   74:aload_0         
	//   39   75:getfield        #72  <Field StreamSense b>
	//   40   78:aload_3         
	//   41   79:invokevirtual   #150 <Method Boolean StreamSense.setClip(HashMap)>
	//   42   82:pop             
		f = hashmap;
	//   43   83:aload_0         
	//   44   84:aload_3         
	//   45   85:putfield        #58  <Field HashMap f>
		c = l;
	//   46   88:aload_0         
	//   47   89:lload_1         
	//   48   90:putfield        #54  <Field long c>
		d = 0L;
	//   49   93:aload_0         
	//   50   94:lconst_0        
	//   51   95:putfield        #56  <Field long d>
		b.notify(StreamSenseEventType.PLAY, d);
	//   52   98:aload_0         
	//   53   99:getfield        #72  <Field StreamSense b>
	//   54  102:getstatic       #153 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//   55  105:aload_0         
	//   56  106:getfield        #56  <Field long d>
	//   57  109:invokevirtual   #131 <Method void StreamSense.notify(StreamSenseEventType, long)>
	//   58  112:return          
	}

	private void a(HashMap hashmap, p p1)
	{
		long l = Date.unixTime();
	//    0    0:invokestatic    #161 <Method long Date.unixTime()>
	//    1    3:lstore_3        
		hashmap = a(Utils.mapOfStrings(((java.util.Map) (hashmap))));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #88  <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//    5    9:invokespecial   #163 <Method HashMap a(HashMap)>
	//    6   12:astore_1        
		if(g == p.None)
	//*   7   13:aload_0         
	//*   8   14:getfield        #67  <Field p g>
	//*   9   17:getstatic       #65  <Field p p.None>
	//*  10   20:if_acmpne       28
			g = p1;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #67  <Field p g>
		if(h && g == p1 && c(hashmap))
	//*  14   28:aload_0         
	//*  15   29:getfield        #60  <Field boolean h>
	//*  16   32:ifeq            100
	//*  17   35:aload_0         
	//*  18   36:getfield        #67  <Field p g>
	//*  19   39:aload_2         
	//*  20   40:if_acmpne       100
	//*  21   43:aload_0         
	//*  22   44:aload_1         
	//*  23   45:invokespecial   #166 <Method boolean c(HashMap)>
	//*  24   48:ifne            54
	//*  25   51:goto            100
		{
			b.getClip().setLabels(hashmap);
	//   26   54:aload_0         
	//   27   55:getfield        #72  <Field StreamSense b>
	//   28   58:invokevirtual   #170 <Method StreamSenseClip StreamSense.getClip()>
	//   29   61:aload_1         
	//   30   62:invokevirtual   #176 <Method void StreamSenseClip.setLabels(HashMap)>
			if(b.getState() != StreamSenseState.PLAYING)
	//*  31   65:aload_0         
	//*  32   66:getfield        #72  <Field StreamSense b>
	//*  33   69:invokevirtual   #109 <Method StreamSenseState StreamSense.getState()>
	//*  34   72:getstatic       #179 <Field StreamSenseState StreamSenseState.PLAYING>
	//*  35   75:if_acmpeq       106
			{
				c = l;
	//   36   78:aload_0         
	//   37   79:lload_3         
	//   38   80:putfield        #54  <Field long c>
				b.notify(StreamSenseEventType.PLAY, d);
	//   39   83:aload_0         
	//   40   84:getfield        #72  <Field StreamSense b>
	//   41   87:getstatic       #153 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//   42   90:aload_0         
	//   43   91:getfield        #56  <Field long d>
	//   44   94:invokevirtual   #131 <Method void StreamSense.notify(StreamSenseEventType, long)>
			}
		} else
	//*  45   97:goto            106
		{
			a(l, hashmap);
	//   46  100:aload_0         
	//   47  101:lload_3         
	//   48  102:aload_1         
	//   49  103:invokespecial   #181 <Method void a(long, HashMap)>
		}
		h = true;
	//   50  106:aload_0         
	//   51  107:iconst_1        
	//   52  108:putfield        #60  <Field boolean h>
		g = p1;
	//   53  111:aload_0         
	//   54  112:aload_2         
	//   55  113:putfield        #67  <Field p g>
	//   56  116:return          
	}

	private boolean a(String s, HashMap hashmap, HashMap hashmap1)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          70
		{
			boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          5
			boolean flag;
			if(hashmap != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          17
				flag = true;
	//    6   11:iconst_1        
	//    7   12:istore          4
			else
	//*   8   14:goto            20
				flag = false;
	//    9   17:iconst_0        
	//   10   18:istore          4
			if(hashmap1 == null)
	//*  11   20:aload_3         
	//*  12   21:ifnull          27
	//*  13   24:goto            30
				flag1 = false;
	//   14   27:iconst_0        
	//   15   28:istore          5
			if(flag1 & flag)
	//*  16   30:iload           5
	//*  17   32:iload           4
	//*  18   34:iand            
	//*  19   35:ifeq            70
			{
				hashmap = ((HashMap) ((String)hashmap.get(((Object) (s)))));
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #187 <Method Object HashMap.get(Object)>
	//   23   43:checkcast       #26  <Class String>
	//   24   46:astore_2        
				s = (String)hashmap1.get(((Object) (s)));
	//   25   47:aload_3         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #187 <Method Object HashMap.get(Object)>
	//   28   52:checkcast       #26  <Class String>
	//   29   55:astore_1        
				if(hashmap != null && s != null)
	//*  30   56:aload_2         
	//*  31   57:ifnull          70
	//*  32   60:aload_1         
	//*  33   61:ifnull          70
					return ((String) (hashmap)).equals(((Object) (s)));
	//   34   64:aload_2         
	//   35   65:aload_1         
	//   36   66:invokevirtual   #190 <Method boolean String.equals(Object)>
	//   37   69:ireturn         
			}
		}
		return false;
	//   38   70:iconst_0        
	//   39   71:ireturn         
	}

	private long b(long l)
	{
		if(c > 0L && l >= c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field long c>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            36
	//*   5    9:lload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #54  <Field long c>
	//*   8   14:lcmp            
	//*   9   15:iflt            36
			d = d + (l - c);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #56  <Field long d>
	//   13   23:lload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #54  <Field long c>
	//   16   28:lsub            
	//   17   29:ladd            
	//   18   30:putfield        #56  <Field long d>
		else
	//*  19   33:goto            41
			d = 0L;
	//   20   36:aload_0         
	//   21   37:lconst_0        
	//   22   38:putfield        #56  <Field long d>
		return d;
	//   23   41:aload_0         
	//   24   42:getfield        #56  <Field long d>
	//   25   45:lreturn         
	}

	private void b(HashMap hashmap)
	{
		long l = Date.unixTime();
	//    0    0:invokestatic    #161 <Method long Date.unixTime()>
	//    1    3:lstore_2        
		a(l);
	//    2    4:aload_0         
	//    3    5:lload_2         
	//    4    6:invokespecial   #134 <Method void a(long)>
		e = e + 1;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #52  <Field int e>
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:putfield        #52  <Field int e>
		hashmap = a(Utils.mapOfStrings(((java.util.Map) (hashmap))));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #88  <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   14   24:invokespecial   #163 <Method HashMap a(HashMap)>
	//   15   27:astore_1        
		if(!hashmap.containsKey("ns_st_cn"))
	//*  16   28:aload_1         
	//*  17   29:ldc1            #136 <String "ns_st_cn">
	//*  18   31:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  19   34:ifne            51
			hashmap.put("ns_st_cn", ((Object) (String.valueOf(e))));
	//   20   37:aload_1         
	//   21   38:ldc1            #136 <String "ns_st_cn">
	//   22   40:aload_0         
	//   23   41:getfield        #52  <Field int e>
	//   24   44:invokestatic    #140 <Method String String.valueOf(int)>
	//   25   47:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   26   50:pop             
		if(!hashmap.containsKey("ns_st_pn"))
	//*  27   51:aload_1         
	//*  28   52:ldc1            #142 <String "ns_st_pn">
	//*  29   54:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  30   57:ifne            69
			hashmap.put("ns_st_pn", "1");
	//   31   60:aload_1         
	//   32   61:ldc1            #142 <String "ns_st_pn">
	//   33   63:ldc1            #144 <String "1">
	//   34   65:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   35   68:pop             
		if(!hashmap.containsKey("ns_st_tp"))
	//*  36   69:aload_1         
	//*  37   70:ldc1            #146 <String "ns_st_tp">
	//*  38   72:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  39   75:ifne            87
			hashmap.put("ns_st_tp", "1");
	//   40   78:aload_1         
	//   41   79:ldc1            #146 <String "ns_st_tp">
	//   42   81:ldc1            #144 <String "1">
	//   43   83:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   44   86:pop             
		if(!hashmap.containsKey("ns_st_ad"))
	//*  45   87:aload_1         
	//*  46   88:ldc1            #193 <String "ns_st_ad">
	//*  47   90:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  48   93:ifne            105
			hashmap.put("ns_st_ad", "1");
	//   49   96:aload_1         
	//   50   97:ldc1            #193 <String "ns_st_ad">
	//   51   99:ldc1            #144 <String "1">
	//   52  101:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   53  104:pop             
		b.setClip(hashmap);
	//   54  105:aload_0         
	//   55  106:getfield        #72  <Field StreamSense b>
	//   56  109:aload_1         
	//   57  110:invokevirtual   #150 <Method Boolean StreamSense.setClip(HashMap)>
	//   58  113:pop             
		d = 0L;
	//   59  114:aload_0         
	//   60  115:lconst_0        
	//   61  116:putfield        #56  <Field long d>
		b.notify(StreamSenseEventType.PLAY, d);
	//   62  119:aload_0         
	//   63  120:getfield        #72  <Field StreamSense b>
	//   64  123:getstatic       #153 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//   65  126:aload_0         
	//   66  127:getfield        #56  <Field long d>
	//   67  130:invokevirtual   #131 <Method void StreamSense.notify(StreamSenseEventType, long)>
		c = l;
	//   68  133:aload_0         
	//   69  134:lload_2         
	//   70  135:putfield        #54  <Field long c>
		h = false;
	//   71  138:aload_0         
	//   72  139:iconst_0        
	//   73  140:putfield        #60  <Field boolean h>
	//   74  143:return          
	}

	private boolean c(HashMap hashmap)
	{
		hashmap = a(Utils.mapOfStrings(((java.util.Map) (hashmap))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #88  <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//    3    5:invokespecial   #163 <Method HashMap a(HashMap)>
	//    4    8:astore_1        
		String as[] = a;
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field String[] a>
	//    7   13:astore          4
		int j = as.length;
	//    8   15:aload           4
	//    9   17:arraylength     
	//   10   18:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:iload_3         
	//*  15   23:icmpge          51
			if(!a(as[i], f, hashmap))
	//*  16   26:aload_0         
	//*  17   27:aload           4
	//*  18   29:iload_2         
	//*  19   30:aaload          
	//*  20   31:aload_0         
	//*  21   32:getfield        #58  <Field HashMap f>
	//*  22   35:aload_1         
	//*  23   36:invokespecial   #196 <Method boolean a(String, HashMap, HashMap)>
	//*  24   39:ifne            44
				return false;
	//   25   42:iconst_0        
	//   26   43:ireturn         

	//   27   44:iload_2         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore_2        
	//*  31   48:goto            21
		return true;
	//   32   51:iconst_1        
	//   33   52:ireturn         
	}

	public void playAdvertisement()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #90  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("ns_st_ct", "va");
	//    4    8:aload_1         
	//    5    9:ldc1            #48  <String "ns_st_ct">
	//    6   11:ldc1            #202 <String "va">
	//    7   13:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//    8   16:pop             
		b(hashmap);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #204 <Method void b(HashMap)>
	//   12   22:return          
	}

	public void playAudioAdvertisement()
	{
		playAudioAdvertisement(new HashMap());
	//    0    0:aload_0         
	//    1    1:new             #90  <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #200 <Method void HashMap()>
	//    4    8:invokevirtual   #208 <Method void playAudioAdvertisement(HashMap)>
	//    5   11:return          
	}

	public void playAudioAdvertisement(HashMap hashmap)
	{
		playAudioAdvertisement(hashmap, ((AdType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #211 <Method void playAudioAdvertisement(HashMap, AdType)>
	//    4    6:return          
	}

	public void playAudioAdvertisement(HashMap hashmap, AdType adtype)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #90  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void HashMap()>
	//    3    7:astore_3        
		if(hashmap != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			hashmap1.putAll(((java.util.Map) (hashmap)));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #215 <Method void HashMap.putAll(java.util.Map)>
		if(!hashmap1.containsKey("ns_st_ct"))
	//*   9   17:aload_3         
	//*  10   18:ldc1            #48  <String "ns_st_ct">
	//*  11   20:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  12   23:ifne            97
		{
			if(adtype == null)
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       60
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   15   30:new             #217 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #218 <Method void StringBuilder()>
	//   18   37:astore_1        
				((StringBuilder) (hashmap)).append("a");
	//   19   38:aload_1         
	//   20   39:ldc1            #219 <String "a">
	//   21   41:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
				((StringBuilder) (hashmap)).append("a");
	//   23   45:aload_1         
	//   24   46:ldc1            #219 <String "a">
	//   25   48:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   27   52:aload_1         
	//   28   53:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   29   56:astore_1        
			} else
	//*  30   57:goto            89
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   31   60:new             #217 <Class StringBuilder>
	//   32   63:dup             
	//   33   64:invokespecial   #218 <Method void StringBuilder()>
	//   34   67:astore_1        
				((StringBuilder) (hashmap)).append("a");
	//   35   68:aload_1         
	//   36   69:ldc1            #219 <String "a">
	//   37   71:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   38   74:pop             
				((StringBuilder) (hashmap)).append(adtype.a());
	//   39   75:aload_1         
	//   40   76:aload_2         
	//   41   77:invokevirtual   #231 <Method String AdType.a()>
	//   42   80:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   44   84:aload_1         
	//   45   85:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   46   88:astore_1        
			}
			hashmap1.put("ns_st_ct", ((Object) (hashmap)));
	//   47   89:aload_3         
	//   48   90:ldc1            #48  <String "ns_st_ct">
	//   49   92:aload_1         
	//   50   93:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   51   96:pop             
		}
		b(hashmap1);
	//   52   97:aload_0         
	//   53   98:aload_3         
	//   54   99:invokespecial   #204 <Method void b(HashMap)>
	//   55  102:return          
	}

	public void playAudioContentPart(HashMap hashmap)
	{
		playAudioContentPart(hashmap, ((ContentType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #236 <Method void playAudioContentPart(HashMap, ContentType)>
	//    4    6:return          
	}

	public void playAudioContentPart(HashMap hashmap, ContentType contenttype)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #90  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void HashMap()>
	//    3    7:astore_3        
		if(hashmap != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			hashmap1.putAll(((java.util.Map) (hashmap)));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #215 <Method void HashMap.putAll(java.util.Map)>
		if(!hashmap1.containsKey("ns_st_ct"))
	//*   9   17:aload_3         
	//*  10   18:ldc1            #48  <String "ns_st_ct">
	//*  11   20:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  12   23:ifne            97
		{
			if(contenttype == null)
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       60
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   15   30:new             #217 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #218 <Method void StringBuilder()>
	//   18   37:astore_1        
				((StringBuilder) (hashmap)).append("a");
	//   19   38:aload_1         
	//   20   39:ldc1            #219 <String "a">
	//   21   41:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
				((StringBuilder) (hashmap)).append("c");
	//   23   45:aload_1         
	//   24   46:ldc1            #237 <String "c">
	//   25   48:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   27   52:aload_1         
	//   28   53:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   29   56:astore_1        
			} else
	//*  30   57:goto            89
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   31   60:new             #217 <Class StringBuilder>
	//   32   63:dup             
	//   33   64:invokespecial   #218 <Method void StringBuilder()>
	//   34   67:astore_1        
				((StringBuilder) (hashmap)).append("a");
	//   35   68:aload_1         
	//   36   69:ldc1            #219 <String "a">
	//   37   71:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   38   74:pop             
				((StringBuilder) (hashmap)).append(contenttype.a());
	//   39   75:aload_1         
	//   40   76:aload_2         
	//   41   77:invokevirtual   #240 <Method String ContentType.a()>
	//   42   80:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   44   84:aload_1         
	//   45   85:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   46   88:astore_1        
			}
			hashmap1.put("ns_st_ct", ((Object) (hashmap)));
	//   47   89:aload_3         
	//   48   90:ldc1            #48  <String "ns_st_ct">
	//   49   92:aload_1         
	//   50   93:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   51   96:pop             
		}
		a(hashmap1, p.AudioContent);
	//   52   97:aload_0         
	//   53   98:aload_3         
	//   54   99:getstatic       #243 <Field p p.AudioContent>
	//   55  102:invokespecial   #245 <Method void a(HashMap, p)>
	//   56  105:return          
	}

	public void playContentPart(HashMap hashmap)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #90  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void HashMap()>
	//    3    7:astore_2        
		if(hashmap != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			hashmap1.putAll(((java.util.Map) (hashmap)));
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #215 <Method void HashMap.putAll(java.util.Map)>
		if(!hashmap1.containsKey("ns_st_ct"))
	//*   9   17:aload_2         
	//*  10   18:ldc1            #48  <String "ns_st_ct">
	//*  11   20:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  12   23:ifne            35
			hashmap1.put("ns_st_ct", "vc");
	//   13   26:aload_2         
	//   14   27:ldc1            #48  <String "ns_st_ct">
	//   15   29:ldc1            #249 <String "vc">
	//   16   31:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   17   34:pop             
		a(hashmap1, p.VideoContent);
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:getstatic       #252 <Field p p.VideoContent>
	//   21   40:invokespecial   #245 <Method void a(HashMap, p)>
	//   22   43:return          
	}

	public void playVideoAdvertisement()
	{
		playVideoAdvertisement(new HashMap());
	//    0    0:aload_0         
	//    1    1:new             #90  <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #200 <Method void HashMap()>
	//    4    8:invokevirtual   #255 <Method void playVideoAdvertisement(HashMap)>
	//    5   11:return          
	}

	public void playVideoAdvertisement(HashMap hashmap)
	{
		playVideoAdvertisement(hashmap, ((AdType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #257 <Method void playVideoAdvertisement(HashMap, AdType)>
	//    4    6:return          
	}

	public void playVideoAdvertisement(HashMap hashmap, AdType adtype)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #90  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void HashMap()>
	//    3    7:astore_3        
		if(hashmap != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			hashmap1.putAll(((java.util.Map) (hashmap)));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #215 <Method void HashMap.putAll(java.util.Map)>
		if(!hashmap1.containsKey("ns_st_ct"))
	//*   9   17:aload_3         
	//*  10   18:ldc1            #48  <String "ns_st_ct">
	//*  11   20:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  12   23:ifne            99
		{
			if(adtype == null)
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       61
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   15   30:new             #217 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #218 <Method void StringBuilder()>
	//   18   37:astore_1        
				((StringBuilder) (hashmap)).append("v");
	//   19   38:aload_1         
	//   20   39:ldc2            #259 <String "v">
	//   21   42:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
				((StringBuilder) (hashmap)).append("a");
	//   23   46:aload_1         
	//   24   47:ldc1            #219 <String "a">
	//   25   49:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   27   53:aload_1         
	//   28   54:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   29   57:astore_1        
			} else
	//*  30   58:goto            91
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   31   61:new             #217 <Class StringBuilder>
	//   32   64:dup             
	//   33   65:invokespecial   #218 <Method void StringBuilder()>
	//   34   68:astore_1        
				((StringBuilder) (hashmap)).append("v");
	//   35   69:aload_1         
	//   36   70:ldc2            #259 <String "v">
	//   37   73:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   38   76:pop             
				((StringBuilder) (hashmap)).append(adtype.a());
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:invokevirtual   #231 <Method String AdType.a()>
	//   42   82:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   44   86:aload_1         
	//   45   87:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   46   90:astore_1        
			}
			hashmap1.put("ns_st_ct", ((Object) (hashmap)));
	//   47   91:aload_3         
	//   48   92:ldc1            #48  <String "ns_st_ct">
	//   49   94:aload_1         
	//   50   95:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   51   98:pop             
		}
		b(hashmap1);
	//   52   99:aload_0         
	//   53  100:aload_3         
	//   54  101:invokespecial   #204 <Method void b(HashMap)>
	//   55  104:return          
	}

	public void playVideoContentPart(HashMap hashmap)
	{
		playVideoContentPart(hashmap, ((ContentType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #262 <Method void playVideoContentPart(HashMap, ContentType)>
	//    4    6:return          
	}

	public void playVideoContentPart(HashMap hashmap, ContentType contenttype)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #90  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void HashMap()>
	//    3    7:astore_3        
		if(hashmap != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			hashmap1.putAll(((java.util.Map) (hashmap)));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #215 <Method void HashMap.putAll(java.util.Map)>
		if(!hashmap1.containsKey("ns_st_ct"))
	//*   9   17:aload_3         
	//*  10   18:ldc1            #48  <String "ns_st_ct">
	//*  11   20:invokevirtual   #94  <Method boolean HashMap.containsKey(Object)>
	//*  12   23:ifne            99
		{
			if(contenttype == null)
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       61
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   15   30:new             #217 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #218 <Method void StringBuilder()>
	//   18   37:astore_1        
				((StringBuilder) (hashmap)).append("v");
	//   19   38:aload_1         
	//   20   39:ldc2            #259 <String "v">
	//   21   42:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
				((StringBuilder) (hashmap)).append("c");
	//   23   46:aload_1         
	//   24   47:ldc1            #237 <String "c">
	//   25   49:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   27   53:aload_1         
	//   28   54:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   29   57:astore_1        
			} else
	//*  30   58:goto            91
			{
				hashmap = ((HashMap) (new StringBuilder()));
	//   31   61:new             #217 <Class StringBuilder>
	//   32   64:dup             
	//   33   65:invokespecial   #218 <Method void StringBuilder()>
	//   34   68:astore_1        
				((StringBuilder) (hashmap)).append("v");
	//   35   69:aload_1         
	//   36   70:ldc2            #259 <String "v">
	//   37   73:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   38   76:pop             
				((StringBuilder) (hashmap)).append(contenttype.a());
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:invokevirtual   #240 <Method String ContentType.a()>
	//   42   82:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
				hashmap = ((HashMap) (((StringBuilder) (hashmap)).toString()));
	//   44   86:aload_1         
	//   45   87:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   46   90:astore_1        
			}
			hashmap1.put("ns_st_ct", ((Object) (hashmap)));
	//   47   91:aload_3         
	//   48   92:ldc1            #48  <String "ns_st_ct">
	//   49   94:aload_1         
	//   50   95:invokevirtual   #100 <Method Object HashMap.put(Object, Object)>
	//   51   98:pop             
		}
		a(hashmap1, p.VideoContent);
	//   52   99:aload_0         
	//   53  100:aload_3         
	//   54  101:getstatic       #252 <Field p p.VideoContent>
	//   55  104:invokespecial   #245 <Method void a(HashMap, p)>
	//   56  107:return          
	}

	public void stop()
	{
		long l = Date.unixTime();
	//    0    0:invokestatic    #161 <Method long Date.unixTime()>
	//    1    3:lstore_1        
		b.notify(StreamSenseEventType.PAUSE, b(l));
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field StreamSense b>
	//    4    8:getstatic       #266 <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//    5   11:aload_0         
	//    6   12:lload_1         
	//    7   13:invokespecial   #127 <Method long b(long)>
	//    8   16:invokevirtual   #131 <Method void StreamSense.notify(StreamSenseEventType, long)>
	//    9   19:return          
	}

	private String a[] = {
		"ns_st_ci", "c3", "c4", "c6", "ns_st_st", "ns_st_pu", "ns_st_pr", "ns_st_ep", "ns_st_sn", "ns_st_en", 
		"ns_st_ct"
	};
	private StreamSense b;
	private long c;
	private long d;
	private int e;
	private HashMap f;
	private p g;
	private boolean h;
}
