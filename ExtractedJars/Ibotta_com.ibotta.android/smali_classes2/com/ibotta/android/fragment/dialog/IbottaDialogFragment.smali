.class public Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "IbottaDialogFragment.java"

# interfaces
.implements Lcom/ibotta/android/activity/CompatSupplier;
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field protected listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getActivity()Landroid/app/Activity;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 13
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    return-object v0
.end method

.method public getCompatActionBar()Landroid/support/v7/app/ActionBar;
    .locals 2

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 66
    instance-of v1, v0, Lcom/ibotta/android/activity/CompatSupplier;

    if-eqz v1, :cond_0

    .line 67
    check-cast v0, Lcom/ibotta/android/activity/CompatSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/activity/CompatSupplier;->getCompatActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;
    .locals 1

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 58
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method

.method public getCompatLoaderManager()Landroid/support/v4/app/LoaderManager;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->getLoaderManager()Landroid/support/v4/app/LoaderManager;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentFragment()Landroid/support/v4/app/Fragment;
    .locals 0

    return-object p0
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 37
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    if-eqz p1, :cond_0

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;->onDialogFragmentCancelled(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 27
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 29
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    if-eqz p1, :cond_0

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;->onDialogFragmentDismissed(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStart()V

    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureObserver;->getInstance()Lcom/newrelic/agent/android/gestures/GestureObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onActivityOrFragmentStarted(Ljava/lang/Object;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStop()V

    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureObserver;->getInstance()Lcom/newrelic/agent/android/gestures/GestureObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onActivityOrFragmentStopped(Ljava/lang/Object;)V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    return-void
.end method
