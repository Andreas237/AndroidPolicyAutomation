// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.internal;

import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.interfaces.PdfViewerPreferences;

public class PdfViewerPreferencesImp
	implements PdfViewerPreferences
{

	public PdfViewerPreferencesImp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method void Object()>
		pageLayoutAndMode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #141 <Field int pageLayoutAndMode>
		viewerPreferences = new PdfDictionary();
	//    5    9:aload_0         
	//    6   10:new             #143 <Class PdfDictionary>
	//    7   13:dup             
	//    8   14:invokespecial   #144 <Method void PdfDictionary()>
	//    9   17:putfield        #146 <Field PdfDictionary viewerPreferences>
	//   10   20:return          
	}

	private int getIndex(PdfName pdfname)
	{
		for(int i = 0; i < VIEWER_PREFERENCES.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:getstatic       #77  <Field PdfName[] VIEWER_PREFERENCES>
	//*   4    6:arraylength     
	//*   5    7:icmpge          31
			if(VIEWER_PREFERENCES[i].equals(((Object) (pdfname))))
	//*   6   10:getstatic       #77  <Field PdfName[] VIEWER_PREFERENCES>
	//*   7   13:iload_2         
	//*   8   14:aaload          
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//*  11   19:ifeq            24
				return i;
	//   12   22:iload_2         
	//   13   23:ireturn         

	//   14   24:iload_2         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_2        
	//*  18   28:goto            2
		return -1;
	//   19   31:iconst_m1       
	//   20   32:ireturn         
	}

	public static PdfViewerPreferencesImp getViewerPreferences(PdfDictionary pdfdictionary)
	{
		int i;
		int j;
		PdfViewerPreferencesImp pdfviewerpreferencesimp;
		Object obj;
		pdfviewerpreferencesimp = new PdfViewerPreferencesImp();
	//    0    0:new             #2   <Class PdfViewerPreferencesImp>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void PdfViewerPreferencesImp()>
	//    3    7:astore_3        
		j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		obj = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.PAGELAYOUT))));
	//    6   10:aload_0         
	//    7   11:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//    8   14:invokevirtual   #162 <Method PdfObject PdfDictionary.get(PdfName)>
	//    9   17:invokestatic    #168 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   10   20:astore          4
		i = j;
	//   11   22:iload_2         
	//   12   23:istore_1        
		if(obj == null) goto _L2; else goto _L1
	//   13   24:aload           4
	//   14   26:ifnull          61
_L1:
		i = j;
	//   15   29:iload_2         
	//   16   30:istore_1        
		if(!((PdfObject) (obj)).isName()) goto _L2; else goto _L3
	//   17   31:aload           4
	//   18   33:invokevirtual   #174 <Method boolean PdfObject.isName()>
	//   19   36:ifeq            61
_L3:
		obj = ((Object) ((PdfName)obj));
	//   20   39:aload           4
	//   21   41:checkcast       #23  <Class PdfName>
	//   22   44:astore          4
		if(!((PdfName) (obj)).equals(((Object) (PdfName.SINGLEPAGE)))) goto _L5; else goto _L4
	//   23   46:aload           4
	//   24   48:getstatic       #177 <Field PdfName PdfName.SINGLEPAGE>
	//   25   51:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//   26   54:ifeq            187
_L4:
		i = ((int) (false | true));
	//   27   57:iconst_0        
	//   28   58:iconst_1        
	//   29   59:ior             
	//   30   60:istore_1        
_L2:
		obj = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.PAGEMODE))));
	//   31   61:aload_0         
	//   32   62:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//   33   65:invokevirtual   #162 <Method PdfObject PdfDictionary.get(PdfName)>
	//   34   68:invokestatic    #168 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   35   71:astore          4
		j = i;
	//   36   73:iload_1         
	//   37   74:istore_2        
		if(obj == null) goto _L7; else goto _L6
	//   38   75:aload           4
	//   39   77:ifnull          113
_L6:
		j = i;
	//   40   80:iload_1         
	//   41   81:istore_2        
		if(!((PdfObject) (obj)).isName()) goto _L7; else goto _L8
	//   42   82:aload           4
	//   43   84:invokevirtual   #174 <Method boolean PdfObject.isName()>
	//   44   87:ifeq            113
_L8:
		obj = ((Object) ((PdfName)obj));
	//   45   90:aload           4
	//   46   92:checkcast       #23  <Class PdfName>
	//   47   95:astore          4
		if(!((PdfName) (obj)).equals(((Object) (PdfName.USENONE)))) goto _L10; else goto _L9
	//   48   97:aload           4
	//   49   99:getstatic       #80  <Field PdfName PdfName.USENONE>
	//   50  102:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//   51  105:ifeq            282
_L9:
		j = i | 0x40;
	//   52  108:iload_1         
	//   53  109:bipush          64
	//   54  111:ior             
	//   55  112:istore_2        
