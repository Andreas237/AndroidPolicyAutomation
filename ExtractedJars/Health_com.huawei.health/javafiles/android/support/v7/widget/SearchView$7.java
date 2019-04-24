// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$7
	implements android.view.istener
{

	public void onClick(View view)
	{
		if(view == mSearchButton)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #14  <Field SearchView this$0>
	//*   3    5:getfield        #24  <Field android.widget.ImageView SearchView.mSearchButton>
	//*   4    8:if_acmpne       19
		{
			onSearchClicked();
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field SearchView this$0>
	//    7   15:invokevirtual   #27  <Method void SearchView.onSearchClicked()>
			return;
	//    8   18:return          
		}
		if(view == mCloseButton)
	//*   9   19:aload_1         
	//*  10   20:aload_0         
	//*  11   21:getfield        #14  <Field SearchView this$0>
	//*  12   24:getfield        #30  <Field android.widget.ImageView SearchView.mCloseButton>
	//*  13   27:if_acmpne       38
		{
			onCloseClicked();
	//   14   30:aload_0         
	//   15   31:getfield        #14  <Field SearchView this$0>
	//   16   34:invokevirtual   #33  <Method void SearchView.onCloseClicked()>
			return;
	//   17   37:return          
		}
		if(view == mGoButton)
	//*  18   38:aload_1         
	//*  19   39:aload_0         
	//*  20   40:getfield        #14  <Field SearchView this$0>
	//*  21   43:getfield        #36  <Field android.widget.ImageView SearchView.mGoButton>
	//*  22   46:if_acmpne       57
		{
			onSubmitQuery();
	//   23   49:aload_0         
	//   24   50:getfield        #14  <Field SearchView this$0>
	//   25   53:invokevirtual   #39  <Method void SearchView.onSubmitQuery()>
			return;
	//   26   56:return          
		}
		if(view == mVoiceButton)
	//*  27   57:aload_1         
	//*  28   58:aload_0         
	//*  29   59:getfield        #14  <Field SearchView this$0>
	//*  30   62:getfield        #42  <Field android.widget.ImageView SearchView.mVoiceButton>
	//*  31   65:if_acmpne       76
		{
			onVoiceClicked();
	//   32   68:aload_0         
	//   33   69:getfield        #14  <Field SearchView this$0>
	//   34   72:invokevirtual   #45  <Method void SearchView.onVoiceClicked()>
			return;
	//   35   75:return          
		}
		if(view == mSearchSrcTextView)
	//*  36   76:aload_1         
	//*  37   77:aload_0         
	//*  38   78:getfield        #14  <Field SearchView this$0>
	//*  39   81:getfield        #49  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
	//*  40   84:if_acmpne       94
			forceSuggestionQuery();
	//   41   87:aload_0         
	//   42   88:getfield        #14  <Field SearchView this$0>
	//   43   91:invokevirtual   #52  <Method void SearchView.forceSuggestionQuery()>
	//   44   94:return          
	}

	final SearchView this$0;

	SearchView$7()
	{
		this$0 = SearchView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SearchView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
