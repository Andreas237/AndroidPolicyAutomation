.class public Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;,
        Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;
    }
.end annotation


# instance fields
.field private A:J

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/TextView;>;"
        }
    .end annotation
.end field

.field private C:Lcom/huawei/health/sns/model/group/Group;

.field private D:Ljava/lang/String;

.field private E:D

.field private F:Lo/emr;

.field private G:Z

.field private H:Landroid/os/Handler;

.field private I:Ljava/lang/String;

.field private K:Ljava/lang/String;

.field private M:Lo/egn;

.field private N:Ljava/lang/String;

.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/ImageView;

.field private j:I

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/EditText;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/app/Activity;

.field private r:Landroid/widget/TextView;

.field private s:Lo/egd;

.field private t:Lo/egw;

.field private u:Landroid/widget/TextView;

.field private v:I

.field private w:Lo/egy;

.field private x:Ljava/util/Calendar;

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 145
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->A:J

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    .line 829
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->K:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)I
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->z:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/app/Activity;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    return-object v0
.end method

.method private a(Landroid/content/Intent;)V
    .locals 9

    .line 384
    const-string v0, "EXTRA_GROUP_ACTIVITY_DETAIL"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 385
    if-eqz v5, :cond_1

    .line 386
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    .line 387
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->F:Lo/emr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail_modify_activity:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 388
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->I:Ljava/lang/String;

    .line 389
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 390
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    .line 391
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getGoalValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    .line 392
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getDetails()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getDetails()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getBeginTime()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-virtual {v0, v1, v2}, Lo/bht;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 398
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getEndTime()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-virtual {v0, v1, v2}, Lo/bht;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getLastTime()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-virtual {v0, v1, v2}, Lo/bht;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 402
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 403
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p()V

    .line 408
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 411
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 412
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 414
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_can_not_modity:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 417
    :cond_1
    return-void
.end method

