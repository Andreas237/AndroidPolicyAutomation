// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			CSS

class CSS$1
	implements Runnable
{

	public void run()
	{
		Object obj = CSS.access$200(CSS.this).getElementForNodeId(val$request.nodeId);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CSS this$0>
	//    2    4:invokestatic    #36  <Method Document CSS.access$200(CSS)>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field CSS$GetComputedStyleForNodeRequest val$request>
	//    5   11:getfield        #42  <Field int CSS$GetComputedStyleForNodeRequest.nodeId>
	//    6   14:invokevirtual   #48  <Method Object Document.getElementForNodeId(int)>
	//    7   17:astore_1        
		if(obj == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       57
		{
			obj = ((Object) (new StringBuilder()));
	//   10   22:new             #50  <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #51  <Method void StringBuilder()>
	//   13   29:astore_1        
			((StringBuilder) (obj)).append("Tried to get the style of an element that does not exist, using nodeid=");
	//   14   30:aload_1         
	//   15   31:ldc1            #53  <String "Tried to get the style of an element that does not exist, using nodeid=">
	//   16   33:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			((StringBuilder) (obj)).append(val$request.nodeId);
	//   18   37:aload_1         
	//   19   38:aload_0         
	//   20   39:getfield        #25  <Field CSS$GetComputedStyleForNodeRequest val$request>
	//   21   42:getfield        #42  <Field int CSS$GetComputedStyleForNodeRequest.nodeId>
	//   22   45:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   23   48:pop             
			LogUtil.e(((StringBuilder) (obj)).toString());
	//   24   49:aload_1         
	//   25   50:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   53:invokestatic    #70  <Method void LogUtil.e(String)>
			return;
	//   27   56:return          
		} else
		{
			CSS.access$200(CSS.this).getElementStyles(obj, new StyleAccumulator() {

				public void store(String s, String s1, boolean flag)
				{
					if(!flag)
				//*   0    0:iload_3         
				//*   1    1:ifne            44
					{
						CSS.CSSComputedStyleProperty csscomputedstyleproperty = new CSS.CSSComputedStyleProperty(((CSS._cls1) (null)));
				//    2    4:new             #24  <Class CSS$CSSComputedStyleProperty>
				//    3    7:dup             
				//    4    8:aconst_null     
				//    5    9:invokespecial   #26  <Method void CSS$CSSComputedStyleProperty(CSS$1)>
				//    6   12:astore          4
						csscomputedstyleproperty.name = s;
				//    7   14:aload           4
				//    8   16:aload_1         
				//    9   17:putfield        #30  <Field String CSS$CSSComputedStyleProperty.name>
						csscomputedstyleproperty.value = s1;
				//   10   20:aload           4
				//   11   22:aload_2         
				//   12   23:putfield        #33  <Field String CSS$CSSComputedStyleProperty.value>
						result.computedStyle.add(((Object) (csscomputedstyleproperty)));
				//   13   26:aload_0         
				//   14   27:getfield        #17  <Field CSS$1 this$1>
				//   15   30:getfield        #37  <Field CSS$GetComputedStyleForNodeResult CSS$1.val$result>
				//   16   33:getfield        #43  <Field List CSS$GetComputedStyleForNodeResult.computedStyle>
				//   17   36:aload           4
				//   18   38:invokeinterface #49  <Method boolean List.add(Object)>
				//   19   43:pop             
					}
				//   20   44:return          
				}

				final CSS._cls1 this$1;

			
			{
				this$1 = CSS._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CSS$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   28   57:aload_0         
	//   29   58:getfield        #23  <Field CSS this$0>
	//   30   61:invokestatic    #36  <Method Document CSS.access$200(CSS)>
	//   31   64:aload_1         
	//   32   65:new             #13  <Class CSS$1$1>
	//   33   68:dup             
	//   34   69:aload_0         
	//   35   70:invokespecial   #73  <Method void CSS$1$1(CSS$1)>
	//   36   73:invokevirtual   #77  <Method void Document.getElementStyles(Object, StyleAccumulator)>
			return;
	//   37   76:return          
		}
	}

	final CSS this$0;
	final tComputedStyleForNodeRequest val$request;
	final tComputedStyleForNodeResult val$result;

	CSS$1()
	{
		this$0 = final_css;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CSS this$0>
		val$request = tcomputedstylefornoderequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field CSS$GetComputedStyleForNodeRequest val$request>
		val$result = tComputedStyleForNodeResult.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field CSS$GetComputedStyleForNodeResult val$result>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
