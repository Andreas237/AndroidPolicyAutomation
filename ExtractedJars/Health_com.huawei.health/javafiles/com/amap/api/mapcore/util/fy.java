// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;

// Referenced classes of package com.amap.api.mapcore.util:
//			fz, ge

public class fy extends fz
	implements android.view.View.OnClickListener
{

	public fy(Context context, OfflineMapManager offlinemapmanager)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void fz(Context)>
		a = offlinemapmanager;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field OfflineMapManager a>
	//    6   10:return          
	}

	protected void a()
	{
		b = ge.a(getContext(), 0x7f030001, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #34  <Method Context getContext()>
	//    3    5:ldc1            #35  <Int 0x7f030001>
	//    4    7:aconst_null     
	//    5    8:invokestatic    #40  <Method View ge.a(Context, int, android.view.ViewGroup)>
	//    6   11:putfield        #42  <Field View b>
		setContentView(b);
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:getfield        #42  <Field View b>
	//   10   19:invokevirtual   #46  <Method void setContentView(View)>
		b.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				a.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field fy a>
			//    2    4:invokevirtual   #24  <Method void fy.dismiss()>
			//    3    7:return          
			}

			final fy a;

			
			{
				a = fy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field fy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   11   22:aload_0         
	//   12   23:getfield        #42  <Field View b>
	//   13   26:new             #8   <Class fy$1>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:invokespecial   #49  <Method void fy$1(fy)>
	//   17   34:invokevirtual   #55  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		c = (TextView)b.findViewById(0x7f070007);
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:getfield        #42  <Field View b>
	//   21   42:ldc1            #56  <Int 0x7f070007>
	//   22   44:invokevirtual   #60  <Method View View.findViewById(int)>
	//   23   47:checkcast       #62  <Class TextView>
	//   24   50:putfield        #64  <Field TextView c>
		d = (TextView)b.findViewById(0x7f070008);
	//   25   53:aload_0         
	//   26   54:aload_0         
	//   27   55:getfield        #42  <Field View b>
	//   28   58:ldc1            #65  <Int 0x7f070008>
	//   29   60:invokevirtual   #60  <Method View View.findViewById(int)>
	//   30   63:checkcast       #62  <Class TextView>
	//   31   66:putfield        #67  <Field TextView d>
		d.setText("\u6682\u505C\u4E0B\u8F7D");
	//   32   69:aload_0         
	//   33   70:getfield        #67  <Field TextView d>
	//   34   73:ldc1            #69  <String "\u6682\u505C\u4E0B\u8F7D">
	//   35   75:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
		e = (TextView)b.findViewById(0x7f070009);
	//   36   78:aload_0         
	//   37   79:aload_0         
	//   38   80:getfield        #42  <Field View b>
	//   39   83:ldc1            #74  <Int 0x7f070009>
	//   40   85:invokevirtual   #60  <Method View View.findViewById(int)>
	//   41   88:checkcast       #62  <Class TextView>
	//   42   91:putfield        #76  <Field TextView e>
		f = (TextView)b.findViewById(0x7f07000a);
	//   43   94:aload_0         
	//   44   95:aload_0         
	//   45   96:getfield        #42  <Field View b>
	//   46   99:ldc1            #77  <Int 0x7f07000a>
	//   47  101:invokevirtual   #60  <Method View View.findViewById(int)>
	//   48  104:checkcast       #62  <Class TextView>
	//   49  107:putfield        #79  <Field TextView f>
		d.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   50  110:aload_0         
	//   51  111:getfield        #67  <Field TextView d>
	//   52  114:aload_0         
	//   53  115:invokevirtual   #80  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		e.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   54  118:aload_0         
	//   55  119:getfield        #76  <Field TextView e>
	//   56  122:aload_0         
	//   57  123:invokevirtual   #80  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		f.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   58  126:aload_0         
	//   59  127:getfield        #79  <Field TextView f>
	//   60  130:aload_0         
	//   61  131:invokevirtual   #80  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
	//   62  134:return          
	}

	public void a(int i, String s)
	{
		c.setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field TextView c>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
		if(i == 0)
	//*   4    8:iload_1         
	//*   5    9:ifne            38
		{
			d.setText("\u6682\u505C\u4E0B\u8F7D");
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field TextView d>
	//    8   16:ldc1            #69  <String "\u6682\u505C\u4E0B\u8F7D">
	//    9   18:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
			d.setVisibility(0);
	//   10   21:aload_0         
	//   11   22:getfield        #67  <Field TextView d>
	//   12   25:iconst_0        
	//   13   26:invokevirtual   #85  <Method void TextView.setVisibility(int)>
			e.setText("\u53D6\u6D88\u4E0B\u8F7D");
	//   14   29:aload_0         
	//   15   30:getfield        #76  <Field TextView e>
	//   16   33:ldc1            #87  <String "\u53D6\u6D88\u4E0B\u8F7D">
	//   17   35:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
		}
		if(i == 2)
	//*  18   38:iload_1         
	//*  19   39:iconst_2        
	//*  20   40:icmpne          64
		{
			d.setVisibility(8);
	//   21   43:aload_0         
	//   22   44:getfield        #67  <Field TextView d>
	//   23   47:bipush          8
	//   24   49:invokevirtual   #85  <Method void TextView.setVisibility(int)>
			e.setText("\u53D6\u6D88\u4E0B\u8F7D");
	//   25   52:aload_0         
	//   26   53:getfield        #76  <Field TextView e>
	//   27   56:ldc1            #87  <String "\u53D6\u6D88\u4E0B\u8F7D">
	//   28   58:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
		} else
	//*  29   61:goto            164
		if(i == -1 || i == 101 || i == 102 || i == 103)
	//*  30   64:iload_1         
	//*  31   65:iconst_m1       
	//*  32   66:icmpeq          87
	//*  33   69:iload_1         
	//*  34   70:bipush          101
	//*  35   72:icmpeq          87
	//*  36   75:iload_1         
	//*  37   76:bipush          102
	//*  38   78:icmpeq          87
	//*  39   81:iload_1         
	//*  40   82:bipush          103
	//*  41   84:icmpne          107
		{
			d.setText("\u7EE7\u7EED\u4E0B\u8F7D");
	//   42   87:aload_0         
	//   43   88:getfield        #67  <Field TextView d>
	//   44   91:ldc1            #89  <String "\u7EE7\u7EED\u4E0B\u8F7D">
	//   45   93:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
			d.setVisibility(0);
	//   46   96:aload_0         
	//   47   97:getfield        #67  <Field TextView d>
	//   48  100:iconst_0        
	//   49  101:invokevirtual   #85  <Method void TextView.setVisibility(int)>
		} else
	//*  50  104:goto            164
		if(i == 3)
	//*  51  107:iload_1         
	//*  52  108:iconst_3        
	//*  53  109:icmpne          141
		{
			d.setVisibility(0);
	//   54  112:aload_0         
	//   55  113:getfield        #67  <Field TextView d>
	//   56  116:iconst_0        
	//   57  117:invokevirtual   #85  <Method void TextView.setVisibility(int)>
			d.setText("\u7EE7\u7EED\u4E0B\u8F7D");
	//   58  120:aload_0         
	//   59  121:getfield        #67  <Field TextView d>
	//   60  124:ldc1            #89  <String "\u7EE7\u7EED\u4E0B\u8F7D">
	//   61  126:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
			e.setText("\u53D6\u6D88\u4E0B\u8F7D");
	//   62  129:aload_0         
	//   63  130:getfield        #76  <Field TextView e>
	//   64  133:ldc1            #87  <String "\u53D6\u6D88\u4E0B\u8F7D">
	//   65  135:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
		} else
	//*  66  138:goto            164
		if(i == 4)
	//*  67  141:iload_1         
	//*  68  142:iconst_4        
	//*  69  143:icmpne          164
		{
			e.setText("\u5220\u9664");
	//   70  146:aload_0         
	//   71  147:getfield        #76  <Field TextView e>
	//   72  150:ldc1            #91  <String "\u5220\u9664">
	//   73  152:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
			d.setVisibility(8);
	//   74  155:aload_0         
	//   75  156:getfield        #67  <Field TextView d>
	//   76  159:bipush          8
	//   77  161:invokevirtual   #85  <Method void TextView.setVisibility(int)>
		}
		g = i;
	//   78  164:aload_0         
	//   79  165:iload_1         
	//   80  166:putfield        #93  <Field int g>
		h = s;
	//   81  169:aload_0         
	//   82  170:aload_2         
	//   83  171:putfield        #95  <Field String h>
	//   84  174:return          
	}

	public void onClick(View view)
	{
		int i;
		try
		{
			i = view.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #102 <Method int View.getId()>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ldc1            #65  <Int 0x7f070008>
	//*   5    8:icmpne          107
	//*   6   11:aload_0         
	//*   7   12:getfield        #93  <Field int g>
	//*   8   15:ifne            37
	//*   9   18:aload_0         
	//*  10   19:getfield        #67  <Field TextView d>
	//*  11   22:ldc1            #89  <String "\u7EE7\u7EED\u4E0B\u8F7D">
	//*  12   24:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
	//*  13   27:aload_0         
	//*  14   28:getfield        #28  <Field OfflineMapManager a>
	//*  15   31:invokevirtual   #107 <Method void OfflineMapManager.pause()>
	//*  16   34:goto            100
	//*  17   37:aload_0         
	//*  18   38:getfield        #93  <Field int g>
	//*  19   41:iconst_3        
	//*  20   42:icmpeq          80
	//*  21   45:aload_0         
	//*  22   46:getfield        #93  <Field int g>
	//*  23   49:iconst_m1       
	//*  24   50:icmpeq          80
	//*  25   53:aload_0         
	//*  26   54:getfield        #93  <Field int g>
	//*  27   57:bipush          101
	//*  28   59:icmpeq          80
	//*  29   62:aload_0         
	//*  30   63:getfield        #93  <Field int g>
	//*  31   66:bipush          102
	//*  32   68:icmpeq          80
	//*  33   71:aload_0         
	//*  34   72:getfield        #93  <Field int g>
	//*  35   75:bipush          103
	//*  36   77:icmpne          100
	//*  37   80:aload_0         
	//*  38   81:getfield        #67  <Field TextView d>
	//*  39   84:ldc1            #69  <String "\u6682\u505C\u4E0B\u8F7D">
	//*  40   86:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
	//*  41   89:aload_0         
	//*  42   90:getfield        #28  <Field OfflineMapManager a>
	//*  43   93:aload_0         
	//*  44   94:getfield        #95  <Field String h>
	//*  45   97:invokevirtual   #111 <Method void OfflineMapManager.downloadByCityName(String)>
	//*  46  100:aload_0         
	//*  47  101:invokevirtual   #114 <Method void dismiss()>
	//*  48  104:goto            151
	//*  49  107:iload_2         
	//*  50  108:ldc1            #74  <Int 0x7f070009>
	//*  51  110:icmpne          141
	//*  52  113:aload_0         
	//*  53  114:getfield        #95  <Field String h>
	//*  54  117:invokestatic    #120 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  120:ifne            151
	//*  56  123:aload_0         
	//*  57  124:getfield        #28  <Field OfflineMapManager a>
	//*  58  127:aload_0         
	//*  59  128:getfield        #95  <Field String h>
	//*  60  131:invokevirtual   #123 <Method void OfflineMapManager.remove(String)>
	//*  61  134:aload_0         
	//*  62  135:invokevirtual   #114 <Method void dismiss()>
	//*  63  138:goto            151
	//*  64  141:iload_2         
	//*  65  142:ldc1            #77  <Int 0x7f07000a>
	//*  66  144:icmpne          151
	//*  67  147:aload_0         
	//*  68  148:invokevirtual   #114 <Method void dismiss()>
	//*  69  151:return          
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  70  152:astore_1        
		{
			((Exception) (view)).printStackTrace();
	//   71  153:aload_1         
	//   72  154:invokevirtual   #126 <Method void Exception.printStackTrace()>
			return;
	//   73  157:return          
		}
		if(i != 0x7f070008)
			break MISSING_BLOCK_LABEL_107;
		if(g == 0)
		{
			d.setText("\u7EE7\u7EED\u4E0B\u8F7D");
			a.pause();
			break MISSING_BLOCK_LABEL_100;
		}
		if(g == 3 || g == -1 || g == 101 || g == 102 || g == 103)
		{
			d.setText("\u6682\u505C\u4E0B\u8F7D");
			a.downloadByCityName(h);
		}
		dismiss();
		break MISSING_BLOCK_LABEL_151;
		if(i != 0x7f070009)
			break MISSING_BLOCK_LABEL_141;
		if(!TextUtils.isEmpty(((CharSequence) (h))))
		{
			a.remove(h);
			dismiss();
		}
		break MISSING_BLOCK_LABEL_151;
		if(i != 0x7f07000a)
			break MISSING_BLOCK_LABEL_151;
		dismiss();
	}

	private OfflineMapManager a;
	private View b;
	private TextView c;
	private TextView d;
	private TextView e;
	private TextView f;
	private int g;
	private String h;
}
