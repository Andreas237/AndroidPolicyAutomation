.class public final Lcom/microblink/TypeValueUtils;
.super Ljava/lang/Object;


# static fields
.field private static final DEFAULT_FLOAT_VALUE:F = -1.0f

.field private static final ZERO_FLOAT_VALUE:F


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static confidence(Lcom/microblink/FloatType;)F
    .locals 1
    .param p0    # Lcom/microblink/FloatType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p0, v0}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;F)F

    move-result p0

    return p0
.end method

.method public static confidence(Lcom/microblink/FloatType;F)F
    .locals 0
    .param p0    # Lcom/microblink/FloatType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/FloatType;->confidence()F

    move-result p0

    return p0

    :cond_0
    return p1
.end method

.method public static confidence(Lcom/microblink/IntType;)F
    .locals 1
    .param p0    # Lcom/microblink/IntType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p0, v0}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/IntType;F)F

    move-result p0

    return p0
.end method

.method public static confidence(Lcom/microblink/IntType;F)F
    .locals 0
    .param p0    # Lcom/microblink/IntType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/IntType;->confidence()F

    move-result p0

    return p0

    :cond_0
    return p1
.end method

.method public static confidence(Lcom/microblink/StringType;)F
    .locals 1
    .param p0    # Lcom/microblink/StringType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p0, v0}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;F)F

    move-result p0

    return p0
.end method

.method public static confidence(Lcom/microblink/StringType;F)F
    .locals 0
    .param p0    # Lcom/microblink/StringType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/StringType;->confidence()F

    move-result p0

    return p0

    :cond_0
    return p1
.end method

.method public static value(Lcom/microblink/FloatType;)F
    .locals 1
    .param p0    # Lcom/microblink/FloatType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;F)F

    move-result p0

    return p0
.end method

.method public static value(Lcom/microblink/FloatType;F)F
    .locals 0
    .param p0    # Lcom/microblink/FloatType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/FloatType;->value()F

    move-result p0

    return p0

    :cond_0
    return p1
.end method

.method public static value(Lcom/microblink/IntType;)I
    .locals 1
    .param p0    # Lcom/microblink/IntType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/IntType;I)I

    move-result p0

    return p0
.end method

.method public static value(Lcom/microblink/IntType;I)I
    .locals 0
    .param p0    # Lcom/microblink/IntType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/IntType;->value()I

    move-result p0

    return p0

    :cond_0
    return p1
.end method

.method public static value(Lcom/microblink/StringType;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/microblink/StringType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0    # Lcom/microblink/StringType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/StringType;->value()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static valueOf(FF)Lcom/microblink/FloatType;
    .locals 1

    new-instance v0, Lcom/microblink/FloatType;

    invoke-direct {v0, p0, p1}, Lcom/microblink/FloatType;-><init>(FF)V

    return-object v0
.end method

.method public static valueOf(IF)Lcom/microblink/IntType;
    .locals 1

    new-instance v0, Lcom/microblink/IntType;

    invoke-direct {v0, p0, p1}, Lcom/microblink/IntType;-><init>(IF)V

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/StringType;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;
    .locals 1

    new-instance v0, Lcom/microblink/StringType;

    invoke-direct {v0, p0, p1}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    return-object v0
.end method
