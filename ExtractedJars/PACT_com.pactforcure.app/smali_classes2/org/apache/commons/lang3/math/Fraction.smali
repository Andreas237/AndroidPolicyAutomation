.class public final Lorg/apache/commons/lang3/math/Fraction;
.super Ljava/lang/Number;
.source "Fraction.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Number;",
        "Ljava/lang/Comparable",
        "<",
        "Lorg/apache/commons/lang3/math/Fraction;",
        ">;"
    }
.end annotation


# static fields
.field public static final FOUR_FIFTHS:Lorg/apache/commons/lang3/math/Fraction;

.field public static final ONE:Lorg/apache/commons/lang3/math/Fraction;

.field public static final ONE_FIFTH:Lorg/apache/commons/lang3/math/Fraction;

.field public static final ONE_HALF:Lorg/apache/commons/lang3/math/Fraction;

.field public static final ONE_QUARTER:Lorg/apache/commons/lang3/math/Fraction;

.field public static final ONE_THIRD:Lorg/apache/commons/lang3/math/Fraction;

.field public static final THREE_FIFTHS:Lorg/apache/commons/lang3/math/Fraction;

.field public static final THREE_QUARTERS:Lorg/apache/commons/lang3/math/Fraction;

.field public static final TWO_FIFTHS:Lorg/apache/commons/lang3/math/Fraction;

.field public static final TWO_QUARTERS:Lorg/apache/commons/lang3/math/Fraction;

.field public static final TWO_THIRDS:Lorg/apache/commons/lang3/math/Fraction;

.field public static final ZERO:Lorg/apache/commons/lang3/math/Fraction;

.field private static final serialVersionUID:J = 0x3b76f0847842L


# instance fields
.field private final denominator:I

.field private transient hashCode:I

.field private final numerator:I

.field private transient toProperString:Ljava/lang/String;

.field private transient toString:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x5

    const/4 v5, 0x4

    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 47
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->ZERO:Lorg/apache/commons/lang3/math/Fraction;

    .line 51
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v2, v2}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->ONE:Lorg/apache/commons/lang3/math/Fraction;

    .line 55
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v2, v3}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->ONE_HALF:Lorg/apache/commons/lang3/math/Fraction;

    .line 59
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v2, v4}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->ONE_THIRD:Lorg/apache/commons/lang3/math/Fraction;

    .line 63
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v3, v4}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->TWO_THIRDS:Lorg/apache/commons/lang3/math/Fraction;

    .line 67
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v2, v5}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->ONE_QUARTER:Lorg/apache/commons/lang3/math/Fraction;

    .line 71
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v3, v5}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->TWO_QUARTERS:Lorg/apache/commons/lang3/math/Fraction;

    .line 75
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v4, v5}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->THREE_QUARTERS:Lorg/apache/commons/lang3/math/Fraction;

    .line 79
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v2, v6}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->ONE_FIFTH:Lorg/apache/commons/lang3/math/Fraction;

    .line 83
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v3, v6}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->TWO_FIFTHS:Lorg/apache/commons/lang3/math/Fraction;

    .line 87
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v4, v6}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->THREE_FIFTHS:Lorg/apache/commons/lang3/math/Fraction;

    .line 91
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, v5, v6}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    sput-object v0, Lorg/apache/commons/lang3/math/Fraction;->FOUR_FIFTHS:Lorg/apache/commons/lang3/math/Fraction;

    return-void
.end method

.method private constructor <init>(II)V
    .locals 2
    .param p1, "numerator"    # I
    .param p2, "denominator"    # I

    .prologue
    const/4 v1, 0x0

    .line 124
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/commons/lang3/math/Fraction;->hashCode:I

    .line 110
    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toString:Ljava/lang/String;

    .line 114
    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    .line 125
    iput p1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    .line 126
    iput p2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    .line 127
    return-void
.end method

.method private static addAndCheck(II)I
    .locals 6
    .param p0, "x"    # I
    .param p1, "y"    # I

    .prologue
    .line 676
    int-to-long v2, p0

    int-to-long v4, p1

    add-long v0, v2, v4

    .line 677
    .local v0, "s":J
    const-wide/32 v2, -0x80000000

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    .line 679
    :cond_0
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "overflow: add"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 681
    :cond_1
    long-to-int v2, v0

    return v2
.end method

