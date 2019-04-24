// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.collection;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;

public class PdfCollectionField extends PdfDictionary
{

	public PdfCollectionField(String s, int i)
	{
		super(PdfName.COLLECTIONFIELD);
	//    0    0:aload_0         
	//    1    1:getstatic       #30  <Field PdfName PdfName.COLLECTIONFIELD>
	//    2    4:invokespecial   #33  <Method void PdfDictionary(PdfName)>
		put(PdfName.N, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    3    7:aload_0         
	//    4    8:getstatic       #36  <Field PdfName PdfName.N>
	//    5   11:new             #38  <Class PdfString>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:ldc1            #40  <String "UnicodeBig">
	//    9   18:invokespecial   #43  <Method void PdfString(String, String)>
	//   10   21:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		fieldType = i;
	//   11   24:aload_0         
	//   12   25:iload_2         
	//   13   26:putfield        #49  <Field int fieldType>
		switch(i)
	//*  14   29:iload_2         
		{
	//*  15   30:tableswitch     1 7: default 72
	//	               1 83
	//	               2 94
	//	               3 105
	//	               4 116
	//	               5 127
	//	               6 138
	//	               7 149
		default:
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.S)));
	//   16   72:aload_0         
	//   17   73:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   18   76:getstatic       #55  <Field PdfName PdfName.S>
	//   19   79:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   20   82:return          

		case 1: // '\001'
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.D)));
	//   21   83:aload_0         
	//   22   84:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   23   87:getstatic       #58  <Field PdfName PdfName.D>
	//   24   90:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   25   93:return          

		case 2: // '\002'
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.N)));
	//   26   94:aload_0         
	//   27   95:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   28   98:getstatic       #36  <Field PdfName PdfName.N>
	//   29  101:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   30  104:return          

		case 3: // '\003'
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.F)));
	//   31  105:aload_0         
	//   32  106:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   33  109:getstatic       #61  <Field PdfName PdfName.F>
	//   34  112:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   35  115:return          

		case 4: // '\004'
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.DESC)));
	//   36  116:aload_0         
	//   37  117:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   38  120:getstatic       #63  <Field PdfName PdfName.DESC>
	//   39  123:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   40  126:return          

		case 5: // '\005'
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.MODDATE)));
	//   41  127:aload_0         
	//   42  128:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   43  131:getstatic       #65  <Field PdfName PdfName.MODDATE>
	//   44  134:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   45  137:return          

		case 6: // '\006'
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.CREATIONDATE)));
	//   46  138:aload_0         
	//   47  139:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   48  142:getstatic       #67  <Field PdfName PdfName.CREATIONDATE>
	//   49  145:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   50  148:return          

		case 7: // '\007'
			put(PdfName.SUBTYPE, ((PdfObject) (PdfName.SIZE)));
	//   51  149:aload_0         
	//   52  150:getstatic       #52  <Field PdfName PdfName.SUBTYPE>
	//   53  153:getstatic       #69  <Field PdfName PdfName.SIZE>
	//   54  156:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			break;
		}
	//   55  159:return          
	}

	public PdfObject getValue(String s)
	{
		switch(fieldType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int fieldType>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 66
	//	               1 77
	//	               2 89
		default:
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("1.is.not.an.acceptable.value.for.the.field.2", new Object[] {
				s, get(PdfName.N).toString()
			}));
	//    3   32:new             #74  <Class IllegalArgumentException>
	//    4   35:dup             
	//    5   36:ldc1            #76  <String "1.is.not.an.acceptable.value.for.the.field.2">
	//    6   38:iconst_2        
	//    7   39:anewarray       Object[]
	//    8   42:dup             
	//    9   43:iconst_0        
	//   10   44:aload_1         
	//   11   45:aastore         
	//   12   46:dup             
	//   13   47:iconst_1        
	//   14   48:aload_0         
	//   15   49:getstatic       #36  <Field PdfName PdfName.N>
	//   16   52:invokevirtual   #82  <Method PdfObject get(PdfName)>
	//   17   55:invokevirtual   #88  <Method String PdfObject.toString()>
	//   18   58:aastore         
	//   19   59:invokestatic    #94  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   20   62:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   21   65:athrow          

		case 0: // '\0'
			return ((PdfObject) (new PdfString(s, "UnicodeBig")));
	//   22   66:new             #38  <Class PdfString>
	//   23   69:dup             
	//   24   70:aload_1         
	//   25   71:ldc1            #40  <String "UnicodeBig">
	//   26   73:invokespecial   #43  <Method void PdfString(String, String)>
	//   27   76:areturn         

		case 1: // '\001'
			return ((PdfObject) (new PdfDate(PdfDate.decode(s))));
	//   28   77:new             #99  <Class PdfDate>
	//   29   80:dup             
	//   30   81:aload_1         
	//   31   82:invokestatic    #103 <Method java.util.Calendar PdfDate.decode(String)>
	//   32   85:invokespecial   #106 <Method void PdfDate(java.util.Calendar)>
	//   33   88:areturn         

		case 2: // '\002'
			return ((PdfObject) (new PdfNumber(s)));
	//   34   89:new             #108 <Class PdfNumber>
	//   35   92:dup             
	//   36   93:aload_1         
	//   37   94:invokespecial   #109 <Method void PdfNumber(String)>
	//   38   97:areturn         
		}
	}

	public boolean isCollectionItem()
	{
		switch(fieldType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int fieldType>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 34
	//	               1 34
	//	               2 34
		default:
			return false;
	//    3   32:iconst_0        
	//    4   33:ireturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			return true;
	//    5   34:iconst_1        
	//    6   35:ireturn         
		}
	}

	public void setEditable(boolean flag)
	{
		put(PdfName.E, ((PdfObject) (new PdfBoolean(flag))));
	//    0    0:aload_0         
	//    1    1:getstatic       #116 <Field PdfName PdfName.E>
	//    2    4:new             #118 <Class PdfBoolean>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #120 <Method void PdfBoolean(boolean)>
	//    6   12:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setOrder(int i)
	{
		put(PdfName.O, ((PdfObject) (new PdfNumber(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #125 <Field PdfName PdfName.O>
	//    2    4:new             #108 <Class PdfNumber>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #127 <Method void PdfNumber(int)>
	//    6   12:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setVisible(boolean flag)
	{
		put(PdfName.V, ((PdfObject) (new PdfBoolean(flag))));
	//    0    0:aload_0         
	//    1    1:getstatic       #131 <Field PdfName PdfName.V>
	//    2    4:new             #118 <Class PdfBoolean>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #120 <Method void PdfBoolean(boolean)>
	//    6   12:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public static final int CREATIONDATE = 6;
	public static final int DATE = 1;
	public static final int DESC = 4;
	public static final int FILENAME = 3;
	public static final int MODDATE = 5;
	public static final int NUMBER = 2;
	public static final int SIZE = 7;
	public static final int TEXT = 0;
	protected int fieldType;
}
