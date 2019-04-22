// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

public class Scene
{

	static Scene getCurrentScene(View view)
	{
		return (Scene)view.getTag(R.id.transition_current_scene);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field int R$id.transition_current_scene>
	//    2    4:invokevirtual   #22  <Method Object View.getTag(int)>
	//    3    7:checkcast       #2   <Class Scene>
	//    4   10:areturn         
	}

	static void setCurrentScene(View view, Scene scene)
	{
		view.setTag(R.id.transition_current_scene, ((Object) (scene)));
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field int R$id.transition_current_scene>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method void View.setTag(int, Object)>
	//    4    8:return          
	}

	public void exit()
	{
		if(getCurrentScene(((View) (mSceneRoot))) == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field ViewGroup mSceneRoot>
	//*   2    4:invokestatic    #35  <Method Scene getCurrentScene(View)>
	//*   3    7:aload_0         
	//*   4    8:if_acmpne       26
		{
			Runnable runnable = mExitAction;
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field Runnable mExitAction>
	//    7   15:astore_1        
			if(runnable != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          26
				runnable.run();
	//   10   20:aload_1         
	//   11   21:invokeinterface #42  <Method void Runnable.run()>
		}
	//   12   26:return          
	}

	private Runnable mExitAction;
	private ViewGroup mSceneRoot;
}
