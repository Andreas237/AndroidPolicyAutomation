// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.*;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.*;
import java.io.InputStream;

class ResourcesWrapper extends Resources
{

	public ResourcesWrapper(Resources resources)
	{
		super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #12  <Method android.content.res.AssetManager Resources.getAssets()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #16  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #20  <Method Configuration Resources.getConfiguration()>
	//    7   13:invokespecial   #23  <Method void Resources(android.content.res.AssetManager, DisplayMetrics, Configuration)>
		mResources = resources;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #25  <Field Resources mResources>
	//   11   21:return          
	}

	public XmlResourceParser getAnimation(int i)
	{
		return mResources.getAnimation(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #30  <Method XmlResourceParser Resources.getAnimation(int)>
	//    4    8:areturn         
	}

	public boolean getBoolean(int i)
	{
		return mResources.getBoolean(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #34  <Method boolean Resources.getBoolean(int)>
	//    4    8:ireturn         
	}

	public int getColor(int i)
	{
		return mResources.getColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #38  <Method int Resources.getColor(int)>
	//    4    8:ireturn         
	}

	public ColorStateList getColorStateList(int i)
	{
		return mResources.getColorStateList(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #42  <Method ColorStateList Resources.getColorStateList(int)>
	//    4    8:areturn         
	}

	public Configuration getConfiguration()
	{
		return mResources.getConfiguration();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:invokevirtual   #20  <Method Configuration Resources.getConfiguration()>
	//    3    7:areturn         
	}

	public float getDimension(int i)
	{
		return mResources.getDimension(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #46  <Method float Resources.getDimension(int)>
	//    4    8:freturn         
	}

	public int getDimensionPixelOffset(int i)
	{
		return mResources.getDimensionPixelOffset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #49  <Method int Resources.getDimensionPixelOffset(int)>
	//    4    8:ireturn         
	}

	public int getDimensionPixelSize(int i)
	{
		return mResources.getDimensionPixelSize(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #52  <Method int Resources.getDimensionPixelSize(int)>
	//    4    8:ireturn         
	}

	public DisplayMetrics getDisplayMetrics()
	{
		return mResources.getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:invokevirtual   #16  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:areturn         
	}

	public Drawable getDrawable(int i)
	{
		return mResources.getDrawable(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #56  <Method Drawable Resources.getDrawable(int)>
	//    4    8:areturn         
	}

	public Drawable getDrawable(int i, android.content.res.Resources.Theme theme)
	{
		return mResources.getDrawable(i, theme);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #59  <Method Drawable Resources.getDrawable(int, android.content.res.Resources$Theme)>
	//    5    9:areturn         
	}

	public Drawable getDrawableForDensity(int i, int j)
	{
		return mResources.getDrawableForDensity(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #63  <Method Drawable Resources.getDrawableForDensity(int, int)>
	//    5    9:areturn         
	}

	public Drawable getDrawableForDensity(int i, int j, android.content.res.Resources.Theme theme)
	{
		return mResources.getDrawableForDensity(i, j, theme);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #66  <Method Drawable Resources.getDrawableForDensity(int, int, android.content.res.Resources$Theme)>
	//    6   10:areturn         
	}

	public float getFraction(int i, int j, int k)
	{
		return mResources.getFraction(i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #70  <Method float Resources.getFraction(int, int, int)>
	//    6   10:freturn         
	}

	public int getIdentifier(String s, String s1, String s2)
	{
		return mResources.getIdentifier(s, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//    6   10:ireturn         
	}

	public int[] getIntArray(int i)
	{
		return mResources.getIntArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method int[] Resources.getIntArray(int)>
	//    4    8:areturn         
	}

	public int getInteger(int i)
	{
		return mResources.getInteger(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #81  <Method int Resources.getInteger(int)>
	//    4    8:ireturn         
	}

	public XmlResourceParser getLayout(int i)
	{
		return mResources.getLayout(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #84  <Method XmlResourceParser Resources.getLayout(int)>
	//    4    8:areturn         
	}

	public Movie getMovie(int i)
	{
		return mResources.getMovie(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #88  <Method Movie Resources.getMovie(int)>
	//    4    8:areturn         
	}

	public String getQuantityString(int i, int j)
	{
		return mResources.getQuantityString(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #92  <Method String Resources.getQuantityString(int, int)>
	//    5    9:areturn         
	}

	public transient String getQuantityString(int i, int j, Object aobj[])
	{
		return mResources.getQuantityString(i, j, aobj);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #95  <Method String Resources.getQuantityString(int, int, Object[])>
	//    6   10:areturn         
	}

	public CharSequence getQuantityText(int i, int j)
	{
		return mResources.getQuantityText(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #99  <Method CharSequence Resources.getQuantityText(int, int)>
	//    5    9:areturn         
	}

	public String getResourceEntryName(int i)
	{
		return mResources.getResourceEntryName(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #103 <Method String Resources.getResourceEntryName(int)>
	//    4    8:areturn         
	}

	public String getResourceName(int i)
	{
		return mResources.getResourceName(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #106 <Method String Resources.getResourceName(int)>
	//    4    8:areturn         
	}

	public String getResourcePackageName(int i)
	{
		return mResources.getResourcePackageName(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #109 <Method String Resources.getResourcePackageName(int)>
	//    4    8:areturn         
	}

	public String getResourceTypeName(int i)
	{
		return mResources.getResourceTypeName(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method String Resources.getResourceTypeName(int)>
	//    4    8:areturn         
	}

	public String getString(int i)
	{
		return mResources.getString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method String Resources.getString(int)>
	//    4    8:areturn         
	}

	public transient String getString(int i, Object aobj[])
	{
		return mResources.getString(i, aobj);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #118 <Method String Resources.getString(int, Object[])>
	//    5    9:areturn         
	}

	public String[] getStringArray(int i)
	{
		return mResources.getStringArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #122 <Method String[] Resources.getStringArray(int)>
	//    4    8:areturn         
	}

	public CharSequence getText(int i)
	{
		return mResources.getText(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #126 <Method CharSequence Resources.getText(int)>
	//    4    8:areturn         
	}

	public CharSequence getText(int i, CharSequence charsequence)
	{
		return mResources.getText(i, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #129 <Method CharSequence Resources.getText(int, CharSequence)>
	//    5    9:areturn         
	}

	public CharSequence[] getTextArray(int i)
	{
		return mResources.getTextArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #133 <Method CharSequence[] Resources.getTextArray(int)>
	//    4    8:areturn         
	}

	public void getValue(int i, TypedValue typedvalue, boolean flag)
	{
		mResources.getValue(i, typedvalue, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #137 <Method void Resources.getValue(int, TypedValue, boolean)>
	//    6   10:return          
	}

	public void getValue(String s, TypedValue typedvalue, boolean flag)
	{
		mResources.getValue(s, typedvalue, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #140 <Method void Resources.getValue(String, TypedValue, boolean)>
	//    6   10:return          
	}

	public void getValueForDensity(int i, int j, TypedValue typedvalue, boolean flag)
	{
		mResources.getValueForDensity(i, j, typedvalue, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #144 <Method void Resources.getValueForDensity(int, int, TypedValue, boolean)>
	//    7   12:return          
	}

	public XmlResourceParser getXml(int i)
	{
		return mResources.getXml(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #147 <Method XmlResourceParser Resources.getXml(int)>
	//    4    8:areturn         
	}

	public TypedArray obtainAttributes(AttributeSet attributeset, int ai[])
	{
		return mResources.obtainAttributes(attributeset, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #151 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    5    9:areturn         
	}

	public TypedArray obtainTypedArray(int i)
	{
		return mResources.obtainTypedArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #155 <Method TypedArray Resources.obtainTypedArray(int)>
	//    4    8:areturn         
	}

	public InputStream openRawResource(int i)
	{
		return mResources.openRawResource(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #159 <Method InputStream Resources.openRawResource(int)>
	//    4    8:areturn         
	}

	public InputStream openRawResource(int i, TypedValue typedvalue)
	{
		return mResources.openRawResource(i, typedvalue);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #162 <Method InputStream Resources.openRawResource(int, TypedValue)>
	//    5    9:areturn         
	}

	public AssetFileDescriptor openRawResourceFd(int i)
	{
		return mResources.openRawResourceFd(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #166 <Method AssetFileDescriptor Resources.openRawResourceFd(int)>
	//    4    8:areturn         
	}

	public void parseBundleExtra(String s, AttributeSet attributeset, Bundle bundle)
	{
		mResources.parseBundleExtra(s, attributeset, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #170 <Method void Resources.parseBundleExtra(String, AttributeSet, Bundle)>
	//    6   10:return          
	}

	public void parseBundleExtras(XmlResourceParser xmlresourceparser, Bundle bundle)
	{
		mResources.parseBundleExtras(xmlresourceparser, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources mResources>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #174 <Method void Resources.parseBundleExtras(XmlResourceParser, Bundle)>
	//    5    9:return          
	}

	public void updateConfiguration(Configuration configuration, DisplayMetrics displaymetrics)
	{
		super.updateConfiguration(configuration, displaymetrics);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #178 <Method void Resources.updateConfiguration(Configuration, DisplayMetrics)>
		Resources resources = mResources;
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field Resources mResources>
	//    6   10:astore_3        
		if(resources != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          21
			resources.updateConfiguration(configuration, displaymetrics);
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #178 <Method void Resources.updateConfiguration(Configuration, DisplayMetrics)>
	//   13   21:return          
	}

	private final Resources mResources;
}
