.class public abstract Lo/djz$d;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/djz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/djz$d$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 18
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p0, p0, v0}, Lo/djz$d;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public static b(Landroid/os/IBinder;)Lo/djz;
    .locals 2

    .line 26
    if-nez p0, :cond_0

    .line 27
    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/djz;

    if-eqz v0, :cond_1

    .line 31
    move-object v0, v1

    check-cast v0, Lo/djz;

    return-object v0

    .line 33
    :cond_1
    new-instance v0, Lo/djz$d$d;

    invoke-direct {v0, p0}, Lo/djz$d$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 37
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 41
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_7

    .line 45
    :sswitch_0
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x1

    return v0

    .line 50
    :sswitch_1
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v7

    .line 54
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 56
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    .line 57
    invoke-virtual {p0, v7, v8, v9}, Lo/djz$d;->a(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 59
    const/4 v0, 0x1

    return v0

    .line 63
    :sswitch_2
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0}, Lo/djz$d;->d()Ljava/util/List;

    move-result-object v7

    .line 65
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 66
    move-object/from16 v0, p3

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 67
    const/4 v0, 0x1

    return v0

    .line 71
    :sswitch_3
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lo/djz$d;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 73
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 74
    if-eqz v7, :cond_0

    .line 75
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 76
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 79
    :cond_0
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 85
    :sswitch_4
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p0}, Lo/djz$d;->c()Ljava/util/List;

    move-result-object v7

    .line 87
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 88
    move-object/from16 v0, p3

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 89
    const/4 v0, 0x1

    return v0

    .line 93
    :sswitch_5
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 94
    invoke-virtual {p0}, Lo/djz$d;->a()Ljava/util/Map;

    move-result-object v7

    .line 95
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 96
    move-object/from16 v0, p3

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 97
    const/4 v0, 0x1

    return v0

    .line 101
    :sswitch_6
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djr$a;->a(Landroid/os/IBinder;)Lo/djr;

    move-result-object v7

    .line 104
    invoke-virtual {p0, v7}, Lo/djz$d;->d(Lo/djr;)V

    .line 105
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 106
    const/4 v0, 0x1

    return v0

    .line 110
    :sswitch_7
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 112
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djr$a;->a(Landroid/os/IBinder;)Lo/djr;

    move-result-object v7

    .line 113
    invoke-virtual {p0, v7}, Lo/djz$d;->a(Lo/djr;)V

    .line 114
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 115
    const/4 v0, 0x1

    return v0

    .line 119
    :sswitch_8
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 121
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 122
    sget-object v0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    goto :goto_1

    .line 125
    :cond_1
    const/4 v7, 0x0

    .line 127
    :goto_1
    invoke-virtual {p0, v7}, Lo/djz$d;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 128
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 129
    const/4 v0, 0x1

    return v0

    .line 133
    :sswitch_9
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 137
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 139
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v9

    .line 141
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djp$b;->b(Landroid/os/IBinder;)Lo/djp;

    move-result-object v10

    .line 143
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    .line 145
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    .line 146
    move-object v0, p0

    move v1, v7

    move-object v2, v8

    move-object v3, v9

    move-object v4, v10

    move-object v5, v11

    move-object v6, v12

    invoke-virtual/range {v0 .. v6}, Lo/djz$d;->a(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 148
    const/4 v0, 0x1

    return v0

    .line 152
    :sswitch_a
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 154
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v7

    .line 155
    invoke-virtual {p0, v7}, Lo/djz$d;->c(Ljava/util/List;)V

    .line 156
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 157
    const/4 v0, 0x1

    return v0

    .line 161
    :sswitch_b
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 163
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v7

    .line 164
    invoke-virtual {p0, v7}, Lo/djz$d;->d(Ljava/util/List;)V

    .line 165
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 166
    const/4 v0, 0x1

    return v0

    .line 170
    :sswitch_c
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 172
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 173
    sget-object v0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    goto :goto_2

    .line 176
    :cond_2
    const/4 v7, 0x0

    .line 178
    :goto_2
    invoke-virtual {p0, v7}, Lo/djz$d;->c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 179
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 180
    const/4 v0, 0x1

    return v0

    .line 184
    :sswitch_d
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 186
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 188
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 190
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    .line 192
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v10

    .line 194
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djw$d;->b(Landroid/os/IBinder;)Lo/djw;

    move-result-object v11

    .line 195
    move-object v0, p0

    move-object v1, v7

    move-object v2, v8

    move-object v3, v9

    move v4, v10

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Lo/djz$d;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/djw;)V

    .line 196
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 197
    const/4 v0, 0x1

    return v0

    .line 201
    :sswitch_e
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p0}, Lo/djz$d;->b()V

    .line 203
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 204
    const/4 v0, 0x1

    return v0

    .line 208
    :sswitch_f
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 210
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 211
    invoke-virtual {p0, v7}, Lo/djz$d;->c(Ljava/lang/String;)V

    .line 212
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 213
    const/4 v0, 0x1

    return v0

    .line 217
    :sswitch_10
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 219
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 220
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    goto :goto_3

    .line 223
    :cond_3
    const/4 v7, 0x0

    .line 226
    :goto_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djv$d;->asInterface(Landroid/os/IBinder;)Lo/djv;

    move-result-object v8

    .line 227
    invoke-virtual {p0, v7, v8}, Lo/djz$d;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V

    .line 228
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 229
    const/4 v0, 0x1

    return v0

    .line 233
    :sswitch_11
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 235
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    const/4 v7, 0x1

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    .line 236
    :goto_4
    invoke-virtual {p0, v7}, Lo/djz$d;->e(Z)V

    .line 237
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 238
    const/4 v0, 0x1

    return v0

    .line 242
    :sswitch_12
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 243
    invoke-virtual {p0}, Lo/djz$d;->k()Z

    move-result v7

    .line 244
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 245
    if-eqz v7, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 246
    const/4 v0, 0x1

    return v0

    .line 250
    :sswitch_13
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 252
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 254
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v8

    .line 256
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djt$b;->d(Landroid/os/IBinder;)Lo/djt;

    move-result-object v9

    .line 257
    invoke-virtual {p0, v7, v8, v9}, Lo/djz$d;->d(IILo/djt;)V

    .line 258
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 259
    const/4 v0, 0x1

    return v0

    .line 263
    :sswitch_14
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 265
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djs$a;->e(Landroid/os/IBinder;)Lo/djs;

    move-result-object v7

    .line 266
    invoke-virtual {p0, v7}, Lo/djz$d;->c(Lo/djs;)V

    .line 267
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 268
    const/4 v0, 0x1

    return v0

    .line 272
    :sswitch_15
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 274
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djs$a;->e(Landroid/os/IBinder;)Lo/djs;

    move-result-object v7

    .line 275
    invoke-virtual {p0, v7}, Lo/djz$d;->e(Lo/djs;)V

    .line 276
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 277
    const/4 v0, 0x1

    return v0

    .line 281
    :sswitch_16
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 283
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 284
    invoke-virtual {p0, v7}, Lo/djz$d;->d(Ljava/lang/String;)V

    .line 285
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 286
    const/4 v0, 0x1

    return v0

    .line 290
    :sswitch_17
    const-string v0, "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 291
    invoke-virtual {p0}, Lo/djz$d;->g()Z

    move-result v7

    .line 292
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 293
    if-eqz v7, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 294
    const/4 v0, 0x1

    return v0

    .line 297
    :goto_7
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
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
