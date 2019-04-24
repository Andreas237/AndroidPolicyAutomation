.class public Lo/cim;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/chn;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/content/Context;

.field private d:Landroid/view/View;

.field private e:I

.field private f:Landroid/support/v7/widget/RecyclerView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lo/cim;->c:Landroid/content/Context;

    .line 38
    iput p2, p0, Lo/cim;->e:I

    .line 39
    return-void
.end method

.method private b(Landroid/widget/TextView;I)V
    .locals 0

    .line 96
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 97
    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 5

    .line 42
    iget-object v0, p0, Lo/cim;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_speed:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 43
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_pace_chart:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chn;

    iput-object v0, p0, Lo/cim;->a:Lo/chn;

    .line 44
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_pace_recycler_view:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/cim;->f:Landroid/support/v7/widget/RecyclerView;

    .line 45
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cim;->b:Landroid/widget/TextView;

    .line 46
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cim;->g:Landroid/widget/TextView;

    .line 47
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cim;->k:Landroid/widget/TextView;

    .line 48
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cim;->i:Landroid/widget/TextView;

    .line 49
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_pace_chaer_uint:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cim;->h:Landroid/widget/TextView;

    .line 50
    iget-object v0, p0, Lo/cim;->f:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 51
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lo/cim;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 52
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 53
    iget-object v0, p0, Lo/cim;->f:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 54
    iget-object v0, p0, Lo/cim;->f:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 55
    iget v0, p0, Lo/cim;->e:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 56
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_pace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 59
    iget-object v0, p0, Lo/cim;->a:Lo/chn;

    invoke-virtual {v0}, Lo/chn;->e()V

    .line 60
    iget-object v0, p0, Lo/cim;->h:Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cim;->b(Landroid/widget/TextView;I)V

    .line 61
    iget-object v0, p0, Lo/cim;->b:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cim;->b(Landroid/widget/TextView;I)V

    .line 62
    iget-object v0, p0, Lo/cim;->k:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cim;->b(Landroid/widget/TextView;I)V

    .line 63
    iget-object v0, p0, Lo/cim;->g:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cim;->b(Landroid/widget/TextView;I)V

    .line 64
    iget-object v0, p0, Lo/cim;->i:Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cim;->b(Landroid/widget/TextView;I)V

    .line 66
    :cond_0
    iput-object v3, p0, Lo/cim;->d:Landroid/view/View;

    .line 67
    return-object v3
.end method

.method public a(Lo/cgt;Ljava/util/Map;)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cgt;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 71
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cim;->d:Landroid/view/View;

    if-nez v0, :cond_0

    .line 72
    return-void

    .line 75
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    invoke-virtual/range {p1 .. p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    const v1, 0x3fcdfefc

    mul-float v15, v1, v0

    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v15

    .line 80
    :goto_0
    invoke-static {v15}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v16

    .line 81
    invoke-static/range {p2 .. p2}, Lo/cdl;->c(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v17

    .line 82
    const/4 v0, 0x0

    aget-object v0, v17, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v18

    .line 83
    const/4 v0, 0x1

    aget-object v0, v17, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v19

    .line 84
    move-object/from16 v0, p2

    move/from16 v1, v18

    invoke-static {v0, v1}, Lo/cgl;->e(Ljava/util/Map;F)Ljava/util/List;

    move-result-object v20

    .line 85
    invoke-static/range {v18 .. v18}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v21

    .line 86
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/cgl;->b(Ljava/util/Map;Lo/cgt;)F

    move-result v22

    .line 87
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cim;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cim;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/cdl;->e(Landroid/content/Context;F)I

    move-result v0

    add-int/lit8 v0, v0, -0x6a

    int-to-float v1, v0

    move/from16 v23, v1

    .line 88
    const/high16 v24, 0x42500000    # 52.0f

    .line 89
    new-instance v0, Lo/cgs;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cim;->c:Landroid/content/Context;

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v4, v16

    move/from16 v5, v18

    move/from16 v6, v19

    move/from16 v7, v23

    move/from16 v8, v24

    move/from16 v9, v22

    move-object/from16 v10, p0

    iget v10, v10, Lo/cim;->e:I

    const/16 v11, 0x65

    if-ne v10, v11, :cond_2

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    .line 90
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v11

    invoke-virtual {v11}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v11

    int-to-double v11, v11

    invoke-static {v11, v12}, Lo/cgl;->c(D)D

    move-result-wide v11

    invoke-virtual/range {p1 .. p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v13

    invoke-virtual {v13}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v14

    const/high16 v8, 0x42500000    # 52.0f

    const/4 v13, 0x0

    invoke-direct/range {v0 .. v14}, Lo/cgs;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;FFFFFZDZI)V

    move-object/from16 v25, v0

    .line 91
    move-object/from16 v0, v25

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cgs;->c(Z)V

    .line 92
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cim;->f:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 93
    return-void
.end method
