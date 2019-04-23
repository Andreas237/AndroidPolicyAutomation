// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.be;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			x, n

public class MediaMetadata extends AbstractSafeParcelable
{

	public MediaMetadata()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #149 <Method void MediaMetadata(int)>
	//    3    5:return          
	}

	public MediaMetadata(int i)
	{
		this(((List) (new ArrayList())), new Bundle(), i);
	//    0    0:aload_0         
	//    1    1:new             #151 <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #152 <Method void ArrayList()>
	//    4    8:new             #154 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #155 <Method void Bundle()>
	//    7   15:iload_1         
	//    8   16:invokespecial   #158 <Method void MediaMetadata(List, Bundle, int)>
	//    9   19:return          
	}

	MediaMetadata(List list, Bundle bundle, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void AbstractSafeParcelable()>
		c = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #161 <Field List c>
		d = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #163 <Field Bundle d>
		e = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #165 <Field int e>
	//   11   19:return          
	}

	private static void a(String s, int i)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #172 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            102
		{
			int j = b.c(s);
	//    3    7:getstatic       #145 <Field n b>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #175 <Method int com.google.android.gms.cast.n.c(String)>
	//    6   14:istore_2        
			if(j != i)
	//*   7   15:iload_2         
	//*   8   16:iload_1         
	//*   9   17:icmpeq          101
			{
				if(j == 0)
	//*  10   20:iload_2         
	//*  11   21:ifne            25
				{
					return;
	//   12   24:return          
				} else
				{
					String s1 = a[i];
	//   13   25:getstatic       #30  <Field String[] a>
	//   14   28:iload_1         
	//   15   29:aaload          
	//   16   30:astore_3        
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 21 + String.valueOf(((Object) (s1))).length());
	//   17   31:new             #177 <Class StringBuilder>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokestatic    #181 <Method String String.valueOf(Object)>
	//   21   39:invokevirtual   #185 <Method int String.length()>
	//   22   42:bipush          21
	//   23   44:iadd            
	//   24   45:aload_3         
	//   25   46:invokestatic    #181 <Method String String.valueOf(Object)>
	//   26   49:invokevirtual   #185 <Method int String.length()>
	//   27   52:iadd            
	//   28   53:invokespecial   #186 <Method void StringBuilder(int)>
	//   29   56:astore          4
					stringbuilder.append("Value for ");
	//   30   58:aload           4
	//   31   60:ldc1            #188 <String "Value for ">
	//   32   62:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
					stringbuilder.append(s);
	//   34   66:aload           4
	//   35   68:aload_0         
	//   36   69:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
					stringbuilder.append(" must be a ");
	//   38   73:aload           4
	//   39   75:ldc1            #194 <String " must be a ">
	//   40   77:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
					stringbuilder.append(s1);
	//   42   81:aload           4
	//   43   83:aload_3         
	//   44   84:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   45   87:pop             
					throw new IllegalArgumentException(stringbuilder.toString());
	//   46   88:new             #196 <Class IllegalArgumentException>
	//   47   91:dup             
	//   48   92:aload           4
	//   49   94:invokevirtual   #200 <Method String StringBuilder.toString()>
	//   50   97:invokespecial   #203 <Method void IllegalArgumentException(String)>
	//   51  100:athrow          
				}
			} else
			{
				return;
	//   52  101:return          
			}
		} else
		{
			throw new IllegalArgumentException("null and empty keys are not allowed");
	//   53  102:new             #196 <Class IllegalArgumentException>
	//   54  105:dup             
	//   55  106:ldc1            #205 <String "null and empty keys are not allowed">
	//   56  108:invokespecial   #203 <Method void IllegalArgumentException(String)>
	//   57  111:athrow          
		}
	}

	private final boolean a(Bundle bundle, Bundle bundle1)
	{
label0:
		{
			if(bundle.size() != bundle1.size())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #209 <Method int Bundle.size()>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #209 <Method int Bundle.size()>
	//*   4    8:icmpeq          13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			Iterator iterator = bundle.keySet().iterator();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #213 <Method Set Bundle.keySet()>
	//    9   17:invokeinterface #219 <Method Iterator Set.iterator()>
	//   10   22:astore_3        
			Object obj;
			Object obj1;
label1:
			do
			{
				String s;
				do
				{
					if(!iterator.hasNext())
						break label0;
	//   11   23:aload_3         
	//   12   24:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            127
					s = (String)iterator.next();
	//   14   32:aload_3         
	//   15   33:invokeinterface #229 <Method Object Iterator.next()>
	//   16   38:checkcast       #20  <Class String>
	//   17   41:astore          4
					obj = bundle.get(s);
	//   18   43:aload_1         
	//   19   44:aload           4
	//   20   46:invokevirtual   #233 <Method Object Bundle.get(String)>
	//   21   49:astore          5
					obj1 = bundle1.get(s);
	//   22   51:aload_2         
	//   23   52:aload           4
	//   24   54:invokevirtual   #233 <Method Object Bundle.get(String)>
	//   25   57:astore          6
					if((obj instanceof Bundle) && (obj1 instanceof Bundle) && !a((Bundle)obj, (Bundle)obj1))
	//*  26   59:aload           5
	//*  27   61:instanceof      #154 <Class Bundle>
	//*  28   64:ifeq            94
	//*  29   67:aload           6
	//*  30   69:instanceof      #154 <Class Bundle>
	//*  31   72:ifeq            94
	//*  32   75:aload_0         
	//*  33   76:aload           5
	//*  34   78:checkcast       #154 <Class Bundle>
	//*  35   81:aload           6
	//*  36   83:checkcast       #154 <Class Bundle>
	//*  37   86:invokespecial   #235 <Method boolean a(Bundle, Bundle)>
	//*  38   89:ifne            94
						return false;
	//   39   92:iconst_0        
	//   40   93:ireturn         
					if(obj != null)
						continue label1;
	//   41   94:aload           5
	//   42   96:ifnonnull       115
				} while(obj1 == null && bundle1.containsKey(s));
	//   43   99:aload           6
	//   44  101:ifnonnull       113
	//   45  104:aload_2         
	//   46  105:aload           4
	//   47  107:invokevirtual   #239 <Method boolean Bundle.containsKey(String)>
	//   48  110:ifne            23
				return false;
	//   49  113:iconst_0        
	//   50  114:ireturn         
			} while(obj.equals(obj1));
	//   51  115:aload           5
	//   52  117:aload           6
	//   53  119:invokevirtual   #245 <Method boolean Object.equals(Object)>
	//   54  122:ifne            23
			return false;
	//   55  125:iconst_0        
	//   56  126:ireturn         
		}
		return true;
	//   57  127:iconst_1        
	//   58  128:ireturn         
	}

	public int a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int e>
	//    2    4:ireturn         
	}

	public String a(String s)
	{
		a(s, 1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #248 <Method void a(String, int)>
		return d.getString(s);
	//    3    5:aload_0         
	//    4    6:getfield        #163 <Field Bundle d>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #251 <Method String Bundle.getString(String)>
	//    7   13:areturn         
	}

	public void a(WebImage webimage)
	{
		c.add(((Object) (webimage)));
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field List c>
	//    2    4:aload_1         
	//    3    5:invokeinterface #257 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void a(String s, String s1)
	{
		a(s, 1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #248 <Method void a(String, int)>
		d.putString(s, s1);
	//    3    5:aload_0         
	//    4    6:getfield        #163 <Field Bundle d>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #261 <Method void Bundle.putString(String, String)>
	//    8   14:return          
	}

	public final void a(JSONObject jsonobject)
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method void b()>
		e = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #165 <Field int e>
		double d1;
		boolean flag;
		long l;
		Object obj;
		Iterator iterator;
		String s;
		Object obj1;
		Object obj2;
		try
		{
			e = jsonobject.getInt("metadataType");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc2            #268 <String "metadataType">
	//    8   14:invokevirtual   #273 <Method int JSONObject.getInt(String)>
	//    9   17:putfield        #165 <Field int e>
		}
	//*  10   20:aload_1         
	//*  11   21:ldc2            #275 <String "images">
	//*  12   24:invokevirtual   #279 <Method JSONArray JSONObject.optJSONArray(String)>
	//*  13   27:astore          7
	//*  14   29:aload           7
	//*  15   31:ifnull          43
	//*  16   34:aload_0         
	//*  17   35:getfield        #161 <Field List c>
	//*  18   38:aload           7
	//*  19   40:invokestatic    #284 <Method void be.a(List, JSONArray)>
	//*  20   43:new             #151 <Class ArrayList>
	//*  21   46:dup             
	//*  22   47:invokespecial   #152 <Method void ArrayList()>
	//*  23   50:astore          7
	//*  24   52:aload_0         
	//*  25   53:getfield        #165 <Field int e>
	//*  26   56:tableswitch     0 4: default 92
	//	               0 278
	//	               1 245
	//	               2 207
	//	               3 151
	//	               4 95
	//*  27   92:goto            308
	//*  28   95:aload           7
	//*  29   97:bipush          8
	//*  30   99:anewarray       String[]
	//*  31  102:dup             
	//*  32  103:iconst_0        
	//*  33  104:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  34  106:aastore         
	//*  35  107:dup             
	//*  36  108:iconst_1        
	//*  37  109:ldc1            #65  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  38  111:aastore         
	//*  39  112:dup             
	//*  40  113:iconst_2        
	//*  41  114:ldc1            #113 <String "com.google.android.gms.cast.metadata.LOCATION_NAME">
	//*  42  116:aastore         
	//*  43  117:dup             
	//*  44  118:iconst_3        
	//*  45  119:ldc1            #117 <String "com.google.android.gms.cast.metadata.LOCATION_LATITUDE">
	//*  46  121:aastore         
	//*  47  122:dup             
	//*  48  123:iconst_4        
	//*  49  124:ldc1            #121 <String "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE">
	//*  50  126:aastore         
	//*  51  127:dup             
	//*  52  128:iconst_5        
	//*  53  129:ldc1            #105 <String "com.google.android.gms.cast.metadata.WIDTH">
	//*  54  131:aastore         
	//*  55  132:dup             
	//*  56  133:bipush          6
	//*  57  135:ldc1            #109 <String "com.google.android.gms.cast.metadata.HEIGHT">
	//*  58  137:aastore         
	//*  59  138:dup             
	//*  60  139:bipush          7
	//*  61  141:ldc1            #42  <String "com.google.android.gms.cast.metadata.CREATION_DATE">
	//*  62  143:aastore         
	//*  63  144:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//*  64  147:pop             
	//*  65  148:goto            308
	//*  66  151:aload           7
	//*  67  153:bipush          8
	//*  68  155:anewarray       String[]
	//*  69  158:dup             
	//*  70  159:iconst_0        
	//*  71  160:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  72  162:aastore         
	//*  73  163:dup             
	//*  74  164:iconst_1        
	//*  75  165:ldc1            #73  <String "com.google.android.gms.cast.metadata.ALBUM_TITLE">
	//*  76  167:aastore         
	//*  77  168:dup             
	//*  78  169:iconst_2        
	//*  79  170:ldc1            #65  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  80  172:aastore         
	//*  81  173:dup             
	//*  82  174:iconst_3        
	//*  83  175:ldc1            #69  <String "com.google.android.gms.cast.metadata.ALBUM_ARTIST">
	//*  84  177:aastore         
	//*  85  178:dup             
	//*  86  179:iconst_4        
	//*  87  180:ldc1            #77  <String "com.google.android.gms.cast.metadata.COMPOSER">
	//*  88  182:aastore         
	//*  89  183:dup             
	//*  90  184:iconst_5        
	//*  91  185:ldc1            #85  <String "com.google.android.gms.cast.metadata.TRACK_NUMBER">
	//*  92  187:aastore         
	//*  93  188:dup             
	//*  94  189:bipush          6
	//*  95  191:ldc1            #81  <String "com.google.android.gms.cast.metadata.DISC_NUMBER">
	//*  96  193:aastore         
	//*  97  194:dup             
	//*  98  195:bipush          7
	//*  99  197:ldc1            #49  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 100  199:aastore         
	//* 101  200:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 102  203:pop             
	//* 103  204:goto            308
	//* 104  207:aload           7
	//* 105  209:iconst_5        
	//* 106  210:anewarray       String[]
	//* 107  213:dup             
	//* 108  214:iconst_0        
	//* 109  215:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 110  217:aastore         
	//* 111  218:dup             
	//* 112  219:iconst_1        
	//* 113  220:ldc1            #97  <String "com.google.android.gms.cast.metadata.SERIES_TITLE">
	//* 114  222:aastore         
	//* 115  223:dup             
	//* 116  224:iconst_2        
	//* 117  225:ldc1            #89  <String "com.google.android.gms.cast.metadata.SEASON_NUMBER">
	//* 118  227:aastore         
	//* 119  228:dup             
	//* 120  229:iconst_3        
	//* 121  230:ldc1            #93  <String "com.google.android.gms.cast.metadata.EPISODE_NUMBER">
	//* 122  232:aastore         
	//* 123  233:dup             
	//* 124  234:iconst_4        
	//* 125  235:ldc1            #53  <String "com.google.android.gms.cast.metadata.BROADCAST_DATE">
	//* 126  237:aastore         
	//* 127  238:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 128  241:pop             
	//* 129  242:goto            308
	//* 130  245:aload           7
	//* 131  247:iconst_4        
	//* 132  248:anewarray       String[]
	//* 133  251:dup             
	//* 134  252:iconst_0        
	//* 135  253:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 136  255:aastore         
	//* 137  256:dup             
	//* 138  257:iconst_1        
	//* 139  258:ldc1            #101 <String "com.google.android.gms.cast.metadata.STUDIO">
	//* 140  260:aastore         
	//* 141  261:dup             
	//* 142  262:iconst_2        
	//* 143  263:ldc1            #61  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 144  265:aastore         
	//* 145  266:dup             
	//* 146  267:iconst_3        
	//* 147  268:ldc1            #49  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 148  270:aastore         
	//* 149  271:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 150  274:pop             
	//* 151  275:goto            308
	//* 152  278:aload           7
	//* 153  280:iconst_4        
	//* 154  281:anewarray       String[]
	//* 155  284:dup             
	//* 156  285:iconst_0        
	//* 157  286:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 158  288:aastore         
	//* 159  289:dup             
	//* 160  290:iconst_1        
	//* 161  291:ldc1            #65  <String "com.google.android.gms.cast.metadata.ARTIST">
	//* 162  293:aastore         
	//* 163  294:dup             
	//* 164  295:iconst_2        
	//* 165  296:ldc1            #61  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 166  298:aastore         
	//* 167  299:dup             
	//* 168  300:iconst_3        
	//* 169  301:ldc1            #49  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 170  303:aastore         
	//* 171  304:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 172  307:pop             
	//* 173  308:aload           7
	//* 174  310:iconst_1        
	//* 175  311:anewarray       String[]
	//* 176  314:dup             
	//* 177  315:iconst_0        
	//* 178  316:ldc1            #141 <String "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID">
	//* 179  318:aastore         
	//* 180  319:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 181  322:pop             
	//* 182  323:new             #292 <Class HashSet>
	//* 183  326:dup             
	//* 184  327:aload           7
	//* 185  329:invokespecial   #295 <Method void HashSet(java.util.Collection)>
	//* 186  332:astore          7
	//* 187  334:aload_1         
	//* 188  335:invokevirtual   #298 <Method Iterator JSONObject.keys()>
	//* 189  338:astore          8
	//* 190  340:aload           8
	//* 191  342:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//* 192  347:ifeq            712
	//* 193  350:aload           8
	//* 194  352:invokeinterface #229 <Method Object Iterator.next()>
	//* 195  357:checkcast       #20  <Class String>
	//* 196  360:astore          9
	//* 197  362:ldc2            #268 <String "metadataType">
	//* 198  365:aload           9
	//* 199  367:invokevirtual   #299 <Method boolean String.equals(Object)>
	//* 200  370:ifne            340
	//* 201  373:getstatic       #145 <Field n b>
	//* 202  376:aload           9
	//* 203  378:invokevirtual   #301 <Method String n.b(String)>
	//* 204  381:astore          10
	//* 205  383:aload           10
	//* 206  385:ifnull          623
	//* 207  388:aload           7
	//* 208  390:aload           10
	//* 209  392:invokeinterface #304 <Method boolean Set.contains(Object)>
	//* 210  397:istore          4
	//* 211  399:iload           4
	//* 212  401:ifeq            340
	//* 213  404:aload_1         
	//* 214  405:aload           9
	//* 215  407:invokevirtual   #305 <Method Object JSONObject.get(String)>
	//* 216  410:astore          11
	//* 217  412:aload           11
	//* 218  414:ifnonnull       420
	//* 219  417:goto            340
	//* 220  420:getstatic       #145 <Field n b>
	//* 221  423:aload           10
	//* 222  425:invokevirtual   #175 <Method int com.google.android.gms.cast.n.c(String)>
	//* 223  428:tableswitch     1 5: default 725
	//	               1 598
	//	               2 570
	//	               3 543
	//	               4 507
	//	               5 464
	//* 224  464:aload_0         
	//* 225  465:getfield        #163 <Field Bundle d>
	//* 226  468:astore          11
	//* 227  470:aload_1         
	//* 228  471:aload           9
	//* 229  473:invokevirtual   #309 <Method long JSONObject.optLong(String)>
	//* 230  476:lstore          5
	//* 231  478:lload           5
	//* 232  480:l2d             
	//* 233  481:dstore_2        
	//* 234  482:dload_2         
	//* 235  483:invokestatic    #315 <Method boolean Double.isNaN(double)>
	//* 236  486:pop             
	//* 237  487:dload_2         
	//* 238  488:ldc2w           #316 <Double 1000D>
	//* 239  491:dmul            
	//* 240  492:d2l             
	//* 241  493:lstore          5
	//* 242  495:aload           11
	//* 243  497:aload           10
	//* 244  499:lload           5
	//* 245  501:invokevirtual   #321 <Method void Bundle.putLong(String, long)>
	//* 246  504:goto            340
	//* 247  507:aload           11
	//* 248  509:instanceof      #20  <Class String>
	//* 249  512:ifeq            340
	//* 250  515:aload           11
	//* 251  517:checkcast       #20  <Class String>
	//* 252  520:invokestatic    #324 <Method java.util.Calendar be.a(String)>
	//* 253  523:ifnull          340
	//* 254  526:aload_0         
	//* 255  527:getfield        #163 <Field Bundle d>
	//* 256  530:aload           10
	//* 257  532:aload           11
	//* 258  534:checkcast       #20  <Class String>
	//* 259  537:invokevirtual   #261 <Method void Bundle.putString(String, String)>
	//* 260  540:goto            340
	//* 261  543:aload_1         
	//* 262  544:aload           9
	//* 263  546:invokevirtual   #328 <Method double JSONObject.optDouble(String)>
	//* 264  549:dstore_2        
	//* 265  550:dload_2         
	//* 266  551:invokestatic    #315 <Method boolean Double.isNaN(double)>
	//* 267  554:ifne            340
	//* 268  557:aload_0         
	//* 269  558:getfield        #163 <Field Bundle d>
	//* 270  561:aload           10
	//* 271  563:dload_2         
	//* 272  564:invokevirtual   #332 <Method void Bundle.putDouble(String, double)>
	//* 273  567:goto            340
	//* 274  570:aload           11
	//* 275  572:instanceof      #334 <Class Integer>
	//* 276  575:ifeq            340
	//* 277  578:aload_0         
	//* 278  579:getfield        #163 <Field Bundle d>
	//* 279  582:aload           10
	//* 280  584:aload           11
	//* 281  586:checkcast       #334 <Class Integer>
	//* 282  589:invokevirtual   #337 <Method int Integer.intValue()>
	//* 283  592:invokevirtual   #340 <Method void Bundle.putInt(String, int)>
	//* 284  595:goto            340
	//* 285  598:aload           11
	//* 286  600:instanceof      #20  <Class String>
	//* 287  603:ifeq            340
	//* 288  606:aload_0         
	//* 289  607:getfield        #163 <Field Bundle d>
	//* 290  610:aload           10
	//* 291  612:aload           11
	//* 292  614:checkcast       #20  <Class String>
	//* 293  617:invokevirtual   #261 <Method void Bundle.putString(String, String)>
	//* 294  620:goto            340
	//* 295  623:aload_1         
	//* 296  624:aload           9
	//* 297  626:invokevirtual   #305 <Method Object JSONObject.get(String)>
	//* 298  629:astore          10
	//* 299  631:aload           10
	//* 300  633:instanceof      #20  <Class String>
	//* 301  636:ifeq            656
	//* 302  639:aload_0         
	//* 303  640:getfield        #163 <Field Bundle d>
	//* 304  643:aload           9
	//* 305  645:aload           10
	//* 306  647:checkcast       #20  <Class String>
	//* 307  650:invokevirtual   #261 <Method void Bundle.putString(String, String)>
	//* 308  653:goto            340
	//* 309  656:aload           10
	//* 310  658:instanceof      #334 <Class Integer>
	//* 311  661:ifeq            684
	//* 312  664:aload_0         
	//* 313  665:getfield        #163 <Field Bundle d>
	//* 314  668:aload           9
	//* 315  670:aload           10
	//* 316  672:checkcast       #334 <Class Integer>
	//* 317  675:invokevirtual   #337 <Method int Integer.intValue()>
	//* 318  678:invokevirtual   #340 <Method void Bundle.putInt(String, int)>
	//* 319  681:goto            340
	//* 320  684:aload           10
	//* 321  686:instanceof      #311 <Class Double>
	//* 322  689:ifeq            340
	//* 323  692:aload_0         
	//* 324  693:getfield        #163 <Field Bundle d>
	//* 325  696:aload           9
	//* 326  698:aload           10
	//* 327  700:checkcast       #311 <Class Double>
	//* 328  703:invokevirtual   #344 <Method double Double.doubleValue()>
	//* 329  706:invokevirtual   #332 <Method void Bundle.putDouble(String, double)>
	//* 330  709:goto            340
	//* 331  712:return          
		catch(JSONException jsonexception) { }
	//  332  713:astore          7
		obj = ((Object) (jsonobject.optJSONArray("images")));
		if(obj != null)
			be.a(c, ((JSONArray) (obj)));
		obj = ((Object) (new ArrayList()));
		switch(e)
		{
		case 4: // '\004'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
			})));
			break;

		case 3: // '\003'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			})));
			break;

		case 2: // '\002'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
			})));
			break;

		case 1: // '\001'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			})));
			break;

		case 0: // '\0'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			})));
			break;
		}
		Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
			"com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"
		})));
		obj = ((Object) (new HashSet(((java.util.Collection) (obj)))));
		iterator = jsonobject.keys();
