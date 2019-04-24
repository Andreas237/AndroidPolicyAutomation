.class public abstract Lo/aau$e;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/aau;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aau;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aau$e$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p0, p0, v0}, Lo/aau$e;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static b(Landroid/os/IBinder;)Lo/aau;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/aau;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lo/aau;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lo/aau$e$d;

    invoke-direct {v0, p0}, Lo/aau$e$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
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
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aaz$c;->asInterface(Landroid/os/IBinder;)Lo/aaz;

    move-result-object v1

    .line 50
    invoke-virtual {p0, v1}, Lo/aau$e;->d(Lo/aaz;)V

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    const/4 v0, 0x1

    return v0

    .line 56
    :sswitch_2
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aaz$c;->asInterface(Landroid/os/IBinder;)Lo/aaz;

    move-result-object v1

    .line 59
    invoke-virtual {p0, v1}, Lo/aau$e;->b(Lo/aaz;)V

    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    const/4 v0, 0x1

    return v0

    .line 65
    :sswitch_3
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 68
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v1

    .line 69
    invoke-virtual {p0, v1}, Lo/aau$e;->a(Ljava/util/Map;)Z

    move-result v3

    .line 70
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 71
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    const/4 v0, 0x1

    return v0

    .line 76
    :sswitch_4
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 78
    sget-object v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    .line 79
    invoke-virtual {p0, v1}, Lo/aau$e;->e(Ljava/util/List;)V

    .line 80
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 81
    const/4 v0, 0x1

    return v0

    .line 85
    :sswitch_5
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {p0, v1}, Lo/aau$e;->d(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 90
    const/4 v0, 0x1

    return v0

    .line 94
    :sswitch_6
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    .line 98
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 100
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 101
    invoke-virtual {p0, v1, v2, v3}, Lo/aau$e;->e(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 103
    const/4 v0, 0x1

    return v0

    .line 107
    :sswitch_7
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 109
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 111
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 112
    invoke-virtual {p0, v1, v2}, Lo/aau$e;->a(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v3

    .line 113
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 114
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 115
    const/4 v0, 0x1

    return v0

    .line 119
    :sswitch_8
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 121
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aas$e;->d(Landroid/os/IBinder;)Lo/aas;

    move-result-object v1

    .line 122
    invoke-virtual {p0, v1}, Lo/aau$e;->d(Lo/aas;)V

    .line 123
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 124
    const/4 v0, 0x1

    return v0

    .line 128
    :sswitch_9
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aax$e;->e(Landroid/os/IBinder;)Lo/aax;

    move-result-object v1

    .line 131
    invoke-virtual {p0, v1}, Lo/aau$e;->c(Lo/aax;)V

    .line 132
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 133
    const/4 v0, 0x1

    return v0

    .line 137
    :sswitch_a
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 139
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aas$e;->d(Landroid/os/IBinder;)Lo/aas;

    move-result-object v1

    .line 140
    invoke-virtual {p0, v1}, Lo/aau$e;->c(Lo/aas;)V

    .line 141
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 142
    const/4 v0, 0x1

    return v0

    .line 146
    :sswitch_b
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 148
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 150
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aas$e;->d(Landroid/os/IBinder;)Lo/aas;

    move-result-object v2

    .line 151
    invoke-virtual {p0, v1, v2}, Lo/aau$e;->c(Ljava/lang/String;Lo/aas;)V

    .line 152
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 153
    const/4 v0, 0x1

    return v0

    .line 157
    :sswitch_c
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 159
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aax$e;->e(Landroid/os/IBinder;)Lo/aax;

    move-result-object v1

    .line 160
    invoke-virtual {p0, v1}, Lo/aau$e;->e(Lo/aax;)V

    .line 161
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 162
    const/4 v0, 0x1

    return v0

    .line 166
    :sswitch_d
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 170
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aas$e;->d(Landroid/os/IBinder;)Lo/aas;

    move-result-object v2

    .line 171
    invoke-virtual {p0, v1, v2}, Lo/aau$e;->b(ILo/aas;)V

    .line 172
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 173
    const/4 v0, 0x1

    return v0

    .line 177
    :sswitch_e
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 179
    sget-object v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    .line 180
    invoke-virtual {p0, v1}, Lo/aau$e;->a(Ljava/util/List;)V

    .line 181
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 182
    const/4 v0, 0x1

    return v0

    .line 186
    :sswitch_f
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 188
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 189
    invoke-virtual {p0, v1}, Lo/aau$e;->c(Ljava/lang/String;)V

    .line 190
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 191
    const/4 v0, 0x1

    return v0

    .line 195
    :sswitch_10
    const-string v0, "com.huawei.health.ICallbackInterface"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 197
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 199
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aaz$c;->asInterface(Landroid/os/IBinder;)Lo/aaz;

    move-result-object v2

    .line 200
    invoke-virtual {p0, v1, v2}, Lo/aau$e;->c(Ljava/lang/String;Lo/aaz;)V

    .line 201
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 202
    const/4 v0, 0x1

    return v0

    .line 205
    :goto_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

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
        0xb -> :sswitch_b
        0xc -> :sswitch_c
        0xd -> :sswitch_d
        0xe -> :sswitch_e
        0xf -> :sswitch_f
        0x10 -> :sswitch_10
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
