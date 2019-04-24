// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.widget.CheckBox;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v7:
//			cn, cj

class cn$1
	implements android.widget.undButton.OnCheckedChangeListener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		String s = cj.a().c(cj.f, "0:1:");
	//    0    0:invokestatic    #34  <Method cj cj.a()>
	//    1    3:getstatic       #38  <Field String cj.f>
	//    2    6:ldc1            #40  <String "0:1:">
	//    3    8:invokevirtual   #43  <Method String cj.c(String, String)>
	//    4   11:astore_3        
		if(!flag) goto _L2; else goto _L1
	//    5   12:iload_2         
	//    6   13:ifeq            68
_L1:
		compoundbutton = ((CompoundButton) (s.concat(a.getTag().toString())));
	//    7   16:aload_3         
	//    8   17:aload_0         
	//    9   18:getfield        #21  <Field CheckBox a>
	//   10   21:invokevirtual   #49  <Method Object CheckBox.getTag()>
	//   11   24:invokevirtual   #53  <Method String Object.toString()>
	//   12   27:invokevirtual   #59  <Method String String.concat(String)>
	//   13   30:astore_1        
_L4:
		if(((String) (compoundbutton)).contains(((CharSequence) (a.getTag().toString()))))
	//*  14   31:aload_1         
	//*  15   32:aload_0         
	//*  16   33:getfield        #21  <Field CheckBox a>
	//*  17   36:invokevirtual   #49  <Method Object CheckBox.getTag()>
	//*  18   39:invokevirtual   #53  <Method String Object.toString()>
	//*  19   42:invokevirtual   #63  <Method boolean String.contains(CharSequence)>
	//*  20   45:ifeq            56
			a.setChecked(true);
	//   21   48:aload_0         
	//   22   49:getfield        #21  <Field CheckBox a>
	//   23   52:iconst_1        
	//   24   53:invokevirtual   #67  <Method void CheckBox.setChecked(boolean)>
		cj.a().a(cj.f, ((String) (compoundbutton)));
	//   25   56:invokestatic    #34  <Method cj cj.a()>
	//   26   59:getstatic       #38  <Field String cj.f>
	//   27   62:aload_1         
	//   28   63:invokevirtual   #70  <Method boolean cj.a(String, String)>
	//   29   66:pop             
		return;
	//   30   67:return          
_L2:
		compoundbutton = ((CompoundButton) (s));
	//   31   68:aload_3         
	//   32   69:astore_1        
		if(s.contains(((CharSequence) (b.getTag().toString()))))
	//*  33   70:aload_3         
	//*  34   71:aload_0         
	//*  35   72:getfield        #23  <Field CheckBox b>
	//*  36   75:invokevirtual   #49  <Method Object CheckBox.getTag()>
	//*  37   78:invokevirtual   #53  <Method String Object.toString()>
	//*  38   81:invokevirtual   #63  <Method boolean String.contains(CharSequence)>
	//*  39   84:ifeq            31
			compoundbutton = ((CompoundButton) (s.replace(((CharSequence) (a.getTag().toString())), "")));
	//   40   87:aload_3         
	//   41   88:aload_0         
	//   42   89:getfield        #21  <Field CheckBox a>
	//   43   92:invokevirtual   #49  <Method Object CheckBox.getTag()>
	//   44   95:invokevirtual   #53  <Method String Object.toString()>
	//   45   98:ldc1            #72  <String "">
	//   46  100:invokevirtual   #76  <Method String String.replace(CharSequence, CharSequence)>
	//   47  103:astore_1        
		if(true) goto _L4; else goto _L3
	//   48  104:goto            31
_L3:
	}

	final CheckBox a;
	final CheckBox b;
	final cn c;

	cn$1(cn cn1, CheckBox checkbox, CheckBox checkbox1)
	{
		c = cn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field cn c>
		a = checkbox;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CheckBox a>
		b = checkbox1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field CheckBox b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
