.class Lcom/huawei/hms/support/api/push/PushReceiver$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/push/PushReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/push/PushReceiver;

.field private b:Landroid/content/Context;

.field private c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 0

    .line 403
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 404
    iput-object p2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->b:Landroid/content/Context;

    .line 405
    iput-object p3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    .line 406
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 410
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 411
    return-void

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    const-string v1, "receiveType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 414
    if-ltz v4, :cond_1

    invoke-static {}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->values()[Lcom/huawei/hms/support/api/push/PushReceiver$d;

    move-result-object v0

    array-length v0, v0

    if-lt v4, v0, :cond_2

    .line 415
    :cond_1
    const-string v0, "PushReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid receiverType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    return-void

    .line 419
    :cond_2
    invoke-static {}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->values()[Lcom/huawei/hms/support/api/push/PushReceiver$d;

    move-result-object v0

    aget-object v5, v0, v4

    .line 421
    :try_start_0
    sget-object v0, Lcom/huawei/hms/support/api/push/a;->a:[I

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 423
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    const-string v3, "deviceToken"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/push/PushReceiver;->onToken(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 424
    goto :goto_0

    .line 427
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    const-string v1, "pushMsg"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v6

    .line 428
    if-eqz v6, :cond_3

    .line 429
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v6, v2}, Lcom/huawei/hms/support/api/push/PushReceiver;->onPushMsg(Landroid/content/Context;[BLandroid/os/Bundle;)Z

    goto :goto_0

    .line 434
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    const-string v3, "pushState"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hms/support/api/push/PushReceiver;->onPushState(Landroid/content/Context;Z)V

    .line 435
    goto :goto_0

    .line 438
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->b:Landroid/content/Context;

    sget-object v2, Lcom/huawei/hms/support/api/push/PushReceiver$Event;->NOTIFICATION_OPENED:Lcom/huawei/hms/support/api/push/PushReceiver$Event;

    iget-object v3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/push/PushReceiver;->onEvent(Landroid/content/Context;Lcom/huawei/hms/support/api/push/PushReceiver$Event;Landroid/os/Bundle;)V

    .line 439
    goto :goto_0

    .line 442
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->b:Landroid/content/Context;

    sget-object v2, Lcom/huawei/hms/support/api/push/PushReceiver$Event;->NOTIFICATION_CLICK_BTN:Lcom/huawei/hms/support/api/push/PushReceiver$Event;

    iget-object v3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$a;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/push/PushReceiver;->onEvent(Landroid/content/Context;Lcom/huawei/hms/support/api/push/PushReceiver$Event;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 443
    .line 451
    :cond_3
    :goto_0
    goto :goto_1

    .line 449
    :catch_0
    move-exception v6

    .line 450
    const-string v0, "PushReceiver"

    const-string v1, "call EventThread(ReceiveType) error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
