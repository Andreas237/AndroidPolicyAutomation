.class Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF8;
.super Lorg/apache/sanselan/util/UnicodeUtils;
.source "UnicodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/util/UnicodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UnicodeMetricsUTF8"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 261
    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils;-><init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V
    .locals 0

    .line 261
    invoke-direct {p0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF8;-><init>()V

    return-void
.end method


# virtual methods
.method public findEnd([BIZ)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    .line 271
    :goto_0
    array-length v0, p1

    if-ne p2, v0, :cond_0

    .line 272
    array-length p1, p1

    return p1

    .line 273
    :cond_0
    array-length v0, p1

    if-gt p2, v0, :cond_10

    add-int/lit8 v0, p2, 0x1

    .line 276
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    if-nez p2, :cond_2

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    :goto_1
    return v0

    :cond_2
    const/16 v1, 0x7f

    if-gt p2, v1, :cond_3

    move p2, v0

    goto :goto_0

    :cond_3
    const/16 v1, 0xdf

    const/16 v2, 0xbf

    const/16 v3, 0x80

    if-gt p2, v1, :cond_6

    .line 283
    array-length p2, p1

    if-ge v0, p2, :cond_5

    add-int/lit8 p2, v0, 0x1

    .line 286
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    if-lt v0, v3, :cond_4

    if-gt v0, v2, :cond_4

    goto :goto_0

    .line 288
    :cond_4
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 284
    :cond_5
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid unicode."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/16 v1, 0xef

    if-gt p2, v1, :cond_a

    .line 291
    array-length p2, p1

    add-int/lit8 p2, p2, -0x1

    if-ge v0, p2, :cond_9

    add-int/lit8 p2, v0, 0x1

    .line 294
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    if-lt v0, v3, :cond_8

    if-gt v0, v2, :cond_8

    add-int/lit8 v0, p2, 0x1

    .line 297
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    if-lt p2, v3, :cond_7

    if-gt p2, v2, :cond_7

    move p2, v0

    goto :goto_0

    .line 299
    :cond_7
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 296
    :cond_8
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 292
    :cond_9
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid unicode."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    const/16 v1, 0xf4

    if-gt p2, v1, :cond_f

    .line 302
    array-length p2, p1

    add-int/lit8 p2, p2, -0x2

    if-ge v0, p2, :cond_e

    add-int/lit8 p2, v0, 0x1

    .line 305
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    if-lt v0, v3, :cond_d

    if-gt v0, v2, :cond_d

    add-int/lit8 v0, p2, 0x1

    .line 308
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    if-lt p2, v3, :cond_c

    if-gt p2, v2, :cond_c

    add-int/lit8 p2, v0, 0x1

    .line 311
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    if-lt v0, v3, :cond_b

    if-gt v0, v2, :cond_b

    goto/16 :goto_0

    .line 313
    :cond_b
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 310
    :cond_c
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 307
    :cond_d
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 303
    :cond_e
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid unicode."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 315
    :cond_f
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 274
    :cond_10
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Terminator not found."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
