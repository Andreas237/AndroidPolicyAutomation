.class public Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;
.super Landroid/app/Fragment;
.source "ErrorDialogManager.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/greenrobot/eventbus/util/ErrorDialogManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HoneycombManagerFragment"
.end annotation


# instance fields
.field protected argumentsForErrorDialog:Landroid/os/Bundle;

.field private eventBus:Lorg/greenrobot/eventbus/EventBus;

.field private executionScope:Ljava/lang/Object;

.field protected finishAfterDialog:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 119
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static attachTo(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "executionScope"    # Ljava/lang/Object;
    .param p2, "finishAfterDialog"    # Z
    .param p3, "argumentsForErrorDialog"    # Landroid/os/Bundle;

    .prologue
    .line 163
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    .line 164
    .local v0, "fm":Landroid/app/FragmentManager;
    const-string v2, "de.greenrobot.eventbus.error_dialog_manager"

    .line 165
    invoke-virtual {v0, v2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    check-cast v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;

    .line 166
    .local v1, "fragment":Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;
    if-nez v1, :cond_0

    .line 167
    new-instance v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;

    .end local v1    # "fragment":Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;
    invoke-direct {v1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;-><init>()V

    .line 168
    .restart local v1    # "fragment":Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v2

    const-string v3, "de.greenrobot.eventbus.error_dialog_manager"

    invoke-virtual {v2, v1, v3}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/FragmentTransaction;->commit()I

    .line 169
    invoke-virtual {v0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 171
    :cond_0
    iput-boolean p2, v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->finishAfterDialog:Z

    .line 172
    iput-object p3, v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->argumentsForErrorDialog:Landroid/os/Bundle;

    .line 173
    iput-object p1, v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->executionScope:Ljava/lang/Object;

    .line 174
    return-void
.end method


# virtual methods
.method public onEventMainThread(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)V
    .locals 6
    .param p1, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;

    .prologue
    .line 139
    iget-object v3, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->executionScope:Ljava/lang/Object;

    invoke-static {v3, p1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->access$000(Ljava/lang/Object;Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 160
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    invoke-static {p1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->checkLogException(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)V

    .line 145
    invoke-virtual {p0}, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    .line 146
    .local v2, "fm":Landroid/app/FragmentManager;
    invoke-virtual {v2}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 148
    const-string v3, "de.greenrobot.eventbus.error_dialog"

    .line 149
    invoke-virtual {v2, v3}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    check-cast v1, Landroid/app/DialogFragment;

    .line 150
    .local v1, "existingFragment":Landroid/app/DialogFragment;
    if-eqz v1, :cond_2

    .line 152
    invoke-virtual {v1}, Landroid/app/DialogFragment;->dismiss()V

    .line 155
    :cond_2
    sget-object v3, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    iget-boolean v4, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->finishAfterDialog:Z

    iget-object v5, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->argumentsForErrorDialog:Landroid/os/Bundle;

    invoke-virtual {v3, p1, v4, v5}, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->prepareErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;ZLandroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/DialogFragment;

    .line 157
    .local v0, "errorFragment":Landroid/app/DialogFragment;
    if-eqz v0, :cond_0

    .line 158
    const-string v3, "de.greenrobot.eventbus.error_dialog"

    invoke-virtual {v0, v2, v3}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/EventBus;->unregister(Ljava/lang/Object;)V

    .line 135
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 136
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 127
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 128
    sget-object v0, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    iget-object v0, v0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    invoke-virtual {v0}, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->getEventBus()Lorg/greenrobot/eventbus/EventBus;

    move-result-object v0

    iput-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    .line 129
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/EventBus;->register(Ljava/lang/Object;)V

    .line 130
    return-void
.end method
