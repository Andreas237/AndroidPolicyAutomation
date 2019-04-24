.class Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WifiHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V
    .locals 0

    .line 296
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 297
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;Landroid/os/Message;)V
    .locals 5

    .line 301
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    return-void

    .line 304
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 305
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WifiHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 306
    return-void

    .line 308
    :cond_1
    const-string v0, "WiFiOtaUpdateFragment"

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

    .line 309
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 311
    :pswitch_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 312
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/ahc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahc;->d()V

    .line 313
    const/4 v0, 0x3

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;I)V

    .line 314
    goto/16 :goto_1

    .line 316
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V

    .line 317
    goto/16 :goto_1

    .line 319
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/ahc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahc;->d()V

    .line 320
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;I)V

    .line 321
    goto/16 :goto_1

    .line 323
    :pswitch_3
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/aja;

    move-result-object v1

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ahs;->c(Ljava/lang/String;Z)V

    .line 324
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 325
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 326
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 327
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/ahc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahc;->d()V

    .line 328
    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;I)V

    .line 329
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/aja;

    move-result-object v1

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahs;->f(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 330
    if-eqz v4, :cond_2

    .line 331
    const-string v0, "status"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/aja;

    move-result-object v1

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/ahs;->c(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_1

    .line 334
    :cond_2
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WifiHandler otainfo_map is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 336
    goto :goto_1

    .line 338
    :goto_0
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WifiHandler what is other"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 341
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 293
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;Landroid/os/Message;)V

    return-void
.end method
