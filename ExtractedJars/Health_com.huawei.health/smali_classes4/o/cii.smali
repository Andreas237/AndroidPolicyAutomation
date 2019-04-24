.class public Lo/cii;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/chm;

.field private b:Landroid/view/View;

.field private c:Landroid/support/v7/widget/RecyclerView;

.field private d:I

.field private e:Landroid/content/Context;

.field private i:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lo/cii;->e:Landroid/content/Context;

    .line 35
    iput p2, p0, Lo/cii;->d:I

    .line 36
    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 5

    .line 39
    iget-object v0, p0, Lo/cii;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_pace:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 40
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_pace_recycler_view:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/cii;->c:Landroid/support/v7/widget/RecyclerView;

    .line 41
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_pace_chart:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chm;

    iput-object v0, p0, Lo/cii;->a:Lo/chm;

    .line 42
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_pace_chaer_uint:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cii;->i:Landroid/widget/TextView;

    .line 43
    iget-object v0, p0, Lo/cii;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 44
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lo/cii;->e:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 45
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 46
    iget-object v0, p0, Lo/cii;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 47
    iget-object v0, p0, Lo/cii;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 48
    iget v0, p0, Lo/cii;->d:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 49
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_pace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 50
    iget-object v0, p0, Lo/cii;->a:Lo/chm;

    invoke-virtual {v0}, Lo/chm;->e()V

    .line 51
    iget-object v0, p0, Lo/cii;->i:Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    :cond_0
    iput-object v3, p0, Lo/cii;->b:Landroid/view/View;

    .line 54
    return-object v3
.end method

.method public a(Lo/cgt;Ljava/util/Map;)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cgt;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 58
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cii;->b:Landroid/view/View;

    if-nez v0, :cond_0

    .line 59
    return-void

    .line 61
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v17

    .line 62
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->a(F)Ljava/lang/String;

    move-result-object v18

    .line 63
    invoke-static/range {p2 .. p2}, Lo/cdl;->c(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v19

    .line 64
    const/4 v0, 0x0

    aget-object v0, v19, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v20

    .line 65
    const/4 v0, 0x1

    aget-object v0, v19, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v21

    .line 66
    invoke-static/range {v20 .. v20}, Lo/cgl;->d(F)Ljava/lang/String;

    move-result-object v22

    .line 67
    move-object/from16 v0, p2

    move/from16 v1, v20

    invoke-static {v0, v1}, Lo/cgl;->e(Ljava/util/Map;F)Ljava/util/List;

    move-result-object v23

    .line 68
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/cgl;->b(Ljava/util/Map;Lo/cgt;)F

    move-result v24

    .line 69
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cii;->e:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cii;->e:Landroid/content/Context;

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

    move/from16 v25, v1

    .line 70
    const/high16 v26, 0x42500000    # 52.0f

    .line 71
    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    .line 72
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestPartTimeMap()Ljava/util/Map;

    move-result-object v31

    .line 73
    if-eqz v31, :cond_1

    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v27

    .line 76
    :cond_1
    if-eqz v31, :cond_2

    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v29

    .line 79
    :cond_2
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x102

    if-eq v0, v1, :cond_3

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x108

    if-ne v0, v1, :cond_4

    :cond_3
    const/16 v32, 0x1

    goto :goto_0

    :cond_4
    const/16 v32, 0x0

    .line 80
    :goto_0
    new-instance v0, Lo/cgr;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cii;->e:Landroid/content/Context;

    move-object/from16 v2, v23

    move-object/from16 v3, v22

    move-object/from16 v4, v18

    move/from16 v5, v20

    move/from16 v6, v21

    move/from16 v7, v25

    move/from16 v8, v26

    move/from16 v9, v24

    move-object/from16 v10, p0

    iget v10, v10, Lo/cii;->d:I

    const/16 v11, 0x65

    if-ne v10, v11, :cond_5

    const/4 v10, 0x1

    goto :goto_1

    :cond_5
    const/4 v10, 0x0

    :goto_1
    move-wide/from16 v11, v27

    move-wide/from16 v13, v29

    move/from16 v15, v32

    const/high16 v8, 0x42500000    # 52.0f

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Lo/cgr;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;FFFFFZDDZZ)V

    move-object/from16 v33, v0

    .line 81
    move-object/from16 v0, v33

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cgr;->b(Z)V

    .line 82
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cii;->c:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 83
    return-void
.end method
