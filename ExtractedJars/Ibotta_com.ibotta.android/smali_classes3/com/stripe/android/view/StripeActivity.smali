.class abstract Lcom/stripe/android/view/StripeActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "StripeActivity.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/StripeActivity$AlertMessageListener;
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field mAlertBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field mAlertMessageListener:Lcom/stripe/android/view/StripeActivity$AlertMessageListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field mCommunicating:Z

.field mProgressBar:Landroid/widget/ProgressBar;

.field mToolbar:Landroid/support/v7/widget/Toolbar;

.field mViewStub:Landroid/view/ViewStub;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/stripe/android/view/StripeActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected abstract onActionSave()V
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "StripeActivity"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/stripe/android/view/StripeActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "StripeActivity#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "StripeActivity#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    sget p1, Lcom/stripe/android/R$layout;->activity_stripe:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeActivity;->setContentView(I)V

    .line 42
    sget p1, Lcom/stripe/android/R$id;->progress_bar_as:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/stripe/android/view/StripeActivity;->mProgressBar:Landroid/widget/ProgressBar;

    .line 43
    sget p1, Lcom/stripe/android/R$id;->toolbar_as:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/Toolbar;

    iput-object p1, p0, Lcom/stripe/android/view/StripeActivity;->mToolbar:Landroid/support/v7/widget/Toolbar;

    .line 44
    sget p1, Lcom/stripe/android/R$id;->widget_viewstub_as:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewStub;

    iput-object p1, p0, Lcom/stripe/android/view/StripeActivity;->mViewStub:Landroid/view/ViewStub;

    .line 45
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/StripeActivity;->mToolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 49
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 50
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    :cond_1
    const/4 p1, 0x0

    .line 52
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeActivity;->setCommunicatingProgress(Z)V

    .line 53
    new-instance p1, Lcom/stripe/android/view/StripeActivity$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/StripeActivity$1;-><init>(Lcom/stripe/android/view/StripeActivity;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeActivity;->mAlertBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 61
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 80
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$menu;->add_source_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 81
    sget v0, Lcom/stripe/android/R$id;->action_save:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeActivity;->mCommunicating:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return v1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 87
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/stripe/android/R$id;->action_save:I

    if-ne v0, v1, :cond_0

    .line 88
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->onActionSave()V

    const/4 p1, 0x1

    return p1

    .line 91
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 93
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->onBackPressed()V

    :cond_1
    return p1
.end method

.method protected onPause()V
    .locals 2

    .line 65
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    .line 66
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/StripeActivity;->mAlertBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    .line 101
    sget v0, Lcom/stripe/android/R$id;->action_save:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 104
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$attr;->titleTextColor:I

    sget v3, Lcom/stripe/android/R$drawable;->ic_checkmark:I

    .line 102
    invoke-static {p0, v1, v2, v3}, Lcom/stripe/android/view/ViewUtils;->getTintedIconWithAttribute(Landroid/content/Context;Landroid/content/res/Resources$Theme;II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 107
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 108
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onResume()V
    .locals 4

    .line 71
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    .line 72
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/StripeActivity;->mAlertBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "action_api_exception"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStop()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStopped()V

    return-void
.end method

.method protected setCommunicatingProgress(Z)V
    .locals 1

    .line 114
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeActivity;->mCommunicating:Z

    if-eqz p1, :cond_0

    .line 116
    iget-object p1, p0, Lcom/stripe/android/view/StripeActivity;->mProgressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 118
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/StripeActivity;->mProgressBar:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 120
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

.method showError(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 128
    iget-object v0, p0, Lcom/stripe/android/view/StripeActivity;->mAlertMessageListener:Lcom/stripe/android/view/StripeActivity$AlertMessageListener;

    if-eqz v0, :cond_0

    .line 129
    invoke-interface {v0, p1}, Lcom/stripe/android/view/StripeActivity$AlertMessageListener;->onAlertMessageDisplayed(Ljava/lang/String;)V

    .line 132
    :cond_0
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 133
    invoke-virtual {v0, p1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 134
    invoke-virtual {p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setCancelable(Z)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x104000a

    new-instance v1, Lcom/stripe/android/view/StripeActivity$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/StripeActivity$2;-><init>(Lcom/stripe/android/view/StripeActivity;)V

    .line 135
    invoke-virtual {p1, v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    .line 141
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object p1

    .line 142
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method
