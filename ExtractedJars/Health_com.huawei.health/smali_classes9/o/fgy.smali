.class public Lo/fgy;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field protected b:I

.field protected d:Lo/fha$c;

.field protected e:I


# direct methods
.method public constructor <init>(IILo/fha$c;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 39
    iput p1, p0, Lo/fgy;->b:I

    .line 40
    iput p2, p0, Lo/fgy;->e:I

    .line 41
    iput-object p3, p0, Lo/fgy;->d:Lo/fha$c;

    .line 42
    invoke-direct {p0}, Lo/fgy;->a()V

    .line 43
    return-void
.end method

.method private a()V
    .locals 3

    .line 46
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fgy;->a:Landroid/graphics/Paint;

    .line 47
    iget-object v0, p0, Lo/fgy;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fgy;->d:Lo/fha$c;

    iget v1, v1, Lo/fha$c;->d:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lo/fgy;->d:Lo/fha$c;

    iget v1, v1, Lo/fha$c;->d:I

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 52
    move-object v0, p1

    iget v1, p0, Lo/fgy;->b:I

    int-to-float v3, v1

    iget v1, p0, Lo/fgy;->e:I

    int-to-float v4, v1

    iget-object v5, p0, Lo/fgy;->a:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 53
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .line 65
    const/4 v0, 0x0

    return v0
.end method

.method public setAlpha(I)V
    .locals 0

    .line 57
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 61
    return-void
.end method
