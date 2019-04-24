.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WifiHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V
    .locals 0

    .line 397
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 398
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Landroid/os/Message;)V
    .locals 4

    .line 402
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 403
    return-void

    .line 405
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 406
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WifiHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 407
    return-void

    .line 409
    :cond_1
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WifiHandler what: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 410
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 412
    :pswitch_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 413
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    :cond_2
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ahs;->c(Ljava/lang/String;Z)V

    .line 416
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lo/ahc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahc;->d()V

    .line 417
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;I)V

    .line 418
    goto :goto_1

    .line 420
    :pswitch_1
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ahs;->c(Ljava/lang/String;Z)V

    .line 421
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lo/ahc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahc;->d()V

    .line 422
    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;I)V

    .line 423
    goto :goto_1

    .line 425
    :pswitch_2
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ahs;->c(Ljava/lang/String;Z)V

    .line 426
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lo/ahc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahc;->d()V

    .line 427
    const/4 v0, 0x3

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;I)V

    .line 428
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 430
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Z)V

    .line 431
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1602(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Z)Z

    .line 432
    goto :goto_1

    .line 434
    :pswitch_3
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V

    .line 435
    goto :goto_1

    .line 437
    :goto_0
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WifiHandler what is other"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 440
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 394
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Landroid/os/Message;)V

    return-void
.end method
