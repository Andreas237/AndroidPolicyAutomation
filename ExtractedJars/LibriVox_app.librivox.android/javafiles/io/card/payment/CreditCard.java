// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.card.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

// Referenced classes of package io.card.payment:
//			CardType, g

public class CreditCard
	implements Parcelable
{

	public CreditCard()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		expiryMonth = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field int expiryMonth>
		expiryYear = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #42  <Field int expiryYear>
		flipped = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #44  <Field boolean flipped>
		xoff = new int[16];
	//   11   19:aload_0         
	//   12   20:bipush          16
	//   13   22:newarray        int[]
	//   14   24:putfield        #46  <Field int[] xoff>
		scanId = UUID.randomUUID().toString();
	//   15   27:aload_0         
	//   16   28:invokestatic    #52  <Method UUID UUID.randomUUID()>
	//   17   31:invokevirtual   #56  <Method String UUID.toString()>
	//   18   34:putfield        #58  <Field String scanId>
	//   19   37:return          
	}

	private CreditCard(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		expiryMonth = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field int expiryMonth>
		expiryYear = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #42  <Field int expiryYear>
		flipped = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #44  <Field boolean flipped>
		cardNumber = parcel.readString();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #64  <Method String Parcel.readString()>
	//   14   24:putfield        #66  <Field String cardNumber>
		expiryMonth = parcel.readInt();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #70  <Method int Parcel.readInt()>
	//   18   32:putfield        #40  <Field int expiryMonth>
		expiryYear = parcel.readInt();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #70  <Method int Parcel.readInt()>
	//   22   40:putfield        #42  <Field int expiryYear>
		cvv = parcel.readString();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #64  <Method String Parcel.readString()>
	//   26   48:putfield        #72  <Field String cvv>
		postalCode = parcel.readString();
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:invokevirtual   #64  <Method String Parcel.readString()>
	//   30   56:putfield        #74  <Field String postalCode>
		cardholderName = parcel.readString();
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:invokevirtual   #64  <Method String Parcel.readString()>
	//   34   64:putfield        #76  <Field String cardholderName>
		scanId = parcel.readString();
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #64  <Method String Parcel.readString()>
	//   38   72:putfield        #58  <Field String scanId>
		yoff = parcel.readInt();
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:invokevirtual   #70  <Method int Parcel.readInt()>
	//   42   80:putfield        #78  <Field int yoff>
		xoff = parcel.createIntArray();
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:invokevirtual   #82  <Method int[] Parcel.createIntArray()>
	//   46   88:putfield        #46  <Field int[] xoff>
	//   47   91:return          
	}

	CreditCard(Parcel parcel, _cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void CreditCard(Parcel)>
	//    3    5:return          
	}

	public CreditCard(String s, int i, int j, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		expiryMonth = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field int expiryMonth>
		expiryYear = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #42  <Field int expiryYear>
		flipped = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #44  <Field boolean flipped>
		cardNumber = s;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #66  <Field String cardNumber>
		expiryMonth = i;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:putfield        #40  <Field int expiryMonth>
		expiryYear = j;
	//   17   29:aload_0         
	//   18   30:iload_3         
	//   19   31:putfield        #42  <Field int expiryYear>
		cvv = s1;
	//   20   34:aload_0         
	//   21   35:aload           4
	//   22   37:putfield        #72  <Field String cvv>
		postalCode = s2;
	//   23   40:aload_0         
	//   24   41:aload           5
	//   25   43:putfield        #74  <Field String postalCode>
		cardholderName = s3;
	//   26   46:aload_0         
	//   27   47:aload           6
	//   28   49:putfield        #76  <Field String cardholderName>
	//   29   52:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CardType getCardType()
	{
		return CardType.fromCardNumber(cardNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String cardNumber>
	//    2    4:invokestatic    #95  <Method CardType CardType.fromCardNumber(String)>
	//    3    7:areturn         
	}

	public String getFormattedCardNumber()
	{
		return g.b(cardNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String cardNumber>
	//    2    4:invokestatic    #102 <Method String g.b(String)>
	//    3    7:areturn         
	}

	public String getLastFourDigitsOfCardNumber()
	{
		String s = cardNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String cardNumber>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          34
		{
			int i = Math.min(4, s.length());
	//    5    9:iconst_4        
	//    6   10:aload_2         
	//    7   11:invokevirtual   #108 <Method int String.length()>
	//    8   14:invokestatic    #114 <Method int Math.min(int, int)>
	//    9   17:istore_1        
			s = cardNumber;
	//   10   18:aload_0         
	//   11   19:getfield        #66  <Field String cardNumber>
	//   12   22:astore_2        
			return s.substring(s.length() - i);
	//   13   23:aload_2         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #108 <Method int String.length()>
	//   16   28:iload_1         
	//   17   29:isub            
	//   18   30:invokevirtual   #118 <Method String String.substring(int)>
	//   19   33:areturn         
		} else
		{
			return "";
	//   20   34:ldc1            #120 <String "">
	//   21   36:areturn         
		}
	}

	public String getRedactedCardNumber()
	{
		Object obj1 = ((Object) (cardNumber));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String cardNumber>
	//    2    4:astore_2        
		if(obj1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          144
		{
			Object obj = "";
	//    5    9:ldc1            #120 <String "">
	//    6   11:astore_1        
			if(((String) (obj1)).length() > 4)
	//*   7   12:aload_2         
	//*   8   13:invokevirtual   #108 <Method int String.length()>
	//*   9   16:iconst_4        
	//*  10   17:icmple          105
			{
				obj = ((Object) (new StringBuilder()));
	//   11   20:new             #123 <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #124 <Method void StringBuilder()>
	//   14   27:astore_1        
				((StringBuilder) (obj)).append("");
	//   15   28:aload_1         
	//   16   29:ldc1            #120 <String "">
	//   17   31:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
				obj1 = ((Object) (new StringBuilder()));
	//   19   35:new             #123 <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #124 <Method void StringBuilder()>
	//   22   42:astore_2        
				((StringBuilder) (obj1)).append("%");
	//   23   43:aload_2         
	//   24   44:ldc1            #130 <String "%">
	//   25   46:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
				((StringBuilder) (obj1)).append(cardNumber.length() - 4);
	//   27   50:aload_2         
	//   28   51:aload_0         
	//   29   52:getfield        #66  <Field String cardNumber>
	//   30   55:invokevirtual   #108 <Method int String.length()>
	//   31   58:iconst_4        
	//   32   59:isub            
	//   33   60:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   34   63:pop             
				((StringBuilder) (obj1)).append("s");
	//   35   64:aload_2         
	//   36   65:ldc1            #135 <String "s">
	//   37   67:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   38   70:pop             
				((StringBuilder) (obj)).append(String.format(((StringBuilder) (obj1)).toString(), new Object[] {
					""
				}).replace(' ', '\u2022'));
	//   39   71:aload_1         
	//   40   72:aload_2         
	//   41   73:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   42   76:iconst_1        
	//   43   77:anewarray       Object[]
	//   44   80:dup             
	//   45   81:iconst_0        
	//   46   82:ldc1            #120 <String "">
	//   47   84:aastore         
	//   48   85:invokestatic    #140 <Method String String.format(String, Object[])>
	//   49   88:bipush          32
	//   50   90:sipush          8226
	//   51   93:invokevirtual   #144 <Method String String.replace(char, char)>
	//   52   96:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   53   99:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   54  100:aload_1         
	//   55  101:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   56  104:astore_1        
			}
			obj1 = ((Object) (new StringBuilder()));
	//   57  105:new             #123 <Class StringBuilder>
	//   58  108:dup             
	//   59  109:invokespecial   #124 <Method void StringBuilder()>
	//   60  112:astore_2        
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   61  113:aload_2         
	//   62  114:aload_1         
	//   63  115:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   64  118:pop             
			((StringBuilder) (obj1)).append(getLastFourDigitsOfCardNumber());
	//   65  119:aload_2         
	//   66  120:aload_0         
	//   67  121:invokevirtual   #146 <Method String getLastFourDigitsOfCardNumber()>
	//   68  124:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   69  127:pop             
			return g.a(((StringBuilder) (obj1)).toString(), false, CardType.fromCardNumber(cardNumber));
	//   70  128:aload_2         
	//   71  129:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   72  132:iconst_0        
	//   73  133:aload_0         
	//   74  134:getfield        #66  <Field String cardNumber>
	//   75  137:invokestatic    #95  <Method CardType CardType.fromCardNumber(String)>
	//   76  140:invokestatic    #150 <Method String g.a(String, boolean, CardType)>
	//   77  143:areturn         
		} else
		{
			return "";
	//   78  144:ldc1            #120 <String "">
	//   79  146:areturn         
		}
	}

	public boolean isExpiryValid()
	{
		return g.a(expiryMonth, expiryYear);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int expiryMonth>
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field int expiryYear>
	//    4    8:invokestatic    #155 <Method boolean g.a(int, int)>
	//    5   11:ireturn         
	}

	public String toString()
	{
		Object obj;
label0:
		{
			obj = ((Object) (new StringBuilder()));
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void StringBuilder()>
	//    3    7:astore_2        
			((StringBuilder) (obj)).append("{");
	//    4    8:aload_2         
	//    5    9:ldc1            #157 <String "{">
	//    6   11:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
			((StringBuilder) (obj)).append(((Object) (getCardType())));
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #159 <Method CardType getCardType()>
	//   11   20:invokevirtual   #162 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
			((StringBuilder) (obj)).append(": ");
	//   13   24:aload_2         
	//   14   25:ldc1            #164 <String ": ">
	//   15   27:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
			((StringBuilder) (obj)).append(getRedactedCardNumber());
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #166 <Method String getRedactedCardNumber()>
	//   20   36:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			String s = ((StringBuilder) (obj)).toString();
	//   22   40:aload_2         
	//   23   41:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   24   44:astore_3        
			if(expiryMonth <= 0)
	//*  25   45:aload_0         
	//*  26   46:getfield        #40  <Field int expiryMonth>
	//*  27   49:ifgt            61
			{
				obj = ((Object) (s));
	//   28   52:aload_3         
	//   29   53:astore_2        
				if(expiryYear <= 0)
					break label0;
	//   30   54:aload_0         
	//   31   55:getfield        #42  <Field int expiryYear>
	//   32   58:ifle            112
			}
			obj = ((Object) (new StringBuilder()));
	//   33   61:new             #123 <Class StringBuilder>
	//   34   64:dup             
	//   35   65:invokespecial   #124 <Method void StringBuilder()>
	//   36   68:astore_2        
			((StringBuilder) (obj)).append(s);
	//   37   69:aload_2         
	//   38   70:aload_3         
	//   39   71:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
			((StringBuilder) (obj)).append("  expiry:");
	//   41   75:aload_2         
	//   42   76:ldc1            #168 <String "  expiry:">
	//   43   78:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
			((StringBuilder) (obj)).append(expiryMonth);
	//   45   82:aload_2         
	//   46   83:aload_0         
	//   47   84:getfield        #40  <Field int expiryMonth>
	//   48   87:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   49   90:pop             
			((StringBuilder) (obj)).append("/");
	//   50   91:aload_2         
	//   51   92:ldc1            #170 <String "/">
	//   52   94:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   53   97:pop             
			((StringBuilder) (obj)).append(expiryYear);
	//   54   98:aload_2         
	//   55   99:aload_0         
	//   56  100:getfield        #42  <Field int expiryYear>
	//   57  103:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   58  106:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   59  107:aload_2         
	//   60  108:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   61  111:astore_2        
		}
		Object obj1 = obj;
	//   62  112:aload_2         
	//   63  113:astore_3        
		if(postalCode != null)
	//*  64  114:aload_0         
	//*  65  115:getfield        #74  <Field String postalCode>
	//*  66  118:ifnull          156
		{
			obj1 = ((Object) (new StringBuilder()));
	//   67  121:new             #123 <Class StringBuilder>
	//   68  124:dup             
	//   69  125:invokespecial   #124 <Method void StringBuilder()>
	//   70  128:astore_3        
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   71  129:aload_3         
	//   72  130:aload_2         
	//   73  131:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   74  134:pop             
			((StringBuilder) (obj1)).append("  postalCode:");
	//   75  135:aload_3         
	//   76  136:ldc1            #172 <String "  postalCode:">
	//   77  138:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   78  141:pop             
			((StringBuilder) (obj1)).append(postalCode);
	//   79  142:aload_3         
	//   80  143:aload_0         
	//   81  144:getfield        #74  <Field String postalCode>
	//   82  147:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   83  150:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   84  151:aload_3         
	//   85  152:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   86  155:astore_3        
		}
		obj = obj1;
	//   87  156:aload_3         
	//   88  157:astore_2        
		if(cardholderName != null)
	//*  89  158:aload_0         
	//*  90  159:getfield        #76  <Field String cardholderName>
	//*  91  162:ifnull          200
		{
			obj = ((Object) (new StringBuilder()));
	//   92  165:new             #123 <Class StringBuilder>
	//   93  168:dup             
	//   94  169:invokespecial   #124 <Method void StringBuilder()>
	//   95  172:astore_2        
			((StringBuilder) (obj)).append(((String) (obj1)));
	//   96  173:aload_2         
	//   97  174:aload_3         
	//   98  175:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   99  178:pop             
			((StringBuilder) (obj)).append("  cardholderName:");
	//  100  179:aload_2         
	//  101  180:ldc1            #174 <String "  cardholderName:">
	//  102  182:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  103  185:pop             
			((StringBuilder) (obj)).append(cardholderName);
	//  104  186:aload_2         
	//  105  187:aload_0         
	//  106  188:getfield        #76  <Field String cardholderName>
	//  107  191:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  108  194:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  109  195:aload_2         
	//  110  196:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  111  199:astore_2        
		}
		obj1 = obj;
	//  112  200:aload_2         
	//  113  201:astore_3        
		if(cvv != null)
	//* 114  202:aload_0         
	//* 115  203:getfield        #72  <Field String cvv>
	//* 116  206:ifnull          260
		{
			obj1 = ((Object) (new StringBuilder()));
	//  117  209:new             #123 <Class StringBuilder>
	//  118  212:dup             
	//  119  213:invokespecial   #124 <Method void StringBuilder()>
	//  120  216:astore_3        
			((StringBuilder) (obj1)).append(((String) (obj)));
	//  121  217:aload_3         
	//  122  218:aload_2         
	//  123  219:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  124  222:pop             
			((StringBuilder) (obj1)).append("  cvvLength:");
	//  125  223:aload_3         
	//  126  224:ldc1            #176 <String "  cvvLength:">
	//  127  226:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  128  229:pop             
			obj = ((Object) (cvv));
	//  129  230:aload_0         
	//  130  231:getfield        #72  <Field String cvv>
	//  131  234:astore_2        
			int i;
			if(obj != null)
	//* 132  235:aload_2         
	//* 133  236:ifnull          247
				i = ((String) (obj)).length();
	//  134  239:aload_2         
	//  135  240:invokevirtual   #108 <Method int String.length()>
	//  136  243:istore_1        
			else
	//* 137  244:goto            249
				i = 0;
	//  138  247:iconst_0        
	//  139  248:istore_1        
			((StringBuilder) (obj1)).append(i);
	//  140  249:aload_3         
	//  141  250:iload_1         
	//  142  251:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//  143  254:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  144  255:aload_3         
	//  145  256:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  146  259:astore_3        
		}
		obj = ((Object) (new StringBuilder()));
	//  147  260:new             #123 <Class StringBuilder>
	//  148  263:dup             
	//  149  264:invokespecial   #124 <Method void StringBuilder()>
	//  150  267:astore_2        
		((StringBuilder) (obj)).append(((String) (obj1)));
	//  151  268:aload_2         
	//  152  269:aload_3         
	//  153  270:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  154  273:pop             
		((StringBuilder) (obj)).append("}");
	//  155  274:aload_2         
	//  156  275:ldc1            #178 <String "}">
	//  157  277:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  158  280:pop             
		return ((StringBuilder) (obj)).toString();
	//  159  281:aload_2         
	//  160  282:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  161  285:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(cardNumber);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field String cardNumber>
	//    3    5:invokevirtual   #184 <Method void Parcel.writeString(String)>
		parcel.writeInt(expiryMonth);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field int expiryMonth>
	//    7   13:invokevirtual   #188 <Method void Parcel.writeInt(int)>
		parcel.writeInt(expiryYear);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field int expiryYear>
	//   11   21:invokevirtual   #188 <Method void Parcel.writeInt(int)>
		parcel.writeString(cvv);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field String cvv>
	//   15   29:invokevirtual   #184 <Method void Parcel.writeString(String)>
		parcel.writeString(postalCode);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #74  <Field String postalCode>
	//   19   37:invokevirtual   #184 <Method void Parcel.writeString(String)>
		parcel.writeString(cardholderName);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #76  <Field String cardholderName>
	//   23   45:invokevirtual   #184 <Method void Parcel.writeString(String)>
		parcel.writeString(scanId);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #58  <Field String scanId>
	//   27   53:invokevirtual   #184 <Method void Parcel.writeString(String)>
		parcel.writeInt(yoff);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #78  <Field int yoff>
	//   31   61:invokevirtual   #188 <Method void Parcel.writeInt(int)>
		parcel.writeIntArray(xoff);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #46  <Field int[] xoff>
	//   35   69:invokevirtual   #192 <Method void Parcel.writeIntArray(int[])>
	//   36   72:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new _cls1();
	public static final int EXPIRY_MAX_FUTURE_YEARS = 15;
	private static final String TAG = "CreditCard";
	public String cardNumber;
	public String cardholderName;
	public String cvv;
	public int expiryMonth;
	public int expiryYear;
	boolean flipped;
	public String postalCode;
	String scanId;
	int xoff[];
	int yoff;

	static 
	{
	//    0    0:new             #31  <Class CreditCard$1>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void CreditCard$1()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private class _cls1
		implements android.os.Parcelable.Creator
	{

		public CreditCard a(Parcel parcel)
		{
			return new CreditCard(parcel, ((_cls1) (null)));
		//    0    0:new             #15  <Class CreditCard>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #18  <Method void CreditCard(Parcel, CreditCard$1)>
		//    5    9:areturn         
		}

		public CreditCard[] a(int i)
		{
			return new CreditCard[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CreditCard[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #23  <Method CreditCard a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method CreditCard[] a(int)>
		//    3    5:areturn         
		}

		_cls1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #10  <Method void Object()>
		//    2    4:return          
		}
	}

}
