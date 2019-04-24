// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.irobot.home.view.CircleButton;
import com.irobot.home.view.PercentageRingView;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$3
	implements android.view.reeObserver.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		a.Q.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.reeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field be a>
	//    2    4:getfield        #25  <Field CircleButton be.Q>
	//    3    7:invokevirtual   #31  <Method ViewTreeObserver CircleButton.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		android.widget.iveLayout.LayoutParams layoutparams = (android.widget.iveLayout.LayoutParams)a.T.getLayoutParams();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field be a>
	//    8   18:getfield        #41  <Field PercentageRingView be.T>
	//    9   21:invokevirtual   #47  <Method android.view.ViewGroup$LayoutParams PercentageRingView.getLayoutParams()>
	//   10   24:checkcast       #49  <Class android.widget.RelativeLayout$LayoutParams>
	//   11   27:astore_1        
		layoutparams.height = a.Q.getButtonRadius() * 2;
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field be a>
	//   15   33:getfield        #25  <Field CircleButton be.Q>
	//   16   36:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
	//   17   39:iconst_2        
	//   18   40:imul            
	//   19   41:putfield        #57  <Field int android.widget.RelativeLayout$LayoutParams.height>
		layoutparams.width = a.Q.getButtonRadius() * 2;
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:getfield        #17  <Field be a>
	//   23   49:getfield        #25  <Field CircleButton be.Q>
	//   24   52:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
	//   25   55:iconst_2        
	//   26   56:imul            
	//   27   57:putfield        #60  <Field int android.widget.RelativeLayout$LayoutParams.width>
		layoutparams.topMargin = a.Q.getPressedHighlightWidth();
	//   28   60:aload_1         
	//   29   61:aload_0         
	//   30   62:getfield        #17  <Field be a>
	//   31   65:getfield        #25  <Field CircleButton be.Q>
	//   32   68:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//   33   71:putfield        #66  <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
		layoutparams.bottomMargin = a.Q.getPressedHighlightWidth();
	//   34   74:aload_1         
	//   35   75:aload_0         
	//   36   76:getfield        #17  <Field be a>
	//   37   79:getfield        #25  <Field CircleButton be.Q>
	//   38   82:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//   39   85:putfield        #69  <Field int android.widget.RelativeLayout$LayoutParams.bottomMargin>
		layoutparams.setMarginStart(a.Q.getPressedHighlightWidth());
	//   40   88:aload_1         
	//   41   89:aload_0         
	//   42   90:getfield        #17  <Field be a>
	//   43   93:getfield        #25  <Field CircleButton be.Q>
	//   44   96:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//   45   99:invokevirtual   #73  <Method void android.widget.RelativeLayout$LayoutParams.setMarginStart(int)>
		layoutparams.setMarginEnd(a.Q.getPressedHighlightWidth());
	//   46  102:aload_1         
	//   47  103:aload_0         
	//   48  104:getfield        #17  <Field be a>
	//   49  107:getfield        #25  <Field CircleButton be.Q>
	//   50  110:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//   51  113:invokevirtual   #76  <Method void android.widget.RelativeLayout$LayoutParams.setMarginEnd(int)>
		a.T.setLayoutParams(((android.view.roup.LayoutParams) (layoutparams)));
	//   52  116:aload_0         
	//   53  117:getfield        #17  <Field be a>
	//   54  120:getfield        #41  <Field PercentageRingView be.T>
	//   55  123:aload_1         
	//   56  124:invokevirtual   #80  <Method void PercentageRingView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		layoutparams = (android.widget.iveLayout.LayoutParams)a.aa.getLayoutParams();
	//   57  127:aload_0         
	//   58  128:getfield        #17  <Field be a>
	//   59  131:getfield        #84  <Field ImageView be.aa>
	//   60  134:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   61  137:checkcast       #49  <Class android.widget.RelativeLayout$LayoutParams>
	//   62  140:astore_1        
		layoutparams.height = a.Q.getButtonRadius() * 2;
	//   63  141:aload_1         
	//   64  142:aload_0         
	//   65  143:getfield        #17  <Field be a>
	//   66  146:getfield        #25  <Field CircleButton be.Q>
	//   67  149:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
	//   68  152:iconst_2        
	//   69  153:imul            
	//   70  154:putfield        #57  <Field int android.widget.RelativeLayout$LayoutParams.height>
		layoutparams.width = a.Q.getButtonRadius() * 2;
	//   71  157:aload_1         
	//   72  158:aload_0         
	//   73  159:getfield        #17  <Field be a>
	//   74  162:getfield        #25  <Field CircleButton be.Q>
	//   75  165:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
	//   76  168:iconst_2        
	//   77  169:imul            
	//   78  170:putfield        #60  <Field int android.widget.RelativeLayout$LayoutParams.width>
		layoutparams.topMargin = a.Q.getPressedHighlightWidth();
	//   79  173:aload_1         
	//   80  174:aload_0         
	//   81  175:getfield        #17  <Field be a>
	//   82  178:getfield        #25  <Field CircleButton be.Q>
	//   83  181:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//   84  184:putfield        #66  <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
		layoutparams.bottomMargin = a.Q.getPressedHighlightWidth();
	//   85  187:aload_1         
	//   86  188:aload_0         
	//   87  189:getfield        #17  <Field be a>
	//   88  192:getfield        #25  <Field CircleButton be.Q>
	//   89  195:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//   90  198:putfield        #69  <Field int android.widget.RelativeLayout$LayoutParams.bottomMargin>
		layoutparams.setMarginStart(a.Q.getPressedHighlightWidth());
	//   91  201:aload_1         
	//   92  202:aload_0         
	//   93  203:getfield        #17  <Field be a>
	//   94  206:getfield        #25  <Field CircleButton be.Q>
	//   95  209:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//   96  212:invokevirtual   #73  <Method void android.widget.RelativeLayout$LayoutParams.setMarginStart(int)>
		layoutparams.setMarginEnd(a.Q.getPressedHighlightWidth());
	//   97  215:aload_1         
	//   98  216:aload_0         
	//   99  217:getfield        #17  <Field be a>
	//  100  220:getfield        #25  <Field CircleButton be.Q>
	//  101  223:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
	//  102  226:invokevirtual   #76  <Method void android.widget.RelativeLayout$LayoutParams.setMarginEnd(int)>
		a.aa.setLayoutParams(((android.view.roup.LayoutParams) (layoutparams)));
	//  103  229:aload_0         
	//  104  230:getfield        #17  <Field be a>
	//  105  233:getfield        #84  <Field ImageView be.aa>
	//  106  236:aload_1         
	//  107  237:invokevirtual   #88  <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  108  240:return          
	}

	final be a;

	be$3(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
