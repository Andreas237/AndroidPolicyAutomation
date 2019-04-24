.class public Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$d;
    }
.end annotation


# static fields
.field private static b:[I


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/view/View;

.field private C:Lo/egd;

.field private D:Landroid/view/View;

.field private E:Landroid/view/View;

.field private F:Z

.field private G:Landroid/view/View;

.field private H:Ljava/lang/Runnable;

.field private I:D

.field private J:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private L:Z

.field private N:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private a:Lo/cmj;

.field private c:Lo/emg;

.field public d:Landroid/content/Context;

.field private e:Lo/emg;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/os/Handler;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/LinearLayout;

.field private q:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

.field private r:Landroid/widget/TextView;

.field private s:Lcom/huawei/hihealth/HiGoalInfo;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Lcom/huawei/hihealth/HiUserInfo;

.field private w:Z

.field private x:Lo/emr;

.field private y:Lcom/huawei/hihealth/HiUserInfo;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 89
    const/4 v0, 0x4

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/main/R$style;->setting_goal_sport_target_text:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$style;->settarget_unit_text_style:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$style;->setting_goal_weight_target_text:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$style;->setting_goal_weight_target_text:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 71
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a:Lo/cmj;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e:Lo/emg;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    .line 99
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->q:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 100
    new-instance v0, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiGoalInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->s:Lcom/huawei/hihealth/HiGoalInfo;

    .line 101
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->y:Lcom/huawei/hihealth/HiUserInfo;

    .line 102
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->w:Z

    .line 108
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$d;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$d;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    .line 115
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->H:Ljava/lang/Runnable;

    .line 122
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->F:Z

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->L:Z

    .line 129
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->J:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 217
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->N:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->q:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    return-object v0
.end method

.method private a(D)V
    .locals 5

    .line 602
    invoke-static {p1, p2}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v4, v0, -0x2

    .line 603
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(kgToLb)  mWeightGoalSeekbar.setProgress: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpl-double v0, p1, v0

    if-nez v0, :cond_0

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emg;->setProgress(I)V

    .line 607
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    invoke-virtual {v0, v4}, Lo/emg;->setProgress(I)V

    .line 608
    double-to-float v0, p1

    float-to-double v0, v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(D)V

    .line 609
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 595
    add-int/lit16 v4, p1, -0x7d0

    .line 596
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStepGoalSeekbar.setProgress: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e:Lo/emg;

    invoke-virtual {v0, v4}, Lo/emg;->setProgress(I)V

    .line 598
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(I)V

    .line 599
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(D)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->y:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    return-object p1
.end method

.method private b()V
    .locals 8

    .line 256
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView 222"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    const/4 v0, 0x4

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/main/R$style;->setting_goal_sport_target_text:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$style;->settarget_unit_text_rt_style:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$style;->setting_goal_weight_target_text:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$style;->setting_goal_weight_target_text:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b:[I

    .line 262
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->me_mytarget_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->x:Lo/emr;

    .line 263
    sget v0, Lcom/huawei/ui/main/R$id;->set_step_goal_seekbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emg;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e:Lo/emg;

    .line 264
    sget v0, Lcom/huawei/ui/main/R$id;->set_weight_goal_seekbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emg;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    .line 265
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_steps:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->k:Landroid/widget/TextView;

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 267
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_calorie:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->f:Landroid/widget/TextView;

    .line 268
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->g:Landroid/widget/TextView;

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 270
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_foot_min:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->i:Landroid/widget/TextView;

    .line 271
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_run_min:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h:Landroid/widget/TextView;

    .line 272
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_bike_min:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->l:Landroid/widget/TextView;

    .line 273
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_sport_little:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->m:Landroid/widget/TextView;

    .line 274
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_sport_match:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->u:Landroid/widget/TextView;

    .line 275
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_set_target_sport_server:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->t:Landroid/widget/TextView;

    .line 276
    sget v0, Lcom/huawei/ui/main/R$id;->set_goal_activity_target_sport_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->n:Landroid/widget/TextView;

    .line 277
    sget v0, Lcom/huawei/ui/main/R$id;->hw_target_save_goa:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->C:Lo/egd;

    .line 278
    sget v0, Lcom/huawei/ui/main/R$id;->set_goal_activity_target_about_as:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->r:Landroid/widget/TextView;

    .line 279
    sget v0, Lcom/huawei/ui/main/R$id;->mBigCD1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->D:Landroid/view/View;

    .line 280
    sget v0, Lcom/huawei/ui/main/R$id;->mBigCD2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->A:Landroid/view/View;

    .line 281
    sget v0, Lcom/huawei/ui/main/R$id;->mBigCD3:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->B:Landroid/view/View;

    .line 282
    sget v0, Lcom/huawei/ui/main/R$id;->mBigCD4:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->E:Landroid/view/View;

    .line 283
    sget v0, Lcom/huawei/ui/main/R$id;->mBigCD5:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->G:Landroid/view/View;

    .line 285
    sget v0, Lcom/huawei/ui/main/R$id;->set_goal_activity_layout2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->o:Landroid/widget/LinearLayout;

    .line 286
    sget v0, Lcom/huawei/ui/main/R$id;->set_goal_activity_layout10:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->p:Landroid/widget/LinearLayout;

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->D:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->A:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->B:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->E:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->G:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 294
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 295
    const/4 v0, 0x1

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->m:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->u:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41600000    # 14.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->l:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 306
    goto :goto_0

    .line 307
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->D:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->A:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->B:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->E:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->G:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 313
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->C:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->x:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e:Lo/emg;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emg;->setTouchable(Z)V

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emg;->setTouchable(Z)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e:Lo/emg;

    const/16 v1, 0x4650

    invoke-virtual {v0, v1}, Lo/emg;->setMax(I)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->q:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(I)V

    .line 331
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    const-wide v1, 0x4062a00000000000L    # 149.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/emg;->setMax(I)V

    .line 333
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(D)V

    goto :goto_1

    .line 335
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    const/16 v1, 0x95

    invoke-virtual {v0, v1}, Lo/emg;->setMax(I)V

    .line 336
    const/16 v0, 0x3c

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(I)V

    .line 340
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e:Lo/emg;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->N:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v1}, Lo/emg;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->J:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v1}, Lo/emg;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 343
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_home_steps:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 344
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 345
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_show_set_target_sport_walk:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 346
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 348
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_show_set_target_sport_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 349
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v6, v1, v2, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 351
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_show_set_target_sport_bike:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 352
    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v7, v1, v2, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 355
    return-void
