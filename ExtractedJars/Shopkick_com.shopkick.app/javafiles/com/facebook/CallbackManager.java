// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

public interface CallbackManager
{
	public static class Factory
	{

		public static CallbackManager create()
		{
			return ((CallbackManager) (new CallbackManagerImpl()));
		//    0    0:new             #16  <Class CallbackManagerImpl>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void CallbackManagerImpl()>
		//    3    7:areturn         
		}

		public Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract boolean onActivityResult(int i, int j, Intent intent);
}
