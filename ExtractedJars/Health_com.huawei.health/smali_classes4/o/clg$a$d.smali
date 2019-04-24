.class Lo/clg$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/clg$a;
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

    .line 582
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 583
    iput-object p1, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    .line 584
    return-void
.end method


# virtual methods
.method public a(ILcom/huawei/hihealth/HiHealthUnit;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1234
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1235
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1237
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1238
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1239
    if-eqz p2, :cond_0

    .line 1240
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1241
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Lcom/huawei/hihealth/HiHealthUnit;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1244
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1246
    :goto_0
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1247
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1250
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1251
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1252
    goto :goto_1

    .line 1250
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1251
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1252
    throw v5

    .line 1253
    :goto_1
    return-void
.end method

.method public a(Lcom/huawei/hihealth/HiAppInfo;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 598
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 599
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 601
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 602
    if-eqz p1, :cond_0

    .line 603
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 604
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiAppInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 607
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 609
    :goto_0
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 610
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 613
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 614
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 615
    goto :goto_1

    .line 613
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 614
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 615
    throw v5

    .line 616
    :goto_1
    return-void
.end method

.method public a(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/clk;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1018
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1019
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1021
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1022
    if-eqz p1, :cond_0

    .line 1023
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1024
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1027
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1029
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 1030
    if-eqz p3, :cond_1

    invoke-interface {p3}, Lo/clk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1031
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1032
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1035
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1036
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1037
    goto :goto_2

    .line 1035
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1036
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1037
    throw v5

    .line 1038
    :goto_2
    return-void
.end method

.method public a(Ljava/util/List;Lo/clm;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 777
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 778
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 780
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 781
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 782
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/clm;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 783
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 784
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 787
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 788
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 789
    goto :goto_1

    .line 787
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 788
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 789
    throw v5

    .line 790
    :goto_1
    return-void
.end method

.method public a(Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1087
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1088
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1090
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1091
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cli;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1092
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1093
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1096
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1097
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1098
    goto :goto_1

    .line 1096
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1097
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1098
    throw v5

    .line 1099
    :goto_1
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1566
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1567
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1570
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1571
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1572
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x26

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1573
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1574
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

    .line 1577
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1578
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1579
    goto :goto_1

    .line 1577
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1578
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1579
    throw v6

    .line 1580
    :goto_1
    return v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 587
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 990
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 991
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 994
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 995
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 996
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 997
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 998
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1001
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1002
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1003
    goto :goto_0

    .line 1001
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1002
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1003
    throw v6

    .line 1004
    :goto_0
    return v5
.end method

.method public b(ILjava/util/List;Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1471
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1472
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1474
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1475
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1476
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 1477
    if-eqz p3, :cond_0

    invoke-interface {p3}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1478
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x22

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1479
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1482
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1483
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1484
    goto :goto_1

    .line 1482
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1483
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1484
    throw v5

    .line 1485
    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiAuthorizationOption;Lo/clc;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 647
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 648
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 650
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 651
    if-eqz p1, :cond_0

    .line 652
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 653
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiAuthorizationOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 656
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 658
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/clc;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 659
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 660
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 663
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 664
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 665
    goto :goto_2

    .line 663
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 664
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 665
    throw v5

    .line 666
    :goto_2
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;Ljava/util/List;Lo/clk;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1052
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1053
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1055
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1056
    if-eqz p1, :cond_0

    .line 1057
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1058
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1061
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1063
    :goto_0
    if-eqz p2, :cond_1

    .line 1064
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1065
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Lcom/huawei/hihealth/HiUserInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1068
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1070
    :goto_1
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 1071
    if-eqz p4, :cond_2

    invoke-interface {p4}, Lo/clk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1072
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1073
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1076
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1077
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1078
    goto :goto_3

    .line 1076
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1077
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1078
    throw v5

    .line 1079
    :goto_3
    return-void
.end method

.method public b(Ljava/util/List;Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1369
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1370
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1372
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1373
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 1374
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1375
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1d

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1376
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1379
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1380
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1381
    goto :goto_1

    .line 1379
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1380
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1381
    throw v5

    .line 1382
    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiUserPreference;Z)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1512
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1513
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1516
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1517
    if-eqz p1, :cond_0

    .line 1518
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1519
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiUserPreference;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1522
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1524
    :goto_0
    if-eqz p2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1525
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x24

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1526
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1527
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .line 1530
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1531
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1532
    goto :goto_3

    .line 1530
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1531
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1532
    throw v6

    .line 1533
    :goto_3
    return v5
.end method

.method public c(I)Lcom/huawei/hihealth/HiHealthUnit;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1203
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1204
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1207
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1208
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1209
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1210
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1211
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1212
    sget-object v0, Lcom/huawei/hihealth/HiHealthUnit;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthUnit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1215
    :cond_0
    const/4 v5, 0x0

    .line 1219
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1220
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1221
    goto :goto_1

    .line 1219
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1220
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1221
    throw v6

    .line 1222
    :goto_1
    return-object v5
.end method

.method public c(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1540
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1541
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1544
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1545
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1546
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x25

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1547
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1548
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1549
    sget-object v0, Lcom/huawei/hihealth/HiUserPreference;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiUserPreference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1552
    :cond_0
    const/4 v5, 0x0

    .line 1556
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1557
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1558
    goto :goto_1

    .line 1556
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1557
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1558
    throw v6

    .line 1559
    :goto_1
    return-object v5
.end method

.method public c()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1388
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1389
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1391
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1392
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1e

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1393
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1396
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1397
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1398
    goto :goto_0

    .line 1396
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1397
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1398
    throw v5

    .line 1399
    :goto_0
    return-void
.end method

.method public c(ILjava/lang/String;Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1178
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1179
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1181
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1182
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1183
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1184
    if-eqz p3, :cond_0

    invoke-interface {p3}, Lo/cli;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1185
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1186
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1189
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1190
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1191
    goto :goto_1

    .line 1189
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1190
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1191
    throw v5

    .line 1192
    :goto_1
    return-void
.end method

.method public c(ILo/cln;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 684
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 685
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 687
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 688
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 689
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/cln;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 690
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x4

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
    goto :goto_1

    .line 694
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 695
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 696
    throw v5

    .line 697
    :goto_1
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiAggregateOption;Lo/clb;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 802
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 803
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 805
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 806
    if-eqz p1, :cond_0

    .line 807
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 808
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 811
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 813
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/clb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 814
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 815
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 818
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 819
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 820
    goto :goto_2

    .line 818
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 819
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 820
    throw v5

    .line 821
    :goto_2
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/clh;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 852
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 853
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 855
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 856
    if-eqz p1, :cond_0

    .line 857
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 858
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 861
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 863
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/clh;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 864
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 865
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 868
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 869
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 870
    goto :goto_2

    .line 868
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 869
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 870
    throw v5

    .line 871
    :goto_2
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiUserInfo;Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1293
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1294
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1296
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1297
    if-eqz p1, :cond_0

    .line 1298
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1299
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiUserInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1302
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1304
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1305
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1a

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1306
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1309
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1310
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1311
    goto :goto_2

    .line 1309
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1310
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1311
    throw v5

    .line 1312
    :goto_2
    return-void
.end method

.method public c(Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1452
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1453
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1455
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1456
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1457
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x21

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1458
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1461
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1462
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1463
    goto :goto_1

    .line 1461
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1462
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1463
    throw v5

    .line 1464
    :goto_1
    return-void
.end method

.method public c(Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1129
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1130
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1132
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1133
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cli;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1134
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1135
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1138
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1139
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1140
    goto :goto_1

    .line 1138
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1139
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1140
    throw v5

    .line 1141
    :goto_1
    return-void
.end method

.method public d(Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 972
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 973
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 976
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 977
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 978
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 979
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 980
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 983
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 984
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 985
    goto :goto_0

    .line 983
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 984
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 985
    throw v6

    .line 986
    :goto_0
    return v5
.end method

.method public d()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 622
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 623
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 625
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 626
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 627
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 630
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 631
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 632
    goto :goto_0

    .line 630
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 631
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 632
    throw v5

    .line 633
    :goto_0
    return-void
.end method

.method public d(ILcom/huawei/hihealth/HiTimeInterval;Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1265
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1266
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1268
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1269
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1270
    if-eqz p2, :cond_0

    .line 1271
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1272
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Lcom/huawei/hihealth/HiTimeInterval;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1275
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1277
    :goto_0
    if-eqz p3, :cond_1

    invoke-interface {p3}, Lo/cli;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1278
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1279
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1282
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1283
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1284
    goto :goto_2

    .line 1282
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1283
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1284
    throw v5

    .line 1285
    :goto_2
    return-void
.end method

.method public d(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 916
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 917
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 919
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 920
    if-eqz p1, :cond_0

    .line 921
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 922
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiDataReadOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 925
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 927
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/clj;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 928
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 929
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 932
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 933
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 934
    goto :goto_2

    .line 932
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 933
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 934
    throw v5

    .line 935
    :goto_2
    return-void
.end method

.method public d(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/clh;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 950
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 951
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 953
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 954
    if-eqz p1, :cond_0

    .line 955
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 956
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiDataUpdateOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 959
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 961
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/clh;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 962
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 963
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 966
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 967
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 968
    goto :goto_2

    .line 966
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 967
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 968
    throw v5

    .line 969
    :goto_2
    return-void
.end method

.method public d(Ljava/util/List;Lo/cld;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 824
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 825
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 827
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 828
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 829
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/cld;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 830
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 831
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 834
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 835
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 836
    goto :goto_1

    .line 834
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 835
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 836
    throw v5

    .line 837
    :goto_1
    return-void
.end method

.method public d(Ljava/util/List;Lo/clo;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 714
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 715
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 717
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 718
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 719
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/clo;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 720
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 721
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 724
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 725
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 726
    goto :goto_1

    .line 724
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 725
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 726
    throw v5

    .line 727
    :goto_1
    return-void
.end method

.method public d(Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1319
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1320
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1322
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1323
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1324
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1b

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1325
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1328
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1329
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1330
    goto :goto_1

    .line 1328
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1329
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1330
    throw v5

    .line 1331
    :goto_1
    return-void
.end method

.method public d(Lo/clf;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1607
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1608
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1610
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1611
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/clf;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1612
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x28

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1613
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1616
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1617
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1618
    goto :goto_1

    .line 1616
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1617
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1618
    throw v5

    .line 1619
    :goto_1
    return-void
.end method

.method public e()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1584
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1585
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1588
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1589
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x27

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1590
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1591
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1594
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1595
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1596
    goto :goto_0

    .line 1594
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1595
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1596
    throw v6

    .line 1597
    :goto_0
    return v5
.end method

.method public e(IILo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1492
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1493
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1495
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1496
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1497
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1498
    if-eqz p3, :cond_0

    invoke-interface {p3}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1499
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x23

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1500
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1503
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1504
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1505
    goto :goto_1

    .line 1503
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1504
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1505
    throw v5

    .line 1506
    :goto_1
    return-void
.end method

.method public e(ILo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1152
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1153
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1155
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1156
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1157
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lo/cli;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1158
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1159
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1162
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1163
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1164
    goto :goto_1

    .line 1162
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1163
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1164
    throw v5

    .line 1165
    :goto_1
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiAccountInfo;Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1407
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1408
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1410
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1411
    if-eqz p1, :cond_0

    .line 1412
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1413
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiAccountInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1416
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1418
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1419
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1f

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1420
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1423
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1424
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1425
    goto :goto_2

    .line 1423
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1424
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1425
    throw v5

    .line 1426
    :goto_2
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/clh;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 886
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 887
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 889
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 890
    if-eqz p1, :cond_0

    .line 891
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 892
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiDataDeleteOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 895
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 897
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/clh;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 898
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 899
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 902
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 903
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 904
    goto :goto_2

    .line 902
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 903
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 904
    throw v5

    .line 905
    :goto_2
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiSyncOption;Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1341
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1342
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1344
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1345
    if-eqz p1, :cond_0

    .line 1346
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1347
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1350
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1352
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1353
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x1c

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1354
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1357
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1358
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1359
    goto :goto_2

    .line 1357
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1358
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1359
    throw v5

    .line 1360
    :goto_2
    return-void
.end method

.method public e(Lo/cla;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1433
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1434
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1436
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1437
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cla;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1438
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x20

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1439
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1442
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1443
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1444
    goto :goto_1

    .line 1442
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1443
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1444
    throw v5

    .line 1445
    :goto_1
    return-void
.end method

.method public e(Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1108
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1109
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1111
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1112
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cli;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1113
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1114
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1117
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1118
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1119
    goto :goto_1

    .line 1117
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1118
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1119
    throw v5

    .line 1120
    :goto_1
    return-void
.end method

.method public e(IILcom/huawei/hihealth/HiSubscribeTrigger;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 743
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 744
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 747
    const-string v0, "com.huawei.hihealth.IHiHealth"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 748
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 749
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 750
    if-eqz p3, :cond_0

    .line 751
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 752
    const/4 v0, 0x0

    invoke-virtual {p3, v3, v0}, Lcom/huawei/hihealth/HiSubscribeTrigger;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 755
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 757
    :goto_0
    iget-object v0, p0, Lo/clg$a$d;->e:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 758
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 759
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

    .line 762
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 763
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 764
    goto :goto_2

    .line 762
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 763
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 764
    throw v6

    .line 765
    :goto_2
    return v5
.end method
