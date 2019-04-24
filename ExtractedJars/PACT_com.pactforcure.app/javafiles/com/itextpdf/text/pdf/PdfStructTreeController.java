// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			BadPdfFormatException, PdfCopy, PdfName, PdfDictionary, 
//			PdfStructureTreeRoot, PdfObject, PRIndirectReference, RefKey, 
//			PdfReader, PdfBoolean, PdfNumber, PdfNull, 
//			PdfString, PdfArray, PdfIndirectObject, PdfIndirectReference

public class PdfStructTreeController
{
	public static final class returnType extends Enum
	{

		public static returnType valueOf(String s)
		{
			return (returnType)Enum.valueOf(com/itextpdf/text/pdf/PdfStructTreeController$returnType, s);
		//    0    0:ldc1            #2   <Class PdfStructTreeController$returnType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfStructTreeController$returnType>
		//    4    9:areturn         
		}

		public static returnType[] values()
		{
			return (returnType[])((returnType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field PdfStructTreeController$returnType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfStructTreeController$returnType_3B_.clone()>
		//    2    6:checkcast       #46  <Class PdfStructTreeController$returnType[]>
		//    3    9:areturn         
		}

		private static final returnType $VALUES[];
		public static final returnType ABOVE;
		public static final returnType BELOW;
		public static final returnType FOUND;
		public static final returnType NOTFOUND;

		static 
		{
			BELOW = new returnType("BELOW", 0);
		//    0    0:new             #2   <Class PdfStructTreeController$returnType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "BELOW">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
		//    5   10:putstatic       #24  <Field PdfStructTreeController$returnType BELOW>
			FOUND = new returnType("FOUND", 1);
		//    6   13:new             #2   <Class PdfStructTreeController$returnType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "FOUND">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
		//   11   23:putstatic       #27  <Field PdfStructTreeController$returnType FOUND>
			ABOVE = new returnType("ABOVE", 2);
		//   12   26:new             #2   <Class PdfStructTreeController$returnType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "ABOVE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
		//   17   36:putstatic       #30  <Field PdfStructTreeController$returnType ABOVE>
			NOTFOUND = new returnType("NOTFOUND", 3);
		//   18   39:new             #2   <Class PdfStructTreeController$returnType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "NOTFOUND">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
		//   23   49:putstatic       #33  <Field PdfStructTreeController$returnType NOTFOUND>
			$VALUES = (new returnType[] {
				BELOW, FOUND, ABOVE, NOTFOUND
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       returnType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field PdfStructTreeController$returnType BELOW>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field PdfStructTreeController$returnType FOUND>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field PdfStructTreeController$returnType ABOVE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field PdfStructTreeController$returnType NOTFOUND>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field PdfStructTreeController$returnType[] $VALUES>
		//*  43   83:return          
		}

		private returnType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	protected PdfStructTreeController(PdfReader pdfreader, PdfCopy pdfcopy)
		throws BadPdfFormatException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		roleMap = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field PdfDictionary roleMap>
		sourceRoleMap = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #34  <Field PdfDictionary sourceRoleMap>
		sourceClassMap = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #36  <Field PdfDictionary sourceClassMap>
		nullReference = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #38  <Field PdfIndirectReference nullReference>
		if(!pdfcopy.isTagged())
	//*  14   24:aload_2         
	//*  15   25:invokevirtual   #44  <Method boolean PdfCopy.isTagged()>
	//*  16   28:ifne            48
		{
			throw new BadPdfFormatException(MessageLocalization.getComposedMessage("no.structtreeroot.found", new Object[0]));
	//   17   31:new             #27  <Class BadPdfFormatException>
	//   18   34:dup             
	//   19   35:ldc1            #46  <String "no.structtreeroot.found">
	//   20   37:iconst_0        
	//   21   38:anewarray       Object[]
	//   22   41:invokestatic    #52  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   44:invokespecial   #55  <Method void BadPdfFormatException(String)>
	//   24   47:athrow          
		} else
		{
			writer = pdfcopy;
	//   25   48:aload_0         
	//   26   49:aload_2         
	//   27   50:putfield        #57  <Field PdfCopy writer>
			structureTreeRoot = pdfcopy.getStructureTreeRoot();
	//   28   53:aload_0         
	//   29   54:aload_2         
	//   30   55:invokevirtual   #61  <Method PdfStructureTreeRoot PdfCopy.getStructureTreeRoot()>
	//   31   58:putfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
			structureTreeRoot.put(PdfName.PARENTTREE, ((PdfObject) (new PdfDictionary(PdfName.STRUCTELEM))));
	//   32   61:aload_0         
	//   33   62:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//   34   65:getstatic       #69  <Field PdfName PdfName.PARENTTREE>
	//   35   68:new             #71  <Class PdfDictionary>
	//   36   71:dup             
	//   37   72:getstatic       #74  <Field PdfName PdfName.STRUCTELEM>
	//   38   75:invokespecial   #77  <Method void PdfDictionary(PdfName)>
	//   39   78:invokevirtual   #83  <Method void PdfStructureTreeRoot.put(PdfName, PdfObject)>
			setReader(pdfreader);
	//   40   81:aload_0         
	//   41   82:aload_1         
	//   42   83:invokevirtual   #87  <Method void setReader(PdfReader)>
			return;
	//   43   86:return          
		}
	}

	private void addKid(PdfObject pdfobject)
		throws IOException, BadPdfFormatException
	{
		if(pdfobject.isIndirect())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #98  <Method boolean PdfObject.isIndirect()>
	//*   2    4:ifne            8
	//*   3    7:return          
		{
			pdfobject = ((PdfObject) ((PRIndirectReference)pdfobject));
	//    4    8:aload_1         
	//    5    9:checkcast       #100 <Class PRIndirectReference>
	//    6   12:astore_1        
			RefKey refkey = new RefKey(((PRIndirectReference) (pdfobject)));
	//    7   13:new             #102 <Class RefKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #105 <Method void RefKey(PRIndirectReference)>
	//   11   21:astore_2        
			if(!writer.indirects.containsKey(((Object) (refkey))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #57  <Field PdfCopy writer>
	//*  14   26:getfield        #109 <Field HashMap PdfCopy.indirects>
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #115 <Method boolean HashMap.containsKey(Object)>
	//*  17   33:ifne            47
				writer.copyIndirect(((PRIndirectReference) (pdfobject)), true, false);
	//   18   36:aload_0         
	//   19   37:getfield        #57  <Field PdfCopy writer>
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #119 <Method PdfIndirectReference PdfCopy.copyIndirect(PRIndirectReference, boolean, boolean)>
	//   24   46:pop             
			pdfobject = ((PdfObject) (((PdfCopy.IndirectReferences)writer.indirects.get(((Object) (refkey)))).getRef()));
	//   25   47:aload_0         
	//   26   48:getfield        #57  <Field PdfCopy writer>
	//   27   51:getfield        #109 <Field HashMap PdfCopy.indirects>
	//   28   54:aload_2         
	//   29   55:invokevirtual   #123 <Method Object HashMap.get(Object)>
	//   30   58:checkcast       #125 <Class PdfCopy$IndirectReferences>
	//   31   61:invokevirtual   #129 <Method PdfIndirectReference PdfCopy$IndirectReferences.getRef()>
	//   32   64:astore_1        
			if(writer.updateRootKids)
	//*  33   65:aload_0         
	//*  34   66:getfield        #57  <Field PdfCopy writer>
	//*  35   69:getfield        #133 <Field boolean PdfCopy.updateRootKids>
	//*  36   72:ifeq            7
			{
				addKid(((PdfDictionary) (structureTreeRoot)), pdfobject);
	//   37   75:aload_0         
	//   38   76:aload_0         
	//   39   77:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//   40   80:aload_1         
	//   41   81:invokevirtual   #136 <Method void addKid(PdfDictionary, PdfObject)>
				writer.structureTreeRootKidsForReaderImported(reader);
	//   42   84:aload_0         
	//   43   85:getfield        #57  <Field PdfCopy writer>
	//   44   88:aload_0         
	//   45   89:getfield        #138 <Field PdfReader reader>
	//   46   92:invokevirtual   #141 <Method void PdfCopy.structureTreeRootKidsForReaderImported(PdfReader)>
				return;
	//   47   95:return          
			}
		}
	}

	public static boolean checkTagged(PdfReader pdfreader)
	{
		pdfreader = ((PdfReader) (getDirectObject(pdfreader.getCatalog().get(PdfName.STRUCTTREEROOT))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #152 <Field PdfName PdfName.STRUCTTREEROOT>
	//    3    7:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//    5   13:astore_0        
		if(pdfreader != null && ((PdfObject) (pdfreader)).isDictionary())
	//*   6   14:aload_0         
	//*   7   15:ifnull          25
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//*  10   22:ifne            27
	//*  11   25:iconst_0        
	//*  12   26:ireturn         
	//*  13   27:aload_0         
	//*  14   28:checkcast       #71  <Class PdfDictionary>
	//*  15   31:getstatic       #69  <Field PdfName PdfName.PARENTTREE>
	//*  16   34:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  17   37:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//*  18   40:astore_0        
			if((pdfreader = ((PdfReader) (getDirectObject(((PdfDictionary)pdfreader).get(PdfName.PARENTTREE))))) != null && ((PdfObject) (pdfreader)).isDictionary())
	//*  19   41:aload_0         
	//*  20   42:ifnull          25
	//*  21   45:aload_0         
	//*  22   46:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//*  23   49:ifeq            25
				return true;
	//   24   52:iconst_1        
	//   25   53:ireturn         
		return false;
	}

	public static boolean compareObjects(PdfObject pdfobject, PdfObject pdfobject1)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		pdfobject1 = getDirectObject(pdfobject1);
	//    2    2:aload_1         
	//    3    3:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//    4    6:astore_1        
		break MISSING_BLOCK_LABEL_7;
label0:
		while(true) 
		{
			do
			{
				do
				{
					do
					{
						do
						{
							do
							{
								do
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
									return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
								while(pdfobject1 == null || pdfobject.type() != pdfobject1.type());
	//    9   13:aload_0         
	//   10   14:invokevirtual   #168 <Method int PdfObject.type()>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #168 <Method int PdfObject.type()>
	//   13   21:icmpne          11
								if(!pdfobject.isBoolean())
									break;
	//   14   24:aload_0         
	//   15   25:invokevirtual   #171 <Method boolean PdfObject.isBoolean()>
	//   16   28:ifeq            71
								if(pdfobject == pdfobject1)
	//*  17   31:aload_0         
	//*  18   32:aload_1         
	//*  19   33:if_acmpne       38
									return true;
	//   20   36:iconst_1        
	//   21   37:ireturn         
								if(pdfobject1 instanceof PdfBoolean)
	//*  22   38:aload_1         
	//*  23   39:instanceof      #173 <Class PdfBoolean>
	//*  24   42:ifeq            11
								{
									if(((PdfBoolean)pdfobject).booleanValue() == ((PdfBoolean)pdfobject1).booleanValue())
	//*  25   45:aload_0         
	//*  26   46:checkcast       #173 <Class PdfBoolean>
	//*  27   49:invokevirtual   #176 <Method boolean PdfBoolean.booleanValue()>
	//*  28   52:aload_1         
	//*  29   53:checkcast       #173 <Class PdfBoolean>
	//*  30   56:invokevirtual   #176 <Method boolean PdfBoolean.booleanValue()>
	//*  31   59:icmpne          66
										flag = true;
	//   32   62:iconst_1        
	//   33   63:istore_3        
									else
	//*  34   64:iload_3         
	//*  35   65:ireturn         
										flag = false;
	//   36   66:iconst_0        
	//   37   67:istore_3        
									return flag;
								}
							} while(true);
	//   38   68:goto            64
							if(pdfobject.isName())
	//*  39   71:aload_0         
	//*  40   72:invokevirtual   #179 <Method boolean PdfObject.isName()>
	//*  41   75:ifeq            84
								return ((Object) (pdfobject)).equals(((Object) (pdfobject1)));
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:invokevirtual   #182 <Method boolean Object.equals(Object)>
	//   45   83:ireturn         
							if(!pdfobject.isNumber())
								break;
	//   46   84:aload_0         
	//   47   85:invokevirtual   #185 <Method boolean PdfObject.isNumber()>
	//   48   88:ifeq            130
							if(pdfobject == pdfobject1)
	//*  49   91:aload_0         
	//*  50   92:aload_1         
	//*  51   93:if_acmpne       98
								return true;
	//   52   96:iconst_1        
	//   53   97:ireturn         
							if(pdfobject1 instanceof PdfNumber)
	//*  54   98:aload_1         
	//*  55   99:instanceof      #187 <Class PdfNumber>
	//*  56  102:ifeq            11
							{
								if(((PdfNumber)pdfobject).doubleValue() != ((PdfNumber)pdfobject1).doubleValue())
	//*  57  105:aload_0         
	//*  58  106:checkcast       #187 <Class PdfNumber>
	//*  59  109:invokevirtual   #191 <Method double PdfNumber.doubleValue()>
	//*  60  112:aload_1         
	//*  61  113:checkcast       #187 <Class PdfNumber>
	//*  62  116:invokevirtual   #191 <Method double PdfNumber.doubleValue()>
	//*  63  119:dcmpl           
	//*  64  120:ifne            125
	//*  65  123:iload_3         
	//*  66  124:ireturn         
									flag = false;
	//   67  125:iconst_0        
	//   68  126:istore_3        
								return flag;
							}
						} while(true);
	//   69  127:goto            123
						if(!pdfobject.isNull())
							break;
	//   70  130:aload_0         
	//   71  131:invokevirtual   #194 <Method boolean PdfObject.isNull()>
	//   72  134:ifeq            153
						if(pdfobject == pdfobject1)
	//*  73  137:aload_0         
	//*  74  138:aload_1         
	//*  75  139:if_acmpne       144
							return true;
	//   76  142:iconst_1        
	//   77  143:ireturn         
						if(pdfobject1 instanceof PdfNull)
	//*  78  144:aload_1         
	//*  79  145:instanceof      #196 <Class PdfNull>
	//*  80  148:ifeq            11
							return true;
	//   81  151:iconst_1        
	//   82  152:ireturn         
					} while(true);
					if(!pdfobject.isString())
						break;
	//   83  153:aload_0         
	//   84  154:invokevirtual   #199 <Method boolean PdfObject.isString()>
	//   85  157:ifeq            226
					if(pdfobject == pdfobject1)
	//*  86  160:aload_0         
	//*  87  161:aload_1         
	//*  88  162:if_acmpne       167
						return true;
	//   89  165:iconst_1        
	//   90  166:ireturn         
					if((pdfobject1 instanceof PdfString) && (((PdfString)pdfobject1).value == null && ((PdfString)pdfobject).value == null || ((PdfString)pdfobject).value != null && ((PdfString)pdfobject).value.equals(((Object) (((PdfString)pdfobject1).value)))))
	//*  91  167:aload_1         
	//*  92  168:instanceof      #201 <Class PdfString>
	//*  93  171:ifeq            11
	//*  94  174:aload_1         
	//*  95  175:checkcast       #201 <Class PdfString>
	//*  96  178:getfield        #205 <Field String PdfString.value>
	//*  97  181:ifnonnull       194
	//*  98  184:aload_0         
	//*  99  185:checkcast       #201 <Class PdfString>
	//* 100  188:getfield        #205 <Field String PdfString.value>
	//* 101  191:ifnull          224
	//* 102  194:aload_0         
	//* 103  195:checkcast       #201 <Class PdfString>
	//* 104  198:getfield        #205 <Field String PdfString.value>
	//* 105  201:ifnull          11
	//* 106  204:aload_0         
	//* 107  205:checkcast       #201 <Class PdfString>
	//* 108  208:getfield        #205 <Field String PdfString.value>
	//* 109  211:aload_1         
	//* 110  212:checkcast       #201 <Class PdfString>
	//* 111  215:getfield        #205 <Field String PdfString.value>
	//* 112  218:invokevirtual   #208 <Method boolean String.equals(Object)>
	//* 113  221:ifeq            11
						return true;
	//  114  224:iconst_1        
	//  115  225:ireturn         
				} while(true);
				if(!pdfobject.isArray())
					continue;
	//  116  226:aload_0         
	//  117  227:invokevirtual   #211 <Method boolean PdfObject.isArray()>
	//  118  230:ifeq            289
				pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//  119  233:aload_0         
	//  120  234:checkcast       #213 <Class PdfArray>
	//  121  237:astore_0        
				pdfobject1 = ((PdfObject) ((PdfArray)pdfobject1));
	//  122  238:aload_1         
	//  123  239:checkcast       #213 <Class PdfArray>
	//  124  242:astore_1        
				if(((PdfArray) (pdfobject)).size() != ((PdfArray) (pdfobject1)).size())
					continue label0;
	//  125  243:aload_0         
	//  126  244:invokevirtual   #216 <Method int PdfArray.size()>
	//  127  247:aload_1         
	//  128  248:invokevirtual   #216 <Method int PdfArray.size()>
	//  129  251:icmpne          11
				for(int i = 0; i < ((PdfArray) (pdfobject)).size(); i++)
	//* 130  254:iconst_0        
	//* 131  255:istore_2        
	//* 132  256:iload_2         
	//* 133  257:aload_0         
	//* 134  258:invokevirtual   #216 <Method int PdfArray.size()>
	//* 135  261:icmpge          287
					if(!compareObjects(((PdfArray) (pdfobject)).getPdfObject(i), ((PdfArray) (pdfobject1)).getPdfObject(i)))
						continue label0;
	//  136  264:aload_0         
	//  137  265:iload_2         
	//  138  266:invokevirtual   #220 <Method PdfObject PdfArray.getPdfObject(int)>
	//  139  269:aload_1         
	//  140  270:iload_2         
	//  141  271:invokevirtual   #220 <Method PdfObject PdfArray.getPdfObject(int)>
	//  142  274:invokestatic    #222 <Method boolean compareObjects(PdfObject, PdfObject)>
	//  143  277:ifeq            11

	//  144  280:iload_2         
	//  145  281:iconst_1        
	//  146  282:iadd            
	//  147  283:istore_2        
	//* 148  284:goto            256
				return true;
	//  149  287:iconst_1        
	//  150  288:ireturn         
			} while(!pdfobject.isDictionary());
	//  151  289:aload_0         
	//  152  290:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//  153  293:ifeq            11
			pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//  154  296:aload_0         
	//  155  297:checkcast       #71  <Class PdfDictionary>
	//  156  300:astore_0        
			pdfobject1 = ((PdfObject) ((PdfDictionary)pdfobject1));
	//  157  301:aload_1         
	//  158  302:checkcast       #71  <Class PdfDictionary>
	//  159  305:astore_1        
			if(((PdfDictionary) (pdfobject)).size() == ((PdfDictionary) (pdfobject1)).size())
	//* 160  306:aload_0         
	//* 161  307:invokevirtual   #223 <Method int PdfDictionary.size()>
	//* 162  310:aload_1         
	//* 163  311:invokevirtual   #223 <Method int PdfDictionary.size()>
	//* 164  314:icmpne          11
			{
				for(Iterator iterator = ((PdfDictionary) (pdfobject)).hashMap.keySet().iterator(); iterator.hasNext();)
	//* 165  317:aload_0         
	//* 166  318:getfield        #227 <Field LinkedHashMap PdfDictionary.hashMap>
	//* 167  321:invokevirtual   #233 <Method Set LinkedHashMap.keySet()>
	//* 168  324:invokeinterface #239 <Method Iterator Set.iterator()>
	//* 169  329:astore          4
	//* 170  331:aload           4
	//* 171  333:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//* 172  338:ifeq            373
				{
					PdfName pdfname = (PdfName)iterator.next();
	//  173  341:aload           4
	//  174  343:invokeinterface #248 <Method Object Iterator.next()>
	//  175  348:checkcast       #65  <Class PdfName>
	//  176  351:astore          5
					if(!compareObjects(((PdfDictionary) (pdfobject)).get(pdfname), ((PdfDictionary) (pdfobject1)).get(pdfname)))
	//* 177  353:aload_0         
	//* 178  354:aload           5
	//* 179  356:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 180  359:aload_1         
	//* 181  360:aload           5
	//* 182  362:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 183  365:invokestatic    #222 <Method boolean compareObjects(PdfObject, PdfObject)>
	//* 184  368:ifne            331
						return false;
	//  185  371:iconst_0        
	//  186  372:ireturn         
				}

				return true;
	//  187  373:iconst_1        
	//  188  374:ireturn         
			}
		}
	}

	private returnType copyPageMarks(PdfDictionary pdfdictionary, PdfNumber pdfnumber, int i)
		throws BadPdfFormatException, IOException
	{
		Object obj = ((Object) ((PdfArray)getDirectObject(pdfdictionary.get(PdfName.NUMS))));
	//    0    0:aload_1         
	//    1    1:getstatic       #253 <Field PdfName PdfName.NUMS>
	//    2    4:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    7:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//    4   10:checkcast       #213 <Class PdfArray>
	//    5   13:astore          8
		if(obj == null)
	//*   6   15:aload           8
	//*   7   17:ifnonnull       199
		{
			pdfdictionary = ((PdfDictionary) ((PdfArray)getDirectObject(pdfdictionary.get(PdfName.KIDS))));
	//    8   20:aload_1         
	//    9   21:getstatic       #256 <Field PdfName PdfName.KIDS>
	//   10   24:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   11   27:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   12   30:checkcast       #213 <Class PdfArray>
	//   13   33:astore_1        
			if(pdfdictionary == null)
	//*  14   34:aload_1         
	//*  15   35:ifnonnull       42
				return returnType.NOTFOUND;
	//   16   38:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//   17   41:areturn         
			int j = ((PdfArray) (pdfdictionary)).size() / 2;
	//   18   42:aload_1         
	//   19   43:invokevirtual   #216 <Method int PdfArray.size()>
	//   20   46:iconst_2        
	//   21   47:idiv            
	//   22   48:istore          4
			int l = 0;
	//   23   50:iconst_0        
	//   24   51:istore          6
			do
			{
				obj = ((Object) ((PdfDictionary)getDirectObject(((PdfArray) (pdfdictionary)).getPdfObject(j + l))));
	//   25   53:aload_1         
	//   26   54:iload           4
	//   27   56:iload           6
	//   28   58:iadd            
	//   29   59:invokevirtual   #220 <Method PdfObject PdfArray.getPdfObject(int)>
	//   30   62:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   31   65:checkcast       #71  <Class PdfDictionary>
	//   32   68:astore          8
				static class _cls1
				{

					static final int $SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType[];

					static 
					{
						$SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType = new int[returnType.values().length];
					//    0    0:invokestatic    #18  <Method PdfStructTreeController$returnType[] PdfStructTreeController$returnType.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType>
						try
						{
							$SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType[returnType.FOUND.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType>
					//    5   12:getstatic       #24  <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.FOUND>
					//    6   15:invokevirtual   #28  <Method int PdfStructTreeController$returnType.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType>
					//*  10   23:getstatic       #31  <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.ABOVE>
					//*  11   26:invokevirtual   #28  <Method int PdfStructTreeController$returnType.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType>
					//*  15   34:getstatic       #34  <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.BELOW>
					//*  16   37:invokevirtual   #28  <Method int PdfStructTreeController$returnType.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:return          
					//*  20   43:astore_0        
					//*  21   44:return          
					//*  22   45:astore_0        
					//*  23   46:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   24   49:astore_0        
						try
						{
							$SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType[returnType.ABOVE.ordinal()] = 2;
						}
						catch(NoSuchFieldError nosuchfielderror1) { }
						try
						{
							$SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType[returnType.BELOW.ordinal()] = 3;
						}
						catch(NoSuchFieldError nosuchfielderror)
						{
							return;
						}
					//*  25   50:goto            20
					}
				}

				switch(_cls1..SwitchMap.com.itextpdf.text.pdf.PdfStructTreeController.returnType[copyPageMarks(((PdfDictionary) (obj)), pdfnumber, i).ordinal()])
	//*  33   70:getstatic       #264 <Field int[] PdfStructTreeController$1.$SwitchMap$com$itextpdf$text$pdf$PdfStructTreeController$returnType>
	//*  34   73:aload_0         
	//*  35   74:aload           8
	//*  36   76:aload_2         
	//*  37   77:iload_3         
	//*  38   78:invokespecial   #266 <Method PdfStructTreeController$returnType copyPageMarks(PdfDictionary, PdfNumber, int)>
	//*  39   81:invokevirtual   #269 <Method int PdfStructTreeController$returnType.ordinal()>
	//*  40   84:iaload          
				{
	//*  41   85:tableswitch     1 3: default 112
	//	               1 116
	//	               2 120
	//	               3 169
				default:
					return returnType.NOTFOUND;
	//   42  112:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//   43  115:areturn         

				case 1: // '\001'
					return returnType.FOUND;
	//   44  116:getstatic       #272 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.FOUND>
	//   45  119:areturn         

				case 2: // '\002'
					int i1 = l + j;
	//   46  120:iload           6
	//   47  122:iload           4
	//   48  124:iadd            
	//   49  125:istore          7
					j /= 2;
	//   50  127:iload           4
	//   51  129:iconst_2        
	//   52  130:idiv            
	//   53  131:istore          4
					int k = j;
	//   54  133:iload           4
	//   55  135:istore          5
					if(j == 0)
	//*  56  137:iload           4
	//*  57  139:ifne            145
						k = 1;
	//   58  142:iconst_1        
	//   59  143:istore          5
					l = i1;
	//   60  145:iload           7
	//   61  147:istore          6
					j = k;
	//   62  149:iload           5
	//   63  151:istore          4
					if(k + i1 == ((PdfArray) (pdfdictionary)).size())
	//*  64  153:iload           5
	//*  65  155:iload           7
	//*  66  157:iadd            
	//*  67  158:aload_1         
	//*  68  159:invokevirtual   #216 <Method int PdfArray.size()>
	//*  69  162:icmpne          53
						return returnType.ABOVE;
	//   70  165:getstatic       #275 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.ABOVE>
	//   71  168:areturn         
					break;

				case 3: // '\003'
					if(j + l == 0)
	//*  72  169:iload           4
	//*  73  171:iload           6
	//*  74  173:iadd            
	//*  75  174:ifne            181
						return returnType.BELOW;
	//   76  177:getstatic       #278 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.BELOW>
	//   77  180:areturn         
					if(j == 0)
	//*  78  181:iload           4
	//*  79  183:ifne            190
						return returnType.NOTFOUND;
	//   80  186:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//   81  189:areturn         
					j /= 2;
	//   82  190:iload           4
	//   83  192:iconst_2        
	//   84  193:idiv            
	//   85  194:istore          4
					break;
				}
			} while(true);
	//   86  196:goto            53
		}
		if(((PdfArray) (obj)).size() == 0)
	//*  87  199:aload           8
	//*  88  201:invokevirtual   #216 <Method int PdfArray.size()>
	//*  89  204:ifne            211
			return returnType.NOTFOUND;
	//   90  207:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//   91  210:areturn         
		else
			return findAndCopyMarks(((PdfArray) (obj)), pdfnumber.intValue(), i);
	//   92  211:aload_0         
	//   93  212:aload           8
	//   94  214:aload_2         
	//   95  215:invokevirtual   #281 <Method int PdfNumber.intValue()>
	//   96  218:iload_3         
	//   97  219:invokespecial   #285 <Method PdfStructTreeController$returnType findAndCopyMarks(PdfArray, int, int)>
	//   98  222:areturn         
	}

	private returnType findAndCopyMarks(PdfArray pdfarray, int i, int j)
		throws BadPdfFormatException, IOException
	{
		if(pdfarray.getAsNumber(0).intValue() > i)
	//*   0    0:aload_1         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #289 <Method PdfNumber PdfArray.getAsNumber(int)>
	//*   3    5:invokevirtual   #281 <Method int PdfNumber.intValue()>
	//*   4    8:iload_2         
	//*   5    9:icmple          16
			return returnType.BELOW;
	//    6   12:getstatic       #278 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.BELOW>
	//    7   15:areturn         
		if(pdfarray.getAsNumber(pdfarray.size() - 2).intValue() < i)
	//*   8   16:aload_1         
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #216 <Method int PdfArray.size()>
	//*  11   21:iconst_2        
	//*  12   22:isub            
	//*  13   23:invokevirtual   #289 <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  14   26:invokevirtual   #281 <Method int PdfNumber.intValue()>
	//*  15   29:iload_2         
	//*  16   30:icmpge          37
			return returnType.ABOVE;
	//   17   33:getstatic       #275 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.ABOVE>
	//   18   36:areturn         
		int k = pdfarray.size() / 4;
	//   19   37:aload_1         
	//   20   38:invokevirtual   #216 <Method int PdfArray.size()>
	//   21   41:iconst_4        
	//   22   42:idiv            
	//   23   43:istore          4
		int l = 0;
	//   24   45:iconst_0        
	//   25   46:istore          5
		do
		{
			int i1 = pdfarray.getAsNumber((l + k) * 2).intValue();
	//   26   48:aload_1         
	//   27   49:iload           5
	//   28   51:iload           4
	//   29   53:iadd            
	//   30   54:iconst_2        
	//   31   55:imul            
	//   32   56:invokevirtual   #289 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   33   59:invokevirtual   #281 <Method int PdfNumber.intValue()>
	//   34   62:istore          6
			if(i1 == i)
	//*  35   64:iload           6
	//*  36   66:iload_2         
	//*  37   67:icmpne          302
			{
				Object obj = ((Object) (pdfarray.getPdfObject((l + k) * 2 + 1)));
	//   38   70:aload_1         
	//   39   71:iload           5
	//   40   73:iload           4
	//   41   75:iadd            
	//   42   76:iconst_2        
	//   43   77:imul            
	//   44   78:iconst_1        
	//   45   79:iadd            
	//   46   80:invokevirtual   #220 <Method PdfObject PdfArray.getPdfObject(int)>
	//   47   83:astore          8
				for(pdfarray = ((PdfArray) (obj)); ((PdfObject) (pdfarray)).isIndirect(); pdfarray = ((PdfArray) (PdfReader.getPdfObjectRelease(((PdfObject) (pdfarray))))));
	//   48   85:aload           8
	//   49   87:astore_1        
	//   50   88:aload_1         
	//   51   89:invokevirtual   #98  <Method boolean PdfObject.isIndirect()>
	//   52   92:ifeq            103
	//   53   95:aload_1         
	//   54   96:invokestatic    #292 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   55   99:astore_1        
	//*  56  100:goto            88
				if(((PdfObject) (pdfarray)).isArray())
	//*  57  103:aload_1         
	//*  58  104:invokevirtual   #211 <Method boolean PdfObject.isArray()>
	//*  59  107:ifeq            250
				{
					obj = null;
	//   60  110:aconst_null     
	//   61  111:astore          8
					Iterator iterator = ((PdfArray)pdfarray).iterator();
	//   62  113:aload_1         
	//   63  114:checkcast       #213 <Class PdfArray>
	//   64  117:invokevirtual   #293 <Method Iterator PdfArray.iterator()>
	//   65  120:astore          10
					pdfarray = ((PdfArray) (obj));
	//   66  122:aload           8
	//   67  124:astore_1        
					while(iterator.hasNext()) 
	//*  68  125:aload           10
	//*  69  127:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//*  70  132:ifeq            241
					{
						obj = ((Object) ((PdfObject)iterator.next()));
	//   71  135:aload           10
	//   72  137:invokeinterface #248 <Method Object Iterator.next()>
	//   73  142:checkcast       #95  <Class PdfObject>
	//   74  145:astore          8
						if(((PdfObject) (obj)).isNull())
	//*  75  147:aload           8
	//*  76  149:invokevirtual   #194 <Method boolean PdfObject.isNull()>
	//*  77  152:ifeq            198
						{
							if(nullReference == null)
	//*  78  155:aload_0         
	//*  79  156:getfield        #38  <Field PdfIndirectReference nullReference>
	//*  80  159:ifnonnull       183
								nullReference = writer.addToBody(((PdfObject) (new PdfNull()))).getIndirectReference();
	//   81  162:aload_0         
	//   82  163:aload_0         
	//   83  164:getfield        #57  <Field PdfCopy writer>
	//   84  167:new             #196 <Class PdfNull>
	//   85  170:dup             
	//   86  171:invokespecial   #294 <Method void PdfNull()>
	//   87  174:invokevirtual   #298 <Method PdfIndirectObject PdfCopy.addToBody(PdfObject)>
	//   88  177:invokevirtual   #303 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   89  180:putfield        #38  <Field PdfIndirectReference nullReference>
							structureTreeRoot.setPageMark(j, nullReference);
	//   90  183:aload_0         
	//   91  184:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//   92  187:iload_3         
	//   93  188:aload_0         
	//   94  189:getfield        #38  <Field PdfIndirectReference nullReference>
	//   95  192:invokevirtual   #307 <Method void PdfStructureTreeRoot.setPageMark(int, PdfIndirectReference)>
						} else
	//*  96  195:goto            125
						{
							PdfObject pdfobject = writer.copyObject(((PdfObject) (obj)), true, false);
	//   97  198:aload_0         
	//   98  199:getfield        #57  <Field PdfCopy writer>
	//   99  202:aload           8
	//  100  204:iconst_1        
	//  101  205:iconst_0        
	//  102  206:invokevirtual   #311 <Method PdfObject PdfCopy.copyObject(PdfObject, boolean, boolean)>
	//  103  209:astore          9
							obj = ((Object) (pdfarray));
	//  104  211:aload_1         
	//  105  212:astore          8
							if(pdfarray == null)
	//* 106  214:aload_1         
	//* 107  215:ifnonnull       222
								obj = ((Object) (pdfobject));
	//  108  218:aload           9
	//  109  220:astore          8
							structureTreeRoot.setPageMark(j, (PdfIndirectReference)pdfobject);
	//  110  222:aload_0         
	//  111  223:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//  112  226:iload_3         
	//  113  227:aload           9
	//  114  229:checkcast       #313 <Class PdfIndirectReference>
	//  115  232:invokevirtual   #307 <Method void PdfStructureTreeRoot.setPageMark(int, PdfIndirectReference)>
							pdfarray = ((PdfArray) (obj));
	//  116  235:aload           8
	//  117  237:astore_1        
						}
					}
	//* 118  238:goto            125
					attachStructTreeRootKids(((PdfObject) (pdfarray)));
	//  119  241:aload_0         
	//  120  242:aload_1         
	//  121  243:invokevirtual   #316 <Method void attachStructTreeRootKids(PdfObject)>
				} else
	//* 122  246:getstatic       #272 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.FOUND>
	//* 123  249:areturn         
				if(((PdfObject) (pdfarray)).isDictionary())
	//* 124  250:aload_1         
	//* 125  251:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//* 126  254:ifeq            298
				{
					if(getKDict((PdfDictionary)pdfarray) == null)
	//* 127  257:aload_1         
	//* 128  258:checkcast       #71  <Class PdfDictionary>
	//* 129  261:invokestatic    #320 <Method PdfDictionary getKDict(PdfDictionary)>
	//* 130  264:ifnonnull       271
						return returnType.NOTFOUND;
	//  131  267:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//  132  270:areturn         
					pdfarray = ((PdfArray) (writer.copyObject(((PdfObject) (obj)), true, false)));
	//  133  271:aload_0         
	//  134  272:getfield        #57  <Field PdfCopy writer>
	//  135  275:aload           8
	//  136  277:iconst_1        
	//  137  278:iconst_0        
	//  138  279:invokevirtual   #311 <Method PdfObject PdfCopy.copyObject(PdfObject, boolean, boolean)>
	//  139  282:astore_1        
					structureTreeRoot.setAnnotationMark(j, (PdfIndirectReference)pdfarray);
	//  140  283:aload_0         
	//  141  284:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//  142  287:iload_3         
	//  143  288:aload_1         
	//  144  289:checkcast       #313 <Class PdfIndirectReference>
	//  145  292:invokevirtual   #323 <Method void PdfStructureTreeRoot.setAnnotationMark(int, PdfIndirectReference)>
				} else
	//* 146  295:goto            246
				{
					return returnType.NOTFOUND;
	//  147  298:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//  148  301:areturn         
				}
				return returnType.FOUND;
			}
			if(i1 < i)
	//* 149  302:iload           6
	//* 150  304:iload_2         
	//* 151  305:icmpge          364
			{
				if(k == 0)
	//* 152  308:iload           4
	//* 153  310:ifne            317
					return returnType.NOTFOUND;
	//  154  313:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//  155  316:areturn         
				int k1 = l + k;
	//  156  317:iload           5
	//  157  319:iload           4
	//  158  321:iadd            
	//  159  322:istore          7
				int j1 = k;
	//  160  324:iload           4
	//  161  326:istore          6
				if(k != 1)
	//* 162  328:iload           4
	//* 163  330:iconst_1        
	//* 164  331:icmpeq          340
					j1 = k / 2;
	//  165  334:iload           4
	//  166  336:iconst_2        
	//  167  337:idiv            
	//  168  338:istore          6
				l = k1;
	//  169  340:iload           7
	//  170  342:istore          5
				k = j1;
	//  171  344:iload           6
	//  172  346:istore          4
				if(j1 + k1 == pdfarray.size())
	//* 173  348:iload           6
	//* 174  350:iload           7
	//* 175  352:iadd            
	//* 176  353:aload_1         
	//* 177  354:invokevirtual   #216 <Method int PdfArray.size()>
	//* 178  357:icmpne          48
					return returnType.NOTFOUND;
	//  179  360:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//  180  363:areturn         
			} else
			{
				if(k + l == 0)
	//* 181  364:iload           4
	//* 182  366:iload           5
	//* 183  368:iadd            
	//* 184  369:ifne            376
					return returnType.BELOW;
	//  185  372:getstatic       #278 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.BELOW>
	//  186  375:areturn         
				if(k == 0)
	//* 187  376:iload           4
	//* 188  378:ifne            385
					return returnType.NOTFOUND;
	//  189  381:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//  190  384:areturn         
				k /= 2;
	//  191  385:iload           4
	//  192  387:iconst_2        
	//  193  388:idiv            
	//  194  389:istore          4
			}
		} while(true);
	//  195  391:goto            48
	}

	private static PdfArray getDirectArray(PdfArray pdfarray)
	{
		PdfArray pdfarray1 = new PdfArray();
	//    0    0:new             #213 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #326 <Method void PdfArray()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		while(i < pdfarray.size()) 
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #216 <Method int PdfArray.size()>
	//*   9   15:icmpge          91
		{
			PdfObject pdfobject = getDirectObject(pdfarray.getPdfObject(i));
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #220 <Method PdfObject PdfArray.getPdfObject(int)>
	//   13   23:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   14   26:astore_3        
			if(pdfobject != null)
	//*  15   27:aload_3         
	//*  16   28:ifnonnull       38
	//*  17   31:iload_1         
	//*  18   32:iconst_1        
	//*  19   33:iadd            
	//*  20   34:istore_1        
	//*  21   35:goto            10
				if(pdfobject.isArray())
	//*  22   38:aload_3         
	//*  23   39:invokevirtual   #211 <Method boolean PdfObject.isArray()>
	//*  24   42:ifeq            60
					pdfarray1.add(((PdfObject) (getDirectArray((PdfArray)pdfobject))));
	//   25   45:aload_2         
	//   26   46:aload_3         
	//   27   47:checkcast       #213 <Class PdfArray>
	//   28   50:invokestatic    #328 <Method PdfArray getDirectArray(PdfArray)>
	//   29   53:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//   30   56:pop             
				else
	//*  31   57:goto            31
				if(pdfobject.isDictionary())
	//*  32   60:aload_3         
	//*  33   61:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//*  34   64:ifeq            82
					pdfarray1.add(((PdfObject) (getDirectDict((PdfDictionary)pdfobject))));
	//   35   67:aload_2         
	//   36   68:aload_3         
	//   37   69:checkcast       #71  <Class PdfDictionary>
	//   38   72:invokestatic    #335 <Method PdfDictionary getDirectDict(PdfDictionary)>
	//   39   75:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//   40   78:pop             
				else
	//*  41   79:goto            31
					pdfarray1.add(pdfobject);
	//   42   82:aload_2         
	//   43   83:aload_3         
	//   44   84:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//   45   87:pop             
			i++;
		}
	//*  46   88:goto            31
		return pdfarray1;
	//   47   91:aload_2         
	//   48   92:areturn         
	}

	private static PdfDictionary getDirectDict(PdfDictionary pdfdictionary)
	{
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    0    0:new             #71  <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #336 <Method void PdfDictionary()>
	//    3    7:astore_1        
		pdfdictionary = ((PdfDictionary) (pdfdictionary.hashMap.entrySet().iterator()));
	//    4    8:aload_0         
	//    5    9:getfield        #227 <Field LinkedHashMap PdfDictionary.hashMap>
	//    6   12:invokevirtual   #339 <Method Set LinkedHashMap.entrySet()>
	//    7   15:invokeinterface #239 <Method Iterator Set.iterator()>
	//    8   20:astore_0        
		do
		{
			if(!((Iterator) (pdfdictionary)).hasNext())
				break;
	//    9   21:aload_0         
	//   10   22:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            134
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (pdfdictionary)).next();
	//   12   30:aload_0         
	//   13   31:invokeinterface #248 <Method Object Iterator.next()>
	//   14   36:checkcast       #341 <Class java.util.Map$Entry>
	//   15   39:astore_2        
			PdfObject pdfobject = getDirectObject((PdfObject)entry.getValue());
	//   16   40:aload_2         
	//   17   41:invokeinterface #344 <Method Object java.util.Map$Entry.getValue()>
	//   18   46:checkcast       #95  <Class PdfObject>
	//   19   49:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   20   52:astore_3        
			if(pdfobject != null)
	//*  21   53:aload_3         
	//*  22   54:ifnull          21
				if(pdfobject.isArray())
	//*  23   57:aload_3         
	//*  24   58:invokevirtual   #211 <Method boolean PdfObject.isArray()>
	//*  25   61:ifeq            87
					pdfdictionary1.put((PdfName)entry.getKey(), ((PdfObject) (getDirectArray((PdfArray)pdfobject))));
	//   26   64:aload_1         
	//   27   65:aload_2         
	//   28   66:invokeinterface #347 <Method Object java.util.Map$Entry.getKey()>
	//   29   71:checkcast       #65  <Class PdfName>
	//   30   74:aload_3         
	//   31   75:checkcast       #213 <Class PdfArray>
	//   32   78:invokestatic    #328 <Method PdfArray getDirectArray(PdfArray)>
	//   33   81:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
				else
	//*  34   84:goto            21
				if(pdfobject.isDictionary())
	//*  35   87:aload_3         
	//*  36   88:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//*  37   91:ifeq            117
					pdfdictionary1.put((PdfName)entry.getKey(), ((PdfObject) (getDirectDict((PdfDictionary)pdfobject))));
	//   38   94:aload_1         
	//   39   95:aload_2         
	//   40   96:invokeinterface #347 <Method Object java.util.Map$Entry.getKey()>
	//   41  101:checkcast       #65  <Class PdfName>
	//   42  104:aload_3         
	//   43  105:checkcast       #71  <Class PdfDictionary>
	//   44  108:invokestatic    #335 <Method PdfDictionary getDirectDict(PdfDictionary)>
	//   45  111:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
				else
	//*  46  114:goto            21
					pdfdictionary1.put((PdfName)entry.getKey(), pdfobject);
	//   47  117:aload_1         
	//   48  118:aload_2         
	//   49  119:invokeinterface #347 <Method Object java.util.Map$Entry.getKey()>
	//   50  124:checkcast       #65  <Class PdfName>
	//   51  127:aload_3         
	//   52  128:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} while(true);
	//   53  131:goto            21
		return pdfdictionary1;
	//   54  134:aload_1         
	//   55  135:areturn         
	}

	public static PdfObject getDirectObject(PdfObject pdfobject)
	{
		PdfObject pdfobject1 = pdfobject;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(pdfobject != null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:ifnonnull       10
_L1:
		pdfobject = null;
	//    4    6:aconst_null     
	//    5    7:astore_0        
_L4:
		return pdfobject;
	//    6    8:aload_0         
	//    7    9:areturn         
_L2:
		do
		{
			pdfobject = pdfobject1;
	//    8   10:aload_1         
	//    9   11:astore_0        
			if(!pdfobject1.isIndirect())
				continue;
	//   10   12:aload_1         
	//   11   13:invokevirtual   #98  <Method boolean PdfObject.isIndirect()>
	//   12   16:ifeq            8
			pdfobject1 = PdfReader.getPdfObjectRelease(pdfobject1);
	//   13   19:aload_1         
	//   14   20:invokestatic    #292 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   15   23:astore_1        
		} while(true);
	//   16   24:goto            10
		if(true) goto _L4; else goto _L3
_L3:
	}

	static PdfDictionary getKDict(PdfDictionary pdfdictionary)
	{
		Object obj;
		PdfDictionary pdfdictionary1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		pdfdictionary1 = pdfdictionary.getAsDict(PdfName.K);
	//    2    2:aload_0         
	//    3    3:getstatic       #351 <Field PdfName PdfName.K>
	//    4    6:invokevirtual   #355 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    5    9:astore_3        
		if(pdfdictionary1 == null) goto _L2; else goto _L1
	//    6   10:aload_3         
	//    7   11:ifnull          36
_L1:
		pdfdictionary = ((PdfDictionary) (obj));
	//    8   14:aload_2         
	//    9   15:astore_0        
		if(PdfName.OBJR.equals(((Object) (pdfdictionary1.getAsName(PdfName.TYPE)))))
	//*  10   16:getstatic       #358 <Field PdfName PdfName.OBJR>
	//*  11   19:aload_3         
	//*  12   20:getstatic       #361 <Field PdfName PdfName.TYPE>
	//*  13   23:invokevirtual   #365 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  14   26:invokevirtual   #366 <Method boolean PdfName.equals(Object)>
	//*  15   29:ifeq            34
			pdfdictionary = pdfdictionary1;
	//   16   32:aload_3         
	//   17   33:astore_0        
_L4:
		return pdfdictionary;
	//   18   34:aload_0         
	//   19   35:areturn         
_L2:
		PdfArray pdfarray = pdfdictionary.getAsArray(PdfName.K);
	//   20   36:aload_0         
	//   21   37:getstatic       #351 <Field PdfName PdfName.K>
	//   22   40:invokevirtual   #370 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   23   43:astore_3        
		pdfdictionary = ((PdfDictionary) (obj));
	//   24   44:aload_2         
	//   25   45:astore_0        
		if(pdfarray == null)
			continue;
	//   26   46:aload_3         
	//   27   47:ifnull          34
		int i = 0;
	//   28   50:iconst_0        
	//   29   51:istore_1        
		do
		{
			pdfdictionary = ((PdfDictionary) (obj));
	//   30   52:aload_2         
	//   31   53:astore_0        
			if(i >= pdfarray.size())
				continue;
	//   32   54:iload_1         
	//   33   55:aload_3         
	//   34   56:invokevirtual   #216 <Method int PdfArray.size()>
	//   35   59:icmpge          34
			pdfdictionary = pdfarray.getAsDict(i);
	//   36   62:aload_3         
	//   37   63:iload_1         
	//   38   64:invokevirtual   #373 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   39   67:astore_0        
			if(pdfdictionary != null && PdfName.OBJR.equals(((Object) (pdfdictionary.getAsName(PdfName.TYPE)))))
	//*  40   68:aload_0         
	//*  41   69:ifnull          90
	//*  42   72:getstatic       #358 <Field PdfName PdfName.OBJR>
	//*  43   75:aload_0         
	//*  44   76:getstatic       #361 <Field PdfName PdfName.TYPE>
	//*  45   79:invokevirtual   #365 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  46   82:invokevirtual   #366 <Method boolean PdfName.equals(Object)>
	//*  47   85:ifeq            90
				return pdfdictionary;
	//   48   88:aload_0         
	//   49   89:areturn         
			i++;
	//   50   90:iload_1         
	//   51   91:iconst_1        
	//   52   92:iadd            
	//   53   93:istore_1        
		} while(true);
	//   54   94:goto            52
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected void addClass(PdfObject pdfobject)
		throws BadPdfFormatException
	{
		pdfobject = getDirectObject(pdfobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//    2    4:astore_1        
		if(!pdfobject.isDictionary()) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//    5    9:ifeq            79
_L1:
		pdfobject = ((PdfDictionary)pdfobject).get(PdfName.C);
	//    6   12:aload_1         
	//    7   13:checkcast       #71  <Class PdfDictionary>
	//    8   16:getstatic       #377 <Field PdfName PdfName.C>
	//    9   19:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   10   22:astore_1        
		if(pdfobject != null) goto _L4; else goto _L3
	//   11   23:aload_1         
	//   12   24:ifnonnull       28
_L3:
		return;
	//   13   27:return          
_L4:
		if(!pdfobject.isArray())
			break; /* Loop/switch isn't completed */
	//   14   28:aload_1         
	//   15   29:invokevirtual   #211 <Method boolean PdfObject.isArray()>
	//   16   32:ifeq            66
		pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//   17   35:aload_1         
	//   18   36:checkcast       #213 <Class PdfArray>
	//   19   39:astore_1        
		int i = 0;
	//   20   40:iconst_0        
	//   21   41:istore_2        
		while(i < ((PdfArray) (pdfobject)).size()) 
	//*  22   42:iload_2         
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #216 <Method int PdfArray.size()>
	//*  25   47:icmpge          27
		{
			addClass(((PdfArray) (pdfobject)).getPdfObject(i));
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:iload_2         
	//   29   53:invokevirtual   #220 <Method PdfObject PdfArray.getPdfObject(int)>
	//   30   56:invokevirtual   #379 <Method void addClass(PdfObject)>
			i++;
	//   31   59:iload_2         
	//   32   60:iconst_1        
	//   33   61:iadd            
	//   34   62:istore_2        
		}
		if(true) goto _L3; else goto _L5
	//   35   63:goto            42
_L5:
		if(pdfobject.isName())
	//*  36   66:aload_1         
	//*  37   67:invokevirtual   #179 <Method boolean PdfObject.isName()>
	//*  38   70:ifeq            27
		{
			addClass(pdfobject);
	//   39   73:aload_0         
	//   40   74:aload_1         
	//   41   75:invokevirtual   #379 <Method void addClass(PdfObject)>
			return;
	//   42   78:return          
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(!pdfobject.isName())
			continue; /* Loop/switch isn't completed */
	//   43   79:aload_1         
	//   44   80:invokevirtual   #179 <Method boolean PdfObject.isName()>
	//   45   83:ifeq            27
		pdfobject = ((PdfObject) ((PdfName)pdfobject));
	//   46   86:aload_1         
	//   47   87:checkcast       #65  <Class PdfName>
	//   48   90:astore_1        
		if(sourceClassMap != null)
			break; /* Loop/switch isn't completed */
	//   49   91:aload_0         
	//   50   92:getfield        #36  <Field PdfDictionary sourceClassMap>
	//   51   95:ifnonnull       131
		PdfObject pdfobject1 = getDirectObject(structTreeRoot.get(PdfName.CLASSMAP));
	//   52   98:aload_0         
	//   53   99:getfield        #381 <Field PdfDictionary structTreeRoot>
	//   54  102:getstatic       #384 <Field PdfName PdfName.CLASSMAP>
	//   55  105:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   56  108:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   57  111:astore_3        
		if(pdfobject1 == null || !pdfobject1.isDictionary())
			continue; /* Loop/switch isn't completed */
	//   58  112:aload_3         
	//   59  113:ifnull          27
	//   60  116:aload_3         
	//   61  117:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//   62  120:ifeq            27
		sourceClassMap = (PdfDictionary)pdfobject1;
	//   63  123:aload_0         
	//   64  124:aload_3         
	//   65  125:checkcast       #71  <Class PdfDictionary>
	//   66  128:putfield        #36  <Field PdfDictionary sourceClassMap>
		break; /* Loop/switch isn't completed */
		if(true) goto _L3; else goto _L6
_L6:
		PdfObject pdfobject2;
		pdfobject2 = getDirectObject(sourceClassMap.get(((PdfName) (pdfobject))));
	//   67  131:aload_0         
	//   68  132:getfield        #36  <Field PdfDictionary sourceClassMap>
	//   69  135:aload_1         
	//   70  136:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   71  139:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   72  142:astore_3        
		if(pdfobject2 == null)
			continue; /* Loop/switch isn't completed */
	//   73  143:aload_3         
	//   74  144:ifnull          27
		PdfObject pdfobject3 = structureTreeRoot.getMappedClass(((PdfName) (pdfobject)));
	//   75  147:aload_0         
	//   76  148:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//   77  151:aload_1         
	//   78  152:invokevirtual   #387 <Method PdfObject PdfStructureTreeRoot.getMappedClass(PdfName)>
	//   79  155:astore          4
		if(pdfobject3 == null)
			break; /* Loop/switch isn't completed */
	//   80  157:aload           4
	//   81  159:ifnull          193
		if(!compareObjects(pdfobject3, pdfobject2))
	//*  82  162:aload           4
	//*  83  164:aload_3         
	//*  84  165:invokestatic    #222 <Method boolean compareObjects(PdfObject, PdfObject)>
	//*  85  168:ifne            27
			throw new BadPdfFormatException(MessageLocalization.getComposedMessage("conflict.in.classmap", new Object[] {
				pdfobject
			}));
	//   86  171:new             #27  <Class BadPdfFormatException>
	//   87  174:dup             
	//   88  175:ldc2            #389 <String "conflict.in.classmap">
	//   89  178:iconst_1        
	//   90  179:anewarray       Object[]
	//   91  182:dup             
	//   92  183:iconst_0        
	//   93  184:aload_1         
	//   94  185:aastore         
	//   95  186:invokestatic    #52  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   96  189:invokespecial   #55  <Method void BadPdfFormatException(String)>
	//   97  192:athrow          
		if(true) goto _L3; else goto _L7
_L7:
		if(pdfobject2.isDictionary())
	//*  98  193:aload_3         
	//*  99  194:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//* 100  197:ifeq            216
		{
			structureTreeRoot.mapClass(((PdfName) (pdfobject)), ((PdfObject) (getDirectDict((PdfDictionary)pdfobject2))));
	//  101  200:aload_0         
	//  102  201:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//  103  204:aload_1         
	//  104  205:aload_3         
	//  105  206:checkcast       #71  <Class PdfDictionary>
	//  106  209:invokestatic    #335 <Method PdfDictionary getDirectDict(PdfDictionary)>
	//  107  212:invokevirtual   #392 <Method void PdfStructureTreeRoot.mapClass(PdfName, PdfObject)>
			return;
	//  108  215:return          
		}
		if(pdfobject2.isArray())
	//* 109  216:aload_3         
	//* 110  217:invokevirtual   #211 <Method boolean PdfObject.isArray()>
	//* 111  220:ifeq            27
		{
			structureTreeRoot.mapClass(((PdfName) (pdfobject)), ((PdfObject) (getDirectArray((PdfArray)pdfobject2))));
	//  112  223:aload_0         
	//  113  224:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//  114  227:aload_1         
	//  115  228:aload_3         
	//  116  229:checkcast       #213 <Class PdfArray>
	//  117  232:invokestatic    #328 <Method PdfArray getDirectArray(PdfArray)>
	//  118  235:invokevirtual   #392 <Method void PdfStructureTreeRoot.mapClass(PdfName, PdfObject)>
			return;
	//  119  238:return          
		}
		if(true) goto _L3; else goto _L8
_L8:
	}

	protected void addKid(PdfDictionary pdfdictionary, PdfObject pdfobject)
	{
		PdfObject pdfobject1 = pdfdictionary.get(PdfName.K);
	//    0    0:aload_1         
	//    1    1:getstatic       #351 <Field PdfName PdfName.K>
	//    2    4:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    7:astore          5
		if(!(pdfobject1 instanceof PdfArray)) goto _L2; else goto _L1
	//    4    9:aload           5
	//    5   11:instanceof      #213 <Class PdfArray>
	//    6   14:ifeq            38
_L1:
		PdfArray pdfarray = (PdfArray)pdfobject1;
	//    7   17:aload           5
	//    8   19:checkcast       #213 <Class PdfArray>
	//    9   22:astore_3        
_L4:
		pdfarray.add(pdfobject);
	//   10   23:aload_3         
	//   11   24:aload_2         
	//   12   25:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//   13   28:pop             
		pdfdictionary.put(PdfName.K, ((PdfObject) (pdfarray)));
	//   14   29:aload_1         
	//   15   30:getstatic       #351 <Field PdfName PdfName.K>
	//   16   33:aload_3         
	//   17   34:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return;
	//   18   37:return          
_L2:
		PdfArray pdfarray1 = new PdfArray();
	//   19   38:new             #213 <Class PdfArray>
	//   20   41:dup             
	//   21   42:invokespecial   #326 <Method void PdfArray()>
	//   22   45:astore          4
		pdfarray = pdfarray1;
	//   23   47:aload           4
	//   24   49:astore_3        
		if(pdfobject1 != null)
	//*  25   50:aload           5
	//*  26   52:ifnull          23
		{
			pdfarray1.add(pdfobject1);
	//   27   55:aload           4
	//   28   57:aload           5
	//   29   59:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//   30   62:pop             
			pdfarray = pdfarray1;
	//   31   63:aload           4
	//   32   65:astore_3        
		}
		if(true) goto _L4; else goto _L3
	//   33   66:goto            23
_L3:
	}

	protected void addRole(PdfName pdfname)
		throws BadPdfFormatException
	{
		if(pdfname != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		for(Iterator iterator = writer.getStandardStructElems().iterator(); iterator.hasNext();)
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field PdfCopy writer>
	//*   5    9:invokevirtual   #397 <Method List PdfCopy.getStandardStructElems()>
	//*   6   12:invokeinterface #400 <Method Iterator List.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            44
			if(((PdfName)iterator.next()).equals(((Object) (pdfname))))
	//*  11   27:aload_2         
	//*  12   28:invokeinterface #248 <Method Object Iterator.next()>
	//*  13   33:checkcast       #65  <Class PdfName>
	//*  14   36:aload_1         
	//*  15   37:invokevirtual   #366 <Method boolean PdfName.equals(Object)>
	//*  16   40:ifeq            18
				return;
	//   17   43:return          

		if(sourceRoleMap != null)
			break; /* Loop/switch isn't completed */
	//   18   44:aload_0         
	//   19   45:getfield        #34  <Field PdfDictionary sourceRoleMap>
	//   20   48:ifnonnull       84
		PdfObject pdfobject = getDirectObject(structTreeRoot.get(PdfName.ROLEMAP));
	//   21   51:aload_0         
	//   22   52:getfield        #381 <Field PdfDictionary structTreeRoot>
	//   23   55:getstatic       #403 <Field PdfName PdfName.ROLEMAP>
	//   24   58:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   25   61:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   26   64:astore_2        
		if(pdfobject == null || !pdfobject.isDictionary())
			continue; /* Loop/switch isn't completed */
	//   27   65:aload_2         
	//   28   66:ifnull          4
	//   29   69:aload_2         
	//   30   70:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//   31   73:ifeq            4
		sourceRoleMap = (PdfDictionary)pdfobject;
	//   32   76:aload_0         
	//   33   77:aload_2         
	//   34   78:checkcast       #71  <Class PdfDictionary>
	//   35   81:putfield        #34  <Field PdfDictionary sourceRoleMap>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		PdfObject pdfobject1 = sourceRoleMap.get(pdfname);
	//   36   84:aload_0         
	//   37   85:getfield        #34  <Field PdfDictionary sourceRoleMap>
	//   38   88:aload_1         
	//   39   89:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   40   92:astore_2        
		if(pdfobject1 != null && pdfobject1.isName())
	//*  41   93:aload_2         
	//*  42   94:ifnull          4
	//*  43   97:aload_2         
	//*  44   98:invokevirtual   #179 <Method boolean PdfObject.isName()>
	//*  45  101:ifeq            4
		{
			if(roleMap == null)
	//*  46  104:aload_0         
	//*  47  105:getfield        #32  <Field PdfDictionary roleMap>
	//*  48  108:ifnonnull       146
			{
				roleMap = new PdfDictionary();
	//   49  111:aload_0         
	//   50  112:new             #71  <Class PdfDictionary>
	//   51  115:dup             
	//   52  116:invokespecial   #336 <Method void PdfDictionary()>
	//   53  119:putfield        #32  <Field PdfDictionary roleMap>
				structureTreeRoot.put(PdfName.ROLEMAP, ((PdfObject) (roleMap)));
	//   54  122:aload_0         
	//   55  123:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//   56  126:getstatic       #403 <Field PdfName PdfName.ROLEMAP>
	//   57  129:aload_0         
	//   58  130:getfield        #32  <Field PdfDictionary roleMap>
	//   59  133:invokevirtual   #83  <Method void PdfStructureTreeRoot.put(PdfName, PdfObject)>
				roleMap.put(pdfname, pdfobject1);
	//   60  136:aload_0         
	//   61  137:getfield        #32  <Field PdfDictionary roleMap>
	//   62  140:aload_1         
	//   63  141:aload_2         
	//   64  142:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
				return;
	//   65  145:return          
			}
			PdfObject pdfobject2 = roleMap.get(pdfname);
	//   66  146:aload_0         
	//   67  147:getfield        #32  <Field PdfDictionary roleMap>
	//   68  150:aload_1         
	//   69  151:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   70  154:astore_3        
			if(pdfobject2 != null)
	//*  71  155:aload_3         
	//*  72  156:ifnull          189
			{
				if(!((Object) (pdfobject2)).equals(((Object) (pdfobject1))))
	//*  73  159:aload_3         
	//*  74  160:aload_2         
	//*  75  161:invokevirtual   #182 <Method boolean Object.equals(Object)>
	//*  76  164:ifne            4
					throw new BadPdfFormatException(MessageLocalization.getComposedMessage("conflict.in.rolemap", new Object[] {
						pdfname
					}));
	//   77  167:new             #27  <Class BadPdfFormatException>
	//   78  170:dup             
	//   79  171:ldc2            #405 <String "conflict.in.rolemap">
	//   80  174:iconst_1        
	//   81  175:anewarray       Object[]
	//   82  178:dup             
	//   83  179:iconst_0        
	//   84  180:aload_1         
	//   85  181:aastore         
	//   86  182:invokestatic    #52  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   87  185:invokespecial   #55  <Method void BadPdfFormatException(String)>
	//   88  188:athrow          
			} else
			{
				roleMap.put(pdfname, pdfobject1);
	//   89  189:aload_0         
	//   90  190:getfield        #32  <Field PdfDictionary roleMap>
	//   91  193:aload_1         
	//   92  194:aload_2         
	//   93  195:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
				return;
	//   94  198:return          
			}
		}
		if(true) goto _L1; else goto _L4
_L4:
	}

	protected void attachStructTreeRootKids(PdfObject pdfobject)
		throws IOException, BadPdfFormatException
	{
		PdfObject pdfobject1 = structTreeRoot.get(PdfName.K);
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field PdfDictionary structTreeRoot>
	//    2    4:getstatic       #351 <Field PdfName PdfName.K>
	//    3    7:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:astore_2        
		if(pdfobject1 == null || !pdfobject1.isArray() && !pdfobject1.isIndirect())
	//*   5   11:aload_2         
	//*   6   12:ifnull          29
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #211 <Method boolean PdfObject.isArray()>
	//*   9   19:ifne            39
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #98  <Method boolean PdfObject.isIndirect()>
	//*  12   26:ifne            39
		{
			addKid(((PdfDictionary) (structureTreeRoot)), pdfobject);
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #63  <Field PdfStructureTreeRoot structureTreeRoot>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #136 <Method void addKid(PdfDictionary, PdfObject)>
		} else
	//*  18   38:return          
		{
			if(pdfobject1.isIndirect())
	//*  19   39:aload_2         
	//*  20   40:invokevirtual   #98  <Method boolean PdfObject.isIndirect()>
	//*  21   43:ifeq            52
			{
				addKid(pdfobject1);
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:invokespecial   #407 <Method void addKid(PdfObject)>
				return;
	//   25   51:return          
			}
			pdfobject = ((PdfObject) (((PdfArray)pdfobject1).iterator()));
	//   26   52:aload_2         
	//   27   53:checkcast       #213 <Class PdfArray>
	//   28   56:invokevirtual   #293 <Method Iterator PdfArray.iterator()>
	//   29   59:astore_1        
			while(((Iterator) (pdfobject)).hasNext()) 
	//*  30   60:aload_1         
	//*  31   61:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//*  32   66:ifeq            38
				addKid((PdfObject)((Iterator) (pdfobject)).next());
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokeinterface #248 <Method Object Iterator.next()>
	//   36   76:checkcast       #95  <Class PdfObject>
	//   37   79:invokespecial   #407 <Method void addKid(PdfObject)>
		}
	//*  38   82:goto            60
	}

	public void copyStructTreeForPage(PdfNumber pdfnumber, int i)
		throws BadPdfFormatException, IOException
	{
		if(copyPageMarks(parentTree, pdfnumber, i) == returnType.NOTFOUND)
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #411 <Field PdfDictionary parentTree>
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokespecial   #266 <Method PdfStructTreeController$returnType copyPageMarks(PdfDictionary, PdfNumber, int)>
	//*   6   10:getstatic       #260 <Field PdfStructTreeController$returnType PdfStructTreeController$returnType.NOTFOUND>
	//*   7   13:if_acmpne       34
			throw new BadPdfFormatException(MessageLocalization.getComposedMessage("invalid.structparent", new Object[0]));
	//    8   16:new             #27  <Class BadPdfFormatException>
	//    9   19:dup             
	//   10   20:ldc2            #413 <String "invalid.structparent">
	//   11   23:iconst_0        
	//   12   24:anewarray       Object[]
	//   13   27:invokestatic    #52  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   30:invokespecial   #55  <Method void BadPdfFormatException(String)>
	//   15   33:athrow          
		else
			return;
	//   16   34:return          
	}

	protected void setReader(PdfReader pdfreader)
		throws BadPdfFormatException
	{
		reader = pdfreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field PdfReader reader>
		pdfreader = ((PdfReader) (getDirectObject(pdfreader.getCatalog().get(PdfName.STRUCTTREEROOT))));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #149 <Method PdfDictionary PdfReader.getCatalog()>
	//    5    9:getstatic       #152 <Field PdfName PdfName.STRUCTTREEROOT>
	//    6   12:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//    7   15:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//    8   18:astore_1        
		if(pdfreader == null || !((PdfObject) (pdfreader)).isDictionary())
	//*   9   19:aload_1         
	//*  10   20:ifnull          30
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//*  13   27:ifne            47
			throw new BadPdfFormatException(MessageLocalization.getComposedMessage("no.structtreeroot.found", new Object[0]));
	//   14   30:new             #27  <Class BadPdfFormatException>
	//   15   33:dup             
	//   16   34:ldc1            #46  <String "no.structtreeroot.found">
	//   17   36:iconst_0        
	//   18   37:anewarray       Object[]
	//   19   40:invokestatic    #52  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   20   43:invokespecial   #55  <Method void BadPdfFormatException(String)>
	//   21   46:athrow          
		structTreeRoot = (PdfDictionary)pdfreader;
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:checkcast       #71  <Class PdfDictionary>
	//   25   52:putfield        #381 <Field PdfDictionary structTreeRoot>
		pdfreader = ((PdfReader) (getDirectObject(structTreeRoot.get(PdfName.PARENTTREE))));
	//   26   55:aload_0         
	//   27   56:getfield        #381 <Field PdfDictionary structTreeRoot>
	//   28   59:getstatic       #69  <Field PdfName PdfName.PARENTTREE>
	//   29   62:invokevirtual   #155 <Method PdfObject PdfDictionary.get(PdfName)>
	//   30   65:invokestatic    #159 <Method PdfObject getDirectObject(PdfObject)>
	//   31   68:astore_1        
		if(pdfreader == null || !((PdfObject) (pdfreader)).isDictionary())
	//*  32   69:aload_1         
	//*  33   70:ifnull          80
	//*  34   73:aload_1         
	//*  35   74:invokevirtual   #162 <Method boolean PdfObject.isDictionary()>
	//*  36   77:ifne            98
		{
			throw new BadPdfFormatException(MessageLocalization.getComposedMessage("the.document.does.not.contain.parenttree", new Object[0]));
	//   37   80:new             #27  <Class BadPdfFormatException>
	//   38   83:dup             
	//   39   84:ldc2            #415 <String "the.document.does.not.contain.parenttree">
	//   40   87:iconst_0        
	//   41   88:anewarray       Object[]
	//   42   91:invokestatic    #52  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   43   94:invokespecial   #55  <Method void BadPdfFormatException(String)>
	//   44   97:athrow          
		} else
		{
			parentTree = (PdfDictionary)pdfreader;
	//   45   98:aload_0         
	//   46   99:aload_1         
	//   47  100:checkcast       #71  <Class PdfDictionary>
	//   48  103:putfield        #411 <Field PdfDictionary parentTree>
			sourceRoleMap = null;
	//   49  106:aload_0         
	//   50  107:aconst_null     
	//   51  108:putfield        #34  <Field PdfDictionary sourceRoleMap>
			sourceClassMap = null;
	//   52  111:aload_0         
	//   53  112:aconst_null     
	//   54  113:putfield        #36  <Field PdfDictionary sourceClassMap>
			nullReference = null;
	//   55  116:aload_0         
	//   56  117:aconst_null     
	//   57  118:putfield        #38  <Field PdfIndirectReference nullReference>
			return;
	//   58  121:return          
		}
	}

	private PdfIndirectReference nullReference;
	private PdfDictionary parentTree;
	protected PdfReader reader;
	private PdfDictionary roleMap;
	private PdfDictionary sourceClassMap;
	private PdfDictionary sourceRoleMap;
	private PdfDictionary structTreeRoot;
	private PdfStructureTreeRoot structureTreeRoot;
	private PdfCopy writer;
}
