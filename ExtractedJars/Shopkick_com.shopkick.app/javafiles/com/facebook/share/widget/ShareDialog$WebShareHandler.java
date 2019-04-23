// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.net.Uri;
import com.facebook.internal.*;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.*;
import java.util.*;

// Referenced classes of package com.facebook.share.widget:
//			ShareDialog

private class ShareDialog$WebShareHandler extends com.facebook.internal.er
{

	private SharePhotoContent createAndMapAttachments(SharePhotoContent sharephotocontent, UUID uuid)
	{
		com.facebook.share.model.SharePhotoContent.Builder builder = (new com.facebook.share.model.SharePhotoContent.Builder()).readFrom(sharephotocontent);
	//    0    0:new             #25  <Class com.facebook.share.model.SharePhotoContent$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void com.facebook.share.model.SharePhotoContent$Builder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method com.facebook.share.model.SharePhotoContent$Builder com.facebook.share.model.SharePhotoContent$Builder.readFrom(SharePhotoContent)>
	//    5   11:astore          6
		ArrayList arraylist = new ArrayList();
	//    6   13:new             #34  <Class ArrayList>
	//    7   16:dup             
	//    8   17:invokespecial   #35  <Method void ArrayList()>
	//    9   20:astore          7
		ArrayList arraylist1 = new ArrayList();
	//   10   22:new             #34  <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #35  <Method void ArrayList()>
	//   13   29:astore          8
		for(int i = 0; i < sharephotocontent.getPhotos().size(); i++)
	//*  14   31:iconst_0        
	//*  15   32:istore_3        
	//*  16   33:iload_3         
	//*  17   34:aload_1         
	//*  18   35:invokevirtual   #41  <Method List SharePhotoContent.getPhotos()>
	//*  19   38:invokeinterface #47  <Method int List.size()>
	//*  20   43:icmpge          144
		{
			SharePhoto sharephoto1 = (SharePhoto)sharephotocontent.getPhotos().get(i);
	//   21   46:aload_1         
	//   22   47:invokevirtual   #41  <Method List SharePhotoContent.getPhotos()>
	//   23   50:iload_3         
	//   24   51:invokeinterface #51  <Method Object List.get(int)>
	//   25   56:checkcast       #53  <Class SharePhoto>
	//   26   59:astore          5
			Object obj = ((Object) (sharephoto1.getBitmap()));
	//   27   61:aload           5
	//   28   63:invokevirtual   #57  <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//   29   66:astore          9
			SharePhoto sharephoto = sharephoto1;
	//   30   68:aload           5
	//   31   70:astore          4
			if(obj != null)
	//*  32   72:aload           9
	//*  33   74:ifnull          127
			{
				obj = ((Object) (NativeAppCallAttachmentStore.createAttachment(uuid, ((android.graphics.Bitmap) (obj)))));
	//   34   77:aload_2         
	//   35   78:aload           9
	//   36   80:invokestatic    #63  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment NativeAppCallAttachmentStore.createAttachment(UUID, android.graphics.Bitmap)>
	//   37   83:astore          9
				sharephoto = (new com.facebook.share.model.SharePhoto.Builder()).readFrom(sharephoto1).setImageUrl(Uri.parse(((com.facebook.internal..Attachment) (obj)).getAttachmentUrl())).setBitmap(((android.graphics.Bitmap) (null))).build();
	//   38   85:new             #65  <Class com.facebook.share.model.SharePhoto$Builder>
	//   39   88:dup             
	//   40   89:invokespecial   #66  <Method void com.facebook.share.model.SharePhoto$Builder()>
	//   41   92:aload           5
	//   42   94:invokevirtual   #69  <Method com.facebook.share.model.SharePhoto$Builder com.facebook.share.model.SharePhoto$Builder.readFrom(SharePhoto)>
	//   43   97:aload           9
	//   44   99:invokevirtual   #75  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
	//   45  102:invokestatic    #81  <Method Uri Uri.parse(String)>
	//   46  105:invokevirtual   #85  <Method com.facebook.share.model.SharePhoto$Builder com.facebook.share.model.SharePhoto$Builder.setImageUrl(Uri)>
	//   47  108:aconst_null     
	//   48  109:invokevirtual   #89  <Method com.facebook.share.model.SharePhoto$Builder com.facebook.share.model.SharePhoto$Builder.setBitmap(android.graphics.Bitmap)>
	//   49  112:invokevirtual   #93  <Method SharePhoto com.facebook.share.model.SharePhoto$Builder.build()>
	//   50  115:astore          4
				((List) (arraylist1)).add(obj);
	//   51  117:aload           8
	//   52  119:aload           9
	//   53  121:invokeinterface #97  <Method boolean List.add(Object)>
	//   54  126:pop             
			}
			((List) (arraylist)).add(((Object) (sharephoto)));
	//   55  127:aload           7
	//   56  129:aload           4
	//   57  131:invokeinterface #97  <Method boolean List.add(Object)>
	//   58  136:pop             
		}

	//   59  137:iload_3         
	//   60  138:iconst_1        
	//   61  139:iadd            
	//   62  140:istore_3        
	//*  63  141:goto            33
		builder.setPhotos(((List) (arraylist)));
	//   64  144:aload           6
	//   65  146:aload           7
	//   66  148:invokevirtual   #101 <Method com.facebook.share.model.SharePhotoContent$Builder com.facebook.share.model.SharePhotoContent$Builder.setPhotos(List)>
	//   67  151:pop             
		NativeAppCallAttachmentStore.addAttachments(((java.util.Collection) (arraylist1)));
	//   68  152:aload           8
	//   69  154:invokestatic    #105 <Method void NativeAppCallAttachmentStore.addAttachments(java.util.Collection)>
		return builder.build();
	//   70  157:aload           6
	//   71  159:invokevirtual   #108 <Method SharePhotoContent com.facebook.share.model.SharePhotoContent$Builder.build()>
	//   72  162:areturn         
	}