.method private addSub(Lorg/apache/commons/lang3/math/Fraction;Z)Lorg/apache/commons/lang3/math/Fraction;
    .locals 11
    .param p1, "fraction"    # Lorg/apache/commons/lang3/math/Fraction;
    .param p2, "isAdd"    # Z

    .prologue
    .line 741
    if-nez p1, :cond_0

    .line 742
    new-instance v7, Ljava/lang/IllegalArgumentException;

    const-string v8, "The fraction must not be null"

    invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 745
    :cond_0
    iget v7, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-nez v7, :cond_2

    .line 746
    if-eqz p2, :cond_1

    .line 781
    .end local p1    # "fraction":Lorg/apache/commons/lang3/math/Fraction;
    :goto_0
    return-object p1

    .line 746
    .restart local p1    # "fraction":Lorg/apache/commons/lang3/math/Fraction;
    :cond_1
    invoke-virtual {p1}, Lorg/apache/commons/lang3/math/Fraction;->negate()Lorg/apache/commons/lang3/math/Fraction;

    move-result-object p1

    goto :goto_0

    .line 748
    :cond_2
    iget v7, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-nez v7, :cond_3

    move-object p1, p0

    .line 749
    goto :goto_0

    .line 753
    :cond_3
    iget v7, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    iget v8, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-static {v7, v8}, Lorg/apache/commons/lang3/math/Fraction;->greatestCommonDivisor(II)I

    move-result v0

    .line 754
    .local v0, "d1":I
    const/4 v7, 0x1

    if-ne v0, v7, :cond_5

    .line 756
    iget v7, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v8, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-static {v7, v8}, Lorg/apache/commons/lang3/math/Fraction;->mulAndCheck(II)I

    move-result v5

    .line 757
    .local v5, "uvp":I
    iget v7, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v8, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-static {v7, v8}, Lorg/apache/commons/lang3/math/Fraction;->mulAndCheck(II)I

    move-result v4

    .line 758
    .local v4, "upv":I
    new-instance v8, Lorg/apache/commons/lang3/math/Fraction;

    if-eqz p2, :cond_4

    invoke-static {v5, v4}, Lorg/apache/commons/lang3/math/Fraction;->addAndCheck(II)I

    move-result v7

    :goto_1
    iget v9, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    iget v10, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-static {v9, v10}, Lorg/apache/commons/lang3/math/Fraction;->mulPosAndCheck(II)I

    move-result v9

    invoke-direct {v8, v7, v9}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    move-object p1, v8

    goto :goto_0

    :cond_4
    invoke-static {v5, v4}, Lorg/apache/commons/lang3/math/Fraction;->subAndCheck(II)I

    move-result v7

    goto :goto_1

    .line 765
    .end local v4    # "upv":I
    .end local v5    # "uvp":I
    :cond_5
    iget v7, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    int-to-long v8, v7

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    iget v8, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v8, v0

    int-to-long v8, v8

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    .line 767
    .local v5, "uvp":Ljava/math/BigInteger;
    iget v7, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    int-to-long v8, v7

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    iget v8, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v8, v0

    int-to-long v8, v8

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 769
    .local v4, "upv":Ljava/math/BigInteger;
    if-eqz p2, :cond_6

    invoke-virtual {v5, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 772
    .local v2, "t":Ljava/math/BigInteger;
    :goto_2
    int-to-long v8, v0

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v7}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    .line 773
    .local v3, "tmodd1":I
    if-nez v3, :cond_7

    move v1, v0

    .line 776
    .local v1, "d2":I
    :goto_3
    int-to-long v8, v1

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v6

    .line 777
    .local v6, "w":Ljava/math/BigInteger;
    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    move-result v7

    const/16 v8, 0x1f

    if-le v7, v8, :cond_8

    .line 778
    new-instance v7, Ljava/lang/ArithmeticException;

    const-string v8, "overflow: numerator too large after multiply"

    invoke-direct {v7, v8}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 769
    .end local v1    # "d2":I
    .end local v2    # "t":Ljava/math/BigInteger;
    .end local v3    # "tmodd1":I
    .end local v6    # "w":Ljava/math/BigInteger;
    :cond_6
    invoke-virtual {v5, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    goto :goto_2

    .line 773
    .restart local v2    # "t":Ljava/math/BigInteger;
    .restart local v3    # "tmodd1":I
    :cond_7
    invoke-static {v3, v0}, Lorg/apache/commons/lang3/math/Fraction;->greatestCommonDivisor(II)I

    move-result v1

    goto :goto_3

    .line 781
    .restart local v1    # "d2":I
    .restart local v6    # "w":Ljava/math/BigInteger;
    :cond_8
    new-instance v7, Lorg/apache/commons/lang3/math/Fraction;

    invoke-virtual {v6}, Ljava/math/BigInteger;->intValue()I

    move-result v8

    iget v9, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v9, v0

    iget v10, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v10, v1

    invoke-static {v9, v10}, Lorg/apache/commons/lang3/math/Fraction;->mulPosAndCheck(II)I

    move-result v9

    invoke-direct {v7, v8, v9}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    move-object p1, v7

    goto/16 :goto_0
.end method

.method public static getFraction(D)Lorg/apache/commons/lang3/math/Fraction;
    .locals 32
    .param p0, "value"    # D

    .prologue
    .line 250
    const-wide/16 v28, 0x0

    cmpg-double v19, p0, v28

    if-gez v19, :cond_1

    const/16 v17, -0x1

    .line 251
    .local v17, "sign":I
    :goto_0
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    .line 252
    const-wide v28, 0x41dfffffffc00000L    # 2.147483647E9

    cmpl-double v19, p0, v28

    if-gtz v19, :cond_0

    invoke-static/range {p0 .. p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v19

    if-eqz v19, :cond_2

    .line 253
    :cond_0
    new-instance v19, Ljava/lang/ArithmeticException;

    const-string v28, "The value must not be greater than Integer.MAX_VALUE or NaN"

    move-object/from16 v0, v19

    move-object/from16 v1, v28

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 250
    .end local v17    # "sign":I
    :cond_1
    const/16 v17, 0x1

    goto :goto_0

    .line 256
    .restart local v17    # "sign":I
    :cond_2
    move-wide/from16 v0, p0

    double-to-int v0, v0

    move/from16 v18, v0

    .line 257
    .local v18, "wholeNumber":I
    move/from16 v0, v18

    int-to-double v0, v0

    move-wide/from16 v28, v0

    sub-double p0, p0, v28

    .line 259
    const/4 v14, 0x0

    .line 260
    .local v14, "numer0":I
    const/4 v8, 0x1

    .line 261
    .local v8, "denom0":I
    const/4 v15, 0x1

    .line 262
    .local v15, "numer1":I
    const/4 v9, 0x0

    .line 263
    .local v9, "denom1":I
    const/16 v16, 0x0

    .line 264
    .local v16, "numer2":I
    const/4 v10, 0x0

    .line 265
    .local v10, "denom2":I
    move-wide/from16 v0, p0

    double-to-int v2, v0

    .line 266
    .local v2, "a1":I
    const/4 v3, 0x0

    .line 267
    .local v3, "a2":I
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 268
    .local v20, "x1":D
    const-wide/16 v22, 0x0

    .line 269
    .local v22, "x2":D
    int-to-double v0, v2

    move-wide/from16 v28, v0

    sub-double v24, p0, v28

    .line 270
    .local v24, "y1":D
    const-wide/16 v26, 0x0

    .line 271
    .local v26, "y2":D
    const-wide v6, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 273
    .local v6, "delta2":D
    const/4 v11, 0x1

    .line 276
    .local v11, "i":I
    :cond_3
    move-wide v4, v6

    .line 277
    .local v4, "delta1":D
    div-double v28, v20, v24

    move-wide/from16 v0, v28

    double-to-int v3, v0

    .line 278
    move-wide/from16 v22, v24

    .line 279
    int-to-double v0, v3

    move-wide/from16 v28, v0

    mul-double v28, v28, v24

    sub-double v26, v20, v28

    .line 280
    mul-int v19, v2, v15

    add-int v16, v19, v14

    .line 281
    mul-int v19, v2, v9

    add-int v10, v19, v8

    .line 282
    move/from16 v0, v16

    int-to-double v0, v0

    move-wide/from16 v28, v0

    int-to-double v0, v10

    move-wide/from16 v30, v0

    div-double v12, v28, v30

    .line 283
    .local v12, "fraction":D
    sub-double v28, p0, v12

    invoke-static/range {v28 .. v29}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    .line 285
    move v2, v3

    .line 286
    move-wide/from16 v20, v22

    .line 287
    move-wide/from16 v24, v26

    .line 288
    move v14, v15

    .line 289
    move v8, v9

    .line 290
    move/from16 v15, v16

    .line 291
    move v9, v10

    .line 292
    add-int/lit8 v11, v11, 0x1

    .line 294
    cmpl-double v19, v4, v6

    if-lez v19, :cond_4

    const/16 v19, 0x2710

    move/from16 v0, v19

    if-gt v10, v0, :cond_4

    if-lez v10, :cond_4

    const/16 v19, 0x19

    move/from16 v0, v19

    if-lt v11, v0, :cond_3

    .line 295
    :cond_4
    const/16 v19, 0x19

    move/from16 v0, v19

    if-ne v11, v0, :cond_5

    .line 296
    new-instance v19, Ljava/lang/ArithmeticException;

    const-string v28, "Unable to convert double to fraction"

    move-object/from16 v0, v19

    move-object/from16 v1, v28

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 298
    :cond_5
    mul-int v19, v18, v8

    add-int v19, v19, v14

    mul-int v19, v19, v17

    move/from16 v0, v19

    invoke-static {v0, v8}, Lorg/apache/commons/lang3/math/Fraction;->getReducedFraction(II)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v19

    return-object v19
.end method

.method public static getFraction(II)Lorg/apache/commons/lang3/math/Fraction;
    .locals 2
    .param p0, "numerator"    # I
    .param p1, "denominator"    # I

    .prologue
    const/high16 v0, -0x80000000

    .line 142
    if-nez p1, :cond_0

    .line 143
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "The denominator must not be zero"

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_0
    if-gez p1, :cond_3

    .line 146
    if-eq p0, v0, :cond_1

    if-ne p1, v0, :cond_2

    .line 148
    :cond_1
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "overflow: can\'t negate"

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :cond_2
    neg-int p0, p0

    .line 151
    neg-int p1, p1

    .line 153
    :cond_3
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v0, p0, p1}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    return-object v0
.end method

.method public static getFraction(III)Lorg/apache/commons/lang3/math/Fraction;
    .locals 6
    .param p0, "whole"    # I
    .param p1, "numerator"    # I
    .param p2, "denominator"    # I

    .prologue
    .line 173
    if-nez p2, :cond_0

    .line 174
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "The denominator must not be zero"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 176
    :cond_0
    if-gez p2, :cond_1

    .line 177
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "The denominator must not be negative"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 179
    :cond_1
    if-gez p1, :cond_2

    .line 180
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "The numerator must not be negative"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 183
    :cond_2
    if-gez p0, :cond_4

    .line 184
    int-to-long v2, p0

    int-to-long v4, p2

    mul-long/2addr v2, v4

    int-to-long v4, p1

    sub-long v0, v2, v4

    .line 188
    .local v0, "numeratorValue":J
    :goto_0
    const-wide/32 v2, -0x80000000

    cmp-long v2, v0, v2

    if-ltz v2, :cond_3

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_5

    .line 190
    :cond_3
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "Numerator too large to represent as an Integer."

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 186
    .end local v0    # "numeratorValue":J
    :cond_4
    int-to-long v2, p0

    int-to-long v4, p2

    mul-long/2addr v2, v4

    int-to-long v4, p1

    add-long v0, v2, v4

    .restart local v0    # "numeratorValue":J
    goto :goto_0

    .line 192
    :cond_5
    new-instance v2, Lorg/apache/commons/lang3/math/Fraction;

    long-to-int v3, v0

    invoke-direct {v2, v3, p2}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    return-object v2
.end method

.method public static getFraction(Ljava/lang/String;)Lorg/apache/commons/lang3/math/Fraction;
    .locals 7
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    const/16 v6, 0x2f

    const/4 v5, 0x0

    .line 320
    if-nez p0, :cond_0

    .line 321
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "The string must not be null"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 324
    :cond_0
    const/16 v4, 0x2e

    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 325
    .local v2, "pos":I
    if-ltz v2, :cond_1

    .line 326
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {v4, v5}, Lorg/apache/commons/lang3/math/Fraction;->getFraction(D)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v4

    .line 352
    :goto_0
    return-object v4

    .line 330
    :cond_1
    const/16 v4, 0x20

    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 331
    if-lez v2, :cond_3

    .line 332
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 333
    .local v3, "whole":I
    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 334
    invoke-virtual {p0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 335
    if-gez v2, :cond_2

    .line 336
    new-instance v4, Ljava/lang/NumberFormatException;

    const-string v5, "The fraction could not be parsed as the format X Y/Z"

    invoke-direct {v4, v5}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 338
    :cond_2
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 339
    .local v1, "numer":I
    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 340
    .local v0, "denom":I
    invoke-static {v3, v1, v0}, Lorg/apache/commons/lang3/math/Fraction;->getFraction(III)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v4

    goto :goto_0

    .line 345
    .end local v0    # "denom":I
    .end local v1    # "numer":I
    .end local v3    # "whole":I
    :cond_3
    invoke-virtual {p0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 346
    if-gez v2, :cond_4

    .line 348
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lorg/apache/commons/lang3/math/Fraction;->getFraction(II)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v4

    goto :goto_0

    .line 350
    :cond_4
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 351
    .restart local v1    # "numer":I
    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 352
    .restart local v0    # "denom":I
    invoke-static {v1, v0}, Lorg/apache/commons/lang3/math/Fraction;->getFraction(II)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v4

    goto :goto_0
.end method

.method public static getReducedFraction(II)Lorg/apache/commons/lang3/math/Fraction;
    .locals 3
    .param p0, "numerator"    # I
    .param p1, "denominator"    # I

    .prologue
    const/high16 v2, -0x80000000

    .line 210
    if-nez p1, :cond_0

    .line 211
    new-instance v1, Ljava/lang/ArithmeticException;

    const-string v2, "The denominator must not be zero"

    invoke-direct {v1, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 213
    :cond_0
    if-nez p0, :cond_1

    .line 214
    sget-object v1, Lorg/apache/commons/lang3/math/Fraction;->ZERO:Lorg/apache/commons/lang3/math/Fraction;

    .line 232
    :goto_0
    return-object v1

    .line 217
    :cond_1
    if-ne p1, v2, :cond_2

    and-int/lit8 v1, p0, 0x1

    if-nez v1, :cond_2

    .line 218
    div-int/lit8 p0, p0, 0x2

    div-int/lit8 p1, p1, 0x2

    .line 220
    :cond_2
    if-gez p1, :cond_5

    .line 221
    if-eq p0, v2, :cond_3

    if-ne p1, v2, :cond_4

    .line 223
    :cond_3
    new-instance v1, Ljava/lang/ArithmeticException;

    const-string v2, "overflow: can\'t negate"

    invoke-direct {v1, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 225
    :cond_4
    neg-int p0, p0

    .line 226
    neg-int p1, p1

    .line 229
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/math/Fraction;->greatestCommonDivisor(II)I

    move-result v0

    .line 230
    .local v0, "gcd":I
    div-int/2addr p0, v0

    .line 231
    div-int/2addr p1, v0

    .line 232
    new-instance v1, Lorg/apache/commons/lang3/math/Fraction;

    invoke-direct {v1, p0, p1}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    goto :goto_0
.end method

.method private static greatestCommonDivisor(II)I
    .locals 5
    .param p0, "u"    # I
    .param p1, "v"    # I

    .prologue
    const/16 v4, 0x1f

    const/high16 v3, -0x80000000

    const/4 v2, 0x1

    .line 578
    if-eqz p0, :cond_0

    if-nez p1, :cond_4

    .line 579
    :cond_0
    if-eq p0, v3, :cond_1

    if-ne p1, v3, :cond_2

    .line 580
    :cond_1
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "overflow: gcd is 2^31"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 582
    :cond_2
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    add-int/2addr v2, v3

    .line 624
    :cond_3
    :goto_0
    return v2

    .line 585
    :cond_4
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-eq v3, v2, :cond_3

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-eq v3, v2, :cond_3

    .line 592
    if-lez p0, :cond_5

    neg-int p0, p0

    .line 593
    :cond_5
    if-lez p1, :cond_6

    neg-int p1, p1

    .line 595
    :cond_6
    const/4 v0, 0x0

    .line 596
    .local v0, "k":I
    :goto_1
    and-int/lit8 v3, p0, 0x1

    if-nez v3, :cond_7

    and-int/lit8 v3, p1, 0x1

    if-nez v3, :cond_7

    if-ge v0, v4, :cond_7

    .line 597
    div-int/lit8 p0, p0, 0x2

    div-int/lit8 p1, p1, 0x2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 599
    :cond_7
    if-ne v0, v4, :cond_8

    .line 600
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "overflow: gcd is 2^31"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 604
    :cond_8
    and-int/lit8 v3, p0, 0x1

    if-ne v3, v2, :cond_a

    move v1, p1

    .line 610
    .local v1, "t":I
    :cond_9
    :goto_2
    and-int/lit8 v3, v1, 0x1

    if-nez v3, :cond_b

    .line 611
    div-int/lit8 v1, v1, 0x2

    goto :goto_2

    .line 604
    .end local v1    # "t":I
    :cond_a
    div-int/lit8 v3, p0, 0x2

    neg-int v1, v3

    goto :goto_2

    .line 614
    .restart local v1    # "t":I
    :cond_b
    if-lez v1, :cond_c

    .line 615
    neg-int p0, v1

    .line 620
    :goto_3
    sub-int v3, p1, p0

    div-int/lit8 v1, v3, 0x2

    .line 623
    if-nez v1, :cond_9

    .line 624
    neg-int v3, p0

    shl-int/2addr v2, v0

    mul-int/2addr v2, v3

    goto :goto_0

    .line 617
    :cond_c
    move p1, v1

    goto :goto_3
.end method

.method private static mulAndCheck(II)I
    .locals 6
    .param p0, "x"    # I
    .param p1, "y"    # I

    .prologue
    .line 640
    int-to-long v2, p0

    int-to-long v4, p1

    mul-long v0, v2, v4

    .line 641
    .local v0, "m":J
    const-wide/32 v2, -0x80000000

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    .line 643
    :cond_0
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "overflow: mul"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 645
    :cond_1
    long-to-int v2, v0

    return v2
.end method

.method private static mulPosAndCheck(II)I
    .locals 6
    .param p0, "x"    # I
    .param p1, "y"    # I

    .prologue
    .line 659
    int-to-long v2, p0

    int-to-long v4, p1

    mul-long v0, v2, v4

    .line 660
    .local v0, "m":J
    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 661
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "overflow: mulPos"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 663
    :cond_0
    long-to-int v2, v0

    return v2
.end method

.method private static subAndCheck(II)I
    .locals 6
    .param p0, "x"    # I
    .param p1, "y"    # I

    .prologue
    .line 694
    int-to-long v2, p0

    int-to-long v4, p1

    sub-long v0, v2, v4

    .line 695
    .local v0, "s":J
    const-wide/32 v2, -0x80000000

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    .line 697
    :cond_0
    new-instance v2, Ljava/lang/ArithmeticException;

    const-string v3, "overflow: add"

    invoke-direct {v2, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 699
    :cond_1
    long-to-int v2, v0

    return v2
.end method


# virtual methods
.method public abs()Lorg/apache/commons/lang3/math/Fraction;
    .locals 1

    .prologue
    .line 528
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-ltz v0, :cond_0

    .line 531
    .end local p0    # "this":Lorg/apache/commons/lang3/math/Fraction;
    :goto_0
    return-object p0

    .restart local p0    # "this":Lorg/apache/commons/lang3/math/Fraction;
    :cond_0
    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->negate()Lorg/apache/commons/lang3/math/Fraction;

    move-result-object p0

    goto :goto_0
.end method

.method public add(Lorg/apache/commons/lang3/math/Fraction;)Lorg/apache/commons/lang3/math/Fraction;
    .locals 1
    .param p1, "fraction"    # Lorg/apache/commons/lang3/math/Fraction;

    .prologue
    .line 713
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/lang3/math/Fraction;->addSub(Lorg/apache/commons/lang3/math/Fraction;Z)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 35
    check-cast p1, Lorg/apache/commons/lang3/math/Fraction;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/math/Fraction;->compareTo(Lorg/apache/commons/lang3/math/Fraction;)I

    move-result v0

    return v0
.end method

.method public compareTo(Lorg/apache/commons/lang3/math/Fraction;)I
    .locals 10
    .param p1, "other"    # Lorg/apache/commons/lang3/math/Fraction;

    .prologue
    const/4 v4, 0x0

    .line 883
    if-ne p0, p1, :cond_1

    .line 898
    :cond_0
    :goto_0
    return v4

    .line 886
    :cond_1
    iget v5, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v6, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-ne v5, v6, :cond_2

    iget v5, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    iget v6, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    if-eq v5, v6, :cond_0

    .line 891
    :cond_2
    iget v5, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    int-to-long v6, v5

    iget v5, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    int-to-long v8, v5

    mul-long v0, v6, v8

    .line 892
    .local v0, "first":J
    iget v5, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    int-to-long v6, v5

    iget v5, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    int-to-long v8, v5

    mul-long v2, v6, v8

    .line 893
    .local v2, "second":J
    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    .line 895
    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    .line 896
    const/4 v4, -0x1

    goto :goto_0

    .line 898
    :cond_3
    const/4 v4, 0x1

    goto :goto_0
.end method

.method public divideBy(Lorg/apache/commons/lang3/math/Fraction;)Lorg/apache/commons/lang3/math/Fraction;
    .locals 2
    .param p1, "fraction"    # Lorg/apache/commons/lang3/math/Fraction;

    .prologue
    .line 823
    if-nez p1, :cond_0

    .line 824
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The fraction must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 826
    :cond_0
    iget v0, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-nez v0, :cond_1

    .line 827
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "The fraction to divide by must not be zero"

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 829
    :cond_1
    invoke-virtual {p1}, Lorg/apache/commons/lang3/math/Fraction;->invert()Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/math/Fraction;->multiplyBy(Lorg/apache/commons/lang3/math/Fraction;)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v0

    return-object v0
.end method

.method public doubleValue()D
    .locals 4

    .prologue
    .line 454
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    int-to-double v0, v0

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 845
    if-ne p1, p0, :cond_1

    .line 852
    :cond_0
    :goto_0
    return v1

    .line 848
    :cond_1
    instance-of v3, p1, Lorg/apache/commons/lang3/math/Fraction;

    if-nez v3, :cond_2

    move v1, v2

    .line 849
    goto :goto_0

    :cond_2
    move-object v0, p1

    .line 851
    check-cast v0, Lorg/apache/commons/lang3/math/Fraction;

    .line 852
    .local v0, "other":Lorg/apache/commons/lang3/math/Fraction;
    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getNumerator()I

    move-result v3

    invoke-virtual {v0}, Lorg/apache/commons/lang3/math/Fraction;->getNumerator()I

    move-result v4

    if-ne v3, v4, :cond_3

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getDenominator()I

    move-result v3

    invoke-virtual {v0}, Lorg/apache/commons/lang3/math/Fraction;->getDenominator()I

    move-result v4

    if-eq v3, v4, :cond_0

    :cond_3
    move v1, v2

    goto :goto_0
.end method

.method public floatValue()F
    .locals 2

    .prologue
    .line 443
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    int-to-float v0, v0

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public getDenominator()I
    .locals 1

    .prologue
    .line 377
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    return v0
.end method

.method public getNumerator()I
    .locals 1

    .prologue
    .line 368
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    return v0
.end method

.method public getProperNumerator()I
    .locals 2

    .prologue
    .line 392
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    rem-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0
.end method

.method public getProperWhole()I
    .locals 2

    .prologue
    .line 407
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 863
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->hashCode:I

    if-nez v0, :cond_0

    .line 865
    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getNumerator()I

    move-result v0

    add-int/lit16 v0, v0, 0x275

    mul-int/lit8 v0, v0, 0x25

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getDenominator()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/apache/commons/lang3/math/Fraction;->hashCode:I

    .line 867
    :cond_0
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->hashCode:I

    return v0
.end method

.method public intValue()I
    .locals 2

    .prologue
    .line 421
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v0, v1

    return v0
.end method

.method public invert()Lorg/apache/commons/lang3/math/Fraction;
    .locals 3

    .prologue
    .line 490
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-nez v0, :cond_0

    .line 491
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Unable to invert zero."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 493
    :cond_0
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    .line 494
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "overflow: can\'t negate numerator"

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 496
    :cond_1
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-gez v0, :cond_2

    .line 497
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    neg-int v1, v1

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    neg-int v2, v2

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    .line 499
    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    goto :goto_0
.end method

.method public longValue()J
    .locals 4

    .prologue
    .line 432
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    int-to-long v0, v0

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public multiplyBy(Lorg/apache/commons/lang3/math/Fraction;)Lorg/apache/commons/lang3/math/Fraction;
    .locals 5
    .param p1, "fraction"    # Lorg/apache/commons/lang3/math/Fraction;

    .prologue
    .line 797
    if-nez p1, :cond_0

    .line 798
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "The fraction must not be null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 800
    :cond_0
    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-eqz v2, :cond_1

    iget v2, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-nez v2, :cond_2

    .line 801
    :cond_1
    sget-object v2, Lorg/apache/commons/lang3/math/Fraction;->ZERO:Lorg/apache/commons/lang3/math/Fraction;

    .line 807
    :goto_0
    return-object v2

    .line 805
    :cond_2
    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v3, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-static {v2, v3}, Lorg/apache/commons/lang3/math/Fraction;->greatestCommonDivisor(II)I

    move-result v0

    .line 806
    .local v0, "d1":I
    iget v2, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v3, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-static {v2, v3}, Lorg/apache/commons/lang3/math/Fraction;->greatestCommonDivisor(II)I

    move-result v1

    .line 807
    .local v1, "d2":I
    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    div-int/2addr v2, v0

    iget v3, p1, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    div-int/2addr v3, v1

    invoke-static {v2, v3}, Lorg/apache/commons/lang3/math/Fraction;->mulAndCheck(II)I

    move-result v2

    iget v3, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v3, v1

    iget v4, p1, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v4, v0

    invoke-static {v3, v4}, Lorg/apache/commons/lang3/math/Fraction;->mulPosAndCheck(II)I

    move-result v3

    invoke-static {v2, v3}, Lorg/apache/commons/lang3/math/Fraction;->getReducedFraction(II)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v2

    goto :goto_0
.end method

.method public negate()Lorg/apache/commons/lang3/math/Fraction;
    .locals 3

    .prologue
    .line 512
    iget v0, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    .line 513
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "overflow: too large to negate"

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 515
    :cond_0
    new-instance v0, Lorg/apache/commons/lang3/math/Fraction;

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    neg-int v1, v1

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/math/Fraction;-><init>(II)V

    return-object v0
.end method

.method public pow(I)Lorg/apache/commons/lang3/math/Fraction;
    .locals 3
    .param p1, "power"    # I

    .prologue
    .line 547
    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 561
    .end local p0    # "this":Lorg/apache/commons/lang3/math/Fraction;
    :goto_0
    return-object p0

    .line 549
    .restart local p0    # "this":Lorg/apache/commons/lang3/math/Fraction;
    :cond_0
    if-nez p1, :cond_1

    .line 550
    sget-object p0, Lorg/apache/commons/lang3/math/Fraction;->ONE:Lorg/apache/commons/lang3/math/Fraction;

    goto :goto_0

    .line 551
    :cond_1
    if-gez p1, :cond_3

    .line 552
    const/high16 v1, -0x80000000

    if-ne p1, v1, :cond_2

    .line 553
    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->invert()Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lorg/apache/commons/lang3/math/Fraction;->pow(I)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v1

    div-int/lit8 v2, p1, 0x2

    neg-int v2, v2

    invoke-virtual {v1, v2}, Lorg/apache/commons/lang3/math/Fraction;->pow(I)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object p0

    goto :goto_0

    .line 555
    :cond_2
    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->invert()Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v1

    neg-int v2, p1

    invoke-virtual {v1, v2}, Lorg/apache/commons/lang3/math/Fraction;->pow(I)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object p0

    goto :goto_0

    .line 557
    :cond_3
    invoke-virtual {p0, p0}, Lorg/apache/commons/lang3/math/Fraction;->multiplyBy(Lorg/apache/commons/lang3/math/Fraction;)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v0

    .line 558
    .local v0, "f":Lorg/apache/commons/lang3/math/Fraction;
    rem-int/lit8 v1, p1, 0x2

    if-nez v1, :cond_4

    .line 559
    div-int/lit8 v1, p1, 0x2

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/math/Fraction;->pow(I)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object p0

    goto :goto_0

    .line 561
    :cond_4
    div-int/lit8 v1, p1, 0x2

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/math/Fraction;->pow(I)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v1

    invoke-virtual {v1, p0}, Lorg/apache/commons/lang3/math/Fraction;->multiplyBy(Lorg/apache/commons/lang3/math/Fraction;)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object p0

    goto :goto_0
.end method

.method public reduce()Lorg/apache/commons/lang3/math/Fraction;
    .locals 3

    .prologue
    .line 470
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-nez v1, :cond_2

    .line 471
    sget-object v1, Lorg/apache/commons/lang3/math/Fraction;->ZERO:Lorg/apache/commons/lang3/math/Fraction;

    invoke-virtual {p0, v1}, Lorg/apache/commons/lang3/math/Fraction;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 477
    .end local p0    # "this":Lorg/apache/commons/lang3/math/Fraction;
    .local v0, "gcd":I
    :cond_0
    :goto_0
    return-object p0

    .line 471
    .end local v0    # "gcd":I
    .restart local p0    # "this":Lorg/apache/commons/lang3/math/Fraction;
    :cond_1
    sget-object p0, Lorg/apache/commons/lang3/math/Fraction;->ZERO:Lorg/apache/commons/lang3/math/Fraction;

    goto :goto_0

    .line 473
    :cond_2
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    invoke-static {v1, v2}, Lorg/apache/commons/lang3/math/Fraction;->greatestCommonDivisor(II)I

    move-result v0

    .line 474
    .restart local v0    # "gcd":I
    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 477
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    div-int/2addr v1, v0

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    div-int/2addr v2, v0

    invoke-static {v1, v2}, Lorg/apache/commons/lang3/math/Fraction;->getFraction(II)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object p0

    goto :goto_0
.end method

.method public subtract(Lorg/apache/commons/lang3/math/Fraction;)Lorg/apache/commons/lang3/math/Fraction;
    .locals 1
    .param p1, "fraction"    # Lorg/apache/commons/lang3/math/Fraction;

    .prologue
    .line 727
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/lang3/math/Fraction;->addSub(Lorg/apache/commons/lang3/math/Fraction;Z)Lorg/apache/commons/lang3/math/Fraction;

    move-result-object v0

    return-object v0
.end method

.method public toProperString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x2f

    const/16 v3, 0x20

    .line 930
    iget-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 931
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-nez v1, :cond_1

    .line 932
    const-string v1, "0"

    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    .line 957
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    return-object v1

    .line 933
    :cond_1
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    if-ne v1, v2, :cond_2

    .line 934
    const-string v1, "1"

    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    goto :goto_0

    .line 935
    :cond_2
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    mul-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_3

    .line 936
    const-string v1, "-1"

    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    goto :goto_0

    .line 937
    :cond_3
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    if-lez v1, :cond_4

    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    neg-int v1, v1

    :goto_1
    iget v2, p0, Lorg/apache/commons/lang3/math/Fraction;->denominator:I

    neg-int v2, v2

    if-ge v1, v2, :cond_6

    .line 942
    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getProperNumerator()I

    move-result v0

    .line 943
    .local v0, "properNumerator":I
    if-nez v0, :cond_5

    .line 944
    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getProperWhole()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    goto :goto_0

    .line 937
    .end local v0    # "properNumerator":I
    :cond_4
    iget v1, p0, Lorg/apache/commons/lang3/math/Fraction;->numerator:I

    goto :goto_1

    .line 946
    .restart local v0    # "properNumerator":I
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getProperWhole()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getDenominator()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    goto :goto_0

    .line 952
    .end local v0    # "properNumerator":I
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getNumerator()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getDenominator()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/commons/lang3/math/Fraction;->toProperString:Ljava/lang/String;

    goto/16 :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 911
    iget-object v0, p0, Lorg/apache/commons/lang3/math/Fraction;->toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 912
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getNumerator()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/math/Fraction;->getDenominator()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/math/Fraction;->toString:Ljava/lang/String;

    .line 917
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/lang3/math/Fraction;->toString:Ljava/lang/String;

    return-object v0
.end method
