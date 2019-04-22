// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.listeners;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.ui.actions.IAction;

// Referenced classes of package com.appboy.ui.contentcards.listeners:
//			IContentCardsActionListener

public class AppboyContentCardsActionListener
	implements IContentCardsActionListener
{

	public AppboyContentCardsActionListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean onContentCardClicked(Context context, Card card, IAction iaction)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onContentCardDismissed(Context context, Card card)
	{
	//    0    0:return          
	}
}
