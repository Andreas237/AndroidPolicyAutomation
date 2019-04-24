// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import com.pactforcure.app.databinding.ActivityDashboardBinding;

// Referenced classes of package com.pactforcure.app.ui:
//			DashboardActivity

class DashboardActivity$1
	implements android.support.design.widget.tedListener
{

	public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
	{
	//    0    0:return          
	}

	public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
	{
		byte byte0;
		tab.setText(((CharSequence) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #43  <Method android.support.design.widget.TabLayout$Tab android.support.design.widget.TabLayout$Tab.setText(CharSequence)>
	//    3    5:pop             
		tab = ((android.support.design.widget.TabLayout.Tab) ((String)tab.getTag()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #47  <Method Object android.support.design.widget.TabLayout$Tab.getTag()>
	//    6   10:checkcast       #49  <Class String>
	//    7   13:astore_1        
		if(tab == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       19
			return;
	//   10   18:return          
		byte0 = -1;
	//   11   19:iconst_m1       
	//   12   20:istore_2        
		((String) (tab)).hashCode();
	//   13   21:aload_1         
	//   14   22:invokevirtual   #53  <Method int String.hashCode()>
		JVM INSTR lookupswitch 2: default 52
	//	               -187576048: 126
	//	               -180308421: 140;
	//   15   25:lookupswitch    2: default 52
	//	               -187576048: 126
	//	               -180308421: 140
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
_L3:
		break MISSING_BLOCK_LABEL_140;
_L4:
		switch(byte0)
	//*  16   52:iload_2         
		{
	//*  17   53:tableswitch     0 1: default 76
	//	               0 77
	//	               1 154
		default:
			return;
	//   18   76:return          

		case 0: // '\0'
			val$surveyImageContainer.setVisibility(0);
	//   19   77:aload_0         
	//   20   78:getfield        #24  <Field ViewGroup val$surveyImageContainer>
	//   21   81:iconst_0        
	//   22   82:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
			val$surveyTextContainer.setVisibility(8);
	//   23   85:aload_0         
	//   24   86:getfield        #26  <Field ViewGroup val$surveyTextContainer>
	//   25   89:bipush          8
	//   26   91:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
			val$resourcesImageContainer.setVisibility(8);
	//   27   94:aload_0         
	//   28   95:getfield        #28  <Field ViewGroup val$resourcesImageContainer>
	//   29   98:bipush          8
	//   30  100:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
			val$resourcesTextContainer.setVisibility(0);
	//   31  103:aload_0         
	//   32  104:getfield        #30  <Field ViewGroup val$resourcesTextContainer>
	//   33  107:iconst_0        
	//   34  108:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
			DashboardActivity.access$000(DashboardActivity.this).viewPager.setCurrentItem(0);
	//   35  111:aload_0         
	//   36  112:getfield        #22  <Field DashboardActivity this$0>
	//   37  115:invokestatic    #63  <Method ActivityDashboardBinding DashboardActivity.access$000(DashboardActivity)>
	//   38  118:getfield        #69  <Field ViewPager ActivityDashboardBinding.viewPager>
	//   39  121:iconst_0        
	//   40  122:invokevirtual   #74  <Method void ViewPager.setCurrentItem(int)>
			return;
	//   41  125:return          

	//*  42  126:aload_1         
	//*  43  127:ldc1            #76  <String "SURVEY_TAB">
	//*  44  129:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  45  132:ifeq            52
	//*  46  135:iconst_0        
	//*  47  136:istore_2        
	//*  48  137:goto            52
	//*  49  140:aload_1         
	//*  50  141:ldc1            #82  <String "RESOURCES_TAB">
	//*  51  143:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  52  146:ifeq            52
	//*  53  149:iconst_1        
	//*  54  150:istore_2        
	//*  55  151:goto            52
		case 1: // '\001'
			val$surveyImageContainer.setVisibility(8);
	//   56  154:aload_0         
	//   57  155:getfield        #24  <Field ViewGroup val$surveyImageContainer>
	//   58  158:bipush          8
	//   59  160:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
			break;
		}
		break MISSING_BLOCK_LABEL_163;
_L2:
		if(((String) (tab)).equals("SURVEY_TAB"))
			byte0 = 0;
		  goto _L4
		if(((String) (tab)).equals("RESOURCES_TAB"))
			byte0 = 1;
		  goto _L4
		val$surveyTextContainer.setVisibility(0);
	//   60  163:aload_0         
	//   61  164:getfield        #26  <Field ViewGroup val$surveyTextContainer>
	//   62  167:iconst_0        
	//   63  168:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
		val$resourcesImageContainer.setVisibility(0);
	//   64  171:aload_0         
	//   65  172:getfield        #28  <Field ViewGroup val$resourcesImageContainer>
	//   66  175:iconst_0        
	//   67  176:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
		val$resourcesTextContainer.setVisibility(8);
	//   68  179:aload_0         
	//   69  180:getfield        #30  <Field ViewGroup val$resourcesTextContainer>
	//   70  183:bipush          8
	//   71  185:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
		DashboardActivity.access$000(DashboardActivity.this).viewPager.setCurrentItem(1);
	//   72  188:aload_0         
	//   73  189:getfield        #22  <Field DashboardActivity this$0>
	//   74  192:invokestatic    #63  <Method ActivityDashboardBinding DashboardActivity.access$000(DashboardActivity)>
	//   75  195:getfield        #69  <Field ViewPager ActivityDashboardBinding.viewPager>
	//   76  198:iconst_1        
	//   77  199:invokevirtual   #74  <Method void ViewPager.setCurrentItem(int)>
		return;
	//   78  202:return          
	}

	public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
	{
	//    0    0:return          
	}

	final DashboardActivity this$0;
	final ViewGroup val$resourcesImageContainer;
	final ViewGroup val$resourcesTextContainer;
	final ViewGroup val$surveyImageContainer;
	final ViewGroup val$surveyTextContainer;

	DashboardActivity$1()
	{
		this$0 = final_dashboardactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DashboardActivity this$0>
		val$surveyImageContainer = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ViewGroup val$surveyImageContainer>
		val$surveyTextContainer = viewgroup1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field ViewGroup val$surveyTextContainer>
		val$resourcesImageContainer = viewgroup2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field ViewGroup val$resourcesImageContainer>
		val$resourcesTextContainer = ViewGroup.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #30  <Field ViewGroup val$resourcesTextContainer>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #33  <Method void Object()>
	//   17   31:return          
	}
}
