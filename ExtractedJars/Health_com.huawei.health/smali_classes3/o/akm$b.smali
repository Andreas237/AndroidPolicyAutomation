.class public abstract Lo/akm$b;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/akm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akm$b$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p0, p0, v0}, Lo/akm$b;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public static b(Landroid/os/IBinder;)Lo/akm;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/akm;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lo/akm;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lo/akm$b$b;

    invoke-direct {v0, p0}, Lo/akm$b$b;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 40
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_3

    .line 44
    :sswitch_0
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lo/akm$b;->b()Ljava/lang/String;

    move-result-object v6

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x1

    return v0

    .line 57
    :sswitch_2
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Lo/akm$b;->a()[I

    move-result-object v6

    .line 59
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 60
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 61
    const/4 v0, 0x1

    return v0

    .line 65
    :sswitch_3
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0}, Lo/akm$b;->c()I

    move-result v6

    .line 67
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 68
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    const/4 v0, 0x1

    return v0

    .line 73
    :sswitch_4
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p0}, Lo/akm$b;->d()I

    move-result v6

    .line 75
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 76
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    const/4 v0, 0x1

    return v0

    .line 81
    :sswitch_5
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/akk$e;->c(Landroid/os/IBinder;)Lo/akk;

    move-result-object v6

    .line 84
    invoke-virtual {p0, v6}, Lo/akm$b;->a(Lo/akk;)V

    .line 85
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 86
    const/4 v0, 0x1

    return v0

    .line 90
    :sswitch_6
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/akk$e;->c(Landroid/os/IBinder;)Lo/akk;

    move-result-object v6

    .line 93
    invoke-virtual {p0, v6}, Lo/akm$b;->d(Lo/akk;)V

    .line 94
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 95
    const/4 v0, 0x1

    return v0

    .line 99
    :sswitch_7
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 102
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/os/Bundle;

    goto :goto_0

    .line 105
    :cond_0
    const/4 v6, 0x0

    .line 107
    :goto_0
    invoke-virtual {p0, v6}, Lo/akm$b;->e(Landroid/os/Bundle;)Z

    move-result v7

    .line 108
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 109
    if-eqz v7, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    const/4 v0, 0x1

    return v0

    .line 114
    :sswitch_8
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 116
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    .line 118
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v8

    .line 120
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/akk$e;->c(Landroid/os/IBinder;)Lo/akk;

    move-result-object v10

    .line 121
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Lo/akm$b;->c(JJLo/akk;)Z

    move-result v11

    .line 122
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 123
    if-eqz v11, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 124
    const/4 v0, 0x1

    return v0

    .line 128
    :sswitch_9
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/akk$e;->c(Landroid/os/IBinder;)Lo/akk;

    move-result-object v6

    .line 131
    invoke-virtual {p0, v6}, Lo/akm$b;->b(Lo/akk;)V

    .line 132
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 133
    const/4 v0, 0x1

    return v0

    .line 137
    :sswitch_a
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 139
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/akk$e;->c(Landroid/os/IBinder;)Lo/akk;

    move-result-object v6

    .line 140
    invoke-virtual {p0, v6}, Lo/akm$b;->e(Lo/akk;)V

    .line 141
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 142
    const/4 v0, 0x1

    return v0

    .line 145
    :goto_3
    move/from16 v0, p4

    invoke-super {p0, p1, p2, p3, v0}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

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
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
