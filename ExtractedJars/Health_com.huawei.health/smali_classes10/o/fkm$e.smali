.class public abstract Lo/fkm$e;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/fkm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fkm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p0, p0, v0}, Lo/fkm$e;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

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
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 42
    :sswitch_0
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lo/fkm$e;->d()I

    move-result v1

    .line 49
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 50
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 51
    const/4 v0, 0x1

    return v0

    .line 55
    :sswitch_2
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    .line 58
    invoke-virtual {p0, v1}, Lo/fkm$e;->a([B)Lcom/unionpay/blepayservice/Channel;

    move-result-object v2

    .line 59
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 60
    if-eqz v2, :cond_0

    .line 61
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    const/4 v0, 0x1

    invoke-virtual {v2, p3, v0}, Lcom/unionpay/blepayservice/Channel;->writeToParcel(Landroid/os/Parcel;I)V

    .line 63
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
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 74
    invoke-virtual {p0, v1}, Lo/fkm$e;->e(I)I

    move-result v2

    .line 75
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 76
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    const/4 v0, 0x1

    return v0

    .line 81
    :sswitch_4
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 82
    invoke-virtual {p0}, Lo/fkm$e;->c()Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 84
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    const/4 v0, 0x1

    return v0

    .line 89
    :sswitch_5
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0}, Lo/fkm$e;->a()Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 92
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 93
    const/4 v0, 0x1

    return v0

    .line 97
    :sswitch_6
    const-string v0, "com.unionpay.blepayservice.IBLEService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 98
    invoke-virtual {p0}, Lo/fkm$e;->b()Ljava/lang/String;

    move-result-object v1

    .line 99
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 100
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 101
    const/4 v0, 0x1

    return v0

    .line 104
    :goto_1
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
