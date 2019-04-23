// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import io.card.payment.a.b;
import io.card.payment.a.c;
import java.util.*;

// Referenced classes of package io.card.payment:
//			f

public final class CardType extends Enum
{

	private CardType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #197 <Method void Enum(String, int)>
		name = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #199 <Field String name>
	//    7   11:return          
	}

	private static Pair a(String s, String s1)
	{
		String s2 = s1;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			s2 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return new Pair(((Object) (s)), ((Object) (s2)));
	//    6    8:new             #174 <Class Pair>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokespecial   #202 <Method void Pair(Object, Object)>
	//   11   17:areturn         
	}

	private static HashMap a()
	{
		return b;
	//    0    0:getstatic       #81  <Field HashMap b>
	//    1    3:areturn         
	}

	private static boolean a(String s, String s1, String s2)
	{
		int i = Math.min(s.length(), s1.length());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method int String.length()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #184 <Method int String.length()>
	//    4    8:invokestatic    #206 <Method int Math.min(int, int)>
	//    5   11:istore_3        
		int j = Math.min(s.length(), s2.length());
	//    6   12:aload_0         
	//    7   13:invokevirtual   #184 <Method int String.length()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #184 <Method int String.length()>
	//   10   20:invokestatic    #206 <Method int Math.min(int, int)>
	//   11   23:istore          4
		if(Integer.parseInt(s.substring(0, i)) < Integer.parseInt(s1.substring(0, i)))
	//*  12   25:aload_0         
	//*  13   26:iconst_0        
	//*  14   27:iload_3         
	//*  15   28:invokevirtual   #210 <Method String String.substring(int, int)>
	//*  16   31:invokestatic    #216 <Method int Integer.parseInt(String)>
	//*  17   34:aload_1         
	//*  18   35:iconst_0        
	//*  19   36:iload_3         
	//*  20   37:invokevirtual   #210 <Method String String.substring(int, int)>
	//*  21   40:invokestatic    #216 <Method int Integer.parseInt(String)>
	//*  22   43:icmpge          48
			return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
		return Integer.parseInt(s.substring(0, j)) <= Integer.parseInt(s2.substring(0, j));
	//   25   48:aload_0         
	//   26   49:iconst_0        
	//   27   50:iload           4
	//   28   52:invokevirtual   #210 <Method String String.substring(int, int)>
	//   29   55:invokestatic    #216 <Method int Integer.parseInt(String)>
	//   30   58:aload_2         
	//   31   59:iconst_0        
	//   32   60:iload           4
	//   33   62:invokevirtual   #210 <Method String String.substring(int, int)>
	//   34   65:invokestatic    #216 <Method int Integer.parseInt(String)>
	//   35   68:icmple          73
	//   36   71:iconst_0        
	//   37   72:ireturn         
	//   38   73:iconst_1        
	//   39   74:ireturn         
	}

	public static CardType fromCardNumber(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #224 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            11
			return UNKNOWN;
	//    3    7:getstatic       #66  <Field CardType UNKNOWN>
	//    4   10:areturn         
		HashSet hashset = new HashSet();
	//    5   11:new             #226 <Class HashSet>
	//    6   14:dup             
	//    7   15:invokespecial   #227 <Method void HashSet()>
	//    8   18:astore_1        
		Iterator iterator = a().entrySet().iterator();
	//    9   19:invokestatic    #147 <Method HashMap a()>
	//   10   22:invokevirtual   #151 <Method Set HashMap.entrySet()>
	//   11   25:invokeinterface #157 <Method Iterator Set.iterator()>
	//   12   30:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   13   31:aload_2         
	//   14   32:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//   15   37:ifeq            101
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   16   40:aload_2         
	//   17   41:invokeinterface #167 <Method Object Iterator.next()>
	//   18   46:checkcast       #169 <Class java.util.Map$Entry>
	//   19   49:astore_3        
			if(a(s, (String)((Pair)entry.getKey()).first, (String)((Pair)entry.getKey()).second))
	//*  20   50:aload_0         
	//*  21   51:aload_3         
	//*  22   52:invokeinterface #172 <Method Object java.util.Map$Entry.getKey()>
	//*  23   57:checkcast       #174 <Class Pair>
	//*  24   60:getfield        #178 <Field Object Pair.first>
	//*  25   63:checkcast       #180 <Class String>
	//*  26   66:aload_3         
	//*  27   67:invokeinterface #172 <Method Object java.util.Map$Entry.getKey()>
	//*  28   72:checkcast       #174 <Class Pair>
	//*  29   75:getfield        #193 <Field Object Pair.second>
	//*  30   78:checkcast       #180 <Class String>
	//*  31   81:invokestatic    #229 <Method boolean a(String, String, String)>
	//*  32   84:ifeq            31
				hashset.add(entry.getValue());
	//   33   87:aload_1         
	//   34   88:aload_3         
	//   35   89:invokeinterface #232 <Method Object java.util.Map$Entry.getValue()>
	//   36   94:invokevirtual   #236 <Method boolean HashSet.add(Object)>
	//   37   97:pop             
		} while(true);
	//   38   98:goto            31
		if(hashset.size() > 1)
	//*  39  101:aload_1         
	//*  40  102:invokevirtual   #239 <Method int HashSet.size()>
	//*  41  105:iconst_1        
	//*  42  106:icmple          113
			return INSUFFICIENT_DIGITS;
	//   43  109:getstatic       #71  <Field CardType INSUFFICIENT_DIGITS>
	//   44  112:areturn         
		if(hashset.size() == 1)
	//*  45  113:aload_1         
	//*  46  114:invokevirtual   #239 <Method int HashSet.size()>
	//*  47  117:iconst_1        
	//*  48  118:icmpne          134
			return (CardType)hashset.iterator().next();
	//   49  121:aload_1         
	//   50  122:invokevirtual   #240 <Method Iterator HashSet.iterator()>
	//   51  125:invokeinterface #167 <Method Object Iterator.next()>
	//   52  130:checkcast       #2   <Class CardType>
	//   53  133:areturn         
		else
			return UNKNOWN;
	//   54  134:getstatic       #66  <Field CardType UNKNOWN>
	//   55  137:areturn         
	}

	public static CardType fromString(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return UNKNOWN;
	//    2    4:getstatic       #66  <Field CardType UNKNOWN>
	//    3    7:areturn         
		CardType acardtype[] = values();
	//    4    8:invokestatic    #245 <Method CardType[] values()>
	//    5   11:astore_3        
		int j = acardtype.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          68
		{
			CardType cardtype = acardtype[i];
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:astore          4
			if(cardtype != UNKNOWN && cardtype != INSUFFICIENT_DIGITS && s.equalsIgnoreCase(cardtype.toString()))
	//*  18   27:aload           4
	//*  19   29:getstatic       #66  <Field CardType UNKNOWN>
	//*  20   32:if_acmpeq       61
	//*  21   35:aload           4
	//*  22   37:getstatic       #71  <Field CardType INSUFFICIENT_DIGITS>
	//*  23   40:if_acmpne       46
	//*  24   43:goto            61
	//*  25   46:aload_0         
	//*  26   47:aload           4
	//*  27   49:invokevirtual   #249 <Method String toString()>
	//*  28   52:invokevirtual   #253 <Method boolean String.equalsIgnoreCase(String)>
	//*  29   55:ifeq            61
				return cardtype;
	//   30   58:aload           4
	//   31   60:areturn         
		}

	//   32   61:iload_1         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_1        
	//*  36   65:goto            17
		return UNKNOWN;
	//   37   68:getstatic       #66  <Field CardType UNKNOWN>
	//   38   71:areturn         
	}

	public static CardType valueOf(String s)
	{
		return (CardType)Enum.valueOf(io/card/payment/CardType, s);
	//    0    0:ldc1            #2   <Class CardType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #257 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CardType>
	//    4    9:areturn         
	}

	public static CardType[] values()
	{
		return (CardType[])((CardType []) (c)).clone();
	//    0    0:getstatic       #73  <Field CardType[] c>
	//    1    3:invokevirtual   #261 <Method Object _5B_Lio.card.payment.CardType_3B_.clone()>
	//    2    6:checkcast       #258 <Class CardType[]>
	//    3    9:areturn         
	}

	public int cvvLength()
	{
		switch(f.a[ordinal()])
	//*   0    0:getstatic       #267 <Field int[] f.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #270 <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 7: default 52
	//	               1 56
	//	               2 54
	//	               3 54
	//	               4 54
	//	               5 54
	//	               6 54
	//	               7 54
		default:
			return -1;
	//    5   52:iconst_m1       
	//    6   53:ireturn         

		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
			return 3;
	//    7   54:iconst_3        
	//    8   55:ireturn         

		case 1: // '\001'
			return 4;
	//    9   56:iconst_4        
	//   10   57:ireturn         
		}
	}

	public String getDisplayName(String s)
	{
		switch(f.a[ordinal()])
	//*   0    0:getstatic       #267 <Field int[] f.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #270 <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 7: default 52
	//	               1 94
	//	               2 86
	//	               3 86
	//	               4 78
	//	               5 70
	//	               6 62
	//	               7 54
		default:
			return null;
	//    5   52:aconst_null     
	//    6   53:areturn         

		case 7: // '\007'
			return io.card.payment.a.b.a(c.g, s);
	//    7   54:getstatic       #278 <Field c c.g>
	//    8   57:aload_1         
	//    9   58:invokestatic    #283 <Method String b.a(c, String)>
	//   10   61:areturn         

		case 6: // '\006'
			return io.card.payment.a.b.a(c.f, s);
	//   11   62:getstatic       #286 <Field c c.f>
	//   12   65:aload_1         
	//   13   66:invokestatic    #283 <Method String b.a(c, String)>
	//   14   69:areturn         

		case 5: // '\005'
			return io.card.payment.a.b.a(c.e, s);
	//   15   70:getstatic       #289 <Field c c.e>
	//   16   73:aload_1         
	//   17   74:invokestatic    #283 <Method String b.a(c, String)>
	//   18   77:areturn         

		case 4: // '\004'
			return io.card.payment.a.b.a(c.d, s);
	//   19   78:getstatic       #292 <Field c c.d>
	//   20   81:aload_1         
	//   21   82:invokestatic    #283 <Method String b.a(c, String)>
	//   22   85:areturn         

		case 2: // '\002'
		case 3: // '\003'
			return io.card.payment.a.b.a(c.c, s);
	//   23   86:getstatic       #294 <Field c c.c>
	//   24   89:aload_1         
	//   25   90:invokestatic    #283 <Method String b.a(c, String)>
	//   26   93:areturn         

		case 1: // '\001'
			return io.card.payment.a.b.a(c.b, s);
	//   27   94:getstatic       #296 <Field c c.b>
	//   28   97:aload_1         
	//   29   98:invokestatic    #283 <Method String b.a(c, String)>
	//   30  101:areturn         
		}
	}

	public Bitmap imageBitmap(Context context)
	{
		int i = f.a[ordinal()];
	//    0    0:getstatic       #267 <Field int[] f.a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #270 <Method int ordinal()>
	//    3    7:iaload          
	//    4    8:istore_2        
		if(i != 7)
	//*   5    9:iload_2         
	//*   6   10:bipush          7
	//*   7   12:icmpeq          85
			switch(i)
	//*   8   15:iload_2         
			{
	//*   9   16:tableswitch     1 5: default 52
	//	               1 78
	//	               2 71
	//	               3 71
	//	               4 64
	//	               5 57
			default:
				i = -1;
	//   10   52:iconst_m1       
	//   11   53:istore_2        
				break;

	//*  12   54:goto            89
			case 5: // '\005'
				i = R.drawable.cio_ic_mastercard;
	//   13   57:getstatic       #303 <Field int R$drawable.cio_ic_mastercard>
	//   14   60:istore_2        
				break;

	//*  15   61:goto            89
			case 4: // '\004'
				i = R.drawable.cio_ic_jcb;
	//   16   64:getstatic       #306 <Field int R$drawable.cio_ic_jcb>
	//   17   67:istore_2        
				break;

	//*  18   68:goto            89
			case 2: // '\002'
			case 3: // '\003'
				i = R.drawable.cio_ic_discover;
	//   19   71:getstatic       #309 <Field int R$drawable.cio_ic_discover>
	//   20   74:istore_2        
				break;

	//*  21   75:goto            89
			case 1: // '\001'
				i = R.drawable.cio_ic_amex;
	//   22   78:getstatic       #312 <Field int R$drawable.cio_ic_amex>
	//   23   81:istore_2        
				break;
			}
		else
	//*  24   82:goto            89
			i = R.drawable.cio_ic_visa;
	//   25   85:getstatic       #315 <Field int R$drawable.cio_ic_visa>
	//   26   88:istore_2        
		if(i != -1)
	//*  27   89:iload_2         
	//*  28   90:iconst_m1       
	//*  29   91:icmpeq          103
			return BitmapFactory.decodeResource(context.getResources(), i);
	//   30   94:aload_1         
	//   31   95:invokevirtual   #321 <Method android.content.res.Resources Context.getResources()>
	//   32   98:iload_2         
	//   33   99:invokestatic    #327 <Method Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
	//   34  102:areturn         
		else
			return null;
	//   35  103:aconst_null     
	//   36  104:areturn         
	}

	public int numberLength()
	{
		switch(f.a[ordinal()])
	//*   0    0:getstatic       #267 <Field int[] f.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #270 <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 8: default 56
	//	               1 68
	//	               2 65
	//	               3 62
	//	               4 62
	//	               5 62
	//	               6 62
	//	               7 62
	//	               8 58
		default:
			return -1;
	//    5   56:iconst_m1       
	//    6   57:ireturn         

		case 8: // '\b'
			return a;
	//    7   58:getstatic       #75  <Field int a>
	//    8   61:ireturn         

		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
			return 16;
	//    9   62:bipush          16
	//   10   64:ireturn         

		case 2: // '\002'
			return 14;
	//   11   65:bipush          14
	//   12   67:ireturn         

		case 1: // '\001'
			return 15;
	//   13   68:bipush          15
	//   14   70:ireturn         
		}
	}

	public String toString()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field String name>
	//    2    4:areturn         
	}

	public static final CardType AMEX;
	public static final CardType DINERSCLUB;
	public static final CardType DISCOVER;
	public static final CardType INSUFFICIENT_DIGITS;
	public static final CardType JCB;
	public static final CardType MAESTRO;
	public static final CardType MASTERCARD;
	public static final CardType UNKNOWN;
	public static final CardType VISA;
	private static int a;
	private static HashMap b;
	private static final CardType c[];
	public final String name;

	static 
	{
		AMEX = new CardType("AMEX", 0, "AmEx");
	//    0    0:new             #2   <Class CardType>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "AMEX">
	//    3    6:iconst_0        
	//    4    7:ldc1            #27  <String "AmEx">
	//    5    9:invokespecial   #31  <Method void CardType(String, int, String)>
	//    6   12:putstatic       #33  <Field CardType AMEX>
		DINERSCLUB = new CardType("DINERSCLUB", 1, "DinersClub");
	//    7   15:new             #2   <Class CardType>
	//    8   18:dup             
	//    9   19:ldc1            #34  <String "DINERSCLUB">
	//   10   21:iconst_1        
	//   11   22:ldc1            #36  <String "DinersClub">
	//   12   24:invokespecial   #31  <Method void CardType(String, int, String)>
	//   13   27:putstatic       #38  <Field CardType DINERSCLUB>
		DISCOVER = new CardType("DISCOVER", 2, "Discover");
	//   14   30:new             #2   <Class CardType>
	//   15   33:dup             
	//   16   34:ldc1            #39  <String "DISCOVER">
	//   17   36:iconst_2        
	//   18   37:ldc1            #41  <String "Discover">
	//   19   39:invokespecial   #31  <Method void CardType(String, int, String)>
	//   20   42:putstatic       #43  <Field CardType DISCOVER>
		JCB = new CardType("JCB", 3, "JCB");
	//   21   45:new             #2   <Class CardType>
	//   22   48:dup             
	//   23   49:ldc1            #44  <String "JCB">
	//   24   51:iconst_3        
	//   25   52:ldc1            #44  <String "JCB">
	//   26   54:invokespecial   #31  <Method void CardType(String, int, String)>
	//   27   57:putstatic       #46  <Field CardType JCB>
		MASTERCARD = new CardType("MASTERCARD", 4, "MasterCard");
	//   28   60:new             #2   <Class CardType>
	//   29   63:dup             
	//   30   64:ldc1            #47  <String "MASTERCARD">
	//   31   66:iconst_4        
	//   32   67:ldc1            #49  <String "MasterCard">
	//   33   69:invokespecial   #31  <Method void CardType(String, int, String)>
	//   34   72:putstatic       #51  <Field CardType MASTERCARD>
		VISA = new CardType("VISA", 5, "Visa");
	//   35   75:new             #2   <Class CardType>
	//   36   78:dup             
	//   37   79:ldc1            #52  <String "VISA">
	//   38   81:iconst_5        
	//   39   82:ldc1            #54  <String "Visa">
	//   40   84:invokespecial   #31  <Method void CardType(String, int, String)>
	//   41   87:putstatic       #56  <Field CardType VISA>
		MAESTRO = new CardType("MAESTRO", 6, "Maestro");
	//   42   90:new             #2   <Class CardType>
	//   43   93:dup             
	//   44   94:ldc1            #57  <String "MAESTRO">
	//   45   96:bipush          6
	//   46   98:ldc1            #59  <String "Maestro">
	//   47  100:invokespecial   #31  <Method void CardType(String, int, String)>
	//   48  103:putstatic       #61  <Field CardType MAESTRO>
		UNKNOWN = new CardType("UNKNOWN", 7, "Unknown");
	//   49  106:new             #2   <Class CardType>
	//   50  109:dup             
	//   51  110:ldc1            #62  <String "UNKNOWN">
	//   52  112:bipush          7
	//   53  114:ldc1            #64  <String "Unknown">
	//   54  116:invokespecial   #31  <Method void CardType(String, int, String)>
	//   55  119:putstatic       #66  <Field CardType UNKNOWN>
		INSUFFICIENT_DIGITS = new CardType("INSUFFICIENT_DIGITS", 8, "More digits required");
	//   56  122:new             #2   <Class CardType>
	//   57  125:dup             
	//   58  126:ldc1            #67  <String "INSUFFICIENT_DIGITS">
	//   59  128:bipush          8
	//   60  130:ldc1            #69  <String "More digits required">
	//   61  132:invokespecial   #31  <Method void CardType(String, int, String)>
	//   62  135:putstatic       #71  <Field CardType INSUFFICIENT_DIGITS>
		c = (new CardType[] {
			AMEX, DINERSCLUB, DISCOVER, JCB, MASTERCARD, VISA, MAESTRO, UNKNOWN, INSUFFICIENT_DIGITS
		});
	//   63  138:bipush          9
	//   64  140:anewarray       CardType[]
	//   65  143:dup             
	//   66  144:iconst_0        
	//   67  145:getstatic       #33  <Field CardType AMEX>
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_1        
	//   71  151:getstatic       #38  <Field CardType DINERSCLUB>
	//   72  154:aastore         
	//   73  155:dup             
	//   74  156:iconst_2        
	//   75  157:getstatic       #43  <Field CardType DISCOVER>
	//   76  160:aastore         
	//   77  161:dup             
	//   78  162:iconst_3        
	//   79  163:getstatic       #46  <Field CardType JCB>
	//   80  166:aastore         
	//   81  167:dup             
	//   82  168:iconst_4        
	//   83  169:getstatic       #51  <Field CardType MASTERCARD>
	//   84  172:aastore         
	//   85  173:dup             
	//   86  174:iconst_5        
	//   87  175:getstatic       #56  <Field CardType VISA>
	//   88  178:aastore         
	//   89  179:dup             
	//   90  180:bipush          6
	//   91  182:getstatic       #61  <Field CardType MAESTRO>
	//   92  185:aastore         
	//   93  186:dup             
	//   94  187:bipush          7
	//   95  189:getstatic       #66  <Field CardType UNKNOWN>
	//   96  192:aastore         
	//   97  193:dup             
	//   98  194:bipush          8
	//   99  196:getstatic       #71  <Field CardType INSUFFICIENT_DIGITS>
	//  100  199:aastore         
	//  101  200:putstatic       #73  <Field CardType[] c>
		a = 1;
	//  102  203:iconst_1        
	//  103  204:putstatic       #75  <Field int a>
		b = new HashMap();
	//  104  207:new             #77  <Class HashMap>
	//  105  210:dup             
	//  106  211:invokespecial   #79  <Method void HashMap()>
	//  107  214:putstatic       #81  <Field HashMap b>
		b.put(((Object) (a("2221", "2720"))), ((Object) (MASTERCARD)));
	//  108  217:getstatic       #81  <Field HashMap b>
	//  109  220:ldc1            #83  <String "2221">
	//  110  222:ldc1            #85  <String "2720">
	//  111  224:invokestatic    #88  <Method Pair a(String, String)>
	//  112  227:getstatic       #51  <Field CardType MASTERCARD>
	//  113  230:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  114  233:pop             
		b.put(((Object) (a("300", "305"))), ((Object) (DINERSCLUB)));
	//  115  234:getstatic       #81  <Field HashMap b>
	//  116  237:ldc1            #94  <String "300">
	//  117  239:ldc1            #96  <String "305">
	//  118  241:invokestatic    #88  <Method Pair a(String, String)>
	//  119  244:getstatic       #38  <Field CardType DINERSCLUB>
	//  120  247:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  121  250:pop             
		b.put(((Object) (a("309", ((String) (null))))), ((Object) (DINERSCLUB)));
	//  122  251:getstatic       #81  <Field HashMap b>
	//  123  254:ldc1            #98  <String "309">
	//  124  256:aconst_null     
	//  125  257:invokestatic    #88  <Method Pair a(String, String)>
	//  126  260:getstatic       #38  <Field CardType DINERSCLUB>
	//  127  263:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  128  266:pop             
		b.put(((Object) (a("34", ((String) (null))))), ((Object) (AMEX)));
	//  129  267:getstatic       #81  <Field HashMap b>
	//  130  270:ldc1            #100 <String "34">
	//  131  272:aconst_null     
	//  132  273:invokestatic    #88  <Method Pair a(String, String)>
	//  133  276:getstatic       #33  <Field CardType AMEX>
	//  134  279:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  135  282:pop             
		b.put(((Object) (a("3528", "3589"))), ((Object) (JCB)));
	//  136  283:getstatic       #81  <Field HashMap b>
	//  137  286:ldc1            #102 <String "3528">
	//  138  288:ldc1            #104 <String "3589">
	//  139  290:invokestatic    #88  <Method Pair a(String, String)>
	//  140  293:getstatic       #46  <Field CardType JCB>
	//  141  296:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  142  299:pop             
		b.put(((Object) (a("36", ((String) (null))))), ((Object) (DINERSCLUB)));
	//  143  300:getstatic       #81  <Field HashMap b>
	//  144  303:ldc1            #106 <String "36">
	//  145  305:aconst_null     
	//  146  306:invokestatic    #88  <Method Pair a(String, String)>
	//  147  309:getstatic       #38  <Field CardType DINERSCLUB>
	//  148  312:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  149  315:pop             
		b.put(((Object) (a("37", ((String) (null))))), ((Object) (AMEX)));
	//  150  316:getstatic       #81  <Field HashMap b>
	//  151  319:ldc1            #108 <String "37">
	//  152  321:aconst_null     
	//  153  322:invokestatic    #88  <Method Pair a(String, String)>
	//  154  325:getstatic       #33  <Field CardType AMEX>
	//  155  328:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  156  331:pop             
		b.put(((Object) (a("38", "39"))), ((Object) (DINERSCLUB)));
	//  157  332:getstatic       #81  <Field HashMap b>
	//  158  335:ldc1            #110 <String "38">
	//  159  337:ldc1            #112 <String "39">
	//  160  339:invokestatic    #88  <Method Pair a(String, String)>
	//  161  342:getstatic       #38  <Field CardType DINERSCLUB>
	//  162  345:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  163  348:pop             
		b.put(((Object) (a("4", ((String) (null))))), ((Object) (VISA)));
	//  164  349:getstatic       #81  <Field HashMap b>
	//  165  352:ldc1            #114 <String "4">
	//  166  354:aconst_null     
	//  167  355:invokestatic    #88  <Method Pair a(String, String)>
	//  168  358:getstatic       #56  <Field CardType VISA>
	//  169  361:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  170  364:pop             
		b.put(((Object) (a("50", ((String) (null))))), ((Object) (MAESTRO)));
	//  171  365:getstatic       #81  <Field HashMap b>
	//  172  368:ldc1            #116 <String "50">
	//  173  370:aconst_null     
	//  174  371:invokestatic    #88  <Method Pair a(String, String)>
	//  175  374:getstatic       #61  <Field CardType MAESTRO>
	//  176  377:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  177  380:pop             
		b.put(((Object) (a("51", "55"))), ((Object) (MASTERCARD)));
	//  178  381:getstatic       #81  <Field HashMap b>
	//  179  384:ldc1            #118 <String "51">
	//  180  386:ldc1            #120 <String "55">
	//  181  388:invokestatic    #88  <Method Pair a(String, String)>
	//  182  391:getstatic       #51  <Field CardType MASTERCARD>
	//  183  394:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  184  397:pop             
		b.put(((Object) (a("56", "59"))), ((Object) (MAESTRO)));
	//  185  398:getstatic       #81  <Field HashMap b>
	//  186  401:ldc1            #122 <String "56">
	//  187  403:ldc1            #124 <String "59">
	//  188  405:invokestatic    #88  <Method Pair a(String, String)>
	//  189  408:getstatic       #61  <Field CardType MAESTRO>
	//  190  411:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  191  414:pop             
		b.put(((Object) (a("6011", ((String) (null))))), ((Object) (DISCOVER)));
	//  192  415:getstatic       #81  <Field HashMap b>
	//  193  418:ldc1            #126 <String "6011">
	//  194  420:aconst_null     
	//  195  421:invokestatic    #88  <Method Pair a(String, String)>
	//  196  424:getstatic       #43  <Field CardType DISCOVER>
	//  197  427:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  198  430:pop             
		b.put(((Object) (a("61", ((String) (null))))), ((Object) (MAESTRO)));
	//  199  431:getstatic       #81  <Field HashMap b>
	//  200  434:ldc1            #128 <String "61">
	//  201  436:aconst_null     
	//  202  437:invokestatic    #88  <Method Pair a(String, String)>
	//  203  440:getstatic       #61  <Field CardType MAESTRO>
	//  204  443:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  205  446:pop             
		b.put(((Object) (a("62", ((String) (null))))), ((Object) (DISCOVER)));
	//  206  447:getstatic       #81  <Field HashMap b>
	//  207  450:ldc1            #130 <String "62">
	//  208  452:aconst_null     
	//  209  453:invokestatic    #88  <Method Pair a(String, String)>
	//  210  456:getstatic       #43  <Field CardType DISCOVER>
	//  211  459:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  212  462:pop             
		b.put(((Object) (a("63", ((String) (null))))), ((Object) (MAESTRO)));
	//  213  463:getstatic       #81  <Field HashMap b>
	//  214  466:ldc1            #132 <String "63">
	//  215  468:aconst_null     
	//  216  469:invokestatic    #88  <Method Pair a(String, String)>
	//  217  472:getstatic       #61  <Field CardType MAESTRO>
	//  218  475:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  219  478:pop             
		b.put(((Object) (a("644", "649"))), ((Object) (DISCOVER)));
	//  220  479:getstatic       #81  <Field HashMap b>
	//  221  482:ldc1            #134 <String "644">
	//  222  484:ldc1            #136 <String "649">
	//  223  486:invokestatic    #88  <Method Pair a(String, String)>
	//  224  489:getstatic       #43  <Field CardType DISCOVER>
	//  225  492:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  226  495:pop             
		b.put(((Object) (a("65", ((String) (null))))), ((Object) (DISCOVER)));
	//  227  496:getstatic       #81  <Field HashMap b>
	//  228  499:ldc1            #138 <String "65">
	//  229  501:aconst_null     
	//  230  502:invokestatic    #88  <Method Pair a(String, String)>
	//  231  505:getstatic       #43  <Field CardType DISCOVER>
	//  232  508:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  233  511:pop             
		b.put(((Object) (a("66", "69"))), ((Object) (MAESTRO)));
	//  234  512:getstatic       #81  <Field HashMap b>
	//  235  515:ldc1            #140 <String "66">
	//  236  517:ldc1            #142 <String "69">
	//  237  519:invokestatic    #88  <Method Pair a(String, String)>
	//  238  522:getstatic       #61  <Field CardType MAESTRO>
	//  239  525:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  240  528:pop             
		b.put(((Object) (a("88", ((String) (null))))), ((Object) (DISCOVER)));
	//  241  529:getstatic       #81  <Field HashMap b>
	//  242  532:ldc1            #144 <String "88">
	//  243  534:aconst_null     
	//  244  535:invokestatic    #88  <Method Pair a(String, String)>
	//  245  538:getstatic       #43  <Field CardType DISCOVER>
	//  246  541:invokevirtual   #92  <Method Object HashMap.put(Object, Object)>
	//  247  544:pop             
		Iterator iterator = a().entrySet().iterator();
	//  248  545:invokestatic    #147 <Method HashMap a()>
	//  249  548:invokevirtual   #151 <Method Set HashMap.entrySet()>
	//  250  551:invokeinterface #157 <Method Iterator Set.iterator()>
	//  251  556:astore_0        
		do
		{
			if(!iterator.hasNext())
				break;
	//  252  557:aload_0         
	//  253  558:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//  254  563:ifeq            648
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//  255  566:aload_0         
	//  256  567:invokeinterface #167 <Method Object Iterator.next()>
	//  257  572:checkcast       #169 <Class java.util.Map$Entry>
	//  258  575:astore_1        
			a = Math.max(a, ((String)((Pair)entry.getKey()).first).length());
	//  259  576:getstatic       #75  <Field int a>
	//  260  579:aload_1         
	//  261  580:invokeinterface #172 <Method Object java.util.Map$Entry.getKey()>
	//  262  585:checkcast       #174 <Class Pair>
	//  263  588:getfield        #178 <Field Object Pair.first>
	//  264  591:checkcast       #180 <Class String>
	//  265  594:invokevirtual   #184 <Method int String.length()>
	//  266  597:invokestatic    #190 <Method int Math.max(int, int)>
	//  267  600:putstatic       #75  <Field int a>
			if(((Pair)entry.getKey()).second != null)
	//* 268  603:aload_1         
	//* 269  604:invokeinterface #172 <Method Object java.util.Map$Entry.getKey()>
	//* 270  609:checkcast       #174 <Class Pair>
	//* 271  612:getfield        #193 <Field Object Pair.second>
	//* 272  615:ifnull          557
				a = Math.max(a, ((String)((Pair)entry.getKey()).second).length());
	//  273  618:getstatic       #75  <Field int a>
	//  274  621:aload_1         
	//  275  622:invokeinterface #172 <Method Object java.util.Map$Entry.getKey()>
	//  276  627:checkcast       #174 <Class Pair>
	//  277  630:getfield        #193 <Field Object Pair.second>
	//  278  633:checkcast       #180 <Class String>
	//  279  636:invokevirtual   #184 <Method int String.length()>
	//  280  639:invokestatic    #190 <Method int Math.max(int, int)>
	//  281  642:putstatic       #75  <Field int a>
		} while(true);
	//  282  645:goto            557
	//* 283  648:return          
	}
}
