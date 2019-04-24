.class public final Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;
.super Landroid/os/CountDownTimer;
.source "CountdownTimerController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/CountdownTimerController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BonusCountdownTimer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;",
        "Landroid/os/CountDownTimer;",
        "millisInFuture",
        "",
        "countDownInterval",
        "timerController",
        "Lcom/shopkick/app/store/CountdownTimerController;",
        "(JJLcom/shopkick/app/store/CountdownTimerController;)V",
        "(JJ)V",
        "timerControllerRef",
        "Ljava/lang/ref/WeakReference;",
        "getTimerControllerRef",
        "()Ljava/lang/ref/WeakReference;",
        "setTimerControllerRef",
        "(Ljava/lang/ref/WeakReference;)V",
        "onFinish",
        "",
        "onTick",
        "millisUntilFinished",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field public timerControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/CountdownTimerController;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJLcom/shopkick/app/store/CountdownTimerController;)V
    .locals 1
    .param p5    # Lcom/shopkick/app/store/CountdownTimerController;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "timerController"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;-><init>(JJ)V

    .line 75
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final getTimerControllerRef()Ljava/lang/ref/WeakReference;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/CountdownTimerController;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const-string/jumbo v1, "timerControllerRef"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public onFinish()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const-string/jumbo v1, "timerControllerRef"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/CountdownTimerController;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/shopkick/app/store/CountdownTimerController;->access$onFinish(Lcom/shopkick/app/store/CountdownTimerController;)V

    :cond_1
    return-void
.end method

.method public onTick(J)V
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const-string/jumbo v1, "timerControllerRef"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/CountdownTimerController;

    if-eqz v0, :cond_1

    invoke-static {v0, p1, p2}, Lcom/shopkick/app/store/CountdownTimerController;->access$onTick(Lcom/shopkick/app/store/CountdownTimerController;J)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->cancel()V

    :goto_0
    return-void
.end method

.method public final setTimerControllerRef(Ljava/lang/ref/WeakReference;)V
    .locals 1
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/CountdownTimerController;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iput-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method
