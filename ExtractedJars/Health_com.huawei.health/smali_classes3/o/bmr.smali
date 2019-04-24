.class public Lo/bmr;
.super Landroid/widget/TextView;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private d:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 46
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 32
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/bmr;->d:F

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/bmr;->d:F

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/bmr;->d:F

    .line 42
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 67
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 69
    iget v0, p0, Lo/bmr;->d:F

    invoke-virtual {p0, v0}, Lo/bmr;->setAlpha(F)V

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 73
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/bmr;->setAlpha(F)V

    .line 75
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 52
    invoke-super {p0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 53
    if-nez p1, :cond_0

    .line 55
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {p0, v0}, Lo/bmr;->setAlpha(F)V

    goto :goto_0

    .line 59
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/bmr;->setAlpha(F)V

    .line 61
    :goto_0
    return-void
.end method

.method public setOnTouchListenerWithAlpha(F)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 85
    iput p1, p0, Lo/bmr;->d:F

    .line 86
    invoke-virtual {p0, p0}, Lo/bmr;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 87
    return-void
.end method
