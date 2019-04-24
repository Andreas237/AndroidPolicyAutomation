.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 1

    .line 343
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 341
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->e:Ljava/lang/ref/WeakReference;

    .line 344
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->e:Ljava/lang/ref/WeakReference;

    .line 345
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 349
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    .line 351
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 352
    return-void

    .line 354
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 356
    :sswitch_0
    invoke-virtual {v4}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 357
    invoke-static {v4}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->notifyDataSetChanged()V

    .line 359
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    .line 360
    goto :goto_0

    .line 362
    :sswitch_1
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage \uff0cSHOW_TIP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 364
    invoke-static {v4}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 365
    invoke-virtual {v4, v5}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->startActivity(Landroid/content/Intent;)V

    .line 366
    .line 370
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
