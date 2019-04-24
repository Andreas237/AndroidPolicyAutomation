.class public final Lokhttp3/Cookie;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Cookie$Builder;
    }
.end annotation


# static fields
.field private static final DAY_OF_MONTH_PATTERN:Ljava/util/regex/Pattern;

.field private static final MONTH_PATTERN:Ljava/util/regex/Pattern;

.field private static final TIME_PATTERN:Ljava/util/regex/Pattern;

.field private static final YEAR_PATTERN:Ljava/util/regex/Pattern;


# instance fields
.field private final domain:Ljava/lang/String;

.field private final expiresAt:J

.field private final hostOnly:Z

.field private final httpOnly:Z

.field private final name:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private final persistent:Z

.field private final secure:Z

.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "(\\d{2,4})[^\\d]*"

    .line 45
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lokhttp3/Cookie;->YEAR_PATTERN:Ljava/util/regex/Pattern;

    .line 46
    const-string v0, "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"

    .line 47
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lokhttp3/Cookie;->MONTH_PATTERN:Ljava/util/regex/Pattern;

    .line 48
    const-string v0, "(\\d{1,2})[^\\d]*"

    .line 49
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lokhttp3/Cookie;->DAY_OF_MONTH_PATTERN:Ljava/util/regex/Pattern;

    .line 50
    const-string v0, "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"

    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lokhttp3/Cookie;->TIME_PATTERN:Ljava/util/regex/Pattern;

    .line 50
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lokhttp3/Cookie;->name:Ljava/lang/String;

    .line 67
    iput-object p2, p0, Lokhttp3/Cookie;->value:Ljava/lang/String;

    .line 68
    iput-wide p3, p0, Lokhttp3/Cookie;->expiresAt:J

    .line 69
    iput-object p5, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    .line 70
    iput-object p6, p0, Lokhttp3/Cookie;->path:Ljava/lang/String;

    .line 71
    iput-boolean p7, p0, Lokhttp3/Cookie;->secure:Z

    .line 72
    iput-boolean p8, p0, Lokhttp3/Cookie;->httpOnly:Z

    .line 73
    iput-boolean p9, p0, Lokhttp3/Cookie;->hostOnly:Z

    .line 74
    iput-boolean p10, p0, Lokhttp3/Cookie;->persistent:Z

    .line 75
    return-void
.end method

.method private constructor <init>(Lokhttp3/Cookie$Builder;)V
    .locals 2

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iget-object v0, p1, Lokhttp3/Cookie$Builder;->name:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "builder.name == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_0
    iget-object v0, p1, Lokhttp3/Cookie$Builder;->value:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "builder.value == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_1
    iget-object v0, p1, Lokhttp3/Cookie$Builder;->domain:Ljava/lang/String;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "builder.domain == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_2
    iget-object v0, p1, Lokhttp3/Cookie$Builder;->name:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/Cookie;->name:Ljava/lang/String;

    .line 83
    iget-object v0, p1, Lokhttp3/Cookie$Builder;->value:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/Cookie;->value:Ljava/lang/String;

    .line 84
    iget-wide v0, p1, Lokhttp3/Cookie$Builder;->expiresAt:J

    iput-wide v0, p0, Lokhttp3/Cookie;->expiresAt:J

    .line 85
    iget-object v0, p1, Lokhttp3/Cookie$Builder;->domain:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    .line 86
    iget-object v0, p1, Lokhttp3/Cookie$Builder;->path:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/Cookie;->path:Ljava/lang/String;

    .line 87
    iget-boolean v0, p1, Lokhttp3/Cookie$Builder;->secure:Z

    iput-boolean v0, p0, Lokhttp3/Cookie;->secure:Z

    .line 88
    iget-boolean v0, p1, Lokhttp3/Cookie$Builder;->httpOnly:Z

    iput-boolean v0, p0, Lokhttp3/Cookie;->httpOnly:Z

    .line 89
    iget-boolean v0, p1, Lokhttp3/Cookie$Builder;->persistent:Z

    iput-boolean v0, p0, Lokhttp3/Cookie;->persistent:Z

    .line 90
    iget-boolean v0, p1, Lokhttp3/Cookie$Builder;->hostOnly:Z

    iput-boolean v0, p0, Lokhttp3/Cookie;->hostOnly:Z

    .line 91
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/Cookie$Builder;Lokhttp3/Cookie$1;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lokhttp3/Cookie;-><init>(Lokhttp3/Cookie$Builder;)V

    return-void
