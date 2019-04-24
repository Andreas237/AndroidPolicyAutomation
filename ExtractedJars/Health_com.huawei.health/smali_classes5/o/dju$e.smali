.class public abstract Lo/dju$e;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/dju;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dju;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dju$e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 18
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-virtual {p0, p0, v0}, Lo/dju$e;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public static e(Landroid/os/IBinder;)Lo/dju;
    .locals 2

    .line 26
    if-nez p0, :cond_0

    .line 27
    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/dju;

    if-eqz v0, :cond_1

    .line 31
    move-object v0, v1

    check-cast v0, Lo/dju;

    return-object v0

    .line 33
    :cond_1
    new-instance v0, Lo/dju$e$b;

    invoke-direct {v0, p0}, Lo/dju$e$b;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 37
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 41
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 45
    :sswitch_0
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x1

    return v0

    .line 50
    :sswitch_1
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Lo/dju$e;->e()V

    .line 52
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 53
    const/4 v0, 0x1

    return v0

    .line 57
    :sswitch_2
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Lo/dju$e;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v1

    .line 59
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 60
    if-eqz v1, :cond_0

    .line 61
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    const/4 v0, 0x1

    invoke-virtual {v1, p3, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 65
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 71
    :sswitch_3
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 74
    invoke-virtual {p0, v1}, Lo/dju$e;->d(I)V

    .line 75
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 76
    const/4 v0, 0x1

    return v0

    .line 80
    :sswitch_4
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 82
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djq$b;->d(Landroid/os/IBinder;)Lo/djq;

    move-result-object v1

    .line 83
    invoke-virtual {p0, v1}, Lo/dju$e;->d(Lo/djq;)V

    .line 84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 85
    const/4 v0, 0x1

    return v0

    .line 89
    :sswitch_5
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0}, Lo/dju$e;->a()V

    .line 91
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 92
    const/4 v0, 0x1

    return v0

    .line 95
    :goto_1
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
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
