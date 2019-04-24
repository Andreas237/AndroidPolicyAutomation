// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;


// Referenced classes of package android.support.v7.preference:
//			Preference

static interface Preference$OnPreferenceChangeInternalListener
{

	public abstract void onPreferenceChange(Preference preference);

	public abstract void onPreferenceHierarchyChange(Preference preference);

	public abstract void onPreferenceVisibilityChange(Preference preference);
}
