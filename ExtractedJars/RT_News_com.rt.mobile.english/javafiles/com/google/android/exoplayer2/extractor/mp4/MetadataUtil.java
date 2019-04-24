// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import com.google.android.exoplayer2.metadata.id3.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			Atom

final class MetadataUtil
{

	private MetadataUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #471 <Method void Object()>
	//    2    4:return          
	}

	private static CommentFrame parseCommentAttribute(int i, ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readInt();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//    2    4:istore_2        
		if(parsablebytearray.readInt() == Atom.TYPE_data)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//*   5    9:getstatic       #484 <Field int Atom.TYPE_data>
	//*   6   12:icmpne          42
		{
			parsablebytearray.skipBytes(8);
	//    7   15:aload_1         
	//    8   16:bipush          8
	//    9   18:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
			parsablebytearray = ((ParsableByteArray) (parsablebytearray.readNullTerminatedString(j - 16)));
	//   10   21:aload_1         
	//   11   22:iload_2         
	//   12   23:bipush          16
	//   13   25:isub            
	//   14   26:invokevirtual   #492 <Method String ParsableByteArray.readNullTerminatedString(int)>
	//   15   29:astore_1        
			return new CommentFrame("und", ((String) (parsablebytearray)), ((String) (parsablebytearray)));
	//   16   30:new             #494 <Class CommentFrame>
	//   17   33:dup             
	//   18   34:ldc1            #8   <String "und">
	//   19   36:aload_1         
	//   20   37:aload_1         
	//   21   38:invokespecial   #497 <Method void CommentFrame(String, String, String)>
	//   22   41:areturn         
		} else
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   23   42:new             #499 <Class StringBuilder>
	//   24   45:dup             
	//   25   46:invokespecial   #500 <Method void StringBuilder()>
	//   26   49:astore_1        
			((StringBuilder) (parsablebytearray)).append("Failed to parse comment attribute: ");
	//   27   50:aload_1         
	//   28   51:ldc2            #502 <String "Failed to parse comment attribute: ">
	//   29   54:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			((StringBuilder) (parsablebytearray)).append(Atom.getAtomTypeString(i));
	//   31   58:aload_1         
	//   32   59:iload_0         
	//   33   60:invokestatic    #509 <Method String Atom.getAtomTypeString(int)>
	//   34   63:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			Log.w("MetadataUtil", ((StringBuilder) (parsablebytearray)).toString());
	//   36   67:ldc1            #25  <String "MetadataUtil">
	//   37   69:aload_1         
	//   38   70:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   39   73:invokestatic    #519 <Method int Log.w(String, String)>
	//   40   76:pop             
			return null;
	//   41   77:aconst_null     
	//   42   78:areturn         
		}
	}

	private static ApicFrame parseCoverArt(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//    2    4:istore_1        
		if(parsablebytearray.readInt() == Atom.TYPE_data)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//*   5    9:getstatic       #484 <Field int Atom.TYPE_data>
	//*   6   12:icmpne          125
		{
			int j = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//    9   19:invokestatic    #525 <Method int Atom.parseFullAtomFlags(int)>
	//   10   22:istore_2        
			String s;
			if(j == 13)
	//*  11   23:iload_2         
	//*  12   24:bipush          13
	//*  13   26:icmpne          36
				s = "image/jpeg";
	//   14   29:ldc2            #527 <String "image/jpeg">
	//   15   32:astore_3        
			else
	//*  16   33:goto            51
			if(j == 14)
	//*  17   36:iload_2         
	//*  18   37:bipush          14
	//*  19   39:icmpne          49
				s = "image/png";
	//   20   42:ldc2            #529 <String "image/png">
	//   21   45:astore_3        
			else
	//*  22   46:goto            51
				s = null;
	//   23   49:aconst_null     
	//   24   50:astore_3        
			if(s == null)
	//*  25   51:aload_3         
	//*  26   52:ifnonnull       89
			{
				parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   27   55:new             #499 <Class StringBuilder>
	//   28   58:dup             
	//   29   59:invokespecial   #500 <Method void StringBuilder()>
	//   30   62:astore_0        
				((StringBuilder) (parsablebytearray)).append("Unrecognized cover art flags: ");
	//   31   63:aload_0         
	//   32   64:ldc2            #531 <String "Unrecognized cover art flags: ">
	//   33   67:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
				((StringBuilder) (parsablebytearray)).append(j);
	//   35   71:aload_0         
	//   36   72:iload_2         
	//   37   73:invokevirtual   #534 <Method StringBuilder StringBuilder.append(int)>
	//   38   76:pop             
				Log.w("MetadataUtil", ((StringBuilder) (parsablebytearray)).toString());
	//   39   77:ldc1            #25  <String "MetadataUtil">
	//   40   79:aload_0         
	//   41   80:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   42   83:invokestatic    #519 <Method int Log.w(String, String)>
	//   43   86:pop             
				return null;
	//   44   87:aconst_null     
	//   45   88:areturn         
			} else
			{
				parsablebytearray.skipBytes(4);
	//   46   89:aload_0         
	//   47   90:iconst_4        
	//   48   91:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
				byte abyte0[] = new byte[i - 16];
	//   49   94:iload_1         
	//   50   95:bipush          16
	//   51   97:isub            
	//   52   98:newarray        byte[]
	//   53  100:astore          4
				parsablebytearray.readBytes(abyte0, 0, abyte0.length);
	//   54  102:aload_0         
	//   55  103:aload           4
	//   56  105:iconst_0        
	//   57  106:aload           4
	//   58  108:arraylength     
	//   59  109:invokevirtual   #538 <Method void ParsableByteArray.readBytes(byte[], int, int)>
				return new ApicFrame(s, ((String) (null)), 3, abyte0);
	//   60  112:new             #540 <Class ApicFrame>
	//   61  115:dup             
	//   62  116:aload_3         
	//   63  117:aconst_null     
	//   64  118:iconst_3        
	//   65  119:aload           4
	//   66  121:invokespecial   #543 <Method void ApicFrame(String, String, int, byte[])>
	//   67  124:areturn         
			}
		} else
		{
			Log.w("MetadataUtil", "Failed to parse cover art attribute");
	//   68  125:ldc1            #25  <String "MetadataUtil">
	//   69  127:ldc2            #545 <String "Failed to parse cover art attribute">
	//   70  130:invokestatic    #519 <Method int Log.w(String, String)>
	//   71  133:pop             
			return null;
	//   72  134:aconst_null     
	//   73  135:areturn         
		}
	}

	public static com.google.android.exoplayer2.metadata.Metadata.Entry parseIlstElement(ParsableByteArray parsablebytearray)
	{
		int i;
		int j;
		i = parsablebytearray.getPosition() + parsablebytearray.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #550 <Method int ParsableByteArray.getPosition()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//    4    8:iadd            
	//    5    9:istore_1        
		j = parsablebytearray.readInt();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//    8   14:istore_2        
		int k = j >> 24 & 0xff;
	//    9   15:iload_2         
	//   10   16:bipush          24
	//   11   18:ishr            
	//   12   19:sipush          255
	//   13   22:iand            
	//   14   23:istore_3        
		if(k == 169 || k == 65533)
	//*  15   24:iload_3         
	//*  16   25:sipush          169
	//*  17   28:icmpeq          463
	//*  18   31:iload_3         
	//*  19   32:ldc2            #551 <Int 65533>
	//*  20   35:icmpne          41
			break MISSING_BLOCK_LABEL_463;
	//   21   38:goto            463
		Object obj;
		if(j != TYPE_GENRE)
			break MISSING_BLOCK_LABEL_62;
	//   22   41:iload_2         
	//   23   42:getstatic       #103 <Field int TYPE_GENRE>
	//   24   45:icmpne          62
		obj = ((Object) (parseStandardGenreAttribute(parsablebytearray)));
	//   25   48:aload_0         
	//   26   49:invokestatic    #555 <Method TextInformationFrame parseStandardGenreAttribute(ParsableByteArray)>
	//   27   52:astore          4
		parsablebytearray.setPosition(i);
	//   28   54:aload_0         
	//   29   55:iload_1         
	//   30   56:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//   31   59:aload           4
	//   32   61:areturn         
		if(j != TYPE_DISK_NUMBER)
			break MISSING_BLOCK_LABEL_87;
	//   33   62:iload_2         
	//   34   63:getstatic       #111 <Field int TYPE_DISK_NUMBER>
	//   35   66:icmpne          87
		obj = ((Object) (parseIndexAndCountAttribute(j, "TPOS", parsablebytearray)));
	//   36   69:iload_2         
	//   37   70:ldc2            #560 <String "TPOS">
	//   38   73:aload_0         
	//   39   74:invokestatic    #564 <Method TextInformationFrame parseIndexAndCountAttribute(int, String, ParsableByteArray)>
	//   40   77:astore          4
		parsablebytearray.setPosition(i);
	//   41   79:aload_0         
	//   42   80:iload_1         
	//   43   81:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//   44   84:aload           4
	//   45   86:areturn         
		if(j != TYPE_TRACK_NUMBER)
			break MISSING_BLOCK_LABEL_112;
	//   46   87:iload_2         
	//   47   88:getstatic       #115 <Field int TYPE_TRACK_NUMBER>
	//   48   91:icmpne          112
		obj = ((Object) (parseIndexAndCountAttribute(j, "TRCK", parsablebytearray)));
	//   49   94:iload_2         
	//   50   95:ldc2            #566 <String "TRCK">
	//   51   98:aload_0         
	//   52   99:invokestatic    #564 <Method TextInformationFrame parseIndexAndCountAttribute(int, String, ParsableByteArray)>
	//   53  102:astore          4
		parsablebytearray.setPosition(i);
	//   54  104:aload_0         
	//   55  105:iload_1         
	//   56  106:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//   57  109:aload           4
	//   58  111:areturn         
		if(j != TYPE_TEMPO)
			break MISSING_BLOCK_LABEL_139;
	//   59  112:iload_2         
	//   60  113:getstatic       #119 <Field int TYPE_TEMPO>
	//   61  116:icmpne          139
		obj = ((Object) (parseUint8Attribute(j, "TBPM", parsablebytearray, true, false)));
	//   62  119:iload_2         
	//   63  120:ldc2            #568 <String "TBPM">
	//   64  123:aload_0         
	//   65  124:iconst_1        
	//   66  125:iconst_0        
	//   67  126:invokestatic    #572 <Method Id3Frame parseUint8Attribute(int, String, ParsableByteArray, boolean, boolean)>
	//   68  129:astore          4
		parsablebytearray.setPosition(i);
	//   69  131:aload_0         
	//   70  132:iload_1         
	//   71  133:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//   72  136:aload           4
	//   73  138:areturn         
		if(j != TYPE_COMPILATION)
			break MISSING_BLOCK_LABEL_166;
	//   74  139:iload_2         
	//   75  140:getstatic       #123 <Field int TYPE_COMPILATION>
	//   76  143:icmpne          166
		obj = ((Object) (parseUint8Attribute(j, "TCMP", parsablebytearray, true, true)));
	//   77  146:iload_2         
	//   78  147:ldc2            #574 <String "TCMP">
	//   79  150:aload_0         
	//   80  151:iconst_1        
	//   81  152:iconst_1        
	//   82  153:invokestatic    #572 <Method Id3Frame parseUint8Attribute(int, String, ParsableByteArray, boolean, boolean)>
	//   83  156:astore          4
		parsablebytearray.setPosition(i);
	//   84  158:aload_0         
	//   85  159:iload_1         
	//   86  160:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//   87  163:aload           4
	//   88  165:areturn         
		if(j != TYPE_COVER_ART)
			break MISSING_BLOCK_LABEL_187;
	//   89  166:iload_2         
	//   90  167:getstatic       #99  <Field int TYPE_COVER_ART>
	//   91  170:icmpne          187
		obj = ((Object) (parseCoverArt(parsablebytearray)));
	//   92  173:aload_0         
	//   93  174:invokestatic    #576 <Method ApicFrame parseCoverArt(ParsableByteArray)>
	//   94  177:astore          4
		parsablebytearray.setPosition(i);
	//   95  179:aload_0         
	//   96  180:iload_1         
	//   97  181:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//   98  184:aload           4
	//   99  186:areturn         
		if(j != TYPE_ALBUM_ARTIST)
			break MISSING_BLOCK_LABEL_212;
	//  100  187:iload_2         
	//  101  188:getstatic       #127 <Field int TYPE_ALBUM_ARTIST>
	//  102  191:icmpne          212
		obj = ((Object) (parseTextAttribute(j, "TPE2", parsablebytearray)));
	//  103  194:iload_2         
	//  104  195:ldc2            #578 <String "TPE2">
	//  105  198:aload_0         
	//  106  199:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  107  202:astore          4
		parsablebytearray.setPosition(i);
	//  108  204:aload_0         
	//  109  205:iload_1         
	//  110  206:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  111  209:aload           4
	//  112  211:areturn         
		if(j != TYPE_SORT_TRACK_NAME)
			break MISSING_BLOCK_LABEL_237;
	//  113  212:iload_2         
	//  114  213:getstatic       #131 <Field int TYPE_SORT_TRACK_NAME>
	//  115  216:icmpne          237
		obj = ((Object) (parseTextAttribute(j, "TSOT", parsablebytearray)));
	//  116  219:iload_2         
	//  117  220:ldc2            #583 <String "TSOT">
	//  118  223:aload_0         
	//  119  224:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  120  227:astore          4
		parsablebytearray.setPosition(i);
	//  121  229:aload_0         
	//  122  230:iload_1         
	//  123  231:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  124  234:aload           4
	//  125  236:areturn         
		if(j != TYPE_SORT_ALBUM)
			break MISSING_BLOCK_LABEL_262;
	//  126  237:iload_2         
	//  127  238:getstatic       #135 <Field int TYPE_SORT_ALBUM>
	//  128  241:icmpne          262
		obj = ((Object) (parseTextAttribute(j, "TSO2", parsablebytearray)));
	//  129  244:iload_2         
	//  130  245:ldc2            #585 <String "TSO2">
	//  131  248:aload_0         
	//  132  249:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  133  252:astore          4
		parsablebytearray.setPosition(i);
	//  134  254:aload_0         
	//  135  255:iload_1         
	//  136  256:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  137  259:aload           4
	//  138  261:areturn         
		if(j != TYPE_SORT_ARTIST)
			break MISSING_BLOCK_LABEL_287;
	//  139  262:iload_2         
	//  140  263:getstatic       #139 <Field int TYPE_SORT_ARTIST>
	//  141  266:icmpne          287
		obj = ((Object) (parseTextAttribute(j, "TSOA", parsablebytearray)));
	//  142  269:iload_2         
	//  143  270:ldc2            #587 <String "TSOA">
	//  144  273:aload_0         
	//  145  274:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  146  277:astore          4
		parsablebytearray.setPosition(i);
	//  147  279:aload_0         
	//  148  280:iload_1         
	//  149  281:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  150  284:aload           4
	//  151  286:areturn         
		if(j != TYPE_SORT_ALBUM_ARTIST)
			break MISSING_BLOCK_LABEL_312;
	//  152  287:iload_2         
	//  153  288:getstatic       #143 <Field int TYPE_SORT_ALBUM_ARTIST>
	//  154  291:icmpne          312
		obj = ((Object) (parseTextAttribute(j, "TSOP", parsablebytearray)));
	//  155  294:iload_2         
	//  156  295:ldc2            #589 <String "TSOP">
	//  157  298:aload_0         
	//  158  299:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  159  302:astore          4
		parsablebytearray.setPosition(i);
	//  160  304:aload_0         
	//  161  305:iload_1         
	//  162  306:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  163  309:aload           4
	//  164  311:areturn         
		if(j != TYPE_SORT_COMPOSER)
			break MISSING_BLOCK_LABEL_337;
	//  165  312:iload_2         
	//  166  313:getstatic       #147 <Field int TYPE_SORT_COMPOSER>
	//  167  316:icmpne          337
		obj = ((Object) (parseTextAttribute(j, "TSOC", parsablebytearray)));
	//  168  319:iload_2         
	//  169  320:ldc2            #591 <String "TSOC">
	//  170  323:aload_0         
	//  171  324:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  172  327:astore          4
		parsablebytearray.setPosition(i);
	//  173  329:aload_0         
	//  174  330:iload_1         
	//  175  331:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  176  334:aload           4
	//  177  336:areturn         
		if(j != TYPE_RATING)
			break MISSING_BLOCK_LABEL_364;
	//  178  337:iload_2         
	//  179  338:getstatic       #151 <Field int TYPE_RATING>
	//  180  341:icmpne          364
		obj = ((Object) (parseUint8Attribute(j, "ITUNESADVISORY", parsablebytearray, false, false)));
	//  181  344:iload_2         
	//  182  345:ldc2            #593 <String "ITUNESADVISORY">
	//  183  348:aload_0         
	//  184  349:iconst_0        
	//  185  350:iconst_0        
	//  186  351:invokestatic    #572 <Method Id3Frame parseUint8Attribute(int, String, ParsableByteArray, boolean, boolean)>
	//  187  354:astore          4
		parsablebytearray.setPosition(i);
	//  188  356:aload_0         
	//  189  357:iload_1         
	//  190  358:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  191  361:aload           4
	//  192  363:areturn         
		if(j != TYPE_GAPLESS_ALBUM)
			break MISSING_BLOCK_LABEL_391;
	//  193  364:iload_2         
	//  194  365:getstatic       #155 <Field int TYPE_GAPLESS_ALBUM>
	//  195  368:icmpne          391
		obj = ((Object) (parseUint8Attribute(j, "ITUNESGAPLESS", parsablebytearray, false, true)));
	//  196  371:iload_2         
	//  197  372:ldc2            #595 <String "ITUNESGAPLESS">
	//  198  375:aload_0         
	//  199  376:iconst_0        
	//  200  377:iconst_1        
	//  201  378:invokestatic    #572 <Method Id3Frame parseUint8Attribute(int, String, ParsableByteArray, boolean, boolean)>
	//  202  381:astore          4
		parsablebytearray.setPosition(i);
	//  203  383:aload_0         
	//  204  384:iload_1         
	//  205  385:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  206  388:aload           4
	//  207  390:areturn         
		if(j != TYPE_TV_SORT_SHOW)
			break MISSING_BLOCK_LABEL_416;
	//  208  391:iload_2         
	//  209  392:getstatic       #159 <Field int TYPE_TV_SORT_SHOW>
	//  210  395:icmpne          416
		obj = ((Object) (parseTextAttribute(j, "TVSHOWSORT", parsablebytearray)));
	//  211  398:iload_2         
	//  212  399:ldc2            #597 <String "TVSHOWSORT">
	//  213  402:aload_0         
	//  214  403:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  215  406:astore          4
		parsablebytearray.setPosition(i);
	//  216  408:aload_0         
	//  217  409:iload_1         
	//  218  410:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  219  413:aload           4
	//  220  415:areturn         
		if(j != TYPE_TV_SHOW)
			break MISSING_BLOCK_LABEL_441;
	//  221  416:iload_2         
	//  222  417:getstatic       #163 <Field int TYPE_TV_SHOW>
	//  223  420:icmpne          441
		obj = ((Object) (parseTextAttribute(j, "TVSHOW", parsablebytearray)));
	//  224  423:iload_2         
	//  225  424:ldc2            #599 <String "TVSHOW">
	//  226  427:aload_0         
	//  227  428:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  228  431:astore          4
		parsablebytearray.setPosition(i);
	//  229  433:aload_0         
	//  230  434:iload_1         
	//  231  435:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  232  438:aload           4
	//  233  440:areturn         
		if(j != TYPE_INTERNAL)
			break MISSING_BLOCK_LABEL_700;
	//  234  441:iload_2         
	//  235  442:getstatic       #167 <Field int TYPE_INTERNAL>
	//  236  445:icmpne          700
		obj = ((Object) (parseInternalAttribute(parsablebytearray, i)));
	//  237  448:aload_0         
	//  238  449:iload_1         
	//  239  450:invokestatic    #603 <Method Id3Frame parseInternalAttribute(ParsableByteArray, int)>
	//  240  453:astore          4
		parsablebytearray.setPosition(i);
	//  241  455:aload_0         
	//  242  456:iload_1         
	//  243  457:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  244  460:aload           4
	//  245  462:areturn         
		int l = 0xffffff & j;
	//  246  463:ldc2            #604 <Int 0xffffff>
	//  247  466:iload_2         
	//  248  467:iand            
	//  249  468:istore_3        
		if(l != SHORT_TYPE_COMMENT)
			break MISSING_BLOCK_LABEL_491;
	//  250  469:iload_3         
	//  251  470:getstatic       #63  <Field int SHORT_TYPE_COMMENT>
	//  252  473:icmpne          491
		obj = ((Object) (parseCommentAttribute(j, parsablebytearray)));
	//  253  476:iload_2         
	//  254  477:aload_0         
	//  255  478:invokestatic    #606 <Method CommentFrame parseCommentAttribute(int, ParsableByteArray)>
	//  256  481:astore          4
		parsablebytearray.setPosition(i);
	//  257  483:aload_0         
	//  258  484:iload_1         
	//  259  485:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  260  488:aload           4
	//  261  490:areturn         
		if(l == SHORT_TYPE_NAME_1 || l == SHORT_TYPE_NAME_2)
	//* 262  491:iload_3         
	//* 263  492:getstatic       #55  <Field int SHORT_TYPE_NAME_1>
	//* 264  495:icmpeq          764
	//* 265  498:iload_3         
	//* 266  499:getstatic       #59  <Field int SHORT_TYPE_NAME_2>
	//* 267  502:icmpne          508
			break MISSING_BLOCK_LABEL_764;
	//  268  505:goto            764
		if(l == SHORT_TYPE_COMPOSER_1 || l == SHORT_TYPE_COMPOSER_2)
	//* 269  508:iload_3         
	//* 270  509:getstatic       #83  <Field int SHORT_TYPE_COMPOSER_1>
	//* 271  512:icmpeq          746
	//* 272  515:iload_3         
	//* 273  516:getstatic       #87  <Field int SHORT_TYPE_COMPOSER_2>
	//* 274  519:icmpne          525
			break MISSING_BLOCK_LABEL_746;
	//  275  522:goto            746
		if(l != SHORT_TYPE_YEAR)
			break MISSING_BLOCK_LABEL_550;
	//  276  525:iload_3         
	//  277  526:getstatic       #67  <Field int SHORT_TYPE_YEAR>
	//  278  529:icmpne          550
		obj = ((Object) (parseTextAttribute(j, "TDRC", parsablebytearray)));
	//  279  532:iload_2         
	//  280  533:ldc2            #608 <String "TDRC">
	//  281  536:aload_0         
	//  282  537:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  283  540:astore          4
		parsablebytearray.setPosition(i);
	//  284  542:aload_0         
	//  285  543:iload_1         
	//  286  544:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  287  547:aload           4
	//  288  549:areturn         
		if(l != SHORT_TYPE_ARTIST)
			break MISSING_BLOCK_LABEL_575;
	//  289  550:iload_3         
	//  290  551:getstatic       #71  <Field int SHORT_TYPE_ARTIST>
	//  291  554:icmpne          575
		obj = ((Object) (parseTextAttribute(j, "TPE1", parsablebytearray)));
	//  292  557:iload_2         
	//  293  558:ldc2            #610 <String "TPE1">
	//  294  561:aload_0         
	//  295  562:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  296  565:astore          4
		parsablebytearray.setPosition(i);
	//  297  567:aload_0         
	//  298  568:iload_1         
	//  299  569:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  300  572:aload           4
	//  301  574:areturn         
		if(l != SHORT_TYPE_ENCODER)
			break MISSING_BLOCK_LABEL_600;
	//  302  575:iload_3         
	//  303  576:getstatic       #75  <Field int SHORT_TYPE_ENCODER>
	//  304  579:icmpne          600
		obj = ((Object) (parseTextAttribute(j, "TSSE", parsablebytearray)));
	//  305  582:iload_2         
	//  306  583:ldc2            #612 <String "TSSE">
	//  307  586:aload_0         
	//  308  587:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  309  590:astore          4
		parsablebytearray.setPosition(i);
	//  310  592:aload_0         
	//  311  593:iload_1         
	//  312  594:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  313  597:aload           4
	//  314  599:areturn         
		if(l != SHORT_TYPE_ALBUM)
			break MISSING_BLOCK_LABEL_625;
	//  315  600:iload_3         
	//  316  601:getstatic       #79  <Field int SHORT_TYPE_ALBUM>
	//  317  604:icmpne          625
		obj = ((Object) (parseTextAttribute(j, "TALB", parsablebytearray)));
	//  318  607:iload_2         
	//  319  608:ldc2            #614 <String "TALB">
	//  320  611:aload_0         
	//  321  612:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  322  615:astore          4
		parsablebytearray.setPosition(i);
	//  323  617:aload_0         
	//  324  618:iload_1         
	//  325  619:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  326  622:aload           4
	//  327  624:areturn         
		if(l != SHORT_TYPE_LYRICS)
			break MISSING_BLOCK_LABEL_650;
	//  328  625:iload_3         
	//  329  626:getstatic       #91  <Field int SHORT_TYPE_LYRICS>
	//  330  629:icmpne          650
		obj = ((Object) (parseTextAttribute(j, "USLT", parsablebytearray)));
	//  331  632:iload_2         
	//  332  633:ldc2            #616 <String "USLT">
	//  333  636:aload_0         
	//  334  637:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  335  640:astore          4
		parsablebytearray.setPosition(i);
	//  336  642:aload_0         
	//  337  643:iload_1         
	//  338  644:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  339  647:aload           4
	//  340  649:areturn         
		if(l != SHORT_TYPE_GENRE)
			break MISSING_BLOCK_LABEL_675;
	//  341  650:iload_3         
	//  342  651:getstatic       #95  <Field int SHORT_TYPE_GENRE>
	//  343  654:icmpne          675
		obj = ((Object) (parseTextAttribute(j, "TCON", parsablebytearray)));
	//  344  657:iload_2         
	//  345  658:ldc2            #618 <String "TCON">
	//  346  661:aload_0         
	//  347  662:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  348  665:astore          4
		parsablebytearray.setPosition(i);
	//  349  667:aload_0         
	//  350  668:iload_1         
	//  351  669:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  352  672:aload           4
	//  353  674:areturn         
		if(l != TYPE_GROUPING)
			break MISSING_BLOCK_LABEL_700;
	//  354  675:iload_3         
	//  355  676:getstatic       #107 <Field int TYPE_GROUPING>
	//  356  679:icmpne          700
		obj = ((Object) (parseTextAttribute(j, "TIT1", parsablebytearray)));
	//  357  682:iload_2         
	//  358  683:ldc2            #620 <String "TIT1">
	//  359  686:aload_0         
	//  360  687:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  361  690:astore          4
		parsablebytearray.setPosition(i);
	//  362  692:aload_0         
	//  363  693:iload_1         
	//  364  694:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  365  697:aload           4
	//  366  699:areturn         
		obj = ((Object) (new StringBuilder()));
	//  367  700:new             #499 <Class StringBuilder>
	//  368  703:dup             
	//  369  704:invokespecial   #500 <Method void StringBuilder()>
	//  370  707:astore          4
		((StringBuilder) (obj)).append("Skipped unknown metadata entry: ");
	//  371  709:aload           4
	//  372  711:ldc2            #622 <String "Skipped unknown metadata entry: ">
	//  373  714:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//  374  717:pop             
		((StringBuilder) (obj)).append(Atom.getAtomTypeString(j));
	//  375  718:aload           4
	//  376  720:iload_2         
	//  377  721:invokestatic    #509 <Method String Atom.getAtomTypeString(int)>
	//  378  724:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//  379  727:pop             
		Log.d("MetadataUtil", ((StringBuilder) (obj)).toString());
	//  380  728:ldc1            #25  <String "MetadataUtil">
	//  381  730:aload           4
	//  382  732:invokevirtual   #513 <Method String StringBuilder.toString()>
	//  383  735:invokestatic    #625 <Method int Log.d(String, String)>
	//  384  738:pop             
		parsablebytearray.setPosition(i);
	//  385  739:aload_0         
	//  386  740:iload_1         
	//  387  741:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return null;
	//  388  744:aconst_null     
	//  389  745:areturn         
		obj = ((Object) (parseTextAttribute(j, "TCOM", parsablebytearray)));
	//  390  746:iload_2         
	//  391  747:ldc2            #627 <String "TCOM">
	//  392  750:aload_0         
	//  393  751:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  394  754:astore          4
		parsablebytearray.setPosition(i);
	//  395  756:aload_0         
	//  396  757:iload_1         
	//  397  758:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  398  761:aload           4
	//  399  763:areturn         
		obj = ((Object) (parseTextAttribute(j, "TIT2", parsablebytearray)));
	//  400  764:iload_2         
	//  401  765:ldc2            #629 <String "TIT2">
	//  402  768:aload_0         
	//  403  769:invokestatic    #581 <Method TextInformationFrame parseTextAttribute(int, String, ParsableByteArray)>
	//  404  772:astore          4
		parsablebytearray.setPosition(i);
	//  405  774:aload_0         
	//  406  775:iload_1         
	//  407  776:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		return ((com.google.android.exoplayer2.metadata.Metadata.Entry) (obj));
	//  408  779:aload           4
	//  409  781:areturn         
		Exception exception;
		exception;
	//  410  782:astore          4
		parsablebytearray.setPosition(i);
	//  411  784:aload_0         
	//  412  785:iload_1         
	//  413  786:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
		throw exception;
	//  414  789:aload           4
	//  415  791:athrow          
	}

	private static TextInformationFrame parseIndexAndCountAttribute(int i, String s, ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readInt();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//    2    4:istore_3        
		if(parsablebytearray.readInt() == Atom.TYPE_data && j >= 22)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//*   5    9:getstatic       #484 <Field int Atom.TYPE_data>
	//*   6   12:icmpne          125
	//*   7   15:iload_3         
	//*   8   16:bipush          22
	//*   9   18:icmplt          125
		{
			parsablebytearray.skipBytes(10);
	//   10   21:aload_2         
	//   11   22:bipush          10
	//   12   24:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
			int k = parsablebytearray.readUnsignedShort();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #632 <Method int ParsableByteArray.readUnsignedShort()>
	//   15   31:istore_3        
			if(k > 0)
	//*  16   32:iload_3         
	//*  17   33:ifle            125
			{
				Object obj = ((Object) (new StringBuilder()));
	//   18   36:new             #499 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #500 <Method void StringBuilder()>
	//   21   43:astore          4
				((StringBuilder) (obj)).append("");
	//   22   45:aload           4
	//   23   47:ldc2            #634 <String "">
	//   24   50:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
				((StringBuilder) (obj)).append(k);
	//   26   54:aload           4
	//   27   56:iload_3         
	//   28   57:invokevirtual   #534 <Method StringBuilder StringBuilder.append(int)>
	//   29   60:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   30   61:aload           4
	//   31   63:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   32   66:astore          4
				i = parsablebytearray.readUnsignedShort();
	//   33   68:aload_2         
	//   34   69:invokevirtual   #632 <Method int ParsableByteArray.readUnsignedShort()>
	//   35   72:istore_0        
				parsablebytearray = ((ParsableByteArray) (obj));
	//   36   73:aload           4
	//   37   75:astore_2        
				if(i > 0)
	//*  38   76:iload_0         
	//*  39   77:ifle            114
				{
					parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   40   80:new             #499 <Class StringBuilder>
	//   41   83:dup             
	//   42   84:invokespecial   #500 <Method void StringBuilder()>
	//   43   87:astore_2        
					((StringBuilder) (parsablebytearray)).append(((String) (obj)));
	//   44   88:aload_2         
	//   45   89:aload           4
	//   46   91:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
					((StringBuilder) (parsablebytearray)).append("/");
	//   48   95:aload_2         
	//   49   96:ldc2            #636 <String "/">
	//   50   99:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
					((StringBuilder) (parsablebytearray)).append(i);
	//   52  103:aload_2         
	//   53  104:iload_0         
	//   54  105:invokevirtual   #534 <Method StringBuilder StringBuilder.append(int)>
	//   55  108:pop             
					parsablebytearray = ((ParsableByteArray) (((StringBuilder) (parsablebytearray)).toString()));
	//   56  109:aload_2         
	//   57  110:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   58  113:astore_2        
				}
				return new TextInformationFrame(s, ((String) (null)), ((String) (parsablebytearray)));
	//   59  114:new             #638 <Class TextInformationFrame>
	//   60  117:dup             
	//   61  118:aload_1         
	//   62  119:aconst_null     
	//   63  120:aload_2         
	//   64  121:invokespecial   #639 <Method void TextInformationFrame(String, String, String)>
	//   65  124:areturn         
			}
		}
		s = ((String) (new StringBuilder()));
	//   66  125:new             #499 <Class StringBuilder>
	//   67  128:dup             
	//   68  129:invokespecial   #500 <Method void StringBuilder()>
	//   69  132:astore_1        
		((StringBuilder) (s)).append("Failed to parse index/count attribute: ");
	//   70  133:aload_1         
	//   71  134:ldc2            #641 <String "Failed to parse index/count attribute: ">
	//   72  137:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   73  140:pop             
		((StringBuilder) (s)).append(Atom.getAtomTypeString(i));
	//   74  141:aload_1         
	//   75  142:iload_0         
	//   76  143:invokestatic    #509 <Method String Atom.getAtomTypeString(int)>
	//   77  146:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   78  149:pop             
		Log.w("MetadataUtil", ((StringBuilder) (s)).toString());
	//   79  150:ldc1            #25  <String "MetadataUtil">
	//   80  152:aload_1         
	//   81  153:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   82  156:invokestatic    #519 <Method int Log.w(String, String)>
	//   83  159:pop             
		return null;
	//   84  160:aconst_null     
	//   85  161:areturn         
	}

	private static Id3Frame parseInternalAttribute(ParsableByteArray parsablebytearray, int i)
	{
		int k = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_3        
		int j = k;
	//    2    2:iload_3         
	//    3    3:istore_2        
		String s1 = null;
	//    4    4:aconst_null     
	//    5    5:astore          8
		String s = s1;
	//    6    7:aload           8
	//    7    9:astore          7
		while(parsablebytearray.getPosition() < i) 
	//*   8   11:aload_0         
	//*   9   12:invokevirtual   #550 <Method int ParsableByteArray.getPosition()>
	//*  10   15:iload_1         
	//*  11   16:icmpge          112
		{
			int i1 = parsablebytearray.getPosition();
	//   12   19:aload_0         
	//   13   20:invokevirtual   #550 <Method int ParsableByteArray.getPosition()>
	//   14   23:istore          5
			int l = parsablebytearray.readInt();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//   17   29:istore          4
			int j1 = parsablebytearray.readInt();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//   20   35:istore          6
			parsablebytearray.skipBytes(4);
	//   21   37:aload_0         
	//   22   38:iconst_4        
	//   23   39:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
			if(j1 == Atom.TYPE_mean)
	//*  24   42:iload           6
	//*  25   44:getstatic       #644 <Field int Atom.TYPE_mean>
	//*  26   47:icmpne          64
				s1 = parsablebytearray.readNullTerminatedString(l - 12);
	//   27   50:aload_0         
	//   28   51:iload           4
	//   29   53:bipush          12
	//   30   55:isub            
	//   31   56:invokevirtual   #492 <Method String ParsableByteArray.readNullTerminatedString(int)>
	//   32   59:astore          8
			else
	//*  33   61:goto            11
			if(j1 == Atom.TYPE_name)
	//*  34   64:iload           6
	//*  35   66:getstatic       #647 <Field int Atom.TYPE_name>
	//*  36   69:icmpne          86
			{
				s = parsablebytearray.readNullTerminatedString(l - 12);
	//   37   72:aload_0         
	//   38   73:iload           4
	//   39   75:bipush          12
	//   40   77:isub            
	//   41   78:invokevirtual   #492 <Method String ParsableByteArray.readNullTerminatedString(int)>
	//   42   81:astore          7
			} else
	//*  43   83:goto            11
			{
				if(j1 == Atom.TYPE_data)
	//*  44   86:iload           6
	//*  45   88:getstatic       #484 <Field int Atom.TYPE_data>
	//*  46   91:icmpne          100
				{
					k = i1;
	//   47   94:iload           5
	//   48   96:istore_3        
					j = l;
	//   49   97:iload           4
	//   50   99:istore_2        
				}
				parsablebytearray.skipBytes(l - 12);
	//   51  100:aload_0         
	//   52  101:iload           4
	//   53  103:bipush          12
	//   54  105:isub            
	//   55  106:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
			}
		}
	//*  56  109:goto            11
		if(s1 != null && s != null)
	//*  57  112:aload           8
	//*  58  114:ifnull          160
	//*  59  117:aload           7
	//*  60  119:ifnull          160
		{
			if(k == -1)
	//*  61  122:iload_3         
	//*  62  123:iconst_m1       
	//*  63  124:icmpne          129
			{
				return null;
	//   64  127:aconst_null     
	//   65  128:areturn         
			} else
			{
				parsablebytearray.setPosition(k);
	//   66  129:aload_0         
	//   67  130:iload_3         
	//   68  131:invokevirtual   #558 <Method void ParsableByteArray.setPosition(int)>
				parsablebytearray.skipBytes(16);
	//   69  134:aload_0         
	//   70  135:bipush          16
	//   71  137:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
				return ((Id3Frame) (new InternalFrame(s1, s, parsablebytearray.readNullTerminatedString(j - 16))));
	//   72  140:new             #649 <Class InternalFrame>
	//   73  143:dup             
	//   74  144:aload           8
	//   75  146:aload           7
	//   76  148:aload_0         
	//   77  149:iload_2         
	//   78  150:bipush          16
	//   79  152:isub            
	//   80  153:invokevirtual   #492 <Method String ParsableByteArray.readNullTerminatedString(int)>
	//   81  156:invokespecial   #650 <Method void InternalFrame(String, String, String)>
	//   82  159:areturn         
			}
		} else
		{
			return null;
	//   83  160:aconst_null     
	//   84  161:areturn         
		}
	}

	private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsablebytearray)
	{
		int i = parseUint8AttributeValue(parsablebytearray);
	//    0    0:aload_0         
	//    1    1:invokestatic    #654 <Method int parseUint8AttributeValue(ParsableByteArray)>
	//    2    4:istore_1        
		if(i > 0 && i <= STANDARD_GENRES.length)
	//*   3    5:iload_1         
	//*   4    6:ifle            28
	//*   5    9:iload_1         
	//*   6   10:getstatic       #467 <Field String[] STANDARD_GENRES>
	//*   7   13:arraylength     
	//*   8   14:icmpgt          28
			parsablebytearray = ((ParsableByteArray) (STANDARD_GENRES[i - 1]));
	//    9   17:getstatic       #467 <Field String[] STANDARD_GENRES>
	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:aaload          
	//   14   24:astore_0        
		else
	//*  15   25:goto            30
			parsablebytearray = null;
	//   16   28:aconst_null     
	//   17   29:astore_0        
		if(parsablebytearray != null)
	//*  18   30:aload_0         
	//*  19   31:ifnull          47
		{
			return new TextInformationFrame("TCON", ((String) (null)), ((String) (parsablebytearray)));
	//   20   34:new             #638 <Class TextInformationFrame>
	//   21   37:dup             
	//   22   38:ldc2            #618 <String "TCON">
	//   23   41:aconst_null     
	//   24   42:aload_0         
	//   25   43:invokespecial   #639 <Method void TextInformationFrame(String, String, String)>
	//   26   46:areturn         
		} else
		{
			Log.w("MetadataUtil", "Failed to parse standard genre code");
	//   27   47:ldc1            #25  <String "MetadataUtil">
	//   28   49:ldc2            #656 <String "Failed to parse standard genre code">
	//   29   52:invokestatic    #519 <Method int Log.w(String, String)>
	//   30   55:pop             
			return null;
	//   31   56:aconst_null     
	//   32   57:areturn         
		}
	}

	private static TextInformationFrame parseTextAttribute(int i, String s, ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readInt();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//    2    4:istore_3        
		if(parsablebytearray.readInt() == Atom.TYPE_data)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//*   5    9:getstatic       #484 <Field int Atom.TYPE_data>
	//*   6   12:icmpne          39
		{
			parsablebytearray.skipBytes(8);
	//    7   15:aload_2         
	//    8   16:bipush          8
	//    9   18:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
			return new TextInformationFrame(s, ((String) (null)), parsablebytearray.readNullTerminatedString(j - 16));
	//   10   21:new             #638 <Class TextInformationFrame>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:aconst_null     
	//   14   27:aload_2         
	//   15   28:iload_3         
	//   16   29:bipush          16
	//   17   31:isub            
	//   18   32:invokevirtual   #492 <Method String ParsableByteArray.readNullTerminatedString(int)>
	//   19   35:invokespecial   #639 <Method void TextInformationFrame(String, String, String)>
	//   20   38:areturn         
		} else
		{
			s = ((String) (new StringBuilder()));
	//   21   39:new             #499 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #500 <Method void StringBuilder()>
	//   24   46:astore_1        
			((StringBuilder) (s)).append("Failed to parse text attribute: ");
	//   25   47:aload_1         
	//   26   48:ldc2            #658 <String "Failed to parse text attribute: ">
	//   27   51:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			((StringBuilder) (s)).append(Atom.getAtomTypeString(i));
	//   29   55:aload_1         
	//   30   56:iload_0         
	//   31   57:invokestatic    #509 <Method String Atom.getAtomTypeString(int)>
	//   32   60:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			Log.w("MetadataUtil", ((StringBuilder) (s)).toString());
	//   34   64:ldc1            #25  <String "MetadataUtil">
	//   35   66:aload_1         
	//   36   67:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   37   70:invokestatic    #519 <Method int Log.w(String, String)>
	//   38   73:pop             
			return null;
	//   39   74:aconst_null     
	//   40   75:areturn         
		}
	}

	private static Id3Frame parseUint8Attribute(int i, String s, ParsableByteArray parsablebytearray, boolean flag, boolean flag1)
	{
		int k = parseUint8AttributeValue(parsablebytearray);
	//    0    0:aload_2         
	//    1    1:invokestatic    #654 <Method int parseUint8AttributeValue(ParsableByteArray)>
	//    2    4:istore          6
		int j = k;
	//    3    6:iload           6
	//    4    8:istore          5
		if(flag1)
	//*   5   10:iload           4
	//*   6   12:ifeq            23
			j = Math.min(1, k);
	//    7   15:iconst_1        
	//    8   16:iload           6
	//    9   18:invokestatic    #664 <Method int Math.min(int, int)>
	//   10   21:istore          5
		if(j >= 0)
	//*  11   23:iload           5
	//*  12   25:iflt            63
		{
			if(flag)
	//*  13   28:iload_3         
	//*  14   29:ifeq            47
				return ((Id3Frame) (new TextInformationFrame(s, ((String) (null)), Integer.toString(j))));
	//   15   32:new             #638 <Class TextInformationFrame>
	//   16   35:dup             
	//   17   36:aload_1         
	//   18   37:aconst_null     
	//   19   38:iload           5
	//   20   40:invokestatic    #668 <Method String Integer.toString(int)>
	//   21   43:invokespecial   #639 <Method void TextInformationFrame(String, String, String)>
	//   22   46:areturn         
			else
				return ((Id3Frame) (new CommentFrame("und", s, Integer.toString(j))));
	//   23   47:new             #494 <Class CommentFrame>
	//   24   50:dup             
	//   25   51:ldc1            #8   <String "und">
	//   26   53:aload_1         
	//   27   54:iload           5
	//   28   56:invokestatic    #668 <Method String Integer.toString(int)>
	//   29   59:invokespecial   #497 <Method void CommentFrame(String, String, String)>
	//   30   62:areturn         
		} else
		{
			s = ((String) (new StringBuilder()));
	//   31   63:new             #499 <Class StringBuilder>
	//   32   66:dup             
	//   33   67:invokespecial   #500 <Method void StringBuilder()>
	//   34   70:astore_1        
			((StringBuilder) (s)).append("Failed to parse uint8 attribute: ");
	//   35   71:aload_1         
	//   36   72:ldc2            #670 <String "Failed to parse uint8 attribute: ">
	//   37   75:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
			((StringBuilder) (s)).append(Atom.getAtomTypeString(i));
	//   39   79:aload_1         
	//   40   80:iload_0         
	//   41   81:invokestatic    #509 <Method String Atom.getAtomTypeString(int)>
	//   42   84:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
			Log.w("MetadataUtil", ((StringBuilder) (s)).toString());
	//   44   88:ldc1            #25  <String "MetadataUtil">
	//   45   90:aload_1         
	//   46   91:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   47   94:invokestatic    #519 <Method int Log.w(String, String)>
	//   48   97:pop             
			return null;
	//   49   98:aconst_null     
	//   50   99:areturn         
		}
	}

	private static int parseUint8AttributeValue(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.skipBytes(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
		if(parsablebytearray.readInt() == Atom.TYPE_data)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #479 <Method int ParsableByteArray.readInt()>
	//*   5    9:getstatic       #484 <Field int Atom.TYPE_data>
	//*   6   12:icmpne          26
		{
			parsablebytearray.skipBytes(8);
	//    7   15:aload_0         
	//    8   16:bipush          8
	//    9   18:invokevirtual   #488 <Method void ParsableByteArray.skipBytes(int)>
			return parsablebytearray.readUnsignedByte();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #673 <Method int ParsableByteArray.readUnsignedByte()>
	//   12   25:ireturn         
		} else
		{
			Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
	//   13   26:ldc1            #25  <String "MetadataUtil">
	//   14   28:ldc2            #675 <String "Failed to parse uint8 attribute value">
	//   15   31:invokestatic    #519 <Method int Log.w(String, String)>
	//   16   34:pop             
			return -1;
	//   17   35:iconst_m1       
	//   18   36:ireturn         
		}
	}

	private static final String LANGUAGE_UNDEFINED = "und";
	private static final int SHORT_TYPE_ALBUM = Util.getIntegerCodeForString("alb");
	private static final int SHORT_TYPE_ARTIST = Util.getIntegerCodeForString("ART");
	private static final int SHORT_TYPE_COMMENT = Util.getIntegerCodeForString("cmt");
	private static final int SHORT_TYPE_COMPOSER_1 = Util.getIntegerCodeForString("com");
	private static final int SHORT_TYPE_COMPOSER_2 = Util.getIntegerCodeForString("wrt");
	private static final int SHORT_TYPE_ENCODER = Util.getIntegerCodeForString("too");
	private static final int SHORT_TYPE_GENRE = Util.getIntegerCodeForString("gen");
	private static final int SHORT_TYPE_LYRICS = Util.getIntegerCodeForString("lyr");
	private static final int SHORT_TYPE_NAME_1 = Util.getIntegerCodeForString("nam");
	private static final int SHORT_TYPE_NAME_2 = Util.getIntegerCodeForString("trk");
	private static final int SHORT_TYPE_YEAR = Util.getIntegerCodeForString("day");
	private static final String STANDARD_GENRES[] = {
		"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", 
		"New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", 
		"Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", 
		"Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", 
		"AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", 
		"Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", 
		"Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", 
		"Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", 
		"Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", 
		"Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", 
		"Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", 
		"Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", 
		"Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", 
		"Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", 
		"Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"
	};
	private static final String TAG = "MetadataUtil";
	private static final int TYPE_ALBUM_ARTIST = Util.getIntegerCodeForString("aART");
	private static final int TYPE_COMPILATION = Util.getIntegerCodeForString("cpil");
	private static final int TYPE_COVER_ART = Util.getIntegerCodeForString("covr");
	private static final int TYPE_DISK_NUMBER = Util.getIntegerCodeForString("disk");
	private static final int TYPE_GAPLESS_ALBUM = Util.getIntegerCodeForString("pgap");
	private static final int TYPE_GENRE = Util.getIntegerCodeForString("gnre");
	private static final int TYPE_GROUPING = Util.getIntegerCodeForString("grp");
	private static final int TYPE_INTERNAL = Util.getIntegerCodeForString("----");
	private static final int TYPE_RATING = Util.getIntegerCodeForString("rtng");
	private static final int TYPE_SORT_ALBUM = Util.getIntegerCodeForString("soal");
	private static final int TYPE_SORT_ALBUM_ARTIST = Util.getIntegerCodeForString("soaa");
	private static final int TYPE_SORT_ARTIST = Util.getIntegerCodeForString("soar");
	private static final int TYPE_SORT_COMPOSER = Util.getIntegerCodeForString("soco");
	private static final int TYPE_SORT_TRACK_NAME = Util.getIntegerCodeForString("sonm");
	private static final int TYPE_TEMPO = Util.getIntegerCodeForString("tmpo");
	private static final int TYPE_TRACK_NUMBER = Util.getIntegerCodeForString("trkn");
	private static final int TYPE_TV_SHOW = Util.getIntegerCodeForString("tvsh");
	private static final int TYPE_TV_SORT_SHOW = Util.getIntegerCodeForString("sosn");

	static 
	{
	//    0    0:ldc1            #47  <String "nam">
	//    1    2:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #55  <Field int SHORT_TYPE_NAME_1>
	//    3    8:ldc1            #57  <String "trk">
	//    4   10:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #59  <Field int SHORT_TYPE_NAME_2>
	//    6   16:ldc1            #61  <String "cmt">
	//    7   18:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #63  <Field int SHORT_TYPE_COMMENT>
	//    9   24:ldc1            #65  <String "day">
	//   10   26:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   11   29:putstatic       #67  <Field int SHORT_TYPE_YEAR>
	//   12   32:ldc1            #69  <String "ART">
	//   13   34:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   14   37:putstatic       #71  <Field int SHORT_TYPE_ARTIST>
	//   15   40:ldc1            #73  <String "too">
	//   16   42:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   17   45:putstatic       #75  <Field int SHORT_TYPE_ENCODER>
	//   18   48:ldc1            #77  <String "alb">
	//   19   50:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   20   53:putstatic       #79  <Field int SHORT_TYPE_ALBUM>
	//   21   56:ldc1            #81  <String "com">
	//   22   58:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   23   61:putstatic       #83  <Field int SHORT_TYPE_COMPOSER_1>
	//   24   64:ldc1            #85  <String "wrt">
	//   25   66:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   26   69:putstatic       #87  <Field int SHORT_TYPE_COMPOSER_2>
	//   27   72:ldc1            #89  <String "lyr">
	//   28   74:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   29   77:putstatic       #91  <Field int SHORT_TYPE_LYRICS>
	//   30   80:ldc1            #93  <String "gen">
	//   31   82:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   32   85:putstatic       #95  <Field int SHORT_TYPE_GENRE>
	//   33   88:ldc1            #97  <String "covr">
	//   34   90:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   35   93:putstatic       #99  <Field int TYPE_COVER_ART>
	//   36   96:ldc1            #101 <String "gnre">
	//   37   98:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   38  101:putstatic       #103 <Field int TYPE_GENRE>
	//   39  104:ldc1            #105 <String "grp">
	//   40  106:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   41  109:putstatic       #107 <Field int TYPE_GROUPING>
	//   42  112:ldc1            #109 <String "disk">
	//   43  114:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   44  117:putstatic       #111 <Field int TYPE_DISK_NUMBER>
	//   45  120:ldc1            #113 <String "trkn">
	//   46  122:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   47  125:putstatic       #115 <Field int TYPE_TRACK_NUMBER>
	//   48  128:ldc1            #117 <String "tmpo">
	//   49  130:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   50  133:putstatic       #119 <Field int TYPE_TEMPO>
	//   51  136:ldc1            #121 <String "cpil">
	//   52  138:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   53  141:putstatic       #123 <Field int TYPE_COMPILATION>
	//   54  144:ldc1            #125 <String "aART">
	//   55  146:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   56  149:putstatic       #127 <Field int TYPE_ALBUM_ARTIST>
	//   57  152:ldc1            #129 <String "sonm">
	//   58  154:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   59  157:putstatic       #131 <Field int TYPE_SORT_TRACK_NAME>
	//   60  160:ldc1            #133 <String "soal">
	//   61  162:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   62  165:putstatic       #135 <Field int TYPE_SORT_ALBUM>
	//   63  168:ldc1            #137 <String "soar">
	//   64  170:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   65  173:putstatic       #139 <Field int TYPE_SORT_ARTIST>
	//   66  176:ldc1            #141 <String "soaa">
	//   67  178:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   68  181:putstatic       #143 <Field int TYPE_SORT_ALBUM_ARTIST>
	//   69  184:ldc1            #145 <String "soco">
	//   70  186:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   71  189:putstatic       #147 <Field int TYPE_SORT_COMPOSER>
	//   72  192:ldc1            #149 <String "rtng">
	//   73  194:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   74  197:putstatic       #151 <Field int TYPE_RATING>
	//   75  200:ldc1            #153 <String "pgap">
	//   76  202:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   77  205:putstatic       #155 <Field int TYPE_GAPLESS_ALBUM>
	//   78  208:ldc1            #157 <String "sosn">
	//   79  210:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   80  213:putstatic       #159 <Field int TYPE_TV_SORT_SHOW>
	//   81  216:ldc1            #161 <String "tvsh">
	//   82  218:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   83  221:putstatic       #163 <Field int TYPE_TV_SHOW>
	//   84  224:ldc1            #165 <String "----">
	//   85  226:invokestatic    #53  <Method int Util.getIntegerCodeForString(String)>
	//   86  229:putstatic       #167 <Field int TYPE_INTERNAL>
	//   87  232:sipush          148
	//   88  235:anewarray       String[]
	//   89  238:dup             
	//   90  239:iconst_0        
	//   91  240:ldc1            #171 <String "Blues">
	//   92  242:aastore         
	//   93  243:dup             
	//   94  244:iconst_1        
	//   95  245:ldc1            #173 <String "Classic Rock">
	//   96  247:aastore         
	//   97  248:dup             
	//   98  249:iconst_2        
	//   99  250:ldc1            #175 <String "Country">
	//  100  252:aastore         
	//  101  253:dup             
	//  102  254:iconst_3        
	//  103  255:ldc1            #177 <String "Dance">
	//  104  257:aastore         
	//  105  258:dup             
	//  106  259:iconst_4        
	//  107  260:ldc1            #179 <String "Disco">
	//  108  262:aastore         
	//  109  263:dup             
	//  110  264:iconst_5        
	//  111  265:ldc1            #181 <String "Funk">
	//  112  267:aastore         
	//  113  268:dup             
	//  114  269:bipush          6
	//  115  271:ldc1            #183 <String "Grunge">
	//  116  273:aastore         
	//  117  274:dup             
	//  118  275:bipush          7
	//  119  277:ldc1            #185 <String "Hip-Hop">
	//  120  279:aastore         
	//  121  280:dup             
	//  122  281:bipush          8
	//  123  283:ldc1            #187 <String "Jazz">
	//  124  285:aastore         
	//  125  286:dup             
	//  126  287:bipush          9
	//  127  289:ldc1            #189 <String "Metal">
	//  128  291:aastore         
	//  129  292:dup             
	//  130  293:bipush          10
	//  131  295:ldc1            #191 <String "New Age">
	//  132  297:aastore         
	//  133  298:dup             
	//  134  299:bipush          11
	//  135  301:ldc1            #193 <String "Oldies">
	//  136  303:aastore         
	//  137  304:dup             
	//  138  305:bipush          12
	//  139  307:ldc1            #195 <String "Other">
	//  140  309:aastore         
	//  141  310:dup             
	//  142  311:bipush          13
	//  143  313:ldc1            #197 <String "Pop">
	//  144  315:aastore         
	//  145  316:dup             
	//  146  317:bipush          14
	//  147  319:ldc1            #199 <String "R&B">
	//  148  321:aastore         
	//  149  322:dup             
	//  150  323:bipush          15
	//  151  325:ldc1            #201 <String "Rap">
	//  152  327:aastore         
	//  153  328:dup             
	//  154  329:bipush          16
	//  155  331:ldc1            #203 <String "Reggae">
	//  156  333:aastore         
	//  157  334:dup             
	//  158  335:bipush          17
	//  159  337:ldc1            #205 <String "Rock">
	//  160  339:aastore         
	//  161  340:dup             
	//  162  341:bipush          18
	//  163  343:ldc1            #207 <String "Techno">
	//  164  345:aastore         
	//  165  346:dup             
	//  166  347:bipush          19
	//  167  349:ldc1            #209 <String "Industrial">
	//  168  351:aastore         
	//  169  352:dup             
	//  170  353:bipush          20
	//  171  355:ldc1            #211 <String "Alternative">
	//  172  357:aastore         
	//  173  358:dup             
	//  174  359:bipush          21
	//  175  361:ldc1            #213 <String "Ska">
	//  176  363:aastore         
	//  177  364:dup             
	//  178  365:bipush          22
	//  179  367:ldc1            #215 <String "Death Metal">
	//  180  369:aastore         
	//  181  370:dup             
	//  182  371:bipush          23
	//  183  373:ldc1            #217 <String "Pranks">
	//  184  375:aastore         
	//  185  376:dup             
	//  186  377:bipush          24
	//  187  379:ldc1            #219 <String "Soundtrack">
	//  188  381:aastore         
	//  189  382:dup             
	//  190  383:bipush          25
	//  191  385:ldc1            #221 <String "Euro-Techno">
	//  192  387:aastore         
	//  193  388:dup             
	//  194  389:bipush          26
	//  195  391:ldc1            #223 <String "Ambient">
	//  196  393:aastore         
	//  197  394:dup             
	//  198  395:bipush          27
	//  199  397:ldc1            #225 <String "Trip-Hop">
	//  200  399:aastore         
	//  201  400:dup             
	//  202  401:bipush          28
	//  203  403:ldc1            #227 <String "Vocal">
	//  204  405:aastore         
	//  205  406:dup             
	//  206  407:bipush          29
	//  207  409:ldc1            #229 <String "Jazz+Funk">
	//  208  411:aastore         
	//  209  412:dup             
	//  210  413:bipush          30
	//  211  415:ldc1            #231 <String "Fusion">
	//  212  417:aastore         
	//  213  418:dup             
	//  214  419:bipush          31
	//  215  421:ldc1            #233 <String "Trance">
	//  216  423:aastore         
	//  217  424:dup             
	//  218  425:bipush          32
	//  219  427:ldc1            #235 <String "Classical">
	//  220  429:aastore         
	//  221  430:dup             
	//  222  431:bipush          33
	//  223  433:ldc1            #237 <String "Instrumental">
	//  224  435:aastore         
	//  225  436:dup             
	//  226  437:bipush          34
	//  227  439:ldc1            #239 <String "Acid">
	//  228  441:aastore         
	//  229  442:dup             
	//  230  443:bipush          35
	//  231  445:ldc1            #241 <String "House">
	//  232  447:aastore         
	//  233  448:dup             
	//  234  449:bipush          36
	//  235  451:ldc1            #243 <String "Game">
	//  236  453:aastore         
	//  237  454:dup             
	//  238  455:bipush          37
	//  239  457:ldc1            #245 <String "Sound Clip">
	//  240  459:aastore         
	//  241  460:dup             
	//  242  461:bipush          38
	//  243  463:ldc1            #247 <String "Gospel">
	//  244  465:aastore         
	//  245  466:dup             
	//  246  467:bipush          39
	//  247  469:ldc1            #249 <String "Noise">
	//  248  471:aastore         
	//  249  472:dup             
	//  250  473:bipush          40
	//  251  475:ldc1            #251 <String "AlternRock">
	//  252  477:aastore         
	//  253  478:dup             
	//  254  479:bipush          41
	//  255  481:ldc1            #253 <String "Bass">
	//  256  483:aastore         
	//  257  484:dup             
	//  258  485:bipush          42
	//  259  487:ldc1            #255 <String "Soul">
	//  260  489:aastore         
	//  261  490:dup             
	//  262  491:bipush          43
	//  263  493:ldc2            #257 <String "Punk">
	//  264  496:aastore         
	//  265  497:dup             
	//  266  498:bipush          44
	//  267  500:ldc2            #259 <String "Space">
	//  268  503:aastore         
	//  269  504:dup             
	//  270  505:bipush          45
	//  271  507:ldc2            #261 <String "Meditative">
	//  272  510:aastore         
	//  273  511:dup             
	//  274  512:bipush          46
	//  275  514:ldc2            #263 <String "Instrumental Pop">
	//  276  517:aastore         
	//  277  518:dup             
	//  278  519:bipush          47
	//  279  521:ldc2            #265 <String "Instrumental Rock">
	//  280  524:aastore         
	//  281  525:dup             
	//  282  526:bipush          48
	//  283  528:ldc2            #267 <String "Ethnic">
	//  284  531:aastore         
	//  285  532:dup             
	//  286  533:bipush          49
	//  287  535:ldc2            #269 <String "Gothic">
	//  288  538:aastore         
	//  289  539:dup             
	//  290  540:bipush          50
	//  291  542:ldc2            #271 <String "Darkwave">
	//  292  545:aastore         
	//  293  546:dup             
	//  294  547:bipush          51
	//  295  549:ldc2            #273 <String "Techno-Industrial">
	//  296  552:aastore         
	//  297  553:dup             
	//  298  554:bipush          52
	//  299  556:ldc2            #275 <String "Electronic">
	//  300  559:aastore         
	//  301  560:dup             
	//  302  561:bipush          53
	//  303  563:ldc2            #277 <String "Pop-Folk">
	//  304  566:aastore         
	//  305  567:dup             
	//  306  568:bipush          54
	//  307  570:ldc2            #279 <String "Eurodance">
	//  308  573:aastore         
	//  309  574:dup             
	//  310  575:bipush          55
	//  311  577:ldc2            #281 <String "Dream">
	//  312  580:aastore         
	//  313  581:dup             
	//  314  582:bipush          56
	//  315  584:ldc2            #283 <String "Southern Rock">
	//  316  587:aastore         
	//  317  588:dup             
	//  318  589:bipush          57
	//  319  591:ldc2            #285 <String "Comedy">
	//  320  594:aastore         
	//  321  595:dup             
	//  322  596:bipush          58
	//  323  598:ldc2            #287 <String "Cult">
	//  324  601:aastore         
	//  325  602:dup             
	//  326  603:bipush          59
	//  327  605:ldc2            #289 <String "Gangsta">
	//  328  608:aastore         
	//  329  609:dup             
	//  330  610:bipush          60
	//  331  612:ldc2            #291 <String "Top 40">
	//  332  615:aastore         
	//  333  616:dup             
	//  334  617:bipush          61
	//  335  619:ldc2            #293 <String "Christian Rap">
	//  336  622:aastore         
	//  337  623:dup             
	//  338  624:bipush          62
	//  339  626:ldc2            #295 <String "Pop/Funk">
	//  340  629:aastore         
	//  341  630:dup             
	//  342  631:bipush          63
	//  343  633:ldc2            #297 <String "Jungle">
	//  344  636:aastore         
	//  345  637:dup             
	//  346  638:bipush          64
	//  347  640:ldc2            #299 <String "Native American">
	//  348  643:aastore         
	//  349  644:dup             
	//  350  645:bipush          65
	//  351  647:ldc2            #301 <String "Cabaret">
	//  352  650:aastore         
	//  353  651:dup             
	//  354  652:bipush          66
	//  355  654:ldc2            #303 <String "New Wave">
	//  356  657:aastore         
	//  357  658:dup             
	//  358  659:bipush          67
	//  359  661:ldc2            #305 <String "Psychadelic">
	//  360  664:aastore         
	//  361  665:dup             
	//  362  666:bipush          68
	//  363  668:ldc2            #307 <String "Rave">
	//  364  671:aastore         
	//  365  672:dup             
	//  366  673:bipush          69
	//  367  675:ldc2            #309 <String "Showtunes">
	//  368  678:aastore         
	//  369  679:dup             
	//  370  680:bipush          70
	//  371  682:ldc2            #311 <String "Trailer">
	//  372  685:aastore         
	//  373  686:dup             
	//  374  687:bipush          71
	//  375  689:ldc2            #313 <String "Lo-Fi">
	//  376  692:aastore         
	//  377  693:dup             
	//  378  694:bipush          72
	//  379  696:ldc2            #315 <String "Tribal">
	//  380  699:aastore         
	//  381  700:dup             
	//  382  701:bipush          73
	//  383  703:ldc2            #317 <String "Acid Punk">
	//  384  706:aastore         
	//  385  707:dup             
	//  386  708:bipush          74
	//  387  710:ldc2            #319 <String "Acid Jazz">
	//  388  713:aastore         
	//  389  714:dup             
	//  390  715:bipush          75
	//  391  717:ldc2            #321 <String "Polka">
	//  392  720:aastore         
	//  393  721:dup             
	//  394  722:bipush          76
	//  395  724:ldc2            #323 <String "Retro">
	//  396  727:aastore         
	//  397  728:dup             
	//  398  729:bipush          77
	//  399  731:ldc2            #325 <String "Musical">
	//  400  734:aastore         
	//  401  735:dup             
	//  402  736:bipush          78
	//  403  738:ldc2            #327 <String "Rock & Roll">
	//  404  741:aastore         
	//  405  742:dup             
	//  406  743:bipush          79
	//  407  745:ldc2            #329 <String "Hard Rock">
	//  408  748:aastore         
	//  409  749:dup             
	//  410  750:bipush          80
	//  411  752:ldc2            #331 <String "Folk">
	//  412  755:aastore         
	//  413  756:dup             
	//  414  757:bipush          81
	//  415  759:ldc2            #333 <String "Folk-Rock">
	//  416  762:aastore         
	//  417  763:dup             
	//  418  764:bipush          82
	//  419  766:ldc2            #335 <String "National Folk">
	//  420  769:aastore         
	//  421  770:dup             
	//  422  771:bipush          83
	//  423  773:ldc2            #337 <String "Swing">
	//  424  776:aastore         
	//  425  777:dup             
	//  426  778:bipush          84
	//  427  780:ldc2            #339 <String "Fast Fusion">
	//  428  783:aastore         
	//  429  784:dup             
	//  430  785:bipush          85
	//  431  787:ldc2            #341 <String "Bebob">
	//  432  790:aastore         
	//  433  791:dup             
	//  434  792:bipush          86
	//  435  794:ldc2            #343 <String "Latin">
	//  436  797:aastore         
	//  437  798:dup             
	//  438  799:bipush          87
	//  439  801:ldc2            #345 <String "Revival">
	//  440  804:aastore         
	//  441  805:dup             
	//  442  806:bipush          88
	//  443  808:ldc2            #347 <String "Celtic">
	//  444  811:aastore         
	//  445  812:dup             
	//  446  813:bipush          89
	//  447  815:ldc2            #349 <String "Bluegrass">
	//  448  818:aastore         
	//  449  819:dup             
	//  450  820:bipush          90
	//  451  822:ldc2            #351 <String "Avantgarde">
	//  452  825:aastore         
	//  453  826:dup             
	//  454  827:bipush          91
	//  455  829:ldc2            #353 <String "Gothic Rock">
	//  456  832:aastore         
	//  457  833:dup             
	//  458  834:bipush          92
	//  459  836:ldc2            #355 <String "Progressive Rock">
	//  460  839:aastore         
	//  461  840:dup             
	//  462  841:bipush          93
	//  463  843:ldc2            #357 <String "Psychedelic Rock">
	//  464  846:aastore         
	//  465  847:dup             
	//  466  848:bipush          94
	//  467  850:ldc2            #359 <String "Symphonic Rock">
	//  468  853:aastore         
	//  469  854:dup             
	//  470  855:bipush          95
	//  471  857:ldc2            #361 <String "Slow Rock">
	//  472  860:aastore         
	//  473  861:dup             
	//  474  862:bipush          96
	//  475  864:ldc2            #363 <String "Big Band">
	//  476  867:aastore         
	//  477  868:dup             
	//  478  869:bipush          97
	//  479  871:ldc2            #365 <String "Chorus">
	//  480  874:aastore         
	//  481  875:dup             
	//  482  876:bipush          98
	//  483  878:ldc2            #367 <String "Easy Listening">
	//  484  881:aastore         
	//  485  882:dup             
	//  486  883:bipush          99
	//  487  885:ldc2            #369 <String "Acoustic">
	//  488  888:aastore         
	//  489  889:dup             
	//  490  890:bipush          100
	//  491  892:ldc2            #371 <String "Humour">
	//  492  895:aastore         
	//  493  896:dup             
	//  494  897:bipush          101
	//  495  899:ldc2            #373 <String "Speech">
	//  496  902:aastore         
	//  497  903:dup             
	//  498  904:bipush          102
	//  499  906:ldc2            #375 <String "Chanson">
	//  500  909:aastore         
	//  501  910:dup             
	//  502  911:bipush          103
	//  503  913:ldc2            #377 <String "Opera">
	//  504  916:aastore         
	//  505  917:dup             
	//  506  918:bipush          104
	//  507  920:ldc2            #379 <String "Chamber Music">
	//  508  923:aastore         
	//  509  924:dup             
	//  510  925:bipush          105
	//  511  927:ldc2            #381 <String "Sonata">
	//  512  930:aastore         
	//  513  931:dup             
	//  514  932:bipush          106
	//  515  934:ldc2            #383 <String "Symphony">
	//  516  937:aastore         
	//  517  938:dup             
	//  518  939:bipush          107
	//  519  941:ldc2            #385 <String "Booty Bass">
	//  520  944:aastore         
	//  521  945:dup             
	//  522  946:bipush          108
	//  523  948:ldc2            #387 <String "Primus">
	//  524  951:aastore         
	//  525  952:dup             
	//  526  953:bipush          109
	//  527  955:ldc2            #389 <String "Porn Groove">
	//  528  958:aastore         
	//  529  959:dup             
	//  530  960:bipush          110
	//  531  962:ldc2            #391 <String "Satire">
	//  532  965:aastore         
	//  533  966:dup             
	//  534  967:bipush          111
	//  535  969:ldc2            #393 <String "Slow Jam">
	//  536  972:aastore         
	//  537  973:dup             
	//  538  974:bipush          112
	//  539  976:ldc2            #395 <String "Club">
	//  540  979:aastore         
	//  541  980:dup             
	//  542  981:bipush          113
	//  543  983:ldc2            #397 <String "Tango">
	//  544  986:aastore         
	//  545  987:dup             
	//  546  988:bipush          114
	//  547  990:ldc2            #399 <String "Samba">
	//  548  993:aastore         
	//  549  994:dup             
	//  550  995:bipush          115
	//  551  997:ldc2            #401 <String "Folklore">
	//  552 1000:aastore         
	//  553 1001:dup             
	//  554 1002:bipush          116
	//  555 1004:ldc2            #403 <String "Ballad">
	//  556 1007:aastore         
	//  557 1008:dup             
	//  558 1009:bipush          117
	//  559 1011:ldc2            #405 <String "Power Ballad">
	//  560 1014:aastore         
	//  561 1015:dup             
	//  562 1016:bipush          118
	//  563 1018:ldc2            #407 <String "Rhythmic Soul">
	//  564 1021:aastore         
	//  565 1022:dup             
	//  566 1023:bipush          119
	//  567 1025:ldc2            #409 <String "Freestyle">
	//  568 1028:aastore         
	//  569 1029:dup             
	//  570 1030:bipush          120
	//  571 1032:ldc2            #411 <String "Duet">
	//  572 1035:aastore         
	//  573 1036:dup             
	//  574 1037:bipush          121
	//  575 1039:ldc2            #413 <String "Punk Rock">
	//  576 1042:aastore         
	//  577 1043:dup             
	//  578 1044:bipush          122
	//  579 1046:ldc2            #415 <String "Drum Solo">
	//  580 1049:aastore         
	//  581 1050:dup             
	//  582 1051:bipush          123
	//  583 1053:ldc2            #417 <String "A capella">
	//  584 1056:aastore         
	//  585 1057:dup             
	//  586 1058:bipush          124
	//  587 1060:ldc2            #419 <String "Euro-House">
	//  588 1063:aastore         
	//  589 1064:dup             
	//  590 1065:bipush          125
	//  591 1067:ldc2            #421 <String "Dance Hall">
	//  592 1070:aastore         
	//  593 1071:dup             
	//  594 1072:bipush          126
	//  595 1074:ldc2            #423 <String "Goa">
	//  596 1077:aastore         
	//  597 1078:dup             
	//  598 1079:bipush          127
	//  599 1081:ldc2            #425 <String "Drum & Bass">
	//  600 1084:aastore         
	//  601 1085:dup             
	//  602 1086:sipush          128
	//  603 1089:ldc2            #427 <String "Club-House">
	//  604 1092:aastore         
	//  605 1093:dup             
	//  606 1094:sipush          129
	//  607 1097:ldc2            #429 <String "Hardcore">
	//  608 1100:aastore         
	//  609 1101:dup             
	//  610 1102:sipush          130
	//  611 1105:ldc2            #431 <String "Terror">
	//  612 1108:aastore         
	//  613 1109:dup             
	//  614 1110:sipush          131
	//  615 1113:ldc2            #433 <String "Indie">
	//  616 1116:aastore         
	//  617 1117:dup             
	//  618 1118:sipush          132
	//  619 1121:ldc2            #435 <String "BritPop">
	//  620 1124:aastore         
	//  621 1125:dup             
	//  622 1126:sipush          133
	//  623 1129:ldc2            #437 <String "Negerpunk">
	//  624 1132:aastore         
	//  625 1133:dup             
	//  626 1134:sipush          134
	//  627 1137:ldc2            #439 <String "Polsk Punk">
	//  628 1140:aastore         
	//  629 1141:dup             
	//  630 1142:sipush          135
	//  631 1145:ldc2            #441 <String "Beat">
	//  632 1148:aastore         
	//  633 1149:dup             
	//  634 1150:sipush          136
	//  635 1153:ldc2            #443 <String "Christian Gangsta Rap">
	//  636 1156:aastore         
	//  637 1157:dup             
	//  638 1158:sipush          137
	//  639 1161:ldc2            #445 <String "Heavy Metal">
	//  640 1164:aastore         
	//  641 1165:dup             
	//  642 1166:sipush          138
	//  643 1169:ldc2            #447 <String "Black Metal">
	//  644 1172:aastore         
	//  645 1173:dup             
	//  646 1174:sipush          139
	//  647 1177:ldc2            #449 <String "Crossover">
	//  648 1180:aastore         
	//  649 1181:dup             
	//  650 1182:sipush          140
	//  651 1185:ldc2            #451 <String "Contemporary Christian">
	//  652 1188:aastore         
	//  653 1189:dup             
	//  654 1190:sipush          141
	//  655 1193:ldc2            #453 <String "Christian Rock">
	//  656 1196:aastore         
	//  657 1197:dup             
	//  658 1198:sipush          142
	//  659 1201:ldc2            #455 <String "Merengue">
	//  660 1204:aastore         
	//  661 1205:dup             
	//  662 1206:sipush          143
	//  663 1209:ldc2            #457 <String "Salsa">
	//  664 1212:aastore         
	//  665 1213:dup             
	//  666 1214:sipush          144
	//  667 1217:ldc2            #459 <String "Thrash Metal">
	//  668 1220:aastore         
	//  669 1221:dup             
	//  670 1222:sipush          145
	//  671 1225:ldc2            #461 <String "Anime">
	//  672 1228:aastore         
	//  673 1229:dup             
	//  674 1230:sipush          146
	//  675 1233:ldc2            #463 <String "Jpop">
	//  676 1236:aastore         
	//  677 1237:dup             
	//  678 1238:sipush          147
	//  679 1241:ldc2            #465 <String "Synthpop">
	//  680 1244:aastore         
	//  681 1245:putstatic       #467 <Field String[] STANDARD_GENRES>
	//* 682 1248:return          
	}
}