.method private a(Landroid/widget/TextView;)V
    .locals 9

    .line 431
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 432
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 433
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    .line 435
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 436
    invoke-virtual {v6}, Ljava/util/Date;->getYear()I

    move-result v0

    add-int/lit16 v0, v0, 0x76c

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->y:I

    .line 437
    invoke-virtual {v6}, Ljava/util/Date;->getMonth()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->v:I

    .line 438
    invoke-virtual {v6}, Ljava/util/Date;->getDate()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->z:I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 441
    goto :goto_0

    .line 439
    :catch_0
    move-exception v6

    .line 440
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ParseException e.getMessage(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    :cond_0
    :goto_0
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 445
    sget v0, Lcom/huawei/android/sns/R$layout;->commonui_date_select:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 446
    sget v0, Lcom/huawei/android/sns/R$id;->hw_health_datepicker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/egi;

    .line 448
    new-instance v8, Lo/egw$c;

    invoke-direct {v8, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 449
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_start_track_target_type_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 450
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->nps_user_survey_grade_sure:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;

    invoke-direct {v2, p0, v6, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Lo/egi;Landroid/widget/TextView;)V

    .line 451
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->nps_user_survey_grade_cancel:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$6;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 469
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 475
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 476
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->z:I

    invoke-virtual {v6, v0}, Lo/egi;->setSelectedDay(I)V

    .line 477
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->v:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v6, v0}, Lo/egi;->setSelectedMonth(I)V

    .line 478
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->y:I

    invoke-virtual {v6, v0}, Lo/egi;->setSelectedYear(I)V

    .line 479
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 501
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .line 642
    const/4 v3, 0x0

    .line 643
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 644
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    if-eqz v0, :cond_1

    .line 645
    const-class v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-static {p1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    .line 646
    if-eqz v4, :cond_0

    .line 647
    const/4 v3, 0x1

    .line 648
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;->getResultCode()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->I:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    :cond_0
    goto :goto_0

    .line 651
    :cond_1
    const-class v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthAddGroupActivityBean;

    invoke-static {p1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthAddGroupActivityBean;

    .line 652
    if-eqz v4, :cond_2

    .line 653
    const/4 v3, 0x1

    .line 654
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthAddGroupActivityBean;->getResultCode()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthAddGroupActivityBean;->getActivityId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    :cond_2
    :goto_0
    if-nez v3, :cond_3

    .line 659
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->h()V

    .line 661
    :cond_3
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 768
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 769
    const-class v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;

    invoke-static {p1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;

    .line 770
    if-eqz v4, :cond_2

    const-string v0, "0"

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;->getResultCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 771
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 773
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupActivityStatusFinished:\u53d1\u5e03\u72b6\u6001"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->A:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;

    invoke-direct {v1, p0, p2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V

    invoke-static {v0, p2, v1}, Lo/anz;->e(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V

    goto :goto_0

    .line 788
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 789
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupActivityStatusFinished:\u8bc4\u5ba1\u5931\u8d25"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 790
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x59

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 791
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 792
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 793
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 795
    :cond_1
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupActivityStatusFinished:\u8bc4\u5ba1\u4e2d\u3002\u3002\u3002"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    :cond_2
    :goto_0
    return-void
.end method

.method private a()Z
    .locals 3

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 333
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 334
    goto :goto_0

    .line 336
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 339
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->N:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    if-nez v0, :cond_2

    .line 340
    const/4 v0, 0x0

    return v0

    .line 342
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)I
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->y:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 359
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 360
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    .line 361
    if-eqz v4, :cond_1

    .line 362
    const-string v0, "group"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->C:Lcom/huawei/health/sns/model/group/Group;

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->C:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 365
    return-void

    .line 368
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->C:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->A:J

    .line 369
    const-string v0, "EXTRA_GROUP_ACTIVITY_DETAIL"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 370
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Landroid/content/Intent;)V

    goto :goto_0

    .line 373
    :cond_1
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 375
    return-void

    .line 377
    :cond_2
    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 990
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 991
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_repeat_new:I

    if-ne p1, v0, :cond_0

    .line 993
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_repeat_new:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    goto :goto_0

    .line 994
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_6:I

    if-ne p1, v0, :cond_1

    .line 996
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_6:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    goto :goto_0

    .line 998
    :cond_1
    invoke-virtual {v4, p1}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 1000
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_settings_button_ok:I

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    invoke-virtual {v4, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1008
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->w:Lo/egy;

    .line 1009
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->w:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 1010
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 806
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x59

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 807
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 808
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 809
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->i(Ljava/lang/String;)V

    .line 810
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 811
    const/16 v0, 0x5a

    iput v0, v2, Landroid/os/Message;->what:I

    .line 812
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 813
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 814
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)I
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->v:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->u:Landroid/widget/TextView;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 423
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->x:Ljava/util/Calendar;

    .line 424
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->x:Ljava/util/Calendar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->y:I

    .line 425
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->x:Ljava/util/Calendar;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->v:I

    .line 426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->x:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->z:I

    .line 427
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 748
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 749
    const-string v0, "activityId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 750
    const-string v0, "/activity/getGroupActivityStatus"

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$7;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$7;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V

    invoke-static {v3, v0, v1}, Lo/aoc;->e(Ljava/util/HashMap;Ljava/lang/String;Lo/aol;)V

    .line 760
    return-void
.end method

.method private d(Ljava/lang/String;)J
    .locals 8

    .line 624
    const-wide/16 v4, 0x0

    .line 625
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 627
    :try_start_0
    invoke-virtual {v6, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    .line 628
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 632
    goto :goto_0

    .line 629
    :catch_0
    move-exception v7

    .line 631
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ParseException e.getMessage(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    :goto_0
    return-wide v4
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/EditText;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 215
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->F:Lo/emr;

    .line 216
    sget v0, Lcom/huawei/android/sns/R$id;->event_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d:Landroid/widget/RelativeLayout;

    .line 217
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    sget v0, Lcom/huawei/android/sns/R$id;->event_rule:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a:Landroid/widget/RelativeLayout;

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 220
    sget v0, Lcom/huawei/android/sns/R$id;->event_start_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e:Landroid/widget/RelativeLayout;

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    sget v0, Lcom/huawei/android/sns/R$id;->event_end_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b:Landroid/widget/RelativeLayout;

    .line 223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 224
    sget v0, Lcom/huawei/android/sns/R$id;->registration_deadline:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c:Landroid/widget/RelativeLayout;

    .line 225
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    sget v0, Lcom/huawei/android/sns/R$id;->tv_show_event_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    .line 227
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    .line 228
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    sget v0, Lcom/huawei/android/sns/R$id;->tv_show_event_rule:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    .line 230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    sget v0, Lcom/huawei/android/sns/R$id;->tv_show_event_start_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    .line 232
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    sget v0, Lcom/huawei/android/sns/R$id;->tv_show_event_end_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    sget v0, Lcom/huawei/android/sns/R$id;->tv_show_event_registration_deadline:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    .line 236
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    sget v0, Lcom/huawei/android/sns/R$id;->tv_character_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->u:Landroid/widget/TextView;

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->u:Landroid/widget/TextView;

    const-string v1, "0/100"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    sget v0, Lcom/huawei/android/sns/R$id;->tv_check_poster:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->r:Landroid/widget/TextView;

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->r:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 241
    sget v0, Lcom/huawei/android/sns/R$id;->right_arrow1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->i:Landroid/widget/ImageView;

    .line 242
    sget v0, Lcom/huawei/android/sns/R$id;->right_arrow2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->h:Landroid/widget/ImageView;

    .line 243
    sget v0, Lcom/huawei/android/sns/R$id;->iv_upload_event_poster:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    .line 244
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 246
    sget v0, Lcom/huawei/android/sns/R$id;->event_description:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k:Landroid/widget/RelativeLayout;

    .line 247
    sget v0, Lcom/huawei/android/sns/R$id;->et_event_description:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->B:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e(Landroid/widget/EditText;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 254
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    const/high16 v1, 0x42a10000    # 80.5f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 255
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 297
    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 304
    sget v0, Lcom/huawei/android/sns/R$id;->btn_event_create_finish:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 307
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 669
    move-object v4, p1

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "0"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "30028"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "30017"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "30029"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x3

    :cond_0
    :goto_0
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_2

    .line 671
    :pswitch_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    if-eqz v0, :cond_1

    .line 673
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f()V

    .line 674
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->finish()V

    goto/16 :goto_3

    .line 678
    :cond_1
    const/4 v6, 0x0

    :goto_1
    const/16 v0, 0x1e

    if-ge v6, v0, :cond_2

    .line 679
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 680
    const/16 v0, 0x59

    iput v0, v7, Landroid/os/Message;->what:I

    .line 681
    iput-object p2, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 682
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    mul-int/lit16 v1, v6, 0x3e8

    int-to-long v1, v1

    invoke-virtual {v0, v7, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 678
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 685
    :cond_2
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 686
    const/16 v0, 0x5d

    iput v0, v6, Landroid/os/Message;->what:I

    .line 687
    iput-object p2, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 688
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v6, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 690
    goto/16 :goto_3

    .line 694
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 695
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 696
    goto/16 :goto_3

    .line 699
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 700
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 701
    const/16 v0, 0x5c

    iput v0, v6, Landroid/os/Message;->what:I

    .line 702
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_repeat_new:I

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 703
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 704
    goto :goto_3

    .line 707
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 708
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 709
    const/16 v0, 0x5c

    iput v0, v6, Landroid/os/Message;->what:I

    .line 710
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_1:I

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 711
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 712
    goto :goto_3

    .line 716
    :goto_2
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addGroupActivitySucc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->h()V

    .line 720
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_0
        0x2e53ad9 -> :sswitch_2
        0x2e53af9 -> :sswitch_1
        0x2e53afa -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private e()V
    .locals 2

    .line 349
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 351
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    goto :goto_0

    .line 353
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 356
    :goto_0
    return-void
.end method

.method private e(JJJ)Z
    .locals 12

    .line 589
    const/4 v4, 0x1

    .line 590
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 591
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    .line 592
    cmp-long v0, p1, p3

    if-lez v0, :cond_0

    .line 593
    const/4 v4, 0x0

    .line 594
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_3:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(I)V

    goto :goto_0

    .line 596
    :cond_0
    cmp-long v0, p5, v6

    if-gez v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    if-nez v0, :cond_1

    .line 597
    const/4 v4, 0x0

    .line 598
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_4:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(I)V

    goto :goto_0

    .line 599
    :cond_1
    cmp-long v0, p3, v6

    if-gez v0, :cond_2

    .line 600
    const/4 v4, 0x0

    .line 601
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_4:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(I)V

    goto :goto_0

    .line 602
    :cond_2
    cmp-long v0, p3, p5

    if-gez v0, :cond_3

    .line 603
    const/4 v4, 0x0

    .line 604
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_2:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(I)V

    .line 606
    :cond_3
    :goto_0
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 607
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 609
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 610
    new-instance v10, Ljava/util/Date;

    move-wide v0, p3

    invoke-direct {v10, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 611
    invoke-static {v9, v10}, Lo/eae;->c(Ljava/util/Date;Ljava/util/Date;)I

    move-result v11

    .line 612
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "days Between Start to End : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const/16 v0, 0x64

    if-le v11, v0, :cond_4

    .line 614
    const/4 v4, 0x0

    .line 615
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_time_error_6:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(I)V

    .line 617
    :cond_4
    return v4
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Z
    .locals 1

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a()Z

    move-result v0

    return v0
.end method

.method private f()V
    .locals 2

    .line 726
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 727
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 728
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 729
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->h()V

    return-void
.end method

.method private g()V
    .locals 5

    .line 1016
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1017
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    if-eqz v0, :cond_0

    .line 1018
    const-string v0, "activitytype"

    iget v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1020
    :cond_0
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    .line 1021
    const-string v0, "goalValue"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 1023
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v4, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1024
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->v:I

    return v0
.end method

.method private h()V
    .locals 3

    .line 735
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 736
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 737
    const/16 v0, 0x5c

    iput v0, v2, Landroid/os/Message;->what:I

    .line 738
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hw_toast_log_upload_failed:I

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 739
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 740
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->z:I

    return v0
.end method

.method private i()V
    .locals 16

    .line 534
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " 00:00:00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;)J

    move-result-wide v7

    .line 535
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " 23:59:59"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;)J

    move-result-wide v9

    .line 536
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " 23:59:58"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;)J

    move-result-wide v11

    .line 538
    move-object/from16 v0, p0

    move-wide v1, v7

    move-wide v3, v9

    move-wide v5, v11

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e(JJJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 539
    return-void

    .line 542
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    .line 543
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 544
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_description_tips:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 545
    return-void

    .line 547
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n()V

    .line 549
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 550
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->A:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    const-string v0, "activityName"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    const-string v0, "activityType"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    const-string v0, "goalValue"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    const-string v0, "details"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    const-string v0, "beginTime"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    const-string v0, "endTime"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    const-string v0, "lastTime"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    const-string v15, ""

    .line 559
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->G:Z

    if-eqz v0, :cond_2

    .line 561
    const-string v0, "activityId"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->I:Ljava/lang/String;

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    const-string v15, "/activity/modifyGroupActivity"

    goto :goto_0

    .line 564
    :cond_2
    const-string v0, "fileTag"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->N:Ljava/lang/String;

    invoke-virtual {v14, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    const-string v15, "/activity/addGroupActivity"

    .line 568
    :goto_0
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$9;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$9;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    invoke-static {v14, v15, v0}, Lo/aoc;->e(Ljava/util/HashMap;Ljava/lang/String;Lo/aol;)V

    .line 580
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 16

    .line 820
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " 00:00:00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;)J

    move-result-wide v10

    .line 821
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " 23:59:59"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;)J

    move-result-wide v12

    .line 822
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " 23:59:58"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Ljava/lang/String;)J

    move-result-wide v14

    .line 824
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    .line 825
    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->C:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p1

    move-wide v3, v10

    move-wide v5, v12

    move-wide v7, v14

    move-object/from16 v9, p0

    iget v9, v9, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    .line 824
    invoke-static/range {v0 .. v9}, Lo/boa;->a(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;JJJI)V

    .line 826
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->y:I

    return v0
.end method

.method private k()V
    .locals 7

    .line 887
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 888
    sget v0, Lcom/huawei/android/sns/R$layout;->group_setting_name_dialog_custom_item:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 889
    sget v0, Lcom/huawei/android/sns/R$id;->et_input_content:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/EditText;

    .line 890
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 891
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_input_group_activity_name:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 894
    :cond_0
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 895
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_edite_group_name:I

    invoke-virtual {v6, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 896
    invoke-virtual {v0, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$11;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 897
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_contact_confirm:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;

    invoke-direct {v2, p0, v5}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Landroid/widget/EditText;)V

    .line 903
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 916
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 917
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 918
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 919
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 920
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 921
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 922
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 923
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/egw$c;->e(Z)V

    goto :goto_0

    .line 925
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egw$c;->e(Z)V

    goto :goto_0

    .line 928
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egw$c;->e(Z)V

    .line 930
    :goto_0
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;

    invoke-direct {v0, p0, v6, v5}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Lo/egw$c;Landroid/widget/EditText;)V

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 960
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->t:Lo/egw;

    .line 961
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->t:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 962
    return-void
.end method

.method private l()V
    .locals 6

    .line 1258
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_head.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 1259
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1260
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v4

    .line 1261
    const-string v0, "Group_HealthCreateEventActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteTempFile: Delete file result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1263
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1264
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1265
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    .line 1266
    const-string v0, "Group_HealthCreateEventActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteTempFile: Delete tempCropFile result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1268
    :cond_1
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lo/egw;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->t:Lo/egw;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 1109
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1111
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 1112
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    .line 1117
    :cond_0
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->C:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 1087
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1088
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1089
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    .line 1090
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_info_examine:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1091
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 1092
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1094
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1095
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->M:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 1103
    :cond_1
    return-void
.end method

.method private o()Ljava/lang/String;
    .locals 2

    .line 1276
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_temp.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lo/egy;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->w:Lo/egy;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method private p()V
    .locals 7

    .line 1030
    :try_start_0
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1032
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id6:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1033
    goto/16 :goto_0

    .line 1035
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id5:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1036
    goto/16 :goto_0

    .line 1038
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_start_track_sport_type_cycling:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1039
    goto/16 :goto_0

    .line 1041
    :sswitch_3
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 1042
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walking:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1044
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walking:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1046
    goto/16 :goto_0

    .line 1048
    :sswitch_4
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 1049
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1051
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1053
    goto/16 :goto_0

    .line 1055
    :sswitch_5
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 1056
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1058
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1060
    goto/16 :goto_0

    .line 1062
    :sswitch_6
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 1063
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_fitness_type:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1065
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_fitness_type:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1067
    goto :goto_0

    .line 1069
    :sswitch_7
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 1070
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1072
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1074
    .line 1080
    :goto_0
    goto :goto_1

    .line 1078
    :catch_0
    move-exception v6

    .line 1079
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception e : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcc -> :sswitch_6
        0xcd -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 979
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 980
    const/4 v3, 0x0

    .line 981
    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    .line 982
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 984
    :cond_0
    if-lez v3, :cond_1

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    return-object v0
.end method

.method public e(Landroid/widget/EditText;)V
    .locals 3

    .line 1210
    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 1221
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    const/4 v1, 0x0

    aput-object v2, v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 1222
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 13

    .line 832
    move-object/from16 v0, p3

    invoke-super {p0, p1, p2, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 833
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 834
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 836
    :sswitch_0
    const-string v0, "sporttype"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->D:Ljava/lang/String;

    .line 837
    const-string v0, "activitytype"

    move-object/from16 v1, p3

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    .line 838
    const-string v0, "goalValue"

    move-object/from16 v1, p3

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    .line 839
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p()V

    .line 841
    goto/16 :goto_1

    .line 844
    :sswitch_1
    const-string v0, "fileTag"

    move-object/from16 v1, p3

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->N:Ljava/lang/String;

    .line 847
    const-string v0, "imagePath"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->K:Ljava/lang/String;

    .line 848
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 849
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_check_poster:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 852
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v4

    .line 853
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v5

    .line 854
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->K:Ljava/lang/String;

    invoke-static {v0}, Lo/boe;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 855
    invoke-static {v6, v4, v5}, Lo/boe;->b(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 856
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v8, v0

    .line 857
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-static {v4, v5, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 858
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 859
    new-instance v11, Landroid/graphics/Canvas;

    invoke-direct {v11, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 860
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 861
    new-instance v0, Landroid/graphics/BitmapShader;

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v7, v1, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 863
    new-instance v0, Landroid/graphics/RectF;

    new-instance v1, Landroid/graphics/Rect;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    move-object v12, v0

    .line 864
    invoke-virtual {v11, v12, v8, v8, v10}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 866
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 867
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 868
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v11, v7, v0, v1, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 870
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 871
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 874
    goto :goto_0

    .line 872
    :catch_0
    move-exception v4

    .line 873
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception e : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e()V

    .line 876
    .line 881
    :cond_0
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 506
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 507
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Landroid/widget/TextView;)V

    goto/16 :goto_0

    .line 508
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Landroid/widget/TextView;)V

    goto :goto_0

    .line 510
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 511
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Landroid/widget/TextView;)V

    goto :goto_0

    .line 512
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_3

    .line 513
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k()V

    goto :goto_0

    .line 514
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_4

    .line 515
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g()V

    goto :goto_0

    .line 516
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->s:Lo/egd;

    if-ne p1, v0, :cond_5

    .line 518
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->i()V

    goto :goto_0

    .line 519
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_6

    .line 520
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 521
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 522
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->C:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 523
    const-string v0, "image_type"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 524
    const/4 v0, 0x2

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 527
    :cond_6
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 172
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 173
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_create_event:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->setContentView(I)V

    .line 174
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->q:Landroid/app/Activity;

    .line 175
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->H:Landroid/os/Handler;

    .line 176
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c()V

    .line 177
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d()V

    .line 178
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b()V

    .line 179
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .line 1227
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 1229
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1232
    goto :goto_0

    .line 1230
    :catch_0
    move-exception v4

    .line 1231
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception onDestroy : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1233
    :goto_0
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 200
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 201
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestoreInstanceState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const-string v0, "groupId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->A:J

    .line 203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    const-string v1, "activityName"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    const-string v0, "activityType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    .line 205
    const-string v0, "goalValue"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    const-string v1, "details"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 207
    const-string v0, "fileTag"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->N:Ljava/lang/String;

    .line 208
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    const-string v1, "beginTime"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    const-string v1, "endTime"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    const-string v1, "lastTime"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    const-string v1, "eventRule"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 183
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 185
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSaveInstanceState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const-string v0, "groupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->A:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 187
    const-string v0, "activityName"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const-string v0, "activityType"

    iget v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->j:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 189
    const-string v0, "goalValue"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->E:D

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 190
    const-string v0, "details"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "fileTag"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->N:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "beginTime"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v0, "endTime"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v0, "lastTime"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v0, "eventRule"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    return-void
.end method
