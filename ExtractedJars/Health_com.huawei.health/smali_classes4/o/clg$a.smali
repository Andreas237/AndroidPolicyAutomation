.class public abstract Lo/clg$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/clg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/clg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/clg$a$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p0, p0, v0}, Lo/clg$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static e(Landroid/os/IBinder;)Lo/clg;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/clg;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lo/clg;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lo/clg$a$d;

    invoke-direct {v0, p0}, Lo/clg$a$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_17

    .line 42
    :sswitch_0
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 50
    sget-object v0, Lcom/huawei/hihealth/HiAppInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiAppInfo;

    goto :goto_0

    .line 53
    :cond_0
    const/4 v2, 0x0

    .line 55
    :goto_0
    invoke-virtual {p0, v2}, Lo/clg$a;->a(Lcom/huawei/hihealth/HiAppInfo;)V

    .line 56
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 57
    const/4 v0, 0x1

    return v0

    .line 61
    :sswitch_2
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0}, Lo/clg$a;->d()V

    .line 63
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 64
    const/4 v0, 0x1

    return v0

    .line 68
    :sswitch_3
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 71
    sget-object v0, Lcom/huawei/hihealth/HiAuthorizationOption;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiAuthorizationOption;

    goto :goto_1

    .line 74
    :cond_1
    const/4 v2, 0x0

    .line 77
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clc$e;->c(Landroid/os/IBinder;)Lo/clc;

    move-result-object v3

    .line 78
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->b(Lcom/huawei/hihealth/HiAuthorizationOption;Lo/clc;)V

    .line 79
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 80
    const/4 v0, 0x1

    return v0

    .line 84
    :sswitch_4
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 88
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cln$d;->e(Landroid/os/IBinder;)Lo/cln;

    move-result-object v3

    .line 89
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->c(ILo/cln;)V

    .line 90
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 91
    const/4 v0, 0x1

    return v0

    .line 95
    :sswitch_5
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 98
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v2

    .line 100
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clo$c;->a(Landroid/os/IBinder;)Lo/clo;

    move-result-object v4

    .line 101
    invoke-virtual {p0, v2, v4}, Lo/clg$a;->d(Ljava/util/List;Lo/clo;)V

    .line 102
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 103
    const/4 v0, 0x1

    return v0

    .line 107
    :sswitch_6
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 109
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 111
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 113
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 114
    sget-object v0, Lcom/huawei/hihealth/HiSubscribeTrigger;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiSubscribeTrigger;

    goto :goto_2

    .line 117
    :cond_2
    const/4 v4, 0x0

    .line 119
    :goto_2
    invoke-virtual {p0, v2, v3, v4}, Lo/clg$a;->e(IILcom/huawei/hihealth/HiSubscribeTrigger;)Z

    move-result v5

    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 121
    if-eqz v5, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    const/4 v0, 0x1

    return v0

    .line 126
    :sswitch_7
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 129
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v2

    .line 131
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clm$d;->c(Landroid/os/IBinder;)Lo/clm;

    move-result-object v4

    .line 132
    invoke-virtual {p0, v2, v4}, Lo/clg$a;->a(Ljava/util/List;Lo/clm;)V

    .line 133
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 134
    const/4 v0, 0x1

    return v0

    .line 138
    :sswitch_8
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 140
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 141
    sget-object v0, Lcom/huawei/hihealth/HiAggregateOption;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    goto :goto_4

    .line 144
    :cond_4
    const/4 v2, 0x0

    .line 147
    :goto_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clb$a;->c(Landroid/os/IBinder;)Lo/clb;

    move-result-object v3

    .line 148
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->c(Lcom/huawei/hihealth/HiAggregateOption;Lo/clb;)V

    .line 149
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 150
    const/4 v0, 0x1

    return v0

    .line 154
    :sswitch_9
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 157
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v2

    .line 159
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cld$d;->c(Landroid/os/IBinder;)Lo/cld;

    move-result-object v4

    .line 160
    invoke-virtual {p0, v2, v4}, Lo/clg$a;->d(Ljava/util/List;Lo/cld;)V

    .line 161
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 162
    const/4 v0, 0x1

    return v0

    .line 166
    :sswitch_a
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 169
    sget-object v0, Lcom/huawei/hihealth/HiDataInsertOption;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiDataInsertOption;

    goto :goto_5

    .line 172
    :cond_5
    const/4 v2, 0x0

    .line 175
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clh$d;->e(Landroid/os/IBinder;)Lo/clh;

    move-result-object v3

    .line 176
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/clh;)V

    .line 177
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 178
    const/4 v0, 0x1

    return v0

    .line 182
    :sswitch_b
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 184
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 185
    sget-object v0, Lcom/huawei/hihealth/HiDataDeleteOption;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiDataDeleteOption;

    goto :goto_6

    .line 188
    :cond_6
    const/4 v2, 0x0

    .line 191
    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clh$d;->e(Landroid/os/IBinder;)Lo/clh;

    move-result-object v3

    .line 192
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->e(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/clh;)V

    .line 193
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 194
    const/4 v0, 0x1

    return v0

    .line 198
    :sswitch_c
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 200
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 201
    sget-object v0, Lcom/huawei/hihealth/HiDataReadOption;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiDataReadOption;

    goto :goto_7

    .line 204
    :cond_7
    const/4 v2, 0x0

    .line 207
    :goto_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clj$d;->b(Landroid/os/IBinder;)Lo/clj;

    move-result-object v3

    .line 208
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->d(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V

    .line 209
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 210
    const/4 v0, 0x1

    return v0

    .line 214
    :sswitch_d
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 216
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 217
    sget-object v0, Lcom/huawei/hihealth/HiDataUpdateOption;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiDataUpdateOption;

    goto :goto_8

    .line 220
    :cond_8
    const/4 v2, 0x0

    .line 223
    :goto_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clh$d;->e(Landroid/os/IBinder;)Lo/clh;

    move-result-object v3

    .line 224
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->d(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/clh;)V

    .line 225
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 226
    const/4 v0, 0x1

    return v0

    .line 230
    :sswitch_e
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 232
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 233
    invoke-virtual {p0, v2}, Lo/clg$a;->d(Ljava/lang/String;)I

    move-result v3

    .line 234
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 235
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 236
    const/4 v0, 0x1

    return v0

    .line 240
    :sswitch_f
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 242
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 243
    invoke-virtual {p0, v2}, Lo/clg$a;->b(Ljava/lang/String;)I

    move-result v3

    .line 244
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 245
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 246
    const/4 v0, 0x1

    return v0

    .line 250
    :sswitch_10
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 252
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 253
    sget-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiDeviceInfo;

    goto :goto_9

    .line 256
    :cond_9
    const/4 v2, 0x0

    .line 259
    :goto_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    .line 260
    invoke-virtual {p2, v4}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v3

    .line 262
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clk$d;->a(Landroid/os/IBinder;)Lo/clk;

    move-result-object v5

    .line 263
    invoke-virtual {p0, v2, v3, v5}, Lo/clg$a;->a(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/clk;)V

    .line 264
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 265
    const/4 v0, 0x1

    return v0

    .line 269
    :sswitch_11
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 271
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 272
    sget-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiDeviceInfo;

    goto :goto_a

    .line 275
    :cond_a
    const/4 v2, 0x0

    .line 278
    :goto_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 279
    sget-object v0, Lcom/huawei/hihealth/HiUserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiUserInfo;

    goto :goto_b

    .line 282
    :cond_b
    const/4 v3, 0x0

    .line 285
    :goto_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    .line 286
    invoke-virtual {p2, v5}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v4

    .line 288
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clk$d;->a(Landroid/os/IBinder;)Lo/clk;

    move-result-object v6

    .line 289
    invoke-virtual {p0, v2, v3, v4, v6}, Lo/clg$a;->b(Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;Ljava/util/List;Lo/clk;)V

    .line 290
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 291
    const/4 v0, 0x1

    return v0

    .line 295
    :sswitch_12
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 297
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cli$e;->d(Landroid/os/IBinder;)Lo/cli;

    move-result-object v2

    .line 298
    invoke-virtual {p0, v2}, Lo/clg$a;->a(Lo/cli;)V

    .line 299
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 300
    const/4 v0, 0x1

    return v0

    .line 304
    :sswitch_13
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 306
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cli$e;->d(Landroid/os/IBinder;)Lo/cli;

    move-result-object v2

    .line 307
    invoke-virtual {p0, v2}, Lo/clg$a;->e(Lo/cli;)V

    .line 308
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 309
    const/4 v0, 0x1

    return v0

    .line 313
    :sswitch_14
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 315
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cli$e;->d(Landroid/os/IBinder;)Lo/cli;

    move-result-object v2

    .line 316
    invoke-virtual {p0, v2}, Lo/clg$a;->c(Lo/cli;)V

    .line 317
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 318
    const/4 v0, 0x1

    return v0

    .line 322
    :sswitch_15
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 324
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 326
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cli$e;->d(Landroid/os/IBinder;)Lo/cli;

    move-result-object v3

    .line 327
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->e(ILo/cli;)V

    .line 328
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 329
    const/4 v0, 0x1

    return v0

    .line 333
    :sswitch_16
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 335
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 337
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 339
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cli$e;->d(Landroid/os/IBinder;)Lo/cli;

    move-result-object v4

    .line 340
    invoke-virtual {p0, v2, v3, v4}, Lo/clg$a;->c(ILjava/lang/String;Lo/cli;)V

    .line 341
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 342
    const/4 v0, 0x1

    return v0

    .line 346
    :sswitch_17
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 348
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 349
    invoke-virtual {p0, v2}, Lo/clg$a;->c(I)Lcom/huawei/hihealth/HiHealthUnit;

    move-result-object v3

    .line 350
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 351
    if-eqz v3, :cond_c

    .line 352
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 353
    const/4 v0, 0x1

    invoke-virtual {v3, p3, v0}, Lcom/huawei/hihealth/HiHealthUnit;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_c

    .line 356
    :cond_c
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 358
    :goto_c
    const/4 v0, 0x1

    return v0

    .line 362
    :sswitch_18
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 364
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 366
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_d

    .line 367
    sget-object v0, Lcom/huawei/hihealth/HiHealthUnit;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiHealthUnit;

    goto :goto_d

    .line 370
    :cond_d
    const/4 v3, 0x0

    .line 372
    :goto_d
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->a(ILcom/huawei/hihealth/HiHealthUnit;)V

    .line 373
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 374
    const/4 v0, 0x1

    return v0

    .line 378
    :sswitch_19
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 380
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 382
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 383
    sget-object v0, Lcom/huawei/hihealth/HiTimeInterval;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiTimeInterval;

    goto :goto_e

    .line 386
    :cond_e
    const/4 v3, 0x0

    .line 389
    :goto_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cli$e;->d(Landroid/os/IBinder;)Lo/cli;

    move-result-object v4

    .line 390
    invoke-virtual {p0, v2, v3, v4}, Lo/clg$a;->d(ILcom/huawei/hihealth/HiTimeInterval;Lo/cli;)V

    .line 391
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 392
    const/4 v0, 0x1

    return v0

    .line 396
    :sswitch_1a
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 398
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 399
    sget-object v0, Lcom/huawei/hihealth/HiUserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    goto :goto_f

    .line 402
    :cond_f
    const/4 v2, 0x0

    .line 405
    :goto_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v3

    .line 406
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->c(Lcom/huawei/hihealth/HiUserInfo;Lo/cla;)V

    .line 407
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 408
    const/4 v0, 0x1

    return v0

    .line 412
    :sswitch_1b
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 414
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v2

    .line 415
    invoke-virtual {p0, v2}, Lo/clg$a;->d(Lo/cla;)V

    .line 416
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 417
    const/4 v0, 0x1

    return v0

    .line 421
    :sswitch_1c
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 423
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    .line 424
    sget-object v0, Lcom/huawei/hihealth/HiSyncOption;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiSyncOption;

    goto :goto_10

    .line 427
    :cond_10
    const/4 v2, 0x0

    .line 430
    :goto_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v3

    .line 431
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->e(Lcom/huawei/hihealth/HiSyncOption;Lo/cla;)V

    .line 432
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 433
    const/4 v0, 0x1

    return v0

    .line 437
    :sswitch_1d
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 439
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 440
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v2

    .line 442
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v4

    .line 443
    invoke-virtual {p0, v2, v4}, Lo/clg$a;->b(Ljava/util/List;Lo/cla;)V

    .line 444
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 445
    const/4 v0, 0x1

    return v0

    .line 449
    :sswitch_1e
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 450
    invoke-virtual {p0}, Lo/clg$a;->c()V

    .line 451
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 452
    const/4 v0, 0x1

    return v0

    .line 456
    :sswitch_1f
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 458
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_11

    .line 459
    sget-object v0, Lcom/huawei/hihealth/HiAccountInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiAccountInfo;

    goto :goto_11

    .line 462
    :cond_11
    const/4 v2, 0x0

    .line 465
    :goto_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v3

    .line 466
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->e(Lcom/huawei/hihealth/HiAccountInfo;Lo/cla;)V

    .line 467
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 468
    const/4 v0, 0x1

    return v0

    .line 472
    :sswitch_20
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 474
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v2

    .line 475
    invoke-virtual {p0, v2}, Lo/clg$a;->e(Lo/cla;)V

    .line 476
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 477
    const/4 v0, 0x1

    return v0

    .line 481
    :sswitch_21
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 483
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v2

    .line 484
    invoke-virtual {p0, v2}, Lo/clg$a;->c(Lo/cla;)V

    .line 485
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 486
    const/4 v0, 0x1

    return v0

    .line 490
    :sswitch_22
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 492
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 494
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    .line 495
    invoke-virtual {p2, v4}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v3

    .line 497
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v5

    .line 498
    invoke-virtual {p0, v2, v3, v5}, Lo/clg$a;->b(ILjava/util/List;Lo/cla;)V

    .line 499
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 500
    const/4 v0, 0x1

    return v0

    .line 504
    :sswitch_23
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 506
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 508
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 510
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cla$e;->b(Landroid/os/IBinder;)Lo/cla;

    move-result-object v4

    .line 511
    invoke-virtual {p0, v2, v3, v4}, Lo/clg$a;->e(IILo/cla;)V

    .line 512
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 513
    const/4 v0, 0x1

    return v0

    .line 517
    :sswitch_24
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 519
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_12

    .line 520
    sget-object v0, Lcom/huawei/hihealth/HiUserPreference;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiUserPreference;

    goto :goto_12

    .line 523
    :cond_12
    const/4 v2, 0x0

    .line 526
    :goto_12
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_13

    const/4 v3, 0x1

    goto :goto_13

    :cond_13
    const/4 v3, 0x0

    .line 527
    :goto_13
    invoke-virtual {p0, v2, v3}, Lo/clg$a;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    move-result v4

    .line 528
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 529
    if-eqz v4, :cond_14

    const/4 v0, 0x1

    goto :goto_14

    :cond_14
    const/4 v0, 0x0

    :goto_14
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 530
    const/4 v0, 0x1

    return v0

    .line 534
    :sswitch_25
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 536
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 537
    invoke-virtual {p0, v2}, Lo/clg$a;->c(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v3

    .line 538
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 539
    if-eqz v3, :cond_15

    .line 540
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 541
    const/4 v0, 0x1

    invoke-virtual {v3, p3, v0}, Lcom/huawei/hihealth/HiUserPreference;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_15

    .line 544
    :cond_15
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 546
    :goto_15
    const/4 v0, 0x1

    return v0

    .line 550
    :sswitch_26
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 552
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 553
    invoke-virtual {p0, v2}, Lo/clg$a;->a(Ljava/lang/String;)Z

    move-result v3

    .line 554
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 555
    if-eqz v3, :cond_16

    const/4 v0, 0x1

    goto :goto_16

    :cond_16
    const/4 v0, 0x0

    :goto_16
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 556
    const/4 v0, 0x1

    return v0

    .line 560
    :sswitch_27
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 561
    invoke-virtual {p0}, Lo/clg$a;->e()I

    move-result v2

    .line 562
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 563
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 564
    const/4 v0, 0x1

    return v0

    .line 568
    :sswitch_28
    const-string v0, "com.huawei.hihealth.IHiHealth"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 570
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/clf$e;->b(Landroid/os/IBinder;)Lo/clf;

    move-result-object v2

    .line 571
    invoke-virtual {p0, v2}, Lo/clg$a;->d(Lo/clf;)V

    .line 572
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 573
    const/4 v0, 0x1

    return v0

    .line 576
    :goto_17
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
        0x11 -> :sswitch_11
        0x12 -> :sswitch_12
        0x13 -> :sswitch_13
        0x14 -> :sswitch_14
        0x15 -> :sswitch_15
        0x16 -> :sswitch_16
        0x17 -> :sswitch_17
        0x18 -> :sswitch_18
        0x19 -> :sswitch_19
        0x1a -> :sswitch_1a
        0x1b -> :sswitch_1b
        0x1c -> :sswitch_1c
        0x1d -> :sswitch_1d
        0x1e -> :sswitch_1e
        0x1f -> :sswitch_1f
        0x20 -> :sswitch_20
        0x21 -> :sswitch_21
        0x22 -> :sswitch_22
        0x23 -> :sswitch_23
        0x24 -> :sswitch_24
        0x25 -> :sswitch_25
        0x26 -> :sswitch_26
        0x27 -> :sswitch_27
        0x28 -> :sswitch_28
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
