// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;
import java.util.List;

public class SignaturePermissions
{
	public class FieldLock
	{

		public PdfName getAction()
		{
			return action;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field PdfName action>
		//    2    4:areturn         
		}

		public PdfArray getFields()
		{
			return fields;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PdfArray fields>
		//    2    4:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = (new StringBuilder()).append(action.toString());
		//    0    0:new             #33  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field PdfName action>
		//    5   11:invokevirtual   #38  <Method String PdfName.toString()>
		//    6   14:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:astore_2        
			String s;
			if(fields == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #24  <Field PdfArray fields>
		//*  10   22:ifnonnull       37
				s = "";
		//   11   25:ldc1            #44  <String "">
		//   12   27:astore_1        
			else
		//*  13   28:aload_2         
		//*  14   29:aload_1         
		//*  15   30:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//*  16   33:invokevirtual   #45  <Method String StringBuilder.toString()>
		//*  17   36:areturn         
				s = fields.toString();
		//   18   37:aload_0         
		//   19   38:getfield        #24  <Field PdfArray fields>
		//   20   41:invokevirtual   #48  <Method String PdfArray.toString()>
		//   21   44:astore_1        
			return stringbuilder.append(s).toString();
		//*  22   45:goto            28
		}

		PdfName action;
		PdfArray fields;
		final SignaturePermissions this$0;

		public FieldLock(PdfName pdfname, PdfArray pdfarray)
		{
			this$0 = SignaturePermissions.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field SignaturePermissions this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			action = pdfname;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field PdfName action>
			fields = pdfarray;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field PdfArray fields>
		//   11   19:return          
		}
	}


