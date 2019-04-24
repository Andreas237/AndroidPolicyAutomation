.class public Lo/chz;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/chz;->a:I

    .line 33
    return-void
.end method

.method private a(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 170
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    :cond_0
    return-void
.end method

.method private c(Landroid/widget/ImageView;I)V
    .locals 11

    .line 149
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v4

    .line 150
    const/high16 v0, 0x40000000    # 2.0f

    div-float v5, v4, v0

    .line 153
    const/16 v0, 0x8

    new-array v6, v0, [F

    const/4 v0, 0x0

    aput v5, v6, v0

    const/4 v0, 0x1

    aput v5, v6, v0

    const/4 v0, 0x2

    aput v5, v6, v0

    const/4 v0, 0x3

    aput v5, v6, v0

    const/4 v0, 0x4

    aput v5, v6, v0

    const/4 v0, 0x5

    aput v5, v6, v0

    const/4 v0, 0x6

    aput v5, v6, v0

    const/4 v0, 0x7

    aput v5, v6, v0

    .line 155
    new-instance v7, Landroid/graphics/RectF;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v7, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 157
    const/16 v0, 0x8

    new-array v8, v0, [F

    const/4 v0, 0x0

    aput v5, v8, v0

    const/4 v0, 0x1

    aput v5, v8, v0

    const/4 v0, 0x2

    aput v5, v8, v0

    const/4 v0, 0x3

    aput v5, v8, v0

    const/4 v0, 0x4

    aput v5, v8, v0

    const/4 v0, 0x5

    aput v5, v8, v0

    const/4 v0, 0x6

    aput v5, v8, v0

    const/4 v0, 0x7

    aput v5, v8, v0

    .line 159
    new-instance v9, Landroid/graphics/drawable/shapes/RoundRectShape;

    invoke-direct {v9, v6, v7, v8}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    .line 160
    new-instance v10, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v10, v9}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 162
    invoke-virtual {v10}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 164
    invoke-virtual {v10}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 166
    invoke-virtual {p1, v10}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 167
    return-void
.end method


# virtual methods
.method protected d(FLo/mf;)Ljava/lang/String;
    .locals 1

    .line 177
    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Lo/elc$b;Lo/elc$b;)V
    .locals 9

    .line 58
    iget v0, p0, Lo/chz;->a:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 59
    invoke-virtual {p0}, Lo/chz;->removeAllViews()V

    .line 60
    invoke-virtual {p0}, Lo/chz;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_horizontal_markerview_two:I

    invoke-static {v0, v1, p0}, Lo/chz;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 61
    const/4 v0, 0x2

    iput v0, p0, Lo/chz;->a:I

    .line 64
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->legend1:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 65
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->legend2:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 67
    iget-object v0, p2, Lo/elc$b;->d:Lo/eii;

    invoke-virtual {v0}, Lo/eii;->m()I

    move-result v0

    invoke-direct {p0, v2, v0}, Lo/chz;->c(Landroid/widget/ImageView;I)V

    .line 68
    iget-object v0, p3, Lo/elc$b;->d:Lo/eii;

    invoke-virtual {v0}, Lo/eii;->m()I

    move-result v0

    invoke-direct {p0, v3, v0}, Lo/chz;->c(Landroid/widget/ImageView;I)V

    .line 70
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->time:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 71
    invoke-direct {p0, v4, p1}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 73
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->data1:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->data2:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 75
    iget-boolean v0, p2, Lo/elc$b;->c:Z

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p2, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    iget-object v1, p2, Lo/elc$b;->b:Lo/mf;

    invoke-virtual {p0, v0, v1}, Lo/chz;->d(FLo/mf;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v5, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_0

    .line 78
    :cond_1
    const-string v0, "--"

    invoke-direct {p0, v5, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 80
    :goto_0
    iget-boolean v0, p3, Lo/elc$b;->c:Z

    if-eqz v0, :cond_2

    .line 81
    iget-object v0, p3, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    iget-object v1, p3, Lo/elc$b;->b:Lo/mf;

    invoke-virtual {p0, v0, v1}, Lo/chz;->d(FLo/mf;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v6, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_1

    .line 83
    :cond_2
    const-string v0, "--"

    invoke-direct {p0, v6, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 86
    :goto_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->unit1:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 87
    iget-object v0, p2, Lo/elc$b;->a:Ljava/lang/String;

    invoke-direct {p0, v7, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 88
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->unit2:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 89
    iget-object v0, p3, Lo/elc$b;->a:Ljava/lang/String;

    invoke-direct {p0, v8, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 90
    return-void
.end method

.method public e(Ljava/lang/String;Lo/elc$b;)V
    .locals 5

    .line 36
    iget v0, p0, Lo/chz;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 37
    invoke-virtual {p0}, Lo/chz;->removeAllViews()V

    .line 38
    invoke-virtual {p0}, Lo/chz;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_horizontal_markerview_one:I

    invoke-static {v0, v1, p0}, Lo/chz;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 39
    const/4 v0, 0x1

    iput v0, p0, Lo/chz;->a:I

    .line 41
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->time:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 42
    invoke-direct {p0, v2, p1}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 44
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->data:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 45
    iget-boolean v0, p2, Lo/elc$b;->c:Z

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p2, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    iget-object v1, p2, Lo/elc$b;->b:Lo/mf;

    invoke-virtual {p0, v0, v1}, Lo/chz;->d(FLo/mf;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v3, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_0

    .line 48
    :cond_1
    const-string v0, "--"

    invoke-direct {p0, v3, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 51
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->unit:I

    invoke-virtual {p0, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 52
    iget-object v0, p2, Lo/elc$b;->a:Ljava/lang/String;

    invoke-direct {p0, v4, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method public e(Ljava/lang/String;Lo/elc$b;Lo/elc$b;Lo/elc$b;)V
    .locals 16

    .line 96
    move-object/from16 v0, p0

    iget v0, v0, Lo/chz;->a:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 97
    invoke-virtual/range {p0 .. p0}, Lo/chz;->removeAllViews()V

    .line 98
    invoke-virtual/range {p0 .. p0}, Lo/chz;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_horizontal_markerview_three:I

    move-object/from16 v2, p0

    invoke-static {v0, v1, v2}, Lo/chz;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 99
    const/4 v0, 0x3

    move-object/from16 v1, p0

    iput v0, v1, Lo/chz;->a:I

    .line 101
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->legend1:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 102
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->legend2:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 103
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->legend3:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 104
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/elc$b;->d:Lo/eii;

    invoke-virtual {v0}, Lo/eii;->m()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v3, v0}, Lo/chz;->c(Landroid/widget/ImageView;I)V

    .line 105
    move-object/from16 v0, p3

    iget-object v0, v0, Lo/elc$b;->d:Lo/eii;

    invoke-virtual {v0}, Lo/eii;->m()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v4, v0}, Lo/chz;->c(Landroid/widget/ImageView;I)V

    .line 106
    move-object/from16 v0, p4

    iget-object v0, v0, Lo/elc$b;->d:Lo/eii;

    invoke-virtual {v0}, Lo/eii;->m()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v5, v0}, Lo/chz;->c(Landroid/widget/ImageView;I)V

    .line 108
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->time:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 109
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v6, v1}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 111
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->desc1:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 112
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->desc2:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->desc3:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 115
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/elc$b;->d:Lo/eii;

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->af()Lo/eks;

    move-result-object v0

    iget-object v0, v0, Lo/eks;->e:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-direct {v1, v7, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 116
    move-object/from16 v0, p3

    iget-object v0, v0, Lo/elc$b;->d:Lo/eii;

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->af()Lo/eks;

    move-result-object v0

    iget-object v0, v0, Lo/eks;->e:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-direct {v1, v8, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 117
    move-object/from16 v0, p4

    iget-object v0, v0, Lo/elc$b;->d:Lo/eii;

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->af()Lo/eks;

    move-result-object v0

    iget-object v0, v0, Lo/eks;->e:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-direct {v1, v9, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 119
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->data1:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 120
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->data2:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    .line 121
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->data3:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    .line 122
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lo/elc$b;->c:Z

    if-eqz v0, :cond_1

    .line 123
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    move-object/from16 v1, p2

    iget-object v1, v1, Lo/elc$b;->b:Lo/mf;

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lo/chz;->d(FLo/mf;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v10, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_0

    .line 125
    :cond_1
    const-string v0, "--"

    move-object/from16 v1, p0

    invoke-direct {v1, v10, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 127
    :goto_0
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/elc$b;->c:Z

    if-eqz v0, :cond_2

    .line 128
    move-object/from16 v0, p3

    iget-object v0, v0, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    move-object/from16 v1, p3

    iget-object v1, v1, Lo/elc$b;->b:Lo/mf;

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lo/chz;->d(FLo/mf;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v11, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_1

    .line 130
    :cond_2
    const-string v0, "--"

    move-object/from16 v1, p0

    invoke-direct {v1, v11, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 132
    :goto_1
    move-object/from16 v0, p4

    iget-boolean v0, v0, Lo/elc$b;->c:Z

    if-eqz v0, :cond_3

    .line 133
    move-object/from16 v0, p4

    iget-object v0, v0, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    move-object/from16 v1, p4

    iget-object v1, v1, Lo/elc$b;->b:Lo/mf;

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lo/chz;->d(FLo/mf;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v12, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_2

    .line 135
    :cond_3
    const-string v0, "--"

    move-object/from16 v1, p0

    invoke-direct {v1, v12, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 138
    :goto_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->unit1:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    .line 139
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/elc$b;->a:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-direct {v1, v13, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 140
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->unit2:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    .line 141
    move-object/from16 v0, p3

    iget-object v0, v0, Lo/elc$b;->a:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-direct {v1, v14, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 142
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->unit3:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/chz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    .line 143
    move-object/from16 v0, p4

    iget-object v0, v0, Lo/elc$b;->a:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-direct {v1, v15, v0}, Lo/chz;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 144
    return-void
.end method
