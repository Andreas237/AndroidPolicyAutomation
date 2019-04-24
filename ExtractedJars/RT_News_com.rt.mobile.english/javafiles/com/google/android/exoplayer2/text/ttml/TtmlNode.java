// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.text.ttml:
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
		map = ((Map) (TtmlRenderUtil.resolveStyle(style, styleIds, map)));
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field TtmlStyle style>
	//    2    4:aload_0         
	//    3    5:getfield        #153 <Field String[] styleIds>
	//    4    8:aload_1         
	//    5    9:invokestatic    #185 <Method TtmlStyle TtmlRenderUtil.resolveStyle(TtmlStyle, String[], Map)>
	//    6   12:astore_1        
		if(map != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          25
			TtmlRenderUtil.applyStylesToSpan(spannablestringbuilder, i, j, ((TtmlStyle) (map)));
	//    9   17:aload_2         
	//   10   18:iload_3         
	//   11   19:iload           4
	//   12   21:aload_1         
	//   13   22:invokestatic    #189 <Method void TtmlRenderUtil.applyStylesToSpan(SpannableStringBuilder, int, int, TtmlStyle)>
	//   14   25:return          
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
		return new TtmlNode(((String) (null)), TtmlRenderUtil.applyTextElementSpacePolicy(s), 0x1L, 0x1L, ((TtmlStyle) (null)), ((String []) (null)), "");
	//    0    0:new             #2   <Class TtmlNode>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokestatic    #201 <Method String TtmlRenderUtil.applyTextElementSpacePolicy(String)>
	//    5    9:ldc2w           #202 <Long 0x1L>
	//    6   12:ldc2w           #202 <Long 0x1L>
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
	//    1    1:invokevirtual   #211 <Method int SpannableStringBuilder.length()>
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
	//*  14   20:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
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
	//   25   40:invokevirtual   #211 <Method int SpannableStringBuilder.length()>
	//   26   43:icmpge          66
	//   27   46:aload_1         
	//   28   47:iload           4
	//   29   49:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
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
	//   50   87:invokevirtual   #219 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
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
	//*  71  117:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
	//*  72  120:bipush          32
	//*  73  122:icmpne          136
			{
				spannablestringbuilder.delete(0, 1);
	//   74  125:aload_1         
	//   75  126:iconst_0        
	//   76  127:iconst_1        
	//   77  128:invokevirtual   #219 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
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
	//* 100  160:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
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
	//* 111  179:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
	//* 112  182:bipush          32
	//* 113  184:icmpne          202
				{
					spannablestringbuilder.delete(l1, k + 2);
	//  114  187:aload_1         
	//  115  188:iload           6
	//  116  190:iload_3         
	//  117  191:iconst_2        
	//  118  192:iadd            
	//  119  193:invokevirtual   #219 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
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
	//* 144  231:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
	//* 145  234:bipush          32
	//* 146  236:icmpne          255
			{
				spannablestringbuilder.delete(l1, i);
	//  147  239:aload_1         
	//  148  240:iload           6
	//  149  242:iload_2         
	//  150  243:invokevirtual   #219 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
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
	//* 169  270:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
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
	//* 180  289:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
	//* 181  292:bipush          10
	//* 182  294:icmpne          310
				{
					spannablestringbuilder.delete(i1, j1);
	//  183  297:aload_1         
	//  184  298:iload           4
	//  185  300:iload           5
	//  186  302:invokevirtual   #219 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
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
	//* 203  327:invokevirtual   #215 <Method char SpannableStringBuilder.charAt(int)>
	//* 204  330:bipush          10
	//* 205  332:icmpne          342
			spannablestringbuilder.delete(i, k);
	//  206  335:aload_1         
	//  207  336:iload_2         
	//  208  337:iload_3         
	//  209  338:invokevirtual   #219 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//  210  341:pop             
		return spannablestringbuilder;
	//  211  342:aload_1         
	//  212  343:areturn         
	}

	private void getEventTimes(TreeSet treeset, boolean flag)
	{
		boolean flag2 = "p".equals(((Object) (tag)));
	//    0    0:ldc1            #95  <String "p">
	//    1    2:aload_0         
	//    2    3:getfield        #147 <Field String tag>
	//    3    6:invokevirtual   #225 <Method boolean String.equals(Object)>
	//    4    9:istore          5
		if(flag || flag2)
	//*   5   11:iload_2         
	//*   6   12:ifne            20
	//*   7   15:iload           5
	//*   8   17:ifeq            66
		{
			if(startTimeUs != 0x1L)
	//*   9   20:aload_0         
	//*  10   21:getfield        #157 <Field long startTimeUs>
	//*  11   24:ldc2w           #202 <Long 0x1L>
	//*  12   27:lcmp            
	//*  13   28:ifeq            43
				treeset.add(((Object) (Long.valueOf(startTimeUs))));
	//   14   31:aload_1         
	//   15   32:aload_0         
	//   16   33:getfield        #157 <Field long startTimeUs>
	//   17   36:invokestatic    #231 <Method Long Long.valueOf(long)>
	//   18   39:invokevirtual   #236 <Method boolean TreeSet.add(Object)>
	//   19   42:pop             
			if(endTimeUs != 0x1L)
	//*  20   43:aload_0         
	//*  21   44:getfield        #159 <Field long endTimeUs>
	//*  22   47:ldc2w           #202 <Long 0x1L>
	//*  23   50:lcmp            
	//*  24   51:ifeq            66
				treeset.add(((Object) (Long.valueOf(endTimeUs))));
	//   25   54:aload_1         
	//   26   55:aload_0         
	//   27   56:getfield        #159 <Field long endTimeUs>
	//   28   59:invokestatic    #231 <Method Long Long.valueOf(long)>
	//   29   62:invokevirtual   #236 <Method boolean TreeSet.add(Object)>
	//   30   65:pop             
		}
		if(children == null)
	//*  31   66:aload_0         
	//*  32   67:getfield        #238 <Field List children>
	//*  33   70:ifnonnull       74
			return;
	//   34   73:return          
		for(int i = 0; i < children.size(); i++)
	//*  35   74:iconst_0        
	//*  36   75:istore_3        
	//*  37   76:iload_3         
	//*  38   77:aload_0         
	//*  39   78:getfield        #238 <Field List children>
	//*  40   81:invokeinterface #243 <Method int List.size()>
	//*  41   86:icmpge          140
		{
			TtmlNode ttmlnode = (TtmlNode)children.get(i);
	//   42   89:aload_0         
	//   43   90:getfield        #238 <Field List children>
	//   44   93:iload_3         
	//   45   94:invokeinterface #247 <Method Object List.get(int)>
	//   46   99:checkcast       #2   <Class TtmlNode>
	//   47  102:astore          6
			boolean flag1;
			if(!flag && !flag2)
	//*  48  104:iload_2         
	//*  49  105:ifne            122
	//*  50  108:iload           5
	//*  51  110:ifeq            116
	//*  52  113:goto            122
				flag1 = false;
	//   53  116:iconst_0        
	//   54  117:istore          4
			else
	//*  55  119:goto            125
				flag1 = true;
	//   56  122:iconst_1        
	//   57  123:istore          4
			ttmlnode.getEventTimes(treeset, flag1);
	//   58  125:aload           6
	//   59  127:aload_1         
	//   60  128:iload           4
	//   61  130:invokespecial   #249 <Method void getEventTimes(TreeSet, boolean)>
		}

	//   62  133:iload_3         
	//   63  134:iconst_1        
	//   64  135:iadd            
	//   65  136:istore_3        
	//*  66  137:goto            76
	//   67  140:return          
	}

	private static SpannableStringBuilder getRegionOutput(String s, Map map)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokeinterface #257 <Method boolean Map.containsKey(Object)>
	//*   3    7:ifne            25
			map.put(((Object) (s)), ((Object) (new SpannableStringBuilder())));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:new             #207 <Class SpannableStringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #258 <Method void SpannableStringBuilder()>
	//    9   19:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   10   24:pop             
		return (SpannableStringBuilder)map.get(((Object) (s)));
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:invokeinterface #264 <Method Object Map.get(Object)>
	//   14   32:checkcast       #207 <Class SpannableStringBuilder>
	//   15   35:areturn         
	}

	private void traverseForStyle(long l, Map map, Map map1)
	{
		if(!isActive(l))
	//*   0    0:aload_0         
	//*   1    1:lload_1         
	//*   2    2:invokevirtual   #271 <Method boolean isActive(long)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		Iterator iterator = nodeEndsByRegion.entrySet().iterator();
	//    5    9:aload_0         
	//    6   10:getfield        #176 <Field HashMap nodeEndsByRegion>
	//    7   13:invokevirtual   #275 <Method Set HashMap.entrySet()>
	//    8   16:invokeinterface #281 <Method Iterator Set.iterator()>
	//    9   21:astore          8
		int i;
		do
		{
			boolean flag = iterator.hasNext();
	//   10   23:aload           8
	//   11   25:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//   12   30:istore          7
			i = 0;
	//   13   32:iconst_0        
	//   14   33:istore          5
			int j = 0;
	//   15   35:iconst_0        
	//   16   36:istore          6
			if(!flag)
				break;
	//   17   38:iload           7
	//   18   40:ifeq            146
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   19   43:aload           8
	//   20   45:invokeinterface #291 <Method Object Iterator.next()>
	//   21   50:checkcast       #293 <Class java.util.Map$Entry>
	//   22   53:astore          9
			String s = (String)entry.getKey();
	//   23   55:aload           9
	//   24   57:invokeinterface #296 <Method Object java.util.Map$Entry.getKey()>
	//   25   62:checkcast       #167 <Class String>
	//   26   65:astore          10
			i = j;
	//   27   67:iload           6
	//   28   69:istore          5
			if(nodeStartsByRegion.containsKey(((Object) (s))))
	//*  29   71:aload_0         
	//*  30   72:getfield        #174 <Field HashMap nodeStartsByRegion>
	//*  31   75:aload           10
	//*  32   77:invokevirtual   #297 <Method boolean HashMap.containsKey(Object)>
	//*  33   80:ifeq            100
				i = ((Integer)nodeStartsByRegion.get(((Object) (s)))).intValue();
	//   34   83:aload_0         
	//   35   84:getfield        #174 <Field HashMap nodeStartsByRegion>
	//   36   87:aload           10
	//   37   89:invokevirtual   #298 <Method Object HashMap.get(Object)>
	//   38   92:checkcast       #300 <Class Integer>
	//   39   95:invokevirtual   #303 <Method int Integer.intValue()>
	//   40   98:istore          5
			j = ((Integer)entry.getValue()).intValue();
	//   41  100:aload           9
	//   42  102:invokeinterface #306 <Method Object java.util.Map$Entry.getValue()>
	//   43  107:checkcast       #300 <Class Integer>
	//   44  110:invokevirtual   #303 <Method int Integer.intValue()>
	//   45  113:istore          6
			if(i != j)
	//*  46  115:iload           5
	//*  47  117:iload           6
	//*  48  119:icmpeq          23
				applyStyleToOutput(map, (SpannableStringBuilder)map1.get(((Object) (s))), i, j);
	//   49  122:aload_0         
	//   50  123:aload_3         
	//   51  124:aload           4
	//   52  126:aload           10
	//   53  128:invokeinterface #264 <Method Object Map.get(Object)>
	//   54  133:checkcast       #207 <Class SpannableStringBuilder>
	//   55  136:iload           5
	//   56  138:iload           6
	//   57  140:invokespecial   #308 <Method void applyStyleToOutput(Map, SpannableStringBuilder, int, int)>
		} while(true);
	//   58  143:goto            23
		for(; i < getChildCount(); i++)
	//*  59  146:iload           5
	//*  60  148:aload_0         
	//*  61  149:invokevirtual   #311 <Method int getChildCount()>
	//*  62  152:icmpge          177
			getChild(i).traverseForStyle(l, map, map1);
	//   63  155:aload_0         
	//   64  156:iload           5
	//   65  158:invokevirtual   #315 <Method TtmlNode getChild(int)>
	//   66  161:lload_1         
	//   67  162:aload_3         
	//   68  163:aload           4
	//   69  165:invokespecial   #317 <Method void traverseForStyle(long, Map, Map)>

	//   70  168:iload           5
	//   71  170:iconst_1        
	//   72  171:iadd            
	//   73  172:istore          5
	//*  74  174:goto            146
	//   75  177:return          
	}

	private void traverseForText(long l, boolean flag, String s, Map map)
	{
		nodeStartsByRegion.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field HashMap nodeStartsByRegion>
	//    2    4:invokevirtual   #323 <Method void HashMap.clear()>
		nodeEndsByRegion.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #176 <Field HashMap nodeEndsByRegion>
	//    5   11:invokevirtual   #323 <Method void HashMap.clear()>
		if("metadata".equals(((Object) (tag))))
	//*   6   14:ldc1            #92  <String "metadata">
	//*   7   16:aload_0         
	//*   8   17:getfield        #147 <Field String tag>
	//*   9   20:invokevirtual   #225 <Method boolean String.equals(Object)>
	//*  10   23:ifeq            27
			return;
	//   11   26:return          
		if(!"".equals(((Object) (regionId))))
	//*  12   27:ldc1            #8   <String "">
	//*  13   29:aload_0         
	//*  14   30:getfield        #169 <Field String regionId>
	//*  15   33:invokevirtual   #225 <Method boolean String.equals(Object)>
	//*  16   36:ifeq            42
	//*  17   39:goto            48
			s = regionId;
	//   18   42:aload_0         
	//   19   43:getfield        #169 <Field String regionId>
	//   20   46:astore          4
		if(isTextNode && flag)
	//*  21   48:aload_0         
	//*  22   49:getfield        #155 <Field boolean isTextNode>
	//*  23   52:ifeq            75
	//*  24   55:iload_3         
	//*  25   56:ifeq            75
		{
			getRegionOutput(s, map).append(((CharSequence) (text)));
	//   26   59:aload           4
	//   27   61:aload           5
	//   28   63:invokestatic    #325 <Method SpannableStringBuilder getRegionOutput(String, Map)>
	//   29   66:aload_0         
	//   30   67:getfield        #149 <Field String text>
	//   31   70:invokevirtual   #329 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   32   73:pop             
			return;
	//   33   74:return          
		}
		if("br".equals(((Object) (tag))) && flag)
	//*  34   75:ldc1            #80  <String "br">
	//*  35   77:aload_0         
	//*  36   78:getfield        #147 <Field String tag>
	//*  37   81:invokevirtual   #225 <Method boolean String.equals(Object)>
	//*  38   84:ifeq            105
	//*  39   87:iload_3         
	//*  40   88:ifeq            105
		{
			getRegionOutput(s, map).append('\n');
	//   41   91:aload           4
	//   42   93:aload           5
	//   43   95:invokestatic    #325 <Method SpannableStringBuilder getRegionOutput(String, Map)>
	//   44   98:bipush          10
	//   45  100:invokevirtual   #332 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   46  103:pop             
			return;
	//   47  104:return          
		}
		if(isActive(l))
	//*  48  105:aload_0         
	//*  49  106:lload_1         
	//*  50  107:invokevirtual   #271 <Method boolean isActive(long)>
	//*  51  110:ifeq            341
		{
			java.util.Map.Entry entry;
			for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); nodeStartsByRegion.put(entry.getKey(), ((Object) (Integer.valueOf(((SpannableStringBuilder)entry.getValue()).length())))))
	//*  52  113:aload           5
	//*  53  115:invokeinterface #333 <Method Set Map.entrySet()>
	//*  54  120:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  55  125:astore          9
	//*  56  127:aload           9
	//*  57  129:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  58  134:ifeq            183
				entry = (java.util.Map.Entry)iterator.next();
	//   59  137:aload           9
	//   60  139:invokeinterface #291 <Method Object Iterator.next()>
	//   61  144:checkcast       #293 <Class java.util.Map$Entry>
	//   62  147:astore          10

	//   63  149:aload_0         
	//   64  150:getfield        #174 <Field HashMap nodeStartsByRegion>
	//   65  153:aload           10
	//   66  155:invokeinterface #296 <Method Object java.util.Map$Entry.getKey()>
	//   67  160:aload           10
	//   68  162:invokeinterface #306 <Method Object java.util.Map$Entry.getValue()>
	//   69  167:checkcast       #207 <Class SpannableStringBuilder>
	//   70  170:invokevirtual   #211 <Method int SpannableStringBuilder.length()>
	//   71  173:invokestatic    #336 <Method Integer Integer.valueOf(int)>
	//   72  176:invokevirtual   #337 <Method Object HashMap.put(Object, Object)>
	//   73  179:pop             
	//*  74  180:goto            127
			boolean flag2 = "p".equals(((Object) (tag)));
	//   75  183:ldc1            #95  <String "p">
	//   76  185:aload_0         
	//   77  186:getfield        #147 <Field String tag>
	//   78  189:invokevirtual   #225 <Method boolean String.equals(Object)>
	//   79  192:istore          8
			for(int i = 0; i < getChildCount(); i++)
	//*  80  194:iconst_0        
	//*  81  195:istore          6
	//*  82  197:iload           6
	//*  83  199:aload_0         
	//*  84  200:invokevirtual   #311 <Method int getChildCount()>
	//*  85  203:icmpge          256
			{
				TtmlNode ttmlnode = getChild(i);
	//   86  206:aload_0         
	//   87  207:iload           6
	//   88  209:invokevirtual   #315 <Method TtmlNode getChild(int)>
	//   89  212:astore          9
				boolean flag1;
				if(!flag && !flag2)
	//*  90  214:iload_3         
	//*  91  215:ifne            232
	//*  92  218:iload           8
	//*  93  220:ifeq            226
	//*  94  223:goto            232
					flag1 = false;
	//   95  226:iconst_0        
	//   96  227:istore          7
				else
	//*  97  229:goto            235
					flag1 = true;
	//   98  232:iconst_1        
	//   99  233:istore          7
				ttmlnode.traverseForText(l, flag1, s, map);
	//  100  235:aload           9
	//  101  237:lload_1         
	//  102  238:iload           7
	//  103  240:aload           4
	//  104  242:aload           5
	//  105  244:invokespecial   #339 <Method void traverseForText(long, boolean, String, Map)>
			}

	//  106  247:iload           6
	//  107  249:iconst_1        
	//  108  250:iadd            
	//  109  251:istore          6
	//* 110  253:goto            197
			if(flag2)
	//* 111  256:iload           8
	//* 112  258:ifeq            271
				TtmlRenderUtil.endParagraph(getRegionOutput(s, map));
	//  113  261:aload           4
	//  114  263:aload           5
	//  115  265:invokestatic    #325 <Method SpannableStringBuilder getRegionOutput(String, Map)>
	//  116  268:invokestatic    #343 <Method void TtmlRenderUtil.endParagraph(SpannableStringBuilder)>
			for(s = ((String) (map.entrySet().iterator())); ((Iterator) (s)).hasNext(); nodeEndsByRegion.put(((java.util.Map.Entry) (map)).getKey(), ((Object) (Integer.valueOf(((SpannableStringBuilder)((java.util.Map.Entry) (map)).getValue()).length())))))
	//* 117  271:aload           5
	//* 118  273:invokeinterface #333 <Method Set Map.entrySet()>
	//* 119  278:invokeinterface #281 <Method Iterator Set.iterator()>
	//* 120  283:astore          4
	//* 121  285:aload           4
	//* 122  287:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//* 123  292:ifeq            341
				map = ((Map) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//  124  295:aload           4
	//  125  297:invokeinterface #291 <Method Object Iterator.next()>
	//  126  302:checkcast       #293 <Class java.util.Map$Entry>
	//  127  305:astore          5

	//  128  307:aload_0         
	//  129  308:getfield        #176 <Field HashMap nodeEndsByRegion>
	//  130  311:aload           5
	//  131  313:invokeinterface #296 <Method Object java.util.Map$Entry.getKey()>
	//  132  318:aload           5
	//  133  320:invokeinterface #306 <Method Object java.util.Map$Entry.getValue()>
	//  134  325:checkcast       #207 <Class SpannableStringBuilder>
	//  135  328:invokevirtual   #211 <Method int SpannableStringBuilder.length()>
	//  136  331:invokestatic    #336 <Method Integer Integer.valueOf(int)>
	//  137  334:invokevirtual   #337 <Method Object HashMap.put(Object, Object)>
	//  138  337:pop             
		}
	//* 139  338:goto            285
	//  140  341:return          
	}

	public void addChild(TtmlNode ttmlnode)
	{
		if(children == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field List children>
	//*   2    4:ifnonnull       18
			children = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #348 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #349 <Method void ArrayList()>
	//    7   15:putfield        #238 <Field List children>
		children.add(((Object) (ttmlnode)));
	//    8   18:aload_0         
	//    9   19:getfield        #238 <Field List children>
	//   10   22:aload_1         
	//   11   23:invokeinterface #350 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public TtmlNode getChild(int i)
	{
		if(children == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field List children>
	//*   2    4:ifnonnull       15
			throw new IndexOutOfBoundsException();
	//    3    7:new             #352 <Class IndexOutOfBoundsException>
	//    4   10:dup             
	//    5   11:invokespecial   #353 <Method void IndexOutOfBoundsException()>
	//    6   14:athrow          
		else
			return (TtmlNode)children.get(i);
	//    7   15:aload_0         
	//    8   16:getfield        #238 <Field List children>
	//    9   19:iload_1         
	//   10   20:invokeinterface #247 <Method Object List.get(int)>
	//   11   25:checkcast       #2   <Class TtmlNode>
	//   12   28:areturn         
	}

	public int getChildCount()
	{
		if(children == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field List children>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return children.size();
	//    5    9:aload_0         
	//    6   10:getfield        #238 <Field List children>
	//    7   13:invokeinterface #243 <Method int List.size()>
	//    8   18:ireturn         
	}

	public List getCues(long l, Map map, Map map1)
	{
		Object obj = ((Object) (new TreeMap()));
	//    0    0:new             #357 <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #358 <Method void TreeMap()>
	//    3    7:astore          5
		traverseForText(l, false, regionId, ((Map) (obj)));
	//    4    9:aload_0         
	//    5   10:lload_1         
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:getfield        #169 <Field String regionId>
	//    9   16:aload           5
	//   10   18:invokespecial   #339 <Method void traverseForText(long, boolean, String, Map)>
		traverseForStyle(l, map, ((Map) (obj)));
	//   11   21:aload_0         
	//   12   22:lload_1         
	//   13   23:aload_3         
	//   14   24:aload           5
	//   15   26:invokespecial   #317 <Method void traverseForStyle(long, Map, Map)>
		map = ((Map) (new ArrayList()));
	//   16   29:new             #348 <Class ArrayList>
	//   17   32:dup             
	//   18   33:invokespecial   #349 <Method void ArrayList()>
	//   19   36:astore_3        
		java.util.Map.Entry entry;
		TtmlRegion ttmlregion;
		for(obj = ((Object) (((TreeMap) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); ((List) (map)).add(((Object) (new Cue(((CharSequence) (cleanUpText((SpannableStringBuilder)entry.getValue()))), ((android.text.Layout.Alignment) (null)), ttmlregion.line, ttmlregion.lineType, ttmlregion.lineAnchor, ttmlregion.position, 0x80000000, ttmlregion.width, ttmlregion.textSizeType, ttmlregion.textSize)))))
	//*  20   37:aload           5
	//*  21   39:invokevirtual   #359 <Method Set TreeMap.entrySet()>
	//*  22   42:invokeinterface #281 <Method Iterator Set.iterator()>
	//*  23   47:astore          5
	//*  24   49:aload           5
	//*  25   51:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  26   56:ifeq            160
		{
			entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   27   59:aload           5
	//   28   61:invokeinterface #291 <Method Object Iterator.next()>
	//   29   66:checkcast       #293 <Class java.util.Map$Entry>
	//   30   69:astore          6
			ttmlregion = (TtmlRegion)map1.get(entry.getKey());
	//   31   71:aload           4
	//   32   73:aload           6
	//   33   75:invokeinterface #296 <Method Object java.util.Map$Entry.getKey()>
	//   34   80:invokeinterface #264 <Method Object Map.get(Object)>
	//   35   85:checkcast       #361 <Class TtmlRegion>
	//   36   88:astore          7
		}

	//   37   90:aload_3         
	//   38   91:new             #363 <Class Cue>
	//   39   94:dup             
	//   40   95:aload_0         
	//   41   96:aload           6
	//   42   98:invokeinterface #306 <Method Object java.util.Map$Entry.getValue()>
	//   43  103:checkcast       #207 <Class SpannableStringBuilder>
	//   44  106:invokespecial   #365 <Method SpannableStringBuilder cleanUpText(SpannableStringBuilder)>
	//   45  109:aconst_null     
	//   46  110:aload           7
	//   47  112:getfield        #369 <Field float TtmlRegion.line>
	//   48  115:aload           7
	//   49  117:getfield        #373 <Field int TtmlRegion.lineType>
	//   50  120:aload           7
	//   51  122:getfield        #376 <Field int TtmlRegion.lineAnchor>
	//   52  125:aload           7
	//   53  127:getfield        #379 <Field float TtmlRegion.position>
	//   54  130:ldc2            #380 <Int 0x80000000>
	//   55  133:aload           7
	//   56  135:getfield        #383 <Field float TtmlRegion.width>
	//   57  138:aload           7
	//   58  140:getfield        #386 <Field int TtmlRegion.textSizeType>
	//   59  143:aload           7
	//   60  145:getfield        #389 <Field float TtmlRegion.textSize>
	//   61  148:invokespecial   #392 <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float, int, float)>
	//   62  151:invokeinterface #350 <Method boolean List.add(Object)>
	//   63  156:pop             
	//*  64  157:goto            49
		return ((List) (map));
	//   65  160:aload_3         
	//   66  161:areturn         
	}

	public long[] getEventTimesUs()
	{
		Object obj = ((Object) (new TreeSet()));
	//    0    0:new             #233 <Class TreeSet>
	//    1    3:dup             
	//    2    4:invokespecial   #396 <Method void TreeSet()>
	//    3    7:astore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		getEventTimes(((TreeSet) (obj)), false);
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:iconst_0        
	//    9   13:invokespecial   #249 <Method void getEventTimes(TreeSet, boolean)>
		long al[] = new long[((TreeSet) (obj)).size()];
	//   10   16:aload_3         
	//   11   17:invokevirtual   #397 <Method int TreeSet.size()>
	//   12   20:newarray        long[]
	//   13   22:astore_2        
		for(obj = ((Object) (((TreeSet) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  14   23:aload_3         
	//*  15   24:invokevirtual   #398 <Method Iterator TreeSet.iterator()>
	//*  16   27:astore_3        
	//*  17   28:aload_3         
	//*  18   29:invokeinterface #287 <Method boolean Iterator.hasNext()>
	//*  19   34:ifeq            59
		{
			al[i] = ((Long)((Iterator) (obj)).next()).longValue();
	//   20   37:aload_2         
	//   21   38:iload_1         
	//   22   39:aload_3         
	//   23   40:invokeinterface #291 <Method Object Iterator.next()>
	//   24   45:checkcast       #227 <Class Long>
	//   25   48:invokevirtual   #402 <Method long Long.longValue()>
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
		return startTimeUs == 0x1L && endTimeUs == 0x1L || startTimeUs <= l && endTimeUs == 0x1L || startTimeUs == 0x1L && l < endTimeUs || startTimeUs <= l && l < endTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field long startTimeUs>
	//    2    4:ldc2w           #202 <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #159 <Field long endTimeUs>
	//    7   15:ldc2w           #202 <Long 0x1L>
	//    8   18:lcmp            
	//    9   19:ifeq            80
	//   10   22:aload_0         
	//   11   23:getfield        #157 <Field long startTimeUs>
	//   12   26:lload_1         
	//   13   27:lcmp            
	//   14   28:ifgt            42
	//   15   31:aload_0         
	//   16   32:getfield        #159 <Field long endTimeUs>
	//   17   35:ldc2w           #202 <Long 0x1L>
	//   18   38:lcmp            
	//   19   39:ifeq            80
	//   20   42:aload_0         
	//   21   43:getfield        #157 <Field long startTimeUs>
	//   22   46:ldc2w           #202 <Long 0x1L>
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
	public static final String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
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
