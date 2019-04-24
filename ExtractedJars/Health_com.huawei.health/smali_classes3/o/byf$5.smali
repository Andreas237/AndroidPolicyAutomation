.class Lo/byf$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byf;->d(Landroid/graphics/drawable/Drawable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/byf;

.field final synthetic c:Landroid/graphics/drawable/Drawable;


# direct methods
.method constructor <init>(Lo/byf;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lo/byf$5;->a:Lo/byf;

    iput-object p2, p0, Lo/byf$5;->c:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 12
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 184
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 185
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v1, p0, Lo/byf$5;->c:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Lo/byf;->e(Lo/byf;Landroid/graphics/drawable/Drawable;)F

    move-result v4

    .line 188
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v1, v1, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v5, v0, v1

    .line 190
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v6

    .line 191
    cmpl-float v0, v4, v5

    if-ltz v0, :cond_0

    .line 195
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/byf$5;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 196
    return-void

    .line 197
    :cond_0
    cmpg-float v0, v4, v5

    if-gez v0, :cond_1

    .line 199
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/RelativeLayout$LayoutParams;

    .line 200
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, v7, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 201
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 202
    iget v6, v7, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 205
    :cond_1
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v1, p0, Lo/byf$5;->c:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Lo/byf;->b(Lo/byf;Landroid/graphics/drawable/Drawable;)I

    move-result v7

    .line 208
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->c:Landroid/view/View;

    .line 209
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout$LayoutParams;

    .line 210
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    invoke-virtual {v0}, Lo/byf;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr v0, v6

    iput v0, v8, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 211
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->c:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 214
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->d:Landroid/view/View;

    .line 215
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/RelativeLayout$LayoutParams;

    .line 216
    div-int/lit8 v0, v6, 0x2

    iput v0, v9, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 218
    .line 219
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 220
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 221
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    .line 218
    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v10

    .line 225
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    invoke-static {v0}, Lo/byf;->a(Lo/byf;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 226
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v7, v1, v2

    const/4 v2, 0x1

    aput v10, v1, v2

    invoke-direct {v11, v0, v1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    goto :goto_0

    .line 229
    :cond_2
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v7, v1, v2

    const/4 v2, 0x1

    aput v10, v1, v2

    invoke-direct {v11, v0, v1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 232
    :goto_0
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->d:Landroid/view/View;

    invoke-virtual {v0, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 234
    iget-object v0, p0, Lo/byf$5;->a:Lo/byf;

    iget-object v0, v0, Lo/byf;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/byf$5;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 236
    return-void
.end method
