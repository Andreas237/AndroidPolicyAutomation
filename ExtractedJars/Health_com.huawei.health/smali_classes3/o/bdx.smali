.class public Lo/bdx;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I

.field private f:Z

.field private g:I

.field private h:Landroid/graphics/Bitmap;

.field private i:I

.field private k:Landroid/view/View;

.field private l:Landroid/renderscript/ScriptIntrinsicBlur;

.field private m:Landroid/renderscript/Allocation;

.field private n:Landroid/graphics/Canvas;

.field private o:Landroid/graphics/Bitmap;

.field private p:Landroid/renderscript/RenderScript;

.field private r:Landroid/renderscript/Allocation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bdx;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    invoke-static {}, Lo/brg;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    return-void

    .line 41
    :cond_0
    iput-object p1, p0, Lo/bdx;->b:Landroid/content/Context;

    .line 43
    invoke-direct {p0, p1}, Lo/bdx;->d(Landroid/content/Context;)V

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_background_90_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 46
    const/high16 v0, 0x40800000    # 4.0f

    invoke-direct {p0, v0}, Lo/bdx;->setBlurRadius(F)V

    .line 47
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lo/bdx;->setDownSampleFactor(I)V

    .line 48
    invoke-direct {p0, v2}, Lo/bdx;->setOverlayColor(I)V

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/bdx;->d:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/bdx;->e:I

    .line 51
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 124
    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object v0

    iput-object v0, p0, Lo/bdx;->p:Landroid/renderscript/RenderScript;

    .line 125
    iget-object v0, p0, Lo/bdx;->p:Landroid/renderscript/RenderScript;

    iget-object v1, p0, Lo/bdx;->p:Landroid/renderscript/RenderScript;

    invoke-static {v1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object v0

    iput-object v0, p0, Lo/bdx;->l:Landroid/renderscript/ScriptIntrinsicBlur;

    .line 126
    return-void
.end method

.method private setBlurRadius(F)V
    .locals 1

    .line 104
    iget-object v0, p0, Lo/bdx;->l:Landroid/renderscript/ScriptIntrinsicBlur;

    invoke-virtual {v0, p1}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 105
    return-void
.end method

.method private setDownSampleFactor(I)V
    .locals 2

    .line 108
    if-gtz p1, :cond_0

    .line 109
    const-string v0, "BlurView"

    const-string v1, "Downsample factor must be greater than 0."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    return-void

    .line 113
    :cond_0
    iget v0, p0, Lo/bdx;->c:I

    if-eq v0, p1, :cond_1

    .line 114
    iput p1, p0, Lo/bdx;->c:I

    .line 115
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdx;->f:Z

    .line 117
    :cond_1
    return-void
.end method

.method private setOverlayColor(I)V
    .locals 0

    .line 120
    iput p1, p0, Lo/bdx;->a:I

    .line 121
    return-void
.end method


# virtual methods
.method protected c()V
    .locals 2

    .line 173
    iget-object v0, p0, Lo/bdx;->m:Landroid/renderscript/Allocation;

    iget-object v1, p0, Lo/bdx;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/renderscript/Allocation;->copyFrom(Landroid/graphics/Bitmap;)V

    .line 174
    iget-object v0, p0, Lo/bdx;->l:Landroid/renderscript/ScriptIntrinsicBlur;

    iget-object v1, p0, Lo/bdx;->m:Landroid/renderscript/Allocation;

    invoke-virtual {v0, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 175
    iget-object v0, p0, Lo/bdx;->l:Landroid/renderscript/ScriptIntrinsicBlur;

    iget-object v1, p0, Lo/bdx;->r:Landroid/renderscript/Allocation;

    invoke-virtual {v0, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 176
    iget-object v0, p0, Lo/bdx;->r:Landroid/renderscript/Allocation;

    iget-object v1, p0, Lo/bdx;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 177
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 180
    invoke-static {}, Lo/brg;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 181
    return-void

    .line 183
    :cond_0
    invoke-virtual {p0, p1}, Lo/bdx;->setOffsetY(I)V

    .line 184
    invoke-virtual {p0}, Lo/bdx;->invalidate()V

    .line 185
    return-void
.end method

.method protected d()Z
    .locals 8

    .line 129
    iget-object v0, p0, Lo/bdx;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 130
    iget-object v0, p0, Lo/bdx;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v5

    .line 132
    iget-object v0, p0, Lo/bdx;->n:Landroid/graphics/Canvas;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/bdx;->f:Z

    if-nez v0, :cond_0

    iget v0, p0, Lo/bdx;->g:I

    if-ne v0, v4, :cond_0

    iget v0, p0, Lo/bdx;->i:I

    if-eq v0, v5, :cond_4

    .line 134
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdx;->f:Z

    .line 136
    iput v4, p0, Lo/bdx;->g:I

    .line 137
    iput v5, p0, Lo/bdx;->i:I

    .line 139
    iget v0, p0, Lo/bdx;->c:I

    div-int v6, v4, v0

    .line 140
    iget v0, p0, Lo/bdx;->c:I

    div-int v7, v5, v0

    .line 143
    iget v0, p0, Lo/bdx;->c:I

    rem-int v0, v6, v0

    sub-int v0, v6, v0

    iget v1, p0, Lo/bdx;->c:I

    add-int v6, v0, v1

    .line 144
    iget v0, p0, Lo/bdx;->c:I

    rem-int v0, v7, v0

    sub-int v0, v7, v0

    iget v1, p0, Lo/bdx;->c:I

    add-int v7, v0, v1

    .line 146
    iget-object v0, p0, Lo/bdx;->o:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bdx;->o:Landroid/graphics/Bitmap;

    .line 147
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-ne v0, v6, :cond_1

    iget-object v0, p0, Lo/bdx;->o:Landroid/graphics/Bitmap;

    .line 148
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-eq v0, v7, :cond_3

    .line 149
    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/bdx;->h:Landroid/graphics/Bitmap;

    .line 151
    iget-object v0, p0, Lo/bdx;->h:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    .line 152
    const/4 v0, 0x0

    return v0

    .line 155
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/bdx;->o:Landroid/graphics/Bitmap;

    .line 157
    iget-object v0, p0, Lo/bdx;->o:Landroid/graphics/Bitmap;

    if-nez v0, :cond_3

    .line 158
    const/4 v0, 0x0

    return v0

    .line 162
    :cond_3
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lo/bdx;->h:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lo/bdx;->n:Landroid/graphics/Canvas;

    .line 163
    iget-object v0, p0, Lo/bdx;->n:Landroid/graphics/Canvas;

    iget v1, p0, Lo/bdx;->c:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    div-float v1, v2, v1

    iget v2, p0, Lo/bdx;->c:I

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    div-float v2, v3, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 165
    iget-object v0, p0, Lo/bdx;->p:Landroid/renderscript/RenderScript;

    iget-object v1, p0, Lo/bdx;->h:Landroid/graphics/Bitmap;

    sget-object v2, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    move-result-object v0

    iput-object v0, p0, Lo/bdx;->m:Landroid/renderscript/Allocation;

    .line 167
    iget-object v0, p0, Lo/bdx;->p:Landroid/renderscript/RenderScript;

    iget-object v1, p0, Lo/bdx;->m:Landroid/renderscript/Allocation;

    invoke-virtual {v1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    move-result-object v0

    iput-object v0, p0, Lo/bdx;->r:Landroid/renderscript/Allocation;

    .line 169
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 189
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 190
    iget-object v0, p0, Lo/bdx;->p:Landroid/renderscript/RenderScript;

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lo/bdx;->p:Landroid/renderscript/RenderScript;

    invoke-virtual {v0}, Landroid/renderscript/RenderScript;->destroy()V

    .line 193
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 69
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 70
    invoke-static {}, Lo/brg;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    return-void

    .line 73
    :cond_0
    iget-object v0, p0, Lo/bdx;->k:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {p0}, Lo/bdx;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    iget-object v0, p0, Lo/bdx;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bdx;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_1

    .line 78
    iget-object v0, p0, Lo/bdx;->h:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/bdx;->k:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    goto :goto_0

    .line 82
    :cond_1
    iget-object v0, p0, Lo/bdx;->h:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/bdx;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 85
    :goto_0
    iget-object v0, p0, Lo/bdx;->k:Landroid/view/View;

    iget-object v1, p0, Lo/bdx;->n:Landroid/graphics/Canvas;

    invoke-virtual {v0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 87
    iget-object v0, p0, Lo/bdx;->n:Landroid/graphics/Canvas;

    iget v1, p0, Lo/bdx;->a:I

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 89
    invoke-virtual {p0}, Lo/bdx;->c()V

    .line 92
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 93
    iget-object v0, p0, Lo/bdx;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    invoke-virtual {p0}, Lo/bdx;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/bdx;->d:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/bdx;->k:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    invoke-virtual {p0}, Lo/bdx;->getY()F

    move-result v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/bdx;->e:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 94
    iget v0, p0, Lo/bdx;->c:I

    int-to-float v0, v0

    iget v1, p0, Lo/bdx;->c:I

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 95
    iget-object v0, p0, Lo/bdx;->o:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 96
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 101
    :cond_2
    return-void
.end method

.method public setBlurredView(Landroid/view/View;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/bdx;->k:Landroid/view/View;

    .line 55
    return-void
.end method

.method public setOffsetX(I)V
    .locals 0

    .line 58
    iput p1, p0, Lo/bdx;->d:I

    .line 59
    return-void
.end method

.method public setOffsetY(I)V
    .locals 1

    .line 64
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lo/bdx;->e:I

    .line 65
    return-void
.end method
