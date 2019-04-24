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
				((NavigationMenuTextItem)mItems.get(i)).needsEmptyIcon = true;
		//    3    5:aload_0         
		//    4    6:getfield        #45  <Field ArrayList mItems>
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
			if(mCheckedItem != null)
		//*   4    9:aload_0         
		//*   5   10:getfield        #76  <Field MenuItemImpl mCheckedItem>
		//*   6   13:ifnull          30
				bundle.putInt("android:menu:checked", mCheckedItem.getItemId());
		//    7   16:aload           4
		//    8   18:ldc1            #15  <String "android:menu:checked">
		//    9   20:aload_0         
		//   10   21:getfield        #76  <Field MenuItemImpl mCheckedItem>
		//   11   24:invokevirtual   #82  <Method int MenuItemImpl.getItemId()>
		//   12   27:invokevirtual   #86  <Method void Bundle.putInt(String, int)>
			SparseArray sparsearray = new SparseArray();
		//   13   30:new             #88  <Class SparseArray>
		//   14   33:dup             
		//   15   34:invokespecial   #89  <Method void SparseArray()>
		//   16   37:astore          5
			int i = 0;
		//   17   39:iconst_0        
		//   18   40:istore_1        
			for(int j = mItems.size(); i < j; i++)
		//*  19   41:aload_0         
		//*  20   42:getfield        #45  <Field ArrayList mItems>
		//*  21   45:invokevirtual   #92  <Method int ArrayList.size()>
		//*  22   48:istore_2        
		//*  23   49:iload_1         
		//*  24   50:iload_2         
		//*  25   51:icmpge          136
			{
				Object obj = ((Object) ((NavigationMenuItem)mItems.get(i)));
		//   26   54:aload_0         
		//   27   55:getfield        #45  <Field ArrayList mItems>
		//   28   58:iload_1         
		//   29   59:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   30   62:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
		//   31   65:astore_3        
				if(!(obj instanceof NavigationMenuTextItem))
					continue;
		//   32   66:aload_3         
		//   33   67:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   34   70:ifeq            129
				MenuItemImpl menuitemimpl = ((NavigationMenuTextItem)obj).getMenuItem();
		//   35   73:aload_3         
		//   36   74:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   37   77:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   38   80:astore          6
				if(menuitemimpl != null)
		//*  39   82:aload           6
		//*  40   84:ifnull          96
					obj = ((Object) (menuitemimpl.getActionView()));
		//   41   87:aload           6
		//   42   89:invokevirtual   #102 <Method View MenuItemImpl.getActionView()>
		//   43   92:astore_3        
				else
		//*  44   93:goto            98
					obj = null;
		//   45   96:aconst_null     
		//   46   97:astore_3        
				if(obj != null)
		//*  47   98:aload_3         
		//*  48   99:ifnull          129
				{
					ParcelableSparseArray parcelablesparsearray = new ParcelableSparseArray();
		//   49  102:new             #104 <Class ParcelableSparseArray>
		//   50  105:dup             
		//   51  106:invokespecial   #105 <Method void ParcelableSparseArray()>
		//   52  109:astore          7
					((View) (obj)).saveHierarchyState(((SparseArray) (parcelablesparsearray)));
		//   53  111:aload_3         
		//   54  112:aload           7
		//   55  114:invokevirtual   #111 <Method void View.saveHierarchyState(SparseArray)>
					sparsearray.put(menuitemimpl.getItemId(), ((Object) (parcelablesparsearray)));
		//   56  117:aload           5
		//   57  119:aload           6
		//   58  121:invokevirtual   #82  <Method int MenuItemImpl.getItemId()>
		//   59  124:aload           7
		//   60  126:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
				}
			}

		//   61  129:iload_1         
		//   62  130:iconst_1        
		//   63  131:iadd            
		//   64  132:istore_1        
		//*  65  133:goto            49
			bundle.putSparseParcelableArray("android:menu:action_views", sparsearray);
		//   66  136:aload           4
		//   67  138:ldc1            #12  <String "android:menu:action_views">
		//   68  140:aload           5
		//   69  142:invokevirtual   #119 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			return bundle;
		//   70  145:aload           4
		//   71  147:areturn         
		}

		public int getItemCount()
		{
			return mItems.size();
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field ArrayList mItems>
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
			NavigationMenuItem navigationmenuitem = (NavigationMenuItem)mItems.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field ArrayList mItems>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #94  <Class NavigationMenuPresenter$NavigationMenuItem>
		//    5   11:astore_2        
			if(navigationmenuitem instanceof NavigationMenuSeparatorItem)
		//*   6   12:aload_2         
		//*   7   13:instanceof      #125 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//*   8   16:ifeq            21
				return 2;
		//    9   19:iconst_2        
		//   10   20:ireturn         
			if(navigationmenuitem instanceof NavigationMenuHeaderItem)
		//*  11   21:aload_2         
		//*  12   22:instanceof      #127 <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
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
		//   22   44:invokevirtual   #131 <Method boolean MenuItemImpl.hasSubMenu()>
		//   23   47:ifeq            52
		//   24   50:iconst_1        
		//   25   51:ireturn         
		//   26   52:iconst_0        
		//   27   53:ireturn         
			else
				throw new RuntimeException("Unknown item type.");
		//   28   54:new             #62  <Class RuntimeException>
		//   29   57:dup             
		//   30   58:ldc1            #133 <String "Unknown item type.">
		//   31   60:invokespecial   #134 <Method void RuntimeException(String)>
		//   32   63:athrow          
		}

		public void onBindViewHolder(ViewHolder viewholder, int i)
		{
			NavigationMenuItemView navigationmenuitemview;
			switch(getItemViewType(i))
		//*   0    0:aload_0         
		//*   1    1:iload_2         
		//*   2    2:invokevirtual   #138 <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 2: default 32
		//		               0 91
		//		               1 63
		//		               2 33
			default:
				return;
		//    4   32:return          

			case 2: // '\002'
				NavigationMenuSeparatorItem navigationmenuseparatoritem = (NavigationMenuSeparatorItem)mItems.get(i);
		//    5   33:aload_0         
		//    6   34:getfield        #45  <Field ArrayList mItems>
		//    7   37:iload_2         
		//    8   38:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//    9   41:checkcast       #125 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//   10   44:astore_3        
				viewholder.itemView.setPadding(0, navigationmenuseparatoritem.getPaddingTop(), 0, navigationmenuseparatoritem.getPaddingBottom());
		//   11   45:aload_1         
		//   12   46:getfield        #144 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//   13   49:iconst_0        
		//   14   50:aload_3         
		//   15   51:invokevirtual   #147 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingTop()>
		//   16   54:iconst_0        
		//   17   55:aload_3         
		//   18   56:invokevirtual   #150 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingBottom()>
		//   19   59:invokevirtual   #154 <Method void View.setPadding(int, int, int, int)>
				return;
		//   20   62:return          

			case 1: // '\001'
				((TextView)viewholder.itemView).setText(((NavigationMenuTextItem)mItems.get(i)).getMenuItem().getTitle());
		//   21   63:aload_1         
		//   22   64:getfield        #144 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//   23   67:checkcast       #156 <Class TextView>
		//   24   70:aload_0         
		//   25   71:getfield        #45  <Field ArrayList mItems>
		//   26   74:iload_2         
		//   27   75:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   28   78:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   29   81:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   30   84:invokevirtual   #160 <Method CharSequence MenuItemImpl.getTitle()>
		//   31   87:invokevirtual   #164 <Method void TextView.setText(CharSequence)>
				return;
		//   32   90:return          

			case 0: // '\0'
				navigationmenuitemview = (NavigationMenuItemView)viewholder.itemView;
		//   33   91:aload_1         
		//   34   92:getfield        #144 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//   35   95:checkcast       #166 <Class NavigationMenuItemView>
		//   36   98:astore_3        
				navigationmenuitemview.setIconTintList(mIconTintList);
		//   37   99:aload_3         
		//   38  100:aload_0         
		//   39  101:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   40  104:getfield        #170 <Field ColorStateList NavigationMenuPresenter.mIconTintList>
		//   41  107:invokevirtual   #174 <Method void NavigationMenuItemView.setIconTintList(ColorStateList)>
				break;
			}
			if(mTextAppearanceSet)
		//*  42  110:aload_0         
		//*  43  111:getfield        #37  <Field NavigationMenuPresenter this$0>
		//*  44  114:getfield        #177 <Field boolean NavigationMenuPresenter.mTextAppearanceSet>
		//*  45  117:ifeq            131
				navigationmenuitemview.setTextAppearance(mTextAppearance);
		//   46  120:aload_3         
		//   47  121:aload_0         
		//   48  122:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   49  125:getfield        #180 <Field int NavigationMenuPresenter.mTextAppearance>
		//   50  128:invokevirtual   #184 <Method void NavigationMenuItemView.setTextAppearance(int)>
			if(mTextColor != null)
		//*  51  131:aload_0         
		//*  52  132:getfield        #37  <Field NavigationMenuPresenter this$0>
		//*  53  135:getfield        #187 <Field ColorStateList NavigationMenuPresenter.mTextColor>
		//*  54  138:ifnull          152
				navigationmenuitemview.setTextColor(mTextColor);
		//   55  141:aload_3         
		//   56  142:aload_0         
		//   57  143:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   58  146:getfield        #187 <Field ColorStateList NavigationMenuPresenter.mTextColor>
		//   59  149:invokevirtual   #190 <Method void NavigationMenuItemView.setTextColor(ColorStateList)>
			if(mItemBackground != null)
		//*  60  152:aload_0         
		//*  61  153:getfield        #37  <Field NavigationMenuPresenter this$0>
		//*  62  156:getfield        #194 <Field Drawable NavigationMenuPresenter.mItemBackground>
		//*  63  159:ifnull          179
				viewholder = ((ViewHolder) (mItemBackground.getConstantState().newDrawable()));
		//   64  162:aload_0         
		//   65  163:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   66  166:getfield        #194 <Field Drawable NavigationMenuPresenter.mItemBackground>
		//   67  169:invokevirtual   #200 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
		//   68  172:invokevirtual   #206 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//   69  175:astore_1        
			else
		//*  70  176:goto            181
				viewholder = null;
		//   71  179:aconst_null     
		//   72  180:astore_1        
			ViewCompat.setBackground(((View) (navigationmenuitemview)), ((Drawable) (viewholder)));
		//   73  181:aload_3         
		//   74  182:aload_1         
		//   75  183:invokestatic    #212 <Method void ViewCompat.setBackground(View, Drawable)>
			viewholder = ((ViewHolder) ((NavigationMenuTextItem)mItems.get(i)));
		//   76  186:aload_0         
		//   77  187:getfield        #45  <Field ArrayList mItems>
		//   78  190:iload_2         
		//   79  191:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   80  194:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   81  197:astore_1        
			navigationmenuitemview.setNeedsEmptyIcon(((NavigationMenuTextItem) (viewholder)).needsEmptyIcon);
		//   82  198:aload_3         
		//   83  199:aload_1         
		//   84  200:getfield        #60  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>
		//   85  203:invokevirtual   #216 <Method void NavigationMenuItemView.setNeedsEmptyIcon(boolean)>
			navigationmenuitemview.initialize(((NavigationMenuTextItem) (viewholder)).getMenuItem(), 0);
		//   86  206:aload_3         
		//   87  207:aload_1         
		//   88  208:invokevirtual   #98  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   89  211:iconst_0        
		//   90  212:invokevirtual   #220 <Method void NavigationMenuItemView.initialize(MenuItemImpl, int)>
		//   91  215:return          
		}

		public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
		{
			onBindViewHolder((ViewHolder)viewholder, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #140 <Class NavigationMenuPresenter$ViewHolder>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #223 <Method void onBindViewHolder(NavigationMenuPresenter$ViewHolder, int)>
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
				return ((ViewHolder) (new HeaderViewHolder(((View) (mHeaderLayout)))));
		//    4   34:new             #227 <Class NavigationMenuPresenter$HeaderViewHolder>
		//    5   37:dup             
		//    6   38:aload_0         
		//    7   39:getfield        #37  <Field NavigationMenuPresenter this$0>
		//    8   42:getfield        #231 <Field LinearLayout NavigationMenuPresenter.mHeaderLayout>
		//    9   45:invokespecial   #234 <Method void NavigationMenuPresenter$HeaderViewHolder(View)>
		//   10   48:areturn         

			case 2: // '\002'
				return ((ViewHolder) (new SeparatorViewHolder(mLayoutInflater, viewgroup)));
		//   11   49:new             #236 <Class NavigationMenuPresenter$SeparatorViewHolder>
		//   12   52:dup             
		//   13   53:aload_0         
		//   14   54:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   15   57:getfield        #240 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//   16   60:aload_1         
		//   17   61:invokespecial   #243 <Method void NavigationMenuPresenter$SeparatorViewHolder(LayoutInflater, ViewGroup)>
		//   18   64:areturn         

			case 1: // '\001'
				return ((ViewHolder) (new SubheaderViewHolder(mLayoutInflater, viewgroup)));
		//   19   65:new             #245 <Class NavigationMenuPresenter$SubheaderViewHolder>
		//   20   68:dup             
		//   21   69:aload_0         
		//   22   70:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   23   73:getfield        #240 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//   24   76:aload_1         
		//   25   77:invokespecial   #246 <Method void NavigationMenuPresenter$SubheaderViewHolder(LayoutInflater, ViewGroup)>
		//   26   80:areturn         

			case 0: // '\0'
				return ((ViewHolder) (new NormalViewHolder(mLayoutInflater, viewgroup, mOnClickListener)));
		//   27   81:new             #248 <Class NavigationMenuPresenter$NormalViewHolder>
		//   28   84:dup             
		//   29   85:aload_0         
		//   30   86:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   31   89:getfield        #240 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//   32   92:aload_1         
		//   33   93:aload_0         
		//   34   94:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   35   97:getfield        #252 <Field android.view.View$OnClickListener NavigationMenuPresenter.mOnClickListener>
		//   36  100:invokespecial   #255 <Method void NavigationMenuPresenter$NormalViewHolder(LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
		//   37  103:areturn         
			}
		}

		public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
		{
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #258 <Method NavigationMenuPresenter$ViewHolder onCreateViewHolder(ViewGroup, int)>
		//    4    6:areturn         
		}

		public void onViewRecycled(ViewHolder viewholder)
		{
			if(viewholder instanceof NormalViewHolder)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #248 <Class NavigationMenuPresenter$NormalViewHolder>
		//*   2    4:ifeq            17
				((NavigationMenuItemView)viewholder.itemView).recycle();
		//    3    7:aload_1         
		//    4    8:getfield        #144 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//    5   11:checkcast       #166 <Class NavigationMenuItemView>
		//    6   14:invokevirtual   #263 <Method void NavigationMenuItemView.recycle()>
		//    7   17:return          
		}

		public volatile void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			onViewRecycled((ViewHolder)viewholder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #140 <Class NavigationMenuPresenter$ViewHolder>
		//    3    5:invokevirtual   #266 <Method void onViewRecycled(NavigationMenuPresenter$ViewHolder)>
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
		//    5    6:invokevirtual   #272 <Method int Bundle.getInt(String, int)>
		//    6    9:istore          4
			if(k != 0)
		//*   7   11:iload           4
		//*   8   13:ifeq            109
			{
				mUpdateSuspended = true;
		//    9   16:aload_0         
		//   10   17:iconst_1        
		//   11   18:putfield        #274 <Field boolean mUpdateSuspended>
				int i1 = mItems.size();
		//   12   21:aload_0         
		//   13   22:getfield        #45  <Field ArrayList mItems>
		//   14   25:invokevirtual   #92  <Method int ArrayList.size()>
		//   15   28:istore          5
				for(int i = 0; i < i1; i++)
		//*  16   30:iconst_0        
		//*  17   31:istore_2        
		//*  18   32:iload_2         
		//*  19   33:iload           5
		//*  20   35:icmpge          100
				{
					Object obj = ((Object) ((NavigationMenuItem)mItems.get(i)));
		//   21   38:aload_0         
		//   22   39:getfield        #45  <Field ArrayList mItems>
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
		//   42   87:invokevirtual   #278 <Method void setCheckedItem(MenuItemImpl)>
					break;
		//   43   90:goto            100
				}

		//   44   93:iload_2         
		//   45   94:iconst_1        
		//   46   95:iadd            
		//   47   96:istore_2        
		//*  48   97:goto            32
				mUpdateSuspended = false;
		//   49  100:aload_0         
		//   50  101:iconst_0        
		//   51  102:putfield        #274 <Field boolean mUpdateSuspended>
				prepareMenuItems();
		//   52  105:aload_0         
		//   53  106:invokespecial   #48  <Method void prepareMenuItems()>
			}
			bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:action_views")));
		//   54  109:aload_1         
		//   55  110:ldc1            #12  <String "android:menu:action_views">
		//   56  112:invokevirtual   #282 <Method SparseArray Bundle.getSparseParcelableArray(String)>
		//   57  115:astore_1        
			if(bundle != null)
		//*  58  116:aload_1         
		//*  59  117:ifnull          230
			{
				int l = mItems.size();
		//   60  120:aload_0         
		//   61  121:getfield        #45  <Field ArrayList mItems>
		//   62  124:invokevirtual   #92  <Method int ArrayList.size()>
		//   63  127:istore          4
				for(int j = ((int) (flag)); j < l; j++)
		//*  64  129:iload_3         
		//*  65  130:istore_2        
		//*  66  131:iload_2         
		//*  67  132:iload           4
		//*  68  134:icmpge          230
				{
					Object obj1 = ((Object) ((NavigationMenuItem)mItems.get(j)));
		//   69  137:aload_0         
		//   70  138:getfield        #45  <Field ArrayList mItems>
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
		//   95  200:invokevirtual   #283 <Method Object SparseArray.get(int)>
		//   96  203:checkcast       #104 <Class ParcelableSparseArray>
		//   97  206:astore          7
					if(obj2 != null)
		//*  98  208:aload           7
		//*  99  210:ifnonnull       216
		//* 100  213:goto            223
						((View) (obj1)).restoreHierarchyState(((SparseArray) (obj2)));
		//  101  216:aload           6
		//  102  218:aload           7
		//  103  220:invokevirtual   #286 <Method void View.restoreHierarchyState(SparseArray)>
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
			if(mCheckedItem != menuitemimpl)
		//*   0    0:aload_0         
		//*   1    1:getfield        #76  <Field MenuItemImpl mCheckedItem>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       44
			{
				if(!menuitemimpl.isCheckable())
		//*   4    8:aload_1         
		//*   5    9:invokevirtual   #289 <Method boolean MenuItemImpl.isCheckable()>
		//*   6   12:ifne            16
					return;
		//    7   15:return          
				if(mCheckedItem != null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #76  <Field MenuItemImpl mCheckedItem>
		//*  10   20:ifnull          32
					mCheckedItem.setChecked(false);
		//   11   23:aload_0         
		//   12   24:getfield        #76  <Field MenuItemImpl mCheckedItem>
		//   13   27:iconst_0        
		//   14   28:invokevirtual   #293 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
		//   15   31:pop             
				mCheckedItem = menuitemimpl;
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:putfield        #76  <Field MenuItemImpl mCheckedItem>
				menuitemimpl.setChecked(true);
		//   19   37:aload_1         
		//   20   38:iconst_1        
		//   21   39:invokevirtual   #293 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
		//   22   42:pop             
				return;
		//   23   43:return          
			} else
			{
				return;
		//   24   44:return          
			}
		}

		public void setUpdateSuspended(boolean flag)
		{
			mUpdateSuspended = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #274 <Field boolean mUpdateSuspended>
		//    3    5:return          
		}

		public void update()
		{
			prepareMenuItems();
		//    0    0:aload_0         
		//    1    1:invokespecial   #48  <Method void prepareMenuItems()>
			notifyDataSetChanged();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #298 <Method void notifyDataSetChanged()>
		//    4    8:return          
		}

		private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
		private static final String STATE_CHECKED_ITEM = "android:menu:checked";
		private static final int VIEW_TYPE_HEADER = 3;
		private static final int VIEW_TYPE_NORMAL = 0;
		private static final int VIEW_TYPE_SEPARATOR = 2;
		private static final int VIEW_TYPE_SUBHEADER = 1;
		private MenuItemImpl mCheckedItem;
		private final ArrayList mItems = new ArrayList();
		private boolean mUpdateSuspended;
		final NavigationMenuPresenter this$0;

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
		//    9   17:putfield        #45  <Field ArrayList mItems>
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
			return mPaddingBottom;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int mPaddingBottom>
		//    2    4:ireturn         
		}

		public int getPaddingTop()
		{
			return mPaddingTop;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int mPaddingTop>
		//    2    4:ireturn         
		}

		private final int mPaddingBottom;
		private final int mPaddingTop;

		public NavigationMenuSeparatorItem(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mPaddingTop = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int mPaddingTop>
			mPaddingBottom = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int mPaddingBottom>
		//    8   14:return          
		}
	}

	private static class NavigationMenuTextItem
		implements NavigationMenuItem
	{

		public MenuItemImpl getMenuItem()
		{
			return mMenuItem;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field MenuItemImpl mMenuItem>
		//    2    4:areturn         
		}

		private final MenuItemImpl mMenuItem;
		boolean needsEmptyIcon;

		NavigationMenuTextItem(MenuItemImpl menuitemimpl)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mMenuItem = menuitemimpl;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field MenuItemImpl mMenuItem>
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
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class NavigationMenuPresenter$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #85  <Method void NavigationMenuPresenter$1(NavigationMenuPresenter)>
	//    7   13:putfield        #87  <Field android.view.View$OnClickListener mOnClickListener>
	//    8   16:return          
	}

	public void addHeaderView(View view)
	{
		mHeaderLayout.addView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method void LinearLayout.addView(View)>
		mMenuView.setPadding(0, 0, 0, mMenuView.getPaddingBottom());
	//    4    8:aload_0         
	//    5    9:getfield        #100 <Field NavigationMenuView mMenuView>
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #100 <Field NavigationMenuView mMenuView>
	//   11   19:invokevirtual   #106 <Method int NavigationMenuView.getPaddingBottom()>
	//   12   22:invokevirtual   #110 <Method void NavigationMenuView.setPadding(int, int, int, int)>
	//   13   25:return          
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
	//    1    1:invokevirtual   #120 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//    2    4:istore_2        
		if(mPaddingTopDefault != i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #122 <Field int mPaddingTopDefault>
	//*   5    9:iload_2         
	//*   6   10:icmpeq          48
		{
			mPaddingTopDefault = i;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:putfield        #122 <Field int mPaddingTopDefault>
			if(mHeaderLayout.getChildCount() == 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #93  <Field LinearLayout mHeaderLayout>
	//*  12   22:invokevirtual   #125 <Method int LinearLayout.getChildCount()>
	//*  13   25:ifne            48
				mMenuView.setPadding(0, mPaddingTopDefault, 0, mMenuView.getPaddingBottom());
	//   14   28:aload_0         
	//   15   29:getfield        #100 <Field NavigationMenuView mMenuView>
	//   16   32:iconst_0        
	//   17   33:aload_0         
	//   18   34:getfield        #122 <Field int mPaddingTopDefault>
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #100 <Field NavigationMenuView mMenuView>
	//   22   42:invokevirtual   #106 <Method int NavigationMenuView.getPaddingBottom()>
	//   23   45:invokevirtual   #110 <Method void NavigationMenuView.setPadding(int, int, int, int)>
		}
		ViewCompat.dispatchApplyWindowInsets(((View) (mHeaderLayout)), windowinsetscompat);
	//   24   48:aload_0         
	//   25   49:getfield        #93  <Field LinearLayout mHeaderLayout>
	//   26   52:aload_1         
	//   27   53:invokestatic    #130 <Method WindowInsetsCompat ViewCompat.dispatchApplyWindowInsets(View, WindowInsetsCompat)>
	//   28   56:pop             
	//   29   57:return          
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

	public int getHeaderCount()
	{
		return mHeaderLayout.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:invokevirtual   #125 <Method int LinearLayout.getChildCount()>
	//    3    7:ireturn         
	}

	public View getHeaderView(int i)
	{
		return mHeaderLayout.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #139 <Method View LinearLayout.getChildAt(int)>
	//    4    8:areturn         
	}

	public int getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int mId>
	//    2    4:ireturn         
	}

	public Drawable getItemBackground()
	{
		return mItemBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field Drawable mItemBackground>
	//    2    4:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return mTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field ColorStateList mTextColor>
	//    2    4:areturn         
	}

	public ColorStateList getItemTintList()
	{
		return mIconTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field ColorStateList mIconTintList>
	//    2    4:areturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		if(mMenuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field NavigationMenuView mMenuView>
	//*   2    4:ifnonnull       78
		{
			mMenuView = (NavigationMenuView)mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_menu, viewgroup, false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #159 <Field LayoutInflater mLayoutInflater>
	//    6   12:getstatic       #164 <Field int android.support.design.R$layout.design_navigation_menu>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #170 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   20:checkcast       #102 <Class NavigationMenuView>
	//   11   23:putfield        #100 <Field NavigationMenuView mMenuView>
			if(mAdapter == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*  14   30:ifnonnull       45
				mAdapter = new NavigationMenuAdapter();
	//   15   33:aload_0         
	//   16   34:new             #13  <Class NavigationMenuPresenter$NavigationMenuAdapter>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #173 <Method void NavigationMenuPresenter$NavigationMenuAdapter(NavigationMenuPresenter)>
	//   20   42:putfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
			mHeaderLayout = (LinearLayout)mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_header, ((ViewGroup) (mMenuView)), false);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #159 <Field LayoutInflater mLayoutInflater>
	//   24   50:getstatic       #176 <Field int android.support.design.R$layout.design_navigation_item_header>
	//   25   53:aload_0         
	//   26   54:getfield        #100 <Field NavigationMenuView mMenuView>
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #170 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   29   61:checkcast       #95  <Class LinearLayout>
	//   30   64:putfield        #93  <Field LinearLayout mHeaderLayout>
			mMenuView.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (mAdapter)));
	//   31   67:aload_0         
	//   32   68:getfield        #100 <Field NavigationMenuView mMenuView>
	//   33   71:aload_0         
	//   34   72:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//   35   75:invokevirtual   #180 <Method void NavigationMenuView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		}
		return ((MenuView) (mMenuView));
	//   36   78:aload_0         
	//   37   79:getfield        #100 <Field NavigationMenuView mMenuView>
	//   38   82:areturn         
	}

	public View inflateHeaderView(int i)
	{
		View view = mLayoutInflater.inflate(i, ((ViewGroup) (mHeaderLayout)), false);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field LayoutInflater mLayoutInflater>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #170 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   13:astore_2        
		addHeaderView(view);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #184 <Method void addHeaderView(View)>
		return view;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		mLayoutInflater = LayoutInflater.from(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #190 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    5:putfield        #159 <Field LayoutInflater mLayoutInflater>
		mMenu = menubuilder;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #192 <Field MenuBuilder mMenu>
		mPaddingSeparator = context.getResources().getDimensionPixelOffset(android.support.design.R.dimen.design_navigation_separator_vertical_padding);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #198 <Method Resources Context.getResources()>
	//   10   18:getstatic       #203 <Field int android.support.design.R$dimen.design_navigation_separator_vertical_padding>
	//   11   21:invokevirtual   #209 <Method int Resources.getDimensionPixelOffset(int)>
	//   12   24:putfield        #211 <Field int mPaddingSeparator>
	//   13   27:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field android.support.v7.view.menu.MenuPresenter$Callback mCallback>
	//*   2    4:ifnull          18
			mCallback.onCloseMenu(menubuilder, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #215 <Field android.support.v7.view.menu.MenuPresenter$Callback mCallback>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #219 <Method void android.support.v7.view.menu.MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    8   18:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof Bundle)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #223 <Class Bundle>
	//*   2    4:ifeq            69
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    3    7:aload_1         
	//    4    8:checkcast       #223 <Class Bundle>
	//    5   11:astore_1        
			Object obj = ((Object) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:list")));
	//    6   12:aload_1         
	//    7   13:ldc1            #52  <String "android:menu:list">
	//    8   15:invokevirtual   #227 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    9   18:astore_2        
			if(obj != null)
	//*  10   19:aload_2         
	//*  11   20:ifnull          31
				mMenuView.restoreHierarchyState(((SparseArray) (obj)));
	//   12   23:aload_0         
	//   13   24:getfield        #100 <Field NavigationMenuView mMenuView>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #231 <Method void NavigationMenuView.restoreHierarchyState(SparseArray)>
			obj = ((Object) (((Bundle) (parcelable)).getBundle("android:menu:adapter")));
	//   16   31:aload_1         
	//   17   32:ldc1            #46  <String "android:menu:adapter">
	//   18   34:invokevirtual   #235 <Method Bundle Bundle.getBundle(String)>
	//   19   37:astore_2        
			if(obj != null)
	//*  20   38:aload_2         
	//*  21   39:ifnull          50
				mAdapter.restoreInstanceState(((Bundle) (obj)));
	//   22   42:aload_0         
	//   23   43:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #239 <Method void NavigationMenuPresenter$NavigationMenuAdapter.restoreInstanceState(Bundle)>
			parcelable = ((Parcelable) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:header")));
	//   26   50:aload_1         
	//   27   51:ldc1            #49  <String "android:menu:header">
	//   28   53:invokevirtual   #227 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   29   56:astore_1        
			if(parcelable != null)
	//*  30   57:aload_1         
	//*  31   58:ifnull          69
				mHeaderLayout.restoreHierarchyState(((SparseArray) (parcelable)));
	//   32   61:aload_0         
	//   33   62:getfield        #93  <Field LinearLayout mHeaderLayout>
	//   34   65:aload_1         
	//   35   66:invokevirtual   #240 <Method void LinearLayout.restoreHierarchyState(SparseArray)>
		}
	//   36   69:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #247 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          98
		{
			Bundle bundle = new Bundle();
	//    3    8:new             #223 <Class Bundle>
	//    4   11:dup             
	//    5   12:invokespecial   #248 <Method void Bundle()>
	//    6   15:astore_1        
			if(mMenuView != null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #100 <Field NavigationMenuView mMenuView>
	//*   9   20:ifnull          46
			{
				SparseArray sparsearray = new SparseArray();
	//   10   23:new             #250 <Class SparseArray>
	//   11   26:dup             
	//   12   27:invokespecial   #251 <Method void SparseArray()>
	//   13   30:astore_2        
				mMenuView.saveHierarchyState(sparsearray);
	//   14   31:aload_0         
	//   15   32:getfield        #100 <Field NavigationMenuView mMenuView>
	//   16   35:aload_2         
	//   17   36:invokevirtual   #254 <Method void NavigationMenuView.saveHierarchyState(SparseArray)>
				bundle.putSparseParcelableArray("android:menu:list", sparsearray);
	//   18   39:aload_1         
	//   19   40:ldc1            #52  <String "android:menu:list">
	//   20   42:aload_2         
	//   21   43:invokevirtual   #258 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			}
			if(mAdapter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*  24   50:ifnull          66
				bundle.putBundle("android:menu:adapter", mAdapter.createInstanceState());
	//   25   53:aload_1         
	//   26   54:ldc1            #46  <String "android:menu:adapter">
	//   27   56:aload_0         
	//   28   57:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//   29   60:invokevirtual   #262 <Method Bundle NavigationMenuPresenter$NavigationMenuAdapter.createInstanceState()>
	//   30   63:invokevirtual   #266 <Method void Bundle.putBundle(String, Bundle)>
			if(mHeaderLayout != null)
	//*  31   66:aload_0         
	//*  32   67:getfield        #93  <Field LinearLayout mHeaderLayout>
	//*  33   70:ifnull          96
			{
				SparseArray sparsearray1 = new SparseArray();
	//   34   73:new             #250 <Class SparseArray>
	//   35   76:dup             
	//   36   77:invokespecial   #251 <Method void SparseArray()>
	//   37   80:astore_2        
				mHeaderLayout.saveHierarchyState(sparsearray1);
	//   38   81:aload_0         
	//   39   82:getfield        #93  <Field LinearLayout mHeaderLayout>
	//   40   85:aload_2         
	//   41   86:invokevirtual   #267 <Method void LinearLayout.saveHierarchyState(SparseArray)>
				bundle.putSparseParcelableArray("android:menu:header", sparsearray1);
	//   42   89:aload_1         
	//   43   90:ldc1            #49  <String "android:menu:header">
	//   44   92:aload_2         
	//   45   93:invokevirtual   #258 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			}
			return ((Parcelable) (bundle));
	//   46   96:aload_1         
	//   47   97:areturn         
		} else
		{
			return null;
	//   48   98:aconst_null     
	//   49   99:areturn         
		}
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void removeHeaderView(View view)
	{
		mHeaderLayout.removeView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #273 <Method void LinearLayout.removeView(View)>
		if(mHeaderLayout.getChildCount() == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #93  <Field LinearLayout mHeaderLayout>
	//*   6   12:invokevirtual   #125 <Method int LinearLayout.getChildCount()>
	//*   7   15:ifne            38
			mMenuView.setPadding(0, mPaddingTopDefault, 0, mMenuView.getPaddingBottom());
	//    8   18:aload_0         
	//    9   19:getfield        #100 <Field NavigationMenuView mMenuView>
	//   10   22:iconst_0        
	//   11   23:aload_0         
	//   12   24:getfield        #122 <Field int mPaddingTopDefault>
	//   13   27:iconst_0        
	//   14   28:aload_0         
	//   15   29:getfield        #100 <Field NavigationMenuView mMenuView>
	//   16   32:invokevirtual   #106 <Method int NavigationMenuView.getPaddingBottom()>
	//   17   35:invokevirtual   #110 <Method void NavigationMenuView.setPadding(int, int, int, int)>
	//   18   38:return          
	}

	public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #215 <Field android.support.v7.view.menu.MenuPresenter$Callback mCallback>
	//    3    5:return          
	}

	public void setCheckedItem(MenuItemImpl menuitemimpl)
	{
		mAdapter.setCheckedItem(menuitemimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method void NavigationMenuPresenter$NavigationMenuAdapter.setCheckedItem(MenuItemImpl)>
	//    4    8:return          
	}

	public void setId(int i)
	{
		mId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field int mId>
	//    3    5:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		mItemBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field Drawable mItemBackground>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		mIconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field ColorStateList mIconTintList>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemTextAppearance(int i)
	{
		mTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #293 <Field int mTextAppearance>
		mTextAppearanceSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #295 <Field boolean mTextAppearanceSet>
		updateMenuView(false);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    9   15:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		mTextColor = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field ColorStateList mTextColor>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setUpdateSuspended(boolean flag)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*   2    4:ifnull          15
			mAdapter.setUpdateSuspended(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #299 <Method void NavigationMenuPresenter$NavigationMenuAdapter.setUpdateSuspended(boolean)>
	//    7   15:return          
	}

	public void updateMenuView(boolean flag)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*   2    4:ifnull          14
			mAdapter.update();
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//    5   11:invokevirtual   #302 <Method void NavigationMenuPresenter$NavigationMenuAdapter.update()>
	//    6   14:return          
	}

	private static final String STATE_ADAPTER = "android:menu:adapter";
	private static final String STATE_HEADER = "android:menu:header";
	private static final String STATE_HIERARCHY = "android:menu:list";
	NavigationMenuAdapter mAdapter;
	private android.support.v7.view.menu.MenuPresenter.Callback mCallback;
	LinearLayout mHeaderLayout;
	ColorStateList mIconTintList;
	private int mId;
	Drawable mItemBackground;
	LayoutInflater mLayoutInflater;
	MenuBuilder mMenu;
	private NavigationMenuView mMenuView;
	final android.view.View.OnClickListener mOnClickListener = new android.view.View.OnClickListener() {

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
			boolean flag = mMenu.performItemAction(((android.view.MenuItem) (view)), ((MenuPresenter) (NavigationMenuPresenter.this)), 0);
		//   10   18:aload_0         
		//   11   19:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   12   22:getfield        #34  <Field MenuBuilder NavigationMenuPresenter.mMenu>
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
				mAdapter.setCheckedItem(((MenuItemImpl) (view)));
		//   26   50:aload_0         
		//   27   51:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   28   54:getfield        #50  <Field NavigationMenuPresenter$NavigationMenuAdapter NavigationMenuPresenter.mAdapter>
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
	int mPaddingSeparator;
	private int mPaddingTopDefault;
	int mTextAppearance;
	boolean mTextAppearanceSet;
	ColorStateList mTextColor;
}
