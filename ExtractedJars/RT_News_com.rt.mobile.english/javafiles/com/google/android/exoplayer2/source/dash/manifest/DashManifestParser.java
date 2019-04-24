// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.*;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.*;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			Descriptor, AdaptationSet, EventStream, DashManifest, 
//			Period, RangedUri, Representation, UtcTimingElement, 
//			UrlTemplate, SegmentBase

public class DashManifestParser extends DefaultHandler
	implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
{
	protected static final class RepresentationInfo
	{

		public final String baseUrl;
		public final ArrayList drmSchemeDatas;
		public final String drmSchemeType;
		public final Format format;
		public final ArrayList inbandEventStreams;
		public final long revisionId;
		public final SegmentBase segmentBase;

		public RepresentationInfo(Format format1, String s, SegmentBase segmentbase, String s1, ArrayList arraylist, ArrayList arraylist1, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			format = format1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field Format format>
			baseUrl = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field String baseUrl>
			segmentBase = segmentbase;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #32  <Field SegmentBase segmentBase>
			drmSchemeType = s1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #34  <Field String drmSchemeType>
			drmSchemeDatas = arraylist;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #36  <Field ArrayList drmSchemeDatas>
			inbandEventStreams = arraylist1;
		//   17   31:aload_0         
		//   18   32:aload           6
		//   19   34:putfield        #38  <Field ArrayList inbandEventStreams>
			revisionId = l;
		//   20   37:aload_0         
		//   21   38:lload           7
		//   22   40:putfield        #40  <Field long revisionId>
		//   23   43:return          
		}
	}


