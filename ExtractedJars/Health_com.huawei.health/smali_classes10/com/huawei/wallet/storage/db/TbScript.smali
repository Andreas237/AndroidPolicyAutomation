.class public Lcom/huawei/wallet/storage/db/TbScript;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Class<*>;)Ljava/lang/String;"
        }
    .end annotation

    .line 37
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/huawei/wallet/storage/db/TbScript;->e(ILjava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 38
    if-eqz v2, :cond_0

    array-length v0, v2

    if-gtz v0, :cond_1

    .line 40
    :cond_0
    const-string v0, ""

    return-object v0

    .line 42
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    const/4 v4, 0x0

    :goto_0
    array-length v0, v2

    if-ge v4, v0, :cond_4

    .line 45
    if-nez v4, :cond_2

    .line 47
    const-string v0, " ( "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    aget-object v0, v2, v4

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    const-string v0, " TEXT NOT NULL PRIMARY KEY "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 53
    :cond_2
    aget-object v0, v2, v4

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    const-string v0, " TEXT NOT NULL "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    :goto_1
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    if-eq v4, v0, :cond_3

    .line 58
    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 62
    :cond_3
    const-string v0, " ) "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 65
    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x200

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 66
    const-string v0, "CREATE TABLE IF NOT EXISTS "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x40

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 80
    const-string v0, "DROP TABLE "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final e(ILjava/lang/String;)[Ljava/lang/String;
    .locals 5

    .line 206
    const/4 v3, 0x0

    .line 207
    const-string v0, "unicard"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    const/16 v0, 0xf

    new-array v3, v0, [Ljava/lang/String;

    .line 210
    const-string v0, "productID"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 211
    const-string v0, "name"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 212
    const-string v0, "description"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 213
    const-string v0, "type"

    const/4 v1, 0x3

    aput-object v0, v3, v1

    .line 214
    const-string v0, "extType"

    const/4 v1, 0x4

    aput-object v0, v3, v1

    .line 215
    const-string v0, "cardNum"

    const/4 v1, 0x5

    aput-object v0, v3, v1

    .line 216
    const-string v0, "virCardNum"

    const/4 v1, 0x6

    aput-object v0, v3, v1

    .line 217
    const-string v0, "issuerID"

    const/4 v1, 0x7

    aput-object v0, v3, v1

    .line 218
    const-string v0, "logoPicLocalPath"

    const/16 v1, 0x8

    aput-object v0, v3, v1

    .line 219
    const-string v0, "logoPicUrl"

    const/16 v1, 0x9

    aput-object v0, v3, v1

    .line 220
    const-string v0, "pictureLocalPath"

    const/16 v1, 0xa

    aput-object v0, v3, v1

    .line 221
    const-string v0, "pictureUrl"

    const/16 v1, 0xb

    aput-object v0, v3, v1

    .line 222
    const-string v0, "mktDesc"

    const/16 v1, 0xc

    aput-object v0, v3, v1

    .line 223
    const-string v0, "mktUrl"

    const/16 v1, 0xd

    aput-object v0, v3, v1

    .line 224
    const-string v0, "timestamp"

    const/16 v1, 0xe

    aput-object v0, v3, v1

    goto :goto_0

    .line 226
    :cond_0
    const-string v0, "bankapp"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    const/4 v0, 0x7

    new-array v3, v0, [Ljava/lang/String;

    .line 229
    const-string v0, "productID"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 230
    const-string v0, "logoPicLocalPath"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 231
    const-string v0, "logoPicUrl"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 232
    const-string v0, "appID"

    const/4 v1, 0x3

    aput-object v0, v3, v1

    .line 233
    const-string v0, "pkgName"

    const/4 v1, 0x4

    aput-object v0, v3, v1

    .line 234
    const-string v0, "hotLine"

    const/4 v1, 0x5

    aput-object v0, v3, v1

    .line 235
    const-string v0, "name"

    const/4 v1, 0x6

    aput-object v0, v3, v1

    .line 237
    :cond_1
    :goto_0
    const/4 v0, 0x2

    if-ne v0, p0, :cond_3

    .line 239
    const/4 v4, 0x0

    .line 240
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 242
    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    new-array v4, v0, [Ljava/lang/String;

    .line 243
    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 245
    :cond_2
    return-object v4

    .line 247
    :cond_3
    return-object v3
.end method
