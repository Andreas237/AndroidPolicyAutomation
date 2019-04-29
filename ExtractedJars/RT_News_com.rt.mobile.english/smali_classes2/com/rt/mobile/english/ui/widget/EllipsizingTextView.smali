.class public Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;
.super Landroid/widget/TextView;
.source "EllipsizingTextView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/widget/EllipsizingTextView$EllipsizeListener;
    }
.end annotation


# static fields
.field private static final ELLIPSIS:Ljava/lang/String; = "..."


# instance fields
.field private final ellipsizeListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/ui/widget/EllipsizingTextView$EllipsizeListener;",
            ">;"
        }
    .end annotation
.end field

.field private fullText:Ljava/lang/String;

.field private isEllipsized:Z

.field private isStale:Z

.field private lineAdditionalVerticalPadding:F

.field private lineSpacingMultiplier:F

.field private maxLines:I

.field private programmaticChange:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->ellipsizeListeners:Ljava/util/List;

    const/4 p1, -0x1

    .line 27
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->maxLines:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineSpacingMultiplier:F

    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineAdditionalVerticalPadding:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->ellipsizeListeners:Ljava/util/List;

    const/4 p1, -0x1

    .line 27
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->maxLines:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineSpacingMultiplier:F

    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineAdditionalVerticalPadding:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->ellipsizeListeners:Ljava/util/List;

    const/4 p1, -0x1

    .line 27
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->maxLines:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineSpacingMultiplier:F

    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineAdditionalVerticalPadding:F

    return-void
.end method

.method private createWorkingLayout(Ljava/lang/String;)Landroid/text/Layout;
    .locals 9

    .line 131
    new-instance v8, Landroid/text/StaticLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->getPaddingRight()I

    move-result v1

    sub-int v3, v0, v1

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    iget v5, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineSpacingMultiplier:F

    iget v6, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineAdditionalVerticalPadding:F

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    return-object v8
.end method

.method private resetText()V
    .locals 7

    .line 95
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->getMaxLines()I

    move-result v0

    .line 96
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->fullText:Ljava/lang/String;

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v0, v2, :cond_2

    .line 99
    invoke-direct {p0, v1}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->createWorkingLayout(Ljava/lang/String;)Landroid/text/Layout;

    move-result-object v5

    .line 100
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    move-result v6

    if-le v6, v0, :cond_2

    .line 101
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->fullText:Ljava/lang/String;

    add-int/lit8 v6, v0, -0x1

    invoke-virtual {v5, v6}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 102
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "..."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->createWorkingLayout(Ljava/lang/String;)Landroid/text/Layout;

    move-result-object v5

    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    move-result v5

    if-le v5, v0, :cond_1

    const/16 v5, 0x20

    .line 103
    invoke-virtual {v1, v5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    if-ne v5, v2, :cond_0

    goto :goto_1

    .line 107
    :cond_0
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 109
    :cond_1
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v4

    .line 113
    :goto_2
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 114
    iput-boolean v3, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->programmaticChange:Z

    .line 116
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    iput-boolean v4, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->programmaticChange:Z

    goto :goto_3

    :catchall_0
    move-exception v0

    iput-boolean v4, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->programmaticChange:Z

    throw v0

    .line 121
    :cond_3
    :goto_3
    iput-boolean v4, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->isStale:Z

    .line 122
    iget-boolean v1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->isEllipsized:Z

    if-eq v0, v1, :cond_4

    .line 123
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->isEllipsized:Z

    .line 124
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->ellipsizeListeners:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView$EllipsizeListener;

    .line 125
    invoke-interface {v2, v0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView$EllipsizeListener;->ellipsizeStateChanged(Z)V

    goto :goto_4

    :cond_4
    return-void
.end method


# virtual methods
.method public addEllipsizeListener(Lcom/rt/mobile/english/ui/widget/EllipsizingTextView$EllipsizeListener;)V
    .locals 1

    if-nez p1, :cond_0

    .line 45
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 47
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->ellipsizeListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getMaxLines()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->maxLines:I

    return v0
.end method

.method public isEllipsized()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->isEllipsized:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 87
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->isStale:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 88
    invoke-super {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 89
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->resetText()V

    .line 91
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 78
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 79
    iget-boolean p2, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->programmaticChange:Z

    if-nez p2, :cond_0

    .line 80
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->fullText:Ljava/lang/String;

    const/4 p1, 0x1

    .line 81
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->isStale:Z

    :cond_0
    return-void
.end method

.method public removeEllipsizeListener(Lcom/rt/mobile/english/ui/widget/EllipsizingTextView$EllipsizeListener;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->ellipsizeListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
    .locals 0

    return-void
.end method

.method public setLineSpacing(FF)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineAdditionalVerticalPadding:F

    .line 72
    iput p2, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->lineSpacingMultiplier:F

    .line 73
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    return-void
.end method

.method public setMaxLines(I)V
    .locals 0

    .line 60
    invoke-super {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 61
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->maxLines:I

    const/4 p1, 0x1

    .line 62
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/EllipsizingTextView;->isStale:Z

    return-void
.end method