	public DashManifestParser()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #46  <Method void DashManifestParser(String)>
	//    3    5:return          
	}

	public DashManifestParser(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void DefaultHandler()>
		contentId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field String contentId>
		try
		{
			xmlParserFactory = XmlPullParserFactory.newInstance();
	//    5    9:aload_0         
	//    6   10:invokestatic    #58  <Method XmlPullParserFactory XmlPullParserFactory.newInstance()>
	//    7   13:putfield        #60  <Field XmlPullParserFactory xmlParserFactory>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   17:astore_1        
		{
			throw new RuntimeException("Couldn't create XmlPullParserFactory instance", ((Throwable) (s)));
	//   10   18:new             #62  <Class RuntimeException>
	//   11   21:dup             
	//   12   22:ldc1            #64  <String "Couldn't create XmlPullParserFactory instance">
	//   13   24:aload_1         
	//   14   25:invokespecial   #67  <Method void RuntimeException(String, Throwable)>
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
	//   19   27:invokestatic    #75  <Method void Assertions.checkState(boolean)>
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
	//   10   14:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   11   17:invokestatic    #75  <Method void Assertions.checkState(boolean)>
			return s;
	//   12   20:aload_0         
	//   13   21:areturn         
		}
	}

	private static void filterRedundantIncompleteSchemeDatas(ArrayList arraylist)
	{
label0:
		for(int i = arraylist.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #91  <Method int ArrayList.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iflt            75
		{
			com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemedata = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData)arraylist.get(i);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   10   16:checkcast       #97  <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
	//   11   19:astore_3        
			if(schemedata.hasData())
				continue;
	//   12   20:aload_3         
	//   13   21:invokevirtual   #101 <Method boolean com.google.android.exoplayer2.drm.DrmInitData$SchemeData.hasData()>
	//   14   24:ifne            68
			int j = 0;
	//   15   27:iconst_0        
	//   16   28:istore_2        
			do
			{
				if(j >= arraylist.size())
					continue label0;
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #91  <Method int ArrayList.size()>
	//   20   34:icmpge          68
				if(((com.google.android.exoplayer2.drm.DrmInitData.SchemeData)arraylist.get(j)).canReplace(schemedata))
	//*  21   37:aload_0         
	//*  22   38:iload_2         
	//*  23   39:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  24   42:checkcast       #97  <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
	//*  25   45:aload_3         
	//*  26   46:invokevirtual   #105 <Method boolean com.google.android.exoplayer2.drm.DrmInitData$SchemeData.canReplace(com.google.android.exoplayer2.drm.DrmInitData$SchemeData)>
	//*  27   49:ifeq            61
				{
					arraylist.remove(i);
	//   28   52:aload_0         
	//   29   53:iload_1         
	//   30   54:invokevirtual   #108 <Method Object ArrayList.remove(int)>
	//   31   57:pop             
					continue label0;
	//   32   58:goto            68
				}
				j++;
	//   33   61:iload_2         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_2        
			} while(true);
	//   37   65:goto            29
		}

	//   38   68:iload_1         
	//   39   69:iconst_1        
	//   40   70:isub            
	//   41   71:istore_1        
	//*  42   72:goto            7
	//   43   75:return          
	}

	private static String getSampleMimeType(String s, String s1)
	{
		if(MimeTypes.isAudio(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #117 <Method boolean MimeTypes.isAudio(String)>
	//*   2    4:ifeq            12
			return MimeTypes.getAudioMediaMimeType(s1);
	//    3    7:aload_1         
	//    4    8:invokestatic    #121 <Method String MimeTypes.getAudioMediaMimeType(String)>
	//    5   11:areturn         
		if(MimeTypes.isVideo(s))
	//*   6   12:aload_0         
	//*   7   13:invokestatic    #124 <Method boolean MimeTypes.isVideo(String)>
	//*   8   16:ifeq            24
			return MimeTypes.getVideoMediaMimeType(s1);
	//    9   19:aload_1         
	//   10   20:invokestatic    #127 <Method String MimeTypes.getVideoMediaMimeType(String)>
	//   11   23:areturn         
		if(mimeTypeIsRawText(s))
	//*  12   24:aload_0         
	//*  13   25:invokestatic    #130 <Method boolean mimeTypeIsRawText(String)>
	//*  14   28:ifeq            33
			return s;
	//   15   31:aload_0         
	//   16   32:areturn         
		if("application/mp4".equals(((Object) (s))))
	//*  17   33:ldc1            #132 <String "application/mp4">
	//*  18   35:aload_0         
	//*  19   36:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  20   39:ifeq            66
		{
			if("stpp".equals(((Object) (s1))))
	//*  21   42:ldc1            #134 <String "stpp">
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  24   48:ifeq            54
				return "application/ttml+xml";
	//   25   51:ldc1            #136 <String "application/ttml+xml">
	//   26   53:areturn         
			if("wvtt".equals(((Object) (s1))))
	//*  27   54:ldc1            #138 <String "wvtt">
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  30   60:ifeq            114
				return "application/x-mp4-vtt";
	//   31   63:ldc1            #140 <String "application/x-mp4-vtt">
	//   32   65:areturn         
		} else
		if("application/x-rawcc".equals(((Object) (s))))
	//*  33   66:ldc1            #142 <String "application/x-rawcc">
	//*  34   68:aload_0         
	//*  35   69:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  36   72:ifeq            114
		{
			if(s1 != null)
	//*  37   75:aload_1         
	//*  38   76:ifnull          112
			{
				if(s1.contains("cea708"))
	//*  39   79:aload_1         
	//*  40   80:ldc1            #144 <String "cea708">
	//*  41   82:invokevirtual   #148 <Method boolean String.contains(CharSequence)>
	//*  42   85:ifeq            91
					return "application/cea-708";
	//   43   88:ldc1            #150 <String "application/cea-708">
	//   44   90:areturn         
				if(s1.contains("eia608") || s1.contains("cea608"))
	//*  45   91:aload_1         
	//*  46   92:ldc1            #152 <String "eia608">
	//*  47   94:invokevirtual   #148 <Method boolean String.contains(CharSequence)>
	//*  48   97:ifne            109
	//*  49  100:aload_1         
	//*  50  101:ldc1            #154 <String "cea608">
	//*  51  103:invokevirtual   #148 <Method boolean String.contains(CharSequence)>
	//*  52  106:ifeq            112
					return "application/cea-608";
	//   53  109:ldc1            #156 <String "application/cea-608">
	//   54  111:areturn         
			}
			return null;
	//   55  112:aconst_null     
	//   56  113:areturn         
		}
		return null;
	//   57  114:aconst_null     
	//   58  115:areturn         
	}

	private static boolean mimeTypeIsRawText(String s)
	{
		return MimeTypes.isText(s) || "application/ttml+xml".equals(((Object) (s))) || "application/x-mp4-vtt".equals(((Object) (s))) || "application/cea-708".equals(((Object) (s))) || "application/cea-608".equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #159 <Method boolean MimeTypes.isText(String)>
	//    2    4:ifne            48
	//    3    7:ldc1            #136 <String "application/ttml+xml">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #83  <Method boolean String.equals(Object)>
	//    6   13:ifne            48
	//    7   16:ldc1            #140 <String "application/x-mp4-vtt">
	//    8   18:aload_0         
	//    9   19:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   10   22:ifne            48
	//   11   25:ldc1            #150 <String "application/cea-708">
	//   12   27:aload_0         
	//   13   28:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   14   31:ifne            48
	//   15   34:ldc1            #156 <String "application/cea-608">
	//   16   36:aload_0         
	//   17   37:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   18   40:ifeq            46
	//   19   43:goto            48
	//   20   46:iconst_0        
	//   21   47:ireturn         
	//   22   48:iconst_1        
	//   23   49:ireturn         
	}

	protected static String parseBaseUrl(XmlPullParser xmlpullparser, String s)
		throws XmlPullParserException, IOException
	{
		xmlpullparser.next();
	//    0    0:aload_0         
	//    1    1:invokeinterface #168 <Method int XmlPullParser.next()>
	//    2    6:pop             
		return UriUtil.resolve(s, xmlpullparser.getText());
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokeinterface #172 <Method String XmlPullParser.getText()>
	//    6   14:invokestatic    #177 <Method String UriUtil.resolve(String, String)>
	//    7   17:areturn         
	}

	protected static int parseCea608AccessibilityChannel(List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokeinterface #183 <Method int List.size()>
	//*   5    9:icmpge          110
		{
			Descriptor descriptor = (Descriptor)list.get(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokeinterface #184 <Method Object List.get(int)>
	//    9   19:checkcast       #186 <Class Descriptor>
	//   10   22:astore_2        
			if(!"urn:scte:dash:cc:cea-608:2015".equals(((Object) (descriptor.schemeIdUri))) || descriptor.value == null)
				continue;
	//   11   23:ldc1            #188 <String "urn:scte:dash:cc:cea-608:2015">
	//   12   25:aload_2         
	//   13   26:getfield        #191 <Field String Descriptor.schemeIdUri>
	//   14   29:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   15   32:ifeq            103
	//   16   35:aload_2         
	//   17   36:getfield        #194 <Field String Descriptor.value>
	//   18   39:ifnull          103
			Object obj = ((Object) (CEA_608_ACCESSIBILITY_PATTERN.matcher(((CharSequence) (descriptor.value)))));
	//   19   42:getstatic       #37  <Field Pattern CEA_608_ACCESSIBILITY_PATTERN>
	//   20   45:aload_2         
	//   21   46:getfield        #194 <Field String Descriptor.value>
	//   22   49:invokevirtual   #198 <Method Matcher Pattern.matcher(CharSequence)>
	//   23   52:astore_3        
			if(((Matcher) (obj)).matches())
	//*  24   53:aload_3         
	//*  25   54:invokevirtual   #203 <Method boolean Matcher.matches()>
	//*  26   57:ifeq            69
				return Integer.parseInt(((Matcher) (obj)).group(1));
	//   27   60:aload_3         
	//   28   61:iconst_1        
	//   29   62:invokevirtual   #207 <Method String Matcher.group(int)>
	//   30   65:invokestatic    #213 <Method int Integer.parseInt(String)>
	//   31   68:ireturn         
			obj = ((Object) (new StringBuilder()));
	//   32   69:new             #215 <Class StringBuilder>
	//   33   72:dup             
	//   34   73:invokespecial   #216 <Method void StringBuilder()>
	//   35   76:astore_3        
			((StringBuilder) (obj)).append("Unable to parse CEA-608 channel number from: ");
	//   36   77:aload_3         
	//   37   78:ldc1            #218 <String "Unable to parse CEA-608 channel number from: ">
	//   38   80:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
			((StringBuilder) (obj)).append(descriptor.value);
	//   40   84:aload_3         
	//   41   85:aload_2         
	//   42   86:getfield        #194 <Field String Descriptor.value>
	//   43   89:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   44   92:pop             
			Log.w("MpdParser", ((StringBuilder) (obj)).toString());
	//   45   93:ldc1            #18  <String "MpdParser">
	//   46   95:aload_3         
	//   47   96:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   48   99:invokestatic    #231 <Method int Log.w(String, String)>
	//   49  102:pop             
		}

	//   50  103:iload_1         
	//   51  104:iconst_1        
	//   52  105:iadd            
	//   53  106:istore_1        
	//*  54  107:goto            2
		return -1;
	//   55  110:iconst_m1       
	//   56  111:ireturn         
	}

	protected static int parseCea708AccessibilityChannel(List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokeinterface #183 <Method int List.size()>
	//*   5    9:icmpge          110
		{
			Descriptor descriptor = (Descriptor)list.get(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokeinterface #184 <Method Object List.get(int)>
	//    9   19:checkcast       #186 <Class Descriptor>
	//   10   22:astore_2        
			if(!"urn:scte:dash:cc:cea-708:2015".equals(((Object) (descriptor.schemeIdUri))) || descriptor.value == null)
				continue;
	//   11   23:ldc1            #235 <String "urn:scte:dash:cc:cea-708:2015">
	//   12   25:aload_2         
	//   13   26:getfield        #191 <Field String Descriptor.schemeIdUri>
	//   14   29:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   15   32:ifeq            103
	//   16   35:aload_2         
	//   17   36:getfield        #194 <Field String Descriptor.value>
	//   18   39:ifnull          103
			Object obj = ((Object) (CEA_708_ACCESSIBILITY_PATTERN.matcher(((CharSequence) (descriptor.value)))));
	//   19   42:getstatic       #41  <Field Pattern CEA_708_ACCESSIBILITY_PATTERN>
	//   20   45:aload_2         
	//   21   46:getfield        #194 <Field String Descriptor.value>
	//   22   49:invokevirtual   #198 <Method Matcher Pattern.matcher(CharSequence)>
	//   23   52:astore_3        
			if(((Matcher) (obj)).matches())
	//*  24   53:aload_3         
	//*  25   54:invokevirtual   #203 <Method boolean Matcher.matches()>
	//*  26   57:ifeq            69
				return Integer.parseInt(((Matcher) (obj)).group(1));
	//   27   60:aload_3         
	//   28   61:iconst_1        
	//   29   62:invokevirtual   #207 <Method String Matcher.group(int)>
	//   30   65:invokestatic    #213 <Method int Integer.parseInt(String)>
	//   31   68:ireturn         
			obj = ((Object) (new StringBuilder()));
	//   32   69:new             #215 <Class StringBuilder>
	//   33   72:dup             
	//   34   73:invokespecial   #216 <Method void StringBuilder()>
	//   35   76:astore_3        
			((StringBuilder) (obj)).append("Unable to parse CEA-708 service block number from: ");
	//   36   77:aload_3         
	//   37   78:ldc1            #237 <String "Unable to parse CEA-708 service block number from: ">
	//   38   80:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
			((StringBuilder) (obj)).append(descriptor.value);
	//   40   84:aload_3         
	//   41   85:aload_2         
	//   42   86:getfield        #194 <Field String Descriptor.value>
	//   43   89:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   44   92:pop             
			Log.w("MpdParser", ((StringBuilder) (obj)).toString());
	//   45   93:ldc1            #18  <String "MpdParser">
	//   46   95:aload_3         
	//   47   96:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   48   99:invokestatic    #231 <Method int Log.w(String, String)>
	//   49  102:pop             
		}

	//   50  103:iload_1         
	//   51  104:iconst_1        
	//   52  105:iadd            
	//   53  106:istore_1        
	//*  54  107:goto            2
		return -1;
	//   55  110:iconst_m1       
	//   56  111:ireturn         
	}

	protected static long parseDateTime(XmlPullParser xmlpullparser, String s, long l)
		throws ParserException
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
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
	//   10   16:invokestatic    #250 <Method long Util.parseXsDateTime(String)>
	//   11   19:lreturn         
	}

	protected static Descriptor parseDescriptor(XmlPullParser xmlpullparser, String s)
		throws XmlPullParserException, IOException
	{
		String s1 = parseString(xmlpullparser, "schemeIdUri", "");
	//    0    0:aload_0         
	//    1    1:ldc1            #253 <String "schemeIdUri">
	//    2    3:ldc1            #255 <String "">
	//    3    5:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//    4    8:astore_2        
		String s2 = parseString(xmlpullparser, "value", ((String) (null)));
	//    5    9:aload_0         
	//    6   10:ldc2            #260 <String "value">
	//    7   13:aconst_null     
	//    8   14:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//    9   17:astore_3        
		String s3 = parseString(xmlpullparser, "id", ((String) (null)));
	//   10   18:aload_0         
	//   11   19:ldc2            #262 <String "id">
	//   12   22:aconst_null     
	//   13   23:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//   14   26:astore          4
		do
			xmlpullparser.next();
	//   15   28:aload_0         
	//   16   29:invokeinterface #168 <Method int XmlPullParser.next()>
	//   17   34:pop             
		while(!XmlPullParserUtil.isEndTag(xmlpullparser, s));
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//   21   40:ifeq            28
		return new Descriptor(s1, s2, s3);
	//   22   43:new             #186 <Class Descriptor>
	//   23   46:dup             
	//   24   47:aload_2         
	//   25   48:aload_3         
	//   26   49:aload           4
	//   27   51:invokespecial   #271 <Method void Descriptor(String, String, String)>
	//   28   54:areturn         
	}

	protected static int parseDolbyChannelConfiguration(XmlPullParser xmlpullparser)
	{
		int i;
label0:
		{
			xmlpullparser = ((XmlPullParser) (Util.toLowerInvariant(xmlpullparser.getAttributeValue(((String) (null)), "value"))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:ldc2            #260 <String "value">
	//    3    5:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:invokestatic    #276 <Method String Util.toLowerInvariant(String)>
	//    5   13:astore_0        
			if(xmlpullparser == null)
	//*   6   14:aload_0         
	//*   7   15:ifnonnull       20
				return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
			i = ((String) (xmlpullparser)).hashCode();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #279 <Method int String.hashCode()>
	//   12   24:istore_1        
			if(i != 0x185d7c)
	//*  13   25:iload_1         
	//*  14   26:ldc2            #280 <Int 0x185d7c>
	//*  15   29:icmpeq          101
			{
				if(i != 0x2cd22f)
	//*  16   32:iload_1         
	//*  17   33:ldc2            #281 <Int 0x2cd22f>
	//*  18   36:icmpeq          86
				{
					if(i != 0x2f3613)
	//*  19   39:iload_1         
	//*  20   40:ldc2            #282 <Int 0x2f3613>
	//*  21   43:icmpeq          71
					{
						if(i == 0x2fcffc && ((String) (xmlpullparser)).equals("fa01"))
	//*  22   46:iload_1         
	//*  23   47:ldc2            #283 <Int 0x2fcffc>
	//*  24   50:icmpeq          56
	//*  25   53:goto            116
	//*  26   56:aload_0         
	//*  27   57:ldc2            #285 <String "fa01">
	//*  28   60:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  29   63:ifeq            116
						{
							i = 3;
	//   30   66:iconst_3        
	//   31   67:istore_1        
							break label0;
	//   32   68:goto            118
						}
					} else
					if(((String) (xmlpullparser)).equals("f801"))
	//*  33   71:aload_0         
	//*  34   72:ldc2            #287 <String "f801">
	//*  35   75:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  36   78:ifeq            116
					{
						i = 2;
	//   37   81:iconst_2        
	//   38   82:istore_1        
						break label0;
	//   39   83:goto            118
					}
				} else
				if(((String) (xmlpullparser)).equals("a000"))
	//*  40   86:aload_0         
	//*  41   87:ldc2            #289 <String "a000">
	//*  42   90:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  43   93:ifeq            116
				{
					i = 1;
	//   44   96:iconst_1        
	//   45   97:istore_1        
					break label0;
	//   46   98:goto            118
				}
			} else
			if(((String) (xmlpullparser)).equals("4000"))
	//*  47  101:aload_0         
	//*  48  102:ldc2            #291 <String "4000">
	//*  49  105:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  50  108:ifeq            116
			{
				i = 0;
	//   51  111:iconst_0        
	//   52  112:istore_1        
				break label0;
	//   53  113:goto            118
			}
			i = -1;
	//   54  116:iconst_m1       
	//   55  117:istore_1        
		}
		switch(i)
	//*  56  118:iload_1         
		{
	//*  57  119:tableswitch     0 3: default 148
	//	               0 158
	//	               1 156
	//	               2 153
	//	               3 150
		default:
			return -1;
	//   58  148:iconst_m1       
	//   59  149:ireturn         

		case 3: // '\003'
			return 8;
	//   60  150:bipush          8
	//   61  152:ireturn         

		case 2: // '\002'
			return 6;
	//   62  153:bipush          6
	//   63  155:ireturn         

		case 1: // '\001'
			return 2;
	//   64  156:iconst_2        
	//   65  157:ireturn         

		case 0: // '\0'
			return 1;
	//   66  158:iconst_1        
	//   67  159:ireturn         
		}
	}

	protected static long parseDuration(XmlPullParser xmlpullparser, String s, long l)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
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
	//   10   16:invokestatic    #295 <Method long Util.parseXsDuration(String)>
	//   11   19:lreturn         
	}

	protected static String parseEac3SupplementalProperties(List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokeinterface #183 <Method int List.size()>
	//*   5    9:icmpge          60
		{
			Descriptor descriptor = (Descriptor)list.get(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokeinterface #184 <Method Object List.get(int)>
	//    9   19:checkcast       #186 <Class Descriptor>
	//   10   22:astore_2        
			if("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(((Object) (descriptor.schemeIdUri))) && "ec+3".equals(((Object) (descriptor.value))))
	//*  11   23:ldc2            #299 <String "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014">
	//*  12   26:aload_2         
	//*  13   27:getfield        #191 <Field String Descriptor.schemeIdUri>
	//*  14   30:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  15   33:ifeq            53
	//*  16   36:ldc2            #301 <String "ec+3">
	//*  17   39:aload_2         
	//*  18   40:getfield        #194 <Field String Descriptor.value>
	//*  19   43:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  20   46:ifeq            53
				return "audio/eac3-joc";
	//   21   49:ldc2            #303 <String "audio/eac3-joc">
	//   22   52:areturn         
		}

	//   23   53:iload_1         
	//   24   54:iconst_1        
	//   25   55:iadd            
	//   26   56:istore_1        
	//*  27   57:goto            2
		return "audio/eac3";
	//   28   60:ldc2            #305 <String "audio/eac3">
	//   29   63:areturn         
	}

	protected static float parseFrameRate(XmlPullParser xmlpullparser, float f)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "frameRate")));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:ldc2            #310 <String "frameRate">
	//    3    5:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore_0        
		float f1 = f;
	//    5   11:fload_1         
	//    6   12:fstore_2        
		if(xmlpullparser != null)
	//*   7   13:aload_0         
	//*   8   14:ifnull          68
		{
			xmlpullparser = ((XmlPullParser) (FRAME_RATE_PATTERN.matcher(((CharSequence) (xmlpullparser)))));
	//    9   17:getstatic       #33  <Field Pattern FRAME_RATE_PATTERN>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #198 <Method Matcher Pattern.matcher(CharSequence)>
	//   12   24:astore_0        
			f1 = f;
	//   13   25:fload_1         
	//   14   26:fstore_2        
			if(((Matcher) (xmlpullparser)).matches())
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #203 <Method boolean Matcher.matches()>
	//*  17   31:ifeq            68
			{
				int i = Integer.parseInt(((Matcher) (xmlpullparser)).group(1));
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #207 <Method String Matcher.group(int)>
	//   21   39:invokestatic    #213 <Method int Integer.parseInt(String)>
	//   22   42:istore_3        
				xmlpullparser = ((XmlPullParser) (((Matcher) (xmlpullparser)).group(2)));
	//   23   43:aload_0         
	//   24   44:iconst_2        
	//   25   45:invokevirtual   #207 <Method String Matcher.group(int)>
	//   26   48:astore_0        
				if(!TextUtils.isEmpty(((CharSequence) (xmlpullparser))))
	//*  27   49:aload_0         
	//*  28   50:invokestatic    #315 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   53:ifne            65
					return (float)i / (float)Integer.parseInt(((String) (xmlpullparser)));
	//   30   56:iload_3         
	//   31   57:i2f             
	//   32   58:aload_0         
	//   33   59:invokestatic    #213 <Method int Integer.parseInt(String)>
	//   34   62:i2f             
	//   35   63:fdiv            
	//   36   64:freturn         
				f1 = i;
	//   37   65:iload_3         
	//   38   66:i2f             
	//   39   67:fstore_2        
			}
		}
		return f1;
	//   40   68:fload_2         
	//   41   69:freturn         
	}

	protected static int parseInt(XmlPullParser xmlpullparser, String s, int i)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
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
	//   10   16:invokestatic    #213 <Method int Integer.parseInt(String)>
	//   11   19:ireturn         
	}

	protected static long parseLong(XmlPullParser xmlpullparser, String s, long l)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
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
	//   10   16:invokestatic    #321 <Method long Long.parseLong(String)>
	//   11   19:lreturn         
	}

	protected static String parseString(XmlPullParser xmlpullparser, String s, String s1)
	{
		s = xmlpullparser.getAttributeValue(((String) (null)), s);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
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

	protected AdaptationSet buildAdaptationSet(int i, int j, List list, List list1, List list2)
	{
		return new AdaptationSet(i, j, list, list1, list2);
	//    0    0:new             #325 <Class AdaptationSet>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokespecial   #328 <Method void AdaptationSet(int, int, List, List, List)>
	//    8   14:areturn         
	}

	protected EventMessage buildEvent(String s, String s1, long l, long l1, byte abyte0[], 
			long l2)
	{
		return new EventMessage(s, s1, l1, l, abyte0, l2);
	//    0    0:new             #333 <Class EventMessage>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:lload           5
	//    5    8:lload_3         
	//    6    9:aload           7
	//    7   11:lload           8
	//    8   13:invokespecial   #336 <Method void EventMessage(String, String, long, long, byte[], long)>
	//    9   16:areturn         
	}

	protected EventStream buildEventStream(String s, String s1, long l, long al[], EventMessage aeventmessage[])
	{
		return new EventStream(s, s1, l, al, aeventmessage);
	//    0    0:new             #340 <Class EventStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:lload_3         
	//    5    7:aload           5
	//    6    9:aload           6
	//    7   11:invokespecial   #343 <Method void EventStream(String, String, long, long[], EventMessage[])>
	//    8   14:areturn         
	}

	protected Format buildFormat(String s, String s1, int i, int j, float f, int k, int l, 
			int i1, String s2, int j1, List list, String s3, List list1)
	{
		String s5 = getSampleMimeType(s1, s3);
	//    0    0:aload_2         
	//    1    1:aload           12
	//    2    3:invokestatic    #347 <Method String getSampleMimeType(String, String)>
	//    3    6:astore          15
		if(s5 != null)
	//*   4    8:aload           15
	//*   5   10:ifnull          164
		{
			String s4 = s5;
	//    6   13:aload           15
	//    7   15:astore          14
			if("audio/eac3".equals(((Object) (s5))))
	//*   8   17:ldc2            #305 <String "audio/eac3">
	//*   9   20:aload           15
	//*  10   22:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  11   25:ifeq            35
				s4 = parseEac3SupplementalProperties(list1);
	//   12   28:aload           13
	//   13   30:invokestatic    #349 <Method String parseEac3SupplementalProperties(List)>
	//   14   33:astore          14
			if(MimeTypes.isVideo(s4))
	//*  15   35:aload           14
	//*  16   37:invokestatic    #124 <Method boolean MimeTypes.isVideo(String)>
	//*  17   40:ifeq            63
				return Format.createVideoContainerFormat(s, s1, s4, s3, i1, i, j, f, ((List) (null)), j1);
	//   18   43:aload_1         
	//   19   44:aload_2         
	//   20   45:aload           14
	//   21   47:aload           12
	//   22   49:iload           8
	//   23   51:iload_3         
	//   24   52:iload           4
	//   25   54:fload           5
	//   26   56:aconst_null     
	//   27   57:iload           10
	//   28   59:invokestatic    #355 <Method Format Format.createVideoContainerFormat(String, String, String, String, int, int, int, float, List, int)>
	//   29   62:areturn         
			if(MimeTypes.isAudio(s4))
	//*  30   63:aload           14
	//*  31   65:invokestatic    #117 <Method boolean MimeTypes.isAudio(String)>
	//*  32   68:ifeq            92
				return Format.createAudioContainerFormat(s, s1, s4, s3, i1, k, l, ((List) (null)), j1, s2);
	//   33   71:aload_1         
	//   34   72:aload_2         
	//   35   73:aload           14
	//   36   75:aload           12
	//   37   77:iload           8
	//   38   79:iload           6
	//   39   81:iload           7
	//   40   83:aconst_null     
	//   41   84:iload           10
	//   42   86:aload           9
	//   43   88:invokestatic    #359 <Method Format Format.createAudioContainerFormat(String, String, String, String, int, int, int, List, int, String)>
	//   44   91:areturn         
			list1 = ((List) (s4));
	//   45   92:aload           14
	//   46   94:astore          13
			if(mimeTypeIsRawText(s4))
	//*  47   96:aload           14
	//*  48   98:invokestatic    #130 <Method boolean mimeTypeIsRawText(String)>
	//*  49  101:ifeq            168
			{
				if("application/cea-608".equals(((Object) (s4))))
	//*  50  104:ldc1            #156 <String "application/cea-608">
	//*  51  106:aload           14
	//*  52  108:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  53  111:ifeq            123
					i = parseCea608AccessibilityChannel(list);
	//   54  114:aload           11
	//   55  116:invokestatic    #361 <Method int parseCea608AccessibilityChannel(List)>
	//   56  119:istore_3        
				else
	//*  57  120:goto            147
				if("application/cea-708".equals(((Object) (s4))))
	//*  58  123:ldc1            #150 <String "application/cea-708">
	//*  59  125:aload           14
	//*  60  127:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  61  130:ifeq            142
					i = parseCea708AccessibilityChannel(list);
	//   62  133:aload           11
	//   63  135:invokestatic    #363 <Method int parseCea708AccessibilityChannel(List)>
	//   64  138:istore_3        
				else
	//*  65  139:goto            120
					i = -1;
	//   66  142:iconst_m1       
	//   67  143:istore_3        
	//*  68  144:goto            120
				return Format.createTextContainerFormat(s, s1, s4, s3, i1, j1, s2, i);
	//   69  147:aload_1         
	//   70  148:aload_2         
	//   71  149:aload           14
	//   72  151:aload           12
	//   73  153:iload           8
	//   74  155:iload           10
	//   75  157:aload           9
	//   76  159:iload_3         
	//   77  160:invokestatic    #367 <Method Format Format.createTextContainerFormat(String, String, String, String, int, int, String, int)>
	//   78  163:areturn         
			}
		} else
		{
			list1 = ((List) (s5));
	//   79  164:aload           15
	//   80  166:astore          13
		}
		return Format.createContainerFormat(s, s1, ((String) (list1)), s3, i1, j1, s2);
	//   81  168:aload_1         
	//   82  169:aload_2         
	//   83  170:aload           13
	//   84  172:aload           12
	//   85  174:iload           8
	//   86  176:iload           10
	//   87  178:aload           9
	//   88  180:invokestatic    #371 <Method Format Format.createContainerFormat(String, String, String, String, int, int, String)>
	//   89  183:areturn         
	}

	protected DashManifest buildMediaPresentationDescription(long l, long l1, long l2, boolean flag, 
			long l3, long l4, long l5, long l6, UtcTimingElement utctimingelement, Uri uri, List list)
	{
		return new DashManifest(l, l1, l2, flag, l3, l4, l5, l6, utctimingelement, uri, list);
	//    0    0:new             #376 <Class DashManifest>
	//    1    3:dup             
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:lload           5
	//    5    8:iload           7
	//    6   10:lload           8
	//    7   12:lload           10
	//    8   14:lload           12
	//    9   16:lload           14
	//   10   18:aload           16
	//   11   20:aload           17
	//   12   22:aload           18
	//   13   24:invokespecial   #379 <Method void DashManifest(long, long, long, boolean, long, long, long, long, UtcTimingElement, Uri, List)>
	//   14   27:areturn         
	}

	protected Period buildPeriod(String s, long l, List list, List list1)
	{
		return new Period(s, l, list, list1);
	//    0    0:new             #384 <Class Period>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #387 <Method void Period(String, long, List, List)>
	//    7   13:areturn         
	}

	protected RangedUri buildRangedUri(String s, long l, long l1)
	{
		return new RangedUri(s, l, l1);
	//    0    0:new             #392 <Class RangedUri>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokespecial   #395 <Method void RangedUri(String, long, long)>
	//    6   11:areturn         
	}

	protected Representation buildRepresentation(RepresentationInfo representationinfo, String s, String s1, ArrayList arraylist, ArrayList arraylist1)
	{
		Format format = representationinfo.format;
	//    0    0:aload_1         
	//    1    1:getfield        #401 <Field Format DashManifestParser$RepresentationInfo.format>
	//    2    4:astore          6
		if(representationinfo.drmSchemeType != null)
	//*   3    6:aload_1         
	//*   4    7:getfield        #404 <Field String DashManifestParser$RepresentationInfo.drmSchemeType>
	//*   5   10:ifnull          18
			s1 = representationinfo.drmSchemeType;
	//    6   13:aload_1         
	//    7   14:getfield        #404 <Field String DashManifestParser$RepresentationInfo.drmSchemeType>
	//    8   17:astore_3        
		ArrayList arraylist2 = representationinfo.drmSchemeDatas;
	//    9   18:aload_1         
	//   10   19:getfield        #408 <Field ArrayList DashManifestParser$RepresentationInfo.drmSchemeDatas>
	//   11   22:astore          7
		arraylist2.addAll(((java.util.Collection) (arraylist)));
	//   12   24:aload           7
	//   13   26:aload           4
	//   14   28:invokevirtual   #412 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   15   31:pop             
		arraylist = ((ArrayList) (format));
	//   16   32:aload           6
	//   17   34:astore          4
		if(!arraylist2.isEmpty())
	//*  18   36:aload           7
	//*  19   38:invokevirtual   #414 <Method boolean ArrayList.isEmpty()>
	//*  20   41:ifne            66
		{
			filterRedundantIncompleteSchemeDatas(arraylist2);
	//   21   44:aload           7
	//   22   46:invokestatic    #416 <Method void filterRedundantIncompleteSchemeDatas(ArrayList)>
			arraylist = ((ArrayList) (format.copyWithDrmInitData(new DrmInitData(s1, ((List) (arraylist2))))));
	//   23   49:aload           6
	//   24   51:new             #418 <Class DrmInitData>
	//   25   54:dup             
	//   26   55:aload_3         
	//   27   56:aload           7
	//   28   58:invokespecial   #421 <Method void DrmInitData(String, List)>
	//   29   61:invokevirtual   #425 <Method Format Format.copyWithDrmInitData(DrmInitData)>
	//   30   64:astore          4
		}
		s1 = ((String) (representationinfo.inbandEventStreams));
	//   31   66:aload_1         
	//   32   67:getfield        #428 <Field ArrayList DashManifestParser$RepresentationInfo.inbandEventStreams>
	//   33   70:astore_3        
		((ArrayList) (s1)).addAll(((java.util.Collection) (arraylist1)));
	//   34   71:aload_3         
	//   35   72:aload           5
	//   36   74:invokevirtual   #412 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   37   77:pop             
		return Representation.newInstance(s, representationinfo.revisionId, ((Format) (arraylist)), representationinfo.baseUrl, representationinfo.segmentBase, ((List) (s1)));
	//   38   78:aload_2         
	//   39   79:aload_1         
	//   40   80:getfield        #432 <Field long DashManifestParser$RepresentationInfo.revisionId>
	//   41   83:aload           4
	//   42   85:aload_1         
	//   43   86:getfield        #435 <Field String DashManifestParser$RepresentationInfo.baseUrl>
	//   44   89:aload_1         
	//   45   90:getfield        #439 <Field SegmentBase DashManifestParser$RepresentationInfo.segmentBase>
	//   46   93:aload_3         
	//   47   94:invokestatic    #444 <Method Representation Representation.newInstance(String, long, Format, String, SegmentBase, List)>
	//   48   97:areturn         
	}

	protected SegmentBase.SegmentList buildSegmentList(RangedUri rangeduri, long l, long l1, long l2, 
			long l3, List list, List list1)
	{
		return new SegmentBase.SegmentList(rangeduri, l, l1, l2, l3, list, list1);
	//    0    0:new             #449 <Class SegmentBase$SegmentList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:lload           6
	//    6   10:lload           8
	//    7   12:aload           10
	//    8   14:aload           11
	//    9   16:invokespecial   #452 <Method void SegmentBase$SegmentList(RangedUri, long, long, long, long, List, List)>
	//   10   19:areturn         
	}

	protected SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangeduri, long l, long l1, long l2, 
			long l3, List list, UrlTemplate urltemplate, UrlTemplate urltemplate1)
	{
		return new SegmentBase.SegmentTemplate(rangeduri, l, l1, l2, l3, list, urltemplate, urltemplate1);
	//    0    0:new             #457 <Class SegmentBase$SegmentTemplate>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:lload           6
	//    6   10:lload           8
	//    7   12:aload           10
	//    8   14:aload           11
	//    9   16:aload           12
	//   10   18:invokespecial   #460 <Method void SegmentBase$SegmentTemplate(RangedUri, long, long, long, long, List, UrlTemplate, UrlTemplate)>
	//   11   21:areturn         
	}

	protected SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long l, long l1)
	{
		return new SegmentBase.SegmentTimelineElement(l, l1);
	//    0    0:new             #465 <Class SegmentBase$SegmentTimelineElement>
	//    1    3:dup             
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokespecial   #468 <Method void SegmentBase$SegmentTimelineElement(long, long)>
	//    5    9:areturn         
	}

	protected SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
			long l3)
	{
		return new SegmentBase.SingleSegmentBase(rangeduri, l, l1, l2, l3);
	//    0    0:new             #472 <Class SegmentBase$SingleSegmentBase>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:lload           6
	//    6   10:lload           8
	//    7   12:invokespecial   #475 <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
	//    8   15:areturn         
	}

	protected UtcTimingElement buildUtcTimingElement(String s, String s1)
	{
		return new UtcTimingElement(s, s1);
	//    0    0:new             #479 <Class UtcTimingElement>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #482 <Method void UtcTimingElement(String, String)>
	//    5    9:areturn         
	}

	protected int getContentType(Format format)
	{
		format = ((Format) (format.sampleMimeType));
	//    0    0:aload_1         
	//    1    1:getfield        #487 <Field String Format.sampleMimeType>
	//    2    4:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (format))))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #315 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		if(MimeTypes.isVideo(((String) (format))))
	//*   8   14:aload_1         
	//*   9   15:invokestatic    #124 <Method boolean MimeTypes.isVideo(String)>
	//*  10   18:ifeq            23
			return 2;
	//   11   21:iconst_2        
	//   12   22:ireturn         
		if(MimeTypes.isAudio(((String) (format))))
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #117 <Method boolean MimeTypes.isAudio(String)>
	//*  15   27:ifeq            32
			return 1;
	//   16   30:iconst_1        
	//   17   31:ireturn         
		return !mimeTypeIsRawText(((String) (format))) ? -1 : 3;
	//   18   32:aload_1         
	//   19   33:invokestatic    #130 <Method boolean mimeTypeIsRawText(String)>
	//   20   36:ifeq            41
	//   21   39:iconst_3        
	//   22   40:ireturn         
	//   23   41:iconst_m1       
	//   24   42:ireturn         
	}

	public DashManifest parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		XmlPullParser xmlpullparser;
		try
		{
			xmlpullparser = xmlParserFactory.newPullParser();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field XmlPullParserFactory xmlParserFactory>
	//    2    4:invokevirtual   #493 <Method XmlPullParser XmlPullParserFactory.newPullParser()>
	//    3    7:astore_3        
			xmlpullparser.setInput(inputstream, ((String) (null)));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokeinterface #497 <Method void XmlPullParser.setInput(InputStream, String)>
			if(xmlpullparser.next() != 2 || !"MPD".equals(((Object) (xmlpullparser.getName()))))
	//*   8   16:aload_3         
	//*   9   17:invokeinterface #168 <Method int XmlPullParser.next()>
	//*  10   22:iconst_2        
	//*  11   23:icmpne          54
	//*  12   26:ldc2            #499 <String "MPD">
	//*  13   29:aload_3         
	//*  14   30:invokeinterface #502 <Method String XmlPullParser.getName()>
	//*  15   35:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  16   38:ifne            44
				break MISSING_BLOCK_LABEL_54;
	//   17   41:goto            54
		}
	//*  18   44:aload_0         
	//*  19   45:aload_3         
	//*  20   46:aload_1         
	//*  21   47:invokevirtual   #505 <Method String Uri.toString()>
	//*  22   50:invokevirtual   #509 <Method DashManifest parseMediaPresentationDescription(XmlPullParser, String)>
	//*  23   53:areturn         
	//*  24   54:new             #241 <Class ParserException>
	//*  25   57:dup             
	//*  26   58:ldc2            #511 <String "inputStream does not contain a valid media presentation description">
	//*  27   61:invokespecial   #512 <Method void ParserException(String)>
	//*  28   64:athrow          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*  29   65:astore_1        
		{
			throw new ParserException(((Throwable) (uri)));
	//   30   66:new             #241 <Class ParserException>
	//   31   69:dup             
	//   32   70:aload_1         
	//   33   71:invokespecial   #515 <Method void ParserException(Throwable)>
	//   34   74:athrow          
		}
		return parseMediaPresentationDescription(xmlpullparser, uri.toString());
		throw new ParserException("inputStream does not contain a valid media presentation description");
	}

	public volatile Object parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		return ((Object) (parse(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #518 <Method DashManifest parse(Uri, InputStream)>
	//    4    6:areturn         
	}

	protected AdaptationSet parseAdaptationSet(XmlPullParser xmlpullparser, String s, SegmentBase segmentbase)
		throws XmlPullParserException, IOException
	{
		float f;
		int i;
		int j;
		byte byte0;
		boolean flag;
		int j1;
		int k1;
		int l1;
		int i2;
		Object obj;
		Object obj1;
		ArrayList arraylist;
		ArrayList arraylist1;
		ArrayList arraylist2;
		ArrayList arraylist3;
		ArrayList arraylist4;
		String s1;
		Object obj3;
		String s3;
		String s4;
		obj = ((Object) (xmlpullparser));
	//    0    0:aload_1         
	//    1    1:astore          15
		j1 = parseInt(((XmlPullParser) (obj)), "id", -1);
	//    2    3:aload           15
	//    3    5:ldc2            #262 <String "id">
	//    4    8:iconst_m1       
	//    5    9:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//    6   12:istore          11
		i = parseContentType(xmlpullparser);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #525 <Method int parseContentType(XmlPullParser)>
	//   10   19:istore          5
		s1 = null;
	//   11   21:aconst_null     
	//   12   22:astore          23
		s3 = ((XmlPullParser) (obj)).getAttributeValue(((String) (null)), "mimeType");
	//   13   24:aload           15
	//   14   26:aconst_null     
	//   15   27:ldc2            #527 <String "mimeType">
	//   16   30:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   17   35:astore          26
		s4 = ((XmlPullParser) (obj)).getAttributeValue(((String) (null)), "codecs");
	//   18   37:aload           15
	//   19   39:aconst_null     
	//   20   40:ldc2            #529 <String "codecs">
	//   21   43:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   22   48:astore          27
		k1 = parseInt(((XmlPullParser) (obj)), "width", -1);
	//   23   50:aload           15
	//   24   52:ldc2            #531 <String "width">
	//   25   55:iconst_m1       
	//   26   56:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   27   59:istore          12
		l1 = parseInt(((XmlPullParser) (obj)), "height", -1);
	//   28   61:aload           15
	//   29   63:ldc2            #533 <String "height">
	//   30   66:iconst_m1       
	//   31   67:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   32   70:istore          13
		f = parseFrameRate(((XmlPullParser) (obj)), -1F);
	//   33   72:aload           15
	//   34   74:ldc2            #534 <Float -1F>
	//   35   77:invokestatic    #536 <Method float parseFrameRate(XmlPullParser, float)>
	//   36   80:fstore          4
		i2 = parseInt(((XmlPullParser) (obj)), "audioSamplingRate", -1);
	//   37   82:aload           15
	//   38   84:ldc2            #538 <String "audioSamplingRate">
	//   39   87:iconst_m1       
	//   40   88:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   41   91:istore          14
		obj1 = ((Object) (((XmlPullParser) (obj)).getAttributeValue(((String) (null)), "lang")));
	//   42   93:aload           15
	//   43   95:aconst_null     
	//   44   96:ldc2            #540 <String "lang">
	//   45   99:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   46  104:astore          16
		arraylist4 = new ArrayList();
	//   47  106:new             #87  <Class ArrayList>
	//   48  109:dup             
	//   49  110:invokespecial   #541 <Method void ArrayList()>
	//   50  113:astore          21
		arraylist1 = new ArrayList();
	//   51  115:new             #87  <Class ArrayList>
	//   52  118:dup             
	//   53  119:invokespecial   #541 <Method void ArrayList()>
	//   54  122:astore          18
		arraylist3 = new ArrayList();
	//   55  124:new             #87  <Class ArrayList>
	//   56  127:dup             
	//   57  128:invokespecial   #541 <Method void ArrayList()>
	//   58  131:astore          20
		arraylist2 = new ArrayList();
	//   59  133:new             #87  <Class ArrayList>
	//   60  136:dup             
	//   61  137:invokespecial   #541 <Method void ArrayList()>
	//   62  140:astore          19
		arraylist = new ArrayList();
	//   63  142:new             #87  <Class ArrayList>
	//   64  145:dup             
	//   65  146:invokespecial   #541 <Method void ArrayList()>
	//   66  149:astore          17
		obj3 = ((Object) (segmentbase));
	//   67  151:aload_3         
	//   68  152:astore          24
		byte0 = -1;
	//   69  154:iconst_m1       
	//   70  155:istore          7
		segmentbase = ((SegmentBase) (obj1));
	//   71  157:aload           16
	//   72  159:astore_3        
		obj1 = null;
	//   73  160:aconst_null     
	//   74  161:astore          16
		flag = false;
	//   75  163:iconst_0        
	//   76  164:istore          8
		j = ((int) (flag));
	//   77  166:iload           8
	//   78  168:istore          6
_L11:
		xmlpullparser.next();
	//   79  170:aload_1         
	//   80  171:invokeinterface #168 <Method int XmlPullParser.next()>
	//   81  176:pop             
		if(!XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "BaseURL")) goto _L2; else goto _L1
	//   82  177:aload           15
	//   83  179:ldc2            #543 <String "BaseURL">
	//   84  182:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//   85  185:ifeq            223
_L1:
		if(flag) goto _L4; else goto _L3
	//   86  188:iload           8
	//   87  190:ifne            216
_L3:
		Object obj2;
		obj2 = ((Object) (parseBaseUrl(((XmlPullParser) (obj)), s)));
	//   88  193:aload           15
	//   89  195:aload_2         
	//   90  196:invokestatic    #548 <Method String parseBaseUrl(XmlPullParser, String)>
	//   91  199:astore          22
		flag = true;
	//   92  201:iconst_1        
	//   93  202:istore          8
_L5:
		s = ((String) (segmentbase));
	//   94  204:aload_3         
	//   95  205:astore_2        
		segmentbase = ((SegmentBase) (obj));
	//   96  206:aload           15
	//   97  208:astore_3        
		obj = obj2;
	//   98  209:aload           22
	//   99  211:astore          15
		break MISSING_BLOCK_LABEL_729;
	//  100  213:goto            729
_L4:
		obj2 = obj;
	//  101  216:aload           15
	//  102  218:astore          22
		break MISSING_BLOCK_LABEL_721;
	//  103  220:goto            721
_L2:
		int l;
		int i1;
		if(XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "ContentProtection"))
	//* 104  223:aload           15
	//* 105  225:ldc2            #550 <String "ContentProtection">
	//* 106  228:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 107  231:ifeq            320
		{
			Pair pair = parseContentProtection(xmlpullparser);
	//  108  234:aload_0         
	//  109  235:aload_1         
	//  110  236:invokevirtual   #554 <Method Pair parseContentProtection(XmlPullParser)>
	//  111  239:astore          25
			obj2 = obj1;
	//  112  241:aload           16
	//  113  243:astore          22
			if(pair.first != null)
	//* 114  245:aload           25
	//* 115  247:getfield        #560 <Field Object Pair.first>
	//* 116  250:ifnull          263
				obj2 = ((Object) ((String)pair.first));
	//  117  253:aload           25
	//  118  255:getfield        #560 <Field Object Pair.first>
	//  119  258:checkcast       #79  <Class String>
	//  120  261:astore          22
			l = j;
	//  121  263:iload           6
	//  122  265:istore          9
			i1 = ((int) (byte0));
	//  123  267:iload           7
	//  124  269:istore          10
			obj1 = obj2;
	//  125  271:aload           22
	//  126  273:astore          16
			if(pair.second != null)
	//* 127  275:aload           25
	//* 128  277:getfield        #563 <Field Object Pair.second>
	//* 129  280:ifnull          306
			{
				arraylist4.add(pair.second);
	//  130  283:aload           21
	//  131  285:aload           25
	//  132  287:getfield        #563 <Field Object Pair.second>
	//  133  290:invokevirtual   #566 <Method boolean ArrayList.add(Object)>
	//  134  293:pop             
				obj1 = obj2;
	//  135  294:aload           22
	//  136  296:astore          16
				i1 = ((int) (byte0));
	//  137  298:iload           7
	//  138  300:istore          10
				l = j;
	//  139  302:iload           6
	//  140  304:istore          9
			}
		} else
	//* 141  306:iload           9
	//* 142  308:istore          6
	//* 143  310:iload           10
	//* 144  312:istore          7
	//* 145  314:aload_2         
	//* 146  315:astore          22
	//* 147  317:goto            204
		{
			if(XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "ContentComponent"))
	//* 148  320:aload           15
	//* 149  322:ldc2            #568 <String "ContentComponent">
	//* 150  325:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 151  328:ifeq            377
			{
				obj2 = ((Object) (checkLanguageConsistency(((String) (segmentbase)), ((XmlPullParser) (obj)).getAttributeValue(s1, "lang"))));
	//  152  331:aload_3         
	//  153  332:aload           15
	//  154  334:aload           23
	//  155  336:ldc2            #540 <String "lang">
	//  156  339:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//  157  344:invokestatic    #570 <Method String checkLanguageConsistency(String, String)>
	//  158  347:astore          22
				i = checkContentTypeConsistency(i, parseContentType(xmlpullparser));
	//  159  349:iload           5
	//  160  351:aload_0         
	//  161  352:aload_1         
	//  162  353:invokevirtual   #525 <Method int parseContentType(XmlPullParser)>
	//  163  356:invokestatic    #572 <Method int checkContentTypeConsistency(int, int)>
	//  164  359:istore          5
				String s2 = s;
	//  165  361:aload_2         
	//  166  362:astore          25
				segmentbase = ((SegmentBase) (obj));
	//  167  364:aload           15
	//  168  366:astore_3        
				s = ((String) (obj2));
	//  169  367:aload           22
	//  170  369:astore_2        
				obj = ((Object) (s2));
	//  171  370:aload           25
	//  172  372:astore          15
				break MISSING_BLOCK_LABEL_729;
	//  173  374:goto            729
			}
			if(XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "Role"))
	//* 174  377:aload           15
	//* 175  379:ldc2            #574 <String "Role">
	//* 176  382:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 177  385:ifeq            405
			{
				l = j | parseRole(xmlpullparser);
	//  178  388:iload           6
	//  179  390:aload_0         
	//  180  391:aload_1         
	//  181  392:invokevirtual   #577 <Method int parseRole(XmlPullParser)>
	//  182  395:ior             
	//  183  396:istore          9
				i1 = ((int) (byte0));
	//  184  398:iload           7
	//  185  400:istore          10
			} else
	//* 186  402:goto            306
			{
label0:
				{
					if(!XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "AudioChannelConfiguration"))
						break label0;
	//  187  405:aload           15
	//  188  407:ldc2            #579 <String "AudioChannelConfiguration">
	//  189  410:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//  190  413:ifeq            430
					i1 = parseAudioChannelConfiguration(xmlpullparser);
	//  191  416:aload_0         
	//  192  417:aload_1         
	//  193  418:invokevirtual   #582 <Method int parseAudioChannelConfiguration(XmlPullParser)>
	//  194  421:istore          10
					l = j;
	//  195  423:iload           6
	//  196  425:istore          9
				}
			}
		}
		j = l;
		byte0 = ((byte) (i1));
		obj2 = ((Object) (s));
		  goto _L5
	//* 197  427:goto            306
		if(XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "Accessibility"))
	//* 198  430:aload           15
	//* 199  432:ldc2            #584 <String "Accessibility">
	//* 200  435:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 201  438:ifeq            458
		{
			arraylist3.add(((Object) (parseDescriptor(((XmlPullParser) (obj)), "Accessibility"))));
	//  202  441:aload           20
	//  203  443:aload           15
	//  204  445:ldc2            #584 <String "Accessibility">
	//  205  448:invokestatic    #586 <Method Descriptor parseDescriptor(XmlPullParser, String)>
	//  206  451:invokevirtual   #566 <Method boolean ArrayList.add(Object)>
	//  207  454:pop             
		} else
	//* 208  455:goto            216
		{
label1:
			{
				if(!XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "SupplementalProperty"))
					break label1;
	//  209  458:aload           15
	//  210  460:ldc2            #588 <String "SupplementalProperty">
	//  211  463:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//  212  466:ifeq            486
				arraylist2.add(((Object) (parseDescriptor(((XmlPullParser) (obj)), "SupplementalProperty"))));
	//  213  469:aload           19
	//  214  471:aload           15
	//  215  473:ldc2            #588 <String "SupplementalProperty">
	//  216  476:invokestatic    #586 <Method Descriptor parseDescriptor(XmlPullParser, String)>
	//  217  479:invokevirtual   #566 <Method boolean ArrayList.add(Object)>
	//  218  482:pop             
			}
		}
		  goto _L4
	//* 219  483:goto            216
		SegmentBase segmentbase3;
		if(XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "Representation"))
	//* 220  486:aload           15
	//* 221  488:ldc2            #590 <String "Representation">
	//* 222  491:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 223  494:ifeq            569
		{
			SegmentBase segmentbase2 = segmentbase;
	//  224  497:aload_3         
	//  225  498:astore          25
			obj2 = ((Object) (s));
	//  226  500:aload_2         
	//  227  501:astore          22
			s = ((String) (parseRepresentation(((XmlPullParser) (obj)), s, s3, s4, k1, l1, f, ((int) (byte0)), i2, ((String) (segmentbase2)), j, ((List) (arraylist3)), ((SegmentBase) (obj3)))));
	//  228  503:aload_0         
	//  229  504:aload           15
	//  230  506:aload_2         
	//  231  507:aload           26
	//  232  509:aload           27
	//  233  511:iload           12
	//  234  513:iload           13
	//  235  515:fload           4
	//  236  517:iload           7
	//  237  519:iload           14
	//  238  521:aload           25
	//  239  523:iload           6
	//  240  525:aload           20
	//  241  527:aload           24
	//  242  529:invokevirtual   #594 <Method DashManifestParser$RepresentationInfo parseRepresentation(XmlPullParser, String, String, String, int, int, float, int, int, String, int, List, SegmentBase)>
	//  243  532:astore_2        
			i = checkContentTypeConsistency(i, getContentType(((RepresentationInfo) (s)).format));
	//  244  533:iload           5
	//  245  535:aload_0         
	//  246  536:aload_2         
	//  247  537:getfield        #401 <Field Format DashManifestParser$RepresentationInfo.format>
	//  248  540:invokevirtual   #596 <Method int getContentType(Format)>
	//  249  543:invokestatic    #572 <Method int checkContentTypeConsistency(int, int)>
	//  250  546:istore          5
			((List) (arraylist)).add(((Object) (s)));
	//  251  548:aload           17
	//  252  550:aload_2         
	//  253  551:invokeinterface #597 <Method boolean List.add(Object)>
	//  254  556:pop             
			segmentbase = ((SegmentBase) (xmlpullparser));
	//  255  557:aload_1         
	//  256  558:astore_3        
			s = ((String) (segmentbase2));
	//  257  559:aload           25
	//  258  561:astore_2        
			obj = obj2;
	//  259  562:aload           22
	//  260  564:astore          15
			break MISSING_BLOCK_LABEL_729;
	//  261  566:goto            729
		}
		segmentbase3 = segmentbase;
	//  262  569:aload_3         
	//  263  570:astore          25
		obj2 = ((Object) (s));
	//  264  572:aload_2         
	//  265  573:astore          22
		obj = ((Object) (xmlpullparser));
	//  266  575:aload_1         
	//  267  576:astore          15
		if(!XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "SegmentBase")) goto _L7; else goto _L6
	//  268  578:aload           15
	//  269  580:ldc2            #599 <String "SegmentBase">
	//  270  583:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//  271  586:ifeq            617
