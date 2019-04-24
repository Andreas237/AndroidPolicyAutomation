.class Lorg/apache/sanselan/common/RationalNumberUtilities$Option;
.super Ljava/lang/Object;
.source "RationalNumberUtilities.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/common/RationalNumberUtilities;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Option"
.end annotation


# instance fields
.field public final error:D

.field public final rationalNumber:Lorg/apache/sanselan/common/RationalNumber;


# direct methods
.method private constructor <init>(Lorg/apache/sanselan/common/RationalNumber;D)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->rationalNumber:Lorg/apache/sanselan/common/RationalNumber;

    .line 30
    iput-wide p2, p0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->error:D

    return-void
.end method

.method public static final factory(Lorg/apache/sanselan/common/RationalNumber;D)Lorg/apache/sanselan/common/RationalNumberUtilities$Option;
    .locals 3

    .line 36
    new-instance v0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;

    .line 37
    invoke-virtual {p0}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v1

    sub-double/2addr v1, p1

    .line 36
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    invoke-direct {v0, p0, p1, p2}, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;-><init>(Lorg/apache/sanselan/common/RationalNumber;D)V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->rationalNumber:Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {v0}, Lorg/apache/sanselan/common/RationalNumber;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
