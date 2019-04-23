// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.util.Util;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsParserUtil, Variant, HlsMasterPlaylist, HlsMediaPlaylist, 
//			HlsPlaylist

public final class HlsPlaylistParser
	implements com.google.android.exoplayer.upstream.UriLoadable.Parser
{
	private static class LineIterator
	{

		public boolean hasNext()
			throws IOException
		{
			if(next != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field String next>
		//*   2    4:ifnull          9
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			if(!extraLines.isEmpty())
		//*   5    9:aload_0         
		//*   6   10:getfield        #21  <Field Queue extraLines>
		//*   7   13:invokeinterface #37  <Method boolean Queue.isEmpty()>
		//*   8   18:ifne            39
			{
				next = (String)extraLines.poll();
		//    9   21:aload_0         
		//   10   22:aload_0         
		//   11   23:getfield        #21  <Field Queue extraLines>
		//   12   26:invokeinterface #41  <Method Object Queue.poll()>
		//   13   31:checkcast       #43  <Class String>
		//   14   34:putfield        #32  <Field String next>
				return true;
		//   15   37:iconst_1        
		//   16   38:ireturn         
			}
			do
			{
				String s = reader.readLine();
		//   17   39:aload_0         
		//   18   40:getfield        #23  <Field BufferedReader reader>
		//   19   43:invokevirtual   #49  <Method String BufferedReader.readLine()>
		//   20   46:astore_1        
				next = s;
		//   21   47:aload_0         
		//   22   48:aload_1         
		//   23   49:putfield        #32  <Field String next>
				if(s != null)
		//*  24   52:aload_1         
		//*  25   53:ifnull          79
				{
					next = next.trim();
		//   26   56:aload_0         
		//   27   57:aload_0         
		//   28   58:getfield        #32  <Field String next>
		//   29   61:invokevirtual   #52  <Method String String.trim()>
		//   30   64:putfield        #32  <Field String next>
					if(!next.isEmpty())
		//*  31   67:aload_0         
		//*  32   68:getfield        #32  <Field String next>
		//*  33   71:invokevirtual   #53  <Method boolean String.isEmpty()>
		//*  34   74:ifne            39
						return true;
		//   35   77:iconst_1        
		//   36   78:ireturn         
				} else
				{
					return false;
		//   37   79:iconst_0        
		//   38   80:ireturn         
				}
			} while(true);
		}

		public String next()
			throws IOException
		{
			if(hasNext())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #56  <Method boolean hasNext()>
		//*   2    4:ifeq            19
			{
				String s = next;
		//    3    7:aload_0         
		//    4    8:getfield        #32  <Field String next>
		//    5   11:astore_1        
				next = null;
		//    6   12:aload_0         
		//    7   13:aconst_null     
		//    8   14:putfield        #32  <Field String next>
				return s;
		//    9   17:aload_1         
		//   10   18:areturn         
			} else
			{
				return null;
		//   11   19:aconst_null     
		//   12   20:areturn         
			}
		}

		private final Queue extraLines;
		private String next;
		private final BufferedReader reader;

		public LineIterator(Queue queue, BufferedReader bufferedreader)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			extraLines = queue;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Queue extraLines>
			reader = bufferedreader;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field BufferedReader reader>
		//    8   14:return          
		}
	}


	public HlsPlaylistParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method void Object()>
	//    2    4:return          
	}

	private static HlsMasterPlaylist parseMasterPlaylist(LineIterator lineiterator, String s)
		throws IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #186 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void ArrayList()>
	//    3    7:astore          12
		ArrayList arraylist1 = new ArrayList();
	//    4    9:new             #186 <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #187 <Method void ArrayList()>
	//    7   16:astore          13
		ArrayList arraylist2 = new ArrayList();
	//    8   18:new             #186 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #187 <Method void ArrayList()>
	//   11   25:astore          14
		int i = 0;
	//   12   27:iconst_0        
	//   13   28:istore_2        
		int j = i;
	//   14   29:iload_2         
	//   15   30:istore_3        
		String s4 = null;
	//   16   31:aconst_null     
	//   17   32:astore          10
		String s3 = null;
	//   18   34:aconst_null     
	//   19   35:astore          9
		String s2 = null;
	//   20   37:aconst_null     
	//   21   38:astore          8
		String s1 = null;
	//   22   40:aconst_null     
	//   23   41:astore          7
		int k = -1;
	//   24   43:iconst_m1       
	//   25   44:istore          4
		int l = -1;
	//   26   46:iconst_m1       
	//   27   47:istore          5
		do
		{
			if(!lineiterator.hasNext())
				break;
	//   28   49:aload_0         
	//   29   50:invokevirtual   #191 <Method boolean HlsPlaylistParser$LineIterator.hasNext()>
	//   30   53:ifeq            504
			String s8 = lineiterator.next();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #195 <Method String HlsPlaylistParser$LineIterator.next()>
	//   33   60:astore          15
			if(s8.startsWith("#EXT-X-MEDIA"))
	//*  34   62:aload           15
	//*  35   64:ldc1            #65  <String "#EXT-X-MEDIA">
	//*  36   66:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//*  37   69:ifeq            291
			{
				String s5 = HlsParserUtil.parseStringAttr(s8, TYPE_ATTR_REGEX, "TYPE");
	//   38   72:aload           15
	//   39   74:getstatic       #164 <Field Pattern TYPE_ATTR_REGEX>
	//   40   77:ldc1            #96  <String "TYPE">
	//   41   79:invokestatic    #207 <Method String HlsParserUtil.parseStringAttr(String, Pattern, String)>
	//   42   82:astore          11
				if("CLOSED-CAPTIONS".equals(((Object) (s5))))
	//*  43   84:ldc1            #26  <String "CLOSED-CAPTIONS">
	//*  44   86:aload           11
	//*  45   88:invokevirtual   #211 <Method boolean String.equals(Object)>
	//*  46   91:ifeq            125
				{
					if("CC1".equals(((Object) (HlsParserUtil.parseStringAttr(s8, INSTREAM_ID_ATTR_REGEX, "INSTREAM-ID")))))
	//*  47   94:ldc1            #213 <String "CC1">
	//*  48   96:aload           15
	//*  49   98:getstatic       #176 <Field Pattern INSTREAM_ID_ATTR_REGEX>
	//*  50  101:ldc1            #42  <String "INSTREAM-ID">
	//*  51  103:invokestatic    #207 <Method String HlsParserUtil.parseStringAttr(String, Pattern, String)>
	//*  52  106:invokevirtual   #211 <Method boolean String.equals(Object)>
	//*  53  109:ifeq            49
						s3 = HlsParserUtil.parseOptionalStringAttr(s8, LANGUAGE_ATTR_REGEX);
	//   54  112:aload           15
	//   55  114:getstatic       #168 <Field Pattern LANGUAGE_ATTR_REGEX>
	//   56  117:invokestatic    #217 <Method String HlsParserUtil.parseOptionalStringAttr(String, Pattern)>
	//   57  120:astore          9
				} else
	//*  58  122:goto            49
				if("SUBTITLES".equals(((Object) (s5))))
	//*  59  125:ldc1            #89  <String "SUBTITLES">
	//*  60  127:aload           11
	//*  61  129:invokevirtual   #211 <Method boolean String.equals(Object)>
	//*  62  132:ifeq            201
				{
					s5 = HlsParserUtil.parseStringAttr(s8, NAME_ATTR_REGEX, "NAME");
	//   63  135:aload           15
	//   64  137:getstatic       #172 <Field Pattern NAME_ATTR_REGEX>
	//   65  140:ldc1            #78  <String "NAME">
	//   66  142:invokestatic    #207 <Method String HlsParserUtil.parseStringAttr(String, Pattern, String)>
	//   67  145:astore          11
					arraylist2.add(((Object) (new Variant(HlsParserUtil.parseStringAttr(s8, URI_ATTR_REGEX, "URI"), new Format(s5, "application/x-mpegURL", -1, -1, -1F, -1, -1, -1, HlsParserUtil.parseOptionalStringAttr(s8, LANGUAGE_ATTR_REGEX), s2)))));
	//   68  147:aload           14
	//   69  149:new             #219 <Class Variant>
	//   70  152:dup             
	//   71  153:aload           15
	//   72  155:getstatic       #156 <Field Pattern URI_ATTR_REGEX>
	//   73  158:ldc1            #100 <String "URI">
	//   74  160:invokestatic    #207 <Method String HlsParserUtil.parseStringAttr(String, Pattern, String)>
	//   75  163:new             #221 <Class Format>
	//   76  166:dup             
	//   77  167:aload           11
	//   78  169:ldc1            #223 <String "application/x-mpegURL">
	//   79  171:iconst_m1       
	//   80  172:iconst_m1       
	//   81  173:ldc1            #224 <Float -1F>
	//   82  175:iconst_m1       
	//   83  176:iconst_m1       
	//   84  177:iconst_m1       
	//   85  178:aload           15
	//   86  180:getstatic       #168 <Field Pattern LANGUAGE_ATTR_REGEX>
	//   87  183:invokestatic    #217 <Method String HlsParserUtil.parseOptionalStringAttr(String, Pattern)>
	//   88  186:aload           8
	//   89  188:invokespecial   #227 <Method void Format(String, String, int, int, float, int, int, int, String, String)>
	//   90  191:invokespecial   #230 <Method void Variant(String, Format)>
	//   91  194:invokevirtual   #233 <Method boolean ArrayList.add(Object)>
	//   92  197:pop             
				} else
	//*  93  198:goto            49
				if("AUDIO".equals(((Object) (s5))))
	//*  94  201:ldc1            #14  <String "AUDIO">
	//*  95  203:aload           11
	//*  96  205:invokevirtual   #211 <Method boolean String.equals(Object)>
	//*  97  208:ifeq            49
				{
					String s6 = HlsParserUtil.parseOptionalStringAttr(s8, LANGUAGE_ATTR_REGEX);
	//   98  211:aload           15
	//   99  213:getstatic       #168 <Field Pattern LANGUAGE_ATTR_REGEX>
	//  100  216:invokestatic    #217 <Method String HlsParserUtil.parseOptionalStringAttr(String, Pattern)>
	//  101  219:astore          11
					String s9 = HlsParserUtil.parseOptionalStringAttr(s8, URI_ATTR_REGEX);
	//  102  221:aload           15
	//  103  223:getstatic       #156 <Field Pattern URI_ATTR_REGEX>
	//  104  226:invokestatic    #217 <Method String HlsParserUtil.parseOptionalStringAttr(String, Pattern)>
	//  105  229:astore          16
					if(s9 != null)
	//* 106  231:aload           16
	//* 107  233:ifnull          284
						arraylist1.add(((Object) (new Variant(s9, new Format(HlsParserUtil.parseStringAttr(s8, NAME_ATTR_REGEX, "NAME"), "application/x-mpegURL", -1, -1, -1F, -1, -1, -1, s6, s2)))));
	//  108  236:aload           13
	//  109  238:new             #219 <Class Variant>
	//  110  241:dup             
	//  111  242:aload           16
	//  112  244:new             #221 <Class Format>
	//  113  247:dup             
	//  114  248:aload           15
	//  115  250:getstatic       #172 <Field Pattern NAME_ATTR_REGEX>
	//  116  253:ldc1            #78  <String "NAME">
	//  117  255:invokestatic    #207 <Method String HlsParserUtil.parseStringAttr(String, Pattern, String)>
	//  118  258:ldc1            #223 <String "application/x-mpegURL">
	//  119  260:iconst_m1       
	//  120  261:iconst_m1       
	//  121  262:ldc1            #224 <Float -1F>
	//  122  264:iconst_m1       
	//  123  265:iconst_m1       
	//  124  266:iconst_m1       
	//  125  267:aload           11
	//  126  269:aload           8
	//  127  271:invokespecial   #227 <Method void Format(String, String, int, int, float, int, int, int, String, String)>
	//  128  274:invokespecial   #230 <Method void Variant(String, Format)>
	//  129  277:invokevirtual   #233 <Method boolean ArrayList.add(Object)>
	//  130  280:pop             
					else
	//* 131  281:goto            49
						s4 = s6;
	//  132  284:aload           11
	//  133  286:astore          10
				}
			} else
	//* 134  288:goto            49
			if(s8.startsWith("#EXT-X-STREAM-INF"))
	//* 135  291:aload           15
	//* 136  293:ldc1            #86  <String "#EXT-X-STREAM-INF">
	//* 137  295:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//* 138  298:ifeq            415
			{
				int i1 = HlsParserUtil.parseIntAttr(s8, BANDWIDTH_ATTR_REGEX, "BANDWIDTH");
	//  139  301:aload           15
	//  140  303:getstatic       #120 <Field Pattern BANDWIDTH_ATTR_REGEX>
	//  141  306:ldc1            #17  <String "BANDWIDTH">
	//  142  308:invokestatic    #237 <Method int HlsParserUtil.parseIntAttr(String, Pattern, String)>
	//  143  311:istore          6
				s2 = HlsParserUtil.parseOptionalStringAttr(s8, CODECS_ATTR_REGEX);
	//  144  313:aload           15
	//  145  315:getstatic       #124 <Field Pattern CODECS_ATTR_REGEX>
	//  146  318:invokestatic    #217 <Method String HlsParserUtil.parseOptionalStringAttr(String, Pattern)>
	//  147  321:astore          8
				s1 = HlsParserUtil.parseOptionalStringAttr(s8, NAME_ATTR_REGEX);
	//  148  323:aload           15
	//  149  325:getstatic       #172 <Field Pattern NAME_ATTR_REGEX>
	//  150  328:invokestatic    #217 <Method String HlsParserUtil.parseOptionalStringAttr(String, Pattern)>
	//  151  331:astore          7
				String s7 = HlsParserUtil.parseOptionalStringAttr(s8, RESOLUTION_ATTR_REGEX);
	//  152  333:aload           15
	//  153  335:getstatic       #128 <Field Pattern RESOLUTION_ATTR_REGEX>
	//  154  338:invokestatic    #217 <Method String HlsParserUtil.parseOptionalStringAttr(String, Pattern)>
	//  155  341:astore          11
				if(s7 != null)
	//* 156  343:aload           11
	//* 157  345:ifnull          401
				{
					String as[] = s7.split("x");
	//  158  348:aload           11
	//  159  350:ldc1            #239 <String "x">
	//  160  352:invokevirtual   #243 <Method String[] String.split(String)>
	//  161  355:astore          11
					j = Integer.parseInt(as[0]);
	//  162  357:aload           11
	//  163  359:iconst_0        
	//  164  360:aaload          
	//  165  361:invokestatic    #249 <Method int Integer.parseInt(String)>
	//  166  364:istore_3        
					i = j;
	//  167  365:iload_3         
	//  168  366:istore_2        
					if(j <= 0)
	//* 169  367:iload_3         
	//* 170  368:ifgt            373
						i = -1;
	//  171  371:iconst_m1       
	//  172  372:istore_2        
					k = Integer.parseInt(as[1]);
	//  173  373:aload           11
	//  174  375:iconst_1        
	//  175  376:aaload          
	//  176  377:invokestatic    #249 <Method int Integer.parseInt(String)>
	//  177  380:istore          4
					j = k;
	//  178  382:iload           4
	//  179  384:istore_3        
					if(k <= 0)
	//* 180  385:iload           4
	//* 181  387:ifgt            392
						j = -1;
	//  182  390:iconst_m1       
	//  183  391:istore_3        
					k = i;
	//  184  392:iload_2         
	//  185  393:istore          4
					l = j;
	//  186  395:iload_3         
	//  187  396:istore          5
				} else
	//* 188  398:goto            407
				{
					k = -1;
	//  189  401:iconst_m1       
	//  190  402:istore          4
					l = -1;
	//  191  404:iconst_m1       
	//  192  405:istore          5
				}
				i = 1;
	//  193  407:iconst_1        
	//  194  408:istore_2        
				j = i1;
	//  195  409:iload           6
	//  196  411:istore_3        
			} else
	//* 197  412:goto            49
			if(!s8.startsWith("#") && i != 0)
	//* 198  415:aload           15
	//* 199  417:ldc1            #251 <String "#">
	//* 200  419:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//* 201  422:ifne            49
	//* 202  425:iload_2         
	//* 203  426:ifeq            49
			{
				if(s1 == null)
	//* 204  429:aload           7
	//* 205  431:ifnonnull       447
					s1 = Integer.toString(arraylist.size());
	//  206  434:aload           12
	//  207  436:invokevirtual   #255 <Method int ArrayList.size()>
	//  208  439:invokestatic    #259 <Method String Integer.toString(int)>
	//  209  442:astore          7
	//* 210  444:goto            447
				arraylist.add(((Object) (new Variant(s8, new Format(s1, "application/x-mpegURL", k, l, -1F, -1, -1, j, ((String) (null)), s2)))));
	//  211  447:aload           12
	//  212  449:new             #219 <Class Variant>
	//  213  452:dup             
	//  214  453:aload           15
	//  215  455:new             #221 <Class Format>
	//  216  458:dup             
	//  217  459:aload           7
	//  218  461:ldc1            #223 <String "application/x-mpegURL">
	//  219  463:iload           4
	//  220  465:iload           5
	//  221  467:ldc1            #224 <Float -1F>
	//  222  469:iconst_m1       
	//  223  470:iconst_m1       
	//  224  471:iload_3         
	//  225  472:aconst_null     
	//  226  473:aload           8
	//  227  475:invokespecial   #227 <Method void Format(String, String, int, int, float, int, int, int, String, String)>
	//  228  478:invokespecial   #230 <Method void Variant(String, Format)>
	//  229  481:invokevirtual   #233 <Method boolean ArrayList.add(Object)>
	//  230  484:pop             
				i = 0;
	//  231  485:iconst_0        
	//  232  486:istore_2        
				j = i;
	//  233  487:iload_2         
	//  234  488:istore_3        
				s2 = null;
	//  235  489:aconst_null     
	//  236  490:astore          8
				s1 = null;
	//  237  492:aconst_null     
	//  238  493:astore          7
				k = -1;
	//  239  495:iconst_m1       
	//  240  496:istore          4
				l = -1;
	//  241  498:iconst_m1       
	//  242  499:istore          5
			}
		} while(true);
	//  243  501:goto            49
		return new HlsMasterPlaylist(s, ((java.util.List) (arraylist)), ((java.util.List) (arraylist1)), ((java.util.List) (arraylist2)), s4, s3);
	//  244  504:new             #261 <Class HlsMasterPlaylist>
	//  245  507:dup             
	//  246  508:aload_1         
	//  247  509:aload           12
	//  248  511:aload           13
	//  249  513:aload           14
	//  250  515:aload           10
	//  251  517:aload           9
	//  252  519:invokespecial   #264 <Method void HlsMasterPlaylist(String, java.util.List, java.util.List, java.util.List, String, String)>
	//  253  522:areturn         
	}

	private static HlsMediaPlaylist parseMediaPlaylist(LineIterator lineiterator, String s)
		throws IOException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #269 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #271 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #276 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public HlsPlaylist parse(String s, InputStream inputstream)
		throws IOException, ParserException
	{
		LinkedList linkedlist;
		inputstream = ((InputStream) (new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))));
	//    0    0:new             #282 <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #284 <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #287 <Method void InputStreamReader(InputStream)>
	//    6   12:invokespecial   #290 <Method void BufferedReader(java.io.Reader)>
	//    7   15:astore_2        
		linkedlist = new LinkedList();
	//    8   16:new             #292 <Class LinkedList>
	//    9   19:dup             
	//   10   20:invokespecial   #293 <Method void LinkedList()>
	//   11   23:astore_3        
