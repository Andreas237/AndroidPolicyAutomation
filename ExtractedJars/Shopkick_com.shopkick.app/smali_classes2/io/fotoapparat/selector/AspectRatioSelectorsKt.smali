.class public final Lio/fotoapparat/selector/AspectRatioSelectorsKt;
.super Ljava/lang/Object;
.source "AspectRatioSelectors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u001a\\\u0010\u0002\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u00072\u0006\u0010\u0002\u001a\u00020\u00082#\u0010\t\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u0001H\u0007\u001aT\u0010\u000b\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u00072#\u0010\t\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u0001H\u0007\u001aT\u0010\u000c\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u00072#\u0010\t\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u0001H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "ASPECT_RATIO_EPSILON",
        "",
        "aspectRatio",
        "Lkotlin/Function1;",
        "",
        "Lio/fotoapparat/parameter/Resolution;",
        "Lio/fotoapparat/selector/ResolutionSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "",
        "selector",
        "tolerance",
        "standardRatio",
        "wideRatio",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final ASPECT_RATIO_EPSILON:D = 1.0E-4


# direct methods
.method public static final aspectRatio(FLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 6
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v2, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->aspectRatio$default(FLkotlin/jvm/functions/Function1;DILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final aspectRatio(FLkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # D
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;D)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmpl-double v0, p2, v0

    if-ltz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    float-to-double v0, p0

    mul-double/2addr v0, p2

    const-wide p2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    add-double/2addr v0, p2

    .line 58
    new-instance p2, Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;

    invoke-direct {p2, v0, v1, p0}, Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;-><init>(DF)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2}, Lio/fotoapparat/selector/SelectorsKt;->filtered(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0

    .line 53
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Tolerance must be between 0.0 and 1.0."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public static synthetic aspectRatio$default(FLkotlin/jvm/functions/Function1;DILjava/lang/Object;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x0

    .line 50
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->aspectRatio(FLkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final standardRatio(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 4
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->standardRatio$default(Lkotlin/jvm/functions/Function1;DILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final standardRatio(Lkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # D
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;D)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3faaaaab

    .line 15
    invoke-static {v0, p0, p1, p2}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->aspectRatio(FLkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic standardRatio$default(Lkotlin/jvm/functions/Function1;DILjava/lang/Object;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    .line 14
    :cond_0
    invoke-static {p0, p1, p2}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->standardRatio(Lkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final wideRatio(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 4
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->wideRatio$default(Lkotlin/jvm/functions/Function1;DILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final wideRatio(Lkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # D
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;D)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3fe38e39

    .line 31
    invoke-static {v0, p0, p1, p2}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->aspectRatio(FLkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic wideRatio$default(Lkotlin/jvm/functions/Function1;DILjava/lang/Object;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    .line 30
    :cond_0
    invoke-static {p0, p1, p2}, Lio/fotoapparat/selector/AspectRatioSelectorsKt;->wideRatio(Lkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method
