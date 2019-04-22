// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.contentevents;

import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.mvp.base.MvpActivity;
import com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel;
import com.ibotta.android.mvp.ui.dialog.FullScreenImageDialog;
import com.ibotta.android.routing.intent.*;
import com.ibotta.api.model.RetailerModel;

// Referenced classes of package com.ibotta.android.mvp.base.contentevents:
//			ContentEventsView

public abstract class ContentEventsActivity extends MvpActivity
	implements ContentEventsView
{

	public ContentEventsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void MvpActivity()>
	//    2    4:return          
	}

	public void showContentDetail(ContentId contentid)
	{
		startActivity((new ContentDetailIntentCreator(((android.content.Context) (this)), contentid)).create());
	//    0    0:aload_0         
	//    1    1:new             #19  <Class ContentDetailIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #22  <Method void ContentDetailIntentCreator(android.content.Context, ContentId)>
	//    6   10:invokevirtual   #26  <Method android.content.Intent ContentDetailIntentCreator.create()>
	//    7   13:invokevirtual   #30  <Method void startActivity(android.content.Intent)>
	//    8   16:return          
	}

	public void showDealDetail(String s)
	{
		startActivity((new DealIntentCreator(((android.content.Context) (this)), s)).create());
	//    0    0:aload_0         
	//    1    1:new             #34  <Class DealIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #37  <Method void DealIntentCreator(android.content.Context, String)>
	//    6   10:invokevirtual   #38  <Method android.content.Intent DealIntentCreator.create()>
	//    7   13:invokevirtual   #30  <Method void startActivity(android.content.Intent)>
	//    8   16:return          
	}

	public void showEngagement(int i, Integer integer)
	{
		startActivityForResult((new EngagementIntentCreator(((android.content.Context) (this)), i)).retailerId(integer).create(), 3);
	//    0    0:aload_0         
	//    1    1:new             #43  <Class EngagementIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #46  <Method void EngagementIntentCreator(android.content.Context, int)>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #50  <Method EngagementIntentCreator EngagementIntentCreator.retailerId(Integer)>
	//    8   14:invokevirtual   #51  <Method android.content.Intent EngagementIntentCreator.create()>
	//    9   17:iconst_3        
	//   10   18:invokevirtual   #55  <Method void startActivityForResult(android.content.Intent, int)>
	//   11   21:return          
	}

	public void showFullScreenImage(String s)
	{
		FullScreenImageDialog fullscreenimagedialog = new FullScreenImageDialog(((android.content.Context) (this)));
	//    0    0:new             #59  <Class FullScreenImageDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void FullScreenImageDialog(android.content.Context)>
	//    4    8:astore_2        
		fullscreenimagedialog.setImageUrl(s);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #65  <Method void FullScreenImageDialog.setImageUrl(String)>
		fullscreenimagedialog.show();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #68  <Method void FullScreenImageDialog.show()>
	//   10   18:return          
	}

	public void showMcommEscort(McommEscortParamsParcel mcommescortparamsparcel)
	{
		startActivity((new MCommEscortIntentCreator(((android.content.Context) (this)), mcommescortparamsparcel)).create());
	//    0    0:aload_0         
	//    1    1:new             #72  <Class MCommEscortIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #75  <Method void MCommEscortIntentCreator(android.content.Context, McommEscortParamsParcel)>
	//    6   10:invokevirtual   #76  <Method android.content.Intent MCommEscortIntentCreator.create()>
	//    7   13:invokevirtual   #30  <Method void startActivity(android.content.Intent)>
	//    8   16:return          
	}

	public transient void showOfferSpotlight(Integer integer, Integer integer1, int ai[])
	{
		startActivity((new SpotlightIntentCreator(((android.content.Context) (this)))).offerIds(ai).retailerId(integer).retailerCategoryId(integer1).create());
	//    0    0:aload_0         
	//    1    1:new             #80  <Class SpotlightIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #81  <Method void SpotlightIntentCreator(android.content.Context)>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #85  <Method SpotlightIntentCreator SpotlightIntentCreator.offerIds(int[])>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #88  <Method SpotlightIntentCreator SpotlightIntentCreator.retailerId(Integer)>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #91  <Method SpotlightIntentCreator SpotlightIntentCreator.retailerCategoryId(Integer)>
	//   11   21:invokevirtual   #92  <Method android.content.Intent SpotlightIntentCreator.create()>
	//   12   24:invokevirtual   #30  <Method void startActivity(android.content.Intent)>
	//   13   27:return          
	}

	public void showProductDetail(String s)
	{
		startActivity((new ProductIntentCreator(((android.content.Context) (this)), s)).create());
	//    0    0:aload_0         
	//    1    1:new             #95  <Class ProductIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #96  <Method void ProductIntentCreator(android.content.Context, String)>
	//    6   10:invokevirtual   #97  <Method android.content.Intent ProductIntentCreator.create()>
	//    7   13:invokevirtual   #30  <Method void startActivity(android.content.Intent)>
	//    8   16:return          
	}

	public void showRetailerGallery(RetailerModel retailermodel, RetailerCategoryParcel retailercategoryparcel)
	{
		GalleryIntentCreator galleryintentcreator = new GalleryIntentCreator(((android.content.Context) (this)), retailerParcelHelper.toRetailerParcel(retailermodel));
	//    0    0:new             #101 <Class GalleryIntentCreator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #103 <Field RetailerParcelHelper retailerParcelHelper>
	//    5    9:aload_1         
	//    6   10:invokeinterface #109 <Method com.ibotta.android.fragment.retailer.RetailerParcel RetailerParcelHelper.toRetailerParcel(RetailerModel)>
	//    7   15:invokespecial   #112 <Method void GalleryIntentCreator(android.content.Context, com.ibotta.android.fragment.retailer.RetailerParcel)>
	//    8   18:astore_3        
		if(getNavButtonType() != null)
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #116 <Method com.ibotta.android.mvp.ui.view.nav.NavButtonType getNavButtonType()>
	//*  11   23:ifnull          35
			galleryintentcreator.tabContext(getNavButtonType());
	//   12   26:aload_3         
	//   13   27:aload_0         
	//   14   28:invokevirtual   #116 <Method com.ibotta.android.mvp.ui.view.nav.NavButtonType getNavButtonType()>
	//   15   31:invokevirtual   #120 <Method GalleryIntentCreator GalleryIntentCreator.tabContext(com.ibotta.android.mvp.ui.view.nav.NavButtonType)>
	//   16   34:pop             
		retailermodel = ((RetailerModel) (galleryintentcreator));
	//   17   35:aload_3         
	//   18   36:astore_1        
		if(retailercategoryparcel != null)
	//*  19   37:aload_2         
	//*  20   38:ifnull          50
			retailermodel = ((RetailerModel) (galleryintentcreator.retailerCategoryId(retailercategoryparcel.getId())));
	//   21   41:aload_3         
	//   22   42:aload_2         
	//   23   43:invokevirtual   #126 <Method int RetailerCategoryParcel.getId()>
	//   24   46:invokevirtual   #129 <Method GalleryIntentCreator GalleryIntentCreator.retailerCategoryId(int)>
	//   25   49:astore_1        
		startActivity(((GalleryIntentCreator) (retailermodel)).create());
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #130 <Method android.content.Intent GalleryIntentCreator.create()>
	//   29   55:invokevirtual   #30  <Method void startActivity(android.content.Intent)>
	//   30   58:return          
	}

	RetailerParcelHelper retailerParcelHelper;
}
