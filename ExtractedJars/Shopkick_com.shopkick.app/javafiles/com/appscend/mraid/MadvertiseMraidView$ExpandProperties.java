// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ImageButton;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseMraidView

public class MadvertiseMraidView$ExpandProperties
{

	private void checkSizeParams()
	{
		if(width > mMaxWidth || height > mMaxHeight)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int width>
	//*   2    4:aload_0         
	//*   3    5:getfield        #60  <Field int mMaxWidth>
	//*   4    8:icmpgt          22
	//*   5   11:aload_0         
	//*   6   12:getfield        #58  <Field int height>
	//*   7   15:aload_0         
	//*   8   16:getfield        #62  <Field int mMaxHeight>
	//*   9   19:icmple          112
		{
			int i = height;
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field int height>
	//   12   26:istore_2        
			float f = i;
	//   13   27:iload_2         
	//   14   28:i2f             
	//   15   29:fstore_1        
			int k = width;
	//   16   30:aload_0         
	//   17   31:getfield        #56  <Field int width>
	//   18   34:istore          4
			f /= k;
	//   19   36:fload_1         
	//   20   37:iload           4
	//   21   39:i2f             
	//   22   40:fdiv            
	//   23   41:fstore_1        
			int j = mMaxWidth;
	//   24   42:aload_0         
	//   25   43:getfield        #60  <Field int mMaxWidth>
	//   26   46:istore_3        
			k = (int)((float)(k - j) * f);
	//   27   47:iload           4
	//   28   49:iload_3         
	//   29   50:isub            
	//   30   51:i2f             
	//   31   52:fload_1         
	//   32   53:fmul            
	//   33   54:f2i             
	//   34   55:istore          4
			int l = mMaxHeight;
	//   35   57:aload_0         
	//   36   58:getfield        #62  <Field int mMaxHeight>
	//   37   61:istore          5
			if(k > (int)((float)(i - l) * f))
	//*  38   63:iload           4
	//*  39   65:iload_2         
	//*  40   66:iload           5
	//*  41   68:isub            
	//*  42   69:i2f             
	//*  43   70:fload_1         
	//*  44   71:fmul            
	//*  45   72:f2i             
	//*  46   73:icmple          94
			{
				width = j;
	//   47   76:aload_0         
	//   48   77:iload_3         
	//   49   78:putfield        #56  <Field int width>
				height = (int)((float)width * f);
	//   50   81:aload_0         
	//   51   82:aload_0         
	//   52   83:getfield        #56  <Field int width>
	//   53   86:i2f             
	//   54   87:fload_1         
	//   55   88:fmul            
	//   56   89:f2i             
	//   57   90:putfield        #58  <Field int height>
				return;
	//   58   93:return          
			}
			height = l;
	//   59   94:aload_0         
	//   60   95:iload           5
	//   61   97:putfield        #58  <Field int height>
			width = (int)((float)height / f);
	//   62  100:aload_0         
	//   63  101:aload_0         
	//   64  102:getfield        #58  <Field int height>
	//   65  105:i2f             
	//   66  106:fload_1         
	//   67  107:fdiv            
	//   68  108:f2i             
	//   69  109:putfield        #56  <Field int width>
		}
	//   70  112:return          
	}

