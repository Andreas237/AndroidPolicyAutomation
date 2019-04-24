// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont, RandomAccessFileOrArray

public class CFFFontSubset extends CFFFont
{

	public CFFFontSubset(RandomAccessFileOrArray randomaccessfileorarray, HashMap hashmap)
	{
		super(randomaccessfileorarray);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #189 <Method void CFFFont(RandomAccessFileOrArray)>
		FDArrayUsed = new HashSet();
	//    3    5:aload_0         
	//    4    6:new             #191 <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #193 <Method void HashSet()>
	//    7   13:putfield        #195 <Field HashSet FDArrayUsed>
		hGSubrsUsed = new HashMap();
	//    8   16:aload_0         
	//    9   17:new             #197 <Class HashMap>
	//   10   20:dup             
	//   11   21:invokespecial   #198 <Method void HashMap()>
	//   12   24:putfield        #200 <Field HashMap hGSubrsUsed>
		lGSubrsUsed = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #202 <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #203 <Method void ArrayList()>
	//   17   35:putfield        #205 <Field ArrayList lGSubrsUsed>
		hSubrsUsedNonCID = new HashMap();
	//   18   38:aload_0         
	//   19   39:new             #197 <Class HashMap>
	//   20   42:dup             
	//   21   43:invokespecial   #198 <Method void HashMap()>
	//   22   46:putfield        #207 <Field HashMap hSubrsUsedNonCID>
		lSubrsUsedNonCID = new ArrayList();
	//   23   49:aload_0         
	//   24   50:new             #202 <Class ArrayList>
	//   25   53:dup             
	//   26   54:invokespecial   #203 <Method void ArrayList()>
	//   27   57:putfield        #209 <Field ArrayList lSubrsUsedNonCID>
		GBias = 0;
	//   28   60:aload_0         
	//   29   61:iconst_0        
	//   30   62:putfield        #211 <Field int GBias>
		NumOfHints = 0;
	//   31   65:aload_0         
	//   32   66:iconst_0        
	//   33   67:putfield        #213 <Field int NumOfHints>
		GlyphsUsed = hashmap;
	//   34   70:aload_0         
	//   35   71:aload_2         
	//   36   72:putfield        #215 <Field HashMap GlyphsUsed>
		glyphsInList = new ArrayList(((java.util.Collection) (hashmap.keySet())));
	//   37   75:aload_0         
	//   38   76:new             #202 <Class ArrayList>
	//   39   79:dup             
	//   40   80:aload_2         
	//   41   81:invokevirtual   #219 <Method java.util.Set HashMap.keySet()>
	//   42   84:invokespecial   #222 <Method void ArrayList(java.util.Collection)>
	//   43   87:putfield        #224 <Field ArrayList glyphsInList>
		for(int i = 0; i < fonts.length; i++)
	//*  44   90:iconst_0        
	//*  45   91:istore_3        
	//*  46   92:iload_3         
	//*  47   93:aload_0         
	//*  48   94:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  49   97:arraylength     
	//*  50   98:icmpge          252
		{
			seek(fonts[i].charstringsOffset);
	//   51  101:aload_0         
	//   52  102:aload_0         
	//   53  103:getfield        #228 <Field CFFFont$Font[] fonts>
	//   54  106:iload_3         
	//   55  107:aaload          
	//   56  108:getfield        #233 <Field int CFFFont$Font.charstringsOffset>
	//   57  111:invokevirtual   #237 <Method void seek(int)>
			fonts[i].nglyphs = ((int) (getCard16()));
	//   58  114:aload_0         
	//   59  115:getfield        #228 <Field CFFFont$Font[] fonts>
	//   60  118:iload_3         
	//   61  119:aaload          
	//   62  120:aload_0         
	//   63  121:invokevirtual   #241 <Method char getCard16()>
	//   64  124:putfield        #244 <Field int CFFFont$Font.nglyphs>
			seek(stringIndexOffset);
	//   65  127:aload_0         
	//   66  128:aload_0         
	//   67  129:getfield        #247 <Field int stringIndexOffset>
	//   68  132:invokevirtual   #237 <Method void seek(int)>
			fonts[i].nstrings = getCard16() + standardStrings.length;
	//   69  135:aload_0         
	//   70  136:getfield        #228 <Field CFFFont$Font[] fonts>
	//   71  139:iload_3         
	//   72  140:aaload          
	//   73  141:aload_0         
	//   74  142:invokevirtual   #241 <Method char getCard16()>
	//   75  145:getstatic       #250 <Field String[] standardStrings>
	//   76  148:arraylength     
	//   77  149:iadd            
	//   78  150:putfield        #253 <Field int CFFFont$Font.nstrings>
			fonts[i].charstringsOffsets = getIndex(fonts[i].charstringsOffset);
	//   79  153:aload_0         
	//   80  154:getfield        #228 <Field CFFFont$Font[] fonts>
	//   81  157:iload_3         
	//   82  158:aaload          
	//   83  159:aload_0         
	//   84  160:aload_0         
	//   85  161:getfield        #228 <Field CFFFont$Font[] fonts>
	//   86  164:iload_3         
	//   87  165:aaload          
	//   88  166:getfield        #233 <Field int CFFFont$Font.charstringsOffset>
	//   89  169:invokevirtual   #257 <Method int[] getIndex(int)>
	//   90  172:putfield        #261 <Field int[] CFFFont$Font.charstringsOffsets>
			if(fonts[i].fdselectOffset >= 0)
	//*  91  175:aload_0         
	//*  92  176:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  93  179:iload_3         
	//*  94  180:aaload          
	//*  95  181:getfield        #264 <Field int CFFFont$Font.fdselectOffset>
	//*  96  184:iflt            197
			{
				readFDSelect(i);
	//   97  187:aload_0         
	//   98  188:iload_3         
	//   99  189:invokevirtual   #267 <Method void readFDSelect(int)>
				BuildFDArrayUsed(i);
	//  100  192:aload_0         
	//  101  193:iload_3         
	//  102  194:invokevirtual   #270 <Method void BuildFDArrayUsed(int)>
			}
			if(fonts[i].isCID)
	//* 103  197:aload_0         
	//* 104  198:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 105  201:iload_3         
	//* 106  202:aaload          
	//* 107  203:getfield        #274 <Field boolean CFFFont$Font.isCID>
	//* 108  206:ifeq            214
				ReadFDArray(i);
	//  109  209:aload_0         
	//  110  210:iload_3         
	//  111  211:invokevirtual   #277 <Method void ReadFDArray(int)>
			fonts[i].CharsetLength = CountCharset(fonts[i].charsetOffset, fonts[i].nglyphs);
	//  112  214:aload_0         
	//  113  215:getfield        #228 <Field CFFFont$Font[] fonts>
	//  114  218:iload_3         
	//  115  219:aaload          
	//  116  220:aload_0         
	//  117  221:aload_0         
	//  118  222:getfield        #228 <Field CFFFont$Font[] fonts>
	//  119  225:iload_3         
	//  120  226:aaload          
	//  121  227:getfield        #280 <Field int CFFFont$Font.charsetOffset>
	//  122  230:aload_0         
	//  123  231:getfield        #228 <Field CFFFont$Font[] fonts>
	//  124  234:iload_3         
	//  125  235:aaload          
	//  126  236:getfield        #244 <Field int CFFFont$Font.nglyphs>
	//  127  239:invokevirtual   #284 <Method int CountCharset(int, int)>
	//  128  242:putfield        #287 <Field int CFFFont$Font.CharsetLength>
		}

	//  129  245:iload_3         
	//  130  246:iconst_1        
	//  131  247:iadd            
	//  132  248:istore_3        
	//* 133  249:goto            92
	//  134  252:return          
	}

	protected byte[] AssembleIndex(int ai[], byte abyte0[])
	{
		int j;
		int i1;
		int k1;
		boolean flag;
		int i2;
		byte abyte1[];
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		j = ((int) ((char)(ai.length - 1)));
	//    2    3:aload_1         
	//    3    4:arraylength     
	//    4    5:iconst_1        
	//    5    6:isub            
	//    6    7:int2char        
	//    7    8:istore          4
		int k = ai[ai.length - 1];
	//    8   10:aload_1         
	//    9   11:aload_1         
	//   10   12:arraylength     
	//   11   13:iconst_1        
	//   12   14:isub            
	//   13   15:iaload          
	//   14   16:istore          5
		int i;
		int l1;
		if(k <= 255)
	//*  15   18:iload           5
	//*  16   20:sipush          255
	//*  17   23:icmpgt          169
			i = 1;
	//   18   26:iconst_1        
	//   19   27:istore_3        
		else
	//*  20   28:iload           4
	//*  21   30:iconst_1        
	//*  22   31:iadd            
	//*  23   32:iload_3         
	//*  24   33:imul            
	//*  25   34:iconst_3        
	//*  26   35:iadd            
	//*  27   36:aload_2         
	//*  28   37:arraylength     
	//*  29   38:iadd            
	//*  30   39:newarray        byte[]
	//*  31   41:astore          11
	//*  32   43:iconst_0        
	//*  33   44:iconst_1        
	//*  34   45:iadd            
	//*  35   46:istore          6
	//*  36   48:aload           11
	//*  37   50:iconst_0        
	//*  38   51:iload           4
	//*  39   53:bipush          8
	//*  40   55:iushr           
	//*  41   56:sipush          255
	//*  42   59:iand            
	//*  43   60:int2byte        
	//*  44   61:bastore         
	//*  45   62:iload           6
	//*  46   64:iconst_1        
	//*  47   65:iadd            
	//*  48   66:istore          5
	//*  49   68:aload           11
	//*  50   70:iload           6
	//*  51   72:iload           4
	//*  52   74:iconst_0        
	//*  53   75:iushr           
	//*  54   76:sipush          255
	//*  55   79:iand            
	//*  56   80:int2byte        
	//*  57   81:bastore         
	//*  58   82:iload           5
	//*  59   84:iconst_1        
	//*  60   85:iadd            
	//*  61   86:istore          4
	//*  62   88:aload           11
	//*  63   90:iload           5
	//*  64   92:iload_3         
	//*  65   93:bastore         
	//*  66   94:aload_1         
	//*  67   95:arraylength     
	//*  68   96:istore          9
	//*  69   98:iconst_0        
	//*  70   99:istore          5
	//*  71  101:iload           5
	//*  72  103:iload           9
	//*  73  105:icmpge          290
	//*  74  108:aload_1         
	//*  75  109:iload           5
	//*  76  111:iaload          
	//*  77  112:aload_1         
	//*  78  113:iconst_0        
	//*  79  114:iaload          
	//*  80  115:isub            
	//*  81  116:iconst_1        
	//*  82  117:iadd            
	//*  83  118:istore          10
	//*  84  120:iload           4
	//*  85  122:istore          6
	//*  86  124:iload           4
	//*  87  126:istore          7
	//*  88  128:iload_3         
	//*  89  129:tableswitch     1 4: default 160
	//	               1 267
	//	               2 246
	//	               3 332
	//	               4 200
	//*  90  160:iload           5
	//*  91  162:iconst_1        
	//*  92  163:iadd            
	//*  93  164:istore          5
	//*  94  166:goto            101
		if(k <= 65535)
	//*  95  169:iload           5
	//*  96  171:ldc2            #292 <Int 65535>
	//*  97  174:icmpgt          182
			i = 2;
	//   98  177:iconst_2        
	//   99  178:istore_3        
		else
	//* 100  179:goto            28
		if(k <= 0xffffff)
	//* 101  182:iload           5
	//* 102  184:ldc2            #293 <Int 0xffffff>
	//* 103  187:icmpgt          195
			i = 3;
	//  104  190:iconst_3        
	//  105  191:istore_3        
		else
	//* 106  192:goto            28
			i = 4;
	//  107  195:iconst_4        
	//  108  196:istore_3        
_L11:
		abyte1 = new byte[(j + 1) * i + 3 + abyte0.length];
		i1 = 0 + 1;
		abyte1[0] = (byte)(j >>> 8 & 0xff);
		k = i1 + 1;
		abyte1[i1] = (byte)(j >>> 0 & 0xff);
		j = k + 1;
		abyte1[k] = ((byte) (i));
		l1 = ai.length;
		k = 0;
_L9:
		if(k >= l1) goto _L2; else goto _L1
_L1:
		i2 = (ai[k] - ai[0]) + 1;
		i1 = j;
		k1 = j;
		i;
		JVM INSTR tableswitch 1 4: default 160
	//	               1 267
	//	               2 246
	//	               3 332
	//	               4 200;
		   goto _L3 _L4 _L5 _L6 _L7
_L3:
		k++;
		continue; /* Loop/switch isn't completed */
		if(true) goto _L9; else goto _L8
_L8:
	//* 109  197:goto            28
_L7:
		i1 = j + 1;
	//  110  200:iload           4
	//  111  202:iconst_1        
	//  112  203:iadd            
	//  113  204:istore          6
		abyte1[j] = (byte)(i2 >>> 24 & 0xff);
	//  114  206:aload           11
	//  115  208:iload           4
	//  116  210:iload           10
	//  117  212:bipush          24
	//  118  214:iushr           
	//  119  215:sipush          255
	//  120  218:iand            
	//  121  219:int2byte        
	//  122  220:bastore         
		j = i1;
	//  123  221:iload           6
	//  124  223:istore          4
_L6:
		i1 = j + 1;
	//  125  225:iload           4
	//  126  227:iconst_1        
	//  127  228:iadd            
	//  128  229:istore          6
		abyte1[j] = (byte)(i2 >>> 16 & 0xff);
	//  129  231:aload           11
	//  130  233:iload           4
	//  131  235:iload           10
	//  132  237:bipush          16
	//  133  239:iushr           
	//  134  240:sipush          255
	//  135  243:iand            
	//  136  244:int2byte        
	//  137  245:bastore         
_L5:
		k1 = i1 + 1;
	//  138  246:iload           6
	//  139  248:iconst_1        
	//  140  249:iadd            
	//  141  250:istore          7
		abyte1[i1] = (byte)(i2 >>> 8 & 0xff);
	//  142  252:aload           11
	//  143  254:iload           6
	//  144  256:iload           10
	//  145  258:bipush          8
	//  146  260:iushr           
	//  147  261:sipush          255
	//  148  264:iand            
	//  149  265:int2byte        
	//  150  266:bastore         
_L4:
		j = k1 + 1;
	//  151  267:iload           7
	//  152  269:iconst_1        
	//  153  270:iadd            
	//  154  271:istore          4
		abyte1[k1] = (byte)(i2 >>> 0 & 0xff);
	//  155  273:aload           11
	//  156  275:iload           7
	//  157  277:iload           10
	//  158  279:iconst_0        
	//  159  280:iushr           
	//  160  281:sipush          255
	//  161  284:iand            
	//  162  285:int2byte        
	//  163  286:bastore         
		  goto _L3
	//* 164  287:goto            160
_L2:
		int j1 = abyte0.length;
	//  165  290:aload_2         
	//  166  291:arraylength     
	//  167  292:istore          6
		for(int l = ((int) (flag)); l < j1;)
	//* 168  294:iload           8
	//* 169  296:istore          5
	//* 170  298:iload           5
	//* 171  300:iload           6
	//* 172  302:icmpge          329
		{
			abyte1[j] = abyte0[l];
	//  173  305:aload           11
	//  174  307:iload           4
	//  175  309:aload_2         
	//  176  310:iload           5
	//  177  312:baload          
	//  178  313:bastore         
			l++;
	//  179  314:iload           5
	//  180  316:iconst_1        
	//  181  317:iadd            
	//  182  318:istore          5
			j++;
	//  183  320:iload           4
	//  184  322:iconst_1        
	//  185  323:iadd            
	//  186  324:istore          4
		}

	//* 187  326:goto            298
		return abyte1;
	//  188  329:aload           11
	//  189  331:areturn         
		if(true) goto _L11; else goto _L10
	//  190  332:goto            225
_L10:
	}

