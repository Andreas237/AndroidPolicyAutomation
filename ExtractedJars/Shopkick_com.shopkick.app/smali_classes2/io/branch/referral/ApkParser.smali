.class Lio/branch/referral/ApkParser;
.super Ljava/lang/Object;
.source "ApkParser.java"


# static fields
.field private static final endDocTag:I = 0x100101

.field private static final endTag:I = 0x100103

.field private static final startTag:I = 0x100102


# direct methods
.method constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private LEW([BI)I
    .locals 3

    add-int/lit8 v0, p2, 0x3

    .line 281
    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    aget-byte p1, p1, p2

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    return p1
.end method

.method private compXmlString([BIII)Ljava/lang/String;
    .locals 0

    if-gez p4, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    mul-int/lit8 p4, p4, 0x4

    add-int/2addr p2, p4

    .line 248
    invoke-direct {p0, p1, p2}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result p2

    add-int/2addr p3, p2

    .line 249
    invoke-direct {p0, p1, p3}, Lio/branch/referral/ApkParser;->compXmlStringAt([BI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private compXmlStringAt([BI)Ljava/lang/String;
    .locals 5

    add-int/lit8 v0, p2, 0x1

    .line 262
    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    aget-byte v1, p1, p2

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    .line 263
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    add-int/lit8 v3, p2, 0x2

    mul-int/lit8 v4, v2, 0x2

    add-int/2addr v3, v4

    .line 265
    aget-byte v3, p1, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 267
    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([B)V

    return-object p1
.end method

.method private validURI(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "http"

    .line 214
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    .line 215
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "geo"

    .line 216
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "*"

    .line 217
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "package"

    .line 218
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "sms"

    .line 219
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "smsto"

    .line 220
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mms"

    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mmsto"

    .line 222
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "tel"

    .line 223
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "voicemail"

    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "file"

    .line 225
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "content"

    .line 226
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mailto"

    .line 227
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public decompressXMLForValidator([B)Lorg/json/JSONObject;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 51
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 52
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 53
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const/16 v5, 0x10

    .line 61
    invoke-direct {v1, v0, v5}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v5

    mul-int/lit8 v5, v5, 0x4

    const/16 v6, 0x24

    add-int/2addr v5, v6

    const/16 v7, 0xc

    .line 74
    invoke-direct {v1, v0, v7}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v7

    move v8, v7

    .line 76
    :goto_0
    array-length v9, v0

    add-int/lit8 v9, v9, -0x4

    const v10, 0x100102

    if-ge v8, v9, :cond_1

    .line 77
    invoke-direct {v1, v0, v8}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v9

    if-ne v9, v10, :cond_0

    move v7, v8

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v8, 0x4

    goto :goto_0

    :cond_1
    :goto_1
    :try_start_0
    const-string v8, ""

    .line 112
    :goto_2
    array-length v9, v0

    if-ge v7, v9, :cond_12

    .line 113
    invoke-direct {v1, v0, v7}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v9

    if-ne v9, v10, :cond_f

    add-int/lit8 v9, v7, 0x1c

    .line 115
    invoke-direct {v1, v0, v9}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v9

    add-int/lit8 v7, v7, 0x24

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v9, :cond_10

    add-int/lit8 v12, v7, 0x4

    .line 119
    invoke-direct {v1, v0, v12}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v12

    add-int/lit8 v13, v7, 0x8

    .line 120
    invoke-direct {v1, v0, v13}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v13

    add-int/lit8 v14, v7, 0x10

    .line 121
    invoke-direct {v1, v0, v14}, Lio/branch/referral/ApkParser;->LEW([BI)I

    move-result v14

    add-int/lit8 v7, v7, 0x14

    .line 124
    invoke-direct {v1, v0, v6, v5, v12}, Lio/branch/referral/ApkParser;->compXmlString([BIII)Ljava/lang/String;

    move-result-object v12

    const-string v15, "scheme"

    .line 125
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    const/4 v10, -0x1

    if-eqz v15, :cond_7

    if-eq v13, v10, :cond_2

    .line 126
    invoke-direct {v1, v0, v6, v5, v13}, Lio/branch/referral/ApkParser;->compXmlString([BIII)Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :cond_2
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "resourceID 0x"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 127
    :goto_4
    invoke-direct {v1, v10}, Lio/branch/referral/ApkParser;->validURI(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 129
    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 131
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 132
    invoke-virtual {v2, v10, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    :cond_3
    const-string v8, "0"

    .line 133
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    const-string v8, "0"

    .line 135
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/json/JSONArray;

    .line 136
    invoke-virtual {v2, v10, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v8, "0"

    .line 137
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_4
    :goto_5
    move-object v8, v10

    :cond_5
    const-string v12, "http"

    .line 141
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    const-string v12, "https"

    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    :cond_6
    move-object v8, v10

    goto/16 :goto_9

    :cond_7
    const-string v15, "host"

    .line 144
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    if-eq v13, v10, :cond_8

    .line 145
    invoke-direct {v1, v0, v6, v5, v13}, Lio/branch/referral/ApkParser;->compXmlString([BIII)Ljava/lang/String;

    move-result-object v10

    goto :goto_6

    :cond_8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "resourceID 0x"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 147
    :goto_6
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    if-eqz v8, :cond_9

    const-string v12, "https"

    .line 148
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    const-string v12, "http"

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    .line 150
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    .line 151
    invoke-virtual {v12, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 152
    invoke-virtual {v2, v8, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_9

    :cond_9
    const-string v12, "https"

    .line 153
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    const-string v12, "http"

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_7

    .line 156
    :cond_a
    new-instance v12, Lorg/json/JSONArray;

    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 157
    invoke-virtual {v12, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v10, "0"

    .line 158
    invoke-virtual {v2, v10, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_9

    .line 154
    :cond_b
    :goto_7
    invoke-virtual {v3, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_9

    :cond_c
    const-string v15, "name"

    .line 160
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    if-eq v13, v10, :cond_d

    .line 162
    invoke-direct {v1, v0, v6, v5, v13}, Lio/branch/referral/ApkParser;->compXmlString([BIII)Ljava/lang/String;

    move-result-object v10

    goto :goto_8

    :cond_d
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "resourceID 0x"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    :goto_8
    const-string v12, "android.intent.action.VIEW"

    .line 163
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    const/4 v8, 0x0

    :cond_e
    :goto_9
    add-int/lit8 v11, v11, 0x1

    const v10, 0x100102

    goto/16 :goto_3

    :cond_f
    const v10, 0x100103

    if-ne v9, v10, :cond_11

    add-int/lit8 v7, v7, 0x18

    :cond_10
    const v10, 0x100102

    goto/16 :goto_2

    :cond_11
    const v0, 0x100101

    :cond_12
    const-string v0, "0"

    .line 177
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 178
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->URIScheme:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->AppLinks:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    .line 181
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_a
    return-object v4
.end method