_L7:
		pdfviewerpreferencesimp.setViewerPreferences(j);
	//   56  113:aload_3         
	//   57  114:iload_2         
	//   58  115:invokevirtual   #184 <Method void setViewerPreferences(int)>
		pdfdictionary = ((PdfDictionary) (PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.VIEWERPREFERENCES))));
	//   59  118:aload_0         
	//   60  119:getstatic       #187 <Field PdfName PdfName.VIEWERPREFERENCES>
	//   61  122:invokevirtual   #162 <Method PdfObject PdfDictionary.get(PdfName)>
	//   62  125:invokestatic    #168 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   63  128:astore_0        
		if(pdfdictionary != null && ((PdfObject) (pdfdictionary)).isDictionary())
	//*  64  129:aload_0         
	//*  65  130:ifnull          384
	//*  66  133:aload_0         
	//*  67  134:invokevirtual   #190 <Method boolean PdfObject.isDictionary()>
	//*  68  137:ifeq            384
		{
			pdfdictionary = (PdfDictionary)pdfdictionary;
	//   69  140:aload_0         
	//   70  141:checkcast       #143 <Class PdfDictionary>
	//   71  144:astore_0        
			for(i = 0; i < VIEWER_PREFERENCES.length; i++)
	//*  72  145:iconst_0        
	//*  73  146:istore_1        
	//*  74  147:iload_1         
	//*  75  148:getstatic       #77  <Field PdfName[] VIEWER_PREFERENCES>
	//*  76  151:arraylength     
	//*  77  152:icmpge          384
			{
				obj = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary.get(VIEWER_PREFERENCES[i]))));
	//   78  155:aload_0         
	//   79  156:getstatic       #77  <Field PdfName[] VIEWER_PREFERENCES>
	//   80  159:iload_1         
	//   81  160:aaload          
	//   82  161:invokevirtual   #162 <Method PdfObject PdfDictionary.get(PdfName)>
	//   83  164:invokestatic    #168 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   84  167:astore          4
				pdfviewerpreferencesimp.addViewerPreference(VIEWER_PREFERENCES[i], ((PdfObject) (obj)));
	//   85  169:aload_3         
	//   86  170:getstatic       #77  <Field PdfName[] VIEWER_PREFERENCES>
	//   87  173:iload_1         
	//   88  174:aaload          
	//   89  175:aload           4
	//   90  177:invokevirtual   #194 <Method void addViewerPreference(PdfName, PdfObject)>
			}

	//   91  180:iload_1         
	//   92  181:iconst_1        
	//   93  182:iadd            
	//   94  183:istore_1        
		}
		break; /* Loop/switch isn't completed */
	//   95  184:goto            147
_L5:
		if(((PdfName) (obj)).equals(((Object) (PdfName.ONECOLUMN))))
	//*  96  187:aload           4
	//*  97  189:getstatic       #197 <Field PdfName PdfName.ONECOLUMN>
	//*  98  192:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//*  99  195:ifeq            205
			i = 0 | 2;
	//  100  198:iconst_0        
	//  101  199:iconst_2        
	//  102  200:ior             
	//  103  201:istore_1        
		else
	//* 104  202:goto            61
		if(((PdfName) (obj)).equals(((Object) (PdfName.TWOCOLUMNLEFT))))
	//* 105  205:aload           4
	//* 106  207:getstatic       #200 <Field PdfName PdfName.TWOCOLUMNLEFT>
	//* 107  210:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 108  213:ifeq            223
			i = 0 | 4;
	//  109  216:iconst_0        
	//  110  217:iconst_4        
	//  111  218:ior             
	//  112  219:istore_1        
		else
	//* 113  220:goto            61
		if(((PdfName) (obj)).equals(((Object) (PdfName.TWOCOLUMNRIGHT))))
	//* 114  223:aload           4
	//* 115  225:getstatic       #203 <Field PdfName PdfName.TWOCOLUMNRIGHT>
	//* 116  228:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 117  231:ifeq            242
			i = 0 | 8;
	//  118  234:iconst_0        
	//  119  235:bipush          8
	//  120  237:ior             
	//  121  238:istore_1        
		else
	//* 122  239:goto            61
		if(((PdfName) (obj)).equals(((Object) (PdfName.TWOPAGELEFT))))
	//* 123  242:aload           4
	//* 124  244:getstatic       #206 <Field PdfName PdfName.TWOPAGELEFT>
	//* 125  247:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 126  250:ifeq            261
		{
			i = 0 | 0x10;
	//  127  253:iconst_0        
	//  128  254:bipush          16
	//  129  256:ior             
	//  130  257:istore_1        
		} else
	//* 131  258:goto            61
		{
			i = j;
	//  132  261:iload_2         
	//  133  262:istore_1        
			if(((PdfName) (obj)).equals(((Object) (PdfName.TWOPAGERIGHT))))
	//* 134  263:aload           4
	//* 135  265:getstatic       #209 <Field PdfName PdfName.TWOPAGERIGHT>
	//* 136  268:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 137  271:ifeq            61
				i = 0 | 0x20;
	//  138  274:iconst_0        
	//  139  275:bipush          32
	//  140  277:ior             
	//  141  278:istore_1        
		}
		continue; /* Loop/switch isn't completed */
	//  142  279:goto            61
_L10:
		if(((PdfName) (obj)).equals(((Object) (PdfName.USEOUTLINES))))
	//* 143  282:aload           4
	//* 144  284:getstatic       #83  <Field PdfName PdfName.USEOUTLINES>
	//* 145  287:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 146  290:ifeq            302
			j = i | 0x80;
	//  147  293:iload_1         
	//  148  294:sipush          128
	//  149  297:ior             
	//  150  298:istore_2        
		else
	//* 151  299:goto            113
		if(((PdfName) (obj)).equals(((Object) (PdfName.USETHUMBS))))
	//* 152  302:aload           4
	//* 153  304:getstatic       #86  <Field PdfName PdfName.USETHUMBS>
	//* 154  307:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 155  310:ifeq            322
			j = i | 0x100;
	//  156  313:iload_1         
	//  157  314:sipush          256
	//  158  317:ior             
	//  159  318:istore_2        
		else
	//* 160  319:goto            113
		if(((PdfName) (obj)).equals(((Object) (PdfName.FULLSCREEN))))
	//* 161  322:aload           4
	//* 162  324:getstatic       #212 <Field PdfName PdfName.FULLSCREEN>
	//* 163  327:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 164  330:ifeq            342
			j = i | 0x200;
	//  165  333:iload_1         
	//  166  334:sipush          512
	//  167  337:ior             
	//  168  338:istore_2        
		else
	//* 169  339:goto            113
		if(((PdfName) (obj)).equals(((Object) (PdfName.USEOC))))
	//* 170  342:aload           4
	//* 171  344:getstatic       #89  <Field PdfName PdfName.USEOC>
	//* 172  347:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 173  350:ifeq            362
		{
			j = i | 0x400;
	//  174  353:iload_1         
	//  175  354:sipush          1024
	//  176  357:ior             
	//  177  358:istore_2        
		} else
	//* 178  359:goto            113
		{
			j = i;
	//  179  362:iload_1         
	//  180  363:istore_2        
			if(((PdfName) (obj)).equals(((Object) (PdfName.USEATTACHMENTS))))
	//* 181  364:aload           4
	//* 182  366:getstatic       #215 <Field PdfName PdfName.USEATTACHMENTS>
	//* 183  369:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//* 184  372:ifeq            113
				j = i | 0x800;
	//  185  375:iload_1         
	//  186  376:sipush          2048
	//  187  379:ior             
	//  188  380:istore_2        
		}
		if(true) goto _L7; else goto _L11
	//  189  381:goto            113
