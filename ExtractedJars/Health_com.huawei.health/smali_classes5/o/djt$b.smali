.class public abstract Lo/djt$b;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/djt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/djt$b$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 18
    const-string v0, "com.huawei.hwservicesmgr.IHeartRateStateAIDLCallback"

    invoke-virtual {p0, p0, v0}, Lo/djt$b;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public static d(Landroid/os/IBinder;)Lo/djt;
    .locals 2

    .line 26
    if-nez p0, :cond_0

    .line 27
    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    const-string v0, "com.huawei.hwservicesmgr.IHeartRateStateAIDLCallback"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/djt;

    if-eqz v0, :cond_1

    .line 31
    move-object v0, v1

    check-cast v0, Lo/djt;

    return-object v0

    .line 33
    :cond_1
    new-instance v0, Lo/djt$b$b;

    invoke-direct {v0, p0}, Lo/djt$b$b;-><init>(Landroid/os/IBinder;)V

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

    goto :goto_0

    .line 45
    :sswitch_0
    const-string v0, "com.huawei.hwservicesmgr.IHeartRateStateAIDLCallback"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x1

    return v0

    .line 50
    :sswitch_1
    const-string v0, "com.huawei.hwservicesmgr.IHeartRateStateAIDLCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 53
    invoke-virtual {p0, v1}, Lo/djt$b;->e(I)V

    .line 54
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 55
    const/4 v0, 0x1

    return v0

    .line 58
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
