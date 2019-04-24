.class public final Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
.super Ljava/lang/Object;
.source "BubblesAnimationController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private bubbleCountMax:I

.field private bubbleCountMin:I

.field private bubbleFloatSpeedMax:D

.field private bubbleFloatSpeedMin:D

.field private bubbleRiseDecelerationFactor:F

.field private bubbleRiseDurationMillisecondsMax:I

.field private bubbleRiseDurationMillisecondsMin:I

.field private bubbleSizeDipMax:I

.field private bubbleSizeDipMin:I

.field private final context:Landroid/content/Context;

.field private dialogMarginDip:I

.field private doRiseAnimation:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 314
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 298
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->doRiseAnimation:Z

    const/16 v0, 0x384

    .line 299
    iput v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDurationMillisecondsMin:I

    const/16 v0, 0x514

    .line 300
    iput v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDurationMillisecondsMax:I

    const/high16 v0, 0x40400000    # 3.0f

    .line 301
    iput v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDecelerationFactor:F

    const/16 v0, 0x14

    .line 302
    iput v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->dialogMarginDip:I

    const/16 v1, 0x23

    .line 303
    iput v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleCountMin:I

    const/16 v1, 0x28

    .line 304
    iput v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleCountMax:I

    const/4 v1, 0x5

    .line 305
    iput v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleSizeDipMin:I

    .line 306
    iput v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleSizeDipMax:I

    const-wide v0, 0x3fa999999999999aL    # 0.05

    .line 307
    iput-wide v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleFloatSpeedMin:D

    const-wide v0, 0x3fb999999999999aL    # 0.1

    .line 308
    iput-wide v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleFloatSpeedMax:D

    if-eqz p1, :cond_0

    .line 316
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->context:Landroid/content/Context;

    return-void

    .line 315
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public build()Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;
    .locals 18

    move-object/from16 v0, p0

    .line 427
    new-instance v17, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    iget-object v2, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->context:Landroid/content/Context;

    iget-boolean v3, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->doRiseAnimation:Z

    iget v4, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDurationMillisecondsMin:I

    iget v5, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDurationMillisecondsMax:I

    iget v6, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDecelerationFactor:F

    iget v7, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->dialogMarginDip:I

    iget v8, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleCountMin:I

    iget v9, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleCountMax:I

    iget v10, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleSizeDipMin:I

    iget v11, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleSizeDipMax:I

    iget-wide v12, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleFloatSpeedMin:D

    iget-wide v14, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleFloatSpeedMax:D

    const/16 v16, 0x0

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;-><init>(Landroid/content/Context;ZIIFIIIIIDDLcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;)V

    return-object v17
.end method

.method public setBubbleCountRange(II)Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
    .locals 0

    if-ltz p1, :cond_1

    if-ge p1, p2, :cond_0

    .line 381
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleCountMin:I

    .line 382
    iput p2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleCountMax:I

    return-object p0

    .line 379
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleCountMin\' must be less than \'bubbleCountMax\'"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 376
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleCountMin\' can not be less than zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBubbleFloatSpeedRange(DD)Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
    .locals 2

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-ltz v0, :cond_1

    cmpl-double v0, p1, p3

    if-gez v0, :cond_0

    .line 413
    iput-wide p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleFloatSpeedMin:D

    .line 414
    iput-wide p3, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleFloatSpeedMax:D

    return-object p0

    .line 411
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleFloatSpeedMin\' must be less than \'bubbleFloatSpeedMax\'"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 408
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleFloatSpeedMin\' can not be less than zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBubbleRiseDecelerationFactor(F)Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_0

    .line 355
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDecelerationFactor:F

    return-object p0

    .line 353
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'bubbleRiseDecelerationFactor\' must be greater than zero"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBubbleSizeDipRange(II)Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
    .locals 0

    if-ltz p1, :cond_1

    if-ge p1, p2, :cond_0

    .line 397
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleSizeDipMin:I

    .line 398
    iput p2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleSizeDipMax:I

    return-object p0

    .line 395
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleSizeDipMin\' must be less than \'bubbleSizeDipMax\'"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 392
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleSizeDipMin\' can not be less than zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDialogMarginDip(I)Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
    .locals 1

    if-ltz p1, :cond_0

    .line 366
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->dialogMarginDip:I

    return-object p0

    .line 364
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'dialogMarginDip\' can not be less than zero"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDoRiseAnimation(Z)Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
    .locals 0

    .line 324
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->doRiseAnimation:Z

    return-object p0
.end method

.method public setRiseDurationMillisecondsRange(II)Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;
    .locals 0

    if-ltz p1, :cond_1

    if-ge p1, p2, :cond_0

    .line 342
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDurationMillisecondsMin:I

    .line 343
    iput p2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->bubbleRiseDurationMillisecondsMax:I

    return-object p0

    .line 339
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleRiseDurationMillisecondsMin\' must be less than \'bubbleRiseDurationMillisecondsMax\'"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 336
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bubbleRiseDurationMillisecondsMin\' can not be less than zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
