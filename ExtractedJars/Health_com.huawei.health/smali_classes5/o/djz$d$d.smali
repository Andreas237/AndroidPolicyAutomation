.class Lo/djz$d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/djz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djz$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 303
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 304
    iput-object p1, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    .line 305
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 396
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 397
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 400
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 401
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 402
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 403
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    .line 404
    invoke-virtual {v4, v6}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 407
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 408
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 409
    goto :goto_0

    .line 407
    :catchall_0
    move-exception v7

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 408
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 409
    throw v7

    .line 410
    :goto_0
    return-object v5
.end method

.method public a(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 531
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 532
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 534
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 535
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 536
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 537
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 538
    if-eqz p4, :cond_0

    invoke-interface {p4}, Lo/djp;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 539
    invoke-virtual {v3, p5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 540
    invoke-virtual {v3, p6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 541
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 542
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 545
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 546
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 547
    goto :goto_1

    .line 545
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 546
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 547
    throw v5

    .line 548
    :goto_1
    return-void
.end method

.method public a(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 316
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 317
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 319
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 320
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 321
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 322
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 324
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 328
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 329
    goto :goto_0

    .line 327
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 328
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 329
    throw v5

    .line 330
    :goto_0
    return-void
.end method

.method public a(Lo/djr;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 465
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 466
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 468
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 469
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/djr;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 470
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 471
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 474
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 475
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 476
    goto :goto_1

    .line 474
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 475
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 476
    throw v5

    .line 477
    :goto_1
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 643
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 644
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 646
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 647
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 648
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 651
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 652
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 653
    goto :goto_0

    .line 651
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 652
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 653
    throw v5

    .line 654
    :goto_0
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 379
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 380
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 383
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 384
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 385
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 386
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 389
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 390
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 391
    goto :goto_0

    .line 389
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 390
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 391
    throw v6

    .line 392
    :goto_0
    return-object v5
.end method

.method public c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 593
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 594
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 596
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 597
    if-eqz p1, :cond_0

    .line 598
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 599
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 602
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 604
    :goto_0
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 605
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 608
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 609
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 610
    goto :goto_1

    .line 608
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 609
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 610
    throw v5

    .line 611
    :goto_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 660
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 661
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 663
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 664
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 665
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 666
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 669
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 670
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 671
    goto :goto_0

    .line 669
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 670
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 671
    throw v5

    .line 672
    :goto_0
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 555
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 556
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 558
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 559
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 560
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 561
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 564
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 565
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 566
    goto :goto_0

    .line 564
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 565
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 566
    throw v5

    .line 567
    :goto_0
    return-void
.end method

.method public c(Lo/djs;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 761
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 762
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 764
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 765
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/djs;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 766
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 767
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 770
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 771
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 772
    goto :goto_1

    .line 770
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 771
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 772
    throw v5

    .line 773
    :goto_1
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 337
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 338
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 341
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 343
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 344
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 347
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 348
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 349
    goto :goto_0

    .line 347
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 348
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 349
    throw v6

    .line 350
    :goto_0
    return-object v5
.end method

.method public d(IILo/djt;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 741
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 742
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 744
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 745
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 746
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 747
    if-eqz p3, :cond_0

    invoke-interface {p3}, Lo/djt;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 748
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 749
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 752
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 753
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 754
    goto :goto_1

    .line 752
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 753
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 754
    throw v5

    .line 755
    :goto_1
    return-void
.end method

.method public d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 678
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 679
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 681
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 682
    if-eqz p1, :cond_0

    .line 683
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 684
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 687
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 689
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/djv;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 690
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 691
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 694
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 695
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 696
    goto :goto_2

    .line 694
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 695
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 696
    throw v5

    .line 697
    :goto_2
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 797
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 798
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 800
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 801
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 802
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 803
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 806
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 807
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 808
    goto :goto_0

    .line 806
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 807
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 808
    throw v5

    .line 809
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/djw;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 621
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 622
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 624
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 625
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 626
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 627
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 628
    invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 629
    if-eqz p5, :cond_0

    invoke-interface {p5}, Lo/djw;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 630
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 631
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 634
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 635
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 636
    goto :goto_1

    .line 634
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 635
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 636
    throw v5

    .line 637
    :goto_1
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 574
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 575
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 577
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 578
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 579
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 580
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 583
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 584
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 585
    goto :goto_0

    .line 583
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 584
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 585
    throw v5

    .line 586
    :goto_0
    return-void
.end method

.method public d(Lo/djr;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 445
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 446
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 448
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 449
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/djr;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 450
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 451
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 454
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 455
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 456
    goto :goto_1

    .line 454
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 455
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 456
    throw v5

    .line 457
    :goto_1
    return-void
.end method

.method public e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 357
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 358
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 361
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 362
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 363
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 364
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 365
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 368
    :cond_0
    const/4 v5, 0x0

    .line 372
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 373
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 374
    goto :goto_1

    .line 372
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 373
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 374
    throw v6

    .line 375
    :goto_1
    return-object v5
.end method

.method public e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 506
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 507
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 509
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 510
    if-eqz p1, :cond_0

    .line 511
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 512
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 515
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 517
    :goto_0
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 518
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 521
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 522
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 523
    goto :goto_1

    .line 521
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 522
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 523
    throw v5

    .line 524
    :goto_1
    return-void
.end method

.method public e(Lo/djs;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 779
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 780
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 782
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 783
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/djs;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 784
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 785
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 788
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 789
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 790
    goto :goto_1

    .line 788
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 789
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 790
    throw v5

    .line 791
    :goto_1
    return-void
.end method

.method public e(Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 703
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 704
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 706
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 707
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 708
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 709
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 712
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 713
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 714
    goto :goto_1

    .line 712
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 713
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 714
    throw v5

    .line 715
    :goto_1
    return-void
.end method

.method public g()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 815
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 816
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 819
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 820
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 821
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 822
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 825
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 826
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 827
    goto :goto_1

    .line 825
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 826
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 827
    throw v6

    .line 828
    :goto_1
    return v5
.end method

.method public k()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 721
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 722
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 725
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 726
    iget-object v0, p0, Lo/djz$d$d;->c:Landroid/os/IBinder;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 727
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 728
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 731
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 732
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 733
    goto :goto_1

    .line 731
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 732
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 733
    throw v6

    .line 734
    :goto_1
    return v5
.end method
