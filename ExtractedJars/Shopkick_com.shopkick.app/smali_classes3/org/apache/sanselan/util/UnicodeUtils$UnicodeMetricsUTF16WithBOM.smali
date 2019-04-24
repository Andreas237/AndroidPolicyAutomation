.class Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16WithBOM;
.super Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;
.source "UnicodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/util/UnicodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UnicodeMetricsUTF16WithBOM"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 440
    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;-><init>(I)V

    return-void
.end method


# virtual methods
.method public findEnd([BIZ)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    .line 448
    array-length v0, p1

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p2, v0, :cond_2

    add-int/lit8 v0, p2, 0x1

    .line 451
    aget-byte p2, p1, p2

    const/16 v2, 0xff

    and-int/2addr p2, v2

    add-int/lit8 v3, v0, 0x1

    .line 452
    aget-byte v0, p1, v0

    and-int/2addr v0, v2

    const/16 v4, 0xfe

    if-ne p2, v2, :cond_0

    if-ne v0, v4, :cond_0

    .line 454
    iput v1, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16WithBOM;->byteOrder:I

    goto :goto_0

    :cond_0
    if-ne p2, v4, :cond_1

    if-ne v0, v2, :cond_1

    const/4 p2, 0x0

    .line 456
    iput p2, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16WithBOM;->byteOrder:I

    .line 460
    :goto_0
    invoke-super {p0, p1, v3, p3}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;->findEnd([BIZ)I

    move-result p1

    return p1

    .line 458
    :cond_1
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid byte order mark."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 449
    :cond_2
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Missing BOM."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