_L11:
		return pdfviewerpreferencesimp;
	//  190  384:aload_3         
	//  191  385:areturn         
		if(true) goto _L2; else goto _L12
_L12:
	}

	private boolean isPossibleValue(PdfName pdfname, PdfName apdfname[])
	{
		for(int i = 0; i < apdfname.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:arraylength     
	//*   5    5:icmpge          27
			if(apdfname[i].equals(((Object) (pdfname))))
	//*   6    8:aload_2         
	//*   7    9:iload_3         
	//*   8   10:aaload          
	//*   9   11:aload_1         
	//*  10   12:invokevirtual   #152 <Method boolean PdfName.equals(Object)>
	//*  11   15:ifeq            20
				return true;
	//   12   18:iconst_1        
	//   13   19:ireturn         

	//   14   20:iload_3         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_3        
	//*  18   24:goto            2
		return false;
	//   19   27:iconst_0        
	//   20   28:ireturn         
	}

	public void addToCatalog(PdfDictionary pdfdictionary)
	{
		pdfdictionary.remove(PdfName.PAGELAYOUT);
	//    0    0:aload_1         
	//    1    1:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//    2    4:invokevirtual   #223 <Method void PdfDictionary.remove(PdfName)>
		if((pageLayoutAndMode & 1) != 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #141 <Field int pageLayoutAndMode>
	//*   5   11:iconst_1        
	//*   6   12:iand            
	//*   7   13:ifeq            82
			pdfdictionary.put(PdfName.PAGELAYOUT, ((PdfObject) (PdfName.SINGLEPAGE)));
	//    8   16:aload_1         
	//    9   17:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//   10   20:getstatic       #177 <Field PdfName PdfName.SINGLEPAGE>
	//   11   23:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  12   26:aload_1         
	//*  13   27:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//*  14   30:invokevirtual   #223 <Method void PdfDictionary.remove(PdfName)>
	//*  15   33:aload_0         
	//*  16   34:getfield        #141 <Field int pageLayoutAndMode>
	//*  17   37:bipush          64
	//*  18   39:iand            
	//*  19   40:ifeq            195
	//*  20   43:aload_1         
	//*  21   44:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//*  22   47:getstatic       #80  <Field PdfName PdfName.USENONE>
	//*  23   50:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  24   53:aload_1         
	//*  25   54:getstatic       #187 <Field PdfName PdfName.VIEWERPREFERENCES>
	//*  26   57:invokevirtual   #223 <Method void PdfDictionary.remove(PdfName)>
	//*  27   60:aload_0         
	//*  28   61:getfield        #146 <Field PdfDictionary viewerPreferences>
	//*  29   64:invokevirtual   #230 <Method int PdfDictionary.size()>
	//*  30   67:ifle            81
	//*  31   70:aload_1         
	//*  32   71:getstatic       #187 <Field PdfName PdfName.VIEWERPREFERENCES>
	//*  33   74:aload_0         
	//*  34   75:getfield        #146 <Field PdfDictionary viewerPreferences>
	//*  35   78:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  36   81:return          
		if((pageLayoutAndMode & 2) != 0)
	//*  37   82:aload_0         
	//*  38   83:getfield        #141 <Field int pageLayoutAndMode>
	//*  39   86:iconst_2        
	//*  40   87:iand            
	//*  41   88:ifeq            104
			pdfdictionary.put(PdfName.PAGELAYOUT, ((PdfObject) (PdfName.ONECOLUMN)));
	//   42   91:aload_1         
	//   43   92:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//   44   95:getstatic       #197 <Field PdfName PdfName.ONECOLUMN>
	//   45   98:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  46  101:goto            26
		if((pageLayoutAndMode & 4) != 0)
	//*  47  104:aload_0         
	//*  48  105:getfield        #141 <Field int pageLayoutAndMode>
	//*  49  108:iconst_4        
	//*  50  109:iand            
	//*  51  110:ifeq            126
			pdfdictionary.put(PdfName.PAGELAYOUT, ((PdfObject) (PdfName.TWOCOLUMNLEFT)));
	//   52  113:aload_1         
	//   53  114:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//   54  117:getstatic       #200 <Field PdfName PdfName.TWOCOLUMNLEFT>
	//   55  120:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  56  123:goto            26
		if((pageLayoutAndMode & 8) != 0)
	//*  57  126:aload_0         
	//*  58  127:getfield        #141 <Field int pageLayoutAndMode>
	//*  59  130:bipush          8
	//*  60  132:iand            
	//*  61  133:ifeq            149
			pdfdictionary.put(PdfName.PAGELAYOUT, ((PdfObject) (PdfName.TWOCOLUMNRIGHT)));
	//   62  136:aload_1         
	//   63  137:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//   64  140:getstatic       #203 <Field PdfName PdfName.TWOCOLUMNRIGHT>
	//   65  143:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  66  146:goto            26
		if((pageLayoutAndMode & 0x10) != 0)
	//*  67  149:aload_0         
	//*  68  150:getfield        #141 <Field int pageLayoutAndMode>
	//*  69  153:bipush          16
	//*  70  155:iand            
	//*  71  156:ifeq            172
			pdfdictionary.put(PdfName.PAGELAYOUT, ((PdfObject) (PdfName.TWOPAGELEFT)));
	//   72  159:aload_1         
	//   73  160:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//   74  163:getstatic       #206 <Field PdfName PdfName.TWOPAGELEFT>
	//   75  166:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  76  169:goto            26
		if((pageLayoutAndMode & 0x20) != 0)
	//*  77  172:aload_0         
	//*  78  173:getfield        #141 <Field int pageLayoutAndMode>
	//*  79  176:bipush          32
	//*  80  178:iand            
	//*  81  179:ifeq            26
			pdfdictionary.put(PdfName.PAGELAYOUT, ((PdfObject) (PdfName.TWOPAGERIGHT)));
	//   82  182:aload_1         
	//   83  183:getstatic       #158 <Field PdfName PdfName.PAGELAYOUT>
	//   84  186:getstatic       #209 <Field PdfName PdfName.TWOPAGERIGHT>
	//   85  189:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.remove(PdfName.PAGEMODE);
		if((pageLayoutAndMode & 0x40) != 0)
			pdfdictionary.put(PdfName.PAGEMODE, ((PdfObject) (PdfName.USENONE)));
		else
	//*  86  192:goto            26
		if((pageLayoutAndMode & 0x80) != 0)
	//*  87  195:aload_0         
	//*  88  196:getfield        #141 <Field int pageLayoutAndMode>
	//*  89  199:sipush          128
	//*  90  202:iand            
	//*  91  203:ifeq            219
			pdfdictionary.put(PdfName.PAGEMODE, ((PdfObject) (PdfName.USEOUTLINES)));
	//   92  206:aload_1         
	//   93  207:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//   94  210:getstatic       #83  <Field PdfName PdfName.USEOUTLINES>
	//   95  213:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  96  216:goto            53
		if((pageLayoutAndMode & 0x100) != 0)
	//*  97  219:aload_0         
	//*  98  220:getfield        #141 <Field int pageLayoutAndMode>
	//*  99  223:sipush          256
	//* 100  226:iand            
	//* 101  227:ifeq            243
			pdfdictionary.put(PdfName.PAGEMODE, ((PdfObject) (PdfName.USETHUMBS)));
	//  102  230:aload_1         
	//  103  231:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//  104  234:getstatic       #86  <Field PdfName PdfName.USETHUMBS>
	//  105  237:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//* 106  240:goto            53
		if((pageLayoutAndMode & 0x200) != 0)
	//* 107  243:aload_0         
	//* 108  244:getfield        #141 <Field int pageLayoutAndMode>
	//* 109  247:sipush          512
	//* 110  250:iand            
	//* 111  251:ifeq            267
			pdfdictionary.put(PdfName.PAGEMODE, ((PdfObject) (PdfName.FULLSCREEN)));
	//  112  254:aload_1         
	//  113  255:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//  114  258:getstatic       #212 <Field PdfName PdfName.FULLSCREEN>
	//  115  261:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//* 116  264:goto            53
		if((pageLayoutAndMode & 0x400) != 0)
	//* 117  267:aload_0         
	//* 118  268:getfield        #141 <Field int pageLayoutAndMode>
	//* 119  271:sipush          1024
	//* 120  274:iand            
	//* 121  275:ifeq            291
			pdfdictionary.put(PdfName.PAGEMODE, ((PdfObject) (PdfName.USEOC)));
	//  122  278:aload_1         
	//  123  279:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//  124  282:getstatic       #89  <Field PdfName PdfName.USEOC>
	//  125  285:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//* 126  288:goto            53
		if((pageLayoutAndMode & 0x800) != 0)
	//* 127  291:aload_0         
	//* 128  292:getfield        #141 <Field int pageLayoutAndMode>
	//* 129  295:sipush          2048
	//* 130  298:iand            
	//* 131  299:ifeq            53
			pdfdictionary.put(PdfName.PAGEMODE, ((PdfObject) (PdfName.USEATTACHMENTS)));
	//  132  302:aload_1         
	//  133  303:getstatic       #180 <Field PdfName PdfName.PAGEMODE>
	//  134  306:getstatic       #215 <Field PdfName PdfName.USEATTACHMENTS>
	//  135  309:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.remove(PdfName.VIEWERPREFERENCES);
		if(viewerPreferences.size() > 0)
			pdfdictionary.put(PdfName.VIEWERPREFERENCES, ((PdfObject) (viewerPreferences)));
	//* 136  312:goto            53
	}

	public void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		getIndex(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #232 <Method int getIndex(PdfName)>
		JVM INSTR tableswitch 0 16: default 88
	//	               0 89
	//	               1 89
	//	               2 89
	//	               3 89
	//	               4 89
	//	               5 89
	//	               6 106
	//	               7 137
	//	               8 168
	//	               9 168
	//	               10 168
	//	               11 168
	//	               12 199
	//	               13 230
	//	               14 89
	//	               15 261
	//	               16 278;
	//    3    5:tableswitch     0 16: default 88
	//	               0 89
	//	               1 89
	//	               2 89
	//	               3 89
	//	               4 89
	//	               5 89
	//	               6 106
	//	               7 137
	//	               8 168
	//	               9 168
	//	               10 168
	//	               11 168
	//	               12 199
	//	               13 230
	//	               14 89
	//	               15 261
	//	               16 278
		   goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L5 _L5 _L5 _L6 _L7 _L2 _L8 _L9
_L1:
		return;
	//    4   88:return          
_L2:
		if(pdfobject instanceof PdfBoolean)
	//*   5   89:aload_2         
	//*   6   90:instanceof      #234 <Class PdfBoolean>
	//*   7   93:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//    8   96:aload_0         
	//    9   97:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   10  100:aload_1         
	//   11  101:aload_2         
	//   12  102:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   13  105:return          
		}
		continue; /* Loop/switch isn't completed */
_L3:
		if((pdfobject instanceof PdfName) && isPossibleValue((PdfName)pdfobject, NONFULLSCREENPAGEMODE_PREFERENCES))
	//*  14  106:aload_2         
	//*  15  107:instanceof      #23  <Class PdfName>
	//*  16  110:ifeq            88
	//*  17  113:aload_0         
	//*  18  114:aload_2         
	//*  19  115:checkcast       #23  <Class PdfName>
	//*  20  118:getstatic       #91  <Field PdfName[] NONFULLSCREENPAGEMODE_PREFERENCES>
	//*  21  121:invokespecial   #236 <Method boolean isPossibleValue(PdfName, PdfName[])>
	//*  22  124:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//   23  127:aload_0         
	//   24  128:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   25  131:aload_1         
	//   26  132:aload_2         
	//   27  133:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   28  136:return          
		}
		continue; /* Loop/switch isn't completed */
_L4:
		if((pdfobject instanceof PdfName) && isPossibleValue((PdfName)pdfobject, DIRECTION_PREFERENCES))
	//*  29  137:aload_2         
	//*  30  138:instanceof      #23  <Class PdfName>
	//*  31  141:ifeq            88
	//*  32  144:aload_0         
	//*  33  145:aload_2         
	//*  34  146:checkcast       #23  <Class PdfName>
	//*  35  149:getstatic       #99  <Field PdfName[] DIRECTION_PREFERENCES>
	//*  36  152:invokespecial   #236 <Method boolean isPossibleValue(PdfName, PdfName[])>
	//*  37  155:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//   38  158:aload_0         
	//   39  159:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   40  162:aload_1         
	//   41  163:aload_2         
	//   42  164:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   43  167:return          
		}
		continue; /* Loop/switch isn't completed */
