.class public Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field private static final TA_JSON_KEY_AID:Ljava/lang/String; = "aid"

.field private static final TA_JSON_KEY_BACKGROUND_FILE_NAME:Ljava/lang/String; = "background_file_name"

.field private static final TA_JSON_KEY_BACKGROUND_FILE_TIME:Ljava/lang/String; = "background_file_time"

.field private static final TA_JSON_KEY_CARDCLASSFYTYPE:Ljava/lang/String; = "card_type"

.field private static final TA_JSON_KEY_CARDGROUPTYPE:Ljava/lang/String; = "card_group_type"

.field private static final TA_JSON_KEY_CARDSTATUS:Ljava/lang/String; = "card_status"

.field private static final TA_JSON_KEY_DPANDIGEST:Ljava/lang/String; = "dpan_digest"

.field private static final TA_JSON_KEY_DPANFOUR:Ljava/lang/String; = "dpan_four"

.field private static final TA_JSON_KEY_FPANDIGEST:Ljava/lang/String; = "fpan_digest"

.field private static final TA_JSON_KEY_FPANFOUR:Ljava/lang/String; = "fpan_four"

.field private static final TA_JSON_KEY_ISDEFAULTCARD:Ljava/lang/String; = "is_default_card"

.field private static final TA_JSON_KEY_ISSUERID:Ljava/lang/String; = "issuerId"

.field private static final TA_JSON_KEY_NAME:Ljava/lang/String; = "name"

.field private static final TA_JSON_KEY_PRODUCTID:Ljava/lang/String; = "productId"

.field private static final TA_JSON_KEY_RF_FILE_NAME:Ljava/lang/String; = "Rf_file_name"

.field private static final TA_JSON_KEY_RF_FILE_TIME:Ljava/lang/String; = "Rf_File_time"

.field private static final TA_JSON_KEY_STATUSUPDATETIME:Ljava/lang/String; = "status_update_time"


# instance fields
.field public Rf_File_time:J

.field public Rf_file_name:Ljava/lang/String;

.field public aid:Ljava/lang/String;

.field public background_file_name:Ljava/lang/String;

.field public background_file_time:J

.field private busCityCd:Ljava/lang/String;

.field public cardGroupType:I

.field public cardStatus:I

.field public cardType:I

.field public dpanDigest:Ljava/lang/String;

.field public dpanFour:Ljava/lang/String;

.field public fpanDigest:Ljava/lang/String;

.field public fpanFour:Ljava/lang/String;

.field public isDefaultCard:Z

.field public isSNB:Z

.field public issuerId:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public productId:Ljava/lang/String;

.field public statusUpdateTime:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    .line 207
    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    .line 237
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 239
    const-string v0, "aid"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    const-string v0, "aid"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 244
    :cond_0
    const-string v0, "productId"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 246
    const-string v0, "productId"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 249
    :cond_1
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 251
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 254
    :cond_2
    const-string v0, "card_group_type"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 256
    const-string v0, "card_group_type"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    .line 259
    :cond_3
    const-string v0, "is_default_card"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 261
    const-string v0, "is_default_card"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 264
    :cond_4
    const-string v0, "fpan_digest"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 266
    const-string v0, "fpan_digest"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    .line 269
    :cond_5
    const-string v0, "fpan_four"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 271
    const-string v0, "fpan_four"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    .line 274
    :cond_6
    const-string v0, "dpan_digest"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 276
    const-string v0, "dpan_digest"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    .line 279
    :cond_7
    const-string v0, "dpan_four"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 281
    const-string v0, "dpan_four"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    .line 284
    :cond_8
    const-string v0, "card_status"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 286
    const-string v0, "card_status"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 289
    :cond_9
    const-string v0, "status_update_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 291
    const-string v0, "status_update_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 295
    :cond_a
    const-string v0, "card_type"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 297
    const-string v0, "card_type"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    .line 303
    :cond_b
    const-string v0, "name"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 305
    const-string v0, "name"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    .line 308
    :cond_c
    const-string v0, "Rf_file_name"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 310
    const-string v0, "Rf_file_name"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    .line 313
    :cond_d
    const-string v0, "Rf_File_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 315
    const-string v0, "Rf_File_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_File_time:J

    .line 318
    :cond_e
    const-string v0, "background_file_name"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 320
    const-string v0, "background_file_name"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    .line 324
    :cond_f
    const-string v0, "background_file_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 326
    const-string v0, "background_file_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_time:J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 332
    :cond_10
    goto :goto_0

    .line 329
    :catch_0
    move-exception v2

    .line 331
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "create ta card info failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 333
    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJILjava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V
    .locals 2

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    .line 213
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 214
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 215
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 216
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    .line 217
    iput-boolean p5, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 218
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    .line 219
    iput-object p7, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    .line 220
    iput-object p8, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    .line 221
    iput-object p9, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    .line 222
    iput p10, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 223
    iput-wide p11, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 224
    iput p13, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    .line 225
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    .line 226
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    .line 227
    move-wide/from16 v0, p16

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_File_time:J

    .line 228
    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    .line 229
    move-wide/from16 v0, p19

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_time:J

    .line 231
    return-void
.end method


# virtual methods
.method protected clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 2

    .line 378
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 380
    :catch_0
    move-exception v1

    .line 382
    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 18
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v0

    return-object v0
