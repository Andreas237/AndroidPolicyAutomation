.class final Lio/fotoapparat/result/transformer/ResolutionTransformersKt$scaled$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ResolutionTransformers.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/result/transformer/ResolutionTransformersKt;->scaled(F)Lkotlin/jvm/functions/Function1;
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
        "Lio/fotoapparat/parameter/Resolution;",
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
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/parameter/Resolution;",
        "input",
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
.field final synthetic $scaleFactor:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, Lio/fotoapparat/result/transformer/ResolutionTransformersKt$scaled$1;->$scaleFactor:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/fotoapparat/parameter/Resolution;)Lio/fotoapparat/parameter/Resolution;
    .locals 3
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    new-instance v0, Lio/fotoapparat/parameter/Resolution;

    .line 18
    iget v1, p1, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v1, v1

    iget v2, p0, Lio/fotoapparat/result/transformer/ResolutionTransformersKt$scaled$1;->$scaleFactor:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 19
    iget p1, p1, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float p1, p1

    iget v2, p0, Lio/fotoapparat/result/transformer/ResolutionTransformersKt$scaled$1;->$scaleFactor:F

    mul-float/2addr p1, v2

    float-to-int p1, p1

    .line 17
    invoke-direct {v0, v1, p1}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/fotoapparat/parameter/Resolution;

    invoke-virtual {p0, p1}, Lio/fotoapparat/result/transformer/ResolutionTransformersKt$scaled$1;->invoke(Lio/fotoapparat/parameter/Resolution;)Lio/fotoapparat/parameter/Resolution;

    move-result-object p1

    return-object p1
.end method
