// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.*;

// Referenced classes of package android.support.v7.app:
//			MediaRouteCastDialog, MediaRouterThemeHelper

final class MediaRouteCastDialog$RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

	private Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		switch(routeinfo.getDeviceType())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #95  <Method int android.support.v7.media.MediaRouter$RouteInfo.getDeviceType()>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 45
	//	               2 40
		default:
			if(routeinfo instanceof android.support.v7.media.MediaRouter.RouteGroup)
	//*   3   28:aload_1         
	//*   4   29:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
	//*   5   32:ifeq            50
				return mSpeakerGroupIcon;
	//    6   35:aload_0         
	//    7   36:getfield        #83  <Field Drawable mSpeakerGroupIcon>
	//    8   39:areturn         
			else
	//*   9   40:aload_0         
	//*  10   41:getfield        #78  <Field Drawable mSpeakerIcon>
	//*  11   44:areturn         
	//*  12   45:aload_0         
	//*  13   46:getfield        #73  <Field Drawable mTvIcon>
	//*  14   49:areturn         
				return mDefaultIcon;
	//   15   50:aload_0         
	//   16   51:getfield        #68  <Field Drawable mDefaultIcon>
	//   17   54:areturn         

		case 2: // '\002'
			return mSpeakerIcon;

		case 1: // '\001'
			return mTvIcon;
		}
	}

	Drawable getIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		android.net.Uri uri;
		uri = routeinfo.getIconUri();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method android.net.Uri android.support.v7.media.MediaRouter$RouteInfo.getIconUri()>
	//    2    4:astore_2        
		if(uri == null)
			break MISSING_BLOCK_LABEL_71;
	//    3    5:aload_2         
	//    4    6:ifnull          71
		Drawable drawable = Drawable.createFromStream(mContext.getContentResolver().openInputStream(uri), ((String) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field MediaRouteCastDialog this$0>
	//    7   13:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//    8   16:invokevirtual   #110 <Method ContentResolver Context.getContentResolver()>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #116 <Method java.io.InputStream ContentResolver.openInputStream(android.net.Uri)>
	//   11   23:aconst_null     
	//   12   24:invokestatic    #122 <Method Drawable Drawable.createFromStream(java.io.InputStream, String)>
	//   13   27:astore_3        
		if(drawable != null)
	//*  14   28:aload_3         
	//*  15   29:ifnull          71
			return drawable;
	//   16   32:aload_3         
	//   17   33:areturn         
		break MISSING_BLOCK_LABEL_71;
		IOException ioexception;
		ioexception;
	//   18   34:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   19   35:new             #124 <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #125 <Method void StringBuilder()>
	//   22   42:astore          4
		stringbuilder.append("Failed to load ");
	//   23   44:aload           4
	//   24   46:ldc1            #127 <String "Failed to load ">
	//   25   48:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		stringbuilder.append(((Object) (uri)));
	//   27   52:aload           4
	//   28   54:aload_2         
	//   29   55:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   30   58:pop             
		Log.w("RecyclerAdapter", stringbuilder.toString(), ((Throwable) (ioexception)));
	//   31   59:ldc1            #17  <String "RecyclerAdapter">
	//   32   61:aload           4
	//   33   63:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   34   66:aload_3         
	//   35   67:invokestatic    #144 <Method int Log.w(String, String, Throwable)>
	//   36   70:pop             
		return getDefaultIconDrawable(routeinfo);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokespecial   #146 <Method Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
	//   40   76:areturn         
	}

	public Item getItem(int i)
	{
		class Item
		{

			public Object getData()
			{
				return mData;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Object mData>
			//    2    4:areturn         
			}

			public int getType()
			{
				return mType;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field int mType>
			//    2    4:ireturn         
			}

			private final Object mData;
			private final int mType;
			final MediaRouteCastDialog.RecyclerAdapter this$1;

			Item(Object obj, int i)
			{
				this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
				mData = obj;
			//    5    9:aload_0         
			//    6   10:aload_2         
			//    7   11:putfield        #19  <Field Object mData>
				mType = i;
			//    8   14:aload_0         
			//    9   15:iload_3         
			//   10   16:putfield        #21  <Field int mType>
			//   11   19:return          
			}
		}

		return (Item)mItems.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mItems>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #152 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//    5   11:areturn         
	}

	public int getItemCount()
	{
		return mItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mItems>
	//    2    4:invokevirtual   #158 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public int getItemViewType(int i)
	{
		return ((Item)mItems.get(i)).getType();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mItems>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #152 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//    5   11:invokevirtual   #163 <Method int MediaRouteCastDialog$RecyclerAdapter$Item.getType()>
	//    6   14:ireturn         
	}

	boolean isSelectedRoute(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
label0:
		{
			if(routeinfo.isSelected())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #169 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
	//*   2    4:ifeq            9
				return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
			if(!(mRoute instanceof android.support.v7.media.MediaRouter.RouteGroup))
				break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field MediaRouteCastDialog this$0>
	//    7   13:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//    8   16:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
	//    9   19:ifeq            74
			Iterator iterator = ((android.support.v7.media.MediaRouter.RouteGroup)mRoute).getRoutes().iterator();
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field MediaRouteCastDialog this$0>
	//   12   26:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//   13   29:checkcast       #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
	//   14   32:invokevirtual   #177 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
	//   15   35:invokeinterface #183 <Method Iterator List.iterator()>
	//   16   40:astore_2        
			do
				if(!iterator.hasNext())
					break label0;
	//   17   41:aload_2         
	//   18   42:invokeinterface #188 <Method boolean Iterator.hasNext()>
	//   19   47:ifeq            74
			while(!((android.support.v7.media.MediaRouter.RouteInfo)iterator.next()).getId().equals(((Object) (routeinfo.getId()))));
	//   20   50:aload_2         
	//   21   51:invokeinterface #192 <Method Object Iterator.next()>
	//   22   56:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   23   59:invokevirtual   #195 <Method String android.support.v7.media.MediaRouter$RouteInfo.getId()>
	//   24   62:aload_1         
	//   25   63:invokevirtual   #195 <Method String android.support.v7.media.MediaRouter$RouteInfo.getId()>
	//   26   66:invokevirtual   #201 <Method boolean String.equals(Object)>
	//   27   69:ifeq            41
			return true;
	//   28   72:iconst_1        
	//   29   73:ireturn         
		}
		return false;
	//   30   74:iconst_0        
	//   31   75:ireturn         
	}

	public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		int j = getItemViewType(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #205 <Method int getItemViewType(int)>
	//    3    5:istore_3        
		Item item = getItem(i);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #207 <Method MediaRouteCastDialog$RecyclerAdapter$Item getItem(int)>
	//    7   11:astore          4
		switch(j)
	//*   8   13:iload_3         
		{
	//*   9   14:tableswitch     1 4: default 44
	//	               1 83
	//	               2 73
	//	               3 63
	//	               4 53
		default:
			Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
	//   10   44:ldc1            #17  <String "RecyclerAdapter">
	//   11   46:ldc1            #209 <String "Cannot bind item to ViewHolder because of wrong view type">
	//   12   48:invokestatic    #212 <Method int Log.w(String, String)>
	//   13   51:pop             
			return;
	//   14   52:return          

		case 4: // '\004'
			class GroupViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
			{

				public void bindGroupViewHolder(Item item1)
				{
					item1 = ((Item) ((android.support.v7.media.MediaRouter.RouteInfo)item1.getData()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #49  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
				//    2    4:checkcast       #51  <Class android.support.v7.media.MediaRouter$RouteInfo>
				//    3    7:astore_1        
					mImageView.setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (item1))));
				//    4    8:aload_0         
				//    5    9:getfield        #33  <Field ImageView mImageView>
				//    6   12:aload_0         
				//    7   13:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//    8   16:aload_1         
				//    9   17:invokevirtual   #57  <Method Drawable MediaRouteCastDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
				//   10   20:invokevirtual   #61  <Method void ImageView.setImageDrawable(Drawable)>
					mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getName())));
				//   11   23:aload_0         
				//   12   24:getfield        #40  <Field TextView mTextView>
				//   13   27:aload_1         
				//   14   28:invokevirtual   #65  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
				//   15   31:invokevirtual   #69  <Method void TextView.setText(CharSequence)>
				//   16   34:return          
				}

				ImageView mImageView;
				TextView mTextView;
				final MediaRouteCastDialog.RecyclerAdapter this$1;

			GroupViewHolder(View view)
			{
				this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
				mImageView = (ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_group_icon);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:getstatic       #23  <Field int android.support.v7.mediarouter.R$id.mr_cast_group_icon>
			//    9   15:invokevirtual   #29  <Method View View.findViewById(int)>
			//   10   18:checkcast       #31  <Class ImageView>
			//   11   21:putfield        #33  <Field ImageView mImageView>
				mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_group_name);
			//   12   24:aload_0         
			//   13   25:aload_2         
			//   14   26:getstatic       #36  <Field int android.support.v7.mediarouter.R$id.mr_cast_group_name>
			//   15   29:invokevirtual   #29  <Method View View.findViewById(int)>
			//   16   32:checkcast       #38  <Class TextView>
			//   17   35:putfield        #40  <Field TextView mTextView>
			//   18   38:return          
			}
			}

			((GroupViewHolder)viewholder).bindGroupViewHolder(item);
	//   15   53:aload_1         
	//   16   54:checkcast       #214 <Class MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder>
	//   17   57:aload           4
	//   18   59:invokevirtual   #218 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder.bindGroupViewHolder(MediaRouteCastDialog$RecyclerAdapter$Item)>
			return;
	//   19   62:return          

		case 3: // '\003'
			class RouteViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
			{

				public void bindRouteViewHolder(Item item1)
				{
					item1 = ((Item) ((android.support.v7.media.MediaRouter.RouteInfo)item1.getData()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #67  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
				//    2    4:checkcast       #69  <Class android.support.v7.media.MediaRouter$RouteInfo>
				//    3    7:astore_1        
					mImageView.setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (item1))));
				//    4    8:aload_0         
				//    5    9:getfield        #37  <Field ImageView mImageView>
				//    6   12:aload_0         
				//    7   13:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//    8   16:aload_1         
				//    9   17:invokevirtual   #75  <Method Drawable MediaRouteCastDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
				//   10   20:invokevirtual   #79  <Method void ImageView.setImageDrawable(Drawable)>
					mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getName())));
				//   11   23:aload_0         
				//   12   24:getfield        #44  <Field TextView mTextView>
				//   13   27:aload_1         
				//   14   28:invokevirtual   #83  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
				//   15   31:invokevirtual   #87  <Method void TextView.setText(CharSequence)>
					mCheckBox.setChecked(isSelectedRoute(((android.support.v7.media.MediaRouter.RouteInfo) (item1))));
				//   16   34:aload_0         
				//   17   35:getfield        #51  <Field CheckBox mCheckBox>
				//   18   38:aload_0         
				//   19   39:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//   20   42:aload_1         
				//   21   43:invokevirtual   #91  <Method boolean MediaRouteCastDialog$RecyclerAdapter.isSelectedRoute(android.support.v7.media.MediaRouter$RouteInfo)>
				//   22   46:invokevirtual   #95  <Method void CheckBox.setChecked(boolean)>
					mVolumeSlider.setColor(mVolumeSliderColor);
				//   23   49:aload_0         
				//   24   50:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
				//   25   53:aload_0         
				//   26   54:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//   27   57:getfield        #99  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
				//   28   60:getfield        #104 <Field int MediaRouteCastDialog.mVolumeSliderColor>
				//   29   63:invokevirtual   #108 <Method void MediaRouteVolumeSlider.setColor(int)>
					mVolumeSlider.setTag(((Object) (item1)));
				//   30   66:aload_0         
				//   31   67:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
				//   32   70:aload_1         
				//   33   71:invokevirtual   #112 <Method void MediaRouteVolumeSlider.setTag(Object)>
					mVolumeSlider.setProgress(((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getVolume());
				//   34   74:aload_0         
				//   35   75:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
				//   36   78:aload_1         
				//   37   79:invokevirtual   #116 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
				//   38   82:invokevirtual   #119 <Method void MediaRouteVolumeSlider.setProgress(int)>
					mVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
				//   39   85:aload_0         
				//   40   86:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
				//   41   89:aload_0         
				//   42   90:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//   43   93:getfield        #99  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
				//   44   96:getfield        #123 <Field MediaRouteCastDialog$VolumeChangeListener MediaRouteCastDialog.mVolumeChangeListener>
				//   45   99:invokevirtual   #127 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
				//   46  102:return          
				}

				CheckBox mCheckBox;
				ImageView mImageView;
				TextView mTextView;
				MediaRouteVolumeSlider mVolumeSlider;
				final MediaRouteCastDialog.RecyclerAdapter this$1;

			RouteViewHolder(View view)
			{
				this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #21  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
				mImageView = (ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_route_icon);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:getstatic       #27  <Field int android.support.v7.mediarouter.R$id.mr_cast_route_icon>
			//    9   15:invokevirtual   #33  <Method View View.findViewById(int)>
			//   10   18:checkcast       #35  <Class ImageView>
			//   11   21:putfield        #37  <Field ImageView mImageView>
				mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_route_name);
			//   12   24:aload_0         
			//   13   25:aload_2         
			//   14   26:getstatic       #40  <Field int android.support.v7.mediarouter.R$id.mr_cast_route_name>
			//   15   29:invokevirtual   #33  <Method View View.findViewById(int)>
			//   16   32:checkcast       #42  <Class TextView>
			//   17   35:putfield        #44  <Field TextView mTextView>
				mCheckBox = (CheckBox)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_checkbox);
			//   18   38:aload_0         
			//   19   39:aload_2         
			//   20   40:getstatic       #47  <Field int android.support.v7.mediarouter.R$id.mr_cast_checkbox>
			//   21   43:invokevirtual   #33  <Method View View.findViewById(int)>
			//   22   46:checkcast       #49  <Class CheckBox>
			//   23   49:putfield        #51  <Field CheckBox mCheckBox>
				mVolumeSlider = (MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_volume_slider);
			//   24   52:aload_0         
			//   25   53:aload_2         
			//   26   54:getstatic       #54  <Field int android.support.v7.mediarouter.R$id.mr_cast_volume_slider>
			//   27   57:invokevirtual   #33  <Method View View.findViewById(int)>
			//   28   60:checkcast       #56  <Class MediaRouteVolumeSlider>
			//   29   63:putfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
			//   30   66:return          
			}
			}

			((RouteViewHolder)viewholder).bindRouteViewHolder(item);
	//   20   63:aload_1         
	//   21   64:checkcast       #220 <Class MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder>
	//   22   67:aload           4
	//   23   69:invokevirtual   #223 <Method void MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder.bindRouteViewHolder(MediaRouteCastDialog$RecyclerAdapter$Item)>
			return;
	//   24   72:return          

		case 2: // '\002'
			class HeaderViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
			{

				public void bindHeaderViewHolder(Item item1)
				{
					item1 = ((Item) (item1.getData().toString()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #40  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
				//    2    4:invokevirtual   #46  <Method String Object.toString()>
				//    3    7:astore_1        
					mTextView.setText(((CharSequence) (((String) (item1)).toUpperCase())));
				//    4    8:aload_0         
				//    5    9:getfield        #31  <Field TextView mTextView>
				//    6   12:aload_1         
				//    7   13:invokevirtual   #51  <Method String String.toUpperCase()>
				//    8   16:invokevirtual   #55  <Method void TextView.setText(CharSequence)>
				//    9   19:return          
				}

				TextView mTextView;
				final MediaRouteCastDialog.RecyclerAdapter this$1;

			HeaderViewHolder(View view)
			{
				this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
				mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_dialog_header_name);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:getstatic       #21  <Field int android.support.v7.mediarouter.R$id.mr_dialog_header_name>
			//    9   15:invokevirtual   #27  <Method View View.findViewById(int)>
			//   10   18:checkcast       #29  <Class TextView>
			//   11   21:putfield        #31  <Field TextView mTextView>
			//   12   24:return          
			}
			}

			((HeaderViewHolder)viewholder).bindHeaderViewHolder(item);
	//   25   73:aload_1         
	//   26   74:checkcast       #225 <Class MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder>
	//   27   77:aload           4
	//   28   79:invokevirtual   #228 <Method void MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder.bindHeaderViewHolder(MediaRouteCastDialog$RecyclerAdapter$Item)>
			return;
	//   29   82:return          

		case 1: // '\001'
			class GroupVolumeViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
			{

				public void bindGroupVolumeView(Item item1)
				{
					item1 = ((Item) ((android.support.v7.media.MediaRouter.RouteInfo)item1.getData()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #49  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
				//    2    4:checkcast       #51  <Class android.support.v7.media.MediaRouter$RouteInfo>
				//    3    7:astore_1        
					mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getName().toUpperCase())));
				//    4    8:aload_0         
				//    5    9:getfield        #33  <Field TextView mTextView>
				//    6   12:aload_1         
				//    7   13:invokevirtual   #55  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
				//    8   16:invokevirtual   #60  <Method String String.toUpperCase()>
				//    9   19:invokevirtual   #64  <Method void TextView.setText(CharSequence)>
					mGroupVolumeSlider.setColor(mVolumeSliderColor);
				//   10   22:aload_0         
				//   11   23:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
				//   12   26:aload_0         
				//   13   27:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//   14   30:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
				//   15   33:getfield        #75  <Field int MediaRouteCastDialog.mVolumeSliderColor>
				//   16   36:invokevirtual   #79  <Method void MediaRouteVolumeSlider.setColor(int)>
					mGroupVolumeSlider.setTag(((Object) (item1)));
				//   17   39:aload_0         
				//   18   40:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
				//   19   43:aload_1         
				//   20   44:invokevirtual   #83  <Method void MediaRouteVolumeSlider.setTag(Object)>
					mGroupVolumeSlider.setProgress(mRoute.getVolume());
				//   21   47:aload_0         
				//   22   48:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
				//   23   51:aload_0         
				//   24   52:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//   25   55:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
				//   26   58:getfield        #87  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
				//   27   61:invokevirtual   #91  <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
				//   28   64:invokevirtual   #94  <Method void MediaRouteVolumeSlider.setProgress(int)>
					mGroupVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
				//   29   67:aload_0         
				//   30   68:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
				//   31   71:aload_0         
				//   32   72:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				//   33   75:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
				//   34   78:getfield        #98  <Field MediaRouteCastDialog$VolumeChangeListener MediaRouteCastDialog.mVolumeChangeListener>
				//   35   81:invokevirtual   #102 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
				//   36   84:return          
				}

				MediaRouteVolumeSlider mGroupVolumeSlider;
				TextView mTextView;
				final MediaRouteCastDialog.RecyclerAdapter this$1;

			GroupVolumeViewHolder(View view)
			{
				this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
				mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_group_volume_route_name);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:getstatic       #23  <Field int android.support.v7.mediarouter.R$id.mr_group_volume_route_name>
			//    9   15:invokevirtual   #29  <Method View View.findViewById(int)>
			//   10   18:checkcast       #31  <Class TextView>
			//   11   21:putfield        #33  <Field TextView mTextView>
				mGroupVolumeSlider = (MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_group_volume_slider);
			//   12   24:aload_0         
			//   13   25:aload_2         
			//   14   26:getstatic       #36  <Field int android.support.v7.mediarouter.R$id.mr_group_volume_slider>
			//   15   29:invokevirtual   #29  <Method View View.findViewById(int)>
			//   16   32:checkcast       #38  <Class MediaRouteVolumeSlider>
			//   17   35:putfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
			//   18   38:return          
			}
			}

			((GroupVolumeViewHolder)viewholder).bindGroupVolumeView(item);
	//   30   83:aload_1         
	//   31   84:checkcast       #230 <Class MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder>
	//   32   87:aload           4
	//   33   89:invokevirtual   #233 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder.bindGroupVolumeView(MediaRouteCastDialog$RecyclerAdapter$Item)>
			return;
	//   34   92:return          
		}
	}

	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 105
	//	               2 84
	//	               3 63
	//	               4 42
		default:
			Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
	//    2   32:ldc1            #17  <String "RecyclerAdapter">
	//    3   34:ldc1            #237 <String "Cannot create ViewHolder because of wrong view type">
	//    4   36:invokestatic    #212 <Method int Log.w(String, String)>
	//    5   39:pop             
			return null;
	//    6   40:aconst_null     
	//    7   41:areturn         

		case 4: // '\004'
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (new GroupViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_cast_group_item, viewgroup, false))));
	//    8   42:new             #214 <Class MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder>
	//    9   45:dup             
	//   10   46:aload_0         
	//   11   47:aload_0         
	//   12   48:getfield        #60  <Field LayoutInflater mInflater>
	//   13   51:getstatic       #242 <Field int android.support.v7.mediarouter.R$layout.mr_cast_group_item>
	//   14   54:aload_1         
	//   15   55:iconst_0        
	//   16   56:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   17   59:invokespecial   #249 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
	//   18   62:areturn         

		case 3: // '\003'
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (new RouteViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_cast_route_item, viewgroup, false))));
	//   19   63:new             #220 <Class MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder>
	//   20   66:dup             
	//   21   67:aload_0         
	//   22   68:aload_0         
	//   23   69:getfield        #60  <Field LayoutInflater mInflater>
	//   24   72:getstatic       #252 <Field int android.support.v7.mediarouter.R$layout.mr_cast_route_item>
	//   25   75:aload_1         
	//   26   76:iconst_0        
	//   27   77:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   28   80:invokespecial   #253 <Method void MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
	//   29   83:areturn         

		case 2: // '\002'
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (new HeaderViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_dialog_header_item, viewgroup, false))));
	//   30   84:new             #225 <Class MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder>
	//   31   87:dup             
	//   32   88:aload_0         
	//   33   89:aload_0         
	//   34   90:getfield        #60  <Field LayoutInflater mInflater>
	//   35   93:getstatic       #256 <Field int android.support.v7.mediarouter.R$layout.mr_dialog_header_item>
	//   36   96:aload_1         
	//   37   97:iconst_0        
	//   38   98:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   39  101:invokespecial   #257 <Method void MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
	//   40  104:areturn         

		case 1: // '\001'
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (new GroupVolumeViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_cast_group_volume_item, viewgroup, false))));
	//   41  105:new             #230 <Class MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder>
	//   42  108:dup             
	//   43  109:aload_0         
	//   44  110:aload_0         
	//   45  111:getfield        #60  <Field LayoutInflater mInflater>
	//   46  114:getstatic       #260 <Field int android.support.v7.mediarouter.R$layout.mr_cast_group_volume_item>
	//   47  117:aload_1         
	//   48  118:iconst_0        
	//   49  119:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   50  122:invokespecial   #261 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
	//   51  125:areturn         
		}
	}

	void setItems()
	{
		mItems.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mItems>
	//    2    4:invokevirtual   #264 <Method void ArrayList.clear()>
		if(mRoute instanceof android.support.v7.media.MediaRouter.RouteGroup)
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field MediaRouteCastDialog this$0>
	//*   5   11:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//*   6   14:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
	//*   7   17:ifeq            103
		{
			mItems.add(((Object) (new Item(((Object) (mRoute)), 1))));
	//    8   20:aload_0         
	//    9   21:getfield        #42  <Field ArrayList mItems>
	//   10   24:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #34  <Field MediaRouteCastDialog this$0>
	//   15   33:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//   16   36:iconst_1        
	//   17   37:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
	//   18   40:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//   19   43:pop             
			android.support.v7.media.MediaRouter.RouteInfo routeinfo;
			for(Iterator iterator = ((android.support.v7.media.MediaRouter.RouteGroup)mRoute).getRoutes().iterator(); iterator.hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo)), 3)))))
	//*  20   44:aload_0         
	//*  21   45:getfield        #34  <Field MediaRouteCastDialog this$0>
	//*  22   48:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//*  23   51:checkcast       #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
	//*  24   54:invokevirtual   #177 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
	//*  25   57:invokeinterface #183 <Method Iterator List.iterator()>
	//*  26   62:astore_1        
	//*  27   63:aload_1         
	//*  28   64:invokeinterface #188 <Method boolean Iterator.hasNext()>
	//*  29   69:ifeq            127
				routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)iterator.next();
	//   30   72:aload_1         
	//   31   73:invokeinterface #192 <Method Object Iterator.next()>
	//   32   78:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   33   81:astore_2        

	//   34   82:aload_0         
	//   35   83:getfield        #42  <Field ArrayList mItems>
	//   36   86:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//   37   89:dup             
	//   38   90:aload_0         
	//   39   91:aload_2         
	//   40   92:iconst_3        
	//   41   93:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
	//   42   96:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//   43   99:pop             
		} else
	//*  44  100:goto            63
		{
			mItems.add(((Object) (new Item(((Object) (mRoute)), 3))));
	//   45  103:aload_0         
	//   46  104:getfield        #42  <Field ArrayList mItems>
	//   47  107:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//   48  110:dup             
	//   49  111:aload_0         
	//   50  112:aload_0         
	//   51  113:getfield        #34  <Field MediaRouteCastDialog this$0>
	//   52  116:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//   53  119:iconst_3        
	//   54  120:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
	//   55  123:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//   56  126:pop             
		}
		mAvailableRoutes.clear();
	//   57  127:aload_0         
	//   58  128:getfield        #44  <Field ArrayList mAvailableRoutes>
	//   59  131:invokevirtual   #264 <Method void ArrayList.clear()>
		mAvailableGroups.clear();
	//   60  134:aload_0         
	//   61  135:getfield        #46  <Field ArrayList mAvailableGroups>
	//   62  138:invokevirtual   #264 <Method void ArrayList.clear()>
		Iterator iterator1 = mRoutes.iterator();
	//   63  141:aload_0         
	//   64  142:getfield        #34  <Field MediaRouteCastDialog this$0>
	//   65  145:getfield        #274 <Field List MediaRouteCastDialog.mRoutes>
	//   66  148:invokeinterface #183 <Method Iterator List.iterator()>
	//   67  153:astore_1        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   68  154:aload_1         
	//   69  155:invokeinterface #188 <Method boolean Iterator.hasNext()>
	//   70  160:ifeq            215
			android.support.v7.media.MediaRouter.RouteInfo routeinfo1 = (android.support.v7.media.MediaRouter.RouteInfo)iterator1.next();
	//   71  163:aload_1         
	//   72  164:invokeinterface #192 <Method Object Iterator.next()>
	//   73  169:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   74  172:astore_2        
			if(!isSelectedRoute(routeinfo1))
	//*  75  173:aload_0         
	//*  76  174:aload_2         
	//*  77  175:invokevirtual   #276 <Method boolean isSelectedRoute(android.support.v7.media.MediaRouter$RouteInfo)>
	//*  78  178:ifeq            184
	//*  79  181:goto            154
				if(routeinfo1 instanceof android.support.v7.media.MediaRouter.RouteGroup)
	//*  80  184:aload_2         
	//*  81  185:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
	//*  82  188:ifeq            203
					mAvailableGroups.add(((Object) (routeinfo1)));
	//   83  191:aload_0         
	//   84  192:getfield        #46  <Field ArrayList mAvailableGroups>
	//   85  195:aload_2         
	//   86  196:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//   87  199:pop             
				else
	//*  88  200:goto            154
					mAvailableRoutes.add(((Object) (routeinfo1)));
	//   89  203:aload_0         
	//   90  204:getfield        #44  <Field ArrayList mAvailableRoutes>
	//   91  207:aload_2         
	//   92  208:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//   93  211:pop             
		} while(true);
	//   94  212:goto            154
		if(mAvailableRoutes.size() > 0)
	//*  95  215:aload_0         
	//*  96  216:getfield        #44  <Field ArrayList mAvailableRoutes>
	//*  97  219:invokevirtual   #158 <Method int ArrayList.size()>
	//*  98  222:ifle            303
		{
			mItems.add(((Object) (new Item(((Object) (mContext.getString(android.support.v7.mediarouter.R.string.mr_dialog_device_header))), 2))));
	//   99  225:aload_0         
	//  100  226:getfield        #42  <Field ArrayList mItems>
	//  101  229:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//  102  232:dup             
	//  103  233:aload_0         
	//  104  234:aload_0         
	//  105  235:getfield        #34  <Field MediaRouteCastDialog this$0>
	//  106  238:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//  107  241:getstatic       #281 <Field int android.support.v7.mediarouter.R$string.mr_dialog_device_header>
	//  108  244:invokevirtual   #285 <Method String Context.getString(int)>
	//  109  247:iconst_2        
	//  110  248:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
	//  111  251:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//  112  254:pop             
			android.support.v7.media.MediaRouter.RouteInfo routeinfo2;
			for(Iterator iterator2 = mAvailableRoutes.iterator(); iterator2.hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo2)), 3)))))
	//* 113  255:aload_0         
	//* 114  256:getfield        #44  <Field ArrayList mAvailableRoutes>
	//* 115  259:invokevirtual   #286 <Method Iterator ArrayList.iterator()>
	//* 116  262:astore_1        
	//* 117  263:aload_1         
	//* 118  264:invokeinterface #188 <Method boolean Iterator.hasNext()>
	//* 119  269:ifeq            303
				routeinfo2 = (android.support.v7.media.MediaRouter.RouteInfo)iterator2.next();
	//  120  272:aload_1         
	//  121  273:invokeinterface #192 <Method Object Iterator.next()>
	//  122  278:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//  123  281:astore_2        

	//  124  282:aload_0         
	//  125  283:getfield        #42  <Field ArrayList mItems>
	//  126  286:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//  127  289:dup             
	//  128  290:aload_0         
	//  129  291:aload_2         
	//  130  292:iconst_3        
	//  131  293:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
	//  132  296:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//  133  299:pop             
		}
	//* 134  300:goto            263
		if(mAvailableGroups.size() > 0)
	//* 135  303:aload_0         
	//* 136  304:getfield        #46  <Field ArrayList mAvailableGroups>
	//* 137  307:invokevirtual   #158 <Method int ArrayList.size()>
	//* 138  310:ifle            391
		{
			mItems.add(((Object) (new Item(((Object) (mContext.getString(android.support.v7.mediarouter.R.string.mr_dialog_route_header))), 2))));
	//  139  313:aload_0         
	//  140  314:getfield        #42  <Field ArrayList mItems>
	//  141  317:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//  142  320:dup             
	//  143  321:aload_0         
	//  144  322:aload_0         
	//  145  323:getfield        #34  <Field MediaRouteCastDialog this$0>
	//  146  326:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//  147  329:getstatic       #289 <Field int android.support.v7.mediarouter.R$string.mr_dialog_route_header>
	//  148  332:invokevirtual   #285 <Method String Context.getString(int)>
	//  149  335:iconst_2        
	//  150  336:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
	//  151  339:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//  152  342:pop             
			android.support.v7.media.MediaRouter.RouteInfo routeinfo3;
			for(Iterator iterator3 = mAvailableGroups.iterator(); iterator3.hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo3)), 4)))))
	//* 153  343:aload_0         
	//* 154  344:getfield        #46  <Field ArrayList mAvailableGroups>
	//* 155  347:invokevirtual   #286 <Method Iterator ArrayList.iterator()>
	//* 156  350:astore_1        
	//* 157  351:aload_1         
	//* 158  352:invokeinterface #188 <Method boolean Iterator.hasNext()>
	//* 159  357:ifeq            391
				routeinfo3 = (android.support.v7.media.MediaRouter.RouteInfo)iterator3.next();
	//  160  360:aload_1         
	//  161  361:invokeinterface #192 <Method Object Iterator.next()>
	//  162  366:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//  163  369:astore_2        

	//  164  370:aload_0         
	//  165  371:getfield        #42  <Field ArrayList mItems>
	//  166  374:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
	//  167  377:dup             
	//  168  378:aload_0         
	//  169  379:aload_2         
	//  170  380:iconst_4        
	//  171  381:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
	//  172  384:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
	//  173  387:pop             
		}
	//* 174  388:goto            351
		notifyDataSetChanged();
	//  175  391:aload_0         
	//  176  392:invokevirtual   #292 <Method void notifyDataSetChanged()>
	//  177  395:return          
	}

	private static final int ITEM_TYPE_GROUP = 4;
	private static final int ITEM_TYPE_GROUP_VOLUME = 1;
	private static final int ITEM_TYPE_HEADER = 2;
	private static final int ITEM_TYPE_ROUTE = 3;
	private static final String TAG = "RecyclerAdapter";
	private final ArrayList mAvailableGroups = new ArrayList();
	private final ArrayList mAvailableRoutes = new ArrayList();
	private final Drawable mDefaultIcon;
	private final LayoutInflater mInflater;
	private final ArrayList mItems = new ArrayList();
	private final Drawable mSpeakerGroupIcon;
	private final Drawable mSpeakerIcon;
	private final Drawable mTvIcon;
	final MediaRouteCastDialog this$0;

	MediaRouteCastDialog$RecyclerAdapter()
	{
		this$0 = MediaRouteCastDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field MediaRouteCastDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #37  <Method void android.support.v7.widget.RecyclerView$Adapter()>
	//    5    9:aload_0         
	//    6   10:new             #39  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void ArrayList()>
	//    9   17:putfield        #42  <Field ArrayList mItems>
	//   10   20:aload_0         
	//   11   21:new             #39  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #40  <Method void ArrayList()>
	//   14   28:putfield        #44  <Field ArrayList mAvailableRoutes>
	//   15   31:aload_0         
	//   16   32:new             #39  <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #40  <Method void ArrayList()>
	//   19   39:putfield        #46  <Field ArrayList mAvailableGroups>
		mInflater = LayoutInflater.from(mContext);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//   23   47:invokestatic    #58  <Method LayoutInflater LayoutInflater.from(Context)>
	//   24   50:putfield        #60  <Field LayoutInflater mInflater>
		mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(mContext);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//   28   58:invokestatic    #66  <Method Drawable MediaRouterThemeHelper.getDefaultDrawableIcon(Context)>
	//   29   61:putfield        #68  <Field Drawable mDefaultIcon>
		mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(mContext);
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//   33   69:invokestatic    #71  <Method Drawable MediaRouterThemeHelper.getTvDrawableIcon(Context)>
	//   34   72:putfield        #73  <Field Drawable mTvIcon>
		mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(mContext);
	//   35   75:aload_0         
	//   36   76:aload_1         
	//   37   77:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//   38   80:invokestatic    #76  <Method Drawable MediaRouterThemeHelper.getSpeakerDrawableIcon(Context)>
	//   39   83:putfield        #78  <Field Drawable mSpeakerIcon>
		mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGropuIcon(mContext);
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
	//   43   91:invokestatic    #81  <Method Drawable MediaRouterThemeHelper.getSpeakerGropuIcon(Context)>
	//   44   94:putfield        #83  <Field Drawable mSpeakerGroupIcon>
		setItems();
	//   45   97:aload_0         
	//   46   98:invokevirtual   #86  <Method void setItems()>
	//   47  101:return          
	}
}
