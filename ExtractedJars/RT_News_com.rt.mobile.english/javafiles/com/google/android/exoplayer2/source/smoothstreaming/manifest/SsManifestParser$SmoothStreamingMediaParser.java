// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.Assertions;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming.manifest:
//			SsManifestParser, SsManifest

private static class SsManifestParser$SmoothStreamingMediaParser extends SsManifestParser.ElementParser
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
	//   23   51:getfield        #100 <Field java.util.UUID SsManifest$ProtectionElement.uuid>
	//   24   54:ldc1            #102 <String "video/mp4">
	//   25   56:aload_0         
	//   26   57:getfield        #56  <Field SsManifest$ProtectionElement protectionElement>
	//   27   60:getfield        #106 <Field byte[] SsManifest$ProtectionElement.data>
	//   28   63:invokespecial   #109 <Method void com.google.android.exoplayer2.drm.DrmInitData$SchemeData(java.util.UUID, String, byte[])>
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

	public SsManifestParser$SmoothStreamingMediaParser(SsManifestParser.ElementParser elementparser, String s)
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
