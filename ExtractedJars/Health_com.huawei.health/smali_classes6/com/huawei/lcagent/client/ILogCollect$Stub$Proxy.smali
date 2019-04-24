.class Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/lcagent/client/ILogCollect;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/lcagent/client/ILogCollect$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Proxy"
.end annotation


# instance fields
.field private mRemote:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 344
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 346
    iput-object p1, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    .line 347
    return-void
.end method


# virtual methods
.method public allowUploadAlways(Z)I
    .locals 7

    .line 542
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 543
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 546
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 547
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 548
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 549
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 550
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_1

    .line 552
    :catchall_0
    move-exception v6

    .line 553
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 554
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 555
    throw v6

    .line 553
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 554
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 556
    return v5
.end method

.method public allowUploadInMobileNetwork(Z)I
    .locals 7

    .line 524
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 525
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 528
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 529
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 530
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 531
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 532
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_1

    .line 534
    :catchall_0
    move-exception v6

    .line 535
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 536
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 537
    throw v6

    .line 535
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 536
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 538
    return v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 350
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public captureAllLog()Lcom/huawei/lcagent/client/LogMetricInfo;
    .locals 7

    .line 633
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 634
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 637
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 638
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 639
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 640
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 641
    sget-object v0, Lcom/huawei/lcagent/client/LogMetricInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/lcagent/client/LogMetricInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 644
    :cond_0
    const/4 v5, 0x0

    goto :goto_0

    .line 647
    :catchall_0
    move-exception v6

    .line 648
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 649
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 650
    throw v6

    .line 648
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 649
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 651
    return-object v5
.end method

.method public captureLogMetric(I)Lcom/huawei/lcagent/client/LogMetricInfo;
    .locals 7

    .line 464
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 465
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 468
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 469
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 470
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 471
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 472
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 473
    sget-object v0, Lcom/huawei/lcagent/client/LogMetricInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/lcagent/client/LogMetricInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 476
    :cond_0
    const/4 v5, 0x0

    goto :goto_0

    .line 479
    :catchall_0
    move-exception v6

    .line 480
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 481
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 482
    throw v6

    .line 480
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 481
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 483
    return-object v5
.end method

