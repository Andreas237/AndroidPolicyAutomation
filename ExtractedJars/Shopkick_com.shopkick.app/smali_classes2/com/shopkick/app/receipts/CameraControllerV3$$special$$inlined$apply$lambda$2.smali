.class final Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$2;
.super Lkotlin/jvm/internal/Lambda;
.source "CameraControllerV3.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV3;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/exception/camera/CameraException;",
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
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "cameraException",
        "Lio/fotoapparat/exception/camera/CameraException;",
        "invoke",
        "com/shopkick/app/receipts/CameraControllerV3$1$2"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $mainView$inlined:Landroid/view/View;

.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV3;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV3;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    iput-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$2;->$mainView$inlined:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Lio/fotoapparat/exception/camera/CameraException;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$2;->invoke(Lio/fotoapparat/exception/camera/CameraException;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/fotoapparat/exception/camera/CameraException;)V
    .locals 1
    .param p1    # Lio/fotoapparat/exception/camera/CameraException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cameraException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    invoke-virtual {p1}, Lio/fotoapparat/exception/camera/CameraException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/CameraControllerV3;->access$log(Lcom/shopkick/app/receipts/CameraControllerV3;Ljava/lang/String;)V

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV3;->access$updateCameraUI(Lcom/shopkick/app/receipts/CameraControllerV3;Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;)V

    return-void
.end method
