.class Lo/adn$2;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/adn;


# direct methods
.method constructor <init>(Lo/adn;)V
    .locals 0

    .line 519
    iput-object p1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 13

    .line 577
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 578
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController onCharacteristicChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " HWChMeasureController onCharacteristicChanged characteristic=_id=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->s(Lo/adn;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 581
    return-void

    .line 584
    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    .line 585
    const-string v0, "0000faa1-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 586
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController write data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 587
    :cond_1
    const-string v0, "0000faa2-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 588
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x5

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->q(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x6

    if-ne v0, v1, :cond_3

    .line 589
    :cond_2
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->e()V

    .line 590
    return-void

    .line 592
    :cond_3
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->h(Lo/adn;Z)V

    .line 593
    const/4 v5, 0x0

    .line 595
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v0

    invoke-static {v0}, Lo/adl;->d([B)Lo/adw;

    move-result-object v6

    .line 596
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " HWChMeasureController parseResult "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    invoke-virtual {v6}, Lo/adw;->a()Ljava/lang/Object;

    move-result-object v7

    .line 598
    const/4 v8, 0x0

    .line 599
    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 600
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->k(Lo/adn;Z)Z

    goto :goto_0

    .line 602
    :cond_4
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->k(Lo/adn;Z)Z

    .line 604
    :goto_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v9

    .line 605
    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 607
    :pswitch_0
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->g(Lo/adn;Z)Z

    .line 608
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x5

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->q(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x6

    if-ne v0, v1, :cond_6

    .line 609
    :cond_5
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->e()V

    .line 610
    return-void

    .line 612
    :cond_6
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TYPE_WAKEUP "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->z(Lo/adn;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->l(Lo/adn;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    const/4 v3, 0x1

    goto :goto_1

    :cond_8
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->z(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->l(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x6

    if-eq v0, v1, :cond_a

    .line 614
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->e(Lo/adn;Z)Z

    .line 615
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->r(Lo/adn;)V

    .line 616
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->x(Lo/adn;)V

    .line 620
    :cond_a
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->v(Lo/adn;)Lo/acl;

    move-result-object v1

    const/16 v2, 0xe

    invoke-static {v0, v1, v2}, Lo/adn;->c(Lo/adn;Lo/acl;I)V

    .line 622
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->y(Lo/adn;)V

    .line 623
    goto/16 :goto_4

    .line 626
    :pswitch_1
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->e(Lo/adn;Z)Z

    .line 627
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->g(Lo/adn;Z)Z

    .line 628
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->y(Lo/adn;)V

    .line 629
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->w(Lo/adn;)V

    .line 630
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->B(Lo/adn;)V

    .line 631
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->A(Lo/adn;)V

    .line 633
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->v(Lo/adn;)Lo/acl;

    move-result-object v1

    const/16 v2, 0xd

    invoke-static {v0, v1, v2}, Lo/adn;->c(Lo/adn;Lo/acl;I)V

    .line 635
    goto/16 :goto_4

    .line 638
    :pswitch_2
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    sget-object v1, Lo/adn$b;->e:Lo/adn$b;

    iput-object v1, v0, Lo/adn;->d:Lo/adn$b;

    .line 639
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->f(Lo/adn;Z)Z

    .line 641
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->j(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 642
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->a(Lo/adn;Z)Z

    .line 643
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->b(Lo/adn;Z)Z

    .line 644
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0, v6}, Lo/adn;->c(Lo/adn;Lo/adw;)V

    .line 645
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->d(Lo/adn;Z)Z

    .line 646
    sget-object v5, Lo/adn$b;->e:Lo/adn$b;

    goto/16 :goto_4

    .line 648
    :cond_b
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_d

    .line 649
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "waiting instruction, maintain connection"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 650
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->C(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 651
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->d(Lo/adn;Z)Z

    .line 653
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->D(Lo/adn;)Lo/acg;

    move-result-object v1

    const/4 v2, -0x3

    invoke-static {v0, v1, v2}, Lo/adn;->c(Lo/adn;Lo/acl;I)V

    goto/16 :goto_4

    .line 656
    :cond_c
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {}, Lo/adl;->c()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto/16 :goto_4

    .line 658
    :cond_d
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_e

    .line 659
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user authentication is completed, the binding of success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {}, Lo/adl;->c()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 662
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->F(Lo/adn;)Lo/acg;

    move-result-object v1

    const/4 v2, -0x2

    invoke-static {v0, v1, v2}, Lo/adn;->c(Lo/adn;Lo/acl;I)V

    goto/16 :goto_4

    .line 665
    :cond_e
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {}, Lo/adl;->c()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 668
    goto/16 :goto_4

    .line 670
    :pswitch_3
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    move-object v1, v7

    check-cast v1, Lo/adq;

    invoke-static {v0, v1}, Lo/adn;->b(Lo/adn;Lo/adq;)Lo/adq;

    .line 671
    const-string v0, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->i(Lo/adn;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 672
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v0

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v1

    invoke-virtual {v1}, Lo/adq;->d()I

    move-result v1

    add-int/lit16 v1, v1, -0x8000

    invoke-virtual {v0, v1}, Lo/adq;->a(I)V

    .line 674
    :cond_f
    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 675
    const-string v0, "bleVersion"

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v1

    invoke-virtual {v1}, Lo/adq;->a()I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 676
    const-string v0, "scaleVersion"

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v1

    invoke-virtual {v1}, Lo/adq;->d()I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 677
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->i(Lo/adn;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v2, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v2}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v2

    invoke-virtual {v2}, Lo/adq;->d()I

    move-result v2

    invoke-static {v1, v2}, Lo/adn;->c(Lo/adn;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ahd;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 678
    new-instance v0, Lo/ahi$a;

    const-string v1, "set_scale_version_code"

    invoke-direct {v0, v1, v10}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 679
    goto/16 :goto_4

    .line 682
    :pswitch_4
    goto/16 :goto_4

    .line 686
    :pswitch_5
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    sget-object v1, Lo/adn$b;->d:Lo/adn$b;

    iput-object v1, v0, Lo/adn;->d:Lo/adn$b;

    .line 687
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Complete instructions received time synchronization"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->l(Lo/adn;Z)Z

    .line 689
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0, v6}, Lo/adn;->c(Lo/adn;Lo/adw;)V

    .line 690
    sget-object v5, Lo/adn$b;->e:Lo/adn$b;

    .line 692
    goto/16 :goto_4

    .line 695
    :pswitch_6
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->o(Lo/adn;Z)Z

    .line 696
    move-object v8, v7

    check-cast v8, Lo/ads;

    .line 698
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->v(Lo/adn;)Lo/acl;

    move-result-object v1

    iget-object v2, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v2, v8}, Lo/adn;->e(Lo/adn;Lo/ads;)Lo/afz;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/adn;->e(Lo/adn;Lo/acl;Lo/afz;)V

    .line 700
    goto/16 :goto_4

    .line 703
    :pswitch_7
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->o(Lo/adn;Z)Z

    .line 704
    move-object v8, v7

    check-cast v8, Lo/ads;

    .line 705
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_10

    .line 706
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/ads;->c(Ljava/lang/String;)V

    goto :goto_2

    .line 708
    :cond_10
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/ads;->c(Ljava/lang/String;)V

    .line 710
    :goto_2
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->H(Lo/adn;)Lo/afp;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/afp;->b(Lo/ads;)V

    .line 711
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receiver histroy data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    goto/16 :goto_4

    .line 715
    :pswitch_8
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    sget-object v1, Lo/adn$b;->h:Lo/adn$b;

    iput-object v1, v0, Lo/adn;->d:Lo/adn$b;

    .line 716
    invoke-static {}, Lo/adp;->a()Lo/adp;

    move-result-object v0

    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v1

    invoke-virtual {v0, v1, v9, v7}, Lo/adp;->d(I[BLjava/lang/Object;)V

    .line 717
    goto/16 :goto_4

    .line 719
    :pswitch_9
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->y(Lo/adn;)V

    .line 721
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    sget-object v1, Lo/adn$b;->h:Lo/adn$b;

    iput-object v1, v0, Lo/adn;->d:Lo/adn$b;

    .line 722
    invoke-static {}, Lo/adp;->a()Lo/adp;

    move-result-object v0

    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v1

    invoke-virtual {v0, v1, v9, v7}, Lo/adp;->d(I[BLjava/lang/Object;)V

    .line 723
    goto/16 :goto_4

    .line 726
    :pswitch_a
    goto/16 :goto_4

    .line 729
    :pswitch_b
    goto/16 :goto_4

    .line 732
    :pswitch_c
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->e(Lo/adn;Z)Z

    .line 733
    goto/16 :goto_4

    .line 735
    :pswitch_d
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Received the alarm response"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 736
    goto/16 :goto_4

    .line 738
    :pswitch_e
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->I(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 739
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->m(Lo/adn;Z)Z

    .line 740
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    sget-object v1, Lo/adn$b;->g:Lo/adn$b;

    iput-object v1, v0, Lo/adn;->d:Lo/adn$b;

    .line 741
    invoke-static {}, Lo/adp;->a()Lo/adp;

    move-result-object v0

    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v1

    invoke-virtual {v0, v1, v9, v7}, Lo/adp;->d(I[BLjava/lang/Object;)V

    goto/16 :goto_4

    .line 745
    :pswitch_f
    goto/16 :goto_4

    .line 747
    :pswitch_10
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->o(Lo/adn;Z)Z

    .line 748
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->f()V

    .line 749
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receiver histroy data done"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    goto/16 :goto_4

    .line 753
    :pswitch_11
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    sget-object v1, Lo/adn$b;->l:Lo/adn$b;

    iput-object v1, v0, Lo/adn;->d:Lo/adn$b;

    .line 754
    move-object v0, v7

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    .line 755
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->p(Lo/adn;Z)Z

    .line 756
    if-nez v11, :cond_12

    .line 758
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Bind instructions issued by the user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 759
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v12

    .line 760
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_11

    .line 761
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TYPE_USER_CHECK userId == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v3}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/adw;->a([B)V

    goto :goto_3

    .line 764
    :cond_11
    invoke-static {v12}, Lo/adl;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/adw;->a([B)V

    .line 766
    :goto_3
    sget-object v5, Lo/adn$b;->e:Lo/adn$b;

    .line 767
    goto :goto_4

    .line 769
    :cond_12
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Distributed clock synchronization"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    sget-object v5, Lo/adn$b;->d:Lo/adn$b;

    .line 771
    invoke-static {}, Lo/adl;->a()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/adw;->a([B)V

    .line 774
    goto :goto_4

    .line 777
    :pswitch_12
    invoke-static {}, Lo/adl;->a()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/adw;->a([B)V

    .line 778
    sget-object v5, Lo/adn$b;->d:Lo/adn$b;

    .line 779
    goto :goto_4

    .line 781
    :pswitch_13
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->G(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 782
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->n(Lo/adn;Z)Z

    .line 783
    invoke-static {}, Lo/adp;->a()Lo/adp;

    move-result-object v0

    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v1

    invoke-virtual {v0, v1, v9, v7}, Lo/adp;->d(I[BLjava/lang/Object;)V

    goto :goto_4

    .line 787
    :pswitch_14
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->E(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 788
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->r(Lo/adn;Z)Z

    .line 789
    invoke-static {}, Lo/adp;->a()Lo/adp;

    move-result-object v0

    invoke-virtual {v6}, Lo/adw;->e()I

    move-result v1

    invoke-virtual {v0, v1, v9, v7}, Lo/adp;->d(I[BLjava/lang/Object;)V

    .line 797
    :cond_13
    :goto_4
    invoke-virtual {v6}, Lo/adw;->d()[B

    move-result-object v10

    .line 798
    if-eqz v10, :cond_15

    array-length v0, v10

    if-lez v0, :cond_15

    .line 799
    if-eqz v5, :cond_14

    .line 800
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "targetAck safeguardSendData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/adn$b;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 801
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0, v10, v5}, Lo/adn;->b(Lo/adn;[BLo/adn$b;)V

    goto :goto_5

    .line 803
    :cond_14
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeCmdBytes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0, v10}, Lo/adn;->a([B)V

    .line 811
    :cond_15
    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
    .end packed-switch
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    .line 523
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    .line 524
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController onConnectionStateChange status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " newState "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->e(Lo/adn;Z)Z

    .line 526
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->m(Lo/adn;)V

    .line 527
    const/4 v0, 0x2

    if-ne p3, v0, :cond_1

    .line 528
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->m(Lo/adn;)V

    .line 529
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0, p1}, Lo/adn;->c(Lo/adn;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 530
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/adn;->d(Lo/adn;I)I

    .line 533
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 534
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/adn$e;->removeMessages(I)V

    .line 535
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Lo/adn$e;->sendEmptyMessageDelayed(IJ)Z

    .line 538
    :cond_0
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->i(Lo/adn;Z)Z

    .line 540
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->u(Lo/adn;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/adn;->c(Lo/adn;Lo/acl;I)V

    goto :goto_0

    .line 543
    :cond_1
    if-nez p3, :cond_2

    .line 544
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->t(Lo/adn;)V

    .line 547
    :cond_2
    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 4

    .line 551
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 552
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController onDescriptorWrite"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->s(Lo/adn;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 554
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->h(Lo/adn;Z)V

    .line 557
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v0

    new-instance v1, Lo/adn$2$3;

    invoke-direct {v1, p0}, Lo/adn$2$3;-><init>(Lo/adn$2;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/adn$e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 573
    :cond_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5

    .line 815
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    .line 816
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController onServicesDiscovered"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 817
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/adn$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 818
    if-nez p2, :cond_0

    .line 819
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController GATT_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0, p1}, Lo/adn;->a(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 823
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController onServicesDiscovered failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 824
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 825
    const-string v0, "measureKitId"

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->J(Lo/adn;)Lo/acg;

    move-result-object v1

    invoke-virtual {v1}, Lo/acg;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 826
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No GATT service found."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8db

    const/4 v3, 0x0

    invoke-static {v2, v0, v4, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 828
    iget-object v0, p0, Lo/adn$2;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->v(Lo/adn;)Lo/acl;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v0, v1, v2}, Lo/adn;->c(Lo/adn;Lo/acl;I)V

    .line 831
    :goto_0
    return-void
.end method
