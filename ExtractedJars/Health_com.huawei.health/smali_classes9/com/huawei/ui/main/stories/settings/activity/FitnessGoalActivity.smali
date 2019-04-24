.class public Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:D

.field private B:I

.field private C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

.field private D:I

.field private F:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private H:Landroid/os/Handler;

.field a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field b:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field c:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field d:Landroid/widget/AdapterView$OnItemClickListener;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/LinearLayout;

.field private j:Lcom/huawei/up/model/UserInfomation;

.field private k:Lo/emr;

.field private l:Lo/fhu;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Lo/fhu;

.field private u:Lo/fhu;

.field private v:I

.field private w:Lo/fhp;

.field private x:Lo/egt;

.field private y:[Z

.field private z:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 65
    const/4 v0, 0x3

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    .line 96
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->H:Landroid/os/Handler;

    .line 425
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d:Landroid/widget/AdapterView$OnItemClickListener;

    .line 527
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->b:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 572
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$10;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->c:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 616
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x0t
        0x0t
    .end array-data
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    return-object p1
.end method

.method private a()V
    .locals 5

    .line 312
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter saveFitnessGoal()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 314
    :cond_0
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveFitnessGoal() -> null == mMotionGoal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    return-void

    .line 318
    :cond_1
    const/16 v4, 0x3e8

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setDataType(I)V

    .line 320
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 322
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->B:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setStepGoal(I)V

    .line 323
    iget v4, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->B:I

    .line 324
    goto :goto_0

    .line 326
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->D:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setCalorieGoal(I)V

    .line 327
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->D:I

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->B:I

    .line 328
    goto :goto_0

    .line 330
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->A:D

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setDistanceGoal(I)V

    .line 331
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->A:D

    double-to-int v4, v0

    .line 332
    .line 336
    :goto_0
    :pswitch_3
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveFitnessGoal() -> (step=1,calorie=2,distance=4,duration=8) \ndataType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 337
    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\nstepGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 338
    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ncalorieGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 339
    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ndistanceGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 340
    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ndurationGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 341
    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDutationGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 336
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$7;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    invoke-virtual {v0, v4, v1, v2}, Lo/fhp;->c(IILo/egg;)V

    .line 352
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->a()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->D:I

    return p1
.end method

.method private b()V
    .locals 4

    .line 243
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->F:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->F:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 246
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceCapability.getMotionGoalCap()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->F:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getMotionGoalCap()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->F:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getMotionGoalCap()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 252
    :cond_0
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == deviceCapability"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Z
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k()Z

    move-result v0

    return v0
.end method

.method private c()V
    .locals 4

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    invoke-virtual {v0, v1}, Lo/fhp;->a(Lo/egg;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$4;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    invoke-virtual {v0, v1}, Lo/fhp;->e(Lo/egg;)V

    goto :goto_0

    .line 235
    :cond_0
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mFitnessGoalInteractor is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->B:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->j:Lcom/huawei/up/model/UserInfomation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 266
    :cond_0
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mMotionGoal || null == mUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    return-void

    .line 270
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    .line 271
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateView() -> mCurrentGoalType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, v4

    .line 274
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 279
    :cond_2
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 281
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l()V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-boolean v1, v0, v2

    .line 283
    goto :goto_1

    .line 285
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->f()V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    const/4 v1, 0x1

    const/4 v2, 0x1

    aput-boolean v1, v0, v2

    .line 287
    goto :goto_1

    .line 289
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->g()V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    const/4 v1, 0x1

    const/4 v2, 0x2

    aput-boolean v1, v0, v2

    .line 291
    .line 296
    :goto_1
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;D)D
    .locals 0

    .line 46
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->A:D

    return-wide p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->j:Lcom/huawei/up/model/UserInfomation;

    return-object p1
.end method

.method private e()V
    .locals 5

    .line 130
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_custom_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k:Lo/emr;

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_goal_type_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->i:Landroid/widget/LinearLayout;

    .line 152
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_goal_type_layout_divider:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->f:Landroid/widget/LinearLayout;

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_type_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->h:Landroid/widget/TextView;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_type_image_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->g:Landroid/widget/ImageView;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_type_tv2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p:Landroid/widget/TextView;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_value_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o:Landroid/widget/TextView;

    .line 160
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_value_unit_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->n:Landroid/widget/TextView;

    .line 161
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_level_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->m:Landroid/widget/TextView;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_type_walk_time_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q:Landroid/widget/TextView;

    .line 164
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_type_run_time_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->s:Landroid/widget/TextView;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_type_ride_time_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->r:Landroid/widget/TextView;

    .line 167
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_seek_bar_step:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 168
    instance-of v0, v2, Lo/fhu;

    if-eqz v0, :cond_0

    .line 169
    move-object v0, v2

    check-cast v0, Lo/fhu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l:Lo/fhu;

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l:Lo/fhu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->b:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v1}, Lo/fhu;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 175
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_seek_bar_calorie:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 176
    instance-of v0, v3, Lo/fhu;

    if-eqz v0, :cond_1

    .line 177
    move-object v0, v3

    check-cast v0, Lo/fhu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u:Lo/fhu;

    .line 180
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u:Lo/fhu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->c:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v1}, Lo/fhu;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_seek_bar_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 184
    instance-of v0, v4, Lo/fhu;

    if-eqz v0, :cond_2

    .line 185
    move-object v0, v4

    check-cast v0, Lo/fhu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t:Lo/fhu;

    .line 188
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t:Lo/fhu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v1}, Lo/fhu;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 189
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d()V

    return-void
