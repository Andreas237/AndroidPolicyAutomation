.class Lo/eep$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eep;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eep$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 270
    iput-object p1, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    .line 271
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lo/eet;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 347
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 348
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 351
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 352
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 353
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/eet;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 354
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 355
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 356
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 357
    :goto_1
    goto :goto_2

    .line 358
    :catchall_0
    move-exception v6

    .line 359
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 360
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 361
    throw v6

    .line 359
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 360
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 362
    return v5
.end method

.method public a()[Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 305
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 306
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 309
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 310
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 311
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 312
    invoke-virtual {v4}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 313
    goto :goto_0

    .line 314
    :catchall_0
    move-exception v6

    .line 315
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 316
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 317
    throw v6

    .line 315
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 316
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 318
    return-object v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 274
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 447
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 448
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 451
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 452
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 453
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 454
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 455
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 456
    goto :goto_0

    .line 458
    :cond_0
    const/4 v5, 0x0

    .line 460
    goto :goto_0

    .line 461
    :catchall_0
    move-exception v6

    .line 462
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 463
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 464
    throw v6

    .line 462
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 463
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 465
    return-object v5
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 605
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 606
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 609
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 610
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 611
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 612
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 613
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 614
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 615
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 616
    :goto_0
    goto :goto_1

    .line 617
    :catchall_0
    move-exception v6

    .line 618
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 619
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 620
    throw v6

    .line 618
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 619
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 621
    return v5
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;IJ)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 369
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 370
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 373
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 374
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 375
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 376
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 377
    invoke-virtual {v3, p4, p5}, Landroid/os/Parcel;->writeLong(J)V

    .line 378
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 379
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 380
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 381
    :goto_0
    goto :goto_1

    .line 382
    :catchall_0
    move-exception v6

    .line 383
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 384
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 385
    throw v6

    .line 383
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 384
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 386
    return v5
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;IJLcom/huawei/systemserver/activityrecognition/OtherParameters;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 393
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 394
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 397
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 398
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 399
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 400
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 401
    invoke-virtual {v3, p4, p5}, Landroid/os/Parcel;->writeLong(J)V

    .line 402
    if-eqz p6, :cond_0

    .line 403
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 404
    const/4 v0, 0x0

    invoke-virtual {p6, v3, v0}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->writeToParcel(Landroid/os/Parcel;I)V

    .line 405
    goto :goto_0

    .line 407
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 409
    :goto_0
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 410
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 411
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 412
    :goto_1
    goto :goto_2

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
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 415
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 417
    return v5
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/systemserver/activityrecognition/OtherParameters;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 529
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 530
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 533
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 534
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 535
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 536
    if-eqz p3, :cond_0

    .line 537
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 538
    const/4 v0, 0x0

    invoke-virtual {p3, v3, v0}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->writeToParcel(Landroid/os/Parcel;I)V

    .line 539
    goto :goto_0

    .line 541
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 543
    :goto_0
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 544
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 545
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 546
    :goto_1
    goto :goto_2

    .line 547
    :catchall_0
    move-exception v6

    .line 548
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 549
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 550
    throw v6

    .line 548
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 549
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 551
    return v5
.end method

.method public c()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 285
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 286
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 289
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 290
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 291
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 292
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 293
    goto :goto_0

    .line 294
    :catchall_0
    move-exception v6

    .line 295
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 296
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 297
    throw v6

    .line 295
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 296
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 298
    return v5
.end method

.method public d()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 469
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 470
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 473
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 474
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 475
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 476
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 477
    :goto_0
    goto :goto_1

    .line 478
    :catchall_0
    move-exception v6

    .line 479
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 480
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 481
    throw v6

    .line 479
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 480
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 482
    return v5
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 424
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 425
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 428
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 429
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 430
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 431
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 432
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 433
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 434
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 435
    :goto_0
    goto :goto_1

    .line 436
    :catchall_0
    move-exception v6

    .line 437
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 438
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 439
    throw v6

    .line 437
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 438
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 440
    return v5
.end method

.method public d(Ljava/lang/String;Lo/eet;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 325
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 326
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 329
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 330
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 331
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/eet;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 332
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 333
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 334
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 335
    :goto_1
    goto :goto_2

    .line 336
    :catchall_0
    move-exception v6

    .line 337
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 338
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 339
    throw v6

    .line 337
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 338
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 340
    return v5
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;IJLcom/huawei/systemserver/activityrecognition/OtherParameters;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 577
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 578
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 581
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 582
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 583
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 584
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 585
    invoke-virtual {v3, p4, p5}, Landroid/os/Parcel;->writeLong(J)V

    .line 586
    if-eqz p6, :cond_0

    .line 587
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 588
    const/4 v0, 0x0

    invoke-virtual {p6, v3, v0}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->writeToParcel(Landroid/os/Parcel;I)V

    .line 589
    goto :goto_0

    .line 591
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 593
    :goto_0
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 594
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 595
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 596
    :goto_1
    goto :goto_2

    .line 597
    :catchall_0
    move-exception v6

    .line 598
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 599
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 600
    throw v6

    .line 598
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 599
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 601
    return v5
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/systemserver/activityrecognition/OtherParameters;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 503
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 504
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 507
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 508
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 509
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 510
    if-eqz p3, :cond_0

    .line 511
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 512
    const/4 v0, 0x0

    invoke-virtual {p3, v3, v0}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->writeToParcel(Landroid/os/Parcel;I)V

    .line 513
    goto :goto_0

    .line 515
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 517
    :goto_0
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 518
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 519
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 520
    :goto_1
    goto :goto_2

    .line 521
    :catchall_0
    move-exception v6

    .line 522
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 523
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 524
    throw v6

    .line 522
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 523
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 525
    return v5
.end method

.method public e()[Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 486
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 487
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 490
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 491
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 492
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 493
    invoke-virtual {v4}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 494
    goto :goto_0

    .line 495
    :catchall_0
    move-exception v6

    .line 496
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 497
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 498
    throw v6

    .line 496
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 497
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 499
    return-object v5
.end method

.method public h()Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;
    .locals 7
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

    .line 559
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 560
    iget-object v0, p0, Lo/eep$a$b;->a:Landroid/os/IBinder;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 561
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 562
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 564
    goto :goto_0

    .line 566
    :cond_0
    const/4 v5, 0x0

    .line 568
    goto :goto_0

    .line 569
    :catchall_0
    move-exception v6

    .line 570
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 571
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 572
    throw v6

    .line 570
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 571
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 573
    return-object v5
.end method
