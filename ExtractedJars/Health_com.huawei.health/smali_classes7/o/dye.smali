.class public Lo/dye;
.super Lo/lr;
.source "SourceFile"


# instance fields
.field private a:Lo/nz;

.field private b:Landroid/content/Context;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Lo/lr;-><init>(Landroid/content/Context;I)V

    .line 46
    new-instance v0, Lo/nz;

    invoke-direct {v0}, Lo/nz;-><init>()V

    iput-object v0, p0, Lo/dye;->a:Lo/nz;

    .line 31
    iput-object p1, p0, Lo/dye;->b:Landroid/content/Context;

    .line 32
    return-void
.end method


# virtual methods
.method public b(FF)Lo/nz;
    .locals 7

    .line 65
    invoke-virtual {p0}, Lo/dye;->getOffset()Lo/nz;

    move-result-object v3

    .line 66
    invoke-virtual {p0}, Lo/dye;->getChartView()Lo/ld;

    move-result-object v4

    .line 68
    invoke-virtual {p0}, Lo/dye;->getWidth()I

    move-result v0

    int-to-float v5, v0

    .line 69
    invoke-virtual {p0}, Lo/dye;->getHeight()I

    move-result v0

    int-to-float v6, v0

    .line 71
    neg-float v0, v6

    iput v0, v3, Lo/nz;->c:F

    .line 74
    if-eqz v4, :cond_5

    .line 75
    invoke-virtual {v4}, Lo/ld;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v5

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 76
    iget-boolean v0, p0, Lo/dye;->e:Z

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/dye;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->pic_tip_run_right_bottom:I

    invoke-virtual {p0, v0, v1}, Lo/dye;->setBackgroundView(Landroid/content/Context;I)V

    goto :goto_0

    .line 79
    :cond_0
    iget-object v0, p0, Lo/dye;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->pic_tip_step_right_bottom:I

    invoke-virtual {p0, v0, v1}, Lo/dye;->setBackgroundView(Landroid/content/Context;I)V

    .line 82
    :goto_0
    const/high16 v0, 0x42300000    # 44.0f

    sub-float v0, v5, v0

    neg-float v0, v0

    iput v0, v3, Lo/nz;->e:F

    .line 83
    const-string v0, "CustomMarkerView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOffsetForDrawingAtPoint() offset.x right = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lo/nz;->e:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 86
    :cond_1
    const/4 v0, 0x0

    iput v0, v3, Lo/nz;->e:F

    .line 88
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v5, v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    .line 89
    iget-boolean v0, p0, Lo/dye;->e:Z

    if-eqz v0, :cond_2

    .line 90
    iget-object v0, p0, Lo/dye;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->pic_tip_run_middle_bottom:I

    invoke-virtual {p0, v0, v1}, Lo/dye;->setBackgroundView(Landroid/content/Context;I)V

    goto :goto_1

    .line 92
    :cond_2
    iget-object v0, p0, Lo/dye;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->pic_tip_step_middle_bottom:I

    invoke-virtual {p0, v0, v1}, Lo/dye;->setBackgroundView(Landroid/content/Context;I)V

    .line 95
    :goto_1
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v5, v0

    neg-float v0, v0

    iput v0, v3, Lo/nz;->e:F

    .line 96
    const-string v0, "CustomMarkerView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOffsetForDrawingAtPoint() offset.x middle = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lo/nz;->e:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 99
    :cond_3
    iget-boolean v0, p0, Lo/dye;->e:Z

    if-eqz v0, :cond_4

    .line 100
    iget-object v0, p0, Lo/dye;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->pic_tip_run_left_bottom:I

    invoke-virtual {p0, v0, v1}, Lo/dye;->setBackgroundView(Landroid/content/Context;I)V

    goto :goto_2

    .line 102
    :cond_4
    iget-object v0, p0, Lo/dye;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->pic_tip_step_left_bottom:I

    invoke-virtual {p0, v0, v1}, Lo/dye;->setBackgroundView(Landroid/content/Context;I)V

    .line 105
    :goto_2
    const/high16 v0, -0x3dd00000    # -44.0f

    iput v0, v3, Lo/nz;->e:F

    .line 106
    const-string v0, "CustomMarkerView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOffsetForDrawingAtPoint() offset.x left = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lo/nz;->e:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :cond_5
    :goto_3
    return-object v3
.end method

.method public b(Landroid/graphics/Canvas;FF)V
    .locals 4

    .line 116
    invoke-virtual {p0, p2, p3}, Lo/dye;->b(FF)Lo/nz;

    move-result-object v2

    .line 118
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 120
    iget v0, v2, Lo/nz;->e:F

    add-float/2addr v0, p2

    iget v1, v2, Lo/nz;->c:F

    add-float/2addr v1, p3

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 121
    invoke-virtual {p0, p1}, Lo/dye;->draw(Landroid/graphics/Canvas;)V

    .line 122
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 123
    return-void
.end method

.method public d(Lcom/github/mikephil/charting/data/Entry;Lo/mh;)V
    .locals 0

    .line 43
    invoke-super {p0, p1, p2}, Lo/lr;->d(Lcom/github/mikephil/charting/data/Entry;Lo/mh;)V

    .line 44
    return-void
.end method

.method public getOffset()Lo/nz;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dye;->a:Lo/nz;

    return-object v0
.end method

.method public setBackgroundView(Landroid/content/Context;I)V
    .locals 2

    .line 131
    sget v0, Lcom/huawei/pluginachievement/R$id;->img_here:I

    invoke-virtual {p0, v0}, Lo/dye;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 132
    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 133
    return-void
.end method

.method public setIsRun(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lo/dye;->e:Z

    .line 61
    return-void
.end method

.method public setOffset(FF)V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/dye;->a:Lo/nz;

    iput p1, v0, Lo/nz;->e:F

    .line 51
    iget-object v0, p0, Lo/dye;->a:Lo/nz;

    iput p2, v0, Lo/nz;->c:F

    .line 52
    return-void
.end method