_L1:
		String s1 = ((BufferedReader) (inputstream)).readLine();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #296 <Method String BufferedReader.readLine()>
	//   14   28:astore          4
		if(s1 == null)
			break MISSING_BLOCK_LABEL_216;
	//   15   30:aload           4
	//   16   32:ifnull          216
		s1 = s1.trim();
	//   17   35:aload           4
	//   18   37:invokevirtual   #299 <Method String String.trim()>
	//   19   40:astore          4
		if(!s1.isEmpty()) goto _L2; else goto _L1
	//   20   42:aload           4
	//   21   44:invokevirtual   #302 <Method boolean String.isEmpty()>
	//   22   47:ifeq            53
	//*  23   50:goto            24
_L2:
		if(!s1.startsWith("#EXT-X-STREAM-INF"))
			break MISSING_BLOCK_LABEL_92;
	//   24   53:aload           4
	//   25   55:ldc1            #86  <String "#EXT-X-STREAM-INF">
	//   26   57:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//   27   60:ifeq            92
		((Queue) (linkedlist)).add(((Object) (s1)));
	//   28   63:aload_3         
	//   29   64:aload           4
	//   30   66:invokeinterface #305 <Method boolean Queue.add(Object)>
	//   31   71:pop             
		s = ((String) (parseMasterPlaylist(new LineIterator(((Queue) (linkedlist)), ((BufferedReader) (inputstream))), s)));
	//   32   72:new             #9   <Class HlsPlaylistParser$LineIterator>
	//   33   75:dup             
	//   34   76:aload_3         
	//   35   77:aload_2         
	//   36   78:invokespecial   #308 <Method void HlsPlaylistParser$LineIterator(Queue, BufferedReader)>
	//   37   81:aload_1         
	//   38   82:invokestatic    #310 <Method HlsMasterPlaylist parseMasterPlaylist(HlsPlaylistParser$LineIterator, String)>
	//   39   85:astore_1        
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//   40   86:aload_2         
	//   41   87:invokestatic    #316 <Method void Util.closeQuietly(java.io.Closeable)>
		return ((HlsPlaylist) (s));
	//   42   90:aload_1         
	//   43   91:areturn         
		if(s1.startsWith("#EXT-X-TARGETDURATION") || s1.startsWith("#EXT-X-MEDIA-SEQUENCE") || s1.startsWith("#EXTINF") || s1.startsWith("#EXT-X-KEY") || s1.startsWith("#EXT-X-BYTERANGE") || s1.equals("#EXT-X-DISCONTINUITY") || s1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || s1.equals("#EXT-X-ENDLIST"))
	//*  44   92:aload           4
	//*  45   94:ldc1            #93  <String "#EXT-X-TARGETDURATION">
	//*  46   96:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//*  47   99:ifne            187
	//*  48  102:aload           4
	//*  49  104:ldc1            #62  <String "#EXT-X-MEDIA-SEQUENCE">
	//*  50  106:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//*  51  109:ifne            187
	//*  52  112:aload           4
	//*  53  114:ldc1            #58  <String "#EXTINF">
	//*  54  116:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//*  55  119:ifne            187
	//*  56  122:aload           4
	//*  57  124:ldc1            #50  <String "#EXT-X-KEY">
	//*  58  126:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//*  59  129:ifne            187
	//*  60  132:aload           4
	//*  61  134:ldc1            #23  <String "#EXT-X-BYTERANGE">
	//*  62  136:invokevirtual   #201 <Method boolean String.startsWith(String)>
	//*  63  139:ifne            187
	//*  64  142:aload           4
	//*  65  144:ldc1            #36  <String "#EXT-X-DISCONTINUITY">
	//*  66  146:invokevirtual   #211 <Method boolean String.equals(Object)>
	//*  67  149:ifne            187
	//*  68  152:aload           4
	//*  69  154:ldc1            #33  <String "#EXT-X-DISCONTINUITY-SEQUENCE">
	//*  70  156:invokevirtual   #211 <Method boolean String.equals(Object)>
	//*  71  159:ifne            187
	//*  72  162:aload           4
	//*  73  164:ldc1            #39  <String "#EXT-X-ENDLIST">
	//*  74  166:invokevirtual   #211 <Method boolean String.equals(Object)>
	//*  75  169:ifeq            175
			break MISSING_BLOCK_LABEL_187;
	//   76  172:goto            187
		((Queue) (linkedlist)).add(((Object) (s1)));
	//   77  175:aload_3         
	//   78  176:aload           4
	//   79  178:invokeinterface #305 <Method boolean Queue.add(Object)>
	//   80  183:pop             
		  goto _L1
	//*  81  184:goto            24
		((Queue) (linkedlist)).add(((Object) (s1)));
	//   82  187:aload_3         
	//   83  188:aload           4
	//   84  190:invokeinterface #305 <Method boolean Queue.add(Object)>
	//   85  195:pop             
		s = ((String) (parseMediaPlaylist(new LineIterator(((Queue) (linkedlist)), ((BufferedReader) (inputstream))), s)));
	//   86  196:new             #9   <Class HlsPlaylistParser$LineIterator>
	//   87  199:dup             
	//   88  200:aload_3         
	//   89  201:aload_2         
	//   90  202:invokespecial   #308 <Method void HlsPlaylistParser$LineIterator(Queue, BufferedReader)>
	//   91  205:aload_1         
	//   92  206:invokestatic    #318 <Method HlsMediaPlaylist parseMediaPlaylist(HlsPlaylistParser$LineIterator, String)>
	//   93  209:astore_1        
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//   94  210:aload_2         
	//   95  211:invokestatic    #316 <Method void Util.closeQuietly(java.io.Closeable)>
		return ((HlsPlaylist) (s));
	//   96  214:aload_1         
	//   97  215:areturn         
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//   98  216:aload_2         
	//   99  217:invokestatic    #316 <Method void Util.closeQuietly(java.io.Closeable)>
		throw new ParserException("Failed to parse the playlist, could not identify any tags.");
	//  100  220:new             #280 <Class ParserException>
	//  101  223:dup             
	//  102  224:ldc2            #320 <String "Failed to parse the playlist, could not identify any tags.">
	//  103  227:invokespecial   #321 <Method void ParserException(String)>
	//  104  230:athrow          
		s;
	//  105  231:astore_1        
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//  106  232:aload_2         
	//  107  233:invokestatic    #316 <Method void Util.closeQuietly(java.io.Closeable)>
		throw s;
	//  108  236:aload_1         
	//  109  237:athrow          
	}

	public volatile Object parse(String s, InputStream inputstream)
		throws ParserException, IOException
	{
		return ((Object) (parse(s, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #324 <Method HlsPlaylist parse(String, InputStream)>
	//    4    6:areturn         
	}

	private static final String AUDIO_TYPE = "AUDIO";
	private static final String BANDWIDTH_ATTR = "BANDWIDTH";
	private static final Pattern BANDWIDTH_ATTR_REGEX = Pattern.compile("BANDWIDTH=(\\d+)\\b");
	private static final Pattern BYTERANGE_REGEX = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
	private static final String BYTERANGE_TAG = "#EXT-X-BYTERANGE";
	private static final String CLOSED_CAPTIONS_TYPE = "CLOSED-CAPTIONS";
	private static final String CODECS_ATTR = "CODECS";
	private static final Pattern CODECS_ATTR_REGEX = Pattern.compile("CODECS=\"(.+?)\"");
	private static final String DISCONTINUITY_SEQUENCE_TAG = "#EXT-X-DISCONTINUITY-SEQUENCE";
	private static final String DISCONTINUITY_TAG = "#EXT-X-DISCONTINUITY";
	private static final String ENDLIST_TAG = "#EXT-X-ENDLIST";
	private static final String INSTREAM_ID_ATTR = "INSTREAM-ID";
	private static final Pattern INSTREAM_ID_ATTR_REGEX = Pattern.compile("INSTREAM-ID=\"(.+?)\"");
	private static final String IV_ATTR = "IV";
	private static final Pattern IV_ATTR_REGEX = Pattern.compile("IV=([^,.*]+)");
	private static final String KEY_TAG = "#EXT-X-KEY";
	private static final String LANGUAGE_ATTR = "LANGUAGE";
	private static final Pattern LANGUAGE_ATTR_REGEX = Pattern.compile("LANGUAGE=\"(.+?)\"");
	private static final Pattern MEDIA_DURATION_REGEX = Pattern.compile("#EXTINF:([\\d.]+)\\b");
	private static final String MEDIA_DURATION_TAG = "#EXTINF";
	private static final Pattern MEDIA_SEQUENCE_REGEX = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
	private static final String MEDIA_SEQUENCE_TAG = "#EXT-X-MEDIA-SEQUENCE";
	private static final String MEDIA_TAG = "#EXT-X-MEDIA";
	private static final String METHOD_AES128 = "AES-128";
	private static final String METHOD_ATTR = "METHOD";
	private static final Pattern METHOD_ATTR_REGEX = Pattern.compile("METHOD=(NONE|AES-128)");
	private static final String METHOD_NONE = "NONE";
	private static final String NAME_ATTR = "NAME";
	private static final Pattern NAME_ATTR_REGEX = Pattern.compile("NAME=\"(.+?)\"");
	private static final String RESOLUTION_ATTR = "RESOLUTION";
	private static final Pattern RESOLUTION_ATTR_REGEX = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
	private static final String STREAM_INF_TAG = "#EXT-X-STREAM-INF";
	private static final String SUBTITLES_TYPE = "SUBTITLES";
	private static final Pattern TARGET_DURATION_REGEX = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
	private static final String TARGET_DURATION_TAG = "#EXT-X-TARGETDURATION";
	private static final String TYPE_ATTR = "TYPE";
	private static final Pattern TYPE_ATTR_REGEX = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
	private static final String URI_ATTR = "URI";
	private static final Pattern URI_ATTR_REGEX = Pattern.compile("URI=\"(.+?)\"");
	private static final Pattern VERSION_REGEX = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
	private static final String VERSION_TAG = "#EXT-X-VERSION";
	private static final String VIDEO_TYPE = "VIDEO";

	static 
	{
	//    0    0:ldc1            #112 <String "BANDWIDTH=(\\d+)\\b">
	//    1    2:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #120 <Field Pattern BANDWIDTH_ATTR_REGEX>
	//    3    8:ldc1            #122 <String "CODECS=\"(.+?)\"">
	//    4   10:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #124 <Field Pattern CODECS_ATTR_REGEX>
	//    6   16:ldc1            #126 <String "RESOLUTION=(\\d+x\\d+)">
	//    7   18:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #128 <Field Pattern RESOLUTION_ATTR_REGEX>
	//    9   24:ldc1            #130 <String "#EXTINF:([\\d.]+)\\b">
	//   10   26:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   11   29:putstatic       #132 <Field Pattern MEDIA_DURATION_REGEX>
	//   12   32:ldc1            #134 <String "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b">
	//   13   34:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   14   37:putstatic       #136 <Field Pattern MEDIA_SEQUENCE_REGEX>
	//   15   40:ldc1            #138 <String "#EXT-X-TARGETDURATION:(\\d+)\\b">
	//   16   42:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   17   45:putstatic       #140 <Field Pattern TARGET_DURATION_REGEX>
	//   18   48:ldc1            #142 <String "#EXT-X-VERSION:(\\d+)\\b">
	//   19   50:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   20   53:putstatic       #144 <Field Pattern VERSION_REGEX>
	//   21   56:ldc1            #146 <String "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b">
	//   22   58:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   23   61:putstatic       #148 <Field Pattern BYTERANGE_REGEX>
	//   24   64:ldc1            #150 <String "METHOD=(NONE|AES-128)">
	//   25   66:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   26   69:putstatic       #152 <Field Pattern METHOD_ATTR_REGEX>
	//   27   72:ldc1            #154 <String "URI=\"(.+?)\"">
	//   28   74:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   29   77:putstatic       #156 <Field Pattern URI_ATTR_REGEX>
	//   30   80:ldc1            #158 <String "IV=([^,.*]+)">
	//   31   82:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   32   85:putstatic       #160 <Field Pattern IV_ATTR_REGEX>
	//   33   88:ldc1            #162 <String "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)">
	//   34   90:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   35   93:putstatic       #164 <Field Pattern TYPE_ATTR_REGEX>
	//   36   96:ldc1            #166 <String "LANGUAGE=\"(.+?)\"">
	//   37   98:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   38  101:putstatic       #168 <Field Pattern LANGUAGE_ATTR_REGEX>
	//   39  104:ldc1            #170 <String "NAME=\"(.+?)\"">
	//   40  106:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   41  109:putstatic       #172 <Field Pattern NAME_ATTR_REGEX>
	//   42  112:ldc1            #174 <String "INSTREAM-ID=\"(.+?)\"">
	//   43  114:invokestatic    #118 <Method Pattern Pattern.compile(String)>
	//   44  117:putstatic       #176 <Field Pattern INSTREAM_ID_ATTR_REGEX>
	//*  45  120:return          
	}
}
