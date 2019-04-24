.class final Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 19

    .line 279
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 280
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 281
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 282
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 283
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 284
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 285
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    .line 286
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 287
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    .line 288
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    .line 289
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v12

    .line 290
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    .line 291
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    .line 292
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    .line 293
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    .line 294
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    .line 296
    new-instance v18, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 297
    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 298
    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 299
    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 300
    move-object/from16 v0, v18

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 301
    move-object/from16 v0, v18

    invoke-virtual {v0, v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 302
    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 303
    move-object/from16 v0, v18

    invoke-virtual {v0, v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setEncryptType(I)V

    .line 304
    move-object/from16 v0, v18

    invoke-virtual {v0, v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceBTType(I)V

    .line 305
    move-object/from16 v0, v18

    invoke-virtual {v0, v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 306
    move-object/from16 v0, v18

    invoke-virtual {v0, v11}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceModel(Ljava/lang/String;)V

    .line 307
    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDevIdType(I)V

    .line 308
    move-object/from16 v0, v18

    invoke-virtual {v0, v13}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setmAuthVersion(I)V

    .line 309
    move-object/from16 v0, v18

    invoke-virtual {v0, v14}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setAutoDetectSwitchStatus(I)V

    .line 310
    move-object/from16 v0, v18

    invoke-virtual {v0, v15}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setFootWearPosition(I)V

    .line 311
    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setbTversion(Ljava/lang/String;)V

    .line 312
    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setSoft_version(Ljava/lang/String;)V

    .line 313
    return-object v18
.end method

.method public b(I)[Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 274
    new-array v0, p1, [Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 270
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 270
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo$1;->b(I)[Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method
