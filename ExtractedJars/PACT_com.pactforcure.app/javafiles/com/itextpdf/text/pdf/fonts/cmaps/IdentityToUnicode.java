// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			CMapCache, CMapUniCid, CMapToUnicode

public class IdentityToUnicode
{

	public IdentityToUnicode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static CMapToUnicode GetMapFromOrdering(String s)
		throws IOException
	{
		if(!s.equals("CNS1")) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "CNS1">
	//    2    3:invokevirtual   #27  <Method boolean String.equals(Object)>
	//    3    6:ifeq            38
_L1:
		if(identityCNS != null) goto _L4; else goto _L3
	//    4    9:getstatic       #29  <Field CMapToUnicode identityCNS>
	//    5   12:ifnonnull       34
_L3:
		s = ((String) (CMapCache.getCachedCMapUniCid("UniCNS-UTF16-H")));
	//    6   15:ldc1            #31  <String "UniCNS-UTF16-H">
	//    7   17:invokestatic    #37  <Method CMapUniCid CMapCache.getCachedCMapUniCid(String)>
	//    8   20:astore_0        
		if(s != null) goto _L6; else goto _L5
	//    9   21:aload_0         
	//   10   22:ifnonnull       27
_L5:
		return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
_L6:
		identityCNS = ((CMapUniCid) (s)).exportToUnicode();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #43  <Method CMapToUnicode CMapUniCid.exportToUnicode()>
	//   15   31:putstatic       #29  <Field CMapToUnicode identityCNS>
_L4:
		return identityCNS;
	//   16   34:getstatic       #29  <Field CMapToUnicode identityCNS>
	//   17   37:areturn         
_L2:
		if(s.equals("Japan1"))
	//*  18   38:aload_0         
	//*  19   39:ldc1            #45  <String "Japan1">
	//*  20   41:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*  21   44:ifeq            74
		{
			if(identityJapan != null)
				break; /* Loop/switch isn't completed */
	//   22   47:getstatic       #47  <Field CMapToUnicode identityJapan>
	//   23   50:ifnonnull       70
			s = ((String) (CMapCache.getCachedCMapUniCid("UniJIS-UTF16-H")));
	//   24   53:ldc1            #49  <String "UniJIS-UTF16-H">
	//   25   55:invokestatic    #37  <Method CMapUniCid CMapCache.getCachedCMapUniCid(String)>
	//   26   58:astore_0        
			if(s == null)
				continue; /* Loop/switch isn't completed */
	//   27   59:aload_0         
	//   28   60:ifnull          25
			identityJapan = ((CMapUniCid) (s)).exportToUnicode();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #43  <Method CMapToUnicode CMapUniCid.exportToUnicode()>
	//   31   67:putstatic       #47  <Field CMapToUnicode identityJapan>
			break; /* Loop/switch isn't completed */
		}
		break MISSING_BLOCK_LABEL_74;
		if(true) goto _L5; else goto _L7
_L7:
		return identityJapan;
	//   32   70:getstatic       #47  <Field CMapToUnicode identityJapan>
	//   33   73:areturn         
		if(s.equals("Korea1"))
	//*  34   74:aload_0         
	//*  35   75:ldc1            #51  <String "Korea1">
	//*  36   77:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*  37   80:ifeq            110
		{
			if(identityKorea != null)
				break; /* Loop/switch isn't completed */
	//   38   83:getstatic       #53  <Field CMapToUnicode identityKorea>
	//   39   86:ifnonnull       106
			s = ((String) (CMapCache.getCachedCMapUniCid("UniKS-UTF16-H")));
	//   40   89:ldc1            #55  <String "UniKS-UTF16-H">
	//   41   91:invokestatic    #37  <Method CMapUniCid CMapCache.getCachedCMapUniCid(String)>
	//   42   94:astore_0        
			if(s == null)
				continue; /* Loop/switch isn't completed */
	//   43   95:aload_0         
	//   44   96:ifnull          25
			identityKorea = ((CMapUniCid) (s)).exportToUnicode();
	//   45   99:aload_0         
	//   46  100:invokevirtual   #43  <Method CMapToUnicode CMapUniCid.exportToUnicode()>
	//   47  103:putstatic       #53  <Field CMapToUnicode identityKorea>
			break; /* Loop/switch isn't completed */
		}
		break MISSING_BLOCK_LABEL_110;
		if(true) goto _L5; else goto _L8
_L8:
		return identityKorea;
	//   48  106:getstatic       #53  <Field CMapToUnicode identityKorea>
	//   49  109:areturn         
		if(!s.equals("GB1"))
			continue; /* Loop/switch isn't completed */
	//   50  110:aload_0         
	//   51  111:ldc1            #57  <String "GB1">
	//   52  113:invokevirtual   #27  <Method boolean String.equals(Object)>
	//   53  116:ifeq            146
		if(identityGB != null)
			break; /* Loop/switch isn't completed */
	//   54  119:getstatic       #59  <Field CMapToUnicode identityGB>
	//   55  122:ifnonnull       142
		s = ((String) (CMapCache.getCachedCMapUniCid("UniGB-UTF16-H")));
	//   56  125:ldc1            #61  <String "UniGB-UTF16-H">
	//   57  127:invokestatic    #37  <Method CMapUniCid CMapCache.getCachedCMapUniCid(String)>
	//   58  130:astore_0        
		if(s == null)
			continue; /* Loop/switch isn't completed */
	//   59  131:aload_0         
	//   60  132:ifnull          25
		identityGB = ((CMapUniCid) (s)).exportToUnicode();
	//   61  135:aload_0         
	//   62  136:invokevirtual   #43  <Method CMapToUnicode CMapUniCid.exportToUnicode()>
	//   63  139:putstatic       #59  <Field CMapToUnicode identityGB>
		break; /* Loop/switch isn't completed */
		if(true) goto _L5; else goto _L9
_L9:
		return identityGB;
	//   64  142:getstatic       #59  <Field CMapToUnicode identityGB>
	//   65  145:areturn         
		if(!s.equals("Identity")) goto _L5; else goto _L10
	//   66  146:aload_0         
	//   67  147:ldc1            #63  <String "Identity">
	//   68  149:invokevirtual   #27  <Method boolean String.equals(Object)>
	//   69  152:ifeq            25
_L10:
		if(identityH == null)
	//*  70  155:getstatic       #65  <Field CMapToUnicode identityH>
	//*  71  158:ifnonnull       167
			identityH = CMapToUnicode.getIdentity();
	//   72  161:invokestatic    #70  <Method CMapToUnicode CMapToUnicode.getIdentity()>
	//   73  164:putstatic       #65  <Field CMapToUnicode identityH>
		return identityH;
	//   74  167:getstatic       #65  <Field CMapToUnicode identityH>
	//   75  170:areturn         
	}

	private static CMapToUnicode identityCNS;
	private static CMapToUnicode identityGB;
	private static CMapToUnicode identityH;
	private static CMapToUnicode identityJapan;
	private static CMapToUnicode identityKorea;
}
