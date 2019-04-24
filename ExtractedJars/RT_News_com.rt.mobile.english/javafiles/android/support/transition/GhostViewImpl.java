// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

interface GhostViewImpl
{
	public static interface Creator
	{

		public abstract GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix);

		public abstract void removeGhost(View view);
	}


	public abstract void reserveEndViewTransition(ViewGroup viewgroup, View view);

	public abstract void setVisibility(int i);
}
