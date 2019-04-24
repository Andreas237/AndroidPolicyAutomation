.class public abstract Lo/cld$d;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/cld;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cld;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cld$d$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string v0, "com.huawei.hihealth.IAggregateListenerEx"

    invoke-virtual {p0, p0, v0}, Lo/cld$d;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public static c(Landroid/os/IBinder;)Lo/cld;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.hihealth.IAggregateListenerEx"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/cld;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lo/cld;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lo/cld$d$e;

    invoke-direct {v0, p0}, Lo/cld$d$e;-><init>(Landroid/os/IBinder;)V

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

    goto :goto_0

    .line 44
    :sswitch_0
    const-string v0, "com.huawei.hihealth.IAggregateListenerEx"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.hihealth.IAggregateListenerEx"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 52
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v1

    .line 54
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 56
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 57
    invoke-virtual {p0, v1, v3, v4}, Lo/cld$d;->b(Ljava/util/List;II)V

    .line 58
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 59
    const/4 v0, 0x1

    return v0

    .line 62
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
