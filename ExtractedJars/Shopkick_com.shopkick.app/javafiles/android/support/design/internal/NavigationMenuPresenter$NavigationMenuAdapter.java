// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter, ParcelableSparseArray, NavigationMenuItemView

private class NavigationMenuPresenter$NavigationMenuAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

	private void appendTransparentIconIfMissing(int i, int j)
	{
		for(; i < j; i++)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          27
			(()items.get(i)).needsEmptyIcon = true;
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field ArrayList items>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//    7   13:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//    8   16:iconst_1        
	//    9   17:putfield        #60  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>

	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:istore_1        
	//*  14   24:goto            0
	//   15   27:return          
	}

	private void prepareMenuItems()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #62  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #64  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #69  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public Bundle createInstanceState()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #73  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void Bundle()>
	//    3    7:astore          4
		MenuItemImpl menuitemimpl = checkedItem;
	//    4    9:aload_0         
	//    5   10:getfield        #76  <Field MenuItemImpl checkedItem>
	//    6   13:astore_3        
		if(menuitemimpl != null)
	//*   7   14:aload_3         
	//*   8   15:ifnull          29
			bundle.putInt("android:menu:checked", menuitemimpl.getItemId());
	//    9   18:aload           4
	//   10   20:ldc1            #15  <String "android:menu:checked">
	//   11   22:aload_3         
	//   12   23:invokevirtual   #82  <Method int MenuItemImpl.getItemId()>
	//   13   26:invokevirtual   #86  <Method void Bundle.putInt(String, int)>
		SparseArray sparsearray = new SparseArray();
	//   14   29:new             #88  <Class SparseArray>
	//   15   32:dup             
	//   16   33:invokespecial   #89  <Method void SparseArray()>
	//   17   36:astore          5
		int i = 0;
	//   18   38:iconst_0        
	//   19   39:istore_1        
		for(int j = items.size(); i < j; i++)
	//*  20   40:aload_0         
	//*  21   41:getfield        #45  <Field ArrayList items>
	//*  22   44:invokevirtual   #92  <Method int ArrayList.size()>
	//*  23   47:istore_2        
	//*  24   48:iload_1         
	//*  25   49:iload_2         
	//*  26   50:icmpge          135
		{
			Object obj = ((Object) ((NavigationMenuPresenter.NavigationMenuItem)items.get(i)));
	//   27   53:aload_0         
	//   28   54:getfield        #45  <Field ArrayList items>
	//   29   57:iload_1         
	//   30   58:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   31   61:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
	//   32   64:astore_3        
			if(!(obj instanceof ))
				continue;
	//   33   65:aload_3         
	//   34   66:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   35   69:ifeq            128
			MenuItemImpl menuitemimpl1 = (()obj).getMenuItem();
	//   36   72:aload_3         
	//   37   73:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   38   76:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   39   79:astore          6
			if(menuitemimpl1 != null)
	//*  40   81:aload           6
	//*  41   83:ifnull          95
				obj = ((Object) (menuitemimpl1.getActionView()));
	//   42   86:aload           6
	//   43   88:invokevirtual   #102 <Method View MenuItemImpl.getActionView()>
	//   44   91:astore_3        
			else
	//*  45   92:goto            97
				obj = null;
	//   46   95:aconst_null     
	//   47   96:astore_3        
			if(obj != null)
	//*  48   97:aload_3         
	//*  49   98:ifnull          128
			{
				ParcelableSparseArray parcelablesparsearray = new ParcelableSparseArray();
	//   50  101:new             #104 <Class ParcelableSparseArray>
	//   51  104:dup             
	//   52  105:invokespecial   #105 <Method void ParcelableSparseArray()>
	//   53  108:astore          7
				((View) (obj)).saveHierarchyState(((SparseArray) (parcelablesparsearray)));
	//   54  110:aload_3         
	//   55  111:aload           7
	//   56  113:invokevirtual   #111 <Method void View.saveHierarchyState(SparseArray)>
				sparsearray.put(menuitemimpl1.getItemId(), ((Object) (parcelablesparsearray)));
	//   57  116:aload           5
	//   58  118:aload           6
	//   59  120:invokevirtual   #82  <Method int MenuItemImpl.getItemId()>
	//   60  123:aload           7
	//   61  125:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
			}
		}

	//   62  128:iload_1         
	//   63  129:iconst_1        
	//   64  130:iadd            
	//   65  131:istore_1        
	//*  66  132:goto            48
		bundle.putSparseParcelableArray("android:menu:action_views", sparsearray);
	//   67  135:aload           4
	//   68  137:ldc1            #12  <String "android:menu:action_views">
	//   69  139:aload           5
	//   70  141:invokevirtual   #119 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		return bundle;
	//   71  144:aload           4
	//   72  146:areturn         
	}

	public MenuItemImpl getCheckedItem()
	{
		return checkedItem;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MenuItemImpl checkedItem>
	//    2    4:areturn         
	}

	public int getItemCount()
	{
		return items.size();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ArrayList items>
	//    2    4:invokevirtual   #92  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public int getItemViewType(int i)
	{
		NavigationMenuPresenter.NavigationMenuItem navigationmenuitem = (NavigationMenuPresenter.NavigationMenuItem)items.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ArrayList items>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
	//    5   11:astore_2        
		if(navigationmenuitem instanceof rItem)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #126 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
	//*   8   16:ifeq            21
			return 2;
	//    9   19:iconst_2        
	//   10   20:ireturn         
		if(navigationmenuitem instanceof em)
	//*  11   21:aload_2         
	//*  12   22:instanceof      #128 <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
	//*  13   25:ifeq            30
			return 3;
	//   14   28:iconst_3        
	//   15   29:ireturn         
		if(navigationmenuitem instanceof )
	//*  16   30:aload_2         
	//*  17   31:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//*  18   34:ifeq            54
			return !(()navigationmenuitem).getMenuItem().hasSubMenu() ? 0 : 1;
	//   19   37:aload_2         
	//   20   38:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   21   41:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   22   44:invokevirtual   #132 <Method boolean MenuItemImpl.hasSubMenu()>
	//   23   47:ifeq            52
	//   24   50:iconst_1        
	//   25   51:ireturn         
	//   26   52:iconst_0        
	//   27   53:ireturn         
		else
			throw new RuntimeException("Unknown item type.");
	//   28   54:new             #62  <Class RuntimeException>
	//   29   57:dup             
	//   30   58:ldc1            #134 <String "Unknown item type.">
	//   31   60:invokespecial   #135 <Method void RuntimeException(String)>
	//   32   63:athrow          
	}

	public void onBindViewHolder(NavigationMenuPresenter.ViewHolder viewholder, int i)
	{
		NavigationMenuItemView navigationmenuitemview;
		switch(getItemViewType(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #139 <Method int getItemViewType(int)>
		{
	//*   3    5:tableswitch     0 2: default 32
	//	               0 91
	//	               1 63
	//	               2 33
		default:
			return;
	//    4   32:return          

		case 2: // '\002'
			rItem ritem = (rItem)items.get(i);
	//    5   33:aload_0         
	//    6   34:getfield        #45  <Field ArrayList items>
	//    7   37:iload_2         
	//    8   38:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//    9   41:checkcast       #126 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
	//   10   44:astore_3        
			viewholder.itemView.setPadding(0, ritem.getPaddingTop(), 0, ritem.getPaddingBottom());
	//   11   45:aload_1         
	//   12   46:getfield        #145 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//   13   49:iconst_0        
	//   14   50:aload_3         
	//   15   51:invokevirtual   #148 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingTop()>
	//   16   54:iconst_0        
	//   17   55:aload_3         
	//   18   56:invokevirtual   #151 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingBottom()>
	//   19   59:invokevirtual   #155 <Method void View.setPadding(int, int, int, int)>
			return;
	//   20   62:return          

		case 1: // '\001'
			((TextView)viewholder.itemView).setText((()items.get(i)).getMenuItem().getTitle());
	//   21   63:aload_1         
	//   22   64:getfield        #145 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//   23   67:checkcast       #157 <Class TextView>
	//   24   70:aload_0         
	//   25   71:getfield        #45  <Field ArrayList items>
	//   26   74:iload_2         
	//   27   75:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   28   78:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   29   81:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   30   84:invokevirtual   #161 <Method CharSequence MenuItemImpl.getTitle()>
	//   31   87:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
			return;
	//   32   90:return          

		case 0: // '\0'
			navigationmenuitemview = (NavigationMenuItemView)viewholder.itemView;
	//   33   91:aload_1         
	//   34   92:getfield        #145 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//   35   95:checkcast       #167 <Class NavigationMenuItemView>
	//   36   98:astore_3        
			navigationmenuitemview.setIconTintList(iconTintList);
	//   37   99:aload_3         
	//   38  100:aload_0         
	//   39  101:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   40  104:getfield        #171 <Field android.content.res.ColorStateList NavigationMenuPresenter.iconTintList>
	//   41  107:invokevirtual   #175 <Method void NavigationMenuItemView.setIconTintList(android.content.res.ColorStateList)>
			break;
		}
		if(textAppearanceSet)
	//*  42  110:aload_0         
	//*  43  111:getfield        #37  <Field NavigationMenuPresenter this$0>
	//*  44  114:getfield        #178 <Field boolean NavigationMenuPresenter.textAppearanceSet>
	//*  45  117:ifeq            131
			navigationmenuitemview.setTextAppearance(textAppearance);
	//   46  120:aload_3         
	//   47  121:aload_0         
	//   48  122:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   49  125:getfield        #181 <Field int NavigationMenuPresenter.textAppearance>
	//   50  128:invokevirtual   #185 <Method void NavigationMenuItemView.setTextAppearance(int)>
		if(textColor != null)
	//*  51  131:aload_0         
	//*  52  132:getfield        #37  <Field NavigationMenuPresenter this$0>
	//*  53  135:getfield        #188 <Field android.content.res.ColorStateList NavigationMenuPresenter.textColor>
	//*  54  138:ifnull          152
			navigationmenuitemview.setTextColor(textColor);
	//   55  141:aload_3         
	//   56  142:aload_0         
	//   57  143:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   58  146:getfield        #188 <Field android.content.res.ColorStateList NavigationMenuPresenter.textColor>
	//   59  149:invokevirtual   #191 <Method void NavigationMenuItemView.setTextColor(android.content.res.ColorStateList)>
		if(itemBackground != null)
	//*  60  152:aload_0         
	//*  61  153:getfield        #37  <Field NavigationMenuPresenter this$0>
	//*  62  156:getfield        #195 <Field Drawable NavigationMenuPresenter.itemBackground>
	//*  63  159:ifnull          179
			viewholder = ((NavigationMenuPresenter.ViewHolder) (itemBackground.getConstantState().newDrawable()));
	//   64  162:aload_0         
	//   65  163:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   66  166:getfield        #195 <Field Drawable NavigationMenuPresenter.itemBackground>
	//   67  169:invokevirtual   #201 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   68  172:invokevirtual   #207 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   69  175:astore_1        
		else
	//*  70  176:goto            181
			viewholder = null;
	//   71  179:aconst_null     
	//   72  180:astore_1        
		ViewCompat.setBackground(((View) (navigationmenuitemview)), ((Drawable) (viewholder)));
	//   73  181:aload_3         
	//   74  182:aload_1         
	//   75  183:invokestatic    #213 <Method void ViewCompat.setBackground(View, Drawable)>
		viewholder = ((NavigationMenuPresenter.ViewHolder) (()items.get(i)));
	//   76  186:aload_0         
	//   77  187:getfield        #45  <Field ArrayList items>
	//   78  190:iload_2         
	//   79  191:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   80  194:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   81  197:astore_1        
		navigationmenuitemview.setNeedsEmptyIcon((() (viewholder)).needsEmptyIcon);
	//   82  198:aload_3         
	//   83  199:aload_1         
	//   84  200:getfield        #60  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>
	//   85  203:invokevirtual   #217 <Method void NavigationMenuItemView.setNeedsEmptyIcon(boolean)>
		navigationmenuitemview.setHorizontalPadding(itemHorizontalPadding);
	//   86  206:aload_3         
	//   87  207:aload_0         
	//   88  208:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   89  211:getfield        #220 <Field int NavigationMenuPresenter.itemHorizontalPadding>
	//   90  214:invokevirtual   #223 <Method void NavigationMenuItemView.setHorizontalPadding(int)>
		navigationmenuitemview.setIconPadding(itemIconPadding);
	//   91  217:aload_3         
	//   92  218:aload_0         
	//   93  219:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   94  222:getfield        #226 <Field int NavigationMenuPresenter.itemIconPadding>
	//   95  225:invokevirtual   #229 <Method void NavigationMenuItemView.setIconPadding(int)>
		navigationmenuitemview.initialize((() (viewholder)).getMenuItem(), 0);
	//   96  228:aload_3         
	//   97  229:aload_1         
	//   98  230:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   99  233:iconst_0        
	//  100  234:invokevirtual   #233 <Method void NavigationMenuItemView.initialize(MenuItemImpl, int)>
	//  101  237:return          
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((NavigationMenuPresenter.ViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #141 <Class NavigationMenuPresenter$ViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #236 <Method void onBindViewHolder(NavigationMenuPresenter$ViewHolder, int)>
	//    5    9:return          
	}

	public NavigationMenuPresenter.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 81
	//	               1 65
	//	               2 49
	//	               3 34
		default:
			return null;
	//    2   32:aconst_null     
	//    3   33:areturn         

		case 3: // '\003'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.HeaderViewHolder(((View) (headerLayout)))));
	//    4   34:new             #240 <Class NavigationMenuPresenter$HeaderViewHolder>
	//    5   37:dup             
	//    6   38:aload_0         
	//    7   39:getfield        #37  <Field NavigationMenuPresenter this$0>
	//    8   42:getfield        #244 <Field android.widget.LinearLayout NavigationMenuPresenter.headerLayout>
	//    9   45:invokespecial   #247 <Method void NavigationMenuPresenter$HeaderViewHolder(View)>
	//   10   48:areturn         

		case 2: // '\002'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.SeparatorViewHolder(layoutInflater, viewgroup)));
	//   11   49:new             #249 <Class NavigationMenuPresenter$SeparatorViewHolder>
	//   12   52:dup             
	//   13   53:aload_0         
	//   14   54:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   15   57:getfield        #253 <Field android.view.LayoutInflater NavigationMenuPresenter.layoutInflater>
	//   16   60:aload_1         
	//   17   61:invokespecial   #256 <Method void NavigationMenuPresenter$SeparatorViewHolder(android.view.LayoutInflater, ViewGroup)>
	//   18   64:areturn         

		case 1: // '\001'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.SubheaderViewHolder(layoutInflater, viewgroup)));
	//   19   65:new             #258 <Class NavigationMenuPresenter$SubheaderViewHolder>
	//   20   68:dup             
	//   21   69:aload_0         
	//   22   70:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   23   73:getfield        #253 <Field android.view.LayoutInflater NavigationMenuPresenter.layoutInflater>
	//   24   76:aload_1         
	//   25   77:invokespecial   #259 <Method void NavigationMenuPresenter$SubheaderViewHolder(android.view.LayoutInflater, ViewGroup)>
	//   26   80:areturn         

		case 0: // '\0'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.NormalViewHolder(layoutInflater, viewgroup, onClickListener)));
	//   27   81:new             #261 <Class NavigationMenuPresenter$NormalViewHolder>
	//   28   84:dup             
	//   29   85:aload_0         
	//   30   86:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   31   89:getfield        #253 <Field android.view.LayoutInflater NavigationMenuPresenter.layoutInflater>
	//   32   92:aload_1         
	//   33   93:aload_0         
	//   34   94:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   35   97:getfield        #265 <Field android.view.View$OnClickListener NavigationMenuPresenter.onClickListener>
	//   36  100:invokespecial   #268 <Method void NavigationMenuPresenter$NormalViewHolder(android.view.LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
	//   37  103:areturn         
		}
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #271 <Method NavigationMenuPresenter$ViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public void onViewRecycled(NavigationMenuPresenter.ViewHolder viewholder)
	{
		if(viewholder instanceof NavigationMenuPresenter.NormalViewHolder)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #261 <Class NavigationMenuPresenter$NormalViewHolder>
	//*   2    4:ifeq            17
			((NavigationMenuItemView)viewholder.itemView).recycle();
	//    3    7:aload_1         
	//    4    8:getfield        #145 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//    5   11:checkcast       #167 <Class NavigationMenuItemView>
	//    6   14:invokevirtual   #276 <Method void NavigationMenuItemView.recycle()>
	//    7   17:return          
	}

	public volatile void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		onViewRecycled((NavigationMenuPresenter.ViewHolder)viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #141 <Class NavigationMenuPresenter$ViewHolder>
	//    3    5:invokevirtual   #279 <Method void onViewRecycled(NavigationMenuPresenter$ViewHolder)>
	//    4    8:return          
	}

	public void restoreInstanceState(Bundle bundle)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k = bundle.getInt("android:menu:checked", 0);
	//    2    2:aload_1         
	//    3    3:ldc1            #15  <String "android:menu:checked">
	//    4    5:iconst_0        
	//    5    6:invokevirtual   #285 <Method int Bundle.getInt(String, int)>
	//    6    9:istore          4
		if(k != 0)
	//*   7   11:iload           4
	//*   8   13:ifeq            109
		{
			updateSuspended = true;
	//    9   16:aload_0         
	//   10   17:iconst_1        
	//   11   18:putfield        #287 <Field boolean updateSuspended>
			int i1 = items.size();
	//   12   21:aload_0         
	//   13   22:getfield        #45  <Field ArrayList items>
	//   14   25:invokevirtual   #92  <Method int ArrayList.size()>
	//   15   28:istore          5
			for(int i = 0; i < i1; i++)
	//*  16   30:iconst_0        
	//*  17   31:istore_2        
	//*  18   32:iload_2         
	//*  19   33:iload           5
	//*  20   35:icmpge          100
			{
				Object obj = ((Object) ((NavigationMenuPresenter.NavigationMenuItem)items.get(i)));
	//   21   38:aload_0         
	//   22   39:getfield        #45  <Field ArrayList items>
	//   23   42:iload_2         
	//   24   43:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   25   46:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
	//   26   49:astore          6
				if(!(obj instanceof ))
					continue;
	//   27   51:aload           6
	//   28   53:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   29   56:ifeq            93
				obj = ((Object) ((()obj).getMenuItem()));
	//   30   59:aload           6
	//   31   61:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   32   64:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   33   67:astore          6
				if(obj == null || ((MenuItemImpl) (obj)).getItemId() != k)
					continue;
	//   34   69:aload           6
	//   35   71:ifnull          93
	//   36   74:aload           6
	//   37   76:invokevirtual   #82  <Method int MenuItemImpl.getItemId()>
	//   38   79:iload           4
	//   39   81:icmpne          93
				setCheckedItem(((MenuItemImpl) (obj)));
	//   40   84:aload_0         
	//   41   85:aload           6
	//   42   87:invokevirtual   #291 <Method void setCheckedItem(MenuItemImpl)>
				break;
	//   43   90:goto            100
			}

	//   44   93:iload_2         
	//   45   94:iconst_1        
	//   46   95:iadd            
	//   47   96:istore_2        
	//*  48   97:goto            32
			updateSuspended = false;
	//   49  100:aload_0         
	//   50  101:iconst_0        
	//   51  102:putfield        #287 <Field boolean updateSuspended>
			prepareMenuItems();
	//   52  105:aload_0         
	//   53  106:invokespecial   #48  <Method void prepareMenuItems()>
		}
		bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:action_views")));
	//   54  109:aload_1         
	//   55  110:ldc1            #12  <String "android:menu:action_views">
	//   56  112:invokevirtual   #295 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   57  115:astore_1        
		if(bundle != null)
	//*  58  116:aload_1         
	//*  59  117:ifnull          230
		{
			int l = items.size();
	//   60  120:aload_0         
	//   61  121:getfield        #45  <Field ArrayList items>
	//   62  124:invokevirtual   #92  <Method int ArrayList.size()>
	//   63  127:istore          4
			for(int j = ((int) (flag)); j < l; j++)
	//*  64  129:iload_3         
	//*  65  130:istore_2        
	//*  66  131:iload_2         
	//*  67  132:iload           4
	//*  68  134:icmpge          230
			{
				Object obj1 = ((Object) ((NavigationMenuPresenter.NavigationMenuItem)items.get(j)));
	//   69  137:aload_0         
	//   70  138:getfield        #45  <Field ArrayList items>
	//   71  141:iload_2         
	//   72  142:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   73  145:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
	//   74  148:astore          6
				if(!(obj1 instanceof ))
	//*  75  150:aload           6
	//*  76  152:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//*  77  155:ifne            161
					continue;
	//   78  158:goto            223
				Object obj2 = ((Object) ((()obj1).getMenuItem()));
	//   79  161:aload           6
	//   80  163:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   81  166:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   82  169:astore          7
				if(obj2 == null)
	//*  83  171:aload           7
	//*  84  173:ifnonnull       179
					continue;
	//   85  176:goto            223
				obj1 = ((Object) (((MenuItemImpl) (obj2)).getActionView()));
	//   86  179:aload           7
	//   87  181:invokevirtual   #102 <Method View MenuItemImpl.getActionView()>
	//   88  184:astore          6
				if(obj1 == null)
	//*  89  186:aload           6
	//*  90  188:ifnonnull       194
					continue;
	//   91  191:goto            223
				obj2 = ((Object) ((ParcelableSparseArray)((SparseArray) (bundle)).get(((MenuItemImpl) (obj2)).getItemId())));
	//   92  194:aload_1         
	//   93  195:aload           7
	//   94  197:invokevirtual   #82  <Method int MenuItemImpl.getItemId()>
	//   95  200:invokevirtual   #296 <Method Object SparseArray.get(int)>
	//   96  203:checkcast       #104 <Class ParcelableSparseArray>
	//   97  206:astore          7
				if(obj2 != null)
	//*  98  208:aload           7
	//*  99  210:ifnonnull       216
	//* 100  213:goto            223
					((View) (obj1)).restoreHierarchyState(((SparseArray) (obj2)));
	//  101  216:aload           6
	//  102  218:aload           7
	//  103  220:invokevirtual   #299 <Method void View.restoreHierarchyState(SparseArray)>
			}

	//  104  223:iload_2         
	//  105  224:iconst_1        
	//  106  225:iadd            
	//  107  226:istore_2        
		}
	//* 108  227:goto            131
	//  109  230:return          
	}

	public void setCheckedItem(MenuItemImpl menuitemimpl)
	{
		if(checkedItem != menuitemimpl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field MenuItemImpl checkedItem>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       43
		{
			if(!menuitemimpl.isCheckable())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #302 <Method boolean MenuItemImpl.isCheckable()>
	//*   6   12:ifne            16
				return;
	//    7   15:return          
			MenuItemImpl menuitemimpl1 = checkedItem;
	//    8   16:aload_0         
	//    9   17:getfield        #76  <Field MenuItemImpl checkedItem>
	//   10   20:astore_2        
			if(menuitemimpl1 != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          31
				menuitemimpl1.setChecked(false);
	//   13   25:aload_2         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #306 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
	//   16   30:pop             
			checkedItem = menuitemimpl;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:putfield        #76  <Field MenuItemImpl checkedItem>
			menuitemimpl.setChecked(true);
	//   20   36:aload_1         
	//   21   37:iconst_1        
	//   22   38:invokevirtual   #306 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
	//   23   41:pop             
			return;
	//   24   42:return          
		} else
		{
			return;
	//   25   43:return          
		}
	}

	public void setUpdateSuspended(boolean flag)
	{
		updateSuspended = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #287 <Field boolean updateSuspended>
	//    3    5:return          
	}

	public void update()
	{
		prepareMenuItems();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void prepareMenuItems()>
		notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #311 <Method void notifyDataSetChanged()>
	//    4    8:return          
	}

	private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
	private static final String STATE_CHECKED_ITEM = "android:menu:checked";
	private static final int VIEW_TYPE_HEADER = 3;
	private static final int VIEW_TYPE_NORMAL = 0;
	private static final int VIEW_TYPE_SEPARATOR = 2;
	private static final int VIEW_TYPE_SUBHEADER = 1;
	private MenuItemImpl checkedItem;
	private final ArrayList items = new ArrayList();
	final NavigationMenuPresenter this$0;
	private boolean updateSuspended;

	NavigationMenuPresenter$NavigationMenuAdapter()
	{
		this$0 = NavigationMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field NavigationMenuPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void android.support.v7.widget.RecyclerView$Adapter()>
	//    5    9:aload_0         
	//    6   10:new             #42  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #43  <Method void ArrayList()>
	//    9   17:putfield        #45  <Field ArrayList items>
		prepareMenuItems();
	//   10   20:aload_0         
	//   11   21:invokespecial   #48  <Method void prepareMenuItems()>
	//   12   24:return          
	}
}
