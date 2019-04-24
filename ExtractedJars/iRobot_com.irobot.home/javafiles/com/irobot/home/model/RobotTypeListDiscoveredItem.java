// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.model:
//			RobotTypeListItem

public class RobotTypeListDiscoveredItem extends RobotTypeListItem
{

	public RobotTypeListDiscoveredItem(String s, String s1, String s2, int i)
	{
		super(s, s2, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #11  <Method void RobotTypeListItem(String, String, int)>
		a = s1;
	//    5    8:aload_0         
	//    6    9:aload_2         
	//    7   10:putfield        #13  <Field String a>
	//    8   13:return          
	}

	public int a()
	{
		return m.b.DISCOVERED_ITEM.ordinal();
	//    0    0:getstatic       #21  <Field m$b m$b.DISCOVERED_ITEM>
	//    1    3:invokevirtual   #24  <Method int m$b.ordinal()>
	//    2    6:ireturn         
	}

	public View a(Context context, LayoutInflater layoutinflater, View view, m.a a1)
	{
		View view1 = view;
	//    0    0:aload_3         
	//    1    1:astore          5
		if(view == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       83
		{
			view1 = view;
	//    4    7:aload_3         
	//    5    8:astore          5
			if(layoutinflater != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          83
			{
				view1 = layoutinflater.inflate(0x7f0b0132, ((android.view.ViewGroup) (null)));
	//    8   14:aload_2         
	//    9   15:ldc1            #26  <Int 0x7f0b0132>
	//   10   17:aconst_null     
	//   11   18:invokevirtual   #32  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   12   21:astore          5
				a1.a = (CustomTextView)view1.findViewById(0x7f09036b);
	//   13   23:aload           4
	//   14   25:aload           5
	//   15   27:ldc1            #33  <Int 0x7f09036b>
	//   16   29:invokevirtual   #39  <Method View View.findViewById(int)>
	//   17   32:checkcast       #41  <Class CustomTextView>
	//   18   35:putfield        #46  <Field CustomTextView m$a.a>
				a1.b = (CustomTextView)view1.findViewById(0x7f090369);
	//   19   38:aload           4
	//   20   40:aload           5
	//   21   42:ldc1            #47  <Int 0x7f090369>
	//   22   44:invokevirtual   #39  <Method View View.findViewById(int)>
	//   23   47:checkcast       #41  <Class CustomTextView>
	//   24   50:putfield        #50  <Field CustomTextView m$a.b>
				a1.c = (ImageView)view1.findViewById(0x7f09036a);
	//   25   53:aload           4
	//   26   55:aload           5
	//   27   57:ldc1            #51  <Int 0x7f09036a>
	//   28   59:invokevirtual   #39  <Method View View.findViewById(int)>
	//   29   62:checkcast       #53  <Class ImageView>
	//   30   65:putfield        #57  <Field ImageView m$a.c>
				a1.e = (CustomTextView)view1.findViewById(0x7f090356);
	//   31   68:aload           4
	//   32   70:aload           5
	//   33   72:ldc1            #58  <Int 0x7f090356>
	//   34   74:invokevirtual   #39  <Method View View.findViewById(int)>
	//   35   77:checkcast       #41  <Class CustomTextView>
	//   36   80:putfield        #61  <Field CustomTextView m$a.e>
			}
		}
		context = ((Context) (context.getResources()));
	//   37   83:aload_1         
	//   38   84:invokevirtual   #67  <Method Resources Context.getResources()>
	//   39   87:astore_1        
		a1.a.setText(((CharSequence) (b())));
	//   40   88:aload           4
	//   41   90:getfield        #46  <Field CustomTextView m$a.a>
	//   42   93:aload_0         
	//   43   94:invokevirtual   #70  <Method String b()>
	//   44   97:invokevirtual   #74  <Method void CustomTextView.setText(CharSequence)>
		a1.b.setText(((CharSequence) (c())));
	//   45  100:aload           4
	//   46  102:getfield        #50  <Field CustomTextView m$a.b>
	//   47  105:aload_0         
	//   48  106:invokevirtual   #76  <Method String c()>
	//   49  109:invokevirtual   #74  <Method void CustomTextView.setText(CharSequence)>
		a1.c.setImageDrawable(((Resources) (context)).getDrawable(d()));
	//   50  112:aload           4
	//   51  114:getfield        #57  <Field ImageView m$a.c>
	//   52  117:aload_1         
	//   53  118:aload_0         
	//   54  119:invokevirtual   #79  <Method int d()>
	//   55  122:invokevirtual   #85  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   56  125:invokevirtual   #89  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		a1.e.setText(((CharSequence) (a)));
	//   57  128:aload           4
	//   58  130:getfield        #61  <Field CustomTextView m$a.e>
	//   59  133:aload_0         
	//   60  134:getfield        #13  <Field String a>
	//   61  137:invokevirtual   #74  <Method void CustomTextView.setText(CharSequence)>
		a1.e.setVisibility(8);
	//   62  140:aload           4
	//   63  142:getfield        #61  <Field CustomTextView m$a.e>
	//   64  145:bipush          8
	//   65  147:invokevirtual   #93  <Method void CustomTextView.setVisibility(int)>
		return view1;
	//   66  150:aload           5
	//   67  152:areturn         
	}

	private String a;
}
