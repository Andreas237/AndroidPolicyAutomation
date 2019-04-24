.class public Lorg/apache/sanselan/common/RationalNumber;
.super Ljava/lang/Number;
.source "RationalNumber.java"


# static fields
.field private static final nf:Ljava/text/NumberFormat;

.field private static final serialVersionUID:J = -0x1L


# instance fields
.field public final divisor:I

.field public final numerator:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 107
    invoke-static {}, Ljava/text/DecimalFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/common/RationalNumber;->nf:Ljava/text/NumberFormat;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    .line 31
    iput p1, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    .line 32
    iput p2, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    return-void
.end method

.method public static final factoryMethod(JJ)Lorg/apache/sanselan/common/RationalNumber;
    .locals 9

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    const-wide/32 v3, -0x80000000

    if-gtz v2, :cond_0

    cmp-long v2, p0, v3

    if-ltz v2, :cond_0

    cmp-long v2, p2, v0

    if-gtz v2, :cond_0

    cmp-long v2, p2, v3

    if-gez v2, :cond_3

    :cond_0
    :goto_0
    cmp-long v2, p0, v0

    if-gtz v2, :cond_1

    cmp-long v2, p0, v3

    if-ltz v2, :cond_1

    cmp-long v2, p2, v0

    if-gtz v2, :cond_1

    cmp-long v2, p2, v3

    if-gez v2, :cond_2

    .line 45
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    const-wide/16 v7, 0x1

    cmp-long v2, v5, v7

    if-lez v2, :cond_2

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    cmp-long v2, v5, v7

    if-lez v2, :cond_2

    const/4 v2, 0x1

    shr-long/2addr p0, v2

    shr-long/2addr p2, v2

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_4

    .line 58
    :cond_3
    invoke-static {p0, p1, p2, p3}, Lorg/apache/sanselan/common/RationalNumber;->gcd(JJ)J

    move-result-wide v0

    .line 59
    div-long/2addr p2, v0

    .line 60
    div-long/2addr p0, v0

    .line 62
    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    long-to-int p0, p0

    long-to-int p1, p2

    invoke-direct {v0, p0, p1}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    return-object v0

    .line 54
    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid value, numerator: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, ", divisor: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static gcd(JJ)J
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-wide p0

    .line 74
    :cond_0
    rem-long/2addr p0, p2

    invoke-static {p2, p3, p0, p1}, Lorg/apache/sanselan/common/RationalNumber;->gcd(JJ)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public doubleValue()D
    .locals 4

    .line 84
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    int-to-double v0, v0

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public floatValue()F
    .locals 2

    .line 89
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    int-to-float v0, v0

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public intValue()I
    .locals 2

    .line 94
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    div-int/2addr v0, v1

    return v0
.end method

.method public isValid()Z
    .locals 1

    .line 104
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public longValue()J
    .locals 4

    .line 99
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    int-to-long v0, v0

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public negate()Lorg/apache/sanselan/common/RationalNumber;
    .locals 3

    .line 79
    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    neg-int v1, v1

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    return-object v0
.end method

.method public toDisplayString()Ljava/lang/String;
    .locals 5

    .line 121
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    rem-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    div-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 123
    :cond_0
    invoke-static {}, Ljava/text/DecimalFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    const/4 v1, 0x3

    .line 124
    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 125
    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    int-to-double v1, v1

    iget v3, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    int-to-double v3, v3

    div-double/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 111
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    if-nez v0, :cond_0

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid rational ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 113
    :cond_0
    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    rem-int v2, v1, v0

    if-nez v2, :cond_1

    .line 114
    sget-object v2, Lorg/apache/sanselan/common/RationalNumber;->nf:Ljava/text/NumberFormat;

    div-int/2addr v1, v0

    int-to-long v0, v1

    invoke-virtual {v2, v0, v1}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 115
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lorg/apache/sanselan/common/RationalNumber;->nf:Ljava/text/NumberFormat;

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    int-to-double v2, v2

    iget v4, p0, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    int-to-double v4, v4

    div-double/2addr v2, v4

    .line 116
    invoke-virtual {v1, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
