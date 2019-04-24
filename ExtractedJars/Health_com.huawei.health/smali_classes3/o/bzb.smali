.class public Lo/bzb;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# instance fields
.field private d:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 19
    iput p1, p0, Lo/bzb;->d:F

    .line 20
    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 7

    .line 24
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 25
    invoke-virtual {p1, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    new-instance v6, Landroid/graphics/Rect;

    iget v0, v3, Landroid/graphics/Rect;->right:I

    iget v1, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x0

    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    iget v2, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x0

    invoke-direct {v6, v4, v5, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 30
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 31
    iget v0, p0, Lo/bzb;->d:F

    invoke-virtual {p2, v6, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    .line 33
    :cond_0
    return-void
.end method