_L6:
		s = ((String) (parseSegmentBase(((XmlPullParser) (obj)), (SegmentBase.SingleSegmentBase)obj3)));
	//  272  589:aload_0         
	//  273  590:aload           15
	//  274  592:aload           24
	//  275  594:checkcast       #472 <Class SegmentBase$SingleSegmentBase>
	//  276  597:invokevirtual   #603 <Method SegmentBase$SingleSegmentBase parseSegmentBase(XmlPullParser, SegmentBase$SingleSegmentBase)>
	//  277  600:astore_2        
_L9:
		segmentbase = ((SegmentBase) (obj));
	//  278  601:aload           15
	//  279  603:astore_3        
		obj3 = ((Object) (s));
	//  280  604:aload_2         
	//  281  605:astore          24
		s = ((String) (segmentbase3));
	//  282  607:aload           25
	//  283  609:astore_2        
		obj = obj2;
	//  284  610:aload           22
	//  285  612:astore          15
		break MISSING_BLOCK_LABEL_729;
	//  286  614:goto            729
_L7:
		if(XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "SegmentList"))
	//* 287  617:aload           15
	//* 288  619:ldc2            #605 <String "SegmentList">
	//* 289  622:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 290  625:ifeq            643
		{
			s = ((String) (parseSegmentList(((XmlPullParser) (obj)), (SegmentBase.SegmentList)obj3)));
	//  291  628:aload_0         
	//  292  629:aload           15
	//  293  631:aload           24
	//  294  633:checkcast       #449 <Class SegmentBase$SegmentList>
	//  295  636:invokevirtual   #609 <Method SegmentBase$SegmentList parseSegmentList(XmlPullParser, SegmentBase$SegmentList)>
	//  296  639:astore_2        
			continue; /* Loop/switch isn't completed */
	//  297  640:goto            601
		}
		if(!XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "SegmentTemplate"))
			break; /* Loop/switch isn't completed */
	//  298  643:aload           15
	//  299  645:ldc2            #611 <String "SegmentTemplate">
	//  300  648:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//  301  651:ifeq            669
		s = ((String) (parseSegmentTemplate(((XmlPullParser) (obj)), (SegmentBase.SegmentTemplate)obj3)));
	//  302  654:aload_0         
	//  303  655:aload           15
	//  304  657:aload           24
	//  305  659:checkcast       #457 <Class SegmentBase$SegmentTemplate>
	//  306  662:invokevirtual   #615 <Method SegmentBase$SegmentTemplate parseSegmentTemplate(XmlPullParser, SegmentBase$SegmentTemplate)>
	//  307  665:astore_2        
		if(true) goto _L9; else goto _L8
	//  308  666:goto            601
_L8:
		if(XmlPullParserUtil.isStartTag(((XmlPullParser) (obj)), "InbandEventStream"))
	//* 309  669:aload           15
	//* 310  671:ldc2            #617 <String "InbandEventStream">
	//* 311  674:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 312  677:ifeq            701
		{
			arraylist1.add(((Object) (parseDescriptor(((XmlPullParser) (obj)), "InbandEventStream"))));
	//  313  680:aload           18
	//  314  682:aload           15
	//  315  684:ldc2            #617 <String "InbandEventStream">
	//  316  687:invokestatic    #586 <Method Descriptor parseDescriptor(XmlPullParser, String)>
	//  317  690:invokevirtual   #566 <Method boolean ArrayList.add(Object)>
	//  318  693:pop             
			obj2 = obj;
	//  319  694:aload           15
	//  320  696:astore          22
		} else
	//* 321  698:goto            721
		{
			obj2 = obj;
	//  322  701:aload           15
	//  323  703:astore          22
			if(XmlPullParserUtil.isStartTag(xmlpullparser))
	//* 324  705:aload_1         
	//* 325  706:invokestatic    #620 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser)>
	//* 326  709:ifeq            721
			{
				parseAdaptationSetChild(xmlpullparser);
	//  327  712:aload_0         
	//  328  713:aload_1         
	//  329  714:invokevirtual   #624 <Method void parseAdaptationSetChild(XmlPullParser)>
				obj2 = obj;
	//  330  717:aload           15
	//  331  719:astore          22
			}
		}
		obj = ((Object) (s));
	//  332  721:aload_2         
	//  333  722:astore          15
		s = ((String) (segmentbase));
	//  334  724:aload_3         
	//  335  725:astore_2        
		segmentbase = ((SegmentBase) (obj2));
	//  336  726:aload           22
	//  337  728:astore_3        
		if(XmlPullParserUtil.isEndTag(((XmlPullParser) (segmentbase)), "AdaptationSet"))
	//* 338  729:aload_3         
	//* 339  730:ldc2            #626 <String "AdaptationSet">
	//* 340  733:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//* 341  736:ifeq            825
		{
			xmlpullparser = ((XmlPullParser) (new ArrayList(((List) (arraylist)).size())));
	//  342  739:new             #87  <Class ArrayList>
	//  343  742:dup             
	//  344  743:aload           17
	//  345  745:invokeinterface #183 <Method int List.size()>
	//  346  750:invokespecial   #629 <Method void ArrayList(int)>
	//  347  753:astore_1        
			for(int k = 0; k < ((List) (arraylist)).size(); k++)
	//* 348  754:iconst_0        
	//* 349  755:istore          6
	//* 350  757:iload           6
	//* 351  759:aload           17
	//* 352  761:invokeinterface #183 <Method int List.size()>
	//* 353  766:icmpge          811
				((List) (xmlpullparser)).add(((Object) (buildRepresentation((RepresentationInfo)((List) (arraylist)).get(k), contentId, ((String) (obj1)), arraylist4, arraylist1))));
	//  354  769:aload_1         
	//  355  770:aload_0         
	//  356  771:aload           17
	//  357  773:iload           6
	//  358  775:invokeinterface #184 <Method Object List.get(int)>
	//  359  780:checkcast       #9   <Class DashManifestParser$RepresentationInfo>
	//  360  783:aload_0         
	//  361  784:getfield        #52  <Field String contentId>
	//  362  787:aload           16
	//  363  789:aload           21
	//  364  791:aload           18
	//  365  793:invokevirtual   #631 <Method Representation buildRepresentation(DashManifestParser$RepresentationInfo, String, String, ArrayList, ArrayList)>
	//  366  796:invokeinterface #597 <Method boolean List.add(Object)>
	//  367  801:pop             

	//  368  802:iload           6
	//  369  804:iconst_1        
	//  370  805:iadd            
	//  371  806:istore          6
	//* 372  808:goto            757
			return buildAdaptationSet(j1, i, ((List) (xmlpullparser)), ((List) (arraylist3)), ((List) (arraylist2)));
	//  373  811:aload_0         
	//  374  812:iload           11
	//  375  814:iload           5
	//  376  816:aload_1         
	//  377  817:aload           20
	//  378  819:aload           19
	//  379  821:invokevirtual   #633 <Method AdaptationSet buildAdaptationSet(int, int, List, List, List)>
	//  380  824:areturn         
		}
		SegmentBase segmentbase1 = segmentbase;
	//  381  825:aload_3         
	//  382  826:astore          22
		segmentbase = ((SegmentBase) (s));
	//  383  828:aload_2         
	//  384  829:astore_3        
		s = ((String) (obj));
	//  385  830:aload           15
	//  386  832:astore_2        
		obj = ((Object) (segmentbase1));
	//  387  833:aload           22
	//  388  835:astore          15
		if(true) goto _L11; else goto _L10
	//  389  837:goto            170
