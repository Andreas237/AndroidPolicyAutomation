.class Lkotlin/MathKt__NumbersKt;
.super Lkotlin/MathKt__BigNumbersKt;
.source "Numbers.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNumbers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Numbers.kt\nkotlin/MathKt__NumbersKt\n*L\n1#1,43:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\u0008\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\u0008\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\u0008\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\u0008\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\u0008\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0003H\u0087\u0008\u00a8\u0006\u0006"
    }
    d2 = {
        "isFinite",
        "",
        "",
        "",
        "isInfinite",
        "isNaN",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x1,
        0x1,
        0x7
    }
    xi = 0x1
    xs = "kotlin/MathKt"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/MathKt__BigNumbersKt;-><init>()V

    return-void
.end method

.method private static final isFinite(D)Z
    .locals 2
    .param p0, "$receiver"    # D
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 36
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static final isFinite(F)Z
    .locals 1
    .param p0, "$receiver"    # F
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 42
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static final isInfinite(D)Z
    .locals 2
    .param p0, "$receiver"    # D
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 24
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    return v0
.end method

.method private static final isInfinite(F)Z
    .locals 1
    .param p0, "$receiver"    # F
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 30
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    return v0
.end method

.method private static final isNaN(D)Z
    .locals 2
    .param p0, "$receiver"    # D
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 11
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    return v0
.end method

.method private static final isNaN(F)Z
    .locals 1
    .param p0, "$receiver"    # F
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 18
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    return v0
.end method
