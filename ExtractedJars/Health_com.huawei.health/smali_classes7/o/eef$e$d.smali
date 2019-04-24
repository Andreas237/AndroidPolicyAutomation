.class Lo/eef$e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eef;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eef$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 322
    iput-object p1, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    .line 323
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lo/eed;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 676
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 677
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 680
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 681
    if-eqz p1, :cond_0

    .line 682
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 683
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 686
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 688
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/eed;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 689
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 690
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 691
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 692
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 695
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 696
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 697
    goto :goto_2

    .line 695
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 696
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 698
    :goto_2
    return v5
.end method

.method public a(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eee;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 404
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 405
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 408
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 409
    if-eqz p1, :cond_0

    .line 410
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 411
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 414
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 416
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/eee;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 417
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 418
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 419
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 420
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 423
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 424
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 425
    goto :goto_2

    .line 423
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 424
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 426
    :goto_2
    return v5
.end method

.method public a(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 456
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 457
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 460
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 461
    if-eqz p1, :cond_0

    .line 462
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 463
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/UserReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 466
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 468
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/edy;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 469
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 470
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 471
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 472
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 475
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 476
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 477
    goto :goto_2

    .line 475
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 476
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 478
    :goto_2
    return v5
.end method

.method public a(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupListResp;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 616
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 617
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 620
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 621
    if-eqz p1, :cond_0

    .line 622
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 623
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 626
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 628
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 629
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 630
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 631
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 632
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 635
    :cond_1
    const/4 v5, 0x0

    .line 639
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 640
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 641
    goto :goto_2

    .line 639
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 640
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 642
    :goto_2
    return-object v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 326
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eei;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 378
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 379
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 382
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 383
    if-eqz p1, :cond_0

    .line 384
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 385
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 388
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 390
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/eei;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 391
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 392
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 393
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 394
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 397
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 398
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 399
    goto :goto_2

    .line 397
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 398
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 400
    :goto_2
    return v5
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Lo/eec;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 534
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 535
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 538
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 539
    if-eqz p1, :cond_0

    .line 540
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 541
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 544
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 546
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/eec;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 547
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 548
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 549
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 550
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 553
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 554
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 555
    goto :goto_2

    .line 553
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 554
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 556
    :goto_2
    return v5
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 430
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 431
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 434
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 435
    if-eqz p1, :cond_0

    .line 436
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 437
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/UserReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 440
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 442
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/edy;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 443
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 444
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 445
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 446
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 449
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 450
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 451
    goto :goto_2

    .line 449
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 450
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 452
    :goto_2
    return v5
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/eeg;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 352
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 353
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 356
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 357
    if-eqz p1, :cond_0

    .line 358
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 359
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/UserReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 362
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 364
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/eeg;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 365
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 366
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 367
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 368
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 371
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 372
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 373
    goto :goto_2

    .line 371
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 372
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 374
    :goto_2
    return v5
.end method

.method public c(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 586
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 587
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 590
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 591
    if-eqz p1, :cond_0

    .line 592
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 593
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 596
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 598
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 599
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 600
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 601
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 602
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 605
    :cond_1
    const/4 v5, 0x0

    .line 609
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 610
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 611
    goto :goto_2

    .line 609
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 610
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 612
    :goto_2
    return-object v5
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;Lo/eea;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 560
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 561
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 564
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 565
    if-eqz p1, :cond_0

    .line 566
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 567
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 570
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 572
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/eea;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 573
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 574
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 575
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 576
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 579
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 580
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 581
    goto :goto_2

    .line 579
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 580
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 582
    :goto_2
    return v5
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Lo/eeb;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 508
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 509
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 512
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 513
    if-eqz p1, :cond_0

    .line 514
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 515
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 518
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 520
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/eeb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 521
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 522
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 523
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 524
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 527
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 528
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 529
    goto :goto_2

    .line 527
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 528
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 530
    :goto_2
    return v5
.end method

.method public d(Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 334
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 335
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 338
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 339
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 340
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 341
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 342
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 345
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 346
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 347
    goto :goto_0

    .line 345
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 346
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 348
    :goto_0
    return v5
.end method

.method public e(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 482
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 483
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 486
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 487
    if-eqz p1, :cond_0

    .line 488
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 489
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/UserReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 492
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 494
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/edy;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 495
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 496
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 497
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 498
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 501
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 502
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 503
    goto :goto_2

    .line 501
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 502
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 504
    :goto_2
    return v5
.end method

.method public e(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 646
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 647
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 650
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 651
    if-eqz p1, :cond_0

    .line 652
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 653
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 656
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 658
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 659
    iget-object v0, p0, Lo/eef$e$d;->a:Landroid/os/IBinder;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 660
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 661
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 662
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 665
    :cond_1
    const/4 v5, 0x0

    .line 669
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 670
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 671
    goto :goto_2

    .line 669
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 670
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 672
    :goto_2
    return-object v5
.end method
