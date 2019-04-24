// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import com.jakewharton.rxbinding.view.ViewEvent;

public abstract class SeekBarChangeEvent extends ViewEvent
{

	SeekBarChangeEvent(SeekBar seekbar)
	{
		super(((android.view.View) (seekbar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ViewEvent(android.view.View)>
	//    3    5:return          
	}
}
