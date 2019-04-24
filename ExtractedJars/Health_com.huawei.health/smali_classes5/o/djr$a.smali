.class public abstract Lo/djr$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/djr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/djr$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    invoke-virtual {p0, p0, v0}, Lo/djr$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lo/djr;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/djr;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lo/djr;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lo/djr$a$a;

    invoke-direct {v0, p0}, Lo/djr$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 36
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 40
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_3

    .line 44
    :sswitch_0
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 52
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    goto :goto_0

    .line 55
    :cond_0
    const/4 v2, 0x0

    .line 58
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 60
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v4

    .line 61
    invoke-virtual {p0, v2, v3, v4}, Lo/djr$a;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 62
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 63
    const/4 v0, 0x1

    return v0

    .line 67
    :sswitch_2
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 70
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    goto :goto_1

    .line 73
    :cond_1
    const/4 v2, 0x0

    .line 76
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 78
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v4

    .line 79
    invoke-virtual {p0, v2, v3, v4}, Lo/djr$a;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 80
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 81
    const/4 v0, 0x1

    return v0

    .line 85
    :sswitch_3
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 88
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    goto :goto_2

    .line 91
    :cond_2
    const/4 v2, 0x0

    .line 94
    :goto_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 96
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 97
    invoke-virtual {p0, v2, v3, v4}, Lo/djr$a;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;ILjava/lang/String;)V

    .line 98
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 99
    const/4 v0, 0x1

    return v0

    .line 102
    :goto_3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
