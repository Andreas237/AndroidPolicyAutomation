.class final Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;
.super Lkotlin/jvm/internal/Lambda;
.source "AspectRatioSelectors.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/selector/AspectRatioSelectorsKt;->aspectRatio(FLkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/parameter/Resolution;",
        "Ljava/lang/Boolean;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lio/fotoapparat/parameter/Resolution;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $aspectRatio:F

.field final synthetic $calculatedTolerance:D


# direct methods
.method constructor <init>(DF)V
    .locals 0

    iput-wide p1, p0, Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;->$calculatedTolerance:D

    iput p3, p0, Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;->$aspectRatio:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/fotoapparat/parameter/Resolution;

    invoke-virtual {p0, p1}, Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;->invoke(Lio/fotoapparat/parameter/Resolution;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lio/fotoapparat/parameter/Resolution;)Z
    .locals 4
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget v0, p0, Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;->$aspectRatio:F

    invoke-virtual {p1}, Lio/fotoapparat/parameter/Resolution;->getAspectRatio()F

    move-result p1

    sub-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    float-to-double v0, p1

    iget-wide v2, p0, Lio/fotoapparat/selector/AspectRatioSelectorsKt$aspectRatio$1;->$calculatedTolerance:D

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
