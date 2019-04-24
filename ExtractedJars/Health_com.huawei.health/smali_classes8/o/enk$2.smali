.class Lo/enk$2;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enk;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/enk;


# direct methods
.method constructor <init>(Lo/enk;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lo/enk$2;->e:Lo/enk;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 305
    move-object v0, p1

    iget-object v1, p0, Lo/enk$2;->e:Lo/enk;

    iget v1, v1, Lo/enk;->p:I

    mul-int/lit8 v1, v1, 0x0

    int-to-float v1, v1

    iget-object v2, p0, Lo/enk$2;->e:Lo/enk;

    invoke-static {v2}, Lo/enk;->a(Lo/enk;)[I

    move-result-object v2

    const/4 v3, 0x0

    aget v2, v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lo/enk$2;->e:Lo/enk;

    iget v3, v3, Lo/enk;->p:I

    mul-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    iget-object v4, p0, Lo/enk$2;->e:Lo/enk;

    invoke-static {v4}, Lo/enk;->a(Lo/enk;)[I

    move-result-object v4

    const/4 v5, 0x0

    aget v4, v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lo/enk$2;->e:Lo/enk;

    iget-object v5, v5, Lo/enk;->l:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 306
    move-object v0, p1

    iget-object v1, p0, Lo/enk$2;->e:Lo/enk;

    iget v1, v1, Lo/enk;->p:I

    mul-int/lit8 v1, v1, 0x0

    int-to-float v1, v1

    iget-object v2, p0, Lo/enk$2;->e:Lo/enk;

    invoke-static {v2}, Lo/enk;->a(Lo/enk;)[I

    move-result-object v2

    const/4 v3, 0x1

    aget v2, v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lo/enk$2;->e:Lo/enk;

    iget v3, v3, Lo/enk;->p:I

    mul-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    iget-object v4, p0, Lo/enk$2;->e:Lo/enk;

    invoke-static {v4}, Lo/enk;->a(Lo/enk;)[I

    move-result-object v4

    const/4 v5, 0x1

    aget v4, v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lo/enk$2;->e:Lo/enk;

    iget-object v5, v5, Lo/enk;->l:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 307
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .line 321
    const/4 v0, 0x0

    return v0
.end method

.method public setAlpha(I)V
    .locals 0

    .line 312
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 317
    return-void
.end method
