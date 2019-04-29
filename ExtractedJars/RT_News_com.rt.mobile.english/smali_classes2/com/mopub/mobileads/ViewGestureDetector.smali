.class public Lcom/mopub/mobileads/ViewGestureDetector;
.super Landroid/view/GestureDetector;
.source "ViewGestureDetector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;
    }
.end annotation


# instance fields
.field private mAdAlertGestureListener:Lcom/mopub/mobileads/AdAlertGestureListener;

.field private mUserClickListener:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;

.field private final mView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/common/AdReport;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/common/AdReport;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 26
    new-instance v0, Lcom/mopub/mobileads/AdAlertGestureListener;

    invoke-direct {v0, p2, p3}, Lcom/mopub/mobileads/AdAlertGestureListener;-><init>(Landroid/view/View;Lcom/mopub/common/AdReport;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/mobileads/ViewGestureDetector;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/mobileads/AdAlertGestureListener;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/mobileads/AdAlertGestureListener;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 32
    iput-object p3, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mAdAlertGestureListener:Lcom/mopub/mobileads/AdAlertGestureListener;

    .line 33
    iput-object p2, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mView:Landroid/view/View;

    const/4 p1, 0x0

    .line 35
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/ViewGestureDetector;->setIsLongpressEnabled(Z)V

    return-void
.end method

.method private isMotionEventInView(Landroid/view/MotionEvent;Landroid/view/View;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-ltz v3, :cond_1

    .line 82
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v1, v1, v3

    if-gtz v1, :cond_1

    cmpl-float v1, p1, v2

    if-ltz v1, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method resetAdFlaggingGesture()V
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mAdAlertGestureListener:Lcom/mopub/mobileads/AdAlertGestureListener;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdAlertGestureListener;->reset()V

    return-void
.end method

.method public sendTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 54
    :pswitch_0
    iget-object v0, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mView:Landroid/view/View;

    invoke-direct {p0, p1, v0}, Lcom/mopub/mobileads/ViewGestureDetector;->isMotionEventInView(Landroid/view/MotionEvent;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/ViewGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/ViewGestureDetector;->resetAdFlaggingGesture()V

    goto :goto_1

    .line 41
    :pswitch_1
    iget-object p1, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mUserClickListener:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;

    if-eqz p1, :cond_1

    .line 42
    iget-object p1, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mUserClickListener:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;

    invoke-interface {p1}, Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;->onUserClick()V

    goto :goto_0

    :cond_1
    const-string p1, "View\'s onUserClick() is not registered."

    .line 44
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 46
    :goto_0
    iget-object p1, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mAdAlertGestureListener:Lcom/mopub/mobileads/AdAlertGestureListener;

    invoke-virtual {p1}, Lcom/mopub/mobileads/AdAlertGestureListener;->finishGestureDetection()V

    goto :goto_1

    .line 50
    :pswitch_2
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/ViewGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method setAdAlertGestureListener(Lcom/mopub/mobileads/AdAlertGestureListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 88
    iput-object p1, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mAdAlertGestureListener:Lcom/mopub/mobileads/AdAlertGestureListener;

    return-void
.end method

.method public setUserClickListener(Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/mopub/mobileads/ViewGestureDetector;->mUserClickListener:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;

    return-void
.end method
