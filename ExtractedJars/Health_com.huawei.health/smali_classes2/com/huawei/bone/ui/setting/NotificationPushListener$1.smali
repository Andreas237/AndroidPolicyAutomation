.class Lcom/huawei/bone/ui/setting/NotificationPushListener$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/ui/setting/NotificationPushListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/bone/ui/setting/NotificationPushListener;


# direct methods
.method constructor <init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;Landroid/os/Looper;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$1;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 321
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 322
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 324
    :sswitch_0
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage remote control init!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$1;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->k(Lcom/huawei/bone/ui/setting/NotificationPushListener;)V

    .line 326
    .line 329
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
    .end sparse-switch
.end method
