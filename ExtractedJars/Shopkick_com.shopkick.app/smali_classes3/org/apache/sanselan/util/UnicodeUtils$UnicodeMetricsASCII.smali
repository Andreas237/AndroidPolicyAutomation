.class Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsASCII;
.super Lorg/apache/sanselan/util/UnicodeUtils;
.source "UnicodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/util/UnicodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UnicodeMetricsASCII"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 231
    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils;-><init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V
    .locals 0

    .line 231
    invoke-direct {p0}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsASCII;-><init>()V

    return-void
.end method


# virtual methods
.method public findEnd([BIZ)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    .line 236
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_2

    .line 238
    aget-byte v0, p1, p2

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    add-int/lit8 p2, p2, 0x1

    :cond_0
    return p2

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 241
    :cond_2
    array-length p1, p1

    return p1
.end method
