// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.handlers;

import com.appboy.models.cards.Card;
import java.util.Comparator;

// Referenced classes of package com.appboy.ui.contentcards.handlers:
//			DefaultContentCardsUpdateHandler

class DefaultContentCardsUpdateHandler$1
	implements Comparator
{

	public int compare(Card card, Card card1)
	{
		if(card.getIsPinned() && !card1.getIsPinned())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #30  <Method boolean Card.getIsPinned()>
	//*   2    4:ifeq            16
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #30  <Method boolean Card.getIsPinned()>
	//*   5   11:ifne            16
			return -1;
	//    6   14:iconst_m1       
	//    7   15:ireturn         
		if(!card.getIsPinned() && card1.getIsPinned())
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #30  <Method boolean Card.getIsPinned()>
	//*  10   20:ifne            32
	//*  11   23:aload_2         
	//*  12   24:invokevirtual   #30  <Method boolean Card.getIsPinned()>
	//*  13   27:ifeq            32
			return 1;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		if(card.getUpdated() > card1.getUpdated())
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #34  <Method long Card.getUpdated()>
	//*  18   36:aload_2         
	//*  19   37:invokevirtual   #34  <Method long Card.getUpdated()>
	//*  20   40:lcmp            
	//*  21   41:ifle            46
			return -1;
	//   22   44:iconst_m1       
	//   23   45:ireturn         
		return card.getUpdated() >= card1.getUpdated() ? 0 : 1;
	//   24   46:aload_1         
	//   25   47:invokevirtual   #34  <Method long Card.getUpdated()>
	//   26   50:aload_2         
	//   27   51:invokevirtual   #34  <Method long Card.getUpdated()>
	//   28   54:lcmp            
	//   29   55:ifge            60
	//   30   58:iconst_1        
	//   31   59:ireturn         
	//   32   60:iconst_0        
	//   33   61:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Card)obj, (Card)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Card>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class Card>
	//    5    9:invokevirtual   #37  <Method int compare(Card, Card)>
	//    6   12:ireturn         
	}

	final DefaultContentCardsUpdateHandler this$0;

	DefaultContentCardsUpdateHandler$1()
	{
		this$0 = DefaultContentCardsUpdateHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DefaultContentCardsUpdateHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
