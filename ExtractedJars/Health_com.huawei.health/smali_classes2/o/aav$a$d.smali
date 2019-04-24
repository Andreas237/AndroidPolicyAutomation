.class Lo/aav$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aav;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aav$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private e:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 316
    iput-object p1, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    .line 317
    return-void
.end method


# virtual methods
.method public a(JIII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 452
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 453
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 455
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 456
    invoke-virtual {v3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 457
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 458
    invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 459
    invoke-virtual {v3, p5}, Landroid/os/Parcel;->writeInt(I)V

    .line 460
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 461
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 464
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 465
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 466
    goto :goto_0

    .line 464
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 465
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 466
    throw v5

    .line 467
    :goto_0
    return-void
.end method

.method public a(Lo/aay;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 559
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 560
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 562
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 563
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/aay;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 564
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 565
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 568
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 569
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 570
    goto :goto_1

    .line 568
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 569
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 570
    throw v5

    .line 571
    :goto_1
    return-void
.end method

.method public a(Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 346
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 347
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 349
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 350
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 351
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 352
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 356
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 357
    goto :goto_1

    .line 355
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 356
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 357
    throw v5

    .line 358
    :goto_1
    return-void
.end method

.method public a()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 434
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 435
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 438
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 439
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 440
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 441
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

    .line 444
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 445
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 446
    goto :goto_1

    .line 444
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 445
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 446
    throw v6

    .line 447
    :goto_1
    return v5
.end method

.method public a(Lo/abg;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 606
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 607
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 610
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 611
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/abg;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 612
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 613
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 614
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 617
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 618
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 619
    goto :goto_2

    .line 617
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 618
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 619
    throw v6

    .line 620
    :goto_2
    return v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 320
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 328
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 329
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 332
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 334
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 335
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 338
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 339
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 340
    goto :goto_0

    .line 338
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 339
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 340
    throw v6

    .line 341
    :goto_0
    return-object v5
.end method

.method public b(Lo/aay;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 575
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 576
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 578
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 579
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/aay;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 580
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 581
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 584
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 585
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 586
    goto :goto_1

    .line 584
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 585
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 586
    throw v5

    .line 587
    :goto_1
    return-void
.end method

.method public b(Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 663
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 664
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 666
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 667
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 668
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 669
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 672
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 673
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 674
    goto :goto_1

    .line 672
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 673
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 674
    throw v5

    .line 675
    :goto_1
    return-void
.end method

.method public b(Lo/abg;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 415
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 416
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 419
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 420
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/abg;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 421
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 422
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 423
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 426
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 427
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 428
    goto :goto_2

    .line 426
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 427
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 428
    throw v6

    .line 429
    :goto_2
    return v5
.end method

.method public c(Lo/aay;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 505
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 506
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 508
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 509
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/aay;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 510
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 511
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 514
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 515
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 516
    goto :goto_1

    .line 514
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 515
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 516
    throw v5

    .line 517
    :goto_1
    return-void
.end method

.method public c(Z)V
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
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 682
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 683
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 684
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 687
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 688
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 689
    goto :goto_1

    .line 687
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 688
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 689
    throw v5

    .line 690
    :goto_1
    return-void
.end method

.method public c()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 380
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 381
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 384
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 385
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 386
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 387
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

    .line 390
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 391
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 392
    goto :goto_1

    .line 390
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 391
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 392
    throw v6

    .line 393
    :goto_1
    return v5
.end method

.method public d(Lo/aay;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 729
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 730
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 732
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 733
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/aay;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 734
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 735
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 738
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 739
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 740
    goto :goto_1

    .line 738
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 739
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 740
    throw v5

    .line 741
    :goto_1
    return-void
.end method

.method public d(Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 744
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 745
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 747
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 748
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 749
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 750
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 753
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 754
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 755
    goto :goto_1

    .line 753
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 754
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 755
    throw v5

    .line 756
    :goto_1
    return-void
.end method

.method public d()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 362
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 363
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 366
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 367
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 368
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 369
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
    return v5
.end method

.method public d(Lo/abb;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 625
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 626
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 629
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 630
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/abb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 631
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 632
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 633
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 634
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 637
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 638
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 639
    goto :goto_2

    .line 637
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 638
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 639
    throw v6

    .line 640
    :goto_2
    return v5
.end method

.method public e()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 397
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 398
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 401
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 402
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 403
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 404
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 407
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 408
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 409
    goto :goto_0

    .line 407
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 408
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 409
    throw v6

    .line 410
    :goto_0
    return v5
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 521
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 522
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 524
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 525
    if-eqz p1, :cond_0

    .line 526
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 527
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 530
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 532
    :goto_0
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 533
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 536
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 537
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 538
    goto :goto_1

    .line 536
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 537
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 538
    throw v5

    .line 539
    :goto_1
    return-void
.end method

.method public e(Lo/aay;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 543
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 544
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 546
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 547
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/aay;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 548
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 549
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 553
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 554
    goto :goto_1

    .line 552
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 553
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 554
    throw v5

    .line 555
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

    .line 471
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 472
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 474
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 475
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 476
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 477
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 480
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 481
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 482
    goto :goto_1

    .line 480
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 481
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 482
    throw v5

    .line 483
    :goto_1
    return-void
.end method

.method public f(Lo/aay;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 791
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 792
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 794
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 795
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/aay;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 796
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1c

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 797
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 800
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 801
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 802
    goto :goto_1

    .line 800
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 801
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 802
    throw v5

    .line 803
    :goto_1
    return-void
.end method

.method public f()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 711
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 712
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 715
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 716
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 717
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 718
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

    .line 721
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 722
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 723
    goto :goto_1

    .line 721
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 722
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 723
    throw v6

    .line 724
    :goto_1
    return v5
.end method

.method public g()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 694
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 695
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 698
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 699
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 700
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 701
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

    .line 704
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 705
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 706
    goto :goto_1

    .line 704
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 705
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 706
    throw v6

    .line 707
    :goto_1
    return v5
.end method

.method public h()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 645
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 646
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 649
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 650
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 651
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 652
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

    .line 655
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 656
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 657
    goto :goto_1

    .line 655
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 656
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 657
    throw v6

    .line 658
    :goto_1
    return v5
.end method

.method public i()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 591
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 592
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 594
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 595
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 596
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 599
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 600
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 601
    goto :goto_0

    .line 599
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 600
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 601
    throw v5

    .line 602
    :goto_0
    return-void
.end method

.method public k()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 487
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 488
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 491
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 492
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 493
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 494
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

    .line 497
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 498
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 499
    goto :goto_1

    .line 497
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 498
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 499
    throw v6

    .line 500
    :goto_1
    return v5
.end method

.method public n()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 773
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 774
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 777
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 778
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1b

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 779
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 780
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 783
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 784
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 785
    goto :goto_0

    .line 783
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 784
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 785
    throw v6

    .line 786
    :goto_0
    return v5
.end method

.method public o()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 759
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 760
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 762
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 763
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1a

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 764
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 767
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 768
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 769
    goto :goto_0

    .line 767
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 768
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 769
    throw v5

    .line 770
    :goto_0
    return-void
.end method

.method public p()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 807
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 808
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 810
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 811
    iget-object v0, p0, Lo/aav$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1d

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 812
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 815
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 816
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 817
    goto :goto_0

    .line 815
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 816
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 817
    throw v5

    .line 818
    :goto_0
    return-void
.end method