_L10:
	}

	protected void parseAdaptationSetChild(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
	//    0    0:return          
	}

	protected int parseAudioChannelConfiguration(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		String s = parseString(xmlpullparser, "schemeIdUri", ((String) (null)));
	//    0    0:aload_1         
	//    1    1:ldc1            #253 <String "schemeIdUri">
	//    2    3:aconst_null     
	//    3    4:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//    4    7:astore          4
		boolean flag = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(((Object) (s)));
	//    5    9:ldc2            #635 <String "urn:mpeg:dash:23003:3:audio_channel_configuration:2011">
	//    6   12:aload           4
	//    7   14:invokevirtual   #83  <Method boolean String.equals(Object)>
	//    8   17:istore_3        
		int i = -1;
	//    9   18:iconst_m1       
	//   10   19:istore_2        
		if(flag)
	//*  11   20:iload_3         
	//*  12   21:ifeq            36
			i = parseInt(xmlpullparser, "value", -1);
	//   13   24:aload_1         
	//   14   25:ldc2            #260 <String "value">
	//   15   28:iconst_m1       
	//   16   29:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   17   32:istore_2        
		else
	//*  18   33:goto            52
		if("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(((Object) (s))))
	//*  19   36:ldc2            #637 <String "tag:dolby.com,2014:dash:audio_channel_configuration:2011">
	//*  20   39:aload           4
	//*  21   41:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  22   44:ifeq            52
			i = parseDolbyChannelConfiguration(xmlpullparser);
	//   23   47:aload_1         
	//   24   48:invokestatic    #639 <Method int parseDolbyChannelConfiguration(XmlPullParser)>
	//   25   51:istore_2        
		do
			xmlpullparser.next();
	//   26   52:aload_1         
	//   27   53:invokeinterface #168 <Method int XmlPullParser.next()>
	//   28   58:pop             
		while(!XmlPullParserUtil.isEndTag(xmlpullparser, "AudioChannelConfiguration"));
	//   29   59:aload_1         
	//   30   60:ldc2            #579 <String "AudioChannelConfiguration">
	//   31   63:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//   32   66:ifeq            52
		return i;
	//   33   69:iload_2         
	//   34   70:ireturn         
	}

	protected Pair parseContentProtection(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		String s = xmlpullparser.getAttributeValue(((String) (null)), "schemeIdUri");
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc1            #253 <String "schemeIdUri">
	//    3    4:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    9:astore          5
		if(s == null) goto _L2; else goto _L1
	//    5   11:aload           5
	//    6   13:ifnull          282
_L1:
		int i;
label0:
		{
			s = Util.toLowerInvariant(s);
	//    7   16:aload           5
	//    8   18:invokestatic    #276 <Method String Util.toLowerInvariant(String)>
	//    9   21:astore          5
			i = s.hashCode();
	//   10   23:aload           5
	//   11   25:invokevirtual   #279 <Method int String.hashCode()>
	//   12   28:istore_2        
			if(i != 0x1d2c5beb)
	//*  13   29:iload_2         
	//*  14   30:ldc2            #640 <Int 0x1d2c5beb>
	//*  15   33:icmpeq          85
			{
				if(i != 0x2d06c692)
	//*  16   36:iload_2         
	//*  17   37:ldc2            #641 <Int 0x2d06c692>
	//*  18   40:icmpeq          69
				{
					if(i == 0x6c0c9d2a && s.equals("urn:mpeg:dash:mp4protection:2011"))
	//*  19   43:iload_2         
	//*  20   44:ldc2            #642 <Int 0x6c0c9d2a>
	//*  21   47:icmpeq          53
	//*  22   50:goto            101
	//*  23   53:aload           5
	//*  24   55:ldc2            #644 <String "urn:mpeg:dash:mp4protection:2011">
	//*  25   58:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  26   61:ifeq            101
					{
						i = 0;
	//   27   64:iconst_0        
	//   28   65:istore_2        
						break label0;
	//   29   66:goto            103
					}
				} else
				if(s.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"))
	//*  30   69:aload           5
	//*  31   71:ldc2            #646 <String "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed">
	//*  32   74:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  33   77:ifeq            101
				{
					i = 2;
	//   34   80:iconst_2        
	//   35   81:istore_2        
					break label0;
	//   36   82:goto            103
				}
			} else
			if(s.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"))
	//*  37   85:aload           5
	//*  38   87:ldc2            #648 <String "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95">
	//*  39   90:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  40   93:ifeq            101
			{
				i = 1;
	//   41   96:iconst_1        
	//   42   97:istore_2        
				break label0;
	//   43   98:goto            103
			}
			i = -1;
	//   44  101:iconst_m1       
	//   45  102:istore_2        
		}
		i;
	//   46  103:iload_2         
		JVM INSTR tableswitch 0 2: default 132
	//	               0 151
	//	               1 143
	//	               2 135;
	//   47  104:tableswitch     0 2: default 132
	//	               0 151
	//	               1 143
	//	               2 135
		   goto _L2 _L3 _L4 _L5
	//*  48  132:goto            282
_L5:
		byte abyte1[];
		abyte1 = ((byte []) (C.WIDEVINE_UUID));
	//   49  135:getstatic       #654 <Field UUID C.WIDEVINE_UUID>
	//   50  138:astore          6
		break; /* Loop/switch isn't completed */
	//   51  140:goto            148
_L4:
		abyte1 = ((byte []) (C.PLAYREADY_UUID));
	//   52  143:getstatic       #657 <Field UUID C.PLAYREADY_UUID>
	//   53  146:astore          6
		break; /* Loop/switch isn't completed */
	//   54  148:goto            285
_L3:
		boolean flag;
		byte abyte0[];
		Object obj;
		Object obj5;
		abyte0 = ((byte []) (xmlpullparser.getAttributeValue(((String) (null)), "value")));
	//   55  151:aload_1         
	//   56  152:aconst_null     
	//   57  153:ldc2            #260 <String "value">
	//   58  156:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   59  161:astore          5
		abyte1 = ((byte []) (XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlpullparser, "default_KID")));
	//   60  163:aload_1         
	//   61  164:ldc2            #659 <String "default_KID">
	//   62  167:invokestatic    #662 <Method String XmlPullParserUtil.getAttributeValueIgnorePrefix(XmlPullParser, String)>
	//   63  170:astore          6
		if(!TextUtils.isEmpty(((CharSequence) (abyte1))) && !"00000000-0000-0000-0000-000000000000".equals(((Object) (abyte1))))
	//*  64  172:aload           6
	//*  65  174:invokestatic    #315 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  66  177:ifne            268
	//*  67  180:ldc2            #664 <String "00000000-0000-0000-0000-000000000000">
	//*  68  183:aload           6
	//*  69  185:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  70  188:ifne            268
		{
			abyte1 = ((byte []) (((String) (abyte1)).split("\\s+")));
	//   71  191:aload           6
	//   72  193:ldc2            #666 <String "\\s+">
	//   73  196:invokevirtual   #670 <Method String[] String.split(String)>
	//   74  199:astore          6
			UUID auuid[] = new UUID[abyte1.length];
	//   75  201:aload           6
	//   76  203:arraylength     
	//   77  204:anewarray       UUID[]
	//   78  207:astore          7
			for(int j = 0; j < abyte1.length; j++)
	//*  79  209:iconst_0        
	//*  80  210:istore_2        
	//*  81  211:iload_2         
	//*  82  212:aload           6
	//*  83  214:arraylength     
	//*  84  215:icmpge          236
				auuid[j] = UUID.fromString(((String) (abyte1[j])));
	//   85  218:aload           7
	//   86  220:iload_2         
	//   87  221:aload           6
	//   88  223:iload_2         
	//   89  224:aaload          
	//   90  225:invokestatic    #676 <Method UUID UUID.fromString(String)>
	//   91  228:aastore         

	//   92  229:iload_2         
	//   93  230:iconst_1        
	//   94  231:iadd            
	//   95  232:istore_2        
	//*  96  233:goto            211
			obj = ((Object) (PsshAtomUtil.buildPsshAtom(C.COMMON_PSSH_UUID, auuid, ((byte []) (null)))));
	//   97  236:getstatic       #679 <Field UUID C.COMMON_PSSH_UUID>
	//   98  239:aload           7
	//   99  241:aconst_null     
	//  100  242:invokestatic    #685 <Method byte[] PsshAtomUtil.buildPsshAtom(UUID, UUID[], byte[])>
	//  101  245:astore          7
			abyte1 = ((byte []) (C.COMMON_PSSH_UUID));
	//  102  247:getstatic       #679 <Field UUID C.COMMON_PSSH_UUID>
	//  103  250:astore          6
			Object obj1 = null;
	//  104  252:aconst_null     
	//  105  253:astore          8
			flag = false;
	//  106  255:iconst_0        
	//  107  256:istore_3        
			obj5 = ((Object) (abyte0));
	//  108  257:aload           5
	//  109  259:astore          10
			abyte0 = ((byte []) (obj1));
	//  110  261:aload           8
	//  111  263:astore          5
			break MISSING_BLOCK_LABEL_305;
	//  112  265:goto            305
		}
		obj = ((Object) (abyte0));
	//  113  268:aload           5
	//  114  270:astore          7
		abyte1 = null;
	//  115  272:aconst_null     
	//  116  273:astore          6
		abyte0 = abyte1;
	//  117  275:aload           6
	//  118  277:astore          5
		break MISSING_BLOCK_LABEL_292;
	//  119  279:goto            292
_L2:
		abyte1 = null;
	//  120  282:aconst_null     
	//  121  283:astore          6
		obj = null;
	//  122  285:aconst_null     
	//  123  286:astore          7
		abyte0 = ((byte []) (obj));
	//  124  288:aload           7
	//  125  290:astore          5
		Object obj2 = null;
	//  126  292:aconst_null     
	//  127  293:astore          8
		flag = false;
	//  128  295:iconst_0        
	//  129  296:istore_3        
		obj5 = obj;
	//  130  297:aload           7
	//  131  299:astore          10
		obj = ((Object) (obj2));
	//  132  301:aload           8
	//  133  303:astore          7
_L11:
		xmlpullparser.next();
	//  134  305:aload_1         
	//  135  306:invokeinterface #168 <Method int XmlPullParser.next()>
	//  136  311:pop             
		if(!XmlPullParserUtil.isStartTag(xmlpullparser, "ms:laurl")) goto _L7; else goto _L6
	//  137  312:aload_1         
	//  138  313:ldc2            #687 <String "ms:laurl">
	//  139  316:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//  140  319:ifeq            355
_L6:
		boolean flag1;
		Object obj3;
		Object obj4;
		obj3 = ((Object) (xmlpullparser.getAttributeValue(((String) (null)), "licenseUrl")));
	//  141  322:aload_1         
	//  142  323:aconst_null     
	//  143  324:ldc2            #689 <String "licenseUrl">
	//  144  327:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//  145  332:astore          8
		flag1 = flag;
	//  146  334:iload_3         
	//  147  335:istore          4
		obj4 = obj;
	//  148  337:aload           7
	//  149  339:astore          9
_L9:
		abyte0 = ((byte []) (obj4));
	//  150  341:aload           9
	//  151  343:astore          5
		obj = ((Object) (abyte1));
	//  152  345:aload           6
	//  153  347:astore          7
		flag = flag1;
	//  154  349:iload           4
	//  155  351:istore_3        
		break; /* Loop/switch isn't completed */
	//  156  352:goto            599
_L7:
		if(XmlPullParserUtil.isStartTag(xmlpullparser, "widevine:license"))
	//* 157  355:aload_1         
	//* 158  356:ldc2            #691 <String "widevine:license">
	//* 159  359:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 160  362:ifeq            421
		{
			obj3 = ((Object) (xmlpullparser.getAttributeValue(((String) (null)), "robustness_level")));
	//  161  365:aload_1         
	//  162  366:aconst_null     
	//  163  367:ldc2            #693 <String "robustness_level">
	//  164  370:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//  165  375:astore          8
			if(obj3 != null && ((String) (obj3)).startsWith("HW"))
	//* 166  377:aload           8
	//* 167  379:ifnull          407
	//* 168  382:aload           8
	//* 169  384:ldc2            #695 <String "HW">
	//* 170  387:invokevirtual   #698 <Method boolean String.startsWith(String)>
	//* 171  390:ifeq            407
			{
				flag1 = true;
	//  172  393:iconst_1        
	//  173  394:istore          4
				obj4 = obj;
	//  174  396:aload           7
	//  175  398:astore          9
				obj3 = ((Object) (abyte0));
	//  176  400:aload           5
	//  177  402:astore          8
			} else
	//* 178  404:goto            341
			{
				flag1 = false;
	//  179  407:iconst_0        
	//  180  408:istore          4
				obj4 = obj;
	//  181  410:aload           7
	//  182  412:astore          9
				obj3 = ((Object) (abyte0));
	//  183  414:aload           5
	//  184  416:astore          8
			}
			continue; /* Loop/switch isn't completed */
	//  185  418:goto            341
		}
		obj4 = obj;
	//  186  421:aload           7
	//  187  423:astore          9
		obj3 = ((Object) (abyte0));
	//  188  425:aload           5
	//  189  427:astore          8
		flag1 = flag;
	//  190  429:iload_3         
	//  191  430:istore          4
		if(obj != null)
			continue; /* Loop/switch isn't completed */
	//  192  432:aload           7
	//  193  434:ifnonnull       341
		if(XmlPullParserUtil.isStartTagIgnorePrefix(xmlpullparser, "pssh") && xmlpullparser.next() == 4)
	//* 194  437:aload_1         
	//* 195  438:ldc2            #700 <String "pssh">
	//* 196  441:invokestatic    #703 <Method boolean XmlPullParserUtil.isStartTagIgnorePrefix(XmlPullParser, String)>
	//* 197  444:ifeq            507
	//* 198  447:aload_1         
	//* 199  448:invokeinterface #168 <Method int XmlPullParser.next()>
	//* 200  453:iconst_4        
	//* 201  454:icmpne          507
		{
			abyte1 = Base64.decode(xmlpullparser.getText(), 0);
	//  202  457:aload_1         
	//  203  458:invokeinterface #172 <Method String XmlPullParser.getText()>
	//  204  463:iconst_0        
	//  205  464:invokestatic    #709 <Method byte[] Base64.decode(String, int)>
	//  206  467:astore          6
			obj = ((Object) (PsshAtomUtil.parseUuid(abyte1)));
	//  207  469:aload           6
	//  208  471:invokestatic    #713 <Method UUID PsshAtomUtil.parseUuid(byte[])>
	//  209  474:astore          7
			if(obj == null)
	//* 210  476:aload           7
	//* 211  478:ifnonnull       496
			{
				Log.w("MpdParser", "Skipping malformed cenc:pssh data");
	//  212  481:ldc1            #18  <String "MpdParser">
	//  213  483:ldc2            #715 <String "Skipping malformed cenc:pssh data">
	//  214  486:invokestatic    #231 <Method int Log.w(String, String)>
	//  215  489:pop             
				abyte1 = null;
	//  216  490:aconst_null     
	//  217  491:astore          6
			}
	//* 218  493:goto            496
			obj3 = ((Object) (abyte0));
	//  219  496:aload           5
	//  220  498:astore          8
			abyte0 = abyte1;
	//  221  500:aload           6
	//  222  502:astore          5
			break; /* Loop/switch isn't completed */
	//  223  504:goto            352
		}
		obj4 = obj;
	//  224  507:aload           7
	//  225  509:astore          9
		obj3 = ((Object) (abyte0));
	//  226  511:aload           5
	//  227  513:astore          8
		flag1 = flag;
	//  228  515:iload_3         
	//  229  516:istore          4
		if(C.PLAYREADY_UUID.equals(((Object) (abyte1))))
	//* 230  518:getstatic       #657 <Field UUID C.PLAYREADY_UUID>
	//* 231  521:aload           6
	//* 232  523:invokevirtual   #716 <Method boolean UUID.equals(Object)>
	//* 233  526:ifeq            341
		{
			obj4 = obj;
	//  234  529:aload           7
	//  235  531:astore          9
			obj3 = ((Object) (abyte0));
	//  236  533:aload           5
	//  237  535:astore          8
			flag1 = flag;
	//  238  537:iload_3         
	//  239  538:istore          4
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "mspr:pro"))
	//* 240  540:aload_1         
	//* 241  541:ldc2            #718 <String "mspr:pro">
	//* 242  544:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 243  547:ifeq            341
			{
				obj4 = obj;
	//  244  550:aload           7
	//  245  552:astore          9
				obj3 = ((Object) (abyte0));
	//  246  554:aload           5
	//  247  556:astore          8
				flag1 = flag;
	//  248  558:iload_3         
	//  249  559:istore          4
				if(xmlpullparser.next() == 4)
	//* 250  561:aload_1         
	//* 251  562:invokeinterface #168 <Method int XmlPullParser.next()>
	//* 252  567:iconst_4        
	//* 253  568:icmpne          341
				{
					obj4 = ((Object) (PsshAtomUtil.buildPsshAtom(C.PLAYREADY_UUID, Base64.decode(xmlpullparser.getText(), 0))));
	//  254  571:getstatic       #657 <Field UUID C.PLAYREADY_UUID>
	//  255  574:aload_1         
	//  256  575:invokeinterface #172 <Method String XmlPullParser.getText()>
	//  257  580:iconst_0        
	//  258  581:invokestatic    #709 <Method byte[] Base64.decode(String, int)>
	//  259  584:invokestatic    #721 <Method byte[] PsshAtomUtil.buildPsshAtom(UUID, byte[])>
	//  260  587:astore          9
					obj3 = ((Object) (abyte0));
	//  261  589:aload           5
	//  262  591:astore          8
					flag1 = flag;
	//  263  593:iload_3         
	//  264  594:istore          4
				}
			}
		}
		if(true) goto _L9; else goto _L8
	//  265  596:goto            341
_L8:
		if(XmlPullParserUtil.isEndTag(xmlpullparser, "ContentProtection"))
	//* 266  599:aload_1         
	//* 267  600:ldc2            #550 <String "ContentProtection">
	//* 268  603:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//* 269  606:ifeq            644
		{
			if(obj != null)
	//* 270  609:aload           7
	//* 271  611:ifnull          635
				xmlpullparser = ((XmlPullParser) (new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(((UUID) (obj)), ((String) (obj3)), "video/mp4", abyte0, flag)));
	//  272  614:new             #97  <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
	//  273  617:dup             
	//  274  618:aload           7
	//  275  620:aload           8
	//  276  622:ldc2            #723 <String "video/mp4">
	//  277  625:aload           5
	//  278  627:iload_3         
	//  279  628:invokespecial   #726 <Method void com.google.android.exoplayer2.drm.DrmInitData$SchemeData(UUID, String, String, byte[], boolean)>
	//  280  631:astore_1        
			else
	//* 281  632:goto            637
				xmlpullparser = null;
	//  282  635:aconst_null     
	//  283  636:astore_1        
			return Pair.create(obj5, ((Object) (xmlpullparser)));
	//  284  637:aload           10
	//  285  639:aload_1         
	//  286  640:invokestatic    #730 <Method Pair Pair.create(Object, Object)>
	//  287  643:areturn         
		}
		abyte1 = ((byte []) (obj));
	//  288  644:aload           7
	//  289  646:astore          6
		obj = ((Object) (abyte0));
	//  290  648:aload           5
	//  291  650:astore          7
		abyte0 = ((byte []) (obj3));
	//  292  652:aload           8
	//  293  654:astore          5
		if(true) goto _L11; else goto _L10
	//  294  656:goto            305
_L10:
	}

	protected int parseContentType(XmlPullParser xmlpullparser)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "contentType")));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc2            #733 <String "contentType">
	//    3    5:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore_1        
		boolean flag = TextUtils.isEmpty(((CharSequence) (xmlpullparser)));
	//    5   11:aload_1         
	//    6   12:invokestatic    #315 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//*  14   24:ldc2            #735 <String "audio">
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  17   31:ifeq            36
			return 1;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		if("video".equals(((Object) (xmlpullparser))))
	//*  20   36:ldc2            #737 <String "video">
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  23   43:ifeq            48
			return 2;
	//   24   46:iconst_2        
	//   25   47:ireturn         
		if("text".equals(((Object) (xmlpullparser))))
	//*  26   48:ldc2            #739 <String "text">
	//*  27   51:aload_1         
	//*  28   52:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  29   55:ifeq            60
			byte0 = 3;
	//   30   58:iconst_3        
	//   31   59:istore_2        
		return ((int) (byte0));
	//   32   60:iload_2         
	//   33   61:ireturn         
	}

	protected EventMessage parseEvent(XmlPullParser xmlpullparser, String s, String s1, long l, ByteArrayOutputStream bytearrayoutputstream)
		throws IOException, XmlPullParserException
	{
		long l1 = parseLong(xmlpullparser, "id", 0L);
	//    0    0:aload_1         
	//    1    1:ldc2            #262 <String "id">
	//    2    4:lconst_0        
	//    3    5:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//    4    8:lstore          7
		long l3 = parseLong(xmlpullparser, "duration", 0x1L);
	//    5   10:aload_1         
	//    6   11:ldc2            #745 <String "duration">
	//    7   14:ldc2w           #746 <Long 0x1L>
	//    8   17:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//    9   20:lstore          11
		long l2 = parseLong(xmlpullparser, "presentationTime", 0L);
	//   10   22:aload_1         
	//   11   23:ldc2            #749 <String "presentationTime">
	//   12   26:lconst_0        
	//   13   27:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   14   30:lstore          9
		l3 = Util.scaleLargeTimestamp(l3, 1000L, l);
	//   15   32:lload           11
	//   16   34:ldc2w           #750 <Long 1000L>
	//   17   37:lload           4
	//   18   39:invokestatic    #755 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   19   42:lstore          11
		l = Util.scaleLargeTimestamp(l2, 0xf4240L, l);
	//   20   44:lload           9
	//   21   46:ldc2w           #756 <Long 0xf4240L>
	//   22   49:lload           4
	//   23   51:invokestatic    #755 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   24   54:lstore          4
		return buildEvent(s, s1, l1, l3, parseEventObject(xmlpullparser, bytearrayoutputstream), l);
	//   25   56:aload_0         
	//   26   57:aload_2         
	//   27   58:aload_3         
	//   28   59:lload           7
	//   29   61:lload           11
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:aload           6
	//   33   67:invokevirtual   #761 <Method byte[] parseEventObject(XmlPullParser, ByteArrayOutputStream)>
	//   34   70:lload           4
	//   35   72:invokevirtual   #763 <Method EventMessage buildEvent(String, String, long, long, byte[], long)>
	//   36   75:areturn         
	}

	protected byte[] parseEventObject(XmlPullParser xmlpullparser, ByteArrayOutputStream bytearrayoutputstream)
		throws XmlPullParserException, IOException
	{
		bytearrayoutputstream.reset();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #768 <Method void ByteArrayOutputStream.reset()>
		XmlSerializer xmlserializer = Xml.newSerializer();
	//    2    4:invokestatic    #774 <Method XmlSerializer Xml.newSerializer()>
	//    3    7:astore          5
		xmlserializer.setOutput(((java.io.OutputStream) (bytearrayoutputstream)), ((String) (null)));
	//    4    9:aload           5
	//    5   11:aload_2         
	//    6   12:aconst_null     
	//    7   13:invokeinterface #780 <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
		xmlpullparser.nextToken();
	//    8   18:aload_1         
	//    9   19:invokeinterface #783 <Method int XmlPullParser.nextToken()>
	//   10   24:pop             
		for(; !XmlPullParserUtil.isEndTag(xmlpullparser, "Event"); xmlpullparser.nextToken())
	//*  11   25:aload_1         
	//*  12   26:ldc2            #785 <String "Event">
	//*  13   29:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//*  14   32:ifne            341
		{
			int j = xmlpullparser.getEventType();
	//   15   35:aload_1         
	//   16   36:invokeinterface #788 <Method int XmlPullParser.getEventType()>
	//   17   41:istore          4
			int i = 0;
	//   18   43:iconst_0        
	//   19   44:istore_3        
			switch(j)
	//*  20   45:iload           4
			{
			default:
				break;

	//*  21   47:tableswitch     0 10: default 104
	//	               0 319
	//	               1 309
	//	               2 243
	//	               3 220
	//	               4 203
	//	               5 187
	//	               6 171
	//	               7 155
	//	               8 139
	//	               9 123
	//	               10 107
	//*  22  104:goto            331
			case 10: // '\n'
				xmlserializer.docdecl(xmlpullparser.getText());
	//   23  107:aload           5
	//   24  109:aload_1         
	//   25  110:invokeinterface #172 <Method String XmlPullParser.getText()>
	//   26  115:invokeinterface #791 <Method void XmlSerializer.docdecl(String)>
				break;
	//   27  120:goto            331

			case 9: // '\t'
				xmlserializer.comment(xmlpullparser.getText());
	//   28  123:aload           5
	//   29  125:aload_1         
	//   30  126:invokeinterface #172 <Method String XmlPullParser.getText()>
	//   31  131:invokeinterface #794 <Method void XmlSerializer.comment(String)>
				break;
	//   32  136:goto            331

			case 8: // '\b'
				xmlserializer.processingInstruction(xmlpullparser.getText());
	//   33  139:aload           5
	//   34  141:aload_1         
	//   35  142:invokeinterface #172 <Method String XmlPullParser.getText()>
	//   36  147:invokeinterface #797 <Method void XmlSerializer.processingInstruction(String)>
				break;
	//   37  152:goto            331

			case 7: // '\007'
				xmlserializer.ignorableWhitespace(xmlpullparser.getText());
	//   38  155:aload           5
	//   39  157:aload_1         
	//   40  158:invokeinterface #172 <Method String XmlPullParser.getText()>
	//   41  163:invokeinterface #800 <Method void XmlSerializer.ignorableWhitespace(String)>
				break;
	//   42  168:goto            331

			case 6: // '\006'
				xmlserializer.entityRef(xmlpullparser.getText());
	//   43  171:aload           5
	//   44  173:aload_1         
	//   45  174:invokeinterface #172 <Method String XmlPullParser.getText()>
	//   46  179:invokeinterface #803 <Method void XmlSerializer.entityRef(String)>
				break;
	//   47  184:goto            331

			case 5: // '\005'
				xmlserializer.cdsect(xmlpullparser.getText());
	//   48  187:aload           5
	//   49  189:aload_1         
	//   50  190:invokeinterface #172 <Method String XmlPullParser.getText()>
	//   51  195:invokeinterface #806 <Method void XmlSerializer.cdsect(String)>
				break;
	//   52  200:goto            331

			case 4: // '\004'
				xmlserializer.text(xmlpullparser.getText());
	//   53  203:aload           5
	//   54  205:aload_1         
	//   55  206:invokeinterface #172 <Method String XmlPullParser.getText()>
	//   56  211:invokeinterface #809 <Method XmlSerializer XmlSerializer.text(String)>
	//   57  216:pop             
				break;
	//   58  217:goto            331

			case 3: // '\003'
				xmlserializer.endTag(xmlpullparser.getNamespace(), xmlpullparser.getName());
	//   59  220:aload           5
	//   60  222:aload_1         
	//   61  223:invokeinterface #812 <Method String XmlPullParser.getNamespace()>
	//   62  228:aload_1         
	//   63  229:invokeinterface #502 <Method String XmlPullParser.getName()>
	//   64  234:invokeinterface #816 <Method XmlSerializer XmlSerializer.endTag(String, String)>
	//   65  239:pop             
				break;
	//   66  240:goto            331

			case 2: // '\002'
				xmlserializer.startTag(xmlpullparser.getNamespace(), xmlpullparser.getName());
	//   67  243:aload           5
	//   68  245:aload_1         
	//   69  246:invokeinterface #812 <Method String XmlPullParser.getNamespace()>
	//   70  251:aload_1         
	//   71  252:invokeinterface #502 <Method String XmlPullParser.getName()>
	//   72  257:invokeinterface #819 <Method XmlSerializer XmlSerializer.startTag(String, String)>
	//   73  262:pop             
				for(; i < xmlpullparser.getAttributeCount(); i++)
	//*  74  263:iload_3         
	//*  75  264:aload_1         
	//*  76  265:invokeinterface #822 <Method int XmlPullParser.getAttributeCount()>
	//*  77  270:icmpge          331
					xmlserializer.attribute(xmlpullparser.getAttributeNamespace(i), xmlpullparser.getAttributeName(i), xmlpullparser.getAttributeValue(i));
	//   78  273:aload           5
	//   79  275:aload_1         
	//   80  276:iload_3         
	//   81  277:invokeinterface #825 <Method String XmlPullParser.getAttributeNamespace(int)>
	//   82  282:aload_1         
	//   83  283:iload_3         
	//   84  284:invokeinterface #828 <Method String XmlPullParser.getAttributeName(int)>
	//   85  289:aload_1         
	//   86  290:iload_3         
	//   87  291:invokeinterface #830 <Method String XmlPullParser.getAttributeValue(int)>
	//   88  296:invokeinterface #834 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//   89  301:pop             

	//   90  302:iload_3         
	//   91  303:iconst_1        
	//   92  304:iadd            
	//   93  305:istore_3        
				break;

	//*  94  306:goto            263
			case 1: // '\001'
				xmlserializer.endDocument();
	//   95  309:aload           5
	//   96  311:invokeinterface #837 <Method void XmlSerializer.endDocument()>
				break;

	//*  97  316:goto            331
			case 0: // '\0'
				xmlserializer.startDocument(((String) (null)), Boolean.valueOf(false));
	//   98  319:aload           5
	//   99  321:aconst_null     
	//  100  322:iconst_0        
	//  101  323:invokestatic    #843 <Method Boolean Boolean.valueOf(boolean)>
	//  102  326:invokeinterface #847 <Method void XmlSerializer.startDocument(String, Boolean)>
				break;
			}
		}

	//  103  331:aload_1         
	//  104  332:invokeinterface #783 <Method int XmlPullParser.nextToken()>
	//  105  337:pop             
	//* 106  338:goto            25
		xmlserializer.flush();
	//  107  341:aload           5
	//  108  343:invokeinterface #850 <Method void XmlSerializer.flush()>
		return bytearrayoutputstream.toByteArray();
	//  109  348:aload_2         
	//  110  349:invokevirtual   #854 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  111  352:areturn         
	}

	protected EventStream parseEventStream(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		String s = parseString(xmlpullparser, "schemeIdUri", "");
	//    0    0:aload_1         
	//    1    1:ldc1            #253 <String "schemeIdUri">
	//    2    3:ldc1            #255 <String "">
	//    3    5:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//    4    8:astore          5
		String s1 = parseString(xmlpullparser, "value", "");
	//    5   10:aload_1         
	//    6   11:ldc2            #260 <String "value">
	//    7   14:ldc1            #255 <String "">
	//    8   16:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//    9   19:astore          6
		long l = parseLong(xmlpullparser, "timescale", 1L);
	//   10   21:aload_1         
	//   11   22:ldc2            #858 <String "timescale">
	//   12   25:lconst_1        
	//   13   26:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   14   29:lstore_3        
		ArrayList arraylist = new ArrayList();
	//   15   30:new             #87  <Class ArrayList>
	//   16   33:dup             
	//   17   34:invokespecial   #541 <Method void ArrayList()>
	//   18   37:astore          7
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
	//   19   39:new             #765 <Class ByteArrayOutputStream>
	//   20   42:dup             
	//   21   43:sipush          512
	//   22   46:invokespecial   #859 <Method void ByteArrayOutputStream(int)>
	//   23   49:astore          8
		do
		{
			xmlpullparser.next();
	//   24   51:aload_1         
	//   25   52:invokeinterface #168 <Method int XmlPullParser.next()>
	//   26   57:pop             
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "Event"))
	//*  27   58:aload_1         
	//*  28   59:ldc2            #785 <String "Event">
	//*  29   62:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  30   65:ifeq            88
				((List) (arraylist)).add(((Object) (parseEvent(xmlpullparser, s, s1, l, bytearrayoutputstream))));
	//   31   68:aload           7
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:aload           5
	//   35   74:aload           6
	//   36   76:lload_3         
	//   37   77:aload           8
	//   38   79:invokevirtual   #861 <Method EventMessage parseEvent(XmlPullParser, String, String, long, ByteArrayOutputStream)>
	//   39   82:invokeinterface #597 <Method boolean List.add(Object)>
	//   40   87:pop             
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "EventStream"));
	//   41   88:aload_1         
	//   42   89:ldc2            #863 <String "EventStream">
	//   43   92:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//   44   95:ifeq            51
		xmlpullparser = ((XmlPullParser) (new long[((List) (arraylist)).size()]));
	//   45   98:aload           7
	//   46  100:invokeinterface #183 <Method int List.size()>
	//   47  105:newarray        long[]
	//   48  107:astore_1        
		EventMessage aeventmessage[] = new EventMessage[((List) (arraylist)).size()];
	//   49  108:aload           7
	//   50  110:invokeinterface #183 <Method int List.size()>
	//   51  115:anewarray       EventMessage[]
	//   52  118:astore          8
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  53  120:iconst_0        
	//*  54  121:istore_2        
	//*  55  122:iload_2         
	//*  56  123:aload           7
	//*  57  125:invokeinterface #183 <Method int List.size()>
	//*  58  130:icmpge          167
		{
			EventMessage eventmessage = (EventMessage)((List) (arraylist)).get(i);
	//   59  133:aload           7
	//   60  135:iload_2         
	//   61  136:invokeinterface #184 <Method Object List.get(int)>
	//   62  141:checkcast       #333 <Class EventMessage>
	//   63  144:astore          9
			xmlpullparser[i] = eventmessage.presentationTimeUs;
	//   64  146:aload_1         
	//   65  147:iload_2         
	//   66  148:aload           9
	//   67  150:getfield        #866 <Field long EventMessage.presentationTimeUs>
	//   68  153:lastore         
			aeventmessage[i] = eventmessage;
	//   69  154:aload           8
	//   70  156:iload_2         
	//   71  157:aload           9
	//   72  159:aastore         
		}

	//   73  160:iload_2         
	//   74  161:iconst_1        
	//   75  162:iadd            
	//   76  163:istore_2        
	//*  77  164:goto            122
		return buildEventStream(s, s1, l, ((long []) (xmlpullparser)), aeventmessage);
	//   78  167:aload_0         
	//   79  168:aload           5
	//   80  170:aload           6
	//   81  172:lload_3         
	//   82  173:aload_1         
	//   83  174:aload           8
	//   84  176:invokevirtual   #868 <Method EventStream buildEventStream(String, String, long, long[], EventMessage[])>
	//   85  179:areturn         
	}

	protected RangedUri parseInitialization(XmlPullParser xmlpullparser)
	{
		return parseRangedUrl(xmlpullparser, "sourceURL", "range");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #872 <String "sourceURL">
	//    3    5:ldc2            #874 <String "range">
	//    4    8:invokevirtual   #878 <Method RangedUri parseRangedUrl(XmlPullParser, String, String)>
	//    5   11:areturn         
	}

	protected DashManifest parseMediaPresentationDescription(XmlPullParser xmlpullparser, String s)
		throws XmlPullParserException, IOException
	{
		long l6 = parseDateTime(xmlpullparser, "availabilityStartTime", 0x1L);
	//    0    0:aload_1         
	//    1    1:ldc2            #880 <String "availabilityStartTime">
	//    2    4:ldc2w           #746 <Long 0x1L>
	//    3    7:invokestatic    #882 <Method long parseDateTime(XmlPullParser, String, long)>
	//    4   10:lstore          17
		long l5 = parseDuration(xmlpullparser, "mediaPresentationDuration", 0x1L);
	//    5   12:aload_1         
	//    6   13:ldc2            #884 <String "mediaPresentationDuration">
	//    7   16:ldc2w           #746 <Long 0x1L>
	//    8   19:invokestatic    #886 <Method long parseDuration(XmlPullParser, String, long)>
	//    9   22:lstore          15
		long l7 = parseDuration(xmlpullparser, "minBufferTime", 0x1L);
	//   10   24:aload_1         
	//   11   25:ldc2            #888 <String "minBufferTime">
	//   12   28:ldc2w           #746 <Long 0x1L>
	//   13   31:invokestatic    #886 <Method long parseDuration(XmlPullParser, String, long)>
	//   14   34:lstore          19
		Object obj = ((Object) (xmlpullparser.getAttributeValue(((String) (null)), "type")));
	//   15   36:aload_1         
	//   16   37:aconst_null     
	//   17   38:ldc2            #890 <String "type">
	//   18   41:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   19   46:astore          24
		boolean flag = false;
	//   20   48:iconst_0        
	//   21   49:istore_3        
		boolean flag2;
		if(obj != null && "dynamic".equals(obj))
	//*  22   50:aload           24
	//*  23   52:ifnull          72
	//*  24   55:ldc2            #892 <String "dynamic">
	//*  25   58:aload           24
	//*  26   60:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  27   63:ifeq            72
			flag2 = true;
	//   28   66:iconst_1        
	//   29   67:istore          23
		else
	//*  30   69:goto            75
			flag2 = false;
	//   31   72:iconst_0        
	//   32   73:istore          23
		long l1;
		if(flag2)
	//*  33   75:iload           23
	//*  34   77:ifeq            95
			l1 = parseDuration(xmlpullparser, "minimumUpdatePeriod", 0x1L);
	//   35   80:aload_1         
	//   36   81:ldc2            #894 <String "minimumUpdatePeriod">
	//   37   84:ldc2w           #746 <Long 0x1L>
	//   38   87:invokestatic    #886 <Method long parseDuration(XmlPullParser, String, long)>
	//   39   90:lstore          7
		else
	//*  40   92:goto            100
			l1 = 0x1L;
	//   41   95:ldc2w           #746 <Long 0x1L>
	//   42   98:lstore          7
		long l;
		if(flag2)
	//*  43  100:iload           23
	//*  44  102:ifeq            120
			l = parseDuration(xmlpullparser, "timeShiftBufferDepth", 0x1L);
	//   45  105:aload_1         
	//   46  106:ldc2            #896 <String "timeShiftBufferDepth">
	//   47  109:ldc2w           #746 <Long 0x1L>
	//   48  112:invokestatic    #886 <Method long parseDuration(XmlPullParser, String, long)>
	//   49  115:lstore          5
		else
	//*  50  117:goto            125
			l = 0x1L;
	//   51  120:ldc2w           #746 <Long 0x1L>
	//   52  123:lstore          5
		long l3;
		if(flag2)
	//*  53  125:iload           23
	//*  54  127:ifeq            145
			l3 = parseDuration(xmlpullparser, "suggestedPresentationDelay", 0x1L);
	//   55  130:aload_1         
	//   56  131:ldc2            #898 <String "suggestedPresentationDelay">
	//   57  134:ldc2w           #746 <Long 0x1L>
	//   58  137:invokestatic    #886 <Method long parseDuration(XmlPullParser, String, long)>
	//   59  140:lstore          11
		else
	//*  60  142:goto            150
			l3 = 0x1L;
	//   61  145:ldc2w           #746 <Long 0x1L>
	//   62  148:lstore          11
		long l8 = parseDateTime(xmlpullparser, "publishTime", 0x1L);
	//   63  150:aload_1         
	//   64  151:ldc2            #900 <String "publishTime">
	//   65  154:ldc2w           #746 <Long 0x1L>
	//   66  157:invokestatic    #882 <Method long parseDateTime(XmlPullParser, String, long)>
	//   67  160:lstore          21
		ArrayList arraylist = new ArrayList();
	//   68  162:new             #87  <Class ArrayList>
	//   69  165:dup             
	//   70  166:invokespecial   #541 <Method void ArrayList()>
	//   71  169:astore          26
		long l2;
		if(flag2)
	//*  72  171:iload           23
	//*  73  173:ifeq            184
			l2 = 0x1L;
	//   74  176:ldc2w           #746 <Long 0x1L>
	//   75  179:lstore          9
		else
	//*  76  181:goto            187
			l2 = 0L;
	//   77  184:lconst_0        
	//   78  185:lstore          9
		long l4 = l2;
	//   79  187:lload           9
	//   80  189:lstore          13
		Uri uri = null;
	//   81  191:aconst_null     
	//   82  192:astore          25
		obj = null;
	//   83  194:aconst_null     
	//   84  195:astore          24
		boolean flag1 = false;
	//   85  197:iconst_0        
	//   86  198:istore          4
		l2 = l;
	//   87  200:lload           5
	//   88  202:lstore          9
		l = l4;
	//   89  204:lload           13
	//   90  206:lstore          5
		do
		{
			xmlpullparser.next();
	//   91  208:aload_1         
	//   92  209:invokeinterface #168 <Method int XmlPullParser.next()>
	//   93  214:pop             
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "BaseURL"))
	//*  94  215:aload_1         
	//*  95  216:ldc2            #543 <String "BaseURL">
	//*  96  219:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  97  222:ifeq            243
			{
				if(!flag)
	//*  98  225:iload_3         
	//*  99  226:ifne            240
				{
					s = parseBaseUrl(xmlpullparser, s);
	//  100  229:aload_1         
	//  101  230:aload_2         
	//  102  231:invokestatic    #548 <Method String parseBaseUrl(XmlPullParser, String)>
	//  103  234:astore_2        
					flag = true;
	//  104  235:iconst_1        
	//  105  236:istore_3        
				}
			} else
	//* 106  237:goto            435
	//* 107  240:goto            435
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "UTCTiming"))
	//* 108  243:aload_1         
	//* 109  244:ldc2            #902 <String "UTCTiming">
	//* 110  247:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 111  250:ifeq            263
				obj = ((Object) (parseUtcTiming(xmlpullparser)));
	//  112  253:aload_0         
	//  113  254:aload_1         
	//  114  255:invokevirtual   #906 <Method UtcTimingElement parseUtcTiming(XmlPullParser)>
	//  115  258:astore          24
			else
	//* 116  260:goto            435
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "Location"))
	//* 117  263:aload_1         
	//* 118  264:ldc2            #908 <String "Location">
	//* 119  267:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 120  270:ifeq            287
				uri = Uri.parse(xmlpullparser.nextText());
	//  121  273:aload_1         
	//  122  274:invokeinterface #911 <Method String XmlPullParser.nextText()>
	//  123  279:invokestatic    #914 <Method Uri Uri.parse(String)>
	//  124  282:astore          25
			else
	//* 125  284:goto            260
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "Period") && !flag1)
	//* 126  287:aload_1         
	//* 127  288:ldc2            #916 <String "Period">
	//* 128  291:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 129  294:ifeq            240
	//* 130  297:iload           4
	//* 131  299:ifne            240
			{
				Pair pair = parsePeriod(xmlpullparser, s, l);
	//  132  302:aload_0         
	//  133  303:aload_1         
	//  134  304:aload_2         
	//  135  305:lload           5
	//  136  307:invokevirtual   #920 <Method Pair parsePeriod(XmlPullParser, String, long)>
	//  137  310:astore          27
				Period period = (Period)pair.first;
	//  138  312:aload           27
	//  139  314:getfield        #560 <Field Object Pair.first>
	//  140  317:checkcast       #384 <Class Period>
	//  141  320:astore          28
				if(period.startMs == 0x1L)
	//* 142  322:aload           28
	//* 143  324:getfield        #923 <Field long Period.startMs>
	//* 144  327:ldc2w           #746 <Long 0x1L>
	//* 145  330:lcmp            
	//* 146  331:ifne            385
				{
					if(flag2)
	//* 147  334:iload           23
	//* 148  336:ifeq            345
					{
						flag1 = true;
	//  149  339:iconst_1        
	//  150  340:istore          4
					} else
	//* 151  342:goto            435
					{
						xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  152  345:new             #215 <Class StringBuilder>
	//  153  348:dup             
	//  154  349:invokespecial   #216 <Method void StringBuilder()>
	//  155  352:astore_1        
						((StringBuilder) (xmlpullparser)).append("Unable to determine start of period ");
	//  156  353:aload_1         
	//  157  354:ldc2            #925 <String "Unable to determine start of period ">
	//  158  357:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//  159  360:pop             
						((StringBuilder) (xmlpullparser)).append(((List) (arraylist)).size());
	//  160  361:aload_1         
	//  161  362:aload           26
	//  162  364:invokeinterface #183 <Method int List.size()>
	//  163  369:invokevirtual   #928 <Method StringBuilder StringBuilder.append(int)>
	//  164  372:pop             
						throw new ParserException(((StringBuilder) (xmlpullparser)).toString());
	//  165  373:new             #241 <Class ParserException>
	//  166  376:dup             
	//  167  377:aload_1         
	//  168  378:invokevirtual   #225 <Method String StringBuilder.toString()>
	//  169  381:invokespecial   #512 <Method void ParserException(String)>
	//  170  384:athrow          
					}
				} else
				{
					l = ((Long)pair.second).longValue();
	//  171  385:aload           27
	//  172  387:getfield        #563 <Field Object Pair.second>
	//  173  390:checkcast       #319 <Class Long>
	//  174  393:invokevirtual   #932 <Method long Long.longValue()>
	//  175  396:lstore          5
					if(l == 0x1L)
	//* 176  398:lload           5
	//* 177  400:ldc2w           #746 <Long 0x1L>
	//* 178  403:lcmp            
	//* 179  404:ifne            415
						l = 0x1L;
	//  180  407:ldc2w           #746 <Long 0x1L>
	//  181  410:lstore          5
					else
	//* 182  412:goto            425
						l = period.startMs + l;
	//  183  415:aload           28
	//  184  417:getfield        #923 <Field long Period.startMs>
	//  185  420:lload           5
	//  186  422:ladd            
	//  187  423:lstore          5
					((List) (arraylist)).add(((Object) (period)));
	//  188  425:aload           26
	//  189  427:aload           28
	//  190  429:invokeinterface #597 <Method boolean List.add(Object)>
	//  191  434:pop             
				}
			}
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "MPD"));
	//  192  435:aload_1         
	//  193  436:ldc2            #499 <String "MPD">
	//  194  439:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//  195  442:ifeq            542
		l4 = l5;
	//  196  445:lload           15
	//  197  447:lstore          13
		if(l5 == 0x1L)
	//* 198  449:lload           15
	//* 199  451:ldc2w           #746 <Long 0x1L>
	//* 200  454:lcmp            
	//* 201  455:ifne            494
			if(l != 0x1L)
	//* 202  458:lload           5
	//* 203  460:ldc2w           #746 <Long 0x1L>
	//* 204  463:lcmp            
	//* 205  464:ifeq            474
			{
				l4 = l;
	//  206  467:lload           5
	//  207  469:lstore          13
			} else
	//* 208  471:goto            494
			{
				l4 = l5;
	//  209  474:lload           15
	//  210  476:lstore          13
				if(!flag2)
	//* 211  478:iload           23
	//* 212  480:ifne            494
					throw new ParserException("Unable to determine duration of static manifest.");
	//  213  483:new             #241 <Class ParserException>
	//  214  486:dup             
	//  215  487:ldc2            #934 <String "Unable to determine duration of static manifest.">
	//  216  490:invokespecial   #512 <Method void ParserException(String)>
	//  217  493:athrow          
			}
		if(((List) (arraylist)).isEmpty())
	//* 218  494:aload           26
	//* 219  496:invokeinterface #935 <Method boolean List.isEmpty()>
	//* 220  501:ifeq            515
			throw new ParserException("No periods found.");
	//  221  504:new             #241 <Class ParserException>
	//  222  507:dup             
	//  223  508:ldc2            #937 <String "No periods found.">
	//  224  511:invokespecial   #512 <Method void ParserException(String)>
	//  225  514:athrow          
		else
			return buildMediaPresentationDescription(l6, l4, l7, flag2, l1, l2, l3, l8, ((UtcTimingElement) (obj)), uri, ((List) (arraylist)));
	//  226  515:aload_0         
	//  227  516:lload           17
	//  228  518:lload           13
	//  229  520:lload           19
	//  230  522:iload           23
	//  231  524:lload           7
	//  232  526:lload           9
	//  233  528:lload           11
	//  234  530:lload           21
	//  235  532:aload           24
	//  236  534:aload           25
	//  237  536:aload           26
	//  238  538:invokevirtual   #939 <Method DashManifest buildMediaPresentationDescription(long, long, long, boolean, long, long, long, long, UtcTimingElement, Uri, List)>
	//  239  541:areturn         
	//* 240  542:goto            208
	}

	protected Pair parsePeriod(XmlPullParser xmlpullparser, String s, long l)
		throws XmlPullParserException, IOException
	{
		String s3 = xmlpullparser.getAttributeValue(((String) (null)), "id");
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc2            #262 <String "id">
	//    3    5:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore          12
		l = parseDuration(xmlpullparser, "start", l);
	//    5   12:aload_1         
	//    6   13:ldc2            #941 <String "start">
	//    7   16:lload_3         
	//    8   17:invokestatic    #886 <Method long parseDuration(XmlPullParser, String, long)>
	//    9   20:lstore_3        
		long l1 = parseDuration(xmlpullparser, "duration", 0x1L);
	//   10   21:aload_1         
	//   11   22:ldc2            #745 <String "duration">
	//   12   25:ldc2w           #746 <Long 0x1L>
	//   13   28:invokestatic    #886 <Method long parseDuration(XmlPullParser, String, long)>
	//   14   31:lstore          7
		ArrayList arraylist = new ArrayList();
	//   15   33:new             #87  <Class ArrayList>
	//   16   36:dup             
	//   17   37:invokespecial   #541 <Method void ArrayList()>
	//   18   40:astore          13
		ArrayList arraylist1 = new ArrayList();
	//   19   42:new             #87  <Class ArrayList>
	//   20   45:dup             
	//   21   46:invokespecial   #541 <Method void ArrayList()>
	//   22   49:astore          14
		boolean flag = false;
	//   23   51:iconst_0        
	//   24   52:istore          5
		Object obj = null;
	//   25   54:aconst_null     
	//   26   55:astore          10
		String s1 = s;
	//   27   57:aload_2         
	//   28   58:astore          9
		do
		{
			xmlpullparser.next();
	//   29   60:aload_1         
	//   30   61:invokeinterface #168 <Method int XmlPullParser.next()>
	//   31   66:pop             
			boolean flag1;
			String s2;
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "BaseURL"))
	//*  32   67:aload_1         
	//*  33   68:ldc2            #543 <String "BaseURL">
	//*  34   71:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  35   74:ifeq            110
			{
				flag1 = flag;
	//   36   77:iload           5
	//   37   79:istore          6
				s = ((String) (obj));
	//   38   81:aload           10
	//   39   83:astore_2        
				s2 = s1;
	//   40   84:aload           9
	//   41   86:astore          11
				if(!flag)
	//*  42   88:iload           5
	//*  43   90:ifne            280
				{
					s2 = parseBaseUrl(xmlpullparser, s1);
	//   44   93:aload_1         
	//   45   94:aload           9
	//   46   96:invokestatic    #548 <Method String parseBaseUrl(XmlPullParser, String)>
	//   47   99:astore          11
					flag1 = true;
	//   48  101:iconst_1        
	//   49  102:istore          6
					s = ((String) (obj));
	//   50  104:aload           10
	//   51  106:astore_2        
				}
			} else
	//*  52  107:goto            280
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "AdaptationSet"))
	//*  53  110:aload_1         
	//*  54  111:ldc2            #626 <String "AdaptationSet">
	//*  55  114:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  56  117:ifeq            151
			{
				((List) (arraylist)).add(((Object) (parseAdaptationSet(xmlpullparser, s1, ((SegmentBase) (obj))))));
	//   57  120:aload           13
	//   58  122:aload_0         
	//   59  123:aload_1         
	//   60  124:aload           9
	//   61  126:aload           10
	//   62  128:invokevirtual   #943 <Method AdaptationSet parseAdaptationSet(XmlPullParser, String, SegmentBase)>
	//   63  131:invokeinterface #597 <Method boolean List.add(Object)>
	//   64  136:pop             
				flag1 = flag;
	//   65  137:iload           5
	//   66  139:istore          6
				s = ((String) (obj));
	//   67  141:aload           10
	//   68  143:astore_2        
				s2 = s1;
	//   69  144:aload           9
	//   70  146:astore          11
			} else
	//*  71  148:goto            280
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "EventStream"))
	//*  72  151:aload_1         
	//*  73  152:ldc2            #863 <String "EventStream">
	//*  74  155:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  75  158:ifeq            188
			{
				((List) (arraylist1)).add(((Object) (parseEventStream(xmlpullparser))));
	//   76  161:aload           14
	//   77  163:aload_0         
	//   78  164:aload_1         
	//   79  165:invokevirtual   #945 <Method EventStream parseEventStream(XmlPullParser)>
	//   80  168:invokeinterface #597 <Method boolean List.add(Object)>
	//   81  173:pop             
				flag1 = flag;
	//   82  174:iload           5
	//   83  176:istore          6
				s = ((String) (obj));
	//   84  178:aload           10
	//   85  180:astore_2        
				s2 = s1;
	//   86  181:aload           9
	//   87  183:astore          11
			} else
	//*  88  185:goto            280
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentBase"))
	//*  89  188:aload_1         
	//*  90  189:ldc2            #599 <String "SegmentBase">
	//*  91  192:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  92  195:ifeq            216
			{
				s = ((String) (parseSegmentBase(xmlpullparser, ((SegmentBase.SingleSegmentBase) (null)))));
	//   93  198:aload_0         
	//   94  199:aload_1         
	//   95  200:aconst_null     
	//   96  201:invokevirtual   #603 <Method SegmentBase$SingleSegmentBase parseSegmentBase(XmlPullParser, SegmentBase$SingleSegmentBase)>
	//   97  204:astore_2        
				flag1 = flag;
	//   98  205:iload           5
	//   99  207:istore          6
				s2 = s1;
	//  100  209:aload           9
	//  101  211:astore          11
			} else
	//* 102  213:goto            280
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentList"))
	//* 103  216:aload_1         
	//* 104  217:ldc2            #605 <String "SegmentList">
	//* 105  220:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 106  223:ifeq            244
			{
				s = ((String) (parseSegmentList(xmlpullparser, ((SegmentBase.SegmentList) (null)))));
	//  107  226:aload_0         
	//  108  227:aload_1         
	//  109  228:aconst_null     
	//  110  229:invokevirtual   #609 <Method SegmentBase$SegmentList parseSegmentList(XmlPullParser, SegmentBase$SegmentList)>
	//  111  232:astore_2        
				flag1 = flag;
	//  112  233:iload           5
	//  113  235:istore          6
				s2 = s1;
	//  114  237:aload           9
	//  115  239:astore          11
			} else
	//* 116  241:goto            280
			{
				flag1 = flag;
	//  117  244:iload           5
	//  118  246:istore          6
				s = ((String) (obj));
	//  119  248:aload           10
	//  120  250:astore_2        
				s2 = s1;
	//  121  251:aload           9
	//  122  253:astore          11
				if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentTemplate"))
	//* 123  255:aload_1         
	//* 124  256:ldc2            #611 <String "SegmentTemplate">
	//* 125  259:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 126  262:ifeq            280
				{
					s = ((String) (parseSegmentTemplate(xmlpullparser, ((SegmentBase.SegmentTemplate) (null)))));
	//  127  265:aload_0         
	//  128  266:aload_1         
	//  129  267:aconst_null     
	//  130  268:invokevirtual   #615 <Method SegmentBase$SegmentTemplate parseSegmentTemplate(XmlPullParser, SegmentBase$SegmentTemplate)>
	//  131  271:astore_2        
					s2 = s1;
	//  132  272:aload           9
	//  133  274:astore          11
					flag1 = flag;
	//  134  276:iload           5
	//  135  278:istore          6
				}
			}
			flag = flag1;
	//  136  280:iload           6
	//  137  282:istore          5
			obj = ((Object) (s));
	//  138  284:aload_2         
	//  139  285:astore          10
			s1 = s2;
	//  140  287:aload           11
	//  141  289:astore          9
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "Period"));
	//  142  291:aload_1         
	//  143  292:ldc2            #916 <String "Period">
	//  144  295:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//  145  298:ifeq            60
		return Pair.create(((Object) (buildPeriod(s3, l, ((List) (arraylist)), ((List) (arraylist1))))), ((Object) (Long.valueOf(l1))));
	//  146  301:aload_0         
	//  147  302:aload           12
	//  148  304:lload_3         
	//  149  305:aload           13
	//  150  307:aload           14
	//  151  309:invokevirtual   #947 <Method Period buildPeriod(String, long, List, List)>
	//  152  312:lload           7
	//  153  314:invokestatic    #950 <Method Long Long.valueOf(long)>
	//  154  317:invokestatic    #730 <Method Pair Pair.create(Object, Object)>
	//  155  320:areturn         
	}

	protected RangedUri parseRangedUrl(XmlPullParser xmlpullparser, String s, String s1)
	{
		long l;
		long l1;
label0:
		{
			s = xmlpullparser.getAttributeValue(((String) (null)), s);
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aload_2         
	//    3    3:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_2        
			xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s1)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:aload_3         
	//    8   12:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    9   17:astore_1        
			if(xmlpullparser != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          72
			{
				xmlpullparser = ((XmlPullParser) (((String) (xmlpullparser)).split("-")));
	//   12   22:aload_1         
	//   13   23:ldc2            #953 <String "-">
	//   14   26:invokevirtual   #670 <Method String[] String.split(String)>
	//   15   29:astore_1        
				l1 = Long.parseLong(((String) (xmlpullparser[0])));
	//   16   30:aload_1         
	//   17   31:iconst_0        
	//   18   32:aaload          
	//   19   33:invokestatic    #321 <Method long Long.parseLong(String)>
	//   20   36:lstore          6
				l = l1;
	//   21   38:lload           6
	//   22   40:lstore          4
				if(xmlpullparser.length == 2)
	//*  23   42:aload_1         
	//*  24   43:arraylength     
	//*  25   44:iconst_2        
	//*  26   45:icmpne          75
				{
					long l2 = (Long.parseLong(((String) (xmlpullparser[1]))) - l1) + 1L;
	//   27   48:aload_1         
	//   28   49:iconst_1        
	//   29   50:aaload          
	//   30   51:invokestatic    #321 <Method long Long.parseLong(String)>
	//   31   54:lload           6
	//   32   56:lsub            
	//   33   57:lconst_1        
	//   34   58:ladd            
	//   35   59:lstore          8
					l = l1;
	//   36   61:lload           6
	//   37   63:lstore          4
					l1 = l2;
	//   38   65:lload           8
	//   39   67:lstore          6
					break label0;
	//   40   69:goto            80
				}
			} else
			{
				l = 0L;
	//   41   72:lconst_0        
	//   42   73:lstore          4
			}
			l1 = -1L;
	//   43   75:ldc2w           #954 <Long -1L>
	//   44   78:lstore          6
		}
		return buildRangedUri(s, l, l1);
	//   45   80:aload_0         
	//   46   81:aload_2         
	//   47   82:lload           4
	//   48   84:lload           6
	//   49   86:invokevirtual   #957 <Method RangedUri buildRangedUri(String, long, long)>
	//   50   89:areturn         
	}

	protected RepresentationInfo parseRepresentation(XmlPullParser xmlpullparser, String s, String s1, String s2, int i, int j, float f, 
			int k, int l, String s3, int i1, List list, SegmentBase segmentbase)
		throws XmlPullParserException, IOException
	{
		int j1;
		int k1;
		int l1;
		int i2;
		String s5;
		ArrayList arraylist;
		ArrayList arraylist1;
		String s8;
		String s9;
		ArrayList arraylist2;
		s8 = xmlpullparser.getAttributeValue(((String) (null)), "id");
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc2            #262 <String "id">
	//    3    5:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore          23
		j1 = parseInt(xmlpullparser, "bandwidth", -1);
	//    5   12:aload_1         
	//    6   13:ldc2            #959 <String "bandwidth">
	//    7   16:iconst_m1       
	//    8   17:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//    9   20:istore          14
		s9 = parseString(xmlpullparser, "mimeType", s1);
	//   10   22:aload_1         
	//   11   23:ldc2            #527 <String "mimeType">
	//   12   26:aload_3         
	//   13   27:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//   14   30:astore          24
		s5 = parseString(xmlpullparser, "codecs", s2);
	//   15   32:aload_1         
	//   16   33:ldc2            #529 <String "codecs">
	//   17   36:aload           4
	//   18   38:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//   19   41:astore          19
		k1 = parseInt(xmlpullparser, "width", i);
	//   20   43:aload_1         
	//   21   44:ldc2            #531 <String "width">
	//   22   47:iload           5
	//   23   49:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   24   52:istore          15
		l1 = parseInt(xmlpullparser, "height", j);
	//   25   54:aload_1         
	//   26   55:ldc2            #533 <String "height">
	//   27   58:iload           6
	//   28   60:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   29   63:istore          16
		f = parseFrameRate(xmlpullparser, f);
	//   30   65:aload_1         
	//   31   66:fload           7
	//   32   68:invokestatic    #536 <Method float parseFrameRate(XmlPullParser, float)>
	//   33   71:fstore          7
		i2 = parseInt(xmlpullparser, "audioSamplingRate", l);
	//   34   73:aload_1         
	//   35   74:ldc2            #538 <String "audioSamplingRate">
	//   36   77:iload           9
	//   37   79:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   38   82:istore          17
		arraylist = new ArrayList();
	//   39   84:new             #87  <Class ArrayList>
	//   40   87:dup             
	//   41   88:invokespecial   #541 <Method void ArrayList()>
	//   42   91:astore          21
		arraylist1 = new ArrayList();
	//   43   93:new             #87  <Class ArrayList>
	//   44   96:dup             
	//   45   97:invokespecial   #541 <Method void ArrayList()>
	//   46  100:astore          22
		arraylist2 = new ArrayList();
	//   47  102:new             #87  <Class ArrayList>
	//   48  105:dup             
	//   49  106:invokespecial   #541 <Method void ArrayList()>
	//   50  109:astore          25
		i = 0;
	//   51  111:iconst_0        
	//   52  112:istore          5
		s2 = null;
	//   53  114:aconst_null     
	//   54  115:astore          4
_L6:
		xmlpullparser.next();
	//   55  117:aload_1         
	//   56  118:invokeinterface #168 <Method int XmlPullParser.next()>
	//   57  123:pop             
		if(!XmlPullParserUtil.isStartTag(xmlpullparser, "BaseURL")) goto _L2; else goto _L1
	//   58  124:aload_1         
	//   59  125:ldc2            #543 <String "BaseURL">
	//   60  128:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//   61  131:ifeq            176
_L1:
		String s4;
		s4 = s;
	//   62  134:aload_2         
	//   63  135:astore          18
		j = i;
	//   64  137:iload           5
	//   65  139:istore          6
		s1 = ((String) (segmentbase));
	//   66  141:aload           13
	//   67  143:astore_3        
		if(i == 0)
	//*  68  144:iload           5
	//*  69  146:ifne            162
		{
			s4 = parseBaseUrl(xmlpullparser, s);
	//   70  149:aload_1         
	//   71  150:aload_2         
	//   72  151:invokestatic    #548 <Method String parseBaseUrl(XmlPullParser, String)>
	//   73  154:astore          18
			j = 1;
	//   74  156:iconst_1        
	//   75  157:istore          6
			s1 = ((String) (segmentbase));
	//   76  159:aload           13
	//   77  161:astore_3        
		}
_L4:
		s = s4;
	//   78  162:aload           18
	//   79  164:astore_2        
		l = k;
	//   80  165:iload           8
	//   81  167:istore          9
		s4 = s2;
	//   82  169:aload           4
	//   83  171:astore          18
		break MISSING_BLOCK_LABEL_502;
	//   84  173:goto            502
_L2:
		if(XmlPullParserUtil.isStartTag(xmlpullparser, "AudioChannelConfiguration"))
	//*  85  176:aload_1         
	//*  86  177:ldc2            #579 <String "AudioChannelConfiguration">
	//*  87  180:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  88  183:ifeq            207
		{
			l = parseAudioChannelConfiguration(xmlpullparser);
	//   89  186:aload_0         
	//   90  187:aload_1         
	//   91  188:invokevirtual   #582 <Method int parseAudioChannelConfiguration(XmlPullParser)>
	//   92  191:istore          9
			j = i;
	//   93  193:iload           5
	//   94  195:istore          6
			s1 = ((String) (segmentbase));
	//   95  197:aload           13
	//   96  199:astore_3        
			s4 = s2;
	//   97  200:aload           4
	//   98  202:astore          18
			break MISSING_BLOCK_LABEL_502;
	//   99  204:goto            502
		}
		if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentBase"))
	//* 100  207:aload_1         
	//* 101  208:ldc2            #599 <String "SegmentBase">
	//* 102  211:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 103  214:ifeq            238
		{
			s1 = ((String) (parseSegmentBase(xmlpullparser, (SegmentBase.SingleSegmentBase)segmentbase)));
	//  104  217:aload_0         
	//  105  218:aload_1         
	//  106  219:aload           13
	//  107  221:checkcast       #472 <Class SegmentBase$SingleSegmentBase>
	//  108  224:invokevirtual   #603 <Method SegmentBase$SingleSegmentBase parseSegmentBase(XmlPullParser, SegmentBase$SingleSegmentBase)>
	//  109  227:astore_3        
			s4 = s;
	//  110  228:aload_2         
	//  111  229:astore          18
			j = i;
	//  112  231:iload           5
	//  113  233:istore          6
			continue; /* Loop/switch isn't completed */
	//  114  235:goto            162
		}
		if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentList"))
	//* 115  238:aload_1         
	//* 116  239:ldc2            #605 <String "SegmentList">
	//* 117  242:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 118  245:ifeq            269
		{
			s1 = ((String) (parseSegmentList(xmlpullparser, (SegmentBase.SegmentList)segmentbase)));
	//  119  248:aload_0         
	//  120  249:aload_1         
	//  121  250:aload           13
	//  122  252:checkcast       #449 <Class SegmentBase$SegmentList>
	//  123  255:invokevirtual   #609 <Method SegmentBase$SegmentList parseSegmentList(XmlPullParser, SegmentBase$SegmentList)>
	//  124  258:astore_3        
			s4 = s;
	//  125  259:aload_2         
	//  126  260:astore          18
			j = i;
	//  127  262:iload           5
	//  128  264:istore          6
			continue; /* Loop/switch isn't completed */
	//  129  266:goto            162
		}
		if(!XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentTemplate"))
			break; /* Loop/switch isn't completed */
	//  130  269:aload_1         
	//  131  270:ldc2            #611 <String "SegmentTemplate">
	//  132  273:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//  133  276:ifeq            300
		s1 = ((String) (parseSegmentTemplate(xmlpullparser, (SegmentBase.SegmentTemplate)segmentbase)));
	//  134  279:aload_0         
	//  135  280:aload_1         
	//  136  281:aload           13
	//  137  283:checkcast       #457 <Class SegmentBase$SegmentTemplate>
	//  138  286:invokevirtual   #615 <Method SegmentBase$SegmentTemplate parseSegmentTemplate(XmlPullParser, SegmentBase$SegmentTemplate)>
	//  139  289:astore_3        
		s4 = s;
	//  140  290:aload_2         
	//  141  291:astore          18
		j = i;
	//  142  293:iload           5
	//  143  295:istore          6
		if(true) goto _L4; else goto _L3
	//  144  297:goto            162
_L3:
		if(XmlPullParserUtil.isStartTag(xmlpullparser, "ContentProtection"))
	//* 145  300:aload_1         
	//* 146  301:ldc2            #550 <String "ContentProtection">
	//* 147  304:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 148  307:ifeq            396
		{
			Pair pair = parseContentProtection(xmlpullparser);
	//  149  310:aload_0         
	//  150  311:aload_1         
	//  151  312:invokevirtual   #554 <Method Pair parseContentProtection(XmlPullParser)>
	//  152  315:astore          26
			String s6 = s;
	//  153  317:aload_2         
	//  154  318:astore          20
			if(pair.first != null)
	//* 155  320:aload           26
	//* 156  322:getfield        #560 <Field Object Pair.first>
	//* 157  325:ifnull          338
				s2 = (String)pair.first;
	//  158  328:aload           26
	//  159  330:getfield        #560 <Field Object Pair.first>
	//  160  333:checkcast       #79  <Class String>
	//  161  336:astore          4
			j = i;
	//  162  338:iload           5
	//  163  340:istore          6
			s1 = ((String) (segmentbase));
	//  164  342:aload           13
	//  165  344:astore_3        
			l = k;
	//  166  345:iload           8
	//  167  347:istore          9
			s4 = s2;
	//  168  349:aload           4
	//  169  351:astore          18
			s = s6;
	//  170  353:aload           20
	//  171  355:astore_2        
			if(pair.second != null)
	//* 172  356:aload           26
	//* 173  358:getfield        #563 <Field Object Pair.second>
	//* 174  361:ifnull          502
			{
				arraylist.add(pair.second);
	//  175  364:aload           21
	//  176  366:aload           26
	//  177  368:getfield        #563 <Field Object Pair.second>
	//  178  371:invokevirtual   #566 <Method boolean ArrayList.add(Object)>
	//  179  374:pop             
				j = i;
	//  180  375:iload           5
	//  181  377:istore          6
				s1 = ((String) (segmentbase));
	//  182  379:aload           13
	//  183  381:astore_3        
				l = k;
	//  184  382:iload           8
	//  185  384:istore          9
				s4 = s2;
	//  186  386:aload           4
	//  187  388:astore          18
				s = s6;
	//  188  390:aload           20
	//  189  392:astore_2        
			}
		} else
	//* 190  393:goto            502
		{
			String s7 = s;
	//  191  396:aload_2         
	//  192  397:astore          20
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "InbandEventStream"))
	//* 193  399:aload_1         
	//* 194  400:ldc2            #617 <String "InbandEventStream">
	//* 195  403:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 196  406:ifeq            443
			{
				arraylist1.add(((Object) (parseDescriptor(xmlpullparser, "InbandEventStream"))));
	//  197  409:aload           22
	//  198  411:aload_1         
	//  199  412:ldc2            #617 <String "InbandEventStream">
	//  200  415:invokestatic    #586 <Method Descriptor parseDescriptor(XmlPullParser, String)>
	//  201  418:invokevirtual   #566 <Method boolean ArrayList.add(Object)>
	//  202  421:pop             
				j = i;
	//  203  422:iload           5
	//  204  424:istore          6
				s1 = ((String) (segmentbase));
	//  205  426:aload           13
	//  206  428:astore_3        
				l = k;
	//  207  429:iload           8
	//  208  431:istore          9
				s4 = s2;
	//  209  433:aload           4
	//  210  435:astore          18
				s = s7;
	//  211  437:aload           20
	//  212  439:astore_2        
			} else
	//* 213  440:goto            502
			{
				j = i;
	//  214  443:iload           5
	//  215  445:istore          6
				s1 = ((String) (segmentbase));
	//  216  447:aload           13
	//  217  449:astore_3        
				l = k;
	//  218  450:iload           8
	//  219  452:istore          9
				s4 = s2;
	//  220  454:aload           4
	//  221  456:astore          18
				s = s7;
	//  222  458:aload           20
	//  223  460:astore_2        
				if(XmlPullParserUtil.isStartTag(xmlpullparser, "SupplementalProperty"))
	//* 224  461:aload_1         
	//* 225  462:ldc2            #588 <String "SupplementalProperty">
	//* 226  465:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 227  468:ifeq            502
				{
					arraylist2.add(((Object) (parseDescriptor(xmlpullparser, "SupplementalProperty"))));
	//  228  471:aload           25
	//  229  473:aload_1         
	//  230  474:ldc2            #588 <String "SupplementalProperty">
	//  231  477:invokestatic    #586 <Method Descriptor parseDescriptor(XmlPullParser, String)>
	//  232  480:invokevirtual   #566 <Method boolean ArrayList.add(Object)>
	//  233  483:pop             
					s = s7;
	//  234  484:aload           20
	//  235  486:astore_2        
					s4 = s2;
	//  236  487:aload           4
	//  237  489:astore          18
					l = k;
	//  238  491:iload           8
	//  239  493:istore          9
					s1 = ((String) (segmentbase));
	//  240  495:aload           13
	//  241  497:astore_3        
					j = i;
	//  242  498:iload           5
	//  243  500:istore          6
				}
			}
		}
		if(XmlPullParserUtil.isEndTag(xmlpullparser, "Representation"))
	//* 244  502:aload_1         
	//* 245  503:ldc2            #590 <String "Representation">
	//* 246  506:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//* 247  509:ifeq            578
		{
			xmlpullparser = ((XmlPullParser) (buildFormat(s8, s9, k1, l1, f, l, i2, j1, s3, i1, list, s5, ((List) (arraylist2)))));
	//  248  512:aload_0         
	//  249  513:aload           23
	//  250  515:aload           24
	//  251  517:iload           15
	//  252  519:iload           16
	//  253  521:fload           7
	//  254  523:iload           9
	//  255  525:iload           17
	//  256  527:iload           14
	//  257  529:aload           10
	//  258  531:iload           11
	//  259  533:aload           12
	//  260  535:aload           19
	//  261  537:aload           25
	//  262  539:invokevirtual   #961 <Method Format buildFormat(String, String, int, int, float, int, int, int, String, int, List, String, List)>
	//  263  542:astore_1        
			if(s1 == null)
	//* 264  543:aload_3         
	//* 265  544:ifnull          550
	//* 266  547:goto            558
				s1 = ((String) (new SegmentBase.SingleSegmentBase()));
	//  267  550:new             #472 <Class SegmentBase$SingleSegmentBase>
	//  268  553:dup             
	//  269  554:invokespecial   #962 <Method void SegmentBase$SingleSegmentBase()>
	//  270  557:astore_3        
			return new RepresentationInfo(((Format) (xmlpullparser)), s, ((SegmentBase) (s1)), s4, arraylist, arraylist1, -1L);
	//  271  558:new             #9   <Class DashManifestParser$RepresentationInfo>
	//  272  561:dup             
	//  273  562:aload_1         
	//  274  563:aload_2         
	//  275  564:aload_3         
	//  276  565:aload           18
	//  277  567:aload           21
	//  278  569:aload           22
	//  279  571:ldc2w           #954 <Long -1L>
	//  280  574:invokespecial   #965 <Method void DashManifestParser$RepresentationInfo(Format, String, SegmentBase, String, ArrayList, ArrayList, long)>
	//  281  577:areturn         
		}
		s2 = s4;
	//  282  578:aload           18
	//  283  580:astore          4
		i = j;
	//  284  582:iload           6
	//  285  584:istore          5
		segmentbase = ((SegmentBase) (s1));
	//  286  586:aload_3         
	//  287  587:astore          13
		k = l;
	//  288  589:iload           9
	//  289  591:istore          8
		if(true) goto _L6; else goto _L5
	//  290  593:goto            117
