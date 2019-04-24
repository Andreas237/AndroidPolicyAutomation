// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			SuggestionsAdapter

private static final class SuggestionsAdapter$ChildViewCache
{

	public final ImageView mIcon1;
	public final ImageView mIcon2;
	public final ImageView mIconRefine;
	public final TextView mText1;
	public final TextView mText2;

	public SuggestionsAdapter$ChildViewCache(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mText1 = (TextView)view.findViewById(0x1020014);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #20  <Int 0x1020014>
	//    5    8:invokevirtual   #26  <Method View View.findViewById(int)>
	//    6   11:checkcast       #28  <Class TextView>
	//    7   14:putfield        #30  <Field TextView mText1>
		mText2 = (TextView)view.findViewById(0x1020015);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:ldc1            #31  <Int 0x1020015>
	//   11   21:invokevirtual   #26  <Method View View.findViewById(int)>
	//   12   24:checkcast       #28  <Class TextView>
	//   13   27:putfield        #33  <Field TextView mText2>
		mIcon1 = (ImageView)view.findViewById(0x1020007);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:ldc1            #34  <Int 0x1020007>
	//   17   34:invokevirtual   #26  <Method View View.findViewById(int)>
	//   18   37:checkcast       #36  <Class ImageView>
	//   19   40:putfield        #38  <Field ImageView mIcon1>
		mIcon2 = (ImageView)view.findViewById(0x1020008);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:ldc1            #39  <Int 0x1020008>
	//   23   47:invokevirtual   #26  <Method View View.findViewById(int)>
	//   24   50:checkcast       #36  <Class ImageView>
	//   25   53:putfield        #41  <Field ImageView mIcon2>
		mIconRefine = (ImageView)view.findViewById(android.support.v7.appcompat.R.id.edit_query);
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:getstatic       #47  <Field int android.support.v7.appcompat.R$id.edit_query>
	//   29   61:invokevirtual   #26  <Method View View.findViewById(int)>
	//   30   64:checkcast       #36  <Class ImageView>
	//   31   67:putfield        #49  <Field ImageView mIconRefine>
	//   32   70:return          
	}
}
