.class final Lcom/shopkick/app/receipts/CameraControllerV3$updateCameraUI$1;
.super Ljava/lang/Object;
.source "CameraControllerV3.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV3;->updateCameraUI(Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $state:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV3;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV3;Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;)V
    .locals 0

    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV3$updateCameraUI$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    iput-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV3$updateCameraUI$1;->$state:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV3$updateCameraUI$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV3;

    iget-object v0, v0, Lcom/shopkick/app/receipts/CameraControllerV3;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV3$updateCameraUI$1;->$state:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    sget-object v2, Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    .line 238
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    const/4 v2, -0x1

    goto :goto_0

    :pswitch_1
    const/4 v2, 0x2

    goto :goto_0

    :pswitch_2
    const/4 v2, 0x1

    .line 233
    :goto_0
    :pswitch_3
    invoke-virtual {v0, v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
