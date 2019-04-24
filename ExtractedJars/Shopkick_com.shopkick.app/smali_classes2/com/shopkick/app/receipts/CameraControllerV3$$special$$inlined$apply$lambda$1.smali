.class final Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$1;
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
        "Ljava/lang/Iterable<",
        "+",
        "Lio/fotoapparat/parameter/Resolution;",
        ">;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0002H\n\u00a2\u0006\u0002\u0008\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/parameter/Resolution;",
        "",
        "invoke",
        "com/shopkick/app/receipts/CameraControllerV3$1$1"
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

    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    iput-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$1;->$mainView$inlined:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Iterable;)Lio/fotoapparat/parameter/Resolution;
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lio/fotoapparat/parameter/Resolution;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/CameraControllerV3;->access$bestResolution(Lcom/shopkick/app/receipts/CameraControllerV3;Ljava/lang/Iterable;)Lio/fotoapparat/parameter/Resolution;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV3$$special$$inlined$apply$lambda$1;->invoke(Ljava/lang/Iterable;)Lio/fotoapparat/parameter/Resolution;

    move-result-object p1

    return-object p1
.end method
