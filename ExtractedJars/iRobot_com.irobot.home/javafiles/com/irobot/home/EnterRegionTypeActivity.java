// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.irobot.core.*;
import com.irobot.home.b.af;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, DuplicateRegionNameActivity_

public class EnterRegionTypeActivity extends BaseFragmentActivity
	implements com.irobot.home.b.af.a
{

	public EnterRegionTypeActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	private void f()
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Resources getResources()>
	//    2    4:astore_1        
		g = new HashMap();
	//    3    5:aload_0         
	//    4    6:new             #49  <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #50  <Method void HashMap()>
	//    7   13:putfield        #52  <Field HashMap g>
		g.put(((Object) (RegionType.Bathroom)), ((Object) (resources.getString(0x7f0f0632))));
	//    8   16:aload_0         
	//    9   17:getfield        #52  <Field HashMap g>
	//   10   20:getstatic       #57  <Field RegionType RegionType.Bathroom>
	//   11   23:aload_1         
	//   12   24:ldc1            #58  <Int 0x7f0f0632>
	//   13   26:invokevirtual   #64  <Method String Resources.getString(int)>
	//   14   29:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   15   32:pop             
		g.put(((Object) (RegionType.Bedroom)), ((Object) (resources.getString(0x7f0f0633))));
	//   16   33:aload_0         
	//   17   34:getfield        #52  <Field HashMap g>
	//   18   37:getstatic       #71  <Field RegionType RegionType.Bedroom>
	//   19   40:aload_1         
	//   20   41:ldc1            #72  <Int 0x7f0f0633>
	//   21   43:invokevirtual   #64  <Method String Resources.getString(int)>
	//   22   46:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   23   49:pop             
		g.put(((Object) (RegionType.DiningRoom)), ((Object) (resources.getString(0x7f0f0634))));
	//   24   50:aload_0         
	//   25   51:getfield        #52  <Field HashMap g>
	//   26   54:getstatic       #75  <Field RegionType RegionType.DiningRoom>
	//   27   57:aload_1         
	//   28   58:ldc1            #76  <Int 0x7f0f0634>
	//   29   60:invokevirtual   #64  <Method String Resources.getString(int)>
	//   30   63:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   31   66:pop             
		g.put(((Object) (RegionType.Entryway)), ((Object) (resources.getString(0x7f0f0635))));
	//   32   67:aload_0         
	//   33   68:getfield        #52  <Field HashMap g>
	//   34   71:getstatic       #79  <Field RegionType RegionType.Entryway>
	//   35   74:aload_1         
	//   36   75:ldc1            #80  <Int 0x7f0f0635>
	//   37   77:invokevirtual   #64  <Method String Resources.getString(int)>
	//   38   80:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   39   83:pop             
		g.put(((Object) (RegionType.Hallway)), ((Object) (resources.getString(0x7f0f0636))));
	//   40   84:aload_0         
	//   41   85:getfield        #52  <Field HashMap g>
	//   42   88:getstatic       #83  <Field RegionType RegionType.Hallway>
	//   43   91:aload_1         
	//   44   92:ldc1            #84  <Int 0x7f0f0636>
	//   45   94:invokevirtual   #64  <Method String Resources.getString(int)>
	//   46   97:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   47  100:pop             
		g.put(((Object) (RegionType.Kitchen)), ((Object) (resources.getString(0x7f0f065b))));
	//   48  101:aload_0         
	//   49  102:getfield        #52  <Field HashMap g>
	//   50  105:getstatic       #87  <Field RegionType RegionType.Kitchen>
	//   51  108:aload_1         
	//   52  109:ldc1            #88  <Int 0x7f0f065b>
	//   53  111:invokevirtual   #64  <Method String Resources.getString(int)>
	//   54  114:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   55  117:pop             
		g.put(((Object) (RegionType.LaundryRoom)), ((Object) (resources.getString(0x7f0f0637))));
	//   56  118:aload_0         
	//   57  119:getfield        #52  <Field HashMap g>
	//   58  122:getstatic       #91  <Field RegionType RegionType.LaundryRoom>
	//   59  125:aload_1         
	//   60  126:ldc1            #92  <Int 0x7f0f0637>
	//   61  128:invokevirtual   #64  <Method String Resources.getString(int)>
	//   62  131:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   63  134:pop             
		g.put(((Object) (RegionType.LivingRoom)), ((Object) (resources.getString(0x7f0f0638))));
	//   64  135:aload_0         
	//   65  136:getfield        #52  <Field HashMap g>
	//   66  139:getstatic       #95  <Field RegionType RegionType.LivingRoom>
	//   67  142:aload_1         
	//   68  143:ldc1            #96  <Int 0x7f0f0638>
	//   69  145:invokevirtual   #64  <Method String Resources.getString(int)>
	//   70  148:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   71  151:pop             
		g.put(((Object) (RegionType.Office)), ((Object) (resources.getString(0x7f0f066d))));
	//   72  152:aload_0         
	//   73  153:getfield        #52  <Field HashMap g>
	//   74  156:getstatic       #99  <Field RegionType RegionType.Office>
	//   75  159:aload_1         
	//   76  160:ldc1            #100 <Int 0x7f0f066d>
	//   77  162:invokevirtual   #64  <Method String Resources.getString(int)>
	//   78  165:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   79  168:pop             
		g.put(((Object) (RegionType.Playroom)), ((Object) (resources.getString(0x7f0f0631))));
	//   80  169:aload_0         
	//   81  170:getfield        #52  <Field HashMap g>
	//   82  173:getstatic       #103 <Field RegionType RegionType.Playroom>
	//   83  176:aload_1         
	//   84  177:ldc1            #104 <Int 0x7f0f0631>
	//   85  179:invokevirtual   #64  <Method String Resources.getString(int)>
	//   86  182:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   87  185:pop             
		g.put(((Object) (RegionType.StorageRoom)), ((Object) (resources.getString(0x7f0f0639))));
	//   88  186:aload_0         
	//   89  187:getfield        #52  <Field HashMap g>
	//   90  190:getstatic       #107 <Field RegionType RegionType.StorageRoom>
	//   91  193:aload_1         
	//   92  194:ldc1            #108 <Int 0x7f0f0639>
	//   93  196:invokevirtual   #64  <Method String Resources.getString(int)>
	//   94  199:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   95  202:pop             
		g.put(((Object) (RegionType.Custom)), ((Object) (resources.getString(0x7f0f0630))));
	//   96  203:aload_0         
	//   97  204:getfield        #52  <Field HashMap g>
	//   98  207:getstatic       #111 <Field RegionType RegionType.Custom>
	//   99  210:aload_1         
	//  100  211:ldc1            #112 <Int 0x7f0f0630>
	//  101  213:invokevirtual   #64  <Method String Resources.getString(int)>
	//  102  216:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//  103  219:pop             
	//  104  220:return          
	}

	public void a(RegionTypeTableItem regiontypetableitem, String s)
	{
		h = regiontypetableitem.getRegionType();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method RegionType RegionTypeTableItem.getRegionType()>
	//    3    5:putfield        #121 <Field RegionType h>
		com.irobot.home.DuplicateRegionNameActivity_.a(((android.content.Context) (this))).a(true).a(b).a(1);
	//    4    8:aload_0         
	//    5    9:invokestatic    #126 <Method DuplicateRegionNameActivity_$a com.irobot.home.DuplicateRegionNameActivity_.a(android.content.Context)>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #131 <Method DuplicateRegionNameActivity_$a com.irobot.home.DuplicateRegionNameActivity_$a.a(boolean)>
	//    8   16:aload_0         
	//    9   17:getfield        #133 <Field ArrayList b>
	//   10   20:invokevirtual   #136 <Method DuplicateRegionNameActivity_$a com.irobot.home.DuplicateRegionNameActivity_$a.a(ArrayList)>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #139 <Method org.androidannotations.api.a.e com.irobot.home.DuplicateRegionNameActivity_$a.a(int)>
	//   13   27:pop             
	//   14   28:return          
	}

	void e()
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void f()>
		c.setHasFixedSize(true);
	//    2    4:aload_0         
	//    3    5:getfield        #143 <Field RecyclerView c>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #149 <Method void RecyclerView.setHasFixedSize(boolean)>
		f = ((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((android.content.Context) (this)))));
	//    6   12:aload_0         
	//    7   13:new             #151 <Class LinearLayoutManager>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #154 <Method void LinearLayoutManager(android.content.Context)>
	//   11   21:putfield        #156 <Field android.support.v7.widget.RecyclerView$h f>
		c.setLayoutManager(f);
	//   12   24:aload_0         
	//   13   25:getfield        #143 <Field RecyclerView c>
	//   14   28:aload_0         
	//   15   29:getfield        #156 <Field android.support.v7.widget.RecyclerView$h f>
	//   16   32:invokevirtual   #160 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		f();
	//   17   35:aload_0         
	//   18   36:invokespecial   #141 <Method void f()>
		Object obj = ((Object) (j.a(a)));
	//   19   39:aload_0         
	//   20   40:getfield        #162 <Field String a>
	//   21   43:invokestatic    #165 <Method a j.a(String)>
	//   22   46:astore_1        
		if(obj == null)
	//*  23   47:aload_1         
	//*  24   48:ifnonnull       63
		{
			o.b(d, "No asset found, early return during init");
	//   25   51:getstatic       #39  <Field String d>
	//   26   54:ldc1            #167 <String "No asset found, early return during init">
	//   27   56:invokestatic    #172 <Method void o.b(String, String)>
			finish();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #175 <Method void finish()>
		}
		obj = ((Object) (Assembler.getInstance().getMapsUIService(((a) (obj)).b())));
	//   30   63:invokestatic    #181 <Method Assembler Assembler.getInstance()>
	//   31   66:aload_1         
	//   32   67:invokevirtual   #186 <Method com.irobot.core.AssetId a.b()>
	//   33   70:invokevirtual   #190 <Method MapsUIService Assembler.getMapsUIService(com.irobot.core.AssetId)>
	//   34   73:astore_1        
		((MapsUIService) (obj)).sendCommand(MapsUIServiceCommand.GetBasicRegionTypeTable, ((MapsUIServiceData) (null)));
	//   35   74:aload_1         
	//   36   75:getstatic       #196 <Field MapsUIServiceCommand MapsUIServiceCommand.GetBasicRegionTypeTable>
	//   37   78:aconst_null     
	//   38   79:invokevirtual   #202 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		obj = ((Object) (((MapsUIService) (obj)).getServiceData()));
	//   39   82:aload_1         
	//   40   83:invokevirtual   #206 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   41   86:astore_1        
		e = new af(((android.content.Context) (this)), ((MapsUIServiceData) (obj)).getBasicRegionTypeTable(), g, true);
	//   42   87:aload_0         
	//   43   88:new             #208 <Class af>
	//   44   91:dup             
	//   45   92:aload_0         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #214 <Method ArrayList MapsUIServiceData.getBasicRegionTypeTable()>
	//   48   97:aload_0         
	//   49   98:getfield        #52  <Field HashMap g>
	//   50  101:iconst_1        
	//   51  102:invokespecial   #217 <Method void af(android.content.Context, ArrayList, HashMap, boolean)>
	//   52  105:putfield        #219 <Field af e>
		c.setAdapter(((android.support.v7.widget.RecyclerView.a) (e)));
	//   53  108:aload_0         
	//   54  109:getfield        #143 <Field RecyclerView c>
	//   55  112:aload_0         
	//   56  113:getfield        #219 <Field af e>
	//   57  116:invokevirtual   #223 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		e.b(((MapsUIServiceData) (obj)).getCustomRegionTypeItem());
	//   58  119:aload_0         
	//   59  120:getfield        #219 <Field af e>
	//   60  123:aload_1         
	//   61  124:invokevirtual   #227 <Method RegionTypeTableItem MapsUIServiceData.getCustomRegionTypeItem()>
	//   62  127:invokevirtual   #230 <Method void af.b(RegionTypeTableItem)>
		e.a(((com.irobot.home.b.af.a) (this)));
	//   63  130:aload_0         
	//   64  131:getfield        #219 <Field af e>
	//   65  134:aload_0         
	//   66  135:invokevirtual   #233 <Method void af.a(com.irobot.home.b.af$a)>
	//   67  138:return          
	}

	protected void onActivityResult(int i, int k, Intent intent)
	{
		super.onActivityResult(i, k, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #237 <Method void BaseFragmentActivity.onActivityResult(int, int, Intent)>
		if(i == 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          71
		{
			if(k == -1)
	//*   8   12:iload_2         
	//*   9   13:iconst_m1       
	//*  10   14:icmpne          66
			{
				intent = ((Intent) (intent.getStringExtra("validRegionName")));
	//   11   17:aload_3         
	//   12   18:ldc1            #239 <String "validRegionName">
	//   13   20:invokevirtual   #244 <Method String Intent.getStringExtra(String)>
	//   14   23:astore_3        
				Intent intent1 = new Intent();
	//   15   24:new             #241 <Class Intent>
	//   16   27:dup             
	//   17   28:invokespecial   #245 <Method void Intent()>
	//   18   31:astore          4
				intent1.putExtra("validRegionName", ((String) (intent)));
	//   19   33:aload           4
	//   20   35:ldc1            #239 <String "validRegionName">
	//   21   37:aload_3         
	//   22   38:invokevirtual   #249 <Method Intent Intent.putExtra(String, String)>
	//   23   41:pop             
				intent1.putExtra("customRegionType", ((java.io.Serializable) (h)));
	//   24   42:aload           4
	//   25   44:ldc1            #251 <String "customRegionType">
	//   26   46:aload_0         
	//   27   47:getfield        #121 <Field RegionType h>
	//   28   50:invokevirtual   #254 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   29   53:pop             
				setResult(-1, intent1);
	//   30   54:aload_0         
	//   31   55:iconst_m1       
	//   32   56:aload           4
	//   33   58:invokevirtual   #258 <Method void setResult(int, Intent)>
				finish();
	//   34   61:aload_0         
	//   35   62:invokevirtual   #175 <Method void finish()>
				return;
	//   36   65:return          
			}
			setResult(0);
	//   37   66:aload_0         
	//   38   67:iconst_0        
	//   39   68:invokevirtual   #261 <Method void setResult(int)>
		}
	//   40   71:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #264 <Method void BaseFragmentActivity.onBackPressed()>
		w();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #267 <Method void w()>
		setResult(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #261 <Method void setResult(int)>
		finish();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #175 <Method void finish()>
	//    9   17:return          
	}

	private static final String d = j.r(((Class) (com/irobot/home/EnterRegionTypeActivity)).getSimpleName());
	String a;
	ArrayList b;
	RecyclerView c;
	private af e;
	private android.support.v7.widget.RecyclerView.h f;
	private HashMap g;
	private RegionType h;

	static 
	{
	//    0    0:ldc1            #2   <Class EnterRegionTypeActivity>
	//    1    2:invokevirtual   #31  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #37  <Method String j.r(String)>
	//    3    8:putstatic       #39  <Field String d>
	//*   4   11:return          
	}
}
