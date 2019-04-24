.class Lo/faa$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/faa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field final synthetic b:Lo/faa;

.field c:Landroid/graphics/Canvas;

.field d:Landroid/graphics/Bitmap;

.field e:I

.field private f:Z


# direct methods
.method public constructor <init>(Lo/faa;ILandroid/view/View;)V
    .locals 1

    .line 164
    iput-object p1, p0, Lo/faa$d;->b:Lo/faa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/faa$d;->f:Z

    .line 165
    iput p2, p0, Lo/faa$d;->e:I

    .line 166
    iput-object p3, p0, Lo/faa$d;->a:Landroid/view/View;

    .line 167
    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;F)V
    .locals 4

    .line 190
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 191
    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 192
    iget-object v0, p0, Lo/faa$d;->d:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 193
    return-void
.end method

.method public b()Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Lo/faa$d;->f:Z

    return v0
.end method

.method public c()V
    .locals 4

    .line 174
    iget-object v0, p0, Lo/faa$d;->b:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->getMeasuredWidth()I

    move-result v2

    .line 175
    iget-object v0, p0, Lo/faa$d;->b:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->getMeasuredHeight()I

    move-result v3

    .line 176
    if-eqz v2, :cond_0

    if-nez v3, :cond_1

    .line 177
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "construct ItemInfo find view\'s width or height is zero,error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 179
    :cond_1
    iget-object v0, p0, Lo/faa$d;->b:Lo/faa;

    iget-object v0, v0, Lo/faa;->e:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/faa$d;->d:Landroid/graphics/Bitmap;

    .line 180
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lo/faa$d;->d:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lo/faa$d;->c:Landroid/graphics/Canvas;

    .line 181
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/faa$d;->f:Z

    .line 182
    return-void
.end method

.method public d()V
    .locals 2

    .line 185
    iget-object v0, p0, Lo/faa$d;->d:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 186
    iget-object v0, p0, Lo/faa$d;->a:Landroid/view/View;

    iget-object v1, p0, Lo/faa$d;->c:Landroid/graphics/Canvas;

    invoke-virtual {v0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 187
    return-void
.end method

.method public e()V
    .locals 1

    .line 196
    iget-object v0, p0, Lo/faa$d;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/faa$d;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 199
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa$d;->c:Landroid/graphics/Canvas;

    .line 200
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa$d;->d:Landroid/graphics/Bitmap;

    .line 202
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/faa$d;->f:Z

    .line 203
    return-void
.end method
