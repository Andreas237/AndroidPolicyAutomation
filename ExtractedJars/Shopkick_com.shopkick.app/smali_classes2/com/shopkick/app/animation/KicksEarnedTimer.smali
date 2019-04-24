.class public Lcom/shopkick/app/animation/KicksEarnedTimer;
.super Landroid/os/CountDownTimer;
.source "KicksEarnedTimer.java"


# instance fields
.field private animationDuration:J

.field private coinsEarned:I

.field private textViewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private totalKicks:I


# direct methods
.method public constructor <init>(JJLandroid/widget/TextView;II)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 21
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->textViewWeakReference:Ljava/lang/ref/WeakReference;

    .line 22
    iput p6, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->coinsEarned:I

    .line 23
    iput p7, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->totalKicks:I

    .line 24
    iput-wide p1, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->animationDuration:J

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->textViewWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->textViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 43
    iget v1, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->totalKicks:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->textViewWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onTick(J)V
    .locals 5

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->textViewWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->textViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 31
    iget v1, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->totalKicks:I

    int-to-float v1, v1

    iget v2, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->coinsEarned:I

    int-to-float v2, v2

    long-to-float p1, p1

    iget-wide v3, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->animationDuration:J

    long-to-float p2, v3

    div-float/2addr p1, p2

    mul-float/2addr v2, p1

    sub-float/2addr v1, v2

    float-to-int p1, v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/animation/KicksEarnedTimer;->cancel()V

    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/animation/KicksEarnedTimer;->textViewWeakReference:Ljava/lang/ref/WeakReference;

    :goto_0
    return-void
.end method
