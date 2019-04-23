// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.ttml;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer.text.Cue;
import com.google.android.exoplayer.util.Assertions;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.text.ttml:
//			TtmlRenderUtil, TtmlRegion, TtmlStyle

final class TtmlNode
{

	private TtmlNode(String s, String s1, long l, long l1, TtmlStyle ttmlstyle, 
			String as[], String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void Object()>
		tag = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #147 <Field String tag>
		text = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #149 <Field String text>
		style = ttmlstyle;
	//    8   14:aload_0         
	//    9   15:aload           7
	//   10   17:putfield        #151 <Field TtmlStyle style>
		styleIds = as;
	//   11   20:aload_0         
	//   12   21:aload           8
	//   13   23:putfield        #153 <Field String[] styleIds>
		boolean flag;
		if(s1 != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          36
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore          10
		else
	//*  18   33:goto            39
			flag = false;
	//   19   36:iconst_0        
	//   20   37:istore          10
		isTextNode = flag;
	//   21   39:aload_0         
	//   22   40:iload           10
	//   23   42:putfield        #155 <Field boolean isTextNode>
		startTimeUs = l;
	//   24   45:aload_0         
	//   25   46:lload_3         
	//   26   47:putfield        #157 <Field long startTimeUs>
		endTimeUs = l1;
	//   27   50:aload_0         
	//   28   51:lload           5
	//   29   53:putfield        #159 <Field long endTimeUs>
		regionId = (String)Assertions.checkNotNull(((Object) (s2)));
	//   30   56:aload_0         
	//   31   57:aload           9
	//   32   59:invokestatic    #165 <Method Object Assertions.checkNotNull(Object)>
	//   33   62:checkcast       #167 <Class String>
	//   34   65:putfield        #169 <Field String regionId>
	//   35   68:aload_0         
	//   36   69:new             #171 <Class HashMap>
	//   37   72:dup             
	//   38   73:invokespecial   #172 <Method void HashMap()>
	//   39   76:putfield        #174 <Field HashMap nodeStartsByRegion>
	//   40   79:aload_0         
	//   41   80:new             #171 <Class HashMap>
	//   42   83:dup             
	//   43   84:invokespecial   #172 <Method void HashMap()>
	//   44   87:putfield        #176 <Field HashMap nodeEndsByRegion>
	//   45   90:return          
	}

	private void applyStyleToOutput(Map map, SpannableStringBuilder spannablestringbuilder, int i, int j)
	{
		if(i != j)
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:icmpeq          31
		{
			map = ((Map) (TtmlRenderUtil.resolveStyle(style, styleIds, map)));
	//    3    6:aload_0         
	//    4    7:getfield        #151 <Field TtmlStyle style>
	//    5   10:aload_0         
	//    6   11:getfield        #153 <Field String[] styleIds>
	//    7   14:aload_1         
	//    8   15:invokestatic    #185 <Method TtmlStyle TtmlRenderUtil.resolveStyle(TtmlStyle, String[], Map)>
	//    9   18:astore_1        
			if(map != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          31
				TtmlRenderUtil.applyStylesToSpan(spannablestringbuilder, i, j, ((TtmlStyle) (map)));
	//   12   23:aload_2         
	//   13   24:iload_3         
	//   14   25:iload           4
	//   15   27:aload_1         
	//   16   28:invokestatic    #189 <Method void TtmlRenderUtil.applyStylesToSpan(SpannableStringBuilder, int, int, TtmlStyle)>
		}
	//   17   31:return          
	}

	public static TtmlNode buildNode(String s, long l, long l1, TtmlStyle ttmlstyle, String as[], String s1)
	{
		return new TtmlNode(s, ((String) (null)), l, l1, ttmlstyle, as, s1);
	//    0    0:new             #2   <Class TtmlNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:lload_1         
	//    5    7:lload_3         
	//    6    8:aload           5
	//    7   10:aload           6
	//    8   12:aload           7
	//    9   14:invokespecial   #195 <Method void TtmlNode(String, String, long, long, TtmlStyle, String[], String)>
	//   10   17:areturn         
	}

	public static TtmlNode buildTextNode(String s)
	{
		return new TtmlNode(((String) (null)), TtmlRenderUtil.applyTextElementSpacePolicy(s), -1L, -1L, ((TtmlStyle) (null)), ((String []) (null)), "");
	//    0    0:new             #2   <Class TtmlNode>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokestatic    #201 <Method String TtmlRenderUtil.applyTextElementSpacePolicy(String)>
	//    5    9:ldc2w           #119 <Long -1L>
	//    6   12:ldc2w           #119 <Long -1L>
	//    7   15:aconst_null     
	//    8   16:aconst_null     
	//    9   17:ldc1            #8   <String "">
	//   10   19:invokespecial   #195 <Method void TtmlNode(String, String, long, long, TtmlStyle, String[], String)>
	//   11   22:areturn         
	}

	private SpannableStringBuilder cleanUpText(SpannableStringBuilder spannablestringbuilder)
	{
		int i = spannablestringbuilder.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #209 <Method int SpannableStringBuilder.length()>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
		int l;
		for(int j = 0; j < i; i = l)
	//*   5    8:iconst_0        
	//*   6    9:istore_3        
	//*   7   10:iload_3         
	//*   8   11:iload_2         
	//*   9   12:icmpge          107
		{
			l = i;
	//   10   15:iload_2         
	//   11   16:istore          4
			if(spannablestringbuilder.charAt(j) == ' ')
	//*  12   18:aload_1         
	//*  13   19:iload_3         
	//*  14   20:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//*  15   23:bipush          32
	//*  16   25:icmpne          97
			{
				int k1 = j + 1;
	//   17   28:iload_3         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore          6
				for(l = k1; l < spannablestringbuilder.length() && spannablestringbuilder.charAt(l) == ' '; l++);
	//   21   33:iload           6
	//   22   35:istore          4
	//   23   37:iload           4
	//   24   39:aload_1         
	//   25   40:invokevirtual   #209 <Method int SpannableStringBuilder.length()>
	//   26   43:icmpge          66
	//   27   46:aload_1         
	//   28   47:iload           4
	//   29   49:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//   30   52:bipush          32
	//   31   54:icmpne          66
	//   32   57:iload           4
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore          4
	//*  36   63:goto            37
				k1 = l - k1;
	//   37   66:iload           4
	//   38   68:iload           6
	//   39   70:isub            
	//   40   71:istore          6
				l = i;
	//   41   73:iload_2         
	//   42   74:istore          4
				if(k1 > 0)
	//*  43   76:iload           6
	//*  44   78:ifle            97
				{
					spannablestringbuilder.delete(j, j + k1);
	//   45   81:aload_1         
	//   46   82:iload_3         
	//   47   83:iload_3         
	//   48   84:iload           6
	//   49   86:iadd            
	//   50   87:invokevirtual   #217 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//   51   90:pop             
					l = i - k1;
	//   52   91:iload_2         
	//   53   92:iload           6
	//   54   94:isub            
	//   55   95:istore          4
				}
			}
			j++;
	//   56   97:iload_3         
	//   57   98:iconst_1        
	//   58   99:iadd            
	//   59  100:istore_3        
		}

	//   60  101:iload           4
	//   61  103:istore_2        
	//*  62  104:goto            10
		int k = i;
	//   63  107:iload_2         
	//   64  108:istore_3        
		if(i > 0)
	//*  65  109:iload_2         
	//*  66  110:ifle            136
		{
			k = i;
	//   67  113:iload_2         
	//   68  114:istore_3        
			if(spannablestringbuilder.charAt(0) == ' ')
	//*  69  115:aload_1         
	//*  70  116:iconst_0        
	//*  71  117:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//*  72  120:bipush          32
	//*  73  122:icmpne          136
			{
				spannablestringbuilder.delete(0, 1);
	//   74  125:aload_1         
	//   75  126:iconst_0        
	//   76  127:iconst_1        
	//   77  128:invokevirtual   #217 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//   78  131:pop             
				k = i - 1;
	//   79  132:iload_2         
	//   80  133:iconst_1        
	//   81  134:isub            
	//   82  135:istore_3        
			}
		}
		int i1 = 0;
	//   83  136:iconst_0        
	//   84  137:istore          4
		i = k;
	//   85  139:iload_3         
	//   86  140:istore_2        
		k = i1;
	//   87  141:iload           4
	//   88  143:istore_3        
		int l1;
		do
		{
			l1 = i - 1;
	//   89  144:iload_2         
	//   90  145:iconst_1        
	//   91  146:isub            
	//   92  147:istore          6
			if(k >= l1)
				break;
	//   93  149:iload_3         
	//   94  150:iload           6
	//   95  152:icmpge          212
			i1 = i;
	//   96  155:iload_2         
	//   97  156:istore          4
			if(spannablestringbuilder.charAt(k) == '\n')
	//*  98  158:aload_1         
	//*  99  159:iload_3         
	//* 100  160:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//* 101  163:bipush          10
	//* 102  165:icmpne          202
			{
				l1 = k + 1;
	//  103  168:iload_3         
	//  104  169:iconst_1        
	//  105  170:iadd            
	//  106  171:istore          6
				i1 = i;
	//  107  173:iload_2         
	//  108  174:istore          4
				if(spannablestringbuilder.charAt(l1) == ' ')
	//* 109  176:aload_1         
	//* 110  177:iload           6
	//* 111  179:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//* 112  182:bipush          32
	//* 113  184:icmpne          202
				{
					spannablestringbuilder.delete(l1, k + 2);
	//  114  187:aload_1         
	//  115  188:iload           6
	//  116  190:iload_3         
	//  117  191:iconst_2        
	//  118  192:iadd            
	//  119  193:invokevirtual   #217 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//  120  196:pop             
					i1 = i - 1;
	//  121  197:iload_2         
	//  122  198:iconst_1        
	//  123  199:isub            
	//  124  200:istore          4
				}
			}
			k++;
	//  125  202:iload_3         
	//  126  203:iconst_1        
	//  127  204:iadd            
	//  128  205:istore_3        
			i = i1;
	//  129  206:iload           4
	//  130  208:istore_2        
		} while(true);
	//  131  209:goto            144
		i1 = ((int) (flag));
	//  132  212:iload           5
	//  133  214:istore          4
		k = i;
	//  134  216:iload_2         
	//  135  217:istore_3        
		if(i > 0)
	//* 136  218:iload_2         
	//* 137  219:ifle            255
		{
			i1 = ((int) (flag));
	//  138  222:iload           5
	//  139  224:istore          4
			k = i;
	//  140  226:iload_2         
	//  141  227:istore_3        
			if(spannablestringbuilder.charAt(l1) == ' ')
	//* 142  228:aload_1         
	//* 143  229:iload           6
	//* 144  231:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//* 145  234:bipush          32
	//* 146  236:icmpne          255
			{
				spannablestringbuilder.delete(l1, i);
	//  147  239:aload_1         
	//  148  240:iload           6
	//  149  242:iload_2         
	//  150  243:invokevirtual   #217 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//  151  246:pop             
				k = i - 1;
	//  152  247:iload_2         
	//  153  248:iconst_1        
	//  154  249:isub            
	//  155  250:istore_3        
				i1 = ((int) (flag));
	//  156  251:iload           5
	//  157  253:istore          4
			}
		}
		do
		{
			i = k - 1;
	//  158  255:iload_3         
	//  159  256:iconst_1        
	//  160  257:isub            
	//  161  258:istore_2        
			if(i1 >= i)
				break;
	//  162  259:iload           4
	//  163  261:iload_2         
	//  164  262:icmpge          321
			i = k;
	//  165  265:iload_3         
	//  166  266:istore_2        
			if(spannablestringbuilder.charAt(i1) == ' ')
	//* 167  267:aload_1         
	//* 168  268:iload           4
	//* 169  270:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//* 170  273:bipush          32
	//* 171  275:icmpne          310
			{
				int j1 = i1 + 1;
	//  172  278:iload           4
	//  173  280:iconst_1        
	//  174  281:iadd            
	//  175  282:istore          5
				i = k;
	//  176  284:iload_3         
	//  177  285:istore_2        
				if(spannablestringbuilder.charAt(j1) == '\n')
	//* 178  286:aload_1         
	//* 179  287:iload           5
	//* 180  289:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//* 181  292:bipush          10
	//* 182  294:icmpne          310
				{
					spannablestringbuilder.delete(i1, j1);
	//  183  297:aload_1         
	//  184  298:iload           4
	//  185  300:iload           5
	//  186  302:invokevirtual   #217 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//  187  305:pop             
					i = k - 1;
	//  188  306:iload_3         
	//  189  307:iconst_1        
	//  190  308:isub            
	//  191  309:istore_2        
				}
			}
			i1++;
	//  192  310:iload           4
	//  193  312:iconst_1        
	//  194  313:iadd            
	//  195  314:istore          4
			k = i;
	//  196  316:iload_2         
	//  197  317:istore_3        
		} while(true);
	//  198  318:goto            255
		if(k > 0 && spannablestringbuilder.charAt(i) == '\n')
	//* 199  321:iload_3         
	//* 200  322:ifle            342
	//* 201  325:aload_1         
	//* 202  326:iload_2         
	//* 203  327:invokevirtual   #213 <Method char SpannableStringBuilder.charAt(int)>
	//* 204  330:bipush          10
	//* 205  332:icmpne          342
			spannablestringbuilder.delete(i, k);
	//  206  335:aload_1         
	//  207  336:iload_2         
	//  208  337:iload_3         
	//  209  338:invokevirtual   #217 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//  210  341:pop             
		return spannablestringbuilder;
	//  211  342:aload_1         
	//  212  343:areturn         
	}

	private void getEventTimes(TreeSet treeset, boolean flag)
	{
		boolean flag2 = "p".equals(((Object) (tag)));
	//    0    0:ldc1            #92  <String "p">
	//    1    2:aload_0         
	//    2    3:getfield        #147 <Field String tag>
	//    3    6:invokevirtual   #223 <Method boolean String.equals(Object)>
	//    4    9:istore          5
		if(flag || flag2)
	//*   5   11:iload_2         
	//*   6   12:ifne            20
	//*   7   15:iload           5
	//*   8   17:ifeq            70
		{
			long l = startTimeUs;
	//    9   20:aload_0         
	//   10   21:getfield        #157 <Field long startTimeUs>
	//   11   24:lstore          6
			if(l != -1L)
	//*  12   26:lload           6
	//*  13   28:ldc2w           #119 <Long -1L>
	//*  14   31:lcmp            
	//*  15   32:ifeq            45
				treeset.add(((Object) (Long.valueOf(l))));
	//   16   35:aload_1         
	//   17   36:lload           6
	//   18   38:invokestatic    #229 <Method Long Long.valueOf(long)>
	//   19   41:invokevirtual   #234 <Method boolean TreeSet.add(Object)>
	//   20   44:pop             
			l = endTimeUs;
	//   21   45:aload_0         
	//   22   46:getfield        #159 <Field long endTimeUs>
	//   23   49:lstore          6
			if(l != -1L)
	//*  24   51:lload           6
	//*  25   53:ldc2w           #119 <Long -1L>
	//*  26   56:lcmp            
	//*  27   57:ifeq            70
				treeset.add(((Object) (Long.valueOf(l))));
	//   28   60:aload_1         
	//   29   61:lload           6
	//   30   63:invokestatic    #229 <Method Long Long.valueOf(long)>
	//   31   66:invokevirtual   #234 <Method boolean TreeSet.add(Object)>
	//   32   69:pop             
		}
		if(children == null)
	//*  33   70:aload_0         
	//*  34   71:getfield        #236 <Field List children>
	//*  35   74:ifnonnull       78
			return;
	//   36   77:return          
		for(int i = 0; i < children.size(); i++)
	//*  37   78:iconst_0        
	//*  38   79:istore_3        
	//*  39   80:iload_3         
	//*  40   81:aload_0         
	//*  41   82:getfield        #236 <Field List children>
	//*  42   85:invokeinterface #241 <Method int List.size()>
	//*  43   90:icmpge          144
		{
			TtmlNode ttmlnode = (TtmlNode)children.get(i);
	//   44   93:aload_0         
	//   45   94:getfield        #236 <Field List children>
	//   46   97:iload_3         
	//   47   98:invokeinterface #245 <Method Object List.get(int)>
	//   48  103:checkcast       #2   <Class TtmlNode>
	//   49  106:astore          8
			boolean flag1;
			if(!flag && !flag2)
	//*  50  108:iload_2         
	//*  51  109:ifne            126
	//*  52  112:iload           5
	//*  53  114:ifeq            120
	//*  54  117:goto            126
				flag1 = false;
	//   55  120:iconst_0        
	//   56  121:istore          4
			else
	//*  57  123:goto            129
				flag1 = true;
	//   58  126:iconst_1        
	//   59  127:istore          4
			ttmlnode.getEventTimes(treeset, flag1);
	//   60  129:aload           8
	//   61  131:aload_1         
	//   62  132:iload           4
	//   63  134:invokespecial   #247 <Method void getEventTimes(TreeSet, boolean)>
		}

	//   64  137:iload_3         
	//   65  138:iconst_1        
	//   66  139:iadd            
	//   67  140:istore_3        
	//*  68  141:goto            80
	//   69  144:return          
	}

	private static SpannableStringBuilder getRegionOutput(String s, Map map)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokeinterface #255 <Method boolean Map.containsKey(Object)>
	//*   3    7:ifne            25
			map.put(((Object) (s)), ((Object) (new SpannableStringBuilder())));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:new             #205 <Class SpannableStringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #256 <Method void SpannableStringBuilder()>
	//    9   19:invokeinterface #260 <Method Object Map.put(Object, Object)>
	//   10   24:pop             
		return (SpannableStringBuilder)map.get(((Object) (s)));
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:invokeinterface #262 <Method Object Map.get(Object)>
	//   14   32:checkcast       #205 <Class SpannableStringBuilder>
	//   15   35:areturn         
	}

	private void traverseForStyle(Map map, Map map1)
	{
		for(Iterator iterator = nodeEndsByRegion.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field HashMap nodeEndsByRegion>
	//*   2    4:invokevirtual   #269 <Method Set HashMap.entrySet()>
	//*   3    7:invokeinterface #275 <Method Iterator Set.iterator()>
	//*   4   12:astore          6
	//*   5   14:aload           6
	//*   6   16:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            146
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//    8   24:aload           6
	//    9   26:invokeinterface #285 <Method Object Iterator.next()>
	//   10   31:checkcast       #287 <Class java.util.Map$Entry>
	//   11   34:astore          7
			String s = (String)entry.getKey();
	//   12   36:aload           7
	//   13   38:invokeinterface #290 <Method Object java.util.Map$Entry.getKey()>
	//   14   43:checkcast       #167 <Class String>
	//   15   46:astore          8
			boolean flag1 = nodeStartsByRegion.containsKey(((Object) (s)));
	//   16   48:aload_0         
	//   17   49:getfield        #174 <Field HashMap nodeStartsByRegion>
	//   18   52:aload           8
	//   19   54:invokevirtual   #291 <Method boolean HashMap.containsKey(Object)>
	//   20   57:istore          5
			boolean flag = false;
	//   21   59:iconst_0        
	//   22   60:istore          4
			int i;
			if(flag1)
	//*  23   62:iload           5
	//*  24   64:ifeq            86
				i = ((Integer)nodeStartsByRegion.get(((Object) (s)))).intValue();
	//   25   67:aload_0         
	//   26   68:getfield        #174 <Field HashMap nodeStartsByRegion>
	//   27   71:aload           8
	//   28   73:invokevirtual   #292 <Method Object HashMap.get(Object)>
	//   29   76:checkcast       #294 <Class Integer>
	//   30   79:invokevirtual   #297 <Method int Integer.intValue()>
	//   31   82:istore_3        
			else
	//*  32   83:goto            88
				i = 0;
	//   33   86:iconst_0        
	//   34   87:istore_3        
			applyStyleToOutput(map, (SpannableStringBuilder)map1.get(((Object) (s))), i, ((Integer)entry.getValue()).intValue());
	//   35   88:aload_0         
	//   36   89:aload_1         
	//   37   90:aload_2         
	//   38   91:aload           8
	//   39   93:invokeinterface #262 <Method Object Map.get(Object)>
	//   40   98:checkcast       #205 <Class SpannableStringBuilder>
	//   41  101:iload_3         
	//   42  102:aload           7
	//   43  104:invokeinterface #300 <Method Object java.util.Map$Entry.getValue()>
	//   44  109:checkcast       #294 <Class Integer>
	//   45  112:invokevirtual   #297 <Method int Integer.intValue()>
	//   46  115:invokespecial   #302 <Method void applyStyleToOutput(Map, SpannableStringBuilder, int, int)>
			i = ((int) (flag));
	//   47  118:iload           4
	//   48  120:istore_3        
			while(i < getChildCount()) 
	//*  49  121:iload_3         
	//*  50  122:aload_0         
	//*  51  123:invokevirtual   #305 <Method int getChildCount()>
	//*  52  126:icmpge          14
			{
				getChild(i).traverseForStyle(map, map1);
	//   53  129:aload_0         
	//   54  130:iload_3         
	//   55  131:invokevirtual   #309 <Method TtmlNode getChild(int)>
	//   56  134:aload_1         
	//   57  135:aload_2         
	//   58  136:invokespecial   #311 <Method void traverseForStyle(Map, Map)>
				i++;
	//   59  139:iload_3         
	//   60  140:iconst_1        
	//   61  141:iadd            
	//   62  142:istore_3        
			}
		}

	//*  63  143:goto            121
	//   64  146:return          
	}

	private void traverseForText(long l, boolean flag, String s, Map map)
	{
		nodeStartsByRegion.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field HashMap nodeStartsByRegion>
	//    2    4:invokevirtual   #317 <Method void HashMap.clear()>
		nodeEndsByRegion.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #176 <Field HashMap nodeEndsByRegion>
	//    5   11:invokevirtual   #317 <Method void HashMap.clear()>
		String s1 = regionId;
	//    6   14:aload_0         
	//    7   15:getfield        #169 <Field String regionId>
	//    8   18:astore          9
		if(!"".equals(((Object) (s1))))
	//*   9   20:ldc1            #8   <String "">
	//*  10   22:aload           9
	//*  11   24:invokevirtual   #223 <Method boolean String.equals(Object)>
	//*  12   27:ifeq            33
	//*  13   30:goto            37
			s = s1;
	//   14   33:aload           9
	//   15   35:astore          4
		if(isTextNode && flag)
	//*  16   37:aload_0         
	//*  17   38:getfield        #155 <Field boolean isTextNode>
	//*  18   41:ifeq            64
	//*  19   44:iload_3         
	//*  20   45:ifeq            64
		{
			getRegionOutput(s, map).append(((CharSequence) (text)));
	//   21   48:aload           4
	//   22   50:aload           5
	//   23   52:invokestatic    #319 <Method SpannableStringBuilder getRegionOutput(String, Map)>
	//   24   55:aload_0         
	//   25   56:getfield        #149 <Field String text>
	//   26   59:invokevirtual   #323 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   27   62:pop             
			return;
	//   28   63:return          
		}
		if("br".equals(((Object) (tag))) && flag)
	//*  29   64:ldc1            #77  <String "br">
	//*  30   66:aload_0         
	//*  31   67:getfield        #147 <Field String tag>
	//*  32   70:invokevirtual   #223 <Method boolean String.equals(Object)>
	//*  33   73:ifeq            94
	//*  34   76:iload_3         
	//*  35   77:ifeq            94
		{
			getRegionOutput(s, map).append('\n');
	//   36   80:aload           4
	//   37   82:aload           5
	//   38   84:invokestatic    #319 <Method SpannableStringBuilder getRegionOutput(String, Map)>
	//   39   87:bipush          10
	//   40   89:invokevirtual   #326 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   41   92:pop             
			return;
	//   42   93:return          
		}
		if("metadata".equals(((Object) (tag))))
	//*  43   94:ldc1            #89  <String "metadata">
	//*  44   96:aload_0         
	//*  45   97:getfield        #147 <Field String tag>
	//*  46  100:invokevirtual   #223 <Method boolean String.equals(Object)>
	//*  47  103:ifeq            107
			return;
	//   48  106:return          
		if(isActive(l))
	//*  49  107:aload_0         
	//*  50  108:lload_1         
	//*  51  109:invokevirtual   #330 <Method boolean isActive(long)>
	//*  52  112:ifeq            343
		{
			boolean flag2 = "p".equals(((Object) (tag)));
	//   53  115:ldc1            #92  <String "p">
	//   54  117:aload_0         
	//   55  118:getfield        #147 <Field String tag>
	//   56  121:invokevirtual   #223 <Method boolean String.equals(Object)>
	//   57  124:istore          8
			java.util.Map.Entry entry;
			for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); nodeStartsByRegion.put(entry.getKey(), ((Object) (Integer.valueOf(((SpannableStringBuilder)entry.getValue()).length())))))
	//*  58  126:aload           5
	//*  59  128:invokeinterface #331 <Method Set Map.entrySet()>
	//*  60  133:invokeinterface #275 <Method Iterator Set.iterator()>
	//*  61  138:astore          9
	//*  62  140:aload           9
	//*  63  142:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//*  64  147:ifeq            196
				entry = (java.util.Map.Entry)iterator.next();
	//   65  150:aload           9
	//   66  152:invokeinterface #285 <Method Object Iterator.next()>
	//   67  157:checkcast       #287 <Class java.util.Map$Entry>
	//   68  160:astore          10

	//   69  162:aload_0         
	//   70  163:getfield        #174 <Field HashMap nodeStartsByRegion>
	//   71  166:aload           10
	//   72  168:invokeinterface #290 <Method Object java.util.Map$Entry.getKey()>
	//   73  173:aload           10
	//   74  175:invokeinterface #300 <Method Object java.util.Map$Entry.getValue()>
	//   75  180:checkcast       #205 <Class SpannableStringBuilder>
	//   76  183:invokevirtual   #209 <Method int SpannableStringBuilder.length()>
	//   77  186:invokestatic    #334 <Method Integer Integer.valueOf(int)>
	//   78  189:invokevirtual   #335 <Method Object HashMap.put(Object, Object)>
	//   79  192:pop             
	//*  80  193:goto            140
			for(int i = 0; i < getChildCount(); i++)
	//*  81  196:iconst_0        
	//*  82  197:istore          6
	//*  83  199:iload           6
	//*  84  201:aload_0         
	//*  85  202:invokevirtual   #305 <Method int getChildCount()>
	//*  86  205:icmpge          258
			{
				TtmlNode ttmlnode = getChild(i);
	//   87  208:aload_0         
	//   88  209:iload           6
	//   89  211:invokevirtual   #309 <Method TtmlNode getChild(int)>
	//   90  214:astore          9
				boolean flag1;
				if(!flag && !flag2)
	//*  91  216:iload_3         
	//*  92  217:ifne            234
	//*  93  220:iload           8
	//*  94  222:ifeq            228
	//*  95  225:goto            234
					flag1 = false;
	//   96  228:iconst_0        
	//   97  229:istore          7
				else
	//*  98  231:goto            237
					flag1 = true;
	//   99  234:iconst_1        
	//  100  235:istore          7
				ttmlnode.traverseForText(l, flag1, s, map);
	//  101  237:aload           9
	//  102  239:lload_1         
	//  103  240:iload           7
	//  104  242:aload           4
	//  105  244:aload           5
	//  106  246:invokespecial   #337 <Method void traverseForText(long, boolean, String, Map)>
			}

	//  107  249:iload           6
	//  108  251:iconst_1        
	//  109  252:iadd            
	//  110  253:istore          6
	//* 111  255:goto            199
			if(flag2)
	//* 112  258:iload           8
	//* 113  260:ifeq            273
				TtmlRenderUtil.endParagraph(getRegionOutput(s, map));
	//  114  263:aload           4
	//  115  265:aload           5
	//  116  267:invokestatic    #319 <Method SpannableStringBuilder getRegionOutput(String, Map)>
	//  117  270:invokestatic    #341 <Method void TtmlRenderUtil.endParagraph(SpannableStringBuilder)>
			for(s = ((String) (map.entrySet().iterator())); ((Iterator) (s)).hasNext(); nodeEndsByRegion.put(((java.util.Map.Entry) (map)).getKey(), ((Object) (Integer.valueOf(((SpannableStringBuilder)((java.util.Map.Entry) (map)).getValue()).length())))))
	//* 118  273:aload           5
	//* 119  275:invokeinterface #331 <Method Set Map.entrySet()>
	//* 120  280:invokeinterface #275 <Method Iterator Set.iterator()>
	//* 121  285:astore          4
	//* 122  287:aload           4
	//* 123  289:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//* 124  294:ifeq            343
				map = ((Map) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//  125  297:aload           4
	//  126  299:invokeinterface #285 <Method Object Iterator.next()>
	//  127  304:checkcast       #287 <Class java.util.Map$Entry>
	//  128  307:astore          5

	//  129  309:aload_0         
	//  130  310:getfield        #176 <Field HashMap nodeEndsByRegion>
	//  131  313:aload           5
	//  132  315:invokeinterface #290 <Method Object java.util.Map$Entry.getKey()>
	//  133  320:aload           5
	//  134  322:invokeinterface #300 <Method Object java.util.Map$Entry.getValue()>
	//  135  327:checkcast       #205 <Class SpannableStringBuilder>
	//  136  330:invokevirtual   #209 <Method int SpannableStringBuilder.length()>
	//  137  333:invokestatic    #334 <Method Integer Integer.valueOf(int)>
	//  138  336:invokevirtual   #335 <Method Object HashMap.put(Object, Object)>
	//  139  339:pop             
		}
	//* 140  340:goto            287
	//  141  343:return          
	}

