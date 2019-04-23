// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import android.text.TextUtils;
import android.util.*;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.*;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			AdaptationSet, ContentProtection, MediaPresentationDescription, Period, 
//			RangedUri, Representation, UtcTimingElement, UrlTemplate, 
//			SegmentBase

public class MediaPresentationDescriptionParser extends DefaultHandler
	implements com.google.android.exoplayer.upstream.UriLoadable.Parser
{
	protected static final class ContentProtectionsBuilder
		implements Comparator
	{

		private void maybeAddContentProtection(List list, ContentProtection contentprotection)
		{
			if(!list.contains(((Object) (contentprotection))))
		//*   0    0:aload_1         
		//*   1    1:aload_2         
		//*   2    2:invokeinterface #30  <Method boolean List.contains(Object)>
		//*   3    7:ifne            62
			{
				for(int i = 0; i < list.size(); i++)
		//*   4   10:iconst_0        
		//*   5   11:istore_3        
		//*   6   12:iload_3         
		//*   7   13:aload_1         
		//*   8   14:invokeinterface #34  <Method int List.size()>
		//*   9   19:icmpge          54
					Assertions.checkState(((ContentProtection)list.get(i)).schemeUriId.equals(((Object) (contentprotection.schemeUriId))) ^ true);
		//   10   22:aload_1         
		//   11   23:iload_3         
		//   12   24:invokeinterface #38  <Method Object List.get(int)>
		//   13   29:checkcast       #40  <Class ContentProtection>
		//   14   32:getfield        #44  <Field String ContentProtection.schemeUriId>
		//   15   35:aload_2         
		//   16   36:getfield        #44  <Field String ContentProtection.schemeUriId>
		//   17   39:invokevirtual   #49  <Method boolean String.equals(Object)>
		//   18   42:iconst_1        
		//   19   43:ixor            
		//   20   44:invokestatic    #55  <Method void Assertions.checkState(boolean)>

		//   21   47:iload_3         
		//   22   48:iconst_1        
		//   23   49:iadd            
		//   24   50:istore_3        
		//*  25   51:goto            12
				list.add(((Object) (contentprotection)));
		//   26   54:aload_1         
		//   27   55:aload_2         
		//   28   56:invokeinterface #58  <Method boolean List.add(Object)>
		//   29   61:pop             
			}
		//   30   62:return          
		}

		public void addAdaptationSetProtection(ContentProtection contentprotection)
		{
			if(adaptationSetProtections == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field ArrayList adaptationSetProtections>
		//*   2    4:ifnonnull       18
				adaptationSetProtections = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #66  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #67  <Method void ArrayList()>
		//    7   15:putfield        #64  <Field ArrayList adaptationSetProtections>
			maybeAddContentProtection(((List) (adaptationSetProtections)), contentprotection);
		//    8   18:aload_0         
		//    9   19:aload_0         
		//   10   20:getfield        #64  <Field ArrayList adaptationSetProtections>
		//   11   23:aload_1         
		//   12   24:invokespecial   #69  <Method void maybeAddContentProtection(List, ContentProtection)>
		//   13   27:return          
		}

		public void addRepresentationProtection(ContentProtection contentprotection)
		{
			if(currentRepresentationProtections == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field ArrayList currentRepresentationProtections>
		//*   2    4:ifnonnull       18
				currentRepresentationProtections = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #66  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #67  <Method void ArrayList()>
		//    7   15:putfield        #72  <Field ArrayList currentRepresentationProtections>
			maybeAddContentProtection(((List) (currentRepresentationProtections)), contentprotection);
		//    8   18:aload_0         
		//    9   19:aload_0         
		//   10   20:getfield        #72  <Field ArrayList currentRepresentationProtections>
		//   11   23:aload_1         
		//   12   24:invokespecial   #69  <Method void maybeAddContentProtection(List, ContentProtection)>
		//   13   27:return          
		}

		public ArrayList build()
		{
			ArrayList arraylist = adaptationSetProtections;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field ArrayList adaptationSetProtections>
		//    2    4:astore_2        
			if(arraylist == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       14
				return representationProtections;
		//    5    9:aload_0         
		//    6   10:getfield        #76  <Field ArrayList representationProtections>
		//    7   13:areturn         
			if(representationProtections == null)
		//*   8   14:aload_0         
		//*   9   15:getfield        #76  <Field ArrayList representationProtections>
		//*  10   18:ifnonnull       23
				return arraylist;
		//   11   21:aload_2         
		//   12   22:areturn         
			for(int i = 0; i < representationProtections.size(); i++)
		//*  13   23:iconst_0        
		//*  14   24:istore_1        
		//*  15   25:iload_1         
		//*  16   26:aload_0         
		//*  17   27:getfield        #76  <Field ArrayList representationProtections>
		//*  18   30:invokevirtual   #77  <Method int ArrayList.size()>
		//*  19   33:icmpge          62
				maybeAddContentProtection(((List) (adaptationSetProtections)), (ContentProtection)representationProtections.get(i));
		//   20   36:aload_0         
		//   21   37:aload_0         
		//   22   38:getfield        #64  <Field ArrayList adaptationSetProtections>
		//   23   41:aload_0         
		//   24   42:getfield        #76  <Field ArrayList representationProtections>
		//   25   45:iload_1         
		//   26   46:invokevirtual   #78  <Method Object ArrayList.get(int)>
		//   27   49:checkcast       #40  <Class ContentProtection>
		//   28   52:invokespecial   #69  <Method void maybeAddContentProtection(List, ContentProtection)>

		//   29   55:iload_1         
		//   30   56:iconst_1        
		//   31   57:iadd            
		//   32   58:istore_1        
		//*  33   59:goto            25
			return adaptationSetProtections;
		//   34   62:aload_0         
		//   35   63:getfield        #64  <Field ArrayList adaptationSetProtections>
		//   36   66:areturn         
		}

		public int compare(ContentProtection contentprotection, ContentProtection contentprotection1)
		{
			return contentprotection.schemeUriId.compareTo(contentprotection1.schemeUriId);
		//    0    0:aload_1         
		//    1    1:getfield        #44  <Field String ContentProtection.schemeUriId>
		//    2    4:aload_2         
		//    3    5:getfield        #44  <Field String ContentProtection.schemeUriId>
		//    4    8:invokevirtual   #85  <Method int String.compareTo(String)>
		//    5   11:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((ContentProtection)obj, (ContentProtection)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #40  <Class ContentProtection>
		//    3    5:aload_2         
		//    4    6:checkcast       #40  <Class ContentProtection>
		//    5    9:invokevirtual   #88  <Method int compare(ContentProtection, ContentProtection)>
		//    6   12:ireturn         
		}

		public void endRepresentation()
		{
			boolean flag1 = representationProtectionsSet;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field boolean representationProtectionsSet>
		//    2    4:istore_2        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore_1        
			if(!flag1)
		//*   5    7:iload_2         
		//*   6    8:ifne            41
			{
				ArrayList arraylist = currentRepresentationProtections;
		//    7   11:aload_0         
		//    8   12:getfield        #72  <Field ArrayList currentRepresentationProtections>
		//    9   15:astore_3        
				if(arraylist != null)
		//*  10   16:aload_3         
		//*  11   17:ifnull          25
					Collections.sort(((List) (arraylist)), ((Comparator) (this)));
		//   12   20:aload_3         
		//   13   21:aload_0         
		//   14   22:invokestatic    #97  <Method void Collections.sort(List, Comparator)>
				representationProtections = currentRepresentationProtections;
		//   15   25:aload_0         
		//   16   26:aload_0         
		//   17   27:getfield        #72  <Field ArrayList currentRepresentationProtections>
		//   18   30:putfield        #76  <Field ArrayList representationProtections>
				representationProtectionsSet = true;
		//   19   33:aload_0         
		//   20   34:iconst_1        
		//   21   35:putfield        #91  <Field boolean representationProtectionsSet>
			} else
		//*  22   38:goto            88
			{
				ArrayList arraylist1 = currentRepresentationProtections;
		//   23   41:aload_0         
		//   24   42:getfield        #72  <Field ArrayList currentRepresentationProtections>
		//   25   45:astore_3        
				if(arraylist1 == null)
		//*  26   46:aload_3         
		//*  27   47:ifnonnull       69
				{
					if(representationProtections != null)
		//*  28   50:aload_0         
		//*  29   51:getfield        #76  <Field ArrayList representationProtections>
		//*  30   54:ifnonnull       60
		//*  31   57:goto            62
						flag = false;
		//   32   60:iconst_0        
		//   33   61:istore_1        
					Assertions.checkState(flag);
		//   34   62:iload_1         
		//   35   63:invokestatic    #55  <Method void Assertions.checkState(boolean)>
				} else
		//*  36   66:goto            88
				{
					Collections.sort(((List) (arraylist1)), ((Comparator) (this)));
		//   37   69:aload_3         
		//   38   70:aload_0         
		//   39   71:invokestatic    #97  <Method void Collections.sort(List, Comparator)>
					Assertions.checkState(currentRepresentationProtections.equals(((Object) (representationProtections))));
		//   40   74:aload_0         
		//   41   75:getfield        #72  <Field ArrayList currentRepresentationProtections>
		//   42   78:aload_0         
		//   43   79:getfield        #76  <Field ArrayList representationProtections>
		//   44   82:invokevirtual   #98  <Method boolean ArrayList.equals(Object)>
		//   45   85:invokestatic    #55  <Method void Assertions.checkState(boolean)>
				}
			}
			currentRepresentationProtections = null;
		//   46   88:aload_0         
		//   47   89:aconst_null     
		//   48   90:putfield        #72  <Field ArrayList currentRepresentationProtections>
		//   49   93:return          
		}

		private ArrayList adaptationSetProtections;
		private ArrayList currentRepresentationProtections;
		private ArrayList representationProtections;
		private boolean representationProtectionsSet;

		protected ContentProtectionsBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	public MediaPresentationDescriptionParser()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #36  <Method void MediaPresentationDescriptionParser(String)>
	//    3    5:return          
	}

	public MediaPresentationDescriptionParser(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void DefaultHandler()>
		contentId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field String contentId>
		try
		{
			xmlParserFactory = XmlPullParserFactory.newInstance();
	//    5    9:aload_0         
	//    6   10:invokestatic    #48  <Method XmlPullParserFactory XmlPullParserFactory.newInstance()>
	//    7   13:putfield        #50  <Field XmlPullParserFactory xmlParserFactory>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   17:astore_1        
		{
			throw new RuntimeException("Couldn't create XmlPullParserFactory instance", ((Throwable) (s)));
	//   10   18:new             #52  <Class RuntimeException>
	//   11   21:dup             
	//   12   22:ldc1            #54  <String "Couldn't create XmlPullParserFactory instance">
	//   13   24:aload_1         
	//   14   25:invokespecial   #57  <Method void RuntimeException(String, Throwable)>
	//   15   28:athrow          
		}
	}

	private static int checkContentTypeConsistency(int i, int j)
	{
		if(i == -1)
	//*   0    0:iload_0         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          7
			return j;
	//    3    5:iload_1         
	//    4    6:ireturn         
		if(j == -1)
	//*   5    7:iload_1         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          14
			return i;
	//    8   12:iload_0         
	//    9   13:ireturn         
		boolean flag;
		if(i == j)
	//*  10   14:iload_0         
	//*  11   15:iload_1         
	//*  12   16:icmpne          24
			flag = true;
	//   13   19:iconst_1        
	//   14   20:istore_2        
		else
	//*  15   21:goto            26
			flag = false;
	//   16   24:iconst_0        
	//   17   25:istore_2        
		Assertions.checkState(flag);
	//   18   26:iload_2         
	//   19   27:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		return i;
	//   20   30:iload_0         
	//   21   31:ireturn         
	}

	private static String checkLanguageConsistency(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return s1;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(s1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
		{
			return s;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			Assertions.checkState(s.equals(((Object) (s1))));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #73  <Method boolean String.equals(Object)>
	//   11   17:invokestatic    #65  <Method void Assertions.checkState(boolean)>
			return s;
	//   12   20:aload_0         
	//   13   21:areturn         
		}
	}

	protected static String parseBaseUrl(XmlPullParser xmlpullparser, String s)
		throws XmlPullParserException, IOException
	{
		xmlpullparser.next();
	//    0    0:aload_0         
	//    1    1:invokeinterface #83  <Method int XmlPullParser.next()>
	//    2    6:pop             
		return UriUtil.resolve(s, xmlpullparser.getText());
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokeinterface #87  <Method String XmlPullParser.getText()>
	//    6   14:invokestatic    #92  <Method String UriUtil.resolve(String, String)>
	//    7   17:areturn         
	}

	protected static long parseDateTime(XmlPullParser xmlpullparser, String s, long l)
		throws ParseException
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return l;
	//    7   13:lload_2         
	//    8   14:lreturn         
		else
			return Util.parseXsDateTime(((String) (xmlpullparser)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #106 <Method long Util.parseXsDateTime(String)>
	//   11   19:lreturn         
	}

	protected static long parseDuration(XmlPullParser xmlpullparser, String s, long l)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return l;
	//    7   13:lload_2         
	//    8   14:lreturn         
		else
			return Util.parseXsDuration(((String) (xmlpullparser)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #110 <Method long Util.parseXsDuration(String)>
	//   11   19:lreturn         
	}

	protected static float parseFrameRate(XmlPullParser xmlpullparser, float f)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "frameRate")));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:ldc1            #114 <String "frameRate">
	//    3    4:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    9:astore_0        
		float f1 = f;
	//    5   10:fload_1         
	//    6   11:fstore_2        
		if(xmlpullparser != null)
	//*   7   12:aload_0         
	//*   8   13:ifnull          67
		{
			xmlpullparser = ((XmlPullParser) (FRAME_RATE_PATTERN.matcher(((CharSequence) (xmlpullparser)))));
	//    9   16:getstatic       #31  <Field Pattern FRAME_RATE_PATTERN>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #118 <Method Matcher Pattern.matcher(CharSequence)>
	//   12   23:astore_0        
			f1 = f;
	//   13   24:fload_1         
	//   14   25:fstore_2        
			if(((Matcher) (xmlpullparser)).matches())
	//*  15   26:aload_0         
	//*  16   27:invokevirtual   #124 <Method boolean Matcher.matches()>
	//*  17   30:ifeq            67
			{
				int i = Integer.parseInt(((Matcher) (xmlpullparser)).group(1));
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:invokevirtual   #128 <Method String Matcher.group(int)>
	//   21   38:invokestatic    #134 <Method int Integer.parseInt(String)>
	//   22   41:istore_3        
				xmlpullparser = ((XmlPullParser) (((Matcher) (xmlpullparser)).group(2)));
	//   23   42:aload_0         
	//   24   43:iconst_2        
	//   25   44:invokevirtual   #128 <Method String Matcher.group(int)>
	//   26   47:astore_0        
				if(!TextUtils.isEmpty(((CharSequence) (xmlpullparser))))
	//*  27   48:aload_0         
	//*  28   49:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   52:ifne            64
					return (float)i / (float)Integer.parseInt(((String) (xmlpullparser)));
	//   30   55:iload_3         
	//   31   56:i2f             
	//   32   57:aload_0         
	//   33   58:invokestatic    #134 <Method int Integer.parseInt(String)>
	//   34   61:i2f             
	//   35   62:fdiv            
	//   36   63:freturn         
				f1 = i;
	//   37   64:iload_3         
	//   38   65:i2f             
	//   39   66:fstore_2        
			}
		}
		return f1;
	//   40   67:fload_2         
	//   41   68:freturn         
	}

	protected static int parseInt(XmlPullParser xmlpullparser, String s)
	{
		return parseInt(xmlpullparser, s, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//    4    6:ireturn         
	}

	protected static int parseInt(XmlPullParser xmlpullparser, String s, int i)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return i;
	//    7   13:iload_2         
	//    8   14:ireturn         
		else
			return Integer.parseInt(((String) (xmlpullparser)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #134 <Method int Integer.parseInt(String)>
	//   11   19:ireturn         
	}

	protected static long parseLong(XmlPullParser xmlpullparser, String s)
	{
		return parseLong(xmlpullparser, s, -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #147 <Long -1L>
	//    3    5:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//    4    8:lreturn         
	}

	protected static long parseLong(XmlPullParser xmlpullparser, String s, long l)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return l;
	//    7   13:lload_2         
	//    8   14:lreturn         
		else
			return Long.parseLong(((String) (xmlpullparser)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #154 <Method long Long.parseLong(String)>
	//   11   19:lreturn         
	}

	protected static String parseString(XmlPullParser xmlpullparser, String s, String s1)
	{
		s = xmlpullparser.getAttributeValue(((String) (null)), s);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_1        
		xmlpullparser = ((XmlPullParser) (s));
	//    5    9:aload_1         
	//    6   10:astore_0        
		if(s == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       17
			xmlpullparser = ((XmlPullParser) (s1));
	//    9   15:aload_2         
	//   10   16:astore_0        
		return ((String) (xmlpullparser));
	//   11   17:aload_0         
	//   12   18:areturn         
	}

	protected AdaptationSet buildAdaptationSet(int i, int j, List list, List list1)
	{
		return new AdaptationSet(i, j, list, list1);
	//    0    0:new             #160 <Class AdaptationSet>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #163 <Method void AdaptationSet(int, int, List, List)>
	//    7   12:areturn         
	}

	protected ContentProtection buildContentProtection(String s, UUID uuid, com.google.android.exoplayer.drm.DrmInitData.SchemeInitData schemeinitdata)
	{
		return new ContentProtection(s, uuid, schemeinitdata);
	//    0    0:new             #169 <Class ContentProtection>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #172 <Method void ContentProtection(String, UUID, com.google.android.exoplayer.drm.DrmInitData$SchemeInitData)>
	//    6   10:areturn         
	}

	protected Format buildFormat(String s, String s1, int i, int j, float f, int k, int l, 
			int i1, String s2, String s3)
	{
		return new Format(s, s1, i, j, f, k, l, i1, s2, s3);
	//    0    0:new             #176 <Class Format>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:fload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:iload           8
	//   10   17:aload           9
	//   11   19:aload           10
	//   12   21:invokespecial   #179 <Method void Format(String, String, int, int, float, int, int, int, String, String)>
	//   13   24:areturn         
	}

	protected MediaPresentationDescription buildMediaPresentationDescription(long l, long l1, long l2, boolean flag, 
			long l3, long l4, UtcTimingElement utctimingelement, String s, List list)
	{
		return new MediaPresentationDescription(l, l1, l2, flag, l3, l4, utctimingelement, s, list);
	//    0    0:new             #183 <Class MediaPresentationDescription>
	//    1    3:dup             
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:lload           5
	//    5    8:iload           7
	//    6   10:lload           8
	//    7   12:lload           10
	//    8   14:aload           12
	//    9   16:aload           13
	//   10   18:aload           14
	//   11   20:invokespecial   #186 <Method void MediaPresentationDescription(long, long, long, boolean, long, long, UtcTimingElement, String, List)>
	//   12   23:areturn         
	}

	protected Period buildPeriod(String s, long l, List list)
	{
		return new Period(s, l, list);
	//    0    0:new             #191 <Class Period>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:aload           4
	//    5    8:invokespecial   #194 <Method void Period(String, long, List)>
	//    6   11:areturn         
	}

	protected RangedUri buildRangedUri(String s, long l, long l1)
	{
		return new RangedUri(s, l, l1);
	//    0    0:new             #199 <Class RangedUri>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokespecial   #202 <Method void RangedUri(String, long, long)>
	//    6   11:areturn         
	}

	protected Representation buildRepresentation(String s, int i, Format format, SegmentBase segmentbase, String s1)
	{
		return Representation.newInstance(s, i, format, s1, segmentbase, ((String) (null)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:i2l             
	//    3    3:aload_3         
	//    4    4:aload           5
	//    5    6:aload           4
	//    6    8:aconst_null     
	//    7    9:invokestatic    #209 <Method Representation Representation.newInstance(String, long, Format, String, SegmentBase, String)>
	//    8   12:areturn         
	}

	protected SegmentBase.SegmentList buildSegmentList(RangedUri rangeduri, long l, long l1, int i, long l2, List list, List list1)
	{
		return new SegmentBase.SegmentList(rangeduri, l, l1, i, l2, list, list1);
	//    0    0:new             #213 <Class SegmentBase$SegmentList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:lload           7
	//    7   12:aload           9
	//    8   14:aload           10
	//    9   16:invokespecial   #216 <Method void SegmentBase$SegmentList(RangedUri, long, long, int, long, List, List)>
	//   10   19:areturn         
	}

	protected SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangeduri, long l, long l1, int i, long l2, List list, UrlTemplate urltemplate, UrlTemplate urltemplate1)
	{
		return new SegmentBase.SegmentTemplate(rangeduri, l, l1, i, l2, list, urltemplate, urltemplate1);
	//    0    0:new             #221 <Class SegmentBase$SegmentTemplate>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:lload           7
	//    7   12:aload           9
	//    8   14:aload           10
	//    9   16:aload           11
	//   10   18:invokespecial   #224 <Method void SegmentBase$SegmentTemplate(RangedUri, long, long, int, long, List, UrlTemplate, UrlTemplate)>
	//   11   21:areturn         
	}

	protected SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long l, long l1)
	{
		return new SegmentBase.SegmentTimelineElement(l, l1);
	//    0    0:new             #229 <Class SegmentBase$SegmentTimelineElement>
	//    1    3:dup             
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokespecial   #232 <Method void SegmentBase$SegmentTimelineElement(long, long)>
	//    5    9:areturn         
	}

	protected SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
			long l3)
	{
		return new SegmentBase.SingleSegmentBase(rangeduri, l, l1, l2, l3);
	//    0    0:new             #236 <Class SegmentBase$SingleSegmentBase>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:lload           6
	//    6   10:lload           8
	//    7   12:invokespecial   #239 <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
	//    8   15:areturn         
	}

	protected UtcTimingElement buildUtcTimingElement(String s, String s1)
	{
		return new UtcTimingElement(s, s1);
	//    0    0:new             #243 <Class UtcTimingElement>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #246 <Method void UtcTimingElement(String, String)>
	//    5    9:areturn         
	}

	protected int getContentType(Representation representation)
	{
		String s = representation.format.mimeType;
	//    0    0:aload_1         
	//    1    1:getfield        #252 <Field Format Representation.format>
	//    2    4:getfield        #255 <Field String Format.mimeType>
	//    3    7:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   4    8:aload_2         
	//*   5    9:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   12:ifeq            17
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
		if(MimeTypes.isVideo(s))
	//*   9   17:aload_2         
	//*  10   18:invokestatic    #261 <Method boolean MimeTypes.isVideo(String)>
	//*  11   21:ifeq            26
			return 0;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		if(MimeTypes.isAudio(s))
	//*  14   26:aload_2         
	//*  15   27:invokestatic    #264 <Method boolean MimeTypes.isAudio(String)>
	//*  16   30:ifeq            35
			return 1;
	//   17   33:iconst_1        
	//   18   34:ireturn         
		if(!MimeTypes.isText(s))
	//*  19   35:aload_2         
	//*  20   36:invokestatic    #267 <Method boolean MimeTypes.isText(String)>
	//*  21   39:ifne            96
		{
			if("application/ttml+xml".equals(((Object) (s))))
	//*  22   42:ldc2            #269 <String "application/ttml+xml">
	//*  23   45:aload_2         
	//*  24   46:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  25   49:ifeq            54
				return 2;
	//   26   52:iconst_2        
	//   27   53:ireturn         
			if("application/mp4".equals(((Object) (s))))
	//*  28   54:ldc2            #271 <String "application/mp4">
	//*  29   57:aload_2         
	//*  30   58:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  31   61:ifeq            94
			{
				representation = ((Representation) (representation.format.codecs));
	//   32   64:aload_1         
	//   33   65:getfield        #252 <Field Format Representation.format>
	//   34   68:getfield        #274 <Field String Format.codecs>
	//   35   71:astore_1        
				if("stpp".equals(((Object) (representation))) || "wvtt".equals(((Object) (representation))))
	//*  36   72:ldc2            #276 <String "stpp">
	//*  37   75:aload_1         
	//*  38   76:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  39   79:ifne            92
	//*  40   82:ldc2            #278 <String "wvtt">
	//*  41   85:aload_1         
	//*  42   86:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  43   89:ifeq            94
					return 2;
	//   44   92:iconst_2        
	//   45   93:ireturn         
			}
			return -1;
	//   46   94:iconst_m1       
	//   47   95:ireturn         
		} else
		{
			return 2;
	//   48   96:iconst_2        
	//   49   97:ireturn         
		}
	}

	public MediaPresentationDescription parse(String s, InputStream inputstream)
		throws IOException, ParserException
	{
		try
		{
			XmlPullParser xmlpullparser = xmlParserFactory.newPullParser();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field XmlPullParserFactory xmlParserFactory>
	//    2    4:invokevirtual   #286 <Method XmlPullParser XmlPullParserFactory.newPullParser()>
	//    3    7:astore_3        
			xmlpullparser.setInput(inputstream, ((String) (null)));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokeinterface #290 <Method void XmlPullParser.setInput(InputStream, String)>
			if(xmlpullparser.next() == 2 && "MPD".equals(((Object) (xmlpullparser.getName()))))
	//*   8   16:aload_3         
	//*   9   17:invokeinterface #83  <Method int XmlPullParser.next()>
	//*  10   22:iconst_2        
	//*  11   23:icmpne          48
	//*  12   26:ldc2            #292 <String "MPD">
	//*  13   29:aload_3         
	//*  14   30:invokeinterface #295 <Method String XmlPullParser.getName()>
	//*  15   35:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  16   38:ifeq            48
				return parseMediaPresentationDescription(xmlpullparser, s);
	//   17   41:aload_0         
	//   18   42:aload_3         
	//   19   43:aload_1         
	//   20   44:invokevirtual   #299 <Method MediaPresentationDescription parseMediaPresentationDescription(XmlPullParser, String)>
	//   21   47:areturn         
			else
				throw new ParserException("inputStream does not contain a valid media presentation description");
	//   22   48:new             #282 <Class ParserException>
	//   23   51:dup             
	//   24   52:ldc2            #301 <String "inputStream does not contain a valid media presentation description">
	//   25   55:invokespecial   #302 <Method void ParserException(String)>
	//   26   58:athrow          
		}
	//*  27   59:astore_1        
	//*  28   60:new             #282 <Class ParserException>
	//*  29   63:dup             
	//*  30   64:aload_1         
	//*  31   65:invokespecial   #305 <Method void ParserException(Throwable)>
	//*  32   68:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  33   69:astore_1        
		{
			throw new ParserException(((Throwable) (s)));
	//   34   70:new             #282 <Class ParserException>
	//   35   73:dup             
	//   36   74:aload_1         
	//   37   75:invokespecial   #305 <Method void ParserException(Throwable)>
	//   38   78:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new ParserException(((Throwable) (s)));
		}
	}

	public volatile Object parse(String s, InputStream inputstream)
		throws ParserException, IOException
	{
		return ((Object) (parse(s, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #308 <Method MediaPresentationDescription parse(String, InputStream)>
	//    4    6:areturn         
	}

	protected AdaptationSet parseAdaptationSet(XmlPullParser xmlpullparser, String s, SegmentBase segmentbase)
		throws XmlPullParserException, IOException
	{
		Object obj1 = ((Object) (xmlpullparser));
	//    0    0:aload_1         
	//    1    1:astore          15
		int k = parseInt(((XmlPullParser) (obj1)), "id", -1);
	//    2    3:aload           15
	//    3    5:ldc2            #312 <String "id">
	//    4    8:iconst_m1       
	//    5    9:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//    6   12:istore          7
		int j = parseContentType(xmlpullparser);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #316 <Method int parseContentType(XmlPullParser)>
	//   10   19:istore          6
		String s3 = null;
	//   11   21:aconst_null     
	//   12   22:astore          18
		String s4 = ((XmlPullParser) (obj1)).getAttributeValue(((String) (null)), "mimeType");
	//   13   24:aload           15
	//   14   26:aconst_null     
	//   15   27:ldc2            #317 <String "mimeType">
	//   16   30:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   17   35:astore          20
		String s5 = ((XmlPullParser) (obj1)).getAttributeValue(((String) (null)), "codecs");
	//   18   37:aload           15
	//   19   39:aconst_null     
	//   20   40:ldc2            #318 <String "codecs">
	//   21   43:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   22   48:astore          21
		int i1 = parseInt(((XmlPullParser) (obj1)), "width", -1);
	//   23   50:aload           15
	//   24   52:ldc2            #320 <String "width">
	//   25   55:iconst_m1       
	//   26   56:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   27   59:istore          10
		int j1 = parseInt(((XmlPullParser) (obj1)), "height", -1);
	//   28   61:aload           15
	//   29   63:ldc2            #322 <String "height">
	//   30   66:iconst_m1       
	//   31   67:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   32   70:istore          11
		float f = parseFrameRate(((XmlPullParser) (obj1)), -1F);
	//   33   72:aload           15
	//   34   74:ldc2            #323 <Float -1F>
	//   35   77:invokestatic    #325 <Method float parseFrameRate(XmlPullParser, float)>
	//   36   80:fstore          4
		int k1 = parseInt(((XmlPullParser) (obj1)), "audioSamplingRate", -1);
	//   37   82:aload           15
	//   38   84:ldc2            #327 <String "audioSamplingRate">
	//   39   87:iconst_m1       
	//   40   88:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   41   91:istore          12
		String s2 = ((XmlPullParser) (obj1)).getAttributeValue(((String) (null)), "lang");
	//   42   93:aload           15
	//   43   95:aconst_null     
	//   44   96:ldc2            #329 <String "lang">
	//   45   99:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   46  104:astore          14
		ContentProtectionsBuilder contentprotectionsbuilder = new ContentProtectionsBuilder();
	//   47  106:new             #9   <Class MediaPresentationDescriptionParser$ContentProtectionsBuilder>
	//   48  109:dup             
	//   49  110:invokespecial   #330 <Method void MediaPresentationDescriptionParser$ContentProtectionsBuilder()>
	//   50  113:astore          16
		ArrayList arraylist = new ArrayList();
	//   51  115:new             #332 <Class ArrayList>
	//   52  118:dup             
	//   53  119:invokespecial   #333 <Method void ArrayList()>
	//   54  122:astore          17
		String s1 = s;
	//   55  124:aload_2         
	//   56  125:astore          13
		int l = -1;
	//   57  127:iconst_m1       
	//   58  128:istore          9
		boolean flag = false;
	//   59  130:iconst_0        
	//   60  131:istore          8
		Object obj3 = ((Object) (segmentbase));
	//   61  133:aload_3         
	//   62  134:astore          19
		s = ((String) (obj1));
	//   63  136:aload           15
	//   64  138:astore_2        
		obj1 = ((Object) (contentprotectionsbuilder));
	//   65  139:aload           16
	//   66  141:astore          15
		segmentbase = ((SegmentBase) (s1));
	//   67  143:aload           13
	//   68  145:astore_3        
		do
		{
			int i;
			Object obj;
			Object obj2;
label0:
			{
				xmlpullparser.next();
	//   69  146:aload_1         
	//   70  147:invokeinterface #83  <Method int XmlPullParser.next()>
	//   71  152:pop             
				if(ParserUtil.isStartTag(((XmlPullParser) (s)), "BaseURL"))
	//*  72  153:aload_2         
	//*  73  154:ldc2            #335 <String "BaseURL">
	//*  74  157:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  75  160:ifeq            200
				{
					if(!flag)
	//*  76  163:iload           8
	//*  77  165:ifne            194
					{
						segmentbase = ((SegmentBase) (parseBaseUrl(((XmlPullParser) (s)), ((String) (segmentbase)))));
	//   78  168:aload_2         
	//   79  169:aload_3         
	//   80  170:invokestatic    #343 <Method String parseBaseUrl(XmlPullParser, String)>
	//   81  173:astore_3        
						flag = true;
	//   82  174:iconst_1        
	//   83  175:istore          8
						obj = ((Object) (s));
	//   84  177:aload_2         
	//   85  178:astore          13
						i = j;
	//   86  180:iload           6
	//   87  182:istore          5
						s = s2;
	//   88  184:aload           14
	//   89  186:astore_2        
						obj2 = obj3;
	//   90  187:aload           19
	//   91  189:astore          16
						break label0;
	//   92  191:goto            590
					}
					obj = ((Object) (s));
	//   93  194:aload_2         
	//   94  195:astore          13
				} else
	//*  95  197:goto            579
				if(ParserUtil.isStartTag(((XmlPullParser) (s)), "ContentProtection"))
	//*  96  200:aload_2         
	//*  97  201:ldc2            #345 <String "ContentProtection">
	//*  98  204:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  99  207:ifeq            235
				{
					obj = ((Object) (parseContentProtection(xmlpullparser)));
	//  100  210:aload_0         
	//  101  211:aload_1         
	//  102  212:invokevirtual   #349 <Method ContentProtection parseContentProtection(XmlPullParser)>
	//  103  215:astore          13
					if(obj != null)
	//* 104  217:aload           13
	//* 105  219:ifnull          229
						((ContentProtectionsBuilder) (obj1)).addAdaptationSetProtection(((ContentProtection) (obj)));
	//  106  222:aload           15
	//  107  224:aload           13
	//  108  226:invokevirtual   #353 <Method void MediaPresentationDescriptionParser$ContentProtectionsBuilder.addAdaptationSetProtection(ContentProtection)>
					obj = ((Object) (s));
	//  109  229:aload_2         
	//  110  230:astore          13
				} else
	//* 111  232:goto            579
				{
					if(ParserUtil.isStartTag(((XmlPullParser) (s)), "ContentComponent"))
	//* 112  235:aload_2         
	//* 113  236:ldc2            #355 <String "ContentComponent">
	//* 114  239:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 115  242:ifeq            288
					{
						s2 = checkLanguageConsistency(s2, ((XmlPullParser) (s)).getAttributeValue(s3, "lang"));
	//  116  245:aload           14
	//  117  247:aload_2         
	//  118  248:aload           18
	//  119  250:ldc2            #329 <String "lang">
	//  120  253:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//  121  258:invokestatic    #357 <Method String checkLanguageConsistency(String, String)>
	//  122  261:astore          14
						i = checkContentTypeConsistency(j, parseContentType(xmlpullparser));
	//  123  263:iload           6
	//  124  265:aload_0         
	//  125  266:aload_1         
	//  126  267:invokevirtual   #316 <Method int parseContentType(XmlPullParser)>
	//  127  270:invokestatic    #359 <Method int checkContentTypeConsistency(int, int)>
	//  128  273:istore          5
						obj = ((Object) (s));
	//  129  275:aload_2         
	//  130  276:astore          13
						s = s2;
	//  131  278:aload           14
	//  132  280:astore_2        
						obj2 = obj3;
	//  133  281:aload           19
	//  134  283:astore          16
						break label0;
	//  135  285:goto            590
					}
					if(ParserUtil.isStartTag(((XmlPullParser) (s)), "Representation"))
	//* 136  288:aload_2         
	//* 137  289:ldc2            #361 <String "Representation">
	//* 138  292:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 139  295:ifeq            368
					{
						s = ((String) (obj1));
	//  140  298:aload           15
	//  141  300:astore_2        
						obj = ((Object) (parseRepresentation(xmlpullparser, ((String) (segmentbase)), s4, s5, i1, j1, f, l, k1, s2, ((SegmentBase) (obj3)), ((ContentProtectionsBuilder) (s)))));
	//  142  301:aload_0         
	//  143  302:aload_1         
	//  144  303:aload_3         
	//  145  304:aload           20
	//  146  306:aload           21
	//  147  308:iload           10
	//  148  310:iload           11
	//  149  312:fload           4
	//  150  314:iload           9
	//  151  316:iload           12
	//  152  318:aload           14
	//  153  320:aload           19
	//  154  322:aload_2         
	//  155  323:invokevirtual   #365 <Method Representation parseRepresentation(XmlPullParser, String, String, String, int, int, float, int, int, String, SegmentBase, MediaPresentationDescriptionParser$ContentProtectionsBuilder)>
	//  156  326:astore          13
						((ContentProtectionsBuilder) (s)).endRepresentation();
	//  157  328:aload_2         
	//  158  329:invokevirtual   #368 <Method void MediaPresentationDescriptionParser$ContentProtectionsBuilder.endRepresentation()>
						i = checkContentTypeConsistency(j, getContentType(((Representation) (obj))));
	//  159  332:iload           6
	//  160  334:aload_0         
	//  161  335:aload           13
	//  162  337:invokevirtual   #370 <Method int getContentType(Representation)>
	//  163  340:invokestatic    #359 <Method int checkContentTypeConsistency(int, int)>
	//  164  343:istore          5
						((List) (arraylist)).add(obj);
	//  165  345:aload           17
	//  166  347:aload           13
	//  167  349:invokeinterface #375 <Method boolean List.add(Object)>
	//  168  354:pop             
						s = s2;
	//  169  355:aload           14
	//  170  357:astore_2        
						obj = ((Object) (xmlpullparser));
	//  171  358:aload_1         
	//  172  359:astore          13
						obj2 = obj3;
	//  173  361:aload           19
	//  174  363:astore          16
						break label0;
	//  175  365:goto            590
					}
					obj = ((Object) (s2));
	//  176  368:aload           14
	//  177  370:astore          13
					s = ((String) (segmentbase));
	//  178  372:aload_3         
	//  179  373:astore_2        
					i = j;
	//  180  374:iload           6
	//  181  376:istore          5
					obj2 = ((Object) (xmlpullparser));
	//  182  378:aload_1         
	//  183  379:astore          16
					if(ParserUtil.isStartTag(((XmlPullParser) (obj2)), "AudioChannelConfiguration"))
	//* 184  381:aload           16
	//* 185  383:ldc2            #377 <String "AudioChannelConfiguration">
	//* 186  386:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 187  389:ifeq            421
					{
						l = parseAudioChannelConfiguration(xmlpullparser);
	//  188  392:aload_0         
	//  189  393:aload_1         
	//  190  394:invokevirtual   #380 <Method int parseAudioChannelConfiguration(XmlPullParser)>
	//  191  397:istore          9
						segmentbase = ((SegmentBase) (obj));
	//  192  399:aload           13
	//  193  401:astore_3        
						s2 = s;
	//  194  402:aload_2         
	//  195  403:astore          14
						obj = obj2;
	//  196  405:aload           16
	//  197  407:astore          13
						s = ((String) (segmentbase));
	//  198  409:aload_3         
	//  199  410:astore_2        
						segmentbase = ((SegmentBase) (s2));
	//  200  411:aload           14
	//  201  413:astore_3        
						obj2 = obj3;
	//  202  414:aload           19
	//  203  416:astore          16
						break label0;
	//  204  418:goto            590
					}
					if(ParserUtil.isStartTag(((XmlPullParser) (obj2)), "SegmentBase"))
	//* 205  421:aload           16
	//* 206  423:ldc2            #382 <String "SegmentBase">
	//* 207  426:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 208  429:ifeq            467
					{
						obj3 = ((Object) (parseSegmentBase(((XmlPullParser) (obj2)), (SegmentBase.SingleSegmentBase)obj3)));
	//  209  432:aload_0         
	//  210  433:aload           16
	//  211  435:aload           19
	//  212  437:checkcast       #236 <Class SegmentBase$SingleSegmentBase>
	//  213  440:invokevirtual   #386 <Method SegmentBase$SingleSegmentBase parseSegmentBase(XmlPullParser, SegmentBase$SingleSegmentBase)>
	//  214  443:astore          19
						segmentbase = ((SegmentBase) (obj));
	//  215  445:aload           13
	//  216  447:astore_3        
						s2 = s;
	//  217  448:aload_2         
	//  218  449:astore          14
						obj = obj2;
	//  219  451:aload           16
	//  220  453:astore          13
						s = ((String) (segmentbase));
	//  221  455:aload_3         
	//  222  456:astore_2        
						segmentbase = ((SegmentBase) (s2));
	//  223  457:aload           14
	//  224  459:astore_3        
						obj2 = obj3;
	//  225  460:aload           19
	//  226  462:astore          16
						break label0;
	//  227  464:goto            590
					}
					if(ParserUtil.isStartTag(((XmlPullParser) (obj2)), "SegmentList"))
	//* 228  467:aload           16
	//* 229  469:ldc2            #388 <String "SegmentList">
	//* 230  472:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 231  475:ifeq            513
					{
						obj3 = ((Object) (parseSegmentList(((XmlPullParser) (obj2)), (SegmentBase.SegmentList)obj3)));
	//  232  478:aload_0         
	//  233  479:aload           16
	//  234  481:aload           19
	//  235  483:checkcast       #213 <Class SegmentBase$SegmentList>
	//  236  486:invokevirtual   #392 <Method SegmentBase$SegmentList parseSegmentList(XmlPullParser, SegmentBase$SegmentList)>
	//  237  489:astore          19
						segmentbase = ((SegmentBase) (obj));
	//  238  491:aload           13
	//  239  493:astore_3        
						s2 = s;
	//  240  494:aload_2         
	//  241  495:astore          14
						obj = obj2;
	//  242  497:aload           16
	//  243  499:astore          13
						s = ((String) (segmentbase));
	//  244  501:aload_3         
	//  245  502:astore_2        
						segmentbase = ((SegmentBase) (s2));
	//  246  503:aload           14
	//  247  505:astore_3        
						obj2 = obj3;
	//  248  506:aload           19
	//  249  508:astore          16
						break label0;
	//  250  510:goto            590
					}
					if(ParserUtil.isStartTag(((XmlPullParser) (obj2)), "SegmentTemplate"))
	//* 251  513:aload           16
	//* 252  515:ldc2            #394 <String "SegmentTemplate">
	//* 253  518:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 254  521:ifeq            559
					{
						obj3 = ((Object) (parseSegmentTemplate(((XmlPullParser) (obj2)), (SegmentBase.SegmentTemplate)obj3)));
	//  255  524:aload_0         
	//  256  525:aload           16
	//  257  527:aload           19
	//  258  529:checkcast       #221 <Class SegmentBase$SegmentTemplate>
	//  259  532:invokevirtual   #398 <Method SegmentBase$SegmentTemplate parseSegmentTemplate(XmlPullParser, SegmentBase$SegmentTemplate)>
	//  260  535:astore          19
						segmentbase = ((SegmentBase) (obj));
	//  261  537:aload           13
	//  262  539:astore_3        
						s2 = s;
	//  263  540:aload_2         
	//  264  541:astore          14
						obj = obj2;
	//  265  543:aload           16
	//  266  545:astore          13
						s = ((String) (segmentbase));
	//  267  547:aload_3         
	//  268  548:astore_2        
						segmentbase = ((SegmentBase) (s2));
	//  269  549:aload           14
	//  270  551:astore_3        
						obj2 = obj3;
	//  271  552:aload           19
	//  272  554:astore          16
						break label0;
	//  273  556:goto            590
					}
					obj = obj2;
	//  274  559:aload           16
	//  275  561:astore          13
					if(ParserUtil.isStartTag(xmlpullparser))
	//* 276  563:aload_1         
	//* 277  564:invokestatic    #401 <Method boolean ParserUtil.isStartTag(XmlPullParser)>
	//* 278  567:ifeq            579
					{
						parseAdaptationSetChild(xmlpullparser);
	//  279  570:aload_0         
	//  280  571:aload_1         
	//  281  572:invokevirtual   #405 <Method void parseAdaptationSetChild(XmlPullParser)>
						obj = obj2;
	//  282  575:aload           16
	//  283  577:astore          13
					}
				}
				i = j;
	//  284  579:iload           6
	//  285  581:istore          5
				s = s2;
	//  286  583:aload           14
	//  287  585:astore_2        
				obj2 = obj3;
	//  288  586:aload           19
	//  289  588:astore          16
			}
			if(ParserUtil.isEndTag(((XmlPullParser) (obj)), "AdaptationSet"))
	//* 290  590:aload           13
	//* 291  592:ldc2            #407 <String "AdaptationSet">
	//* 292  595:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//* 293  598:ifeq            617
				return buildAdaptationSet(k, i, ((List) (arraylist)), ((List) (((ContentProtectionsBuilder) (obj1)).build())));
	//  294  601:aload_0         
	//  295  602:iload           7
	//  296  604:iload           5
	//  297  606:aload           17
	//  298  608:aload           15
	//  299  610:invokevirtual   #414 <Method ArrayList MediaPresentationDescriptionParser$ContentProtectionsBuilder.build()>
	//  300  613:invokevirtual   #416 <Method AdaptationSet buildAdaptationSet(int, int, List, List)>
	//  301  616:areturn         
			j = i;
	//  302  617:iload           5
	//  303  619:istore          6
			s2 = s;
	//  304  621:aload_2         
	//  305  622:astore          14
			s = ((String) (obj));
	//  306  624:aload           13
	//  307  626:astore_2        
			obj3 = obj2;
	//  308  627:aload           16
	//  309  629:astore          19
		} while(true);
	//  310  631:goto            146
	}

	protected void parseAdaptationSetChild(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
	//    0    0:return          
	}

	protected int parseAudioChannelConfiguration(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		int i;
		if("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(((Object) (parseString(xmlpullparser, "schemeIdUri", ((String) (null)))))))
	//*   0    0:ldc2            #418 <String "urn:mpeg:dash:23003:3:audio_channel_configuration:2011">
	//*   1    3:aload_1         
	//*   2    4:ldc2            #420 <String "schemeIdUri">
	//*   3    7:aconst_null     
	//*   4    8:invokestatic    #422 <Method String parseString(XmlPullParser, String, String)>
	//*   5   11:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*   6   14:ifeq            28
			i = parseInt(xmlpullparser, "value");
	//    7   17:aload_1         
	//    8   18:ldc2            #424 <String "value">
	//    9   21:invokestatic    #426 <Method int parseInt(XmlPullParser, String)>
	//   10   24:istore_2        
		else
	//*  11   25:goto            30
			i = -1;
	//   12   28:iconst_m1       
	//   13   29:istore_2        
		do
			xmlpullparser.next();
	//   14   30:aload_1         
	//   15   31:invokeinterface #83  <Method int XmlPullParser.next()>
	//   16   36:pop             
		while(!ParserUtil.isEndTag(xmlpullparser, "AudioChannelConfiguration"));
	//   17   37:aload_1         
	//   18   38:ldc2            #377 <String "AudioChannelConfiguration">
	//   19   41:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//   20   44:ifeq            30
		return i;
	//   21   47:iload_2         
	//   22   48:ireturn         
	}

	protected ContentProtection parseContentProtection(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		String s = xmlpullparser.getAttributeValue(((String) (null)), "schemeIdUri");
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc2            #420 <String "schemeIdUri">
	//    3    5:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore          8
		UUID uuid = null;
	//    5   12:aconst_null     
	//    6   13:astore          6
		com.google.android.exoplayer.drm.DrmInitData.SchemeInitData schemeinitdata = ((com.google.android.exoplayer.drm.DrmInitData.SchemeInitData) (uuid));
	//    7   15:aload           6
	//    8   17:astore          4
		boolean flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		boolean flag1;
		com.google.android.exoplayer.drm.DrmInitData.SchemeInitData schemeinitdata1;
		UUID uuid1;
		do
		{
			xmlpullparser.next();
	//   11   21:aload_1         
	//   12   22:invokeinterface #83  <Method int XmlPullParser.next()>
	//   13   27:pop             
			flag1 = flag;
	//   14   28:iload_2         
	//   15   29:istore_3        
			uuid1 = uuid;
	//   16   30:aload           6
	//   17   32:astore          7
			schemeinitdata1 = schemeinitdata;
	//   18   34:aload           4
	//   19   36:astore          5
			if(ParserUtil.isStartTag(xmlpullparser, "cenc:pssh"))
	//*  20   38:aload_1         
	//*  21   39:ldc2            #428 <String "cenc:pssh">
	//*  22   42:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  23   45:ifeq            102
			{
				flag1 = flag;
	//   24   48:iload_2         
	//   25   49:istore_3        
				uuid1 = uuid;
	//   26   50:aload           6
	//   27   52:astore          7
				schemeinitdata1 = schemeinitdata;
	//   28   54:aload           4
	//   29   56:astore          5
				if(xmlpullparser.next() == 4)
	//*  30   58:aload_1         
	//*  31   59:invokeinterface #83  <Method int XmlPullParser.next()>
	//*  32   64:iconst_4        
	//*  33   65:icmpne          102
				{
					flag1 = true;
	//   34   68:iconst_1        
	//   35   69:istore_3        
					schemeinitdata1 = new com.google.android.exoplayer.drm.DrmInitData.SchemeInitData("video/mp4", Base64.decode(xmlpullparser.getText(), 0));
	//   36   70:new             #430 <Class com.google.android.exoplayer.drm.DrmInitData$SchemeInitData>
	//   37   73:dup             
	//   38   74:ldc2            #432 <String "video/mp4">
	//   39   77:aload_1         
	//   40   78:invokeinterface #87  <Method String XmlPullParser.getText()>
	//   41   83:iconst_0        
	//   42   84:invokestatic    #438 <Method byte[] Base64.decode(String, int)>
	//   43   87:invokespecial   #441 <Method void com.google.android.exoplayer.drm.DrmInitData$SchemeInitData(String, byte[])>
	//   44   90:astore          5
					uuid1 = PsshAtomUtil.parseUuid(schemeinitdata1.data);
	//   45   92:aload           5
	//   46   94:getfield        #445 <Field byte[] com.google.android.exoplayer.drm.DrmInitData$SchemeInitData.data>
	//   47   97:invokestatic    #451 <Method UUID PsshAtomUtil.parseUuid(byte[])>
	//   48  100:astore          7
				}
			}
			flag = flag1;
	//   49  102:iload_3         
	//   50  103:istore_2        
			uuid = uuid1;
	//   51  104:aload           7
	//   52  106:astore          6
			schemeinitdata = schemeinitdata1;
	//   53  108:aload           5
	//   54  110:astore          4
		} while(!ParserUtil.isEndTag(xmlpullparser, "ContentProtection"));
	//   55  112:aload_1         
	//   56  113:ldc2            #345 <String "ContentProtection">
	//   57  116:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//   58  119:ifeq            21
		if(flag1 && uuid1 == null)
	//*  59  122:iload_3         
	//*  60  123:ifeq            142
	//*  61  126:aload           7
	//*  62  128:ifnonnull       142
		{
			Log.w("MPDParser", "Skipped unsupported ContentProtection element");
	//   63  131:ldc1            #16  <String "MPDParser">
	//   64  133:ldc2            #453 <String "Skipped unsupported ContentProtection element">
	//   65  136:invokestatic    #459 <Method int Log.w(String, String)>
	//   66  139:pop             
			return null;
	//   67  140:aconst_null     
	//   68  141:areturn         
		} else
		{
			return buildContentProtection(s, uuid1, schemeinitdata1);
	//   69  142:aload_0         
	//   70  143:aload           8
	//   71  145:aload           7
	//   72  147:aload           5
	//   73  149:invokevirtual   #461 <Method ContentProtection buildContentProtection(String, UUID, com.google.android.exoplayer.drm.DrmInitData$SchemeInitData)>
	//   74  152:areturn         
		}
	}

	protected int parseContentType(XmlPullParser xmlpullparser)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "contentType")));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc2            #463 <String "contentType">
	//    3    5:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore_1        
		boolean flag = TextUtils.isEmpty(((CharSequence) (xmlpullparser)));
	//    5   11:aload_1         
	//    6   12:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    7   15:istore_3        
		byte byte0 = -1;
	//    8   16:iconst_m1       
	//    9   17:istore_2        
		if(flag)
	//*  10   18:iload_3         
	//*  11   19:ifeq            24
			return -1;
	//   12   22:iconst_m1       
	//   13   23:ireturn         
		if("audio".equals(((Object) (xmlpullparser))))
	//*  14   24:ldc2            #465 <String "audio">
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  17   31:ifeq            36
			return 1;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		if("video".equals(((Object) (xmlpullparser))))
	//*  20   36:ldc2            #467 <String "video">
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  23   43:ifeq            48
			return 0;
	//   24   46:iconst_0        
	//   25   47:ireturn         
		if("text".equals(((Object) (xmlpullparser))))
	//*  26   48:ldc2            #469 <String "text">
	//*  27   51:aload_1         
	//*  28   52:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  29   55:ifeq            60
			byte0 = 2;
	//   30   58:iconst_2        
	//   31   59:istore_2        
		return ((int) (byte0));
	//   32   60:iload_2         
	//   33   61:ireturn         
	}

	protected RangedUri parseInitialization(XmlPullParser xmlpullparser)
	{
		return parseRangedUrl(xmlpullparser, "sourceURL", "range");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #473 <String "sourceURL">
	//    3    5:ldc2            #475 <String "range">
	//    4    8:invokevirtual   #479 <Method RangedUri parseRangedUrl(XmlPullParser, String, String)>
	//    5   11:areturn         
	}

	protected MediaPresentationDescription parseMediaPresentationDescription(XmlPullParser xmlpullparser, String s)
		throws XmlPullParserException, IOException, ParseException
	{
		long l6 = parseDateTime(xmlpullparser, "availabilityStartTime", -1L);
	//    0    0:aload_1         
	//    1    1:ldc2            #481 <String "availabilityStartTime">
	//    2    4:ldc2w           #147 <Long -1L>
	//    3    7:invokestatic    #483 <Method long parseDateTime(XmlPullParser, String, long)>
	//    4   10:lstore          15
		long l5 = parseDuration(xmlpullparser, "mediaPresentationDuration", -1L);
	//    5   12:aload_1         
	//    6   13:ldc2            #485 <String "mediaPresentationDuration">
	//    7   16:ldc2w           #147 <Long -1L>
	//    8   19:invokestatic    #487 <Method long parseDuration(XmlPullParser, String, long)>
	//    9   22:lstore          13
		long l7 = parseDuration(xmlpullparser, "minBufferTime", -1L);
	//   10   24:aload_1         
	//   11   25:ldc2            #489 <String "minBufferTime">
	//   12   28:ldc2w           #147 <Long -1L>
	//   13   31:invokestatic    #487 <Method long parseDuration(XmlPullParser, String, long)>
	//   14   34:lstore          17
		Object obj = ((Object) (xmlpullparser.getAttributeValue(((String) (null)), "type")));
	//   15   36:aload_1         
	//   16   37:aconst_null     
	//   17   38:ldc2            #491 <String "type">
	//   18   41:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   19   46:astore          20
		boolean flag = false;
	//   20   48:iconst_0        
	//   21   49:istore_3        
		boolean flag2;
		if(obj != null)
	//*  22   50:aload           20
	//*  23   52:ifnull          68
			flag2 = ((String) (obj)).equals("dynamic");
	//   24   55:aload           20
	//   25   57:ldc2            #493 <String "dynamic">
	//   26   60:invokevirtual   #73  <Method boolean String.equals(Object)>
	//   27   63:istore          19
		else
	//*  28   65:goto            71
			flag2 = false;
	//   29   68:iconst_0        
	//   30   69:istore          19
		long l;
		if(flag2)
	//*  31   71:iload           19
	//*  32   73:ifeq            91
			l = parseDuration(xmlpullparser, "minimumUpdatePeriod", -1L);
	//   33   76:aload_1         
	//   34   77:ldc2            #495 <String "minimumUpdatePeriod">
	//   35   80:ldc2w           #147 <Long -1L>
	//   36   83:invokestatic    #487 <Method long parseDuration(XmlPullParser, String, long)>
	//   37   86:lstore          5
		else
	//*  38   88:goto            96
			l = -1L;
	//   39   91:ldc2w           #147 <Long -1L>
	//   40   94:lstore          5
		long l3;
		if(flag2)
	//*  41   96:iload           19
	//*  42   98:ifeq            116
			l3 = parseDuration(xmlpullparser, "timeShiftBufferDepth", -1L);
	//   43  101:aload_1         
	//   44  102:ldc2            #497 <String "timeShiftBufferDepth">
	//   45  105:ldc2w           #147 <Long -1L>
	//   46  108:invokestatic    #487 <Method long parseDuration(XmlPullParser, String, long)>
	//   47  111:lstore          9
		else
	//*  48  113:goto            121
			l3 = -1L;
	//   49  116:ldc2w           #147 <Long -1L>
	//   50  119:lstore          9
		ArrayList arraylist = new ArrayList();
	//   51  121:new             #332 <Class ArrayList>
	//   52  124:dup             
	//   53  125:invokespecial   #333 <Method void ArrayList()>
	//   54  128:astore          22
		long l2;
		if(flag2)
	//*  55  130:iload           19
	//*  56  132:ifeq            143
			l2 = -1L;
	//   57  135:ldc2w           #147 <Long -1L>
	//   58  138:lstore          7
		else
	//*  59  140:goto            146
			l2 = 0L;
	//   60  143:lconst_0        
	//   61  144:lstore          7
		UtcTimingElement utctimingelement = null;
	//   62  146:aconst_null     
	//   63  147:astore          21
		obj = ((Object) (utctimingelement));
	//   64  149:aload           21
	//   65  151:astore          20
		boolean flag1 = false;
	//   66  153:iconst_0        
	//   67  154:istore          4
		long l4 = l2;
	//   68  156:lload           7
	//   69  158:lstore          11
		l2 = l;
	//   70  160:lload           5
	//   71  162:lstore          7
		do
		{
			long l1;
label0:
			{
				xmlpullparser.next();
	//   72  164:aload_1         
	//   73  165:invokeinterface #83  <Method int XmlPullParser.next()>
	//   74  170:pop             
				if(ParserUtil.isStartTag(xmlpullparser, "BaseURL"))
	//*  75  171:aload_1         
	//*  76  172:ldc2            #335 <String "BaseURL">
	//*  77  175:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  78  178:ifeq            203
				{
					if(!flag)
	//*  79  181:iload_3         
	//*  80  182:ifne            200
					{
						s = parseBaseUrl(xmlpullparser, s);
	//   81  185:aload_1         
	//   82  186:aload_2         
	//   83  187:invokestatic    #343 <Method String parseBaseUrl(XmlPullParser, String)>
	//   84  190:astore_2        
						flag = true;
	//   85  191:iconst_1        
	//   86  192:istore_3        
						l1 = l4;
	//   87  193:lload           11
	//   88  195:lstore          5
						break label0;
	//   89  197:goto            411
					}
				} else
	//*  90  200:goto            407
				{
					if(ParserUtil.isStartTag(xmlpullparser, "UTCTiming"))
	//*  91  203:aload_1         
	//*  92  204:ldc2            #499 <String "UTCTiming">
	//*  93  207:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  94  210:ifeq            227
					{
						utctimingelement = parseUtcTiming(xmlpullparser);
	//   95  213:aload_0         
	//   96  214:aload_1         
	//   97  215:invokevirtual   #503 <Method UtcTimingElement parseUtcTiming(XmlPullParser)>
	//   98  218:astore          21
						l1 = l4;
	//   99  220:lload           11
	//  100  222:lstore          5
						break label0;
	//  101  224:goto            411
					}
					if(ParserUtil.isStartTag(xmlpullparser, "Location"))
	//* 102  227:aload_1         
	//* 103  228:ldc2            #505 <String "Location">
	//* 104  231:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 105  234:ifeq            252
					{
						obj = ((Object) (xmlpullparser.nextText()));
	//  106  237:aload_1         
	//  107  238:invokeinterface #508 <Method String XmlPullParser.nextText()>
	//  108  243:astore          20
						l1 = l4;
	//  109  245:lload           11
	//  110  247:lstore          5
						break label0;
	//  111  249:goto            411
					}
					if(ParserUtil.isStartTag(xmlpullparser, "Period") && !flag1)
	//* 112  252:aload_1         
	//* 113  253:ldc2            #510 <String "Period">
	//* 114  256:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 115  259:ifeq            407
	//* 116  262:iload           4
	//* 117  264:ifne            407
					{
						Pair pair = parsePeriod(xmlpullparser, s, l4);
	//  118  267:aload_0         
	//  119  268:aload_1         
	//  120  269:aload_2         
	//  121  270:lload           11
	//  122  272:invokevirtual   #514 <Method Pair parsePeriod(XmlPullParser, String, long)>
	//  123  275:astore          23
						Period period = (Period)pair.first;
	//  124  277:aload           23
	//  125  279:getfield        #520 <Field Object Pair.first>
	//  126  282:checkcast       #191 <Class Period>
	//  127  285:astore          24
						if(period.startMs == -1L)
	//* 128  287:aload           24
	//* 129  289:getfield        #524 <Field long Period.startMs>
	//* 130  292:ldc2w           #147 <Long -1L>
	//* 131  295:lcmp            
	//* 132  296:ifne            354
						{
							if(flag2)
	//* 133  299:iload           19
	//* 134  301:ifeq            314
							{
								flag1 = true;
	//  135  304:iconst_1        
	//  136  305:istore          4
								l1 = l4;
	//  137  307:lload           11
	//  138  309:lstore          5
							} else
	//* 139  311:goto            411
							{
								xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  140  314:new             #526 <Class StringBuilder>
	//  141  317:dup             
	//  142  318:invokespecial   #527 <Method void StringBuilder()>
	//  143  321:astore_1        
								((StringBuilder) (xmlpullparser)).append("Unable to determine start of period ");
	//  144  322:aload_1         
	//  145  323:ldc2            #529 <String "Unable to determine start of period ">
	//  146  326:invokevirtual   #533 <Method StringBuilder StringBuilder.append(String)>
	//  147  329:pop             
								((StringBuilder) (xmlpullparser)).append(((List) (arraylist)).size());
	//  148  330:aload_1         
	//  149  331:aload           22
	//  150  333:invokeinterface #536 <Method int List.size()>
	//  151  338:invokevirtual   #539 <Method StringBuilder StringBuilder.append(int)>
	//  152  341:pop             
								throw new ParserException(((StringBuilder) (xmlpullparser)).toString());
	//  153  342:new             #282 <Class ParserException>
	//  154  345:dup             
	//  155  346:aload_1         
	//  156  347:invokevirtual   #542 <Method String StringBuilder.toString()>
	//  157  350:invokespecial   #302 <Method void ParserException(String)>
	//  158  353:athrow          
							}
						} else
						{
							l1 = ((Long)pair.second).longValue();
	//  159  354:aload           23
	//  160  356:getfield        #545 <Field Object Pair.second>
	//  161  359:checkcast       #152 <Class Long>
	//  162  362:invokevirtual   #549 <Method long Long.longValue()>
	//  163  365:lstore          5
							if(l1 == -1L)
	//* 164  367:lload           5
	//* 165  369:ldc2w           #147 <Long -1L>
	//* 166  372:lcmp            
	//* 167  373:ifne            384
								l1 = -1L;
	//  168  376:ldc2w           #147 <Long -1L>
	//  169  379:lstore          5
							else
	//* 170  381:goto            394
								l1 += period.startMs;
	//  171  384:lload           5
	//  172  386:aload           24
	//  173  388:getfield        #524 <Field long Period.startMs>
	//  174  391:ladd            
	//  175  392:lstore          5
							((List) (arraylist)).add(((Object) (period)));
	//  176  394:aload           22
	//  177  396:aload           24
	//  178  398:invokeinterface #375 <Method boolean List.add(Object)>
	//  179  403:pop             
						}
						break label0;
	//  180  404:goto            411
					}
				}
				l1 = l4;
	//  181  407:lload           11
	//  182  409:lstore          5
			}
			if(ParserUtil.isEndTag(xmlpullparser, "MPD"))
	//* 183  411:aload_1         
	//* 184  412:ldc2            #292 <String "MPD">
	//* 185  415:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//* 186  418:ifeq            517
			{
				l4 = l5;
	//  187  421:lload           13
	//  188  423:lstore          11
				if(l5 == -1L)
	//* 189  425:lload           13
	//* 190  427:ldc2w           #147 <Long -1L>
	//* 191  430:lcmp            
	//* 192  431:ifne            473
					if(l1 != -1L)
	//* 193  434:lload           5
	//* 194  436:ldc2w           #147 <Long -1L>
	//* 195  439:lcmp            
	//* 196  440:ifeq            450
						l4 = l1;
	//  197  443:lload           5
	//  198  445:lstore          11
					else
	//* 199  447:goto            473
					if(flag2)
	//* 200  450:iload           19
	//* 201  452:ifeq            462
						l4 = l5;
	//  202  455:lload           13
	//  203  457:lstore          11
					else
	//* 204  459:goto            473
						throw new ParserException("Unable to determine duration of static manifest.");
	//  205  462:new             #282 <Class ParserException>
	//  206  465:dup             
	//  207  466:ldc2            #551 <String "Unable to determine duration of static manifest.">
	//  208  469:invokespecial   #302 <Method void ParserException(String)>
	//  209  472:athrow          
				if(!((List) (arraylist)).isEmpty())
	//* 210  473:aload           22
	//* 211  475:invokeinterface #553 <Method boolean List.isEmpty()>
	//* 212  480:ifne            506
					return buildMediaPresentationDescription(l6, l4, l7, flag2, l2, l3, utctimingelement, ((String) (obj)), ((List) (arraylist)));
	//  213  483:aload_0         
	//  214  484:lload           15
	//  215  486:lload           11
	//  216  488:lload           17
	//  217  490:iload           19
	//  218  492:lload           7
	//  219  494:lload           9
	//  220  496:aload           21
	//  221  498:aload           20
	//  222  500:aload           22
	//  223  502:invokevirtual   #555 <Method MediaPresentationDescription buildMediaPresentationDescription(long, long, long, boolean, long, long, UtcTimingElement, String, List)>
	//  224  505:areturn         
				else
					throw new ParserException("No periods found.");
	//  225  506:new             #282 <Class ParserException>
	//  226  509:dup             
	//  227  510:ldc2            #557 <String "No periods found.">
	//  228  513:invokespecial   #302 <Method void ParserException(String)>
	//  229  516:athrow          
			}
			l4 = l1;
	//  230  517:lload           5
	//  231  519:lstore          11
		} while(true);
	//  232  521:goto            164
	}

	protected Pair parsePeriod(XmlPullParser xmlpullparser, String s, long l)
		throws XmlPullParserException, IOException
	{
		String s3 = xmlpullparser.getAttributeValue(((String) (null)), "id");
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc2            #312 <String "id">
	//    3    5:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore          12
		l = parseDuration(xmlpullparser, "start", l);
	//    5   12:aload_1         
	//    6   13:ldc2            #559 <String "start">
	//    7   16:lload_3         
	//    8   17:invokestatic    #487 <Method long parseDuration(XmlPullParser, String, long)>
	//    9   20:lstore_3        
		long l1 = parseDuration(xmlpullparser, "duration", -1L);
	//   10   21:aload_1         
	//   11   22:ldc2            #561 <String "duration">
	//   12   25:ldc2w           #147 <Long -1L>
	//   13   28:invokestatic    #487 <Method long parseDuration(XmlPullParser, String, long)>
	//   14   31:lstore          7
		ArrayList arraylist = new ArrayList();
	//   15   33:new             #332 <Class ArrayList>
	//   16   36:dup             
	//   17   37:invokespecial   #333 <Method void ArrayList()>
	//   18   40:astore          13
		boolean flag = false;
	//   19   42:iconst_0        
	//   20   43:istore          5
		Object obj = null;
	//   21   45:aconst_null     
	//   22   46:astore          10
		String s1 = s;
	//   23   48:aload_2         
	//   24   49:astore          9
		do
		{
			xmlpullparser.next();
	//   25   51:aload_1         
	//   26   52:invokeinterface #83  <Method int XmlPullParser.next()>
	//   27   57:pop             
			boolean flag1;
			String s2;
			if(ParserUtil.isStartTag(xmlpullparser, "BaseURL"))
	//*  28   58:aload_1         
	//*  29   59:ldc2            #335 <String "BaseURL">
	//*  30   62:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  31   65:ifeq            101
			{
				flag1 = flag;
	//   32   68:iload           5
	//   33   70:istore          6
				s = ((String) (obj));
	//   34   72:aload           10
	//   35   74:astore_2        
				s2 = s1;
	//   36   75:aload           9
	//   37   77:astore          11
				if(!flag)
	//*  38   79:iload           5
	//*  39   81:ifne            234
				{
					s2 = parseBaseUrl(xmlpullparser, s1);
	//   40   84:aload_1         
	//   41   85:aload           9
	//   42   87:invokestatic    #343 <Method String parseBaseUrl(XmlPullParser, String)>
	//   43   90:astore          11
					flag1 = true;
	//   44   92:iconst_1        
	//   45   93:istore          6
					s = ((String) (obj));
	//   46   95:aload           10
	//   47   97:astore_2        
				}
			} else
	//*  48   98:goto            234
			if(ParserUtil.isStartTag(xmlpullparser, "AdaptationSet"))
	//*  49  101:aload_1         
	//*  50  102:ldc2            #407 <String "AdaptationSet">
	//*  51  105:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  52  108:ifeq            142
			{
				((List) (arraylist)).add(((Object) (parseAdaptationSet(xmlpullparser, s1, ((SegmentBase) (obj))))));
	//   53  111:aload           13
	//   54  113:aload_0         
	//   55  114:aload_1         
	//   56  115:aload           9
	//   57  117:aload           10
	//   58  119:invokevirtual   #563 <Method AdaptationSet parseAdaptationSet(XmlPullParser, String, SegmentBase)>
	//   59  122:invokeinterface #375 <Method boolean List.add(Object)>
	//   60  127:pop             
				flag1 = flag;
	//   61  128:iload           5
	//   62  130:istore          6
				s = ((String) (obj));
	//   63  132:aload           10
	//   64  134:astore_2        
				s2 = s1;
	//   65  135:aload           9
	//   66  137:astore          11
			} else
	//*  67  139:goto            234
			if(ParserUtil.isStartTag(xmlpullparser, "SegmentBase"))
	//*  68  142:aload_1         
	//*  69  143:ldc2            #382 <String "SegmentBase">
	//*  70  146:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  71  149:ifeq            170
			{
				s = ((String) (parseSegmentBase(xmlpullparser, ((SegmentBase.SingleSegmentBase) (null)))));
	//   72  152:aload_0         
	//   73  153:aload_1         
	//   74  154:aconst_null     
	//   75  155:invokevirtual   #386 <Method SegmentBase$SingleSegmentBase parseSegmentBase(XmlPullParser, SegmentBase$SingleSegmentBase)>
	//   76  158:astore_2        
				flag1 = flag;
	//   77  159:iload           5
	//   78  161:istore          6
				s2 = s1;
	//   79  163:aload           9
	//   80  165:astore          11
			} else
	//*  81  167:goto            234
			if(ParserUtil.isStartTag(xmlpullparser, "SegmentList"))
	//*  82  170:aload_1         
	//*  83  171:ldc2            #388 <String "SegmentList">
	//*  84  174:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  85  177:ifeq            198
			{
				s = ((String) (parseSegmentList(xmlpullparser, ((SegmentBase.SegmentList) (null)))));
	//   86  180:aload_0         
	//   87  181:aload_1         
	//   88  182:aconst_null     
	//   89  183:invokevirtual   #392 <Method SegmentBase$SegmentList parseSegmentList(XmlPullParser, SegmentBase$SegmentList)>
	//   90  186:astore_2        
				flag1 = flag;
	//   91  187:iload           5
	//   92  189:istore          6
				s2 = s1;
	//   93  191:aload           9
	//   94  193:astore          11
			} else
	//*  95  195:goto            234
			{
				flag1 = flag;
	//   96  198:iload           5
	//   97  200:istore          6
				s = ((String) (obj));
	//   98  202:aload           10
	//   99  204:astore_2        
				s2 = s1;
	//  100  205:aload           9
	//  101  207:astore          11
				if(ParserUtil.isStartTag(xmlpullparser, "SegmentTemplate"))
	//* 102  209:aload_1         
	//* 103  210:ldc2            #394 <String "SegmentTemplate">
	//* 104  213:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 105  216:ifeq            234
				{
					s = ((String) (parseSegmentTemplate(xmlpullparser, ((SegmentBase.SegmentTemplate) (null)))));
	//  106  219:aload_0         
	//  107  220:aload_1         
	//  108  221:aconst_null     
	//  109  222:invokevirtual   #398 <Method SegmentBase$SegmentTemplate parseSegmentTemplate(XmlPullParser, SegmentBase$SegmentTemplate)>
	//  110  225:astore_2        
					s2 = s1;
	//  111  226:aload           9
	//  112  228:astore          11
					flag1 = flag;
	//  113  230:iload           5
	//  114  232:istore          6
				}
			}
			flag = flag1;
	//  115  234:iload           6
	//  116  236:istore          5
			obj = ((Object) (s));
	//  117  238:aload_2         
	//  118  239:astore          10
			s1 = s2;
	//  119  241:aload           11
	//  120  243:astore          9
		} while(!ParserUtil.isEndTag(xmlpullparser, "Period"));
	//  121  245:aload_1         
	//  122  246:ldc2            #510 <String "Period">
	//  123  249:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//  124  252:ifeq            51
		return Pair.create(((Object) (buildPeriod(s3, l, ((List) (arraylist))))), ((Object) (Long.valueOf(l1))));
	//  125  255:aload_0         
	//  126  256:aload           12
	//  127  258:lload_3         
	//  128  259:aload           13
	//  129  261:invokevirtual   #565 <Method Period buildPeriod(String, long, List)>
	//  130  264:lload           7
	//  131  266:invokestatic    #569 <Method Long Long.valueOf(long)>
	//  132  269:invokestatic    #573 <Method Pair Pair.create(Object, Object)>
	//  133  272:areturn         
	}

	protected RangedUri parseRangedUrl(XmlPullParser xmlpullparser, String s, String s1)
	{
		s = xmlpullparser.getAttributeValue(((String) (null)), s);
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aload_2         
	//    3    3:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_2        
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s1)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:aload_3         
	//    8   12:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    9   17:astore_1        
		long l;
		long l1;
		if(xmlpullparser != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          68
		{
			xmlpullparser = ((XmlPullParser) (((String) (xmlpullparser)).split("-")));
	//   12   22:aload_1         
	//   13   23:ldc2            #576 <String "-">
	//   14   26:invokevirtual   #580 <Method String[] String.split(String)>
	//   15   29:astore_1        
			l = Long.parseLong(((String) (xmlpullparser[0])));
	//   16   30:aload_1         
	//   17   31:iconst_0        
	//   18   32:aaload          
	//   19   33:invokestatic    #154 <Method long Long.parseLong(String)>
	//   20   36:lstore          4
			if(xmlpullparser.length == 2)
	//*  21   38:aload_1         
	//*  22   39:arraylength     
	//*  23   40:iconst_2        
	//*  24   41:icmpne          60
				l1 = (Long.parseLong(((String) (xmlpullparser[1]))) - l) + 1L;
	//   25   44:aload_1         
	//   26   45:iconst_1        
	//   27   46:aaload          
	//   28   47:invokestatic    #154 <Method long Long.parseLong(String)>
	//   29   50:lload           4
	//   30   52:lsub            
	//   31   53:lconst_1        
	//   32   54:ladd            
	//   33   55:lstore          6
			else
	//*  34   57:goto            76
				l1 = -1L;
	//   35   60:ldc2w           #147 <Long -1L>
	//   36   63:lstore          6
		} else
	//*  37   65:goto            76
		{
			l1 = -1L;
	//   38   68:ldc2w           #147 <Long -1L>
	//   39   71:lstore          6
			l = 0L;
	//   40   73:lconst_0        
	//   41   74:lstore          4
		}
		return buildRangedUri(s, l, l1);
	//   42   76:aload_0         
	//   43   77:aload_2         
	//   44   78:lload           4
	//   45   80:lload           6
	//   46   82:invokevirtual   #582 <Method RangedUri buildRangedUri(String, long, long)>
	//   47   85:areturn         
	}

	protected Representation parseRepresentation(XmlPullParser xmlpullparser, String s, String s1, String s2, int i, int j, float f, 
			int k, int l, String s3, SegmentBase segmentbase, ContentProtectionsBuilder contentprotectionsbuilder)
		throws XmlPullParserException, IOException
	{
		String s4 = xmlpullparser.getAttributeValue(((String) (null)), "id");
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc2            #312 <String "id">
	//    3    5:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore          16
		int i1 = parseInt(xmlpullparser, "bandwidth");
	//    5   12:aload_1         
	//    6   13:ldc2            #584 <String "bandwidth">
	//    7   16:invokestatic    #426 <Method int parseInt(XmlPullParser, String)>
	//    8   19:istore          13
		String s5 = parseString(xmlpullparser, "mimeType", s1);
	//    9   21:aload_1         
	//   10   22:ldc2            #317 <String "mimeType">
	//   11   25:aload_3         
	//   12   26:invokestatic    #422 <Method String parseString(XmlPullParser, String, String)>
	//   13   29:astore          17
		String s6 = parseString(xmlpullparser, "codecs", s2);
	//   14   31:aload_1         
	//   15   32:ldc2            #318 <String "codecs">
	//   16   35:aload           4
	//   17   37:invokestatic    #422 <Method String parseString(XmlPullParser, String, String)>
	//   18   40:astore          18
		int j1 = parseInt(xmlpullparser, "width", i);
	//   19   42:aload_1         
	//   20   43:ldc2            #320 <String "width">
	//   21   46:iload           5
	//   22   48:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   23   51:istore          14
		int k1 = parseInt(xmlpullparser, "height", j);
	//   24   53:aload_1         
	//   25   54:ldc2            #322 <String "height">
	//   26   57:iload           6
	//   27   59:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   28   62:istore          15
		f = parseFrameRate(xmlpullparser, f);
	//   29   64:aload_1         
	//   30   65:fload           7
	//   31   67:invokestatic    #325 <Method float parseFrameRate(XmlPullParser, float)>
	//   32   70:fstore          7
		l = parseInt(xmlpullparser, "audioSamplingRate", l);
	//   33   72:aload_1         
	//   34   73:ldc2            #327 <String "audioSamplingRate">
	//   35   76:iload           9
	//   36   78:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   37   81:istore          9
		j = 0;
	//   38   83:iconst_0        
	//   39   84:istore          6
		i = k;
	//   40   86:iload           8
	//   41   88:istore          5
		s1 = ((String) (segmentbase));
	//   42   90:aload           11
	//   43   92:astore_3        
		do
		{
label0:
			{
				xmlpullparser.next();
	//   44   93:aload_1         
	//   45   94:invokeinterface #83  <Method int XmlPullParser.next()>
	//   46   99:pop             
				if(ParserUtil.isStartTag(xmlpullparser, "BaseURL"))
	//*  47  100:aload_1         
	//*  48  101:ldc2            #335 <String "BaseURL">
	//*  49  104:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  50  107:ifeq            136
				{
					if(j == 0)
	//*  51  110:iload           6
	//*  52  112:ifne            133
					{
						s2 = parseBaseUrl(xmlpullparser, s);
	//   53  115:aload_1         
	//   54  116:aload_2         
	//   55  117:invokestatic    #343 <Method String parseBaseUrl(XmlPullParser, String)>
	//   56  120:astore          4
						j = 1;
	//   57  122:iconst_1        
	//   58  123:istore          6
						s = s1;
	//   59  125:aload_3         
	//   60  126:astore_2        
						s1 = s2;
	//   61  127:aload           4
	//   62  129:astore_3        
						break label0;
	//   63  130:goto            294
					}
				} else
	//*  64  133:goto            286
				{
					if(ParserUtil.isStartTag(xmlpullparser, "AudioChannelConfiguration"))
	//*  65  136:aload_1         
	//*  66  137:ldc2            #377 <String "AudioChannelConfiguration">
	//*  67  140:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  68  143:ifeq            164
					{
						i = parseAudioChannelConfiguration(xmlpullparser);
	//   69  146:aload_0         
	//   70  147:aload_1         
	//   71  148:invokevirtual   #380 <Method int parseAudioChannelConfiguration(XmlPullParser)>
	//   72  151:istore          5
						s2 = s1;
	//   73  153:aload_3         
	//   74  154:astore          4
						s1 = s;
	//   75  156:aload_2         
	//   76  157:astore_3        
						s = s2;
	//   77  158:aload           4
	//   78  160:astore_2        
						break label0;
	//   79  161:goto            294
					}
					if(ParserUtil.isStartTag(xmlpullparser, "SegmentBase"))
	//*  80  164:aload_1         
	//*  81  165:ldc2            #382 <String "SegmentBase">
	//*  82  168:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  83  171:ifeq            193
					{
						s2 = ((String) (parseSegmentBase(xmlpullparser, (SegmentBase.SingleSegmentBase)s1)));
	//   84  174:aload_0         
	//   85  175:aload_1         
	//   86  176:aload_3         
	//   87  177:checkcast       #236 <Class SegmentBase$SingleSegmentBase>
	//   88  180:invokevirtual   #386 <Method SegmentBase$SingleSegmentBase parseSegmentBase(XmlPullParser, SegmentBase$SingleSegmentBase)>
	//   89  183:astore          4
						s1 = s;
	//   90  185:aload_2         
	//   91  186:astore_3        
						s = s2;
	//   92  187:aload           4
	//   93  189:astore_2        
						break label0;
	//   94  190:goto            294
					}
					if(ParserUtil.isStartTag(xmlpullparser, "SegmentList"))
	//*  95  193:aload_1         
	//*  96  194:ldc2            #388 <String "SegmentList">
	//*  97  197:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  98  200:ifeq            222
					{
						s2 = ((String) (parseSegmentList(xmlpullparser, (SegmentBase.SegmentList)s1)));
	//   99  203:aload_0         
	//  100  204:aload_1         
	//  101  205:aload_3         
	//  102  206:checkcast       #213 <Class SegmentBase$SegmentList>
	//  103  209:invokevirtual   #392 <Method SegmentBase$SegmentList parseSegmentList(XmlPullParser, SegmentBase$SegmentList)>
	//  104  212:astore          4
						s1 = s;
	//  105  214:aload_2         
	//  106  215:astore_3        
						s = s2;
	//  107  216:aload           4
	//  108  218:astore_2        
						break label0;
	//  109  219:goto            294
					}
					if(ParserUtil.isStartTag(xmlpullparser, "SegmentTemplate"))
	//* 110  222:aload_1         
	//* 111  223:ldc2            #394 <String "SegmentTemplate">
	//* 112  226:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 113  229:ifeq            251
					{
						s2 = ((String) (parseSegmentTemplate(xmlpullparser, (SegmentBase.SegmentTemplate)s1)));
	//  114  232:aload_0         
	//  115  233:aload_1         
	//  116  234:aload_3         
	//  117  235:checkcast       #221 <Class SegmentBase$SegmentTemplate>
	//  118  238:invokevirtual   #398 <Method SegmentBase$SegmentTemplate parseSegmentTemplate(XmlPullParser, SegmentBase$SegmentTemplate)>
	//  119  241:astore          4
						s1 = s;
	//  120  243:aload_2         
	//  121  244:astore_3        
						s = s2;
	//  122  245:aload           4
	//  123  247:astore_2        
						break label0;
	//  124  248:goto            294
					}
					if(ParserUtil.isStartTag(xmlpullparser, "ContentProtection"))
	//* 125  251:aload_1         
	//* 126  252:ldc2            #345 <String "ContentProtection">
	//* 127  255:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 128  258:ifeq            286
					{
						s2 = ((String) (parseContentProtection(xmlpullparser)));
	//  129  261:aload_0         
	//  130  262:aload_1         
	//  131  263:invokevirtual   #349 <Method ContentProtection parseContentProtection(XmlPullParser)>
	//  132  266:astore          4
						if(s2 != null)
	//* 133  268:aload           4
	//* 134  270:ifnull          283
							contentprotectionsbuilder.addAdaptationSetProtection(((ContentProtection) (s2)));
	//  135  273:aload           12
	//  136  275:aload           4
	//  137  277:invokevirtual   #353 <Method void MediaPresentationDescriptionParser$ContentProtectionsBuilder.addAdaptationSetProtection(ContentProtection)>
					}
				}
	//* 138  280:goto            286
	//* 139  283:goto            286
				s2 = s;
	//  140  286:aload_2         
	//  141  287:astore          4
				s = s1;
	//  142  289:aload_3         
	//  143  290:astore_2        
				s1 = s2;
	//  144  291:aload           4
	//  145  293:astore_3        
			}
			if(ParserUtil.isEndTag(xmlpullparser, "Representation"))
	//* 146  294:aload_1         
	//* 147  295:ldc2            #361 <String "Representation">
	//* 148  298:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//* 149  301:ifeq            361
			{
				xmlpullparser = ((XmlPullParser) (buildFormat(s4, s5, j1, k1, f, i, l, i1, s3, s6)));
	//  150  304:aload_0         
	//  151  305:aload           16
	//  152  307:aload           17
	//  153  309:iload           14
	//  154  311:iload           15
	//  155  313:fload           7
	//  156  315:iload           5
	//  157  317:iload           9
	//  158  319:iload           13
	//  159  321:aload           10
	//  160  323:aload           18
	//  161  325:invokevirtual   #586 <Method Format buildFormat(String, String, int, int, float, int, int, int, String, String)>
	//  162  328:astore_1        
				s2 = contentId;
	//  163  329:aload_0         
	//  164  330:getfield        #42  <Field String contentId>
	//  165  333:astore          4
				if(s == null)
	//* 166  335:aload_2         
	//* 167  336:ifnull          342
	//* 168  339:goto            350
					s = ((String) (new SegmentBase.SingleSegmentBase()));
	//  169  342:new             #236 <Class SegmentBase$SingleSegmentBase>
	//  170  345:dup             
	//  171  346:invokespecial   #587 <Method void SegmentBase$SingleSegmentBase()>
	//  172  349:astore_2        
				return buildRepresentation(s2, -1, ((Format) (xmlpullparser)), ((SegmentBase) (s)), s1);
	//  173  350:aload_0         
	//  174  351:aload           4
	//  175  353:iconst_m1       
	//  176  354:aload_1         
	//  177  355:aload_2         
	//  178  356:aload_3         
	//  179  357:invokevirtual   #589 <Method Representation buildRepresentation(String, int, Format, SegmentBase, String)>
	//  180  360:areturn         
			}
			s2 = s;
	//  181  361:aload_2         
	//  182  362:astore          4
			s = s1;
	//  183  364:aload_3         
	//  184  365:astore_2        
			s1 = s2;
	//  185  366:aload           4
	//  186  368:astore_3        
		} while(true);
	//  187  369:goto            93
	}

	protected SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlpullparser, SegmentBase.SingleSegmentBase singlesegmentbase)
		throws XmlPullParserException, IOException
	{
		long l;
		if(singlesegmentbase != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			l = singlesegmentbase.timescale;
	//    2    4:aload_2         
	//    3    5:getfield        #592 <Field long SegmentBase$SingleSegmentBase.timescale>
	//    4    8:lstore_3        
		else
	//*   5    9:goto            14
			l = 1L;
	//    6   12:lconst_1        
	//    7   13:lstore_3        
		long l2 = parseLong(xmlpullparser, "timescale", l);
	//    8   14:aload_1         
	//    9   15:ldc2            #593 <String "timescale">
	//   10   18:lload_3         
	//   11   19:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   12   22:lstore          7
		long l1 = 0L;
	//   13   24:lconst_0        
	//   14   25:lstore          5
		if(singlesegmentbase != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          39
			l = singlesegmentbase.presentationTimeOffset;
	//   17   31:aload_2         
	//   18   32:getfield        #596 <Field long SegmentBase$SingleSegmentBase.presentationTimeOffset>
	//   19   35:lstore_3        
		else
	//*  20   36:goto            41
			l = 0L;
	//   21   39:lconst_0        
	//   22   40:lstore_3        
		long l3 = parseLong(xmlpullparser, "presentationTimeOffset", l);
	//   23   41:aload_1         
	//   24   42:ldc2            #597 <String "presentationTimeOffset">
	//   25   45:lload_3         
	//   26   46:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   27   49:lstore          9
		l = l1;
	//   28   51:lload           5
	//   29   53:lstore_3        
		if(singlesegmentbase != null)
	//*  30   54:aload_2         
	//*  31   55:ifnull          63
			l = singlesegmentbase.indexStart;
	//   32   58:aload_2         
	//   33   59:getfield        #600 <Field long SegmentBase$SingleSegmentBase.indexStart>
	//   34   62:lstore_3        
		if(singlesegmentbase != null)
	//*  35   63:aload_2         
	//*  36   64:ifnull          76
			l1 = singlesegmentbase.indexLength;
	//   37   67:aload_2         
	//   38   68:getfield        #603 <Field long SegmentBase$SingleSegmentBase.indexLength>
	//   39   71:lstore          5
		else
	//*  40   73:goto            81
			l1 = -1L;
	//   41   76:ldc2w           #147 <Long -1L>
	//   42   79:lstore          5
		Object obj = null;
	//   43   81:aconst_null     
	//   44   82:astore          11
		String s = xmlpullparser.getAttributeValue(((String) (null)), "indexRange");
	//   45   84:aload_1         
	//   46   85:aconst_null     
	//   47   86:ldc2            #605 <String "indexRange">
	//   48   89:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   49   94:astore          12
		if(s != null)
	//*  50   96:aload           12
	//*  51   98:ifnull          135
		{
			String as[] = s.split("-");
	//   52  101:aload           12
	//   53  103:ldc2            #576 <String "-">
	//   54  106:invokevirtual   #580 <Method String[] String.split(String)>
	//   55  109:astore          12
			l = Long.parseLong(as[0]);
	//   56  111:aload           12
	//   57  113:iconst_0        
	//   58  114:aaload          
	//   59  115:invokestatic    #154 <Method long Long.parseLong(String)>
	//   60  118:lstore_3        
			l1 = (Long.parseLong(as[1]) - l) + 1L;
	//   61  119:aload           12
	//   62  121:iconst_1        
	//   63  122:aaload          
	//   64  123:invokestatic    #154 <Method long Long.parseLong(String)>
	//   65  126:lload_3         
	//   66  127:lsub            
	//   67  128:lconst_1        
	//   68  129:ladd            
	//   69  130:lstore          5
		}
	//*  70  132:goto            135
		if(singlesegmentbase != null)
	//*  71  135:aload_2         
	//*  72  136:ifnull          145
			obj = ((Object) (singlesegmentbase.initialization));
	//   73  139:aload_2         
	//   74  140:getfield        #609 <Field RangedUri SegmentBase$SingleSegmentBase.initialization>
	//   75  143:astore          11
		do
		{
			xmlpullparser.next();
	//   76  145:aload_1         
	//   77  146:invokeinterface #83  <Method int XmlPullParser.next()>
	//   78  151:pop             
			singlesegmentbase = ((SegmentBase.SingleSegmentBase) (obj));
	//   79  152:aload           11
	//   80  154:astore_2        
			if(ParserUtil.isStartTag(xmlpullparser, "Initialization"))
	//*  81  155:aload_1         
	//*  82  156:ldc2            #611 <String "Initialization">
	//*  83  159:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  84  162:ifeq            171
				singlesegmentbase = ((SegmentBase.SingleSegmentBase) (parseInitialization(xmlpullparser)));
	//   85  165:aload_0         
	//   86  166:aload_1         
	//   87  167:invokevirtual   #613 <Method RangedUri parseInitialization(XmlPullParser)>
	//   88  170:astore_2        
			obj = ((Object) (singlesegmentbase));
	//   89  171:aload_2         
	//   90  172:astore          11
		} while(!ParserUtil.isEndTag(xmlpullparser, "SegmentBase"));
	//   91  174:aload_1         
	//   92  175:ldc2            #382 <String "SegmentBase">
	//   93  178:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//   94  181:ifeq            145
		return buildSingleSegmentBase(((RangedUri) (singlesegmentbase)), l2, l3, l, l1);
	//   95  184:aload_0         
	//   96  185:aload_2         
	//   97  186:lload           7
	//   98  188:lload           9
	//   99  190:lload_3         
	//  100  191:lload           5
	//  101  193:invokevirtual   #615 <Method SegmentBase$SingleSegmentBase buildSingleSegmentBase(RangedUri, long, long, long, long)>
	//  102  196:areturn         
	}

	protected SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlpullparser, SegmentBase.SegmentList segmentlist)
		throws XmlPullParserException, IOException
	{
		long l;
		if(segmentlist != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			l = segmentlist.timescale;
	//    2    4:aload_2         
	//    3    5:getfield        #616 <Field long SegmentBase$SegmentList.timescale>
	//    4    8:lstore          4
		else
	//*   5   10:goto            16
			l = 1L;
	//    6   13:lconst_1        
	//    7   14:lstore          4
		long l1 = parseLong(xmlpullparser, "timescale", l);
	//    8   16:aload_1         
	//    9   17:ldc2            #593 <String "timescale">
	//   10   20:lload           4
	//   11   22:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   12   25:lstore          6
		if(segmentlist != null)
	//*  13   27:aload_2         
	//*  14   28:ifnull          40
			l = segmentlist.presentationTimeOffset;
	//   15   31:aload_2         
	//   16   32:getfield        #617 <Field long SegmentBase$SegmentList.presentationTimeOffset>
	//   17   35:lstore          4
		else
	//*  18   37:goto            43
			l = 0L;
	//   19   40:lconst_0        
	//   20   41:lstore          4
		long l2 = parseLong(xmlpullparser, "presentationTimeOffset", l);
	//   21   43:aload_1         
	//   22   44:ldc2            #597 <String "presentationTimeOffset">
	//   23   47:lload           4
	//   24   49:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   25   52:lstore          8
		if(segmentlist != null)
	//*  26   54:aload_2         
	//*  27   55:ifnull          67
			l = segmentlist.duration;
	//   28   58:aload_2         
	//   29   59:getfield        #619 <Field long SegmentBase$SegmentList.duration>
	//   30   62:lstore          4
		else
	//*  31   64:goto            72
			l = -1L;
	//   32   67:ldc2w           #147 <Long -1L>
	//   33   70:lstore          4
		l = parseLong(xmlpullparser, "duration", l);
	//   34   72:aload_1         
	//   35   73:ldc2            #561 <String "duration">
	//   36   76:lload           4
	//   37   78:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   38   81:lstore          4
		int i;
		if(segmentlist != null)
	//*  39   83:aload_2         
	//*  40   84:ifnull          95
			i = segmentlist.startNumber;
	//   41   87:aload_2         
	//   42   88:getfield        #623 <Field int SegmentBase$SegmentList.startNumber>
	//   43   91:istore_3        
		else
	//*  44   92:goto            97
			i = 1;
	//   45   95:iconst_1        
	//   46   96:istore_3        
		i = parseInt(xmlpullparser, "startNumber", i);
	//   47   97:aload_1         
	//   48   98:ldc2            #624 <String "startNumber">
	//   49  101:iload_3         
	//   50  102:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   51  105:istore_3        
		Object obj1 = null;
	//   52  106:aconst_null     
	//   53  107:astore          13
		RangedUri rangeduri1 = null;
	//   54  109:aconst_null     
	//   55  110:astore          15
		List list1 = ((List) (rangeduri1));
	//   56  112:aload           15
	//   57  114:astore          14
		Object obj;
		List list;
		RangedUri rangeduri;
		do
		{
			xmlpullparser.next();
	//   58  116:aload_1         
	//   59  117:invokeinterface #83  <Method int XmlPullParser.next()>
	//   60  122:pop             
			if(ParserUtil.isStartTag(xmlpullparser, "Initialization"))
	//*  61  123:aload_1         
	//*  62  124:ldc2            #611 <String "Initialization">
	//*  63  127:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  64  130:ifeq            151
			{
				rangeduri = parseInitialization(xmlpullparser);
	//   65  133:aload_0         
	//   66  134:aload_1         
	//   67  135:invokevirtual   #613 <Method RangedUri parseInitialization(XmlPullParser)>
	//   68  138:astore          12
				obj = obj1;
	//   69  140:aload           13
	//   70  142:astore          10
				list = list1;
	//   71  144:aload           14
	//   72  146:astore          11
			} else
	//*  73  148:goto            240
			if(ParserUtil.isStartTag(xmlpullparser, "SegmentTimeline"))
	//*  74  151:aload_1         
	//*  75  152:ldc2            #626 <String "SegmentTimeline">
	//*  76  155:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  77  158:ifeq            179
			{
				list = parseSegmentTimeline(xmlpullparser);
	//   78  161:aload_0         
	//   79  162:aload_1         
	//   80  163:invokevirtual   #630 <Method List parseSegmentTimeline(XmlPullParser)>
	//   81  166:astore          11
				obj = obj1;
	//   82  168:aload           13
	//   83  170:astore          10
				rangeduri = rangeduri1;
	//   84  172:aload           15
	//   85  174:astore          12
			} else
	//*  86  176:goto            240
			{
				obj = obj1;
	//   87  179:aload           13
	//   88  181:astore          10
				rangeduri = rangeduri1;
	//   89  183:aload           15
	//   90  185:astore          12
				list = list1;
	//   91  187:aload           14
	//   92  189:astore          11
				if(ParserUtil.isStartTag(xmlpullparser, "SegmentURL"))
	//*  93  191:aload_1         
	//*  94  192:ldc2            #632 <String "SegmentURL">
	//*  95  195:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  96  198:ifeq            240
				{
					obj = obj1;
	//   97  201:aload           13
	//   98  203:astore          10
					if(obj1 == null)
	//*  99  205:aload           13
	//* 100  207:ifnonnull       219
						obj = ((Object) (new ArrayList()));
	//  101  210:new             #332 <Class ArrayList>
	//  102  213:dup             
	//  103  214:invokespecial   #333 <Method void ArrayList()>
	//  104  217:astore          10
					((List) (obj)).add(((Object) (parseSegmentUrl(xmlpullparser))));
	//  105  219:aload           10
	//  106  221:aload_0         
	//  107  222:aload_1         
	//  108  223:invokevirtual   #635 <Method RangedUri parseSegmentUrl(XmlPullParser)>
	//  109  226:invokeinterface #375 <Method boolean List.add(Object)>
	//  110  231:pop             
					list = list1;
	//  111  232:aload           14
	//  112  234:astore          11
					rangeduri = rangeduri1;
	//  113  236:aload           15
	//  114  238:astore          12
				}
			}
			obj1 = obj;
	//  115  240:aload           10
	//  116  242:astore          13
			rangeduri1 = rangeduri;
	//  117  244:aload           12
	//  118  246:astore          15
			list1 = list;
	//  119  248:aload           11
	//  120  250:astore          14
		} while(!ParserUtil.isEndTag(xmlpullparser, "SegmentList"));
	//  121  252:aload_1         
	//  122  253:ldc2            #388 <String "SegmentList">
	//  123  256:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//  124  259:ifeq            116
		if(segmentlist != null)
	//* 125  262:aload_2         
	//* 126  263:ifnull          314
		{
			if(rangeduri == null)
	//* 127  266:aload           12
	//* 128  268:ifnull          274
	//* 129  271:goto            280
				rangeduri = segmentlist.initialization;
	//  130  274:aload_2         
	//  131  275:getfield        #636 <Field RangedUri SegmentBase$SegmentList.initialization>
	//  132  278:astore          12
			if(list == null)
	//* 133  280:aload           11
	//* 134  282:ifnull          288
	//* 135  285:goto            294
				list = segmentlist.segmentTimeline;
	//  136  288:aload_2         
	//  137  289:getfield        #640 <Field List SegmentBase$SegmentList.segmentTimeline>
	//  138  292:astore          11
			if(obj == null)
	//* 139  294:aload           10
	//* 140  296:ifnull          302
	//* 141  299:goto            308
				obj = ((Object) (segmentlist.mediaSegments));
	//  142  302:aload_2         
	//  143  303:getfield        #643 <Field List SegmentBase$SegmentList.mediaSegments>
	//  144  306:astore          10
			xmlpullparser = ((XmlPullParser) (list));
	//  145  308:aload           11
	//  146  310:astore_1        
		} else
	//* 147  311:goto            317
		{
			xmlpullparser = ((XmlPullParser) (list));
	//  148  314:aload           11
	//  149  316:astore_1        
		}
		return buildSegmentList(rangeduri, l1, l2, i, l, ((List) (xmlpullparser)), ((List) (obj)));
	//  150  317:aload_0         
	//  151  318:aload           12
	//  152  320:lload           6
	//  153  322:lload           8
	//  154  324:iload_3         
	//  155  325:lload           4
	//  156  327:aload_1         
	//  157  328:aload           10
	//  158  330:invokevirtual   #645 <Method SegmentBase$SegmentList buildSegmentList(RangedUri, long, long, int, long, List, List)>
	//  159  333:areturn         
	}

	protected SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlpullparser, SegmentBase.SegmentTemplate segmenttemplate)
		throws XmlPullParserException, IOException
	{
		long l;
		if(segmenttemplate != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			l = segmenttemplate.timescale;
	//    2    4:aload_2         
	//    3    5:getfield        #646 <Field long SegmentBase$SegmentTemplate.timescale>
	//    4    8:lstore          4
		else
	//*   5   10:goto            16
			l = 1L;
	//    6   13:lconst_1        
	//    7   14:lstore          4
		long l1 = parseLong(xmlpullparser, "timescale", l);
	//    8   16:aload_1         
	//    9   17:ldc2            #593 <String "timescale">
	//   10   20:lload           4
	//   11   22:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   12   25:lstore          6
		if(segmenttemplate != null)
	//*  13   27:aload_2         
	//*  14   28:ifnull          40
			l = segmenttemplate.presentationTimeOffset;
	//   15   31:aload_2         
	//   16   32:getfield        #647 <Field long SegmentBase$SegmentTemplate.presentationTimeOffset>
	//   17   35:lstore          4
		else
	//*  18   37:goto            43
			l = 0L;
	//   19   40:lconst_0        
	//   20   41:lstore          4
		long l2 = parseLong(xmlpullparser, "presentationTimeOffset", l);
	//   21   43:aload_1         
	//   22   44:ldc2            #597 <String "presentationTimeOffset">
	//   23   47:lload           4
	//   24   49:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   25   52:lstore          8
		if(segmenttemplate != null)
	//*  26   54:aload_2         
	//*  27   55:ifnull          67
			l = segmenttemplate.duration;
	//   28   58:aload_2         
	//   29   59:getfield        #648 <Field long SegmentBase$SegmentTemplate.duration>
	//   30   62:lstore          4
		else
	//*  31   64:goto            72
			l = -1L;
	//   32   67:ldc2w           #147 <Long -1L>
	//   33   70:lstore          4
		l = parseLong(xmlpullparser, "duration", l);
	//   34   72:aload_1         
	//   35   73:ldc2            #561 <String "duration">
	//   36   76:lload           4
	//   37   78:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   38   81:lstore          4
		int i;
		if(segmenttemplate != null)
	//*  39   83:aload_2         
	//*  40   84:ifnull          95
			i = segmenttemplate.startNumber;
	//   41   87:aload_2         
	//   42   88:getfield        #649 <Field int SegmentBase$SegmentTemplate.startNumber>
	//   43   91:istore_3        
		else
	//*  44   92:goto            97
			i = 1;
	//   45   95:iconst_1        
	//   46   96:istore_3        
		i = parseInt(xmlpullparser, "startNumber", i);
	//   47   97:aload_1         
	//   48   98:ldc2            #624 <String "startNumber">
	//   49  101:iload_3         
	//   50  102:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   51  105:istore_3        
		RangedUri rangeduri1 = null;
	//   52  106:aconst_null     
	//   53  107:astore          12
		Object obj;
		if(segmenttemplate != null)
	//*  54  109:aload_2         
	//*  55  110:ifnull          122
			obj = ((Object) (segmenttemplate.mediaTemplate));
	//   56  113:aload_2         
	//   57  114:getfield        #653 <Field UrlTemplate SegmentBase$SegmentTemplate.mediaTemplate>
	//   58  117:astore          10
		else
	//*  59  119:goto            125
			obj = null;
	//   60  122:aconst_null     
	//   61  123:astore          10
		UrlTemplate urltemplate = parseUrlTemplate(xmlpullparser, "media", ((UrlTemplate) (obj)));
	//   62  125:aload_0         
	//   63  126:aload_1         
	//   64  127:ldc2            #655 <String "media">
	//   65  130:aload           10
	//   66  132:invokevirtual   #659 <Method UrlTemplate parseUrlTemplate(XmlPullParser, String, UrlTemplate)>
	//   67  135:astore          14
		if(segmenttemplate != null)
	//*  68  137:aload_2         
	//*  69  138:ifnull          150
			obj = ((Object) (segmenttemplate.initializationTemplate));
	//   70  141:aload_2         
	//   71  142:getfield        #662 <Field UrlTemplate SegmentBase$SegmentTemplate.initializationTemplate>
	//   72  145:astore          10
		else
	//*  73  147:goto            153
			obj = null;
	//   74  150:aconst_null     
	//   75  151:astore          10
		UrlTemplate urltemplate1 = parseUrlTemplate(xmlpullparser, "initialization", ((UrlTemplate) (obj)));
	//   76  153:aload_0         
	//   77  154:aload_1         
	//   78  155:ldc2            #663 <String "initialization">
	//   79  158:aload           10
	//   80  160:invokevirtual   #659 <Method UrlTemplate parseUrlTemplate(XmlPullParser, String, UrlTemplate)>
	//   81  163:astore          15
		List list = null;
	//   82  165:aconst_null     
	//   83  166:astore          13
		RangedUri rangeduri;
		do
		{
			xmlpullparser.next();
	//   84  168:aload_1         
	//   85  169:invokeinterface #83  <Method int XmlPullParser.next()>
	//   86  174:pop             
			if(ParserUtil.isStartTag(xmlpullparser, "Initialization"))
	//*  87  175:aload_1         
	//*  88  176:ldc2            #611 <String "Initialization">
	//*  89  179:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  90  182:ifeq            199
			{
				rangeduri = parseInitialization(xmlpullparser);
	//   91  185:aload_0         
	//   92  186:aload_1         
	//   93  187:invokevirtual   #613 <Method RangedUri parseInitialization(XmlPullParser)>
	//   94  190:astore          11
				obj = ((Object) (list));
	//   95  192:aload           13
	//   96  194:astore          10
			} else
	//*  97  196:goto            228
			{
				obj = ((Object) (list));
	//   98  199:aload           13
	//   99  201:astore          10
				rangeduri = rangeduri1;
	//  100  203:aload           12
	//  101  205:astore          11
				if(ParserUtil.isStartTag(xmlpullparser, "SegmentTimeline"))
	//* 102  207:aload_1         
	//* 103  208:ldc2            #626 <String "SegmentTimeline">
	//* 104  211:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//* 105  214:ifeq            228
				{
					obj = ((Object) (parseSegmentTimeline(xmlpullparser)));
	//  106  217:aload_0         
	//  107  218:aload_1         
	//  108  219:invokevirtual   #630 <Method List parseSegmentTimeline(XmlPullParser)>
	//  109  222:astore          10
					rangeduri = rangeduri1;
	//  110  224:aload           12
	//  111  226:astore          11
				}
			}
			list = ((List) (obj));
	//  112  228:aload           10
	//  113  230:astore          13
			rangeduri1 = rangeduri;
	//  114  232:aload           11
	//  115  234:astore          12
		} while(!ParserUtil.isEndTag(xmlpullparser, "SegmentTemplate"));
	//  116  236:aload_1         
	//  117  237:ldc2            #394 <String "SegmentTemplate">
	//  118  240:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//  119  243:ifeq            168
		if(segmenttemplate != null)
	//* 120  246:aload_2         
	//* 121  247:ifnull          281
		{
			if(rangeduri == null)
	//* 122  250:aload           11
	//* 123  252:ifnull          258
	//* 124  255:goto            264
				rangeduri = segmenttemplate.initialization;
	//  125  258:aload_2         
	//  126  259:getfield        #664 <Field RangedUri SegmentBase$SegmentTemplate.initialization>
	//  127  262:astore          11
			if(obj == null)
	//* 128  264:aload           10
	//* 129  266:ifnull          272
	//* 130  269:goto            278
				obj = ((Object) (segmenttemplate.segmentTimeline));
	//  131  272:aload_2         
	//  132  273:getfield        #665 <Field List SegmentBase$SegmentTemplate.segmentTimeline>
	//  133  276:astore          10
		}
	//* 134  278:goto            281
		return buildSegmentTemplate(rangeduri, l1, l2, i, l, ((List) (obj)), urltemplate1, urltemplate);
	//  135  281:aload_0         
	//  136  282:aload           11
	//  137  284:lload           6
	//  138  286:lload           8
	//  139  288:iload_3         
	//  140  289:lload           4
	//  141  291:aload           10
	//  142  293:aload           15
	//  143  295:aload           14
	//  144  297:invokevirtual   #667 <Method SegmentBase$SegmentTemplate buildSegmentTemplate(RangedUri, long, long, int, long, List, UrlTemplate, UrlTemplate)>
	//  145  300:areturn         
	}

	protected List parseSegmentTimeline(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #332 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #333 <Method void ArrayList()>
	//    3    7:astore          10
		long l = 0L;
	//    4    9:lconst_0        
	//    5   10:lstore          4
		do
		{
			xmlpullparser.next();
	//    6   12:aload_1         
	//    7   13:invokeinterface #83  <Method int XmlPullParser.next()>
	//    8   18:pop             
			long l1 = l;
	//    9   19:lload           4
	//   10   21:lstore          6
			if(ParserUtil.isStartTag(xmlpullparser, "S"))
	//*  11   23:aload_1         
	//*  12   24:ldc2            #669 <String "S">
	//*  13   27:invokestatic    #341 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  14   30:ifeq            105
			{
				l = parseLong(xmlpullparser, "t", l);
	//   15   33:aload_1         
	//   16   34:ldc2            #671 <String "t">
	//   17   37:lload           4
	//   18   39:invokestatic    #150 <Method long parseLong(XmlPullParser, String, long)>
	//   19   42:lstore          4
				long l2 = parseLong(xmlpullparser, "d");
	//   20   44:aload_1         
	//   21   45:ldc2            #673 <String "d">
	//   22   48:invokestatic    #675 <Method long parseLong(XmlPullParser, String)>
	//   23   51:lstore          8
				int i = 0;
	//   24   53:iconst_0        
	//   25   54:istore_2        
				int j = parseInt(xmlpullparser, "r", 0);
	//   26   55:aload_1         
	//   27   56:ldc2            #677 <String "r">
	//   28   59:iconst_0        
	//   29   60:invokestatic    #144 <Method int parseInt(XmlPullParser, String, int)>
	//   30   63:istore_3        
				do
				{
					l1 = l;
	//   31   64:lload           4
	//   32   66:lstore          6
					if(i >= j + 1)
						break;
	//   33   68:iload_2         
	//   34   69:iload_3         
	//   35   70:iconst_1        
	//   36   71:iadd            
	//   37   72:icmpge          105
					((List) (arraylist)).add(((Object) (buildSegmentTimelineElement(l, l2))));
	//   38   75:aload           10
	//   39   77:aload_0         
	//   40   78:lload           4
	//   41   80:lload           8
	//   42   82:invokevirtual   #679 <Method SegmentBase$SegmentTimelineElement buildSegmentTimelineElement(long, long)>
	//   43   85:invokeinterface #375 <Method boolean List.add(Object)>
	//   44   90:pop             
					l += l2;
	//   45   91:lload           4
	//   46   93:lload           8
	//   47   95:ladd            
	//   48   96:lstore          4
					i++;
	//   49   98:iload_2         
	//   50   99:iconst_1        
	//   51  100:iadd            
	//   52  101:istore_2        
				} while(true);
	//   53  102:goto            64
			}
			l = l1;
	//   54  105:lload           6
	//   55  107:lstore          4
		} while(!ParserUtil.isEndTag(xmlpullparser, "SegmentTimeline"));
	//   56  109:aload_1         
	//   57  110:ldc2            #626 <String "SegmentTimeline">
	//   58  113:invokestatic    #410 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//   59  116:ifeq            12
		return ((List) (arraylist));
	//   60  119:aload           10
	//   61  121:areturn         
	}

	protected RangedUri parseSegmentUrl(XmlPullParser xmlpullparser)
	{
		return parseRangedUrl(xmlpullparser, "media", "mediaRange");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #655 <String "media">
	//    3    5:ldc2            #682 <String "mediaRange">
	//    4    8:invokevirtual   #479 <Method RangedUri parseRangedUrl(XmlPullParser, String, String)>
	//    5   11:areturn         
	}

	protected UrlTemplate parseUrlTemplate(XmlPullParser xmlpullparser, String s, UrlTemplate urltemplate)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aload_2         
	//    3    3:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_1        
		if(xmlpullparser != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			return UrlTemplate.compile(((String) (xmlpullparser)));
	//    7   13:aload_1         
	//    8   14:invokestatic    #687 <Method UrlTemplate UrlTemplate.compile(String)>
	//    9   17:areturn         
		else
			return urltemplate;
	//   10   18:aload_3         
	//   11   19:areturn         
	}

	protected UtcTimingElement parseUtcTiming(XmlPullParser xmlpullparser)
	{
		return buildUtcTimingElement(xmlpullparser.getAttributeValue(((String) (null)), "schemeIdUri"), xmlpullparser.getAttributeValue(((String) (null)), "value"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:ldc2            #420 <String "schemeIdUri">
	//    4    6:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    5   11:aload_1         
	//    6   12:aconst_null     
	//    7   13:ldc2            #424 <String "value">
	//    8   16:invokeinterface #100 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    9   21:invokevirtual   #689 <Method UtcTimingElement buildUtcTimingElement(String, String)>
	//   10   24:areturn         
	}

	private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
	private static final String TAG = "MPDParser";
	private final String contentId;
	private final XmlPullParserFactory xmlParserFactory;

	static 
	{
	//    0    0:ldc1            #23  <String "(\\d+)(?:/(\\d+))?">
	//    1    2:invokestatic    #29  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #31  <Field Pattern FRAME_RATE_PATTERN>
	//*   3    8:return          
	}
}
