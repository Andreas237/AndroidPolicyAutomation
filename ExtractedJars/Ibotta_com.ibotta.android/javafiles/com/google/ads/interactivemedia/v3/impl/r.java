// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.ArrayList;
import java.util.List;

public class r
	implements CompanionAdSlot
{

	public r()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #25  <Method void ArrayList(int)>
	//    7   13:putfield        #27  <Field List e>
	//    8   16:return          
	}

	public List a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List e>
	//    2    4:areturn         
	}

	public void a(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String d>
	//    3    5:return          
	}

	public void addClickListener(com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener clicklistener)
	{
		e.add(((Object) (clicklistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List e>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public ViewGroup getContainer()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ViewGroup c>
	//    2    4:areturn         
	}

	public int getHeight()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int b>
	//    2    4:ireturn         
	}

	public int getWidth()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int a>
	//    2    4:ireturn         
	}

	public boolean isFilled()
	{
		return c.findViewWithTag(((Object) (d))) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ViewGroup c>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field String d>
	//    4    8:invokevirtual   #61  <Method android.view.View ViewGroup.findViewWithTag(Object)>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void removeClickListener(com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener clicklistener)
	{
		e.remove(((Object) (clicklistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List e>
	//    2    4:aload_1         
	//    3    5:invokeinterface #65  <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void setContainer(ViewGroup viewgroup)
	{
		c = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field ViewGroup c>
	//    3    5:return          
	}

	public void setSize(int i, int j)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int a>
		b = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #50  <Field int b>
	//    6   10:return          
	}

	private int a;
	private int b;
	private ViewGroup c;
	private String d;
	private final List e = new ArrayList(1);
}
