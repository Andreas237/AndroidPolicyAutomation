.class final Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CameraView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/view/CameraView;->tryInitialize(Landroid/view/TextureView;)Landroid/graphics/SurfaceTexture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/graphics/SurfaceTexture;",
        "Lkotlin/Unit;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroid/graphics/SurfaceTexture;",
        "invoke",
        "io/fotoapparat/view/CameraView$tryInitialize$1$1"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $this_tryInitialize$inlined:Landroid/view/TextureView;

.field final synthetic this$0:Lio/fotoapparat/view/CameraView;


# direct methods
.method constructor <init>(Lio/fotoapparat/view/CameraView;Landroid/view/TextureView;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;->this$0:Lio/fotoapparat/view/CameraView;

    iput-object p2, p0, Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;->$this_tryInitialize$inlined:Landroid/view/TextureView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    check-cast p1, Landroid/graphics/SurfaceTexture;

    invoke-virtual {p0, p1}, Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;->invoke(Landroid/graphics/SurfaceTexture;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/graphics/SurfaceTexture;)V
    .locals 1
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;->this$0:Lio/fotoapparat/view/CameraView;

    invoke-static {v0, p1}, Lio/fotoapparat/view/CameraView;->access$setSurfaceTexture$p(Lio/fotoapparat/view/CameraView;Landroid/graphics/SurfaceTexture;)V

    .line 73
    iget-object p1, p0, Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;->this$0:Lio/fotoapparat/view/CameraView;

    invoke-static {p1}, Lio/fotoapparat/view/CameraView;->access$getTextureLatch$p(Lio/fotoapparat/view/CameraView;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
