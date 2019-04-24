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
		SparseArray sparsearray = (SparseArray)viewgroup.getTag(R.id.transition_scene_layoutid_cache);
	//    0    0:aload_0         
	//    1    1:getstatic       #52  <Field int R$id.transition_scene_layoutid_cache>
	//    2    4:invokevirtual   #55  <Method Object ViewGroup.getTag(int)>
	//    3    7:checkcast       #57  <Class SparseArray>
	//    4   10:astore_3        
		if(sparsearray == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       68
		{
			sparsearray = new SparseArray();
	//    7   15:new             #57  <Class SparseArray>
	//    8   18:dup             
	//    9   19:invokespecial   #58  <Method void SparseArray()>
	//   10   22:astore_3        
			viewgroup.setTag(R.id.transition_scene_layoutid_cache, ((Object) (sparsearray)));
	//   11   23:aload_0         
	//   12   24:getstatic       #52  <Field int R$id.transition_scene_layoutid_cache>
	//   13   27:aload_3         
	//   14   28:invokevirtual   #62  <Method void ViewGroup.setTag(int, Object)>
		}
		Scene scene = (Scene)sparsearray.get(i);
	//   15   31:aload_3         
	//   16   32:iload_1         
	//   17   33:invokevirtual   #65  <Method Object SparseArray.get(int)>
	//   18   36:checkcast       #2   <Class Scene>
	//   19   39:astore          4
		if(scene != null)
	//*  20   41:aload           4
	//*  21   43:ifnull          49
		{
			return scene;
	//   22   46:aload           4
	//   23   48:areturn         
		} else
		{
			viewgroup = ((ViewGroup) (new Scene(viewgroup, i, context)));
	//   24   49:new             #2   <Class Scene>
	//   25   52:dup             
	//   26   53:aload_0         
	//   27   54:iload_1         
	//   28   55:aload_2         
	//   29   56:invokespecial   #67  <Method void Scene(ViewGroup, int, Context)>
	//   30   59:astore_0        
			sparsearray.put(i, ((Object) (viewgroup)));
	//   31   60:aload_3         
	//   32   61:iload_1         
	//   33   62:aload_0         
	//   34   63:invokevirtual   #70  <Method void SparseArray.put(int, Object)>
			return ((Scene) (viewgroup));
	//   35   66:aload_0         
	//   36   67:areturn         
		}
	//*  37   68:goto            31
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
	//*   5   11:ifnull          47
		{
			getSceneRoot().removeAllViews();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #79  <Method ViewGroup getSceneRoot()>
	//    8   18:invokevirtual   #82  <Method void ViewGroup.removeAllViews()>
			if(mLayoutId > 0)
	//*   9   21:aload_0         
	//*  10   22:getfield        #23  <Field int mLayoutId>
	//*  11   25:ifle            72
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
	//*  21   47:aload_0         
	//*  22   48:getfield        #94  <Field Runnable mEnterAction>
	//*  23   51:ifnull          63
	//*  24   54:aload_0         
	//*  25   55:getfield        #94  <Field Runnable mEnterAction>
	//*  26   58:invokeinterface #99  <Method void Runnable.run()>
	//*  27   63:aload_0         
	//*  28   64:getfield        #25  <Field ViewGroup mSceneRoot>
	//*  29   67:aload_0         
	//*  30   68:invokestatic    #101 <Method void setCurrentScene(View, Scene)>
	//*  31   71:return          
				mSceneRoot.addView(mLayout);
	//   32   72:aload_0         
	//   33   73:getfield        #25  <Field ViewGroup mSceneRoot>
	//   34   76:aload_0         
	//   35   77:getfield        #33  <Field View mLayout>
	//   36   80:invokevirtual   #105 <Method void ViewGroup.addView(View)>
		}
		if(mEnterAction != null)
			mEnterAction.run();
		setCurrentScene(((View) (mSceneRoot)), this);
	//*  37   83:goto            47
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
	//   10   22:invokeinterface #99  <Method void Runnable.run()>
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
	//    2    2:putfield        #94  <Field Runnable mEnterAction>
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
