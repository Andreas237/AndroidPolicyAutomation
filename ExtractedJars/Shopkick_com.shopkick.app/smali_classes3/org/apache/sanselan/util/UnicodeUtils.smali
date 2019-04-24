.class public abstract Lorg/apache/sanselan/util/UnicodeUtils;
.super Ljava/lang/Object;
.source "UnicodeUtils.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16WithBOM;,
        Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16NoBOM;,
        Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;,
        Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF8;,
        Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsASCII;,
        Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
    }
.end annotation


# static fields
.field public static final CHAR_ENCODING_CODE_AMBIGUOUS:I = -0x1

.field public static final CHAR_ENCODING_CODE_ISO_8859_1:I = 0x0

.field public static final CHAR_ENCODING_CODE_UTF_16_BIG_ENDIAN_NO_BOM:I = 0x3

.field public static final CHAR_ENCODING_CODE_UTF_16_BIG_ENDIAN_WITH_BOM:I = 0x1

.field public static final CHAR_ENCODING_CODE_UTF_16_LITTLE_ENDIAN_NO_BOM:I = 0x4

.field public static final CHAR_ENCODING_CODE_UTF_16_LITTLE_ENDIAN_WITH_BOM:I = 0x2

.field public static final CHAR_ENCODING_CODE_UTF_8:I = 0x5


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lorg/apache/sanselan/util/UnicodeUtils;-><init>()V

    return-void
.end method

.method private static findFirstDoubleByteTerminator([BI)I
    .locals 3

    move v0, p1

    .line 182
    :goto_0
    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    .line 184
    aget-byte v1, p0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, p1, 0x1

    .line 185
    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    if-nez v1, :cond_0

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static getInstance(I)Lorg/apache/sanselan/util/UnicodeUtils;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    const/4 v0, 0x0

    packed-switch p0, :pswitch_data_0

    .line 226
    new-instance v0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown char encoding code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 216
    :pswitch_0
    new-instance p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF8;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF8;-><init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V

    return-object p0

    .line 224
    :pswitch_1
    new-instance p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16NoBOM;

    const/16 v0, 0x49

    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16NoBOM;-><init>(I)V

    return-object p0

    .line 222
    :pswitch_2
    new-instance p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16NoBOM;

    const/16 v0, 0x4d

    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16NoBOM;-><init>(I)V

    return-object p0

    .line 220
    :pswitch_3
    new-instance p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16WithBOM;

    invoke-direct {p0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16WithBOM;-><init>()V

    return-object p0

    .line 213
    :pswitch_4
    new-instance p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsASCII;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsASCII;-><init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final isValidISO_8859_1(Ljava/lang/String;)Z
    .locals 3

    .line 166
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "ISO-8859-1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    const-string v2, "ISO-8859-1"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 168
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 172
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error parsing string."

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method protected abstract findEnd([BIZ)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation
.end method

.method public final findEndWithTerminator([BI)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 195
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/util/UnicodeUtils;->findEnd([BIZ)I

    move-result p1

    return p1
.end method

.method public final findEndWithoutTerminator([BI)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 201
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/util/UnicodeUtils;->findEnd([BIZ)I

    move-result p1

    return p1
.end method
