.class public abstract Lo/abf$e;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/abf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/abf$e$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p0, p0, v0}, Lo/abf$e;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public static c(Landroid/os/IBinder;)Lo/abf;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/abf;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lo/abf;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lo/abf$e$d;

    invoke-direct {v0, p0}, Lo/abf$e$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 36
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 40
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 44
    :sswitch_0
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lo/abf$e;->d()I

    move-result v1

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    const/4 v0, 0x1

    return v0

    .line 57
    :sswitch_2
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/abd$a;->c(Landroid/os/IBinder;)Lo/abd;

    move-result-object v1

    .line 60
    invoke-virtual {p0, v1}, Lo/abf$e;->a(Lo/abd;)V

    .line 61
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 62
    const/4 v0, 0x1

    return v0

    .line 66
    :sswitch_3
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/abd$a;->c(Landroid/os/IBinder;)Lo/abd;

    move-result-object v1

    .line 69
    invoke-virtual {p0, v1}, Lo/abf$e;->c(Lo/abd;)V

    .line 70
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 71
    const/4 v0, 0x1

    return v0

    .line 75
    :sswitch_4
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p0}, Lo/abf$e;->a()V

    .line 77
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 78
    const/4 v0, 0x1

    return v0

    .line 82
    :sswitch_5
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Lo/abf$e;->e()V

    .line 84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 85
    const/4 v0, 0x1

    return v0

    .line 89
    :sswitch_6
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0}, Lo/abf$e;->c()V

    .line 91
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 92
    const/4 v0, 0x1

    return v0

    .line 96
    :sswitch_7
    const-string v0, "com.huawei.health.ITrackSportManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0}, Lo/abf$e;->b()V

    .line 98
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 99
    const/4 v0, 0x1

    return v0

    .line 102
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