	public void readJson(String s)
	{
		try
		{
			s = ((String) (new JSONObject(s)));
	//    0    0:new             #70  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #72  <Method void JSONObject(String)>
	//    4    8:astore_1        
			if(((JSONObject) (s)).has("height"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #13  <String "height">
	//*   7   12:invokevirtual   #76  <Method boolean JSONObject.has(String)>
	//*   8   15:ifeq            35
				width = (int)((float)((JSONObject) (s)).getInt("width") * mScale);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #22  <String "width">
	//   12   22:invokevirtual   #80  <Method int JSONObject.getInt(String)>
	//   13   25:i2f             
	//   14   26:aload_0         
	//   15   27:getfield        #54  <Field float mScale>
	//   16   30:fmul            
	//   17   31:f2i             
	//   18   32:putfield        #56  <Field int width>
			if(((JSONObject) (s)).has("width"))
	//*  19   35:aload_1         
	//*  20   36:ldc1            #22  <String "width">
	//*  21   38:invokevirtual   #76  <Method boolean JSONObject.has(String)>
	//*  22   41:ifeq            61
				height = (int)((float)((JSONObject) (s)).getInt("height") * mScale);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:ldc1            #13  <String "height">
	//   26   48:invokevirtual   #80  <Method int JSONObject.getInt(String)>
	//   27   51:i2f             
	//   28   52:aload_0         
	//   29   53:getfield        #54  <Field float mScale>
	//   30   56:fmul            
	//   31   57:f2i             
	//   32   58:putfield        #58  <Field int height>
			if(((JSONObject) (s)).has("useCustomClose"))
	//*  33   61:aload_1         
	//*  34   62:ldc1            #19  <String "useCustomClose">
	//*  35   64:invokevirtual   #76  <Method boolean JSONObject.has(String)>
	//*  36   67:ifeq            121
			{
				useCustomClose = ((JSONObject) (s)).getBoolean("useCustomClose");
	//   37   70:aload_0         
	//   38   71:aload_1         
	//   39   72:ldc1            #19  <String "useCustomClose">
	//   40   74:invokevirtual   #83  <Method boolean JSONObject.getBoolean(String)>
	//   41   77:putfield        #85  <Field boolean useCustomClose>
				if(useCustomClose && MadvertiseMraidView.access$300(MadvertiseMraidView.this) != null)
	//*  42   80:aload_0         
	//*  43   81:getfield        #85  <Field boolean useCustomClose>
	//*  44   84:ifeq            121
	//*  45   87:aload_0         
	//*  46   88:getfield        #34  <Field MadvertiseMraidView this$0>
	//*  47   91:invokestatic    #89  <Method ImageButton MadvertiseMraidView.access$300(MadvertiseMraidView)>
	//*  48   94:ifnull          121
					post(new Runnable() {

						public void run()
						{
							MadvertiseMraidView.access$300(this$0).setImageDrawable(((android.graphics.drawable.Drawable) (null)));
						//    0    0:aload_0         
						//    1    1:getfield        #20  <Field MadvertiseMraidView$ExpandProperties this$1>
						//    2    4:getfield        #29  <Field MadvertiseMraidView MadvertiseMraidView$ExpandProperties.this$0>
						//    3    7:invokestatic    #33  <Method ImageButton MadvertiseMraidView.access$300(MadvertiseMraidView)>
						//    4   10:aconst_null     
						//    5   11:invokevirtual   #39  <Method void ImageButton.setImageDrawable(android.graphics.drawable.Drawable)>
						//    6   14:return          
						}

						final MadvertiseMraidView.ExpandProperties this$1;

			
			{
				this$1 = MadvertiseMraidView.ExpandProperties.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MadvertiseMraidView$ExpandProperties this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
					}
);
	//   49   97:aload_0         
	//   50   98:getfield        #34  <Field MadvertiseMraidView this$0>
	//   51  101:new             #9   <Class MadvertiseMraidView$ExpandProperties$1>
	//   52  104:dup             
	//   53  105:aload_0         
	//   54  106:invokespecial   #92  <Method void MadvertiseMraidView$ExpandProperties$1(MadvertiseMraidView$ExpandProperties)>
	//   55  109:invokevirtual   #96  <Method boolean MadvertiseMraidView.post(Runnable)>
	//   56  112:pop             
			}
		}
	//*  57  113:goto            121
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  58  116:astore_1        
		{
			((JSONException) (s)).printStackTrace();
	//   59  117:aload_1         
	//   60  118:invokevirtual   #99  <Method void JSONException.printStackTrace()>
		}
		checkSizeParams();
	//   61  121:aload_0         
	//   62  122:invokespecial   #101 <Method void checkSizeParams()>
	//   63  125:return          
	}

	public String toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #70  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("width", width);
	//    4    8:aload_1         
	//    5    9:ldc1            #22  <String "width">
	//    6   11:aload_0         
	//    7   12:getfield        #56  <Field int width>
	//    8   15:invokevirtual   #108 <Method JSONObject JSONObject.put(String, int)>
	//    9   18:pop             
			jsonobject.put("height", height);
	//   10   19:aload_1         
	//   11   20:ldc1            #13  <String "height">
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field int height>
	//   14   26:invokevirtual   #108 <Method JSONObject JSONObject.put(String, int)>
	//   15   29:pop             
			jsonobject.put("useCustomClose", useCustomClose);
	//   16   30:aload_1         
	//   17   31:ldc1            #19  <String "useCustomClose">
	//   18   33:aload_0         
	//   19   34:getfield        #85  <Field boolean useCustomClose>
	//   20   37:invokevirtual   #111 <Method JSONObject JSONObject.put(String, boolean)>
	//   21   40:pop             
			jsonobject.put("isModal", isModal);
	//   22   41:aload_1         
	//   23   42:ldc1            #16  <String "isModal">
	//   24   44:aload_0         
	//   25   45:getfield        #113 <Field boolean isModal>
	//   26   48:invokevirtual   #111 <Method JSONObject JSONObject.put(String, boolean)>
	//   27   51:pop             
		}
	//*  28   52:goto            60
		catch(JSONException jsonexception)
	//*  29   55:astore_2        
		{
			jsonexception.printStackTrace();
	//   30   56:aload_2         
	//   31   57:invokevirtual   #99  <Method void JSONException.printStackTrace()>
		}
		return jsonobject.toString();
	//   32   60:aload_1         
	//   33   61:invokevirtual   #116 <Method String JSONObject.toString()>
	//   34   64:areturn         
	}

	private static final String HEIGHT = "height";
	private static final String IS_MODAL = "isModal";
	private static final String USE_CUSTOM_CLOSE = "useCustomClose";
	private static final String WIDTH = "width";
	public int height;
	public boolean isModal;
	private int mMaxHeight;
	private int mMaxWidth;
	private float mScale;
	final MadvertiseMraidView this$0;
	public boolean useCustomClose;
	public int width;

	public MadvertiseMraidView$ExpandProperties(int i, int j)
	{
		this$0 = MadvertiseMraidView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field MadvertiseMraidView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #37  <Method void Object()>
		mScale = getResources().getDisplayMetrics().density;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field MadvertiseMraidView this$0>
	//    8   14:invokevirtual   #41  <Method Resources MadvertiseMraidView.getResources()>
	//    9   17:invokevirtual   #47  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   10   20:getfield        #52  <Field float DisplayMetrics.density>
	//   11   23:putfield        #54  <Field float mScale>
		width = i;
	//   12   26:aload_0         
	//   13   27:iload_2         
	//   14   28:putfield        #56  <Field int width>
		height = j;
	//   15   31:aload_0         
	//   16   32:iload_3         
	//   17   33:putfield        #58  <Field int height>
		mMaxWidth = i;
	//   18   36:aload_0         
	//   19   37:iload_2         
	//   20   38:putfield        #60  <Field int mMaxWidth>
		mMaxHeight = j;
	//   21   41:aload_0         
	//   22   42:iload_3         
	//   23   43:putfield        #62  <Field int mMaxHeight>
	//   24   46:return          
	}
}
