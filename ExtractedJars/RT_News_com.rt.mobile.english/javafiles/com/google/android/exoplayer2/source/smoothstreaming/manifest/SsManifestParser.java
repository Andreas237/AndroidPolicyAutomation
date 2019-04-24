// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import org.xmlpull.v1.*;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming.manifest:
//			SsManifest

public class SsManifestParser
	implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
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
				return ((ElementParser) (new QualityLevelParser(elementparser, s1)));
		//    4    9:new             #44  <Class SsManifestParser$QualityLevelParser>
		//    5   12:dup             
		//    6   13:aload_1         
		//    7   14:aload_3         
		//    8   15:invokespecial   #47  <Method void SsManifestParser$QualityLevelParser(SsManifestParser$ElementParser, String)>
		//    9   18:areturn         
			if("Protection".equals(((Object) (s))))
		//*  10   19:ldc1            #49  <String "Protection">
		//*  11   21:aload_2         
		//*  12   22:invokevirtual   #42  <Method boolean String.equals(Object)>
		//*  13   25:ifeq            38
				return ((ElementParser) (new ProtectionParser(elementparser, s1)));
		//   14   28:new             #51  <Class SsManifestParser$ProtectionParser>
		//   15   31:dup             
		//   16   32:aload_1         
		//   17   33:aload_3         
		//   18   34:invokespecial   #52  <Method void SsManifestParser$ProtectionParser(SsManifestParser$ElementParser, String)>
		//   19   37:areturn         
			if("StreamIndex".equals(((Object) (s))))
		//*  20   38:ldc1            #54  <String "StreamIndex">
		//*  21   40:aload_2         
		//*  22   41:invokevirtual   #42  <Method boolean String.equals(Object)>
		//*  23   44:ifeq            57
				return ((ElementParser) (new StreamIndexParser(elementparser, s1)));
		//   24   47:new             #56  <Class SsManifestParser$StreamIndexParser>
		//   25   50:dup             
		//   26   51:aload_1         
		//   27   52:aload_3         
		//   28   53:invokespecial   #57  <Method void SsManifestParser$StreamIndexParser(SsManifestParser$ElementParser, String)>
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
			if(parent == null)
		//*  27   55:aload_0         
		//*  28   56:getfield        #22  <Field SsManifestParser$ElementParser parent>
		//*  29   59:ifnonnull       64
				return ((Object) (null));
		//   30   62:aconst_null     
		//   31   63:areturn         
			else
				return parent.getNormalizedAttribute(s);
		//   32   64:aload_0         
		//   33   65:getfield        #22  <Field SsManifestParser$ElementParser parent>
		//   34   68:aload_1         
		//   35   69:invokevirtual   #84  <Method Object getNormalizedAttribute(String)>
		//   36   72:areturn         
		}

		protected boolean handleChildInline(String s)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public final Object parse(XmlPullParser xmlpullparser)
			throws XmlPullParserException, IOException
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
		//*   5    6:invokeinterface #97  <Method int XmlPullParser.getEventType()>
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
		//   26   72:invokevirtual   #101 <Method void parseText(XmlPullParser)>
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
		//   48  111:invokeinterface #105 <Method String XmlPullParser.getName()>
		//   49  116:astore          6
					parseEndTag(xmlpullparser);
		//   50  118:aload_0         
		//   51  119:aload_1         
		//   52  120:invokevirtual   #108 <Method void parseEndTag(XmlPullParser)>
					flag1 = flag;
		//   53  123:iload_3         
		//   54  124:istore          4
					i = j;
		//   55  126:iload           5
		//   56  128:istore_2        
					if(!handleChildInline(s))
		//*  57  129:aload_0         
		//*  58  130:aload           6
		//*  59  132:invokevirtual   #110 <Method boolean handleChildInline(String)>
		//*  60  135:ifne            273
						return build();
		//   61  138:aload_0         
		//   62  139:invokevirtual   #112 <Method Object build()>
		//   63  142:areturn         
					break;

				case 2: // '\002'
					Object obj = ((Object) (xmlpullparser.getName()));
		//   64  143:aload_1         
		//   65  144:invokeinterface #105 <Method String XmlPullParser.getName()>
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
		//   74  165:invokevirtual   #115 <Method void parseStartTag(XmlPullParser)>
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
		//*  97  206:invokevirtual   #110 <Method boolean handleChildInline(String)>
		//*  98  209:ifeq            226
					{
						parseStartTag(xmlpullparser);
		//   99  212:aload_0         
		//  100  213:aload_1         
		//  101  214:invokevirtual   #115 <Method void parseStartTag(XmlPullParser)>
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
		//  112  234:invokespecial   #117 <Method SsManifestParser$ElementParser newChildParser(SsManifestParser$ElementParser, String, String)>
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
		//  124  256:invokevirtual   #119 <Method Object parse(XmlPullParser)>
		//  125  259:invokevirtual   #121 <Method void addChild(Object)>
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
		//  134  274:invokeinterface #124 <Method int XmlPullParser.next()>
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
		//    3    3:invokeinterface #131 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          18
				return Boolean.parseBoolean(((String) (xmlpullparser)));
		//    7   13:aload_1         
		//    8   14:invokestatic    #135 <Method boolean Boolean.parseBoolean(String)>
		//    9   17:ireturn         
			else
				return flag;
		//   10   18:iload_3         
		//   11   19:ireturn         
		}

		protected void parseEndTag(XmlPullParser xmlpullparser)
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
		//    3    3:invokeinterface #131 <Method String XmlPullParser.getAttributeValue(String, String)>
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
		//   13   21:new             #139 <Class ParserException>
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
		//    3    3:invokeinterface #131 <Method String XmlPullParser.getAttributeValue(String, String)>
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
		//   13   21:new             #139 <Class ParserException>
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
		//    3    3:invokeinterface #131 <Method String XmlPullParser.getAttributeValue(String, String)>
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
		//   13   21:new             #139 <Class ParserException>
		//   14   24:dup             
		//   15   25:aload_1         
		//   16   26:invokespecial   #149 <Method void ParserException(Throwable)>
		//   17   29:athrow          
				}
				return i;
			} else
			{
				throw new MissingFieldException(s);
		//   18   30:new             #160 <Class SsManifestParser$MissingFieldException>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:invokespecial   #163 <Method void SsManifestParser$MissingFieldException(String)>
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
		//    3    3:invokeinterface #131 <Method String XmlPullParser.getAttributeValue(String, String)>
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
		//   13   21:new             #139 <Class ParserException>
		//   14   24:dup             
		//   15   25:aload_1         
		//   16   26:invokespecial   #149 <Method void ParserException(Throwable)>
		//   17   29:athrow          
				}
				return l;
			} else
			{
				throw new MissingFieldException(s);
		//   18   30:new             #160 <Class SsManifestParser$MissingFieldException>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:invokespecial   #163 <Method void SsManifestParser$MissingFieldException(String)>
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
		//    3    3:invokeinterface #131 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    8:astore_1        
			if(xmlpullparser != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          15
				return ((String) (xmlpullparser));
		//    7   13:aload_1         
		//    8   14:areturn         
			else
				throw new MissingFieldException(s);
		//    9   15:new             #160 <Class SsManifestParser$MissingFieldException>
		//   10   18:dup             
		//   11   19:aload_2         
		//   12   20:invokespecial   #163 <Method void SsManifestParser$MissingFieldException(String)>
		//   13   23:athrow          
		}

		protected void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
		//    0    0:return          
		}

		protected void parseText(XmlPullParser xmlpullparser)
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
		//    4    6:putfield        #22  <Field SsManifestParser$ElementParser parent>
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

	private static class ProtectionParser extends ElementParser
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
			return ((Object) (new SsManifest.ProtectionElement(uuid, PsshAtomUtil.buildPsshAtom(uuid, initData))));
		//    0    0:new             #49  <Class SsManifest$ProtectionElement>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #51  <Field UUID uuid>
		//    4    8:aload_0         
		//    5    9:getfield        #51  <Field UUID uuid>
		//    6   12:aload_0         
		//    7   13:getfield        #53  <Field byte[] initData>
		//    8   16:invokestatic    #59  <Method byte[] PsshAtomUtil.buildPsshAtom(UUID, byte[])>
		//    9   19:invokespecial   #62  <Method void SsManifest$ProtectionElement(UUID, byte[])>
		//   10   22:areturn         
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
		//   15   35:putfield        #51  <Field UUID uuid>
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

		public ProtectionParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "Protection");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #14  <String "Protection">
		//    4    5:invokespecial   #28  <Method void SsManifestParser$ElementParser(SsManifestParser$ElementParser, String, String)>
		//    5    8:return          
		}
	}

	private static class QualityLevelParser extends ElementParser
	{

		private static List buildCodecSpecificData(String s)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #53  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #56  <Method void ArrayList()>
		//    3    7:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (s))))
		//*   4    8:aload_0         
		//*   5    9:invokestatic    #62  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   6   12:ifne            43
			{
				s = ((String) (Util.getBytesFromHexString(s)));
		//    7   15:aload_0         
		//    8   16:invokestatic    #68  <Method byte[] Util.getBytesFromHexString(String)>
		//    9   19:astore_0        
				byte abyte0[][] = CodecSpecificDataUtil.splitNalUnits(((byte []) (s)));
		//   10   20:aload_0         
		//   11   21:invokestatic    #74  <Method byte[][] CodecSpecificDataUtil.splitNalUnits(byte[])>
		//   12   24:astore_2        
				if(abyte0 == null)
		//*  13   25:aload_2         
		//*  14   26:ifnonnull       37
				{
					arraylist.add(((Object) (s)));
		//   15   29:aload_1         
		//   16   30:aload_0         
		//   17   31:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
		//   18   34:pop             
					return ((List) (arraylist));
		//   19   35:aload_1         
		//   20   36:areturn         
				}
				Collections.addAll(((java.util.Collection) (arraylist)), ((Object []) (abyte0)));
		//   21   37:aload_1         
		//   22   38:aload_2         
		//   23   39:invokestatic    #84  <Method boolean Collections.addAll(java.util.Collection, Object[])>
		//   24   42:pop             
			}
			return ((List) (arraylist));
		//   25   43:aload_1         
		//   26   44:areturn         
		}

		private static String fourCCToMimeType(String s)
		{
			if(!s.equalsIgnoreCase("H264") && !s.equalsIgnoreCase("X264") && !s.equalsIgnoreCase("AVC1") && !s.equalsIgnoreCase("DAVC"))
		//*   0    0:aload_0         
		//*   1    1:ldc1            #90  <String "H264">
		//*   2    3:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*   3    6:ifne            203
		//*   4    9:aload_0         
		//*   5   10:ldc1            #98  <String "X264">
		//*   6   12:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*   7   15:ifne            203
		//*   8   18:aload_0         
		//*   9   19:ldc1            #100 <String "AVC1">
		//*  10   21:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  11   24:ifne            203
		//*  12   27:aload_0         
		//*  13   28:ldc1            #102 <String "DAVC">
		//*  14   30:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  15   33:ifeq            39
		//*  16   36:goto            203
			{
				if(!s.equalsIgnoreCase("AAC") && !s.equalsIgnoreCase("AACL") && !s.equalsIgnoreCase("AACH") && !s.equalsIgnoreCase("AACP"))
		//*  17   39:aload_0         
		//*  18   40:ldc1            #104 <String "AAC">
		//*  19   42:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  20   45:ifne            200
		//*  21   48:aload_0         
		//*  22   49:ldc1            #106 <String "AACL">
		//*  23   51:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  24   54:ifne            200
		//*  25   57:aload_0         
		//*  26   58:ldc1            #108 <String "AACH">
		//*  27   60:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  28   63:ifne            200
		//*  29   66:aload_0         
		//*  30   67:ldc1            #110 <String "AACP">
		//*  31   69:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  32   72:ifeq            78
		//*  33   75:goto            200
				{
					if(s.equalsIgnoreCase("TTML"))
		//*  34   78:aload_0         
		//*  35   79:ldc1            #112 <String "TTML">
		//*  36   81:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  37   84:ifeq            90
						return "application/ttml+xml";
		//   38   87:ldc1            #114 <String "application/ttml+xml">
		//   39   89:areturn         
					if(!s.equalsIgnoreCase("ac-3") && !s.equalsIgnoreCase("dac3"))
		//*  40   90:aload_0         
		//*  41   91:ldc1            #116 <String "ac-3">
		//*  42   93:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  43   96:ifne            197
		//*  44   99:aload_0         
		//*  45  100:ldc1            #118 <String "dac3">
		//*  46  102:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  47  105:ifeq            111
		//*  48  108:goto            197
					{
						if(!s.equalsIgnoreCase("ec-3") && !s.equalsIgnoreCase("dec3"))
		//*  49  111:aload_0         
		//*  50  112:ldc1            #120 <String "ec-3">
		//*  51  114:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  52  117:ifne            194
		//*  53  120:aload_0         
		//*  54  121:ldc1            #122 <String "dec3">
		//*  55  123:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  56  126:ifeq            132
		//*  57  129:goto            194
						{
							if(s.equalsIgnoreCase("dtsc"))
		//*  58  132:aload_0         
		//*  59  133:ldc1            #124 <String "dtsc">
		//*  60  135:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  61  138:ifeq            144
								return "audio/vnd.dts";
		//   62  141:ldc1            #126 <String "audio/vnd.dts">
		//   63  143:areturn         
							if(!s.equalsIgnoreCase("dtsh") && !s.equalsIgnoreCase("dtsl"))
		//*  64  144:aload_0         
		//*  65  145:ldc1            #128 <String "dtsh">
		//*  66  147:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  67  150:ifne            191
		//*  68  153:aload_0         
		//*  69  154:ldc1            #130 <String "dtsl">
		//*  70  156:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  71  159:ifeq            165
		//*  72  162:goto            191
							{
								if(s.equalsIgnoreCase("dtse"))
		//*  73  165:aload_0         
		//*  74  166:ldc1            #132 <String "dtse">
		//*  75  168:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  76  171:ifeq            177
									return "audio/vnd.dts.hd;profile=lbr";
		//   77  174:ldc1            #134 <String "audio/vnd.dts.hd;profile=lbr">
		//   78  176:areturn         
								if(s.equalsIgnoreCase("opus"))
		//*  79  177:aload_0         
		//*  80  178:ldc1            #136 <String "opus">
		//*  81  180:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
		//*  82  183:ifeq            189
									return "audio/opus";
		//   83  186:ldc1            #138 <String "audio/opus">
		//   84  188:areturn         
								else
									return null;
		//   85  189:aconst_null     
		//   86  190:areturn         
							} else
							{
								return "audio/vnd.dts.hd";
		//   87  191:ldc1            #140 <String "audio/vnd.dts.hd">
		//   88  193:areturn         
							}
						} else
						{
							return "audio/eac3";
		//   89  194:ldc1            #142 <String "audio/eac3">
		//   90  196:areturn         
						}
					} else
					{
						return "audio/ac3";
		//   91  197:ldc1            #144 <String "audio/ac3">
		//   92  199:areturn         
					}
				} else
				{
					return "audio/mp4a-latm";
		//   93  200:ldc1            #146 <String "audio/mp4a-latm">
		//   94  202:areturn         
				}
			} else
			{
				return "video/avc";
		//   95  203:ldc1            #148 <String "video/avc">
		//   96  205:areturn         
			}
		}

		public Object build()
		{
			return ((Object) (format));
		//    0    0:aload_0         
		//    1    1:getfield        #152 <Field Format format>
		//    2    4:areturn         
		}

		public void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			int j = ((Integer)getNormalizedAttribute("Type")).intValue();
		//    0    0:aload_0         
		//    1    1:ldc1            #38  <String "Type">
		//    2    3:invokevirtual   #160 <Method Object getNormalizedAttribute(String)>
		//    3    6:checkcast       #162 <Class Integer>
		//    4    9:invokevirtual   #166 <Method int Integer.intValue()>
		//    5   12:istore_3        
			String s = xmlpullparser.getAttributeValue(((String) (null)), "Index");
		//    6   13:aload_1         
		//    7   14:aconst_null     
		//    8   15:ldc1            #23  <String "Index">
		//    9   17:invokeinterface #172 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   10   22:astore          7
			int i = parseRequiredInt(xmlpullparser, "Bitrate");
		//   11   24:aload_0         
		//   12   25:aload_1         
		//   13   26:ldc1            #11  <String "Bitrate">
		//   14   28:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
		//   15   31:istore_2        
			Object obj1 = ((Object) (fourCCToMimeType(parseRequiredString(xmlpullparser, "FourCC"))));
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:ldc1            #20  <String "FourCC">
		//   19   36:invokevirtual   #180 <Method String parseRequiredString(XmlPullParser, String)>
		//   20   39:invokestatic    #182 <Method String fourCCToMimeType(String)>
		//   21   42:astore          6
			if(j == 2)
		//*  22   44:iload_3         
		//*  23   45:iconst_2        
		//*  24   46:icmpne          94
			{
				format = Format.createVideoContainerFormat(s, "video/mp4", ((String) (obj1)), ((String) (null)), i, parseRequiredInt(xmlpullparser, "MaxWidth"), parseRequiredInt(xmlpullparser, "MaxHeight"), -1F, buildCodecSpecificData(xmlpullparser.getAttributeValue(((String) (null)), "CodecPrivateData")), 0);
		//   25   49:aload_0         
		//   26   50:aload           7
		//   27   52:ldc1            #184 <String "video/mp4">
		//   28   54:aload           6
		//   29   56:aconst_null     
		//   30   57:iload_2         
		//   31   58:aload_0         
		//   32   59:aload_1         
		//   33   60:ldc1            #32  <String "MaxWidth">
		//   34   62:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
		//   35   65:aload_0         
		//   36   66:aload_1         
		//   37   67:ldc1            #29  <String "MaxHeight">
		//   38   69:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
		//   39   72:ldc1            #185 <Float -1F>
		//   40   74:aload_1         
		//   41   75:aconst_null     
		//   42   76:ldc1            #17  <String "CodecPrivateData">
		//   43   78:invokeinterface #172 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   44   83:invokestatic    #187 <Method List buildCodecSpecificData(String)>
		//   45   86:iconst_0        
		//   46   87:invokestatic    #193 <Method Format Format.createVideoContainerFormat(String, String, String, String, int, int, int, float, List, int)>
		//   47   90:putfield        #152 <Field Format format>
				return;
		//   48   93:return          
			}
			if(j == 1)
		//*  49   94:iload_3         
		//*  50   95:iconst_1        
		//*  51   96:icmpne          209
			{
				Object obj = obj1;
		//   52   99:aload           6
		//   53  101:astore          5
				if(obj1 == null)
		//*  54  103:aload           6
		//*  55  105:ifnonnull       112
					obj = "audio/mp4a-latm";
		//   56  108:ldc1            #146 <String "audio/mp4a-latm">
		//   57  110:astore          5
				j = parseRequiredInt(xmlpullparser, "Channels");
		//   58  112:aload_0         
		//   59  113:aload_1         
		//   60  114:ldc1            #14  <String "Channels">
		//   61  116:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
		//   62  119:istore_3        
				int k = parseRequiredInt(xmlpullparser, "SamplingRate");
		//   63  120:aload_0         
		//   64  121:aload_1         
		//   65  122:ldc1            #35  <String "SamplingRate">
		//   66  124:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
		//   67  127:istore          4
				obj1 = ((Object) (buildCodecSpecificData(xmlpullparser.getAttributeValue(((String) (null)), "CodecPrivateData"))));
		//   68  129:aload_1         
		//   69  130:aconst_null     
		//   70  131:ldc1            #17  <String "CodecPrivateData">
		//   71  133:invokeinterface #172 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   72  138:invokestatic    #187 <Method List buildCodecSpecificData(String)>
		//   73  141:astore          6
				xmlpullparser = ((XmlPullParser) (obj1));
		//   74  143:aload           6
		//   75  145:astore_1        
				if(((List) (obj1)).isEmpty())
		//*  76  146:aload           6
		//*  77  148:invokeinterface #198 <Method boolean List.isEmpty()>
		//*  78  153:ifeq            179
				{
					xmlpullparser = ((XmlPullParser) (obj1));
		//   79  156:aload           6
		//   80  158:astore_1        
					if("audio/mp4a-latm".equals(obj))
		//*  81  159:ldc1            #146 <String "audio/mp4a-latm">
		//*  82  161:aload           5
		//*  83  163:invokevirtual   #201 <Method boolean String.equals(Object)>
		//*  84  166:ifeq            179
						xmlpullparser = ((XmlPullParser) (Collections.singletonList(((Object) (CodecSpecificDataUtil.buildAacLcAudioSpecificConfig(k, j))))));
		//   85  169:iload           4
		//   86  171:iload_3         
		//   87  172:invokestatic    #205 <Method byte[] CodecSpecificDataUtil.buildAacLcAudioSpecificConfig(int, int)>
		//   88  175:invokestatic    #209 <Method List Collections.singletonList(Object)>
		//   89  178:astore_1        
				}
				format = Format.createAudioContainerFormat(s, "audio/mp4", ((String) (obj)), ((String) (null)), i, j, k, ((List) (xmlpullparser)), 0, (String)getNormalizedAttribute("Language"));
		//   90  179:aload_0         
		//   91  180:aload           7
		//   92  182:ldc1            #211 <String "audio/mp4">
		//   93  184:aload           5
		//   94  186:aconst_null     
		//   95  187:iload_2         
		//   96  188:iload_3         
		//   97  189:iload           4
		//   98  191:aload_1         
		//   99  192:iconst_0        
		//  100  193:aload_0         
		//  101  194:ldc1            #26  <String "Language">
		//  102  196:invokevirtual   #160 <Method Object getNormalizedAttribute(String)>
		//  103  199:checkcast       #92  <Class String>
		//  104  202:invokestatic    #215 <Method Format Format.createAudioContainerFormat(String, String, String, String, int, int, int, List, int, String)>
		//  105  205:putfield        #152 <Field Format format>
				return;
		//  106  208:return          
			}
			if(j == 3)
		//* 107  209:iload_3         
		//* 108  210:iconst_3        
		//* 109  211:icmpne          240
			{
				format = Format.createTextContainerFormat(s, "application/mp4", ((String) (obj1)), ((String) (null)), i, 0, (String)getNormalizedAttribute("Language"));
		//  110  214:aload_0         
		//  111  215:aload           7
		//  112  217:ldc1            #217 <String "application/mp4">
		//  113  219:aload           6
		//  114  221:aconst_null     
		//  115  222:iload_2         
		//  116  223:iconst_0        
		//  117  224:aload_0         
		//  118  225:ldc1            #26  <String "Language">
		//  119  227:invokevirtual   #160 <Method Object getNormalizedAttribute(String)>
		//  120  230:checkcast       #92  <Class String>
		//  121  233:invokestatic    #221 <Method Format Format.createTextContainerFormat(String, String, String, String, int, int, String)>
		//  122  236:putfield        #152 <Field Format format>
				return;
		//  123  239:return          
			} else
			{
				format = Format.createContainerFormat(s, "application/mp4", ((String) (obj1)), ((String) (null)), i, 0, ((String) (null)));
		//  124  240:aload_0         
		//  125  241:aload           7
		//  126  243:ldc1            #217 <String "application/mp4">
		//  127  245:aload           6
		//  128  247:aconst_null     
		//  129  248:iload_2         
		//  130  249:iconst_0        
		//  131  250:aconst_null     
		//  132  251:invokestatic    #224 <Method Format Format.createContainerFormat(String, String, String, String, int, int, String)>
		//  133  254:putfield        #152 <Field Format format>
				return;
		//  134  257:return          
			}
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
		private Format format;

		public QualityLevelParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "QualityLevel");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #41  <String "QualityLevel">
		//    4    5:invokespecial   #48  <Method void SsManifestParser$ElementParser(SsManifestParser$ElementParser, String, String)>
		//    5    8:return          
		}
	}

	private static class SmoothStreamingMediaParser extends ElementParser
	{

		public void addChild(Object obj)
		{
			if(obj instanceof SsManifest.StreamElement)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #68  <Class SsManifest$StreamElement>
		//*   2    4:ifeq            22
			{
				streamElements.add(((Object) ((SsManifest.StreamElement)obj)));
		//    3    7:aload_0         
		//    4    8:getfield        #63  <Field List streamElements>
		//    5   11:aload_1         
		//    6   12:checkcast       #68  <Class SsManifest$StreamElement>
		//    7   15:invokeinterface #74  <Method boolean List.add(Object)>
		//    8   20:pop             
				return;
		//    9   21:return          
			}
			if(obj instanceof SsManifest.ProtectionElement)
		//*  10   22:aload_1         
		//*  11   23:instanceof      #76  <Class SsManifest$ProtectionElement>
		//*  12   26:ifeq            55
			{
				boolean flag;
				if(protectionElement == null)
		//*  13   29:aload_0         
		//*  14   30:getfield        #56  <Field SsManifest$ProtectionElement protectionElement>
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
				protectionElement = (SsManifest.ProtectionElement)obj;
		//   23   47:aload_0         
		//   24   48:aload_1         
		//   25   49:checkcast       #76  <Class SsManifest$ProtectionElement>
		//   26   52:putfield        #56  <Field SsManifest$ProtectionElement protectionElement>
			}
		//   27   55:return          
		}

		public Object build()
		{
			SsManifest.StreamElement astreamelement[] = new SsManifest.StreamElement[streamElements.size()];
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field List streamElements>
		//    2    4:invokeinterface #88  <Method int List.size()>
		//    3    9:anewarray       SsManifest.StreamElement[]
		//    4   12:astore          4
			streamElements.toArray(((Object []) (astreamelement)));
		//    5   14:aload_0         
		//    6   15:getfield        #63  <Field List streamElements>
		//    7   18:aload           4
		//    8   20:invokeinterface #92  <Method Object[] List.toArray(Object[])>
		//    9   25:pop             
			if(protectionElement != null)
		//*  10   26:aload_0         
		//*  11   27:getfield        #56  <Field SsManifest$ProtectionElement protectionElement>
		//*  12   30:ifnull          134
			{
				DrmInitData drminitdata = new DrmInitData(new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] {
					new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(protectionElement.uuid, "video/mp4", protectionElement.data)
				});
		//   13   33:new             #94  <Class DrmInitData>
		//   14   36:dup             
		//   15   37:iconst_1        
		//   16   38:anewarray       com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]
		//   17   41:dup             
		//   18   42:iconst_0        
		//   19   43:new             #96  <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
		//   20   46:dup             
		//   21   47:aload_0         
		//   22   48:getfield        #56  <Field SsManifest$ProtectionElement protectionElement>
		//   23   51:getfield        #100 <Field UUID SsManifest$ProtectionElement.uuid>
		//   24   54:ldc1            #102 <String "video/mp4">
		//   25   56:aload_0         
		//   26   57:getfield        #56  <Field SsManifest$ProtectionElement protectionElement>
		//   27   60:getfield        #106 <Field byte[] SsManifest$ProtectionElement.data>
		//   28   63:invokespecial   #109 <Method void com.google.android.exoplayer2.drm.DrmInitData$SchemeData(UUID, String, byte[])>
		//   29   66:aastore         
		//   30   67:invokespecial   #112 <Method void DrmInitData(com.google.android.exoplayer2.drm.DrmInitData$SchemeData[])>
		//   31   70:astore          5
				int k = astreamelement.length;
		//   32   72:aload           4
		//   33   74:arraylength     
		//   34   75:istore_3        
				for(int i = 0; i < k; i++)
		//*  35   76:iconst_0        
		//*  36   77:istore_1        
		//*  37   78:iload_1         
		//*  38   79:iload_3         
		//*  39   80:icmpge          134
				{
					SsManifest.StreamElement streamelement = astreamelement[i];
		//   40   83:aload           4
		//   41   85:iload_1         
		//   42   86:aaload          
		//   43   87:astore          6
					for(int j = 0; j < streamelement.formats.length; j++)
		//*  44   89:iconst_0        
		//*  45   90:istore_2        
		//*  46   91:iload_2         
		//*  47   92:aload           6
		//*  48   94:getfield        #116 <Field Format[] SsManifest$StreamElement.formats>
		//*  49   97:arraylength     
		//*  50   98:icmpge          127
						streamelement.formats[j] = streamelement.formats[j].copyWithDrmInitData(drminitdata);
		//   51  101:aload           6
		//   52  103:getfield        #116 <Field Format[] SsManifest$StreamElement.formats>
		//   53  106:iload_2         
		//   54  107:aload           6
		//   55  109:getfield        #116 <Field Format[] SsManifest$StreamElement.formats>
		//   56  112:iload_2         
		//   57  113:aaload          
		//   58  114:aload           5
		//   59  116:invokevirtual   #122 <Method Format Format.copyWithDrmInitData(DrmInitData)>
		//   60  119:aastore         

		//   61  120:iload_2         
		//   62  121:iconst_1        
		//   63  122:iadd            
		//   64  123:istore_2        
				}

		//   65  124:goto            91
		//   66  127:iload_1         
		//   67  128:iconst_1        
		//   68  129:iadd            
		//   69  130:istore_1        
			}
		//*  70  131:goto            78
			return ((Object) (new SsManifest(majorVersion, minorVersion, timescale, duration, dvrWindowLength, lookAheadCount, isLive, protectionElement, astreamelement)));
		//   71  134:new             #124 <Class SsManifest>
		//   72  137:dup             
		//   73  138:aload_0         
		//   74  139:getfield        #126 <Field int majorVersion>
		//   75  142:aload_0         
		//   76  143:getfield        #128 <Field int minorVersion>
		//   77  146:aload_0         
		//   78  147:getfield        #130 <Field long timescale>
		//   79  150:aload_0         
		//   80  151:getfield        #132 <Field long duration>
		//   81  154:aload_0         
		//   82  155:getfield        #134 <Field long dvrWindowLength>
		//   83  158:aload_0         
		//   84  159:getfield        #54  <Field int lookAheadCount>
		//   85  162:aload_0         
		//   86  163:getfield        #136 <Field boolean isLive>
		//   87  166:aload_0         
		//   88  167:getfield        #56  <Field SsManifest$ProtectionElement protectionElement>
		//   89  170:aload           4
		//   90  172:invokespecial   #139 <Method void SsManifest(int, int, long, long, long, int, boolean, SsManifest$ProtectionElement, SsManifest$StreamElement[])>
		//   91  175:areturn         
		}

		public void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			majorVersion = parseRequiredInt(xmlpullparser, "MajorVersion");
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:aload_1         
		//    3    3:ldc1            #23  <String "MajorVersion">
		//    4    5:invokevirtual   #147 <Method int parseRequiredInt(XmlPullParser, String)>
		//    5    8:putfield        #126 <Field int majorVersion>
			minorVersion = parseRequiredInt(xmlpullparser, "MinorVersion");
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:aload_1         
		//    9   14:ldc1            #26  <String "MinorVersion">
		//   10   16:invokevirtual   #147 <Method int parseRequiredInt(XmlPullParser, String)>
		//   11   19:putfield        #128 <Field int minorVersion>
			timescale = parseLong(xmlpullparser, "TimeScale", 0x989680L);
		//   12   22:aload_0         
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:ldc1            #29  <String "TimeScale">
		//   16   27:ldc2w           #148 <Long 0x989680L>
		//   17   30:invokevirtual   #153 <Method long parseLong(XmlPullParser, String, long)>
		//   18   33:putfield        #130 <Field long timescale>
			duration = parseRequiredLong(xmlpullparser, "Duration");
		//   19   36:aload_0         
		//   20   37:aload_0         
		//   21   38:aload_1         
		//   22   39:ldc1            #11  <String "Duration">
		//   23   41:invokevirtual   #157 <Method long parseRequiredLong(XmlPullParser, String)>
		//   24   44:putfield        #132 <Field long duration>
			dvrWindowLength = parseLong(xmlpullparser, "DVRWindowLength", 0L);
		//   25   47:aload_0         
		//   26   48:aload_0         
		//   27   49:aload_1         
		//   28   50:ldc1            #14  <String "DVRWindowLength">
		//   29   52:lconst_0        
		//   30   53:invokevirtual   #153 <Method long parseLong(XmlPullParser, String, long)>
		//   31   56:putfield        #134 <Field long dvrWindowLength>
			lookAheadCount = parseInt(xmlpullparser, "LookaheadCount", -1);
		//   32   59:aload_0         
		//   33   60:aload_0         
		//   34   61:aload_1         
		//   35   62:ldc1            #20  <String "LookaheadCount">
		//   36   64:iconst_m1       
		//   37   65:invokevirtual   #161 <Method int parseInt(XmlPullParser, String, int)>
		//   38   68:putfield        #54  <Field int lookAheadCount>
			isLive = parseBoolean(xmlpullparser, "IsLive", false);
		//   39   71:aload_0         
		//   40   72:aload_0         
		//   41   73:aload_1         
		//   42   74:ldc1            #17  <String "IsLive">
		//   43   76:iconst_0        
		//   44   77:invokevirtual   #165 <Method boolean parseBoolean(XmlPullParser, String, boolean)>
		//   45   80:putfield        #136 <Field boolean isLive>
			putNormalizedAttribute("TimeScale", ((Object) (Long.valueOf(timescale))));
		//   46   83:aload_0         
		//   47   84:ldc1            #29  <String "TimeScale">
		//   48   86:aload_0         
		//   49   87:getfield        #130 <Field long timescale>
		//   50   90:invokestatic    #171 <Method Long Long.valueOf(long)>
		//   51   93:invokevirtual   #175 <Method void putNormalizedAttribute(String, Object)>
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
		private SsManifest.ProtectionElement protectionElement;
		private final List streamElements = new LinkedList();
		private long timescale;

		public SmoothStreamingMediaParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "SmoothStreamingMedia");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #32  <String "SmoothStreamingMedia">
		//    4    5:invokespecial   #52  <Method void SsManifestParser$ElementParser(SsManifestParser$ElementParser, String, String)>
			lookAheadCount = -1;
		//    5    8:aload_0         
		//    6    9:iconst_m1       
		//    7   10:putfield        #54  <Field int lookAheadCount>
			protectionElement = null;
		//    8   13:aload_0         
		//    9   14:aconst_null     
		//   10   15:putfield        #56  <Field SsManifest$ProtectionElement protectionElement>
		//   11   18:aload_0         
		//   12   19:new             #58  <Class LinkedList>
		//   13   22:dup             
		//   14   23:invokespecial   #61  <Method void LinkedList()>
		//   15   26:putfield        #63  <Field List streamElements>
		//   16   29:return          
		}
	}

	private static class StreamIndexParser extends ElementParser
	{

		private void parseStreamElementStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			type = parseType(xmlpullparser);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:aload_1         
		//    3    3:invokespecial   #105 <Method int parseType(XmlPullParser)>
		//    4    6:putfield        #107 <Field int type>
			putNormalizedAttribute("Type", ((Object) (Integer.valueOf(type))));
		//    5    9:aload_0         
		//    6   10:ldc1            #44  <String "Type">
		//    7   12:aload_0         
		//    8   13:getfield        #107 <Field int type>
		//    9   16:invokestatic    #113 <Method Integer Integer.valueOf(int)>
		//   10   19:invokevirtual   #117 <Method void putNormalizedAttribute(String, Object)>
			if(type == 3)
		//*  11   22:aload_0         
		//*  12   23:getfield        #107 <Field int type>
		//*  13   26:iconst_3        
		//*  14   27:icmpne          44
				subType = parseRequiredString(xmlpullparser, "Subtype");
		//   15   30:aload_0         
		//   16   31:aload_0         
		//   17   32:aload_1         
		//   18   33:ldc1            #38  <String "Subtype">
		//   19   35:invokevirtual   #121 <Method String parseRequiredString(XmlPullParser, String)>
		//   20   38:putfield        #123 <Field String subType>
			else
		//*  21   41:goto            57
				subType = xmlpullparser.getAttributeValue(((String) (null)), "Subtype");
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:aconst_null     
		//   25   47:ldc1            #38  <String "Subtype">
		//   26   49:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   27   54:putfield        #123 <Field String subType>
			name = xmlpullparser.getAttributeValue(((String) (null)), "Name");
		//   28   57:aload_0         
		//   29   58:aload_1         
		//   30   59:aconst_null     
		//   31   60:ldc1            #35  <String "Name">
		//   32   62:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   33   67:putfield        #131 <Field String name>
			url = parseRequiredString(xmlpullparser, "Url");
		//   34   70:aload_0         
		//   35   71:aload_0         
		//   36   72:aload_1         
		//   37   73:ldc1            #56  <String "Url">
		//   38   75:invokevirtual   #121 <Method String parseRequiredString(XmlPullParser, String)>
		//   39   78:putfield        #133 <Field String url>
			maxWidth = parseInt(xmlpullparser, "MaxWidth", -1);
		//   40   81:aload_0         
		//   41   82:aload_0         
		//   42   83:aload_1         
		//   43   84:ldc1            #32  <String "MaxWidth">
		//   44   86:iconst_m1       
		//   45   87:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
		//   46   90:putfield        #139 <Field int maxWidth>
			maxHeight = parseInt(xmlpullparser, "MaxHeight", -1);
		//   47   93:aload_0         
		//   48   94:aload_0         
		//   49   95:aload_1         
		//   50   96:ldc1            #29  <String "MaxHeight">
		//   51   98:iconst_m1       
		//   52   99:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
		//   53  102:putfield        #141 <Field int maxHeight>
			displayWidth = parseInt(xmlpullparser, "DisplayWidth", -1);
		//   54  105:aload_0         
		//   55  106:aload_0         
		//   56  107:aload_1         
		//   57  108:ldc1            #14  <String "DisplayWidth">
		//   58  110:iconst_m1       
		//   59  111:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
		//   60  114:putfield        #143 <Field int displayWidth>
			displayHeight = parseInt(xmlpullparser, "DisplayHeight", -1);
		//   61  117:aload_0         
		//   62  118:aload_0         
		//   63  119:aload_1         
		//   64  120:ldc1            #11  <String "DisplayHeight">
		//   65  122:iconst_m1       
		//   66  123:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
		//   67  126:putfield        #145 <Field int displayHeight>
			language = xmlpullparser.getAttributeValue(((String) (null)), "Language");
		//   68  129:aload_0         
		//   69  130:aload_1         
		//   70  131:aconst_null     
		//   71  132:ldc1            #26  <String "Language">
		//   72  134:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
		//   73  139:putfield        #147 <Field String language>
			putNormalizedAttribute("Language", ((Object) (language)));
		//   74  142:aload_0         
		//   75  143:ldc1            #26  <String "Language">
		//   76  145:aload_0         
		//   77  146:getfield        #147 <Field String language>
		//   78  149:invokevirtual   #117 <Method void putNormalizedAttribute(String, Object)>
			timescale = parseInt(xmlpullparser, "TimeScale", -1);
		//   79  152:aload_0         
		//   80  153:aload_0         
		//   81  154:aload_1         
		//   82  155:ldc1            #41  <String "TimeScale">
		//   83  157:iconst_m1       
		//   84  158:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
		//   85  161:i2l             
		//   86  162:putfield        #149 <Field long timescale>
			if(timescale == -1L)
		//*  87  165:aload_0         
		//*  88  166:getfield        #149 <Field long timescale>
		//*  89  169:ldc2w           #150 <Long -1L>
		//*  90  172:lcmp            
		//*  91  173:ifne            192
				timescale = ((Long)getNormalizedAttribute("TimeScale")).longValue();
		//   92  176:aload_0         
		//   93  177:aload_0         
		//   94  178:ldc1            #41  <String "TimeScale">
		//   95  180:invokevirtual   #155 <Method Object getNormalizedAttribute(String)>
		//   96  183:checkcast       #157 <Class Long>
		//   97  186:invokevirtual   #161 <Method long Long.longValue()>
		//   98  189:putfield        #149 <Field long timescale>
			startTimes = new ArrayList();
		//   99  192:aload_0         
		//  100  193:new             #163 <Class ArrayList>
		//  101  196:dup             
		//  102  197:invokespecial   #164 <Method void ArrayList()>
		//  103  200:putfield        #166 <Field ArrayList startTimes>
		//  104  203:return          
		}

		private void parseStreamFragmentStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			int i = startTimes.size();
		//    0    0:aload_0         
		//    1    1:getfield        #166 <Field ArrayList startTimes>
		//    2    4:invokevirtual   #172 <Method int ArrayList.size()>
		//    3    7:istore_2        
			long l1 = parseLong(xmlpullparser, "t", 0x1L);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:ldc1            #23  <String "t">
		//    7   12:ldc2w           #173 <Long 0x1L>
		//    8   15:invokevirtual   #178 <Method long parseLong(XmlPullParser, String, long)>
		//    9   18:lstore          6
			boolean flag = true;
		//   10   20:iconst_1        
		//   11   21:istore_3        
			long l = l1;
		//   12   22:lload           6
		//   13   24:lstore          4
			if(l1 == 0x1L)
		//*  14   26:lload           6
		//*  15   28:ldc2w           #173 <Long 0x1L>
		//*  16   31:lcmp            
		//*  17   32:ifne            92
				if(i == 0)
		//*  18   35:iload_2         
		//*  19   36:ifne            45
					l = 0L;
		//   20   39:lconst_0        
		//   21   40:lstore          4
				else
		//*  22   42:goto            92
				if(lastChunkDuration != -1L)
		//*  23   45:aload_0         
		//*  24   46:getfield        #180 <Field long lastChunkDuration>
		//*  25   49:ldc2w           #150 <Long -1L>
		//*  26   52:lcmp            
		//*  27   53:ifeq            82
					l = ((Long)startTimes.get(i - 1)).longValue() + lastChunkDuration;
		//   28   56:aload_0         
		//   29   57:getfield        #166 <Field ArrayList startTimes>
		//   30   60:iload_2         
		//   31   61:iconst_1        
		//   32   62:isub            
		//   33   63:invokevirtual   #184 <Method Object ArrayList.get(int)>
		//   34   66:checkcast       #157 <Class Long>
		//   35   69:invokevirtual   #161 <Method long Long.longValue()>
		//   36   72:aload_0         
		//   37   73:getfield        #180 <Field long lastChunkDuration>
		//   38   76:ladd            
		//   39   77:lstore          4
				else
		//*  40   79:goto            92
					throw new ParserException("Unable to infer start time");
		//   41   82:new             #101 <Class ParserException>
		//   42   85:dup             
		//   43   86:ldc1            #186 <String "Unable to infer start time">
		//   44   88:invokespecial   #189 <Method void ParserException(String)>
		//   45   91:athrow          
			startTimes.add(((Object) (Long.valueOf(l))));
		//   46   92:aload_0         
		//   47   93:getfield        #166 <Field ArrayList startTimes>
		//   48   96:lload           4
		//   49   98:invokestatic    #192 <Method Long Long.valueOf(long)>
		//   50  101:invokevirtual   #196 <Method boolean ArrayList.add(Object)>
		//   51  104:pop             
			lastChunkDuration = parseLong(xmlpullparser, "d", 0x1L);
		//   52  105:aload_0         
		//   53  106:aload_0         
		//   54  107:aload_1         
		//   55  108:ldc1            #17  <String "d">
		//   56  110:ldc2w           #173 <Long 0x1L>
		//   57  113:invokevirtual   #178 <Method long parseLong(XmlPullParser, String, long)>
		//   58  116:putfield        #180 <Field long lastChunkDuration>
			l1 = parseLong(xmlpullparser, "r", 1L);
		//   59  119:aload_0         
		//   60  120:aload_1         
		//   61  121:ldc1            #20  <String "r">
		//   62  123:lconst_1        
		//   63  124:invokevirtual   #178 <Method long parseLong(XmlPullParser, String, long)>
		//   64  127:lstore          6
			i = ((int) (flag));
		//   65  129:iload_3         
		//   66  130:istore_2        
			if(l1 > 1L)
		//*  67  131:lload           6
		//*  68  133:lconst_1        
		//*  69  134:lcmp            
		//*  70  135:ifle            161
			{
				i = ((int) (flag));
		//   71  138:iload_3         
		//   72  139:istore_2        
				if(lastChunkDuration == 0x1L)
		//*  73  140:aload_0         
		//*  74  141:getfield        #180 <Field long lastChunkDuration>
		//*  75  144:ldc2w           #173 <Long 0x1L>
		//*  76  147:lcmp            
		//*  77  148:ifne            161
					throw new ParserException("Repeated chunk with unspecified duration");
		//   78  151:new             #101 <Class ParserException>
		//   79  154:dup             
		//   80  155:ldc1            #198 <String "Repeated chunk with unspecified duration">
		//   81  157:invokespecial   #189 <Method void ParserException(String)>
		//   82  160:athrow          
			}
			do
			{
				long l2 = i;
		//   83  161:iload_2         
		//   84  162:i2l             
		//   85  163:lstore          8
				if(l2 < l1)
		//*  86  165:lload           8
		//*  87  167:lload           6
		//*  88  169:lcmp            
		//*  89  170:ifge            201
				{
					startTimes.add(((Object) (Long.valueOf(l + lastChunkDuration * l2))));
		//   90  173:aload_0         
		//   91  174:getfield        #166 <Field ArrayList startTimes>
		//   92  177:lload           4
		//   93  179:aload_0         
		//   94  180:getfield        #180 <Field long lastChunkDuration>
		//   95  183:lload           8
		//   96  185:lmul            
		//   97  186:ladd            
		//   98  187:invokestatic    #192 <Method Long Long.valueOf(long)>
		//   99  190:invokevirtual   #196 <Method boolean ArrayList.add(Object)>
		//  100  193:pop             
					i++;
		//  101  194:iload_2         
		//  102  195:iconst_1        
		//  103  196:iadd            
		//  104  197:istore_2        
				} else
		//* 105  198:goto            161
				{
					return;
		//  106  201:return          
				}
			} while(true);
		}

		private int parseType(XmlPullParser xmlpullparser)
			throws ParserException
		{
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "Type")));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:ldc1            #44  <String "Type">
		//    3    4:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
		//    4    9:astore_1        
			if(xmlpullparser != null)
		//*   5   10:aload_1         
		//*   6   11:ifnull          87
			{
				if("audio".equalsIgnoreCase(((String) (xmlpullparser))))
		//*   7   14:ldc1            #47  <String "audio">
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #204 <Method boolean String.equalsIgnoreCase(String)>
		//*  10   20:ifeq            25
					return 1;
		//   11   23:iconst_1        
		//   12   24:ireturn         
				if("video".equalsIgnoreCase(((String) (xmlpullparser))))
		//*  13   25:ldc1            #53  <String "video">
		//*  14   27:aload_1         
		//*  15   28:invokevirtual   #204 <Method boolean String.equalsIgnoreCase(String)>
		//*  16   31:ifeq            36
					return 2;
		//   17   34:iconst_2        
		//   18   35:ireturn         
				if("text".equalsIgnoreCase(((String) (xmlpullparser))))
		//*  19   36:ldc1            #50  <String "text">
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #204 <Method boolean String.equalsIgnoreCase(String)>
		//*  22   42:ifeq            47
				{
					return 3;
		//   23   45:iconst_3        
		//   24   46:ireturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   25   47:new             #206 <Class StringBuilder>
		//   26   50:dup             
		//   27   51:invokespecial   #207 <Method void StringBuilder()>
		//   28   54:astore_2        
					stringbuilder.append("Invalid key value[");
		//   29   55:aload_2         
		//   30   56:ldc1            #209 <String "Invalid key value[">
		//   31   58:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
		//   32   61:pop             
					stringbuilder.append(((String) (xmlpullparser)));
		//   33   62:aload_2         
		//   34   63:aload_1         
		//   35   64:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
		//   36   67:pop             
					stringbuilder.append("]");
		//   37   68:aload_2         
		//   38   69:ldc1            #215 <String "]">
		//   39   71:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
		//   40   74:pop             
					throw new ParserException(stringbuilder.toString());
		//   41   75:new             #101 <Class ParserException>
		//   42   78:dup             
		//   43   79:aload_2         
		//   44   80:invokevirtual   #219 <Method String StringBuilder.toString()>
		//   45   83:invokespecial   #189 <Method void ParserException(String)>
		//   46   86:athrow          
				}
			} else
			{
				throw new MissingFieldException("Type");
		//   47   87:new             #221 <Class SsManifestParser$MissingFieldException>
		//   48   90:dup             
		//   49   91:ldc1            #44  <String "Type">
		//   50   93:invokespecial   #222 <Method void SsManifestParser$MissingFieldException(String)>
		//   51   96:athrow          
			}
		}

		public void addChild(Object obj)
		{
			if(obj instanceof Format)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #226 <Class Format>
		//*   2    4:ifeq            21
				formats.add(((Object) ((Format)obj)));
		//    3    7:aload_0         
		//    4    8:getfield        #96  <Field List formats>
		//    5   11:aload_1         
		//    6   12:checkcast       #226 <Class Format>
		//    7   15:invokeinterface #229 <Method boolean List.add(Object)>
		//    8   20:pop             
		//    9   21:return          
		}

		public Object build()
		{
			Format aformat[] = new Format[formats.size()];
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field List formats>
		//    2    4:invokeinterface #232 <Method int List.size()>
		//    3    9:anewarray       Format[]
		//    4   12:astore_1        
			formats.toArray(((Object []) (aformat)));
		//    5   13:aload_0         
		//    6   14:getfield        #96  <Field List formats>
		//    7   17:aload_1         
		//    8   18:invokeinterface #236 <Method Object[] List.toArray(Object[])>
		//    9   23:pop             
			return ((Object) (new SsManifest.StreamElement(baseUri, url, type, subType, timescale, name, maxWidth, maxHeight, displayWidth, displayHeight, language, aformat, ((List) (startTimes)), lastChunkDuration)));
		//   10   24:new             #238 <Class SsManifest$StreamElement>
		//   11   27:dup             
		//   12   28:aload_0         
		//   13   29:getfield        #89  <Field String baseUri>
		//   14   32:aload_0         
		//   15   33:getfield        #133 <Field String url>
		//   16   36:aload_0         
		//   17   37:getfield        #107 <Field int type>
		//   18   40:aload_0         
		//   19   41:getfield        #123 <Field String subType>
		//   20   44:aload_0         
		//   21   45:getfield        #149 <Field long timescale>
		//   22   48:aload_0         
		//   23   49:getfield        #131 <Field String name>
		//   24   52:aload_0         
		//   25   53:getfield        #139 <Field int maxWidth>
		//   26   56:aload_0         
		//   27   57:getfield        #141 <Field int maxHeight>
		//   28   60:aload_0         
		//   29   61:getfield        #143 <Field int displayWidth>
		//   30   64:aload_0         
		//   31   65:getfield        #145 <Field int displayHeight>
		//   32   68:aload_0         
		//   33   69:getfield        #147 <Field String language>
		//   34   72:aload_1         
		//   35   73:aload_0         
		//   36   74:getfield        #166 <Field ArrayList startTimes>
		//   37   77:aload_0         
		//   38   78:getfield        #180 <Field long lastChunkDuration>
		//   39   81:invokespecial   #241 <Method void SsManifest$StreamElement(String, String, int, String, long, String, int, int, int, int, String, Format[], List, long)>
		//   40   84:areturn         
		}

		public boolean handleChildInline(String s)
		{
			return "c".equals(((Object) (s)));
		//    0    0:ldc1            #62  <String "c">
		//    1    2:aload_1         
		//    2    3:invokevirtual   #245 <Method boolean String.equals(Object)>
		//    3    6:ireturn         
		}

		public void parseStartTag(XmlPullParser xmlpullparser)
			throws ParserException
		{
			if("c".equals(((Object) (xmlpullparser.getName()))))
		//*   0    0:ldc1            #62  <String "c">
		//*   1    2:aload_1         
		//*   2    3:invokeinterface #249 <Method String XmlPullParser.getName()>
		//*   3    8:invokevirtual   #245 <Method boolean String.equals(Object)>
		//*   4   11:ifeq            20
			{
				parseStreamFragmentStartTag(xmlpullparser);
		//    5   14:aload_0         
		//    6   15:aload_1         
		//    7   16:invokespecial   #251 <Method void parseStreamFragmentStartTag(XmlPullParser)>
				return;
		//    8   19:return          
			} else
			{
				parseStreamElementStartTag(xmlpullparser);
		//    9   20:aload_0         
		//   10   21:aload_1         
		//   11   22:invokespecial   #253 <Method void parseStreamElementStartTag(XmlPullParser)>
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
		private final List formats = new LinkedList();
		private String language;
		private long lastChunkDuration;
		private int maxHeight;
		private int maxWidth;
		private String name;
		private ArrayList startTimes;
		private String subType;
		private long timescale;
		private int type;
		private String url;

		public StreamIndexParser(ElementParser elementparser, String s)
		{
			super(elementparser, s, "StreamIndex");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #59  <String "StreamIndex">
		//    4    5:invokespecial   #87  <Method void SsManifestParser$ElementParser(SsManifestParser$ElementParser, String, String)>
			baseUri = s;
		//    5    8:aload_0         
		//    6    9:aload_2         
		//    7   10:putfield        #89  <Field String baseUri>
		//    8   13:aload_0         
		//    9   14:new             #91  <Class LinkedList>
		//   10   17:dup             
		//   11   18:invokespecial   #94  <Method void LinkedList()>
		//   12   21:putfield        #96  <Field List formats>
		//   13   24:return          
		}
	}


	public SsManifestParser()
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

	public SsManifest parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		try
		{
			XmlPullParser xmlpullparser = xmlParserFactory.newPullParser();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field XmlPullParserFactory xmlParserFactory>
	//    2    4:invokevirtual   #57  <Method XmlPullParser XmlPullParserFactory.newPullParser()>
	//    3    7:astore_3        
			xmlpullparser.setInput(inputstream, ((String) (null)));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokeinterface #63  <Method void XmlPullParser.setInput(InputStream, String)>
			uri = ((Uri) ((SsManifest)(new SmoothStreamingMediaParser(((ElementParser) (null)), uri.toString())).parse(xmlpullparser)));
	//    8   16:new             #21  <Class SsManifestParser$SmoothStreamingMediaParser>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:aload_1         
	//   12   22:invokevirtual   #69  <Method String Uri.toString()>
	//   13   25:invokespecial   #72  <Method void SsManifestParser$SmoothStreamingMediaParser(SsManifestParser$ElementParser, String)>
	//   14   28:aload_3         
	//   15   29:invokevirtual   #75  <Method Object SsManifestParser$SmoothStreamingMediaParser.parse(XmlPullParser)>
	//   16   32:checkcast       #77  <Class SsManifest>
	//   17   35:astore_1        
		}
	//*  18   36:aload_1         
	//*  19   37:areturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*  20   38:astore_1        
		{
			throw new ParserException(((Throwable) (uri)));
	//   21   39:new             #79  <Class ParserException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokespecial   #82  <Method void ParserException(Throwable)>
	//   25   47:athrow          
		}
		return ((SsManifest) (uri));
	}

	public volatile Object parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		return ((Object) (parse(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #86  <Method SsManifest parse(Uri, InputStream)>
	//    4    6:areturn         
	}

	private final XmlPullParserFactory xmlParserFactory;
}