.end method

.method private static dateCharacterOffset(Ljava/lang/String;IIZ)I
    .locals 4

    .line 380
    move v1, p1

    :goto_0
    if-ge v1, p2, :cond_8

    .line 381
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 382
    const/16 v0, 0x20

    if-ge v2, v0, :cond_0

    const/16 v0, 0x9

    if-ne v2, v0, :cond_4

    :cond_0
    const/16 v0, 0x7f

    if-ge v2, v0, :cond_4

    const/16 v0, 0x30

    if-lt v2, v0, :cond_1

    const/16 v0, 0x39

    if-le v2, v0, :cond_4

    :cond_1
    const/16 v0, 0x61

    if-lt v2, v0, :cond_2

    const/16 v0, 0x7a

    if-le v2, v0, :cond_4

    :cond_2
    const/16 v0, 0x41

    if-lt v2, v0, :cond_3

    const/16 v0, 0x5a

    if-le v2, v0, :cond_4

    :cond_3
    const/16 v0, 0x3a

    if-ne v2, v0, :cond_5

    :cond_4
    const/4 v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    .line 387
    :goto_1
    if-nez p3, :cond_6

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    if-ne v3, v0, :cond_7

    return v1

    .line 380
    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 389
    :cond_8
    return p2
.end method

.method private static domainMatch(Lokhttp3/HttpUrl;Ljava/lang/String;)Z
    .locals 3

    .line 183
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v2

    .line 185
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    const/4 v0, 0x1

    return v0

    .line 189
    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_1

    .line 191
    invoke-static {v2}, Lokhttp3/internal/Util;->verifyAsIpAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 192
    const/4 v0, 0x1

    return v0

    .line 195
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static parse(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;
    .locals 32

    .line 222
    const/4 v11, 0x0

    .line 223
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v12

    .line 224
    move-object/from16 v0, p3

    const/16 v1, 0x3b

    invoke-static {v0, v11, v12, v1}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IIC)I

    move-result v13

    .line 226
    move-object/from16 v0, p3

    const/16 v1, 0x3d

    invoke-static {v0, v11, v13, v1}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IIC)I

    move-result v14

    .line 227
    if-ne v14, v13, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 229
    :cond_0
    move-object/from16 v0, p3

    invoke-static {v0, v11, v14}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v15

    .line 230
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 232
    :cond_1
    add-int/lit8 v0, v14, 0x1

    move-object/from16 v1, p3

    invoke-static {v1, v0, v13}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v16

    .line 234
    const-wide v17, 0xe677d21fdbffL

    .line 235
    const-wide/16 v19, -0x1

    .line 236
    const/16 v21, 0x0

    .line 237
    const/16 v22, 0x0

    .line 238
    const/16 v23, 0x0

    .line 239
    const/16 v24, 0x0

    .line 240
    const/16 v25, 0x1

    .line 241
    const/16 v26, 0x0

    .line 243
    add-int/lit8 v11, v13, 0x1

    .line 244
    :goto_0
    if-ge v11, v12, :cond_9

    .line 245
    move-object/from16 v0, p3

    const/16 v1, 0x3b

    invoke-static {v0, v11, v12, v1}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IIC)I

    move-result v27

    .line 247
    move-object/from16 v0, p3

    move/from16 v1, v27

    const/16 v2, 0x3d

    invoke-static {v0, v11, v1, v2}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IIC)I

    move-result v28

    .line 248
    move-object/from16 v0, p3

    move/from16 v1, v28

    invoke-static {v0, v11, v1}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v29

    .line 249
    move/from16 v0, v28

    move/from16 v1, v27

    if-ge v0, v1, :cond_2

    add-int/lit8 v0, v28, 0x1

    .line 250
    move-object/from16 v1, p3

    move/from16 v2, v27

    invoke-static {v1, v0, v2}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v30

    goto :goto_1

    :cond_2
    const-string v30, ""

    .line 253
    :goto_1
    const-string v0, "expires"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 255
    :try_start_0
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v0

    move-object/from16 v1, v30

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lokhttp3/Cookie;->parseExpires(Ljava/lang/String;II)J
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide/from16 v17, v0

    .line 256
    const/16 v26, 0x1

    .line 259
    goto :goto_2

    .line 257
    :catch_0
    move-exception v31

    .line 259
    goto :goto_2

    .line 260
    :cond_3
    const-string v0, "max-age"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 262
    :try_start_1
    invoke-static/range {v30 .. v30}, Lokhttp3/Cookie;->parseMaxAge(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v0

    move-wide/from16 v19, v0

    .line 263
    const/16 v26, 0x1

    .line 266
    goto :goto_2

    .line 264
    :catch_1
    move-exception v31

    .line 266
    goto :goto_2

    .line 267
    :cond_4
    const-string v0, "domain"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 269
    :try_start_2
    invoke-static/range {v30 .. v30}, Lokhttp3/Cookie;->parseDomain(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    move-object/from16 v21, v0

    .line 270
    const/16 v25, 0x0

    .line 273
    goto :goto_2

    .line 271
    :catch_2
    move-exception v31

    .line 273
    goto :goto_2

    .line 274
    :cond_5
    const-string v0, "path"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 275
    move-object/from16 v22, v30

    goto :goto_2

    .line 276
    :cond_6
    const-string v0, "secure"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 277
    const/16 v23, 0x1

    goto :goto_2

    .line 278
    :cond_7
    const-string v0, "httponly"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 279
    const/16 v24, 0x1

    .line 282
    :cond_8
    :goto_2
    add-int/lit8 v11, v27, 0x1

    .line 283
    goto/16 :goto_0

    .line 287
    :cond_9
    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, v19, v0

    if-nez v0, :cond_a

    .line 288
    const-wide/high16 v17, -0x8000000000000000L

    goto :goto_4

    .line 289
    :cond_a
    const-wide/16 v0, -0x1

    cmp-long v0, v19, v0

    if-eqz v0, :cond_d

    .line 290
    const-wide v0, 0x20c49ba5e353f7L

    cmp-long v0, v19, v0

    if-gtz v0, :cond_b

    const-wide/16 v0, 0x3e8

    mul-long v27, v19, v0

    goto :goto_3

    :cond_b
    const-wide v27, 0x7fffffffffffffffL

    .line 293
    :goto_3
    add-long v17, p0, v27

    .line 294
    cmp-long v0, v17, p0

    if-ltz v0, :cond_c

    const-wide v0, 0xe677d21fdbffL

    cmp-long v0, v17, v0

    if-lez v0, :cond_d

    .line 295
    :cond_c
    const-wide v17, 0xe677d21fdbffL

    .line 300
    :cond_d
    :goto_4
    if-nez v21, :cond_e

    .line 301
    invoke-virtual/range {p2 .. p2}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v21

    goto :goto_5

    .line 302
    :cond_e
    move-object/from16 v0, p2

    move-object/from16 v1, v21

    invoke-static {v0, v1}, Lokhttp3/Cookie;->domainMatch(Lokhttp3/HttpUrl;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 303
    const/4 v0, 0x0

    return-object v0

    .line 308
    :cond_f
    :goto_5
    if-eqz v22, :cond_10

    const-string v0, "/"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 309
    :cond_10
    invoke-virtual/range {p2 .. p2}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object v27

    .line 310
    move-object/from16 v0, v27

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v28

    .line 311
    if-eqz v28, :cond_11

    move-object/from16 v0, v27

    const/4 v1, 0x0

    move/from16 v2, v28

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    goto :goto_6

    :cond_11
    const-string v22, "/"

    .line 314
    :cond_12
    :goto_6
    new-instance v0, Lokhttp3/Cookie;

    move-object v1, v15

    move-object/from16 v2, v16

    move-wide/from16 v3, v17

    move-object/from16 v5, v21

    move-object/from16 v6, v22

    move/from16 v7, v23

    move/from16 v8, v24

    move/from16 v9, v25

    move/from16 v10, v26

    invoke-direct/range {v0 .. v10}, Lokhttp3/Cookie;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    return-object v0
.end method

.method public static parse(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;
    .locals 2

    .line 218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p0, p1}, Lokhttp3/Cookie;->parse(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;

    move-result-object v0

    return-object v0
.end method

.method public static parseAll(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List<Lokhttp3/Cookie;>;"
        }
    .end annotation

    .line 432
    const-string v0, "Set-Cookie"

    invoke-virtual {p1, v0}, Lokhttp3/Headers;->values(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 433
    const/4 v2, 0x0

    .line 435
    const/4 v3, 0x0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_2

    .line 436
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lokhttp3/Cookie;->parse(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;

    move-result-object v5

    .line 437
    if-nez v5, :cond_0

    goto :goto_1

    .line 438
    :cond_0
    if-nez v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 439
    :cond_1
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 435
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 442
    :cond_2
    if-eqz v2, :cond_3

    .line 443
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    .line 444
    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method private static parseDomain(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 417
    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 420
    :cond_0
    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 423
    :cond_1
    invoke-static {p0}, Lokhttp3/internal/Util;->domainToAscii(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 424
    if-nez v1, :cond_2

    .line 425
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 427
    :cond_2
    return-object v1
.end method

.method private static parseExpires(Ljava/lang/String;II)J
    .locals 11

    .line 320
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lokhttp3/Cookie;->dateCharacterOffset(Ljava/lang/String;IIZ)I

    move-result p1

    .line 322
    const/4 v2, -0x1

    .line 323
    const/4 v3, -0x1

    .line 324
    const/4 v4, -0x1

    .line 325
    const/4 v5, -0x1

    .line 326
    const/4 v6, -0x1

    .line 327
    const/4 v7, -0x1

    .line 328
    sget-object v0, Lokhttp3/Cookie;->TIME_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    .line 330
    :goto_0
    if-ge p1, p2, :cond_4

    .line 331
    add-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    invoke-static {p0, v0, p2, v1}, Lokhttp3/Cookie;->dateCharacterOffset(Ljava/lang/String;IIZ)I

    move-result v9

    .line 332
    invoke-virtual {v8, p1, v9}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 334
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    sget-object v0, Lokhttp3/Cookie;->TIME_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 335
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 336
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 337
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    goto :goto_1

    .line 338
    :cond_0
    const/4 v0, -0x1

    if-ne v5, v0, :cond_1

    sget-object v0, Lokhttp3/Cookie;->DAY_OF_MONTH_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 339
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    goto :goto_1

    .line 340
    :cond_1
    const/4 v0, -0x1

    if-ne v6, v0, :cond_2

    sget-object v0, Lokhttp3/Cookie;->MONTH_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 341
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    .line 342
    sget-object v0, Lokhttp3/Cookie;->MONTH_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v6, v0, 0x4

    .line 343
    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    if-ne v7, v0, :cond_3

    sget-object v0, Lokhttp3/Cookie;->YEAR_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 344
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 347
    :cond_3
    :goto_1
    add-int/lit8 v0, v9, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, p2, v1}, Lokhttp3/Cookie;->dateCharacterOffset(Ljava/lang/String;IIZ)I

    move-result p1

    .line 348
    goto/16 :goto_0

    .line 351
    :cond_4
    const/16 v0, 0x46

    if-lt v7, v0, :cond_5

    const/16 v0, 0x63

    if-gt v7, v0, :cond_5

    add-int/lit16 v7, v7, 0x76c

    .line 352
    :cond_5
    if-ltz v7, :cond_6

    const/16 v0, 0x45

    if-gt v7, v0, :cond_6

    add-int/lit16 v7, v7, 0x7d0

    .line 356
    :cond_6
    const/16 v0, 0x641

    if-ge v7, v0, :cond_7

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 357
    :cond_7
    const/4 v0, -0x1

    if-ne v6, v0, :cond_8

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 358
    :cond_8
    const/4 v0, 0x1

    if-lt v5, v0, :cond_9

    const/16 v0, 0x1f

    if-le v5, v0, :cond_a

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 359
    :cond_a
    if-ltz v2, :cond_b

    const/16 v0, 0x17

    if-le v2, v0, :cond_c

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 360
    :cond_c
    if-ltz v3, :cond_d

    const/16 v0, 0x3b

    if-le v3, v0, :cond_e

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 361
    :cond_e
    if-ltz v4, :cond_f

    const/16 v0, 0x3b

    if-le v4, v0, :cond_10

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 363
    :cond_10
    new-instance v9, Ljava/util/GregorianCalendar;

    sget-object v0, Lokhttp3/internal/Util;->UTC:Ljava/util/TimeZone;

    invoke-direct {v9, v0}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 364
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->setLenient(Z)V

    .line 365
    const/4 v0, 0x1

    invoke-virtual {v9, v0, v7}, Ljava/util/Calendar;->set(II)V

    .line 366
    add-int/lit8 v0, v6, -0x1

    const/4 v1, 0x2

    invoke-virtual {v9, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 367
    const/4 v0, 0x5

    invoke-virtual {v9, v0, v5}, Ljava/util/Calendar;->set(II)V

    .line 368
    const/16 v0, 0xb

    invoke-virtual {v9, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 369
    const/16 v0, 0xc

    invoke-virtual {v9, v0, v3}, Ljava/util/Calendar;->set(II)V

    .line 370
    const/16 v0, 0xd

    invoke-virtual {v9, v0, v4}, Ljava/util/Calendar;->set(II)V

    .line 371
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 372
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private static parseMaxAge(Ljava/lang/String;)J
    .locals 4

    .line 401
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 402
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gtz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_0
    move-wide v0, v2

    :goto_0
    return-wide v0

    .line 403
    :catch_0
    move-exception v2

    .line 405
    const-string v0, "-?\\d+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 406
    const-string v0, "-"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_1

    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    :goto_1
    return-wide v0

    .line 408
    :cond_2
    throw v2
.end method

.method private static pathMatch(Lokhttp3/HttpUrl;Ljava/lang/String;)Z
    .locals 3

    .line 199
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object v2

    .line 201
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    const/4 v0, 0x1

    return v0

    .line 205
    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 206
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 207
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    return v0

    .line 210
    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public domain()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 564
    instance-of v0, p1, Lokhttp3/Cookie;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 565
    :cond_0
    move-object v4, p1

    check-cast v4, Lokhttp3/Cookie;

    .line 566
    iget-object v0, v4, Lokhttp3/Cookie;->name:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/Cookie;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v4, Lokhttp3/Cookie;->value:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/Cookie;->value:Ljava/lang/String;

    .line 567
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v4, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    .line 568
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v4, Lokhttp3/Cookie;->path:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/Cookie;->path:Ljava/lang/String;

    .line 569
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, v4, Lokhttp3/Cookie;->expiresAt:J

    iget-wide v2, p0, Lokhttp3/Cookie;->expiresAt:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-boolean v0, v4, Lokhttp3/Cookie;->secure:Z

    iget-boolean v1, p0, Lokhttp3/Cookie;->secure:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, v4, Lokhttp3/Cookie;->httpOnly:Z

    iget-boolean v1, p0, Lokhttp3/Cookie;->httpOnly:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, v4, Lokhttp3/Cookie;->persistent:Z

    iget-boolean v1, p0, Lokhttp3/Cookie;->persistent:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, v4, Lokhttp3/Cookie;->hostOnly:Z

    iget-boolean v1, p0, Lokhttp3/Cookie;->hostOnly:Z

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public expiresAt()J
    .locals 2

    .line 118
    iget-wide v0, p0, Lokhttp3/Cookie;->expiresAt:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 7

    .line 578
    const/16 v6, 0x11

    .line 579
    iget-object v0, p0, Lokhttp3/Cookie;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v6, v0, 0x20f

    .line 580
    mul-int/lit8 v0, v6, 0x1f

    iget-object v1, p0, Lokhttp3/Cookie;->value:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v6, v0, v1

    .line 581
    mul-int/lit8 v0, v6, 0x1f

    iget-object v1, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v6, v0, v1

    .line 582
    mul-int/lit8 v0, v6, 0x1f

    iget-object v1, p0, Lokhttp3/Cookie;->path:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v6, v0, v1

    .line 583
    mul-int/lit8 v0, v6, 0x1f

    iget-wide v1, p0, Lokhttp3/Cookie;->expiresAt:J

    iget-wide v3, p0, Lokhttp3/Cookie;->expiresAt:J

    const/16 v5, 0x20

    ushr-long/2addr v3, v5

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int v6, v0, v1

    .line 584
    mul-int/lit8 v0, v6, 0x1f

    iget-boolean v1, p0, Lokhttp3/Cookie;->secure:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    add-int v6, v0, v1

    .line 585
    mul-int/lit8 v0, v6, 0x1f

    iget-boolean v1, p0, Lokhttp3/Cookie;->httpOnly:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_1
    add-int v6, v0, v1

    .line 586
    mul-int/lit8 v0, v6, 0x1f

    iget-boolean v1, p0, Lokhttp3/Cookie;->persistent:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    :goto_2
    add-int v6, v0, v1

    .line 587
    mul-int/lit8 v0, v6, 0x1f

    iget-boolean v1, p0, Lokhttp3/Cookie;->hostOnly:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    const/4 v1, 0x1

    :goto_3
    add-int v6, v0, v1

    .line 588
    return v6
.end method

.method public hostOnly()Z
    .locals 1

    .line 132
    iget-boolean v0, p0, Lokhttp3/Cookie;->hostOnly:Z

    return v0
.end method

.method public httpOnly()Z
    .locals 1

    .line 157
    iget-boolean v0, p0, Lokhttp3/Cookie;->httpOnly:Z

    return v0
.end method

.method public matches(Lokhttp3/HttpUrl;)Z
    .locals 3

    .line 170
    iget-boolean v0, p0, Lokhttp3/Cookie;->hostOnly:Z

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    .line 172
    invoke-static {p1, v0}, Lokhttp3/Cookie;->domainMatch(Lokhttp3/HttpUrl;Ljava/lang/String;)Z

    move-result v2

    .line 173
    :goto_0
    if-nez v2, :cond_1

    const/4 v0, 0x0

    return v0

    .line 175
    :cond_1
    iget-object v0, p0, Lokhttp3/Cookie;->path:Ljava/lang/String;

    invoke-static {p1, v0}, Lokhttp3/Cookie;->pathMatch(Lokhttp3/HttpUrl;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    .line 177
    :cond_2
    iget-boolean v0, p0, Lokhttp3/Cookie;->secure:Z

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->isHttps()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    return v0

    .line 179
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lokhttp3/Cookie;->name:Ljava/lang/String;

    return-object v0
.end method

.method public path()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lokhttp3/Cookie;->path:Ljava/lang/String;

    return-object v0
.end method

.method public persistent()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lokhttp3/Cookie;->persistent:Z

    return v0
.end method

.method public secure()Z
    .locals 1

    .line 162
    iget-boolean v0, p0, Lokhttp3/Cookie;->secure:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 533
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 534
    iget-object v0, p0, Lokhttp3/Cookie;->name:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    const/16 v0, 0x3d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 536
    iget-object v0, p0, Lokhttp3/Cookie;->value:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    iget-boolean v0, p0, Lokhttp3/Cookie;->persistent:Z

    if-eqz v0, :cond_1

    .line 539
    iget-wide v0, p0, Lokhttp3/Cookie;->expiresAt:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 540
    const-string v0, "; max-age=0"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 542
    :cond_0
    const-string v0, "; expires="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    iget-wide v2, p0, Lokhttp3/Cookie;->expiresAt:J

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v1}, Lokhttp3/internal/http/HttpDate;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lokhttp3/Cookie;->hostOnly:Z

    if-nez v0, :cond_2

    .line 547
    const-string v0, "; domain="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cookie;->domain:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    :cond_2
    const-string v0, "; path="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cookie;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    iget-boolean v0, p0, Lokhttp3/Cookie;->secure:Z

    if-eqz v0, :cond_3

    .line 553
    const-string v0, "; secure"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    :cond_3
    iget-boolean v0, p0, Lokhttp3/Cookie;->httpOnly:Z

    if-eqz v0, :cond_4

    .line 557
    const-string v0, "; httponly"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public value()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lokhttp3/Cookie;->value:Ljava/lang/String;

    return-object v0
.end method
