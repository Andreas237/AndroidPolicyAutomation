.class Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$5;
.super Lo/aje;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aje<Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 707
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-direct {p0, p2}, Lo/aje;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 710
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 711
    const-string v0, "connect WiFiInfoConfirmFragment is null"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 712
    return-void

    .line 714
    :cond_0
    const/16 v0, 0x65

    if-eq v0, p2, :cond_1

    const/16 v0, 0x67

    if-ne v0, p2, :cond_2

    .line 715
    :cond_1
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    move-result-object v0

    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 717
    :cond_2
    const/16 v0, 0x66

    if-ne v0, p2, :cond_3

    .line 718
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    move-result-object v0

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 720
    :cond_3
    const-string v0, "connect wifi error is other code,"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 722
    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 707
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$5;->onResult(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
