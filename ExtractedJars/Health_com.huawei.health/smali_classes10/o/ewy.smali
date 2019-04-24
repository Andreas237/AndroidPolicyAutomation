.class public Lo/ewy;
.super Landroid/support/v7/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field private a:Landroid/text/StaticLayout;

.field private b:Landroid/text/TextPaint;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 19
    invoke-direct {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 20
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lo/ewy;->b:Landroid/text/TextPaint;

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lo/ewy;->b:Landroid/text/TextPaint;

    .line 26
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 39
    iget-boolean v0, p0, Lo/ewy;->c:Z

    if-eqz v0, :cond_0

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewy;->c:Z

    .line 41
    new-instance v0, Landroid/text/StaticLayout;

    invoke-virtual {p0}, Lo/ewy;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, Lo/ewy;->b:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/ewy;->getWidth()I

    move-result v3

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v0, p0, Lo/ewy;->a:Landroid/text/StaticLayout;

    .line 43
    :cond_0
    iget-object v0, p0, Lo/ewy;->a:Landroid/text/StaticLayout;

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 44
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 30
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/AppCompatTextView;->onSizeChanged(IIII)V

    .line 31
    iget-object v0, p0, Lo/ewy;->b:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/ewy;->getTextSize()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 32
    iget-object v0, p0, Lo/ewy;->b:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/ewy;->getCurrentTextColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 33
    return-void
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 48
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/AppCompatTextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ewy;->c:Z

    .line 50
    return-void
.end method