_L4:
		if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
		s = (String)iterator.next();
		if("metadataType".equals(((Object) (s)))) goto _L4; else goto _L3
_L3:
		obj1 = ((Object) (b.b(s)));
		if(obj1 == null) goto _L6; else goto _L5
_L5:
		try
		{
			flag = ((Set) (obj)).contains(obj1);
		}
	//* 333  715:goto            20
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 334  718:astore_1        
		{
			return;
	//  335  719:return          
		}
		if(!flag) goto _L4; else goto _L7
_L7:
		obj2 = jsonobject.get(s);
		if(obj2 != null) goto _L8; else goto _L4
_L8:
		b.c(((String) (obj1)));
		JVM INSTR tableswitch 1 5: default 725
	//	               1 598
	//	               2 570
	//	               3 543
	//	               4 507
	//	               5 464;
		   goto _L4 _L9 _L10 _L11 _L12 _L13
_L13:
		obj2 = ((Object) (d));
		l = jsonobject.optLong(s);
		d1 = l;
		Double.isNaN(d1);
		l = (long)(d1 * 1000D);
		try
		{
			((Bundle) (obj2)).putLong(((String) (obj1)), l);
		}
		catch(JSONException jsonexception1) { }
	//  336  720:astore          9
		  goto _L4
_L12:
		if(!(obj2 instanceof String) || be.a((String)obj2) == null) goto _L4; else goto _L14
