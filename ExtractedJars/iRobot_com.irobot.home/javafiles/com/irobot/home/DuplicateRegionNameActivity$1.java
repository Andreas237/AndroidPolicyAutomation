// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import com.irobot.home.view.CustomEditTextView;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			DuplicateRegionNameActivity

class DuplicateRegionNameActivity$1
	implements TextWatcher
{

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

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
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

	DuplicateRegionNameActivity$1(DuplicateRegionNameActivity duplicateregionnameactivity)
	{
		a = duplicateregionnameactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DuplicateRegionNameActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
