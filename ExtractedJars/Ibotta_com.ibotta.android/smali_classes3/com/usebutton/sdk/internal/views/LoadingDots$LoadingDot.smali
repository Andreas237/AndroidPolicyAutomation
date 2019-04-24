.class Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;
.super Landroid/view/View;
.source "LoadingDots.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/LoadingDots;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoadingDot"
.end annotation


# instance fields
.field private final mPainter:Landroid/graphics/Paint;

.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/LoadingDots;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/views/LoadingDots;Landroid/content/Context;)V
    .locals 1

    .line 122
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->this$0:Lcom/usebutton/sdk/internal/views/LoadingDots;

    .line 123
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 120
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->mPainter:Landroid/graphics/Paint;

    const/4 p1, 0x2

    const/4 p2, 0x0

    .line 124
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->setLayerType(ILandroid/graphics/Paint;)V

    .line 125
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->mPainter:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lcom/usebutton/sdk/R$color;->btn_placeholder:I

    invoke-static {p2, v0}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->mPainter:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method

.method private getAvailableHeight()I
    .locals 2

    .line 140
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private getAvailableWidth()I
    .locals 2

    .line 136
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 131
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 132
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getAvailableWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getAvailableHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->getAvailableHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;->mPainter:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method
