// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.appboy.models.cards.*;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.widget.*;
import java.util.*;

public class AppboyListAdapter extends ArrayAdapter
{

	public AppboyListAdapter(Context context, int i, List list)
	{
		super(context, i, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #27  <Method void ArrayAdapter(Context, int, List)>
		mContext = context;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #29  <Field Context mContext>
	//    8   12:aload_0         
	//    9   13:new             #31  <Class HashSet>
	//   10   16:dup             
	//   11   17:invokespecial   #33  <Method void HashSet()>
	//   12   20:putfield        #35  <Field Set mCardIdImpressions>
	//   13   23:return          
	}

	private void logCardImpression(Card card)
	{
		String s = card.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method String Card.getId()>
	//    2    4:astore_2        
		if(!mCardIdImpressions.contains(((Object) (s))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field Set mCardIdImpressions>
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #51  <Method boolean Set.contains(Object)>
	//*   7   15:ifne            75
		{
			mCardIdImpressions.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field Set mCardIdImpressions>
	//   10   22:aload_2         
	//   11   23:invokeinterface #54  <Method boolean Set.add(Object)>
	//   12   28:pop             
			card.logImpression();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #58  <Method boolean Card.logImpression()>
	//   15   33:pop             
			String s1 = TAG;
	//   16   34:getstatic       #22  <Field String TAG>
	//   17   37:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   18   38:new             #60  <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #61  <Method void StringBuilder()>
	//   21   45:astore          4
			stringbuilder.append("Logged impression for card ");
	//   22   47:aload           4
	//   23   49:ldc1            #63  <String "Logged impression for card ">
	//   24   51:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:pop             
			stringbuilder.append(s);
	//   26   55:aload           4
	//   27   57:aload_2         
	//   28   58:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			AppboyLogger.v(s1, stringbuilder.toString());
	//   30   62:aload_3         
	//   31   63:aload           4
	//   32   65:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   33   68:invokestatic    #74  <Method int AppboyLogger.v(String, String)>
	//   34   71:pop             
		} else
	//*  35   72:goto            113
		{
			String s2 = TAG;
	//   36   75:getstatic       #22  <Field String TAG>
	//   37   78:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   38   79:new             #60  <Class StringBuilder>
	//   39   82:dup             
	//   40   83:invokespecial   #61  <Method void StringBuilder()>
	//   41   86:astore          4
			stringbuilder1.append("Already counted impression for card ");
	//   42   88:aload           4
	//   43   90:ldc1            #76  <String "Already counted impression for card ">
	//   44   92:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
			stringbuilder1.append(s);
	//   46   96:aload           4
	//   47   98:aload_2         
	//   48   99:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   49  102:pop             
			AppboyLogger.v(s2, stringbuilder1.toString());
	//   50  103:aload_3         
	//   51  104:aload           4
	//   52  106:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   53  109:invokestatic    #74  <Method int AppboyLogger.v(String, String)>
	//   54  112:pop             
		}
		if(!card.getViewed())
	//*  55  113:aload_1         
	//*  56  114:invokevirtual   #79  <Method boolean Card.getViewed()>
	//*  57  117:ifne            125
			card.setViewed(true);
	//   58  120:aload_1         
	//   59  121:iconst_1        
	//   60  122:invokevirtual   #83  <Method void Card.setViewed(boolean)>
	//   61  125:return          
	}

	public void add(Card card)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.add(((Object) (card)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #86  <Method void ArrayAdapter.add(Object)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		card;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw card;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public volatile void add(Object obj)
	{
		add((Card)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class Card>
	//    3    5:invokevirtual   #88  <Method void add(Card)>
	//    4    8:return          
	}

	public void batchSetCardsToRead(int i, int j)
	{
		if(getCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #94  <Method int getCount()>
	//*   2    4:ifne            17
		{
			AppboyLogger.d(TAG, "mAdapter is empty in setting some cards to viewed.");
	//    3    7:getstatic       #22  <Field String TAG>
	//    4   10:ldc1            #96  <String "mAdapter is empty in setting some cards to viewed.">
	//    5   12:invokestatic    #99  <Method int AppboyLogger.d(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		}
		i = Math.max(0, i);
	//    8   17:iconst_0        
	//    9   18:iload_1         
	//   10   19:invokestatic    #105 <Method int Math.max(int, int)>
	//   11   22:istore_1        
		for(j = Math.min(getCount(), j); i < j; i++)
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #94  <Method int getCount()>
	//*  14   27:iload_2         
	//*  15   28:invokestatic    #108 <Method int Math.min(int, int)>
	//*  16   31:istore_2        
	//*  17   32:iload_1         
	//*  18   33:iload_2         
	//*  19   34:icmpge          79
		{
			Card card = (Card)getItem(i);
	//   20   37:aload_0         
	//   21   38:iload_1         
	//   22   39:invokevirtual   #112 <Method Object getItem(int)>
	//   23   42:checkcast       #41  <Class Card>
	//   24   45:astore_3        
			if(card == null)
	//*  25   46:aload_3         
	//*  26   47:ifnonnull       60
			{
				AppboyLogger.d(TAG, "Card was null in setting some cards to viewed.");
	//   27   50:getstatic       #22  <Field String TAG>
	//   28   53:ldc1            #114 <String "Card was null in setting some cards to viewed.">
	//   29   55:invokestatic    #99  <Method int AppboyLogger.d(String, String)>
	//   30   58:pop             
				return;
	//   31   59:return          
			}
			if(!card.isRead())
	//*  32   60:aload_3         
	//*  33   61:invokevirtual   #117 <Method boolean Card.isRead()>
	//*  34   64:ifne            72
				card.setIsRead(true);
	//   35   67:aload_3         
	//   36   68:iconst_1        
	//   37   69:invokevirtual   #120 <Method void Card.setIsRead(boolean)>
		}

	//   38   72:iload_1         
	//   39   73:iconst_1        
	//   40   74:iadd            
	//   41   75:istore_1        
	//*  42   76:goto            32
	//   43   79:return          
	}

	public int getItemViewType(int i)
	{
		Card card = (Card)getItem(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #112 <Method Object getItem(int)>
	//    3    5:checkcast       #41  <Class Card>
	//    4    8:astore_2        
		if(card instanceof BannerImageCard)
	//*   5    9:aload_2         
	//*   6   10:instanceof      #124 <Class BannerImageCard>
	//*   7   13:ifeq            18
			return 1;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(card instanceof CaptionedImageCard)
	//*  10   18:aload_2         
	//*  11   19:instanceof      #126 <Class CaptionedImageCard>
	//*  12   22:ifeq            27
			return 2;
	//   13   25:iconst_2        
	//   14   26:ireturn         
		if(card instanceof CrossPromotionSmallCard)
	//*  15   27:aload_2         
	//*  16   28:instanceof      #128 <Class CrossPromotionSmallCard>
	//*  17   31:ifeq            36
			return 3;
	//   18   34:iconst_3        
	//   19   35:ireturn         
		if(card instanceof ShortNewsCard)
	//*  20   36:aload_2         
	//*  21   37:instanceof      #130 <Class ShortNewsCard>
	//*  22   40:ifeq            45
			return 4;
	//   23   43:iconst_4        
	//   24   44:ireturn         
		return !(card instanceof TextAnnouncementCard) ? 0 : 5;
	//   25   45:aload_2         
	//   26   46:instanceof      #132 <Class TextAnnouncementCard>
	//   27   49:ifeq            54
	//   28   52:iconst_5        
	//   29   53:ireturn         
	//   30   54:iconst_0        
	//   31   55:ireturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) ((Card)getItem(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #112 <Method Object getItem(int)>
	//    3    5:checkcast       #41  <Class Card>
	//    4    8:astore_3        
		if(view == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       138
		{
			if(viewgroup instanceof BannerImageCard)
	//*   7   13:aload_3         
	//*   8   14:instanceof      #124 <Class BannerImageCard>
	//*   9   17:ifeq            35
				view = ((View) (new BannerImageCardView(mContext)));
	//   10   20:new             #136 <Class BannerImageCardView>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field Context mContext>
	//   14   28:invokespecial   #139 <Method void BannerImageCardView(Context)>
	//   15   31:astore_2        
			else
	//*  16   32:goto            183
			if(viewgroup instanceof CaptionedImageCard)
	//*  17   35:aload_3         
	//*  18   36:instanceof      #126 <Class CaptionedImageCard>
	//*  19   39:ifeq            57
				view = ((View) (new CaptionedImageCardView(mContext)));
	//   20   42:new             #141 <Class CaptionedImageCardView>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:getfield        #29  <Field Context mContext>
	//   24   50:invokespecial   #142 <Method void CaptionedImageCardView(Context)>
	//   25   53:astore_2        
			else
	//*  26   54:goto            183
			if(viewgroup instanceof CrossPromotionSmallCard)
	//*  27   57:aload_3         
	//*  28   58:instanceof      #128 <Class CrossPromotionSmallCard>
	//*  29   61:ifeq            79
				view = ((View) (new CrossPromotionSmallCardView(mContext)));
	//   30   64:new             #144 <Class CrossPromotionSmallCardView>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:getfield        #29  <Field Context mContext>
	//   34   72:invokespecial   #145 <Method void CrossPromotionSmallCardView(Context)>
	//   35   75:astore_2        
			else
	//*  36   76:goto            183
			if(viewgroup instanceof ShortNewsCard)
	//*  37   79:aload_3         
	//*  38   80:instanceof      #130 <Class ShortNewsCard>
	//*  39   83:ifeq            101
				view = ((View) (new ShortNewsCardView(mContext)));
	//   40   86:new             #147 <Class ShortNewsCardView>
	//   41   89:dup             
	//   42   90:aload_0         
	//   43   91:getfield        #29  <Field Context mContext>
	//   44   94:invokespecial   #148 <Method void ShortNewsCardView(Context)>
	//   45   97:astore_2        
			else
	//*  46   98:goto            183
			if(viewgroup instanceof TextAnnouncementCard)
	//*  47  101:aload_3         
	//*  48  102:instanceof      #132 <Class TextAnnouncementCard>
	//*  49  105:ifeq            123
				view = ((View) (new TextAnnouncementCardView(mContext)));
	//   50  108:new             #150 <Class TextAnnouncementCardView>
	//   51  111:dup             
	//   52  112:aload_0         
	//   53  113:getfield        #29  <Field Context mContext>
	//   54  116:invokespecial   #151 <Method void TextAnnouncementCardView(Context)>
	//   55  119:astore_2        
			else
	//*  56  120:goto            183
				view = ((View) (new DefaultCardView(mContext)));
	//   57  123:new             #153 <Class DefaultCardView>
	//   58  126:dup             
	//   59  127:aload_0         
	//   60  128:getfield        #29  <Field Context mContext>
	//   61  131:invokespecial   #154 <Method void DefaultCardView(Context)>
	//   62  134:astore_2        
		} else
	//*  63  135:goto            183
		{
			String s = TAG;
	//   64  138:getstatic       #22  <Field String TAG>
	//   65  141:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   66  143:new             #60  <Class StringBuilder>
	//   67  146:dup             
	//   68  147:invokespecial   #61  <Method void StringBuilder()>
	//   69  150:astore          5
			stringbuilder.append("Reusing convertView for rendering of item ");
	//   70  152:aload           5
	//   71  154:ldc1            #156 <String "Reusing convertView for rendering of item ">
	//   72  156:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   73  159:pop             
			stringbuilder.append(i);
	//   74  160:aload           5
	//   75  162:iload_1         
	//   76  163:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   77  166:pop             
			AppboyLogger.v(s, stringbuilder.toString());
	//   78  167:aload           4
	//   79  169:aload           5
	//   80  171:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   81  174:invokestatic    #74  <Method int AppboyLogger.v(String, String)>
	//   82  177:pop             
			view = ((View) ((BaseCardView)view));
	//   83  178:aload_2         
	//   84  179:checkcast       #161 <Class BaseCardView>
	//   85  182:astore_2        
		}
		String s1 = TAG;
	//   86  183:getstatic       #22  <Field String TAG>
	//   87  186:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   88  188:new             #60  <Class StringBuilder>
	//   89  191:dup             
	//   90  192:invokespecial   #61  <Method void StringBuilder()>
	//   91  195:astore          5
		stringbuilder1.append("Using view of type: ");
	//   92  197:aload           5
	//   93  199:ldc1            #163 <String "Using view of type: ">
	//   94  201:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   95  204:pop             
		stringbuilder1.append(((Object) (view)).getClass().getName());
	//   96  205:aload           5
	//   97  207:aload_2         
	//   98  208:invokevirtual   #169 <Method Class Object.getClass()>
	//   99  211:invokevirtual   #174 <Method String Class.getName()>
	//  100  214:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  101  217:pop             
		stringbuilder1.append(" for card at position ");
	//  102  218:aload           5
	//  103  220:ldc1            #176 <String " for card at position ">
	//  104  222:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  105  225:pop             
		stringbuilder1.append(i);
	//  106  226:aload           5
	//  107  228:iload_1         
	//  108  229:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//  109  232:pop             
		stringbuilder1.append(": ");
	//  110  233:aload           5
	//  111  235:ldc1            #178 <String ": ">
	//  112  237:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  113  240:pop             
		stringbuilder1.append(((Object) (viewgroup)).toString());
	//  114  241:aload           5
	//  115  243:aload_3         
	//  116  244:invokevirtual   #179 <Method String Object.toString()>
	//  117  247:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  118  250:pop             
		AppboyLogger.v(s1, stringbuilder1.toString());
	//  119  251:aload           4
	//  120  253:aload           5
	//  121  255:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  122  258:invokestatic    #74  <Method int AppboyLogger.v(String, String)>
	//  123  261:pop             
		((BaseCardView) (view)).setCard(((Card) (viewgroup)));
	//  124  262:aload_2         
	//  125  263:aload_3         
	//  126  264:invokevirtual   #182 <Method void BaseCardView.setCard(Card)>
		logCardImpression(((Card) (viewgroup)));
	//  127  267:aload_0         
	//  128  268:aload_3         
	//  129  269:invokespecial   #184 <Method void logCardImpression(Card)>
		return view;
	//  130  272:aload_2         
	//  131  273:areturn         
	}

	public int getViewTypeCount()
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public void replaceFeed(List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		setNotifyOnChange(false);
	//    4    4:aload_0         
	//    5    5:iconst_0        
	//    6    6:invokevirtual   #190 <Method void setNotifyOnChange(boolean)>
		if(list != null)
			break MISSING_BLOCK_LABEL_24;
	//    7    9:aload_1         
	//    8   10:ifnonnull       24
		clear();
	//    9   13:aload_0         
	//   10   14:invokevirtual   #193 <Method void clear()>
		notifyDataSetChanged();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #196 <Method void notifyDataSetChanged()>
		this;
	//   13   21:aload_0         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		int k;
		String s = TAG;
	//   16   24:getstatic       #22  <Field String TAG>
	//   17   27:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   18   29:new             #60  <Class StringBuilder>
	//   19   32:dup             
	//   20   33:invokespecial   #61  <Method void StringBuilder()>
	//   21   36:astore          6
		stringbuilder.append("Replacing existing feed of ");
	//   22   38:aload           6
	//   23   40:ldc1            #198 <String "Replacing existing feed of ">
	//   24   42:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
		stringbuilder.append(getCount());
	//   26   46:aload           6
	//   27   48:aload_0         
	//   28   49:invokevirtual   #94  <Method int getCount()>
	//   29   52:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(" cards with new feed containing ");
	//   31   56:aload           6
	//   32   58:ldc1            #200 <String " cards with new feed containing ">
	//   33   60:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
		stringbuilder.append(list.size());
	//   35   64:aload           6
	//   36   66:aload_1         
	//   37   67:invokeinterface #205 <Method int List.size()>
	//   38   72:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   39   75:pop             
		stringbuilder.append(" cards.");
	//   40   76:aload           6
	//   41   78:ldc1            #207 <String " cards.">
	//   42   80:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   44   84:aload           5
	//   45   86:aload           6
	//   46   88:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   47   91:invokestatic    #99  <Method int AppboyLogger.d(String, String)>
	//   48   94:pop             
		k = list.size();
	//   49   95:aload_1         
	//   50   96:invokeinterface #205 <Method int List.size()>
	//   51  101:istore          4
		int i = 0;
	//   52  103:iconst_0        
	//   53  104:istore_2        
_L1:
		Card card1;
		if(j >= getCount())
			break MISSING_BLOCK_LABEL_179;
	//   54  105:iload_3         
	//   55  106:aload_0         
	//   56  107:invokevirtual   #94  <Method int getCount()>
	//   57  110:icmpge          179
		card1 = (Card)getItem(j);
	//   58  113:aload_0         
	//   59  114:iload_3         
	//   60  115:invokevirtual   #112 <Method Object getItem(int)>
	//   61  118:checkcast       #41  <Class Card>
	//   62  121:astore          6
		Card card;
		card = null;
	//   63  123:aconst_null     
	//   64  124:astore          5
		if(i >= k)
			break MISSING_BLOCK_LABEL_144;
	//   65  126:iload_2         
	//   66  127:iload           4
	//   67  129:icmpge          144
		card = (Card)list.get(i);
	//   68  132:aload_1         
	//   69  133:iload_2         
	//   70  134:invokeinterface #210 <Method Object List.get(int)>
	//   71  139:checkcast       #41  <Class Card>
	//   72  142:astore          5
		if(card == null)
			break MISSING_BLOCK_LABEL_170;
	//   73  144:aload           5
	//   74  146:ifnull          170
		if(!card.isEqualToCard(card1))
			break MISSING_BLOCK_LABEL_170;
	//   75  149:aload           5
	//   76  151:aload           6
	//   77  153:invokevirtual   #214 <Method boolean Card.isEqualToCard(Card)>
	//   78  156:ifeq            170
		j++;
	//   79  159:iload_3         
	//   80  160:iconst_1        
	//   81  161:iadd            
	//   82  162:istore_3        
		i++;
	//   83  163:iload_2         
	//   84  164:iconst_1        
	//   85  165:iadd            
	//   86  166:istore_2        
		  goto _L1
	//*  87  167:goto            105
		remove(((Object) (card1)));
	//   88  170:aload_0         
	//   89  171:aload           6
	//   90  173:invokevirtual   #217 <Method void remove(Object)>
		  goto _L1
	//*  91  176:goto            105
		super.addAll(((java.util.Collection) (list.subList(i, k))));
	//   92  179:aload_0         
	//   93  180:aload_1         
	//   94  181:iload_2         
	//   95  182:iload           4
	//   96  184:invokeinterface #221 <Method List List.subList(int, int)>
	//   97  189:invokespecial   #225 <Method void ArrayAdapter.addAll(java.util.Collection)>
		notifyDataSetChanged();
	//   98  192:aload_0         
	//   99  193:invokevirtual   #196 <Method void notifyDataSetChanged()>
		this;
	//  100  196:aload_0         
		JVM INSTR monitorexit ;
	//  101  197:monitorexit     
		return;
	//  102  198:return          
		list;
	//  103  199:astore_1        
	//* 104  200:aload_0         
		throw list;
	//  105  201:monitorexit     
	//  106  202:aload_1         
	//  107  203:athrow          
	}

	public void resetCardImpressionTracker()
	{
		mCardIdImpressions.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Set mCardIdImpressions>
	//    2    4:invokeinterface #228 <Method void Set.clear()>
	//    3    9:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/adapters/AppboyListAdapter);
	private final Set mCardIdImpressions = new HashSet();
	private final Context mContext;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyListAdapter>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String TAG>
	//*   3    8:return          
	}
}
