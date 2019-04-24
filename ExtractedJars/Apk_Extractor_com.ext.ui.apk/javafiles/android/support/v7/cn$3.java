// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.widget.CheckBox;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v7:
//			cn, cj

class cn$3
	implements android.widget.undButton.OnCheckedChangeListener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		compoundbutton = ((CompoundButton) (cj.a().c(cj.f, "0:1:")));
	//    0    0:invokestatic    #31  <Method cj cj.a()>
	//    1    3:getstatic       #35  <Field String cj.f>
	//    2    6:ldc1            #37  <String "0:1:">
	//    3    8:invokevirtual   #41  <Method String cj.c(String, String)>
	//    4   11:astore_1        
		if(flag)
	//*   5   12:iload_2         
	//*   6   13:ifeq            43
			compoundbutton = ((CompoundButton) (((String) (compoundbutton)).concat(a.getTag().toString())));
	//    7   16:aload_1         
	//    8   17:aload_0         
	//    9   18:getfield        #20  <Field CheckBox a>
	//   10   21:invokevirtual   #47  <Method Object CheckBox.getTag()>
	//   11   24:invokevirtual   #51  <Method String Object.toString()>
	//   12   27:invokevirtual   #57  <Method String String.concat(String)>
	//   13   30:astore_1        
		else
	//*  14   31:invokestatic    #31  <Method cj cj.a()>
	//*  15   34:getstatic       #35  <Field String cj.f>
	//*  16   37:aload_1         
	//*  17   38:invokevirtual   #60  <Method boolean cj.a(String, String)>
	//*  18   41:pop             
	//*  19   42:return          
			compoundbutton = ((CompoundButton) (((String) (compoundbutton)).replace(((CharSequence) (a.getTag().toString())), "")));
	//   20   43:aload_1         
	//   21   44:aload_0         
	//   22   45:getfield        #20  <Field CheckBox a>
	//   23   48:invokevirtual   #47  <Method Object CheckBox.getTag()>
	//   24   51:invokevirtual   #51  <Method String Object.toString()>
	//   25   54:ldc1            #62  <String "">
	//   26   56:invokevirtual   #66  <Method String String.replace(CharSequence, CharSequence)>
	//   27   59:astore_1        
		cj.a().a(cj.f, ((String) (compoundbutton)));
	//*  28   60:goto            31
	}

	final CheckBox a;
	final cn b;

	cn$3(cn cn1, CheckBox checkbox)
	{
		b = cn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field cn b>
		a = checkbox;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field CheckBox a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
