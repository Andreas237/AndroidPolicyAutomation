.class final Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt$highestRangeFps$1;
.super Lkotlin/jvm/internal/Lambda;
.source "PreviewFpsRangeSelectors.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt;->highestRangeFps()Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Iterable<",
        "+",
        "Lio/fotoapparat/parameter/FpsRange;",
        ">;",
        "Lio/fotoapparat/parameter/FpsRange;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/parameter/FpsRange;",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt$highestRangeFps$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt$highestRangeFps$1;

    invoke-direct {v0}, Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt$highestRangeFps$1;-><init>()V

    sput-object v0, Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt$highestRangeFps$1;->INSTANCE:Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt$highestRangeFps$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Iterable;)Lio/fotoapparat/parameter/FpsRange;
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;)",
            "Lio/fotoapparat/parameter/FpsRange;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    sget-object v0, Lio/fotoapparat/util/CompareFpsRangeByBounds;->INSTANCE:Lio/fotoapparat/util/CompareFpsRangeByBounds;

    check-cast v0, Ljava/util/Comparator;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->maxWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fotoapparat/parameter/FpsRange;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt$highestRangeFps$1;->invoke(Ljava/lang/Iterable;)Lio/fotoapparat/parameter/FpsRange;

    move-result-object p1

    return-object p1
.end method
