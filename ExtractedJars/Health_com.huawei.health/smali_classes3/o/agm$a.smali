.class Lo/agm$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/agm;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/agm;)V
    .locals 1

    .line 405
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 403
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agm$a;->e:Ljava/lang/ref/WeakReference;

    .line 406
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/agm$a;->e:Ljava/lang/ref/WeakReference;

    .line 407
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 411
    iget-object v0, p0, Lo/agm$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/agm;

    .line 412
    if-eqz v4, :cond_2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 413
    const-string v0, "android.bluetooth.adapter.extra.STATE"

    const/high16 v1, -0x80000000

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v4, v0}, Lo/agm;->a(Lo/agm;I)I

    .line 414
    invoke-static {v4}, Lo/agm;->e(Lo/agm;)I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    .line 415
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Open the bluetooth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    invoke-static {v4}, Lo/agm;->m(Lo/agm;)V

    .line 417
    invoke-static {v4}, Lo/agm;->l(Lo/agm;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v4}, Lo/agm;->l(Lo/agm;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 419
    invoke-static {v4}, Lo/agm;->l(Lo/agm;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0

    .line 421
    :cond_0
    invoke-static {v4}, Lo/agm;->e(Lo/agm;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    .line 422
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BleDevice onConnectionStateChange :status:0,newState:0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    invoke-static {v4}, Lo/agm;->f(Lo/agm;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 425
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/agm;->b(Lo/agm;Z)Z

    .line 426
    invoke-static {v4}, Lo/agm;->g(Lo/agm;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 428
    :cond_1
    invoke-static {v4}, Lo/agm;->o(Lo/agm;)V

    .line 431
    :cond_2
    :goto_0
    return-void
.end method
