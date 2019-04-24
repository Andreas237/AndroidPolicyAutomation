// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.*;

public class Scene
{

	public Scene(ViewGroup viewgroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mLayoutId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #23  <Field int mLayoutId>
		mSceneRoot = viewgroup;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field ViewGroup mSceneRoot>
	//    8   14:return          
	}

	private Scene(ViewGroup viewgroup, int i, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mLayoutId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #23  <Field int mLayoutId>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #30  <Field Context mContext>
		mSceneRoot = viewgroup;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #25  <Field ViewGroup mSceneRoot>
		mLayoutId = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #23  <Field int mLayoutId>
	//   14   24:return          
	}

	public Scene(ViewGroup viewgroup, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mLayoutId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #23  <Field int mLayoutId>
		mSceneRoot = viewgroup;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field ViewGroup mSceneRoot>
		mLayout = view;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #33  <Field View mLayout>
	//   11   19:return          
	}

	static Scene getCurrentScene(View view)
	{
		return (Scene)view.getTag(R.id.transition_current_scene);
	//    0    0:aload_0         
	//    1    1:getstatic       #40  <Field int R$id.transition_current_scene>
	//    2    4:invokevirtual   #46  <Method Object View.getTag(int)>
	//    3    7:checkcast       #2   <Class Scene>
	//    4   10:areturn         
	}

	public static Scene getSceneForLayout(ViewGroup viewgroup, int i, Context context)
	{
		Object obj = ((Object) ((SparseArray)viewgroup.getTag(R.id.transition_scene_layoutid_cache)));
	//    0    0:aload_0         
	//    1    1:getstatic       #52  <Field int R$id.transition_scene_layoutid_cache>
	//    2    4:invokevirtual   #55  <Method Object ViewGroup.getTag(int)>
	//    3    7:checkcast       #57  <Class SparseArray>
	//    4   10:astore          4
		SparseArray sparsearray = ((SparseArray) (obj));
	//    5   12:aload           4
	//    6   14:astore_3        
		if(obj == null)
	//*   7   15:aload           4
	//*   8   17:ifnonnull       36
		{
			sparsearray = new SparseArray();
	//    9   20:new             #57  <Class SparseArray>
	//   10   23:dup             
	//   11   24:invokespecial   #58  <Method void SparseArray()>
	//   12   27:astore_3        
			viewgroup.setTag(R.id.transition_scene_layoutid_cache, ((Object) (sparsearray)));
	//   13   28:aload_0         
	//   14   29:getstatic       #52  <Field int R$id.transition_scene_layoutid_cache>
	//   15   32:aload_3         
	//   16   33:invokevirtual   #62  <Method void ViewGroup.setTag(int, Object)>
		}
		obj = ((Object) ((Scene)sparsearray.get(i)));
	//   17   36:aload_3         
	//   18   37:iload_1         
	//   19   38:invokevirtual   #65  <Method Object SparseArray.get(int)>
	//   20   41:checkcast       #2   <Class Scene>
	//   21   44:astore          4
		if(obj != null)
	//*  22   46:aload           4
	//*  23   48:ifnull          54
		{
			return ((Scene) (obj));
	//   24   51:aload           4
	//   25   53:areturn         
		} else
		{
			viewgroup = ((ViewGroup) (new Scene(viewgroup, i, context)));
	//   26   54:new             #2   <Class Scene>
	//   27   57:dup             
	//   28   58:aload_0         
	//   29   59:iload_1         
	//   30   60:aload_2         
	//   31   61:invokespecial   #67  <Method void Scene(ViewGroup, int, Context)>
	//   32   64:astore_0        
			sparsearray.put(i, ((Object) (viewgroup)));
	//   33   65:aload_3         
	//   34   66:iload_1         
	//   35   67:aload_0         
	//   36   68:invokevirtual   #70  <Method void SparseArray.put(int, Object)>
			return ((Scene) (viewgroup));
	//   37   71:aload_0         
	//   38   72:areturn         
		}
	}

