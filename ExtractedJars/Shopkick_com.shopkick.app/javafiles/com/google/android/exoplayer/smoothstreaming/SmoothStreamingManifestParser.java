// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import org.xmlpull.v1.*;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifest

public class SmoothStreamingManifestParser
	implements com.google.android.exoplayer.upstream.UriLoadable.Parser
{
	private static abstract class ElementParser
	{

		private ElementParser newChildParser(ElementParser elementparser, String s, String s1)
		{
			if("QualityLevel".equals(((Object) (s))))
		//*   0    0:ldc1            #36  <String "QualityLevel">
		//*   1    2:aload_2         
		//*   2    3:invokevirtual   #42  <Method boolean String.equals(Object)>
		//*   3    6:ifeq            19
				return ((ElementParser) (new TrackElementParser(elementparser, s1)));
		//    4    9:new             #44  <Class SmoothStreamingManifestParser$TrackElementParser>
		//    5   12:dup             
		//    6   13:aload_1         
		//    7   14:aload_3         
		//    8   15:invokespecial   #47  <Method void SmoothStreamingManifestParser$TrackElementParser(SmoothStreamingManifestParser$ElementParser, String)>
		//    9   18:areturn         
			if("Protection".equals(((Object) (s))))
		//*  10   19:ldc1            #49  <String "Protection">
		//*  11   21:aload_2         
		//*  12   22:invokevirtual   #42  <Method boolean String.equals(Object)>
		//*  13   25:ifeq            38
				return ((ElementParser) (new ProtectionElementParser(elementparser, s1)));
		//   14   28:new             #51  <Class SmoothStreamingManifestParser$ProtectionElementParser>
		//   15   31:dup             
		//   16   32:aload_1         
		//   17   33:aload_3         
		//   18   34:invokespecial   #52  <Method void SmoothStreamingManifestParser$ProtectionElementParser(SmoothStreamingManifestParser$ElementParser, String)>
		//   19   37:areturn         
			if("StreamIndex".equals(((Object) (s))))
		//*  20   38:ldc1            #54  <String "StreamIndex">
		//*  21   40:aload_2         
		//*  22   41:invokevirtual   #42  <Method boolean String.equals(Object)>
		//*  23   44:ifeq            57
				return ((ElementParser) (new StreamElementParser(elementparser, s1)));
		//   24   47:new             #56  <Class SmoothStreamingManifestParser$StreamElementParser>
		//   25   50:dup             
		//   26   51:aload_1         
		//   27   52:aload_3         
		//   28   53:invokespecial   #57  <Method void SmoothStreamingManifestParser$StreamElementParser(SmoothStreamingManifestParser$ElementParser, String)>
		//   29   56:areturn         
			else
				return null;
		//   30   57:aconst_null     
		//   31   58:areturn         
		}

		protected void addChild(Object obj)
		{
		//    0    0:return          
		}

		protected abstract Object build();

		protected final Object getNormalizedAttribute(String s)
		{
			for(int i = 0; i < normalizedAttributes.size(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_2        
		//*   2    2:iload_2         
		//*   3    3:aload_0         
		//*   4    4:getfield        #31  <Field List normalizedAttributes>
		//*   5    7:invokeinterface #69  <Method int List.size()>
		//*   6   12:icmpge          55
			{
				Pair pair = (Pair)normalizedAttributes.get(i);
		//    7   15:aload_0         
		//    8   16:getfield        #31  <Field List normalizedAttributes>
		//    9   19:iload_2         
		//   10   20:invokeinterface #73  <Method Object List.get(int)>
		//   11   25:checkcast       #75  <Class Pair>
		//   12   28:astore_3        
				if(((String)pair.first).equals(((Object) (s))))
		//*  13   29:aload_3         
		//*  14   30:getfield        #79  <Field Object Pair.first>
		//*  15   33:checkcast       #38  <Class String>
		//*  16   36:aload_1         
		//*  17   37:invokevirtual   #42  <Method boolean String.equals(Object)>
		//*  18   40:ifeq            48
					return pair.second;
		//   19   43:aload_3         
		//   20   44:getfield        #82  <Field Object Pair.second>
		//   21   47:areturn         
			}

		//   22   48:iload_2         
		//   23   49:iconst_1        
		//   24   50:iadd            
		//   25   51:istore_2        
		//*  26   52:goto            2
			ElementParser elementparser = parent;
		//   27   55:aload_0         
		//   28   56:getfield        #22  <Field SmoothStreamingManifestParser$ElementParser parent>
		//   29   59:astore_3        
			if(elementparser == null)
		//*  30   60:aload_3         
		//*  31   61:ifnonnull       66
				return ((Object) (null));
		//   32   64:aconst_null     
		//   33   65:areturn         
			else
				return elementparser.getNormalizedAttribute(s);
		//   34   66:aload_3         
		//   35   67:aload_1         
		//   36   68:invokevirtual   #84  <Method Object getNormalizedAttribute(String)>
		//   37   71:areturn         
		}

		protected boolean handleChildInline(String s)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public final Object parse(XmlPullParser xmlpullparser)
			throws XmlPullParserException, IOException, ParserException
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			int j = 0;
		//    2    2:iconst_0        
		//    3    3:istore          5
			do
			{
				int i;
				boolean flag1;
				switch(xmlpullparser.getEventType())
		//*   4    5:aload_1         
		//*   5    6:invokeinterface #99  <Method int XmlPullParser.getEventType()>
				{
		//*   6   11:tableswitch     1 4: default 40
		//		               1 271
		//		               2 143
		//		               3 84
		//		               4 49
				default:
					flag1 = flag;
		//    7   40:iload_3         
		//    8   41:istore          4
					i = j;
		//    9   43:iload           5
		//   10   45:istore_2        
					break;
		//   11   46:goto            273

				case 4: // '\004'
					flag1 = flag;
		//   12   49:iload_3         
		//   13   50:istore          4
					i = j;
		//   14   52:iload           5
		//   15   54:istore_2        
					if(!flag)
						break;
		//   16   55:iload_3         
		//   17   56:ifeq            273
					flag1 = flag;
		//   18   59:iload_3         
		//   19   60:istore          4
					i = j;
		//   20   62:iload           5
		//   21   64:istore_2        
					if(j == 0)
		//*  22   65:iload           5
		//*  23   67:ifne            273
					{
						parseText(xmlpullparser);
		//   24   70:aload_0         
		//   25   71:aload_1         
		//   26   72:invokevirtual   #103 <Method void parseText(XmlPullParser)>
						flag1 = flag;
		//   27   75:iload_3         
		//   28   76:istore          4
						i = j;
		//   29   78:iload           5
		//   30   80:istore_2        
					}
					break;
		//   31   81:goto            273

				case 3: // '\003'
					flag1 = flag;
		//   32   84:iload_3         
		//   33   85:istore          4
					i = j;
		//   34   87:iload           5
		//   35   89:istore_2        
					if(!flag)
						break;
		//   36   90:iload_3         
		//   37   91:ifeq            273
					if(j > 0)
		//*  38   94:iload           5
		//*  39   96:ifle            110
					{
						i = j - 1;
		//   40   99:iload           5
		//   41  101:iconst_1        
		//   42  102:isub            
		//   43  103:istore_2        
						flag1 = flag;
		//   44  104:iload_3         
		//   45  105:istore          4
						break;
		//   46  107:goto            273
					}
					String s = xmlpullparser.getName();
		//   47  110:aload_1         
		//   48  111:invokeinterface #107 <Method String XmlPullParser.getName()>
		//   49  116:astore          6
					parseEndTag(xmlpullparser);
		//   50  118:aload_0         
		//   51  119:aload_1         
		//   52  120:invokevirtual   #110 <Method void parseEndTag(XmlPullParser)>
					flag1 = flag;
		//   53  123:iload_3         
		//   54  124:istore          4
					i = j;
		//   55  126:iload           5
		//   56  128:istore_2        
					if(!handleChildInline(s))
		//*  57  129:aload_0         
		//*  58  130:aload           6
		//*  59  132:invokevirtual   #112 <Method boolean handleChildInline(String)>
		//*  60  135:ifne            273
						return build();
		//   61  138:aload_0         
		//   62  139:invokevirtual   #114 <Method Object build()>
		//   63  142:areturn         
					break;

				case 2: // '\002'
					Object obj = ((Object) (xmlpullparser.getName()));
		//   64  143:aload_1         
		//   65  144:invokeinterface #107 <Method String XmlPullParser.getName()>
		//   66  149:astore          6
					if(tag.equals(obj))
		//*  67  151:aload_0         
		//*  68  152:getfield        #26  <Field String tag>
		//*  69  155:aload           6
		//*  70  157:invokevirtual   #42  <Method boolean String.equals(Object)>
		//*  71  160:ifeq            177
					{
						parseStartTag(xmlpullparser);
		//   72  163:aload_0         
		//   73  164:aload_1         
		//   74  165:invokevirtual   #117 <Method void parseStartTag(XmlPullParser)>
						flag1 = true;
		//   75  168:iconst_1        
		//   76  169:istore          4
						i = j;
		//   77  171:iload           5
		//   78  173:istore_2        
						break;
		//   79  174:goto            273
					}
					flag1 = flag;
		//   80  177:iload_3         
		//   81  178:istore          4
					i = j;
		//   82  180:iload           5
		//   83  182:istore_2        
					if(!flag)
						break;
		//   84  183:iload_3         
		//   85  184:ifeq            273
					if(j > 0)
		//*  86  187:iload           5
		//*  87  189:ifle            203
					{
						i = j + 1;
		//   88  192:iload           5
		//   89  194:iconst_1        
		//   90  195:iadd            
		//   91  196:istore_2        
						flag1 = flag;
		//   92  197:iload_3         
		//   93  198:istore          4
						break;
		//   94  200:goto            273
					}
					if(handleChildInline(((String) (obj))))
		//*  95  203:aload_0         
		//*  96  204:aload           6
		//*  97  206:invokevirtual   #112 <Method boolean handleChildInline(String)>
		//*  98  209:ifeq            226
					{
						parseStartTag(xmlpullparser);
		//   99  212:aload_0         
		//  100  213:aload_1         
		//  101  214:invokevirtual   #117 <Method void parseStartTag(XmlPullParser)>
						flag1 = flag;
		//  102  217:iload_3         
		//  103  218:istore          4
						i = j;
		//  104  220:iload           5
		//  105  222:istore_2        
						break;
		//  106  223:goto            273
					}
					obj = ((Object) (newChildParser(this, ((String) (obj)), baseUri)));
		//  107  226:aload_0         
		//  108  227:aload_0         
		//  109  228:aload           6
		//  110  230:aload_0         
		//  111  231:getfield        #24  <Field String baseUri>
		//  112  234:invokespecial   #119 <Method SmoothStreamingManifestParser$ElementParser newChildParser(SmoothStreamingManifestParser$ElementParser, String, String)>
		//  113  237:astore          6
					if(obj == null)
		//* 114  239:aload           6
		//* 115  241:ifnonnull       252
					{
						i = 1;
		//  116  244:iconst_1        
		//  117  245:istore_2        
						flag1 = flag;
		//  118  246:iload_3         
		//  119  247:istore          4
					} else
		//* 120  249:goto            273
					{
						addChild(((ElementParser) (obj)).parse(xmlpullparser));
		//  121  252:aload_0         
		//  122  253:aload           6
		//  123  255:aload_1         
		//  124  256:invokevirtual   #121 <Method Object parse(XmlPullParser)>
		//  125  259:invokevirtual   #123 <Method void addChild(Object)>
						flag1 = flag;
		//  126  262:iload_3         
		//  127  263:istore          4
						i = j;
		//  128  265:iload           5
		//  129  267:istore_2        
					}
					break;

		//* 130  268:goto            273
				case 1: // '\001'
					return ((Object) (null));
		//  131  271:aconst_null     
		//  132  272:areturn         
				}
				xmlpullparser.next();
		//  133  273:aload_1         
		//  134  274:invokeinterface #126 <Method int XmlPullParser.next()>
		//  135  279:pop             
				flag = flag1;
		//  136  280:iload           4
		//  137  282:istore_3        
				j = i;
		//  138  283:iload_2         
		//  139  284:istore          5
			} while(true);
		//  140  286:goto            5
		}

		protected final boolean parseBoolean(XmlPullParser xmlpullparser, String s, boolean flag)
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:aload_2         
		//    3    3:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          18
				return Boolean.parseBoolean(((String) (xmlpullparser)));
		//    7   13:aload_1         
		//    8   14:invokestatic    #137 <Method boolean Boolean.parseBoolean(String)>
		//    9   17:ireturn         
			else
				return flag;
		//   10   18:iload_3         
		//   11   19:ireturn         
		}

		protected void parseEndTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
		//    0    0:return          
		}

		protected final int parseInt(XmlPullParser xmlpullparser, String s, int i)
			throws ParserException
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:aload_2         
		//    3    3:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          30
			{
				try
				{
					i = Integer.parseInt(((String) (xmlpullparser)));
		//    7   13:aload_1         
		//    8   14:invokestatic    #146 <Method int Integer.parseInt(String)>
		//    9   17:istore_3        
				}
		//*  10   18:iload_3         
		//*  11   19:ireturn         
				// Misplaced declaration of an exception variable
				catch(XmlPullParser xmlpullparser)
		//*  12   20:astore_1        
				{
					throw new ParserException(((Throwable) (xmlpullparser)));
		//   13   21:new             #94  <Class ParserException>
		//   14   24:dup             
		//   15   25:aload_1         
		//   16   26:invokespecial   #149 <Method void ParserException(Throwable)>
		//   17   29:athrow          
				}
				return i;
			} else
			{
				return i;
		//   18   30:iload_3         
		//   19   31:ireturn         
			}
		}

		protected final long parseLong(XmlPullParser xmlpullparser, String s, long l)
			throws ParserException
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:aload_2         
		//    3    3:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          30
			{
				try
				{
					l = Long.parseLong(((String) (xmlpullparser)));
		//    7   13:aload_1         
		//    8   14:invokestatic    #156 <Method long Long.parseLong(String)>
		//    9   17:lstore_3        
				}
		//*  10   18:lload_3         
		//*  11   19:lreturn         
				// Misplaced declaration of an exception variable
				catch(XmlPullParser xmlpullparser)
		//*  12   20:astore_1        
				{
					throw new ParserException(((Throwable) (xmlpullparser)));
		//   13   21:new             #94  <Class ParserException>
		//   14   24:dup             
		//   15   25:aload_1         
		//   16   26:invokespecial   #149 <Method void ParserException(Throwable)>
		//   17   29:athrow          
				}
				return l;
			} else
			{
				return l;
		//   18   30:lload_3         
		//   19   31:lreturn         
			}
		}

		protected final int parseRequiredInt(XmlPullParser xmlpullparser, String s)
			throws ParserException
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:aload_2         
		//    3    3:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          30
			{
				int i;
				try
				{
					i = Integer.parseInt(((String) (xmlpullparser)));
		//    7   13:aload_1         
		//    8   14:invokestatic    #146 <Method int Integer.parseInt(String)>
		//    9   17:istore_3        
				}
		//*  10   18:iload_3         
		//*  11   19:ireturn         
				// Misplaced declaration of an exception variable
				catch(XmlPullParser xmlpullparser)
		//*  12   20:astore_1        
				{
					throw new ParserException(((Throwable) (xmlpullparser)));
		//   13   21:new             #94  <Class ParserException>
		//   14   24:dup             
		//   15   25:aload_1         
		//   16   26:invokespecial   #149 <Method void ParserException(Throwable)>
		//   17   29:athrow          
				}
				return i;
			} else
			{
				throw new MissingFieldException(s);
		//   18   30:new             #160 <Class SmoothStreamingManifestParser$MissingFieldException>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:invokespecial   #163 <Method void SmoothStreamingManifestParser$MissingFieldException(String)>
		//   22   38:athrow          
			}
		}

		protected final long parseRequiredLong(XmlPullParser xmlpullparser, String s)
			throws ParserException
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:aload_2         
		//    3    3:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          30
			{
				long l;
				try
				{
					l = Long.parseLong(((String) (xmlpullparser)));
		//    7   13:aload_1         
		//    8   14:invokestatic    #156 <Method long Long.parseLong(String)>
		//    9   17:lstore_3        
				}
		//*  10   18:lload_3         
		//*  11   19:lreturn         
				// Misplaced declaration of an exception variable
				catch(XmlPullParser xmlpullparser)
		//*  12   20:astore_1        
				{
					throw new ParserException(((Throwable) (xmlpullparser)));
		//   13   21:new             #94  <Class ParserException>
		//   14   24:dup             
		//   15   25:aload_1         
		//   16   26:invokespecial   #149 <Method void ParserException(Throwable)>
		//   17   29:athrow          
				}
				return l;
			} else
			{
				throw new MissingFieldException(s);
		//   18   30:new             #160 <Class SmoothStreamingManifestParser$MissingFieldException>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:invokespecial   #163 <Method void SmoothStreamingManifestParser$MissingFieldException(String)>
		//   22   38:athrow          
			}
		}

		protected final String parseRequiredString(XmlPullParser xmlpullparser, String s)
			throws MissingFieldException
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:aload_2         
		//    3    3:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          15
				return ((String) (xmlpullparser));
		//    7   13:aload_1         
		//    8   14:areturn         
			else
				throw new MissingFieldException(s);
		//    9   15:new             #160 <Class SmoothStreamingManifestParser$MissingFieldException>
		//   10   18:dup             
		//   11   19:aload_2         
		//   12   20:invokespecial   #163 <Method void SmoothStreamingManifestParser$MissingFieldException(String)>
		//   13   23:athrow          
		}

		protected void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
		//    0    0:return          
		}

		protected void parseText(XmlPullParser xmlpullparser)
			throws ParserException
		{
		//    0    0:return          
		}

		protected final void putNormalizedAttribute(String s, Object obj)
		{
			normalizedAttributes.add(((Object) (Pair.create(((Object) (s)), obj))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List normalizedAttributes>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #173 <Method Pair Pair.create(Object, Object)>
		//    5    9:invokeinterface #176 <Method boolean List.add(Object)>
		//    6   14:pop             
		//    7   15:return          
		}

		private final String baseUri;
		private final List normalizedAttributes = new LinkedList();
		private final ElementParser parent;
		private final String tag;

		public ElementParser(ElementParser elementparser, String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			parent = elementparser;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field SmoothStreamingManifestParser$ElementParser parent>
			baseUri = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field String baseUri>
			tag = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field String tag>
		//   11   19:aload_0         
		//   12   20:new             #28  <Class LinkedList>
		//   13   23:dup             
		//   14   24:invokespecial   #29  <Method void LinkedList()>
		//   15   27:putfield        #31  <Field List normalizedAttributes>
		//   16   30:return          
		}
	}

	public static class MissingFieldException extends ParserException
	{

		public MissingFieldException(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #11  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Missing required field: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #16  <String "Missing required field: ">
		//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			super(stringbuilder.toString());
		//   12   21:aload_0         
		//   13   22:aload_2         
		//   14   23:invokevirtual   #24  <Method String StringBuilder.toString()>
		//   15   26:invokespecial   #26  <Method void ParserException(String)>
		//   16   29:return          
		}
	}

	private static class ProtectionElementParser extends ElementParser
	{

		private static String stripCurlyBraces(String s)
		{
			String s1 = s;
		//    0    0:aload_0         
		//    1    1:astore_1        
			if(s.charAt(0) == '{')
		//*   2    2:aload_0         
		//*   3    3:iconst_0        
		//*   4    4:invokevirtual   #37  <Method char String.charAt(int)>
		//*   5    7:bipush          123
		//*   6    9:icmpne          41
			{
				s1 = s;
		//    7   12:aload_0         
		//    8   13:astore_1        
				if(s.charAt(s.length() - 1) == '}')
		//*   9   14:aload_0         
		//*  10   15:aload_0         
		//*  11   16:invokevirtual   #41  <Method int String.length()>
		//*  12   19:iconst_1        
		//*  13   20:isub            
		//*  14   21:invokevirtual   #37  <Method char String.charAt(int)>
		//*  15   24:bipush          125
		//*  16   26:icmpne          41
					s1 = s.substring(1, s.length() - 1);
		//   17   29:aload_0         
		//   18   30:iconst_1        
		//   19   31:aload_0         
		//   20   32:invokevirtual   #41  <Method int String.length()>
		//   21   35:iconst_1        
		//   22   36:isub            
		//   23   37:invokevirtual   #45  <Method String String.substring(int, int)>
		//   24   40:astore_1        
			}
			return s1;
		//   25   41:aload_1         
		//   26   42:areturn         
		}

		public Object build()
		{
			UUID uuid1 = uuid;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field UUID uuid>
		//    2    4:astore_1        
			return ((Object) (new SmoothStreamingManifest.ProtectionElement(uuid1, PsshAtomUtil.buildPsshAtom(uuid1, initData))));
		//    3    5:new             #51  <Class SmoothStreamingManifest$ProtectionElement>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:getfield        #53  <Field byte[] initData>
		//    9   15:invokestatic    #59  <Method byte[] PsshAtomUtil.buildPsshAtom(UUID, byte[])>
		//   10   18:invokespecial   #62  <Method void SmoothStreamingManifest$ProtectionElement(UUID, byte[])>
		//   11   21:areturn         
		}

		public boolean handleChildInline(String s)
		{
			return "ProtectionHeader".equals(((Object) (s)));
		//    0    0:ldc1            #17  <String "ProtectionHeader">
		//    1    2:aload_1         
		//    2    3:invokevirtual   #68  <Method boolean String.equals(Object)>
		//    3    6:ireturn         
		}

		public void parseEndTag(XmlPullParser xmlpullparser)
		{
			if("ProtectionHeader".equals(((Object) (xmlpullparser.getName()))))
		//*   0    0:ldc1            #17  <String "ProtectionHeader">
		//*   1    2:aload_1         
		//*   2    3:invokeinterface #76  <Method String XmlPullParser.getName()>
		//*   3    8:invokevirtual   #68  <Method boolean String.equals(Object)>
		//*   4   11:ifeq            19
				inProtectionHeader = false;
		//    5   14:aload_0         
		//    6   15:iconst_0        
		//    7   16:putfield        #78  <Field boolean inProtectionHeader>
		//    8   19:return          
		}

		public void parseStartTag(XmlPullParser xmlpullparser)
		{
			if("ProtectionHeader".equals(((Object) (xmlpullparser.getName()))))
		//*   0    0:ldc1            #17  <String "ProtectionHeader">
		//*   1    2:aload_1         
		//*   2    3:invokeinterface #76  <Method String XmlPullParser.getName()>
		//*   3    8:invokevirtual   #68  <Method boolean String.equals(Object)>
		//*   4   11:ifeq            38
			{
				inProtectionHeader = true;
		//    5   14:aload_0         
		//    6   15:iconst_1        
		//    7   16:putfield        #78  <Field boolean inProtectionHeader>
				uuid = UUID.fromString(stripCurlyBraces(xmlpullparser.getAttributeValue(((String) (null)), "SystemID")));
		//    8   19:aload_0         
		//    9   20:aload_1         
		//   10   21:aconst_null     
		//   11   22:ldc1            #11  <String "SystemID">
		//   12   24:invokeinterface #83  <Method String XmlPullParser.getAttributeValue(String, String)>
		//   13   29:invokestatic    #85  <Method String stripCurlyBraces(String)>
		//   14   32:invokestatic    #91  <Method UUID UUID.fromString(String)>
		//   15   35:putfield        #49  <Field UUID uuid>
			}
		//   16   38:return          
		}

		public void parseText(XmlPullParser xmlpullparser)
		{
			if(inProtectionHeader)
		//*   0    0:aload_0         
		//*   1    1:getfield        #78  <Field boolean inProtectionHeader>
		//*   2    4:ifeq            21
				initData = Base64.decode(xmlpullparser.getText(), 0);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokeinterface #95  <Method String XmlPullParser.getText()>
		//    6   14:iconst_0        
		//    7   15:invokestatic    #101 <Method byte[] Base64.decode(String, int)>
		//    8   18:putfield        #53  <Field byte[] initData>
		//    9   21:return          
		}

		public static final String KEY_SYSTEM_ID = "SystemID";
		public static final String TAG = "Protection";
		public static final String TAG_PROTECTION_HEADER = "ProtectionHeader";
		private boolean inProtectionHeader;
		private byte initData[];
		private UUID uuid;

		public ProtectionElementParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "Protection");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #14  <String "Protection">
		//    4    5:invokespecial   #28  <Method void SmoothStreamingManifestParser$ElementParser(SmoothStreamingManifestParser$ElementParser, String, String)>
		//    5    8:return          
		}
	}

	private static class SmoothStreamMediaParser extends ElementParser
	{

		public void addChild(Object obj)
		{
			if(obj instanceof SmoothStreamingManifest.StreamElement)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #68  <Class SmoothStreamingManifest$StreamElement>
		//*   2    4:ifeq            22
			{
				streamElements.add(((Object) ((SmoothStreamingManifest.StreamElement)obj)));
		//    3    7:aload_0         
		//    4    8:getfield        #63  <Field List streamElements>
		//    5   11:aload_1         
		//    6   12:checkcast       #68  <Class SmoothStreamingManifest$StreamElement>
		//    7   15:invokeinterface #74  <Method boolean List.add(Object)>
		//    8   20:pop             
				return;
		//    9   21:return          
			}
			if(obj instanceof SmoothStreamingManifest.ProtectionElement)
		//*  10   22:aload_1         
		//*  11   23:instanceof      #76  <Class SmoothStreamingManifest$ProtectionElement>
		//*  12   26:ifeq            55
			{
				boolean flag;
				if(protectionElement == null)
		//*  13   29:aload_0         
		//*  14   30:getfield        #56  <Field SmoothStreamingManifest$ProtectionElement protectionElement>
		//*  15   33:ifnonnull       41
					flag = true;
		//   16   36:iconst_1        
		//   17   37:istore_2        
				else
		//*  18   38:goto            43
					flag = false;
		//   19   41:iconst_0        
		//   20   42:istore_2        
				Assertions.checkState(flag);
		//   21   43:iload_2         
		//   22   44:invokestatic    #82  <Method void Assertions.checkState(boolean)>
				protectionElement = (SmoothStreamingManifest.ProtectionElement)obj;
		//   23   47:aload_0         
		//   24   48:aload_1         
		//   25   49:checkcast       #76  <Class SmoothStreamingManifest$ProtectionElement>
		//   26   52:putfield        #56  <Field SmoothStreamingManifest$ProtectionElement protectionElement>
			}
		//   27   55:return          
		}

		public Object build()
		{
			SmoothStreamingManifest.StreamElement astreamelement[] = new SmoothStreamingManifest.StreamElement[streamElements.size()];
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field List streamElements>
		//    2    4:invokeinterface #88  <Method int List.size()>
		//    3    9:anewarray       SmoothStreamingManifest.StreamElement[]
		//    4   12:astore_1        
			streamElements.toArray(((Object []) (astreamelement)));
		//    5   13:aload_0         
		//    6   14:getfield        #63  <Field List streamElements>
		//    7   17:aload_1         
		//    8   18:invokeinterface #92  <Method Object[] List.toArray(Object[])>
		//    9   23:pop             
			return ((Object) (new SmoothStreamingManifest(majorVersion, minorVersion, timescale, duration, dvrWindowLength, lookAheadCount, isLive, protectionElement, astreamelement)));
		//   10   24:new             #94  <Class SmoothStreamingManifest>
		//   11   27:dup             
		//   12   28:aload_0         
		//   13   29:getfield        #96  <Field int majorVersion>
		//   14   32:aload_0         
		//   15   33:getfield        #98  <Field int minorVersion>
		//   16   36:aload_0         
		//   17   37:getfield        #100 <Field long timescale>
		//   18   40:aload_0         
		//   19   41:getfield        #102 <Field long duration>
		//   20   44:aload_0         
		//   21   45:getfield        #104 <Field long dvrWindowLength>
		//   22   48:aload_0         
		//   23   49:getfield        #54  <Field int lookAheadCount>
		//   24   52:aload_0         
		//   25   53:getfield        #106 <Field boolean isLive>
		//   26   56:aload_0         
		//   27   57:getfield        #56  <Field SmoothStreamingManifest$ProtectionElement protectionElement>
		//   28   60:aload_1         
		//   29   61:invokespecial   #109 <Method void SmoothStreamingManifest(int, int, long, long, long, int, boolean, SmoothStreamingManifest$ProtectionElement, SmoothStreamingManifest$StreamElement[])>
		//   30   64:areturn         
		}

		public void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			majorVersion = parseRequiredInt(xmlpullparser, "MajorVersion");
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:aload_1         
		//    3    3:ldc1            #23  <String "MajorVersion">
		//    4    5:invokevirtual   #117 <Method int parseRequiredInt(XmlPullParser, String)>
		//    5    8:putfield        #96  <Field int majorVersion>
			minorVersion = parseRequiredInt(xmlpullparser, "MinorVersion");
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:aload_1         
		//    9   14:ldc1            #26  <String "MinorVersion">
		//   10   16:invokevirtual   #117 <Method int parseRequiredInt(XmlPullParser, String)>
		//   11   19:putfield        #98  <Field int minorVersion>
			timescale = parseLong(xmlpullparser, "TimeScale", 0x989680L);
		//   12   22:aload_0         
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:ldc1            #29  <String "TimeScale">
		//   16   27:ldc2w           #118 <Long 0x989680L>
		//   17   30:invokevirtual   #123 <Method long parseLong(XmlPullParser, String, long)>
		//   18   33:putfield        #100 <Field long timescale>
			duration = parseRequiredLong(xmlpullparser, "Duration");
		//   19   36:aload_0         
		//   20   37:aload_0         
		//   21   38:aload_1         
		//   22   39:ldc1            #11  <String "Duration">
		//   23   41:invokevirtual   #127 <Method long parseRequiredLong(XmlPullParser, String)>
		//   24   44:putfield        #102 <Field long duration>
			dvrWindowLength = parseLong(xmlpullparser, "DVRWindowLength", 0L);
		//   25   47:aload_0         
		//   26   48:aload_0         
		//   27   49:aload_1         
		//   28   50:ldc1            #14  <String "DVRWindowLength">
		//   29   52:lconst_0        
		//   30   53:invokevirtual   #123 <Method long parseLong(XmlPullParser, String, long)>
		//   31   56:putfield        #104 <Field long dvrWindowLength>
			lookAheadCount = parseInt(xmlpullparser, "LookaheadCount", -1);
		//   32   59:aload_0         
		//   33   60:aload_0         
		//   34   61:aload_1         
		//   35   62:ldc1            #20  <String "LookaheadCount">
		//   36   64:iconst_m1       
		//   37   65:invokevirtual   #131 <Method int parseInt(XmlPullParser, String, int)>
		//   38   68:putfield        #54  <Field int lookAheadCount>
			isLive = parseBoolean(xmlpullparser, "IsLive", false);
		//   39   71:aload_0         
		//   40   72:aload_0         
		//   41   73:aload_1         
		//   42   74:ldc1            #17  <String "IsLive">
		//   43   76:iconst_0        
		//   44   77:invokevirtual   #135 <Method boolean parseBoolean(XmlPullParser, String, boolean)>
		//   45   80:putfield        #106 <Field boolean isLive>
			putNormalizedAttribute("TimeScale", ((Object) (Long.valueOf(timescale))));
		//   46   83:aload_0         
		//   47   84:ldc1            #29  <String "TimeScale">
		//   48   86:aload_0         
		//   49   87:getfield        #100 <Field long timescale>
		//   50   90:invokestatic    #141 <Method Long Long.valueOf(long)>
		//   51   93:invokevirtual   #145 <Method void putNormalizedAttribute(String, Object)>
		//   52   96:return          
		}

		private static final String KEY_DURATION = "Duration";
		private static final String KEY_DVR_WINDOW_LENGTH = "DVRWindowLength";
		private static final String KEY_IS_LIVE = "IsLive";
		private static final String KEY_LOOKAHEAD_COUNT = "LookaheadCount";
		private static final String KEY_MAJOR_VERSION = "MajorVersion";
		private static final String KEY_MINOR_VERSION = "MinorVersion";
		private static final String KEY_TIME_SCALE = "TimeScale";
		public static final String TAG = "SmoothStreamingMedia";
		private long duration;
		private long dvrWindowLength;
		private boolean isLive;
		private int lookAheadCount;
		private int majorVersion;
		private int minorVersion;
		private SmoothStreamingManifest.ProtectionElement protectionElement;
		private List streamElements;
		private long timescale;

		public SmoothStreamMediaParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "SmoothStreamingMedia");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #32  <String "SmoothStreamingMedia">
		//    4    5:invokespecial   #52  <Method void SmoothStreamingManifestParser$ElementParser(SmoothStreamingManifestParser$ElementParser, String, String)>
			lookAheadCount = -1;
		//    5    8:aload_0         
		//    6    9:iconst_m1       
		//    7   10:putfield        #54  <Field int lookAheadCount>
			protectionElement = null;
		//    8   13:aload_0         
		//    9   14:aconst_null     
		//   10   15:putfield        #56  <Field SmoothStreamingManifest$ProtectionElement protectionElement>
			streamElements = ((List) (new LinkedList()));
		//   11   18:aload_0         
		//   12   19:new             #58  <Class LinkedList>
		//   13   22:dup             
		//   14   23:invokespecial   #61  <Method void LinkedList()>
		//   15   26:putfield        #63  <Field List streamElements>
		//   16   29:return          
		}
	}

	private static class StreamElementParser extends ElementParser
	{

		private void parseStreamElementStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			type = parseType(xmlpullparser);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:aload_1         
		//    3    3:invokespecial   #109 <Method int parseType(XmlPullParser)>
		//    4    6:putfield        #111 <Field int type>
			putNormalizedAttribute("Type", ((Object) (Integer.valueOf(type))));
		//    5    9:aload_0         
		//    6   10:ldc1            #47  <String "Type">
		//    7   12:aload_0         
		//    8   13:getfield        #111 <Field int type>
		//    9   16:invokestatic    #117 <Method Integer Integer.valueOf(int)>
		//   10   19:invokevirtual   #121 <Method void putNormalizedAttribute(String, Object)>
			if(type == 2)
		//*  11   22:aload_0         
		//*  12   23:getfield        #111 <Field int type>
		//*  13   26:iconst_2        
		//*  14   27:icmpne          44
				subType = parseRequiredString(xmlpullparser, "Subtype");
		//   15   30:aload_0         
		//   16   31:aload_0         
		//   17   32:aload_1         
		//   18   33:ldc1            #41  <String "Subtype">
		//   19   35:invokevirtual   #125 <Method String parseRequiredString(XmlPullParser, String)>
		//   20   38:putfield        #127 <Field String subType>
			else
		//*  21   41:goto            57
				subType = xmlpullparser.getAttributeValue(((String) (null)), "Subtype");
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:aconst_null     
		//   25   47:ldc1            #41  <String "Subtype">
		//   26   49:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   27   54:putfield        #127 <Field String subType>
			name = xmlpullparser.getAttributeValue(((String) (null)), "Name");
		//   28   57:aload_0         
		//   29   58:aload_1         
		//   30   59:aconst_null     
		//   31   60:ldc1            #35  <String "Name">
		//   32   62:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   33   67:putfield        #135 <Field String name>
			qualityLevels = parseInt(xmlpullparser, "QualityLevels", -1);
		//   34   70:aload_0         
		//   35   71:aload_0         
		//   36   72:aload_1         
		//   37   73:ldc1            #38  <String "QualityLevels">
		//   38   75:iconst_m1       
		//   39   76:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
		//   40   79:putfield        #141 <Field int qualityLevels>
			url = parseRequiredString(xmlpullparser, "Url");
		//   41   82:aload_0         
		//   42   83:aload_0         
		//   43   84:aload_1         
		//   44   85:ldc1            #59  <String "Url">
		//   45   87:invokevirtual   #125 <Method String parseRequiredString(XmlPullParser, String)>
		//   46   90:putfield        #143 <Field String url>
			maxWidth = parseInt(xmlpullparser, "MaxWidth", -1);
		//   47   93:aload_0         
		//   48   94:aload_0         
		//   49   95:aload_1         
		//   50   96:ldc1            #32  <String "MaxWidth">
		//   51   98:iconst_m1       
		//   52   99:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
		//   53  102:putfield        #145 <Field int maxWidth>
			maxHeight = parseInt(xmlpullparser, "MaxHeight", -1);
		//   54  105:aload_0         
		//   55  106:aload_0         
		//   56  107:aload_1         
		//   57  108:ldc1            #29  <String "MaxHeight">
		//   58  110:iconst_m1       
		//   59  111:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
		//   60  114:putfield        #147 <Field int maxHeight>
			displayWidth = parseInt(xmlpullparser, "DisplayWidth", -1);
		//   61  117:aload_0         
		//   62  118:aload_0         
		//   63  119:aload_1         
		//   64  120:ldc1            #14  <String "DisplayWidth">
		//   65  122:iconst_m1       
		//   66  123:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
		//   67  126:putfield        #149 <Field int displayWidth>
			displayHeight = parseInt(xmlpullparser, "DisplayHeight", -1);
		//   68  129:aload_0         
		//   69  130:aload_0         
		//   70  131:aload_1         
		//   71  132:ldc1            #11  <String "DisplayHeight">
		//   72  134:iconst_m1       
		//   73  135:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
		//   74  138:putfield        #151 <Field int displayHeight>
			language = xmlpullparser.getAttributeValue(((String) (null)), "Language");
		//   75  141:aload_0         
		//   76  142:aload_1         
		//   77  143:aconst_null     
		//   78  144:ldc1            #26  <String "Language">
		//   79  146:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   80  151:putfield        #153 <Field String language>
			putNormalizedAttribute("Language", ((Object) (language)));
		//   81  154:aload_0         
		//   82  155:ldc1            #26  <String "Language">
		//   83  157:aload_0         
		//   84  158:getfield        #153 <Field String language>
		//   85  161:invokevirtual   #121 <Method void putNormalizedAttribute(String, Object)>
			timescale = parseInt(xmlpullparser, "TimeScale", -1);
		//   86  164:aload_0         
		//   87  165:aload_0         
		//   88  166:aload_1         
		//   89  167:ldc1            #44  <String "TimeScale">
		//   90  169:iconst_m1       
		//   91  170:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
		//   92  173:i2l             
		//   93  174:putfield        #155 <Field long timescale>
			if(timescale == -1L)
		//*  94  177:aload_0         
		//*  95  178:getfield        #155 <Field long timescale>
		//*  96  181:ldc2w           #156 <Long -1L>
		//*  97  184:lcmp            
		//*  98  185:ifne            204
				timescale = ((Long)getNormalizedAttribute("TimeScale")).longValue();
		//   99  188:aload_0         
		//  100  189:aload_0         
		//  101  190:ldc1            #44  <String "TimeScale">
		//  102  192:invokevirtual   #161 <Method Object getNormalizedAttribute(String)>
		//  103  195:checkcast       #163 <Class Long>
		//  104  198:invokevirtual   #167 <Method long Long.longValue()>
		//  105  201:putfield        #155 <Field long timescale>
			startTimes = new ArrayList();
		//  106  204:aload_0         
		//  107  205:new             #169 <Class ArrayList>
		//  108  208:dup             
		//  109  209:invokespecial   #170 <Method void ArrayList()>
		//  110  212:putfield        #172 <Field ArrayList startTimes>
		//  111  215:return          
		}

		private void parseStreamFragmentStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			int i = startTimes.size();
		//    0    0:aload_0         
		//    1    1:getfield        #172 <Field ArrayList startTimes>
		//    2    4:invokevirtual   #178 <Method int ArrayList.size()>
		//    3    7:istore_2        
			long l1 = parseLong(xmlpullparser, "t", -1L);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:ldc1            #23  <String "t">
		//    7   12:ldc2w           #156 <Long -1L>
		//    8   15:invokevirtual   #182 <Method long parseLong(XmlPullParser, String, long)>
		//    9   18:lstore          6
			boolean flag = true;
		//   10   20:iconst_1        
		//   11   21:istore_3        
			long l = l1;
		//   12   22:lload           6
		//   13   24:lstore          4
			if(l1 == -1L)
		//*  14   26:lload           6
		//*  15   28:ldc2w           #156 <Long -1L>
		//*  16   31:lcmp            
		//*  17   32:ifne            96
				if(i == 0)
		//*  18   35:iload_2         
		//*  19   36:ifne            45
					l = 0L;
		//   20   39:lconst_0        
		//   21   40:lstore          4
				else
		//*  22   42:goto            96
				if(lastChunkDuration != -1L)
		//*  23   45:aload_0         
		//*  24   46:getfield        #184 <Field long lastChunkDuration>
		//*  25   49:ldc2w           #156 <Long -1L>
		//*  26   52:lcmp            
		//*  27   53:ifeq            86
				{
					l = ((Long)startTimes.get(i - 1)).longValue();
		//   28   56:aload_0         
		//   29   57:getfield        #172 <Field ArrayList startTimes>
		//   30   60:iload_2         
		//   31   61:iconst_1        
		//   32   62:isub            
		//   33   63:invokevirtual   #188 <Method Object ArrayList.get(int)>
		//   34   66:checkcast       #163 <Class Long>
		//   35   69:invokevirtual   #167 <Method long Long.longValue()>
		//   36   72:lstore          4
					l = lastChunkDuration + l;
		//   37   74:aload_0         
		//   38   75:getfield        #184 <Field long lastChunkDuration>
		//   39   78:lload           4
		//   40   80:ladd            
		//   41   81:lstore          4
				} else
		//*  42   83:goto            96
				{
					throw new ParserException("Unable to infer start time");
		//   43   86:new             #105 <Class ParserException>
		//   44   89:dup             
		//   45   90:ldc1            #190 <String "Unable to infer start time">
		//   46   92:invokespecial   #193 <Method void ParserException(String)>
		//   47   95:athrow          
				}
			startTimes.add(((Object) (Long.valueOf(l))));
		//   48   96:aload_0         
		//   49   97:getfield        #172 <Field ArrayList startTimes>
		//   50  100:lload           4
		//   51  102:invokestatic    #196 <Method Long Long.valueOf(long)>
		//   52  105:invokevirtual   #200 <Method boolean ArrayList.add(Object)>
		//   53  108:pop             
			lastChunkDuration = parseLong(xmlpullparser, "d", -1L);
		//   54  109:aload_0         
		//   55  110:aload_0         
		//   56  111:aload_1         
		//   57  112:ldc1            #17  <String "d">
		//   58  114:ldc2w           #156 <Long -1L>
		//   59  117:invokevirtual   #182 <Method long parseLong(XmlPullParser, String, long)>
		//   60  120:putfield        #184 <Field long lastChunkDuration>
			l1 = parseLong(xmlpullparser, "r", 1L);
		//   61  123:aload_0         
		//   62  124:aload_1         
		//   63  125:ldc1            #20  <String "r">
		//   64  127:lconst_1        
		//   65  128:invokevirtual   #182 <Method long parseLong(XmlPullParser, String, long)>
		//   66  131:lstore          6
			i = ((int) (flag));
		//   67  133:iload_3         
		//   68  134:istore_2        
			if(l1 > 1L)
		//*  69  135:lload           6
		//*  70  137:lconst_1        
		//*  71  138:lcmp            
		//*  72  139:ifle            168
				if(lastChunkDuration != -1L)
		//*  73  142:aload_0         
		//*  74  143:getfield        #184 <Field long lastChunkDuration>
		//*  75  146:ldc2w           #156 <Long -1L>
		//*  76  149:lcmp            
		//*  77  150:ifeq            158
					i = ((int) (flag));
		//   78  153:iload_3         
		//   79  154:istore_2        
				else
		//*  80  155:goto            168
					throw new ParserException("Repeated chunk with unspecified duration");
		//   81  158:new             #105 <Class ParserException>
		//   82  161:dup             
		//   83  162:ldc1            #202 <String "Repeated chunk with unspecified duration">
		//   84  164:invokespecial   #193 <Method void ParserException(String)>
		//   85  167:athrow          
			do
			{
				long l2 = i;
		//   86  168:iload_2         
		//   87  169:i2l             
		//   88  170:lstore          8
				if(l2 < l1)
		//*  89  172:lload           8
		//*  90  174:lload           6
		//*  91  176:lcmp            
		//*  92  177:ifge            208
				{
					startTimes.add(((Object) (Long.valueOf(lastChunkDuration * l2 + l))));
		//   93  180:aload_0         
		//   94  181:getfield        #172 <Field ArrayList startTimes>
		//   95  184:aload_0         
		//   96  185:getfield        #184 <Field long lastChunkDuration>
		//   97  188:lload           8
		//   98  190:lmul            
		//   99  191:lload           4
		//  100  193:ladd            
		//  101  194:invokestatic    #196 <Method Long Long.valueOf(long)>
		//  102  197:invokevirtual   #200 <Method boolean ArrayList.add(Object)>
		//  103  200:pop             
					i++;
		//  104  201:iload_2         
		//  105  202:iconst_1        
		//  106  203:iadd            
		//  107  204:istore_2        
				} else
		//* 108  205:goto            168
				{
					return;
		//  109  208:return          
				}
			} while(true);
		}

		private int parseType(XmlPullParser xmlpullparser)
			throws ParserException
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "Type")));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:ldc1            #47  <String "Type">
		//    3    4:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    9:astore_1        
			if(xmlpullparser != null)
		//*   5   10:aload_1         
		//*   6   11:ifnull          87
			{
				if("audio".equalsIgnoreCase(((String) (xmlpullparser))))
		//*   7   14:ldc1            #50  <String "audio">
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #208 <Method boolean String.equalsIgnoreCase(String)>
		//*  10   20:ifeq            25
					return 0;
		//   11   23:iconst_0        
		//   12   24:ireturn         
				if("video".equalsIgnoreCase(((String) (xmlpullparser))))
		//*  13   25:ldc1            #56  <String "video">
		//*  14   27:aload_1         
		//*  15   28:invokevirtual   #208 <Method boolean String.equalsIgnoreCase(String)>
		//*  16   31:ifeq            36
					return 1;
		//   17   34:iconst_1        
		//   18   35:ireturn         
				if("text".equalsIgnoreCase(((String) (xmlpullparser))))
		//*  19   36:ldc1            #53  <String "text">
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #208 <Method boolean String.equalsIgnoreCase(String)>
		//*  22   42:ifeq            47
				{
					return 2;
		//   23   45:iconst_2        
		//   24   46:ireturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   25   47:new             #210 <Class StringBuilder>
		//   26   50:dup             
		//   27   51:invokespecial   #211 <Method void StringBuilder()>
		//   28   54:astore_2        
					stringbuilder.append("Invalid key value[");
		//   29   55:aload_2         
		//   30   56:ldc1            #213 <String "Invalid key value[">
		//   31   58:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
		//   32   61:pop             
					stringbuilder.append(((String) (xmlpullparser)));
		//   33   62:aload_2         
		//   34   63:aload_1         
		//   35   64:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
		//   36   67:pop             
					stringbuilder.append("]");
		//   37   68:aload_2         
		//   38   69:ldc1            #219 <String "]">
		//   39   71:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
		//   40   74:pop             
					throw new ParserException(stringbuilder.toString());
		//   41   75:new             #105 <Class ParserException>
		//   42   78:dup             
		//   43   79:aload_2         
		//   44   80:invokevirtual   #223 <Method String StringBuilder.toString()>
		//   45   83:invokespecial   #193 <Method void ParserException(String)>
		//   46   86:athrow          
				}
			} else
			{
				throw new MissingFieldException("Type");
		//   47   87:new             #225 <Class SmoothStreamingManifestParser$MissingFieldException>
		//   48   90:dup             
		//   49   91:ldc1            #47  <String "Type">
		//   50   93:invokespecial   #226 <Method void SmoothStreamingManifestParser$MissingFieldException(String)>
		//   51   96:athrow          
			}
		}

		public void addChild(Object obj)
		{
			if(obj instanceof SmoothStreamingManifest.TrackElement)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #230 <Class SmoothStreamingManifest$TrackElement>
		//*   2    4:ifeq            21
				tracks.add(((Object) ((SmoothStreamingManifest.TrackElement)obj)));
		//    3    7:aload_0         
		//    4    8:getfield        #100 <Field List tracks>
		//    5   11:aload_1         
		//    6   12:checkcast       #230 <Class SmoothStreamingManifest$TrackElement>
		//    7   15:invokeinterface #233 <Method boolean List.add(Object)>
		//    8   20:pop             
		//    9   21:return          
		}

		public Object build()
		{
			SmoothStreamingManifest.TrackElement atrackelement[] = new SmoothStreamingManifest.TrackElement[tracks.size()];
		//    0    0:aload_0         
		//    1    1:getfield        #100 <Field List tracks>
		//    2    4:invokeinterface #236 <Method int List.size()>
		//    3    9:anewarray       SmoothStreamingManifest.TrackElement[]
		//    4   12:astore_1        
			tracks.toArray(((Object []) (atrackelement)));
		//    5   13:aload_0         
		//    6   14:getfield        #100 <Field List tracks>
		//    7   17:aload_1         
		//    8   18:invokeinterface #240 <Method Object[] List.toArray(Object[])>
		//    9   23:pop             
			return ((Object) (new SmoothStreamingManifest.StreamElement(baseUri, url, type, subType, timescale, name, qualityLevels, maxWidth, maxHeight, displayWidth, displayHeight, language, atrackelement, ((List) (startTimes)), lastChunkDuration)));
		//   10   24:new             #242 <Class SmoothStreamingManifest$StreamElement>
		//   11   27:dup             
		//   12   28:aload_0         
		//   13   29:getfield        #93  <Field String baseUri>
		//   14   32:aload_0         
		//   15   33:getfield        #143 <Field String url>
		//   16   36:aload_0         
		//   17   37:getfield        #111 <Field int type>
		//   18   40:aload_0         
		//   19   41:getfield        #127 <Field String subType>
		//   20   44:aload_0         
		//   21   45:getfield        #155 <Field long timescale>
		//   22   48:aload_0         
		//   23   49:getfield        #135 <Field String name>
		//   24   52:aload_0         
		//   25   53:getfield        #141 <Field int qualityLevels>
		//   26   56:aload_0         
		//   27   57:getfield        #145 <Field int maxWidth>
		//   28   60:aload_0         
		//   29   61:getfield        #147 <Field int maxHeight>
		//   30   64:aload_0         
		//   31   65:getfield        #149 <Field int displayWidth>
		//   32   68:aload_0         
		//   33   69:getfield        #151 <Field int displayHeight>
		//   34   72:aload_0         
		//   35   73:getfield        #153 <Field String language>
		//   36   76:aload_1         
		//   37   77:aload_0         
		//   38   78:getfield        #172 <Field ArrayList startTimes>
		//   39   81:aload_0         
		//   40   82:getfield        #184 <Field long lastChunkDuration>
		//   41   85:invokespecial   #245 <Method void SmoothStreamingManifest$StreamElement(String, String, int, String, long, String, int, int, int, int, int, String, SmoothStreamingManifest$TrackElement[], List, long)>
		//   42   88:areturn         
		}

		public boolean handleChildInline(String s)
		{
			return "c".equals(((Object) (s)));
		//    0    0:ldc1            #65  <String "c">
		//    1    2:aload_1         
		//    2    3:invokevirtual   #249 <Method boolean String.equals(Object)>
		//    3    6:ireturn         
		}

		public void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			if("c".equals(((Object) (xmlpullparser.getName()))))
		//*   0    0:ldc1            #65  <String "c">
		//*   1    2:aload_1         
		//*   2    3:invokeinterface #253 <Method String XmlPullParser.getName()>
		//*   3    8:invokevirtual   #249 <Method boolean String.equals(Object)>
		//*   4   11:ifeq            20
			{
				parseStreamFragmentStartTag(xmlpullparser);
		//    5   14:aload_0         
		//    6   15:aload_1         
		//    7   16:invokespecial   #255 <Method void parseStreamFragmentStartTag(XmlPullParser)>
				return;
		//    8   19:return          
			} else
			{
				parseStreamElementStartTag(xmlpullparser);
		//    9   20:aload_0         
		//   10   21:aload_1         
		//   11   22:invokespecial   #257 <Method void parseStreamElementStartTag(XmlPullParser)>
				return;
		//   12   25:return          
			}
		}

		private static final String KEY_DISPLAY_HEIGHT = "DisplayHeight";
		private static final String KEY_DISPLAY_WIDTH = "DisplayWidth";
		private static final String KEY_FRAGMENT_DURATION = "d";
		private static final String KEY_FRAGMENT_REPEAT_COUNT = "r";
		private static final String KEY_FRAGMENT_START_TIME = "t";
		private static final String KEY_LANGUAGE = "Language";
		private static final String KEY_MAX_HEIGHT = "MaxHeight";
		private static final String KEY_MAX_WIDTH = "MaxWidth";
		private static final String KEY_NAME = "Name";
		private static final String KEY_QUALITY_LEVELS = "QualityLevels";
		private static final String KEY_SUB_TYPE = "Subtype";
		private static final String KEY_TIME_SCALE = "TimeScale";
		private static final String KEY_TYPE = "Type";
		private static final String KEY_TYPE_AUDIO = "audio";
		private static final String KEY_TYPE_TEXT = "text";
		private static final String KEY_TYPE_VIDEO = "video";
		private static final String KEY_URL = "Url";
		public static final String TAG = "StreamIndex";
		private static final String TAG_STREAM_FRAGMENT = "c";
		private final String baseUri;
		private int displayHeight;
		private int displayWidth;
		private String language;
		private long lastChunkDuration;
		private int maxHeight;
		private int maxWidth;
		private String name;
		private int qualityLevels;
		private ArrayList startTimes;
		private String subType;
		private long timescale;
		private final List tracks = new LinkedList();
		private int type;
		private String url;

		public StreamElementParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "StreamIndex");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #62  <String "StreamIndex">
		//    4    5:invokespecial   #91  <Method void SmoothStreamingManifestParser$ElementParser(SmoothStreamingManifestParser$ElementParser, String, String)>
			baseUri = s;
		//    5    8:aload_0         
		//    6    9:aload_2         
		//    7   10:putfield        #93  <Field String baseUri>
		//    8   13:aload_0         
		//    9   14:new             #95  <Class LinkedList>
		//   10   17:dup             
		//   11   18:invokespecial   #98  <Method void LinkedList()>
		//   12   21:putfield        #100 <Field List tracks>
		//   13   24:return          
		}
	}

	private static class TrackElementParser extends ElementParser
	{

		private static String fourCCToMimeType(String s)
		{
			if(!s.equalsIgnoreCase("H264") && !s.equalsIgnoreCase("X264") && !s.equalsIgnoreCase("AVC1") && !s.equalsIgnoreCase("DAVC"))
		//*   0    0:aload_0         
		//*   1    1:ldc1            #70  <String "H264">
		//*   2    3:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*   3    6:ifne            203
		//*   4    9:aload_0         
		//*   5   10:ldc1            #78  <String "X264">
		//*   6   12:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*   7   15:ifne            203
		//*   8   18:aload_0         
		//*   9   19:ldc1            #80  <String "AVC1">
		//*  10   21:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  11   24:ifne            203
		//*  12   27:aload_0         
		//*  13   28:ldc1            #82  <String "DAVC">
		//*  14   30:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  15   33:ifeq            39
		//*  16   36:goto            203
			{
				if(!s.equalsIgnoreCase("AAC") && !s.equalsIgnoreCase("AACL") && !s.equalsIgnoreCase("AACH") && !s.equalsIgnoreCase("AACP"))
		//*  17   39:aload_0         
		//*  18   40:ldc1            #84  <String "AAC">
		//*  19   42:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  20   45:ifne            200
		//*  21   48:aload_0         
		//*  22   49:ldc1            #86  <String "AACL">
		//*  23   51:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  24   54:ifne            200
		//*  25   57:aload_0         
		//*  26   58:ldc1            #88  <String "AACH">
		//*  27   60:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  28   63:ifne            200
		//*  29   66:aload_0         
		//*  30   67:ldc1            #90  <String "AACP">
		//*  31   69:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  32   72:ifeq            78
		//*  33   75:goto            200
				{
					if(s.equalsIgnoreCase("TTML"))
		//*  34   78:aload_0         
		//*  35   79:ldc1            #92  <String "TTML">
		//*  36   81:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  37   84:ifeq            90
						return "application/ttml+xml";
		//   38   87:ldc1            #94  <String "application/ttml+xml">
		//   39   89:areturn         
					if(!s.equalsIgnoreCase("ac-3") && !s.equalsIgnoreCase("dac3"))
		//*  40   90:aload_0         
		//*  41   91:ldc1            #96  <String "ac-3">
		//*  42   93:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  43   96:ifne            197
		//*  44   99:aload_0         
		//*  45  100:ldc1            #98  <String "dac3">
		//*  46  102:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  47  105:ifeq            111
		//*  48  108:goto            197
					{
						if(!s.equalsIgnoreCase("ec-3") && !s.equalsIgnoreCase("dec3"))
		//*  49  111:aload_0         
		//*  50  112:ldc1            #100 <String "ec-3">
		//*  51  114:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  52  117:ifne            194
		//*  53  120:aload_0         
		//*  54  121:ldc1            #102 <String "dec3">
		//*  55  123:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  56  126:ifeq            132
		//*  57  129:goto            194
						{
							if(s.equalsIgnoreCase("dtsc"))
		//*  58  132:aload_0         
		//*  59  133:ldc1            #104 <String "dtsc">
		//*  60  135:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  61  138:ifeq            144
								return "audio/vnd.dts";
		//   62  141:ldc1            #106 <String "audio/vnd.dts">
		//   63  143:areturn         
							if(!s.equalsIgnoreCase("dtsh") && !s.equalsIgnoreCase("dtsl"))
		//*  64  144:aload_0         
		//*  65  145:ldc1            #108 <String "dtsh">
		//*  66  147:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  67  150:ifne            191
		//*  68  153:aload_0         
		//*  69  154:ldc1            #110 <String "dtsl">
		//*  70  156:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  71  159:ifeq            165
		//*  72  162:goto            191
							{
								if(s.equalsIgnoreCase("dtse"))
		//*  73  165:aload_0         
		//*  74  166:ldc1            #112 <String "dtse">
		//*  75  168:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  76  171:ifeq            177
									return "audio/vnd.dts.hd;profile=lbr";
		//   77  174:ldc1            #114 <String "audio/vnd.dts.hd;profile=lbr">
		//   78  176:areturn         
								if(s.equalsIgnoreCase("opus"))
		//*  79  177:aload_0         
		//*  80  178:ldc1            #116 <String "opus">
		//*  81  180:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
		//*  82  183:ifeq            189
									return "audio/opus";
		//   83  186:ldc1            #118 <String "audio/opus">
		//   84  188:areturn         
								else
									return null;
		//   85  189:aconst_null     
		//   86  190:areturn         
							} else
							{
								return "audio/vnd.dts.hd";
		//   87  191:ldc1            #120 <String "audio/vnd.dts.hd">
		//   88  193:areturn         
							}
						} else
						{
							return "audio/eac3";
		//   89  194:ldc1            #122 <String "audio/eac3">
		//   90  196:areturn         
						}
					} else
					{
						return "audio/ac3";
		//   91  197:ldc1            #124 <String "audio/ac3">
		//   92  199:areturn         
					}
				} else
				{
					return "audio/mp4a-latm";
		//   93  200:ldc1            #126 <String "audio/mp4a-latm">
		//   94  202:areturn         
				}
			} else
			{
				return "video/avc";
		//   95  203:ldc1            #128 <String "video/avc">
		//   96  205:areturn         
			}
		}

		public Object build()
		{
			byte abyte0[][] = (byte[][])null;
		//    0    0:aconst_null     
		//    1    1:checkcast       #132 <Class byte[][]>
		//    2    4:astore_1        
			if(!csd.isEmpty())
		//*   3    5:aload_0         
		//*   4    6:getfield        #65  <Field List csd>
		//*   5    9:invokeinterface #138 <Method boolean List.isEmpty()>
		//*   6   14:ifne            44
			{
				abyte0 = new byte[csd.size()][];
		//    7   17:aload_0         
		//    8   18:getfield        #65  <Field List csd>
		//    9   21:invokeinterface #142 <Method int List.size()>
		//   10   26:anewarray       byte[][]
		//   11   29:astore_1        
				csd.toArray(((Object []) (abyte0)));
		//   12   30:aload_0         
		//   13   31:getfield        #65  <Field List csd>
		//   14   34:aload_1         
		//   15   35:invokeinterface #148 <Method Object[] List.toArray(Object[])>
		//   16   40:pop             
			}
		//*  17   41:goto            44
			return ((Object) (new SmoothStreamingManifest.TrackElement(index, bitrate, mimeType, abyte0, maxWidth, maxHeight, samplingRate, channels, language)));
		//   18   44:new             #150 <Class SmoothStreamingManifest$TrackElement>
		//   19   47:dup             
		//   20   48:aload_0         
		//   21   49:getfield        #152 <Field int index>
		//   22   52:aload_0         
		//   23   53:getfield        #154 <Field int bitrate>
		//   24   56:aload_0         
		//   25   57:getfield        #156 <Field String mimeType>
		//   26   60:aload_1         
		//   27   61:aload_0         
		//   28   62:getfield        #158 <Field int maxWidth>
		//   29   65:aload_0         
		//   30   66:getfield        #160 <Field int maxHeight>
		//   31   69:aload_0         
		//   32   70:getfield        #162 <Field int samplingRate>
		//   33   73:aload_0         
		//   34   74:getfield        #164 <Field int channels>
		//   35   77:aload_0         
		//   36   78:getfield        #166 <Field String language>
		//   37   81:invokespecial   #169 <Method void SmoothStreamingManifest$TrackElement(int, int, String, byte[][], int, int, int, int, String)>
		//   38   84:areturn         
		}

		public void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			int i = ((Integer)getNormalizedAttribute("Type")).intValue();
		//    0    0:aload_0         
		//    1    1:ldc1            #38  <String "Type">
		//    2    3:invokevirtual   #177 <Method Object getNormalizedAttribute(String)>
		//    3    6:checkcast       #179 <Class Integer>
		//    4    9:invokevirtual   #182 <Method int Integer.intValue()>
		//    5   12:istore_2        
			index = parseInt(xmlpullparser, "Index", -1);
		//    6   13:aload_0         
		//    7   14:aload_0         
		//    8   15:aload_1         
		//    9   16:ldc1            #23  <String "Index">
		//   10   18:iconst_m1       
		//   11   19:invokevirtual   #186 <Method int parseInt(XmlPullParser, String, int)>
		//   12   22:putfield        #152 <Field int index>
			bitrate = parseRequiredInt(xmlpullparser, "Bitrate");
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:ldc1            #11  <String "Bitrate">
		//   17   30:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
		//   18   33:putfield        #154 <Field int bitrate>
			language = (String)getNormalizedAttribute("Language");
		//   19   36:aload_0         
		//   20   37:aload_0         
		//   21   38:ldc1            #26  <String "Language">
		//   22   40:invokevirtual   #177 <Method Object getNormalizedAttribute(String)>
		//   23   43:checkcast       #72  <Class String>
		//   24   46:putfield        #166 <Field String language>
			if(i == 1)
		//*  25   49:iload_2         
		//*  26   50:iconst_1        
		//*  27   51:icmpne          93
			{
				maxHeight = parseRequiredInt(xmlpullparser, "MaxHeight");
		//   28   54:aload_0         
		//   29   55:aload_0         
		//   30   56:aload_1         
		//   31   57:ldc1            #29  <String "MaxHeight">
		//   32   59:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
		//   33   62:putfield        #160 <Field int maxHeight>
				maxWidth = parseRequiredInt(xmlpullparser, "MaxWidth");
		//   34   65:aload_0         
		//   35   66:aload_0         
		//   36   67:aload_1         
		//   37   68:ldc1            #32  <String "MaxWidth">
		//   38   70:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
		//   39   73:putfield        #158 <Field int maxWidth>
				mimeType = fourCCToMimeType(parseRequiredString(xmlpullparser, "FourCC"));
		//   40   76:aload_0         
		//   41   77:aload_0         
		//   42   78:aload_1         
		//   43   79:ldc1            #20  <String "FourCC">
		//   44   81:invokevirtual   #194 <Method String parseRequiredString(XmlPullParser, String)>
		//   45   84:invokestatic    #196 <Method String fourCCToMimeType(String)>
		//   46   87:putfield        #156 <Field String mimeType>
			} else
		//*  47   90:goto            142
			{
				maxHeight = -1;
		//   48   93:aload_0         
		//   49   94:iconst_m1       
		//   50   95:putfield        #160 <Field int maxHeight>
				maxWidth = -1;
		//   51   98:aload_0         
		//   52   99:iconst_m1       
		//   53  100:putfield        #158 <Field int maxWidth>
				String s = xmlpullparser.getAttributeValue(((String) (null)), "FourCC");
		//   54  103:aload_1         
		//   55  104:aconst_null     
		//   56  105:ldc1            #20  <String "FourCC">
		//   57  107:invokeinterface #202 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   58  112:astore_3        
				if(s != null)
		//*  59  113:aload_3         
		//*  60  114:ifnull          125
					s = fourCCToMimeType(s);
		//   61  117:aload_3         
		//   62  118:invokestatic    #196 <Method String fourCCToMimeType(String)>
		//   63  121:astore_3        
				else
		//*  64  122:goto            137
				if(i == 0)
		//*  65  125:iload_2         
		//*  66  126:ifne            135
					s = "audio/mp4a-latm";
		//   67  129:ldc1            #126 <String "audio/mp4a-latm">
		//   68  131:astore_3        
				else
		//*  69  132:goto            137
					s = null;
		//   70  135:aconst_null     
		//   71  136:astore_3        
				mimeType = s;
		//   72  137:aload_0         
		//   73  138:aload_3         
		//   74  139:putfield        #156 <Field String mimeType>
			}
			if(i == 0)
		//*  75  142:iload_2         
		//*  76  143:ifne            171
			{
				samplingRate = parseRequiredInt(xmlpullparser, "SamplingRate");
		//   77  146:aload_0         
		//   78  147:aload_0         
		//   79  148:aload_1         
		//   80  149:ldc1            #35  <String "SamplingRate">
		//   81  151:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
		//   82  154:putfield        #162 <Field int samplingRate>
				channels = parseRequiredInt(xmlpullparser, "Channels");
		//   83  157:aload_0         
		//   84  158:aload_0         
		//   85  159:aload_1         
		//   86  160:ldc1            #14  <String "Channels">
		//   87  162:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
		//   88  165:putfield        #164 <Field int channels>
			} else
		//*  89  168:goto            181
			{
				samplingRate = -1;
		//   90  171:aload_0         
		//   91  172:iconst_m1       
		//   92  173:putfield        #162 <Field int samplingRate>
				channels = -1;
		//   93  176:aload_0         
		//   94  177:iconst_m1       
		//   95  178:putfield        #164 <Field int channels>
			}
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "CodecPrivateData")));
		//   96  181:aload_1         
		//   97  182:aconst_null     
		//   98  183:ldc1            #17  <String "CodecPrivateData">
		//   99  185:invokeinterface #202 <Method String XmlPullParser.getAttributeValue(String, String)>
		//  100  190:astore_1        
			if(xmlpullparser != null && ((String) (xmlpullparser)).length() > 0)
		//* 101  191:aload_1         
		//* 102  192:ifnull          256
		//* 103  195:aload_1         
		//* 104  196:invokevirtual   #205 <Method int String.length()>
		//* 105  199:ifle            256
			{
				xmlpullparser = ((XmlPullParser) (Util.getBytesFromHexString(((String) (xmlpullparser)))));
		//  106  202:aload_1         
		//  107  203:invokestatic    #211 <Method byte[] Util.getBytesFromHexString(String)>
		//  108  206:astore_1        
				byte abyte0[][] = CodecSpecificDataUtil.splitNalUnits(((byte []) (xmlpullparser)));
		//  109  207:aload_1         
		//  110  208:invokestatic    #217 <Method byte[][] CodecSpecificDataUtil.splitNalUnits(byte[])>
		//  111  211:astore_3        
				if(abyte0 == null)
		//* 112  212:aload_3         
		//* 113  213:ifnonnull       228
				{
					csd.add(((Object) (xmlpullparser)));
		//  114  216:aload_0         
		//  115  217:getfield        #65  <Field List csd>
		//  116  220:aload_1         
		//  117  221:invokeinterface #221 <Method boolean List.add(Object)>
		//  118  226:pop             
					return;
		//  119  227:return          
				}
				for(int j = 0; j < abyte0.length; j++)
		//* 120  228:iconst_0        
		//* 121  229:istore_2        
		//* 122  230:iload_2         
		//* 123  231:aload_3         
		//* 124  232:arraylength     
		//* 125  233:icmpge          256
					csd.add(((Object) (abyte0[j])));
		//  126  236:aload_0         
		//  127  237:getfield        #65  <Field List csd>
		//  128  240:aload_3         
		//  129  241:iload_2         
		//  130  242:aaload          
		//  131  243:invokeinterface #221 <Method boolean List.add(Object)>
		//  132  248:pop             

		//  133  249:iload_2         
		//  134  250:iconst_1        
		//  135  251:iadd            
		//  136  252:istore_2        
			}
		//* 137  253:goto            230
		//  138  256:return          
		}

		private static final String KEY_BITRATE = "Bitrate";
		private static final String KEY_CHANNELS = "Channels";
		private static final String KEY_CODEC_PRIVATE_DATA = "CodecPrivateData";
		private static final String KEY_FOUR_CC = "FourCC";
		private static final String KEY_INDEX = "Index";
		private static final String KEY_LANGUAGE = "Language";
		private static final String KEY_MAX_HEIGHT = "MaxHeight";
		private static final String KEY_MAX_WIDTH = "MaxWidth";
		private static final String KEY_SAMPLING_RATE = "SamplingRate";
		private static final String KEY_TYPE = "Type";
		public static final String TAG = "QualityLevel";
		private int bitrate;
		private int channels;
		private final List csd = new LinkedList();
		private int index;
		private String language;
		private int maxHeight;
		private int maxWidth;
		private String mimeType;
		private int samplingRate;

		public TrackElementParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "QualityLevel");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #41  <String "QualityLevel">
		//    4    5:invokespecial   #58  <Method void SmoothStreamingManifestParser$ElementParser(SmoothStreamingManifestParser$ElementParser, String, String)>
		//    5    8:aload_0         
		//    6    9:new             #60  <Class LinkedList>
		//    7   12:dup             
		//    8   13:invokespecial   #63  <Method void LinkedList()>
		//    9   16:putfield        #65  <Field List csd>
		//   10   19:return          
		}
	}


	public SmoothStreamingManifestParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		try
		{
			xmlParserFactory = XmlPullParserFactory.newInstance();
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method XmlPullParserFactory XmlPullParserFactory.newInstance()>
	//    4    8:putfield        #41  <Field XmlPullParserFactory xmlParserFactory>
			return;
	//    5   11:return          
		}
		catch(XmlPullParserException xmlpullparserexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeException("Couldn't create XmlPullParserFactory instance", ((Throwable) (xmlpullparserexception)));
	//    7   13:new             #43  <Class RuntimeException>
	//    8   16:dup             
	//    9   17:ldc1            #45  <String "Couldn't create XmlPullParserFactory instance">
	//   10   19:aload_1         
	//   11   20:invokespecial   #48  <Method void RuntimeException(String, Throwable)>
	//   12   23:athrow          
		}
	}

	public SmoothStreamingManifest parse(String s, InputStream inputstream)
		throws IOException, ParserException
	{
		try
		{
			XmlPullParser xmlpullparser = xmlParserFactory.newPullParser();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field XmlPullParserFactory xmlParserFactory>
	//    2    4:invokevirtual   #59  <Method XmlPullParser XmlPullParserFactory.newPullParser()>
	//    3    7:astore_3        
			xmlpullparser.setInput(inputstream, ((String) (null)));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokeinterface #65  <Method void XmlPullParser.setInput(InputStream, String)>
			s = ((String) ((SmoothStreamingManifest)(new SmoothStreamMediaParser(((ElementParser) (null)), s)).parse(xmlpullparser)));
	//    8   16:new             #18  <Class SmoothStreamingManifestParser$SmoothStreamMediaParser>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:aload_1         
	//   12   22:invokespecial   #68  <Method void SmoothStreamingManifestParser$SmoothStreamMediaParser(SmoothStreamingManifestParser$ElementParser, String)>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #71  <Method Object SmoothStreamingManifestParser$SmoothStreamMediaParser.parse(XmlPullParser)>
	//   15   29:checkcast       #73  <Class SmoothStreamingManifest>
	//   16   32:astore_1        
		}
	//*  17   33:aload_1         
	//*  18   34:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   35:astore_1        
		{
			throw new ParserException(((Throwable) (s)));
	//   20   36:new             #55  <Class ParserException>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokespecial   #76  <Method void ParserException(Throwable)>
	//   24   44:athrow          
		}
		return ((SmoothStreamingManifest) (s));
	}

	public volatile Object parse(String s, InputStream inputstream)
		throws ParserException, IOException
	{
		return ((Object) (parse(s, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #80  <Method SmoothStreamingManifest parse(String, InputStream)>
	//    4    6:areturn         
	}

	private final XmlPullParserFactory xmlParserFactory;
}
