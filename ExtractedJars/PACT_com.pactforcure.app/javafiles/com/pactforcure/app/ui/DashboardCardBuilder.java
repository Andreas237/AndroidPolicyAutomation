// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.view.*;
import android.widget.TextView;
import com.pactforcure.app.core.BackboneApplication;

public class DashboardCardBuilder
{

	public DashboardCardBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public View buildCard(ViewGroup viewgroup)
	{
		BackboneApplication backboneapplication;
		TextView textview;
		backboneapplication = BackboneApplication.get();
	//    0    0:invokestatic    #23  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore_3        
		viewgroup = ((ViewGroup) ((CardView)LayoutInflater.from(((android.content.Context) (backboneapplication))).inflate(0x7f040086, viewgroup, false)));
	//    2    4:aload_3         
	//    3    5:invokestatic    #29  <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    4    8:ldc1            #30  <Int 0x7f040086>
	//    5   10:aload_1         
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #34  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    8   15:checkcast       #36  <Class CardView>
	//    9   18:astore_1        
		textview = (TextView)((CardView) (viewgroup)).findViewById(0x7f0e014a);
	//   10   19:aload_1         
	//   11   20:ldc1            #37  <Int 0x7f0e014a>
	//   12   22:invokevirtual   #41  <Method View CardView.findViewById(int)>
	//   13   25:checkcast       #43  <Class TextView>
	//   14   28:astore          4
		textview.setText(((CharSequence) (label)));
	//   15   30:aload           4
	//   16   32:aload_0         
	//   17   33:getfield        #45  <Field String label>
	//   18   36:invokevirtual   #49  <Method void TextView.setText(CharSequence)>
		if(!withAttentionCircle) goto _L2; else goto _L1
	//   19   39:aload_0         
	//   20   40:getfield        #51  <Field boolean withAttentionCircle>
	//   21   43:ifeq            72
_L1:
		textview.setCompoundDrawablesWithIntrinsicBounds(backboneapplication.getResources().getDrawable(0x7f020053), ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   22   46:aload           4
	//   23   48:aload_3         
	//   24   49:invokevirtual   #55  <Method Resources BackboneApplication.getResources()>
	//   25   52:ldc1            #56  <Int 0x7f020053>
	//   26   54:invokevirtual   #62  <Method Drawable Resources.getDrawable(int)>
	//   27   57:aconst_null     
	//   28   58:aconst_null     
	//   29   59:aconst_null     
	//   30   60:invokevirtual   #66  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
_L4:
		((CardView) (viewgroup)).setId(View.generateViewId());
	//   31   63:aload_1         
	//   32   64:invokestatic    #72  <Method int View.generateViewId()>
	//   33   67:invokevirtual   #76  <Method void CardView.setId(int)>
		return ((View) (viewgroup));
	//   34   70:aload_1         
	//   35   71:areturn         
_L2:
		if(completed)
	//*  36   72:aload_0         
	//*  37   73:getfield        #78  <Field boolean completed>
	//*  38   76:ifeq            63
		{
			Drawable drawable = backboneapplication.getResources().getDrawable(0x7f02007d);
	//   39   79:aload_3         
	//   40   80:invokevirtual   #55  <Method Resources BackboneApplication.getResources()>
	//   41   83:ldc1            #79  <Int 0x7f02007d>
	//   42   85:invokevirtual   #62  <Method Drawable Resources.getDrawable(int)>
	//   43   88:astore          5
			int i = backboneapplication.getResources().getColor(0x7f0d0019);
	//   44   90:aload_3         
	//   45   91:invokevirtual   #55  <Method Resources BackboneApplication.getResources()>
	//   46   94:ldc1            #80  <Int 0x7f0d0019>
	//   47   96:invokevirtual   #84  <Method int Resources.getColor(int)>
	//   48   99:istore_2        
			((CardView) (viewgroup)).setForeground(((Drawable) (null)));
	//   49  100:aload_1         
	//   50  101:aconst_null     
	//   51  102:invokevirtual   #88  <Method void CardView.setForeground(Drawable)>
			drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
	//   52  105:aload           5
	//   53  107:iload_2         
	//   54  108:getstatic       #94  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   55  111:invokevirtual   #100 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			textview.setCompoundDrawablesWithIntrinsicBounds(drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   56  114:aload           4
	//   57  116:aload           5
	//   58  118:aconst_null     
	//   59  119:aconst_null     
	//   60  120:aconst_null     
	//   61  121:invokevirtual   #66  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
			textview.setTextColor(i);
	//   62  124:aload           4
	//   63  126:iload_2         
	//   64  127:invokevirtual   #103 <Method void TextView.setTextColor(int)>
			if(boldIt)
	//*  65  130:aload_0         
	//*  66  131:getfield        #105 <Field boolean boldIt>
	//*  67  134:ifeq            144
				textview.setTypeface(((android.graphics.Typeface) (null)), 1);
	//   68  137:aload           4
	//   69  139:aconst_null     
	//   70  140:iconst_1        
	//   71  141:invokevirtual   #109 <Method void TextView.setTypeface(android.graphics.Typeface, int)>
			textview.setPadding(textview.getPaddingLeft(), (int)backboneapplication.getResources().getDimension(0x7f0900a4), textview.getPaddingRight(), (int)backboneapplication.getResources().getDimension(0x7f0900a4));
	//   72  144:aload           4
	//   73  146:aload           4
	//   74  148:invokevirtual   #112 <Method int TextView.getPaddingLeft()>
	//   75  151:aload_3         
	//   76  152:invokevirtual   #55  <Method Resources BackboneApplication.getResources()>
	//   77  155:ldc1            #113 <Int 0x7f0900a4>
	//   78  157:invokevirtual   #117 <Method float Resources.getDimension(int)>
	//   79  160:f2i             
	//   80  161:aload           4
	//   81  163:invokevirtual   #120 <Method int TextView.getPaddingRight()>
	//   82  166:aload_3         
	//   83  167:invokevirtual   #55  <Method Resources BackboneApplication.getResources()>
	//   84  170:ldc1            #113 <Int 0x7f0900a4>
	//   85  172:invokevirtual   #117 <Method float Resources.getDimension(int)>
	//   86  175:f2i             
	//   87  176:invokevirtual   #124 <Method void TextView.setPadding(int, int, int, int)>
		}
		if(true) goto _L4; else goto _L3
	//   88  179:goto            63
_L3:
	}

	public DashboardCardBuilder completed(boolean flag)
	{
		completed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #78  <Field boolean completed>
		boldIt = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #105 <Field boolean boldIt>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public DashboardCardBuilder label(String s)
	{
		label = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String label>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DashboardCardBuilder withAttentionCircle()
	{
		withAttentionCircle = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #51  <Field boolean withAttentionCircle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean boldIt;
	private boolean completed;
	private String label;
	private boolean withAttentionCircle;
}
