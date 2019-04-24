.class public Lorg/apmem/tools/layouts/FlowLayout;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;
    }
.end annotation


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apmem/tools/layouts/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lorg/apmem/tools/layouts/LayoutConfiguration;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    new-instance v0, Lorg/apmem/tools/layouts/LayoutConfiguration;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/apmem/tools/layouts/LayoutConfiguration;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    new-instance v0, Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-direct {v0, p1, p2}, Lorg/apmem/tools/layouts/LayoutConfiguration;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    new-instance p3, Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-direct {p3, p1, p2}, Lorg/apmem/tools/layouts/LayoutConfiguration;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object p3, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    return-void
.end method

.method private a(I)I
    .locals 4

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v0

    const/high16 v1, 0x800000

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    and-int v0, p1, v1

    if-nez v0, :cond_0

    and-int/lit8 v0, p1, 0x7

    shr-int/2addr v0, v3

    shl-int/lit8 v0, v0, 0x4

    or-int/2addr v0, v3

    and-int/lit8 p1, p1, 0x70

    shr-int/lit8 p1, p1, 0x4

    shl-int/2addr p1, v3

    or-int/2addr p1, v0

    :cond_0
    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->e()I

    move-result v0

    if-ne v0, v2, :cond_3

    and-int v0, p1, v1

    if-eqz v0, :cond_3

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x5

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    const/4 v0, 0x5

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    or-int/2addr v0, v3

    and-int/lit8 p1, p1, 0x5

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    or-int p1, v0, v2

    :cond_3
    return p1
.end method

.method private a(III)I
    .locals 1

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    if-eq p1, v0, :cond_2

    :cond_0
    move p2, p3

    return p2

    :cond_1
    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    return p2
.end method

.method private a(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)I
    .locals 2

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->d()I

    move-result v0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->i()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-direct {p0, p1}, Lorg/apmem/tools/layouts/FlowLayout;->a(I)I

    move-result p1

    invoke-direct {p0, v0}, Lorg/apmem/tools/layouts/FlowLayout;->a(I)I

    move-result v0

    and-int/lit8 v1, p1, 0x7

    if-nez v1, :cond_1

    and-int/lit8 v1, v0, 0x7

    or-int/2addr p1, v1

    :cond_1
    and-int/lit8 v1, p1, 0x70

    if-nez v1, :cond_2

    and-int/lit8 v0, v0, 0x70

    or-int/2addr p1, v0

    :cond_2
    and-int/lit8 v0, p1, 0x7

    if-nez v0, :cond_3

    or-int/lit8 p1, p1, 0x3

    :cond_3
    and-int/lit8 v0, p1, 0x70

    if-nez v0, :cond_4

    or-int/lit8 p1, p1, 0x30

    :cond_4
    return p1
.end method

