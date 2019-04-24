.class Lcom/huawei/openalliance/ad/views/b$a;
.super Landroid/graphics/drawable/Drawable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:I


# instance fields
.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/Paint;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "#007DFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/openalliance/ad/views/b$a;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->b:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->b:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->b:Landroid/graphics/Paint;

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->c:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->c:Landroid/graphics/Paint;

    sget v1, Lcom/huawei/openalliance/ad/views/b$a;->a:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->c:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->c:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->d:I

    return-void
.end method

.method public a(I)V
    .locals 1

    const/16 v0, 0x64

    if-le p1, v0, :cond_0

    const/16 p1, 0x64

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->d:I

    if-lt p1, v0, :cond_1

    iput p1, p0, Lcom/huawei/openalliance/ad/views/b$a;->d:I

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/b$a;->invalidateSelf()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/b$a;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/b$a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/b$a;->d:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v6, v0, v1

    move-object v0, p1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/b$a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/b$a;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/b$a;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    mul-float/2addr v3, v6

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/b$a;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/openalliance/ad/views/b$a;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setAlpha(I)V
    .locals 0

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
