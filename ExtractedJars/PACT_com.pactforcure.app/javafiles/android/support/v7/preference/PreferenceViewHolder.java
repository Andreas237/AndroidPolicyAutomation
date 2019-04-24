// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.util.SparseArray;
import android.view.View;

public class PreferenceViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	PreferenceViewHolder(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class SparseArray>
	//    5    9:dup             
	//    6   10:iconst_4        
	//    7   11:invokespecial   #19  <Method void SparseArray(int)>
	//    8   14:putfield        #21  <Field SparseArray mCachedViews>
		mCachedViews.put(0x1020016, ((Object) (view.findViewById(0x1020016))));
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field SparseArray mCachedViews>
	//   11   21:ldc1            #22  <Int 0x1020016>
	//   12   23:aload_1         
	//   13   24:ldc1            #22  <Int 0x1020016>
	//   14   26:invokevirtual   #28  <Method View View.findViewById(int)>
	//   15   29:invokevirtual   #32  <Method void SparseArray.put(int, Object)>
		mCachedViews.put(0x1020010, ((Object) (view.findViewById(0x1020010))));
	//   16   32:aload_0         
	//   17   33:getfield        #21  <Field SparseArray mCachedViews>
	//   18   36:ldc1            #33  <Int 0x1020010>
	//   19   38:aload_1         
	//   20   39:ldc1            #33  <Int 0x1020010>
	//   21   41:invokevirtual   #28  <Method View View.findViewById(int)>
	//   22   44:invokevirtual   #32  <Method void SparseArray.put(int, Object)>
		mCachedViews.put(0x1020006, ((Object) (view.findViewById(0x1020006))));
	//   23   47:aload_0         
	//   24   48:getfield        #21  <Field SparseArray mCachedViews>
	//   25   51:ldc1            #34  <Int 0x1020006>
	//   26   53:aload_1         
	//   27   54:ldc1            #34  <Int 0x1020006>
	//   28   56:invokevirtual   #28  <Method View View.findViewById(int)>
	//   29   59:invokevirtual   #32  <Method void SparseArray.put(int, Object)>
		mCachedViews.put(R.id.icon_frame, ((Object) (view.findViewById(R.id.icon_frame))));
	//   30   62:aload_0         
	//   31   63:getfield        #21  <Field SparseArray mCachedViews>
	//   32   66:getstatic       #40  <Field int R$id.icon_frame>
	//   33   69:aload_1         
	//   34   70:getstatic       #40  <Field int R$id.icon_frame>
	//   35   73:invokevirtual   #28  <Method View View.findViewById(int)>
	//   36   76:invokevirtual   #32  <Method void SparseArray.put(int, Object)>
		mCachedViews.put(0x102003e, ((Object) (view.findViewById(0x102003e))));
	//   37   79:aload_0         
	//   38   80:getfield        #21  <Field SparseArray mCachedViews>
	//   39   83:ldc1            #41  <Int 0x102003e>
	//   40   85:aload_1         
	//   41   86:ldc1            #41  <Int 0x102003e>
	//   42   88:invokevirtual   #28  <Method View View.findViewById(int)>
	//   43   91:invokevirtual   #32  <Method void SparseArray.put(int, Object)>
	//   44   94:return          
	}

	public View findViewById(int i)
	{
		View view = (View)mCachedViews.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SparseArray mCachedViews>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #47  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #24  <Class View>
	//    5   11:astore_2        
		if(view != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          18
			return view;
	//    8   16:aload_2         
	//    9   17:areturn         
		view = itemView.findViewById(i);
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field View itemView>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #28  <Method View View.findViewById(int)>
	//   14   26:astore_2        
		if(view != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          40
			mCachedViews.put(i, ((Object) (view)));
	//   17   31:aload_0         
	//   18   32:getfield        #21  <Field SparseArray mCachedViews>
	//   19   35:iload_1         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #32  <Method void SparseArray.put(int, Object)>
		return view;
	//   22   40:aload_2         
	//   23   41:areturn         
	}

	public boolean isDividerAllowedAbove()
	{
		return mDividerAllowedAbove;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean mDividerAllowedAbove>
	//    2    4:ireturn         
	}

	public boolean isDividerAllowedBelow()
	{
		return mDividerAllowedBelow;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean mDividerAllowedBelow>
	//    2    4:ireturn         
	}

	public void setDividerAllowedAbove(boolean flag)
	{
		mDividerAllowedAbove = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field boolean mDividerAllowedAbove>
	//    3    5:return          
	}

	public void setDividerAllowedBelow(boolean flag)
	{
		mDividerAllowedBelow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean mDividerAllowedBelow>
	//    3    5:return          
	}

	private final SparseArray mCachedViews = new SparseArray(4);
	private boolean mDividerAllowedAbove;
	private boolean mDividerAllowedBelow;
}
