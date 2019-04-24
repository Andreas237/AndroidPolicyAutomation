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
	private static class ViewHolderItem
	{

		ImageView mIcon;
		TextView mText;

		private ViewHolderItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}

	}


	BrowserActionsFallbackMenuAdapter(List list, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BaseAdapter()>
		mMenuItems = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field List mMenuItems>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Context mContext>
	//    8   14:return          
	}

	public int getCount()
	{
		return mMenuItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mMenuItems>
	//    2    4:invokeinterface #33  <Method int List.size()>
	//    3    9:ireturn         
	}

	public Object getItem(int i)
	{
		return mMenuItems.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mMenuItems>
	//    2    4:iload_1         
	//    3    5:invokeinterface #38  <Method Object List.get(int)>
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
	//    1    1:getfield        #21  <Field List mMenuItems>
	//    2    4:iload_1         
	//    3    5:invokeinterface #38  <Method Object List.get(int)>
	//    4   10:checkcast       #44  <Class BrowserActionItem>
	//    5   13:astore          5
		if(view == null)
	//*   6   15:aload_2         
	//*   7   16:ifnonnull       79
		{
			viewgroup = ((ViewGroup) (LayoutInflater.from(mContext).inflate(android.support.customtabs.R.layout.browser_actions_context_menu_row, ((ViewGroup) (null)))));
	//    8   19:aload_0         
	//    9   20:getfield        #23  <Field Context mContext>
	//   10   23:invokestatic    #50  <Method LayoutInflater LayoutInflater.from(Context)>
	//   11   26:getstatic       #56  <Field int android.support.customtabs.R$layout.browser_actions_context_menu_row>
	//   12   29:aconst_null     
	//   13   30:invokevirtual   #60  <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   14   33:astore_3        
			view = ((View) (new ViewHolderItem()));
	//   15   34:new             #8   <Class BrowserActionsFallbackMenuAdapter$ViewHolderItem>
	//   16   37:dup             
	//   17   38:aconst_null     
	//   18   39:invokespecial   #63  <Method void BrowserActionsFallbackMenuAdapter$ViewHolderItem(BrowserActionsFallbackMenuAdapter$1)>
	//   19   42:astore_2        
			view.mIcon = (ImageView)((View) (viewgroup)).findViewById(android.support.customtabs.R.id.browser_actions_menu_item_icon);
	//   20   43:aload_2         
	//   21   44:aload_3         
	//   22   45:getstatic       #68  <Field int android.support.customtabs.R$id.browser_actions_menu_item_icon>
	//   23   48:invokevirtual   #74  <Method View View.findViewById(int)>
	//   24   51:checkcast       #76  <Class ImageView>
	//   25   54:putfield        #80  <Field ImageView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mIcon>
			view.mText = (TextView)((View) (viewgroup)).findViewById(android.support.customtabs.R.id.browser_actions_menu_item_text);
	//   26   57:aload_2         
	//   27   58:aload_3         
	//   28   59:getstatic       #83  <Field int android.support.customtabs.R$id.browser_actions_menu_item_text>
	//   29   62:invokevirtual   #74  <Method View View.findViewById(int)>
	//   30   65:checkcast       #85  <Class TextView>
	//   31   68:putfield        #89  <Field TextView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mText>
			((View) (viewgroup)).setTag(((Object) (view)));
	//   32   71:aload_3         
	//   33   72:aload_2         
	//   34   73:invokevirtual   #93  <Method void View.setTag(Object)>
		} else
	//*  35   76:goto            93
		{
			ViewHolderItem viewholderitem = (ViewHolderItem)view.getTag();
	//   36   79:aload_2         
	//   37   80:invokevirtual   #97  <Method Object View.getTag()>
	//   38   83:checkcast       #8   <Class BrowserActionsFallbackMenuAdapter$ViewHolderItem>
	//   39   86:astore          4
			viewgroup = ((ViewGroup) (view));
	//   40   88:aload_2         
	//   41   89:astore_3        
			view = ((View) (viewholderitem));
	//   42   90:aload           4
	//   43   92:astore_2        
		}
		((ViewHolderItem) (view)).mText.setText(((CharSequence) (browseractionitem.getTitle())));
	//   44   93:aload_2         
	//   45   94:getfield        #89  <Field TextView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mText>
	//   46   97:aload           5
	//   47   99:invokevirtual   #101 <Method String BrowserActionItem.getTitle()>
	//   48  102:invokevirtual   #105 <Method void TextView.setText(CharSequence)>
		if(browseractionitem.getIconId() != 0)
	//*  49  105:aload           5
	//*  50  107:invokevirtual   #108 <Method int BrowserActionItem.getIconId()>
	//*  51  110:ifeq            142
		{
			android.graphics.drawable.Drawable drawable = ResourcesCompat.getDrawable(mContext.getResources(), browseractionitem.getIconId(), ((android.content.res.Resources.Theme) (null)));
	//   52  113:aload_0         
	//   53  114:getfield        #23  <Field Context mContext>
	//   54  117:invokevirtual   #114 <Method android.content.res.Resources Context.getResources()>
	//   55  120:aload           5
	//   56  122:invokevirtual   #108 <Method int BrowserActionItem.getIconId()>
	//   57  125:aconst_null     
	//   58  126:invokestatic    #120 <Method android.graphics.drawable.Drawable ResourcesCompat.getDrawable(android.content.res.Resources, int, android.content.res.Resources$Theme)>
	//   59  129:astore          4
			((ViewHolderItem) (view)).mIcon.setImageDrawable(drawable);
	//   60  131:aload_2         
	//   61  132:getfield        #80  <Field ImageView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mIcon>
	//   62  135:aload           4
	//   63  137:invokevirtual   #124 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			return ((View) (viewgroup));
	//   64  140:aload_3         
	//   65  141:areturn         
		} else
		{
			((ViewHolderItem) (view)).mIcon.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   66  142:aload_2         
	//   67  143:getfield        #80  <Field ImageView BrowserActionsFallbackMenuAdapter$ViewHolderItem.mIcon>
	//   68  146:aconst_null     
	//   69  147:invokevirtual   #124 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			return ((View) (viewgroup));
	//   70  150:aload_3         
	//   71  151:areturn         
		}
	}

	private final Context mContext;
	private final List mMenuItems;
}