.end method

.method public getAid()Ljava/lang/String;
    .locals 1

    .line 413
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getBackground_file_name()Ljava/lang/String;
    .locals 1

    .line 563
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    return-object v0
.end method

.method public getBackground_file_time()J
    .locals 2

    .line 573
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_time:J

    return-wide v0
.end method

.method public getBusCityCd()Ljava/lang/String;
    .locals 1

    .line 595
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->busCityCd:Ljava/lang/String;

    return-object v0
.end method

.method public getCardGroupType()I
    .locals 1

    .line 443
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCardStatus()I
    .locals 1

    .line 503
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    return v0
.end method

.method public getCardType()I
    .locals 1

    .line 523
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    return v0
.end method

.method public getDpanDigest()Ljava/lang/String;
    .locals 1

    .line 483
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    return-object v0
.end method

.method public getDpanFour()Ljava/lang/String;
    .locals 1

    .line 493
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    return-object v0
.end method

.method public getFpanDigest()Ljava/lang/String;
    .locals 1

    .line 463
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    return-object v0
.end method

.method public getFpanFour()Ljava/lang/String;
    .locals 1

    .line 473
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 433
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 533
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 423
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getRf_File_time()J
    .locals 2

    .line 553
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_File_time:J

    return-wide v0
.end method

.method public getRf_file_name()Ljava/lang/String;
    .locals 1

    .line 543
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusUpdateTime()J
    .locals 2

    .line 513
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    return-wide v0
.end method

.method getTaCardInfoJsonStr()Ljava/lang/String;
    .locals 5

    .line 342
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 345
    const-string v0, "aid"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 346
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 347
    const-string v0, "issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 348
    const-string v0, "card_group_type"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 349
    const-string v0, "is_default_card"

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 350
    const-string v0, "fpan_digest"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 351
    const-string v0, "fpan_four"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 352
    const-string v0, "dpan_digest"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 353
    const-string v0, "dpan_four"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 354
    const-string v0, "card_status"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 355
    const-string v0, "status_update_time"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 356
    const-string v0, "card_type"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 358
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 359
    const-string v0, "Rf_file_name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 360
    const-string v0, "Rf_File_time"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_File_time:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 361
    const-string v0, "background_file_name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 362
    const-string v0, "background_file_time"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_time:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 368
    goto :goto_0

    .line 364
    :catch_0
    move-exception v4

    .line 366
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getTaCardInfoJsonStr, json exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 367
    const/4 v3, 0x0

    .line 370
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public isCardStatusPayedNotOpened()Z
    .locals 2

    .line 582
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    .line 585
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 587
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isDefaultCard()Z
    .locals 1

    .line 453
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    return v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 418
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 419
    return-void
.end method

.method public setBackground_file_name(Ljava/lang/String;)V
    .locals 0

    .line 568
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    .line 569
    return-void
.end method

.method public setBackground_file_time(J)V
    .locals 0

    .line 578
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_time:J

    .line 579
    return-void
.end method

.method public setBusCityCd(Ljava/lang/String;)V
    .locals 0

    .line 591
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->busCityCd:Ljava/lang/String;

    .line 592
    return-void
.end method

.method public setCardGroupType(I)V
    .locals 0

    .line 448
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    .line 449
    return-void
.end method

.method public setCardStatus(I)V
    .locals 0

    .line 508
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 509
    return-void
.end method

.method public setCardType(I)V
    .locals 0

    .line 528
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    .line 529
    return-void
.end method

.method public setDefaultCard(Z)V
    .locals 0

    .line 458
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 459
    return-void
.end method

.method public setDpanDigest(Ljava/lang/String;)V
    .locals 0

    .line 488
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    .line 489
    return-void
.end method

.method public setDpanFour(Ljava/lang/String;)V
    .locals 0

    .line 498
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    .line 499
    return-void
.end method

.method public setFpanDigest(Ljava/lang/String;)V
    .locals 0

    .line 468
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    .line 469
    return-void
.end method

.method public setFpanFour(Ljava/lang/String;)V
    .locals 0

    .line 478
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    .line 479
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 439
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 538
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    .line 539
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 428
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 429
    return-void
.end method

.method public setRf_File_time(J)V
    .locals 0

    .line 558
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_File_time:J

    .line 559
    return-void
.end method

.method public setRf_file_name(Ljava/lang/String;)V
    .locals 0

    .line 548
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    .line 549
    return-void
.end method

.method public setStatusUpdateTime(J)V
    .locals 0

    .line 518
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 519
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 389
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 390
    const-string v0, "cardType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 391
    const-string v0, "isDefaultCard="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 392
    const-string v0, "imeiDigest="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 393
    const-string v0, "imeiFour="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 394
    const-string v0, "numberDigest="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 395
    const-string v0, "numberFour="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 396
    const-string v0, "aid="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 397
    const-string v0, "productId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 398
    const-string v0, "issuerId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 399
    const-string v0, "cardStatus="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 400
    const-string v0, "statusUpdateTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 401
    const-string v0, "cardClassfyType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 403
    const-string v0, "name="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 404
    const-string v0, "Rf_file_name="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 405
    const-string v0, "Rf_File_time="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_File_time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 406
    const-string v0, "background_file_name="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 407
    const-string v0, "background_file_time="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 408
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
