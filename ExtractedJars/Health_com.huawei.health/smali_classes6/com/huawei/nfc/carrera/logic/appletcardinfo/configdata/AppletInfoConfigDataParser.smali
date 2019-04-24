.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final QUERY_RECORDS_CNT:I = 0xa

.field private static final TAG:Ljava/lang/String; = "AppletInfoConfigDataParser"

.field private static cardInfoFields:[Ljava/lang/String; = null


# instance fields
.field private appletConfigOriData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private jsonDataForProduct:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 47
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "num"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "amount"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "date"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "status"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "records"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "consumerecords"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->cardInfoFields:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->jsonDataForProduct:Ljava/util/Map;

    .line 65
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->mContext:Landroid/content/Context;

    .line 66
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->appletConfigOriData:Ljava/util/List;

    .line 67
    return-void
.end method

.method private fetchApduDataJsonFromLocalAssetInfo(Ljava/lang/String;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->jsonDataForProduct:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 270
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    const/4 v3, 0x5

    .line 273
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseJson2ApduSet does not have local apdu json data for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 274
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    invoke-direct {v0, v3, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 278
    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 279
    invoke-interface {p2}, Ljava/util/Map;->clear()V

    .line 280
    sget-object v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->cardInfoFields:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 282
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 280
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 293
    :cond_2
    goto :goto_1

    .line 288
    :catch_0
    move-exception v3

    .line 290
    const/4 v4, 0x4

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fetchApduDataJsonFromLocalAssetInfo failed. parse exception json : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 292
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    invoke-direct {v0, v4, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 294
    :goto_1
    const-string v0, "parseJson2ApduSet fetch apdu data from local asset info end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 295
    return-void
.end method

.method private findDataByType(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->appletConfigOriData:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->appletConfigOriData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->appletConfigOriData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 146
    if-eqz v2, :cond_2

    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 148
    return-object v2

    .line 150
    :cond_2
    goto :goto_0

    .line 151
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private findTargetJsonData(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 114
    const/4 v2, 0x0

    .line 117
    const/4 v3, 0x0

    .line 118
    :try_start_0
    sget-object v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->cardInfoFields:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 120
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->findDataByType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 121
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 135
    :cond_1
    goto :goto_1

    .line 131
    :catch_0
    move-exception v3

    .line 133
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "findTargetJsonData exception. json : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 136
    :goto_1
    return-void
.end method

.method private parseApduInfoJson(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 156
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 157
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v7

    .line 158
    const/4 v8, 0x0

    .line 159
    const-string v9, ""

    .line 160
    const/4 v10, 0x0

    .line 161
    const/4 v11, 0x0

    .line 162
    const/4 v12, 0x0

    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    :goto_0
    if-ge v15, v7, :cond_7

    .line 167
    add-int/lit8 v10, v15, 0x1

    .line 168
    const/16 v16, 0x0

    .line 171
    move-object/from16 v0, p2

    :try_start_0
    invoke-virtual {v0, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v16

    .line 172
    const/4 v11, 0x0

    .line 173
    const-string v0, "apdu"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    const-string v0, "apdu"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 177
    :cond_0
    const/4 v0, 0x1

    invoke-static {v11, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    const/4 v8, 0x2

    .line 180
    const-string v9, "apdu json config error"

    .line 181
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    invoke-direct {v0, v8, v9}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 183
    :cond_1
    const/4 v12, 0x0

    .line 184
    const-string v0, "ck"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    const-string v0, "ck"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 188
    :cond_2
    const/4 v0, 0x1

    invoke-static {v12, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 190
    const-string v12, "9000"

    .line 193
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 194
    const-string v0, ","

    const-string v1, "|"

    invoke-virtual {v12, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    .line 198
    :cond_4
    const/16 v17, 0x0

    .line 199
    const/4 v13, 0x0

    .line 200
    const-string v0, "op"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 202
    const-string v0, "op"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 204
    :cond_5
    move-object/from16 v0, v17

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 206
    invoke-static/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/OperationGenerator;->parseOperations(Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 208
    :cond_6
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    move v1, v10

    move-object v2, v11

    move-object v3, v12

    move-object/from16 v4, p1

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object v14, v0

    .line 209
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    goto :goto_1

    .line 211
    :catch_0
    move-exception v17

    .line 213
    const/4 v8, 0x4

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse apdu json error. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 215
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    invoke-direct {v0, v8, v9}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 165
    :goto_1
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 218
    :cond_7
    return-object v6
.end method

.method private parseRecordReadCommands(Ljava/util/List;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;"
        }
    .end annotation

    .line 223
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 224
    const/4 v7, 0x1

    .line 225
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 227
    instance-of v0, v9, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    if-nez v0, :cond_0

    .line 229
    goto :goto_0

    .line 231
    :cond_0
    move-object v10, v9

    check-cast v10, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    .line 232
    invoke-virtual {v10, v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->setIndex(I)V

    .line 233
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getOperations()Ljava/util/List;

    move-result-object v11

    .line 234
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getApdu()Ljava/lang/String;

    move-result-object v12

    .line 235
    if-eqz v11, :cond_1

    const-string v0, "%"

    invoke-virtual {v12, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 238
    :cond_1
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_3

    .line 241
    :cond_2
    const-string v0, "%"

    invoke-virtual {v12, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 244
    const-string v0, ","

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 245
    move-object v15, v14

    array-length v0, v15

    move/from16 v16, v0

    const/16 v17, 0x0

    :goto_1
    move/from16 v0, v17

    move/from16 v1, v16

    if-ge v0, v1, :cond_4

    aget-object v18, v15, v17

    .line 247
    const/16 v19, 0x1

    :goto_2
    move/from16 v0, v19

    const/16 v1, 0xa

    if-gt v0, v1, :cond_3

    .line 249
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    move v1, v7

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object/from16 v3, v18

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getChecker()Ljava/lang/String;

    move-result-object v3

    .line 250
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getOperations()Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object v13, v0

    .line 251
    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    add-int/lit8 v7, v7, 0x1

    .line 247
    add-int/lit8 v19, v19, 0x1

    goto :goto_2

    .line 245
    :cond_3
    add-int/lit8 v17, v17, 0x1

    goto :goto_1

    .line 255
    :cond_4
    goto :goto_3

    .line 258
    :cond_5
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    add-int/lit8 v7, v7, 0x1

    .line 262
    :goto_3
    goto/16 :goto_0

    .line 263
    :cond_6
    return-object v6
.end method


# virtual methods
.method parseJson2ApduSet(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 71
    const-string v0, "AppletInfoConfigDataParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseJson2ApduSet begin for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 73
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->findTargetJsonData(Ljava/util/Map;)V

    .line 74
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_0
    const-string v5, ""

    .line 80
    new-instance v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;-><init>()V

    .line 84
    :try_start_0
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 87
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v5, v0

    .line 88
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 90
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 91
    const-string v0, "records"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "consumerecords"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 93
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v7, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->parseApduInfoJson(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v7, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->add(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    .line 97
    :cond_1
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v7, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->parseApduInfoJson(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/AppletInfoConfigDataParser;->parseRecordReadCommands(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v7, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->add(Ljava/lang/String;Ljava/util/List;)V

    .line 100
    :cond_2
    :goto_1
    goto :goto_0

    .line 101
    :cond_3
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->compareCardNumAndDateApdus()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    goto :goto_2

    .line 103
    :catch_0
    move-exception v7

    .line 105
    const/4 v8, 0x4

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse apdu json error. json : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 107
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    invoke-direct {v0, v8, v9}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 109
    :goto_2
    return-object v6
.end method