_L5:
	}

	protected int parseRole(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		String s = parseString(xmlpullparser, "schemeIdUri", ((String) (null)));
	//    0    0:aload_1         
	//    1    1:ldc1            #253 <String "schemeIdUri">
	//    2    3:aconst_null     
	//    3    4:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//    4    7:astore_2        
		String s1 = parseString(xmlpullparser, "value", ((String) (null)));
	//    5    8:aload_1         
	//    6    9:ldc2            #260 <String "value">
	//    7   12:aconst_null     
	//    8   13:invokestatic    #259 <Method String parseString(XmlPullParser, String, String)>
	//    9   16:astore_3        
		do
			xmlpullparser.next();
	//   10   17:aload_1         
	//   11   18:invokeinterface #168 <Method int XmlPullParser.next()>
	//   12   23:pop             
		while(!XmlPullParserUtil.isEndTag(xmlpullparser, "Role"));
	//   13   24:aload_1         
	//   14   25:ldc2            #574 <String "Role">
	//   15   28:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//   16   31:ifeq            17
		return !"urn:mpeg:dash:role:2011".equals(((Object) (s))) || !"main".equals(((Object) (s1))) ? 0 : 1;
	//   17   34:ldc2            #968 <String "urn:mpeg:dash:role:2011">
	//   18   37:aload_2         
	//   19   38:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   20   41:ifeq            56
	//   21   44:ldc2            #970 <String "main">
	//   22   47:aload_3         
	//   23   48:invokevirtual   #83  <Method boolean String.equals(Object)>
	//   24   51:ifeq            56
	//   25   54:iconst_1        
	//   26   55:ireturn         
	//   27   56:iconst_0        
	//   28   57:ireturn         
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
	//    3    5:getfield        #972 <Field long SegmentBase$SingleSegmentBase.timescale>
	//    4    8:lstore_3        
		else
	//*   5    9:goto            14
			l = 1L;
	//    6   12:lconst_1        
	//    7   13:lstore_3        
		long l2 = parseLong(xmlpullparser, "timescale", l);
	//    8   14:aload_1         
	//    9   15:ldc2            #858 <String "timescale">
	//   10   18:lload_3         
	//   11   19:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   12   22:lstore          7
		long l1 = 0L;
	//   13   24:lconst_0        
	//   14   25:lstore          5
		if(singlesegmentbase != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          39
			l = singlesegmentbase.presentationTimeOffset;
	//   17   31:aload_2         
	//   18   32:getfield        #975 <Field long SegmentBase$SingleSegmentBase.presentationTimeOffset>
	//   19   35:lstore_3        
		else
	//*  20   36:goto            41
			l = 0L;
	//   21   39:lconst_0        
	//   22   40:lstore_3        
		long l3 = parseLong(xmlpullparser, "presentationTimeOffset", l);
	//   23   41:aload_1         
	//   24   42:ldc2            #976 <String "presentationTimeOffset">
	//   25   45:lload_3         
	//   26   46:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   27   49:lstore          9
		if(singlesegmentbase != null)
	//*  28   51:aload_2         
	//*  29   52:ifnull          63
			l = singlesegmentbase.indexStart;
	//   30   55:aload_2         
	//   31   56:getfield        #979 <Field long SegmentBase$SingleSegmentBase.indexStart>
	//   32   59:lstore_3        
		else
	//*  33   60:goto            65
			l = 0L;
	//   34   63:lconst_0        
	//   35   64:lstore_3        
		if(singlesegmentbase != null)
	//*  36   65:aload_2         
	//*  37   66:ifnull          75
			l1 = singlesegmentbase.indexLength;
	//   38   69:aload_2         
	//   39   70:getfield        #982 <Field long SegmentBase$SingleSegmentBase.indexLength>
	//   40   73:lstore          5
		Object obj = null;
	//   41   75:aconst_null     
	//   42   76:astore          11
		String s = xmlpullparser.getAttributeValue(((String) (null)), "indexRange");
	//   43   78:aload_1         
	//   44   79:aconst_null     
	//   45   80:ldc2            #984 <String "indexRange">
	//   46   83:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   47   88:astore          12
		if(s != null)
	//*  48   90:aload           12
	//*  49   92:ifnull          129
		{
			String as[] = s.split("-");
	//   50   95:aload           12
	//   51   97:ldc2            #953 <String "-">
	//   52  100:invokevirtual   #670 <Method String[] String.split(String)>
	//   53  103:astore          12
			l = Long.parseLong(as[0]);
	//   54  105:aload           12
	//   55  107:iconst_0        
	//   56  108:aaload          
	//   57  109:invokestatic    #321 <Method long Long.parseLong(String)>
	//   58  112:lstore_3        
			l1 = (Long.parseLong(as[1]) - l) + 1L;
	//   59  113:aload           12
	//   60  115:iconst_1        
	//   61  116:aaload          
	//   62  117:invokestatic    #321 <Method long Long.parseLong(String)>
	//   63  120:lload_3         
	//   64  121:lsub            
	//   65  122:lconst_1        
	//   66  123:ladd            
	//   67  124:lstore          5
		}
	//*  68  126:goto            129
		if(singlesegmentbase != null)
	//*  69  129:aload_2         
	//*  70  130:ifnull          139
			obj = ((Object) (singlesegmentbase.initialization));
	//   71  133:aload_2         
	//   72  134:getfield        #988 <Field RangedUri SegmentBase$SingleSegmentBase.initialization>
	//   73  137:astore          11
		do
		{
			xmlpullparser.next();
	//   74  139:aload_1         
	//   75  140:invokeinterface #168 <Method int XmlPullParser.next()>
	//   76  145:pop             
			singlesegmentbase = ((SegmentBase.SingleSegmentBase) (obj));
	//   77  146:aload           11
	//   78  148:astore_2        
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "Initialization"))
	//*  79  149:aload_1         
	//*  80  150:ldc2            #990 <String "Initialization">
	//*  81  153:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  82  156:ifeq            165
				singlesegmentbase = ((SegmentBase.SingleSegmentBase) (parseInitialization(xmlpullparser)));
	//   83  159:aload_0         
	//   84  160:aload_1         
	//   85  161:invokevirtual   #992 <Method RangedUri parseInitialization(XmlPullParser)>
	//   86  164:astore_2        
			obj = ((Object) (singlesegmentbase));
	//   87  165:aload_2         
	//   88  166:astore          11
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "SegmentBase"));
	//   89  168:aload_1         
	//   90  169:ldc2            #599 <String "SegmentBase">
	//   91  172:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//   92  175:ifeq            139
		return buildSingleSegmentBase(((RangedUri) (singlesegmentbase)), l2, l3, l, l1);
	//   93  178:aload_0         
	//   94  179:aload_2         
	//   95  180:lload           7
	//   96  182:lload           9
	//   97  184:lload_3         
	//   98  185:lload           5
	//   99  187:invokevirtual   #994 <Method SegmentBase$SingleSegmentBase buildSingleSegmentBase(RangedUri, long, long, long, long)>
	//  100  190:areturn         
	}

	protected SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlpullparser, SegmentBase.SegmentList segmentlist)
		throws XmlPullParserException, IOException
	{
		long l1 = 1L;
	//    0    0:lconst_1        
	//    1    1:lstore          5
		long l;
		if(segmentlist != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          15
			l = segmentlist.timescale;
	//    4    7:aload_2         
	//    5    8:getfield        #995 <Field long SegmentBase$SegmentList.timescale>
	//    6   11:lstore_3        
		else
	//*   7   12:goto            17
			l = 1L;
	//    8   15:lconst_1        
	//    9   16:lstore_3        
		long l2 = parseLong(xmlpullparser, "timescale", l);
	//   10   17:aload_1         
	//   11   18:ldc2            #858 <String "timescale">
	//   12   21:lload_3         
	//   13   22:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   14   25:lstore          7
		if(segmentlist != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          39
			l = segmentlist.presentationTimeOffset;
	//   17   31:aload_2         
	//   18   32:getfield        #996 <Field long SegmentBase$SegmentList.presentationTimeOffset>
	//   19   35:lstore_3        
		else
	//*  20   36:goto            41
			l = 0L;
	//   21   39:lconst_0        
	//   22   40:lstore_3        
		long l3 = parseLong(xmlpullparser, "presentationTimeOffset", l);
	//   23   41:aload_1         
	//   24   42:ldc2            #976 <String "presentationTimeOffset">
	//   25   45:lload_3         
	//   26   46:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   27   49:lstore          9
		if(segmentlist != null)
	//*  28   51:aload_2         
	//*  29   52:ifnull          63
			l = segmentlist.duration;
	//   30   55:aload_2         
	//   31   56:getfield        #998 <Field long SegmentBase$SegmentList.duration>
	//   32   59:lstore_3        
		else
	//*  33   60:goto            67
			l = 0x1L;
	//   34   63:ldc2w           #746 <Long 0x1L>
	//   35   66:lstore_3        
		long l4 = parseLong(xmlpullparser, "duration", l);
	//   36   67:aload_1         
	//   37   68:ldc2            #745 <String "duration">
	//   38   71:lload_3         
	//   39   72:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   40   75:lstore          11
		l = l1;
	//   41   77:lload           5
	//   42   79:lstore_3        
		if(segmentlist != null)
	//*  43   80:aload_2         
	//*  44   81:ifnull          89
			l = segmentlist.startNumber;
	//   45   84:aload_2         
	//   46   85:getfield        #1001 <Field long SegmentBase$SegmentList.startNumber>
	//   47   88:lstore_3        
		l = parseLong(xmlpullparser, "startNumber", l);
	//   48   89:aload_1         
	//   49   90:ldc2            #1002 <String "startNumber">
	//   50   93:lload_3         
	//   51   94:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   52   97:lstore_3        
		Object obj = null;
	//   53   98:aconst_null     
	//   54   99:astore          16
		RangedUri rangeduri1 = null;
	//   55  101:aconst_null     
	//   56  102:astore          18
		List list1 = ((List) (rangeduri1));
	//   57  104:aload           18
	//   58  106:astore          17
		List list;
		RangedUri rangeduri;
		ArrayList arraylist;
		do
		{
			xmlpullparser.next();
	//   59  108:aload_1         
	//   60  109:invokeinterface #168 <Method int XmlPullParser.next()>
	//   61  114:pop             
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "Initialization"))
	//*  62  115:aload_1         
	//*  63  116:ldc2            #990 <String "Initialization">
	//*  64  119:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  65  122:ifeq            143
			{
				rangeduri = parseInitialization(xmlpullparser);
	//   66  125:aload_0         
	//   67  126:aload_1         
	//   68  127:invokevirtual   #992 <Method RangedUri parseInitialization(XmlPullParser)>
	//   69  130:astore          14
				arraylist = ((ArrayList) (obj));
	//   70  132:aload           16
	//   71  134:astore          15
				list = list1;
	//   72  136:aload           17
	//   73  138:astore          13
			} else
	//*  74  140:goto            232
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentTimeline"))
	//*  75  143:aload_1         
	//*  76  144:ldc2            #1004 <String "SegmentTimeline">
	//*  77  147:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  78  150:ifeq            171
			{
				list = parseSegmentTimeline(xmlpullparser);
	//   79  153:aload_0         
	//   80  154:aload_1         
	//   81  155:invokevirtual   #1008 <Method List parseSegmentTimeline(XmlPullParser)>
	//   82  158:astore          13
				arraylist = ((ArrayList) (obj));
	//   83  160:aload           16
	//   84  162:astore          15
				rangeduri = rangeduri1;
	//   85  164:aload           18
	//   86  166:astore          14
			} else
	//*  87  168:goto            232
			{
				arraylist = ((ArrayList) (obj));
	//   88  171:aload           16
	//   89  173:astore          15
				rangeduri = rangeduri1;
	//   90  175:aload           18
	//   91  177:astore          14
				list = list1;
	//   92  179:aload           17
	//   93  181:astore          13
				if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentURL"))
	//*  94  183:aload_1         
	//*  95  184:ldc2            #1010 <String "SegmentURL">
	//*  96  187:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  97  190:ifeq            232
				{
					arraylist = ((ArrayList) (obj));
	//   98  193:aload           16
	//   99  195:astore          15
					if(obj == null)
	//* 100  197:aload           16
	//* 101  199:ifnonnull       211
						arraylist = new ArrayList();
	//  102  202:new             #87  <Class ArrayList>
	//  103  205:dup             
	//  104  206:invokespecial   #541 <Method void ArrayList()>
	//  105  209:astore          15
					((List) (arraylist)).add(((Object) (parseSegmentUrl(xmlpullparser))));
	//  106  211:aload           15
	//  107  213:aload_0         
	//  108  214:aload_1         
	//  109  215:invokevirtual   #1013 <Method RangedUri parseSegmentUrl(XmlPullParser)>
	//  110  218:invokeinterface #597 <Method boolean List.add(Object)>
	//  111  223:pop             
					list = list1;
	//  112  224:aload           17
	//  113  226:astore          13
					rangeduri = rangeduri1;
	//  114  228:aload           18
	//  115  230:astore          14
				}
			}
			obj = ((Object) (arraylist));
	//  116  232:aload           15
	//  117  234:astore          16
			rangeduri1 = rangeduri;
	//  118  236:aload           14
	//  119  238:astore          18
			list1 = list;
	//  120  240:aload           13
	//  121  242:astore          17
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "SegmentList"));
	//  122  244:aload_1         
	//  123  245:ldc2            #605 <String "SegmentList">
	//  124  248:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//  125  251:ifeq            108
		xmlpullparser = ((XmlPullParser) (arraylist));
	//  126  254:aload           15
	//  127  256:astore_1        
		obj = ((Object) (rangeduri));
	//  128  257:aload           14
	//  129  259:astore          16
		list1 = list;
	//  130  261:aload           13
	//  131  263:astore          17
		if(segmentlist != null)
	//* 132  265:aload_2         
	//* 133  266:ifnull          329
		{
			if(rangeduri == null)
	//* 134  269:aload           14
	//* 135  271:ifnull          277
	//* 136  274:goto            283
				rangeduri = segmentlist.initialization;
	//  137  277:aload_2         
	//  138  278:getfield        #1014 <Field RangedUri SegmentBase$SegmentList.initialization>
	//  139  281:astore          14
			if(list == null)
	//* 140  283:aload           13
	//* 141  285:ifnull          291
	//* 142  288:goto            297
				list = segmentlist.segmentTimeline;
	//  143  291:aload_2         
	//  144  292:getfield        #1018 <Field List SegmentBase$SegmentList.segmentTimeline>
	//  145  295:astore          13
			if(arraylist != null)
	//* 146  297:aload           15
	//* 147  299:ifnull          316
			{
				xmlpullparser = ((XmlPullParser) (arraylist));
	//  148  302:aload           15
	//  149  304:astore_1        
				obj = ((Object) (rangeduri));
	//  150  305:aload           14
	//  151  307:astore          16
				list1 = list;
	//  152  309:aload           13
	//  153  311:astore          17
			} else
	//* 154  313:goto            329
			{
				xmlpullparser = ((XmlPullParser) (segmentlist.mediaSegments));
	//  155  316:aload_2         
	//  156  317:getfield        #1021 <Field List SegmentBase$SegmentList.mediaSegments>
	//  157  320:astore_1        
				list1 = list;
	//  158  321:aload           13
	//  159  323:astore          17
				obj = ((Object) (rangeduri));
	//  160  325:aload           14
	//  161  327:astore          16
			}
		}
		return buildSegmentList(((RangedUri) (obj)), l2, l3, l, l4, list1, ((List) (xmlpullparser)));
	//  162  329:aload_0         
	//  163  330:aload           16
	//  164  332:lload           7
	//  165  334:lload           9
	//  166  336:lload_3         
	//  167  337:lload           11
	//  168  339:aload           17
	//  169  341:aload_1         
	//  170  342:invokevirtual   #1023 <Method SegmentBase$SegmentList buildSegmentList(RangedUri, long, long, long, long, List, List)>
	//  171  345:areturn         
	}

	protected SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlpullparser, SegmentBase.SegmentTemplate segmenttemplate)
		throws XmlPullParserException, IOException
	{
		long l1 = 1L;
	//    0    0:lconst_1        
	//    1    1:lstore          5
		long l;
		if(segmenttemplate != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          15
			l = segmenttemplate.timescale;
	//    4    7:aload_2         
	//    5    8:getfield        #1024 <Field long SegmentBase$SegmentTemplate.timescale>
	//    6   11:lstore_3        
		else
	//*   7   12:goto            17
			l = 1L;
	//    8   15:lconst_1        
	//    9   16:lstore_3        
		long l2 = parseLong(xmlpullparser, "timescale", l);
	//   10   17:aload_1         
	//   11   18:ldc2            #858 <String "timescale">
	//   12   21:lload_3         
	//   13   22:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   14   25:lstore          7
		if(segmenttemplate != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          39
			l = segmenttemplate.presentationTimeOffset;
	//   17   31:aload_2         
	//   18   32:getfield        #1025 <Field long SegmentBase$SegmentTemplate.presentationTimeOffset>
	//   19   35:lstore_3        
		else
	//*  20   36:goto            41
			l = 0L;
	//   21   39:lconst_0        
	//   22   40:lstore_3        
		long l3 = parseLong(xmlpullparser, "presentationTimeOffset", l);
	//   23   41:aload_1         
	//   24   42:ldc2            #976 <String "presentationTimeOffset">
	//   25   45:lload_3         
	//   26   46:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   27   49:lstore          9
		if(segmenttemplate != null)
	//*  28   51:aload_2         
	//*  29   52:ifnull          63
			l = segmenttemplate.duration;
	//   30   55:aload_2         
	//   31   56:getfield        #1026 <Field long SegmentBase$SegmentTemplate.duration>
	//   32   59:lstore_3        
		else
	//*  33   60:goto            67
			l = 0x1L;
	//   34   63:ldc2w           #746 <Long 0x1L>
	//   35   66:lstore_3        
		long l4 = parseLong(xmlpullparser, "duration", l);
	//   36   67:aload_1         
	//   37   68:ldc2            #745 <String "duration">
	//   38   71:lload_3         
	//   39   72:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   40   75:lstore          11
		l = l1;
	//   41   77:lload           5
	//   42   79:lstore_3        
		if(segmenttemplate != null)
	//*  43   80:aload_2         
	//*  44   81:ifnull          89
			l = segmenttemplate.startNumber;
	//   45   84:aload_2         
	//   46   85:getfield        #1027 <Field long SegmentBase$SegmentTemplate.startNumber>
	//   47   88:lstore_3        
		l = parseLong(xmlpullparser, "startNumber", l);
	//   48   89:aload_1         
	//   49   90:ldc2            #1002 <String "startNumber">
	//   50   93:lload_3         
	//   51   94:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   52   97:lstore_3        
		RangedUri rangeduri = null;
	//   53   98:aconst_null     
	//   54   99:astore          15
		Object obj;
		if(segmenttemplate != null)
	//*  55  101:aload_2         
	//*  56  102:ifnull          114
			obj = ((Object) (segmenttemplate.mediaTemplate));
	//   57  105:aload_2         
	//   58  106:getfield        #1031 <Field UrlTemplate SegmentBase$SegmentTemplate.mediaTemplate>
	//   59  109:astore          13
		else
	//*  60  111:goto            117
			obj = null;
	//   61  114:aconst_null     
	//   62  115:astore          13
		UrlTemplate urltemplate = parseUrlTemplate(xmlpullparser, "media", ((UrlTemplate) (obj)));
	//   63  117:aload_0         
	//   64  118:aload_1         
	//   65  119:ldc2            #1033 <String "media">
	//   66  122:aload           13
	//   67  124:invokevirtual   #1037 <Method UrlTemplate parseUrlTemplate(XmlPullParser, String, UrlTemplate)>
	//   68  127:astore          17
		if(segmenttemplate != null)
	//*  69  129:aload_2         
	//*  70  130:ifnull          142
			obj = ((Object) (segmenttemplate.initializationTemplate));
	//   71  133:aload_2         
	//   72  134:getfield        #1040 <Field UrlTemplate SegmentBase$SegmentTemplate.initializationTemplate>
	//   73  137:astore          13
		else
	//*  74  139:goto            145
			obj = null;
	//   75  142:aconst_null     
	//   76  143:astore          13
		UrlTemplate urltemplate1 = parseUrlTemplate(xmlpullparser, "initialization", ((UrlTemplate) (obj)));
	//   77  145:aload_0         
	//   78  146:aload_1         
	//   79  147:ldc2            #1041 <String "initialization">
	//   80  150:aload           13
	//   81  152:invokevirtual   #1037 <Method UrlTemplate parseUrlTemplate(XmlPullParser, String, UrlTemplate)>
	//   82  155:astore          18
		List list1 = null;
	//   83  157:aconst_null     
	//   84  158:astore          16
		List list;
		do
		{
			xmlpullparser.next();
	//   85  160:aload_1         
	//   86  161:invokeinterface #168 <Method int XmlPullParser.next()>
	//   87  166:pop             
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "Initialization"))
	//*  88  167:aload_1         
	//*  89  168:ldc2            #990 <String "Initialization">
	//*  90  171:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  91  174:ifeq            191
			{
				obj = ((Object) (parseInitialization(xmlpullparser)));
	//   92  177:aload_0         
	//   93  178:aload_1         
	//   94  179:invokevirtual   #992 <Method RangedUri parseInitialization(XmlPullParser)>
	//   95  182:astore          13
				list = list1;
	//   96  184:aload           16
	//   97  186:astore          14
			} else
	//*  98  188:goto            220
			{
				list = list1;
	//   99  191:aload           16
	//  100  193:astore          14
				obj = ((Object) (rangeduri));
	//  101  195:aload           15
	//  102  197:astore          13
				if(XmlPullParserUtil.isStartTag(xmlpullparser, "SegmentTimeline"))
	//* 103  199:aload_1         
	//* 104  200:ldc2            #1004 <String "SegmentTimeline">
	//* 105  203:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//* 106  206:ifeq            220
				{
					list = parseSegmentTimeline(xmlpullparser);
	//  107  209:aload_0         
	//  108  210:aload_1         
	//  109  211:invokevirtual   #1008 <Method List parseSegmentTimeline(XmlPullParser)>
	//  110  214:astore          14
					obj = ((Object) (rangeduri));
	//  111  216:aload           15
	//  112  218:astore          13
				}
			}
			list1 = list;
	//  113  220:aload           14
	//  114  222:astore          16
			rangeduri = ((RangedUri) (obj));
	//  115  224:aload           13
	//  116  226:astore          15
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "SegmentTemplate"));
	//  117  228:aload_1         
	//  118  229:ldc2            #611 <String "SegmentTemplate">
	//  119  232:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//  120  235:ifeq            160
		xmlpullparser = ((XmlPullParser) (list));
	//  121  238:aload           14
	//  122  240:astore_1        
		rangeduri = ((RangedUri) (obj));
	//  123  241:aload           13
	//  124  243:astore          15
		if(segmenttemplate != null)
	//* 125  245:aload_2         
	//* 126  246:ifnull          287
		{
			if(obj == null)
	//* 127  249:aload           13
	//* 128  251:ifnull          257
	//* 129  254:goto            263
				obj = ((Object) (segmenttemplate.initialization));
	//  130  257:aload_2         
	//  131  258:getfield        #1042 <Field RangedUri SegmentBase$SegmentTemplate.initialization>
	//  132  261:astore          13
			if(list != null)
	//* 133  263:aload           14
	//* 134  265:ifnull          278
			{
				xmlpullparser = ((XmlPullParser) (list));
	//  135  268:aload           14
	//  136  270:astore_1        
				rangeduri = ((RangedUri) (obj));
	//  137  271:aload           13
	//  138  273:astore          15
			} else
	//* 139  275:goto            287
			{
				xmlpullparser = ((XmlPullParser) (segmenttemplate.segmentTimeline));
	//  140  278:aload_2         
	//  141  279:getfield        #1043 <Field List SegmentBase$SegmentTemplate.segmentTimeline>
	//  142  282:astore_1        
				rangeduri = ((RangedUri) (obj));
	//  143  283:aload           13
	//  144  285:astore          15
			}
		}
		return buildSegmentTemplate(rangeduri, l2, l3, l, l4, ((List) (xmlpullparser)), urltemplate1, urltemplate);
	//  145  287:aload_0         
	//  146  288:aload           15
	//  147  290:lload           7
	//  148  292:lload           9
	//  149  294:lload_3         
	//  150  295:lload           11
	//  151  297:aload_1         
	//  152  298:aload           18
	//  153  300:aload           17
	//  154  302:invokevirtual   #1045 <Method SegmentBase$SegmentTemplate buildSegmentTemplate(RangedUri, long, long, long, long, List, UrlTemplate, UrlTemplate)>
	//  155  305:areturn         
	}

	protected List parseSegmentTimeline(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #87  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #541 <Method void ArrayList()>
	//    3    7:astore          10
		long l = 0L;
	//    4    9:lconst_0        
	//    5   10:lstore          4
		do
		{
			xmlpullparser.next();
	//    6   12:aload_1         
	//    7   13:invokeinterface #168 <Method int XmlPullParser.next()>
	//    8   18:pop             
			long l1 = l;
	//    9   19:lload           4
	//   10   21:lstore          6
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "S"))
	//*  11   23:aload_1         
	//*  12   24:ldc2            #1047 <String "S">
	//*  13   27:invokestatic    #546 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  14   30:ifeq            108
			{
				l = parseLong(xmlpullparser, "t", l);
	//   15   33:aload_1         
	//   16   34:ldc2            #1049 <String "t">
	//   17   37:lload           4
	//   18   39:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   19   42:lstore          4
				long l2 = parseLong(xmlpullparser, "d", 0x1L);
	//   20   44:aload_1         
	//   21   45:ldc2            #1051 <String "d">
	//   22   48:ldc2w           #746 <Long 0x1L>
	//   23   51:invokestatic    #743 <Method long parseLong(XmlPullParser, String, long)>
	//   24   54:lstore          8
				int i = 0;
	//   25   56:iconst_0        
	//   26   57:istore_2        
				int j = parseInt(xmlpullparser, "r", 0);
	//   27   58:aload_1         
	//   28   59:ldc2            #1053 <String "r">
	//   29   62:iconst_0        
	//   30   63:invokestatic    #522 <Method int parseInt(XmlPullParser, String, int)>
	//   31   66:istore_3        
				do
				{
					l1 = l;
	//   32   67:lload           4
	//   33   69:lstore          6
					if(i >= 1 + j)
						break;
	//   34   71:iload_2         
	//   35   72:iconst_1        
	//   36   73:iload_3         
	//   37   74:iadd            
	//   38   75:icmpge          108
					((List) (arraylist)).add(((Object) (buildSegmentTimelineElement(l, l2))));
	//   39   78:aload           10
	//   40   80:aload_0         
	//   41   81:lload           4
	//   42   83:lload           8
	//   43   85:invokevirtual   #1055 <Method SegmentBase$SegmentTimelineElement buildSegmentTimelineElement(long, long)>
	//   44   88:invokeinterface #597 <Method boolean List.add(Object)>
	//   45   93:pop             
					i++;
	//   46   94:iload_2         
	//   47   95:iconst_1        
	//   48   96:iadd            
	//   49   97:istore_2        
					l += l2;
	//   50   98:lload           4
	//   51  100:lload           8
	//   52  102:ladd            
	//   53  103:lstore          4
				} while(true);
	//   54  105:goto            67
			}
			l = l1;
	//   55  108:lload           6
	//   56  110:lstore          4
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "SegmentTimeline"));
	//   57  112:aload_1         
	//   58  113:ldc2            #1004 <String "SegmentTimeline">
	//   59  116:invokestatic    #268 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//   60  119:ifeq            12
		return ((List) (arraylist));
	//   61  122:aload           10
	//   62  124:areturn         
	}

	protected RangedUri parseSegmentUrl(XmlPullParser xmlpullparser)
	{
		return parseRangedUrl(xmlpullparser, "media", "mediaRange");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #1033 <String "media">
	//    3    5:ldc2            #1058 <String "mediaRange">
	//    4    8:invokevirtual   #878 <Method RangedUri parseRangedUrl(XmlPullParser, String, String)>
	//    5   11:areturn         
	}

	protected UrlTemplate parseUrlTemplate(XmlPullParser xmlpullparser, String s, UrlTemplate urltemplate)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aload_2         
	//    3    3:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_1        
		if(xmlpullparser != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			return UrlTemplate.compile(((String) (xmlpullparser)));
	//    7   13:aload_1         
	//    8   14:invokestatic    #1063 <Method UrlTemplate UrlTemplate.compile(String)>
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
	//    3    3:ldc1            #253 <String "schemeIdUri">
	//    4    5:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    5   10:aload_1         
	//    6   11:aconst_null     
	//    7   12:ldc2            #260 <String "value">
	//    8   15:invokeinterface #244 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    9   20:invokevirtual   #1065 <Method UtcTimingElement buildUtcTimingElement(String, String)>
	//   10   23:areturn         
	}

	private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
	private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
	private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
	private static final String TAG = "MpdParser";
	private final String contentId;
	private final XmlPullParserFactory xmlParserFactory;

	static 
	{
	//    0    0:ldc1            #25  <String "(\\d+)(?:/(\\d+))?">
	//    1    2:invokestatic    #31  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #33  <Field Pattern FRAME_RATE_PATTERN>
	//    3    8:ldc1            #35  <String "CC([1-4])=.*">
	//    4   10:invokestatic    #31  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #37  <Field Pattern CEA_608_ACCESSIBILITY_PATTERN>
	//    6   16:ldc1            #39  <String "([1-9]|[1-5][0-9]|6[0-3])=.*">
	//    7   18:invokestatic    #31  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #41  <Field Pattern CEA_708_ACCESSIBILITY_PATTERN>
	//*   9   24:return          
	}
}
