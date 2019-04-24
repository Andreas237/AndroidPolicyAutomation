.class Lo/dqs$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lo/dqs;


# direct methods
.method private constructor <init>(Lo/dqs;Landroid/os/Looper;)V
    .locals 0

    .line 504
    iput-object p1, p0, Lo/dqs$b;->b:Lo/dqs;

    .line 505
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 506
    return-void
.end method

.method synthetic constructor <init>(Lo/dqs;Landroid/os/Looper;Lo/dqs$5;)V
    .locals 0

    .line 502
    invoke-direct {p0, p1, p2}, Lo/dqs$b;-><init>(Lo/dqs;Landroid/os/Looper;)V

    return-void
.end method

.method private b()V
    .locals 3

    .line 555
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->a(Lo/dqs;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 556
    return-void

    .line 559
    :cond_0
    :try_start_0
    new-instance v2, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v2}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>()V

    .line 560
    const/4 v0, -0x4

    invoke-virtual {v2, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setResultCode(I)V

    .line 561
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->b(Lo/dqs;)Lo/dsw$d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/dsw$d;->b(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 564
    goto :goto_0

    .line 562
    :catch_0
    move-exception v2

    .line 563
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle get multisim device info, remote exception occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 565
    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 538
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AttachedDeviceMgrHandler start to handle over time."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", intTime"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v2}, Lo/dqs;->a(Lo/dqs;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 539
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 541
    :sswitch_0
    invoke-direct {p0}, Lo/dqs$b;->b()V

    .line 542
    goto :goto_1

    .line 544
    :sswitch_1
    invoke-direct {p0}, Lo/dqs$b;->e()V

    .line 545
    goto :goto_1

    .line 547
    :sswitch_2
    invoke-direct {p0}, Lo/dqs$b;->c()V

    .line 548
    goto :goto_1

    .line 550
    :goto_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle Over Time ERROR."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 552
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x4 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 606
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->c(Lo/dqs;)Lo/dqs$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/dqs$b;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 607
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/dqs$b;->e(I)V

    .line 609
    :cond_0
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 610
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle download profile failed, mService is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 611
    return-void

    .line 614
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/dsr;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 617
    goto :goto_0

    .line 615
    :catch_0
    move-exception v2

    .line 616
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle download profile failed, remote exception has occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 618
    :goto_0
    return-void
.end method

.method private c()V
    .locals 3

    .line 578
    :try_start_0
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->b(Lo/dqs;)Lo/dsw$d;

    move-result-object v0

    const/4 v1, -0x4

    invoke-virtual {v0, v1}, Lo/dsw$d;->c(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 581
    goto :goto_0

    .line 579
    :catch_0
    move-exception v2

    .line 580
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle delete profile over time, remote exception has occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 582
    :goto_0
    return-void
.end method

.method private d()V
    .locals 3

    .line 588
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dqs;->e(Lo/dqs;Z)Z

    .line 590
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->c(Lo/dqs;)Lo/dqs$b;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/dqs$b;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 591
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lo/dqs$b;->e(I)V

    .line 593
    :cond_0
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 594
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle get multi-sim device info failed, mService is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 595
    return-void

    .line 598
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    invoke-interface {v0}, Lo/dsr;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 601
    goto :goto_0

    .line 599
    :catch_0
    move-exception v2

    .line 600
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle get multi-sim device info failed, remote exception has occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 603
    :goto_0
    return-void
.end method

.method private e()V
    .locals 3

    .line 569
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 570
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->b(Lo/dqs;)Lo/dsw$d;

    move-result-object v0

    const/4 v1, -0x4

    invoke-virtual {v0, v1, v2}, Lo/dsw$d;->b(ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 573
    goto :goto_0

    .line 571
    :catch_0
    move-exception v2

    .line 572
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle download profile overtime, remote exception occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 574
    :goto_0
    return-void
.end method

.method private e(I)V
    .locals 3

    .line 514
    invoke-virtual {p0}, Lo/dqs$b;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 515
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 517
    :sswitch_0
    const/16 v0, 0x9

    iput v0, v2, Landroid/os/Message;->what:I

    .line 518
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 519
    const-wide/32 v0, 0x88b8

    invoke-virtual {p0, v2, v0, v1}, Lo/dqs$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 520
    goto :goto_1

    .line 522
    :sswitch_1
    const/16 v0, 0x9

    iput v0, v2, Landroid/os/Message;->what:I

    .line 523
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 524
    const-wide/32 v0, 0x88b8

    invoke-virtual {p0, v2, v0, v1}, Lo/dqs$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 525
    goto :goto_1

    .line 527
    :sswitch_2
    const/16 v0, 0x9

    iput v0, v2, Landroid/os/Message;->what:I

    .line 528
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 529
    const-wide/32 v0, 0x88b8

    invoke-virtual {p0, v2, v0, v1}, Lo/dqs$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 530
    goto :goto_1

    .line 532
    :goto_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Can not find type to send over time message."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 535
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x4 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/multisimservice/model/SimInfo;>;)V"
        }
    .end annotation

    .line 621
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->c(Lo/dqs;)Lo/dqs$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dqs$b;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 622
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dqs$b;->e(I)V

    .line 624
    :cond_0
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 625
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle delete profile failed, mService is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 626
    return-void

    .line 629
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/dsr;->a(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 632
    goto :goto_0

    .line 630
    :catch_0
    move-exception v2

    .line 631
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle delete profile failed, remote exception has occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 633
    :goto_0
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 637
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handle message msg.what: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 638
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 639
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 640
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle message error, bundle is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 641
    return-void

    .line 643
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 645
    :pswitch_0
    invoke-direct {p0}, Lo/dqs$b;->d()V

    .line 646
    goto/16 :goto_0

    .line 648
    :pswitch_1
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dqs;->e(Lo/dqs;Z)Z

    .line 649
    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Lo/dqs$b;->removeMessages(I)V

    .line 650
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0, p1}, Lo/dqs;->e(Lo/dqs;Landroid/os/Message;)V

    .line 651
    goto :goto_0

    .line 653
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v0}, Lo/dqs$b;->b(I)V

    .line 654
    goto :goto_0

    .line 656
    :pswitch_3
    const-string v0, "activationCode"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 657
    invoke-direct {p0, v4}, Lo/dqs$b;->b(Ljava/lang/String;)V

    .line 658
    goto :goto_0

    .line 660
    :pswitch_4
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0, p1}, Lo/dqs;->b(Lo/dqs;Landroid/os/Message;)V

    .line 661
    goto :goto_0

    .line 663
    :pswitch_5
    const-string v0, "profileInfoList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 664
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 665
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Delete profile info list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 667
    :cond_1
    invoke-direct {p0, v5}, Lo/dqs$b;->e(Ljava/util/ArrayList;)V

    .line 668
    goto :goto_0

    .line 671
    :pswitch_6
    iget-object v0, p0, Lo/dqs$b;->b:Lo/dqs;

    invoke-static {v0, p1}, Lo/dqs;->a(Lo/dqs;Landroid/os/Message;)V

    .line 672
    .line 676
    :goto_0
    :pswitch_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_7
        :pswitch_2
    .end packed-switch
.end method