_L14:
		d.putString(((String) (obj1)), (String)obj2);
		  goto _L4
_L11:
		d1 = jsonobject.optDouble(s);
		if(!Double.isNaN(d1))
			d.putDouble(((String) (obj1)), d1);
		  goto _L4
_L10:
		if(!(obj2 instanceof Integer)) goto _L4; else goto _L15
_L15:
		d.putInt(((String) (obj1)), ((Integer)obj2).intValue());
		  goto _L4
_L9:
		if(!(obj2 instanceof String)) goto _L4; else goto _L16
_L16:
		d.putString(((String) (obj1)), (String)obj2);
		  goto _L4
_L6:
		obj1 = jsonobject.get(s);
		if(!(obj1 instanceof String)) goto _L18; else goto _L17
_L17:
		d.putString(s, (String)obj1);
		  goto _L4
_L18:
		if(!(obj1 instanceof Integer)) goto _L20; else goto _L19
_L19:
		d.putInt(s, ((Integer)obj1).intValue());
		  goto _L4
_L20:
		if(!(obj1 instanceof Double)) goto _L4; else goto _L21
_L21:
		d.putDouble(s, ((Double)obj1).doubleValue());
		  goto _L4
_L2:
	//* 337  722:goto            340
	//* 338  725:goto            340
	}

	public void b()
	{
		d.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field Bundle d>
	//    2    4:invokevirtual   #347 <Method void Bundle.clear()>
		c.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #161 <Field List c>
	//    5   11:invokeinterface #348 <Method void List.clear()>
	//    6   16:return          
	}

	public final JSONObject c()
	{
		int i;
		int j;
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #270 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #350 <Method void JSONObject()>
	//    3    7:astore          8
		double d1;
		int k;
		long l;
		Object obj;
		Object obj1;
		Object obj2;
		try
		{
			jsonobject.put("metadataType", e);
	//    4    9:aload           8
	//    5   11:ldc2            #268 <String "metadataType">
	//    6   14:aload_0         
	//    7   15:getfield        #165 <Field int e>
	//    8   18:invokevirtual   #354 <Method JSONObject JSONObject.put(String, int)>
	//    9   21:pop             
		}
	//*  10   22:aload_0         
	//*  11   23:getfield        #161 <Field List c>
	//*  12   26:invokestatic    #357 <Method JSONArray be.a(List)>
	//*  13   29:astore          9
	//*  14   31:aload           9
	//*  15   33:ifnull          58
	//*  16   36:aload           9
	//*  17   38:invokevirtual   #360 <Method int JSONArray.length()>
	//*  18   41:ifeq            58
	//*  19   44:aload           8
	//*  20   46:ldc2            #275 <String "images">
	//*  21   49:aload           9
	//*  22   51:invokevirtual   #363 <Method JSONObject JSONObject.put(String, Object)>
	//*  23   54:pop             
	//*  24   55:goto            58
	//*  25   58:new             #151 <Class ArrayList>
	//*  26   61:dup             
	//*  27   62:invokespecial   #152 <Method void ArrayList()>
	//*  28   65:astore          9
	//*  29   67:aload_0         
	//*  30   68:getfield        #165 <Field int e>
	//*  31   71:istore          4
	//*  32   73:iconst_0        
	//*  33   74:istore_3        
	//*  34   75:iload           4
	//*  35   77:tableswitch     0 4: default 112
	//	               0 298
	//	               1 265
	//	               2 227
	//	               3 171
	//	               4 115
	//*  36  112:goto            328
	//*  37  115:aload           9
	//*  38  117:bipush          8
	//*  39  119:anewarray       String[]
	//*  40  122:dup             
	//*  41  123:iconst_0        
	//*  42  124:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  43  126:aastore         
	//*  44  127:dup             
	//*  45  128:iconst_1        
	//*  46  129:ldc1            #65  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  47  131:aastore         
	//*  48  132:dup             
	//*  49  133:iconst_2        
	//*  50  134:ldc1            #113 <String "com.google.android.gms.cast.metadata.LOCATION_NAME">
	//*  51  136:aastore         
	//*  52  137:dup             
	//*  53  138:iconst_3        
	//*  54  139:ldc1            #117 <String "com.google.android.gms.cast.metadata.LOCATION_LATITUDE">
	//*  55  141:aastore         
	//*  56  142:dup             
	//*  57  143:iconst_4        
	//*  58  144:ldc1            #121 <String "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE">
	//*  59  146:aastore         
	//*  60  147:dup             
	//*  61  148:iconst_5        
	//*  62  149:ldc1            #105 <String "com.google.android.gms.cast.metadata.WIDTH">
	//*  63  151:aastore         
	//*  64  152:dup             
	//*  65  153:bipush          6
	//*  66  155:ldc1            #109 <String "com.google.android.gms.cast.metadata.HEIGHT">
	//*  67  157:aastore         
	//*  68  158:dup             
	//*  69  159:bipush          7
	//*  70  161:ldc1            #42  <String "com.google.android.gms.cast.metadata.CREATION_DATE">
	//*  71  163:aastore         
	//*  72  164:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//*  73  167:pop             
	//*  74  168:goto            328
	//*  75  171:aload           9
	//*  76  173:bipush          8
	//*  77  175:anewarray       String[]
	//*  78  178:dup             
	//*  79  179:iconst_0        
	//*  80  180:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  81  182:aastore         
	//*  82  183:dup             
	//*  83  184:iconst_1        
	//*  84  185:ldc1            #65  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  85  187:aastore         
	//*  86  188:dup             
	//*  87  189:iconst_2        
	//*  88  190:ldc1            #73  <String "com.google.android.gms.cast.metadata.ALBUM_TITLE">
	//*  89  192:aastore         
	//*  90  193:dup             
	//*  91  194:iconst_3        
	//*  92  195:ldc1            #69  <String "com.google.android.gms.cast.metadata.ALBUM_ARTIST">
	//*  93  197:aastore         
	//*  94  198:dup             
	//*  95  199:iconst_4        
	//*  96  200:ldc1            #77  <String "com.google.android.gms.cast.metadata.COMPOSER">
	//*  97  202:aastore         
	//*  98  203:dup             
	//*  99  204:iconst_5        
	//* 100  205:ldc1            #85  <String "com.google.android.gms.cast.metadata.TRACK_NUMBER">
	//* 101  207:aastore         
	//* 102  208:dup             
	//* 103  209:bipush          6
	//* 104  211:ldc1            #81  <String "com.google.android.gms.cast.metadata.DISC_NUMBER">
	//* 105  213:aastore         
	//* 106  214:dup             
	//* 107  215:bipush          7
	//* 108  217:ldc1            #49  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 109  219:aastore         
	//* 110  220:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 111  223:pop             
	//* 112  224:goto            328
	//* 113  227:aload           9
	//* 114  229:iconst_5        
	//* 115  230:anewarray       String[]
	//* 116  233:dup             
	//* 117  234:iconst_0        
	//* 118  235:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 119  237:aastore         
	//* 120  238:dup             
	//* 121  239:iconst_1        
	//* 122  240:ldc1            #97  <String "com.google.android.gms.cast.metadata.SERIES_TITLE">
	//* 123  242:aastore         
	//* 124  243:dup             
	//* 125  244:iconst_2        
	//* 126  245:ldc1            #89  <String "com.google.android.gms.cast.metadata.SEASON_NUMBER">
	//* 127  247:aastore         
	//* 128  248:dup             
	//* 129  249:iconst_3        
	//* 130  250:ldc1            #93  <String "com.google.android.gms.cast.metadata.EPISODE_NUMBER">
	//* 131  252:aastore         
	//* 132  253:dup             
	//* 133  254:iconst_4        
	//* 134  255:ldc1            #53  <String "com.google.android.gms.cast.metadata.BROADCAST_DATE">
	//* 135  257:aastore         
	//* 136  258:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 137  261:pop             
	//* 138  262:goto            328
	//* 139  265:aload           9
	//* 140  267:iconst_4        
	//* 141  268:anewarray       String[]
	//* 142  271:dup             
	//* 143  272:iconst_0        
	//* 144  273:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 145  275:aastore         
	//* 146  276:dup             
	//* 147  277:iconst_1        
	//* 148  278:ldc1            #101 <String "com.google.android.gms.cast.metadata.STUDIO">
	//* 149  280:aastore         
	//* 150  281:dup             
	//* 151  282:iconst_2        
	//* 152  283:ldc1            #61  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 153  285:aastore         
	//* 154  286:dup             
	//* 155  287:iconst_3        
	//* 156  288:ldc1            #49  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 157  290:aastore         
	//* 158  291:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 159  294:pop             
	//* 160  295:goto            328
	//* 161  298:aload           9
	//* 162  300:iconst_4        
	//* 163  301:anewarray       String[]
	//* 164  304:dup             
	//* 165  305:iconst_0        
	//* 166  306:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 167  308:aastore         
	//* 168  309:dup             
	//* 169  310:iconst_1        
	//* 170  311:ldc1            #65  <String "com.google.android.gms.cast.metadata.ARTIST">
	//* 171  313:aastore         
	//* 172  314:dup             
	//* 173  315:iconst_2        
	//* 174  316:ldc1            #61  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 175  318:aastore         
	//* 176  319:dup             
	//* 177  320:iconst_3        
	//* 178  321:ldc1            #49  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 179  323:aastore         
	//* 180  324:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 181  327:pop             
	//* 182  328:aload           9
	//* 183  330:iconst_5        
	//* 184  331:anewarray       String[]
	//* 185  334:dup             
	//* 186  335:iconst_0        
	//* 187  336:ldc1            #125 <String "com.google.android.gms.cast.metadata.SECTION_DURATION">
	//* 188  338:aastore         
	//* 189  339:dup             
	//* 190  340:iconst_1        
	//* 191  341:ldc1            #129 <String "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA">
	//* 192  343:aastore         
	//* 193  344:dup             
	//* 194  345:iconst_2        
	//* 195  346:ldc1            #133 <String "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME">
	//* 196  348:aastore         
	//* 197  349:dup             
	//* 198  350:iconst_3        
	//* 199  351:ldc1            #137 <String "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER">
	//* 200  353:aastore         
	//* 201  354:dup             
	//* 202  355:iconst_4        
	//* 203  356:ldc1            #141 <String "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID">
	//* 204  358:aastore         
	//* 205  359:invokestatic    #290 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//* 206  362:pop             
	//* 207  363:aload           9
	//* 208  365:checkcast       #151 <Class ArrayList>
	//* 209  368:astore          9
	//* 210  370:aload           9
	//* 211  372:invokevirtual   #364 <Method int ArrayList.size()>
	//* 212  375:istore          5
	//* 213  377:iload_3         
	//* 214  378:iload           5
	//* 215  380:icmpge          598
	//* 216  383:aload           9
	//* 217  385:iload_3         
	//* 218  386:invokevirtual   #367 <Method Object ArrayList.get(int)>
	//* 219  389:astore          10
	//* 220  391:iload_3         
	//* 221  392:iconst_1        
	//* 222  393:iadd            
	//* 223  394:istore          4
	//* 224  396:aload           10
	//* 225  398:checkcast       #20  <Class String>
	//* 226  401:astore          10
	//* 227  403:iload           4
	//* 228  405:istore_3        
	//* 229  406:aload_0         
	//* 230  407:getfield        #163 <Field Bundle d>
	//* 231  410:aload           10
	//* 232  412:invokevirtual   #239 <Method boolean Bundle.containsKey(String)>
	//* 233  415:ifeq            377
	//* 234  418:getstatic       #145 <Field n b>
	//* 235  421:aload           10
	//* 236  423:invokevirtual   #175 <Method int com.google.android.gms.cast.n.c(String)>
	//* 237  426:tableswitch     1 5: default 737
	//	               1 569
	//	               2 540
	//	               3 511
	//	               4 569
	//	               5 460
	//* 238  460:getstatic       #145 <Field n b>
	//* 239  463:aload           10
	//* 240  465:invokevirtual   #369 <Method String n.a(String)>
	//* 241  468:astore          11
	//* 242  470:aload_0         
	//* 243  471:getfield        #163 <Field Bundle d>
	//* 244  474:aload           10
	//* 245  476:invokevirtual   #372 <Method long Bundle.getLong(String)>
	//* 246  479:lstore          6
	//* 247  481:lload           6
	//* 248  483:l2d             
	//* 249  484:dstore_1        
	//* 250  485:dload_1         
	//* 251  486:invokestatic    #315 <Method boolean Double.isNaN(double)>
	//* 252  489:pop             
	//* 253  490:dload_1         
	//* 254  491:ldc2w           #316 <Double 1000D>
	//* 255  494:ddiv            
	//* 256  495:dstore_1        
	//* 257  496:aload           8
	//* 258  498:aload           11
	//* 259  500:dload_1         
	//* 260  501:invokevirtual   #375 <Method JSONObject JSONObject.put(String, double)>
	//* 261  504:pop             
	//* 262  505:iload           4
	//* 263  507:istore_3        
	//* 264  508:goto            377
	//* 265  511:aload           8
	//* 266  513:getstatic       #145 <Field n b>
	//* 267  516:aload           10
	//* 268  518:invokevirtual   #369 <Method String n.a(String)>
	//* 269  521:aload_0         
	//* 270  522:getfield        #163 <Field Bundle d>
	//* 271  525:aload           10
	//* 272  527:invokevirtual   #378 <Method double Bundle.getDouble(String)>
	//* 273  530:invokevirtual   #375 <Method JSONObject JSONObject.put(String, double)>
	//* 274  533:pop             
	//* 275  534:iload           4
	//* 276  536:istore_3        
	//* 277  537:goto            377
	//* 278  540:aload           8
	//* 279  542:getstatic       #145 <Field n b>
	//* 280  545:aload           10
	//* 281  547:invokevirtual   #369 <Method String n.a(String)>
	//* 282  550:aload_0         
	//* 283  551:getfield        #163 <Field Bundle d>
	//* 284  554:aload           10
	//* 285  556:invokevirtual   #379 <Method int Bundle.getInt(String)>
	//* 286  559:invokevirtual   #354 <Method JSONObject JSONObject.put(String, int)>
	//* 287  562:pop             
	//* 288  563:iload           4
	//* 289  565:istore_3        
	//* 290  566:goto            377
	//* 291  569:aload           8
	//* 292  571:getstatic       #145 <Field n b>
	//* 293  574:aload           10
	//* 294  576:invokevirtual   #369 <Method String n.a(String)>
	//* 295  579:aload_0         
	//* 296  580:getfield        #163 <Field Bundle d>
	//* 297  583:aload           10
	//* 298  585:invokevirtual   #251 <Method String Bundle.getString(String)>
	//* 299  588:invokevirtual   #363 <Method JSONObject JSONObject.put(String, Object)>
	//* 300  591:pop             
	//* 301  592:iload           4
	//* 302  594:istore_3        
	//* 303  595:goto            377
	//* 304  598:aload_0         
	//* 305  599:getfield        #163 <Field Bundle d>
	//* 306  602:invokevirtual   #213 <Method Set Bundle.keySet()>
	//* 307  605:invokeinterface #219 <Method Iterator Set.iterator()>
	//* 308  610:astore          9
	//* 309  612:aload           9
	//* 310  614:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//* 311  619:ifeq            719
	//* 312  622:aload           9
	//* 313  624:invokeinterface #229 <Method Object Iterator.next()>
	//* 314  629:checkcast       #20  <Class String>
	//* 315  632:astore          10
	//* 316  634:aload           10
	//* 317  636:ldc2            #381 <String "com.google.">
	//* 318  639:invokevirtual   #384 <Method boolean String.startsWith(String)>
	//* 319  642:ifne            612
	//* 320  645:aload_0         
	//* 321  646:getfield        #163 <Field Bundle d>
	//* 322  649:aload           10
	//* 323  651:invokevirtual   #233 <Method Object Bundle.get(String)>
	//* 324  654:astore          11
	//* 325  656:aload           11
	//* 326  658:instanceof      #20  <Class String>
	//* 327  661:ifeq            677
	//* 328  664:aload           8
	//* 329  666:aload           10
	//* 330  668:aload           11
	//* 331  670:invokevirtual   #363 <Method JSONObject JSONObject.put(String, Object)>
	//* 332  673:pop             
	//* 333  674:goto            612
	//* 334  677:aload           11
	//* 335  679:instanceof      #334 <Class Integer>
	//* 336  682:ifeq            698
	//* 337  685:aload           8
	//* 338  687:aload           10
	//* 339  689:aload           11
	//* 340  691:invokevirtual   #363 <Method JSONObject JSONObject.put(String, Object)>
	//* 341  694:pop             
	//* 342  695:goto            612
	//* 343  698:aload           11
	//* 344  700:instanceof      #311 <Class Double>
	//* 345  703:ifeq            612
	//* 346  706:aload           8
	//* 347  708:aload           10
	//* 348  710:aload           11
	//* 349  712:invokevirtual   #363 <Method JSONObject JSONObject.put(String, Object)>
	//* 350  715:pop             
	//* 351  716:goto            612
	//* 352  719:aload           8
	//* 353  721:areturn         
		catch(JSONException jsonexception) { }
	//  354  722:astore          9
		obj = ((Object) (be.a(c)));
		if(obj != null && ((JSONArray) (obj)).length() != 0)
			try
			{
				jsonobject.put("images", obj);
			}
	//* 355  724:goto            22
			catch(JSONException jsonexception1) { }
	//  356  727:astore          9
		obj = ((Object) (new ArrayList()));
		j = e;
		i = 0;
		switch(j)
		{
		case 4: // '\004'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
			})));
			break;

		case 3: // '\003'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			})));
			break;

		case 2: // '\002'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
			})));
			break;

		case 1: // '\001'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			})));
			break;

		case 0: // '\0'
			Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			})));
			break;
		}
		Collections.addAll(((java.util.Collection) (obj)), ((Object []) (new String[] {
			"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"
		})));
		try
		{
			obj = ((Object) ((ArrayList)obj));
			k = ((ArrayList) (obj)).size();
		}
	//* 357  729:goto            58
		catch(JSONException jsonexception2)
	//* 358  732:astore          9
		{
			return jsonobject;
	//  359  734:aload           8
	//  360  736:areturn         
		}