	static void setCurrentScene(View view, Scene scene)
	{
		view.setTag(R.id.transition_current_scene, ((Object) (scene)));
	//    0    0:aload_0         
	//    1    1:getstatic       #40  <Field int R$id.transition_current_scene>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method void View.setTag(int, Object)>
	//    4    8:return          
	}

	public void enter()
	{
		if(mLayoutId > 0 || mLayout != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int mLayoutId>
	//*   2    4:ifgt            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field View mLayout>
	//*   5   11:ifnull          61
		{
			getSceneRoot().removeAllViews();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #79  <Method ViewGroup getSceneRoot()>
	//    8   18:invokevirtual   #82  <Method void ViewGroup.removeAllViews()>
			if(mLayoutId > 0)
	//*   9   21:aload_0         
	//*  10   22:getfield        #23  <Field int mLayoutId>
	//*  11   25:ifle            50
				LayoutInflater.from(mContext).inflate(mLayoutId, mSceneRoot);
	//   12   28:aload_0         
	//   13   29:getfield        #30  <Field Context mContext>
	//   14   32:invokestatic    #88  <Method LayoutInflater LayoutInflater.from(Context)>
	//   15   35:aload_0         
	//   16   36:getfield        #23  <Field int mLayoutId>
	//   17   39:aload_0         
	//   18   40:getfield        #25  <Field ViewGroup mSceneRoot>
	//   19   43:invokevirtual   #92  <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   20   46:pop             
			else
	//*  21   47:goto            61
				mSceneRoot.addView(mLayout);
	//   22   50:aload_0         
	//   23   51:getfield        #25  <Field ViewGroup mSceneRoot>
	//   24   54:aload_0         
	//   25   55:getfield        #33  <Field View mLayout>
	//   26   58:invokevirtual   #96  <Method void ViewGroup.addView(View)>
		}
		if(mEnterAction != null)
	//*  27   61:aload_0         
	//*  28   62:getfield        #98  <Field Runnable mEnterAction>
	//*  29   65:ifnull          77
			mEnterAction.run();
	//   30   68:aload_0         
	//   31   69:getfield        #98  <Field Runnable mEnterAction>
	//   32   72:invokeinterface #103 <Method void Runnable.run()>
		setCurrentScene(((View) (mSceneRoot)), this);
	//   33   77:aload_0         
	//   34   78:getfield        #25  <Field ViewGroup mSceneRoot>
	//   35   81:aload_0         
	//   36   82:invokestatic    #105 <Method void setCurrentScene(View, Scene)>
	//   37   85:return          
	}

	public void exit()
	{
		if(getCurrentScene(((View) (mSceneRoot))) == this && mExitAction != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field ViewGroup mSceneRoot>
	//*   2    4:invokestatic    #108 <Method Scene getCurrentScene(View)>
	//*   3    7:aload_0         
	//*   4    8:if_acmpne       27
	//*   5   11:aload_0         
	//*   6   12:getfield        #110 <Field Runnable mExitAction>
	//*   7   15:ifnull          27
			mExitAction.run();
	//    8   18:aload_0         
	//    9   19:getfield        #110 <Field Runnable mExitAction>
	//   10   22:invokeinterface #103 <Method void Runnable.run()>
	//   11   27:return          
	}

	public ViewGroup getSceneRoot()
	{
		return mSceneRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroup mSceneRoot>
	//    2    4:areturn         
	}

	boolean isCreatedFromLayoutResource()
	{
		return mLayoutId > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mLayoutId>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setEnterAction(Runnable runnable)
	{
		mEnterAction = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field Runnable mEnterAction>
	//    3    5:return          
	}

	public void setExitAction(Runnable runnable)
	{
		mExitAction = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field Runnable mExitAction>
	//    3    5:return          
	}

	private Context mContext;
	private Runnable mEnterAction;
	private Runnable mExitAction;
	private View mLayout;
	private int mLayoutId;
	private ViewGroup mSceneRoot;
}
