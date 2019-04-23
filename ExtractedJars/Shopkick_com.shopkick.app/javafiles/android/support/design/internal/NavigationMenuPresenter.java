// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.view.menu.*;
import android.util.SparseArray;
import android.view.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuView, ParcelableSparseArray, NavigationMenuItemView

public class NavigationMenuPresenter
	implements MenuPresenter
{
	private static class HeaderViewHolder extends ViewHolder
	{

		public HeaderViewHolder(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void NavigationMenuPresenter$ViewHolder(View)>
		//    3    5:return          
		}
	}

	private class NavigationMenuAdapter extends android.support.v7.widget.RecyclerView.Adapter
	{

		private void appendTransparentIconIfMissing(int i, int j)
		{
			for(; i < j; i++)
		//*   0    0:iload_1         
		//*   1    1:iload_2         
		//*   2    2:icmpge          27
				((NavigationMenuTextItem)items.get(i)).needsEmptyIcon = true;
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
				Object obj = ((Object) ((NavigationMenuItem)items.get(i)));
		//   27   53:aload_0         
		//   28   54:getfield        #45  <Field ArrayList items>
		//   29   57:iload_1         
		//   30   58:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   31   61:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
		//   32   64:astore_3        
				if(!(obj instanceof NavigationMenuTextItem))
					continue;
		//   33   65:aload_3         
		//   34   66:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   35   69:ifeq            128
				MenuItemImpl menuitemimpl1 = ((NavigationMenuTextItem)obj).getMenuItem();
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
			NavigationMenuItem navigationmenuitem = (NavigationMenuItem)items.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field ArrayList items>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
		//    5   11:astore_2        
			if(navigationmenuitem instanceof NavigationMenuSeparatorItem)
		//*   6   12:aload_2         
		//*   7   13:instanceof      #126 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//*   8   16:ifeq            21
				return 2;
		//    9   19:iconst_2        
		//   10   20:ireturn         
			if(navigationmenuitem instanceof NavigationMenuHeaderItem)
		//*  11   21:aload_2         
		//*  12   22:instanceof      #128 <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
		//*  13   25:ifeq            30
				return 3;
		//   14   28:iconst_3        
		//   15   29:ireturn         
			if(navigationmenuitem instanceof NavigationMenuTextItem)
		//*  16   30:aload_2         
		//*  17   31:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//*  18   34:ifeq            54
				return !((NavigationMenuTextItem)navigationmenuitem).getMenuItem().hasSubMenu() ? 0 : 1;
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

		public void onBindViewHolder(ViewHolder viewholder, int i)
		{
			NavigationMenuItemView navigationmenuitemview;
			switch(getItemViewType(i))
		//*   0    0:aload_0         
		//*   1    1:iload_2         
		//*   2    2:invokevirtual   #139 <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 2: default 32
		//		               0 91
		//		               1 63
		//		               2 33
			default:
				return;
		//    4   32:return          

			case 2: // '\002'
				NavigationMenuSeparatorItem navigationmenuseparatoritem = (NavigationMenuSeparatorItem)items.get(i);
		//    5   33:aload_0         
		//    6   34:getfield        #45  <Field ArrayList items>
		//    7   37:iload_2         
		//    8   38:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//    9   41:checkcast       #126 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//   10   44:astore_3        
				viewholder.itemView.setPadding(0, navigationmenuseparatoritem.getPaddingTop(), 0, navigationmenuseparatoritem.getPaddingBottom());
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
				((TextView)viewholder.itemView).setText(((NavigationMenuTextItem)items.get(i)).getMenuItem().getTitle());
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
		//   40  104:getfield        #171 <Field ColorStateList NavigationMenuPresenter.iconTintList>
		//   41  107:invokevirtual   #175 <Method void NavigationMenuItemView.setIconTintList(ColorStateList)>
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
		//*  53  135:getfield        #188 <Field ColorStateList NavigationMenuPresenter.textColor>
		//*  54  138:ifnull          152
				navigationmenuitemview.setTextColor(textColor);
		//   55  141:aload_3         
		//   56  142:aload_0         
		//   57  143:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   58  146:getfield        #188 <Field ColorStateList NavigationMenuPresenter.textColor>
		//   59  149:invokevirtual   #191 <Method void NavigationMenuItemView.setTextColor(ColorStateList)>
			if(itemBackground != null)
		//*  60  152:aload_0         
		//*  61  153:getfield        #37  <Field NavigationMenuPresenter this$0>
		//*  62  156:getfield        #195 <Field Drawable NavigationMenuPresenter.itemBackground>
		//*  63  159:ifnull          179
				viewholder = ((ViewHolder) (itemBackground.getConstantState().newDrawable()));
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
			viewholder = ((ViewHolder) ((NavigationMenuTextItem)items.get(i)));
		//   76  186:aload_0         
		//   77  187:getfield        #45  <Field ArrayList items>
		//   78  190:iload_2         
		//   79  191:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   80  194:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   81  197:astore_1        
			navigationmenuitemview.setNeedsEmptyIcon(((NavigationMenuTextItem) (viewholder)).needsEmptyIcon);
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
			navigationmenuitemview.initialize(((NavigationMenuTextItem) (viewholder)).getMenuItem(), 0);
		//   96  228:aload_3         
		//   97  229:aload_1         
		//   98  230:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   99  233:iconst_0        
		//  100  234:invokevirtual   #233 <Method void NavigationMenuItemView.initialize(MenuItemImpl, int)>
		//  101  237:return          
		}

		public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
		{
			onBindViewHolder((ViewHolder)viewholder, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #141 <Class NavigationMenuPresenter$ViewHolder>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #236 <Method void onBindViewHolder(NavigationMenuPresenter$ViewHolder, int)>
		//    5    9:return          
		}

		public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
		{
			switch(i)
		//*   0    0:iload_2         
			{
		//*   1    1:tableswitch     0 3: default 32
		//		               0 81
		//		               1 65
		//		               2 49
		//		               3 34
			default:
				return null;
		//    2   32:aconst_null     
		//    3   33:areturn         

			case 3: // '\003'
				return ((ViewHolder) (new HeaderViewHolder(((View) (headerLayout)))));
		//    4   34:new             #240 <Class NavigationMenuPresenter$HeaderViewHolder>
		//    5   37:dup             
		//    6   38:aload_0         
		//    7   39:getfield        #37  <Field NavigationMenuPresenter this$0>
		//    8   42:getfield        #244 <Field LinearLayout NavigationMenuPresenter.headerLayout>
		//    9   45:invokespecial   #247 <Method void NavigationMenuPresenter$HeaderViewHolder(View)>
		//   10   48:areturn         

			case 2: // '\002'
				return ((ViewHolder) (new SeparatorViewHolder(layoutInflater, viewgroup)));
		//   11   49:new             #249 <Class NavigationMenuPresenter$SeparatorViewHolder>
		//   12   52:dup             
		//   13   53:aload_0         
		//   14   54:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   15   57:getfield        #253 <Field LayoutInflater NavigationMenuPresenter.layoutInflater>
		//   16   60:aload_1         
		//   17   61:invokespecial   #256 <Method void NavigationMenuPresenter$SeparatorViewHolder(LayoutInflater, ViewGroup)>
		//   18   64:areturn         

			case 1: // '\001'
				return ((ViewHolder) (new SubheaderViewHolder(layoutInflater, viewgroup)));
		//   19   65:new             #258 <Class NavigationMenuPresenter$SubheaderViewHolder>
		//   20   68:dup             
		//   21   69:aload_0         
		//   22   70:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   23   73:getfield        #253 <Field LayoutInflater NavigationMenuPresenter.layoutInflater>
		//   24   76:aload_1         
		//   25   77:invokespecial   #259 <Method void NavigationMenuPresenter$SubheaderViewHolder(LayoutInflater, ViewGroup)>
		//   26   80:areturn         

			case 0: // '\0'
				return ((ViewHolder) (new NormalViewHolder(layoutInflater, viewgroup, onClickListener)));
		//   27   81:new             #261 <Class NavigationMenuPresenter$NormalViewHolder>
		//   28   84:dup             
		//   29   85:aload_0         
		//   30   86:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   31   89:getfield        #253 <Field LayoutInflater NavigationMenuPresenter.layoutInflater>
		//   32   92:aload_1         
		//   33   93:aload_0         
		//   34   94:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   35   97:getfield        #265 <Field android.view.View$OnClickListener NavigationMenuPresenter.onClickListener>
		//   36  100:invokespecial   #268 <Method void NavigationMenuPresenter$NormalViewHolder(LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
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

		public void onViewRecycled(ViewHolder viewholder)
		{
			if(viewholder instanceof NormalViewHolder)
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
			onViewRecycled((ViewHolder)viewholder);
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
					Object obj = ((Object) ((NavigationMenuItem)items.get(i)));
		//   21   38:aload_0         
		//   22   39:getfield        #45  <Field ArrayList items>
		//   23   42:iload_2         
		//   24   43:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   25   46:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
		//   26   49:astore          6
					if(!(obj instanceof NavigationMenuTextItem))
						continue;
		//   27   51:aload           6
		//   28   53:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   29   56:ifeq            93
					obj = ((Object) (((NavigationMenuTextItem)obj).getMenuItem()));
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
					Object obj1 = ((Object) ((NavigationMenuItem)items.get(j)));
		//   69  137:aload_0         
		//   70  138:getfield        #45  <Field ArrayList items>
		//   71  141:iload_2         
		//   72  142:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   73  145:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
		//   74  148:astore          6
					if(!(obj1 instanceof NavigationMenuTextItem))
		//*  75  150:aload           6
		//*  76  152:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//*  77  155:ifne            161
						continue;
		//   78  158:goto            223
					Object obj2 = ((Object) (((NavigationMenuTextItem)obj1).getMenuItem()));
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

		NavigationMenuAdapter()
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

	private static class NavigationMenuHeaderItem
		implements NavigationMenuItem
	{

		NavigationMenuHeaderItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static interface NavigationMenuItem
	{
	}

	private static class NavigationMenuSeparatorItem
		implements NavigationMenuItem
	{

		public int getPaddingBottom()
		{
			return paddingBottom;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int paddingBottom>
		//    2    4:ireturn         
		}

		public int getPaddingTop()
		{
			return paddingTop;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int paddingTop>
		//    2    4:ireturn         
		}

		private final int paddingBottom;
		private final int paddingTop;

		public NavigationMenuSeparatorItem(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			paddingTop = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int paddingTop>
			paddingBottom = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int paddingBottom>
		//    8   14:return          
		}
	}

	private static class NavigationMenuTextItem
		implements NavigationMenuItem
	{

		public MenuItemImpl getMenuItem()
		{
			return menuItem;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field MenuItemImpl menuItem>
		//    2    4:areturn         
		}

		private final MenuItemImpl menuItem;
		boolean needsEmptyIcon;

		NavigationMenuTextItem(MenuItemImpl menuitemimpl)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			menuItem = menuitemimpl;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field MenuItemImpl menuItem>
		//    5    9:return          
		}
	}

	private static class NormalViewHolder extends ViewHolder
	{

		public NormalViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup, android.view.View.OnClickListener onclicklistener)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$ViewHolder(View)>
			itemView.setOnClickListener(onclicklistener);
		//    7   13:aload_0         
		//    8   14:getfield        #28  <Field View itemView>
		//    9   17:aload_3         
		//   10   18:invokevirtual   #34  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		//   11   21:return          
		}
	}

	private static class SeparatorViewHolder extends ViewHolder
	{

		public SeparatorViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_separator, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item_separator>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$ViewHolder(View)>
		//    7   13:return          
		}
	}

	private static class SubheaderViewHolder extends ViewHolder
	{

		public SubheaderViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_subheader, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item_subheader>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$ViewHolder(View)>
		//    7   13:return          
		}
	}

	private static abstract class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		public ViewHolder(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		//    3    5:return          
		}
	}


	public NavigationMenuPresenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class NavigationMenuPresenter$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #87  <Method void NavigationMenuPresenter$1(NavigationMenuPresenter)>
	//    7   13:putfield        #89  <Field android.view.View$OnClickListener onClickListener>
	//    8   16:return          
	}

	public void addHeaderView(View view)
	{
		headerLayout.addView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field LinearLayout headerLayout>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #100 <Method void LinearLayout.addView(View)>
		view = ((View) (menuView));
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field NavigationMenuView menuView>
	//    6   12:astore_1        
		((NavigationMenuView) (view)).setPadding(0, 0, 0, ((NavigationMenuView) (view)).getPaddingBottom());
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:iconst_0        
	//   11   17:aload_1         
	//   12   18:invokevirtual   #108 <Method int NavigationMenuView.getPaddingBottom()>
	//   13   21:invokevirtual   #112 <Method void NavigationMenuView.setPadding(int, int, int, int)>
	//   14   24:return          
	}

	public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void dispatchApplyWindowInsets(WindowInsetsCompat windowinsetscompat)
	{
		int i = windowinsetscompat.getSystemWindowInsetTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #122 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//    2    4:istore_2        
		if(paddingTopDefault != i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #124 <Field int paddingTopDefault>
	//*   5    9:iload_2         
	//*   6   10:icmpeq          47
		{
			paddingTopDefault = i;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:putfield        #124 <Field int paddingTopDefault>
			if(headerLayout.getChildCount() == 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #95  <Field LinearLayout headerLayout>
	//*  12   22:invokevirtual   #127 <Method int LinearLayout.getChildCount()>
	//*  13   25:ifne            47
			{
				NavigationMenuView navigationmenuview = menuView;
	//   14   28:aload_0         
	//   15   29:getfield        #102 <Field NavigationMenuView menuView>
	//   16   32:astore_3        
				navigationmenuview.setPadding(0, paddingTopDefault, 0, navigationmenuview.getPaddingBottom());
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:aload_0         
	//   20   36:getfield        #124 <Field int paddingTopDefault>
	//   21   39:iconst_0        
	//   22   40:aload_3         
	//   23   41:invokevirtual   #108 <Method int NavigationMenuView.getPaddingBottom()>
	//   24   44:invokevirtual   #112 <Method void NavigationMenuView.setPadding(int, int, int, int)>
			}
		}
		ViewCompat.dispatchApplyWindowInsets(((View) (headerLayout)), windowinsetscompat);
	//   25   47:aload_0         
	//   26   48:getfield        #95  <Field LinearLayout headerLayout>
	//   27   51:aload_1         
	//   28   52:invokestatic    #132 <Method WindowInsetsCompat ViewCompat.dispatchApplyWindowInsets(View, WindowInsetsCompat)>
	//   29   55:pop             
	//   30   56:return          
	}

	public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public MenuItemImpl getCheckedItem()
	{
		return adapter.getCheckedItem();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//    2    4:invokevirtual   #142 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuAdapter.getCheckedItem()>
	//    3    7:areturn         
	}

	public int getHeaderCount()
	{
		return headerLayout.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field LinearLayout headerLayout>
	//    2    4:invokevirtual   #127 <Method int LinearLayout.getChildCount()>
	//    3    7:ireturn         
	}

	public View getHeaderView(int i)
	{
		return headerLayout.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field LinearLayout headerLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #149 <Method View LinearLayout.getChildAt(int)>
	//    4    8:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field int id>
	//    2    4:ireturn         
	}

	public Drawable getItemBackground()
	{
		return itemBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Drawable itemBackground>
	//    2    4:areturn         
	}

	public int getItemHorizontalPadding()
	{
		return itemHorizontalPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field int itemHorizontalPadding>
	//    2    4:ireturn         
	}

	public int getItemIconPadding()
	{
		return itemIconPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field int itemIconPadding>
	//    2    4:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return textColor;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ColorStateList textColor>
	//    2    4:areturn         
	}

	public ColorStateList getItemTintList()
	{
		return iconTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field ColorStateList iconTintList>
	//    2    4:areturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		if(menuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field NavigationMenuView menuView>
	//*   2    4:ifnonnull       78
		{
			menuView = (NavigationMenuView)layoutInflater.inflate(android.support.design.R.layout.design_navigation_menu, viewgroup, false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #173 <Field LayoutInflater layoutInflater>
	//    6   12:getstatic       #178 <Field int android.support.design.R$layout.design_navigation_menu>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #184 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   20:checkcast       #104 <Class NavigationMenuView>
	//   11   23:putfield        #102 <Field NavigationMenuView menuView>
			if(adapter == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//*  14   30:ifnonnull       45
				adapter = new NavigationMenuAdapter();
	//   15   33:aload_0         
	//   16   34:new             #13  <Class NavigationMenuPresenter$NavigationMenuAdapter>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #185 <Method void NavigationMenuPresenter$NavigationMenuAdapter(NavigationMenuPresenter)>
	//   20   42:putfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
			headerLayout = (LinearLayout)layoutInflater.inflate(android.support.design.R.layout.design_navigation_item_header, ((ViewGroup) (menuView)), false);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #173 <Field LayoutInflater layoutInflater>
	//   24   50:getstatic       #188 <Field int android.support.design.R$layout.design_navigation_item_header>
	//   25   53:aload_0         
	//   26   54:getfield        #102 <Field NavigationMenuView menuView>
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #184 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   29   61:checkcast       #97  <Class LinearLayout>
	//   30   64:putfield        #95  <Field LinearLayout headerLayout>
			menuView.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (adapter)));
	//   31   67:aload_0         
	//   32   68:getfield        #102 <Field NavigationMenuView menuView>
	//   33   71:aload_0         
	//   34   72:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//   35   75:invokevirtual   #192 <Method void NavigationMenuView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		}
		return ((MenuView) (menuView));
	//   36   78:aload_0         
	//   37   79:getfield        #102 <Field NavigationMenuView menuView>
	//   38   82:areturn         
	}

	public View inflateHeaderView(int i)
	{
		View view = layoutInflater.inflate(i, ((ViewGroup) (headerLayout)), false);
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field LayoutInflater layoutInflater>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #95  <Field LinearLayout headerLayout>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #184 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   13:astore_2        
		addHeaderView(view);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #196 <Method void addHeaderView(View)>
		return view;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		layoutInflater = LayoutInflater.from(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #202 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    5:putfield        #173 <Field LayoutInflater layoutInflater>
		menu = menubuilder;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #204 <Field MenuBuilder menu>
		paddingSeparator = context.getResources().getDimensionPixelOffset(android.support.design.R.dimen.design_navigation_separator_vertical_padding);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #210 <Method Resources Context.getResources()>
	//   10   18:getstatic       #215 <Field int android.support.design.R$dimen.design_navigation_separator_vertical_padding>
	//   11   21:invokevirtual   #221 <Method int Resources.getDimensionPixelOffset(int)>
	//   12   24:putfield        #223 <Field int paddingSeparator>
	//   13   27:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		android.support.v7.view.menu.MenuPresenter.Callback callback1 = callback;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field android.support.v7.view.menu.MenuPresenter$Callback callback>
	//    2    4:astore_3        
		if(callback1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			callback1.onCloseMenu(menubuilder, flag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokeinterface #231 <Method void android.support.v7.view.menu.MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    9   17:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof Bundle)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #235 <Class Bundle>
	//*   2    4:ifeq            69
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    3    7:aload_1         
	//    4    8:checkcast       #235 <Class Bundle>
	//    5   11:astore_1        
			Object obj = ((Object) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:list")));
	//    6   12:aload_1         
	//    7   13:ldc1            #52  <String "android:menu:list">
	//    8   15:invokevirtual   #239 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    9   18:astore_2        
			if(obj != null)
	//*  10   19:aload_2         
	//*  11   20:ifnull          31
				menuView.restoreHierarchyState(((SparseArray) (obj)));
	//   12   23:aload_0         
	//   13   24:getfield        #102 <Field NavigationMenuView menuView>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #243 <Method void NavigationMenuView.restoreHierarchyState(SparseArray)>
			obj = ((Object) (((Bundle) (parcelable)).getBundle("android:menu:adapter")));
	//   16   31:aload_1         
	//   17   32:ldc1            #46  <String "android:menu:adapter">
	//   18   34:invokevirtual   #247 <Method Bundle Bundle.getBundle(String)>
	//   19   37:astore_2        
			if(obj != null)
	//*  20   38:aload_2         
	//*  21   39:ifnull          50
				adapter.restoreInstanceState(((Bundle) (obj)));
	//   22   42:aload_0         
	//   23   43:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #251 <Method void NavigationMenuPresenter$NavigationMenuAdapter.restoreInstanceState(Bundle)>
			parcelable = ((Parcelable) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:header")));
	//   26   50:aload_1         
	//   27   51:ldc1            #49  <String "android:menu:header">
	//   28   53:invokevirtual   #239 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   29   56:astore_1        
			if(parcelable != null)
	//*  30   57:aload_1         
	//*  31   58:ifnull          69
				headerLayout.restoreHierarchyState(((SparseArray) (parcelable)));
	//   32   61:aload_0         
	//   33   62:getfield        #95  <Field LinearLayout headerLayout>
	//   34   65:aload_1         
	//   35   66:invokevirtual   #252 <Method void LinearLayout.restoreHierarchyState(SparseArray)>
		}
	//   36   69:return          
	}

	public Parcelable onSaveInstanceState()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #235 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #255 <Method void Bundle()>
	//    3    7:astore_1        
		if(menuView != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #102 <Field NavigationMenuView menuView>
	//*   6   12:ifnull          38
		{
			SparseArray sparsearray = new SparseArray();
	//    7   15:new             #257 <Class SparseArray>
	//    8   18:dup             
	//    9   19:invokespecial   #258 <Method void SparseArray()>
	//   10   22:astore_2        
			menuView.saveHierarchyState(sparsearray);
	//   11   23:aload_0         
	//   12   24:getfield        #102 <Field NavigationMenuView menuView>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #261 <Method void NavigationMenuView.saveHierarchyState(SparseArray)>
			bundle.putSparseParcelableArray("android:menu:list", sparsearray);
	//   15   31:aload_1         
	//   16   32:ldc1            #52  <String "android:menu:list">
	//   17   34:aload_2         
	//   18   35:invokevirtual   #265 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		NavigationMenuAdapter navigationmenuadapter = adapter;
	//   19   38:aload_0         
	//   20   39:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//   21   42:astore_2        
		if(navigationmenuadapter != null)
	//*  22   43:aload_2         
	//*  23   44:ifnull          57
			bundle.putBundle("android:menu:adapter", navigationmenuadapter.createInstanceState());
	//   24   47:aload_1         
	//   25   48:ldc1            #46  <String "android:menu:adapter">
	//   26   50:aload_2         
	//   27   51:invokevirtual   #269 <Method Bundle NavigationMenuPresenter$NavigationMenuAdapter.createInstanceState()>
	//   28   54:invokevirtual   #273 <Method void Bundle.putBundle(String, Bundle)>
		if(headerLayout != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #95  <Field LinearLayout headerLayout>
	//*  31   61:ifnull          87
		{
			SparseArray sparsearray1 = new SparseArray();
	//   32   64:new             #257 <Class SparseArray>
	//   33   67:dup             
	//   34   68:invokespecial   #258 <Method void SparseArray()>
	//   35   71:astore_2        
			headerLayout.saveHierarchyState(sparsearray1);
	//   36   72:aload_0         
	//   37   73:getfield        #95  <Field LinearLayout headerLayout>
	//   38   76:aload_2         
	//   39   77:invokevirtual   #274 <Method void LinearLayout.saveHierarchyState(SparseArray)>
			bundle.putSparseParcelableArray("android:menu:header", sparsearray1);
	//   40   80:aload_1         
	//   41   81:ldc1            #49  <String "android:menu:header">
	//   42   83:aload_2         
	//   43   84:invokevirtual   #265 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		return ((Parcelable) (bundle));
	//   44   87:aload_1         
	//   45   88:areturn         
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void removeHeaderView(View view)
	{
		headerLayout.removeView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field LinearLayout headerLayout>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #280 <Method void LinearLayout.removeView(View)>
		if(headerLayout.getChildCount() == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #95  <Field LinearLayout headerLayout>
	//*   6   12:invokevirtual   #127 <Method int LinearLayout.getChildCount()>
	//*   7   15:ifne            37
		{
			view = ((View) (menuView));
	//    8   18:aload_0         
	//    9   19:getfield        #102 <Field NavigationMenuView menuView>
	//   10   22:astore_1        
			((NavigationMenuView) (view)).setPadding(0, paddingTopDefault, 0, ((NavigationMenuView) (view)).getPaddingBottom());
	//   11   23:aload_1         
	//   12   24:iconst_0        
	//   13   25:aload_0         
	//   14   26:getfield        #124 <Field int paddingTopDefault>
	//   15   29:iconst_0        
	//   16   30:aload_1         
	//   17   31:invokevirtual   #108 <Method int NavigationMenuView.getPaddingBottom()>
	//   18   34:invokevirtual   #112 <Method void NavigationMenuView.setPadding(int, int, int, int)>
		}
	//   19   37:return          
	}

	public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback1)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #227 <Field android.support.v7.view.menu.MenuPresenter$Callback callback>
	//    3    5:return          
	}

	public void setCheckedItem(MenuItemImpl menuitemimpl)
	{
		adapter.setCheckedItem(menuitemimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #286 <Method void NavigationMenuPresenter$NavigationMenuAdapter.setCheckedItem(MenuItemImpl)>
	//    4    8:return          
	}

	public void setId(int i)
	{
		id = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #152 <Field int id>
	//    3    5:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		itemBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field Drawable itemBackground>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #294 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemHorizontalPadding(int i)
	{
		itemHorizontalPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #159 <Field int itemHorizontalPadding>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #294 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemIconPadding(int i)
	{
		itemIconPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #162 <Field int itemIconPadding>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #294 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		iconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field ColorStateList iconTintList>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #294 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemTextAppearance(int i)
	{
		textAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #302 <Field int textAppearance>
		textAppearanceSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #304 <Field boolean textAppearanceSet>
		updateMenuView(false);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #294 <Method void updateMenuView(boolean)>
	//    9   15:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		textColor = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field ColorStateList textColor>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #294 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setUpdateSuspended(boolean flag)
	{
		NavigationMenuAdapter navigationmenuadapter = adapter;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//    2    4:astore_2        
		if(navigationmenuadapter != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			navigationmenuadapter.setUpdateSuspended(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #308 <Method void NavigationMenuPresenter$NavigationMenuAdapter.setUpdateSuspended(boolean)>
	//    8   14:return          
	}

	public void updateMenuView(boolean flag)
	{
		NavigationMenuAdapter navigationmenuadapter = adapter;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//    2    4:astore_2        
		if(navigationmenuadapter != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			navigationmenuadapter.update();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #311 <Method void NavigationMenuPresenter$NavigationMenuAdapter.update()>
	//    7   13:return          
	}

	private static final String STATE_ADAPTER = "android:menu:adapter";
	private static final String STATE_HEADER = "android:menu:header";
	private static final String STATE_HIERARCHY = "android:menu:list";
	NavigationMenuAdapter adapter;
	private android.support.v7.view.menu.MenuPresenter.Callback callback;
	LinearLayout headerLayout;
	ColorStateList iconTintList;
	private int id;
	Drawable itemBackground;
	int itemHorizontalPadding;
	int itemIconPadding;
	LayoutInflater layoutInflater;
	MenuBuilder menu;
	private NavigationMenuView menuView;
	final android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() {

		public void onClick(View view)
		{
			view = ((View) ((NavigationMenuItemView)view));
		//    0    0:aload_1         
		//    1    1:checkcast       #22  <Class NavigationMenuItemView>
		//    2    4:astore_1        
			setUpdateSuspended(true);
		//    3    5:aload_0         
		//    4    6:getfield        #14  <Field NavigationMenuPresenter this$0>
		//    5    9:iconst_1        
		//    6   10:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
			view = ((View) (((NavigationMenuItemView) (view)).getItemData()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #30  <Method MenuItemImpl NavigationMenuItemView.getItemData()>
		//    9   17:astore_1        
			boolean flag = menu.performItemAction(((android.view.MenuItem) (view)), ((MenuPresenter) (NavigationMenuPresenter.this)), 0);
		//   10   18:aload_0         
		//   11   19:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   12   22:getfield        #34  <Field MenuBuilder NavigationMenuPresenter.menu>
		//   13   25:aload_1         
		//   14   26:aload_0         
		//   15   27:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   16   30:iconst_0        
		//   17   31:invokevirtual   #40  <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, MenuPresenter, int)>
		//   18   34:istore_2        
			if(view != null && ((MenuItemImpl) (view)).isCheckable() && flag)
		//*  19   35:aload_1         
		//*  20   36:ifnull          61
		//*  21   39:aload_1         
		//*  22   40:invokevirtual   #46  <Method boolean MenuItemImpl.isCheckable()>
		//*  23   43:ifeq            61
		//*  24   46:iload_2         
		//*  25   47:ifeq            61
				adapter.setCheckedItem(((MenuItemImpl) (view)));
		//   26   50:aload_0         
		//   27   51:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   28   54:getfield        #50  <Field NavigationMenuPresenter$NavigationMenuAdapter NavigationMenuPresenter.adapter>
		//   29   57:aload_1         
		//   30   58:invokevirtual   #56  <Method void NavigationMenuPresenter$NavigationMenuAdapter.setCheckedItem(MenuItemImpl)>
			setUpdateSuspended(false);
		//   31   61:aload_0         
		//   32   62:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   33   65:iconst_0        
		//   34   66:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
			updateMenuView(false);
		//   35   69:aload_0         
		//   36   70:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   37   73:iconst_0        
		//   38   74:invokevirtual   #59  <Method void NavigationMenuPresenter.updateMenuView(boolean)>
		//   39   77:return          
		}

		final NavigationMenuPresenter this$0;

			
			{
				this$0 = NavigationMenuPresenter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field NavigationMenuPresenter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	int paddingSeparator;
	private int paddingTopDefault;
	int textAppearance;
	boolean textAppearanceSet;
	ColorStateList textColor;
}
