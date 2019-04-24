.class public Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final APPLY_OFFSET:I = 0x2

.field private static final COMMAND_HEAD_LENGTH:I = 0x6

.field private static final COMMAND_ID_MAINT_COMMAND_HEAD_LENGTH:I = 0x4

.field private static final ERROR_CODE:I = 0x7f

.field private static final ONLINE_PACKET_SEND_SIZE:I = 0x13

.field private static final OTA_APP_WAIT_TIMEOUT:I = 0x1

.field private static final OTA_BATTERY_THRESHOLD:I = 0x4

.field private static final OTA_DEVICE_RESTART_TIMEOUT:I = 0x2

.field private static final OTA_FILE_LENGTH:I = 0x2

.field private static final OTA_FILE_OFFSET:I = 0x1

.field private static final OTA_INTERVAL:I = 0x4

.field private static final OTA_OTA_UNIT_SIZE:I = 0x3

.field private static final OTA_PACKAGE_VALID_SIZE:I = 0x1

.field private static final OTA_RECEIVED_FILE_SIZE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "CommandUnpackage"

.field private static unPackageCommand:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage; = null


# instance fields
.field private tlvUtils:Lo/daz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unPackageCommand:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    .line 46
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;
    .locals 2

    .line 49
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unPackageCommand:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 50
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    invoke-direct {v0, p0}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unPackageCommand:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    .line 52
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unPackageCommand:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    return-object v0
.end method

.method private unApplyData(Ljava/lang/String;)Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;
    .locals 7

    .line 411
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unApplyData ,hexString.length() =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    new-instance v4, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;

    invoke-direct {v4}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;-><init>()V

    .line 413
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 414
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 415
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unApplyData ,index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unApplyData ,value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->setIndex(I)V

    .line 418
    invoke-virtual {v4, v6}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->setValue(Ljava/lang/String;)V

    .line 419
    return-object v4
.end method