_L5:
		if((pdfobject instanceof PdfName) && isPossibleValue((PdfName)pdfobject, PAGE_BOUNDARIES))
	//*  44  168:aload_2         
	//*  45  169:instanceof      #23  <Class PdfName>
	//*  46  172:ifeq            88
	//*  47  175:aload_0         
	//*  48  176:aload_2         
	//*  49  177:checkcast       #23  <Class PdfName>
	//*  50  180:getstatic       #116 <Field PdfName[] PAGE_BOUNDARIES>
	//*  51  183:invokespecial   #236 <Method boolean isPossibleValue(PdfName, PdfName[])>
	//*  52  186:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//   53  189:aload_0         
	//   54  190:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   55  193:aload_1         
	//   56  194:aload_2         
	//   57  195:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   58  198:return          
		}
		continue; /* Loop/switch isn't completed */
_L6:
		if((pdfobject instanceof PdfName) && isPossibleValue((PdfName)pdfobject, PRINTSCALING_PREFERENCES))
	//*  59  199:aload_2         
	//*  60  200:instanceof      #23  <Class PdfName>
	//*  61  203:ifeq            88
	//*  62  206:aload_0         
	//*  63  207:aload_2         
	//*  64  208:checkcast       #23  <Class PdfName>
	//*  65  211:getstatic       #124 <Field PdfName[] PRINTSCALING_PREFERENCES>
	//*  66  214:invokespecial   #236 <Method boolean isPossibleValue(PdfName, PdfName[])>
	//*  67  217:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//   68  220:aload_0         
	//   69  221:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   70  224:aload_1         
	//   71  225:aload_2         
	//   72  226:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   73  229:return          
		}
		continue; /* Loop/switch isn't completed */
