// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public interface LayoutInflaterFactory
{

	public abstract View onCreateView(View view, String s, Context context, AttributeSet attributeset);
}
