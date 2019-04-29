.class Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;
.super Landroid/view/SurfaceView;
.source "ResizeSurfaceView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    const/4 p2, -0x2

    invoke-interface {p1, p2}, Landroid/view/SurfaceHolder;->setFormat(I)V

    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 6

    .line 25
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoWidth:I

    .line 26
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v1

    iget v1, v1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoHeight:I

    .line 28
    invoke-static {v0, p1}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->getDefaultSize(II)I

    move-result v2

    .line 29
    invoke-static {v1, p2}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->getDefaultSize(II)I

    move-result v3

    if-lez v0, :cond_8

    if-lez v1, :cond_8

    .line 32
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 33
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 34
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 35
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v2, v4, :cond_1

    if-ne v3, v4, :cond_1

    mul-int v2, v0, p2

    mul-int v3, p1, v1

    if-ge v2, v3, :cond_0

    .line 44
    div-int/2addr v2, v1

    move p1, v2

    goto :goto_2

    :cond_0
    if-le v2, v3, :cond_9

    .line 46
    div-int/2addr v3, v0

    goto :goto_1

    :cond_1
    const/high16 v5, -0x80000000

    if-ne v2, v4, :cond_3

    mul-int/2addr v1, p1

    .line 51
    div-int v0, v1, v0

    if-ne v3, v5, :cond_2

    if-le v0, p2, :cond_2

    goto :goto_2

    :cond_2
    move p2, v0

    goto :goto_2

    :cond_3
    if-ne v3, v4, :cond_5

    mul-int/2addr v0, p2

    .line 59
    div-int/2addr v0, v1

    if-ne v2, v5, :cond_4

    if-le v0, p1, :cond_4

    goto :goto_2

    :cond_4
    move p1, v0

    goto :goto_2

    :cond_5
    if-ne v3, v5, :cond_6

    if-le v1, p2, :cond_6

    mul-int v3, p2, v0

    .line 71
    div-int/2addr v3, v1

    goto :goto_0

    :cond_6
    move v3, v0

    move p2, v1

    :goto_0
    if-ne v2, v5, :cond_7

    if-le v3, p1, :cond_7

    mul-int/2addr v1, p1

    .line 76
    div-int v3, v1, v0

    goto :goto_1

    :cond_7
    move p1, v3

    goto :goto_2

    :cond_8
    move p1, v2

    :goto_1
    move p2, v3

    .line 82
    :cond_9
    :goto_2
    invoke-virtual {p0, p1, p2}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->setMeasuredDimension(II)V

    return-void
.end method
