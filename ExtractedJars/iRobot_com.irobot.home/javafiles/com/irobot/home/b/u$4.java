// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomEditTextView;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home.b:
//			u

class u$4
	implements android.view..OnClickListener
{

	public void onClick(View view)
	{
		if(c.b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field u c>
	//*   2    4:getfield        #33  <Field u$b u.b>
	//*   3    7:ifnull          50
		{
			c.b.o.getText().clear();
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field u c>
	//    6   14:getfield        #33  <Field u$b u.b>
	//    7   17:getfield        #39  <Field CustomEditTextView u$b.o>
	//    8   20:invokevirtual   #45  <Method Editable CustomEditTextView.getText()>
	//    9   23:invokeinterface #50  <Method void Editable.clear()>
			c.b.o.clearFocus();
	//   10   28:aload_0         
	//   11   29:getfield        #20  <Field u c>
	//   12   32:getfield        #33  <Field u$b u.b>
	//   13   35:getfield        #39  <Field CustomEditTextView u$b.o>
	//   14   38:invokevirtual   #53  <Method void CustomEditTextView.clearFocus()>
			j.a(view.getContext(), view);
	//   15   41:aload_1         
	//   16   42:invokevirtual   #59  <Method Context View.getContext()>
	//   17   45:aload_1         
	//   18   46:invokestatic    #64  <Method boolean j.a(Context, View)>
	//   19   49:pop             
		}
		if(u.c(c) != null)
	//*  20   50:aload_0         
	//*  21   51:getfield        #20  <Field u c>
	//*  22   54:invokestatic    #67  <Method u$d u.c(u)>
	//*  23   57:ifnull          199
		{
			u.c(c).a(((u$c)u.d(c).get(a - 1)).a);
	//   24   60:aload_0         
	//   25   61:getfield        #20  <Field u c>
	//   26   64:invokestatic    #67  <Method u$d u.c(u)>
	//   27   67:aload_0         
	//   28   68:getfield        #20  <Field u c>
	//   29   71:invokestatic    #71  <Method ArrayList u.d(u)>
	//   30   74:aload_0         
	//   31   75:getfield        #22  <Field int a>
	//   32   78:iconst_1        
	//   33   79:isub            
	//   34   80:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   35   83:checkcast       #79  <Class u$c>
	//   36   86:getfield        #82  <Field String u$c.a>
	//   37   89:invokeinterface #87  <Method void u$d.a(String)>
			if(c.a != null)
	//*  38   94:aload_0         
	//*  39   95:getfield        #20  <Field u c>
	//*  40   98:getfield        #89  <Field u$e u.a>
	//*  41  101:ifnonnull       143
	//*  42  104:aload_0         
	//*  43  105:getfield        #24  <Field u$e b>
	//*  44  108:getfield        #94  <Field CustomTextView u$e.o>
	//*  45  111:aload_0         
	//*  46  112:getfield        #20  <Field u c>
	//*  47  115:invokestatic    #97  <Method Context u.b(u)>
	//*  48  118:invokevirtual   #103 <Method Resources Context.getResources()>
	//*  49  121:ldc1            #104 <Int 0x7f060078>
	//*  50  123:invokevirtual   #110 <Method int Resources.getColor(int)>
	//*  51  126:invokevirtual   #116 <Method void CustomTextView.setTextColor(int)>
	//*  52  129:aload_0         
	//*  53  130:getfield        #24  <Field u$e b>
	//*  54  133:getfield        #120 <Field ImageView u$e.p>
	//*  55  136:iconst_0        
	//*  56  137:invokevirtual   #125 <Method void ImageView.setVisibility(int)>
	//*  57  140:goto            188
			{
				c.a.o.setTextColor(u.b(c).getResources().getColor(0x7f060076));
	//   58  143:aload_0         
	//   59  144:getfield        #20  <Field u c>
	//   60  147:getfield        #89  <Field u$e u.a>
	//   61  150:getfield        #94  <Field CustomTextView u$e.o>
	//   62  153:aload_0         
	//   63  154:getfield        #20  <Field u c>
	//   64  157:invokestatic    #97  <Method Context u.b(u)>
	//   65  160:invokevirtual   #103 <Method Resources Context.getResources()>
	//   66  163:ldc1            #126 <Int 0x7f060076>
	//   67  165:invokevirtual   #110 <Method int Resources.getColor(int)>
	//   68  168:invokevirtual   #116 <Method void CustomTextView.setTextColor(int)>
				c.a.p.setVisibility(4);
	//   69  171:aload_0         
	//   70  172:getfield        #20  <Field u c>
	//   71  175:getfield        #89  <Field u$e u.a>
	//   72  178:getfield        #120 <Field ImageView u$e.p>
	//   73  181:iconst_4        
	//   74  182:invokevirtual   #125 <Method void ImageView.setVisibility(int)>
			}
			b.o.setTextColor(u.b(c).getResources().getColor(0x7f060078));
			b.p.setVisibility(0);
	//*  75  185:goto            104
			c.a = b;
	//   76  188:aload_0         
	//   77  189:getfield        #20  <Field u c>
	//   78  192:aload_0         
	//   79  193:getfield        #24  <Field u$e b>
	//   80  196:putfield        #89  <Field u$e u.a>
		}
	//   81  199:return          
	}

	final int a;
	final u$e b;
	final u c;

	u$4(u u1, int i, u$e u$e1)
	{
		c = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field u c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int a>
		b = u$e1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field u$e b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
