// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.feed.view.BaseFeedCardView;

public class DefaultCardView extends BaseFeedCardView
{

	public DefaultCardView(Context context)
	{
		this(context, ((Card) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void DefaultCardView(Context, Card)>
	//    4    6:return          
	}

	public DefaultCardView(Context context, Card card)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void BaseFeedCardView(Context)>
		if(card != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			setCard(card);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #29  <Method void setCard(Card)>
	//    8   14:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_default_card;
	//    0    0:getstatic       #37  <Field int com.appboy.ui.R$layout.com_appboy_default_card>
	//    1    3:ireturn         
	}

	public void onSetCard(Card card)
	{
		String s = TAG;
	//    0    0:getstatic       #17  <Field String TAG>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #40  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #42  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("onSetCard called for blank view with: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #44  <String "onSetCard called for blank view with: ">
	//    8   15:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(card.toString());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #54  <Method String Card.toString()>
	//   13   24:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #59  <Method int AppboyLogger.w(String, String)>
	//   19   36:pop             
	//   20   37:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/DefaultCardView);

	static 
	{
	//    0    0:ldc1            #2   <Class DefaultCardView>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String TAG>
	//*   3    8:return          
	}
}
