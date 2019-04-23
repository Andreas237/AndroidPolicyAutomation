// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.Assertions;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifestParser, SmoothStreamingManifest

private static class SmoothStreamingManifestParser$SmoothStreamMediaParser extends SmoothStreamingManifestParser.ElementParser
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

	public SmoothStreamingManifestParser$SmoothStreamMediaParser(SmoothStreamingManifestParser.ElementParser elementparser, String s)
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