_L18:
		if(i >= k) goto _L2; else goto _L1
_L1:
		obj1 = ((ArrayList) (obj)).get(i);
		j = i + 1;
		obj1 = ((Object) ((String)obj1));
		i = j;
		if(!d.containsKey(((String) (obj1))))
			continue; /* Loop/switch isn't completed */
		b.c(((String) (obj1)));
		JVM INSTR tableswitch 1 5: default 737
	//	               1 569
	//	               2 540
	//	               3 511
	//	               4 569
	//	               5 460;
		   goto _L3 _L4 _L5 _L6 _L4 _L7
_L7:
		obj2 = ((Object) (b.a(((String) (obj1)))));
		l = d.getLong(((String) (obj1)));
		d1 = l;
		Double.isNaN(d1);
		d1 /= 1000D;
		jsonobject.put(((String) (obj2)), d1);
		i = j;
		continue; /* Loop/switch isn't completed */
_L6:
		jsonobject.put(b.a(((String) (obj1))), d.getDouble(((String) (obj1))));
		i = j;
		continue; /* Loop/switch isn't completed */
_L5:
		jsonobject.put(b.a(((String) (obj1))), d.getInt(((String) (obj1))));
		i = j;
		continue; /* Loop/switch isn't completed */
_L4:
		jsonobject.put(b.a(((String) (obj1))), ((Object) (d.getString(((String) (obj1))))));
		i = j;
		continue; /* Loop/switch isn't completed */