.method private unGPSApplyData(Ljava/lang/String;)Lo/dkh;
    .locals 7

    .line 385
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGPSApplyData ,hexString.length() =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    new-instance v4, Lo/dkh;

    invoke-direct {v4}, Lo/dkh;-><init>()V

    .line 387
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 388
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 389
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGPSApplyData ,index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGPSApplyData ,value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-virtual {v4, v5}, Lo/dkh;->d(I)V

    .line 392
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dkh;->e([B)V

    .line 393
    return-object v4
.end method

.method public static unGetMaintParameters(Lo/dba;)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;
    .locals 9

    .line 262
    new-instance v2, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-direct {v2}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;-><init>()V

    .line 263
    iget-object v3, p0, Lo/dba;->e:Ljava/util/List;

    .line 264
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 267
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/daw;

    .line 268
    invoke-virtual {v7}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 269
    invoke-virtual {v7}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v5

    .line 270
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 272
    :pswitch_0
    invoke-static {v5}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->setFile_protocal_version(Ljava/lang/String;)V

    .line 273
    goto :goto_1

    .line 275
    :pswitch_1
    const/4 v8, 0x0

    .line 276
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 277
    const/4 v8, 0x1

    .line 279
    :cond_0
    invoke-virtual {v2, v8}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->setTransfer_bitmap_enable(Z)V

    .line 280
    goto :goto_1

    .line 282
    :pswitch_2
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->setTransfer_unit_size(I)V

    .line 283
    goto :goto_1

    .line 285
    :pswitch_3
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->setMax_apply_data_size(I)V

    .line 286
    goto :goto_1

    .line 288
    :pswitch_4
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->setTimeout(I)V

    .line 289
    .line 293
    :goto_1
    goto/16 :goto_0

    .line 295
    :cond_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static unQueryFileInformation(Lo/dba;)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;
    .locals 8

    .line 316
    new-instance v2, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    invoke-direct {v2}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;-><init>()V

    .line 317
    iget-object v3, p0, Lo/dba;->e:Ljava/util/List;

    .line 318
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 321
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/daw;

    .line 322
    invoke-virtual {v7}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 323
    invoke-virtual {v7}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v5

    .line 324
    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    .line 326
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->setFileSize(J)V

    .line 327
    goto :goto_1

    .line 329
    :sswitch_1
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->setFileCrc(J)V

    .line 330
    .line 334
    :goto_1
    goto :goto_0

    .line 336
    :cond_0
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method public static unTLVFileName(Lo/dba;)[Ljava/lang/String;
    .locals 6

    .line 157
    const/4 v1, 0x0

    .line 158
    iget-object v2, p0, Lo/dba;->e:Ljava/util/List;

    .line 160
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 161
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    .line 162
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 163
    invoke-static {v4}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 164
    const-string v0, ";"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 160
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 167
    :cond_1
    return-object v1
.end method

.method private unTLVFileValidityResult(Lo/dba;)[Ljava/lang/String;
    .locals 7

    .line 435
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    .line 436
    iget-object v3, p1, Lo/dba;->e:Ljava/util/List;

    .line 439
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 440
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 441
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v5

    .line 442
    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    .line 444
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x10

    invoke-static {v5, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 445
    goto :goto_1

    .line 447
    :sswitch_1
    invoke-static {v5}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 439
    .line 448
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 453
    :cond_0
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_1
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method public static unTLVGPSFileName(Lo/dba;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dba;)Ljava/util/List<Lo/dkj;>;"
        }
    .end annotation

    .line 189
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 191
    move-object/from16 v0, p0

    iget-object v7, v0, Lo/dba;->b:Ljava/util/List;

    .line 192
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetGPSFileName tlvFathers = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_5

    .line 194
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v9, v0, Lo/dba;->b:Ljava/util/List;

    .line 195
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetGPSFileName tlvFatherss = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_4

    .line 197
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v11, v0, Lo/dba;->e:Ljava/util/List;

    .line 198
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetGPSFileName tlvs = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    new-instance v12, Lo/dkj;

    invoke-direct {v12}, Lo/dkj;-><init>()V

    .line 200
    const/4 v13, 0x0

    :goto_2
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_3

    .line 201
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v14

    .line 202
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unTLVGPSFileName() value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unTLVGPSFileName() TAG = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 206
    :pswitch_0
    const/16 v0, 0x10

    invoke-static {v14, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/dkj;->e(I)V

    .line 207
    goto/16 :goto_4

    .line 209
    :pswitch_1
    const/16 v0, 0x10

    invoke-static {v14, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/dkj;->e(I)V

    .line 210
    goto/16 :goto_4

    .line 212
    :pswitch_2
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    .line 213
    invoke-static {v14}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 214
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unTLVGPSFileName() nameListsStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    new-instance v16, Lo/dla;

    invoke-direct/range {v16 .. v16}, Lo/dla;-><init>()V

    .line 216
    invoke-virtual/range {v16 .. v16}, Lo/dla;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    const-string v0, ";"

    invoke-virtual {v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v17

    .line 218
    const/4 v0, 0x0

    aget-object v0, v17, v0

    invoke-virtual {v12, v0}, Lo/dkj;->b(Ljava/lang/String;)V

    .line 219
    move-object/from16 v0, v17

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 220
    const/4 v0, 0x1

    aget-object v0, v17, v0

    invoke-virtual {v12, v0}, Lo/dkj;->c(Ljava/lang/String;)V

    .line 226
    :cond_0
    goto :goto_3

    .line 227
    :cond_1
    invoke-virtual {v12, v15}, Lo/dkj;->b(Ljava/lang/String;)V

    .line 229
    :goto_3
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    goto :goto_4

    .line 233
    :pswitch_3
    const/16 v0, 0x10

    invoke-static {v14, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/dkj;->b(I)V

    .line 200
    .line 234
    :cond_2
    :goto_4
    :pswitch_4
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_2

    .line 196
    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 193
    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 243
    :cond_5
    return-object v5

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static unTLVGetErrorCode(Lo/dba;)[I
    .locals 7

    .line 80
    iget-object v2, p0, Lo/dba;->e:Ljava/util/List;

    .line 81
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 82
    new-array v4, v3, [I

    .line 83
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 84
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v6

    .line 85
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 87
    :sswitch_0
    array-length v0, v4

    if-lez v0, :cond_0

    .line 88
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    goto :goto_1

    .line 92
    :sswitch_1
    array-length v0, v4

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 93
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 83
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 100
    :cond_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_1
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method public static unTLVGetRequestFileResponse(Lo/dba;)[I
    .locals 7

    .line 111
    iget-object v2, p0, Lo/dba;->e:Ljava/util/List;

    .line 112
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 113
    new-array v4, v3, [I

    .line 114
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 115
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v6

    .line 116
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 118
    :sswitch_0
    array-length v0, v4

    if-lez v0, :cond_0

    .line 119
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    goto :goto_1

    .line 123
    :sswitch_1
    array-length v0, v4

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 124
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 114
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 131
    :cond_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x7f -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public getAckCode([B)[I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 344
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getAckCode()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 346
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 347
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 348
    invoke-static {v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unTLVGetErrorCode(Lo/dba;)[I

    move-result-object v7

    .line 349
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v7, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    return-object v7
.end method

.method public getAckCodeExt([B)[I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 358
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getAckCodeExt()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 360
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 361
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 362
    invoke-static {v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unTLVGetRequestFileResponse(Lo/dba;)[I

    move-result-object v7

    .line 363
    array-length v0, v7

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 364
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAckCodeExt Error Code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v7, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  apply offset = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget v3, v7, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    :cond_0
    return-object v7
.end method

.method public getErrorCode([B)[I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 63
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getErrorCode()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 66
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 67
    invoke-static {v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unTLVGetErrorCode(Lo/dba;)[I

    move-result-object v7

    .line 68
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v7, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-object v7
.end method

.method public setMaintLogRule([B)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 460
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.10.7 unLogRule Enter ... data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 462
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 463
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 464
    invoke-virtual {p0, v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unLogRule(Lo/dba;)I

    move-result v0

    return v0
.end method

.method public setMaintResearchSwitch([B)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 484
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.10.8unResearchSwitch Enter ... data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 486
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 487
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 488
    invoke-virtual {p0, v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unResearchSwitch(Lo/dba;)I

    move-result v0

    return v0
.end method

.method public unApplyDataFromDevice([B)Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 400
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AckAndFileTransferActiveReport enter... data.length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    new-instance v4, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;

    invoke-direct {v4}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;-><init>()V

    .line 402
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 403
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 404
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 405
    invoke-direct {p0, v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unApplyData(Ljava/lang/String;)Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;

    move-result-object v4

    .line 407
    :cond_0
    return-object v4
.end method

.method public unFileValidityResult([B)[Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 426
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unFileValidityResult()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 428
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 429
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 430
    invoke-direct {p0, v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unTLVFileValidityResult(Lo/dba;)[Ljava/lang/String;

    move-result-object v7

    .line 431
    return-object v7
.end method

.method public unGPSApplyDataFromDevice([B)Lo/dkh;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 374
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGPSApplyDataFromDevice enter... data.length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    new-instance v4, Lo/dkh;

    invoke-direct {v4}, Lo/dkh;-><init>()V

    .line 376
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 377
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 378
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 379
    invoke-direct {p0, v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGPSApplyData(Ljava/lang/String;)Lo/dkh;

    move-result-object v4

    .line 381
    :cond_0
    return-object v4
.end method

.method public unGetFileName([B)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 138
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 139
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unGetFileName enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 141
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 143
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v7

    .line 144
    invoke-static {v7}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unTLVFileName(Lo/dba;)[Ljava/lang/String;

    move-result-object v8

    .line 145
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 146
    const/4 v9, 0x0

    :goto_0
    array-length v0, v8

    if-ge v9, v0, :cond_0

    .line 147
    aget-object v0, v8, v9

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 150
    :cond_0
    return-object v4
.end method

.method public unGetGPSFileName([B)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)Ljava/util/List<Lo/dkj;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 174
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unGetGPSFileName enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 176
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetGPSFileName info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 178
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetGPSFileName tlvsString = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 180
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetGPSFileName tlvFather = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetGPSFileName tlv = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-static {v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unTLVGPSFileName(Lo/dba;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public unGetMaintParameters([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 250
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unGetMaintenanceParameters enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 252
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 254
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 255
    invoke-static {v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGetMaintParameters(Lo/dba;)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    move-result-object v0

    return-object v0
.end method

.method public unLogRule(Lo/dba;)I
    .locals 7

    .line 471
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.9.7 unLogRule enter.. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    const/4 v4, 0x0

    .line 473
    iget-object v5, p1, Lo/dba;->e:Ljava/util/List;

    .line 474
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/daw;

    .line 475
    invoke-virtual {v6}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 476
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unLogRule :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    return v4
.end method

.method public unQueryFileInformation([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 303
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unQueryFileInformation enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 305
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 307
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->tlvUtils:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 308
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unQueryFileInformation  support_response = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    invoke-static {v6}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unQueryFileInformation(Lo/dba;)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    move-result-object v0

    return-object v0
.end method

.method public unResearchSwitch(Lo/dba;)I
    .locals 7

    .line 495
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.10.8 unResearchSwitch enter.. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    const/4 v4, 0x0

    .line 497
    iget-object v5, p1, Lo/dba;->e:Ljava/util/List;

    .line 498
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/daw;

    .line 499
    invoke-virtual {v6}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 500
    const-string v0, "CommandUnpackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unResearchSwitch :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    return v4
.end method
