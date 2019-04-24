.class public interface abstract Lcom/ibotta/android/activity/CompatSupplier;
.super Ljava/lang/Object;
.source "CompatSupplier.java"


# virtual methods
.method public abstract getActivity()Landroid/app/Activity;
.end method

.method public abstract getCompatActionBar()Landroid/support/v7/app/ActionBar;
.end method

.method public abstract getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;
.end method

.method public abstract getCompatLoaderManager()Landroid/support/v4/app/LoaderManager;
.end method

.method public abstract getCurrentFragment()Landroid/support/v4/app/Fragment;
.end method

.method public abstract startActivity(Landroid/content/Intent;)V
.end method

.method public abstract startActivityForResult(Landroid/content/Intent;I)V
.end method
