// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.bl;
import bo.app.dt;
import com.appboy.enums.inappmessage.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			InAppMessageBase

public class InAppMessageSlideup extends InAppMessageBase
{

	public InAppMessageSlideup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void InAppMessageBase()>
		j = SlideFrom.BOTTOM;
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field SlideFrom SlideFrom.BOTTOM>
	//    4    8:putfield        #19  <Field SlideFrom j>
		f = TextAlign.START;
	//    5   11:aload_0         
	//    6   12:getstatic       #25  <Field TextAlign TextAlign.START>
	//    7   15:putfield        #28  <Field TextAlign f>
	//    8   18:return          
	}

	public InAppMessageSlideup(JSONObject jsonobject, bl bl)
	{
		this(jsonobject, bl, (SlideFrom)dt.a(jsonobject, "slide_from", com/appboy/enums/inappmessage/SlideFrom, ((Enum) (SlideFrom.BOTTOM))), jsonobject.optInt("close_btn_color"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:ldc1            #32  <String "slide_from">
	//    5    6:ldc1            #14  <Class SlideFrom>
	//    6    8:getstatic       #17  <Field SlideFrom SlideFrom.BOTTOM>
	//    7   11:invokestatic    #38  <Method Enum dt.a(JSONObject, String, Class, Enum)>
	//    8   14:checkcast       #14  <Class SlideFrom>
	//    9   17:aload_1         
	//   10   18:ldc1            #40  <String "close_btn_color">
	//   11   20:invokevirtual   #46  <Method int JSONObject.optInt(String)>
	//   12   23:invokespecial   #49  <Method void InAppMessageSlideup(JSONObject, bl, SlideFrom, int)>
	//   13   26:return          
	}

	private InAppMessageSlideup(JSONObject jsonobject, bl bl, SlideFrom slidefrom, int i)
	{
		super(jsonobject, bl);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #51  <Method void InAppMessageBase(JSONObject, bl)>
		j = SlideFrom.BOTTOM;
	//    4    6:aload_0         
	//    5    7:getstatic       #17  <Field SlideFrom SlideFrom.BOTTOM>
	//    6   10:putfield        #19  <Field SlideFrom j>
		j = slidefrom;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #19  <Field SlideFrom j>
		if(j == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #19  <Field SlideFrom j>
	//*  12   22:ifnonnull       32
			j = SlideFrom.BOTTOM;
	//   13   25:aload_0         
	//   14   26:getstatic       #17  <Field SlideFrom SlideFrom.BOTTOM>
	//   15   29:putfield        #19  <Field SlideFrom j>
		k = i;
	//   16   32:aload_0         
	//   17   33:iload           4
	//   18   35:putfield        #53  <Field int k>
		e = (CropType)dt.a(jsonobject, "crop_type", com/appboy/enums/inappmessage/CropType, ((Enum) (CropType.FIT_CENTER)));
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:ldc1            #55  <String "crop_type">
	//   22   42:ldc1            #57  <Class CropType>
	//   23   44:getstatic       #61  <Field CropType CropType.FIT_CENTER>
	//   24   47:invokestatic    #38  <Method Enum dt.a(JSONObject, String, Class, Enum)>
	//   25   50:checkcast       #57  <Class CropType>
	//   26   53:putfield        #64  <Field CropType e>
		f = (TextAlign)dt.a(jsonobject, "text_align_message", com/appboy/enums/inappmessage/TextAlign, ((Enum) (TextAlign.START)));
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:ldc1            #66  <String "text_align_message">
	//   30   60:ldc1            #21  <Class TextAlign>
	//   31   62:getstatic       #25  <Field TextAlign TextAlign.START>
	//   32   65:invokestatic    #38  <Method Enum dt.a(JSONObject, String, Class, Enum)>
	//   33   68:checkcast       #21  <Class TextAlign>
	//   34   71:putfield        #28  <Field TextAlign f>
	//   35   74:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONException jsonexception;
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field JSONObject h>
	//*   2    4:ifnull          12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field JSONObject h>
	//    5   11:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = super.forJsonPut();
	//    6   12:aload_0         
	//    7   13:invokespecial   #78  <Method JSONObject InAppMessageBase.forJsonPut()>
	//    8   16:astore_1        
			jsonobject.putOpt("slide_from", ((Object) (j.toString())));
	//    9   17:aload_1         
	//   10   18:ldc1            #32  <String "slide_from">
	//   11   20:aload_0         
	//   12   21:getfield        #19  <Field SlideFrom j>
	//   13   24:invokevirtual   #82  <Method String SlideFrom.toString()>
	//   14   27:invokevirtual   #86  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   15   30:pop             
			jsonobject.put("close_btn_color", k);
	//   16   31:aload_1         
	//   17   32:ldc1            #40  <String "close_btn_color">
	//   18   34:aload_0         
	//   19   35:getfield        #53  <Field int k>
	//   20   38:invokevirtual   #90  <Method JSONObject JSONObject.put(String, int)>
	//   21   41:pop             
			jsonobject.put("type", ((Object) (MessageType.SLIDEUP.name())));
	//   22   42:aload_1         
	//   23   43:ldc1            #92  <String "type">
	//   24   45:getstatic       #98  <Field MessageType MessageType.SLIDEUP>
	//   25   48:invokevirtual   #101 <Method String MessageType.name()>
	//   26   51:invokevirtual   #103 <Method JSONObject JSONObject.put(String, Object)>
	//   27   54:pop             
		}
	//*  28   55:aload_1         
	//*  29   56:areturn         
	//*  30   57:aconst_null     
	//*  31   58:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  32   59:astore_1        
	//*  33   60:goto            57
	}

	public int getChevronColor()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int k>
	//    2    4:ireturn         
	}

	public SlideFrom getSlideFrom()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SlideFrom j>
	//    2    4:areturn         
	}

	public void setChevronColor(int i)
	{
		k = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int k>
	//    3    5:return          
	}

	public void setSlideFrom(SlideFrom slidefrom)
	{
		j = slidefrom;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SlideFrom j>
	//    3    5:return          
	}

	private SlideFrom j;
	private int k;
}
