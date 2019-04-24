// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.*;
import com.irobot.home.view.CustomEditTextView;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class DuplicateRegionNameActivity extends BaseFragmentActivity
{

	public DuplicateRegionNameActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BaseFragmentActivity()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String a>
		d = false;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #35  <Field boolean d>
		i = "";
	//    8   15:aload_0         
	//    9   16:ldc1            #31  <String "">
	//   10   18:putfield        #37  <Field String i>
		j = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #39  <Field boolean j>
	//   14   26:return          
	}

	static String a(DuplicateRegionNameActivity duplicateregionnameactivity, String s)
	{
		duplicateregionnameactivity.i = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String i>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static boolean a(DuplicateRegionNameActivity duplicateregionnameactivity)
	{
		return duplicateregionnameactivity.j;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean j>
	//    2    4:ireturn         
	}

	static boolean a(DuplicateRegionNameActivity duplicateregionnameactivity, boolean flag)
	{
		duplicateregionnameactivity.j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean j>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String b(DuplicateRegionNameActivity duplicateregionnameactivity)
	{
		return duplicateregionnameactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String i>
	//    2    4:areturn         
	}

	static void c(DuplicateRegionNameActivity duplicateregionnameactivity)
	{
		duplicateregionnameactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void h()>
	//    2    4:return          
	}

	private void h()
	{
		Toast.makeText(((android.content.Context) (this)), ((CharSequence) (getString(0x7f0f0642))), 1).show();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #48  <Int 0x7f0f0642>
	//    3    4:invokevirtual   #52  <Method String getString(int)>
	//    4    7:iconst_1        
	//    5    8:invokestatic    #58  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//    6   11:invokevirtual   #61  <Method void Toast.show()>
	//    7   14:return          
	}

	public void e()
	{
		if(a == null || a.equalsIgnoreCase("") || d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field String a>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field String a>
	//*   5   11:ldc1            #31  <String "">
	//*   6   13:invokevirtual   #67  <Method boolean String.equalsIgnoreCase(String)>
	//*   7   16:ifne            26
	//*   8   19:aload_0         
	//*   9   20:getfield        #35  <Field boolean d>
	//*  10   23:ifeq            76
		{
			e.setHint(((CharSequence) (getString(0x7f0f0677))));
	//   11   26:aload_0         
	//   12   27:getfield        #69  <Field CustomEditTextView e>
	//   13   30:aload_0         
	//   14   31:ldc1            #70  <Int 0x7f0f0677>
	//   15   33:invokevirtual   #52  <Method String getString(int)>
	//   16   36:invokevirtual   #76  <Method void CustomEditTextView.setHint(CharSequence)>
			f.setVisibility(0);
	//   17   39:aload_0         
	//   18   40:getfield        #78  <Field CustomTextView f>
	//   19   43:iconst_0        
	//   20   44:invokevirtual   #84  <Method void CustomTextView.setVisibility(int)>
			f.setTextColor(getResources().getColor(0x7f060076));
	//   21   47:aload_0         
	//   22   48:getfield        #78  <Field CustomTextView f>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #88  <Method Resources getResources()>
	//   25   55:ldc1            #89  <Int 0x7f060076>
	//   26   57:invokevirtual   #95  <Method int Resources.getColor(int)>
	//   27   60:invokevirtual   #98  <Method void CustomTextView.setTextColor(int)>
			f.setText(((CharSequence) (getString(0x7f0f0678))));
	//   28   63:aload_0         
	//   29   64:getfield        #78  <Field CustomTextView f>
	//   30   67:aload_0         
	//   31   68:ldc1            #99  <Int 0x7f0f0678>
	//   32   70:invokevirtual   #52  <Method String getString(int)>
	//   33   73:invokevirtual   #102 <Method void CustomTextView.setText(CharSequence)>
		}
		if(d)
	//*  34   76:aload_0         
	//*  35   77:getfield        #35  <Field boolean d>
	//*  36   80:ifeq            91
			h.setVisibility(4);
	//   37   83:aload_0         
	//   38   84:getfield        #104 <Field CustomTextView h>
	//   39   87:iconst_4        
	//   40   88:invokevirtual   #84  <Method void CustomTextView.setVisibility(int)>
		e.setText(((CharSequence) (a)));
	//   41   91:aload_0         
	//   42   92:getfield        #69  <Field CustomEditTextView e>
	//   43   95:aload_0         
	//   44   96:getfield        #33  <Field String a>
	//   45   99:invokevirtual   #105 <Method void CustomEditTextView.setText(CharSequence)>
		e.setSelectAllOnFocus(true);
	//   46  102:aload_0         
	//   47  103:getfield        #69  <Field CustomEditTextView e>
	//   48  106:iconst_1        
	//   49  107:invokevirtual   #109 <Method void CustomEditTextView.setSelectAllOnFocus(boolean)>
		e.requestFocus();
	//   50  110:aload_0         
	//   51  111:getfield        #69  <Field CustomEditTextView e>
	//   52  114:invokevirtual   #113 <Method boolean CustomEditTextView.requestFocus()>
	//   53  117:pop             
		getWindow().setSoftInputMode(4);
	//   54  118:aload_0         
	//   55  119:invokevirtual   #117 <Method Window getWindow()>
	//   56  122:iconst_4        
	//   57  123:invokevirtual   #122 <Method void Window.setSoftInputMode(int)>
		e.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
				if(a.c == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field DuplicateRegionNameActivity a>
			//*   2    4:getfield        #26  <Field ArrayList DuplicateRegionNameActivity.c>
			//*   3    7:ifnonnull       11
					return;
			//    4   10:return          
				editable = ((Editable) (((Object) (editable)).toString().trim()));
			//    5   11:aload_1         
			//    6   12:invokevirtual   #30  <Method String Object.toString()>
			//    7   15:invokevirtual   #35  <Method String String.trim()>
			//    8   18:astore_1        
				if(((String) (editable)).length() == 0)
			//*   9   19:aload_1         
			//*  10   20:invokevirtual   #39  <Method int String.length()>
			//*  11   23:ifne            107
				{
					DuplicateRegionNameActivity.a(a, false);
			//   12   26:aload_0         
			//   13   27:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   14   30:iconst_0        
			//   15   31:invokestatic    #42  <Method boolean DuplicateRegionNameActivity.a(DuplicateRegionNameActivity, boolean)>
			//   16   34:pop             
					a.f.setVisibility(0);
			//   17   35:aload_0         
			//   18   36:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   19   39:getfield        #46  <Field CustomTextView DuplicateRegionNameActivity.f>
			//   20   42:iconst_0        
			//   21   43:invokevirtual   #52  <Method void CustomTextView.setVisibility(int)>
					a.f.setTextColor(a.getResources().getColor(0x7f060076));
			//   22   46:aload_0         
			//   23   47:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   24   50:getfield        #46  <Field CustomTextView DuplicateRegionNameActivity.f>
			//   25   53:aload_0         
			//   26   54:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   27   57:invokevirtual   #56  <Method Resources DuplicateRegionNameActivity.getResources()>
			//   28   60:ldc1            #57  <Int 0x7f060076>
			//   29   62:invokevirtual   #63  <Method int Resources.getColor(int)>
			//   30   65:invokevirtual   #66  <Method void CustomTextView.setTextColor(int)>
					a.f.setText(((CharSequence) (a.getString(0x7f0f0678))));
			//   31   68:aload_0         
			//   32   69:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   33   72:getfield        #46  <Field CustomTextView DuplicateRegionNameActivity.f>
			//   34   75:aload_0         
			//   35   76:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   36   79:ldc1            #67  <Int 0x7f0f0678>
			//   37   81:invokevirtual   #71  <Method String DuplicateRegionNameActivity.getString(int)>
			//   38   84:invokevirtual   #75  <Method void CustomTextView.setText(CharSequence)>
					a.e.setHint(((CharSequence) (a.getString(0x7f0f0677))));
			//   39   87:aload_0         
			//   40   88:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   41   91:getfield        #78  <Field CustomEditTextView DuplicateRegionNameActivity.e>
			//   42   94:aload_0         
			//   43   95:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   44   98:ldc1            #79  <Int 0x7f0f0677>
			//   45  100:invokevirtual   #71  <Method String DuplicateRegionNameActivity.getString(int)>
			//   46  103:invokevirtual   #84  <Method void CustomEditTextView.setHint(CharSequence)>
					return;
			//   47  106:return          
				}
				for(Iterator iterator = a.c.iterator(); iterator.hasNext();)
			//*  48  107:aload_0         
			//*  49  108:getfield        #17  <Field DuplicateRegionNameActivity a>
			//*  50  111:getfield        #26  <Field ArrayList DuplicateRegionNameActivity.c>
			//*  51  114:invokevirtual   #90  <Method Iterator ArrayList.iterator()>
			//*  52  117:astore_2        
			//*  53  118:aload_2         
			//*  54  119:invokeinterface #96  <Method boolean Iterator.hasNext()>
			//*  55  124:ifeq            208
					if(((String) (editable)).equalsIgnoreCase((String)iterator.next()))
			//*  56  127:aload_1         
			//*  57  128:aload_2         
			//*  58  129:invokeinterface #100 <Method Object Iterator.next()>
			//*  59  134:checkcast       #32  <Class String>
			//*  60  137:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
			//*  61  140:ifeq            118
					{
						DuplicateRegionNameActivity.a(a, false);
			//   62  143:aload_0         
			//   63  144:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   64  147:iconst_0        
			//   65  148:invokestatic    #42  <Method boolean DuplicateRegionNameActivity.a(DuplicateRegionNameActivity, boolean)>
			//   66  151:pop             
						a.f.setVisibility(0);
			//   67  152:aload_0         
			//   68  153:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   69  156:getfield        #46  <Field CustomTextView DuplicateRegionNameActivity.f>
			//   70  159:iconst_0        
			//   71  160:invokevirtual   #52  <Method void CustomTextView.setVisibility(int)>
						a.f.setTextColor(a.getResources().getColor(0x7f060079));
			//   72  163:aload_0         
			//   73  164:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   74  167:getfield        #46  <Field CustomTextView DuplicateRegionNameActivity.f>
			//   75  170:aload_0         
			//   76  171:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   77  174:invokevirtual   #56  <Method Resources DuplicateRegionNameActivity.getResources()>
			//   78  177:ldc1            #105 <Int 0x7f060079>
			//   79  179:invokevirtual   #63  <Method int Resources.getColor(int)>
			//   80  182:invokevirtual   #66  <Method void CustomTextView.setTextColor(int)>
						a.f.setText(((CharSequence) (a.getResources().getString(0x7f0f066b))));
			//   81  185:aload_0         
			//   82  186:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   83  189:getfield        #46  <Field CustomTextView DuplicateRegionNameActivity.f>
			//   84  192:aload_0         
			//   85  193:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   86  196:invokevirtual   #56  <Method Resources DuplicateRegionNameActivity.getResources()>
			//   87  199:ldc1            #106 <Int 0x7f0f066b>
			//   88  201:invokevirtual   #107 <Method String Resources.getString(int)>
			//   89  204:invokevirtual   #75  <Method void CustomTextView.setText(CharSequence)>
						return;
			//   90  207:return          
					}

				a.e.setImeOptions(6);
			//   91  208:aload_0         
			//   92  209:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   93  212:getfield        #78  <Field CustomEditTextView DuplicateRegionNameActivity.e>
			//   94  215:bipush          6
			//   95  217:invokevirtual   #110 <Method void CustomEditTextView.setImeOptions(int)>
				DuplicateRegionNameActivity.a(a, ((String) (editable)));
			//   96  220:aload_0         
			//   97  221:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   98  224:aload_1         
			//   99  225:invokestatic    #113 <Method String DuplicateRegionNameActivity.a(DuplicateRegionNameActivity, String)>
			//  100  228:pop             
				DuplicateRegionNameActivity.a(a, true);
			//  101  229:aload_0         
			//  102  230:getfield        #17  <Field DuplicateRegionNameActivity a>
			//  103  233:iconst_1        
			//  104  234:invokestatic    #42  <Method boolean DuplicateRegionNameActivity.a(DuplicateRegionNameActivity, boolean)>
			//  105  237:pop             
				a.f.setVisibility(4);
			//  106  238:aload_0         
			//  107  239:getfield        #17  <Field DuplicateRegionNameActivity a>
			//  108  242:getfield        #46  <Field CustomTextView DuplicateRegionNameActivity.f>
			//  109  245:iconst_4        
			//  110  246:invokevirtual   #52  <Method void CustomTextView.setVisibility(int)>
			//  111  249:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int k, int l, int i1)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int k, int l, int i1)
			{
				DuplicateRegionNameActivity.a(a, false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DuplicateRegionNameActivity a>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #42  <Method boolean DuplicateRegionNameActivity.a(DuplicateRegionNameActivity, boolean)>
			//    4    8:pop             
			//    5    9:return          
			}

			final DuplicateRegionNameActivity a;

			
			{
				a = DuplicateRegionNameActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DuplicateRegionNameActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   58  126:aload_0         
	//   59  127:getfield        #69  <Field CustomEditTextView e>
	//   60  130:new             #6   <Class DuplicateRegionNameActivity$1>
	//   61  133:dup             
	//   62  134:aload_0         
	//   63  135:invokespecial   #124 <Method void DuplicateRegionNameActivity$1(DuplicateRegionNameActivity)>
	//   64  138:invokevirtual   #128 <Method void CustomEditTextView.addTextChangedListener(TextWatcher)>
		e.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

			public boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
			{
				if(k == 6)
			//*   0    0:iload_2         
			//*   1    1:bipush          6
			//*   2    3:icmpne          80
				{
					if(DuplicateRegionNameActivity.a(a))
			//*   3    6:aload_0         
			//*   4    7:getfield        #17  <Field DuplicateRegionNameActivity a>
			//*   5   10:invokestatic    #25  <Method boolean DuplicateRegionNameActivity.a(DuplicateRegionNameActivity)>
			//*   6   13:ifeq            71
					{
						textview = ((TextView) (new Intent()));
			//    7   16:new             #27  <Class Intent>
			//    8   19:dup             
			//    9   20:invokespecial   #28  <Method void Intent()>
			//   10   23:astore_1        
						((Intent) (textview)).putExtra("validRegionName", DuplicateRegionNameActivity.b(a));
			//   11   24:aload_1         
			//   12   25:ldc1            #30  <String "validRegionName">
			//   13   27:aload_0         
			//   14   28:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   15   31:invokestatic    #34  <Method String DuplicateRegionNameActivity.b(DuplicateRegionNameActivity)>
			//   16   34:invokevirtual   #38  <Method Intent Intent.putExtra(String, String)>
			//   17   37:pop             
						((Intent) (textview)).putExtra("shouldRenamePrevious", false);
			//   18   38:aload_1         
			//   19   39:ldc1            #40  <String "shouldRenamePrevious">
			//   20   41:iconst_0        
			//   21   42:invokevirtual   #43  <Method Intent Intent.putExtra(String, boolean)>
			//   22   45:pop             
						a.setResult(-1, ((Intent) (textview)));
			//   23   46:aload_0         
			//   24   47:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   25   50:iconst_m1       
			//   26   51:aload_1         
			//   27   52:invokevirtual   #47  <Method void DuplicateRegionNameActivity.setResult(int, Intent)>
						a.w();
			//   28   55:aload_0         
			//   29   56:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   30   59:invokevirtual   #50  <Method void DuplicateRegionNameActivity.w()>
						a.finish();
			//   31   62:aload_0         
			//   32   63:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   33   66:invokevirtual   #53  <Method void DuplicateRegionNameActivity.finish()>
						return true;
			//   34   69:iconst_1        
			//   35   70:ireturn         
					} else
					{
						DuplicateRegionNameActivity.c(a);
			//   36   71:aload_0         
			//   37   72:getfield        #17  <Field DuplicateRegionNameActivity a>
			//   38   75:invokestatic    #56  <Method void DuplicateRegionNameActivity.c(DuplicateRegionNameActivity)>
						return true;
			//   39   78:iconst_1        
			//   40   79:ireturn         
					}
				} else
				{
					return false;
			//   41   80:iconst_0        
			//   42   81:ireturn         
				}
			}

			final DuplicateRegionNameActivity a;

			
			{
				a = DuplicateRegionNameActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DuplicateRegionNameActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   65  141:aload_0         
	//   66  142:getfield        #69  <Field CustomEditTextView e>
	//   67  145:new             #8   <Class DuplicateRegionNameActivity$2>
	//   68  148:dup             
	//   69  149:aload_0         
	//   70  150:invokespecial   #129 <Method void DuplicateRegionNameActivity$2(DuplicateRegionNameActivity)>
	//   71  153:invokevirtual   #133 <Method void CustomEditTextView.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
	//   72  156:return          
	}

	public void f()
	{
		if(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean j>
	//*   2    4:ifeq            60
		{
			Intent intent = new Intent();
	//    3    7:new             #135 <Class Intent>
	//    4   10:dup             
	//    5   11:invokespecial   #136 <Method void Intent()>
	//    6   14:astore_1        
			intent.putExtra("validRegionName", i);
	//    7   15:aload_1         
	//    8   16:ldc1            #138 <String "validRegionName">
	//    9   18:aload_0         
	//   10   19:getfield        #37  <Field String i>
	//   11   22:invokevirtual   #142 <Method Intent Intent.putExtra(String, String)>
	//   12   25:pop             
			intent.putExtra("previousRegionName", a);
	//   13   26:aload_1         
	//   14   27:ldc1            #144 <String "previousRegionName">
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field String a>
	//   17   33:invokevirtual   #142 <Method Intent Intent.putExtra(String, String)>
	//   18   36:pop             
			intent.putExtra("shouldRenamePrevious", true);
	//   19   37:aload_1         
	//   20   38:ldc1            #146 <String "shouldRenamePrevious">
	//   21   40:iconst_1        
	//   22   41:invokevirtual   #149 <Method Intent Intent.putExtra(String, boolean)>
	//   23   44:pop             
			setResult(-1, intent);
	//   24   45:aload_0         
	//   25   46:iconst_m1       
	//   26   47:aload_1         
	//   27   48:invokevirtual   #153 <Method void setResult(int, Intent)>
			w();
	//   28   51:aload_0         
	//   29   52:invokevirtual   #156 <Method void w()>
			finish();
	//   30   55:aload_0         
	//   31   56:invokevirtual   #159 <Method void finish()>
			return;
	//   32   59:return          
		} else
		{
			h();
	//   33   60:aload_0         
	//   34   61:invokespecial   #47  <Method void h()>
			return;
	//   35   64:return          
		}
	}

	public void g()
	{
		e.setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field CustomEditTextView e>
	//    2    4:ldc1            #31  <String "">
	//    3    6:invokevirtual   #105 <Method void CustomEditTextView.setText(CharSequence)>
	//    4    9:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method void BaseFragmentActivity.onBackPressed()>
		w();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #156 <Method void w()>
		setResult(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #164 <Method void setResult(int)>
		finish();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #159 <Method void finish()>
	//    9   17:return          
	}

	String a;
	String b;
	ArrayList c;
	boolean d;
	CustomEditTextView e;
	CustomTextView f;
	ImageButton g;
	CustomTextView h;
	private String i;
	private boolean j;
}