	protected void BuildFDArrayUsed(int i)
	{
		int ai[] = fonts[i].FDSelect;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field CFFFont$Font[] fonts>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #296 <Field int[] CFFFont$Font.FDSelect>
	//    5    9:astore_3        
		for(i = 0; i < glyphsInList.size(); i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #224 <Field ArrayList glyphsInList>
	//*  11   17:invokevirtual   #300 <Method int ArrayList.size()>
	//*  12   20:icmpge          59
		{
			int j = ai[((Integer)glyphsInList.get(i)).intValue()];
	//   13   23:aload_3         
	//   14   24:aload_0         
	//   15   25:getfield        #224 <Field ArrayList glyphsInList>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #303 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #305 <Class Integer>
	//   19   35:invokevirtual   #308 <Method int Integer.intValue()>
	//   20   38:iaload          
	//   21   39:istore_2        
			FDArrayUsed.add(((Object) (Integer.valueOf(j))));
	//   22   40:aload_0         
	//   23   41:getfield        #195 <Field HashSet FDArrayUsed>
	//   24   44:iload_2         
	//   25   45:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//   26   48:invokevirtual   #315 <Method boolean HashSet.add(Object)>
	//   27   51:pop             
		}

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
	//*  32   56:goto            12
	//   33   59:return          
	}

	protected void BuildFDSubrsOffsets(int i, int j)
	{
		fonts[i].PrivateSubrsOffset[j] = -1;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field CFFFont$Font[] fonts>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
	//    5    9:iload_2         
	//    6   10:iconst_m1       
	//    7   11:iastore         
		seek(fonts[i].fdprivateOffsets[j]);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #228 <Field CFFFont$Font[] fonts>
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   14   22:iload_2         
	//   15   23:iaload          
	//   16   24:invokevirtual   #237 <Method void seek(int)>
		do
		{
			if(getPosition() >= fonts[i].fdprivateOffsets[j] + fonts[i].fdprivateLengths[j])
				break;
	//   17   27:aload_0         
	//   18   28:invokevirtual   #326 <Method int getPosition()>
	//   19   31:aload_0         
	//   20   32:getfield        #228 <Field CFFFont$Font[] fonts>
	//   21   35:iload_1         
	//   22   36:aaload          
	//   23   37:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   24   40:iload_2         
	//   25   41:iaload          
	//   26   42:aload_0         
	//   27   43:getfield        #228 <Field CFFFont$Font[] fonts>
	//   28   46:iload_1         
	//   29   47:aaload          
	//   30   48:getfield        #329 <Field int[] CFFFont$Font.fdprivateLengths>
	//   31   51:iload_2         
	//   32   52:iaload          
	//   33   53:iadd            
	//   34   54:icmpge          109
			getDictItem();
	//   35   57:aload_0         
	//   36   58:invokevirtual   #332 <Method void getDictItem()>
			if(key == "Subrs")
	//*  37   61:aload_0         
	//*  38   62:getfield        #336 <Field String key>
	//*  39   65:ldc2            #338 <String "Subrs">
	//*  40   68:if_acmpne       27
				fonts[i].PrivateSubrsOffset[j] = ((Integer)args[0]).intValue() + fonts[i].fdprivateOffsets[j];
	//   41   71:aload_0         
	//   42   72:getfield        #228 <Field CFFFont$Font[] fonts>
	//   43   75:iload_1         
	//   44   76:aaload          
	//   45   77:getfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
	//   46   80:iload_2         
	//   47   81:aload_0         
	//   48   82:getfield        #342 <Field Object[] args>
	//   49   85:iconst_0        
	//   50   86:aaload          
	//   51   87:checkcast       #305 <Class Integer>
	//   52   90:invokevirtual   #308 <Method int Integer.intValue()>
	//   53   93:aload_0         
	//   54   94:getfield        #228 <Field CFFFont$Font[] fonts>
	//   55   97:iload_1         
	//   56   98:aaload          
	//   57   99:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   58  102:iload_2         
	//   59  103:iaload          
	//   60  104:iadd            
	//   61  105:iastore         
		} while(true);
	//   62  106:goto            27
		if(fonts[i].PrivateSubrsOffset[j] >= 0)
	//*  63  109:aload_0         
	//*  64  110:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  65  113:iload_1         
	//*  66  114:aaload          
	//*  67  115:getfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
	//*  68  118:iload_2         
	//*  69  119:iaload          
	//*  70  120:iflt            149
			fonts[i].PrivateSubrsOffsetsArray[j] = getIndex(fonts[i].PrivateSubrsOffset[j]);
	//   71  123:aload_0         
	//   72  124:getfield        #228 <Field CFFFont$Font[] fonts>
	//   73  127:iload_1         
	//   74  128:aaload          
	//   75  129:getfield        #346 <Field int[][] CFFFont$Font.PrivateSubrsOffsetsArray>
	//   76  132:iload_2         
	//   77  133:aload_0         
	//   78  134:aload_0         
	//   79  135:getfield        #228 <Field CFFFont$Font[] fonts>
	//   80  138:iload_1         
	//   81  139:aaload          
	//   82  140:getfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
	//   83  143:iload_2         
	//   84  144:iaload          
	//   85  145:invokevirtual   #257 <Method int[] getIndex(int)>
	//   86  148:aastore         
	//   87  149:return          
	}

	protected void BuildGSubrsUsed(int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(fonts[i].privateSubrs >= 0)
	//*   4    4:aload_0         
	//*   5    5:getfield        #228 <Field CFFFont$Font[] fonts>
	//*   6    8:iload_1         
	//*   7    9:aaload          
	//*   8   10:getfield        #350 <Field int CFFFont$Font.privateSubrs>
	//*   9   13:iflt            39
		{
			k = CalcBias(fonts[i].privateSubrs, i);
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #228 <Field CFFFont$Font[] fonts>
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:getfield        #350 <Field int CFFFont$Font.privateSubrs>
	//   16   26:iload_1         
	//   17   27:invokevirtual   #353 <Method int CalcBias(int, int)>
	//   18   30:istore_3        
			j = lSubrsUsedNonCID.size();
	//   19   31:aload_0         
	//   20   32:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//   21   35:invokevirtual   #300 <Method int ArrayList.size()>
	//   22   38:istore_2        
		}
		int l = 0;
	//   23   39:iconst_0        
	//   24   40:istore          4
		while(l < lGSubrsUsed.size()) 
	//*  25   42:iload           4
	//*  26   44:aload_0         
	//*  27   45:getfield        #205 <Field ArrayList lGSubrsUsed>
	//*  28   48:invokevirtual   #300 <Method int ArrayList.size()>
	//*  29   51:icmpge          327
		{
			int j1 = ((Integer)lGSubrsUsed.get(l)).intValue();
	//   30   54:aload_0         
	//   31   55:getfield        #205 <Field ArrayList lGSubrsUsed>
	//   32   58:iload           4
	//   33   60:invokevirtual   #303 <Method Object ArrayList.get(int)>
	//   34   63:checkcast       #305 <Class Integer>
	//   35   66:invokevirtual   #308 <Method int Integer.intValue()>
	//   36   69:istore          6
			int i1 = j;
	//   37   71:iload_2         
	//   38   72:istore          5
			if(j1 < gsubrOffsets.length - 1)
	//*  39   74:iload           6
	//*  40   76:aload_0         
	//*  41   77:getfield        #356 <Field int[] gsubrOffsets>
	//*  42   80:arraylength     
	//*  43   81:iconst_1        
	//*  44   82:isub            
	//*  45   83:icmpge          151
			{
				i1 = j;
	//   46   86:iload_2         
	//   47   87:istore          5
				if(j1 >= 0)
	//*  48   89:iload           6
	//*  49   91:iflt            151
				{
					i1 = gsubrOffsets[j1];
	//   50   94:aload_0         
	//   51   95:getfield        #356 <Field int[] gsubrOffsets>
	//   52   98:iload           6
	//   53  100:iaload          
	//   54  101:istore          5
					j1 = gsubrOffsets[j1 + 1];
	//   55  103:aload_0         
	//   56  104:getfield        #356 <Field int[] gsubrOffsets>
	//   57  107:iload           6
	//   58  109:iconst_1        
	//   59  110:iadd            
	//   60  111:iaload          
	//   61  112:istore          6
					if(fonts[i].isCID)
	//*  62  114:aload_0         
	//*  63  115:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  64  118:iload_1         
	//*  65  119:aaload          
	//*  66  120:getfield        #274 <Field boolean CFFFont$Font.isCID>
	//*  67  123:ifeq            163
					{
						ReadASubr(i1, j1, GBias, 0, hGSubrsUsed, lGSubrsUsed, ((int []) (null)));
	//   68  126:aload_0         
	//   69  127:iload           5
	//   70  129:iload           6
	//   71  131:aload_0         
	//   72  132:getfield        #211 <Field int GBias>
	//   73  135:iconst_0        
	//   74  136:aload_0         
	//   75  137:getfield        #200 <Field HashMap hGSubrsUsed>
	//   76  140:aload_0         
	//   77  141:getfield        #205 <Field ArrayList lGSubrsUsed>
	//   78  144:aconst_null     
	//   79  145:invokevirtual   #360 <Method void ReadASubr(int, int, int, int, HashMap, ArrayList, int[])>
						i1 = j;
	//   80  148:iload_2         
	//   81  149:istore          5
					} else
	//*  82  151:iload           4
	//*  83  153:iconst_1        
	//*  84  154:iadd            
	//*  85  155:istore          4
	//*  86  157:iload           5
	//*  87  159:istore_2        
	//*  88  160:goto            42
					{
						ReadASubr(i1, j1, GBias, k, hSubrsUsedNonCID, lSubrsUsedNonCID, fonts[i].SubrsOffsets);
	//   89  163:aload_0         
	//   90  164:iload           5
	//   91  166:iload           6
	//   92  168:aload_0         
	//   93  169:getfield        #211 <Field int GBias>
	//   94  172:iload_3         
	//   95  173:aload_0         
	//   96  174:getfield        #207 <Field HashMap hSubrsUsedNonCID>
	//   97  177:aload_0         
	//   98  178:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//   99  181:aload_0         
	//  100  182:getfield        #228 <Field CFFFont$Font[] fonts>
	//  101  185:iload_1         
	//  102  186:aaload          
	//  103  187:getfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
	//  104  190:invokevirtual   #360 <Method void ReadASubr(int, int, int, int, HashMap, ArrayList, int[])>
						i1 = j;
	//  105  193:iload_2         
	//  106  194:istore          5
						if(j < lSubrsUsedNonCID.size())
	//* 107  196:iload_2         
	//* 108  197:aload_0         
	//* 109  198:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//* 110  201:invokevirtual   #300 <Method int ArrayList.size()>
	//* 111  204:icmpge          151
						{
							for(; j < lSubrsUsedNonCID.size(); j++)
	//* 112  207:iload_2         
	//* 113  208:aload_0         
	//* 114  209:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//* 115  212:invokevirtual   #300 <Method int ArrayList.size()>
	//* 116  215:icmpge          315
							{
								i1 = ((Integer)lSubrsUsedNonCID.get(j)).intValue();
	//  117  218:aload_0         
	//  118  219:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//  119  222:iload_2         
	//  120  223:invokevirtual   #303 <Method Object ArrayList.get(int)>
	//  121  226:checkcast       #305 <Class Integer>
	//  122  229:invokevirtual   #308 <Method int Integer.intValue()>
	//  123  232:istore          5
								if(i1 < fonts[i].SubrsOffsets.length - 1 && i1 >= 0)
	//* 124  234:iload           5
	//* 125  236:aload_0         
	//* 126  237:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 127  240:iload_1         
	//* 128  241:aaload          
	//* 129  242:getfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
	//* 130  245:arraylength     
	//* 131  246:iconst_1        
	//* 132  247:isub            
	//* 133  248:icmpge          308
	//* 134  251:iload           5
	//* 135  253:iflt            308
									ReadASubr(fonts[i].SubrsOffsets[i1], fonts[i].SubrsOffsets[i1 + 1], GBias, k, hSubrsUsedNonCID, lSubrsUsedNonCID, fonts[i].SubrsOffsets);
	//  136  256:aload_0         
	//  137  257:aload_0         
	//  138  258:getfield        #228 <Field CFFFont$Font[] fonts>
	//  139  261:iload_1         
	//  140  262:aaload          
	//  141  263:getfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
	//  142  266:iload           5
	//  143  268:iaload          
	//  144  269:aload_0         
	//  145  270:getfield        #228 <Field CFFFont$Font[] fonts>
	//  146  273:iload_1         
	//  147  274:aaload          
	//  148  275:getfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
	//  149  278:iload           5
	//  150  280:iconst_1        
	//  151  281:iadd            
	//  152  282:iaload          
	//  153  283:aload_0         
	//  154  284:getfield        #211 <Field int GBias>
	//  155  287:iload_3         
	//  156  288:aload_0         
	//  157  289:getfield        #207 <Field HashMap hSubrsUsedNonCID>
	//  158  292:aload_0         
	//  159  293:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//  160  296:aload_0         
	//  161  297:getfield        #228 <Field CFFFont$Font[] fonts>
	//  162  300:iload_1         
	//  163  301:aaload          
	//  164  302:getfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
	//  165  305:invokevirtual   #360 <Method void ReadASubr(int, int, int, int, HashMap, ArrayList, int[])>
							}

	//  166  308:iload_2         
	//  167  309:iconst_1        
	//  168  310:iadd            
	//  169  311:istore_2        
	//* 170  312:goto            207
							i1 = lSubrsUsedNonCID.size();
	//  171  315:aload_0         
	//  172  316:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//  173  319:invokevirtual   #300 <Method int ArrayList.size()>
	//  174  322:istore          5
						}
					}
				}
			}
			l++;
			j = i1;
		}
	//* 175  324:goto            151
	//  176  327:return          
	}

	protected void BuildIndexHeader(int i, int j, int k)
	{
		OutputList.addLast(((Object) (new CFFFont.UInt16Item((char)i))));
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field LinkedList OutputList>
	//    2    4:new             #369 <Class CFFFont$UInt16Item>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:int2char        
	//    6   10:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//    7   13:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item((char)j))));
	//    8   16:aload_0         
	//    9   17:getfield        #367 <Field LinkedList OutputList>
	//   10   20:new             #380 <Class CFFFont$UInt8Item>
	//   11   23:dup             
	//   12   24:iload_2         
	//   13   25:int2char        
	//   14   26:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   15   29:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		switch(j)
	//*  16   32:iload_2         
		{
	//*  17   33:tableswitch     1 4: default 64
	//	               1 65
	//	               2 82
	//	               3 99
	//	               4 116
		default:
			return;
	//   18   64:return          

		case 1: // '\001'
			OutputList.addLast(((Object) (new CFFFont.UInt8Item((char)k))));
	//   19   65:aload_0         
	//   20   66:getfield        #367 <Field LinkedList OutputList>
	//   21   69:new             #380 <Class CFFFont$UInt8Item>
	//   22   72:dup             
	//   23   73:iload_3         
	//   24   74:int2char        
	//   25   75:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   26   78:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			return;
	//   27   81:return          

		case 2: // '\002'
			OutputList.addLast(((Object) (new CFFFont.UInt16Item((char)k))));
	//   28   82:aload_0         
	//   29   83:getfield        #367 <Field LinkedList OutputList>
	//   30   86:new             #369 <Class CFFFont$UInt16Item>
	//   31   89:dup             
	//   32   90:iload_3         
	//   33   91:int2char        
	//   34   92:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//   35   95:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			return;
	//   36   98:return          

		case 3: // '\003'
			OutputList.addLast(((Object) (new CFFFont.UInt24Item(((int) ((char)k))))));
	//   37   99:aload_0         
	//   38  100:getfield        #367 <Field LinkedList OutputList>
	//   39  103:new             #383 <Class CFFFont$UInt24Item>
	//   40  106:dup             
	//   41  107:iload_3         
	//   42  108:int2char        
	//   43  109:invokespecial   #385 <Method void CFFFont$UInt24Item(int)>
	//   44  112:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			return;
	//   45  115:return          

		case 4: // '\004'
			OutputList.addLast(((Object) (new CFFFont.UInt32Item(((int) ((char)k))))));
	//   46  116:aload_0         
	//   47  117:getfield        #367 <Field LinkedList OutputList>
	//   48  120:new             #387 <Class CFFFont$UInt32Item>
	//   49  123:dup             
	//   50  124:iload_3         
	//   51  125:int2char        
	//   52  126:invokespecial   #388 <Method void CFFFont$UInt32Item(int)>
	//   53  129:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			break;
		}
	//   54  132:return          
	}

	protected void BuildNewCharString(int i)
		throws IOException
	{
		NewCharStringsIndex = BuildNewIndex(fonts[i].charstringsOffsets, GlyphsUsed, (byte)14);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #228 <Field CFFFont$Font[] fonts>
	//    4    6:iload_1         
	//    5    7:aaload          
	//    6    8:getfield        #261 <Field int[] CFFFont$Font.charstringsOffsets>
	//    7   11:aload_0         
	//    8   12:getfield        #215 <Field HashMap GlyphsUsed>
	//    9   15:bipush          14
	//   10   17:invokevirtual   #395 <Method byte[] BuildNewIndex(int[], HashMap, byte)>
	//   11   20:putfield        #397 <Field byte[] NewCharStringsIndex>
	//   12   23:return          
	}

	protected byte[] BuildNewFile(int i)
	{
		OutputList = new LinkedList();
	//    0    0:aload_0         
	//    1    1:new             #374 <Class LinkedList>
	//    2    4:dup             
	//    3    5:invokespecial   #401 <Method void LinkedList()>
	//    4    8:putfield        #367 <Field LinkedList OutputList>
		CopyHeader();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #404 <Method void CopyHeader()>
		BuildIndexHeader(1, 1, 1);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:iconst_1        
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #406 <Method void BuildIndexHeader(int, int, int)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item((char)(fonts[i].name.length() + 1)))));
	//   12   22:aload_0         
	//   13   23:getfield        #367 <Field LinkedList OutputList>
	//   14   26:new             #380 <Class CFFFont$UInt8Item>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #228 <Field CFFFont$Font[] fonts>
	//   18   34:iload_1         
	//   19   35:aaload          
	//   20   36:getfield        #409 <Field String CFFFont$Font.name>
	//   21   39:invokevirtual   #412 <Method int String.length()>
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:int2char        
	//   25   45:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   26   48:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.StringItem(fonts[i].name))));
	//   27   51:aload_0         
	//   28   52:getfield        #367 <Field LinkedList OutputList>
	//   29   55:new             #414 <Class CFFFont$StringItem>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:getfield        #228 <Field CFFFont$Font[] fonts>
	//   33   63:iload_1         
	//   34   64:aaload          
	//   35   65:getfield        #409 <Field String CFFFont$Font.name>
	//   36   68:invokespecial   #417 <Method void CFFFont$StringItem(String)>
	//   37   71:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		BuildIndexHeader(1, 2, 1);
	//   38   74:aload_0         
	//   39   75:iconst_1        
	//   40   76:iconst_2        
	//   41   77:iconst_1        
	//   42   78:invokevirtual   #406 <Method void BuildIndexHeader(int, int, int)>
		CFFFont.IndexOffsetItem indexoffsetitem = new CFFFont.IndexOffsetItem(2);
	//   43   81:new             #419 <Class CFFFont$IndexOffsetItem>
	//   44   84:dup             
	//   45   85:iconst_2        
	//   46   86:invokespecial   #420 <Method void CFFFont$IndexOffsetItem(int)>
	//   47   89:astore          6
		OutputList.addLast(((Object) (indexoffsetitem)));
	//   48   91:aload_0         
	//   49   92:getfield        #367 <Field LinkedList OutputList>
	//   50   95:aload           6
	//   51   97:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		CFFFont.IndexBaseItem indexbaseitem1 = new CFFFont.IndexBaseItem();
	//   52  100:new             #422 <Class CFFFont$IndexBaseItem>
	//   53  103:dup             
	//   54  104:invokespecial   #423 <Method void CFFFont$IndexBaseItem()>
	//   55  107:astore          7
		OutputList.addLast(((Object) (indexbaseitem1)));
	//   56  109:aload_0         
	//   57  110:getfield        #367 <Field LinkedList OutputList>
	//   58  113:aload           7
	//   59  115:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		CFFFont.DictOffsetItem dictoffsetitem1 = new CFFFont.DictOffsetItem();
	//   60  118:new             #425 <Class CFFFont$DictOffsetItem>
	//   61  121:dup             
	//   62  122:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//   63  125:astore          8
		CFFFont.DictOffsetItem dictoffsetitem = new CFFFont.DictOffsetItem();
	//   64  127:new             #425 <Class CFFFont$DictOffsetItem>
	//   65  130:dup             
	//   66  131:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//   67  134:astore          4
		CFFFont.DictOffsetItem dictoffsetitem2 = new CFFFont.DictOffsetItem();
	//   68  136:new             #425 <Class CFFFont$DictOffsetItem>
	//   69  139:dup             
	//   70  140:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//   71  143:astore          9
		CFFFont.DictOffsetItem dictoffsetitem3 = new CFFFont.DictOffsetItem();
	//   72  145:new             #425 <Class CFFFont$DictOffsetItem>
	//   73  148:dup             
	//   74  149:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//   75  152:astore          10
		Object obj = ((Object) (new CFFFont.DictOffsetItem()));
	//   76  154:new             #425 <Class CFFFont$DictOffsetItem>
	//   77  157:dup             
	//   78  158:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//   79  161:astore          5
		if(!fonts[i].isCID)
	//*  80  163:aload_0         
	//*  81  164:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  82  167:iload_1         
	//*  83  168:aaload          
	//*  84  169:getfield        #274 <Field boolean CFFFont$Font.isCID>
	//*  85  172:ifne            325
		{
			OutputList.addLast(((Object) (new CFFFont.DictNumberItem(fonts[i].nstrings))));
	//   86  175:aload_0         
	//   87  176:getfield        #367 <Field LinkedList OutputList>
	//   88  179:new             #428 <Class CFFFont$DictNumberItem>
	//   89  182:dup             
	//   90  183:aload_0         
	//   91  184:getfield        #228 <Field CFFFont$Font[] fonts>
	//   92  187:iload_1         
	//   93  188:aaload          
	//   94  189:getfield        #253 <Field int CFFFont$Font.nstrings>
	//   95  192:invokespecial   #429 <Method void CFFFont$DictNumberItem(int)>
	//   96  195:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			OutputList.addLast(((Object) (new CFFFont.DictNumberItem(fonts[i].nstrings + 1))));
	//   97  198:aload_0         
	//   98  199:getfield        #367 <Field LinkedList OutputList>
	//   99  202:new             #428 <Class CFFFont$DictNumberItem>
	//  100  205:dup             
	//  101  206:aload_0         
	//  102  207:getfield        #228 <Field CFFFont$Font[] fonts>
	//  103  210:iload_1         
	//  104  211:aaload          
	//  105  212:getfield        #253 <Field int CFFFont$Font.nstrings>
	//  106  215:iconst_1        
	//  107  216:iadd            
	//  108  217:invokespecial   #429 <Method void CFFFont$DictNumberItem(int)>
	//  109  220:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			OutputList.addLast(((Object) (new CFFFont.DictNumberItem(0))));
	//  110  223:aload_0         
	//  111  224:getfield        #367 <Field LinkedList OutputList>
	//  112  227:new             #428 <Class CFFFont$DictNumberItem>
	//  113  230:dup             
	//  114  231:iconst_0        
	//  115  232:invokespecial   #429 <Method void CFFFont$DictNumberItem(int)>
	//  116  235:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			OutputList.addLast(((Object) (new CFFFont.UInt8Item('\f'))));
	//  117  238:aload_0         
	//  118  239:getfield        #367 <Field LinkedList OutputList>
	//  119  242:new             #380 <Class CFFFont$UInt8Item>
	//  120  245:dup             
	//  121  246:bipush          12
	//  122  248:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//  123  251:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			OutputList.addLast(((Object) (new CFFFont.UInt8Item('\036'))));
	//  124  254:aload_0         
	//  125  255:getfield        #367 <Field LinkedList OutputList>
	//  126  258:new             #380 <Class CFFFont$UInt8Item>
	//  127  261:dup             
	//  128  262:bipush          30
	//  129  264:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//  130  267:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			OutputList.addLast(((Object) (new CFFFont.DictNumberItem(fonts[i].nglyphs))));
	//  131  270:aload_0         
	//  132  271:getfield        #367 <Field LinkedList OutputList>
	//  133  274:new             #428 <Class CFFFont$DictNumberItem>
	//  134  277:dup             
	//  135  278:aload_0         
	//  136  279:getfield        #228 <Field CFFFont$Font[] fonts>
	//  137  282:iload_1         
	//  138  283:aaload          
	//  139  284:getfield        #244 <Field int CFFFont$Font.nglyphs>
	//  140  287:invokespecial   #429 <Method void CFFFont$DictNumberItem(int)>
	//  141  290:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			OutputList.addLast(((Object) (new CFFFont.UInt8Item('\f'))));
	//  142  293:aload_0         
	//  143  294:getfield        #367 <Field LinkedList OutputList>
	//  144  297:new             #380 <Class CFFFont$UInt8Item>
	//  145  300:dup             
	//  146  301:bipush          12
	//  147  303:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//  148  306:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			OutputList.addLast(((Object) (new CFFFont.UInt8Item('"'))));
	//  149  309:aload_0         
	//  150  310:getfield        #367 <Field LinkedList OutputList>
	//  151  313:new             #380 <Class CFFFont$UInt8Item>
	//  152  316:dup             
	//  153  317:bipush          34
	//  154  319:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//  155  322:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		}
		seek(topdictOffsets[i]);
	//  156  325:aload_0         
	//  157  326:aload_0         
	//  158  327:getfield        #432 <Field int[] topdictOffsets>
	//  159  330:iload_1         
	//  160  331:iaload          
	//  161  332:invokevirtual   #237 <Method void seek(int)>
		do
		{
			if(getPosition() >= topdictOffsets[i + 1])
				break;
	//  162  335:aload_0         
	//  163  336:invokevirtual   #326 <Method int getPosition()>
	//  164  339:aload_0         
	//  165  340:getfield        #432 <Field int[] topdictOffsets>
	//  166  343:iload_1         
	//  167  344:iconst_1        
	//  168  345:iadd            
	//  169  346:iaload          
	//  170  347:icmpge          450
			int j = getPosition();
	//  171  350:aload_0         
	//  172  351:invokevirtual   #326 <Method int getPosition()>
	//  173  354:istore_2        
			getDictItem();
	//  174  355:aload_0         
	//  175  356:invokevirtual   #332 <Method void getDictItem()>
			int k = getPosition();
	//  176  359:aload_0         
	//  177  360:invokevirtual   #326 <Method int getPosition()>
	//  178  363:istore_3        
			if(key != "Encoding" && key != "Private" && key != "FDSelect" && key != "FDArray" && key != "charset" && key != "CharStrings")
	//* 179  364:aload_0         
	//* 180  365:getfield        #336 <Field String key>
	//* 181  368:ldc2            #434 <String "Encoding">
	//* 182  371:if_acmpeq       335
	//* 183  374:aload_0         
	//* 184  375:getfield        #336 <Field String key>
	//* 185  378:ldc2            #436 <String "Private">
	//* 186  381:if_acmpeq       335
	//* 187  384:aload_0         
	//* 188  385:getfield        #336 <Field String key>
	//* 189  388:ldc2            #437 <String "FDSelect">
	//* 190  391:if_acmpeq       335
	//* 191  394:aload_0         
	//* 192  395:getfield        #336 <Field String key>
	//* 193  398:ldc2            #439 <String "FDArray">
	//* 194  401:if_acmpeq       335
	//* 195  404:aload_0         
	//* 196  405:getfield        #336 <Field String key>
	//* 197  408:ldc2            #441 <String "charset">
	//* 198  411:if_acmpeq       335
	//* 199  414:aload_0         
	//* 200  415:getfield        #336 <Field String key>
	//* 201  418:ldc2            #443 <String "CharStrings">
	//* 202  421:if_acmpeq       335
				OutputList.add(((Object) (new CFFFont.RangeItem(buf, j, k - j))));
	//  203  424:aload_0         
	//  204  425:getfield        #367 <Field LinkedList OutputList>
	//  205  428:new             #445 <Class CFFFont$RangeItem>
	//  206  431:dup             
	//  207  432:aload_0         
	//  208  433:getfield        #449 <Field RandomAccessFileOrArray buf>
	//  209  436:iload_2         
	//  210  437:iload_3         
	//  211  438:iload_2         
	//  212  439:isub            
	//  213  440:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//  214  443:invokevirtual   #453 <Method boolean LinkedList.add(Object)>
	//  215  446:pop             
		} while(true);
	//  216  447:goto            335
		CreateKeys(((CFFFont.OffsetItem) (dictoffsetitem2)), ((CFFFont.OffsetItem) (dictoffsetitem3)), ((CFFFont.OffsetItem) (dictoffsetitem1)), ((CFFFont.OffsetItem) (dictoffsetitem)));
	//  217  450:aload_0         
	//  218  451:aload           9
	//  219  453:aload           10
	//  220  455:aload           8
	//  221  457:aload           4
	//  222  459:invokevirtual   #457 <Method void CreateKeys(CFFFont$OffsetItem, CFFFont$OffsetItem, CFFFont$OffsetItem, CFFFont$OffsetItem)>
		OutputList.addLast(((Object) (new CFFFont.IndexMarkerItem(((CFFFont.OffsetItem) (indexoffsetitem)), indexbaseitem1))));
	//  223  462:aload_0         
	//  224  463:getfield        #367 <Field LinkedList OutputList>
	//  225  466:new             #459 <Class CFFFont$IndexMarkerItem>
	//  226  469:dup             
	//  227  470:aload           6
	//  228  472:aload           7
	//  229  474:invokespecial   #462 <Method void CFFFont$IndexMarkerItem(CFFFont$OffsetItem, CFFFont$IndexBaseItem)>
	//  230  477:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		int ai[];
		if(fonts[i].isCID)
	//* 231  480:aload_0         
	//* 232  481:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 233  484:iload_1         
	//* 234  485:aaload          
	//* 235  486:getfield        #274 <Field boolean CFFFont$Font.isCID>
	//* 236  489:ifeq            864
			OutputList.addLast(((Object) (getEntireIndexRange(stringIndexOffset))));
	//  237  492:aload_0         
	//  238  493:getfield        #367 <Field LinkedList OutputList>
	//  239  496:aload_0         
	//  240  497:aload_0         
	//  241  498:getfield        #247 <Field int stringIndexOffset>
	//  242  501:invokevirtual   #466 <Method CFFFont$RangeItem getEntireIndexRange(int)>
	//  243  504:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		else
	//* 244  507:aload_0         
	//* 245  508:getfield        #367 <Field LinkedList OutputList>
	//* 246  511:new             #445 <Class CFFFont$RangeItem>
	//* 247  514:dup             
	//* 248  515:new             #468 <Class RandomAccessFileOrArray>
	//* 249  518:dup             
	//* 250  519:aload_0         
	//* 251  520:getfield        #470 <Field byte[] NewGSubrsIndex>
	//* 252  523:invokespecial   #473 <Method void RandomAccessFileOrArray(byte[])>
	//* 253  526:iconst_0        
	//* 254  527:aload_0         
	//* 255  528:getfield        #470 <Field byte[] NewGSubrsIndex>
	//* 256  531:arraylength     
	//* 257  532:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//* 258  535:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 259  538:aload_0         
	//* 260  539:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 261  542:iload_1         
	//* 262  543:aaload          
	//* 263  544:getfield        #274 <Field boolean CFFFont$Font.isCID>
	//* 264  547:ifeq            902
	//* 265  550:aload_0         
	//* 266  551:getfield        #367 <Field LinkedList OutputList>
	//* 267  554:new             #475 <Class CFFFont$MarkerItem>
	//* 268  557:dup             
	//* 269  558:aload           10
	//* 270  560:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//* 271  563:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 272  566:aload_0         
	//* 273  567:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 274  570:iload_1         
	//* 275  571:aaload          
	//* 276  572:getfield        #264 <Field int CFFFont$Font.fdselectOffset>
	//* 277  575:iflt            872
	//* 278  578:aload_0         
	//* 279  579:getfield        #367 <Field LinkedList OutputList>
	//* 280  582:new             #445 <Class CFFFont$RangeItem>
	//* 281  585:dup             
	//* 282  586:aload_0         
	//* 283  587:getfield        #449 <Field RandomAccessFileOrArray buf>
	//* 284  590:aload_0         
	//* 285  591:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 286  594:iload_1         
	//* 287  595:aaload          
	//* 288  596:getfield        #264 <Field int CFFFont$Font.fdselectOffset>
	//* 289  599:aload_0         
	//* 290  600:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 291  603:iload_1         
	//* 292  604:aaload          
	//* 293  605:getfield        #481 <Field int CFFFont$Font.FDSelectLength>
	//* 294  608:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//* 295  611:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 296  614:aload_0         
	//* 297  615:getfield        #367 <Field LinkedList OutputList>
	//* 298  618:new             #475 <Class CFFFont$MarkerItem>
	//* 299  621:dup             
	//* 300  622:aload           8
	//* 301  624:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//* 302  627:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 303  630:aload_0         
	//* 304  631:getfield        #367 <Field LinkedList OutputList>
	//* 305  634:new             #445 <Class CFFFont$RangeItem>
	//* 306  637:dup             
	//* 307  638:aload_0         
	//* 308  639:getfield        #449 <Field RandomAccessFileOrArray buf>
	//* 309  642:aload_0         
	//* 310  643:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 311  646:iload_1         
	//* 312  647:aaload          
	//* 313  648:getfield        #280 <Field int CFFFont$Font.charsetOffset>
	//* 314  651:aload_0         
	//* 315  652:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 316  655:iload_1         
	//* 317  656:aaload          
	//* 318  657:getfield        #287 <Field int CFFFont$Font.CharsetLength>
	//* 319  660:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//* 320  663:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 321  666:aload_0         
	//* 322  667:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 323  670:iload_1         
	//* 324  671:aaload          
	//* 325  672:getfield        #484 <Field int CFFFont$Font.fdarrayOffset>
	//* 326  675:iflt            890
	//* 327  678:aload_0         
	//* 328  679:getfield        #367 <Field LinkedList OutputList>
	//* 329  682:new             #475 <Class CFFFont$MarkerItem>
	//* 330  685:dup             
	//* 331  686:aload           9
	//* 332  688:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//* 333  691:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 334  694:aload_0         
	//* 335  695:iload_1         
	//* 336  696:invokevirtual   #487 <Method void Reconstruct(int)>
	//* 337  699:aload_0         
	//* 338  700:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 339  703:iload_1         
	//* 340  704:aaload          
	//* 341  705:getfield        #490 <Field int CFFFont$Font.privateOffset>
	//* 342  708:iflt            770
	//* 343  711:new             #422 <Class CFFFont$IndexBaseItem>
	//* 344  714:dup             
	//* 345  715:invokespecial   #423 <Method void CFFFont$IndexBaseItem()>
	//* 346  718:astore          6
	//* 347  720:aload_0         
	//* 348  721:getfield        #367 <Field LinkedList OutputList>
	//* 349  724:aload           6
	//* 350  726:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 351  729:aload_0         
	//* 352  730:getfield        #367 <Field LinkedList OutputList>
	//* 353  733:new             #475 <Class CFFFont$MarkerItem>
	//* 354  736:dup             
	//* 355  737:aload           5
	//* 356  739:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//* 357  742:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 358  745:new             #425 <Class CFFFont$DictOffsetItem>
	//* 359  748:dup             
	//* 360  749:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//* 361  752:astore          5
	//* 362  754:aload_0         
	//* 363  755:iload_1         
	//* 364  756:aload           5
	//* 365  758:invokevirtual   #494 <Method void CreateNonCIDPrivate(int, CFFFont$OffsetItem)>
	//* 366  761:aload_0         
	//* 367  762:iload_1         
	//* 368  763:aload           6
	//* 369  765:aload           5
	//* 370  767:invokevirtual   #498 <Method void CreateNonCIDSubrs(int, CFFFont$IndexBaseItem, CFFFont$OffsetItem)>
	//* 371  770:aload_0         
	//* 372  771:getfield        #367 <Field LinkedList OutputList>
	//* 373  774:new             #475 <Class CFFFont$MarkerItem>
	//* 374  777:dup             
	//* 375  778:aload           4
	//* 376  780:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//* 377  783:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 378  786:aload_0         
	//* 379  787:getfield        #367 <Field LinkedList OutputList>
	//* 380  790:new             #445 <Class CFFFont$RangeItem>
	//* 381  793:dup             
	//* 382  794:new             #468 <Class RandomAccessFileOrArray>
	//* 383  797:dup             
	//* 384  798:aload_0         
	//* 385  799:getfield        #397 <Field byte[] NewCharStringsIndex>
	//* 386  802:invokespecial   #473 <Method void RandomAccessFileOrArray(byte[])>
	//* 387  805:iconst_0        
	//* 388  806:aload_0         
	//* 389  807:getfield        #397 <Field byte[] NewCharStringsIndex>
	//* 390  810:arraylength     
	//* 391  811:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//* 392  814:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 393  817:iconst_1        
	//* 394  818:newarray        int[]
	//* 395  820:astore          4
	//* 396  822:aload           4
	//* 397  824:iconst_0        
	//* 398  825:iconst_0        
	//* 399  826:iastore         
	//* 400  827:aload_0         
	//* 401  828:getfield        #367 <Field LinkedList OutputList>
	//* 402  831:invokevirtual   #502 <Method Iterator LinkedList.iterator()>
	//* 403  834:astore          5
	//* 404  836:aload           5
	//* 405  838:invokeinterface #508 <Method boolean Iterator.hasNext()>
	//* 406  843:ifeq            944
	//* 407  846:aload           5
	//* 408  848:invokeinterface #512 <Method Object Iterator.next()>
	//* 409  853:checkcast       #514 <Class CFFFont$Item>
	//* 410  856:aload           4
	//* 411  858:invokevirtual   #518 <Method void CFFFont$Item.increment(int[])>
	//* 412  861:goto            836
			CreateNewStringIndex(i);
	//  413  864:aload_0         
	//  414  865:iload_1         
	//  415  866:invokevirtual   #521 <Method void CreateNewStringIndex(int)>
		OutputList.addLast(((Object) (new CFFFont.RangeItem(new RandomAccessFileOrArray(NewGSubrsIndex), 0, NewGSubrsIndex.length))));
		if(fonts[i].isCID)
		{
			OutputList.addLast(((Object) (new CFFFont.MarkerItem(((CFFFont.OffsetItem) (dictoffsetitem3))))));
			CFFFont.IndexBaseItem indexbaseitem;
			if(fonts[i].fdselectOffset >= 0)
				OutputList.addLast(((Object) (new CFFFont.RangeItem(buf, fonts[i].fdselectOffset, fonts[i].FDSelectLength))));
			else
	//* 416  869:goto            507
				CreateFDSelect(((CFFFont.OffsetItem) (dictoffsetitem3)), fonts[i].nglyphs);
	//  417  872:aload_0         
	//  418  873:aload           10
	//  419  875:aload_0         
	//  420  876:getfield        #228 <Field CFFFont$Font[] fonts>
	//  421  879:iload_1         
	//  422  880:aaload          
	//  423  881:getfield        #244 <Field int CFFFont$Font.nglyphs>
	//  424  884:invokevirtual   #525 <Method void CreateFDSelect(CFFFont$OffsetItem, int)>
			OutputList.addLast(((Object) (new CFFFont.MarkerItem(((CFFFont.OffsetItem) (dictoffsetitem1))))));
			OutputList.addLast(((Object) (new CFFFont.RangeItem(buf, fonts[i].charsetOffset, fonts[i].CharsetLength))));
			if(fonts[i].fdarrayOffset >= 0)
			{
				OutputList.addLast(((Object) (new CFFFont.MarkerItem(((CFFFont.OffsetItem) (dictoffsetitem2))))));
				Reconstruct(i);
			} else
	//* 425  887:goto            614
			{
				CreateFDArray(((CFFFont.OffsetItem) (dictoffsetitem2)), ((CFFFont.OffsetItem) (obj)), i);
	//  426  890:aload_0         
	//  427  891:aload           9
	//  428  893:aload           5
	//  429  895:iload_1         
	//  430  896:invokevirtual   #529 <Method void CreateFDArray(CFFFont$OffsetItem, CFFFont$OffsetItem, int)>
			}
		} else
	//* 431  899:goto            699
		{
			CreateFDSelect(((CFFFont.OffsetItem) (dictoffsetitem3)), fonts[i].nglyphs);
	//  432  902:aload_0         
	//  433  903:aload           10
	//  434  905:aload_0         
	//  435  906:getfield        #228 <Field CFFFont$Font[] fonts>
	//  436  909:iload_1         
	//  437  910:aaload          
	//  438  911:getfield        #244 <Field int CFFFont$Font.nglyphs>
	//  439  914:invokevirtual   #525 <Method void CreateFDSelect(CFFFont$OffsetItem, int)>
			CreateCharset(((CFFFont.OffsetItem) (dictoffsetitem1)), fonts[i].nglyphs);
	//  440  917:aload_0         
	//  441  918:aload           8
	//  442  920:aload_0         
	//  443  921:getfield        #228 <Field CFFFont$Font[] fonts>
	//  444  924:iload_1         
	//  445  925:aaload          
	//  446  926:getfield        #244 <Field int CFFFont$Font.nglyphs>
	//  447  929:invokevirtual   #532 <Method void CreateCharset(CFFFont$OffsetItem, int)>
			CreateFDArray(((CFFFont.OffsetItem) (dictoffsetitem2)), ((CFFFont.OffsetItem) (obj)), i);
	//  448  932:aload_0         
	//  449  933:aload           9
	//  450  935:aload           5
	//  451  937:iload_1         
	//  452  938:invokevirtual   #529 <Method void CreateFDArray(CFFFont$OffsetItem, CFFFont$OffsetItem, int)>
		}
		if(fonts[i].privateOffset >= 0)
		{
			indexbaseitem = new CFFFont.IndexBaseItem();
			OutputList.addLast(((Object) (indexbaseitem)));
			OutputList.addLast(((Object) (new CFFFont.MarkerItem(((CFFFont.OffsetItem) (obj))))));
			obj = ((Object) (new CFFFont.DictOffsetItem()));
			CreateNonCIDPrivate(i, ((CFFFont.OffsetItem) (obj)));
			CreateNonCIDSubrs(i, indexbaseitem, ((CFFFont.OffsetItem) (obj)));
		}
		OutputList.addLast(((Object) (new CFFFont.MarkerItem(((CFFFont.OffsetItem) (dictoffsetitem))))));
		OutputList.addLast(((Object) (new CFFFont.RangeItem(new RandomAccessFileOrArray(NewCharStringsIndex), 0, NewCharStringsIndex.length))));
		ai = new int[1];
		ai[0] = 0;
		for(obj = ((Object) (OutputList.iterator())); ((Iterator) (obj)).hasNext(); ((CFFFont.Item)((Iterator) (obj)).next()).increment(ai));
	//* 453  941:goto            699
		for(Iterator iterator = OutputList.iterator(); iterator.hasNext(); ((CFFFont.Item)iterator.next()).xref());
	//  454  944:aload_0         
	//  455  945:getfield        #367 <Field LinkedList OutputList>
	//  456  948:invokevirtual   #502 <Method Iterator LinkedList.iterator()>
	//  457  951:astore          5
	//  458  953:aload           5
	//  459  955:invokeinterface #508 <Method boolean Iterator.hasNext()>
	//  460  960:ifeq            979
	//  461  963:aload           5
	//  462  965:invokeinterface #512 <Method Object Iterator.next()>
	//  463  970:checkcast       #514 <Class CFFFont$Item>
	//  464  973:invokevirtual   #535 <Method void CFFFont$Item.xref()>
	//* 465  976:goto            953
		ai = ((int []) (new byte[ai[0]]));
	//  466  979:aload           4
	//  467  981:iconst_0        
	//  468  982:iaload          
	//  469  983:newarray        byte[]
	//  470  985:astore          4
		for(Iterator iterator1 = OutputList.iterator(); iterator1.hasNext(); ((CFFFont.Item)iterator1.next()).emit(((byte []) (ai))));
	//  471  987:aload_0         
	//  472  988:getfield        #367 <Field LinkedList OutputList>
	//  473  991:invokevirtual   #502 <Method Iterator LinkedList.iterator()>
	//  474  994:astore          5
	//  475  996:aload           5
	//  476  998:invokeinterface #508 <Method boolean Iterator.hasNext()>
	//  477 1003:ifeq            1024
	//  478 1006:aload           5
	//  479 1008:invokeinterface #512 <Method Object Iterator.next()>
	//  480 1013:checkcast       #514 <Class CFFFont$Item>
	//  481 1016:aload           4
	//  482 1018:invokevirtual   #538 <Method void CFFFont$Item.emit(byte[])>
	//* 483 1021:goto            996
		return ((byte []) (ai));
	//  484 1024:aload           4
	//  485 1026:areturn         
	}

	protected byte[] BuildNewIndex(int ai[], HashMap hashmap, byte byte0)
		throws IOException
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int j = 0;
	//    2    3:iconst_0        
	//    3    4:istore          5
		int ai1[] = new int[ai.length];
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:newarray        int[]
	//    7   10:astore          8
		int i = 0;
	//    8   12:iconst_0        
	//    9   13:istore          4
		while(i < ai.length) 
	//*  10   15:iload           4
	//*  11   17:aload_1         
	//*  12   18:arraylength     
	//*  13   19:icmpge          75
		{
			ai1[i] = j;
	//   14   22:aload           8
	//   15   24:iload           4
	//   16   26:iload           5
	//   17   28:iastore         
			if(hashmap.containsKey(((Object) (Integer.valueOf(i)))))
	//*  18   29:aload_2         
	//*  19   30:iload           4
	//*  20   32:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//*  21   35:invokevirtual   #541 <Method boolean HashMap.containsKey(Object)>
	//*  22   38:ifeq            66
				j += ai[i + 1] - ai[i];
	//   23   41:iload           5
	//   24   43:aload_1         
	//   25   44:iload           4
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:iaload          
	//   29   49:aload_1         
	//   30   50:iload           4
	//   31   52:iaload          
	//   32   53:isub            
	//   33   54:iadd            
	//   34   55:istore          5
			else
	//*  35   57:iload           4
	//*  36   59:iconst_1        
	//*  37   60:iadd            
	//*  38   61:istore          4
	//*  39   63:goto            15
				k++;
	//   40   66:iload           6
	//   41   68:iconst_1        
	//   42   69:iadd            
	//   43   70:istore          6
			i++;
		}
	//*  44   72:goto            57
		hashmap = ((HashMap) (new byte[j + k]));
	//   45   75:iload           5
	//   46   77:iload           6
	//   47   79:iadd            
	//   48   80:newarray        byte[]
	//   49   82:astore_2        
		j = 0;
	//   50   83:iconst_0        
	//   51   84:istore          5
		i = 0;
	//   52   86:iconst_0        
	//   53   87:istore          4
		while(i < ai.length - 1) 
	//*  54   89:iload           4
	//*  55   91:aload_1         
	//*  56   92:arraylength     
	//*  57   93:iconst_1        
	//*  58   94:isub            
	//*  59   95:icmpge          187
		{
			int l = ai1[i];
	//   60   98:aload           8
	//   61  100:iload           4
	//   62  102:iaload          
	//   63  103:istore          6
			int i1 = ai1[i + 1];
	//   64  105:aload           8
	//   65  107:iload           4
	//   66  109:iconst_1        
	//   67  110:iadd            
	//   68  111:iaload          
	//   69  112:istore          7
			ai1[i] = l + j;
	//   70  114:aload           8
	//   71  116:iload           4
	//   72  118:iload           6
	//   73  120:iload           5
	//   74  122:iadd            
	//   75  123:iastore         
			if(l != i1)
	//*  76  124:iload           6
	//*  77  126:iload           7
	//*  78  128:icmpeq          170
			{
				buf.seek(ai[i]);
	//   79  131:aload_0         
	//   80  132:getfield        #449 <Field RandomAccessFileOrArray buf>
	//   81  135:aload_1         
	//   82  136:iload           4
	//   83  138:iaload          
	//   84  139:i2l             
	//   85  140:invokevirtual   #544 <Method void RandomAccessFileOrArray.seek(long)>
				buf.readFully(((byte []) (hashmap)), l + j, i1 - l);
	//   86  143:aload_0         
	//   87  144:getfield        #449 <Field RandomAccessFileOrArray buf>
	//   88  147:aload_2         
	//   89  148:iload           6
	//   90  150:iload           5
	//   91  152:iadd            
	//   92  153:iload           7
	//   93  155:iload           6
	//   94  157:isub            
	//   95  158:invokevirtual   #548 <Method void RandomAccessFileOrArray.readFully(byte[], int, int)>
			} else
	//*  96  161:iload           4
	//*  97  163:iconst_1        
	//*  98  164:iadd            
	//*  99  165:istore          4
	//* 100  167:goto            89
			{
				hashmap[l + j] = byte0;
	//  101  170:aload_2         
	//  102  171:iload           6
	//  103  173:iload           5
	//  104  175:iadd            
	//  105  176:iload_3         
	//  106  177:bastore         
				j++;
	//  107  178:iload           5
	//  108  180:iconst_1        
	//  109  181:iadd            
	//  110  182:istore          5
			}
			i++;
		}
	//* 111  184:goto            161
		i = ai.length - 1;
	//  112  187:aload_1         
	//  113  188:arraylength     
	//  114  189:iconst_1        
	//  115  190:isub            
	//  116  191:istore          4
		ai1[i] = ai1[i] + j;
	//  117  193:aload           8
	//  118  195:iload           4
	//  119  197:aload           8
	//  120  199:iload           4
	//  121  201:iaload          
	//  122  202:iload           5
	//  123  204:iadd            
	//  124  205:iastore         
		return AssembleIndex(ai1, ((byte []) (hashmap)));
	//  125  206:aload_0         
	//  126  207:aload           8
	//  127  209:aload_2         
	//  128  210:invokevirtual   #550 <Method byte[] AssembleIndex(int[], byte[])>
	//  129  213:areturn         
	}

	protected void BuildNewLGSubrs(int i)
		throws IOException
	{
		if(fonts[i].isCID)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field CFFFont$Font[] fonts>
	//*   2    4:iload_1         
	//*   3    5:aaload          
	//*   4    6:getfield        #274 <Field boolean CFFFont$Font.isCID>
	//*   5    9:ifeq            265
		{
			hSubrsUsed = new HashMap[fonts[i].fdprivateOffsets.length];
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #228 <Field CFFFont$Font[] fonts>
	//    9   17:iload_1         
	//   10   18:aaload          
	//   11   19:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   12   22:arraylength     
	//   13   23:anewarray       HashMap[]
	//   14   26:putfield        #554 <Field HashMap[] hSubrsUsed>
			lSubrsUsed = new ArrayList[fonts[i].fdprivateOffsets.length];
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #228 <Field CFFFont$Font[] fonts>
	//   18   34:iload_1         
	//   19   35:aaload          
	//   20   36:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   21   39:arraylength     
	//   22   40:anewarray       ArrayList[]
	//   23   43:putfield        #556 <Field ArrayList[] lSubrsUsed>
			NewLSubrsIndex = new byte[fonts[i].fdprivateOffsets.length][];
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #228 <Field CFFFont$Font[] fonts>
	//   27   51:iload_1         
	//   28   52:aaload          
	//   29   53:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   30   56:arraylength     
	//   31   57:anewarray       byte[][]
	//   32   60:putfield        #559 <Field byte[][] NewLSubrsIndex>
			fonts[i].PrivateSubrsOffset = new int[fonts[i].fdprivateOffsets.length];
	//   33   63:aload_0         
	//   34   64:getfield        #228 <Field CFFFont$Font[] fonts>
	//   35   67:iload_1         
	//   36   68:aaload          
	//   37   69:aload_0         
	//   38   70:getfield        #228 <Field CFFFont$Font[] fonts>
	//   39   73:iload_1         
	//   40   74:aaload          
	//   41   75:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   42   78:arraylength     
	//   43   79:newarray        int[]
	//   44   81:putfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
			fonts[i].PrivateSubrsOffsetsArray = new int[fonts[i].fdprivateOffsets.length][];
	//   45   84:aload_0         
	//   46   85:getfield        #228 <Field CFFFont$Font[] fonts>
	//   47   88:iload_1         
	//   48   89:aaload          
	//   49   90:aload_0         
	//   50   91:getfield        #228 <Field CFFFont$Font[] fonts>
	//   51   94:iload_1         
	//   52   95:aaload          
	//   53   96:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   54   99:arraylength     
	//   55  100:anewarray       int[][]
	//   56  103:putfield        #346 <Field int[][] CFFFont$Font.PrivateSubrsOffsetsArray>
			ArrayList arraylist = new ArrayList(((java.util.Collection) (FDArrayUsed)));
	//   57  106:new             #202 <Class ArrayList>
	//   58  109:dup             
	//   59  110:aload_0         
	//   60  111:getfield        #195 <Field HashSet FDArrayUsed>
	//   61  114:invokespecial   #222 <Method void ArrayList(java.util.Collection)>
	//   62  117:astore          4
			for(int j = 0; j < arraylist.size(); j++)
	//*  63  119:iconst_0        
	//*  64  120:istore_2        
	//*  65  121:iload_2         
	//*  66  122:aload           4
	//*  67  124:invokevirtual   #300 <Method int ArrayList.size()>
	//*  68  127:icmpge          331
			{
				int k = ((Integer)arraylist.get(j)).intValue();
	//   69  130:aload           4
	//   70  132:iload_2         
	//   71  133:invokevirtual   #303 <Method Object ArrayList.get(int)>
	//   72  136:checkcast       #305 <Class Integer>
	//   73  139:invokevirtual   #308 <Method int Integer.intValue()>
	//   74  142:istore_3        
				hSubrsUsed[k] = new HashMap();
	//   75  143:aload_0         
	//   76  144:getfield        #554 <Field HashMap[] hSubrsUsed>
	//   77  147:iload_3         
	//   78  148:new             #197 <Class HashMap>
	//   79  151:dup             
	//   80  152:invokespecial   #198 <Method void HashMap()>
	//   81  155:aastore         
				lSubrsUsed[k] = new ArrayList();
	//   82  156:aload_0         
	//   83  157:getfield        #556 <Field ArrayList[] lSubrsUsed>
	//   84  160:iload_3         
	//   85  161:new             #202 <Class ArrayList>
	//   86  164:dup             
	//   87  165:invokespecial   #203 <Method void ArrayList()>
	//   88  168:aastore         
				BuildFDSubrsOffsets(i, k);
	//   89  169:aload_0         
	//   90  170:iload_1         
	//   91  171:iload_3         
	//   92  172:invokevirtual   #562 <Method void BuildFDSubrsOffsets(int, int)>
				if(fonts[i].PrivateSubrsOffset[k] >= 0)
	//*  93  175:aload_0         
	//*  94  176:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  95  179:iload_1         
	//*  96  180:aaload          
	//*  97  181:getfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
	//*  98  184:iload_3         
	//*  99  185:iaload          
	//* 100  186:iflt            258
				{
					BuildSubrUsed(i, k, fonts[i].PrivateSubrsOffset[k], fonts[i].PrivateSubrsOffsetsArray[k], hSubrsUsed[k], lSubrsUsed[k]);
	//  101  189:aload_0         
	//  102  190:iload_1         
	//  103  191:iload_3         
	//  104  192:aload_0         
	//  105  193:getfield        #228 <Field CFFFont$Font[] fonts>
	//  106  196:iload_1         
	//  107  197:aaload          
	//  108  198:getfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
	//  109  201:iload_3         
	//  110  202:iaload          
	//  111  203:aload_0         
	//  112  204:getfield        #228 <Field CFFFont$Font[] fonts>
	//  113  207:iload_1         
	//  114  208:aaload          
	//  115  209:getfield        #346 <Field int[][] CFFFont$Font.PrivateSubrsOffsetsArray>
	//  116  212:iload_3         
	//  117  213:aaload          
	//  118  214:aload_0         
	//  119  215:getfield        #554 <Field HashMap[] hSubrsUsed>
	//  120  218:iload_3         
	//  121  219:aaload          
	//  122  220:aload_0         
	//  123  221:getfield        #556 <Field ArrayList[] lSubrsUsed>
	//  124  224:iload_3         
	//  125  225:aaload          
	//  126  226:invokevirtual   #566 <Method void BuildSubrUsed(int, int, int, int[], HashMap, ArrayList)>
					NewLSubrsIndex[k] = BuildNewIndex(fonts[i].PrivateSubrsOffsetsArray[k], hSubrsUsed[k], (byte)11);
	//  127  229:aload_0         
	//  128  230:getfield        #559 <Field byte[][] NewLSubrsIndex>
	//  129  233:iload_3         
	//  130  234:aload_0         
	//  131  235:aload_0         
	//  132  236:getfield        #228 <Field CFFFont$Font[] fonts>
	//  133  239:iload_1         
	//  134  240:aaload          
	//  135  241:getfield        #346 <Field int[][] CFFFont$Font.PrivateSubrsOffsetsArray>
	//  136  244:iload_3         
	//  137  245:aaload          
	//  138  246:aload_0         
	//  139  247:getfield        #554 <Field HashMap[] hSubrsUsed>
	//  140  250:iload_3         
	//  141  251:aaload          
	//  142  252:bipush          11
	//  143  254:invokevirtual   #395 <Method byte[] BuildNewIndex(int[], HashMap, byte)>
	//  144  257:aastore         
				}
			}

	//  145  258:iload_2         
	//  146  259:iconst_1        
	//  147  260:iadd            
	//  148  261:istore_2        
		} else
	//* 149  262:goto            121
		if(fonts[i].privateSubrs >= 0)
	//* 150  265:aload_0         
	//* 151  266:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 152  269:iload_1         
	//* 153  270:aaload          
	//* 154  271:getfield        #350 <Field int CFFFont$Font.privateSubrs>
	//* 155  274:iflt            331
		{
			fonts[i].SubrsOffsets = getIndex(fonts[i].privateSubrs);
	//  156  277:aload_0         
	//  157  278:getfield        #228 <Field CFFFont$Font[] fonts>
	//  158  281:iload_1         
	//  159  282:aaload          
	//  160  283:aload_0         
	//  161  284:aload_0         
	//  162  285:getfield        #228 <Field CFFFont$Font[] fonts>
	//  163  288:iload_1         
	//  164  289:aaload          
	//  165  290:getfield        #350 <Field int CFFFont$Font.privateSubrs>
	//  166  293:invokevirtual   #257 <Method int[] getIndex(int)>
	//  167  296:putfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
			BuildSubrUsed(i, -1, fonts[i].privateSubrs, fonts[i].SubrsOffsets, hSubrsUsedNonCID, lSubrsUsedNonCID);
	//  168  299:aload_0         
	//  169  300:iload_1         
	//  170  301:iconst_m1       
	//  171  302:aload_0         
	//  172  303:getfield        #228 <Field CFFFont$Font[] fonts>
	//  173  306:iload_1         
	//  174  307:aaload          
	//  175  308:getfield        #350 <Field int CFFFont$Font.privateSubrs>
	//  176  311:aload_0         
	//  177  312:getfield        #228 <Field CFFFont$Font[] fonts>
	//  178  315:iload_1         
	//  179  316:aaload          
	//  180  317:getfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
	//  181  320:aload_0         
	//  182  321:getfield        #207 <Field HashMap hSubrsUsedNonCID>
	//  183  324:aload_0         
	//  184  325:getfield        #209 <Field ArrayList lSubrsUsedNonCID>
	//  185  328:invokevirtual   #566 <Method void BuildSubrUsed(int, int, int, int[], HashMap, ArrayList)>
		}
		BuildGSubrsUsed(i);
	//  186  331:aload_0         
	//  187  332:iload_1         
	//  188  333:invokevirtual   #568 <Method void BuildGSubrsUsed(int)>
		if(fonts[i].privateSubrs >= 0)
	//* 189  336:aload_0         
	//* 190  337:getfield        #228 <Field CFFFont$Font[] fonts>
	//* 191  340:iload_1         
	//* 192  341:aaload          
	//* 193  342:getfield        #350 <Field int CFFFont$Font.privateSubrs>
	//* 194  345:iflt            371
			NewSubrsIndexNonCID = BuildNewIndex(fonts[i].SubrsOffsets, hSubrsUsedNonCID, (byte)11);
	//  195  348:aload_0         
	//  196  349:aload_0         
	//  197  350:aload_0         
	//  198  351:getfield        #228 <Field CFFFont$Font[] fonts>
	//  199  354:iload_1         
	//  200  355:aaload          
	//  201  356:getfield        #363 <Field int[] CFFFont$Font.SubrsOffsets>
	//  202  359:aload_0         
	//  203  360:getfield        #207 <Field HashMap hSubrsUsedNonCID>
	//  204  363:bipush          11
	//  205  365:invokevirtual   #395 <Method byte[] BuildNewIndex(int[], HashMap, byte)>
	//  206  368:putfield        #570 <Field byte[] NewSubrsIndexNonCID>
		NewGSubrsIndex = BuildNewIndex(gsubrOffsets, hGSubrsUsed, (byte)11);
	//  207  371:aload_0         
	//  208  372:aload_0         
	//  209  373:aload_0         
	//  210  374:getfield        #356 <Field int[] gsubrOffsets>
	//  211  377:aload_0         
	//  212  378:getfield        #200 <Field HashMap hGSubrsUsed>
	//  213  381:bipush          11
	//  214  383:invokevirtual   #395 <Method byte[] BuildNewIndex(int[], HashMap, byte)>
	//  215  386:putfield        #470 <Field byte[] NewGSubrsIndex>
	//  216  389:return          
	}

	protected void BuildSubrUsed(int i, int j, int k, int ai[], HashMap hashmap, ArrayList arraylist)
	{
		int l = CalcBias(k, i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #353 <Method int CalcBias(int, int)>
	//    4    6:istore          7
		k = 0;
	//    5    8:iconst_0        
	//    6    9:istore_3        
		while(k < glyphsInList.size()) 
	//*   7   10:iload_3         
	//*   8   11:aload_0         
	//*   9   12:getfield        #224 <Field ArrayList glyphsInList>
	//*  10   15:invokevirtual   #300 <Method int ArrayList.size()>
	//*  11   18:icmpge          146
		{
			int i1 = ((Integer)glyphsInList.get(k)).intValue();
	//   12   21:aload_0         
	//   13   22:getfield        #224 <Field ArrayList glyphsInList>
	//   14   25:iload_3         
	//   15   26:invokevirtual   #303 <Method Object ArrayList.get(int)>
	//   16   29:checkcast       #305 <Class Integer>
	//   17   32:invokevirtual   #308 <Method int Integer.intValue()>
	//   18   35:istore          8
			int j1 = fonts[i].charstringsOffsets[i1];
	//   19   37:aload_0         
	//   20   38:getfield        #228 <Field CFFFont$Font[] fonts>
	//   21   41:iload_1         
	//   22   42:aaload          
	//   23   43:getfield        #261 <Field int[] CFFFont$Font.charstringsOffsets>
	//   24   46:iload           8
	//   25   48:iaload          
	//   26   49:istore          9
			int k1 = fonts[i].charstringsOffsets[i1 + 1];
	//   27   51:aload_0         
	//   28   52:getfield        #228 <Field CFFFont$Font[] fonts>
	//   29   55:iload_1         
	//   30   56:aaload          
	//   31   57:getfield        #261 <Field int[] CFFFont$Font.charstringsOffsets>
	//   32   60:iload           8
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:iaload          
	//   36   65:istore          10
			if(j >= 0)
	//*  37   67:iload_2         
	//*  38   68:iflt            123
			{
				EmptyStack();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #573 <Method void EmptyStack()>
				NumOfHints = 0;
	//   41   75:aload_0         
	//   42   76:iconst_0        
	//   43   77:putfield        #213 <Field int NumOfHints>
				if(fonts[i].FDSelect[i1] == j)
	//*  44   80:aload_0         
	//*  45   81:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  46   84:iload_1         
	//*  47   85:aaload          
	//*  48   86:getfield        #296 <Field int[] CFFFont$Font.FDSelect>
	//*  49   89:iload           8
	//*  50   91:iaload          
	//*  51   92:iload_2         
	//*  52   93:icmpne          116
					ReadASubr(j1, k1, GBias, l, hashmap, arraylist, ai);
	//   53   96:aload_0         
	//   54   97:iload           9
	//   55   99:iload           10
	//   56  101:aload_0         
	//   57  102:getfield        #211 <Field int GBias>
	//   58  105:iload           7
	//   59  107:aload           5
	//   60  109:aload           6
	//   61  111:aload           4
	//   62  113:invokevirtual   #360 <Method void ReadASubr(int, int, int, int, HashMap, ArrayList, int[])>
			} else
	//*  63  116:iload_3         
	//*  64  117:iconst_1        
	//*  65  118:iadd            
	//*  66  119:istore_3        
	//*  67  120:goto            10
			{
				ReadASubr(j1, k1, GBias, l, hashmap, arraylist, ai);
	//   68  123:aload_0         
	//   69  124:iload           9
	//   70  126:iload           10
	//   71  128:aload_0         
	//   72  129:getfield        #211 <Field int GBias>
	//   73  132:iload           7
	//   74  134:aload           5
	//   75  136:aload           6
	//   76  138:aload           4
	//   77  140:invokevirtual   #360 <Method void ReadASubr(int, int, int, int, HashMap, ArrayList, int[])>
			}
			k++;
		}
	//*  78  143:goto            116
		for(i = 0; i < arraylist.size(); i++)
	//*  79  146:iconst_0        
	//*  80  147:istore_1        
	//*  81  148:iload_1         
	//*  82  149:aload           6
	//*  83  151:invokevirtual   #300 <Method int ArrayList.size()>
	//*  84  154:icmpge          216
		{
			j = ((Integer)arraylist.get(i)).intValue();
	//   85  157:aload           6
	//   86  159:iload_1         
	//   87  160:invokevirtual   #303 <Method Object ArrayList.get(int)>
	//   88  163:checkcast       #305 <Class Integer>
	//   89  166:invokevirtual   #308 <Method int Integer.intValue()>
	//   90  169:istore_2        
			if(j < ai.length - 1 && j >= 0)
	//*  91  170:iload_2         
	//*  92  171:aload           4
	//*  93  173:arraylength     
	//*  94  174:iconst_1        
	//*  95  175:isub            
	//*  96  176:icmpge          209
	//*  97  179:iload_2         
	//*  98  180:iflt            209
				ReadASubr(ai[j], ai[j + 1], GBias, l, hashmap, arraylist, ai);
	//   99  183:aload_0         
	//  100  184:aload           4
	//  101  186:iload_2         
	//  102  187:iaload          
	//  103  188:aload           4
	//  104  190:iload_2         
	//  105  191:iconst_1        
	//  106  192:iadd            
	//  107  193:iaload          
	//  108  194:aload_0         
	//  109  195:getfield        #211 <Field int GBias>
	//  110  198:iload           7
	//  111  200:aload           5
	//  112  202:aload           6
	//  113  204:aload           4
	//  114  206:invokevirtual   #360 <Method void ReadASubr(int, int, int, int, HashMap, ArrayList, int[])>
		}

	//  115  209:iload_1         
	//  116  210:iconst_1        
	//  117  211:iadd            
	//  118  212:istore_1        
	//* 119  213:goto            148
	//  120  216:return          
	}

	protected int CalcBias(int i, int j)
	{
		seek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #237 <Method void seek(int)>
		i = ((int) (getCard16()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #241 <Method char getCard16()>
	//    5    9:istore_1        
		if(fonts[j].CharstringType == 1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #228 <Field CFFFont$Font[] fonts>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:getfield        #577 <Field int CFFFont$Font.CharstringType>
	//*  11   19:iconst_1        
	//*  12   20:icmpne          25
			return 0;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		if(i < 1240)
	//*  15   25:iload_1         
	//*  16   26:sipush          1240
	//*  17   29:icmpge          35
			return 107;
	//   18   32:bipush          107
	//   19   34:ireturn         
		return i >= 33900 ? 32768 : 1131;
	//   20   35:iload_1         
	//   21   36:ldc2            #578 <Int 33900>
	//   22   39:icmpge          46
	//   23   42:sipush          1131
	//   24   45:ireturn         
	//   25   46:ldc2            #579 <Int 32768>
	//   26   49:ireturn         
	}

	protected int CalcHints(int i, int j, int k, int l, int ai[])
	{
		seek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #237 <Method void seek(int)>
label0:
		do
		{
label1:
			{
				do
				{
					if(getPosition() >= j)
						break label0;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #326 <Method int getPosition()>
	//    5    9:iload_2         
	//    6   10:icmpge          297
					ReadCommand();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #584 <Method void ReadCommand()>
					i = getPosition();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #326 <Method int getPosition()>
	//   11   21:istore_1        
					Object obj = null;
	//   12   22:aconst_null     
	//   13   23:astore          7
					if(arg_count > 0)
	//*  14   25:aload_0         
	//*  15   26:getfield        #587 <Field int arg_count>
	//*  16   29:ifle            45
						obj = args[arg_count - 1];
	//   17   32:aload_0         
	//   18   33:getfield        #342 <Field Object[] args>
	//   19   36:aload_0         
	//   20   37:getfield        #587 <Field int arg_count>
	//   21   40:iconst_1        
	//   22   41:isub            
	//   23   42:aaload          
	//   24   43:astore          7
					int i1 = arg_count;
	//   25   45:aload_0         
	//   26   46:getfield        #587 <Field int arg_count>
	//   27   49:istore          6
					HandelStack();
	//   28   51:aload_0         
	//   29   52:invokevirtual   #590 <Method void HandelStack()>
					if(key == "callsubr")
	//*  30   55:aload_0         
	//*  31   56:getfield        #336 <Field String key>
	//*  32   59:ldc1            #69  <String "callsubr">
	//*  33   61:if_acmpne       111
					{
						if(i1 > 0)
	//*  34   64:iload           6
	//*  35   66:ifle            5
						{
							i1 = ((Integer)obj).intValue() + k;
	//   36   69:aload           7
	//   37   71:checkcast       #305 <Class Integer>
	//   38   74:invokevirtual   #308 <Method int Integer.intValue()>
	//   39   77:iload_3         
	//   40   78:iadd            
	//   41   79:istore          6
							CalcHints(ai[i1], ai[i1 + 1], k, l, ai);
	//   42   81:aload_0         
	//   43   82:aload           5
	//   44   84:iload           6
	//   45   86:iaload          
	//   46   87:aload           5
	//   47   89:iload           6
	//   48   91:iconst_1        
	//   49   92:iadd            
	//   50   93:iaload          
	//   51   94:iload_3         
	//   52   95:iload           4
	//   53   97:aload           5
	//   54   99:invokevirtual   #592 <Method int CalcHints(int, int, int, int, int[])>
	//   55  102:pop             
							seek(i);
	//   56  103:aload_0         
	//   57  104:iload_1         
	//   58  105:invokevirtual   #237 <Method void seek(int)>
						}
					} else
	//*  59  108:goto            5
					if(key == "callgsubr")
	//*  60  111:aload_0         
	//*  61  112:getfield        #336 <Field String key>
	//*  62  115:ldc1            #107 <String "callgsubr">
	//*  63  117:if_acmpne       172
					{
						if(i1 > 0)
	//*  64  120:iload           6
	//*  65  122:ifle            5
						{
							i1 = ((Integer)obj).intValue() + l;
	//   66  125:aload           7
	//   67  127:checkcast       #305 <Class Integer>
	//   68  130:invokevirtual   #308 <Method int Integer.intValue()>
	//   69  133:iload           4
	//   70  135:iadd            
	//   71  136:istore          6
							CalcHints(gsubrOffsets[i1], gsubrOffsets[i1 + 1], k, l, ai);
	//   72  138:aload_0         
	//   73  139:aload_0         
	//   74  140:getfield        #356 <Field int[] gsubrOffsets>
	//   75  143:iload           6
	//   76  145:iaload          
	//   77  146:aload_0         
	//   78  147:getfield        #356 <Field int[] gsubrOffsets>
	//   79  150:iload           6
	//   80  152:iconst_1        
	//   81  153:iadd            
	//   82  154:iaload          
	//   83  155:iload_3         
	//   84  156:iload           4
	//   85  158:aload           5
	//   86  160:invokevirtual   #592 <Method int CalcHints(int, int, int, int, int[])>
	//   87  163:pop             
							seek(i);
	//   88  164:aload_0         
	//   89  165:iload_1         
	//   90  166:invokevirtual   #237 <Method void seek(int)>
						}
					} else
	//*  91  169:goto            5
					{
						if(key != "hstem" && key != "vstem" && key != "hstemhm" && key != "vstemhm")
							continue;
	//   92  172:aload_0         
	//   93  173:getfield        #336 <Field String key>
	//   94  176:ldc1            #51  <String "hstem">
	//   95  178:if_acmpeq       208
	//   96  181:aload_0         
	//   97  182:getfield        #336 <Field String key>
	//   98  185:ldc1            #55  <String "vstem">
	//   99  187:if_acmpeq       208
	//  100  190:aload_0         
	//  101  191:getfield        #336 <Field String key>
	//  102  194:ldc1            #85  <String "hstemhm">
	//  103  196:if_acmpeq       208
	//  104  199:aload_0         
	//  105  200:getfield        #336 <Field String key>
	//  106  203:ldc1            #95  <String "vstemhm">
	//  107  205:if_acmpne       224
						NumOfHints = NumOfHints + i1 / 2;
	//  108  208:aload_0         
	//  109  209:aload_0         
	//  110  210:getfield        #213 <Field int NumOfHints>
	//  111  213:iload           6
	//  112  215:iconst_2        
	//  113  216:idiv            
	//  114  217:iadd            
	//  115  218:putfield        #213 <Field int NumOfHints>
					}
					continue label0;
	//  116  221:goto            5
				} while(key != "hintmask" && key != "cntrmask");
	//  117  224:aload_0         
	//  118  225:getfield        #336 <Field String key>
	//  119  228:ldc1            #87  <String "hintmask">
	//  120  230:if_acmpeq       242
	//  121  233:aload_0         
	//  122  234:getfield        #336 <Field String key>
	//  123  237:ldc1            #89  <String "cntrmask">
	//  124  239:if_acmpne       5
				int j1 = NumOfHints / 8;
	//  125  242:aload_0         
	//  126  243:getfield        #213 <Field int NumOfHints>
	//  127  246:bipush          8
	//  128  248:idiv            
	//  129  249:istore          6
				if(NumOfHints % 8 == 0)
	//* 130  251:aload_0         
	//* 131  252:getfield        #213 <Field int NumOfHints>
	//* 132  255:bipush          8
	//* 133  257:irem            
	//* 134  258:ifne            269
				{
					i = j1;
	//  135  261:iload           6
	//  136  263:istore_1        
					if(j1 != 0)
						break label1;
	//  137  264:iload           6
	//  138  266:ifne            274
				}
				i = j1 + 1;
	//  139  269:iload           6
	//  140  271:iconst_1        
	//  141  272:iadd            
	//  142  273:istore_1        
			}
			int k1 = 0;
	//  143  274:iconst_0        
	//  144  275:istore          6
			while(k1 < i) 
	//* 145  277:iload           6
	//* 146  279:iload_1         
	//* 147  280:icmpge          5
			{
				getCard8();
	//  148  283:aload_0         
	//  149  284:invokevirtual   #595 <Method char getCard8()>
	//  150  287:pop             
				k1++;
	//  151  288:iload           6
	//  152  290:iconst_1        
	//  153  291:iadd            
	//  154  292:istore          6
			}
		} while(true);
	//  155  294:goto            277
		return NumOfHints;
	//  156  297:aload_0         
	//  157  298:getfield        #213 <Field int NumOfHints>
	//  158  301:ireturn         
	}

	int CalcSubrOffsetSize(int i, int j)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		seek(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #237 <Method void seek(int)>
		do
		{
			if(getPosition() >= i + j)
				break;
	//    5    7:aload_0         
	//    6    8:invokevirtual   #326 <Method int getPosition()>
	//    7   11:iload_1         
	//    8   12:iload_2         
	//    9   13:iadd            
	//   10   14:icmpge          54
			int l = getPosition();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #326 <Method int getPosition()>
	//   13   21:istore          4
			getDictItem();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #332 <Method void getDictItem()>
			int i1 = getPosition();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #326 <Method int getPosition()>
	//   18   31:istore          5
			if(key == "Subrs")
	//*  19   33:aload_0         
	//*  20   34:getfield        #336 <Field String key>
	//*  21   37:ldc2            #338 <String "Subrs">
	//*  22   40:if_acmpne       7
				k = i1 - l - 1;
	//   23   43:iload           5
	//   24   45:iload           4
	//   25   47:isub            
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:istore_3        
		} while(true);
	//   29   51:goto            7
		return k;
	//   30   54:iload_3         
	//   31   55:ireturn         
	}

	protected void CopyHeader()
	{
		seek(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #237 <Method void seek(int)>
		getCard8();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #595 <Method char getCard8()>
	//    5    9:pop             
		getCard8();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #595 <Method char getCard8()>
	//    8   14:pop             
		int i = ((int) (getCard8()));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #595 <Method char getCard8()>
	//   11   19:istore_1        
		getCard8();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #595 <Method char getCard8()>
	//   14   24:pop             
		nextIndexOffset = i;
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:putfield        #599 <Field int nextIndexOffset>
		OutputList.addLast(((Object) (new CFFFont.RangeItem(buf, 0, i))));
	//   18   30:aload_0         
	//   19   31:getfield        #367 <Field LinkedList OutputList>
	//   20   34:new             #445 <Class CFFFont$RangeItem>
	//   21   37:dup             
	//   22   38:aload_0         
	//   23   39:getfield        #449 <Field RandomAccessFileOrArray buf>
	//   24   42:iconst_0        
	//   25   43:iload_1         
	//   26   44:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//   27   47:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//   28   50:return          
	}

	int CountCharset(int i, int j)
	{
		seek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #237 <Method void seek(int)>
		switch(getCard8())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #595 <Method char getCard8()>
		{
	//*   5    9:tableswitch     0 2: default 36
	//	               0 38
	//	               1 44
	//	               2 55
		default:
			return 0;
	//    6   36:iconst_0        
	//    7   37:ireturn         

		case 0: // '\0'
			return j * 2 + 1;
	//    8   38:iload_2         
	//    9   39:iconst_2        
	//   10   40:imul            
	//   11   41:iconst_1        
	//   12   42:iadd            
	//   13   43:ireturn         

		case 1: // '\001'
			return CountRange(j, 1) * 3 + 1;
	//   14   44:aload_0         
	//   15   45:iload_2         
	//   16   46:iconst_1        
	//   17   47:invokevirtual   #602 <Method int CountRange(int, int)>
	//   18   50:iconst_3        
	//   19   51:imul            
	//   20   52:iconst_1        
	//   21   53:iadd            
	//   22   54:ireturn         

		case 2: // '\002'
			return CountRange(j, 2) * 4 + 1;
	//   23   55:aload_0         
	//   24   56:iload_2         
	//   25   57:iconst_2        
	//   26   58:invokevirtual   #602 <Method int CountRange(int, int)>
	//   27   61:iconst_4        
	//   28   62:imul            
	//   29   63:iconst_1        
	//   30   64:iadd            
	//   31   65:ireturn         
		}
	}

	int CountRange(int i, int j)
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int k = 1;
	//    2    3:iconst_1        
	//    3    4:istore_3        
		while(k < i) 
	//*   4    5:iload_3         
	//*   5    6:iload_1         
	//*   6    7:icmpge          55
		{
			int i1 = l + 1;
	//    7   10:iload           4
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:istore          5
			getCard16();
	//   11   16:aload_0         
	//   12   17:invokevirtual   #241 <Method char getCard16()>
	//   13   20:pop             
			if(j == 1)
	//*  14   21:iload_2         
	//*  15   22:iconst_1        
	//*  16   23:icmpne          46
				l = ((int) (getCard8()));
	//   17   26:aload_0         
	//   18   27:invokevirtual   #595 <Method char getCard8()>
	//   19   30:istore          4
			else
	//*  20   32:iload_3         
	//*  21   33:iload           4
	//*  22   35:iconst_1        
	//*  23   36:iadd            
	//*  24   37:iadd            
	//*  25   38:istore_3        
	//*  26   39:iload           5
	//*  27   41:istore          4
	//*  28   43:goto            5
				l = ((int) (getCard16()));
	//   29   46:aload_0         
	//   30   47:invokevirtual   #241 <Method char getCard16()>
	//   31   50:istore          4
			k += l + 1;
			l = i1;
		}
	//*  32   52:goto            32
		return l;
	//   33   55:iload           4
	//   34   57:ireturn         
	}

	protected void CreateCharset(CFFFont.OffsetItem offsetitem, int i)
	{
		OutputList.addLast(((Object) (new CFFFont.MarkerItem(offsetitem))));
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field LinkedList OutputList>
	//    2    4:new             #475 <Class CFFFont$MarkerItem>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//    6   12:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\002'))));
	//    7   15:aload_0         
	//    8   16:getfield        #367 <Field LinkedList OutputList>
	//    9   19:new             #380 <Class CFFFont$UInt8Item>
	//   10   22:dup             
	//   11   23:iconst_2        
	//   12   24:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   13   27:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt16Item('\001'))));
	//   14   30:aload_0         
	//   15   31:getfield        #367 <Field LinkedList OutputList>
	//   16   34:new             #369 <Class CFFFont$UInt16Item>
	//   17   37:dup             
	//   18   38:iconst_1        
	//   19   39:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//   20   42:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt16Item((char)(i - 1)))));
	//   21   45:aload_0         
	//   22   46:getfield        #367 <Field LinkedList OutputList>
	//   23   49:new             #369 <Class CFFFont$UInt16Item>
	//   24   52:dup             
	//   25   53:iload_2         
	//   26   54:iconst_1        
	//   27   55:isub            
	//   28   56:int2char        
	//   29   57:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//   30   60:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//   31   63:return          
	}

	protected void CreateFDArray(CFFFont.OffsetItem offsetitem, CFFFont.OffsetItem offsetitem1, int i)
	{
		OutputList.addLast(((Object) (new CFFFont.MarkerItem(offsetitem))));
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field LinkedList OutputList>
	//    2    4:new             #475 <Class CFFFont$MarkerItem>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//    6   12:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		BuildIndexHeader(1, 1, 1);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:iconst_1        
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #406 <Method void BuildIndexHeader(int, int, int)>
		offsetitem = ((CFFFont.OffsetItem) (new CFFFont.IndexOffsetItem(1)));
	//   12   22:new             #419 <Class CFFFont$IndexOffsetItem>
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:invokespecial   #420 <Method void CFFFont$IndexOffsetItem(int)>
	//   16   30:astore_1        
		OutputList.addLast(((Object) (offsetitem)));
	//   17   31:aload_0         
	//   18   32:getfield        #367 <Field LinkedList OutputList>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		CFFFont.IndexBaseItem indexbaseitem = new CFFFont.IndexBaseItem();
	//   21   39:new             #422 <Class CFFFont$IndexBaseItem>
	//   22   42:dup             
	//   23   43:invokespecial   #423 <Method void CFFFont$IndexBaseItem()>
	//   24   46:astore          6
		OutputList.addLast(((Object) (indexbaseitem)));
	//   25   48:aload_0         
	//   26   49:getfield        #367 <Field LinkedList OutputList>
	//   27   52:aload           6
	//   28   54:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		int j = fonts[i].privateLength;
	//   29   57:aload_0         
	//   30   58:getfield        #228 <Field CFFFont$Font[] fonts>
	//   31   61:iload_3         
	//   32   62:aaload          
	//   33   63:getfield        #605 <Field int CFFFont$Font.privateLength>
	//   34   66:istore          4
		int k = CalcSubrOffsetSize(fonts[i].privateOffset, fonts[i].privateLength);
	//   35   68:aload_0         
	//   36   69:aload_0         
	//   37   70:getfield        #228 <Field CFFFont$Font[] fonts>
	//   38   73:iload_3         
	//   39   74:aaload          
	//   40   75:getfield        #490 <Field int CFFFont$Font.privateOffset>
	//   41   78:aload_0         
	//   42   79:getfield        #228 <Field CFFFont$Font[] fonts>
	//   43   82:iload_3         
	//   44   83:aaload          
	//   45   84:getfield        #605 <Field int CFFFont$Font.privateLength>
	//   46   87:invokevirtual   #607 <Method int CalcSubrOffsetSize(int, int)>
	//   47   90:istore          5
		i = j;
	//   48   92:iload           4
	//   49   94:istore_3        
		if(k != 0)
	//*  50   95:iload           5
	//*  51   97:ifeq            108
			i = j + (5 - k);
	//   52  100:iload           4
	//   53  102:iconst_5        
	//   54  103:iload           5
	//   55  105:isub            
	//   56  106:iadd            
	//   57  107:istore_3        
		OutputList.addLast(((Object) (new CFFFont.DictNumberItem(i))));
	//   58  108:aload_0         
	//   59  109:getfield        #367 <Field LinkedList OutputList>
	//   60  112:new             #428 <Class CFFFont$DictNumberItem>
	//   61  115:dup             
	//   62  116:iload_3         
	//   63  117:invokespecial   #429 <Method void CFFFont$DictNumberItem(int)>
	//   64  120:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (offsetitem1)));
	//   65  123:aload_0         
	//   66  124:getfield        #367 <Field LinkedList OutputList>
	//   67  127:aload_2         
	//   68  128:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\022'))));
	//   69  131:aload_0         
	//   70  132:getfield        #367 <Field LinkedList OutputList>
	//   71  135:new             #380 <Class CFFFont$UInt8Item>
	//   72  138:dup             
	//   73  139:bipush          18
	//   74  141:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   75  144:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.IndexMarkerItem(offsetitem, indexbaseitem))));
	//   76  147:aload_0         
	//   77  148:getfield        #367 <Field LinkedList OutputList>
	//   78  151:new             #459 <Class CFFFont$IndexMarkerItem>
	//   79  154:dup             
	//   80  155:aload_1         
	//   81  156:aload           6
	//   82  158:invokespecial   #462 <Method void CFFFont$IndexMarkerItem(CFFFont$OffsetItem, CFFFont$IndexBaseItem)>
	//   83  161:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//   84  164:return          
	}

	protected void CreateFDSelect(CFFFont.OffsetItem offsetitem, int i)
	{
		OutputList.addLast(((Object) (new CFFFont.MarkerItem(offsetitem))));
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field LinkedList OutputList>
	//    2    4:new             #475 <Class CFFFont$MarkerItem>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//    6   12:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\003'))));
	//    7   15:aload_0         
	//    8   16:getfield        #367 <Field LinkedList OutputList>
	//    9   19:new             #380 <Class CFFFont$UInt8Item>
	//   10   22:dup             
	//   11   23:iconst_3        
	//   12   24:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   13   27:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt16Item('\001'))));
	//   14   30:aload_0         
	//   15   31:getfield        #367 <Field LinkedList OutputList>
	//   16   34:new             #369 <Class CFFFont$UInt16Item>
	//   17   37:dup             
	//   18   38:iconst_1        
	//   19   39:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//   20   42:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt16Item('\0'))));
	//   21   45:aload_0         
	//   22   46:getfield        #367 <Field LinkedList OutputList>
	//   23   49:new             #369 <Class CFFFont$UInt16Item>
	//   24   52:dup             
	//   25   53:iconst_0        
	//   26   54:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//   27   57:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\0'))));
	//   28   60:aload_0         
	//   29   61:getfield        #367 <Field LinkedList OutputList>
	//   30   64:new             #380 <Class CFFFont$UInt8Item>
	//   31   67:dup             
	//   32   68:iconst_0        
	//   33   69:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   34   72:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt16Item((char)i))));
	//   35   75:aload_0         
	//   36   76:getfield        #367 <Field LinkedList OutputList>
	//   37   79:new             #369 <Class CFFFont$UInt16Item>
	//   38   82:dup             
	//   39   83:iload_2         
	//   40   84:int2char        
	//   41   85:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//   42   88:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//   43   91:return          
	}

	protected void CreateKeys(CFFFont.OffsetItem offsetitem, CFFFont.OffsetItem offsetitem1, CFFFont.OffsetItem offsetitem2, CFFFont.OffsetItem offsetitem3)
	{
		OutputList.addLast(((Object) (offsetitem)));
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field LinkedList OutputList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\f'))));
	//    4    8:aload_0         
	//    5    9:getfield        #367 <Field LinkedList OutputList>
	//    6   12:new             #380 <Class CFFFont$UInt8Item>
	//    7   15:dup             
	//    8   16:bipush          12
	//    9   18:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   10   21:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('$'))));
	//   11   24:aload_0         
	//   12   25:getfield        #367 <Field LinkedList OutputList>
	//   13   28:new             #380 <Class CFFFont$UInt8Item>
	//   14   31:dup             
	//   15   32:bipush          36
	//   16   34:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   17   37:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (offsetitem1)));
	//   18   40:aload_0         
	//   19   41:getfield        #367 <Field LinkedList OutputList>
	//   20   44:aload_2         
	//   21   45:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\f'))));
	//   22   48:aload_0         
	//   23   49:getfield        #367 <Field LinkedList OutputList>
	//   24   52:new             #380 <Class CFFFont$UInt8Item>
	//   25   55:dup             
	//   26   56:bipush          12
	//   27   58:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   28   61:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('%'))));
	//   29   64:aload_0         
	//   30   65:getfield        #367 <Field LinkedList OutputList>
	//   31   68:new             #380 <Class CFFFont$UInt8Item>
	//   32   71:dup             
	//   33   72:bipush          37
	//   34   74:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   35   77:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (offsetitem2)));
	//   36   80:aload_0         
	//   37   81:getfield        #367 <Field LinkedList OutputList>
	//   38   84:aload_3         
	//   39   85:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\017'))));
	//   40   88:aload_0         
	//   41   89:getfield        #367 <Field LinkedList OutputList>
	//   42   92:new             #380 <Class CFFFont$UInt8Item>
	//   43   95:dup             
	//   44   96:bipush          15
	//   45   98:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   46  101:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (offsetitem3)));
	//   47  104:aload_0         
	//   48  105:getfield        #367 <Field LinkedList OutputList>
	//   49  108:aload           4
	//   50  110:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.UInt8Item('\021'))));
	//   51  113:aload_0         
	//   52  114:getfield        #367 <Field LinkedList OutputList>
	//   53  117:new             #380 <Class CFFFont$UInt8Item>
	//   54  120:dup             
	//   55  121:bipush          17
	//   56  123:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   57  126:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//   58  129:return          
	}

	protected void CreateNewStringIndex(int i)
	{
		String s1 = (new StringBuilder()).append(fonts[i].name).append("-OneRange").toString();
	//    0    0:new             #609 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #610 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #228 <Field CFFFont$Font[] fonts>
	//    5   11:iload_1         
	//    6   12:aaload          
	//    7   13:getfield        #409 <Field String CFFFont$Font.name>
	//    8   16:invokevirtual   #614 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc2            #616 <String "-OneRange">
	//   10   22:invokevirtual   #614 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   12   28:astore          8
		String s = s1;
	//   13   30:aload           8
	//   14   32:astore          7
		if(s1.length() > 127)
	//*  15   34:aload           8
	//*  16   36:invokevirtual   #412 <Method int String.length()>
	//*  17   39:bipush          127
	//*  18   41:icmple          54
			s = s1.substring(0, 127);
	//   19   44:aload           8
	//   20   46:iconst_0        
	//   21   47:bipush          127
	//   22   49:invokevirtual   #624 <Method String String.substring(int, int)>
	//   23   52:astore          7
		s1 = (new StringBuilder()).append("AdobeIdentity").append(s).toString();
	//   24   54:new             #609 <Class StringBuilder>
	//   25   57:dup             
	//   26   58:invokespecial   #610 <Method void StringBuilder()>
	//   27   61:ldc2            #626 <String "AdobeIdentity">
	//   28   64:invokevirtual   #614 <Method StringBuilder StringBuilder.append(String)>
	//   29   67:aload           7
	//   30   69:invokevirtual   #614 <Method StringBuilder StringBuilder.append(String)>
	//   31   72:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   32   75:astore          8
		int l = stringOffsets[stringOffsets.length - 1] - stringOffsets[0];
	//   33   77:aload_0         
	//   34   78:getfield        #629 <Field int[] stringOffsets>
	//   35   81:aload_0         
	//   36   82:getfield        #629 <Field int[] stringOffsets>
	//   37   85:arraylength     
	//   38   86:iconst_1        
	//   39   87:isub            
	//   40   88:iaload          
	//   41   89:aload_0         
	//   42   90:getfield        #629 <Field int[] stringOffsets>
	//   43   93:iconst_0        
	//   44   94:iaload          
	//   45   95:isub            
	//   46   96:istore_3        
		int i1 = stringOffsets[0] - 1;
	//   47   97:aload_0         
	//   48   98:getfield        #629 <Field int[] stringOffsets>
	//   49  101:iconst_0        
	//   50  102:iaload          
	//   51  103:iconst_1        
	//   52  104:isub            
	//   53  105:istore          4
		int j1;
		int ai[];
		if(s1.length() + l <= 255)
	//*  54  107:aload           8
	//*  55  109:invokevirtual   #412 <Method int String.length()>
	//*  56  112:iload_3         
	//*  57  113:iadd            
	//*  58  114:sipush          255
	//*  59  117:icmpgt          214
			i = 1;
	//   60  120:iconst_1        
	//   61  121:istore_1        
		else
	//*  62  122:aload_0         
	//*  63  123:getfield        #367 <Field LinkedList OutputList>
	//*  64  126:new             #369 <Class CFFFont$UInt16Item>
	//*  65  129:dup             
	//*  66  130:aload_0         
	//*  67  131:getfield        #629 <Field int[] stringOffsets>
	//*  68  134:arraylength     
	//*  69  135:iconst_1        
	//*  70  136:isub            
	//*  71  137:iconst_3        
	//*  72  138:iadd            
	//*  73  139:int2char        
	//*  74  140:invokespecial   #372 <Method void CFFFont$UInt16Item(char)>
	//*  75  143:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//*  76  146:aload_0         
	//*  77  147:getfield        #367 <Field LinkedList OutputList>
	//*  78  150:new             #380 <Class CFFFont$UInt8Item>
	//*  79  153:dup             
	//*  80  154:iload_1         
	//*  81  155:int2char        
	//*  82  156:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//*  83  159:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//*  84  162:aload_0         
	//*  85  163:getfield        #629 <Field int[] stringOffsets>
	//*  86  166:astore          9
	//*  87  168:aload           9
	//*  88  170:arraylength     
	//*  89  171:istore          5
	//*  90  173:iconst_0        
	//*  91  174:istore_2        
	//*  92  175:iload_2         
	//*  93  176:iload           5
	//*  94  178:icmpge          255
	//*  95  181:aload           9
	//*  96  183:iload_2         
	//*  97  184:iaload          
	//*  98  185:istore          6
	//*  99  187:aload_0         
	//* 100  188:getfield        #367 <Field LinkedList OutputList>
	//* 101  191:new             #419 <Class CFFFont$IndexOffsetItem>
	//* 102  194:dup             
	//* 103  195:iload_1         
	//* 104  196:iload           6
	//* 105  198:iload           4
	//* 106  200:isub            
	//* 107  201:invokespecial   #631 <Method void CFFFont$IndexOffsetItem(int, int)>
	//* 108  204:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//* 109  207:iload_2         
	//* 110  208:iconst_1        
	//* 111  209:iadd            
	//* 112  210:istore_2        
	//* 113  211:goto            175
		if(s1.length() + l <= 65535)
	//* 114  214:aload           8
	//* 115  216:invokevirtual   #412 <Method int String.length()>
	//* 116  219:iload_3         
	//* 117  220:iadd            
	//* 118  221:ldc2            #292 <Int 65535>
	//* 119  224:icmpgt          232
			i = 2;
	//  120  227:iconst_2        
	//  121  228:istore_1        
		else
	//* 122  229:goto            122
		if(s1.length() + l <= 0xffffff)
	//* 123  232:aload           8
	//* 124  234:invokevirtual   #412 <Method int String.length()>
	//* 125  237:iload_3         
	//* 126  238:iadd            
	//* 127  239:ldc2            #293 <Int 0xffffff>
	//* 128  242:icmpgt          250
			i = 3;
	//  129  245:iconst_3        
	//  130  246:istore_1        
		else
	//* 131  247:goto            122
			i = 4;
	//  132  250:iconst_4        
	//  133  251:istore_1        
		OutputList.addLast(((Object) (new CFFFont.UInt16Item((char)((stringOffsets.length - 1) + 3)))));
		OutputList.addLast(((Object) (new CFFFont.UInt8Item((char)i))));
		ai = stringOffsets;
		j1 = ai.length;
		for(int j = 0; j < j1; j++)
		{
			int k1 = ai[j];
			OutputList.addLast(((Object) (new CFFFont.IndexOffsetItem(i, k1 - i1))));
		}

	//* 134  252:goto            122
		int k = (stringOffsets[stringOffsets.length - 1] - i1) + "Adobe".length();
	//  135  255:aload_0         
	//  136  256:getfield        #629 <Field int[] stringOffsets>
	//  137  259:aload_0         
	//  138  260:getfield        #629 <Field int[] stringOffsets>
	//  139  263:arraylength     
	//  140  264:iconst_1        
	//  141  265:isub            
	//  142  266:iaload          
	//  143  267:iload           4
	//  144  269:isub            
	//  145  270:ldc2            #633 <String "Adobe">
	//  146  273:invokevirtual   #412 <Method int String.length()>
	//  147  276:iadd            
	//  148  277:istore_2        
		OutputList.addLast(((Object) (new CFFFont.IndexOffsetItem(i, k))));
	//  149  278:aload_0         
	//  150  279:getfield        #367 <Field LinkedList OutputList>
	//  151  282:new             #419 <Class CFFFont$IndexOffsetItem>
	//  152  285:dup             
	//  153  286:iload_1         
	//  154  287:iload_2         
	//  155  288:invokespecial   #631 <Method void CFFFont$IndexOffsetItem(int, int)>
	//  156  291:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		k += "Identity".length();
	//  157  294:iload_2         
	//  158  295:ldc2            #635 <String "Identity">
	//  159  298:invokevirtual   #412 <Method int String.length()>
	//  160  301:iadd            
	//  161  302:istore_2        
		OutputList.addLast(((Object) (new CFFFont.IndexOffsetItem(i, k))));
	//  162  303:aload_0         
	//  163  304:getfield        #367 <Field LinkedList OutputList>
	//  164  307:new             #419 <Class CFFFont$IndexOffsetItem>
	//  165  310:dup             
	//  166  311:iload_1         
	//  167  312:iload_2         
	//  168  313:invokespecial   #631 <Method void CFFFont$IndexOffsetItem(int, int)>
	//  169  316:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		i1 = s.length();
	//  170  319:aload           7
	//  171  321:invokevirtual   #412 <Method int String.length()>
	//  172  324:istore          4
		OutputList.addLast(((Object) (new CFFFont.IndexOffsetItem(i, k + i1))));
	//  173  326:aload_0         
	//  174  327:getfield        #367 <Field LinkedList OutputList>
	//  175  330:new             #419 <Class CFFFont$IndexOffsetItem>
	//  176  333:dup             
	//  177  334:iload_1         
	//  178  335:iload_2         
	//  179  336:iload           4
	//  180  338:iadd            
	//  181  339:invokespecial   #631 <Method void CFFFont$IndexOffsetItem(int, int)>
	//  182  342:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.RangeItem(buf, stringOffsets[0], l))));
	//  183  345:aload_0         
	//  184  346:getfield        #367 <Field LinkedList OutputList>
	//  185  349:new             #445 <Class CFFFont$RangeItem>
	//  186  352:dup             
	//  187  353:aload_0         
	//  188  354:getfield        #449 <Field RandomAccessFileOrArray buf>
	//  189  357:aload_0         
	//  190  358:getfield        #629 <Field int[] stringOffsets>
	//  191  361:iconst_0        
	//  192  362:iaload          
	//  193  363:iload_3         
	//  194  364:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//  195  367:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		OutputList.addLast(((Object) (new CFFFont.StringItem(s1))));
	//  196  370:aload_0         
	//  197  371:getfield        #367 <Field LinkedList OutputList>
	//  198  374:new             #414 <Class CFFFont$StringItem>
	//  199  377:dup             
	//  200  378:aload           8
	//  201  380:invokespecial   #417 <Method void CFFFont$StringItem(String)>
	//  202  383:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//  203  386:return          
	}

	void CreateNonCIDPrivate(int i, CFFFont.OffsetItem offsetitem)
	{
		seek(fonts[i].privateOffset);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #228 <Field CFFFont$Font[] fonts>
	//    3    5:iload_1         
	//    4    6:aaload          
	//    5    7:getfield        #490 <Field int CFFFont$Font.privateOffset>
	//    6   10:invokevirtual   #237 <Method void seek(int)>
		while(getPosition() < fonts[i].privateOffset + fonts[i].privateLength) 
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #326 <Method int getPosition()>
	//*   9   17:aload_0         
	//*  10   18:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  11   21:iload_1         
	//*  12   22:aaload          
	//*  13   23:getfield        #490 <Field int CFFFont$Font.privateOffset>
	//*  14   26:aload_0         
	//*  15   27:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  16   30:iload_1         
	//*  17   31:aaload          
	//*  18   32:getfield        #605 <Field int CFFFont$Font.privateLength>
	//*  19   35:iadd            
	//*  20   36:icmpge          117
		{
			int j = getPosition();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #326 <Method int getPosition()>
	//   23   43:istore_3        
			getDictItem();
	//   24   44:aload_0         
	//   25   45:invokevirtual   #332 <Method void getDictItem()>
			int k = getPosition();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #326 <Method int getPosition()>
	//   28   52:istore          4
			if(key == "Subrs")
	//*  29   54:aload_0         
	//*  30   55:getfield        #336 <Field String key>
	//*  31   58:ldc2            #338 <String "Subrs">
	//*  32   61:if_acmpne       91
			{
				OutputList.addLast(((Object) (offsetitem)));
	//   33   64:aload_0         
	//   34   65:getfield        #367 <Field LinkedList OutputList>
	//   35   68:aload_2         
	//   36   69:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
				OutputList.addLast(((Object) (new CFFFont.UInt8Item('\023'))));
	//   37   72:aload_0         
	//   38   73:getfield        #367 <Field LinkedList OutputList>
	//   39   76:new             #380 <Class CFFFont$UInt8Item>
	//   40   79:dup             
	//   41   80:bipush          19
	//   42   82:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   43   85:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			} else
	//*  44   88:goto            13
			{
				OutputList.addLast(((Object) (new CFFFont.RangeItem(buf, j, k - j))));
	//   45   91:aload_0         
	//   46   92:getfield        #367 <Field LinkedList OutputList>
	//   47   95:new             #445 <Class CFFFont$RangeItem>
	//   48   98:dup             
	//   49   99:aload_0         
	//   50  100:getfield        #449 <Field RandomAccessFileOrArray buf>
	//   51  103:iload_3         
	//   52  104:iload           4
	//   53  106:iload_3         
	//   54  107:isub            
	//   55  108:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//   56  111:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			}
		}
	//*  57  114:goto            13
	//   58  117:return          
	}

	void CreateNonCIDSubrs(int i, CFFFont.IndexBaseItem indexbaseitem, CFFFont.OffsetItem offsetitem)
	{
		OutputList.addLast(((Object) (new CFFFont.SubrMarkerItem(offsetitem, indexbaseitem))));
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field LinkedList OutputList>
	//    2    4:new             #637 <Class CFFFont$SubrMarkerItem>
	//    3    7:dup             
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokespecial   #638 <Method void CFFFont$SubrMarkerItem(CFFFont$OffsetItem, CFFFont$IndexBaseItem)>
	//    7   13:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		if(NewSubrsIndexNonCID != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #570 <Field byte[] NewSubrsIndexNonCID>
	//*  10   20:ifnull          54
			OutputList.addLast(((Object) (new CFFFont.RangeItem(new RandomAccessFileOrArray(NewSubrsIndexNonCID), 0, NewSubrsIndexNonCID.length))));
	//   11   23:aload_0         
	//   12   24:getfield        #367 <Field LinkedList OutputList>
	//   13   27:new             #445 <Class CFFFont$RangeItem>
	//   14   30:dup             
	//   15   31:new             #468 <Class RandomAccessFileOrArray>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:getfield        #570 <Field byte[] NewSubrsIndexNonCID>
	//   19   39:invokespecial   #473 <Method void RandomAccessFileOrArray(byte[])>
	//   20   42:iconst_0        
	//   21   43:aload_0         
	//   22   44:getfield        #570 <Field byte[] NewSubrsIndexNonCID>
	//   23   47:arraylength     
	//   24   48:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//   25   51:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
	//   26   54:return          
	}

	protected void EmptyStack()
	{
		for(int i = 0; i < arg_count; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #587 <Field int arg_count>
	//*   5    7:icmpge          24
			args[i] = null;
	//    6   10:aload_0         
	//    7   11:getfield        #342 <Field Object[] args>
	//    8   14:iload_1         
	//    9   15:aconst_null     
	//   10   16:aastore         

	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:istore_1        
	//*  15   21:goto            2
		arg_count = 0;
	//   16   24:aload_0         
	//   17   25:iconst_0        
	//   18   26:putfield        #587 <Field int arg_count>
	//   19   29:return          
	}

	protected void HandelStack()
	{
		int j = StackOpp();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #641 <Method int StackOpp()>
	//    2    4:istore_2        
		if(j < 2)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:icmpge          40
		{
			if(j == 1)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:icmpne          20
			{
				PushStack();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #644 <Method void PushStack()>
			} else
	//*  11   19:return          
			{
				int i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_1        
				while(i < j * -1) 
	//*  14   22:iload_1         
	//*  15   23:iload_2         
	//*  16   24:iconst_m1       
	//*  17   25:imul            
	//*  18   26:icmpge          19
				{
					PopStack();
	//   19   29:aload_0         
	//   20   30:invokevirtual   #647 <Method void PopStack()>
					i++;
	//   21   33:iload_1         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_1        
				}
			}
			return;
		} else
	//*  25   37:goto            22
		{
			EmptyStack();
	//   26   40:aload_0         
	//   27   41:invokevirtual   #573 <Method void EmptyStack()>
			return;
	//   28   44:return          
		}
	}

	protected void PopStack()
	{
		if(arg_count > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #587 <Field int arg_count>
	//*   2    4:ifle            29
		{
			args[arg_count - 1] = null;
	//    3    7:aload_0         
	//    4    8:getfield        #342 <Field Object[] args>
	//    5   11:aload_0         
	//    6   12:getfield        #587 <Field int arg_count>
	//    7   15:iconst_1        
	//    8   16:isub            
	//    9   17:aconst_null     
	//   10   18:aastore         
			arg_count = arg_count - 1;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #587 <Field int arg_count>
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:putfield        #587 <Field int arg_count>
		}
	//   17   29:return          
	}

	public byte[] Process(String s)
		throws IOException
	{
		buf.reOpen();
	//    0    0:aload_0         
	//    1    1:getfield        #449 <Field RandomAccessFileOrArray buf>
	//    2    4:invokevirtual   #654 <Method void RandomAccessFileOrArray.reOpen()>
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
_L2:
		int j;
		if(i < fonts.length && !s.equals(((Object) (fonts[i].name))))
			break MISSING_BLOCK_LABEL_54;
	//    5    9:iload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #228 <Field CFFFont$Font[] fonts>
	//    8   14:arraylength     
	//    9   15:icmpge          34
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #228 <Field CFFFont$Font[] fonts>
	//   13   23:iload_2         
	//   14   24:aaload          
	//   15   25:getfield        #409 <Field String CFFFont$Font.name>
	//   16   28:invokevirtual   #657 <Method boolean String.equals(Object)>
	//   17   31:ifeq            54
		j = fonts.length;
	//   18   34:aload_0         
	//   19   35:getfield        #228 <Field CFFFont$Font[] fonts>
	//   20   38:arraylength     
	//   21   39:istore_3        
		if(i == j)
	//*  22   40:iload_2         
	//*  23   41:iload_3         
	//*  24   42:icmpne          61
		{
			Exception exception;
			try
			{
				buf.close();
	//   25   45:aload_0         
	//   26   46:getfield        #449 <Field RandomAccessFileOrArray buf>
	//   27   49:invokevirtual   #660 <Method void RandomAccessFileOrArray.close()>
			}
	//*  28   52:aconst_null     
	//*  29   53:areturn         
	//*  30   54:iload_2         
	//*  31   55:iconst_1        
	//*  32   56:iadd            
	//*  33   57:istore_2        
	//*  34   58:goto            9
	//*  35   61:aload_0         
	//*  36   62:getfield        #663 <Field int gsubrIndexOffset>
	//*  37   65:iflt            81
	//*  38   68:aload_0         
	//*  39   69:aload_0         
	//*  40   70:aload_0         
	//*  41   71:getfield        #663 <Field int gsubrIndexOffset>
	//*  42   74:iload_2         
	//*  43   75:invokevirtual   #353 <Method int CalcBias(int, int)>
	//*  44   78:putfield        #211 <Field int GBias>
	//*  45   81:aload_0         
	//*  46   82:iload_2         
	//*  47   83:invokevirtual   #665 <Method void BuildNewCharString(int)>
	//*  48   86:aload_0         
	//*  49   87:iload_2         
	//*  50   88:invokevirtual   #667 <Method void BuildNewLGSubrs(int)>
	//*  51   91:aload_0         
	//*  52   92:iload_2         
	//*  53   93:invokevirtual   #669 <Method byte[] BuildNewFile(int)>
	//*  54   96:astore_1        
	//*  55   97:aload_0         
	//*  56   98:getfield        #449 <Field RandomAccessFileOrArray buf>
	//*  57  101:invokevirtual   #660 <Method void RandomAccessFileOrArray.close()>
	//*  58  104:aload_1         
	//*  59  105:areturn         
	//*  60  106:astore          4
	//*  61  108:aload_1         
	//*  62  109:areturn         
	//*  63  110:astore_1        
	//*  64  111:aload_0         
	//*  65  112:getfield        #449 <Field RandomAccessFileOrArray buf>
	//*  66  115:invokevirtual   #660 <Method void RandomAccessFileOrArray.close()>
	//*  67  118:aload_1         
	//*  68  119:athrow          
	//*  69  120:astore          4
	//*  70  122:goto            118
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  71  125:astore_1        
			{
				return null;
	//   72  126:aconst_null     
	//   73  127:areturn         
			}
			return null;
		}
		break; /* Loop/switch isn't completed */
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		if(gsubrIndexOffset >= 0)
			GBias = CalcBias(gsubrIndexOffset, i);
		BuildNewCharString(i);
		BuildNewLGSubrs(i);
		s = ((String) (BuildNewFile(i)));
		try
		{
			buf.close();
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return ((byte []) (s));
		}
		return ((byte []) (s));
		s;
		try
		{
			buf.close();
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception) { }
		throw s;
	}

	protected void PushStack()
	{
		arg_count = arg_count + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #587 <Field int arg_count>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #587 <Field int arg_count>
	//    6   10:return          
	}

	protected void ReadASubr(int i, int j, int k, int l, HashMap hashmap, ArrayList arraylist, int ai[])
	{
		EmptyStack();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #573 <Method void EmptyStack()>
		NumOfHints = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #213 <Field int NumOfHints>
		seek(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #237 <Method void seek(int)>
label0:
		do
		{
label1:
			{
				int i1;
				do
				{
					if(getPosition() >= j)
						break label0;
	//    8   14:aload_0         
	//    9   15:invokevirtual   #326 <Method int getPosition()>
	//   10   18:iload_2         
	//   11   19:icmpge          397
					ReadCommand();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #584 <Method void ReadCommand()>
					i = getPosition();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #326 <Method int getPosition()>
	//   16   30:istore_1        
					Object obj = null;
	//   17   31:aconst_null     
	//   18   32:astore          9
					if(arg_count > 0)
	//*  19   34:aload_0         
	//*  20   35:getfield        #587 <Field int arg_count>
	//*  21   38:ifle            54
						obj = args[arg_count - 1];
	//   22   41:aload_0         
	//   23   42:getfield        #342 <Field Object[] args>
	//   24   45:aload_0         
	//   25   46:getfield        #587 <Field int arg_count>
	//   26   49:iconst_1        
	//   27   50:isub            
	//   28   51:aaload          
	//   29   52:astore          9
					i1 = arg_count;
	//   30   54:aload_0         
	//   31   55:getfield        #587 <Field int arg_count>
	//   32   58:istore          8
					HandelStack();
	//   33   60:aload_0         
	//   34   61:invokevirtual   #590 <Method void HandelStack()>
					if(key == "callsubr")
	//*  35   64:aload_0         
	//*  36   65:getfield        #336 <Field String key>
	//*  37   68:ldc1            #69  <String "callsubr">
	//*  38   70:if_acmpne       157
					{
						if(i1 > 0)
	//*  39   73:iload           8
	//*  40   75:ifle            14
						{
							i1 = ((Integer)obj).intValue() + l;
	//   41   78:aload           9
	//   42   80:checkcast       #305 <Class Integer>
	//   43   83:invokevirtual   #308 <Method int Integer.intValue()>
	//   44   86:iload           4
	//   45   88:iadd            
	//   46   89:istore          8
							if(!hashmap.containsKey(((Object) (Integer.valueOf(i1)))))
	//*  47   91:aload           5
	//*  48   93:iload           8
	//*  49   95:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//*  50   98:invokevirtual   #541 <Method boolean HashMap.containsKey(Object)>
	//*  51  101:ifne            127
							{
								hashmap.put(((Object) (Integer.valueOf(i1))), ((Object) (null)));
	//   52  104:aload           5
	//   53  106:iload           8
	//   54  108:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//   55  111:aconst_null     
	//   56  112:invokevirtual   #672 <Method Object HashMap.put(Object, Object)>
	//   57  115:pop             
								arraylist.add(((Object) (Integer.valueOf(i1))));
	//   58  116:aload           6
	//   59  118:iload           8
	//   60  120:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//   61  123:invokevirtual   #673 <Method boolean ArrayList.add(Object)>
	//   62  126:pop             
							}
							CalcHints(ai[i1], ai[i1 + 1], l, k, ai);
	//   63  127:aload_0         
	//   64  128:aload           7
	//   65  130:iload           8
	//   66  132:iaload          
	//   67  133:aload           7
	//   68  135:iload           8
	//   69  137:iconst_1        
	//   70  138:iadd            
	//   71  139:iaload          
	//   72  140:iload           4
	//   73  142:iload_3         
	//   74  143:aload           7
	//   75  145:invokevirtual   #592 <Method int CalcHints(int, int, int, int, int[])>
	//   76  148:pop             
							seek(i);
	//   77  149:aload_0         
	//   78  150:iload_1         
	//   79  151:invokevirtual   #237 <Method void seek(int)>
						}
					} else
	//*  80  154:goto            14
					if(key == "callgsubr")
	//*  81  157:aload_0         
	//*  82  158:getfield        #336 <Field String key>
	//*  83  161:ldc1            #107 <String "callgsubr">
	//*  84  163:if_acmpne       259
					{
						if(i1 > 0)
	//*  85  166:iload           8
	//*  86  168:ifle            14
						{
							i1 = ((Integer)obj).intValue() + k;
	//   87  171:aload           9
	//   88  173:checkcast       #305 <Class Integer>
	//   89  176:invokevirtual   #308 <Method int Integer.intValue()>
	//   90  179:iload_3         
	//   91  180:iadd            
	//   92  181:istore          8
							if(!hGSubrsUsed.containsKey(((Object) (Integer.valueOf(i1)))))
	//*  93  183:aload_0         
	//*  94  184:getfield        #200 <Field HashMap hGSubrsUsed>
	//*  95  187:iload           8
	//*  96  189:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//*  97  192:invokevirtual   #541 <Method boolean HashMap.containsKey(Object)>
	//*  98  195:ifne            225
							{
								hGSubrsUsed.put(((Object) (Integer.valueOf(i1))), ((Object) (null)));
	//   99  198:aload_0         
	//  100  199:getfield        #200 <Field HashMap hGSubrsUsed>
	//  101  202:iload           8
	//  102  204:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//  103  207:aconst_null     
	//  104  208:invokevirtual   #672 <Method Object HashMap.put(Object, Object)>
	//  105  211:pop             
								lGSubrsUsed.add(((Object) (Integer.valueOf(i1))));
	//  106  212:aload_0         
	//  107  213:getfield        #205 <Field ArrayList lGSubrsUsed>
	//  108  216:iload           8
	//  109  218:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//  110  221:invokevirtual   #673 <Method boolean ArrayList.add(Object)>
	//  111  224:pop             
							}
							CalcHints(gsubrOffsets[i1], gsubrOffsets[i1 + 1], l, k, ai);
	//  112  225:aload_0         
	//  113  226:aload_0         
	//  114  227:getfield        #356 <Field int[] gsubrOffsets>
	//  115  230:iload           8
	//  116  232:iaload          
	//  117  233:aload_0         
	//  118  234:getfield        #356 <Field int[] gsubrOffsets>
	//  119  237:iload           8
	//  120  239:iconst_1        
	//  121  240:iadd            
	//  122  241:iaload          
	//  123  242:iload           4
	//  124  244:iload_3         
	//  125  245:aload           7
	//  126  247:invokevirtual   #592 <Method int CalcHints(int, int, int, int, int[])>
	//  127  250:pop             
							seek(i);
	//  128  251:aload_0         
	//  129  252:iload_1         
	//  130  253:invokevirtual   #237 <Method void seek(int)>
						}
					} else
	//* 131  256:goto            14
					{
						if(key != "hstem" && key != "vstem" && key != "hstemhm" && key != "vstemhm")
							continue;
	//  132  259:aload_0         
	//  133  260:getfield        #336 <Field String key>
	//  134  263:ldc1            #51  <String "hstem">
	//  135  265:if_acmpeq       295
	//  136  268:aload_0         
	//  137  269:getfield        #336 <Field String key>
	//  138  272:ldc1            #55  <String "vstem">
	//  139  274:if_acmpeq       295
	//  140  277:aload_0         
	//  141  278:getfield        #336 <Field String key>
	//  142  281:ldc1            #85  <String "hstemhm">
	//  143  283:if_acmpeq       295
	//  144  286:aload_0         
	//  145  287:getfield        #336 <Field String key>
	//  146  290:ldc1            #95  <String "vstemhm">
	//  147  292:if_acmpne       311
						NumOfHints = NumOfHints + i1 / 2;
	//  148  295:aload_0         
	//  149  296:aload_0         
	//  150  297:getfield        #213 <Field int NumOfHints>
	//  151  300:iload           8
	//  152  302:iconst_2        
	//  153  303:idiv            
	//  154  304:iadd            
	//  155  305:putfield        #213 <Field int NumOfHints>
					}
					continue label0;
	//  156  308:goto            14
				} while(key != "hintmask" && key != "cntrmask");
	//  157  311:aload_0         
	//  158  312:getfield        #336 <Field String key>
	//  159  315:ldc1            #87  <String "hintmask">
	//  160  317:if_acmpeq       329
	//  161  320:aload_0         
	//  162  321:getfield        #336 <Field String key>
	//  163  324:ldc1            #89  <String "cntrmask">
	//  164  326:if_acmpne       14
				NumOfHints = NumOfHints + i1 / 2;
	//  165  329:aload_0         
	//  166  330:aload_0         
	//  167  331:getfield        #213 <Field int NumOfHints>
	//  168  334:iload           8
	//  169  336:iconst_2        
	//  170  337:idiv            
	//  171  338:iadd            
	//  172  339:putfield        #213 <Field int NumOfHints>
				i1 = NumOfHints / 8;
	//  173  342:aload_0         
	//  174  343:getfield        #213 <Field int NumOfHints>
	//  175  346:bipush          8
	//  176  348:idiv            
	//  177  349:istore          8
				if(NumOfHints % 8 == 0)
	//* 178  351:aload_0         
	//* 179  352:getfield        #213 <Field int NumOfHints>
	//* 180  355:bipush          8
	//* 181  357:irem            
	//* 182  358:ifne            369
				{
					i = i1;
	//  183  361:iload           8
	//  184  363:istore_1        
					if(i1 != 0)
						break label1;
	//  185  364:iload           8
	//  186  366:ifne            374
				}
				i = i1 + 1;
	//  187  369:iload           8
	//  188  371:iconst_1        
	//  189  372:iadd            
	//  190  373:istore_1        
			}
			int j1 = 0;
	//  191  374:iconst_0        
	//  192  375:istore          8
			while(j1 < i) 
	//* 193  377:iload           8
	//* 194  379:iload_1         
	//* 195  380:icmpge          14
			{
				getCard8();
	//  196  383:aload_0         
	//  197  384:invokevirtual   #595 <Method char getCard8()>
	//  198  387:pop             
				j1++;
	//  199  388:iload           8
	//  200  390:iconst_1        
	//  201  391:iadd            
	//  202  392:istore          8
			}
		} while(true);
	//  203  394:goto            377
	//  204  397:return          
	}

	protected void ReadCommand()
	{
		key = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #336 <Field String key>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		do
		{
			if(i != 0)
				break;
	//    5    7:iload_1         
	//    6    8:ifne            367
			char c4 = getCard8();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #595 <Method char getCard8()>
	//    9   15:istore_3        
			if(c4 == '\034')
	//*  10   16:iload_3         
	//*  11   17:bipush          28
	//*  12   19:icmpne          63
			{
				char c = getCard8();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #595 <Method char getCard8()>
	//   15   26:istore_2        
				c4 = getCard8();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #595 <Method char getCard8()>
	//   18   31:istore_3        
				args[arg_count] = ((Object) (Integer.valueOf(c << 8 | c4)));
	//   19   32:aload_0         
	//   20   33:getfield        #342 <Field Object[] args>
	//   21   36:aload_0         
	//   22   37:getfield        #587 <Field int arg_count>
	//   23   40:iload_2         
	//   24   41:bipush          8
	//   25   43:ishl            
	//   26   44:iload_3         
	//   27   45:ior             
	//   28   46:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//   29   49:aastore         
				arg_count = arg_count + 1;
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:getfield        #587 <Field int arg_count>
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:putfield        #587 <Field int arg_count>
			} else
	//*  36   60:goto            7
			if(c4 >= ' ' && c4 <= '\366')
	//*  37   63:iload_3         
	//*  38   64:bipush          32
	//*  39   66:icmplt          106
	//*  40   69:iload_3         
	//*  41   70:sipush          246
	//*  42   73:icmpgt          106
			{
				args[arg_count] = ((Object) (Integer.valueOf(c4 - 139)));
	//   43   76:aload_0         
	//   44   77:getfield        #342 <Field Object[] args>
	//   45   80:aload_0         
	//   46   81:getfield        #587 <Field int arg_count>
	//   47   84:iload_3         
	//   48   85:sipush          139
	//   49   88:isub            
	//   50   89:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//   51   92:aastore         
				arg_count = arg_count + 1;
	//   52   93:aload_0         
	//   53   94:aload_0         
	//   54   95:getfield        #587 <Field int arg_count>
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:putfield        #587 <Field int arg_count>
			} else
	//*  58  103:goto            7
			if(c4 >= '\367' && c4 <= '\372')
	//*  59  106:iload_3         
	//*  60  107:sipush          247
	//*  61  110:icmplt          164
	//*  62  113:iload_3         
	//*  63  114:sipush          250
	//*  64  117:icmpgt          164
			{
				char c1 = getCard8();
	//   65  120:aload_0         
	//   66  121:invokevirtual   #595 <Method char getCard8()>
	//   67  124:istore_2        
				args[arg_count] = ((Object) (Integer.valueOf((c4 - 247) * 256 + c1 + 108)));
	//   68  125:aload_0         
	//   69  126:getfield        #342 <Field Object[] args>
	//   70  129:aload_0         
	//   71  130:getfield        #587 <Field int arg_count>
	//   72  133:iload_3         
	//   73  134:sipush          247
	//   74  137:isub            
	//   75  138:sipush          256
	//   76  141:imul            
	//   77  142:iload_2         
	//   78  143:iadd            
	//   79  144:bipush          108
	//   80  146:iadd            
	//   81  147:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//   82  150:aastore         
				arg_count = arg_count + 1;
	//   83  151:aload_0         
	//   84  152:aload_0         
	//   85  153:getfield        #587 <Field int arg_count>
	//   86  156:iconst_1        
	//   87  157:iadd            
	//   88  158:putfield        #587 <Field int arg_count>
			} else
	//*  89  161:goto            7
			if(c4 >= '\373' && c4 <= '\376')
	//*  90  164:iload_3         
	//*  91  165:sipush          251
	//*  92  168:icmplt          223
	//*  93  171:iload_3         
	//*  94  172:sipush          254
	//*  95  175:icmpgt          223
			{
				char c2 = getCard8();
	//   96  178:aload_0         
	//   97  179:invokevirtual   #595 <Method char getCard8()>
	//   98  182:istore_2        
				args[arg_count] = ((Object) (Integer.valueOf(-(c4 - 251) * 256 - c2 - 108)));
	//   99  183:aload_0         
	//  100  184:getfield        #342 <Field Object[] args>
	//  101  187:aload_0         
	//  102  188:getfield        #587 <Field int arg_count>
	//  103  191:iload_3         
	//  104  192:sipush          251
	//  105  195:isub            
	//  106  196:ineg            
	//  107  197:sipush          256
	//  108  200:imul            
	//  109  201:iload_2         
	//  110  202:isub            
	//  111  203:bipush          108
	//  112  205:isub            
	//  113  206:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//  114  209:aastore         
				arg_count = arg_count + 1;
	//  115  210:aload_0         
	//  116  211:aload_0         
	//  117  212:getfield        #587 <Field int arg_count>
	//  118  215:iconst_1        
	//  119  216:iadd            
	//  120  217:putfield        #587 <Field int arg_count>
			} else
	//* 121  220:goto            7
			if(c4 == '\377')
	//* 122  223:iload_3         
	//* 123  224:sipush          255
	//* 124  227:icmpne          295
			{
				char c3 = getCard8();
	//  125  230:aload_0         
	//  126  231:invokevirtual   #595 <Method char getCard8()>
	//  127  234:istore_2        
				c4 = getCard8();
	//  128  235:aload_0         
	//  129  236:invokevirtual   #595 <Method char getCard8()>
	//  130  239:istore_3        
				char c5 = getCard8();
	//  131  240:aload_0         
	//  132  241:invokevirtual   #595 <Method char getCard8()>
	//  133  244:istore          4
				char c6 = getCard8();
	//  134  246:aload_0         
	//  135  247:invokevirtual   #595 <Method char getCard8()>
	//  136  250:istore          5
				args[arg_count] = ((Object) (Integer.valueOf(c3 << 24 | c4 << 16 | c5 << 8 | c6)));
	//  137  252:aload_0         
	//  138  253:getfield        #342 <Field Object[] args>
	//  139  256:aload_0         
	//  140  257:getfield        #587 <Field int arg_count>
	//  141  260:iload_2         
	//  142  261:bipush          24
	//  143  263:ishl            
	//  144  264:iload_3         
	//  145  265:bipush          16
	//  146  267:ishl            
	//  147  268:ior             
	//  148  269:iload           4
	//  149  271:bipush          8
	//  150  273:ishl            
	//  151  274:ior             
	//  152  275:iload           5
	//  153  277:ior             
	//  154  278:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//  155  281:aastore         
				arg_count = arg_count + 1;
	//  156  282:aload_0         
	//  157  283:aload_0         
	//  158  284:getfield        #587 <Field int arg_count>
	//  159  287:iconst_1        
	//  160  288:iadd            
	//  161  289:putfield        #587 <Field int arg_count>
			} else
	//* 162  292:goto            7
			if(c4 <= '\037' && c4 != '\034')
	//* 163  295:iload_3         
	//* 164  296:bipush          31
	//* 165  298:icmpgt          7
	//* 166  301:iload_3         
	//* 167  302:bipush          28
	//* 168  304:icmpeq          7
			{
				boolean flag = true;
	//  169  307:iconst_1        
	//  170  308:istore_2        
				if(c4 == '\f')
	//* 171  309:iload_3         
	//* 172  310:bipush          12
	//* 173  312:icmpne          353
				{
					c4 = getCard8();
	//  174  315:aload_0         
	//  175  316:invokevirtual   #595 <Method char getCard8()>
	//  176  319:istore_3        
					i = ((int) (c4));
	//  177  320:iload_3         
	//  178  321:istore_1        
					if(c4 > SubrsEscapeFuncs.length - 1)
	//* 179  322:iload_3         
	//* 180  323:getstatic       #183 <Field String[] SubrsEscapeFuncs>
	//* 181  326:arraylength     
	//* 182  327:iconst_1        
	//* 183  328:isub            
	//* 184  329:icmple          339
						i = SubrsEscapeFuncs.length - 1;
	//  185  332:getstatic       #183 <Field String[] SubrsEscapeFuncs>
	//  186  335:arraylength     
	//  187  336:iconst_1        
	//  188  337:isub            
	//  189  338:istore_1        
					key = SubrsEscapeFuncs[i];
	//  190  339:aload_0         
	//  191  340:getstatic       #183 <Field String[] SubrsEscapeFuncs>
	//  192  343:iload_1         
	//  193  344:aaload          
	//  194  345:putfield        #336 <Field String key>
					i = ((int) (flag));
	//  195  348:iload_2         
	//  196  349:istore_1        
				} else
	//* 197  350:goto            7
				{
					key = SubrsFunctions[c4];
	//  198  353:aload_0         
	//  199  354:getstatic       #113 <Field String[] SubrsFunctions>
	//  200  357:iload_3         
	//  201  358:aaload          
	//  202  359:putfield        #336 <Field String key>
					i = ((int) (flag));
	//  203  362:iload_2         
	//  204  363:istore_1        
				}
			}
		} while(true);
	//  205  364:goto            7
	//  206  367:return          
	}

	protected void ReadFDArray(int i)
	{
		seek(fonts[i].fdarrayOffset);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #228 <Field CFFFont$Font[] fonts>
	//    3    5:iload_1         
	//    4    6:aaload          
	//    5    7:getfield        #484 <Field int CFFFont$Font.fdarrayOffset>
	//    6   10:invokevirtual   #237 <Method void seek(int)>
		fonts[i].FDArrayCount = ((int) (getCard16()));
	//    7   13:aload_0         
	//    8   14:getfield        #228 <Field CFFFont$Font[] fonts>
	//    9   17:iload_1         
	//   10   18:aaload          
	//   11   19:aload_0         
	//   12   20:invokevirtual   #241 <Method char getCard16()>
	//   13   23:putfield        #677 <Field int CFFFont$Font.FDArrayCount>
		fonts[i].FDArrayOffsize = ((int) (getCard8()));
	//   14   26:aload_0         
	//   15   27:getfield        #228 <Field CFFFont$Font[] fonts>
	//   16   30:iload_1         
	//   17   31:aaload          
	//   18   32:aload_0         
	//   19   33:invokevirtual   #595 <Method char getCard8()>
	//   20   36:putfield        #680 <Field int CFFFont$Font.FDArrayOffsize>
		if(fonts[i].FDArrayOffsize < 4)
	//*  21   39:aload_0         
	//*  22   40:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  23   43:iload_1         
	//*  24   44:aaload          
	//*  25   45:getfield        #680 <Field int CFFFont$Font.FDArrayOffsize>
	//*  26   48:iconst_4        
	//*  27   49:icmpge          69
		{
			CFFFont.Font font = fonts[i];
	//   28   52:aload_0         
	//   29   53:getfield        #228 <Field CFFFont$Font[] fonts>
	//   30   56:iload_1         
	//   31   57:aaload          
	//   32   58:astore_2        
			font.FDArrayOffsize = font.FDArrayOffsize + 1;
	//   33   59:aload_2         
	//   34   60:aload_2         
	//   35   61:getfield        #680 <Field int CFFFont$Font.FDArrayOffsize>
	//   36   64:iconst_1        
	//   37   65:iadd            
	//   38   66:putfield        #680 <Field int CFFFont$Font.FDArrayOffsize>
		}
		fonts[i].FDArrayOffsets = getIndex(fonts[i].fdarrayOffset);
	//   39   69:aload_0         
	//   40   70:getfield        #228 <Field CFFFont$Font[] fonts>
	//   41   73:iload_1         
	//   42   74:aaload          
	//   43   75:aload_0         
	//   44   76:aload_0         
	//   45   77:getfield        #228 <Field CFFFont$Font[] fonts>
	//   46   80:iload_1         
	//   47   81:aaload          
	//   48   82:getfield        #484 <Field int CFFFont$Font.fdarrayOffset>
	//   49   85:invokevirtual   #257 <Method int[] getIndex(int)>
	//   50   88:putfield        #683 <Field int[] CFFFont$Font.FDArrayOffsets>
	//   51   91:return          
	}

	void Reconstruct(int i)
	{
		CFFFont.DictOffsetItem adictoffsetitem[] = new CFFFont.DictOffsetItem[fonts[i].FDArrayOffsets.length - 1];
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field CFFFont$Font[] fonts>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #683 <Field int[] CFFFont$Font.FDArrayOffsets>
	//    5    9:arraylength     
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:anewarray       CFFFont.DictOffsetItem[]
	//    9   15:astore_2        
		CFFFont.IndexBaseItem aindexbaseitem[] = new CFFFont.IndexBaseItem[fonts[i].fdprivateOffsets.length];
	//   10   16:aload_0         
	//   11   17:getfield        #228 <Field CFFFont$Font[] fonts>
	//   12   20:iload_1         
	//   13   21:aaload          
	//   14   22:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   15   25:arraylength     
	//   16   26:anewarray       CFFFont.IndexBaseItem[]
	//   17   29:astore_3        
		CFFFont.DictOffsetItem adictoffsetitem1[] = new CFFFont.DictOffsetItem[fonts[i].fdprivateOffsets.length];
	//   18   30:aload_0         
	//   19   31:getfield        #228 <Field CFFFont$Font[] fonts>
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   23   39:arraylength     
	//   24   40:anewarray       CFFFont.DictOffsetItem[]
	//   25   43:astore          4
		ReconstructFDArray(i, ((CFFFont.OffsetItem []) (adictoffsetitem)));
	//   26   45:aload_0         
	//   27   46:iload_1         
	//   28   47:aload_2         
	//   29   48:invokevirtual   #687 <Method void ReconstructFDArray(int, CFFFont$OffsetItem[])>
		ReconstructPrivateDict(i, ((CFFFont.OffsetItem []) (adictoffsetitem)), aindexbaseitem, ((CFFFont.OffsetItem []) (adictoffsetitem1)));
	//   30   51:aload_0         
	//   31   52:iload_1         
	//   32   53:aload_2         
	//   33   54:aload_3         
	//   34   55:aload           4
	//   35   57:invokevirtual   #691 <Method void ReconstructPrivateDict(int, CFFFont$OffsetItem[], CFFFont$IndexBaseItem[], CFFFont$OffsetItem[])>
		ReconstructPrivateSubrs(i, aindexbaseitem, ((CFFFont.OffsetItem []) (adictoffsetitem1)));
	//   36   60:aload_0         
	//   37   61:iload_1         
	//   38   62:aload_3         
	//   39   63:aload           4
	//   40   65:invokevirtual   #695 <Method void ReconstructPrivateSubrs(int, CFFFont$IndexBaseItem[], CFFFont$OffsetItem[])>
	//   41   68:return          
	}

	void ReconstructFDArray(int i, CFFFont.OffsetItem aoffsetitem[])
	{
		BuildIndexHeader(fonts[i].FDArrayCount, fonts[i].FDArrayOffsize, 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #228 <Field CFFFont$Font[] fonts>
	//    3    5:iload_1         
	//    4    6:aaload          
	//    5    7:getfield        #677 <Field int CFFFont$Font.FDArrayCount>
	//    6   10:aload_0         
	//    7   11:getfield        #228 <Field CFFFont$Font[] fonts>
	//    8   14:iload_1         
	//    9   15:aaload          
	//   10   16:getfield        #680 <Field int CFFFont$Font.FDArrayOffsize>
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #406 <Method void BuildIndexHeader(int, int, int)>
		CFFFont.IndexOffsetItem aindexoffsetitem[] = new CFFFont.IndexOffsetItem[fonts[i].FDArrayOffsets.length - 1];
	//   13   23:aload_0         
	//   14   24:getfield        #228 <Field CFFFont$Font[] fonts>
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:getfield        #683 <Field int[] CFFFont$Font.FDArrayOffsets>
	//   18   32:arraylength     
	//   19   33:iconst_1        
	//   20   34:isub            
	//   21   35:anewarray       CFFFont.IndexOffsetItem[]
	//   22   38:astore          8
		for(int j = 0; j < fonts[i].FDArrayOffsets.length - 1; j++)
	//*  23   40:iconst_0        
	//*  24   41:istore_3        
	//*  25   42:iload_3         
	//*  26   43:aload_0         
	//*  27   44:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  28   47:iload_1         
	//*  29   48:aaload          
	//*  30   49:getfield        #683 <Field int[] CFFFont$Font.FDArrayOffsets>
	//*  31   52:arraylength     
	//*  32   53:iconst_1        
	//*  33   54:isub            
	//*  34   55:icmpge          96
		{
			aindexoffsetitem[j] = new CFFFont.IndexOffsetItem(fonts[i].FDArrayOffsize);
	//   35   58:aload           8
	//   36   60:iload_3         
	//   37   61:new             #419 <Class CFFFont$IndexOffsetItem>
	//   38   64:dup             
	//   39   65:aload_0         
	//   40   66:getfield        #228 <Field CFFFont$Font[] fonts>
	//   41   69:iload_1         
	//   42   70:aaload          
	//   43   71:getfield        #680 <Field int CFFFont$Font.FDArrayOffsize>
	//   44   74:invokespecial   #420 <Method void CFFFont$IndexOffsetItem(int)>
	//   45   77:aastore         
			OutputList.addLast(((Object) (aindexoffsetitem[j])));
	//   46   78:aload_0         
	//   47   79:getfield        #367 <Field LinkedList OutputList>
	//   48   82:aload           8
	//   49   84:iload_3         
	//   50   85:aaload          
	//   51   86:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		}

	//   52   89:iload_3         
	//   53   90:iconst_1        
	//   54   91:iadd            
	//   55   92:istore_3        
	//*  56   93:goto            42
		CFFFont.IndexBaseItem indexbaseitem = new CFFFont.IndexBaseItem();
	//   57   96:new             #422 <Class CFFFont$IndexBaseItem>
	//   58   99:dup             
	//   59  100:invokespecial   #423 <Method void CFFFont$IndexBaseItem()>
	//   60  103:astore          9
		OutputList.addLast(((Object) (indexbaseitem)));
	//   61  105:aload_0         
	//   62  106:getfield        #367 <Field LinkedList OutputList>
	//   63  109:aload           9
	//   64  111:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		for(int k = 0; k < fonts[i].FDArrayOffsets.length - 1; k++)
	//*  65  114:iconst_0        
	//*  66  115:istore_3        
	//*  67  116:iload_3         
	//*  68  117:aload_0         
	//*  69  118:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  70  121:iload_1         
	//*  71  122:aaload          
	//*  72  123:getfield        #683 <Field int[] CFFFont$Font.FDArrayOffsets>
	//*  73  126:arraylength     
	//*  74  127:iconst_1        
	//*  75  128:isub            
	//*  76  129:icmpge          369
		{
			seek(fonts[i].FDArrayOffsets[k]);
	//   77  132:aload_0         
	//   78  133:aload_0         
	//   79  134:getfield        #228 <Field CFFFont$Font[] fonts>
	//   80  137:iload_1         
	//   81  138:aaload          
	//   82  139:getfield        #683 <Field int[] CFFFont$Font.FDArrayOffsets>
	//   83  142:iload_3         
	//   84  143:iaload          
	//   85  144:invokevirtual   #237 <Method void seek(int)>
			while(getPosition() < fonts[i].FDArrayOffsets[k + 1]) 
	//*  86  147:aload_0         
	//*  87  148:invokevirtual   #326 <Method int getPosition()>
	//*  88  151:aload_0         
	//*  89  152:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  90  155:iload_1         
	//*  91  156:aaload          
	//*  92  157:getfield        #683 <Field int[] CFFFont$Font.FDArrayOffsets>
	//*  93  160:iload_3         
	//*  94  161:iconst_1        
	//*  95  162:iadd            
	//*  96  163:iaload          
	//*  97  164:icmpge          342
			{
				int l = getPosition();
	//   98  167:aload_0         
	//   99  168:invokevirtual   #326 <Method int getPosition()>
	//  100  171:istore          4
				getDictItem();
	//  101  173:aload_0         
	//  102  174:invokevirtual   #332 <Method void getDictItem()>
				int j1 = getPosition();
	//  103  177:aload_0         
	//  104  178:invokevirtual   #326 <Method int getPosition()>
	//  105  181:istore          6
				if(key == "Private")
	//* 106  183:aload_0         
	//* 107  184:getfield        #336 <Field String key>
	//* 108  187:ldc2            #436 <String "Private">
	//* 109  190:if_acmpne       314
				{
					int i1 = ((Integer)args[0]).intValue();
	//  110  193:aload_0         
	//  111  194:getfield        #342 <Field Object[] args>
	//  112  197:iconst_0        
	//  113  198:aaload          
	//  114  199:checkcast       #305 <Class Integer>
	//  115  202:invokevirtual   #308 <Method int Integer.intValue()>
	//  116  205:istore          5
					int k1 = CalcSubrOffsetSize(fonts[i].fdprivateOffsets[k], fonts[i].fdprivateLengths[k]);
	//  117  207:aload_0         
	//  118  208:aload_0         
	//  119  209:getfield        #228 <Field CFFFont$Font[] fonts>
	//  120  212:iload_1         
	//  121  213:aaload          
	//  122  214:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//  123  217:iload_3         
	//  124  218:iaload          
	//  125  219:aload_0         
	//  126  220:getfield        #228 <Field CFFFont$Font[] fonts>
	//  127  223:iload_1         
	//  128  224:aaload          
	//  129  225:getfield        #329 <Field int[] CFFFont$Font.fdprivateLengths>
	//  130  228:iload_3         
	//  131  229:iaload          
	//  132  230:invokevirtual   #607 <Method int CalcSubrOffsetSize(int, int)>
	//  133  233:istore          7
					l = i1;
	//  134  235:iload           5
	//  135  237:istore          4
					if(k1 != 0)
	//* 136  239:iload           7
	//* 137  241:ifeq            253
						l = i1 + (5 - k1);
	//  138  244:iload           5
	//  139  246:iconst_5        
	//  140  247:iload           7
	//  141  249:isub            
	//  142  250:iadd            
	//  143  251:istore          4
					OutputList.addLast(((Object) (new CFFFont.DictNumberItem(l))));
	//  144  253:aload_0         
	//  145  254:getfield        #367 <Field LinkedList OutputList>
	//  146  257:new             #428 <Class CFFFont$DictNumberItem>
	//  147  260:dup             
	//  148  261:iload           4
	//  149  263:invokespecial   #429 <Method void CFFFont$DictNumberItem(int)>
	//  150  266:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
					aoffsetitem[k] = ((CFFFont.OffsetItem) (new CFFFont.DictOffsetItem()));
	//  151  269:aload_2         
	//  152  270:iload_3         
	//  153  271:new             #425 <Class CFFFont$DictOffsetItem>
	//  154  274:dup             
	//  155  275:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//  156  278:aastore         
					OutputList.addLast(((Object) (aoffsetitem[k])));
	//  157  279:aload_0         
	//  158  280:getfield        #367 <Field LinkedList OutputList>
	//  159  283:aload_2         
	//  160  284:iload_3         
	//  161  285:aaload          
	//  162  286:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
					OutputList.addLast(((Object) (new CFFFont.UInt8Item('\022'))));
	//  163  289:aload_0         
	//  164  290:getfield        #367 <Field LinkedList OutputList>
	//  165  293:new             #380 <Class CFFFont$UInt8Item>
	//  166  296:dup             
	//  167  297:bipush          18
	//  168  299:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//  169  302:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
					seek(j1);
	//  170  305:aload_0         
	//  171  306:iload           6
	//  172  308:invokevirtual   #237 <Method void seek(int)>
				} else
	//* 173  311:goto            147
				{
					OutputList.addLast(((Object) (new CFFFont.RangeItem(buf, l, j1 - l))));
	//  174  314:aload_0         
	//  175  315:getfield        #367 <Field LinkedList OutputList>
	//  176  318:new             #445 <Class CFFFont$RangeItem>
	//  177  321:dup             
	//  178  322:aload_0         
	//  179  323:getfield        #449 <Field RandomAccessFileOrArray buf>
	//  180  326:iload           4
	//  181  328:iload           6
	//  182  330:iload           4
	//  183  332:isub            
	//  184  333:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//  185  336:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
				}
			}
	//* 186  339:goto            147
			OutputList.addLast(((Object) (new CFFFont.IndexMarkerItem(((CFFFont.OffsetItem) (aindexoffsetitem[k])), indexbaseitem))));
	//  187  342:aload_0         
	//  188  343:getfield        #367 <Field LinkedList OutputList>
	//  189  346:new             #459 <Class CFFFont$IndexMarkerItem>
	//  190  349:dup             
	//  191  350:aload           8
	//  192  352:iload_3         
	//  193  353:aaload          
	//  194  354:aload           9
	//  195  356:invokespecial   #462 <Method void CFFFont$IndexMarkerItem(CFFFont$OffsetItem, CFFFont$IndexBaseItem)>
	//  196  359:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		}

	//  197  362:iload_3         
	//  198  363:iconst_1        
	//  199  364:iadd            
	//  200  365:istore_3        
	//* 201  366:goto            116
	//  202  369:return          
	}

	void ReconstructPrivateDict(int i, CFFFont.OffsetItem aoffsetitem[], CFFFont.IndexBaseItem aindexbaseitem[], CFFFont.OffsetItem aoffsetitem1[])
	{
		for(int j = 0; j < fonts[i].fdprivateOffsets.length; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:aload_0         
	//*   4    6:getfield        #228 <Field CFFFont$Font[] fonts>
	//*   5    9:iload_1         
	//*   6   10:aaload          
	//*   7   11:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//*   8   14:arraylength     
	//*   9   15:icmpge          212
		{
			OutputList.addLast(((Object) (new CFFFont.MarkerItem(aoffsetitem[j]))));
	//   10   18:aload_0         
	//   11   19:getfield        #367 <Field LinkedList OutputList>
	//   12   22:new             #475 <Class CFFFont$MarkerItem>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:iload           5
	//   16   29:aaload          
	//   17   30:invokespecial   #478 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//   18   33:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			aindexbaseitem[j] = new CFFFont.IndexBaseItem();
	//   19   36:aload_3         
	//   20   37:iload           5
	//   21   39:new             #422 <Class CFFFont$IndexBaseItem>
	//   22   42:dup             
	//   23   43:invokespecial   #423 <Method void CFFFont$IndexBaseItem()>
	//   24   46:aastore         
			OutputList.addLast(((Object) (aindexbaseitem[j])));
	//   25   47:aload_0         
	//   26   48:getfield        #367 <Field LinkedList OutputList>
	//   27   51:aload_3         
	//   28   52:iload           5
	//   29   54:aaload          
	//   30   55:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			seek(fonts[i].fdprivateOffsets[j]);
	//   31   58:aload_0         
	//   32   59:aload_0         
	//   33   60:getfield        #228 <Field CFFFont$Font[] fonts>
	//   34   63:iload_1         
	//   35   64:aaload          
	//   36   65:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//   37   68:iload           5
	//   38   70:iaload          
	//   39   71:invokevirtual   #237 <Method void seek(int)>
			while(getPosition() < fonts[i].fdprivateOffsets[j] + fonts[i].fdprivateLengths[j]) 
	//*  40   74:aload_0         
	//*  41   75:invokevirtual   #326 <Method int getPosition()>
	//*  42   78:aload_0         
	//*  43   79:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  44   82:iload_1         
	//*  45   83:aaload          
	//*  46   84:getfield        #323 <Field int[] CFFFont$Font.fdprivateOffsets>
	//*  47   87:iload           5
	//*  48   89:iaload          
	//*  49   90:aload_0         
	//*  50   91:getfield        #228 <Field CFFFont$Font[] fonts>
	//*  51   94:iload_1         
	//*  52   95:aaload          
	//*  53   96:getfield        #329 <Field int[] CFFFont$Font.fdprivateLengths>
	//*  54   99:iload           5
	//*  55  101:iaload          
	//*  56  102:iadd            
	//*  57  103:icmpge          203
			{
				int k = getPosition();
	//   58  106:aload_0         
	//   59  107:invokevirtual   #326 <Method int getPosition()>
	//   60  110:istore          6
				getDictItem();
	//   61  112:aload_0         
	//   62  113:invokevirtual   #332 <Method void getDictItem()>
				int l = getPosition();
	//   63  116:aload_0         
	//   64  117:invokevirtual   #326 <Method int getPosition()>
	//   65  120:istore          7
				if(key == "Subrs")
	//*  66  122:aload_0         
	//*  67  123:getfield        #336 <Field String key>
	//*  68  126:ldc2            #338 <String "Subrs">
	//*  69  129:if_acmpne       175
				{
					aoffsetitem1[j] = ((CFFFont.OffsetItem) (new CFFFont.DictOffsetItem()));
	//   70  132:aload           4
	//   71  134:iload           5
	//   72  136:new             #425 <Class CFFFont$DictOffsetItem>
	//   73  139:dup             
	//   74  140:invokespecial   #426 <Method void CFFFont$DictOffsetItem()>
	//   75  143:aastore         
					OutputList.addLast(((Object) (aoffsetitem1[j])));
	//   76  144:aload_0         
	//   77  145:getfield        #367 <Field LinkedList OutputList>
	//   78  148:aload           4
	//   79  150:iload           5
	//   80  152:aaload          
	//   81  153:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
					OutputList.addLast(((Object) (new CFFFont.UInt8Item('\023'))));
	//   82  156:aload_0         
	//   83  157:getfield        #367 <Field LinkedList OutputList>
	//   84  160:new             #380 <Class CFFFont$UInt8Item>
	//   85  163:dup             
	//   86  164:bipush          19
	//   87  166:invokespecial   #381 <Method void CFFFont$UInt8Item(char)>
	//   88  169:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
				} else
	//*  89  172:goto            74
				{
					OutputList.addLast(((Object) (new CFFFont.RangeItem(buf, k, l - k))));
	//   90  175:aload_0         
	//   91  176:getfield        #367 <Field LinkedList OutputList>
	//   92  179:new             #445 <Class CFFFont$RangeItem>
	//   93  182:dup             
	//   94  183:aload_0         
	//   95  184:getfield        #449 <Field RandomAccessFileOrArray buf>
	//   96  187:iload           6
	//   97  189:iload           7
	//   98  191:iload           6
	//   99  193:isub            
	//  100  194:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//  101  197:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
				}
			}
		}

	//  102  200:goto            74
	//  103  203:iload           5
	//  104  205:iconst_1        
	//  105  206:iadd            
	//  106  207:istore          5
	//* 107  209:goto            3
	//  108  212:return          
	}

	void ReconstructPrivateSubrs(int i, CFFFont.IndexBaseItem aindexbaseitem[], CFFFont.OffsetItem aoffsetitem[])
	{
		for(int j = 0; j < fonts[i].fdprivateLengths.length; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_0         
	//*   4    6:getfield        #228 <Field CFFFont$Font[] fonts>
	//*   5    9:iload_1         
	//*   6   10:aaload          
	//*   7   11:getfield        #329 <Field int[] CFFFont$Font.fdprivateLengths>
	//*   8   14:arraylength     
	//*   9   15:icmpge          118
		{
			if(aoffsetitem[j] == null || fonts[i].PrivateSubrsOffset[j] < 0)
				continue;
	//   10   18:aload_3         
	//   11   19:iload           4
	//   12   21:aaload          
	//   13   22:ifnull          109
	//   14   25:aload_0         
	//   15   26:getfield        #228 <Field CFFFont$Font[] fonts>
	//   16   29:iload_1         
	//   17   30:aaload          
	//   18   31:getfield        #320 <Field int[] CFFFont$Font.PrivateSubrsOffset>
	//   19   34:iload           4
	//   20   36:iaload          
	//   21   37:iflt            109
			OutputList.addLast(((Object) (new CFFFont.SubrMarkerItem(aoffsetitem[j], aindexbaseitem[j]))));
	//   22   40:aload_0         
	//   23   41:getfield        #367 <Field LinkedList OutputList>
	//   24   44:new             #637 <Class CFFFont$SubrMarkerItem>
	//   25   47:dup             
	//   26   48:aload_3         
	//   27   49:iload           4
	//   28   51:aaload          
	//   29   52:aload_2         
	//   30   53:iload           4
	//   31   55:aaload          
	//   32   56:invokespecial   #638 <Method void CFFFont$SubrMarkerItem(CFFFont$OffsetItem, CFFFont$IndexBaseItem)>
	//   33   59:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
			if(NewLSubrsIndex[j] != null)
	//*  34   62:aload_0         
	//*  35   63:getfield        #559 <Field byte[][] NewLSubrsIndex>
	//*  36   66:iload           4
	//*  37   68:aaload          
	//*  38   69:ifnull          109
				OutputList.addLast(((Object) (new CFFFont.RangeItem(new RandomAccessFileOrArray(NewLSubrsIndex[j]), 0, NewLSubrsIndex[j].length))));
	//   39   72:aload_0         
	//   40   73:getfield        #367 <Field LinkedList OutputList>
	//   41   76:new             #445 <Class CFFFont$RangeItem>
	//   42   79:dup             
	//   43   80:new             #468 <Class RandomAccessFileOrArray>
	//   44   83:dup             
	//   45   84:aload_0         
	//   46   85:getfield        #559 <Field byte[][] NewLSubrsIndex>
	//   47   88:iload           4
	//   48   90:aaload          
	//   49   91:invokespecial   #473 <Method void RandomAccessFileOrArray(byte[])>
	//   50   94:iconst_0        
	//   51   95:aload_0         
	//   52   96:getfield        #559 <Field byte[][] NewLSubrsIndex>
	//   53   99:iload           4
	//   54  101:aaload          
	//   55  102:arraylength     
	//   56  103:invokespecial   #452 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//   57  106:invokevirtual   #378 <Method void LinkedList.addLast(Object)>
		}

	//   58  109:iload           4
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore          4
	//*  62  115:goto            3
	//   63  118:return          
	}

	protected int StackOpp()
	{
		if(key == "ifelse")
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field String key>
	//*   2    4:ldc1            #149 <String "ifelse">
	//*   3    6:if_acmpne       12
			return -3;
	//    4    9:bipush          -3
	//    5   11:ireturn         
		if(key == "roll" || key == "put")
	//*   6   12:aload_0         
	//*   7   13:getfield        #336 <Field String key>
	//*   8   16:ldc1            #165 <String "roll">
	//*   9   18:if_acmpeq       30
	//*  10   21:aload_0         
	//*  11   22:getfield        #336 <Field String key>
	//*  12   25:ldc1            #145 <String "put">
	//*  13   27:if_acmpne       33
			return -2;
	//   14   30:bipush          -2
	//   15   32:ireturn         
		if(key == "callsubr" || key == "callgsubr" || key == "add" || key == "sub" || key == "div" || key == "mul" || key == "drop" || key == "and" || key == "or" || key == "eq")
	//*  16   33:aload_0         
	//*  17   34:getfield        #336 <Field String key>
	//*  18   37:ldc1            #69  <String "callsubr">
	//*  19   39:if_acmpeq       123
	//*  20   42:aload_0         
	//*  21   43:getfield        #336 <Field String key>
	//*  22   46:ldc1            #107 <String "callgsubr">
	//*  23   48:if_acmpeq       123
	//*  24   51:aload_0         
	//*  25   52:getfield        #336 <Field String key>
	//*  26   55:ldc1            #131 <String "add">
	//*  27   57:if_acmpeq       123
	//*  28   60:aload_0         
	//*  29   61:getfield        #336 <Field String key>
	//*  30   64:ldc1            #133 <String "sub">
	//*  31   66:if_acmpeq       123
	//*  32   69:aload_0         
	//*  33   70:getfield        #336 <Field String key>
	//*  34   73:ldc1            #135 <String "div">
	//*  35   75:if_acmpeq       123
	//*  36   78:aload_0         
	//*  37   79:getfield        #336 <Field String key>
	//*  38   82:ldc1            #153 <String "mul">
	//*  39   84:if_acmpeq       123
	//*  40   87:aload_0         
	//*  41   88:getfield        #336 <Field String key>
	//*  42   91:ldc1            #141 <String "drop">
	//*  43   93:if_acmpeq       123
	//*  44   96:aload_0         
	//*  45   97:getfield        #336 <Field String key>
	//*  46  100:ldc1            #117 <String "and">
	//*  47  102:if_acmpeq       123
	//*  48  105:aload_0         
	//*  49  106:getfield        #336 <Field String key>
	//*  50  109:ldc1            #119 <String "or">
	//*  51  111:if_acmpeq       123
	//*  52  114:aload_0         
	//*  53  115:getfield        #336 <Field String key>
	//*  54  118:ldc1            #139 <String "eq">
	//*  55  120:if_acmpne       125
			return -1;
	//   56  123:iconst_m1       
	//   57  124:ireturn         
		if(key == "abs" || key == "neg" || key == "sqrt" || key == "exch" || key == "index" || key == "get" || key == "not" || key == "return")
	//*  58  125:aload_0         
	//*  59  126:getfield        #336 <Field String key>
	//*  60  129:ldc1            #129 <String "abs">
	//*  61  131:if_acmpeq       197
	//*  62  134:aload_0         
	//*  63  135:getfield        #336 <Field String key>
	//*  64  138:ldc1            #137 <String "neg">
	//*  65  140:if_acmpeq       197
	//*  66  143:aload_0         
	//*  67  144:getfield        #336 <Field String key>
	//*  68  147:ldc1            #157 <String "sqrt">
	//*  69  149:if_acmpeq       197
	//*  70  152:aload_0         
	//*  71  153:getfield        #336 <Field String key>
	//*  72  156:ldc1            #161 <String "exch">
	//*  73  158:if_acmpeq       197
	//*  74  161:aload_0         
	//*  75  162:getfield        #336 <Field String key>
	//*  76  165:ldc1            #163 <String "index">
	//*  77  167:if_acmpeq       197
	//*  78  170:aload_0         
	//*  79  171:getfield        #336 <Field String key>
	//*  80  174:ldc1            #147 <String "get">
	//*  81  176:if_acmpeq       197
	//*  82  179:aload_0         
	//*  83  180:getfield        #336 <Field String key>
	//*  84  183:ldc1            #121 <String "not">
	//*  85  185:if_acmpeq       197
	//*  86  188:aload_0         
	//*  87  189:getfield        #336 <Field String key>
	//*  88  192:ldc1            #71  <String "return">
	//*  89  194:if_acmpne       199
			return 0;
	//   90  197:iconst_0        
	//   91  198:ireturn         
		return key != "random" && key != "dup" ? 2 : 1;
	//   92  199:aload_0         
	//   93  200:getfield        #336 <Field String key>
	//   94  203:ldc1            #151 <String "random">
	//   95  205:if_acmpeq       217
	//   96  208:aload_0         
	//   97  209:getfield        #336 <Field String key>
	//   98  212:ldc1            #159 <String "dup">
	//   99  214:if_acmpne       219
	//  100  217:iconst_1        
	//  101  218:ireturn         
	//  102  219:iconst_2        
	//  103  220:ireturn         
	}

	protected int countEntireIndexRange(int i)
	{
		seek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #237 <Method void seek(int)>
		char c = getCard16();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #241 <Method char getCard16()>
	//    5    9:istore_2        
		if(c == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            16
		{
			return 2;
	//    8   14:iconst_2        
	//    9   15:ireturn         
		} else
		{
			char c1 = getCard8();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #595 <Method char getCard8()>
	//   12   20:istore_3        
			seek(i + 2 + 1 + c * c1);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:iconst_2        
	//   16   24:iadd            
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:iload_2         
	//   20   28:iload_3         
	//   21   29:imul            
	//   22   30:iadd            
	//   23   31:invokevirtual   #237 <Method void seek(int)>
			return (c + 1) * c1 + 3 + (getOffset(((int) (c1))) - 1);
	//   24   34:iload_2         
	//   25   35:iconst_1        
	//   26   36:iadd            
	//   27   37:iload_3         
	//   28   38:imul            
	//   29   39:iconst_3        
	//   30   40:iadd            
	//   31   41:aload_0         
	//   32   42:iload_3         
	//   33   43:invokevirtual   #700 <Method int getOffset(int)>
	//   34   46:iconst_1        
	//   35   47:isub            
	//   36   48:iadd            
	//   37   49:ireturn         
		}
	}

	protected void readFDSelect(int i)
	{
		int l;
		int ai[];
		l = fonts[i].nglyphs;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field CFFFont$Font[] fonts>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #244 <Field int CFFFont$Font.nglyphs>
	//    5    9:istore_3        
		ai = new int[l];
	//    6   10:iload_3         
	//    7   11:newarray        int[]
	//    8   13:astore          9
		seek(fonts[i].fdselectOffset);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #228 <Field CFFFont$Font[] fonts>
	//   12   20:iload_1         
	//   13   21:aaload          
	//   14   22:getfield        #264 <Field int CFFFont$Font.fdselectOffset>
	//   15   25:invokevirtual   #237 <Method void seek(int)>
		fonts[i].FDSelectFormat = ((int) (getCard8()));
	//   16   28:aload_0         
	//   17   29:getfield        #228 <Field CFFFont$Font[] fonts>
	//   18   32:iload_1         
	//   19   33:aaload          
	//   20   34:aload_0         
	//   21   35:invokevirtual   #595 <Method char getCard8()>
	//   22   38:putfield        #703 <Field int CFFFont$Font.FDSelectFormat>
		fonts[i].FDSelectFormat;
	//   23   41:aload_0         
	//   24   42:getfield        #228 <Field CFFFont$Font[] fonts>
	//   25   45:iload_1         
	//   26   46:aaload          
	//   27   47:getfield        #703 <Field int CFFFont$Font.FDSelectFormat>
		JVM INSTR tableswitch 0 3: default 80
	//	               0 92
	//	               1 80
	//	               2 80
	//	               3 137;
	//   28   50:tableswitch     0 3: default 80
	//	               0 92
	//	               1 80
	//	               2 80
	//	               3 137
		   goto _L1 _L2 _L1 _L1 _L3
_L1:
		fonts[i].FDSelect = ai;
	//   29   80:aload_0         
	//   30   81:getfield        #228 <Field CFFFont$Font[] fonts>
	//   31   84:iload_1         
	//   32   85:aaload          
	//   33   86:aload           9
	//   34   88:putfield        #296 <Field int[] CFFFont$Font.FDSelect>
		return;
	//   35   91:return          
_L2:
		for(int j = 0; j < l; j++)
	//*  36   92:iconst_0        
	//*  37   93:istore_2        
	//*  38   94:iload_2         
	//*  39   95:iload_3         
	//*  40   96:icmpge          114
			ai[j] = ((int) (getCard8()));
	//   41   99:aload           9
	//   42  101:iload_2         
	//   43  102:aload_0         
	//   44  103:invokevirtual   #595 <Method char getCard8()>
	//   45  106:iastore         

	//   46  107:iload_2         
	//   47  108:iconst_1        
	//   48  109:iadd            
	//   49  110:istore_2        
	//*  50  111:goto            94
		fonts[i].FDSelectLength = fonts[i].nglyphs + 1;
	//   51  114:aload_0         
	//   52  115:getfield        #228 <Field CFFFont$Font[] fonts>
	//   53  118:iload_1         
	//   54  119:aaload          
	//   55  120:aload_0         
	//   56  121:getfield        #228 <Field CFFFont$Font[] fonts>
	//   57  124:iload_1         
	//   58  125:aaload          
	//   59  126:getfield        #244 <Field int CFFFont$Font.nglyphs>
	//   60  129:iconst_1        
	//   61  130:iadd            
	//   62  131:putfield        #481 <Field int CFFFont$Font.FDSelectLength>
		continue; /* Loop/switch isn't completed */
	//   63  134:goto            80
_L3:
		char c2 = getCard16();
	//   64  137:aload_0         
	//   65  138:invokevirtual   #241 <Method char getCard16()>
	//   66  141:istore          7
		int i1 = 0;
	//   67  143:iconst_0        
	//   68  144:istore          4
		char c = getCard16();
	//   69  146:aload_0         
	//   70  147:invokevirtual   #241 <Method char getCard16()>
	//   71  150:istore_3        
		for(int k = 0; k < c2; k++)
	//*  72  151:iconst_0        
	//*  73  152:istore_2        
	//*  74  153:iload_2         
	//*  75  154:iload           7
	//*  76  156:icmpge          215
		{
			char c3 = getCard8();
	//   77  159:aload_0         
	//   78  160:invokevirtual   #595 <Method char getCard8()>
	//   79  163:istore          8
			char c1 = getCard16();
	//   80  165:aload_0         
	//   81  166:invokevirtual   #241 <Method char getCard16()>
	//   82  169:istore          6
			for(int j1 = 0; j1 < c1 - c; j1++)
	//*  83  171:iconst_0        
	//*  84  172:istore          5
	//*  85  174:iload           5
	//*  86  176:iload           6
	//*  87  178:iload_3         
	//*  88  179:isub            
	//*  89  180:icmpge          205
			{
				ai[i1] = ((int) (c3));
	//   90  183:aload           9
	//   91  185:iload           4
	//   92  187:iload           8
	//   93  189:iastore         
				i1++;
	//   94  190:iload           4
	//   95  192:iconst_1        
	//   96  193:iadd            
	//   97  194:istore          4
			}

	//   98  196:iload           5
	//   99  198:iconst_1        
	//  100  199:iadd            
	//  101  200:istore          5
	//* 102  202:goto            174
			c = c1;
	//  103  205:iload           6
	//  104  207:istore_3        
		}

	//  105  208:iload_2         
	//  106  209:iconst_1        
	//  107  210:iadd            
	//  108  211:istore_2        
	//* 109  212:goto            153
		fonts[i].FDSelectLength = c2 * 3 + 3 + 2;
	//  110  215:aload_0         
	//  111  216:getfield        #228 <Field CFFFont$Font[] fonts>
	//  112  219:iload_1         
	//  113  220:aaload          
	//  114  221:iload           7
	//  115  223:iconst_3        
	//  116  224:imul            
	//  117  225:iconst_3        
	//  118  226:iadd            
	//  119  227:iconst_2        
	//  120  228:iadd            
	//  121  229:putfield        #481 <Field int CFFFont$Font.FDSelectLength>
		if(true) goto _L1; else goto _L4
	//  122  232:goto            80
_L4:
	}

	static final byte ENDCHAR_OP = 14;
	static final byte RETURN_OP = 11;
	static final String SubrsEscapeFuncs[] = {
		"RESERVED_0", "RESERVED_1", "RESERVED_2", "and", "or", "not", "RESERVED_6", "RESERVED_7", "RESERVED_8", "abs", 
		"add", "sub", "div", "RESERVED_13", "neg", "eq", "RESERVED_16", "RESERVED_17", "drop", "RESERVED_19", 
		"put", "get", "ifelse", "random", "mul", "RESERVED_25", "sqrt", "dup", "exch", "index", 
		"roll", "RESERVED_31", "RESERVED_32", "RESERVED_33", "hflex", "flex", "hflex1", "flex1", "RESERVED_REST"
	};
	static final String SubrsFunctions[] = {
		"RESERVED_0", "hstem", "RESERVED_2", "vstem", "vmoveto", "rlineto", "hlineto", "vlineto", "rrcurveto", "RESERVED_9", 
		"callsubr", "return", "escape", "RESERVED_13", "endchar", "RESERVED_15", "RESERVED_16", "RESERVED_17", "hstemhm", "hintmask", 
		"cntrmask", "rmoveto", "hmoveto", "vstemhm", "rcurveline", "rlinecurve", "vvcurveto", "hhcurveto", "shortint", "callgsubr", 
		"vhcurveto", "hvcurveto"
	};
	HashSet FDArrayUsed;
	int GBias;
	HashMap GlyphsUsed;
	byte NewCharStringsIndex[];
	byte NewGSubrsIndex[];
	byte NewLSubrsIndex[][];
	byte NewSubrsIndexNonCID[];
	int NumOfHints;
	LinkedList OutputList;
	ArrayList glyphsInList;
	HashMap hGSubrsUsed;
	HashMap hSubrsUsed[];
	HashMap hSubrsUsedNonCID;
	ArrayList lGSubrsUsed;
	ArrayList lSubrsUsed[];
	ArrayList lSubrsUsedNonCID;

	static 
	{
	//    0    0:bipush          32
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #49  <String "RESERVED_0">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #51  <String "hstem">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #53  <String "RESERVED_2">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #55  <String "vstem">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #57  <String "vmoveto">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #59  <String "rlineto">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #61  <String "hlineto">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #63  <String "vlineto">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #65  <String "rrcurveto">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #67  <String "RESERVED_9">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #69  <String "callsubr">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #71  <String "return">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #73  <String "escape">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #75  <String "RESERVED_13">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #77  <String "endchar">
	//   61   88:aastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #79  <String "RESERVED_15">
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #81  <String "RESERVED_16">
	//   69  100:aastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #83  <String "RESERVED_17">
	//   73  106:aastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #85  <String "hstemhm">
	//   77  112:aastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #87  <String "hintmask">
	//   81  118:aastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #89  <String "cntrmask">
	//   85  124:aastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #91  <String "rmoveto">
	//   89  130:aastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #93  <String "hmoveto">
	//   93  136:aastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #95  <String "vstemhm">
	//   97  142:aastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #97  <String "rcurveline">
	//  101  148:aastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #99  <String "rlinecurve">
	//  105  154:aastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #101 <String "vvcurveto">
	//  109  160:aastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #103 <String "hhcurveto">
	//  113  166:aastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #105 <String "shortint">
	//  117  172:aastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #107 <String "callgsubr">
	//  121  178:aastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #109 <String "vhcurveto">
	//  125  184:aastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #111 <String "hvcurveto">
	//  129  190:aastore         
	//  130  191:putstatic       #113 <Field String[] SubrsFunctions>
	//  131  194:bipush          39
	//  132  196:anewarray       String[]
	//  133  199:dup             
	//  134  200:iconst_0        
	//  135  201:ldc1            #49  <String "RESERVED_0">
	//  136  203:aastore         
	//  137  204:dup             
	//  138  205:iconst_1        
	//  139  206:ldc1            #115 <String "RESERVED_1">
	//  140  208:aastore         
	//  141  209:dup             
	//  142  210:iconst_2        
	//  143  211:ldc1            #53  <String "RESERVED_2">
	//  144  213:aastore         
	//  145  214:dup             
	//  146  215:iconst_3        
	//  147  216:ldc1            #117 <String "and">
	//  148  218:aastore         
	//  149  219:dup             
	//  150  220:iconst_4        
	//  151  221:ldc1            #119 <String "or">
	//  152  223:aastore         
	//  153  224:dup             
	//  154  225:iconst_5        
	//  155  226:ldc1            #121 <String "not">
	//  156  228:aastore         
	//  157  229:dup             
	//  158  230:bipush          6
	//  159  232:ldc1            #123 <String "RESERVED_6">
	//  160  234:aastore         
	//  161  235:dup             
	//  162  236:bipush          7
	//  163  238:ldc1            #125 <String "RESERVED_7">
	//  164  240:aastore         
	//  165  241:dup             
	//  166  242:bipush          8
	//  167  244:ldc1            #127 <String "RESERVED_8">
	//  168  246:aastore         
	//  169  247:dup             
	//  170  248:bipush          9
	//  171  250:ldc1            #129 <String "abs">
	//  172  252:aastore         
	//  173  253:dup             
	//  174  254:bipush          10
	//  175  256:ldc1            #131 <String "add">
	//  176  258:aastore         
	//  177  259:dup             
	//  178  260:bipush          11
	//  179  262:ldc1            #133 <String "sub">
	//  180  264:aastore         
	//  181  265:dup             
	//  182  266:bipush          12
	//  183  268:ldc1            #135 <String "div">
	//  184  270:aastore         
	//  185  271:dup             
	//  186  272:bipush          13
	//  187  274:ldc1            #75  <String "RESERVED_13">
	//  188  276:aastore         
	//  189  277:dup             
	//  190  278:bipush          14
	//  191  280:ldc1            #137 <String "neg">
	//  192  282:aastore         
	//  193  283:dup             
	//  194  284:bipush          15
	//  195  286:ldc1            #139 <String "eq">
	//  196  288:aastore         
	//  197  289:dup             
	//  198  290:bipush          16
	//  199  292:ldc1            #81  <String "RESERVED_16">
	//  200  294:aastore         
	//  201  295:dup             
	//  202  296:bipush          17
	//  203  298:ldc1            #83  <String "RESERVED_17">
	//  204  300:aastore         
	//  205  301:dup             
	//  206  302:bipush          18
	//  207  304:ldc1            #141 <String "drop">
	//  208  306:aastore         
	//  209  307:dup             
	//  210  308:bipush          19
	//  211  310:ldc1            #143 <String "RESERVED_19">
	//  212  312:aastore         
	//  213  313:dup             
	//  214  314:bipush          20
	//  215  316:ldc1            #145 <String "put">
	//  216  318:aastore         
	//  217  319:dup             
	//  218  320:bipush          21
	//  219  322:ldc1            #147 <String "get">
	//  220  324:aastore         
	//  221  325:dup             
	//  222  326:bipush          22
	//  223  328:ldc1            #149 <String "ifelse">
	//  224  330:aastore         
	//  225  331:dup             
	//  226  332:bipush          23
	//  227  334:ldc1            #151 <String "random">
	//  228  336:aastore         
	//  229  337:dup             
	//  230  338:bipush          24
	//  231  340:ldc1            #153 <String "mul">
	//  232  342:aastore         
	//  233  343:dup             
	//  234  344:bipush          25
	//  235  346:ldc1            #155 <String "RESERVED_25">
	//  236  348:aastore         
	//  237  349:dup             
	//  238  350:bipush          26
	//  239  352:ldc1            #157 <String "sqrt">
	//  240  354:aastore         
	//  241  355:dup             
	//  242  356:bipush          27
	//  243  358:ldc1            #159 <String "dup">
	//  244  360:aastore         
	//  245  361:dup             
	//  246  362:bipush          28
	//  247  364:ldc1            #161 <String "exch">
	//  248  366:aastore         
	//  249  367:dup             
	//  250  368:bipush          29
	//  251  370:ldc1            #163 <String "index">
	//  252  372:aastore         
	//  253  373:dup             
	//  254  374:bipush          30
	//  255  376:ldc1            #165 <String "roll">
	//  256  378:aastore         
	//  257  379:dup             
	//  258  380:bipush          31
	//  259  382:ldc1            #167 <String "RESERVED_31">
	//  260  384:aastore         
	//  261  385:dup             
	//  262  386:bipush          32
	//  263  388:ldc1            #169 <String "RESERVED_32">
	//  264  390:aastore         
	//  265  391:dup             
	//  266  392:bipush          33
	//  267  394:ldc1            #171 <String "RESERVED_33">
	//  268  396:aastore         
	//  269  397:dup             
	//  270  398:bipush          34
	//  271  400:ldc1            #173 <String "hflex">
	//  272  402:aastore         
	//  273  403:dup             
	//  274  404:bipush          35
	//  275  406:ldc1            #175 <String "flex">
	//  276  408:aastore         
	//  277  409:dup             
	//  278  410:bipush          36
	//  279  412:ldc1            #177 <String "hflex1">
	//  280  414:aastore         
	//  281  415:dup             
	//  282  416:bipush          37
	//  283  418:ldc1            #179 <String "flex1">
	//  284  420:aastore         
	//  285  421:dup             
	//  286  422:bipush          38
	//  287  424:ldc1            #181 <String "RESERVED_REST">
	//  288  426:aastore         
	//  289  427:putstatic       #183 <Field String[] SubrsEscapeFuncs>
	//* 290  430:return          
	}
}
