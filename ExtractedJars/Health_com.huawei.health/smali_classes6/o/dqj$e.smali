.class public abstract Lo/dqj$e;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/dqj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dqj$e$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.mockhealth.IMockStepReport"

    invoke-virtual {p0, p0, v0}, Lo/dqj$e;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static e(Landroid/os/IBinder;)Lo/dqj;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.huawei.mockhealth.IMockStepReport"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/dqj;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lo/dqj;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lo/dqj$e$d;

    invoke-direct {v0, p0}, Lo/dqj$e$d;-><init>(Landroid/os/IBinder;)V

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

    goto :goto_1

    .line 42
    :sswitch_0
    const-string v0, "com.huawei.mockhealth.IMockStepReport"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.mockhealth.IMockStepReport"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 50
    invoke-virtual {p0, v2}, Lo/dqj$e;->b(I)V

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    const/4 v0, 0x1

    return v0

    .line 56
    :sswitch_2
    const-string v0, "com.huawei.mockhealth.IMockStepReport"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 59
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Bundle;

    goto :goto_0

    .line 62
    :cond_0
    const/4 v2, 0x0

    .line 64
    :goto_0
    invoke-virtual {p0, v2}, Lo/dqj$e;->d(Landroid/os/Bundle;)V

    .line 65
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 66
    const/4 v0, 0x1

    return v0

    .line 69
    :goto_1
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
