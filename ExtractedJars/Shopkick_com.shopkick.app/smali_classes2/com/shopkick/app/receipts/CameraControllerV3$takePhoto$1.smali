.class final Lcom/shopkick/app/receipts/CameraControllerV3$takePhoto$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CameraControllerV3.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV3;->takePhoto()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/result/BitmapPhoto;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "bitmapPhoto",
        "Lio/fotoapparat/result/BitmapPhoto;",
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
.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV3;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV3;)V
    .locals 0

    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV3$takePhoto$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Lio/fotoapparat/result/BitmapPhoto;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV3$takePhoto$1;->invoke(Lio/fotoapparat/result/BitmapPhoto;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/fotoapparat/result/BitmapPhoto;)V
    .locals 1
    .param p1    # Lio/fotoapparat/result/BitmapPhoto;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV3$takePhoto$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/CameraControllerV3;->access$onImageAvailable(Lcom/shopkick/app/receipts/CameraControllerV3;Lio/fotoapparat/result/BitmapPhoto;)V

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV3$takePhoto$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV3;->access$setCaptureInProgress$p(Lcom/shopkick/app/receipts/CameraControllerV3;Z)V

    return-void
.end method
