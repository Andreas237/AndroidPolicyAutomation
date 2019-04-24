.class public Lo/cgw;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgw$d;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    iput-object p2, p0, Lo/cgw;->d:Ljava/util/List;

    .line 32
    iput-object p1, p0, Lo/cgw;->b:Landroid/content/Context;

    .line 33
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 37
    iget-object v0, p0, Lo/cgw;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 38
    const/4 v0, 0x0

    return v0

    .line 40
    :cond_0
    iget-object v0, p0, Lo/cgw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 46
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 51
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 57
    const/4 v5, 0x0

    .line 58
    if-nez p2, :cond_1

    .line 60
    iget-object v0, p0, Lo/cgw;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_0
    new-instance v5, Lo/cgw$d;

    invoke-direct {v5}, Lo/cgw$d;-><init>()V

    .line 66
    iget-object v0, p0, Lo/cgw;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_swim_segment_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 67
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_segment_index:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->d(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 68
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_distance:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->b(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 69
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_duration:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->c(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 70
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_stroke_type:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->a(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 71
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_pull_times:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->e(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 72
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_swim_pace:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->g(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_swolf:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->i(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_swim_pace_unit:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->k(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 75
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_distance_unit:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v5, v0}, Lo/cgw$d;->f(Lo/cgw$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 76
    invoke-virtual {p2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cgw$d;

    .line 83
    :goto_0
    iget-object v0, p0, Lo/cgw;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/data/model/TrackSwimSegment;

    .line 84
    if-eqz v6, :cond_4

    .line 85
    invoke-static {v5}, Lo/cgw$d;->d(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestSegmentIndex()I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    invoke-static {v5}, Lo/cgw$d;->a(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cgw;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestStrokeType()I

    move-result v2

    invoke-static {v1, v2}, Lo/cds;->d(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    invoke-static {v5}, Lo/cgw$d;->b(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestDuration()I

    move-result v1

    invoke-static {v1}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    invoke-static {v5}, Lo/cgw$d;->c(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestPullTimes()I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    invoke-static {v5}, Lo/cgw$d;->e(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestSwolf()I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    invoke-static {v5}, Lo/cgw$d;->i(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestDistance()I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestPace()I

    move-result v7

    .line 93
    if-gtz v7, :cond_2

    .line 94
    invoke-static {v5}, Lo/cgw$d;->g(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 96
    :cond_2
    invoke-static {v5}, Lo/cgw$d;->g(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    int-to-float v1, v7

    invoke-static {v1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    :goto_1
    iget-object v0, p0, Lo/cgw;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    .line 100
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 101
    invoke-static {v5}, Lo/cgw$d;->f(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->requestDistance()I

    move-result v2

    invoke-virtual {v8, v1, v2}, Landroid/content/res/Resources;->getQuantityText(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    invoke-static {v5}, Lo/cgw$d;->k(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v8, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 104
    :cond_3
    invoke-static {v5}, Lo/cgw$d;->f(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v8, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    invoke-static {v5}, Lo/cgw$d;->k(Lo/cgw$d;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v8, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    :cond_4
    :goto_2
    return-object p2
.end method