.method public clearLogMetric(J)V
    .locals 6

    .line 487
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 488
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 490
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 491
    invoke-virtual {v3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 492
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 493
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 495
    :catchall_0
    move-exception v5

    .line 496
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 497
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 498
    throw v5

    .line 496
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 497
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 499
    return-void
.end method

.method public configure(Ljava/lang/String;)I
    .locals 7

    .line 612
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 613
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 616
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 617
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 618
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 619
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 620
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 622
    :catchall_0
    move-exception v6

    .line 623
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 624
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 625
    throw v6

    .line 623
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 624
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 626
    return v5
.end method

.method public configureAPlogs(I)I
    .locals 7

    .line 766
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 767
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 770
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 771
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 772
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 773
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 774
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 776
    :catchall_0
    move-exception v6

    .line 777
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 778
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 779
    throw v6

    .line 777
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 778
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 780
    return v5
.end method

.method public configureBluetoothlogcat(ILjava/lang/String;)I
    .locals 7

    .line 728
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 729
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 732
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 733
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 734
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 735
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 736
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 737
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 739
    :catchall_0
    move-exception v6

    .line 740
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 741
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 742
    throw v6

    .line 740
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 741
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 743
    return v5
.end method

.method public configureCoredump(I)I
    .locals 7

    .line 784
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 785
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 788
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 789
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 790
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 791
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 792
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 794
    :catchall_0
    move-exception v6

    .line 795
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 796
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 797
    throw v6

    .line 795
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 796
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 798
    return v5
.end method

.method public configureGPS(I)I
    .locals 7

    .line 802
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 803
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 806
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 807
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 808
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 809
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 810
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 812
    :catchall_0
    move-exception v6

    .line 813
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 814
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 815
    throw v6

    .line 813
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 814
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 816
    return v5
.end method

.method public configureLogcat(ILjava/lang/String;)I
    .locals 7

    .line 747
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 748
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 751
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 752
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 753
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 754
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 755
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 756
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 758
    :catchall_0
    move-exception v6

    .line 759
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 760
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 761
    throw v6

    .line 759
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 760
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 762
    return v5
.end method

.method public configureModemlogcat(ILjava/lang/String;)I
    .locals 7

    .line 709
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 710
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 713
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 714
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 715
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 716
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 717
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 718
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 720
    :catchall_0
    move-exception v6

    .line 721
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 722
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 723
    throw v6

    .line 721
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 722
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 724
    return v5
.end method

.method public configureUserType(I)I
    .locals 7

    .line 560
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 561
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 564
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 565
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 566
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 567
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 568
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 570
    :catchall_0
    move-exception v6

    .line 571
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 572
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 573
    throw v6

    .line 571
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 572
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 574
    return v5
.end method

.method public configureWithPara(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 820
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 821
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 823
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 824
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 825
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 826
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 827
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 829
    :catchall_0
    move-exception v5

    .line 830
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 831
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 832
    throw v5

    .line 830
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 831
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 833
    return-void
.end method

.method public feedbackUploadResult(JI)I
    .locals 7

    .line 502
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 503
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 506
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 507
    invoke-virtual {v3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 508
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 509
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 510
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 511
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 513
    :catchall_0
    move-exception v6

    .line 514
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 515
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 516
    throw v6

    .line 514
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 515
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 517
    return v5
.end method

.method public forceUpload()I
    .locals 7

    .line 595
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 596
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 599
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 600
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 601
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 602
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 604
    :catchall_0
    move-exception v6

    .line 605
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 606
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 607
    throw v6

    .line 605
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 606
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 608
    return v5
.end method

.method public getCompressInfo()Lcom/huawei/lcagent/client/CompressInfo;
    .locals 7

    .line 837
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 838
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 841
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 842
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x1a

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 843
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 844
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 845
    sget-object v0, Lcom/huawei/lcagent/client/CompressInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/lcagent/client/CompressInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 848
    :cond_0
    const/4 v5, 0x0

    goto :goto_0

    .line 851
    :catchall_0
    move-exception v6

    .line 852
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 853
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 854
    throw v6

    .line 852
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 853
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 855
    return-object v5
.end method

.method public getFirstErrorTime()J
    .locals 8

    .line 655
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 656
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 659
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 660
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 661
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 662
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v5

    goto :goto_0

    .line 664
    :catchall_0
    move-exception v7

    .line 665
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 666
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 667
    throw v7

    .line 665
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 666
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 668
    return-wide v5
.end method

.method public getFirstErrorType()Ljava/lang/String;
    .locals 7

    .line 692
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 693
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 696
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 697
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 698
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 699
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    goto :goto_0

    .line 701
    :catchall_0
    move-exception v6

    .line 702
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 703
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 704
    throw v6

    .line 702
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 703
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 705
    return-object v5
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .line 354
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    return-object v0
.end method

.method public getUserType()I
    .locals 7

    .line 578
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 579
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 582
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 583
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 584
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 585
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 587
    :catchall_0
    move-exception v6

    .line 588
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 589
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 590
    throw v6

    .line 588
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 589
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 591
    return v5
.end method

.method public resetFirstErrorTime()I
    .locals 7

    .line 672
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 673
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 676
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 678
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 679
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 681
    :catchall_0
    move-exception v6

    .line 682
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 683
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 684
    throw v6

    .line 682
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 683
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 685
    return v5
.end method

.method public setMetricCommonHeader(I[BI)I
    .locals 7

    .line 381
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 382
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 385
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 387
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 388
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 389
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 390
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 391
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 393
    :catchall_0
    move-exception v6

    .line 394
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 395
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 396
    throw v6

    .line 394
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 395
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 397
    return v5
.end method

.method public setMetricStoargeHeader(I[BI)I
    .locals 7

    .line 361
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 362
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 365
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 366
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 367
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 368
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 369
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 370
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 371
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 373
    :catchall_0
    move-exception v6

    .line 374
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 375
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 376
    throw v6

    .line 374
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 375
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 377
    return v5
.end method

.method public setMetricStoargeTail(I[BI)I
    .locals 7

    .line 401
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 402
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 405
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 406
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 407
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 408
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 409
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 410
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 411
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 413
    :catchall_0
    move-exception v6

    .line 414
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 415
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 416
    throw v6

    .line 414
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 415
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 417
    return v5
.end method

.method public shouldSubmitMetric(II)Z
    .locals 7

    .line 442
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 443
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 446
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 447
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 448
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 449
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 450
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 451
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    goto :goto_1

    .line 453
    :catchall_0
    move-exception v6

    .line 454
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 455
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 456
    throw v6

    .line 454
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 455
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 457
    return v5
.end method

.method public submitMetric(II[BI)I
    .locals 7

    .line 421
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 422
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 425
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 426
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 427
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 428
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 429
    invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 430
    iget-object v0, p0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 431
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 432
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    goto :goto_0

    .line 434
    :catchall_0
    move-exception v6

    .line 435
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 436
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 437
    throw v6

    .line 435
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 436
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 438
    return v5
.end method
