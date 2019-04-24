.class Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->initWifiListDialog()V
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

    .line 474
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 477
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "select wifi position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "| mShowWifiList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p3, v0, :cond_0

    .line 479
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/ScanResult;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1402(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Landroid/net/wifi/ScanResult;)Landroid/net/wifi/ScanResult;

    goto :goto_0

    .line 481
    :cond_0
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "select wifi position is  error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 482
    return-void

    .line 484
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/net/wifi/ScanResult;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 485
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "select wifi is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 486
    return-void

    .line 488
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lo/agw;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/agw;->e(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lo/agw;

    move-result-object v0

    invoke-virtual {v0}, Lo/agw;->notifyDataSetChanged()V

    .line 490
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1600(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/net/wifi/ScanResult;

    move-result-object v1

    iget-object v1, v1, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 491
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/net/wifi/ScanResult;

    move-result-object v1

    iget-object v1, v1, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/net/wifi/ScanResult;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1900(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Landroid/net/wifi/ScanResult;)V

    .line 494
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/net/wifi/ScanResult;

    move-result-object v1

    invoke-static {v1}, Lo/akf;->e(Landroid/net/wifi/ScanResult;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2000(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Z)V

    .line 496
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1602(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 497
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2102(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 498
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/net/wifi/ScanResult;

    move-result-object v1

    invoke-static {v1}, Lo/ajy;->e(Landroid/net/wifi/ScanResult;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2202(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;I)I

    .line 499
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 500
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 502
    :cond_3
    return-void
.end method
