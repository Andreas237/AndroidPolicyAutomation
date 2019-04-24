// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

// Referenced classes of package com.amap.api.mapcore.util:
//			gc

class gc$1
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		try
		{
			gc.a(a).setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field gc a>
	//    2    4:invokestatic    #26  <Method AutoCompleteTextView gc.a(gc)>
	//    3    7:ldc1            #28  <String "">
	//    4    9:invokevirtual   #34  <Method void AutoCompleteTextView.setText(CharSequence)>
			gc.b(a).setVisibility(8);
	//    5   12:aload_0         
	//    6   13:getfield        #16  <Field gc a>
	//    7   16:invokestatic    #38  <Method ImageView gc.b(gc)>
	//    8   19:bipush          8
	//    9   21:invokevirtual   #44  <Method void ImageView.setVisibility(int)>
			a.a(false);
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field gc a>
	//   12   28:iconst_0        
	//   13   29:invokevirtual   #47  <Method void gc.a(boolean)>
			view = ((View) ((android.widget.iveLayout.LayoutParams)gc.c(a).getLayoutParams()));
	//   14   32:aload_0         
	//   15   33:getfield        #16  <Field gc a>
	//   16   36:invokestatic    #50  <Method ImageView gc.c(gc)>
	//   17   39:invokevirtual   #54  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   18   42:checkcast       #56  <Class android.widget.RelativeLayout$LayoutParams>
	//   19   45:astore_1        
			view.leftMargin = a.a(95F);
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:getfield        #16  <Field gc a>
	//   23   51:ldc1            #57  <Float 95F>
	//   24   53:invokevirtual   #60  <Method int gc.a(float)>
	//   25   56:putfield        #64  <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
			gc.c(a).setLayoutParams(((android.view.roup.LayoutParams) (view)));
	//   26   59:aload_0         
	//   27   60:getfield        #16  <Field gc a>
	//   28   63:invokestatic    #50  <Method ImageView gc.c(gc)>
	//   29   66:aload_1         
	//   30   67:invokevirtual   #68  <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			gc.a(a).setPadding(a.a(105F), 0, 0, 0);
	//   31   70:aload_0         
	//   32   71:getfield        #16  <Field gc a>
	//   33   74:invokestatic    #26  <Method AutoCompleteTextView gc.a(gc)>
	//   34   77:aload_0         
	//   35   78:getfield        #16  <Field gc a>
	//   36   81:ldc1            #69  <Float 105F>
	//   37   83:invokevirtual   #60  <Method int gc.a(float)>
	//   38   86:iconst_0        
	//   39   87:iconst_0        
	//   40   88:iconst_0        
	//   41   89:invokevirtual   #73  <Method void AutoCompleteTextView.setPadding(int, int, int, int)>
			return;
	//   42   92:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  43   93:astore_1        
		{
			((Exception) (view)).printStackTrace();
	//   44   94:aload_1         
	//   45   95:invokevirtual   #76  <Method void Exception.printStackTrace()>
		}
	//   46   98:return          
	}

	final gc a;

	gc$1(gc gc1)
	{
		a = gc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field gc a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
