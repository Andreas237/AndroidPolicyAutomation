.class Lcom/ibotta/android/view/video/IbottaVideoView$1;
.super Landroid/os/CountDownTimer;
.source "IbottaVideoView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/video/IbottaVideoView;->startCountdown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/video/IbottaVideoView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/video/IbottaVideoView;JJ)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/view/video/IbottaVideoView$1;->this$0:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 0

    return-void
.end method

.method public onTick(J)V
    .locals 0

    .line 128
    iget-object p1, p0, Lcom/ibotta/android/view/video/IbottaVideoView$1;->this$0:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-static {p1}, Lcom/ibotta/android/view/video/IbottaVideoView;->access$000(Lcom/ibotta/android/view/video/IbottaVideoView;)V

    return-void
.end method
