.class public Lo/ebw;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private b:Lo/ebs;

.field private c:I

.field private e:Lo/ebt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 20
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    const/16 v0, 0x14

    iput v0, p0, Lo/ebw;->c:I

    .line 22
    new-instance v0, Lo/ebs;

    invoke-direct {v0, p1}, Lo/ebs;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ebw;->b:Lo/ebs;

    .line 23
    new-instance v0, Lo/ebt;

    invoke-direct {v0, p1}, Lo/ebt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ebw;->e:Lo/ebt;

    .line 25
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 29
    iget-object v0, p0, Lo/ebw;->b:Lo/ebs;

    invoke-virtual {p0, v0, v3}, Lo/ebw;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    iget-object v0, p0, Lo/ebw;->e:Lo/ebt;

    invoke-virtual {p0, v0, v3}, Lo/ebw;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    iget v0, p0, Lo/ebw;->c:I

    int-to-float v0, v0

    .line 34
    invoke-virtual {p0}, Lo/ebw;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 33
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/ebw;->c:I

    .line 36
    iget-object v0, p0, Lo/ebw;->b:Lo/ebs;

    iget v1, p0, Lo/ebw;->c:I

    invoke-virtual {v0, v1}, Lo/ebs;->setHorizontalPadding(I)V

    .line 37
    iget-object v0, p0, Lo/ebw;->e:Lo/ebt;

    iget v1, p0, Lo/ebw;->c:I

    invoke-virtual {v0, v1}, Lo/ebt;->setHorizontalPadding(I)V

    .line 38
    return-void
.end method


# virtual methods
.method public c()Landroid/graphics/Bitmap;
    .locals 1

    .line 63
    iget-object v0, p0, Lo/ebw;->b:Lo/ebs;

    invoke-virtual {v0}, Lo/ebs;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public setHorizontalPadding(I)V
    .locals 0

    .line 54
    iput p1, p0, Lo/ebw;->c:I

    .line 55
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ebw;->b:Lo/ebs;

    invoke-virtual {v0, p1}, Lo/ebs;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 46
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ebw;->b:Lo/ebs;

    invoke-virtual {v0, p1}, Lo/ebs;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    return-void
.end method
