.class Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$11;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 971
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 975
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive Action..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 976
    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 977
    :cond_0
    const-string v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/NetworkInfo;

    .line 978
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    invoke-virtual {v0, v1}, Landroid/net/NetworkInfo$State;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 979
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifi wifi network connect..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 980
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    move-result-object v0

    const/16 v1, 0x3ed

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 982
    :cond_1
    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.net.wifi.SCAN_RESULTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 983
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get wifi scanResult list..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 984
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 986
    :cond_3
    :goto_0
    return-void
.end method
