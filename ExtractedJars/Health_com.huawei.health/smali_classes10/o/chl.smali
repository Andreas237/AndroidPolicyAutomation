.class public Lo/chl;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 14
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    invoke-virtual {p0}, Lo/chl;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_sport_control_button_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lo/chl;->b:I

    .line 16
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 2

    .line 21
    iget v0, p0, Lo/chl;->b:I

    iget v1, p0, Lo/chl;->b:I

    invoke-virtual {p0, v0, v1}, Lo/chl;->setMeasuredDimension(II)V

    .line 22
    return-void
.end method
