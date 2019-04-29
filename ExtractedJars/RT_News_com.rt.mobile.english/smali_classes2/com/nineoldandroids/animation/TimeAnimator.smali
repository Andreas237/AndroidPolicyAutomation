.class public Lcom/nineoldandroids/animation/TimeAnimator;
.super Lcom/nineoldandroids/animation/ValueAnimator;
.source "TimeAnimator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;
    }
.end annotation


# instance fields
.field private mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;

.field private mPreviousTime:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V

    const-wide/16 v0, -0x1

    .line 15
    iput-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J

    return-void
.end method


# virtual methods
.method animateValue(F)V
    .locals 0

    return-void
.end method

.method animationFrame(J)Z
    .locals 11

    .line 19
    iget v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPlayingState:I

    const-wide/16 v1, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 20
    iput v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPlayingState:I

    .line 21
    iget-wide v3, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mSeekTime:J

    cmp-long v0, v3, v1

    if-gez v0, :cond_0

    .line 22
    iput-wide p1, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mStartTime:J

    goto :goto_0

    .line 24
    :cond_0
    iget-wide v3, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mSeekTime:J

    sub-long v5, p1, v3

    iput-wide v5, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mStartTime:J

    const-wide/16 v3, -0x1

    .line 26
    iput-wide v3, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mSeekTime:J

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;

    if-eqz v0, :cond_3

    .line 30
    iget-wide v3, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mStartTime:J

    sub-long v7, p1, v3

    .line 31
    iget-wide v3, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J

    cmp-long v0, v3, v1

    if-gez v0, :cond_2

    move-wide v9, v1

    goto :goto_1

    :cond_2
    iget-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J

    sub-long v2, p1, v0

    move-wide v9, v2

    .line 32
    :goto_1
    iput-wide p1, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J

    .line 33
    iget-object v5, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;

    move-object v6, p0

    invoke-interface/range {v5 .. v10}, Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;->onTimeUpdate(Lcom/nineoldandroids/animation/TimeAnimator;JJ)V

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method initAnimation()V
    .locals 0

    return-void
.end method

.method public setTimeListener(Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;

    return-void
.end method
