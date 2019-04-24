.class public final Lio/fotoapparat/util/CompareFpsRangeByBounds;
.super Ljava/lang/Object;
.source "CompareFpsRangeByBounds.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lio/fotoapparat/parameter/FpsRange;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCompareFpsRangeByBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompareFpsRangeByBounds.kt\nio/fotoapparat/util/CompareFpsRangeByBounds\n*L\n1#1,19:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/fotoapparat/util/CompareFpsRangeByBounds;",
        "Ljava/util/Comparator;",
        "Lio/fotoapparat/parameter/FpsRange;",
        "()V",
        "compare",
        "",
        "fpsRange1",
        "fpsRange2",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/fotoapparat/util/CompareFpsRangeByBounds;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lio/fotoapparat/util/CompareFpsRangeByBounds;

    invoke-direct {v0}, Lio/fotoapparat/util/CompareFpsRangeByBounds;-><init>()V

    sput-object v0, Lio/fotoapparat/util/CompareFpsRangeByBounds;->INSTANCE:Lio/fotoapparat/util/CompareFpsRangeByBounds;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lio/fotoapparat/parameter/FpsRange;Lio/fotoapparat/parameter/FpsRange;)I
    .locals 2
    .param p1    # Lio/fotoapparat/parameter/FpsRange;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/parameter/FpsRange;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fpsRange1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fpsRange2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lio/fotoapparat/parameter/FpsRange;->getMin()I

    move-result v0

    invoke-virtual {p2}, Lio/fotoapparat/parameter/FpsRange;->getMin()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lio/fotoapparat/parameter/FpsRange;->getMax()I

    move-result p1

    invoke-virtual {p2}, Lio/fotoapparat/parameter/FpsRange;->getMax()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result v0

    :goto_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 9
    check-cast p1, Lio/fotoapparat/parameter/FpsRange;

    check-cast p2, Lio/fotoapparat/parameter/FpsRange;

    invoke-virtual {p0, p1, p2}, Lio/fotoapparat/util/CompareFpsRangeByBounds;->compare(Lio/fotoapparat/parameter/FpsRange;Lio/fotoapparat/parameter/FpsRange;)I

    move-result p1

    return p1
.end method