.end method

.method private f()V
    .locals 7

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->fitness_goal_calorie:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_goal_type_calorie_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v5

    .line 489
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changeToCalorieView() -> calorieGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o:Landroid/widget/TextView;

    int-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    invoke-virtual {v0, v5}, Lo/fhp;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l:Lo/fhu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u:Lo/fhu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t:Lo/fhu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u:Lo/fhu;

    mul-int/lit8 v1, v5, 0x64

    div-int/lit16 v1, v1, 0x28a

    invoke-virtual {v0, v1}, Lo/fhu;->setProgress(I)V

    .line 499
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)[Z
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/os/Handler;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->H:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 7

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->fitness_goal_distance:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_goal_type_distance_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v5

    .line 466
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changeToDistanceView() -> distanceGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o:Landroid/widget/TextView;

    int-to-double v1, v5

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    int-to-double v1, v5

    invoke-virtual {v0, v1, v2}, Lo/fhp;->c(D)Ljava/lang/String;

    move-result-object v6

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l:Lo/fhu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u:Lo/fhu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t:Lo/fhu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t:Lo/fhu;

    mul-int/lit8 v1, v5, 0x64

    div-int/lit16 v1, v1, 0x2710

    invoke-virtual {v0, v1}, Lo/fhu;->setProgress(I)V

    .line 476
    return-void
.end method

.method private h()V
    .locals 2

    .line 416
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->x:Lo/egt;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->x:Lo/egt;

    invoke-virtual {v0}, Lo/egt;->cancel()V

    .line 418
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->x:Lo/egt;

    .line 420
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->h()V

    return-void
.end method

.method private i()V
    .locals 7

    .line 388
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    return-void

    .line 391
    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    .line 392
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 393
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 394
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_sport_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->z:[Ljava/lang/String;

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->x:Lo/egt;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 396
    new-instance v6, Lo/egt$c;

    invoke-direct {v6, p0}, Lo/egt$c;-><init>(Landroid/content/Context;)V

    .line 397
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_fitness_goal_type_dialog_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egt$c;->e(Ljava/lang/String;)Lo/egt$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->z:[Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y:[Z

    iget-object v4, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d:Landroid/widget/AdapterView$OnItemClickListener;

    .line 398
    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/egt$c;->c([Ljava/lang/String;[Z[ILandroid/widget/AdapterView$OnItemClickListener;Z)Lo/egt$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    .line 403
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$8;-><init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egt$c;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lo/egt$c;

    move-result-object v0

    .line 408
    invoke-virtual {v0}, Lo/egt$c;->e()Lo/egt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->x:Lo/egt;

    .line 410
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->x:Lo/egt;

    invoke-virtual {v0}, Lo/egt;->show()V

    .line 411
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGoalTypeDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->j:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method private k()Z
    .locals 5

    .line 359
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter isMotionGoalChanged():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    const/4 v4, 0x0

    .line 361
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 362
    const/4 v0, 0x1

    return v0

    .line 364
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->v:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 366
    :pswitch_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->B:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 367
    const/4 v4, 0x1

    goto :goto_0

    .line 371
    :pswitch_1
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->D:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 372
    const/4 v4, 0x1

    goto :goto_0

    .line 376
    :pswitch_2
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->A:D

    double-to-int v0, v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 377
    const/4 v4, 0x1

    .line 383
    :cond_1
    :goto_0
    :pswitch_3
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)I
    .locals 1

    .line 46
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->B:I

    return v0
.end method

.method private l()V
    .locals 7

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->fitness_goal_step:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_goal_type_step_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v5

    .line 512
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changeToStepsView() -> stepGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o:Landroid/widget/TextView;

    int-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    invoke-virtual {v0, v5}, Lo/fhp;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 516
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l:Lo/fhu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u:Lo/fhu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t:Lo/fhu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fhu;->setVisibility(I)V

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l:Lo/fhu;

    mul-int/lit8 v1, v5, 0x64

    div-int/lit16 v1, v1, 0x4e20

    invoke-virtual {v0, v1}, Lo/fhu;->setProgress(I)V

    .line 522
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhu;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l:Lo/fhu;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->f()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 5

    .line 668
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 669
    const-string v0, "fitness_goal_key"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->C:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-virtual {v1, v2}, Lo/fhp;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 670
    const/16 v0, 0x3ec

    invoke-virtual {p0, v0, v4}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->setResult(ILandroid/content/Intent;)V

    .line 671
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setResult() -> PersonalInformationActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->finish()V

    .line 673
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->g()V

    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhp;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->s:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->r:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhu;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u:Lo/fhu;

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)I
    .locals 1

    .line 46
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->D:I

    return v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhu;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t:Lo/fhu;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)D
    .locals 2

    .line 46
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->A:D

    return-wide v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 300
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 301
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_goal_goal_type_layout:I

    if-ne v4, v0, :cond_0

    .line 302
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->i()V

    goto :goto_0

    .line 304
    :cond_0
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 115
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 116
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_fitness_goal:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->setContentView(I)V

    .line 117
    iput-object p0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e:Landroid/content/Context;

    .line 119
    new-instance v0, Lo/fhp;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fhp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->w:Lo/fhp;

    .line 120
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e()V

    .line 121
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->c()V

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->b()V

    .line 123
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 660
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 661
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->h()V

    .line 662
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 258
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 259
    return-void
.end method