_L2:
		obj = ((Object) (d.keySet().iterator()));
_L11:
		if(!((Iterator) (obj)).hasNext()) goto _L9; else goto _L8
_L8:
		obj1 = ((Object) ((String)((Iterator) (obj)).next()));
		if(((String) (obj1)).startsWith("com.google.")) goto _L11; else goto _L10
_L10:
		obj2 = d.get(((String) (obj1)));
		if(!(obj2 instanceof String)) goto _L13; else goto _L12
_L12:
		jsonobject.put(((String) (obj1)), obj2);
		  goto _L11
_L13:
		if(!(obj2 instanceof Integer)) goto _L15; else goto _L14
_L14:
		jsonobject.put(((String) (obj1)), obj2);
		  goto _L11
_L15:
		if(!(obj2 instanceof Double)) goto _L11; else goto _L16
_L16:
		jsonobject.put(((String) (obj1)), obj2);
		  goto _L11
_L9:
		return jsonobject;
_L3:
		i = j;
	//  361  737:iload           4
	//  362  739:istore_3        
		if(true) goto _L18; else goto _L17
	//  363  740:goto            377
_L17:
	}

	public List d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field List c>
	//    2    4:areturn         
	}

	public boolean e()
	{
		List list = c;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field List c>
	//    2    4:astore_1        
		return list != null && !list.isEmpty();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #387 <Method boolean List.isEmpty()>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof MediaMetadata))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaMetadata>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaMetadata)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaMetadata>
	//   12   20:astore_1        
		return a(d, ((MediaMetadata) (obj)).d) && c.equals(((Object) (((MediaMetadata) (obj)).c)));
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #163 <Field Bundle d>
	//   16   26:aload_1         
	//   17   27:getfield        #163 <Field Bundle d>
	//   18   30:invokespecial   #235 <Method boolean a(Bundle, Bundle)>
	//   19   33:ifeq            54
	//   20   36:aload_0         
	//   21   37:getfield        #161 <Field List c>
	//   22   40:aload_1         
	//   23   41:getfield        #161 <Field List c>
	//   24   44:invokeinterface #388 <Method boolean List.equals(Object)>
	//   25   49:ifeq            54
	//   26   52:iconst_1        
	//   27   53:ireturn         
	//   28   54:iconst_0        
	//   29   55:ireturn         
	}

	public int hashCode()
	{
		Iterator iterator = d.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field Bundle d>
	//    2    4:invokevirtual   #213 <Method Set Bundle.keySet()>
	//    3    7:invokeinterface #219 <Method Iterator Set.iterator()>
	//    4   12:astore_2        
		int i;
		String s;
		for(i = 17; iterator.hasNext(); i = i * 31 + d.get(s).hashCode())
	//*   5   13:bipush          17
	//*   6   15:istore_1        
	//*   7   16:aload_2         
	//*   8   17:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//*   9   22:ifeq            55
			s = (String)iterator.next();
	//   10   25:aload_2         
	//   11   26:invokeinterface #229 <Method Object Iterator.next()>
	//   12   31:checkcast       #20  <Class String>
	//   13   34:astore_3        

	//   14   35:iload_1         
	//   15   36:bipush          31
	//   16   38:imul            
	//   17   39:aload_0         
	//   18   40:getfield        #163 <Field Bundle d>
	//   19   43:aload_3         
	//   20   44:invokevirtual   #233 <Method Object Bundle.get(String)>
	//   21   47:invokevirtual   #391 <Method int Object.hashCode()>
	//   22   50:iadd            
	//   23   51:istore_1        
	//*  24   52:goto            16
		return i * 31 + c.hashCode();
	//   25   55:iload_1         
	//   26   56:bipush          31
	//   27   58:imul            
	//   28   59:aload_0         
	//   29   60:getfield        #161 <Field List c>
	//   30   63:invokeinterface #392 <Method int List.hashCode()>
	//   31   68:iadd            
	//   32   69:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #399 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, d(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #401 <Method List d()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #404 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #163 <Field Bundle d>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #407 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, a());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #409 <Method int a()>
	//   19   31:invokestatic    #412 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #414 <Method void c.a(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new x();
	private static final String a[] = {
		null, "String", "int", "double", "ISO-8601 date String"
	};
	private static final n b = (new n()).a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3).a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5).a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5).a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5).a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5).a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
	private final List c;
	private final Bundle d;
	private int e;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aconst_null     
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #22  <String "String">
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #24  <String "int">
	//   13   17:aastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #26  <String "double">
	//   17   22:aastore         
	//   18   23:dup             
	//   19   24:iconst_4        
	//   20   25:ldc1            #28  <String "ISO-8601 date String">
	//   21   27:aastore         
	//   22   28:putstatic       #30  <Field String[] a>
	//   23   31:new             #32  <Class x>
	//   24   34:dup             
	//   25   35:invokespecial   #35  <Method void x()>
	//   26   38:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//   27   41:new             #39  <Class n>
	//   28   44:dup             
	//   29   45:invokespecial   #40  <Method void n()>
	//   30   48:ldc1            #42  <String "com.google.android.gms.cast.metadata.CREATION_DATE">
	//   31   50:ldc1            #44  <String "creationDateTime">
	//   32   52:iconst_4        
	//   33   53:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   34   56:ldc1            #49  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//   35   58:ldc1            #51  <String "releaseDate">
	//   36   60:iconst_4        
	//   37   61:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   38   64:ldc1            #53  <String "com.google.android.gms.cast.metadata.BROADCAST_DATE">
	//   39   66:ldc1            #55  <String "originalAirdate">
	//   40   68:iconst_4        
	//   41   69:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   42   72:ldc1            #57  <String "com.google.android.gms.cast.metadata.TITLE">
	//   43   74:ldc1            #59  <String "title">
	//   44   76:iconst_1        
	//   45   77:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   46   80:ldc1            #61  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//   47   82:ldc1            #63  <String "subtitle">
	//   48   84:iconst_1        
	//   49   85:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   50   88:ldc1            #65  <String "com.google.android.gms.cast.metadata.ARTIST">
	//   51   90:ldc1            #67  <String "artist">
	//   52   92:iconst_1        
	//   53   93:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   54   96:ldc1            #69  <String "com.google.android.gms.cast.metadata.ALBUM_ARTIST">
	//   55   98:ldc1            #71  <String "albumArtist">
	//   56  100:iconst_1        
	//   57  101:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   58  104:ldc1            #73  <String "com.google.android.gms.cast.metadata.ALBUM_TITLE">
	//   59  106:ldc1            #75  <String "albumName">
	//   60  108:iconst_1        
	//   61  109:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   62  112:ldc1            #77  <String "com.google.android.gms.cast.metadata.COMPOSER">
	//   63  114:ldc1            #79  <String "composer">
	//   64  116:iconst_1        
	//   65  117:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   66  120:ldc1            #81  <String "com.google.android.gms.cast.metadata.DISC_NUMBER">
	//   67  122:ldc1            #83  <String "discNumber">
	//   68  124:iconst_2        
	//   69  125:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   70  128:ldc1            #85  <String "com.google.android.gms.cast.metadata.TRACK_NUMBER">
	//   71  130:ldc1            #87  <String "trackNumber">
	//   72  132:iconst_2        
	//   73  133:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   74  136:ldc1            #89  <String "com.google.android.gms.cast.metadata.SEASON_NUMBER">
	//   75  138:ldc1            #91  <String "season">
	//   76  140:iconst_2        
	//   77  141:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   78  144:ldc1            #93  <String "com.google.android.gms.cast.metadata.EPISODE_NUMBER">
	//   79  146:ldc1            #95  <String "episode">
	//   80  148:iconst_2        
	//   81  149:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   82  152:ldc1            #97  <String "com.google.android.gms.cast.metadata.SERIES_TITLE">
	//   83  154:ldc1            #99  <String "seriesTitle">
	//   84  156:iconst_1        
	//   85  157:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   86  160:ldc1            #101 <String "com.google.android.gms.cast.metadata.STUDIO">
	//   87  162:ldc1            #103 <String "studio">
	//   88  164:iconst_1        
	//   89  165:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   90  168:ldc1            #105 <String "com.google.android.gms.cast.metadata.WIDTH">
	//   91  170:ldc1            #107 <String "width">
	//   92  172:iconst_2        
	//   93  173:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   94  176:ldc1            #109 <String "com.google.android.gms.cast.metadata.HEIGHT">
	//   95  178:ldc1            #111 <String "height">
	//   96  180:iconst_2        
	//   97  181:invokevirtual   #47  <Method n n.a(String, String, int)>
	//   98  184:ldc1            #113 <String "com.google.android.gms.cast.metadata.LOCATION_NAME">
	//   99  186:ldc1            #115 <String "location">
	//  100  188:iconst_1        
	//  101  189:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  102  192:ldc1            #117 <String "com.google.android.gms.cast.metadata.LOCATION_LATITUDE">
	//  103  194:ldc1            #119 <String "latitude">
	//  104  196:iconst_3        
	//  105  197:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  106  200:ldc1            #121 <String "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE">
	//  107  202:ldc1            #123 <String "longitude">
	//  108  204:iconst_3        
	//  109  205:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  110  208:ldc1            #125 <String "com.google.android.gms.cast.metadata.SECTION_DURATION">
	//  111  210:ldc1            #127 <String "sectionDuration">
	//  112  212:iconst_5        
	//  113  213:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  114  216:ldc1            #129 <String "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA">
	//  115  218:ldc1            #131 <String "sectionStartTimeInMedia">
	//  116  220:iconst_5        
	//  117  221:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  118  224:ldc1            #133 <String "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME">
	//  119  226:ldc1            #135 <String "sectionStartAbsoluteTime">
	//  120  228:iconst_5        
	//  121  229:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  122  232:ldc1            #137 <String "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER">
	//  123  234:ldc1            #139 <String "sectionStartTimeInContainer">
	//  124  236:iconst_5        
	//  125  237:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  126  240:ldc1            #141 <String "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID">
	//  127  242:ldc1            #143 <String "queueItemId">
	//  128  244:iconst_2        
	//  129  245:invokevirtual   #47  <Method n n.a(String, String, int)>
	//  130  248:putstatic       #145 <Field n b>
	//* 131  251:return          
	}
}