.method private a(Landroid/graphics/Canvas;Landroid/view/View;)V
    .locals 13

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, -0x100

    invoke-direct {p0, v0}, Lorg/apmem/tools/layouts/FlowLayout;->b(I)Landroid/graphics/Paint;

    move-result-object v0

    const/high16 v1, -0x10000

    invoke-direct {p0, v1}, Lorg/apmem/tools/layouts/FlowLayout;->b(I)Landroid/graphics/Paint;

    move-result-object v7

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->rightMargin:I

    const/high16 v9, 0x40000000    # 2.0f

    const/high16 v10, 0x40800000    # 4.0f

    if-lez v1, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v11, v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    add-float v12, v1, v2

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->rightMargin:I

    int-to-float v1, v1

    add-float v4, v11, v1

    move-object v1, p1

    move v2, v11

    move v3, v12

    move v5, v12

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->rightMargin:I

    int-to-float v1, v1

    add-float/2addr v1, v11

    sub-float v2, v1, v10

    sub-float v3, v12, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->rightMargin:I

    int-to-float v1, v1

    add-float v4, v11, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->rightMargin:I

    int-to-float v1, v1

    add-float/2addr v1, v11

    sub-float v2, v1, v10

    add-float v3, v12, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->rightMargin:I

    int-to-float v1, v1

    add-float v4, v11, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_1
    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    if-lez v1, :cond_2

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v11, v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    add-float v12, v1, v2

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    int-to-float v1, v1

    sub-float v4, v11, v1

    move-object v1, p1

    move v2, v11

    move v3, v12

    move v5, v12

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    int-to-float v1, v1

    sub-float v1, v11, v1

    add-float v2, v1, v10

    sub-float v3, v12, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    int-to-float v1, v1

    sub-float v4, v11, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    int-to-float v1, v1

    sub-float v1, v11, v1

    add-float v2, v1, v10

    add-float v3, v12, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    int-to-float v1, v1

    sub-float v4, v11, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->bottomMargin:I

    if-lez v1, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    add-float v11, v1, v2

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v12, v1

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->bottomMargin:I

    int-to-float v1, v1

    add-float v5, v12, v1

    move-object v1, p1

    move v2, v11

    move v3, v12

    move v4, v11

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v2, v11, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->bottomMargin:I

    int-to-float v1, v1

    add-float/2addr v1, v12

    sub-float v3, v1, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->bottomMargin:I

    int-to-float v1, v1

    add-float v5, v12, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-float v2, v11, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->bottomMargin:I

    int-to-float v1, v1

    add-float/2addr v1, v12

    sub-float v3, v1, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->bottomMargin:I

    int-to-float v1, v1

    add-float v5, v12, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_3
    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    if-lez v1, :cond_4

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    add-float v11, v1, v2

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v12, v1

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    int-to-float v1, v1

    sub-float v5, v12, v1

    move-object v1, p1

    move v2, v11

    move v3, v12

    move v4, v11

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v2, v11, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    int-to-float v1, v1

    sub-float v1, v12, v1

    add-float v3, v1, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    int-to-float v1, v1

    sub-float v5, v12, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-float v2, v11, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    int-to-float v1, v1

    sub-float v1, v12, v1

    add-float v3, v1, v10

    iget v1, v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    int-to-float v1, v1

    sub-float v5, v12, v1

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_4
    invoke-virtual {v8}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->k()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v0

    const/high16 v1, 0x40c00000    # 6.0f

    if-nez v0, :cond_5

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v5, v0

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v9

    add-float/2addr v0, p2

    sub-float v4, v0, v1

    add-float v6, v0, v1

    move-object v2, p1

    move v3, v5

    :goto_0
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void

    :cond_5
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    add-float/2addr v0, v2

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    int-to-float v6, p2

    sub-float v3, v0, v1

    add-float v5, v0, v1

    move-object v2, p1

    move v4, v6

    goto :goto_0

    :cond_6
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apmem/tools/layouts/a;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apmem/tools/layouts/a;

    invoke-virtual {v4, v3}, Lorg/apmem/tools/layouts/a;->a(I)V

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/a;->b()I

    move-result v5

    add-int/2addr v3, v5

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/a;->e()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v6, v5, :cond_0

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-virtual {v8, v7}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a(I)V

    invoke-virtual {v8}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->d()I

    move-result v9

    invoke-virtual {v8}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->g()I

    move-result v8

    add-int/2addr v9, v8

    add-int/2addr v7, v9

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Ljava/util/List;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apmem/tools/layouts/a;",
            ">;II)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v0, -0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apmem/tools/layouts/a;

    invoke-virtual {v1}, Lorg/apmem/tools/layouts/a;->b()I

    move-result v2

    invoke-virtual {v1}, Lorg/apmem/tools/layouts/a;->a()I

    move-result v1

    add-int/2addr v2, v1

    sub-int/2addr p3, v2

    const/4 v1, 0x0

    if-gez p3, :cond_1

    const/4 p3, 0x0

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apmem/tools/layouts/a;

    const/4 v5, 0x0

    invoke-direct {p0, v5}, Lorg/apmem/tools/layouts/FlowLayout;->a(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)I

    move-result v5

    mul-int/lit8 v6, p3, 0x1

    div-int/2addr v6, v0

    int-to-float v6, v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/a;->c()I

    move-result v7

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/a;->b()I

    move-result v8

    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    iput v3, v9, Landroid/graphics/Rect;->top:I

    iput v1, v9, Landroid/graphics/Rect;->left:I

    iput p2, v9, Landroid/graphics/Rect;->right:I

    add-int v10, v8, v6

    add-int/2addr v10, v3

    iput v10, v9, Landroid/graphics/Rect;->bottom:I

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v5, v7, v8, v9, v10}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    add-int/2addr v3, v6

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/a;->d()I

    move-result v5

    iget v6, v10, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v6

    invoke-virtual {v4, v5}, Lorg/apmem/tools/layouts/a;->b(I)V

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/a;->a()I

    move-result v5

    iget v6, v10, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    invoke-virtual {v4, v5}, Lorg/apmem/tools/layouts/a;->a(I)V

    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-virtual {v4, v5}, Lorg/apmem/tools/layouts/a;->d(I)V

    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    move-result v5

    invoke-virtual {v4, v5}, Lorg/apmem/tools/layouts/a;->c(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private a(Lorg/apmem/tools/layouts/a;)V
    .locals 9

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/a;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    iget-object v5, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v5}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    if-nez v5, :cond_0

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingLeft()I

    move-result v5

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/a;->d()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->c()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingTop()I

    move-result v7

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/a;->a()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->f()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v4, v5, v7}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a(II)V

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->d()I

    move-result v5

    invoke-static {v5, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->e()I

    move-result v4

    :goto_1
    invoke-static {v4, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Landroid/view/View;->measure(II)V

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingLeft()I

    move-result v5

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/a;->a()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->f()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingTop()I

    move-result v7

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/a;->d()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->c()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v4, v5, v7}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a(II)V

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->e()I

    move-result v5

    invoke-static {v5, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->d()I

    move-result v4

    goto :goto_1

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private b(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)F
    .locals 1

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->j()F

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {p1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->c()F

    move-result p1

    return p1
.end method

.method private b(I)Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p1, 0x40000000    # 2.0f

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-object v0
.end method

.method private b(Lorg/apmem/tools/layouts/a;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lorg/apmem/tools/layouts/a;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-direct {v0, v7}, Lorg/apmem/tools/layouts/FlowLayout;->b(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)F

    move-result v7

    add-float/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v2, -0x1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-virtual/range {p1 .. p1}, Lorg/apmem/tools/layouts/a;->c()I

    move-result v7

    invoke-virtual {v5}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->d()I

    move-result v8

    invoke-virtual {v5}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->g()I

    move-result v9

    add-int/2addr v8, v9

    invoke-virtual {v5}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->c()I

    move-result v5

    add-int/2addr v8, v5

    sub-int/2addr v7, v8

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v5, v2, :cond_3

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-direct {v0, v9}, Lorg/apmem/tools/layouts/FlowLayout;->b(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)F

    move-result v10

    invoke-direct {v0, v9}, Lorg/apmem/tools/layouts/FlowLayout;->a(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)I

    move-result v11

    cmpl-float v12, v6, v3

    if-nez v12, :cond_2

    div-int v10, v7, v2

    goto :goto_2

    :cond_2
    int-to-float v12, v7

    mul-float v12, v12, v10

    div-float/2addr v12, v6

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v10

    :goto_2
    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->d()I

    move-result v12

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->g()I

    move-result v13

    add-int/2addr v12, v13

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->e()I

    move-result v13

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->h()I

    move-result v14

    add-int/2addr v13, v14

    new-instance v14, Landroid/graphics/Rect;

    invoke-direct {v14}, Landroid/graphics/Rect;-><init>()V

    iput v4, v14, Landroid/graphics/Rect;->top:I

    iput v8, v14, Landroid/graphics/Rect;->left:I

    add-int v15, v12, v10

    add-int/2addr v15, v8

    iput v15, v14, Landroid/graphics/Rect;->right:I

    invoke-virtual/range {p1 .. p1}, Lorg/apmem/tools/layouts/a;->b()I

    move-result v15

    iput v15, v14, Landroid/graphics/Rect;->bottom:I

    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v11, v12, v13, v14, v15}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    add-int/2addr v8, v10

    iget v10, v15, Landroid/graphics/Rect;->left:I

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->c()I

    move-result v11

    add-int/2addr v10, v11

    invoke-virtual {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a(I)V

    iget v10, v15, Landroid/graphics/Rect;->top:I

    invoke-virtual {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->d(I)V

    invoke-virtual {v15}, Landroid/graphics/Rect;->width()I

    move-result v10

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->g()I

    move-result v11

    sub-int/2addr v10, v11

    invoke-virtual {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->b(I)V

    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    move-result v10

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->h()I

    move-result v11

    sub-int/2addr v10, v11

    invoke-virtual {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->c(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private c()Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    const-class v1, Landroid/view/ViewGroup;

    const-string v2, "debugDraw"

    const/4 v3, 0x0

    move-object v4, v3

    check-cast v4, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v3, v2, v0

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    return v0
.end method


# virtual methods
.method protected a()Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;
    .locals 2

    new-instance v0, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public a(Landroid/util/AttributeSet;)Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;
    .locals 2

    new-instance v0, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected a(Landroid/view/ViewGroup$LayoutParams;)Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;
    .locals 1

    new-instance v0, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-direct {v0, p1}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lorg/apmem/tools/layouts/FlowLayout;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    return p1
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p3

    invoke-direct {p0, p1, p2}, Lorg/apmem/tools/layouts/FlowLayout;->a(Landroid/graphics/Canvas;Landroid/view/View;)V

    return p3
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->a()Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Lorg/apmem/tools/layouts/FlowLayout;->a(Landroid/util/AttributeSet;)Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Lorg/apmem/tools/layouts/FlowLayout;->a(Landroid/view/ViewGroup$LayoutParams;)Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public getGravity()I
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->d()I

    move-result v0

    return v0
.end method

.method public getLayoutDirection()I
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->e()I

    move-result v0

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v0

    return v0
.end method

.method public getWeightDefault()F
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0}, Lorg/apmem/tools/layouts/LayoutConfiguration;->c()F

    move-result v0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getChildCount()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/apmem/tools/layouts/FlowLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-static {p4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)I

    move-result p5

    iget v0, p4, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    add-int/2addr p5, v0

    invoke-static {p4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->b(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)I

    move-result v0

    iget v1, p4, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v1

    invoke-static {p4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)I

    move-result v1

    iget v2, p4, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {p4}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->b(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;)I

    move-result v2

    iget p4, p4, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, p4

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    add-int/2addr v2, p4

    invoke-virtual {p3, p5, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 13

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    iget-object v4, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v4}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v4

    if-nez v4, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    iget-object v5, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v5}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v5

    if-nez v5, :cond_1

    move v0, v1

    :cond_1
    iget-object v1, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    iget-object v1, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v1

    iget-object v1, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    new-instance v1, Lorg/apmem/tools/layouts/a;

    invoke-direct {v1, v4}, Lorg/apmem/tools/layouts/a;-><init>(I)V

    iget-object v5, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getChildCount()I

    move-result v5

    const/4 v6, 0x0

    move-object v7, v1

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v5, :cond_a

    invoke-virtual {p0, v1}, Lorg/apmem/tools/layouts/FlowLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_3

    goto/16 :goto_8

    :cond_3
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingLeft()I

    move-result v10

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingRight()I

    move-result v11

    add-int/2addr v10, v11

    iget v11, v9, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->width:I

    invoke-static {p1, v10, v11}, Lorg/apmem/tools/layouts/FlowLayout;->getChildMeasureSpec(III)I

    move-result v10

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingTop()I

    move-result v11

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingBottom()I

    move-result v12

    add-int/2addr v11, v12

    iget v12, v9, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->height:I

    invoke-static {p2, v11, v12}, Lorg/apmem/tools/layouts/FlowLayout;->getChildMeasureSpec(III)I

    move-result v11

    invoke-virtual {v8, v10, v11}, Landroid/view/View;->measure(II)V

    iget-object v10, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v10}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v10

    invoke-static {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->a(Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;I)I

    iget-object v10, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v10}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v10

    if-nez v10, :cond_4

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    invoke-virtual {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->b(I)V

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    :goto_3
    invoke-virtual {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->c(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    invoke-virtual {v9, v10}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->b(I)V

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    goto :goto_3

    :goto_4
    invoke-virtual {v9}, Lorg/apmem/tools/layouts/FlowLayout$LayoutParams;->k()Z

    move-result v9

    const/4 v10, 0x1

    if-nez v9, :cond_6

    if-eqz v2, :cond_5

    invoke-virtual {v7, v8}, Lorg/apmem/tools/layouts/a;->b(Landroid/view/View;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    :goto_5
    const/4 v9, 0x1

    :goto_6
    if-eqz v9, :cond_8

    new-instance v7, Lorg/apmem/tools/layouts/a;

    invoke-direct {v7, v4}, Lorg/apmem/tools/layouts/a;-><init>(I)V

    iget-object v9, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v9

    if-ne v9, v10, :cond_7

    iget-object v9, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/LayoutConfiguration;->e()I

    move-result v9

    if-ne v9, v10, :cond_7

    iget-object v9, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-interface {v9, v6, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_7

    :cond_7
    iget-object v9, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_7
    iget-object v9, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v9

    if-nez v9, :cond_9

    iget-object v9, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/LayoutConfiguration;->e()I

    move-result v9

    if-ne v9, v10, :cond_9

    invoke-virtual {v7, v6, v8}, Lorg/apmem/tools/layouts/a;->a(ILandroid/view/View;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v7, v8}, Lorg/apmem/tools/layouts/a;->a(Landroid/view/View;)V

    :goto_8
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2

    :cond_a
    iget-object v1, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-direct {p0, v1}, Lorg/apmem/tools/layouts/FlowLayout;->a(Ljava/util/List;)V

    iget-object v1, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_9
    if-ge v5, v1, :cond_b

    iget-object v9, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/apmem/tools/layouts/a;

    invoke-virtual {v9}, Lorg/apmem/tools/layouts/a;->c()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_b
    invoke-virtual {v7}, Lorg/apmem/tools/layouts/a;->a()I

    move-result v5

    invoke-virtual {v7}, Lorg/apmem/tools/layouts/a;->b()I

    move-result v7

    add-int/2addr v5, v7

    invoke-direct {p0, v2, v4, v8}, Lorg/apmem/tools/layouts/FlowLayout;->a(III)I

    move-result v2

    invoke-direct {p0, v3, v0, v5}, Lorg/apmem/tools/layouts/FlowLayout;->a(III)I

    move-result v0

    iget-object v3, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-direct {p0, v3, v2, v0}, Lorg/apmem/tools/layouts/FlowLayout;->a(Ljava/util/List;II)V

    :goto_a
    if-ge v6, v1, :cond_c

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->a:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apmem/tools/layouts/a;

    invoke-direct {p0, v0}, Lorg/apmem/tools/layouts/FlowLayout;->b(Lorg/apmem/tools/layouts/a;)V

    invoke-direct {p0, v0}, Lorg/apmem/tools/layouts/FlowLayout;->a(Lorg/apmem/tools/layouts/a;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_c
    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingBottom()I

    move-result v1

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->getPaddingTop()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v2}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a()I

    move-result v2

    if-nez v2, :cond_d

    add-int/2addr v0, v8

    add-int/2addr v1, v5

    goto :goto_b

    :cond_d
    add-int/2addr v0, v5

    add-int/2addr v1, v8

    :goto_b
    invoke-static {v0, p1}, Lorg/apmem/tools/layouts/FlowLayout;->resolveSize(II)I

    move-result p1

    invoke-static {v1, p2}, Lorg/apmem/tools/layouts/FlowLayout;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lorg/apmem/tools/layouts/FlowLayout;->setMeasuredDimension(II)V

    return-void
.end method

.method public setDebugDraw(Z)V
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0, p1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a(Z)V

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->invalidate()V

    return-void
.end method

.method public setGravity(I)V
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0, p1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->b(I)V

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->requestLayout()V

    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0, p1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->c(I)V

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->requestLayout()V

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0, p1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a(I)V

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->requestLayout()V

    return-void
.end method

.method public setWeightDefault(F)V
    .locals 1

    iget-object v0, p0, Lorg/apmem/tools/layouts/FlowLayout;->b:Lorg/apmem/tools/layouts/LayoutConfiguration;

    invoke-virtual {v0, p1}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a(F)V

    invoke-virtual {p0}, Lorg/apmem/tools/layouts/FlowLayout;->requestLayout()V

    return-void
.end method
