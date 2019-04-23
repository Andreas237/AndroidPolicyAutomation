// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.events;

import com.appboy.enums.CardCategory;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import java.util.*;

public final class FeedUpdatedEvent
{

	public FeedUpdatedEvent(List list, String s, boolean flag, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		c = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #31  <Field String c>
		d = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #33  <Field boolean d>
		if(list != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          30
		{
			b = list;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #35  <Field List b>
			e = l;
	//   13   23:aload_0         
	//   14   24:lload           4
	//   15   26:putfield        #37  <Field long e>
			return;
	//   16   29:return          
		} else
		{
			throw new NullPointerException();
	//   17   30:new             #39  <Class NullPointerException>
	//   18   33:dup             
	//   19   34:invokespecial   #40  <Method void NullPointerException()>
	//   20   37:athrow          
		}
	}

	public int getCardCount()
	{
		return getCardCount(CardCategory.getAllCategories());
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method EnumSet CardCategory.getAllCategories()>
	//    2    4:invokevirtual   #53  <Method int getCardCount(EnumSet)>
	//    3    7:ireturn         
	}

	public int getCardCount(CardCategory cardcategory)
	{
		return getCardCount(EnumSet.of(((Enum) (cardcategory))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #60  <Method EnumSet EnumSet.of(Enum)>
	//    3    5:invokevirtual   #53  <Method int getCardCount(EnumSet)>
	//    4    8:ireturn         
	}

	public int getCardCount(EnumSet enumset)
	{
		if(enumset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       23
		{
			AppboyLogger.i(a, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
	//    2    4:getstatic       #24  <Field String a>
	//    3    7:ldc1            #62  <String "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.">
	//    4    9:invokestatic    #66  <Method int AppboyLogger.i(String, String)>
	//    5   12:pop             
			return b.size();
	//    6   13:aload_0         
	//    7   14:getfield        #35  <Field List b>
	//    8   17:invokeinterface #71  <Method int List.size()>
	//    9   22:ireturn         
		}
		if(enumset.isEmpty())
	//*  10   23:aload_1         
	//*  11   24:invokevirtual   #75  <Method boolean EnumSet.isEmpty()>
	//*  12   27:ifeq            41
		{
			AppboyLogger.w(a, "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
	//   13   30:getstatic       #24  <Field String a>
	//   14   33:ldc1            #77  <String "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.">
	//   15   35:invokestatic    #80  <Method int AppboyLogger.w(String, String)>
	//   16   38:pop             
			return 0;
	//   17   39:iconst_0        
	//   18   40:ireturn         
		} else
		{
			return getFeedCards(enumset).size();
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #84  <Method List getFeedCards(EnumSet)>
	//   22   46:invokeinterface #71  <Method int List.size()>
	//   23   51:ireturn         
		}
	}

	public List getFeedCards()
	{
		return getFeedCards(CardCategory.getAllCategories());
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method EnumSet CardCategory.getAllCategories()>
	//    2    4:invokevirtual   #84  <Method List getFeedCards(EnumSet)>
	//    3    7:areturn         
	}

	public List getFeedCards(CardCategory cardcategory)
	{
		return getFeedCards(EnumSet.of(((Enum) (cardcategory))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #60  <Method EnumSet EnumSet.of(Enum)>
	//    3    5:invokevirtual   #84  <Method List getFeedCards(EnumSet)>
	//    4    8:areturn         
	}

	public List getFeedCards(EnumSet enumset)
	{
		Object obj;
		EnumSet enumset1;
		obj = ((Object) (enumset));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(enumset != null)
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_1         
	//    3    3:ifnonnull       23
		enumset1 = enumset;
	//    4    6:aload_1         
	//    5    7:astore_3        
		AppboyLogger.i(a, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
	//    6    8:getstatic       #24  <Field String a>
	//    7   11:ldc1            #93  <String "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.">
	//    8   13:invokestatic    #66  <Method int AppboyLogger.i(String, String)>
	//    9   16:pop             
		enumset1 = enumset;
	//   10   17:aload_1         
	//   11   18:astore_3        
		obj = ((Object) (CardCategory.getAllCategories()));
	//   12   19:invokestatic    #50  <Method EnumSet CardCategory.getAllCategories()>
	//   13   22:astore_2        
		enumset1 = ((EnumSet) (obj));
	//   14   23:aload_2         
	//   15   24:astore_3        
		if(!((EnumSet) (obj)).isEmpty())
			break MISSING_BLOCK_LABEL_53;
	//   16   25:aload_2         
	//   17   26:invokevirtual   #75  <Method boolean EnumSet.isEmpty()>
	//   18   29:ifeq            53
		enumset1 = ((EnumSet) (obj));
	//   19   32:aload_2         
	//   20   33:astore_3        
		AppboyLogger.w(a, "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
	//   21   34:getstatic       #24  <Field String a>
	//   22   37:ldc1            #95  <String "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().">
	//   23   39:invokestatic    #80  <Method int AppboyLogger.w(String, String)>
	//   24   42:pop             
		enumset1 = ((EnumSet) (obj));
	//   25   43:aload_2         
	//   26   44:astore_3        
		Iterator iterator;
		Card card;
		try
		{
			return ((List) (new ArrayList()));
	//   27   45:new             #97  <Class ArrayList>
	//   28   48:dup             
	//   29   49:invokespecial   #98  <Method void ArrayList()>
	//   30   52:areturn         
		}
	//*  31   53:aload_2         
	//*  32   54:astore_3        
	//*  33   55:new             #97  <Class ArrayList>
	//*  34   58:dup             
	//*  35   59:invokespecial   #98  <Method void ArrayList()>
	//*  36   62:astore_1        
	//*  37   63:aload_2         
	//*  38   64:astore_3        
	//*  39   65:aload_0         
	//*  40   66:getfield        #35  <Field List b>
	//*  41   69:invokeinterface #102 <Method Iterator List.iterator()>
	//*  42   74:astore          4
	//*  43   76:aload_2         
	//*  44   77:astore_3        
	//*  45   78:aload           4
	//*  46   80:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//*  47   85:ifeq            137
	//*  48   88:aload_2         
	//*  49   89:astore_3        
	//*  50   90:aload           4
	//*  51   92:invokeinterface #111 <Method Object Iterator.next()>
	//*  52   97:checkcast       #113 <Class Card>
	//*  53  100:astore          5
	//*  54  102:aload_2         
	//*  55  103:astore_3        
	//*  56  104:aload           5
	//*  57  106:aload_2         
	//*  58  107:invokevirtual   #117 <Method boolean Card.isInCategorySet(EnumSet)>
	//*  59  110:ifeq            76
	//*  60  113:aload_2         
	//*  61  114:astore_3        
	//*  62  115:aload           5
	//*  63  117:invokevirtual   #120 <Method boolean Card.isExpired()>
	//*  64  120:ifne            76
	//*  65  123:aload_2         
	//*  66  124:astore_3        
	//*  67  125:aload_1         
	//*  68  126:aload           5
	//*  69  128:invokeinterface #124 <Method boolean List.add(Object)>
	//*  70  133:pop             
	//*  71  134:goto            76
	//*  72  137:aload_1         
	//*  73  138:areturn         
		// Misplaced declaration of an exception variable
		catch(EnumSet enumset)
	//*  74  139:astore_1        
		{
			obj = ((Object) (a));
	//   75  140:getstatic       #24  <Field String a>
	//   76  143:astore_2        
		}
		break MISSING_BLOCK_LABEL_144;
		enumset1 = ((EnumSet) (obj));
		enumset = ((EnumSet) (new ArrayList()));
		enumset1 = ((EnumSet) (obj));
		iterator = b.iterator();
_L2:
		enumset1 = ((EnumSet) (obj));
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
		enumset1 = ((EnumSet) (obj));
		card = (Card)iterator.next();
		enumset1 = ((EnumSet) (obj));
		if(!card.isInCategorySet(((EnumSet) (obj))))
			continue; /* Loop/switch isn't completed */
		enumset1 = ((EnumSet) (obj));
		if(card.isExpired())
			continue; /* Loop/switch isn't completed */
		enumset1 = ((EnumSet) (obj));
		((List) (enumset)).add(((Object) (card)));
		if(true) goto _L2; else goto _L1
_L1:
		return ((List) (enumset));
		StringBuilder stringbuilder = new StringBuilder();
	//   77  144:new             #126 <Class StringBuilder>
	//   78  147:dup             
	//   79  148:invokespecial   #127 <Method void StringBuilder()>
	//   80  151:astore          4
		stringbuilder.append("Unable to get cards with categories[");
	//   81  153:aload           4
	//   82  155:ldc1            #129 <String "Unable to get cards with categories[">
	//   83  157:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   84  160:pop             
		stringbuilder.append(((Object) (enumset1)));
	//   85  161:aload           4
	//   86  163:aload_3         
	//   87  164:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   88  167:pop             
		stringbuilder.append("]. Ignoring.");
	//   89  168:aload           4
	//   90  170:ldc1            #138 <String "]. Ignoring.">
	//   91  172:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   92  175:pop             
		AppboyLogger.w(((String) (obj)), stringbuilder.toString(), ((Throwable) (enumset)));
	//   93  176:aload_2         
	//   94  177:aload           4
	//   95  179:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   96  182:aload_1         
	//   97  183:invokestatic    #145 <Method int AppboyLogger.w(String, String, Throwable)>
	//   98  186:pop             
		return null;
	//   99  187:aconst_null     
	//  100  188:areturn         
	}

	public int getUnreadCardCount()
	{
		return getUnreadCardCount(CardCategory.getAllCategories());
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method EnumSet CardCategory.getAllCategories()>
	//    2    4:invokevirtual   #149 <Method int getUnreadCardCount(EnumSet)>
	//    3    7:ireturn         
	}

	public int getUnreadCardCount(CardCategory cardcategory)
	{
		return getUnreadCardCount(EnumSet.of(((Enum) (cardcategory))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #60  <Method EnumSet EnumSet.of(Enum)>
	//    3    5:invokevirtual   #149 <Method int getUnreadCardCount(EnumSet)>
	//    4    8:ireturn         
	}

	public int getUnreadCardCount(EnumSet enumset)
	{
		if(enumset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       21
		{
			AppboyLogger.w(a, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
	//    2    4:getstatic       #24  <Field String a>
	//    3    7:ldc1            #151 <String "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.">
	//    4    9:invokestatic    #80  <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return getUnreadCardCount(CardCategory.getAllCategories());
	//    6   13:aload_0         
	//    7   14:invokestatic    #50  <Method EnumSet CardCategory.getAllCategories()>
	//    8   17:invokevirtual   #149 <Method int getUnreadCardCount(EnumSet)>
	//    9   20:ireturn         
		}
		boolean flag = enumset.isEmpty();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #75  <Method boolean EnumSet.isEmpty()>
	//   12   25:istore_3        
		int i = 0;
	//   13   26:iconst_0        
	//   14   27:istore_2        
		if(flag)
	//*  15   28:iload_3         
	//*  16   29:ifeq            43
		{
			AppboyLogger.w(a, "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
	//   17   32:getstatic       #24  <Field String a>
	//   18   35:ldc1            #153 <String "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.">
	//   19   37:invokestatic    #80  <Method int AppboyLogger.w(String, String)>
	//   20   40:pop             
			return 0;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		}
		Iterator iterator = b.iterator();
	//   23   43:aload_0         
	//   24   44:getfield        #35  <Field List b>
	//   25   47:invokeinterface #102 <Method Iterator List.iterator()>
	//   26   52:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   27   54:aload           4
	//   28   56:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   29   61:ifeq            108
			Card card = (Card)iterator.next();
	//   30   64:aload           4
	//   31   66:invokeinterface #111 <Method Object Iterator.next()>
	//   32   71:checkcast       #113 <Class Card>
	//   33   74:astore          5
			if(card.isInCategorySet(enumset) && !card.getViewed() && !card.isExpired())
	//*  34   76:aload           5
	//*  35   78:aload_1         
	//*  36   79:invokevirtual   #117 <Method boolean Card.isInCategorySet(EnumSet)>
	//*  37   82:ifeq            54
	//*  38   85:aload           5
	//*  39   87:invokevirtual   #156 <Method boolean Card.getViewed()>
	//*  40   90:ifne            54
	//*  41   93:aload           5
	//*  42   95:invokevirtual   #120 <Method boolean Card.isExpired()>
	//*  43   98:ifne            54
				i++;
	//   44  101:iload_2         
	//   45  102:iconst_1        
	//   46  103:iadd            
	//   47  104:istore_2        
		} while(true);
	//   48  105:goto            54
		return i;
	//   49  108:iload_2         
	//   50  109:ireturn         
	}

	public String getUserId()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String c>
	//    2    4:areturn         
	}

	public boolean isFromOfflineStorage()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean d>
	//    2    4:ireturn         
	}

	public long lastUpdatedInSecondsFromEpoch()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long e>
	//    2    4:lreturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("FeedUpdatedEvent{");
	//    0    0:new             #126 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #162 <String "FeedUpdatedEvent{">
	//    3    6:invokespecial   #165 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("mFeedCards=");
	//    5   10:aload_1         
	//    6   11:ldc1            #167 <String "mFeedCards=">
	//    7   13:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(((Object) (b)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #35  <Field List b>
	//   12   22:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   13   25:pop             
		stringbuilder.append(", mUserId='");
	//   14   26:aload_1         
	//   15   27:ldc1            #169 <String ", mUserId='">
	//   16   29:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(c);
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #31  <Field String c>
	//   21   38:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append('\'');
	//   23   42:aload_1         
	//   24   43:bipush          39
	//   25   45:invokevirtual   #172 <Method StringBuilder StringBuilder.append(char)>
	//   26   48:pop             
		stringbuilder.append(", mFromOfflineStorage=");
	//   27   49:aload_1         
	//   28   50:ldc1            #174 <String ", mFromOfflineStorage=">
	//   29   52:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(d);
	//   31   56:aload_1         
	//   32   57:aload_0         
	//   33   58:getfield        #33  <Field boolean d>
	//   34   61:invokevirtual   #177 <Method StringBuilder StringBuilder.append(boolean)>
	//   35   64:pop             
		stringbuilder.append(", mTimestamp=");
	//   36   65:aload_1         
	//   37   66:ldc1            #179 <String ", mTimestamp=">
	//   38   68:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(e);
	//   40   72:aload_1         
	//   41   73:aload_0         
	//   42   74:getfield        #37  <Field long e>
	//   43   77:invokevirtual   #182 <Method StringBuilder StringBuilder.append(long)>
	//   44   80:pop             
		stringbuilder.append('}');
	//   45   81:aload_1         
	//   46   82:bipush          125
	//   47   84:invokevirtual   #172 <Method StringBuilder StringBuilder.append(char)>
	//   48   87:pop             
		return stringbuilder.toString();
	//   49   88:aload_1         
	//   50   89:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   51   92:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/events/FeedUpdatedEvent);
	private final List b;
	private final String c;
	private final boolean d;
	private final long e;

	static 
	{
	//    0    0:ldc1            #2   <Class FeedUpdatedEvent>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String a>
	//*   3    8:return          
	}
}
