.class public Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "ErrorDialogManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/greenrobot/eventbus/util/ErrorDialogManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SupportManagerFragment"
.end annotation


# instance fields
.field protected argumentsForErrorDialog:Landroid/os/Bundle;

.field private eventBus:Lorg/greenrobot/eventbus/EventBus;

.field private executionScope:Ljava/lang/Object;

.field protected finishAfterDialog:Z

.field private skipRegisterOnNextResume:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method public static attachTo(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "executionScope"    # Ljava/lang/Object;
    .param p2, "finishAfterDialog"    # Z
    .param p3, "argumentsForErrorDialog"    # Landroid/os/Bundle;

    .prologue
    .line 105
    check-cast p0, Landroid/support/v4/app/FragmentActivity;

    .end local p0    # "activity":Landroid/app/Activity;
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 106
    .local v0, "fm":Landroid/support/v4/app/FragmentManager;
    const-string v2, "de.greenrobot.eventbus.error_dialog_manager"

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;

    .line 107
    .local v1, "fragment":Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;
    if-nez v1, :cond_0

    .line 108
    new-instance v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;

    .end local v1    # "fragment":Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;
    invoke-direct {v1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;-><init>()V

    .line 109
    .restart local v1    # "fragment":Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    const-string v3, "de.greenrobot.eventbus.error_dialog_manager"

    invoke-virtual {v2, v1, v3}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 110
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 112
    :cond_0
    iput-boolean p2, v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->finishAfterDialog:Z

    .line 113
    iput-object p3, v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->argumentsForErrorDialog:Landroid/os/Bundle;

    .line 114
    iput-object p1, v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->executionScope:Ljava/lang/Object;

    .line 115
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 57
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 58
    sget-object v0, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    iget-object v0, v0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    invoke-virtual {v0}, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->getEventBus()Lorg/greenrobot/eventbus/EventBus;

    move-result-object v0

    iput-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    .line 59
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/EventBus;->register(Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->skipRegisterOnNextResume:Z

    .line 61
    return-void
.end method

.method public onEventMainThread(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)V
    .locals 6
    .param p1, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;

    .prologue
    .line 82
    iget-object v3, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->executionScope:Ljava/lang/Object;

    invoke-static {v3, p1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->access$000(Ljava/lang/Object;Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 101
    :cond_0
    :goto_0
    return-void

    .line 85
    :cond_1
    invoke-static {p1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->checkLogException(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)V

    .line 87
    invoke-virtual {p0}, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 88
    .local v2, "fm":Landroid/support/v4/app/FragmentManager;
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 90
    const-string v3, "de.greenrobot.eventbus.error_dialog"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/DialogFragment;

    .line 91
    .local v1, "existingFragment":Landroid/support/v4/app/DialogFragment;
    if-eqz v1, :cond_2

    .line 93
    invoke-virtual {v1}, Landroid/support/v4/app/DialogFragment;->dismiss()V

    .line 96
    :cond_2
    sget-object v3, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    iget-boolean v4, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->finishAfterDialog:Z

    iget-object v5, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->argumentsForErrorDialog:Landroid/os/Bundle;

    .line 97
    invoke-virtual {v3, p1, v4, v5}, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->prepareErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;ZLandroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/DialogFragment;

    .line 98
    .local v0, "errorFragment":Landroid/support/v4/app/DialogFragment;
    if-eqz v0, :cond_0

    .line 99
    const-string v3, "de.greenrobot.eventbus.error_dialog"

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/EventBus;->unregister(Ljava/lang/Object;)V

    .line 78
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 79
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 65
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 66
    iget-boolean v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->skipRegisterOnNextResume:Z

    if-eqz v0, :cond_0

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->skipRegisterOnNextResume:Z

    .line 73
    :goto_0
    return-void

    .line 70
    :cond_0
    sget-object v0, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    iget-object v0, v0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    invoke-virtual {v0}, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->getEventBus()Lorg/greenrobot/eventbus/EventBus;

    move-result-object v0

    iput-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    .line 71
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/EventBus;->register(Ljava/lang/Object;)V

    goto :goto_0
.end method
