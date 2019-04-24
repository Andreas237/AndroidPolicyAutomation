.class public abstract Lo/djv$d;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/djv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/djv$d$c;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback"

.field static final TRANSACTION_onFailure:I = 0x2

.field static final TRANSACTION_onProgress:I = 0x3

.field static final TRANSACTION_onSuccess:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 18
    const-string v0, "com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback"

    invoke-virtual {p0, p0, v0}, Lo/djv$d;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lo/djv;
    .locals 2

    .line 26
    if-nez p0, :cond_0

    .line 27
    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    const-string v0, "com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/djv;

    if-eqz v0, :cond_1

    .line 31
    move-object v0, v1

    check-cast v0, Lo/djv;

    return-object v0

    .line 33
    :cond_1
    new-instance v0, Lo/djv$d$c;

    invoke-direct {v0, p0}, Lo/djv$d$c;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 37
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 41
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 45
    :sswitch_0
    const-string v0, "com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x1

    return v0

    .line 50
    :sswitch_1
    const-string v0, "com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 54
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 56
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-virtual {p0, v1, v2, v3}, Lo/djv$d;->onSuccess(ILjava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 59
    const/4 v0, 0x1

    return v0

    .line 63
    :sswitch_2
    const-string v0, "com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 67
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 68
    invoke-virtual {p0, v1, v2}, Lo/djv$d;->onFailure(ILjava/lang/String;)V

    .line 69
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 70
    const/4 v0, 0x1

    return v0

    .line 74
    :sswitch_3
    const-string v0, "com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 78
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-virtual {p0, v1, v2}, Lo/djv$d;->onProgress(ILjava/lang/String;)V

    .line 80
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 81
    const/4 v0, 0x1

    return v0

    .line 84
    :goto_0
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
