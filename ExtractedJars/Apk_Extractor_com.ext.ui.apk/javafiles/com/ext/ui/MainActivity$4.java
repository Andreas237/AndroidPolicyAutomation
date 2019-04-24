// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.support.v7.bv;
import android.support.v7.ci;
import android.support.v7.view.ActionMode;
import android.view.*;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$4
	implements android.support.v7.view.back
{

	public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x7f090012)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #26  <Method int MenuItem.getItemId()>
	//*   2    6:ldc1            #27  <Int 0x7f090012>
	//*   3    8:icmpne          63
		{
			ci.a("MainActivity : ", "onActionItemClicked: Extract");
	//    4   11:ldc1            #29  <String "MainActivity : ">
	//    5   13:ldc1            #31  <String "onActionItemClicked: Extract">
	//    6   15:invokestatic    #36  <Method void ci.a(String, String)>
			actionmode = ((ActionMode) (new ArrayList()));
	//    7   18:new             #38  <Class ArrayList>
	//    8   21:dup             
	//    9   22:invokespecial   #39  <Method void ArrayList()>
	//   10   25:astore_1        
			((ArrayList) (actionmode)).addAll(((java.util.Collection) (MainActivity.a(a).d())));
	//   11   26:aload_1         
	//   12   27:aload_0         
	//   13   28:getfield        #14  <Field MainActivity a>
	//   14   31:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//   15   34:invokevirtual   #48  <Method HashSet bv.d()>
	//   16   37:invokevirtual   #52  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   17   40:pop             
			MainActivity.a(a, 1, ((ArrayList) (actionmode)), false);
	//   18   41:aload_0         
	//   19   42:getfield        #14  <Field MainActivity a>
	//   20   45:iconst_1        
	//   21   46:aload_1         
	//   22   47:iconst_0        
	//   23   48:invokestatic    #55  <Method void MainActivity.a(MainActivity, int, ArrayList, boolean)>
			MainActivity.d(a).finish();
	//   24   51:aload_0         
	//   25   52:getfield        #14  <Field MainActivity a>
	//   26   55:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
	//   27   58:invokevirtual   #63  <Method void ActionMode.finish()>
			return true;
	//   28   61:iconst_1        
	//   29   62:ireturn         
		}
		if(menuitem.getItemId() == 0x7f09002f)
	//*  30   63:aload_2         
	//*  31   64:invokeinterface #26  <Method int MenuItem.getItemId()>
	//*  32   69:ldc1            #64  <Int 0x7f09002f>
	//*  33   71:icmpne          230
		{
			int i = MainActivity.a(a).getItemCount();
	//   34   74:aload_0         
	//   35   75:getfield        #14  <Field MainActivity a>
	//   36   78:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//   37   81:invokevirtual   #67  <Method int bv.getItemCount()>
	//   38   84:istore_3        
			if(i <= MainActivity.a(a).d().size())
	//*  39   85:iload_3         
	//*  40   86:aload_0         
	//*  41   87:getfield        #14  <Field MainActivity a>
	//*  42   90:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//*  43   93:invokevirtual   #48  <Method HashSet bv.d()>
	//*  44   96:invokevirtual   #72  <Method int HashSet.size()>
	//*  45   99:icmpgt          169
			{
				menuitem.setIcon(0x108000f);
	//   46  102:aload_2         
	//   47  103:ldc1            #73  <Int 0x108000f>
	//   48  105:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
	//   49  110:pop             
				MainActivity.a(a).b();
	//   50  111:aload_0         
	//   51  112:getfield        #14  <Field MainActivity a>
	//   52  115:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//   53  118:invokevirtual   #80  <Method void bv.b()>
				MainActivity.d(a).setTitle(((CharSequence) ((new StringBuilder()).append("0 / ").append(i).toString())));
	//   54  121:aload_0         
	//   55  122:getfield        #14  <Field MainActivity a>
	//   56  125:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
	//   57  128:new             #82  <Class StringBuilder>
	//   58  131:dup             
	//   59  132:invokespecial   #83  <Method void StringBuilder()>
	//   60  135:ldc1            #85  <String "0 / ">
	//   61  137:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   62  140:iload_3         
	//   63  141:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   64  144:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   65  147:invokevirtual   #100 <Method void ActionMode.setTitle(CharSequence)>
				ci.a("MainActivity : ", "onActionItemClicked :check_box: Cleared all Selections");
	//   66  150:ldc1            #29  <String "MainActivity : ">
	//   67  152:ldc1            #102 <String "onActionItemClicked :check_box: Cleared all Selections">
	//   68  154:invokestatic    #36  <Method void ci.a(String, String)>
				MainActivity.d(a).finish();
	//   69  157:aload_0         
	//   70  158:getfield        #14  <Field MainActivity a>
	//   71  161:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
	//   72  164:invokevirtual   #63  <Method void ActionMode.finish()>
				return true;
	//   73  167:iconst_1        
	//   74  168:ireturn         
			} else
			{
				menuitem.setIcon(0x1080010);
	//   75  169:aload_2         
	//   76  170:ldc1            #103 <Int 0x1080010>
	//   77  172:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
	//   78  177:pop             
				MainActivity.a(a).c();
	//   79  178:aload_0         
	//   80  179:getfield        #14  <Field MainActivity a>
	//   81  182:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//   82  185:invokevirtual   #106 <Method void bv.c()>
				MainActivity.d(a).setTitle(((CharSequence) ((new StringBuilder()).append(i).append(" / ").append(i).toString())));
	//   83  188:aload_0         
	//   84  189:getfield        #14  <Field MainActivity a>
	//   85  192:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
	//   86  195:new             #82  <Class StringBuilder>
	//   87  198:dup             
	//   88  199:invokespecial   #83  <Method void StringBuilder()>
	//   89  202:iload_3         
	//   90  203:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   91  206:ldc1            #108 <String " / ">
	//   92  208:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   93  211:iload_3         
	//   94  212:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   95  215:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   96  218:invokevirtual   #100 <Method void ActionMode.setTitle(CharSequence)>
				ci.a("MainActivity : ", "onActionItemClicked:check_box: selected all items");
	//   97  221:ldc1            #29  <String "MainActivity : ">
	//   98  223:ldc1            #110 <String "onActionItemClicked:check_box: selected all items">
	//   99  225:invokestatic    #36  <Method void ci.a(String, String)>
				return true;
	//  100  228:iconst_1        
	//  101  229:ireturn         
			}
		} else
		{
			return false;
	//  102  230:iconst_0        
	//  103  231:ireturn         
		}
	}

	public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
	{
		ci.a("MainActivity : ", "onCreateActionMode");
	//    0    0:ldc1            #29  <String "MainActivity : ">
	//    1    2:ldc1            #113 <String "onCreateActionMode">
	//    2    4:invokestatic    #36  <Method void ci.a(String, String)>
		actionmode.getMenuInflater().inflate(0x7f0c0002, menu);
	//    3    7:aload_1         
	//    4    8:invokevirtual   #117 <Method MenuInflater ActionMode.getMenuInflater()>
	//    5   11:ldc1            #118 <Int 0x7f0c0002>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #124 <Method void MenuInflater.inflate(int, Menu)>
		MainActivity.a(a).a(true);
	//    8   17:aload_0         
	//    9   18:getfield        #14  <Field MainActivity a>
	//   10   21:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//   11   24:iconst_1        
	//   12   25:invokevirtual   #127 <Method void bv.a(boolean)>
		MainActivity.a(a).b();
	//   13   28:aload_0         
	//   14   29:getfield        #14  <Field MainActivity a>
	//   15   32:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//   16   35:invokevirtual   #80  <Method void bv.b()>
		return true;
	//   17   38:iconst_1        
	//   18   39:ireturn         
	}

	public void onDestroyActionMode(ActionMode actionmode)
	{
		MainActivity.a(a).a(false);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MainActivity a>
	//    2    4:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #127 <Method void bv.a(boolean)>
		MainActivity.a(a).b();
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field MainActivity a>
	//    7   15:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//    8   18:invokevirtual   #80  <Method void bv.b()>
		MainActivity.a(a, ((ActionMode) (null)));
	//    9   21:aload_0         
	//   10   22:getfield        #14  <Field MainActivity a>
	//   11   25:aconst_null     
	//   12   26:invokestatic    #132 <Method ActionMode MainActivity.a(MainActivity, ActionMode)>
	//   13   29:pop             
		MainActivity.a(a).b(1);
	//   14   30:aload_0         
	//   15   31:getfield        #14  <Field MainActivity a>
	//   16   34:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//   17   37:iconst_1        
	//   18   38:invokevirtual   #135 <Method void bv.b(int)>
		ci.a("MainActivity : ", "onDestroyActionMode");
	//   19   41:ldc1            #29  <String "MainActivity : ">
	//   20   43:ldc1            #136 <String "onDestroyActionMode">
	//   21   45:invokestatic    #36  <Method void ci.a(String, String)>
	//   22   48:return          
	}

	public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
	{
		int i = MainActivity.a(a).getItemCount();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MainActivity a>
	//    2    4:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//    3    7:invokevirtual   #67  <Method int bv.getItemCount()>
	//    4   10:istore_3        
		int j = MainActivity.a(a).d().size();
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field MainActivity a>
	//    7   15:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
	//    8   18:invokevirtual   #48  <Method HashSet bv.d()>
	//    9   21:invokevirtual   #72  <Method int HashSet.size()>
	//   10   24:istore          4
		String s = (new StringBuilder()).append(j).append(" / ").append(i).toString();
	//   11   26:new             #82  <Class StringBuilder>
	//   12   29:dup             
	//   13   30:invokespecial   #83  <Method void StringBuilder()>
	//   14   33:iload           4
	//   15   35:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   16   38:ldc1            #108 <String " / ">
	//   17   40:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:iload_3         
	//   19   44:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   20   47:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   21   50:astore          5
		if(i == j)
	//*  22   52:iload_3         
	//*  23   53:iload           4
	//*  24   55:icmpne          107
			menu.findItem(0x7f09002f).setIcon(0x1080010);
	//   25   58:aload_2         
	//   26   59:ldc1            #64  <Int 0x7f09002f>
	//   27   61:invokeinterface #142 <Method MenuItem Menu.findItem(int)>
	//   28   66:ldc1            #103 <Int 0x1080010>
	//   29   68:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
	//   30   73:pop             
		else
	//*  31   74:aload_1         
	//*  32   75:aload           5
	//*  33   77:invokevirtual   #100 <Method void ActionMode.setTitle(CharSequence)>
	//*  34   80:ldc1            #29  <String "MainActivity : ">
	//*  35   82:new             #82  <Class StringBuilder>
	//*  36   85:dup             
	//*  37   86:invokespecial   #83  <Method void StringBuilder()>
	//*  38   89:ldc1            #144 <String "onPrepareActionMode :">
	//*  39   91:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//*  40   94:aload           5
	//*  41   96:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//*  42   99:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  43  102:invokestatic    #36  <Method void ci.a(String, String)>
	//*  44  105:iconst_1        
	//*  45  106:ireturn         
			menu.findItem(0x7f09002f).setIcon(0x108000f);
	//   46  107:aload_2         
	//   47  108:ldc1            #64  <Int 0x7f09002f>
	//   48  110:invokeinterface #142 <Method MenuItem Menu.findItem(int)>
	//   49  115:ldc1            #73  <Int 0x108000f>
	//   50  117:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
	//   51  122:pop             
		actionmode.setTitle(((CharSequence) (s)));
		ci.a("MainActivity : ", (new StringBuilder()).append("onPrepareActionMode :").append(s).toString());
		return true;
	//*  52  123:goto            74
	}

	final MainActivity a;

	MainActivity$4(MainActivity mainactivity)
	{
		a = mainactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MainActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
