.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 1

    .line 339
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 337
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 340
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 341
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 345
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    .line 347
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 348
    return-void

    .line 350
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 352
    :sswitch_0
    invoke-virtual {v4}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 353
    invoke-static {v4}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->f(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->notifyDataSetChanged()V

    .line 355
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->p(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    .line 356
    goto :goto_0

    .line 358
    :sswitch_1
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage \uff0cSHOW_TIP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 360
    invoke-static {v4}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 361
    invoke-virtual {v4, v5}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 362
    .line 366
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
