// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import android.util.Base64;
import com.google.android.exoplayer.extractor.mp4.PsshAtomUtil;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifestParser

private static class SmoothStreamingManifestParser$ProtectionElementParser extends SmoothStreamingManifestParser.ElementParser
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

	public SmoothStreamingManifestParser$ProtectionElementParser(SmoothStreamingManifestParser.ElementParser elementparser, String s)
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
