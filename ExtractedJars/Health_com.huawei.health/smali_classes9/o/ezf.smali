.class public Lo/ezf;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ezf$d;,
        Lo/ezf$a;,
        Lo/ezf$e;,
        Lo/ezf$g;,
        Lo/ezf$f;,
        Lo/ezf$b;,
        Lo/ezf$k;,
        Lo/ezf$c;
    }
.end annotation


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ezf$c;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ezf$k;>;"
        }
    .end annotation
.end field

.field private d:Lo/eyi;

.field private e:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-direct {p0}, Lo/ezf;->d()V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    invoke-direct {p0}, Lo/ezf;->d()V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    invoke-direct {p0}, Lo/ezf;->d()V

    .line 50
    return-void
.end method

.method private d()V
    .locals 2

    .line 53
    invoke-virtual {p0}, Lo/ezf;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->view_proportion:I

    invoke-static {v0, v1, p0}, Lo/ezf;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->proportion_bar:I

    invoke-virtual {p0, v0}, Lo/ezf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyi;

    iput-object v0, p0, Lo/ezf;->d:Lo/eyi;

    .line 55
    sget v0, Lcom/huawei/ui/main/R$id;->proportion_detail:I

    invoke-virtual {p0, v0}, Lo/ezf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ezf;->e:Landroid/widget/LinearLayout;

    .line 56
    return-void
.end method

.method private setProportionBarColors(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ezf$k;>;)V"
        }
    .end annotation

    .line 157
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 158
    iget-object v0, p0, Lo/ezf;->d:Lo/eyi;

    .line 159
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ezf$k;

    iget v1, v1, Lo/ezf$k;->b:I

    .line 160
    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ezf$k;

    iget v2, v2, Lo/ezf$k;->b:I

    .line 161
    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ezf$k;

    iget v3, v3, Lo/ezf$k;->b:I

    .line 158
    invoke-virtual {v0, v1, v2, v3}, Lo/eyi;->setColors(III)V

    goto/16 :goto_0

    .line 162
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 163
    iget-object v0, p0, Lo/ezf;->d:Lo/eyi;

    .line 164
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ezf$k;

    iget v1, v1, Lo/ezf$k;->b:I

    .line 165
    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ezf$k;

    iget v2, v2, Lo/ezf$k;->b:I

    .line 166
    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ezf$k;

    iget v3, v3, Lo/ezf$k;->b:I

    .line 167
    const/4 v4, 0x3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/ezf$k;

    iget v4, v4, Lo/ezf$k;->b:I

    .line 163
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eyi;->setColors(IIII)V

    goto :goto_0

    .line 168
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 169
    iget-object v0, p0, Lo/ezf;->d:Lo/eyi;

    .line 170
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ezf$k;

    iget v1, v1, Lo/ezf$k;->b:I

    .line 171
    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ezf$k;

    iget v2, v2, Lo/ezf$k;->b:I

    .line 172
    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ezf$k;

    iget v3, v3, Lo/ezf$k;->b:I

    .line 173
    const/4 v4, 0x3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/ezf$k;

    iget v4, v4, Lo/ezf$k;->b:I

    .line 174
    const/4 v5, 0x4

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/ezf$k;

    iget v5, v5, Lo/ezf$k;->b:I

    .line 169
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    goto :goto_0

    .line 176
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setProportionBarColors not support:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 178
    :goto_0
    return-void
.end method

