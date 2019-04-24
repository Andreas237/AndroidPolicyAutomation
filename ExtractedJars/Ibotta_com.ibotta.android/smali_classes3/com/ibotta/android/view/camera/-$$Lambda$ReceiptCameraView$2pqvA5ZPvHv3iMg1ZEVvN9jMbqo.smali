.class public final synthetic Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$2pqvA5ZPvHv3iMg1ZEVvN9jMbqo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/view/camera/ReceiptCameraView;

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/view/camera/ReceiptCameraView;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$2pqvA5ZPvHv3iMg1ZEVvN9jMbqo;->f$0:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    iput-boolean p2, p0, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$2pqvA5ZPvHv3iMg1ZEVvN9jMbqo;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$2pqvA5ZPvHv3iMg1ZEVvN9jMbqo;->f$0:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    iget-boolean v1, p0, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$2pqvA5ZPvHv3iMg1ZEVvN9jMbqo;->f$1:Z

    invoke-static {v0, v1}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->lambda$initFocus$1(Lcom/ibotta/android/view/camera/ReceiptCameraView;Z)V

    return-void
.end method
