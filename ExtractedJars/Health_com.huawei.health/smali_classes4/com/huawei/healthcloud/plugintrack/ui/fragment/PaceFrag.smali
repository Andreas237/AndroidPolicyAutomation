.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:F

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;>;"
        }
    .end annotation
.end field

.field private e:F

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/app/Activity;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Landroid/support/v7/widget/RecyclerView;

.field private m:Z

.field private n:Z

.field private p:Lo/cgt;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->a:Landroid/content/Context;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->g:Landroid/app/Activity;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->k:Landroid/support/v7/widget/RecyclerView;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->f:Landroid/widget/LinearLayout;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->m:Z

    return-void
.end method

.method private b(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-nez v0, :cond_1

    .line 119
    :cond_0
    const-string v0, "Track_PaceFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void

    .line 122
    :cond_1
    invoke-static {p1}, Lo/cdl;->c(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v4

    .line 123
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->e:F

    .line 124
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->b:F

    .line 125
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->n:Z

    if-eqz v0, :cond_2

    .line 126
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->c(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->i:Ljava/lang/String;

    .line 127
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->e:F

    invoke-static {v0}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->h:Ljava/lang/String;

    goto :goto_0

    .line 129
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->a(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->i:Ljava/lang/String;

    .line 130
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->e:F

    invoke-static {v0}, Lo/cgl;->d(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->h:Ljava/lang/String;

    .line 133
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 134
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    const v1, 0x3fcdfefc

    mul-float v5, v1, v0

    goto :goto_1

    .line 136
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v5

    .line 138
    :goto_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->e:F

    cmpg-float v0, v5, v0

    if-gez v0, :cond_4

    .line 139
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->m:Z

    .line 141
    :cond_4
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->e:F

    invoke-static {p1, v0}, Lo/cgl;->e(Ljava/util/Map;F)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->d:Ljava/util/List;

    .line 142
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 35

    .line 55
    const-string v0, "Track_PaceFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 58
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d()Lo/cgt;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    .line 59
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->a:Landroid/content/Context;

    .line 60
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->g:Landroid/app/Activity;

    .line 61
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_show_pace_fragment:I

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v18

    .line 63
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    if-eqz v0, :cond_7

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 64
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->s()Z

    move-result v0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->n:Z

    .line 67
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cgt;->a(I)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->c:Ljava/util/Map;

    .line 69
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->recycler_view:I

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->k:Landroid/support/v7/widget/RecyclerView;

    .line 70
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->k:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 71
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    move-object/from16 v19, v0

    .line 72
    move-object/from16 v0, v19

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 73
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->k:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 74
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->no_pace_layout:I

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->f:Landroid/widget/LinearLayout;

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->c:Ljava/util/Map;

    invoke-static {v0}, Lo/cdl;->e(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v20

    .line 78
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-ne v0, v1, :cond_1

    .line 79
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->k:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 80
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_1

    .line 82
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->b(Ljava/util/Map;)V

    .line 83
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    move-object/from16 v1, v20

    invoke-static {v1, v0}, Lo/cgl;->b(Ljava/util/Map;Lo/cgt;)F

    move-result v21

    .line 84
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->g:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v22

    .line 85
    invoke-interface/range {v22 .. v22}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v23

    .line 86
    new-instance v24, Landroid/graphics/Point;

    invoke-direct/range {v24 .. v24}, Landroid/graphics/Point;-><init>()V

    .line 87
    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 88
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->a:Landroid/content/Context;

    move-object/from16 v1, v24

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/cdl;->e(Landroid/content/Context;F)I

    move-result v0

    add-int/lit8 v0, v0, -0x6a

    int-to-float v1, v0

    move/from16 v25, v1

    .line 89
    const/high16 v26, 0x42500000    # 52.0f

    .line 90
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->n:Z

    if-eqz v0, :cond_2

    .line 92
    new-instance v0, Lo/cgs;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->a:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->d:Ljava/util/List;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->h:Ljava/lang/String;

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->i:Ljava/lang/String;

    move-object/from16 v5, p0

    iget v5, v5, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->e:F

    move-object/from16 v6, p0

    iget v6, v6, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->b:F

    move/from16 v7, v25

    move/from16 v8, v26

    move/from16 v9, v21

    move-object/from16 v10, p0

    iget-object v10, v10, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    .line 95
    invoke-virtual {v10}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v10

    invoke-virtual {v10}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v10

    int-to-double v10, v10

    invoke-static {v10, v11}, Lo/cgl;->c(D)D

    move-result-wide v11

    move-object/from16 v10, p0

    iget-boolean v13, v10, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->m:Z

    move-object/from16 v10, p0

    iget-object v10, v10, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    .line 96
    invoke-virtual {v10}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v10

    invoke-virtual {v10}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v14

    const/high16 v8, 0x42500000    # 52.0f

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v14}, Lo/cgs;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;FFFFFZDZI)V

    move-object/from16 v27, v0

    .line 97
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->k:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 98
    goto/16 :goto_1

    .line 99
    :cond_2
    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    .line 100
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->p:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v31

    .line 101
    invoke-virtual/range {v31 .. v31}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestPartTimeMap()Ljava/util/Map;

    move-result-object v32

    .line 102
    if-eqz v32, :cond_3

    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v27

    .line 105
    :cond_3
    if-eqz v32, :cond_4

    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 106
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v29

    .line 108
    :cond_4
    invoke-virtual/range {v31 .. v31}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x102

    if-eq v0, v1, :cond_5

    invoke-virtual/range {v31 .. v31}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x108

    if-ne v0, v1, :cond_6

    :cond_5
    const/16 v33, 0x1

    goto :goto_0

    :cond_6
    const/16 v33, 0x0

    .line 109
    :goto_0
    new-instance v0, Lo/cgr;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->a:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->d:Ljava/util/List;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->h:Ljava/lang/String;

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->i:Ljava/lang/String;

    move-object/from16 v5, p0

    iget v5, v5, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->e:F

    move-object/from16 v6, p0

    iget v6, v6, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->b:F

    move/from16 v7, v25

    move/from16 v8, v26

    move/from16 v9, v21

    move-wide/from16 v11, v27

    move-wide/from16 v13, v29

    move/from16 v15, v33

    move-object/from16 v10, p0

    iget-boolean v10, v10, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->m:Z

    move/from16 v16, v10

    const/high16 v8, 0x42500000    # 52.0f

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v16}, Lo/cgr;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;FFFFFZDDZZ)V

    move-object/from16 v34, v0

    .line 110
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;->k:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 114
    :cond_7
    :goto_1
    return-object v18
.end method
