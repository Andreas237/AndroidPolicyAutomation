// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.amap.api.mapcore.util.cy;
import java.util.List;

// Referenced classes of package com.amap.api.maps.model:
//			BuildingOverlayOptions

public class BuildingOverlay
{

	public BuildingOverlay(cy cy1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = cy1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field cy a>
	//    5    9:return          
	}

	public void destroy()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          16
			a.destroy();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:invokeinterface #19  <Method void cy.destroy()>
	//    6   16:return          
	}

	public List getCustomOptions()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			return a.b();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:invokeinterface #24  <Method List cy.b()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public BuildingOverlayOptions getDefaultOptions()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			return a.d();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:invokeinterface #31  <Method BuildingOverlayOptions cy.d()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public String getId()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			return a.getId();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:invokeinterface #35  <Method String cy.getId()>
	//    6   16:areturn         
		else
			return "";
	//    7   17:ldc1            #37  <String "">
	//    8   19:areturn         
	}

	public float getZIndex()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			return a.getZIndex();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:invokeinterface #41  <Method float cy.getZIndex()>
	//    6   16:freturn         
		else
			return 0.0F;
	//    7   17:fconst_0        
	//    8   18:freturn         
	}

	public boolean isVisible()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			return a.isVisible();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:invokeinterface #45  <Method boolean cy.isVisible()>
	//    6   16:ireturn         
		else
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public void setCustomOptions(List list)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			a.a(list);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #49  <Method void cy.a(List)>
	//    7   17:return          
	}

	public void setDefaultOptions(BuildingOverlayOptions buildingoverlayoptions)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			a.a(buildingoverlayoptions);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #54  <Method void cy.a(BuildingOverlayOptions)>
	//    7   17:return          
	}

	public void setVisible(boolean flag)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			a.setVisible(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:iload_1         
	//    6   12:invokeinterface #58  <Method void cy.setVisible(boolean)>
	//    7   17:return          
	}

	public void setZIndex(float f)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field cy a>
	//*   2    4:ifnull          17
			a.setZIndex(f);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field cy a>
	//    5   11:fload_1         
	//    6   12:invokeinterface #62  <Method void cy.setZIndex(float)>
	//    7   17:return          
	}

	private cy a;
}
