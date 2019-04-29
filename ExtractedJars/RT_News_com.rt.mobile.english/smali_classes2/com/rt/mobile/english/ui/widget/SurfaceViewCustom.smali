.class public Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;
.super Landroid/widget/VideoView;
.source "SurfaceViewCustom.java"


# instance fields
.field private mVideoHeight:I

.field private mVideoWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 2

    .line 36
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoWidth:I

    invoke-static {v0, p1}, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->getDefaultSize(II)I

    move-result p1

    .line 37
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoHeight:I

    invoke-static {v0, p2}, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->getDefaultSize(II)I

    move-result p2

    .line 38
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoWidth:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoHeight:I

    if-lez v0, :cond_1

    .line 39
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoWidth:I

    mul-int/2addr v0, p2

    iget v1, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoHeight:I

    mul-int/2addr v1, p1

    if-le v0, v1, :cond_0

    .line 41
    iget p2, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoHeight:I

    mul-int/2addr p2, p1

    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoWidth:I

    div-int/2addr p2, v0

    goto :goto_0

    .line 42
    :cond_0
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoWidth:I

    mul-int/2addr v0, p2

    iget v1, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoHeight:I

    mul-int/2addr v1, p1

    if-ge v0, v1, :cond_1

    .line 44
    iget p1, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoWidth:I

    mul-int/2addr p1, p2

    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoHeight:I

    div-int/2addr p1, v0

    .line 52
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->setMeasuredDimension(II)V

    return-void
.end method

.method public setVideoSize(II)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoWidth:I

    .line 29
    iput p2, p0, Lcom/rt/mobile/english/ui/widget/SurfaceViewCustom;->mVideoHeight:I

    return-void
.end method