_L7:
		if((pdfobject instanceof PdfName) && isPossibleValue((PdfName)pdfobject, DUPLEX_PREFERENCES))
	//*  74  230:aload_2         
	//*  75  231:instanceof      #23  <Class PdfName>
	//*  76  234:ifeq            88
	//*  77  237:aload_0         
	//*  78  238:aload_2         
	//*  79  239:checkcast       #23  <Class PdfName>
	//*  80  242:getstatic       #135 <Field PdfName[] DUPLEX_PREFERENCES>
	//*  81  245:invokespecial   #236 <Method boolean isPossibleValue(PdfName, PdfName[])>
	//*  82  248:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//   83  251:aload_0         
	//   84  252:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   85  255:aload_1         
	//   86  256:aload_2         
	//   87  257:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   88  260:return          
		}
		continue; /* Loop/switch isn't completed */
_L8:
		if(pdfobject instanceof PdfArray)
	//*  89  261:aload_2         
	//*  90  262:instanceof      #238 <Class PdfArray>
	//*  91  265:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//   92  268:aload_0         
	//   93  269:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   94  272:aload_1         
	//   95  273:aload_2         
	//   96  274:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   97  277:return          
		}
		continue; /* Loop/switch isn't completed */
_L9:
		if(pdfobject instanceof PdfNumber)
	//*  98  278:aload_2         
	//*  99  279:instanceof      #240 <Class PdfNumber>
	//* 100  282:ifeq            88
		{
			viewerPreferences.put(pdfname, pdfobject);
	//  101  285:aload_0         
	//  102  286:getfield        #146 <Field PdfDictionary viewerPreferences>
	//  103  289:aload_1         
	//  104  290:aload_2         
	//  105  291:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//  106  294:return          
		}
		if(true) goto _L1; else goto _L10
