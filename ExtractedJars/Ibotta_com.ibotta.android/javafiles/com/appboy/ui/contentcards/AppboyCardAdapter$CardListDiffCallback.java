// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards;

import com.appboy.models.cards.Card;
import java.util.List;

// Referenced classes of package com.appboy.ui.contentcards:
//			AppboyCardAdapter

private class AppboyCardAdapter$CardListDiffCallback extends android.support.v7.util.DiffUtil.Callback
{

	private boolean doItemsShareIds(int i, int j)
	{
		return ((Card)mOldCards.get(i)).getId().equals(((Object) (((Card)mNewCards.get(j)).getId())));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mOldCards>
	//    2    4:iload_1         
	//    3    5:invokeinterface #35  <Method Object List.get(int)>
	//    4   10:checkcast       #37  <Class Card>
	//    5   13:invokevirtual   #41  <Method String Card.getId()>
	//    6   16:aload_0         
	//    7   17:getfield        #24  <Field List mNewCards>
	//    8   20:iload_2         
	//    9   21:invokeinterface #35  <Method Object List.get(int)>
	//   10   26:checkcast       #37  <Class Card>
	//   11   29:invokevirtual   #41  <Method String Card.getId()>
	//   12   32:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   13   35:ireturn         
	}

	public boolean areContentsTheSame(int i, int j)
	{
		return doItemsShareIds(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method boolean doItemsShareIds(int, int)>
	//    4    6:ireturn         
	}

	public boolean areItemsTheSame(int i, int j)
	{
		return doItemsShareIds(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method boolean doItemsShareIds(int, int)>
	//    4    6:ireturn         
	}

	public int getNewListSize()
	{
		return mNewCards.size();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List mNewCards>
	//    2    4:invokeinterface #56  <Method int List.size()>
	//    3    9:ireturn         
	}

	public int getOldListSize()
	{
		return mOldCards.size();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mOldCards>
	//    2    4:invokeinterface #56  <Method int List.size()>
	//    3    9:ireturn         
	}

	private final List mNewCards;
	private final List mOldCards;
	final AppboyCardAdapter this$0;

	AppboyCardAdapter$CardListDiffCallback(List list, List list1)
	{
		this$0 = AppboyCardAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyCardAdapter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void android.support.v7.util.DiffUtil$Callback()>
		mOldCards = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field List mOldCards>
		mNewCards = list1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field List mNewCards>
	//   11   19:return          
	}
}
