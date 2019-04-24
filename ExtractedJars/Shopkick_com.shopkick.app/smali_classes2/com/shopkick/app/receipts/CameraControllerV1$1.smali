.class Lcom/shopkick/app/receipts/CameraControllerV1$1;
.super Ljava/lang/Object;
.source "CameraControllerV1.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV1;->updateUi(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

.field final synthetic val$newState:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV1;I)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iput p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1$1;->val$newState:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v0, v0, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    iget v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1$1;->val$newState:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    return-void
.end method
