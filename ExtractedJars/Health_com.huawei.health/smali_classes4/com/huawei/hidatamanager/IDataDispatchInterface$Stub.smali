.class public abstract Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hidatamanager/IDataDispatchInterface;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hidatamanager/IDataDispatchInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.huawei.hidatamanager.IDataDispatchInterface"

.field static final TRANSACTION_onFeatureDataAdded:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string v0, "com.huawei.hidatamanager.IDataDispatchInterface"

    invoke-virtual {p0, p0, v0}, Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/huawei/hidatamanager/IDataDispatchInterface;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.hidatamanager.IDataDispatchInterface"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lcom/huawei/hidatamanager/IDataDispatchInterface;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lcom/huawei/hidatamanager/IDataDispatchInterface;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 36
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 11
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
    const-string v0, "com.huawei.hidatamanager.IDataDispatchInterface"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.hidatamanager.IDataDispatchInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v8

    .line 55
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    .line 56
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub;->onFeatureDataAdded(JJLjava/lang/String;)V

    .line 57
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 58
    const/4 v0, 0x1

    return v0

    .line 61
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
