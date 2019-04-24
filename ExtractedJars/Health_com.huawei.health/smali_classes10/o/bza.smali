.class public Lo/bza;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 13
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bza;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    return-void
.end method


# virtual methods
.method public getRotationY()F
    .locals 1

    .line 39
    iget v0, p0, Lo/bza;->a:F

    return v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .line 22
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 23
    iget v0, p0, Lo/bza;->a:F

    invoke-virtual {p0, v0}, Lo/bza;->setRotationY(F)V

    .line 24
    return-void
.end method

.method public setRotationY(F)V
    .locals 3

    .line 29
    move v2, p1

    .line 30
    invoke-virtual {p0}, Lo/bza;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 31
    const/high16 v0, 0x43340000    # 180.0f

    add-float/2addr v2, v0

    .line 33
    :cond_0
    invoke-super {p0, v2}, Landroid/widget/ImageView;->setRotationY(F)V

    .line 34
    iput p1, p0, Lo/bza;->a:F

    .line 35
    return-void
.end method