_L10:
	}

	public int getPageLayoutAndMode()
	{
		return pageLayoutAndMode;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int pageLayoutAndMode>
	//    2    4:ireturn         
	}

	public PdfDictionary getViewerPreferences()
	{
		return viewerPreferences;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field PdfDictionary viewerPreferences>
	//    2    4:areturn         
	}

	public void setViewerPreferences(int i)
	{
		pageLayoutAndMode = pageLayoutAndMode | i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #141 <Field int pageLayoutAndMode>
	//    3    5:iload_1         
	//    4    6:ior             
	//    5    7:putfield        #141 <Field int pageLayoutAndMode>
		if((0xfff000 & i) != 0)
	//*   6   10:ldc1            #16  <Int 0xfff000>
	//*   7   12:iload_1         
	//*   8   13:iand            
	//*   9   14:ifeq            211
		{
			pageLayoutAndMode = 0xff000fff & pageLayoutAndMode;
	//   10   17:aload_0         
	//   11   18:ldc1            #243 <Int 0xff000fff>
	//   12   20:aload_0         
	//   13   21:getfield        #141 <Field int pageLayoutAndMode>
	//   14   24:iand            
	//   15   25:putfield        #141 <Field int pageLayoutAndMode>
			if((i & 0x1000) != 0)
	//*  16   28:iload_1         
	//*  17   29:sipush          4096
	//*  18   32:iand            
	//*  19   33:ifeq            49
				viewerPreferences.put(PdfName.HIDETOOLBAR, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   20   36:aload_0         
	//   21   37:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   22   40:getstatic       #27  <Field PdfName PdfName.HIDETOOLBAR>
	//   23   43:getstatic       #247 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   24   46:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((i & 0x2000) != 0)
	//*  25   49:iload_1         
	//*  26   50:sipush          8192
	//*  27   53:iand            
	//*  28   54:ifeq            70
				viewerPreferences.put(PdfName.HIDEMENUBAR, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   29   57:aload_0         
	//   30   58:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   31   61:getstatic       #30  <Field PdfName PdfName.HIDEMENUBAR>
	//   32   64:getstatic       #247 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   33   67:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((i & 0x4000) != 0)
	//*  34   70:iload_1         
	//*  35   71:sipush          16384
	//*  36   74:iand            
	//*  37   75:ifeq            91
				viewerPreferences.put(PdfName.HIDEWINDOWUI, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   38   78:aload_0         
	//   39   79:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   40   82:getstatic       #33  <Field PdfName PdfName.HIDEWINDOWUI>
	//   41   85:getstatic       #247 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   42   88:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((0x8000 & i) != 0)
	//*  43   91:ldc1            #248 <Int 32768>
	//*  44   93:iload_1         
	//*  45   94:iand            
	//*  46   95:ifeq            111
				viewerPreferences.put(PdfName.FITWINDOW, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   47   98:aload_0         
	//   48   99:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   49  102:getstatic       #36  <Field PdfName PdfName.FITWINDOW>
	//   50  105:getstatic       #247 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   51  108:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((0x10000 & i) != 0)
	//*  52  111:ldc1            #249 <Int 0x10000>
	//*  53  113:iload_1         
	//*  54  114:iand            
	//*  55  115:ifeq            131
				viewerPreferences.put(PdfName.CENTERWINDOW, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   56  118:aload_0         
	//   57  119:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   58  122:getstatic       #39  <Field PdfName PdfName.CENTERWINDOW>
	//   59  125:getstatic       #247 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   60  128:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((0x20000 & i) != 0)
	//*  61  131:ldc1            #250 <Int 0x20000>
	//*  62  133:iload_1         
	//*  63  134:iand            
	//*  64  135:ifeq            151
				viewerPreferences.put(PdfName.DISPLAYDOCTITLE, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   65  138:aload_0         
	//   66  139:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   67  142:getstatic       #42  <Field PdfName PdfName.DISPLAYDOCTITLE>
	//   68  145:getstatic       #247 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   69  148:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((0x40000 & i) != 0)
	//*  70  151:ldc1            #251 <Int 0x40000>
	//*  71  153:iload_1         
	//*  72  154:iand            
	//*  73  155:ifeq            212
				viewerPreferences.put(PdfName.NONFULLSCREENPAGEMODE, ((PdfObject) (PdfName.USENONE)));
	//   74  158:aload_0         
	//   75  159:getfield        #146 <Field PdfDictionary viewerPreferences>
	//   76  162:getstatic       #45  <Field PdfName PdfName.NONFULLSCREENPAGEMODE>
	//   77  165:getstatic       #80  <Field PdfName PdfName.USENONE>
	//   78  168:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			else
	//*  79  171:ldc1            #252 <Int 0x400000>
	//*  80  173:iload_1         
	//*  81  174:iand            
	//*  82  175:ifeq            282
	//*  83  178:aload_0         
	//*  84  179:getfield        #146 <Field PdfDictionary viewerPreferences>
	//*  85  182:getstatic       #48  <Field PdfName PdfName.DIRECTION>
	//*  86  185:getstatic       #94  <Field PdfName PdfName.L2R>
	//*  87  188:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  88  191:ldc1            #253 <Int 0x1000000>
	//*  89  193:iload_1         
	//*  90  194:iand            
	//*  91  195:ifeq            211
	//*  92  198:aload_0         
	//*  93  199:getfield        #146 <Field PdfDictionary viewerPreferences>
	//*  94  202:getstatic       #63  <Field PdfName PdfName.PRINTSCALING>
	//*  95  205:getstatic       #122 <Field PdfName PdfName.NONE>
	//*  96  208:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  97  211:return          
			if((0x80000 & i) != 0)
	//*  98  212:ldc1            #254 <Int 0x80000>
	//*  99  214:iload_1         
	//* 100  215:iand            
	//* 101  216:ifeq            235
				viewerPreferences.put(PdfName.NONFULLSCREENPAGEMODE, ((PdfObject) (PdfName.USEOUTLINES)));
	//  102  219:aload_0         
	//  103  220:getfield        #146 <Field PdfDictionary viewerPreferences>
	//  104  223:getstatic       #45  <Field PdfName PdfName.NONFULLSCREENPAGEMODE>
	//  105  226:getstatic       #83  <Field PdfName PdfName.USEOUTLINES>
	//  106  229:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			else
	//* 107  232:goto            171
			if((0x100000 & i) != 0)
	//* 108  235:ldc1            #255 <Int 0x100000>
	//* 109  237:iload_1         
	//* 110  238:iand            
	//* 111  239:ifeq            258
				viewerPreferences.put(PdfName.NONFULLSCREENPAGEMODE, ((PdfObject) (PdfName.USETHUMBS)));
	//  112  242:aload_0         
	//  113  243:getfield        #146 <Field PdfDictionary viewerPreferences>
	//  114  246:getstatic       #45  <Field PdfName PdfName.NONFULLSCREENPAGEMODE>
	//  115  249:getstatic       #86  <Field PdfName PdfName.USETHUMBS>
	//  116  252:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			else
	//* 117  255:goto            171
			if((0x200000 & i) != 0)
	//* 118  258:ldc2            #256 <Int 0x200000>
	//* 119  261:iload_1         
	//* 120  262:iand            
	//* 121  263:ifeq            171
				viewerPreferences.put(PdfName.NONFULLSCREENPAGEMODE, ((PdfObject) (PdfName.USEOC)));
	//  122  266:aload_0         
	//  123  267:getfield        #146 <Field PdfDictionary viewerPreferences>
	//  124  270:getstatic       #45  <Field PdfName PdfName.NONFULLSCREENPAGEMODE>
	//  125  273:getstatic       #89  <Field PdfName PdfName.USEOC>
	//  126  276:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((0x400000 & i) != 0)
				viewerPreferences.put(PdfName.DIRECTION, ((PdfObject) (PdfName.L2R)));
			else
	//* 127  279:goto            171
			if((0x800000 & i) != 0)
	//* 128  282:ldc2            #257 <Int 0x800000>
	//* 129  285:iload_1         
	//* 130  286:iand            
	//* 131  287:ifeq            191
				viewerPreferences.put(PdfName.DIRECTION, ((PdfObject) (PdfName.R2L)));
	//  132  290:aload_0         
	//  133  291:getfield        #146 <Field PdfDictionary viewerPreferences>
	//  134  294:getstatic       #48  <Field PdfName PdfName.DIRECTION>
	//  135  297:getstatic       #97  <Field PdfName PdfName.R2L>
	//  136  300:invokevirtual   #226 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if((0x1000000 & i) != 0)
				viewerPreferences.put(PdfName.PRINTSCALING, ((PdfObject) (PdfName.NONE)));
		}
	//* 137  303:goto            191
	}

	public static final PdfName DIRECTION_PREFERENCES[];
	public static final PdfName DUPLEX_PREFERENCES[];
	public static final PdfName NONFULLSCREENPAGEMODE_PREFERENCES[];
	public static final PdfName PAGE_BOUNDARIES[];
	public static final PdfName PRINTSCALING_PREFERENCES[];
	public static final PdfName VIEWER_PREFERENCES[];
	private static final int viewerPreferencesMask = 0xfff000;
	private int pageLayoutAndMode;
	private PdfDictionary viewerPreferences;

	static 
	{
		VIEWER_PREFERENCES = (new PdfName[] {
			PdfName.HIDETOOLBAR, PdfName.HIDEMENUBAR, PdfName.HIDEWINDOWUI, PdfName.FITWINDOW, PdfName.CENTERWINDOW, PdfName.DISPLAYDOCTITLE, PdfName.NONFULLSCREENPAGEMODE, PdfName.DIRECTION, PdfName.VIEWAREA, PdfName.VIEWCLIP, 
			PdfName.PRINTAREA, PdfName.PRINTCLIP, PdfName.PRINTSCALING, PdfName.DUPLEX, PdfName.PICKTRAYBYPDFSIZE, PdfName.PRINTPAGERANGE, PdfName.NUMCOPIES
		});
	//    0    0:bipush          17
	//    1    2:anewarray       PdfName[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:getstatic       #27  <Field PdfName PdfName.HIDETOOLBAR>
	//    5   10:aastore         
	//    6   11:dup             
	//    7   12:iconst_1        
	//    8   13:getstatic       #30  <Field PdfName PdfName.HIDEMENUBAR>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_2        
	//   12   19:getstatic       #33  <Field PdfName PdfName.HIDEWINDOWUI>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_3        
	//   16   25:getstatic       #36  <Field PdfName PdfName.FITWINDOW>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_4        
	//   20   31:getstatic       #39  <Field PdfName PdfName.CENTERWINDOW>
	//   21   34:aastore         
	//   22   35:dup             
	//   23   36:iconst_5        
	//   24   37:getstatic       #42  <Field PdfName PdfName.DISPLAYDOCTITLE>
	//   25   40:aastore         
	//   26   41:dup             
	//   27   42:bipush          6
	//   28   44:getstatic       #45  <Field PdfName PdfName.NONFULLSCREENPAGEMODE>
	//   29   47:aastore         
	//   30   48:dup             
	//   31   49:bipush          7
	//   32   51:getstatic       #48  <Field PdfName PdfName.DIRECTION>
	//   33   54:aastore         
	//   34   55:dup             
	//   35   56:bipush          8
	//   36   58:getstatic       #51  <Field PdfName PdfName.VIEWAREA>
	//   37   61:aastore         
	//   38   62:dup             
	//   39   63:bipush          9
	//   40   65:getstatic       #54  <Field PdfName PdfName.VIEWCLIP>
	//   41   68:aastore         
	//   42   69:dup             
	//   43   70:bipush          10
	//   44   72:getstatic       #57  <Field PdfName PdfName.PRINTAREA>
	//   45   75:aastore         
	//   46   76:dup             
	//   47   77:bipush          11
	//   48   79:getstatic       #60  <Field PdfName PdfName.PRINTCLIP>
	//   49   82:aastore         
	//   50   83:dup             
	//   51   84:bipush          12
	//   52   86:getstatic       #63  <Field PdfName PdfName.PRINTSCALING>
	//   53   89:aastore         
	//   54   90:dup             
	//   55   91:bipush          13
	//   56   93:getstatic       #66  <Field PdfName PdfName.DUPLEX>
	//   57   96:aastore         
	//   58   97:dup             
	//   59   98:bipush          14
	//   60  100:getstatic       #69  <Field PdfName PdfName.PICKTRAYBYPDFSIZE>
	//   61  103:aastore         
	//   62  104:dup             
	//   63  105:bipush          15
	//   64  107:getstatic       #72  <Field PdfName PdfName.PRINTPAGERANGE>
	//   65  110:aastore         
	//   66  111:dup             
	//   67  112:bipush          16
	//   68  114:getstatic       #75  <Field PdfName PdfName.NUMCOPIES>
	//   69  117:aastore         
	//   70  118:putstatic       #77  <Field PdfName[] VIEWER_PREFERENCES>
		NONFULLSCREENPAGEMODE_PREFERENCES = (new PdfName[] {
			PdfName.USENONE, PdfName.USEOUTLINES, PdfName.USETHUMBS, PdfName.USEOC
		});
	//   71  121:iconst_4        
	//   72  122:anewarray       PdfName[]
	//   73  125:dup             
	//   74  126:iconst_0        
	//   75  127:getstatic       #80  <Field PdfName PdfName.USENONE>
	//   76  130:aastore         
	//   77  131:dup             
	//   78  132:iconst_1        
	//   79  133:getstatic       #83  <Field PdfName PdfName.USEOUTLINES>
	//   80  136:aastore         
	//   81  137:dup             
	//   82  138:iconst_2        
	//   83  139:getstatic       #86  <Field PdfName PdfName.USETHUMBS>
	//   84  142:aastore         
	//   85  143:dup             
	//   86  144:iconst_3        
	//   87  145:getstatic       #89  <Field PdfName PdfName.USEOC>
	//   88  148:aastore         
	//   89  149:putstatic       #91  <Field PdfName[] NONFULLSCREENPAGEMODE_PREFERENCES>
		DIRECTION_PREFERENCES = (new PdfName[] {
			PdfName.L2R, PdfName.R2L
		});
	//   90  152:iconst_2        
	//   91  153:anewarray       PdfName[]
	//   92  156:dup             
	//   93  157:iconst_0        
	//   94  158:getstatic       #94  <Field PdfName PdfName.L2R>
	//   95  161:aastore         
	//   96  162:dup             
	//   97  163:iconst_1        
	//   98  164:getstatic       #97  <Field PdfName PdfName.R2L>
	//   99  167:aastore         
	//  100  168:putstatic       #99  <Field PdfName[] DIRECTION_PREFERENCES>
		PAGE_BOUNDARIES = (new PdfName[] {
			PdfName.MEDIABOX, PdfName.CROPBOX, PdfName.BLEEDBOX, PdfName.TRIMBOX, PdfName.ARTBOX
		});
	//  101  171:iconst_5        
	//  102  172:anewarray       PdfName[]
	//  103  175:dup             
	//  104  176:iconst_0        
	//  105  177:getstatic       #102 <Field PdfName PdfName.MEDIABOX>
	//  106  180:aastore         
	//  107  181:dup             
	//  108  182:iconst_1        
	//  109  183:getstatic       #105 <Field PdfName PdfName.CROPBOX>
	//  110  186:aastore         
	//  111  187:dup             
	//  112  188:iconst_2        
	//  113  189:getstatic       #108 <Field PdfName PdfName.BLEEDBOX>
	//  114  192:aastore         
	//  115  193:dup             
	//  116  194:iconst_3        
	//  117  195:getstatic       #111 <Field PdfName PdfName.TRIMBOX>
	//  118  198:aastore         
	//  119  199:dup             
	//  120  200:iconst_4        
	//  121  201:getstatic       #114 <Field PdfName PdfName.ARTBOX>
	//  122  204:aastore         
	//  123  205:putstatic       #116 <Field PdfName[] PAGE_BOUNDARIES>
		PRINTSCALING_PREFERENCES = (new PdfName[] {
			PdfName.APPDEFAULT, PdfName.NONE
		});
	//  124  208:iconst_2        
	//  125  209:anewarray       PdfName[]
	//  126  212:dup             
	//  127  213:iconst_0        
	//  128  214:getstatic       #119 <Field PdfName PdfName.APPDEFAULT>
	//  129  217:aastore         
	//  130  218:dup             
	//  131  219:iconst_1        
	//  132  220:getstatic       #122 <Field PdfName PdfName.NONE>
	//  133  223:aastore         
	//  134  224:putstatic       #124 <Field PdfName[] PRINTSCALING_PREFERENCES>
		DUPLEX_PREFERENCES = (new PdfName[] {
			PdfName.SIMPLEX, PdfName.DUPLEXFLIPSHORTEDGE, PdfName.DUPLEXFLIPLONGEDGE
		});
	//  135  227:iconst_3        
	//  136  228:anewarray       PdfName[]
	//  137  231:dup             
	//  138  232:iconst_0        
	//  139  233:getstatic       #127 <Field PdfName PdfName.SIMPLEX>
	//  140  236:aastore         
	//  141  237:dup             
	//  142  238:iconst_1        
	//  143  239:getstatic       #130 <Field PdfName PdfName.DUPLEXFLIPSHORTEDGE>
	//  144  242:aastore         
	//  145  243:dup             
	//  146  244:iconst_2        
	//  147  245:getstatic       #133 <Field PdfName PdfName.DUPLEXFLIPLONGEDGE>
	//  148  248:aastore         
	//  149  249:putstatic       #135 <Field PdfName[] DUPLEX_PREFERENCES>
	//* 150  252:return          
	}
}
