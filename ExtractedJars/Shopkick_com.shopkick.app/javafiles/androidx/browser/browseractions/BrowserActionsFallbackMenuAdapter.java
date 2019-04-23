// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.view.*;
import android.widget.*;
import java.util.List;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionItem

class BrowserActionsFallbackMenuAdapter extends BaseAdapter
{
	static class ViewHolderItem
	{

		ImageView mIcon;
		TextView mText;

		ViewHolderItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	BrowserActionsFallbackMenuAdapter(List list, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void BaseAdapter()>
		mMenuItems = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field List mMenuItems>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Context mContext>
	//    8   14:return          
	}

	public int getCount()
	{
		return mMenuItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List mMenuItems>
	//    2    4:invokeinterface #31  <Method int List.size()>
	//    3    9:ireturn         
	}

	public Object getItem(int i)
	{
		return mMenuItems.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List mMenuItems>
	//    2    4:iload_1         
	//    3    5:invokeinterface #36  <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		BrowserActionItem browseractionitem = (BrowserActionItem)mMenuItems.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List mMenuItems>
	//    2    4:iload_1         
	//    3    5:invokeinterface #36  <Method Object List.get(int)>
	//    4   10:checkcast       #42  <Class BrowserActionItem>
	//    5   13:astore          5
		if(view == null)
	//*   6   15:aload_2         
	//*   7   16:ifnonnull       78
		{
			viewgroup = ((ViewGroup) (LayoutInflater.from(mContext).inflate(android.support.customtabs.R.layout.browser_actions_context_menu_row, ((ViewGroup) (null)))));
	//    8   19:aload_0         
	//    9   20:getfield        #21  <Field Context mContext>
	//   10   23:invokestatic    #48  <Method LayoutInflater LayoutInflater.from(Context)>
	//   11   26:getstatic       #54  <Field int android.support.customtabs.R$layout.browser_actions_context_menu_row>
	//   12   29:aconst_null     
	//   13   30:invokevirtual   #58  <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   14   33:astore_3        
			view = ((View) (new ViewHolderItem()));
	//   15   34:new             #6   <Class BrowserActionsFallbackMenuAdapter$ViewHolderItem>
	//   16   37:dup             
	//   17   38:invokespecial   #59  <Method void BrowserActionsFallbackMenuAdapter$ViewHolderItem()>
	//   18   41:astore_2        
			view.mIcon = (ImageView)((View) (viewgroup)).findViewById(android.support.customtabs.R.id.browser_actions_menu_item_icon);
	//   19   42:aload_2         
	//   20   43:aload_3         
	//   21   44:getstatic       #64  <Field int android.support.customtabs.R$id.browser_actions_menu_item_icon>
	//   22   47:invokevirtual   #70  <Method View View.findViewById(int)>
	//   23   50:checkcast       #72  <Class ImageView>
	//   24   53:putfield        #76  <Field ImageView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mIcon>
			view.mText = (TextView)((View) (viewgroup)).findViewById(android.support.customtabs.R.id.browser_actions_menu_item_text);
	//   25   56:aload_2         
	//   26   57:aload_3         
	//   27   58:getstatic       #79  <Field int android.support.customtabs.R$id.browser_actions_menu_item_text>
	//   28   61:invokevirtual   #70  <Method View View.findViewById(int)>
	//   29   64:checkcast       #81  <Class TextView>
	//   30   67:putfield        #85  <Field TextView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mText>
			((View) (viewgroup)).setTag(((Object) (view)));
	//   31   70:aload_3         
	//   32   71:aload_2         
	//   33   72:invokevirtual   #89  <Method void View.setTag(Object)>
		} else
	//*  34   75:goto            92
		{
			ViewHolderItem viewholderitem = (ViewHolderItem)view.getTag();
	//   35   78:aload_2         
	//   36   79:invokevirtual   #93  <Method Object View.getTag()>
	//   37   82:checkcast       #6   <Class BrowserActionsFallbackMenuAdapter$ViewHolderItem>
	//   38   85:astore          4
			viewgroup = ((ViewGroup) (view));
	//   39   87:aload_2         
	//   40   88:astore_3        
			view = ((View) (viewholderitem));
	//   41   89:aload           4
	//   42   91:astore_2        
		}
		((ViewHolderItem) (view)).mText.setText(((CharSequence) (browseractionitem.getTitle())));
	//   43   92:aload_2         
	//   44   93:getfield        #85  <Field TextView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mText>
	//   45   96:aload           5
	//   46   98:invokevirtual   #97  <Method String BrowserActionItem.getTitle()>
	//   47  101:invokevirtual   #101 <Method void TextView.setText(CharSequence)>
		if(browseractionitem.getIconId() != 0)
	//*  48  104:aload           5
	//*  49  106:invokevirtual   #104 <Method int BrowserActionItem.getIconId()>
	//*  50  109:ifeq            141
		{
			android.graphics.drawable.Drawable drawable = ResourcesCompat.getDrawable(mContext.getResources(), browseractionitem.getIconId(), ((android.content.res.Resources.Theme) (null)));
	//   51  112:aload_0         
	//   52  113:getfield        #21  <Field Context mContext>
	//   53  116:invokevirtual   #110 <Method android.content.res.Resources Context.getResources()>
	//   54  119:aload           5
	//   55  121:invokevirtual   #104 <Method int BrowserActionItem.getIconId()>
	//   56  124:aconst_null     
	//   57  125:invokestatic    #116 <Method android.graphics.drawable.Drawable ResourcesCompat.getDrawable(android.content.res.Resources, int, android.content.res.Resources$Theme)>
	//   58  128:astore          4
			((ViewHolderItem) (view)).mIcon.setImageDrawable(drawable);
	//   59  130:aload_2         
	//   60  131:getfield        #76  <Field ImageView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mIcon>
	//   61  134:aload           4
	//   62  136:invokevirtual   #120 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			return ((View) (viewgroup));
	//   63  139:aload_3         
	//   64  140:areturn         
		} else
		{
			((ViewHolderItem) (view)).mIcon.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   65  141:aload_2         
	//   66  142:getfield        #76  <Field ImageView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mIcon>
	//   67  145:aconst_null     
	//   68  146:invokevirtual   #120 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			return ((View) (viewgroup));
	//   69  149:aload_3         
	//   70  150:areturn         
		}
	}

	private final Context mContext;
	private final List mMenuItems;
}
