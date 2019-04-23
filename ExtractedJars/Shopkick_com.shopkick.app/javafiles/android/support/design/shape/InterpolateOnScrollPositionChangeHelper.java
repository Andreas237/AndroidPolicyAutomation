// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

// Referenced classes of package android.support.design.shape:
//			MaterialShapeDrawable

public class InterpolateOnScrollPositionChangeHelper
{

	public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialshapedrawable, ScrollView scrollview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #27  <Field int[] scrollLocation>
	//    6   11:aload_0         
	//    7   12:iconst_2        
	//    8   13:newarray        int[]
	//    9   15:putfield        #29  <Field int[] containerLocation>
	//   10   18:aload_0         
	//   11   19:new             #6   <Class InterpolateOnScrollPositionChangeHelper$1>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokespecial   #32  <Method void InterpolateOnScrollPositionChangeHelper$1(InterpolateOnScrollPositionChangeHelper)>
	//   15   27:putfield        #34  <Field android.view.ViewTreeObserver$OnScrollChangedListener scrollChangedListener>
		shapedView = view;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #36  <Field View shapedView>
		materialShapeDrawable = materialshapedrawable;
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:putfield        #38  <Field MaterialShapeDrawable materialShapeDrawable>
		containingScrollView = scrollview;
	//   22   40:aload_0         
	//   23   41:aload_3         
	//   24   42:putfield        #40  <Field ScrollView containingScrollView>
	//   25   45:return          
	}

	public void setContainingScrollView(ScrollView scrollview)
	{
		containingScrollView = scrollview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field ScrollView containingScrollView>
	//    3    5:return          
	}

	public void setMaterialShapeDrawable(MaterialShapeDrawable materialshapedrawable)
	{
		materialShapeDrawable = materialshapedrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field MaterialShapeDrawable materialShapeDrawable>
	//    3    5:return          
	}

	public void startListeningForScrollChanges(ViewTreeObserver viewtreeobserver)
	{
		viewtreeobserver.addOnScrollChangedListener(scrollChangedListener);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field android.view.ViewTreeObserver$OnScrollChangedListener scrollChangedListener>
	//    3    5:invokevirtual   #53  <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    4    8:return          
	}

	public void stopListeningForScrollChanges(ViewTreeObserver viewtreeobserver)
	{
		viewtreeobserver.removeOnScrollChangedListener(scrollChangedListener);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field android.view.ViewTreeObserver$OnScrollChangedListener scrollChangedListener>
	//    3    5:invokevirtual   #57  <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    4    8:return          
	}

	public void updateInterpolationForScreenPosition()
	{
		ScrollView scrollview = containingScrollView;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ScrollView containingScrollView>
	//    2    4:astore          4
		if(scrollview == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(scrollview.getChildCount() != 0)
	//*   6   12:aload           4
	//*   7   14:invokevirtual   #64  <Method int ScrollView.getChildCount()>
	//*   8   17:ifeq            187
		{
			containingScrollView.getLocationInWindow(scrollLocation);
	//    9   20:aload_0         
	//   10   21:getfield        #40  <Field ScrollView containingScrollView>
	//   11   24:aload_0         
	//   12   25:getfield        #27  <Field int[] scrollLocation>
	//   13   28:invokevirtual   #68  <Method void ScrollView.getLocationInWindow(int[])>
			containingScrollView.getChildAt(0).getLocationInWindow(containerLocation);
	//   14   31:aload_0         
	//   15   32:getfield        #40  <Field ScrollView containingScrollView>
	//   16   35:iconst_0        
	//   17   36:invokevirtual   #72  <Method View ScrollView.getChildAt(int)>
	//   18   39:aload_0         
	//   19   40:getfield        #29  <Field int[] containerLocation>
	//   20   43:invokevirtual   #75  <Method void View.getLocationInWindow(int[])>
			int k = (shapedView.getTop() - scrollLocation[1]) + containerLocation[1];
	//   21   46:aload_0         
	//   22   47:getfield        #36  <Field View shapedView>
	//   23   50:invokevirtual   #78  <Method int View.getTop()>
	//   24   53:aload_0         
	//   25   54:getfield        #27  <Field int[] scrollLocation>
	//   26   57:iconst_1        
	//   27   58:iaload          
	//   28   59:isub            
	//   29   60:aload_0         
	//   30   61:getfield        #29  <Field int[] containerLocation>
	//   31   64:iconst_1        
	//   32   65:iaload          
	//   33   66:iadd            
	//   34   67:istore_3        
			int i = shapedView.getHeight();
	//   35   68:aload_0         
	//   36   69:getfield        #36  <Field View shapedView>
	//   37   72:invokevirtual   #81  <Method int View.getHeight()>
	//   38   75:istore_1        
			int j = containingScrollView.getHeight();
	//   39   76:aload_0         
	//   40   77:getfield        #40  <Field ScrollView containingScrollView>
	//   41   80:invokevirtual   #82  <Method int ScrollView.getHeight()>
	//   42   83:istore_2        
			if(k < 0)
	//*  43   84:iload_3         
	//*  44   85:ifge            118
			{
				materialShapeDrawable.setInterpolation(Math.max(0.0F, Math.min(1.0F, (float)k / (float)i + 1.0F)));
	//   45   88:aload_0         
	//   46   89:getfield        #38  <Field MaterialShapeDrawable materialShapeDrawable>
	//   47   92:fconst_0        
	//   48   93:fconst_1        
	//   49   94:iload_3         
	//   50   95:i2f             
	//   51   96:iload_1         
	//   52   97:i2f             
	//   53   98:fdiv            
	//   54   99:fconst_1        
	//   55  100:fadd            
	//   56  101:invokestatic    #88  <Method float Math.min(float, float)>
	//   57  104:invokestatic    #91  <Method float Math.max(float, float)>
	//   58  107:invokevirtual   #97  <Method void MaterialShapeDrawable.setInterpolation(float)>
				shapedView.invalidate();
	//   59  110:aload_0         
	//   60  111:getfield        #36  <Field View shapedView>
	//   61  114:invokevirtual   #100 <Method void View.invalidate()>
				return;
	//   62  117:return          
			}
			k += i;
	//   63  118:iload_3         
	//   64  119:iload_1         
	//   65  120:iadd            
	//   66  121:istore_3        
			if(k > j)
	//*  67  122:iload_3         
	//*  68  123:iload_2         
	//*  69  124:icmple          159
			{
				materialShapeDrawable.setInterpolation(Math.max(0.0F, Math.min(1.0F, 1.0F - (float)(k - j) / (float)i)));
	//   70  127:aload_0         
	//   71  128:getfield        #38  <Field MaterialShapeDrawable materialShapeDrawable>
	//   72  131:fconst_0        
	//   73  132:fconst_1        
	//   74  133:fconst_1        
	//   75  134:iload_3         
	//   76  135:iload_2         
	//   77  136:isub            
	//   78  137:i2f             
	//   79  138:iload_1         
	//   80  139:i2f             
	//   81  140:fdiv            
	//   82  141:fsub            
	//   83  142:invokestatic    #88  <Method float Math.min(float, float)>
	//   84  145:invokestatic    #91  <Method float Math.max(float, float)>
	//   85  148:invokevirtual   #97  <Method void MaterialShapeDrawable.setInterpolation(float)>
				shapedView.invalidate();
	//   86  151:aload_0         
	//   87  152:getfield        #36  <Field View shapedView>
	//   88  155:invokevirtual   #100 <Method void View.invalidate()>
				return;
	//   89  158:return          
			}
			if(materialShapeDrawable.getInterpolation() != 1.0F)
	//*  90  159:aload_0         
	//*  91  160:getfield        #38  <Field MaterialShapeDrawable materialShapeDrawable>
	//*  92  163:invokevirtual   #104 <Method float MaterialShapeDrawable.getInterpolation()>
	//*  93  166:fconst_1        
	//*  94  167:fcmpl           
	//*  95  168:ifeq            186
			{
				materialShapeDrawable.setInterpolation(1.0F);
	//   96  171:aload_0         
	//   97  172:getfield        #38  <Field MaterialShapeDrawable materialShapeDrawable>
	//   98  175:fconst_1        
	//   99  176:invokevirtual   #97  <Method void MaterialShapeDrawable.setInterpolation(float)>
				shapedView.invalidate();
	//  100  179:aload_0         
	//  101  180:getfield        #36  <Field View shapedView>
	//  102  183:invokevirtual   #100 <Method void View.invalidate()>
			}
			return;
	//  103  186:return          
		} else
		{
			throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
	//  104  187:new             #106 <Class IllegalStateException>
	//  105  190:dup             
	//  106  191:ldc1            #108 <String "Scroll bar must contain a child to calculate interpolation.">
	//  107  193:invokespecial   #111 <Method void IllegalStateException(String)>
	//  108  196:athrow          
		}
	}

	private final int containerLocation[] = new int[2];
	private ScrollView containingScrollView;
	private MaterialShapeDrawable materialShapeDrawable;
	private final android.view.ViewTreeObserver.OnScrollChangedListener scrollChangedListener = new android.view.ViewTreeObserver.OnScrollChangedListener() {

		public void onScrollChanged()
		{
			updateInterpolationForScreenPosition();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field InterpolateOnScrollPositionChangeHelper this$0>
		//    2    4:invokevirtual   #22  <Method void InterpolateOnScrollPositionChangeHelper.updateInterpolationForScreenPosition()>
		//    3    7:return          
		}

		final InterpolateOnScrollPositionChangeHelper this$0;

			
			{
				this$0 = InterpolateOnScrollPositionChangeHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field InterpolateOnScrollPositionChangeHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final int scrollLocation[] = new int[2];
	private View shapedView;
}
