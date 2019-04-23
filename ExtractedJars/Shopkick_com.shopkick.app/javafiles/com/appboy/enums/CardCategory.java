// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import java.util.*;

public final class CardCategory extends Enum
{

	private CardCategory(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #77  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CardCategory get(String s)
	{
		return (CardCategory)a.get(((Object) (s.toUpperCase(Locale.US))));
	//    0    0:getstatic       #45  <Field Map a>
	//    1    3:aload_0         
	//    2    4:getstatic       #86  <Field Locale Locale.US>
	//    3    7:invokevirtual   #92  <Method String String.toUpperCase(Locale)>
	//    4   10:invokeinterface #95  <Method Object Map.get(Object)>
	//    5   15:checkcast       #2   <Class CardCategory>
	//    6   18:areturn         
	}

	public static EnumSet getAllCategories()
	{
		return EnumSet.allOf(com/appboy/enums/CardCategory);
	//    0    0:ldc1            #2   <Class CardCategory>
	//    1    2:invokestatic    #51  <Method EnumSet EnumSet.allOf(Class)>
	//    2    5:areturn         
	}

	public static CardCategory valueOf(String s)
	{
		return (CardCategory)Enum.valueOf(com/appboy/enums/CardCategory, s);
	//    0    0:ldc1            #2   <Class CardCategory>
	//    1    2:aload_0         
	//    2    3:invokestatic    #102 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CardCategory>
	//    4    9:areturn         
	}

	public static CardCategory[] values()
	{
		return (CardCategory[])((CardCategory []) (b)).clone();
	//    0    0:getstatic       #39  <Field CardCategory[] b>
	//    1    3:invokevirtual   #108 <Method Object _5B_Lcom.appboy.enums.CardCategory_3B_.clone()>
	//    2    6:checkcast       #105 <Class CardCategory[]>
	//    3    9:areturn         
	}

	public static final CardCategory ADVERTISING;
	public static final CardCategory ANNOUNCEMENTS;
	public static final CardCategory NEWS;
	public static final CardCategory NO_CATEGORY;
	public static final CardCategory SOCIAL;
	private static final Map a;
	private static final CardCategory b[];

	static 
	{
		ADVERTISING = new CardCategory("ADVERTISING", 0);
	//    0    0:new             #2   <Class CardCategory>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "ADVERTISING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void CardCategory(String, int)>
	//    5   10:putstatic       #25  <Field CardCategory ADVERTISING>
		ANNOUNCEMENTS = new CardCategory("ANNOUNCEMENTS", 1);
	//    6   13:new             #2   <Class CardCategory>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "ANNOUNCEMENTS">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void CardCategory(String, int)>
	//   11   23:putstatic       #28  <Field CardCategory ANNOUNCEMENTS>
		NEWS = new CardCategory("NEWS", 2);
	//   12   26:new             #2   <Class CardCategory>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "NEWS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void CardCategory(String, int)>
	//   17   36:putstatic       #31  <Field CardCategory NEWS>
		SOCIAL = new CardCategory("SOCIAL", 3);
	//   18   39:new             #2   <Class CardCategory>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "SOCIAL">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void CardCategory(String, int)>
	//   23   49:putstatic       #34  <Field CardCategory SOCIAL>
		NO_CATEGORY = new CardCategory("NO_CATEGORY", 4);
	//   24   52:new             #2   <Class CardCategory>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "NO_CATEGORY">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void CardCategory(String, int)>
	//   29   62:putstatic       #37  <Field CardCategory NO_CATEGORY>
		b = (new CardCategory[] {
			ADVERTISING, ANNOUNCEMENTS, NEWS, SOCIAL, NO_CATEGORY
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       CardCategory[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field CardCategory ADVERTISING>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field CardCategory ANNOUNCEMENTS>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field CardCategory NEWS>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field CardCategory SOCIAL>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field CardCategory NO_CATEGORY>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field CardCategory[] b>
		a = ((Map) (new HashMap()));
	//   53  102:new             #41  <Class HashMap>
	//   54  105:dup             
	//   55  106:invokespecial   #43  <Method void HashMap()>
	//   56  109:putstatic       #45  <Field Map a>
		CardCategory cardcategory;
		for(Iterator iterator = EnumSet.allOf(com/appboy/enums/CardCategory).iterator(); iterator.hasNext(); a.put(((Object) (cardcategory.toString())), ((Object) (cardcategory))))
	//*  57  112:ldc1            #2   <Class CardCategory>
	//*  58  114:invokestatic    #51  <Method EnumSet EnumSet.allOf(Class)>
	//*  59  117:invokevirtual   #55  <Method Iterator EnumSet.iterator()>
	//*  60  120:astore_0        
	//*  61  121:aload_0         
	//*  62  122:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*  63  127:ifeq            157
			cardcategory = (CardCategory)iterator.next();
	//   64  130:aload_0         
	//   65  131:invokeinterface #65  <Method Object Iterator.next()>
	//   66  136:checkcast       #2   <Class CardCategory>
	//   67  139:astore_1        

	//   68  140:getstatic       #45  <Field Map a>
	//   69  143:aload_1         
	//   70  144:invokevirtual   #69  <Method String toString()>
	//   71  147:aload_1         
	//   72  148:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   73  153:pop             
	//*  74  154:goto            121
	//*  75  157:return          
	}
}