.end method

.method private b(D)V
    .locals 6

    .line 518
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateWeightTargetInfor() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 522
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->g:Landroid/widget/TextView;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_lb:I

    .line 524
    invoke-static {p1, p2}, Lo/cxh;->e(D)D

    move-result-wide v3

    double-to-int v3, v3

    sget-object v5, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b:[I

    .line 522
    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Landroid/widget/TextView;III[I)V

    goto :goto_0

    .line 528
    :cond_0
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->g:Landroid/widget/TextView;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_kg_string:I

    double-to-int v3, p1

    sget-object v5, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b:[I

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Landroid/widget/TextView;III[I)V

    .line 534
    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 611
    add-int/lit8 v4, p1, -0x1

    .line 612
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWeightGoalSeekbar.setProgress: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const/16 v0, 0x3c

    if-ne p1, v0, :cond_0

    .line 614
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emg;->setProgress(I)V

    .line 616
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c:Lo/emg;

    invoke-virtual {v0, v4}, Lo/emg;->setProgress(I)V

    .line 617
    int-to-float v0, p1

    float-to-double v0, v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(D)V

    .line 618
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(D)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/os/Handler;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 1

    .line 126
    invoke-static {p0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a:Lo/cmj;

    .line 127
    return-void
.end method

.method private c(D)V
    .locals 4

    .line 476
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->q:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$7;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->d(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->s:Lcom/huawei/hihealth/HiGoalInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->z:Ljava/util/List;

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;

    invoke-direct {v2, p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Lo/clt;->e(ILjava/util/List;Lo/clz;)V

    .line 510
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)D
    .locals 0

    .line 71
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->I:D

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiGoalInfo;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->s:Lcom/huawei/hihealth/HiGoalInfo;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;I)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->L:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/widget/TextView;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(D)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->F:Z

    return p1
.end method

.method private f()V
    .locals 3

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black6:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black6:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 578
    return-void
.end method

.method private g()V
    .locals 3

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black6:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black6:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 592
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->L:Z

    return v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black6:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black6:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_userinfo_black2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 585
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lo/cmj;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a:Lo/cmj;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)D
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->I:D

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 358
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->q:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$6;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$9;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 403
    return-void
.end method

.method public varargs a(Landroid/widget/TextView;III[I)V
    .locals 13

    .line 539
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDifferentTextSize() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    .line 541
    const-string v11, ""

    .line 542
    if-nez p4, :cond_0

    .line 543
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move/from16 v2, p3

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, p2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    .line 546
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move/from16 v2, p3

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move/from16 v2, p3

    invoke-virtual {v0, p2, v2, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 547
    move/from16 v0, p3

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    .line 550
    :goto_0
    new-instance v0, Landroid/text/SpannableStringBuilder;

    move-object v1, v11

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    move-object v12, v0

    .line 551
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDifferentText= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-virtual {v11, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "+"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "+"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    const/4 v0, 0x0

    invoke-virtual {v11, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p3

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 553
    const/4 v7, 0x0

    move v8, v6

    move v9, v6

    invoke-virtual {v12}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v10

    goto :goto_1

    .line 555
    :cond_1
    invoke-virtual {v12}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int v9, v0, v6

    .line 556
    invoke-virtual {v12}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v10

    .line 557
    const/4 v7, 0x0

    .line 558
    invoke-virtual {v12}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int v8, v0, v6

    .line 560
    :goto_1
    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    .line 561
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    move/from16 v2, p4

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    aget v2, p5, v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    aget v2, p5, v2

    :goto_2
    invoke-direct {v0, v1, v2}, Landroid/text/style/TextAppearanceSpan;-><init>(Landroid/content/Context;I)V

    .line 560
    const/16 v1, 0x11

    invoke-virtual {v12, v0, v7, v8, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 566
    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    aget v2, p5, v2

    invoke-direct {v0, v1, v2}, Landroid/text/style/TextAppearanceSpan;-><init>(Landroid/content/Context;I)V

    const/16 v1, 0x11

    invoke-virtual {v12, v0, v9, v10, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 570
    invoke-virtual {p1, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 571
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 8

    .line 656
    if-eqz p1, :cond_7

    .line 658
    move-object v4, p1

    check-cast v4, Ljava/util/List;

    .line 659
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 660
    const/4 v5, 0x0

    .line 661
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 662
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiGoalInfo;

    .line 663
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 664
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiGoalType.GOAL_WEIGHT = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    add-int/lit8 v5, v5, 0x1

    .line 666
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 667
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->I:D

    .line 669
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 670
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(D)V

    goto :goto_1

    .line 672
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(I)V

    goto :goto_1

    .line 675
    :cond_1
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->I:D

    .line 677
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 678
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(D)V

    goto :goto_1

    .line 680
    :cond_2
    const/16 v0, 0x3c

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(I)V

    .line 684
    :cond_3
    :goto_1
    if-nez v5, :cond_4

    .line 685
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiGoalType.GOAL_WEIGHT is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 686
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d()V

    .line 661
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 689
    :cond_5
    goto :goto_2

    .line 690
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d()V

    .line 692
    :goto_2
    goto :goto_3

    .line 693
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d()V

    .line 695
    :goto_3
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2

    .line 708
    if-eqz p1, :cond_1

    .line 709
    move-object v1, p1

    check-cast v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 710
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v0

    if-lez v0, :cond_0

    .line 711
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(I)V

    goto :goto_0

    .line 713
    :cond_0
    const/16 v0, 0x2710

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(I)V

    .line 716
    :goto_0
    goto :goto_1

    .line 717
    :cond_1
    const/16 v0, 0x2710

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(I)V

    .line 719
    :goto_1
    return-void
.end method

.method public d()V
    .locals 2

    .line 698
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->I:D

    .line 700
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 701
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(D)V

    goto :goto_0

    .line 703
    :cond_0
    const/16 v0, 0x3c

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(I)V

    .line 705
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 12

    .line 174
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshStepGoalView() value:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const/16 v0, 0x1b58

    if-gt p1, v0, :cond_0

    .line 177
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->f()V

    goto :goto_0

    .line 178
    :cond_0
    const/16 v0, 0x32c8

    if-gt p1, v0, :cond_1

    .line 179
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->g()V

    goto :goto_0

    .line 181
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h()V

    .line 184
    :goto_0
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e(I)F

    move-result v7

    .line 185
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calorieValue="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_target_calorie:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "%d"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    float-to-int v5, v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->k:Landroid/widget/TextView;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_me_other_target_steps:I

    move v3, p1

    sget-object v5, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b:[I

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Landroid/widget/TextView;III[I)V

    .line 195
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_sport_timeline_mins_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    float-to-double v3, v7

    const-wide/high16 v5, 0x400c000000000000L    # 3.5

    div-double/2addr v3, v5

    double-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 196
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_sport_timeline_mins_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/high16 v3, 0x41000000    # 8.0f

    div-float v3, v7, v3

    float-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 197
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_sport_timeline_mins_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/high16 v3, 0x41100000    # 9.0f

    div-float v3, v7, v3

    float-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->w:Z

    if-nez v0, :cond_2

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 208
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->l:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 214
    :goto_1
    return-void
.end method

.method public e(I)F
    .locals 8

    .line 161
    if-gtz p1, :cond_0

    .line 162
    const/4 v0, 0x0

    return v0

    .line 164
    :cond_0
    int-to-double v0, p1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x3fdae147ae147ae1L    # 0.42

    mul-double/2addr v2, v4

    const-wide v4, 0x40f86a0000000000L    # 100000.0

    div-double/2addr v2, v4

    mul-double v6, v0, v2

    .line 165
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weight="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "height="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    invoke-static {v6, v7, v0}, Lo/dgp;->b(DF)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public e()V
    .locals 8

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->s:Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v6

    .line 449
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->L:Z

    .line 450
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowWeightDialog = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->F:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->F:Z

    if-nez v0, :cond_0

    .line 452
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowWeightDialog goalValue= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->I:D

    move-wide v3, v6

    new-instance v5, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;

    invoke-direct {v5, p0, v6, v7}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;-><init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V

    invoke-virtual/range {v0 .. v5}, Lo/dlf;->b(DDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 467
    :cond_0
    invoke-direct {p0, v6, v7}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(D)V

    .line 469
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 2

    .line 722
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->I:D

    .line 724
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 725
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(D)V

    goto :goto_0

    .line 727
    :cond_0
    const/16 v0, 0x3c

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(I)V

    .line 729
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->m:Landroid/widget/TextView;

    if-ne p1, v0, :cond_0

    .line 422
    const/16 v0, 0x1388

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(I)V

    goto :goto_0

    .line 424
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->u:Landroid/widget/TextView;

    if-ne p1, v0, :cond_1

    .line 426
    const/16 v0, 0x2710

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(I)V

    goto :goto_0

    .line 428
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->t:Landroid/widget/TextView;

    if-ne p1, v0, :cond_2

    .line 430
    const/16 v0, 0x4268

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(I)V

    goto :goto_0

    .line 432
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->C:Lo/egd;

    if-ne p1, v0, :cond_3

    .line 433
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 434
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    sget-object v0, Lo/dae;->ee:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 436
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 438
    const/16 v0, 0x4b0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1, v5, v2}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 440
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e()V

    .line 442
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 239
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 242
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v4

    .line 243
    invoke-virtual {v4}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_0

    .line 244
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->finish()V

    .line 245
    return-void

    .line 247
    :cond_0
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    .line 248
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_set_goal_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->setContentView(I)V

    .line 249
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->z:Ljava/util/List;

    .line 250
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b()V

    .line 251
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c()V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->H:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 253
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 732
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 733
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 737
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->j:Landroid/os/Handler;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 739
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 409
    :try_start_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 414
    goto :goto_0

    .line 410
    :catch_0
    move-exception v4

    .line 411
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BadParcelableException e ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/BadParcelableException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    goto :goto_0

    .line 412
    :catch_1
    move-exception v4

    .line 413
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    :goto_0
    return-void
.end method
