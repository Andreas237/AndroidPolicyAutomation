.class public Lo/bmp;
.super Lo/bmy;
.source "SourceFile"


# instance fields
.field private c:Z

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bmp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    iput-object p1, p0, Lo/bmp;->d:Landroid/content/Context;

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bmp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    iput-object p1, p0, Lo/bmp;->d:Landroid/content/Context;

    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lo/bmy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bmp;->c:Z

    .line 64
    iput-object p1, p0, Lo/bmp;->d:Landroid/content/Context;

    .line 65
    return-void
.end method

.method private a(Ljava/lang/String;)F
    .locals 16

    .line 89
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bmp;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    int-to-float v2, v0

    .line 90
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingLeft()I

    move-result v0

    int-to-float v3, v0

    .line 91
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingRight()I

    move-result v0

    int-to-float v4, v0

    .line 92
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 93
    if-nez v5, :cond_0

    .line 95
    const-string v0, "AssistantSubtitleTextView"

    const-string v1, "res is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    return v0

    .line 98
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$dimen;->sns_assistant_headline_subheading_image_width:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    .line 99
    sget v0, Lcom/huawei/android/sns/R$dimen;->sns_assist_subheading_image_marginright:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    .line 100
    sget v0, Lcom/huawei/android/sns/R$dimen;->sns_subheading_title_marginleft:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    .line 101
    sget v0, Lcom/huawei/android/sns/R$dimen;->sns_subheading_title_marginright:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v9

    .line 102
    sget v0, Lcom/huawei/android/sns/R$dimen;->sns_listview_margin_left_right:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    .line 105
    sub-float v0, v2, v3

    sub-float/2addr v0, v4

    sub-float/2addr v0, v6

    sub-float/2addr v0, v7

    sub-float/2addr v0, v8

    sub-float/2addr v0, v9

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v10

    sub-float v11, v0, v1

    .line 106
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/bmp;->c:Z

    if-nez v0, :cond_1

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bmp;->d:Landroid/content/Context;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v11, v0

    .line 111
    :cond_1
    const/4 v0, 0x0

    cmpg-float v0, v11, v0

    if-gtz v0, :cond_2

    .line 113
    const-string v0, "AssistantSubtitleTextView"

    const-string v1, "viewWidth less than zero"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    return v0

    .line 116
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    div-float/2addr v0, v11

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v12, v0

    .line 117
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getMaxLines()I

    move-result v13

    .line 118
    invoke-static {v13, v12}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 119
    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    invoke-virtual/range {p0 .. p0}, Lo/bmp;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    int-to-float v1, v14

    mul-float v15, v0, v1

    .line 120
    return v15
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 5

    .line 70
    invoke-super {p0, p1, p2}, Lo/bmy;->onMeasure(II)V

    .line 71
    invoke-virtual {p0}, Lo/bmp;->getLayout()Landroid/text/Layout;

    move-result-object v2

    .line 72
    if-eqz v2, :cond_0

    .line 74
    invoke-virtual {p0}, Lo/bmp;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bmp;->a(Ljava/lang/String;)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p0}, Lo/bmp;->getCompoundPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    .line 75
    invoke-virtual {p0}, Lo/bmp;->getCompoundPaddingBottom()I

    move-result v1

    add-int v3, v0, v1

    .line 76
    invoke-virtual {p0}, Lo/bmp;->getMeasuredWidth()I

    move-result v4

    .line 77
    invoke-virtual {p0, v4, v3}, Lo/bmp;->setMeasuredDimension(II)V

    .line 79
    :cond_0
    return-void
.end method

.method public setSingleSelectedFlag(Z)V
    .locals 0

    .line 130
    iput-boolean p1, p0, Lo/bmp;->c:Z

    .line 131
    return-void
.end method
