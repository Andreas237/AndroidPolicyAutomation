// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming.manifest:
//			SsManifestParser

private static abstract class SsManifestParser$ElementParser
{

	private SsManifestParser$ElementParser newChildParser(SsManifestParser$ElementParser ssmanifestparser$elementparser, String s, String s1)
	{
		if("QualityLevel".equals(((Object) (s))))
	//*   0    0:ldc1            #36  <String "QualityLevel">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            19
			return ((SsManifestParser$ElementParser) (new rser(ssmanifestparser$elementparser, s1)));
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
			return ((SsManifestParser$ElementParser) (new er(ssmanifestparser$elementparser, s1)));
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
			return ((SsManifestParser$ElementParser) (new ser(ssmanifestparser$elementparser, s1)));
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
	//	               1 271
	//	               2 143
	//	               3 84
	//	               4 49
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
					addChild(((SsManifestParser$ElementParser) (obj)).parse(xmlpullparser));
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
			throw new ception(s);
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
			throw new ception(s);
	//   18   30:new             #160 <Class SsManifestParser$MissingFieldException>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:invokespecial   #163 <Method void SsManifestParser$MissingFieldException(String)>
	//   22   38:athrow          
		}
	}

	protected final String parseRequiredString(XmlPullParser xmlpullparser, String s)
		throws ception
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
			throw new ception(s);
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
	private final SsManifestParser$ElementParser parent;
	private final String tag;

	public SsManifestParser$ElementParser(SsManifestParser$ElementParser ssmanifestparser$elementparser, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		parent = ssmanifestparser$elementparser;
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
