.class public Lcom/huawei/ui/openservice/ui/GridImage;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private pressed:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    return-void
.end method


# virtual methods
.method protected dispatchSetPressed(Z)V
    .locals 0

    .line 35
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchSetPressed(Z)V

    .line 36
    iput-boolean p1, p0, Lcom/huawei/ui/openservice/ui/GridImage;->pressed:Z

    .line 37
    invoke-virtual {p0}, Lcom/huawei/ui/openservice/ui/GridImage;->invalidate()V

    .line 38
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 27
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 28
    iget-boolean v0, p0, Lcom/huawei/ui/openservice/ui/GridImage;->pressed:Z

    if-eqz v0, :cond_0

    .line 29
    const-string v0, "#14C0C0C0"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 31
    :cond_0
    return-void
.end method
