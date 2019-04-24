.class public abstract Lo/dle$c;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/dle;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dle$c$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string v0, "com.huawei.hwsmartinteractmgr.ISmartInteract"

    invoke-virtual {p0, p0, v0}, Lo/dle$c;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public static b(Landroid/os/IBinder;)Lo/dle;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.hwsmartinteractmgr.ISmartInteract"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/dle;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lo/dle;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lo/dle$c$b;

    invoke-direct {v0, p0}, Lo/dle$c$b;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 36
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 40
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 44
    :sswitch_0
    const-string v0, "com.huawei.hwsmartinteractmgr.ISmartInteract"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.hwsmartinteractmgr.ISmartInteract"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/dli$b;->b(Landroid/os/IBinder;)Lo/dli;

    move-result-object v2

    .line 54
    invoke-virtual {p0, v1, v2}, Lo/dle$c;->c(ILo/dli;)V

    .line 55
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 56
    const/4 v0, 0x1

    return v0

    .line 59
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
