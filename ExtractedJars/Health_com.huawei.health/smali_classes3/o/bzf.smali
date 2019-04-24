.class public Lo/bzf;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field b:Landroid/text/TextPaint;

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bzf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    invoke-direct {p0, p1}, Lo/bzf;->d(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method private c(Landroid/graphics/Paint;Ljava/lang/String;)I
    .locals 3

    .line 71
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 72
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 73
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method private d(F)I
    .locals 2

    .line 77
    invoke-virtual {p0}, Lo/bzf;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private d(Landroid/content/Context;)V
    .locals 5

    .line 43
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    .line 44
    iget-object v0, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 45
    iget-object v0, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-direct {p0, v1}, Lo/bzf;->d(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 46
    iget-object v0, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 47
    iget-object v0, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 48
    iget-object v0, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 50
    invoke-virtual {p0}, Lo/bzf;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 53
    div-int/lit8 v0, v4, 0x2

    iput v0, p0, Lo/bzf;->d:I

    .line 54
    const/high16 v0, 0x41f40000    # 30.5f

    invoke-direct {p0, v0}, Lo/bzf;->d(F)I

    move-result v0

    iget-object v1, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    const-string v2, "0123456789"

    invoke-direct {p0, v1, v2}, Lo/bzf;->c(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iput v0, p0, Lo/bzf;->c:I

    .line 56
    :cond_0
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 60
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 61
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 63
    const/4 v0, 0x5

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v4

    .line 64
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 67
    :cond_0
    iget v0, p0, Lo/bzf;->d:I

    int-to-float v0, v0

    iget v1, p0, Lo/bzf;->c:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/bzf;->b:Landroid/text/TextPaint;

    invoke-virtual {p1, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 68
    return-void
.end method
