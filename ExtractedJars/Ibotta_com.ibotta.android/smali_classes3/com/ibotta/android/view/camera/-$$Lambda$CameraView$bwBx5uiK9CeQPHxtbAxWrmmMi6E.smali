.class public final synthetic Lcom/ibotta/android/view/camera/-$$Lambda$CameraView$bwBx5uiK9CeQPHxtbAxWrmmMi6E;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/view/camera/CameraView;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/view/camera/CameraView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/camera/-$$Lambda$CameraView$bwBx5uiK9CeQPHxtbAxWrmmMi6E;->f$0:Lcom/ibotta/android/view/camera/CameraView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/view/camera/-$$Lambda$CameraView$bwBx5uiK9CeQPHxtbAxWrmmMi6E;->f$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-static {v0}, Lcom/ibotta/android/view/camera/CameraView;->lambda$doFocus$1(Lcom/ibotta/android/view/camera/CameraView;)V

    return-void
.end method