.method private setProportionBarViewData(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ezf$k;>;)V"
        }
    .end annotation

    .line 133
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 134
    iget-object v0, p0, Lo/ezf;->d:Lo/eyi;

    .line 135
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ezf$k;

    iget v1, v1, Lo/ezf$k;->d:I

    int-to-float v1, v1

    .line 136
    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ezf$k;

    iget v2, v2, Lo/ezf$k;->d:I

    int-to-float v2, v2

    .line 137
    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ezf$k;

    iget v3, v3, Lo/ezf$k;->d:I

    int-to-float v3, v3

    .line 134
    invoke-virtual {v0, v1, v2, v3}, Lo/eyi;->setViewData(FFF)V

    goto/16 :goto_0

    .line 138
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 139
    iget-object v0, p0, Lo/ezf;->d:Lo/eyi;

    .line 140
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ezf$k;

    iget v1, v1, Lo/ezf$k;->d:I

    int-to-float v1, v1

    .line 141
    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ezf$k;

    iget v2, v2, Lo/ezf$k;->d:I

    int-to-float v2, v2

    .line 142
    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ezf$k;

    iget v3, v3, Lo/ezf$k;->d:I

    int-to-float v3, v3

    .line 143
    const/4 v4, 0x3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/ezf$k;

    iget v4, v4, Lo/ezf$k;->d:I

    int-to-float v4, v4

    .line 139
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eyi;->setViewData(FFFF)V

    goto :goto_0

    .line 144
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 145
    iget-object v0, p0, Lo/ezf;->d:Lo/eyi;

    .line 146
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ezf$k;

    iget v1, v1, Lo/ezf$k;->d:I

    int-to-float v1, v1

    .line 147
    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ezf$k;

    iget v2, v2, Lo/ezf$k;->d:I

    int-to-float v2, v2

    .line 148
    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ezf$k;

    iget v3, v3, Lo/ezf$k;->d:I

    int-to-float v3, v3

    .line 149
    const/4 v4, 0x3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/ezf$k;

    iget v4, v4, Lo/ezf$k;->d:I

    int-to-float v4, v4

    .line 150
    const/4 v5, 0x4

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/ezf$k;

    iget v5, v5, Lo/ezf$k;->d:I

    int-to-float v5, v5

    .line 145
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setViewData(FFFFF)V

    goto :goto_0

    .line 152
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setProportionBarViewData not support:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ezf$c;>;)V"
        }
    .end annotation

    .line 59
    const/4 v6, 0x0

    .line 60
    iget-object v0, p0, Lo/ezf;->b:Ljava/util/List;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/4 v6, 0x1

    .line 63
    :cond_0
    if-nez v6, :cond_1

    .line 64
    iget-object v0, p0, Lo/ezf;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 67
    :cond_1
    const/4 v7, 0x0

    .line 68
    const/4 v8, -0x1

    const/4 v9, 0x0

    .line 69
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/ezf$c;

    .line 70
    invoke-interface {v11}, Lo/ezf$c;->d()F

    move-result v0

    add-float/2addr v7, v0

    .line 71
    invoke-interface {v11}, Lo/ezf$c;->c()I

    move-result v0

    if-le v0, v8, :cond_2

    invoke-interface {v11}, Lo/ezf$c;->d()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    .line 72
    invoke-interface {v11}, Lo/ezf$c;->c()I

    move-result v8

    .line 73
    move-object v9, v11

    .line 75
    :cond_2
    goto :goto_0

    .line 77
    :cond_3
    const/4 v10, 0x0

    .line 78
    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-eqz v0, :cond_6

    .line 80
    const/4 v11, 0x0

    .line 81
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/ezf$c;

    .line 83
    invoke-interface {v13}, Lo/ezf$c;->d()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    div-float/2addr v0, v7

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/2addr v11, v0

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    const/16 v0, 0x64

    if-le v11, v0, :cond_5

    .line 86
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "percentSum > 100"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_5
    const/16 v0, 0x64

    if-ge v11, v0, :cond_6

    .line 89
    rsub-int/lit8 v10, v11, 0x64

    .line 94
    :cond_6
    if-nez v6, :cond_7

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    .line 97
    :cond_7
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/ezf$c;

    .line 99
    invoke-interface {v12}, Lo/ezf$c;->d()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    div-float/2addr v0, v7

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v13, v0

    .line 100
    if-eqz v9, :cond_8

    if-ne v9, v12, :cond_8

    if-eqz v10, :cond_8

    .line 101
    add-int/2addr v13, v10

    .line 103
    :cond_8
    if-nez v6, :cond_9

    .line 104
    new-instance v0, Lo/ezf$k;

    invoke-virtual {p0}, Lo/ezf;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 105
    invoke-interface {v12}, Lo/ezf$c;->a()I

    move-result v2

    .line 106
    invoke-interface {v12}, Lo/ezf$c;->b()Ljava/lang/String;

    move-result-object v3

    move v4, v13

    .line 108
    invoke-interface {v12}, Lo/ezf$c;->e()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lo/ezf$k;-><init>(Landroid/content/Context;ILjava/lang/String;II)V

    move-object v14, v0

    .line 110
    iget-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    iget-object v0, p0, Lo/ezf;->e:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, 0x0

    const/4 v3, -0x2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v14, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    goto :goto_3

    .line 114
    :cond_9
    iget-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    move-object/from16 v1, p1

    invoke-interface {v1, v12}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ezf$k;

    invoke-virtual {v0, v13}, Lo/ezf$k;->setPercent(I)V

    .line 116
    :goto_3
    goto/16 :goto_2

    .line 118
    :cond_a
    iget-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_b

    iget-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_b

    iget-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_b

    .line 119
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "ProportionView current only support three/four/five proportions"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :cond_b
    if-nez v6, :cond_c

    .line 123
    iget-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ezf;->setProportionBarColors(Ljava/util/List;)V

    .line 125
    :cond_c
    iget-object v0, p0, Lo/ezf;->c:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ezf;->setProportionBarViewData(Ljava/util/List;)V

    .line 127
    iget-object v0, p0, Lo/ezf;->d:Lo/eyi;

    invoke-virtual {v0}, Lo/eyi;->postInvalidate()V

    .line 129
    move-object/from16 v0, p1

    iput-object v0, p0, Lo/ezf;->b:Ljava/util/List;

    .line 130
    return-void
.end method
