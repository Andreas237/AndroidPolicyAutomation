.class final Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/decode/InactivityTimer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "PowerStatusReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/decode/InactivityTimer;


# direct methods
.method private constructor <init>(Lcom/huawei/qrcode/decode/InactivityTimer;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;->this$0:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/decode/InactivityTimer;Lcom/huawei/qrcode/decode/InactivityTimer$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;-><init>(Lcom/huawei/qrcode/decode/InactivityTimer;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "plugged"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;->this$0:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/InactivityTimer;->onActivity()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;->this$0:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-static {v0}, Lcom/huawei/qrcode/decode/InactivityTimer;->access$200(Lcom/huawei/qrcode/decode/InactivityTimer;)V

    :cond_2
    :goto_1
    return-void
.end method