	public SignaturePermissions(PdfDictionary pdfdictionary, SignaturePermissions signaturepermissions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		certification = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean certification>
		fillInAllowed = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #23  <Field boolean fillInAllowed>
		annotationsAllowed = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #25  <Field boolean annotationsAllowed>
		fieldLocks = ((List) (new ArrayList()));
	//   11   19:aload_0         
	//   12   20:new             #27  <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #28  <Method void ArrayList()>
	//   15   27:putfield        #30  <Field List fieldLocks>
		if(signaturepermissions != null)
	//*  16   30:aload_2         
	//*  17   31:ifnull          74
		{
			annotationsAllowed = annotationsAllowed & signaturepermissions.isAnnotationsAllowed();
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #25  <Field boolean annotationsAllowed>
	//   21   39:aload_2         
	//   22   40:invokevirtual   #34  <Method boolean isAnnotationsAllowed()>
	//   23   43:iand            
	//   24   44:putfield        #25  <Field boolean annotationsAllowed>
			fillInAllowed = fillInAllowed & signaturepermissions.isFillInAllowed();
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #23  <Field boolean fillInAllowed>
	//   28   52:aload_2         
	//   29   53:invokevirtual   #37  <Method boolean isFillInAllowed()>
	//   30   56:iand            
	//   31   57:putfield        #23  <Field boolean fillInAllowed>
			fieldLocks.addAll(((java.util.Collection) (signaturepermissions.getFieldLocks())));
	//   32   60:aload_0         
	//   33   61:getfield        #30  <Field List fieldLocks>
	//   34   64:aload_2         
	//   35   65:invokevirtual   #41  <Method List getFieldLocks()>
	//   36   68:invokeinterface #47  <Method boolean List.addAll(java.util.Collection)>
	//   37   73:pop             
		}
		pdfdictionary = ((PdfDictionary) (pdfdictionary.getAsArray(PdfName.REFERENCE)));
	//   38   74:aload_1         
	//   39   75:getstatic       #53  <Field PdfName PdfName.REFERENCE>
	//   40   78:invokevirtual   #59  <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   41   81:astore_1        
		if(pdfdictionary == null) goto _L2; else goto _L1
	//   42   82:aload_1         
	//   43   83:ifnull          246
_L1:
		int i = 0;
	//   44   86:iconst_0        
	//   45   87:istore_3        
_L6:
		if(i >= ((PdfArray) (pdfdictionary)).size()) goto _L2; else goto _L3
	//   46   88:iload_3         
	//   47   89:aload_1         
	//   48   90:invokevirtual   #65  <Method int PdfArray.size()>
	//   49   93:icmpge          246
_L3:
		Object obj = ((Object) (((PdfArray) (pdfdictionary)).getAsDict(i)));
	//   50   96:aload_1         
	//   51   97:iload_3         
	//   52   98:invokevirtual   #69  <Method PdfDictionary PdfArray.getAsDict(int)>
	//   53  101:astore          4
		signaturepermissions = ((SignaturePermissions) (((PdfDictionary) (obj)).getAsDict(PdfName.TRANSFORMPARAMS)));
	//   54  103:aload           4
	//   55  105:getstatic       #72  <Field PdfName PdfName.TRANSFORMPARAMS>
	//   56  108:invokevirtual   #75  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   57  111:astore_2        
		if(PdfName.DOCMDP.equals(((Object) (((PdfDictionary) (obj)).getAsName(PdfName.TRANSFORMMETHOD)))))
	//*  58  112:getstatic       #78  <Field PdfName PdfName.DOCMDP>
	//*  59  115:aload           4
	//*  60  117:getstatic       #81  <Field PdfName PdfName.TRANSFORMMETHOD>
	//*  61  120:invokevirtual   #85  <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  62  123:invokevirtual   #89  <Method boolean PdfName.equals(Object)>
	//*  63  126:ifeq            134
			certification = true;
	//   64  129:aload_0         
	//   65  130:iconst_1        
	//   66  131:putfield        #21  <Field boolean certification>
		obj = ((Object) (((PdfDictionary) (signaturepermissions)).getAsName(PdfName.ACTION)));
	//   67  134:aload_2         
	//   68  135:getstatic       #92  <Field PdfName PdfName.ACTION>
	//   69  138:invokevirtual   #85  <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   70  141:astore          4
		if(obj != null)
	//*  71  143:aload           4
	//*  72  145:ifnull          175
			fieldLocks.add(((Object) (new FieldLock(((PdfName) (obj)), ((PdfDictionary) (signaturepermissions)).getAsArray(PdfName.FIELDS)))));
	//   73  148:aload_0         
	//   74  149:getfield        #30  <Field List fieldLocks>
	//   75  152:new             #6   <Class SignaturePermissions$FieldLock>
	//   76  155:dup             
	//   77  156:aload_0         
	//   78  157:aload           4
	//   79  159:aload_2         
	//   80  160:getstatic       #95  <Field PdfName PdfName.FIELDS>
	//   81  163:invokevirtual   #59  <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   82  166:invokespecial   #98  <Method void SignaturePermissions$FieldLock(SignaturePermissions, PdfName, PdfArray)>
	//   83  169:invokeinterface #101 <Method boolean List.add(Object)>
	//   84  174:pop             
		signaturepermissions = ((SignaturePermissions) (((PdfDictionary) (signaturepermissions)).getAsNumber(PdfName.P)));
	//   85  175:aload_2         
	//   86  176:getstatic       #104 <Field PdfName PdfName.P>
	//   87  179:invokevirtual   #108 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   88  182:astore_2        
		if(signaturepermissions != null) goto _L5; else goto _L4
	//   89  183:aload_2         
	//   90  184:ifnonnull       194
_L4:
		i++;
	//   91  187:iload_3         
	//   92  188:iconst_1        
	//   93  189:iadd            
	//   94  190:istore_3        
		  goto _L6
	//*  95  191:goto            88
_L5:
		switch(((PdfNumber) (signaturepermissions)).intValue())
	//*  96  194:aload_2         
	//*  97  195:invokevirtual   #113 <Method int PdfNumber.intValue()>
		{
	//*  98  198:tableswitch     1 2: default 220
	//	               1 223
	//	               2 233
	//*  99  220:goto            187
		case 1: // '\001'
			fillInAllowed = fillInAllowed & false;
	//  100  223:aload_0         
	//  101  224:aload_0         
	//  102  225:getfield        #23  <Field boolean fillInAllowed>
	//  103  228:iconst_0        
	//  104  229:iand            
	//  105  230:putfield        #23  <Field boolean fillInAllowed>
			// fall through

		case 2: // '\002'
			annotationsAllowed = annotationsAllowed & false;
	//  106  233:aload_0         
	//  107  234:aload_0         
	//  108  235:getfield        #25  <Field boolean annotationsAllowed>
	//  109  238:iconst_0        
	//  110  239:iand            
	//  111  240:putfield        #25  <Field boolean annotationsAllowed>
			break;
		}
		if(true) goto _L4; else goto _L2
	//* 112  243:goto            187
_L2:
	//  113  246:return          
	}

	public List getFieldLocks()
	{
		return fieldLocks;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List fieldLocks>
	//    2    4:areturn         
	}

	public boolean isAnnotationsAllowed()
	{
		return annotationsAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean annotationsAllowed>
	//    2    4:ireturn         
	}

	public boolean isCertification()
	{
		return certification;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean certification>
	//    2    4:ireturn         
	}

	public boolean isFillInAllowed()
	{
		return fillInAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean fillInAllowed>
	//    2    4:ireturn         
	}

	boolean annotationsAllowed;
	boolean certification;
	List fieldLocks;
	boolean fillInAllowed;
}
