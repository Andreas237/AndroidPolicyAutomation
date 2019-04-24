.class public abstract Lo/dsr$c;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/dsr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dsr$c$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p0, p0, v0}, Lo/dsr$c;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static c(Landroid/os/IBinder;)Lo/dsr;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/dsr;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lo/dsr;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lo/dsr$c$d;

    invoke-direct {v0, p0}, Lo/dsr$c$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 42
    :sswitch_0
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/dsw$d;->e(Landroid/os/IBinder;)Lo/dsw;

    move-result-object v1

    .line 50
    invoke-virtual {p0, v1}, Lo/dsr$c;->a(Lo/dsw;)V

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    const/4 v0, 0x1

    return v0

    .line 56
    :sswitch_2
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/dsw$d;->e(Landroid/os/IBinder;)Lo/dsw;

    move-result-object v1

    .line 59
    invoke-virtual {p0, v1}, Lo/dsr$c;->c(Lo/dsw;)V

    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    const/4 v0, 0x1

    return v0

    .line 65
    :sswitch_3
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0}, Lo/dsr$c;->b()V

    .line 67
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 68
    const/4 v0, 0x1

    return v0

    .line 72
    :sswitch_4
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-virtual {p0, v1}, Lo/dsr$c;->d(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 77
    const/4 v0, 0x1

    return v0

    .line 81
    :sswitch_5
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 85
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 86
    invoke-virtual {p0, v1, v2}, Lo/dsr$c;->e(ILjava/lang/String;)V

    .line 87
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 88
    const/4 v0, 0x1

    return v0

    .line 92
    :sswitch_6
    const-string v0, "com.huawei.multisimservice.IAttachedDeviceMultiSim"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 94
    sget-object v0, Lcom/huawei/multisimservice/model/SimInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    .line 95
    invoke-virtual {p0, v1}, Lo/dsr$c;->a(Ljava/util/List;)V

    .line 96
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 97
    const/4 v0, 0x1

    return v0

    .line 100
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
