// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import com.appboy.models.cards.Card;
import java.util.Comparator;

// Referenced classes of package com.appboy.ui:
//			AppboyFeedFragment

class AppboyFeedFragment$6
	implements Comparator
{

	public int compare(Card card, Card card1)
	{
		if(card.isIndicatorHighlighted() == card1.isIndicatorHighlighted())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #30  <Method boolean Card.isIndicatorHighlighted()>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #30  <Method boolean Card.isIndicatorHighlighted()>
	//*   4    8:icmpne          13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		return !card.isIndicatorHighlighted() ? -1 : 1;
	//    7   13:aload_1         
	//    8   14:invokevirtual   #30  <Method boolean Card.isIndicatorHighlighted()>
	//    9   17:ifeq            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_m1       
	//   13   23:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Card)obj, (Card)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Card>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class Card>
	//    5    9:invokevirtual   #33  <Method int compare(Card, Card)>
	//    6   12:ireturn         
	}

	final AppboyFeedFragment this$0;

	AppboyFeedFragment$6()
	{
		this$0 = AppboyFeedFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppboyFeedFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
