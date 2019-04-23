// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.provider.FontRequest;
import android.util.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class FontResourcesParserCompat
{
	public static interface FamilyResourceEntry
	{
	}

	public static interface FetchStrategy
		extends Annotation
	{
	}

	public static final class FontFamilyFilesResourceEntry
		implements FamilyResourceEntry
	{

		public FontFileResourceEntry[] getEntries()
		{
			return mEntries;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field FontResourcesParserCompat$FontFileResourceEntry[] mEntries>
		//    2    4:areturn         
		}

		private final FontFileResourceEntry mEntries[];

		public FontFamilyFilesResourceEntry(FontFileResourceEntry afontfileresourceentry[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mEntries = afontfileresourceentry;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field FontResourcesParserCompat$FontFileResourceEntry[] mEntries>
		//    5    9:return          
		}
	}

	public static final class FontFileResourceEntry
	{

		public String getFileName()
		{
			return mFileName;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field String mFileName>
		//    2    4:areturn         
		}

		public int getResourceId()
		{
			return mResourceId;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int mResourceId>
		//    2    4:ireturn         
		}

		public int getTtcIndex()
		{
			return mTtcIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int mTtcIndex>
		//    2    4:ireturn         
		}

		public String getVariationSettings()
		{
			return mVariationSettings;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field String mVariationSettings>
		//    2    4:areturn         
		}

		public int getWeight()
		{
			return mWeight;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int mWeight>
		//    2    4:ireturn         
		}

		public boolean isItalic()
		{
			return mItalic;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field boolean mItalic>
		//    2    4:ireturn         
		}

		private final String mFileName;
		private boolean mItalic;
		private int mResourceId;
		private int mTtcIndex;
		private String mVariationSettings;
		private int mWeight;

		public FontFileResourceEntry(String s, int i, boolean flag, String s1, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mFileName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field String mFileName>
			mWeight = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #27  <Field int mWeight>
			mItalic = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #29  <Field boolean mItalic>
			mVariationSettings = s1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #31  <Field String mVariationSettings>
			mTtcIndex = j;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #33  <Field int mTtcIndex>
			mResourceId = k;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #35  <Field int mResourceId>
		//   20   37:return          
		}
	}

	public static final class ProviderResourceEntry
		implements FamilyResourceEntry
	{

		public int getFetchStrategy()
		{
			return mStrategy;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int mStrategy>
		//    2    4:ireturn         
		}

		public FontRequest getRequest()
		{
			return mRequest;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field FontRequest mRequest>
		//    2    4:areturn         
		}

		public int getTimeout()
		{
			return mTimeoutMs;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int mTimeoutMs>
		//    2    4:ireturn         
		}

		private final FontRequest mRequest;
		private final int mStrategy;
		private final int mTimeoutMs;

		public ProviderResourceEntry(FontRequest fontrequest, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mRequest = fontrequest;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field FontRequest mRequest>
			mStrategy = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #24  <Field int mStrategy>
			mTimeoutMs = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int mTimeoutMs>
		//   11   19:return          
		}
	}


	private FontResourcesParserCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	private static int getType(TypedArray typedarray, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			return typedarray.getType(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #52  <Method int TypedArray.getType(int)>
	//    6   13:ireturn         
		} else
		{
			TypedValue typedvalue = new TypedValue();
	//    7   14:new             #54  <Class TypedValue>
	//    8   17:dup             
	//    9   18:invokespecial   #55  <Method void TypedValue()>
	//   10   21:astore_2        
			typedarray.getValue(i, typedvalue);
	//   11   22:aload_0         
	//   12   23:iload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #59  <Method boolean TypedArray.getValue(int, TypedValue)>
	//   15   28:pop             
			return typedvalue.type;
	//   16   29:aload_2         
	//   17   30:getfield        #62  <Field int TypedValue.type>
	//   18   33:ireturn         
		}
	}

	public static FamilyResourceEntry parse(XmlPullParser xmlpullparser, Resources resources)
		throws XmlPullParserException, IOException
	{
		int i;
		do
			i = xmlpullparser.next();
	//    0    0:aload_0         
	//    1    1:invokeinterface #75  <Method int XmlPullParser.next()>
	//    2    6:istore_2        
		while(i != 2 && i != 1);
	//    3    7:iload_2         
	//    4    8:iconst_2        
	//    5    9:icmpeq          20
	//    6   12:iload_2         
	//    7   13:iconst_1        
	//    8   14:icmpeq          20
	//*   9   17:goto            0
		if(i == 2)
	//*  10   20:iload_2         
	//*  11   21:iconst_2        
	//*  12   22:icmpne          31
			return readFamilies(xmlpullparser, resources);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #78  <Method FontResourcesParserCompat$FamilyResourceEntry readFamilies(XmlPullParser, Resources)>
	//   16   30:areturn         
		else
			throw new XmlPullParserException("No start tag found");
	//   17   31:new             #66  <Class XmlPullParserException>
	//   18   34:dup             
	//   19   35:ldc1            #80  <String "No start tag found">
	//   20   37:invokespecial   #83  <Method void XmlPullParserException(String)>
	//   21   40:athrow          
	}

	public static List readCerts(Resources resources, int i)
	{
		TypedArray typedarray;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            8
			return Collections.emptyList();
	//    2    4:invokestatic    #94  <Method List Collections.emptyList()>
	//    3    7:areturn         
		typedarray = resources.obtainTypedArray(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #100 <Method TypedArray Resources.obtainTypedArray(int)>
	//    7   13:astore_3        
		if(typedarray.length() != 0)
			break MISSING_BLOCK_LABEL_31;
	//    8   14:aload_3         
	//    9   15:invokevirtual   #103 <Method int TypedArray.length()>
	//   10   18:ifne            31
		resources = ((Resources) (Collections.emptyList()));
	//   11   21:invokestatic    #94  <Method List Collections.emptyList()>
	//   12   24:astore_0        
		typedarray.recycle();
	//   13   25:aload_3         
	//   14   26:invokevirtual   #106 <Method void TypedArray.recycle()>
		return ((List) (resources));
	//   15   29:aload_0         
	//   16   30:areturn         
		ArrayList arraylist = new ArrayList();
	//   17   31:new             #108 <Class ArrayList>
	//   18   34:dup             
	//   19   35:invokespecial   #109 <Method void ArrayList()>
	//   20   38:astore          4
		if(getType(typedarray, 0) != 1) goto _L2; else goto _L1
	//   21   40:aload_3         
	//   22   41:iconst_0        
	//   23   42:invokestatic    #111 <Method int getType(TypedArray, int)>
	//   24   45:iconst_1        
	//   25   46:icmpne          89
_L1:
		i = 0;
	//   26   49:iconst_0        
	//   27   50:istore_1        
_L8:
		if(i >= typedarray.length()) goto _L4; else goto _L3
	//   28   51:iload_1         
	//   29   52:aload_3         
	//   30   53:invokevirtual   #103 <Method int TypedArray.length()>
	//   31   56:icmpge          105
_L3:
		int j = typedarray.getResourceId(i, 0);
	//   32   59:aload_3         
	//   33   60:iload_1         
	//   34   61:iconst_0        
	//   35   62:invokevirtual   #115 <Method int TypedArray.getResourceId(int, int)>
	//   36   65:istore_2        
		if(j == 0) goto _L6; else goto _L5
	//   37   66:iload_2         
	//   38   67:ifeq            119
_L5:
		((List) (arraylist)).add(((Object) (toByteArrayList(resources.getStringArray(j)))));
	//   39   70:aload           4
	//   40   72:aload_0         
	//   41   73:iload_2         
	//   42   74:invokevirtual   #119 <Method String[] Resources.getStringArray(int)>
	//   43   77:invokestatic    #123 <Method List toByteArrayList(String[])>
	//   44   80:invokeinterface #129 <Method boolean List.add(Object)>
	//   45   85:pop             
		  goto _L6
	//*  46   86:goto            119
_L2:
		((List) (arraylist)).add(((Object) (toByteArrayList(resources.getStringArray(i)))));
	//   47   89:aload           4
	//   48   91:aload_0         
	//   49   92:iload_1         
	//   50   93:invokevirtual   #119 <Method String[] Resources.getStringArray(int)>
	//   51   96:invokestatic    #123 <Method List toByteArrayList(String[])>
	//   52   99:invokeinterface #129 <Method boolean List.add(Object)>
	//   53  104:pop             
_L4:
		typedarray.recycle();
	//   54  105:aload_3         
	//   55  106:invokevirtual   #106 <Method void TypedArray.recycle()>
		return ((List) (arraylist));
	//   56  109:aload           4
	//   57  111:areturn         
		resources;
	//   58  112:astore_0        
		typedarray.recycle();
	//   59  113:aload_3         
	//   60  114:invokevirtual   #106 <Method void TypedArray.recycle()>
		throw resources;
	//   61  117:aload_0         
	//   62  118:athrow          
_L6:
		i++;
	//   63  119:iload_1         
	//   64  120:iconst_1        
	//   65  121:iadd            
	//   66  122:istore_1        
		if(true) goto _L8; else goto _L7
	//   67  123:goto            51
_L7:
	}

	private static FamilyResourceEntry readFamilies(XmlPullParser xmlpullparser, Resources resources)
		throws XmlPullParserException, IOException
	{
		xmlpullparser.require(2, ((String) (null)), "font-family");
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aconst_null     
	//    3    3:ldc1            #134 <String "font-family">
	//    4    5:invokeinterface #138 <Method void XmlPullParser.require(int, String, String)>
		if(xmlpullparser.getName().equals("font-family"))
	//*   5   10:aload_0         
	//*   6   11:invokeinterface #142 <Method String XmlPullParser.getName()>
	//*   7   16:ldc1            #134 <String "font-family">
	//*   8   18:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*   9   21:ifeq            30
		{
			return readFamily(xmlpullparser, resources);
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokestatic    #150 <Method FontResourcesParserCompat$FamilyResourceEntry readFamily(XmlPullParser, Resources)>
	//   13   29:areturn         
		} else
		{
			skip(xmlpullparser);
	//   14   30:aload_0         
	//   15   31:invokestatic    #154 <Method void skip(XmlPullParser)>
			return null;
	//   16   34:aconst_null     
	//   17   35:areturn         
		}
	}

	private static FamilyResourceEntry readFamily(XmlPullParser xmlpullparser, Resources resources)
		throws XmlPullParserException, IOException
	{
		Object obj = ((Object) (resources.obtainAttributes(Xml.asAttributeSet(xmlpullparser), android.support.compat.R.styleable.FontFamily)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #160 <Method android.util.AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    3    5:getstatic       #166 <Field int[] android.support.compat.R$styleable.FontFamily>
	//    4    8:invokevirtual   #170 <Method TypedArray Resources.obtainAttributes(android.util.AttributeSet, int[])>
	//    5   11:astore          5
		String s = ((TypedArray) (obj)).getString(android.support.compat.R.styleable.FontFamily_fontProviderAuthority);
	//    6   13:aload           5
	//    7   15:getstatic       #173 <Field int android.support.compat.R$styleable.FontFamily_fontProviderAuthority>
	//    8   18:invokevirtual   #177 <Method String TypedArray.getString(int)>
	//    9   21:astore          6
		String s1 = ((TypedArray) (obj)).getString(android.support.compat.R.styleable.FontFamily_fontProviderPackage);
	//   10   23:aload           5
	//   11   25:getstatic       #180 <Field int android.support.compat.R$styleable.FontFamily_fontProviderPackage>
	//   12   28:invokevirtual   #177 <Method String TypedArray.getString(int)>
	//   13   31:astore          7
		String s2 = ((TypedArray) (obj)).getString(android.support.compat.R.styleable.FontFamily_fontProviderQuery);
	//   14   33:aload           5
	//   15   35:getstatic       #183 <Field int android.support.compat.R$styleable.FontFamily_fontProviderQuery>
	//   16   38:invokevirtual   #177 <Method String TypedArray.getString(int)>
	//   17   41:astore          8
		int i = ((TypedArray) (obj)).getResourceId(android.support.compat.R.styleable.FontFamily_fontProviderCerts, 0);
	//   18   43:aload           5
	//   19   45:getstatic       #186 <Field int android.support.compat.R$styleable.FontFamily_fontProviderCerts>
	//   20   48:iconst_0        
	//   21   49:invokevirtual   #115 <Method int TypedArray.getResourceId(int, int)>
	//   22   52:istore_2        
		int j = ((TypedArray) (obj)).getInteger(android.support.compat.R.styleable.FontFamily_fontProviderFetchStrategy, 1);
	//   23   53:aload           5
	//   24   55:getstatic       #189 <Field int android.support.compat.R$styleable.FontFamily_fontProviderFetchStrategy>
	//   25   58:iconst_1        
	//   26   59:invokevirtual   #192 <Method int TypedArray.getInteger(int, int)>
	//   27   62:istore_3        
		int k = ((TypedArray) (obj)).getInteger(android.support.compat.R.styleable.FontFamily_fontProviderFetchTimeout, 500);
	//   28   63:aload           5
	//   29   65:getstatic       #195 <Field int android.support.compat.R$styleable.FontFamily_fontProviderFetchTimeout>
	//   30   68:sipush          500
	//   31   71:invokevirtual   #192 <Method int TypedArray.getInteger(int, int)>
	//   32   74:istore          4
		((TypedArray) (obj)).recycle();
	//   33   76:aload           5
	//   34   78:invokevirtual   #106 <Method void TypedArray.recycle()>
		if(s != null && s1 != null && s2 != null)
	//*  35   81:aload           6
	//*  36   83:ifnull          142
	//*  37   86:aload           7
	//*  38   88:ifnull          142
	//*  39   91:aload           8
	//*  40   93:ifnull          142
		{
			for(; xmlpullparser.next() != 3; skip(xmlpullparser));
	//   41   96:aload_0         
	//   42   97:invokeinterface #75  <Method int XmlPullParser.next()>
	//   43  102:iconst_3        
	//   44  103:icmpeq          113
	//   45  106:aload_0         
	//   46  107:invokestatic    #154 <Method void skip(XmlPullParser)>
	//*  47  110:goto            96
			return ((FamilyResourceEntry) (new ProviderResourceEntry(new FontRequest(s, s1, s2, readCerts(resources, i)), j, k)));
	//   48  113:new             #18  <Class FontResourcesParserCompat$ProviderResourceEntry>
	//   49  116:dup             
	//   50  117:new             #197 <Class FontRequest>
	//   51  120:dup             
	//   52  121:aload           6
	//   53  123:aload           7
	//   54  125:aload           8
	//   55  127:aload_1         
	//   56  128:iload_2         
	//   57  129:invokestatic    #199 <Method List readCerts(Resources, int)>
	//   58  132:invokespecial   #202 <Method void FontRequest(String, String, String, List)>
	//   59  135:iload_3         
	//   60  136:iload           4
	//   61  138:invokespecial   #205 <Method void FontResourcesParserCompat$ProviderResourceEntry(FontRequest, int, int)>
	//   62  141:areturn         
		}
		obj = ((Object) (new ArrayList()));
	//   63  142:new             #108 <Class ArrayList>
	//   64  145:dup             
	//   65  146:invokespecial   #109 <Method void ArrayList()>
	//   66  149:astore          5
		do
		{
			if(xmlpullparser.next() == 3)
				break;
	//   67  151:aload_0         
	//   68  152:invokeinterface #75  <Method int XmlPullParser.next()>
	//   69  157:iconst_3        
	//   70  158:icmpeq          211
			if(xmlpullparser.getEventType() == 2)
	//*  71  161:aload_0         
	//*  72  162:invokeinterface #208 <Method int XmlPullParser.getEventType()>
	//*  73  167:iconst_2        
	//*  74  168:icmpeq          174
	//*  75  171:goto            151
				if(xmlpullparser.getName().equals("font"))
	//*  76  174:aload_0         
	//*  77  175:invokeinterface #142 <Method String XmlPullParser.getName()>
	//*  78  180:ldc1            #210 <String "font">
	//*  79  182:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  80  185:ifeq            204
					((List) (obj)).add(((Object) (readFont(xmlpullparser, resources))));
	//   81  188:aload           5
	//   82  190:aload_0         
	//   83  191:aload_1         
	//   84  192:invokestatic    #214 <Method FontResourcesParserCompat$FontFileResourceEntry readFont(XmlPullParser, Resources)>
	//   85  195:invokeinterface #129 <Method boolean List.add(Object)>
	//   86  200:pop             
				else
	//*  87  201:goto            151
					skip(xmlpullparser);
	//   88  204:aload_0         
	//   89  205:invokestatic    #154 <Method void skip(XmlPullParser)>
		} while(true);
	//   90  208:goto            151
		if(((List) (obj)).isEmpty())
	//*  91  211:aload           5
	//*  92  213:invokeinterface #218 <Method boolean List.isEmpty()>
	//*  93  218:ifeq            223
			return null;
	//   94  221:aconst_null     
	//   95  222:areturn         
		else
			return ((FamilyResourceEntry) (new FontFamilyFilesResourceEntry((FontFileResourceEntry[])((List) (obj)).toArray(((Object []) (new FontFileResourceEntry[((List) (obj)).size()]))))));
	//   96  223:new             #12  <Class FontResourcesParserCompat$FontFamilyFilesResourceEntry>
	//   97  226:dup             
	//   98  227:aload           5
	//   99  229:aload           5
	//  100  231:invokeinterface #221 <Method int List.size()>
	//  101  236:anewarray       FontFileResourceEntry[]
	//  102  239:invokeinterface #225 <Method Object[] List.toArray(Object[])>
	//  103  244:checkcast       #227 <Class FontResourcesParserCompat$FontFileResourceEntry[]>
	//  104  247:invokespecial   #230 <Method void FontResourcesParserCompat$FontFamilyFilesResourceEntry(FontResourcesParserCompat$FontFileResourceEntry[])>
	//  105  250:areturn         
	}

	private static FontFileResourceEntry readFont(XmlPullParser xmlpullparser, Resources resources)
		throws XmlPullParserException, IOException
	{
		resources = ((Resources) (resources.obtainAttributes(Xml.asAttributeSet(xmlpullparser), android.support.compat.R.styleable.FontFamilyFont)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #160 <Method android.util.AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    3    5:getstatic       #233 <Field int[] android.support.compat.R$styleable.FontFamilyFont>
	//    4    8:invokevirtual   #170 <Method TypedArray Resources.obtainAttributes(android.util.AttributeSet, int[])>
	//    5   11:astore_1        
		int i;
		if(((TypedArray) (resources)).hasValue(android.support.compat.R.styleable.FontFamilyFont_fontWeight))
	//*   6   12:aload_1         
	//*   7   13:getstatic       #236 <Field int android.support.compat.R$styleable.FontFamilyFont_fontWeight>
	//*   8   16:invokevirtual   #240 <Method boolean TypedArray.hasValue(int)>
	//*   9   19:ifeq            29
			i = android.support.compat.R.styleable.FontFamilyFont_fontWeight;
	//   10   22:getstatic       #236 <Field int android.support.compat.R$styleable.FontFamilyFont_fontWeight>
	//   11   25:istore_2        
		else
	//*  12   26:goto            33
			i = android.support.compat.R.styleable.FontFamilyFont_android_fontWeight;
	//   13   29:getstatic       #243 <Field int android.support.compat.R$styleable.FontFamilyFont_android_fontWeight>
	//   14   32:istore_2        
		int k = ((TypedArray) (resources)).getInt(i, 400);
	//   15   33:aload_1         
	//   16   34:iload_2         
	//   17   35:sipush          400
	//   18   38:invokevirtual   #246 <Method int TypedArray.getInt(int, int)>
	//   19   41:istore          4
		if(((TypedArray) (resources)).hasValue(android.support.compat.R.styleable.FontFamilyFont_fontStyle))
	//*  20   43:aload_1         
	//*  21   44:getstatic       #249 <Field int android.support.compat.R$styleable.FontFamilyFont_fontStyle>
	//*  22   47:invokevirtual   #240 <Method boolean TypedArray.hasValue(int)>
	//*  23   50:ifeq            60
			i = android.support.compat.R.styleable.FontFamilyFont_fontStyle;
	//   24   53:getstatic       #249 <Field int android.support.compat.R$styleable.FontFamilyFont_fontStyle>
	//   25   56:istore_2        
		else
	//*  26   57:goto            64
			i = android.support.compat.R.styleable.FontFamilyFont_android_fontStyle;
	//   27   60:getstatic       #252 <Field int android.support.compat.R$styleable.FontFamilyFont_android_fontStyle>
	//   28   63:istore_2        
		boolean flag;
		if(1 == ((TypedArray) (resources)).getInt(i, 0))
	//*  29   64:iconst_1        
	//*  30   65:aload_1         
	//*  31   66:iload_2         
	//*  32   67:iconst_0        
	//*  33   68:invokevirtual   #246 <Method int TypedArray.getInt(int, int)>
	//*  34   71:icmpne          80
			flag = true;
	//   35   74:iconst_1        
	//   36   75:istore          6
		else
	//*  37   77:goto            83
			flag = false;
	//   38   80:iconst_0        
	//   39   81:istore          6
		if(((TypedArray) (resources)).hasValue(android.support.compat.R.styleable.FontFamilyFont_ttcIndex))
	//*  40   83:aload_1         
	//*  41   84:getstatic       #255 <Field int android.support.compat.R$styleable.FontFamilyFont_ttcIndex>
	//*  42   87:invokevirtual   #240 <Method boolean TypedArray.hasValue(int)>
	//*  43   90:ifeq            100
			i = android.support.compat.R.styleable.FontFamilyFont_ttcIndex;
	//   44   93:getstatic       #255 <Field int android.support.compat.R$styleable.FontFamilyFont_ttcIndex>
	//   45   96:istore_2        
		else
	//*  46   97:goto            104
			i = android.support.compat.R.styleable.FontFamilyFont_android_ttcIndex;
	//   47  100:getstatic       #258 <Field int android.support.compat.R$styleable.FontFamilyFont_android_ttcIndex>
	//   48  103:istore_2        
		int j;
		if(((TypedArray) (resources)).hasValue(android.support.compat.R.styleable.FontFamilyFont_fontVariationSettings))
	//*  49  104:aload_1         
	//*  50  105:getstatic       #261 <Field int android.support.compat.R$styleable.FontFamilyFont_fontVariationSettings>
	//*  51  108:invokevirtual   #240 <Method boolean TypedArray.hasValue(int)>
	//*  52  111:ifeq            121
			j = android.support.compat.R.styleable.FontFamilyFont_fontVariationSettings;
	//   53  114:getstatic       #261 <Field int android.support.compat.R$styleable.FontFamilyFont_fontVariationSettings>
	//   54  117:istore_3        
		else
	//*  55  118:goto            125
			j = android.support.compat.R.styleable.FontFamilyFont_android_fontVariationSettings;
	//   56  121:getstatic       #264 <Field int android.support.compat.R$styleable.FontFamilyFont_android_fontVariationSettings>
	//   57  124:istore_3        
		String s = ((TypedArray) (resources)).getString(j);
	//   58  125:aload_1         
	//   59  126:iload_3         
	//   60  127:invokevirtual   #177 <Method String TypedArray.getString(int)>
	//   61  130:astore          7
		j = ((TypedArray) (resources)).getInt(i, 0);
	//   62  132:aload_1         
	//   63  133:iload_2         
	//   64  134:iconst_0        
	//   65  135:invokevirtual   #246 <Method int TypedArray.getInt(int, int)>
	//   66  138:istore_3        
		if(((TypedArray) (resources)).hasValue(android.support.compat.R.styleable.FontFamilyFont_font))
	//*  67  139:aload_1         
	//*  68  140:getstatic       #267 <Field int android.support.compat.R$styleable.FontFamilyFont_font>
	//*  69  143:invokevirtual   #240 <Method boolean TypedArray.hasValue(int)>
	//*  70  146:ifeq            156
			i = android.support.compat.R.styleable.FontFamilyFont_font;
	//   71  149:getstatic       #267 <Field int android.support.compat.R$styleable.FontFamilyFont_font>
	//   72  152:istore_2        
		else
	//*  73  153:goto            160
			i = android.support.compat.R.styleable.FontFamilyFont_android_font;
	//   74  156:getstatic       #270 <Field int android.support.compat.R$styleable.FontFamilyFont_android_font>
	//   75  159:istore_2        
		int l = ((TypedArray) (resources)).getResourceId(i, 0);
	//   76  160:aload_1         
	//   77  161:iload_2         
	//   78  162:iconst_0        
	//   79  163:invokevirtual   #115 <Method int TypedArray.getResourceId(int, int)>
	//   80  166:istore          5
		String s1 = ((TypedArray) (resources)).getString(i);
	//   81  168:aload_1         
	//   82  169:iload_2         
	//   83  170:invokevirtual   #177 <Method String TypedArray.getString(int)>
	//   84  173:astore          8
		((TypedArray) (resources)).recycle();
	//   85  175:aload_1         
	//   86  176:invokevirtual   #106 <Method void TypedArray.recycle()>
		for(; xmlpullparser.next() != 3; skip(xmlpullparser));
	//   87  179:aload_0         
	//   88  180:invokeinterface #75  <Method int XmlPullParser.next()>
	//   89  185:iconst_3        
	//   90  186:icmpeq          196
	//   91  189:aload_0         
	//   92  190:invokestatic    #154 <Method void skip(XmlPullParser)>
	//*  93  193:goto            179
		return new FontFileResourceEntry(s1, k, flag, s, j, l);
	//   94  196:new             #15  <Class FontResourcesParserCompat$FontFileResourceEntry>
	//   95  199:dup             
	//   96  200:aload           8
	//   97  202:iload           4
	//   98  204:iload           6
	//   99  206:aload           7
	//  100  208:iload_3         
	//  101  209:iload           5
	//  102  211:invokespecial   #273 <Method void FontResourcesParserCompat$FontFileResourceEntry(String, int, boolean, String, int, int)>
	//  103  214:areturn         
	}

	private static void skip(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		do
		{
			if(i <= 0)
				break;
	//    2    2:iload_1         
	//    3    3:ifle            53
			switch(xmlpullparser.next())
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #75  <Method int XmlPullParser.next()>
			{
	//*   6   12:tableswitch     2 3: default 36
	//	               2 46
	//	               3 39
	//*   7   36:goto            2
			case 3: // '\003'
				i--;
	//    8   39:iload_1         
	//    9   40:iconst_1        
	//   10   41:isub            
	//   11   42:istore_1        
				break;

	//*  12   43:goto            2
			case 2: // '\002'
				i++;
	//   13   46:iload_1         
	//   14   47:iconst_1        
	//   15   48:iadd            
	//   16   49:istore_1        
				break;
			}
		} while(true);
	//*  17   50:goto            2
	//   18   53:return          
	}

	private static List toByteArrayList(String as[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #108 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #109 <Method void ArrayList()>
	//    3    7:astore_3        
		int j = as.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          39
			((List) (arraylist)).add(((Object) (Base64.decode(as[i], 0))));
	//   12   18:aload_3         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:iconst_0        
	//   17   23:invokestatic    #279 <Method byte[] Base64.decode(String, int)>
	//   18   26:invokeinterface #129 <Method boolean List.add(Object)>
	//   19   31:pop             

	//   20   32:iload_1         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_1        
	//*  24   36:goto            13
		return ((List) (arraylist));
	//   25   39:aload_3         
	//   26   40:areturn         
	}

	private static final int DEFAULT_TIMEOUT_MILLIS = 500;
	public static final int FETCH_STRATEGY_ASYNC = 1;
	public static final int FETCH_STRATEGY_BLOCKING = 0;
	public static final int INFINITE_TIMEOUT_VALUE = -1;
	private static final int ITALIC = 1;
	private static final int NORMAL_WEIGHT = 400;
}