	public void addChild(TtmlNode ttmlnode)
	{
		if(children == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #236 <Field List children>
	//*   2    4:ifnonnull       18
			children = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #346 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #347 <Method void ArrayList()>
	//    7   15:putfield        #236 <Field List children>
		children.add(((Object) (ttmlnode)));
	//    8   18:aload_0         
	//    9   19:getfield        #236 <Field List children>
	//   10   22:aload_1         
	//   11   23:invokeinterface #348 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public TtmlNode getChild(int i)
	{
		List list = children;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field List children>
	//    2    4:astore_2        
		if(list != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          20
			return (TtmlNode)list.get(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #245 <Method Object List.get(int)>
	//    8   16:checkcast       #2   <Class TtmlNode>
	//    9   19:areturn         
		else
			throw new IndexOutOfBoundsException();
	//   10   20:new             #350 <Class IndexOutOfBoundsException>
	//   11   23:dup             
	//   12   24:invokespecial   #351 <Method void IndexOutOfBoundsException()>
	//   13   27:athrow          
	}

	public int getChildCount()
	{
		List list = children;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field List children>
	//    2    4:astore_1        
		if(list == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return list.size();
	//    7   11:aload_1         
	//    8   12:invokeinterface #241 <Method int List.size()>
	//    9   17:ireturn         
	}

	public List getCues(long l, Map map, Map map1)
	{
		Object obj = ((Object) (new TreeMap()));
	//    0    0:new             #355 <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #356 <Method void TreeMap()>
	//    3    7:astore          5
		traverseForText(l, false, regionId, ((Map) (obj)));
	//    4    9:aload_0         
	//    5   10:lload_1         
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:getfield        #169 <Field String regionId>
	//    9   16:aload           5
	//   10   18:invokespecial   #337 <Method void traverseForText(long, boolean, String, Map)>
		traverseForStyle(map, ((Map) (obj)));
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:aload           5
	//   14   25:invokespecial   #311 <Method void traverseForStyle(Map, Map)>
		map = ((Map) (new ArrayList()));
	//   15   28:new             #346 <Class ArrayList>
	//   16   31:dup             
	//   17   32:invokespecial   #347 <Method void ArrayList()>
	//   18   35:astore_3        
		java.util.Map.Entry entry;
		TtmlRegion ttmlregion;
		for(obj = ((Object) (((TreeMap) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); ((List) (map)).add(((Object) (new Cue(((CharSequence) (cleanUpText((SpannableStringBuilder)entry.getValue()))), ((android.text.Layout.Alignment) (null)), ttmlregion.line, ttmlregion.lineType, 0x80000000, ttmlregion.position, 0x80000000, ttmlregion.width)))))
	//*  19   36:aload           5
	//*  20   38:invokevirtual   #357 <Method Set TreeMap.entrySet()>
	//*  21   41:invokeinterface #275 <Method Iterator Set.iterator()>
	//*  22   46:astore          5
	//*  23   48:aload           5
	//*  24   50:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//*  25   55:ifeq            147
		{
			entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   26   58:aload           5
	//   27   60:invokeinterface #285 <Method Object Iterator.next()>
	//   28   65:checkcast       #287 <Class java.util.Map$Entry>
	//   29   68:astore          6
			ttmlregion = (TtmlRegion)map1.get(entry.getKey());
	//   30   70:aload           4
	//   31   72:aload           6
	//   32   74:invokeinterface #290 <Method Object java.util.Map$Entry.getKey()>
	//   33   79:invokeinterface #262 <Method Object Map.get(Object)>
	//   34   84:checkcast       #359 <Class TtmlRegion>
	//   35   87:astore          7
		}

	//   36   89:aload_3         
	//   37   90:new             #361 <Class Cue>
	//   38   93:dup             
	//   39   94:aload_0         
	//   40   95:aload           6
	//   41   97:invokeinterface #300 <Method Object java.util.Map$Entry.getValue()>
	//   42  102:checkcast       #205 <Class SpannableStringBuilder>
	//   43  105:invokespecial   #363 <Method SpannableStringBuilder cleanUpText(SpannableStringBuilder)>
	//   44  108:aconst_null     
	//   45  109:aload           7
	//   46  111:getfield        #367 <Field float TtmlRegion.line>
	//   47  114:aload           7
	//   48  116:getfield        #371 <Field int TtmlRegion.lineType>
	//   49  119:ldc2            #372 <Int 0x80000000>
	//   50  122:aload           7
	//   51  124:getfield        #375 <Field float TtmlRegion.position>
	//   52  127:ldc2            #372 <Int 0x80000000>
	//   53  130:aload           7
	//   54  132:getfield        #378 <Field float TtmlRegion.width>
	//   55  135:invokespecial   #381 <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
	//   56  138:invokeinterface #348 <Method boolean List.add(Object)>
	//   57  143:pop             
	//*  58  144:goto            48
		return ((List) (map));
	//   59  147:aload_3         
	//   60  148:areturn         
	}

	public long[] getEventTimesUs()
	{
		Object obj = ((Object) (new TreeSet()));
	//    0    0:new             #231 <Class TreeSet>
	//    1    3:dup             
	//    2    4:invokespecial   #385 <Method void TreeSet()>
	//    3    7:astore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		getEventTimes(((TreeSet) (obj)), false);
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:iconst_0        
	//    9   13:invokespecial   #247 <Method void getEventTimes(TreeSet, boolean)>
		long al[] = new long[((TreeSet) (obj)).size()];
	//   10   16:aload_3         
	//   11   17:invokevirtual   #386 <Method int TreeSet.size()>
	//   12   20:newarray        long[]
	//   13   22:astore_2        
		for(obj = ((Object) (((TreeSet) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  14   23:aload_3         
	//*  15   24:invokevirtual   #387 <Method Iterator TreeSet.iterator()>
	//*  16   27:astore_3        
	//*  17   28:aload_3         
	//*  18   29:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//*  19   34:ifeq            59
		{
			al[i] = ((Long)((Iterator) (obj)).next()).longValue();
	//   20   37:aload_2         
	//   21   38:iload_1         
	//   22   39:aload_3         
	//   23   40:invokeinterface #285 <Method Object Iterator.next()>
	//   24   45:checkcast       #225 <Class Long>
	//   25   48:invokevirtual   #391 <Method long Long.longValue()>
	//   26   51:lastore         
			i++;
	//   27   52:iload_1         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_1        
		}

	//*  31   56:goto            28
		return al;
	//   32   59:aload_2         
	//   33   60:areturn         
	}

	public String[] getStyleIds()
	{
		return styleIds;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field String[] styleIds>
	//    2    4:areturn         
	}

	public boolean isActive(long l)
	{
		return startTimeUs == -1L && endTimeUs == -1L || startTimeUs <= l && endTimeUs == -1L || startTimeUs == -1L && l < endTimeUs || startTimeUs <= l && l < endTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field long startTimeUs>
	//    2    4:ldc2w           #119 <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #159 <Field long endTimeUs>
	//    7   15:ldc2w           #119 <Long -1L>
	//    8   18:lcmp            
	//    9   19:ifeq            80
	//   10   22:aload_0         
	//   11   23:getfield        #157 <Field long startTimeUs>
	//   12   26:lload_1         
	//   13   27:lcmp            
	//   14   28:ifgt            42
	//   15   31:aload_0         
	//   16   32:getfield        #159 <Field long endTimeUs>
	//   17   35:ldc2w           #119 <Long -1L>
	//   18   38:lcmp            
	//   19   39:ifeq            80
	//   20   42:aload_0         
	//   21   43:getfield        #157 <Field long startTimeUs>
	//   22   46:ldc2w           #119 <Long -1L>
	//   23   49:lcmp            
	//   24   50:ifne            62
	//   25   53:lload_1         
	//   26   54:aload_0         
	//   27   55:getfield        #159 <Field long endTimeUs>
	//   28   58:lcmp            
	//   29   59:iflt            80
	//   30   62:aload_0         
	//   31   63:getfield        #157 <Field long startTimeUs>
	//   32   66:lload_1         
	//   33   67:lcmp            
	//   34   68:ifgt            82
	//   35   71:lload_1         
	//   36   72:aload_0         
	//   37   73:getfield        #159 <Field long endTimeUs>
	//   38   76:lcmp            
	//   39   77:ifge            82
	//   40   80:iconst_1        
	//   41   81:ireturn         
	//   42   82:iconst_0        
	//   43   83:ireturn         
	}

	public static final String ANONYMOUS_REGION_ID = "";
	public static final String ATTR_ID = "id";
	public static final String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
	public static final String ATTR_TTS_COLOR = "color";
	public static final String ATTR_TTS_EXTENT = "extent";
	public static final String ATTR_TTS_FONT_FAMILY = "fontFamily";
	public static final String ATTR_TTS_FONT_SIZE = "fontSize";
	public static final String ATTR_TTS_FONT_STYLE = "fontStyle";
	public static final String ATTR_TTS_FONT_WEIGHT = "fontWeight";
	public static final String ATTR_TTS_ORIGIN = "origin";
	public static final String ATTR_TTS_TEXT_ALIGN = "textAlign";
	public static final String ATTR_TTS_TEXT_DECORATION = "textDecoration";
	public static final String BOLD = "bold";
	public static final String CENTER = "center";
	public static final String END = "end";
	public static final String ITALIC = "italic";
	public static final String LEFT = "left";
	public static final String LINETHROUGH = "linethrough";
	public static final String NO_LINETHROUGH = "nolinethrough";
	public static final String NO_UNDERLINE = "nounderline";
	public static final String RIGHT = "right";
	public static final String START = "start";
	public static final String TAG_BODY = "body";
	public static final String TAG_BR = "br";
	public static final String TAG_DIV = "div";
	public static final String TAG_HEAD = "head";
	public static final String TAG_LAYOUT = "layout";
	public static final String TAG_METADATA = "metadata";
	public static final String TAG_P = "p";
	public static final String TAG_REGION = "region";
	public static final String TAG_SMPTE_DATA = "smpte:data";
	public static final String TAG_SMPTE_IMAGE = "smpte:image";
	public static final String TAG_SMPTE_INFORMATION = "smpte:information";
	public static final String TAG_SPAN = "span";
	public static final String TAG_STYLE = "style";
	public static final String TAG_STYLING = "styling";
	public static final String TAG_TT = "tt";
	public static final long UNDEFINED_TIME = -1L;
	public static final String UNDERLINE = "underline";
	private List children;
	public final long endTimeUs;
	public final boolean isTextNode;
	private final HashMap nodeEndsByRegion = new HashMap();
	private final HashMap nodeStartsByRegion = new HashMap();
	public final String regionId;
	public final long startTimeUs;
	public final TtmlStyle style;
	private final String styleIds[];
	public final String tag;
	public final String text;
}
