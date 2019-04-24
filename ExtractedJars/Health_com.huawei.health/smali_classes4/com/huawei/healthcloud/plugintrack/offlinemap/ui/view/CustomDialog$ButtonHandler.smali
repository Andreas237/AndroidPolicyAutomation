.class final Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ButtonHandler"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/DialogInterface;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/DialogInterface;)V
    .locals 1

    .line 420
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 418
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;->d:Ljava/lang/ref/WeakReference;

    .line 421
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;->d:Ljava/lang/ref/WeakReference;

    .line 422
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 426
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 427
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 432
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/DialogInterface;

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-interface {v0, v1, v2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 433
    goto :goto_0

    .line 436
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;->d:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/DialogInterface;

    .line 438
    if-eqz v3, :cond_0

    .line 439
    invoke-interface {v3}, Landroid/content/DialogInterface;->dismiss()V

    .line 440
    .line 445
    :cond_0
    :goto_0
    :pswitch_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
