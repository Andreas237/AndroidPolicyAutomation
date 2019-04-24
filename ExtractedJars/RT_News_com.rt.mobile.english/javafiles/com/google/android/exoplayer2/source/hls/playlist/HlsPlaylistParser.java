// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsMasterPlaylist, HlsMediaPlaylist, HlsPlaylist

public final class HlsPlaylistParser
	implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
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
	//    1    1:invokespecial   #259 <Method void Object()>
	//    2    4:return          
	}

	private static boolean checkPlaylistHeader(BufferedReader bufferedreader)
		throws IOException
	{
		int k = bufferedreader.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method int BufferedReader.read()>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 239)
	//*   5    7:iload_2         
	//*   6    8:sipush          239
	//*   7   11:icmpne          46
			if(bufferedreader.read() == 187)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #269 <Method int BufferedReader.read()>
	//*  10   18:sipush          187
	//*  11   21:icmpne          44
			{
				if(bufferedreader.read() != 191)
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #269 <Method int BufferedReader.read()>
	//*  14   28:sipush          191
	//*  15   31:icmpeq          36
					return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
				i = bufferedreader.read();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #269 <Method int BufferedReader.read()>
	//   20   40:istore_1        
			} else
	//*  21   41:goto            46
			{
				return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
			}
		k = skipIgnorableWhitespace(bufferedreader, true, i);
	//   24   46:aload_0         
	//   25   47:iconst_1        
	//   26   48:iload_1         
	//   27   49:invokestatic    #273 <Method int skipIgnorableWhitespace(BufferedReader, boolean, int)>
	//   28   52:istore_2        
		int l = "#EXTM3U".length();
	//   29   53:ldc1            #47  <String "#EXTM3U">
	//   30   55:invokevirtual   #278 <Method int String.length()>
	//   31   58:istore_3        
		for(int j = 0; j < l; j++)
	//*  32   59:iconst_0        
	//*  33   60:istore_1        
	//*  34   61:iload_1         
	//*  35   62:iload_3         
	//*  36   63:icmpge          90
		{
			if(k != "#EXTM3U".charAt(j))
	//*  37   66:iload_2         
	//*  38   67:ldc1            #47  <String "#EXTM3U">
	//*  39   69:iload_1         
	//*  40   70:invokevirtual   #282 <Method char String.charAt(int)>
	//*  41   73:icmpeq          78
				return false;
	//   42   76:iconst_0        
	//   43   77:ireturn         
			k = bufferedreader.read();
	//   44   78:aload_0         
	//   45   79:invokevirtual   #269 <Method int BufferedReader.read()>
	//   46   82:istore_2        
		}

	//   47   83:iload_1         
	//   48   84:iconst_1        
	//   49   85:iadd            
	//   50   86:istore_1        
	//*  51   87:goto            61
		return Util.isLinebreak(skipIgnorableWhitespace(bufferedreader, false, k));
	//   52   90:aload_0         
	//   53   91:iconst_0        
	//   54   92:iload_2         
	//   55   93:invokestatic    #273 <Method int skipIgnorableWhitespace(BufferedReader, boolean, int)>
	//   56   96:invokestatic    #288 <Method boolean Util.isLinebreak(int)>
	//   57   99:ireturn         
	}

	private static Pattern compileBooleanAttrPattern(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #291 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #292 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(s);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("=(");
	//    8   14:aload_1         
	//    9   15:ldc2            #298 <String "=(">
	//   10   18:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("NO");
	//   12   22:aload_1         
	//   13   23:ldc1            #17  <String "NO">
	//   14   25:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		stringbuilder.append("|");
	//   16   29:aload_1         
	//   17   30:ldc2            #300 <String "|">
	//   18   33:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append("YES");
	//   20   37:aload_1         
	//   21   38:ldc1            #20  <String "YES">
	//   22   40:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(")");
	//   24   44:aload_1         
	//   25   45:ldc2            #302 <String ")">
	//   26   48:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		return Pattern.compile(stringbuilder.toString());
	//   28   52:aload_1         
	//   29   53:invokevirtual   #306 <Method String StringBuilder.toString()>
	//   30   56:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   31   59:areturn         
	}

	private static boolean parseBooleanAttribute(String s, Pattern pattern, boolean flag)
	{
		s = ((String) (pattern.matcher(((CharSequence) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #312 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_0        
		if(((Matcher) (s)).find())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #318 <Method boolean Matcher.find()>
	//*   6   10:ifeq            24
			return ((Matcher) (s)).group(1).equals("YES");
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #322 <Method String Matcher.group(int)>
	//   10   18:ldc1            #20  <String "YES">
	//   11   20:invokevirtual   #326 <Method boolean String.equals(Object)>
	//   12   23:ireturn         
		else
			return flag;
	//   13   24:iload_2         
	//   14   25:ireturn         
	}

	private static double parseDoubleAttr(String s, Pattern pattern)
		throws ParserException
	{
		return Double.parseDouble(parseStringAttr(s, pattern));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #334 <Method String parseStringAttr(String, Pattern)>
	//    3    5:invokestatic    #340 <Method double Double.parseDouble(String)>
	//    4    8:dreturn         
	}

	private static int parseIntAttr(String s, Pattern pattern)
		throws ParserException
	{
		return Integer.parseInt(parseStringAttr(s, pattern));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #334 <Method String parseStringAttr(String, Pattern)>
	//    3    5:invokestatic    #348 <Method int Integer.parseInt(String)>
	//    4    8:ireturn         
	}

	private static long parseLongAttr(String s, Pattern pattern)
		throws ParserException
	{
		return Long.parseLong(parseStringAttr(s, pattern));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #334 <Method String parseStringAttr(String, Pattern)>
	//    3    5:invokestatic    #356 <Method long Long.parseLong(String)>
	//    4    8:lreturn         
	}

	private static HlsMasterPlaylist parseMasterPlaylist(LineIterator lineiterator, String s)
		throws IOException
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #360 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #361 <Method void HashSet()>
	//    3    7:astore          8
		HashMap hashmap = new HashMap();
	//    4    9:new             #363 <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #364 <Method void HashMap()>
	//    7   16:astore          16
		ArrayList arraylist1 = new ArrayList();
	//    8   18:new             #366 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #367 <Method void ArrayList()>
	//   11   25:astore          12
		ArrayList arraylist2 = new ArrayList();
	//   12   27:new             #366 <Class ArrayList>
	//   13   30:dup             
	//   14   31:invokespecial   #367 <Method void ArrayList()>
	//   15   34:astore          13
		ArrayList arraylist3 = new ArrayList();
	//   16   36:new             #366 <Class ArrayList>
	//   17   39:dup             
	//   18   40:invokespecial   #367 <Method void ArrayList()>
	//   19   43:astore          14
		ArrayList arraylist = new ArrayList();
	//   20   45:new             #366 <Class ArrayList>
	//   21   48:dup             
	//   22   49:invokespecial   #367 <Method void ArrayList()>
	//   23   52:astore          10
		ArrayList arraylist4 = new ArrayList();
	//   24   54:new             #366 <Class ArrayList>
	//   25   57:dup             
	//   26   58:invokespecial   #367 <Method void ArrayList()>
	//   27   61:astore          15
		int l = 0;
	//   28   63:iconst_0        
	//   29   64:istore          4
		do
		{
			if(!lineiterator.hasNext())
				break;
	//   30   66:aload_0         
	//   31   67:invokevirtual   #370 <Method boolean HlsPlaylistParser$LineIterator.hasNext()>
	//   32   70:ifeq            384
			String s2 = lineiterator.next();
	//   33   73:aload_0         
	//   34   74:invokevirtual   #373 <Method String HlsPlaylistParser$LineIterator.next()>
	//   35   77:astore          11
			if(s2.startsWith("#EXT"))
	//*  36   79:aload           11
	//*  37   81:ldc1            #113 <String "#EXT">
	//*  38   83:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  39   86:ifeq            97
				arraylist4.add(((Object) (s2)));
	//   40   89:aload           15
	//   41   91:aload           11
	//   42   93:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   43   96:pop             
			if(s2.startsWith("#EXT-X-MEDIA"))
	//*  44   97:aload           11
	//*  45   99:ldc1            #101 <String "#EXT-X-MEDIA">
	//*  46  101:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  47  104:ifeq            118
				arraylist.add(((Object) (s2)));
	//   48  107:aload           10
	//   49  109:aload           11
	//   50  111:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   51  114:pop             
			else
	//*  52  115:goto            66
			if(s2.startsWith("#EXT-X-STREAM-INF"))
	//*  53  118:aload           11
	//*  54  120:ldc1            #122 <String "#EXT-X-STREAM-INF">
	//*  55  122:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  56  125:ifeq            66
			{
				int i2 = l | s2.contains("CLOSED-CAPTIONS=NONE");
	//   57  128:iload           4
	//   58  130:aload           11
	//   59  132:ldc1            #14  <String "CLOSED-CAPTIONS=NONE">
	//   60  134:invokevirtual   #384 <Method boolean String.contains(CharSequence)>
	//   61  137:ior             
	//   62  138:istore          7
				int i1 = parseIntAttr(s2, REGEX_BANDWIDTH);
	//   63  140:aload           11
	//   64  142:getstatic       #160 <Field Pattern REGEX_BANDWIDTH>
	//   65  145:invokestatic    #386 <Method int parseIntAttr(String, Pattern)>
	//   66  148:istore          5
				String s1 = parseOptionalStringAttr(s2, REGEX_AVERAGE_BANDWIDTH);
	//   67  150:aload           11
	//   68  152:getstatic       #152 <Field Pattern REGEX_AVERAGE_BANDWIDTH>
	//   69  155:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//   70  158:astore          9
				if(s1 != null)
	//*  71  160:aload           9
	//*  72  162:ifnull          172
					i1 = Integer.parseInt(s1);
	//   73  165:aload           9
	//   74  167:invokestatic    #348 <Method int Integer.parseInt(String)>
	//   75  170:istore          5
				s1 = parseOptionalStringAttr(s2, REGEX_CODECS);
	//   76  172:aload           11
	//   77  174:getstatic       #164 <Field Pattern REGEX_CODECS>
	//   78  177:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//   79  180:astore          9
				String s4 = parseOptionalStringAttr(s2, REGEX_RESOLUTION);
	//   80  182:aload           11
	//   81  184:getstatic       #168 <Field Pattern REGEX_RESOLUTION>
	//   82  187:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//   83  190:astore          17
				int i;
				int k1;
				if(s4 != null)
	//*  84  192:aload           17
	//*  85  194:ifnull          253
				{
					String as[] = s4.split("x");
	//   86  197:aload           17
	//   87  199:ldc2            #391 <String "x">
	//   88  202:invokevirtual   #395 <Method String[] String.split(String)>
	//   89  205:astore          17
					l = Integer.parseInt(as[0]);
	//   90  207:aload           17
	//   91  209:iconst_0        
	//   92  210:aaload          
	//   93  211:invokestatic    #348 <Method int Integer.parseInt(String)>
	//   94  214:istore          4
					i = Integer.parseInt(as[1]);
	//   95  216:aload           17
	//   96  218:iconst_1        
	//   97  219:aaload          
	//   98  220:invokestatic    #348 <Method int Integer.parseInt(String)>
	//   99  223:istore_3        
					if(l <= 0 || i <= 0)
	//* 100  224:iload           4
	//* 101  226:ifle            239
	//* 102  229:iload_3         
	//* 103  230:ifgt            236
	//* 104  233:goto            239
	//* 105  236:goto            244
					{
						l = -1;
	//  106  239:iconst_m1       
	//  107  240:istore          4
						i = -1;
	//  108  242:iconst_m1       
	//  109  243:istore_3        
					}
					k1 = i;
	//  110  244:iload_3         
	//  111  245:istore          6
					i = l;
	//  112  247:iload           4
	//  113  249:istore_3        
				} else
	//* 114  250:goto            258
				{
					i = -1;
	//  115  253:iconst_m1       
	//  116  254:istore_3        
					k1 = -1;
	//  117  255:iconst_m1       
	//  118  256:istore          6
				}
				float f = -1F;
	//  119  258:ldc2            #396 <Float -1F>
	//  120  261:fstore_2        
				as = ((String []) (parseOptionalStringAttr(s2, REGEX_FRAME_RATE)));
	//  121  262:aload           11
	//  122  264:getstatic       #172 <Field Pattern REGEX_FRAME_RATE>
	//  123  267:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//  124  270:astore          17
				if(as != null)
	//* 125  272:aload           17
	//* 126  274:ifnull          283
					f = Float.parseFloat(((String) (as)));
	//  127  277:aload           17
	//  128  279:invokestatic    #402 <Method float Float.parseFloat(String)>
	//  129  282:fstore_2        
				s2 = parseOptionalStringAttr(s2, REGEX_AUDIO);
	//  130  283:aload           11
	//  131  285:getstatic       #156 <Field Pattern REGEX_AUDIO>
	//  132  288:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//  133  291:astore          11
				if(s2 != null && s1 != null)
	//* 134  293:aload           11
	//* 135  295:ifnull          317
	//* 136  298:aload           9
	//* 137  300:ifnull          317
					hashmap.put(((Object) (s2)), ((Object) (Util.getCodecsOfType(s1, 1))));
	//  138  303:aload           16
	//  139  305:aload           11
	//  140  307:aload           9
	//  141  309:iconst_1        
	//  142  310:invokestatic    #406 <Method String Util.getCodecsOfType(String, int)>
	//  143  313:invokevirtual   #410 <Method Object HashMap.put(Object, Object)>
	//  144  316:pop             
				s2 = lineiterator.next();
	//  145  317:aload_0         
	//  146  318:invokevirtual   #373 <Method String HlsPlaylistParser$LineIterator.next()>
	//  147  321:astore          11
				l = i2;
	//  148  323:iload           7
	//  149  325:istore          4
				if(hashset.add(((Object) (s2))))
	//* 150  327:aload           8
	//* 151  329:aload           11
	//* 152  331:invokevirtual   #411 <Method boolean HashSet.add(Object)>
	//* 153  334:ifeq            66
				{
					arraylist1.add(((Object) (new HlsMasterPlaylist.HlsUrl(s2, Format.createVideoContainerFormat(Integer.toString(arraylist1.size()), "application/x-mpegURL", ((String) (null)), s1, i1, i, k1, f, ((List) (null)), 0)))));
	//  154  337:aload           12
	//  155  339:new             #413 <Class HlsMasterPlaylist$HlsUrl>
	//  156  342:dup             
	//  157  343:aload           11
	//  158  345:aload           12
	//  159  347:invokevirtual   #416 <Method int ArrayList.size()>
	//  160  350:invokestatic    #418 <Method String Integer.toString(int)>
	//  161  353:ldc2            #420 <String "application/x-mpegURL">
	//  162  356:aconst_null     
	//  163  357:aload           9
	//  164  359:iload           5
	//  165  361:iload_3         
	//  166  362:iload           6
	//  167  364:fload_2         
	//  168  365:aconst_null     
	//  169  366:iconst_0        
	//  170  367:invokestatic    #426 <Method Format Format.createVideoContainerFormat(String, String, String, String, int, int, int, float, List, int)>
	//  171  370:invokespecial   #429 <Method void HlsMasterPlaylist$HlsUrl(String, Format)>
	//  172  373:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//  173  376:pop             
					l = i2;
	//  174  377:iload           7
	//  175  379:istore          4
				}
			}
		} while(true);
	//  176  381:goto            66
		int j1 = 0;
	//  177  384:iconst_0        
	//  178  385:istore          5
		Format format = null;
	//  179  387:aconst_null     
	//  180  388:astore          9
		lineiterator = null;
	//  181  390:aconst_null     
	//  182  391:astore_0        
		for(; j1 < arraylist.size(); j1++)
	//* 183  392:iload           5
	//* 184  394:aload           10
	//* 185  396:invokevirtual   #416 <Method int ArrayList.size()>
	//* 186  399:icmpge          807
		{
			int j;
			int l1;
			Object obj;
			String s3;
			String s5;
			String s6;
			String s7;
label0:
			{
				obj = ((Object) ((String)arraylist.get(j1)));
	//  187  402:aload           10
	//  188  404:iload           5
	//  189  406:invokevirtual   #433 <Method Object ArrayList.get(int)>
	//  190  409:checkcast       #275 <Class String>
	//  191  412:astore          8
				l1 = parseSelectionFlags(((String) (obj)));
	//  192  414:aload           8
	//  193  416:invokestatic    #436 <Method int parseSelectionFlags(String)>
	//  194  419:istore          6
				s3 = parseOptionalStringAttr(((String) (obj)), REGEX_URI);
	//  195  421:aload           8
	//  196  423:getstatic       #216 <Field Pattern REGEX_URI>
	//  197  426:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//  198  429:astore          11
				s5 = parseStringAttr(((String) (obj)), REGEX_NAME);
	//  199  431:aload           8
	//  200  433:getstatic       #232 <Field Pattern REGEX_NAME>
	//  201  436:invokestatic    #334 <Method String parseStringAttr(String, Pattern)>
	//  202  439:astore          17
				s6 = parseOptionalStringAttr(((String) (obj)), REGEX_LANGUAGE);
	//  203  441:aload           8
	//  204  443:getstatic       #228 <Field Pattern REGEX_LANGUAGE>
	//  205  446:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//  206  449:astore          18
				s7 = parseOptionalStringAttr(((String) (obj)), REGEX_GROUP_ID);
	//  207  451:aload           8
	//  208  453:getstatic       #236 <Field Pattern REGEX_GROUP_ID>
	//  209  456:invokestatic    #389 <Method String parseOptionalStringAttr(String, Pattern)>
	//  210  459:astore          19
				String s8 = parseStringAttr(((String) (obj)), REGEX_TYPE);
	//  211  461:aload           8
	//  212  463:getstatic       #224 <Field Pattern REGEX_TYPE>
	//  213  466:invokestatic    #334 <Method String parseStringAttr(String, Pattern)>
	//  214  469:astore          20
				j = s8.hashCode();
	//  215  471:aload           20
	//  216  473:invokevirtual   #439 <Method int String.hashCode()>
	//  217  476:istore_3        
				if(j != 0xc6d2473b)
	//* 218  477:iload_3         
	//* 219  478:ldc2            #440 <Int 0xc6d2473b>
	//* 220  481:icmpeq          531
				{
					if(j != 0xec239a8e)
	//* 221  484:iload_3         
	//* 222  485:ldc2            #441 <Int 0xec239a8e>
	//* 223  488:icmpeq          516
					{
						if(j == 0x3bba3b6 && s8.equals("AUDIO"))
	//* 224  491:iload_3         
	//* 225  492:ldc2            #442 <Int 0x3bba3b6>
	//* 226  495:icmpeq          501
	//* 227  498:goto            546
	//* 228  501:aload           20
	//* 229  503:ldc1            #131 <String "AUDIO">
	//* 230  505:invokevirtual   #326 <Method boolean String.equals(Object)>
	//* 231  508:ifeq            546
						{
							j = 0;
	//  232  511:iconst_0        
	//  233  512:istore_3        
							break label0;
	//  234  513:goto            548
						}
					} else
					if(s8.equals("CLOSED-CAPTIONS"))
	//* 235  516:aload           20
	//* 236  518:ldc1            #134 <String "CLOSED-CAPTIONS">
	//* 237  520:invokevirtual   #326 <Method boolean String.equals(Object)>
	//* 238  523:ifeq            546
					{
						j = 2;
	//  239  526:iconst_2        
	//  240  527:istore_3        
						break label0;
	//  241  528:goto            548
					}
				} else
				if(s8.equals("SUBTITLES"))
	//* 242  531:aload           20
	//* 243  533:ldc1            #137 <String "SUBTITLES">
	//* 244  535:invokevirtual   #326 <Method boolean String.equals(Object)>
	//* 245  538:ifeq            546
				{
					j = 1;
	//  246  541:iconst_1        
	//  247  542:istore_3        
					break label0;
	//  248  543:goto            548
				}
				j = -1;
	//  249  546:iconst_m1       
	//  250  547:istore_3        
			}
			switch(j)
	//* 251  548:iload_3         
			{
			default:
				break;

	//* 252  549:tableswitch     0 2: default 576
	//	               0 717
	//	               1 682
	//	               2 579
	//* 253  576:goto            798
			case 2: // '\002'
				obj = ((Object) (parseStringAttr(((String) (obj)), REGEX_INSTREAM_ID)));
	//  254  579:aload           8
	//  255  581:getstatic       #240 <Field Pattern REGEX_INSTREAM_ID>
	//  256  584:invokestatic    #334 <Method String parseStringAttr(String, Pattern)>
	//  257  587:astore          8
				int k;
				if(((String) (obj)).startsWith("CC"))
	//* 258  589:aload           8
	//* 259  591:ldc2            #444 <String "CC">
	//* 260  594:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//* 261  597:ifeq            618
				{
					s3 = "application/cea-608";
	//  262  600:ldc2            #446 <String "application/cea-608">
	//  263  603:astore          11
					k = Integer.parseInt(((String) (obj)).substring(2));
	//  264  605:aload           8
	//  265  607:iconst_2        
	//  266  608:invokevirtual   #449 <Method String String.substring(int)>
	//  267  611:invokestatic    #348 <Method int Integer.parseInt(String)>
	//  268  614:istore_3        
				} else
	//* 269  615:goto            637
				{
					s3 = "application/cea-708";
	//  270  618:ldc2            #451 <String "application/cea-708">
	//  271  621:astore          11
					k = Integer.parseInt(((String) (obj)).substring(7));
	//  272  623:aload           8
	//  273  625:bipush          7
	//  274  627:invokevirtual   #449 <Method String String.substring(int)>
	//  275  630:invokestatic    #348 <Method int Integer.parseInt(String)>
	//  276  633:istore_3        
				}
	//* 277  634:goto            615
				obj = ((Object) (lineiterator));
	//  278  637:aload_0         
	//  279  638:astore          8
				if(lineiterator == null)
	//* 280  640:aload_0         
	//* 281  641:ifnonnull       653
					obj = ((Object) (new ArrayList()));
	//  282  644:new             #366 <Class ArrayList>
	//  283  647:dup             
	//  284  648:invokespecial   #367 <Method void ArrayList()>
	//  285  651:astore          8
				((List) (obj)).add(((Object) (Format.createTextContainerFormat(s5, ((String) (null)), s3, ((String) (null)), -1, l1, s6, k))));
	//  286  653:aload           8
	//  287  655:aload           17
	//  288  657:aconst_null     
	//  289  658:aload           11
	//  290  660:aconst_null     
	//  291  661:iconst_m1       
	//  292  662:iload           6
	//  293  664:aload           18
	//  294  666:iload_3         
	//  295  667:invokestatic    #455 <Method Format Format.createTextContainerFormat(String, String, String, String, int, int, String, int)>
	//  296  670:invokeinterface #458 <Method boolean List.add(Object)>
	//  297  675:pop             
				lineiterator = ((LineIterator) (obj));
	//  298  676:aload           8
	//  299  678:astore_0        
				break;
	//  300  679:goto            798

			case 1: // '\001'
				arraylist3.add(((Object) (new HlsMasterPlaylist.HlsUrl(s3, Format.createTextContainerFormat(s5, "application/x-mpegURL", "text/vtt", ((String) (null)), -1, l1, s6)))));
	//  301  682:aload           14
	//  302  684:new             #413 <Class HlsMasterPlaylist$HlsUrl>
	//  303  687:dup             
	//  304  688:aload           11
	//  305  690:aload           17
	//  306  692:ldc2            #420 <String "application/x-mpegURL">
	//  307  695:ldc2            #460 <String "text/vtt">
	//  308  698:aconst_null     
	//  309  699:iconst_m1       
	//  310  700:iload           6
	//  311  702:aload           18
	//  312  704:invokestatic    #463 <Method Format Format.createTextContainerFormat(String, String, String, String, int, int, String)>
	//  313  707:invokespecial   #429 <Method void HlsMasterPlaylist$HlsUrl(String, Format)>
	//  314  710:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//  315  713:pop             
				break;
	//  316  714:goto            798

			case 0: // '\0'
				s7 = (String)hashmap.get(((Object) (s7)));
	//  317  717:aload           16
	//  318  719:aload           19
	//  319  721:invokevirtual   #466 <Method Object HashMap.get(Object)>
	//  320  724:checkcast       #275 <Class String>
	//  321  727:astore          19
				Object obj1;
				if(s7 != null)
	//* 322  729:aload           19
	//* 323  731:ifnull          744
					obj1 = ((Object) (MimeTypes.getMediaMimeType(s7)));
	//  324  734:aload           19
	//  325  736:invokestatic    #472 <Method String MimeTypes.getMediaMimeType(String)>
	//  326  739:astore          8
				else
	//* 327  741:goto            747
					obj1 = null;
	//  328  744:aconst_null     
	//  329  745:astore          8
				obj1 = ((Object) (Format.createAudioContainerFormat(s5, "application/x-mpegURL", ((String) (obj1)), s7, -1, -1, -1, ((List) (null)), l1, s6)));
	//  330  747:aload           17
	//  331  749:ldc2            #420 <String "application/x-mpegURL">
	//  332  752:aload           8
	//  333  754:aload           19
	//  334  756:iconst_m1       
	//  335  757:iconst_m1       
	//  336  758:iconst_m1       
	//  337  759:aconst_null     
	//  338  760:iload           6
	//  339  762:aload           18
	//  340  764:invokestatic    #476 <Method Format Format.createAudioContainerFormat(String, String, String, String, int, int, int, List, int, String)>
	//  341  767:astore          8
				if(s3 == null)
	//* 342  769:aload           11
	//* 343  771:ifnonnull       781
					format = ((Format) (obj1));
	//  344  774:aload           8
	//  345  776:astore          9
				else
	//* 346  778:goto            798
					arraylist2.add(((Object) (new HlsMasterPlaylist.HlsUrl(s3, ((Format) (obj1))))));
	//  347  781:aload           13
	//  348  783:new             #413 <Class HlsMasterPlaylist$HlsUrl>
	//  349  786:dup             
	//  350  787:aload           11
	//  351  789:aload           8
	//  352  791:invokespecial   #429 <Method void HlsMasterPlaylist$HlsUrl(String, Format)>
	//  353  794:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//  354  797:pop             
				break;
			}
		}

	//  355  798:iload           5
	//  356  800:iconst_1        
	//  357  801:iadd            
	//  358  802:istore          5
	//* 359  804:goto            392
		if(l != 0)
	//* 360  807:iload           4
	//* 361  809:ifeq            819
			lineiterator = ((LineIterator) (Collections.emptyList()));
	//  362  812:invokestatic    #482 <Method List Collections.emptyList()>
	//  363  815:astore_0        
	//* 364  816:goto            819
		return new HlsMasterPlaylist(s, ((List) (arraylist4)), ((List) (arraylist1)), ((List) (arraylist2)), ((List) (arraylist3)), format, ((List) (lineiterator)));
	//  365  819:new             #484 <Class HlsMasterPlaylist>
	//  366  822:dup             
	//  367  823:aload_1         
	//  368  824:aload           15
	//  369  826:aload           12
	//  370  828:aload           13
	//  371  830:aload           14
	//  372  832:aload           9
	//  373  834:aload_0         
	//  374  835:invokespecial   #487 <Method void HlsMasterPlaylist(String, List, List, List, List, Format, List)>
	//  375  838:areturn         
	}

	private static HlsMediaPlaylist parseMediaPlaylist(LineIterator lineiterator, String s)
		throws IOException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #491 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #493 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #498 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private static String parseOptionalStringAttr(String s, Pattern pattern)
	{
		s = ((String) (pattern.matcher(((CharSequence) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #312 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_0        
		if(((Matcher) (s)).find())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #318 <Method boolean Matcher.find()>
	//*   6   10:ifeq            19
			return ((Matcher) (s)).group(1);
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #322 <Method String Matcher.group(int)>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	private static int parseSelectionFlags(String s)
	{
		Pattern pattern = REGEX_DEFAULT;
	//    0    0:getstatic       #251 <Field Pattern REGEX_DEFAULT>
	//    1    3:astore          4
		byte byte1 = 0;
	//    2    5:iconst_0        
	//    3    6:istore_2        
		boolean flag = parseBooleanAttribute(s, pattern, false);
	//    4    7:aload_0         
	//    5    8:aload           4
	//    6   10:iconst_0        
	//    7   11:invokestatic    #500 <Method boolean parseBooleanAttribute(String, Pattern, boolean)>
	//    8   14:istore_3        
		byte byte0;
		if(parseBooleanAttribute(s, REGEX_FORCED, false))
	//*   9   15:aload_0         
	//*  10   16:getstatic       #255 <Field Pattern REGEX_FORCED>
	//*  11   19:iconst_0        
	//*  12   20:invokestatic    #500 <Method boolean parseBooleanAttribute(String, Pattern, boolean)>
	//*  13   23:ifeq            31
			byte0 = 2;
	//   14   26:iconst_2        
	//   15   27:istore_1        
		else
	//*  16   28:goto            33
			byte0 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
		if(parseBooleanAttribute(s, REGEX_AUTOSELECT, false))
	//*  19   33:aload_0         
	//*  20   34:getstatic       #247 <Field Pattern REGEX_AUTOSELECT>
	//*  21   37:iconst_0        
	//*  22   38:invokestatic    #500 <Method boolean parseBooleanAttribute(String, Pattern, boolean)>
	//*  23   41:ifeq            46
			byte1 = 4;
	//   24   44:iconst_4        
	//   25   45:istore_2        
		return flag | byte0 | byte1;
	//   26   46:iload_3         
	//   27   47:iload_1         
	//   28   48:ior             
	//   29   49:iload_2         
	//   30   50:ior             
	//   31   51:ireturn         
	}

	private static String parseStringAttr(String s, Pattern pattern)
		throws ParserException
	{
		Matcher matcher = pattern.matcher(((CharSequence) (s)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #312 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_2        
		if(matcher.find() && matcher.groupCount() == 1)
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #318 <Method boolean Matcher.find()>
	//*   6   10:ifeq            27
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #503 <Method int Matcher.groupCount()>
	//*   9   17:iconst_1        
	//*  10   18:icmpne          27
		{
			return matcher.group(1);
	//   11   21:aload_2         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #322 <Method String Matcher.group(int)>
	//   14   26:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   27:new             #291 <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #292 <Method void StringBuilder()>
	//   18   34:astore_2        
			stringbuilder.append("Couldn't match ");
	//   19   35:aload_2         
	//   20   36:ldc2            #505 <String "Couldn't match ">
	//   21   39:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append(pattern.pattern());
	//   23   43:aload_2         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #508 <Method String Pattern.pattern()>
	//   26   48:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			stringbuilder.append(" in ");
	//   28   52:aload_2         
	//   29   53:ldc2            #510 <String " in ">
	//   30   56:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
			stringbuilder.append(s);
	//   32   60:aload_2         
	//   33   61:aload_0         
	//   34   62:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
			throw new ParserException(stringbuilder.toString());
	//   36   66:new             #330 <Class ParserException>
	//   37   69:dup             
	//   38   70:aload_2         
	//   39   71:invokevirtual   #306 <Method String StringBuilder.toString()>
	//   40   74:invokespecial   #511 <Method void ParserException(String)>
	//   41   77:athrow          
		}
	}

	private static com.google.android.exoplayer2.drm.DrmInitData.SchemeData parseWidevineSchemeData(String s, String s1)
		throws ParserException
	{
		if("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(((Object) (s1))))
	//*   0    0:ldc1            #26  <String "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #326 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            45
		{
			s = parseStringAttr(s, REGEX_URI);
	//    4    9:aload_0         
	//    5   10:getstatic       #216 <Field Pattern REGEX_URI>
	//    6   13:invokestatic    #334 <Method String parseStringAttr(String, Pattern)>
	//    7   16:astore_0        
			return new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(s.substring(s.indexOf(',')), 0));
	//    8   17:new             #517 <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
	//    9   20:dup             
	//   10   21:getstatic       #523 <Field java.util.UUID C.WIDEVINE_UUID>
	//   11   24:ldc2            #525 <String "video/mp4">
	//   12   27:aload_0         
	//   13   28:aload_0         
	//   14   29:bipush          44
	//   15   31:invokevirtual   #529 <Method int String.indexOf(int)>
	//   16   34:invokevirtual   #449 <Method String String.substring(int)>
	//   17   37:iconst_0        
	//   18   38:invokestatic    #535 <Method byte[] Base64.decode(String, int)>
	//   19   41:invokespecial   #538 <Method void com.google.android.exoplayer2.drm.DrmInitData$SchemeData(java.util.UUID, String, byte[])>
	//   20   44:areturn         
		}
		if("com.widevine".equals(((Object) (s1))))
	//*  21   45:ldc1            #29  <String "com.widevine">
	//*  22   47:aload_1         
	//*  23   48:invokevirtual   #326 <Method boolean String.equals(Object)>
	//*  24   51:ifeq            87
		{
			try
			{
				s = ((String) (new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", s.getBytes("UTF-8"))));
	//   25   54:new             #517 <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
	//   26   57:dup             
	//   27   58:getstatic       #523 <Field java.util.UUID C.WIDEVINE_UUID>
	//   28   61:ldc2            #540 <String "hls">
	//   29   64:aload_0         
	//   30   65:ldc2            #542 <String "UTF-8">
	//   31   68:invokevirtual   #546 <Method byte[] String.getBytes(String)>
	//   32   71:invokespecial   #538 <Method void com.google.android.exoplayer2.drm.DrmInitData$SchemeData(java.util.UUID, String, byte[])>
	//   33   74:astore_0        
			}
	//*  34   75:aload_0         
	//*  35   76:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  36   77:astore_0        
			{
				throw new ParserException(((Throwable) (s)));
	//   37   78:new             #330 <Class ParserException>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:invokespecial   #549 <Method void ParserException(Throwable)>
	//   41   86:athrow          
			}
			return ((com.google.android.exoplayer2.drm.DrmInitData.SchemeData) (s));
		} else
		{
			return null;
	//   42   87:aconst_null     
	//   43   88:areturn         
		}
	}

	private static int skipIgnorableWhitespace(BufferedReader bufferedreader, boolean flag, int i)
		throws IOException
	{
		for(; i != -1 && Character.isWhitespace(i) && (flag || !Util.isLinebreak(i)); i = bufferedreader.read());
	//    0    0:iload_2         
	//    1    1:iconst_m1       
	//    2    2:icmpeq          31
	//    3    5:iload_2         
	//    4    6:invokestatic    #554 <Method boolean Character.isWhitespace(int)>
	//    5    9:ifeq            31
	//    6   12:iload_1         
	//    7   13:ifne            23
	//    8   16:iload_2         
	//    9   17:invokestatic    #288 <Method boolean Util.isLinebreak(int)>
	//   10   20:ifne            31
	//   11   23:aload_0         
	//   12   24:invokevirtual   #269 <Method int BufferedReader.read()>
	//   13   27:istore_2        
	//*  14   28:goto            0
		return i;
	//   15   31:iload_2         
	//   16   32:ireturn         
	}

	public HlsPlaylist parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		ArrayDeque arraydeque;
		inputstream = ((InputStream) (new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))));
	//    0    0:new             #265 <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #558 <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #561 <Method void InputStreamReader(InputStream)>
	//    6   12:invokespecial   #564 <Method void BufferedReader(java.io.Reader)>
	//    7   15:astore_2        
		arraydeque = new ArrayDeque();
	//    8   16:new             #566 <Class ArrayDeque>
	//    9   19:dup             
	//   10   20:invokespecial   #567 <Method void ArrayDeque()>
	//   11   23:astore_3        
		if(!checkPlaylistHeader(((BufferedReader) (inputstream))))
	//*  12   24:aload_2         
	//*  13   25:invokestatic    #569 <Method boolean checkPlaylistHeader(BufferedReader)>
	//*  14   28:ifne            43
			throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
	//   15   31:new             #571 <Class UnrecognizedInputFormatException>
	//   16   34:dup             
	//   17   35:ldc2            #573 <String "Input does not start with the #EXTM3U header.">
	//   18   38:aload_1         
	//   19   39:invokespecial   #576 <Method void UnrecognizedInputFormatException(String, Uri)>
	//   20   42:athrow          
_L1:
		String s = ((BufferedReader) (inputstream)).readLine();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #579 <Method String BufferedReader.readLine()>
	//   23   47:astore          4
		if(s == null)
			break MISSING_BLOCK_LABEL_241;
	//   24   49:aload           4
	//   25   51:ifnull          241
		s = s.trim();
	//   26   54:aload           4
	//   27   56:invokevirtual   #582 <Method String String.trim()>
	//   28   59:astore          4
		if(!s.isEmpty()) goto _L2; else goto _L1
	//   29   61:aload           4
	//   30   63:invokevirtual   #585 <Method boolean String.isEmpty()>
	//   31   66:ifeq            72
	//*  32   69:goto            43
_L2:
		if(!s.startsWith("#EXT-X-STREAM-INF"))
			break MISSING_BLOCK_LABEL_114;
	//   33   72:aload           4
	//   34   74:ldc1            #122 <String "#EXT-X-STREAM-INF">
	//   35   76:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//   36   79:ifeq            114
		((Queue) (arraydeque)).add(((Object) (s)));
	//   37   82:aload_3         
	//   38   83:aload           4
	//   39   85:invokeinterface #588 <Method boolean Queue.add(Object)>
	//   40   90:pop             
		uri = ((Uri) (parseMasterPlaylist(new LineIterator(((Queue) (arraydeque)), ((BufferedReader) (inputstream))), uri.toString())));
	//   41   91:new             #9   <Class HlsPlaylistParser$LineIterator>
	//   42   94:dup             
	//   43   95:aload_3         
	//   44   96:aload_2         
	//   45   97:invokespecial   #591 <Method void HlsPlaylistParser$LineIterator(Queue, BufferedReader)>
	//   46  100:aload_1         
	//   47  101:invokevirtual   #594 <Method String Uri.toString()>
	//   48  104:invokestatic    #596 <Method HlsMasterPlaylist parseMasterPlaylist(HlsPlaylistParser$LineIterator, String)>
	//   49  107:astore_1        
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//   50  108:aload_2         
	//   51  109:invokestatic    #600 <Method void Util.closeQuietly(java.io.Closeable)>
		return ((HlsPlaylist) (uri));
	//   52  112:aload_1         
	//   53  113:areturn         
		if(s.startsWith("#EXT-X-TARGETDURATION") || s.startsWith("#EXT-X-MEDIA-SEQUENCE") || s.startsWith("#EXTINF") || s.startsWith("#EXT-X-KEY") || s.startsWith("#EXT-X-BYTERANGE") || s.equals("#EXT-X-DISCONTINUITY") || s.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || s.equals("#EXT-X-ENDLIST"))
	//*  54  114:aload           4
	//*  55  116:ldc1            #125 <String "#EXT-X-TARGETDURATION">
	//*  56  118:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  57  121:ifne            209
	//*  58  124:aload           4
	//*  59  126:ldc1            #107 <String "#EXT-X-MEDIA-SEQUENCE">
	//*  60  128:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  61  131:ifne            209
	//*  62  134:aload           4
	//*  63  136:ldc1            #104 <String "#EXTINF">
	//*  64  138:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  65  141:ifne            209
	//*  66  144:aload           4
	//*  67  146:ldc1            #98  <String "#EXT-X-KEY">
	//*  68  148:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  69  151:ifne            209
	//*  70  154:aload           4
	//*  71  156:ldc1            #77  <String "#EXT-X-BYTERANGE">
	//*  72  158:invokevirtual   #377 <Method boolean String.startsWith(String)>
	//*  73  161:ifne            209
	//*  74  164:aload           4
	//*  75  166:ldc1            #80  <String "#EXT-X-DISCONTINUITY">
	//*  76  168:invokevirtual   #326 <Method boolean String.equals(Object)>
	//*  77  171:ifne            209
	//*  78  174:aload           4
	//*  79  176:ldc1            #83  <String "#EXT-X-DISCONTINUITY-SEQUENCE">
	//*  80  178:invokevirtual   #326 <Method boolean String.equals(Object)>
	//*  81  181:ifne            209
	//*  82  184:aload           4
	//*  83  186:ldc1            #86  <String "#EXT-X-ENDLIST">
	//*  84  188:invokevirtual   #326 <Method boolean String.equals(Object)>
	//*  85  191:ifeq            197
			break MISSING_BLOCK_LABEL_209;
	//   86  194:goto            209
		((Queue) (arraydeque)).add(((Object) (s)));
	//   87  197:aload_3         
	//   88  198:aload           4
	//   89  200:invokeinterface #588 <Method boolean Queue.add(Object)>
	//   90  205:pop             
		  goto _L1
	//*  91  206:goto            43
		((Queue) (arraydeque)).add(((Object) (s)));
	//   92  209:aload_3         
	//   93  210:aload           4
	//   94  212:invokeinterface #588 <Method boolean Queue.add(Object)>
	//   95  217:pop             
		uri = ((Uri) (parseMediaPlaylist(new LineIterator(((Queue) (arraydeque)), ((BufferedReader) (inputstream))), uri.toString())));
	//   96  218:new             #9   <Class HlsPlaylistParser$LineIterator>
	//   97  221:dup             
	//   98  222:aload_3         
	//   99  223:aload_2         
	//  100  224:invokespecial   #591 <Method void HlsPlaylistParser$LineIterator(Queue, BufferedReader)>
	//  101  227:aload_1         
	//  102  228:invokevirtual   #594 <Method String Uri.toString()>
	//  103  231:invokestatic    #602 <Method HlsMediaPlaylist parseMediaPlaylist(HlsPlaylistParser$LineIterator, String)>
	//  104  234:astore_1        
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//  105  235:aload_2         
	//  106  236:invokestatic    #600 <Method void Util.closeQuietly(java.io.Closeable)>
		return ((HlsPlaylist) (uri));
	//  107  239:aload_1         
	//  108  240:areturn         
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//  109  241:aload_2         
	//  110  242:invokestatic    #600 <Method void Util.closeQuietly(java.io.Closeable)>
		throw new ParserException("Failed to parse the playlist, could not identify any tags.");
	//  111  245:new             #330 <Class ParserException>
	//  112  248:dup             
	//  113  249:ldc2            #604 <String "Failed to parse the playlist, could not identify any tags.">
	//  114  252:invokespecial   #511 <Method void ParserException(String)>
	//  115  255:athrow          
		uri;
	//  116  256:astore_1        
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//  117  257:aload_2         
	//  118  258:invokestatic    #600 <Method void Util.closeQuietly(java.io.Closeable)>
		throw uri;
	//  119  261:aload_1         
	//  120  262:athrow          
	}

	public volatile Object parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		return ((Object) (parse(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #607 <Method HlsPlaylist parse(Uri, InputStream)>
	//    4    6:areturn         
	}

	private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
	private static final String BOOLEAN_FALSE = "NO";
	private static final String BOOLEAN_TRUE = "YES";
	private static final String KEYFORMAT_IDENTITY = "identity";
	private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
	private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
	private static final String METHOD_AES_128 = "AES-128";
	private static final String METHOD_NONE = "NONE";
	private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
	private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
	private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
	private static final String PLAYLIST_HEADER = "#EXTM3U";
	private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
	private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
	private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
	private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
	private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
	private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
	private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
	private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
	private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
	private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
	private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
	private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
	private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
	private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
	private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
	private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
	private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
	private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(,|$)");
	private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
	private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
	private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
	private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
	private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
	private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
	private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
	private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
	private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
	private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
	private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
	private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
	private static final String TAG_GAP = "#EXT-X-GAP";
	private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
	private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
	private static final String TAG_KEY = "#EXT-X-KEY";
	private static final String TAG_MEDIA = "#EXT-X-MEDIA";
	private static final String TAG_MEDIA_DURATION = "#EXTINF";
	private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
	private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
	private static final String TAG_PREFIX = "#EXT";
	private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
	private static final String TAG_START = "#EXT-X-START";
	private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
	private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
	private static final String TAG_VERSION = "#EXT-X-VERSION";
	private static final String TYPE_AUDIO = "AUDIO";
	private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
	private static final String TYPE_SUBTITLES = "SUBTITLES";
	private static final String TYPE_VIDEO = "VIDEO";

	static 
	{
	//    0    0:ldc1            #144 <String "AVERAGE-BANDWIDTH=(\\d+)\\b">
	//    1    2:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #152 <Field Pattern REGEX_AVERAGE_BANDWIDTH>
	//    3    8:ldc1            #154 <String "AUDIO=\"(.+?)\"">
	//    4   10:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #156 <Field Pattern REGEX_AUDIO>
	//    6   16:ldc1            #158 <String "[^-]BANDWIDTH=(\\d+)\\b">
	//    7   18:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #160 <Field Pattern REGEX_BANDWIDTH>
	//    9   24:ldc1            #162 <String "CODECS=\"(.+?)\"">
	//   10   26:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   11   29:putstatic       #164 <Field Pattern REGEX_CODECS>
	//   12   32:ldc1            #166 <String "RESOLUTION=(\\d+x\\d+)">
	//   13   34:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   14   37:putstatic       #168 <Field Pattern REGEX_RESOLUTION>
	//   15   40:ldc1            #170 <String "FRAME-RATE=([\\d\\.]+)\\b">
	//   16   42:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   17   45:putstatic       #172 <Field Pattern REGEX_FRAME_RATE>
	//   18   48:ldc1            #174 <String "#EXT-X-TARGETDURATION:(\\d+)\\b">
	//   19   50:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   20   53:putstatic       #176 <Field Pattern REGEX_TARGET_DURATION>
	//   21   56:ldc1            #178 <String "#EXT-X-VERSION:(\\d+)\\b">
	//   22   58:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   23   61:putstatic       #180 <Field Pattern REGEX_VERSION>
	//   24   64:ldc1            #182 <String "#EXT-X-PLAYLIST-TYPE:(.+)\\b">
	//   25   66:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   26   69:putstatic       #184 <Field Pattern REGEX_PLAYLIST_TYPE>
	//   27   72:ldc1            #186 <String "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b">
	//   28   74:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   29   77:putstatic       #188 <Field Pattern REGEX_MEDIA_SEQUENCE>
	//   30   80:ldc1            #190 <String "#EXTINF:([\\d\\.]+)\\b">
	//   31   82:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   32   85:putstatic       #192 <Field Pattern REGEX_MEDIA_DURATION>
	//   33   88:ldc1            #194 <String "TIME-OFFSET=(-?[\\d\\.]+)\\b">
	//   34   90:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   35   93:putstatic       #196 <Field Pattern REGEX_TIME_OFFSET>
	//   36   96:ldc1            #198 <String "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b">
	//   37   98:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   38  101:putstatic       #200 <Field Pattern REGEX_BYTERANGE>
	//   39  104:ldc1            #202 <String "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"">
	//   40  106:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   41  109:putstatic       #204 <Field Pattern REGEX_ATTR_BYTERANGE>
	//   42  112:ldc1            #206 <String "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(,|$)">
	//   43  114:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   44  117:putstatic       #208 <Field Pattern REGEX_METHOD>
	//   45  120:ldc1            #210 <String "KEYFORMAT=\"(.+?)\"">
	//   46  122:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   47  125:putstatic       #212 <Field Pattern REGEX_KEYFORMAT>
	//   48  128:ldc1            #214 <String "URI=\"(.+?)\"">
	//   49  130:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   50  133:putstatic       #216 <Field Pattern REGEX_URI>
	//   51  136:ldc1            #218 <String "IV=([^,.*]+)">
	//   52  138:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   53  141:putstatic       #220 <Field Pattern REGEX_IV>
	//   54  144:ldc1            #222 <String "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)">
	//   55  146:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   56  149:putstatic       #224 <Field Pattern REGEX_TYPE>
	//   57  152:ldc1            #226 <String "LANGUAGE=\"(.+?)\"">
	//   58  154:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   59  157:putstatic       #228 <Field Pattern REGEX_LANGUAGE>
	//   60  160:ldc1            #230 <String "NAME=\"(.+?)\"">
	//   61  162:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   62  165:putstatic       #232 <Field Pattern REGEX_NAME>
	//   63  168:ldc1            #234 <String "GROUP-ID=\"(.+?)\"">
	//   64  170:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   65  173:putstatic       #236 <Field Pattern REGEX_GROUP_ID>
	//   66  176:ldc1            #238 <String "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"">
	//   67  178:invokestatic    #150 <Method Pattern Pattern.compile(String)>
	//   68  181:putstatic       #240 <Field Pattern REGEX_INSTREAM_ID>
	//   69  184:ldc1            #242 <String "AUTOSELECT">
	//   70  186:invokestatic    #245 <Method Pattern compileBooleanAttrPattern(String)>
	//   71  189:putstatic       #247 <Field Pattern REGEX_AUTOSELECT>
	//   72  192:ldc1            #249 <String "DEFAULT">
	//   73  194:invokestatic    #245 <Method Pattern compileBooleanAttrPattern(String)>
	//   74  197:putstatic       #251 <Field Pattern REGEX_DEFAULT>
	//   75  200:ldc1            #253 <String "FORCED">
	//   76  202:invokestatic    #245 <Method Pattern compileBooleanAttrPattern(String)>
	//   77  205:putstatic       #255 <Field Pattern REGEX_FORCED>
	//*  78  208:return          
	}
}
