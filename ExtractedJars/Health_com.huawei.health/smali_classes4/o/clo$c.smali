.class public abstract Lo/clo$c;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/clo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/clo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/clo$c$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.hihealth.ISubscribeListener"

    invoke-virtual {p0, p0, v0}, Lo/clo$c;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lo/clo;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.huawei.hihealth.ISubscribeListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/clo;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lo/clo;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lo/clo$c$d;

    invoke-direct {v0, p0}, Lo/clo$c$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_2

    .line 42
    :sswitch_0
    const-string v0, "com.huawei.hihealth.ISubscribeListener"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.hihealth.ISubscribeListener"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    .line 50
    invoke-virtual {p2, v8}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v7

    .line 52
    invoke-virtual {p2, v8}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v9

    .line 53
    invoke-virtual {p0, v7, v9}, Lo/clo$c;->a(Ljava/util/List;Ljava/util/List;)V

    .line 54
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 55
    const/4 v0, 0x1

    return v0

    .line 59
    :sswitch_2
    const-string v0, "com.huawei.hihealth.ISubscribeListener"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 63
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    sget-object v0, Lcom/huawei/hihealth/HiHealthClient;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthClient;

    goto :goto_0

    .line 67
    :cond_0
    const/4 v8, 0x0

    .line 70
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    .line 72
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 73
    sget-object v0, Lcom/huawei/hihealth/HiHealthData;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    goto :goto_1

    .line 76
    :cond_1
    const/4 v10, 0x0

    .line 79
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v11

    .line 80
    move-object v0, p0

    move v1, v7

    move-object v2, v8

    move-object v3, v9

    move-object v4, v10

    move-wide v5, v11

    invoke-virtual/range {v0 .. v6}, Lo/clo$c;->e(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V

    .line 81
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 82
    const/4 v0, 0x1

    return v0

    .line 85
    :goto_2
    move-object/from16 v0, p3

    move/from16 v1, p4

    invoke-super {p0, p1, p2, v0, v1}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
