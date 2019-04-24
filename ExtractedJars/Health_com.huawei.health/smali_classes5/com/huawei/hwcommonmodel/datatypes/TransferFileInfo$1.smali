.class final Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;
    .locals 20

    .line 201
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 202
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v3

    .line 203
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 204
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 205
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 206
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 207
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 208
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    .line 209
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    .line 210
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    .line 211
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v12

    .line 212
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    .line 213
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    .line 214
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    .line 215
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v16

    .line 217
    new-instance v17, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;-><init>()V

    .line 218
    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setType(I)V

    .line 219
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 220
    const/16 v19, 0x0

    :goto_0
    array-length v0, v3

    move/from16 v1, v19

    if-ge v1, v0, :cond_0

    .line 221
    aget v0, v3, v19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    add-int/lit8 v19, v19, 0x1

    goto :goto_0

    .line 223
    :cond_0
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setRecordId(Ljava/util/List;)V

    .line 224
    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setGpsType(I)V

    .line 225
    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setStartTime(I)V

    .line 226
    move-object/from16 v0, v17

    invoke-virtual {v0, v6}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setEndTime(I)V

    .line 227
    move-object/from16 v0, v17

    invoke-virtual {v0, v7}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setLevel(I)V

    .line 228
    move-object/from16 v0, v17

    invoke-virtual {v0, v8}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDeviceMac(Ljava/lang/String;)V

    .line 229
    move-object/from16 v0, v17

    invoke-virtual {v0, v9}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDeviceVersion(Ljava/lang/String;)V

    .line 230
    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDeviceType(I)V

    .line 231
    move-object/from16 v0, v17

    invoke-virtual {v0, v11}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDfxLogType(I)V

    .line 232
    move-object/from16 v0, v17

    invoke-virtual {v0, v12}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsFromAbout(I)V

    .line 233
    move-object/from16 v0, v17

    invoke-virtual {v0, v13}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsUploadAppLog(I)V

    .line 234
    move-object/from16 v0, v17

    invoke-virtual {v0, v14}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    .line 235
    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 236
    move-object/from16 v0, v17

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setTaskType(I)V

    .line 237
    return-object v17
.end method

.method public a(I)[Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;
    .locals 1

    .line 242
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 197
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 197
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo$1;->a(I)[Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    return-object v0
.end method
