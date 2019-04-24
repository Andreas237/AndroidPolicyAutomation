.class public Lhuawei/widget/AutoTextUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static autoText(IIIIIILandroid/widget/TextView;)V
    .locals 14

    .line 33
    invoke-virtual/range {p6 .. p6}, Landroid/widget/TextView;->getMaxWidth()I

    move-result v3

    .line 34
    invoke-virtual/range {p6 .. p6}, Landroid/widget/TextView;->getMaxHeight()I

    move-result v4

    .line 35
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    move/from16 v0, p4

    if-ge v3, v0, :cond_0

    .line 36
    move/from16 p4, v3

    .line 38
    :cond_0
    const/4 v0, -0x1

    if-eq v4, v0, :cond_1

    move/from16 v0, p5

    if-ge v4, v0, :cond_1

    .line 39
    move/from16 p5, v4

    .line 41
    :cond_1
    invoke-virtual/range {p6 .. p6}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v0

    sub-int v0, p4, v0

    .line 42
    invoke-virtual/range {p6 .. p6}, Landroid/widget/TextView;->getTotalPaddingRight()I

    move-result v1

    sub-int v5, v0, v1

    .line 43
    if-gez v5, :cond_2

    .line 44
    return-void

    .line 47
    :cond_2
    new-instance v6, Landroid/text/TextPaint;

    invoke-direct {v6}, Landroid/text/TextPaint;-><init>()V

    .line 48
    invoke-virtual/range {p6 .. p6}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 50
    invoke-virtual/range {p6 .. p6}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v7

    .line 52
    if-nez v7, :cond_3

    .line 53
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    goto :goto_0

    .line 55
    :cond_3
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    .line 57
    :goto_0
    int-to-float v0, p0

    .line 58
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 57
    move/from16 v2, p3

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v9

    .line 59
    int-to-float v0, p1

    .line 60
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 59
    move/from16 v2, p3

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v10

    .line 61
    move/from16 v0, p2

    int-to-float v0, v0

    .line 62
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 61
    move/from16 v2, p3

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v11

    .line 63
    const/4 v0, 0x0

    cmpl-float v0, v10, v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_5

    .line 64
    invoke-virtual/range {p6 .. p6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    .line 65
    invoke-virtual {v6, v9}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 66
    invoke-interface {v12}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v13

    .line 67
    :goto_1
    int-to-float v0, v5

    cmpl-float v0, v13, v0

    if-lez v0, :cond_4

    cmpl-float v0, v9, v10

    if-lez v0, :cond_4

    .line 68
    sub-float/2addr v9, v11

    .line 69
    invoke-virtual {v6, v9}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 70
    invoke-interface {v12}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v13

    goto :goto_1

    .line 72
    :cond_4
    move-object/from16 v0, p6

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 73
    move/from16 v0, p5

    move/from16 v1, p4

    move-object/from16 v2, p6

    invoke-static {v0, v1, v2}, Lhuawei/widget/AutoTextUtils;->measureHeight(IILandroid/widget/TextView;)V

    .line 75
    :cond_5
    return-void
.end method

.method private static measureHeight(IILandroid/widget/TextView;)V
    .locals 13

    .line 78
    invoke-virtual {p2}, Landroid/widget/TextView;->getMaxLines()I

    move-result v8

    .line 79
    const/4 v0, 0x1

    if-le v8, v0, :cond_1

    .line 80
    invoke-virtual {p2}, Landroid/widget/TextView;->getExtendedPaddingBottom()I

    move-result v0

    sub-int v0, p0, v0

    .line 81
    invoke-virtual {p2}, Landroid/widget/TextView;->getExtendedPaddingTop()I

    move-result v1

    sub-int v9, v0, v1

    .line 82
    if-gez v9, :cond_0

    .line 83
    return-void

    .line 85
    :cond_0
    invoke-virtual {p2}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    .line 86
    invoke-virtual {p2}, Landroid/widget/TextView;->getTotalPaddingRight()I

    move-result v1

    sub-int v10, v0, v1

    .line 87
    new-instance v0, Landroid/text/StaticLayout;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    move v3, v10

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 89
    invoke-virtual {p2}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result v5

    invoke-virtual {p2}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result v6

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    move-object v11, v0

    .line 90
    invoke-virtual {v11}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v12

    .line 91
    invoke-virtual {v11}, Landroid/text/StaticLayout;->getHeight()I

    move-result v0

    if-le v0, v9, :cond_1

    const/4 v0, 0x1

    if-le v12, v0, :cond_1

    add-int/lit8 v0, v8, 0x1

    if-gt v12, v0, :cond_1

    .line 93
    add-int/lit8 v0, v12, -0x1

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 96
    :cond_1
    return-void
.end method