	private String getActionName(ShareContent sharecontent)
	{
		if(!(sharecontent instanceof ShareLinkContent) && !(sharecontent instanceof SharePhotoContent))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #112 <Class ShareLinkContent>
	//*   2    4:ifne            29
	//*   3    7:aload_1         
	//*   4    8:instanceof      #37  <Class SharePhotoContent>
	//*   5   11:ifeq            17
	//*   6   14:goto            29
		{
			if(sharecontent instanceof ShareOpenGraphContent)
	//*   7   17:aload_1         
	//*   8   18:instanceof      #114 <Class ShareOpenGraphContent>
	//*   9   21:ifeq            27
				return "share_open_graph";
	//   10   24:ldc1            #116 <String "share_open_graph">
	//   11   26:areturn         
			else
				return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
		} else
		{
			return "share";
	//   14   29:ldc1            #118 <String "share">
	//   15   31:areturn         
		}
	}

	public boolean canShow(ShareContent sharecontent, boolean flag)
	{
		return sharecontent != null && ShareDialog.access$900(sharecontent);
	//    0    0:aload_1         
	//    1    1:ifnull          13
	//    2    4:aload_1         
	//    3    5:invokestatic    #124 <Method boolean ShareDialog.access$900(ShareContent)>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((ShareContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #127 <Class ShareContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #129 <Method boolean canShow(ShareContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(ShareContent sharecontent)
	{
		Object obj = ((Object) (ShareDialog.this));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ShareDialog this$0>
	//    2    4:astore_2        
		ShareDialog.access$700(((ShareDialog) (obj)), ((android.content.Context) (ShareDialog.access$1000(((ShareDialog) (obj))))), sharecontent, ShareDialog.Mode.WEB);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokestatic    #135 <Method android.app.Activity ShareDialog.access$1000(ShareDialog)>
	//    6   10:aload_1         
	//    7   11:getstatic       #141 <Field ShareDialog$Mode ShareDialog$Mode.WEB>
	//    8   14:invokestatic    #145 <Method void ShareDialog.access$700(ShareDialog, android.content.Context, ShareContent, ShareDialog$Mode)>
		AppCall appcall = createBaseAppCall();
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field ShareDialog this$0>
	//   11   21:invokevirtual   #149 <Method AppCall ShareDialog.createBaseAppCall()>
	//   12   24:astore_3        
		ShareContentValidation.validateForWebShare(sharecontent);
	//   13   25:aload_1         
	//   14   26:invokestatic    #155 <Method void ShareContentValidation.validateForWebShare(ShareContent)>
		if(sharecontent instanceof ShareLinkContent)
	//*  15   29:aload_1         
	//*  16   30:instanceof      #112 <Class ShareLinkContent>
	//*  17   33:ifeq            47
			obj = ((Object) (WebDialogParameters.create((ShareLinkContent)sharecontent)));
	//   18   36:aload_1         
	//   19   37:checkcast       #112 <Class ShareLinkContent>
	//   20   40:invokestatic    #161 <Method android.os.Bundle WebDialogParameters.create(ShareLinkContent)>
	//   21   43:astore_2        
		else
	//*  22   44:goto            81
		if(sharecontent instanceof SharePhotoContent)
	//*  23   47:aload_1         
	//*  24   48:instanceof      #37  <Class SharePhotoContent>
	//*  25   51:ifeq            73
			obj = ((Object) (WebDialogParameters.create(createAndMapAttachments((SharePhotoContent)sharecontent, appcall.getCallId()))));
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:checkcast       #37  <Class SharePhotoContent>
	//   29   59:aload_3         
	//   30   60:invokevirtual   #167 <Method UUID AppCall.getCallId()>
	//   31   63:invokespecial   #169 <Method SharePhotoContent createAndMapAttachments(SharePhotoContent, UUID)>
	//   32   66:invokestatic    #172 <Method android.os.Bundle WebDialogParameters.create(SharePhotoContent)>
	//   33   69:astore_2        
		else
	//*  34   70:goto            81
			obj = ((Object) (WebDialogParameters.create((ShareOpenGraphContent)sharecontent)));
	//   35   73:aload_1         
	//   36   74:checkcast       #114 <Class ShareOpenGraphContent>
	//   37   77:invokestatic    #175 <Method android.os.Bundle WebDialogParameters.create(ShareOpenGraphContent)>
	//   38   80:astore_2        
		DialogPresenter.setupAppCallForWebDialog(appcall, getActionName(sharecontent), ((android.os.Bundle) (obj)));
	//   39   81:aload_3         
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:invokespecial   #177 <Method String getActionName(ShareContent)>
	//   43   87:aload_2         
	//   44   88:invokestatic    #183 <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, android.os.Bundle)>
		return appcall;
	//   45   91:aload_3         
	//   46   92:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #127 <Class ShareContent>
	//    3    5:invokevirtual   #186 <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	public Object getMode()
	{
		return ((Object) (ShareDialog.Mode.WEB));
	//    0    0:getstatic       #141 <Field ShareDialog$Mode ShareDialog$Mode.WEB>
	//    1    3:areturn         
	}

	final ShareDialog this$0;

	private ShareDialog$WebShareHandler()
	{
		this$0 = ShareDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ShareDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (ShareDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	ShareDialog$WebShareHandler(ShareDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ShareDialog$WebShareHandler(ShareDialog)>
	//    3    5:return          
	}
}
