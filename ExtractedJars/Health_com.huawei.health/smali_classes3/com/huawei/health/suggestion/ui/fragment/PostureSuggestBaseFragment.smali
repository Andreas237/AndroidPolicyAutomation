.class public Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected a:Lo/egb;

.field protected b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

.field protected c:Lo/egb;

.field protected d:Lo/egb;

.field protected e:Lo/egb;

.field protected f:Lo/egb;

.field protected g:Lo/egb;

.field protected h:Lo/egb;

.field protected i:Lo/egb;

.field protected k:Lo/egb;

.field protected l:Landroid/view/View;

.field protected m:Landroid/content/Context;

.field protected n:Landroid/widget/ImageView;

.field private o:Lo/buv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/buv<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field

.field protected p:I

.field private q:Lo/bsp;

.field private s:Landroid/support/v7/widget/RecyclerView;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->u:Ljava/util/List;

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->p:I

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Ljava/util/List;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->u:Ljava/util/List;

    return-object v0
.end method

.method private b(Ljava/util/List;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;)V"
        }
    .end annotation

    .line 248
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeToMotion "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 250
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/TrainAction;

    .line 251
    new-instance v6, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;-><init>()V

    .line 252
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setId(Ljava/lang/String;)V

    .line 253
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveName(Ljava/lang/String;)V

    .line 254
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireMotionType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveMotionType(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireDifficulty()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveDifficulty(I)V

    .line 256
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveVersion(Ljava/lang/String;)V

    .line 257
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setDescription(Ljava/lang/String;)V

    .line 258
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireEquipments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setEquipments(Ljava/util/List;)V

    .line 259
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireTrainingpoints()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setTrainingpoints(Ljava/util/List;)V

    .line 260
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireModified()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setModified(J)V

    .line 261
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVideos()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVideos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 262
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVideos()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/Video;

    .line 263
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->savePicUrl(Ljava/lang/String;)V

    .line 264
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveMotionPath(Ljava/lang/String;)V

    .line 265
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getLogoImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setOrignLog(Ljava/lang/String;)V

    .line 266
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getLength()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveLength(I)V

    .line 269
    :cond_0
    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    goto/16 :goto_0

    .line 271
    :cond_1
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeToMotion "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Lo/buv;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->o:Lo/buv;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;)V
    .locals 5

    .line 116
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->e:Lo/egb;

    .line 117
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->a:Lo/egb;

    .line 118
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c:Lo/egb;

    .line 119
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item_level:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->d:Lo/egb;

    .line 120
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->f:Lo/egb;

    .line 121
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->g:Lo/egb;

    .line 122
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_action_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->k:Lo/egb;

    .line 123
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->k:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_action_training:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 124
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_suggest_item_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->h:Lo/egb;

    .line 125
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_suggest_item_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->i:Lo/egb;

    .line 126
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_suggest_item_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->n:Landroid/widget/ImageView;

    .line 127
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_posture_action_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->l:Landroid/view/View;

    .line 128
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_action_recv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->s:Landroid/support/v7/widget/RecyclerView;

    .line 129
    new-instance v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [I

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_rec_action_outof_workout:I

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$3;-><init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;Ljava/util/List;[I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->o:Lo/buv;

    .line 156
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->s:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 157
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->s:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->o:Lo/buv;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;-><init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)V

    invoke-virtual {v0, v1}, Lo/buv;->e(Lo/buv$b;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->s:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->o:Lo/buv;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->l:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    return-void
.end method

.method public b()V
    .locals 5

    .line 191
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->q:Lo/bsp;

    .line 192
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    :cond_0
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the oversea not support action"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-void

    .line 196
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    if-nez v0, :cond_2

    .line 197
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fragment have not init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    return-void

    .line 200
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireActionList()Ljava/util/List;

    move-result-object v4

    .line 201
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->q:Lo/bsp;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;

    invoke-direct {v1, p0, v4}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;-><init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;Ljava/util/List;)V

    invoke-interface {v0, v4, v1}, Lo/bsp;->d(Ljava/util/List;Lo/bui;)V

    .line 245
    return-void
.end method

.method protected c()V
    .locals 5

    .line 93
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireLevel()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 95
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->d:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->track_detail_running_posture_color_lower:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egb;->setTextColor(I)V

    .line 96
    goto :goto_0

    .line 98
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->d:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->track_detail_running_posture_color_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egb;->setTextColor(I)V

    .line 99
    goto :goto_0

    .line 101
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->d:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->track_detail_running_posture_color_higher:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egb;->setTextColor(I)V

    .line 102
    .line 106
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireLevelShortTip()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 107
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->p:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireLevel()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 108
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->g:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireAdvice()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0xc8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->g:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireAdvice()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0xc8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->f:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireLevelLongTip()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 113
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 75
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->m:Landroid/content/Context;

    .line 77
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 78
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 79
    const-string v0, "runningPostureAdvice"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    .line 81
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_running_posture_suggest_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 87
    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->a(Landroid/view/View;)V

    .line 88
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c()V

    .line 89
    return-object v2
.end method

.method public onResume()V
    .locals 2

    .line 180
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 181
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$2;-><init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 188
    return-void
.end method
