.class public abstract Lo/dbv$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/dbv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dbv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.hwcommonservice.IHWCoreSleepAPI"

    invoke-virtual {p0, p0, v0}, Lo/dbv$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 42
    :sswitch_0
    const-string v0, "com.huawei.hwcommonservice.IHWCoreSleepAPI"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.hwcommonservice.IHWCoreSleepAPI"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/dcc$a;->e(Landroid/os/IBinder;)Lo/dcc;

    move-result-object v6

    .line 50
    invoke-virtual {p0, v6}, Lo/dbv$a;->d(Lo/dcc;)V

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    const/4 v0, 0x1

    return v0

    .line 56
    :sswitch_2
    const-string v0, "com.huawei.hwcommonservice.IHWCoreSleepAPI"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    .line 60
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v8

    .line 62
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/dcb$d;->e(Landroid/os/IBinder;)Lo/dcb;

    move-result-object v10

    .line 63
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Lo/dbv$a;->c(JJLo/dcb;)V

    .line 64
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 65
    const/4 v0, 0x1

    return v0

    .line 68
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
