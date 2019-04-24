.class public Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthEventShareFragment$b;
    }
.end annotation


# instance fields
.field private C:Landroid/os/Handler;

.field private a:Lo/egb;

.field private b:Ljava/lang/String;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Lo/egb;

.field private f:Lo/egb;

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Lo/egb;

.field private k:Landroid/widget/LinearLayout;

.field private l:Lo/egb;

.field private m:Lo/egb;

.field private n:Lo/egb;

.field private o:Landroid/widget/LinearLayout;

.field private p:Lo/egb;

.field private q:Lo/egb;

.field private r:Lo/egb;

.field private s:Lo/egb;

.field private t:Lo/egb;

.field private u:Lo/egb;

.field private v:Z

.field private w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

.field private x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

.field private y:Z

.field private z:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 40
    const-string v0, "HealthEventShareFragment"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b:Ljava/lang/String;

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->y:Z

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->v:Z

    .line 90
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment$b;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->C:Landroid/os/Handler;

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->l:Lo/egb;

    invoke-virtual {v0, p1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->i:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->q:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->t:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getNumberOfPeople()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->r:Lo/egb;

    invoke-virtual {v0, p3}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->u:Lo/egb;

    invoke-virtual {v0, p2}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 311
    return-void
.end method

.method private b(Ljava/lang/String;Z)V
    .locals 10

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 263
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->i:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 264
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->i:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->f:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->h:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getNumberOfPeople()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getGoalValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    .line 273
    if-eqz p2, :cond_1

    .line 274
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->g:Lo/egb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 275
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    .line 276
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide v4, 0x40ac200000000000L    # 3600.0

    div-double/2addr v2, v4

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 277
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->p:Lo/egb;

    invoke-virtual {v0, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->m:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->m:Lo/egb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 280
    goto/16 :goto_0

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    const-string v8, "0"

    .line 283
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->p:Lo/egb;

    invoke-virtual {v0, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 284
    goto :goto_0

    .line 286
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_2

    .line 287
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-int v8, v0

    .line 288
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    div-int/lit8 v2, v8, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    rem-int/lit8 v2, v8, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 289
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->p:Lo/egb;

    invoke-virtual {v0, v9}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 290
    goto :goto_0

    .line 291
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 293
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->p:Lo/egb;

    invoke-virtual {v0, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 297
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    .line 298
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/bht;->b(I)Ljava/lang/String;

    move-result-object v9

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->n:Lo/egb;

    invoke-virtual {v0, v9}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 300
    return-void
.end method

.method private c()V
    .locals 13

    .line 186
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->v:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->y:Z

    if-eqz v0, :cond_1

    .line 187
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    .line 189
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getPhotoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bbk;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->a:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 193
    invoke-static {v6}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getBeginTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 194
    invoke-static {v6}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 196
    invoke-static {v6}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 198
    const/16 v0, 0x272b

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->z:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "HEALTH_GROUP_ACT_LIST_CURRENT_TIME"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 199
    invoke-static {v6}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Lo/bht;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    .line 200
    if-eqz v11, :cond_0

    .line 201
    invoke-static {v6}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 202
    invoke-static {v6}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v12}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->s:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->z:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v12

    .line 210
    sparse-switch v12, :sswitch_data_0

    goto/16 :goto_0

    .line 212
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 214
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_settings_one_level_menu_settings_item_text_id6:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Z)V

    .line 215
    goto/16 :goto_0

    .line 217
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 219
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_settings_one_level_menu_settings_item_text_id5:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Z)V

    .line 220
    goto/16 :goto_0

    .line 222
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_ride:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 224
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_start_track_sport_type_cycling:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Z)V

    .line 225
    goto/16 :goto_0

    .line 227
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 229
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walking_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    goto/16 :goto_0

    .line 232
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 234
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    goto/16 :goto_0

    .line 237
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_ride:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 239
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    goto/16 :goto_0

    .line 242
    :sswitch_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_swimming:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 244
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    goto :goto_0

    .line 247
    :sswitch_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->pic_share_bodybuilding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 249
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 256
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcc -> :sswitch_7
        0xcd -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->c()V

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 2

    .line 258
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 259
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Landroid/view/View;)V
    .locals 2

    .line 137
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_share_msg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->d:Landroid/widget/RelativeLayout;

    .line 139
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_user_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->c:Landroid/widget/ImageView;

    .line 140
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_username:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->a:Lo/egb;

    .line 141
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e:Lo/egb;

    .line 143
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_activity_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->i:Lo/egb;

    .line 144
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_challenge_msg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->k:Landroid/widget/LinearLayout;

    .line 145
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_my_challenge_rank:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->f:Lo/egb;

    .line 146
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_challenge_total_num:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->h:Lo/egb;

    .line 147
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_speed_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->g:Lo/egb;

    .line 148
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->p:Lo/egb;

    .line 149
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_finish_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->n:Lo/egb;

    .line 150
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_speed_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->m:Lo/egb;

    .line 152
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_sport_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->l:Lo/egb;

    .line 153
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_accumulate_msg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->o:Landroid/widget/LinearLayout;

    .line 154
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 155
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_my_rank:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->q:Lo/egb;

    .line 156
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_total_num:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->t:Lo/egb;

    .line 157
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_my_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->r:Lo/egb;

    .line 158
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_value_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->u:Lo/egb;

    .line 160
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_group_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->s:Lo/egb;

    .line 162
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->y:Z

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 165
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;)V
    .locals 5

    .line 167
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group or groupUserRank or groupActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    return-void

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setContentMsg() group = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setContentMsg() groupUserRank = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setContentMsg() groupActivity = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->z:Lcom/huawei/health/sns/model/group/Group;

    .line 176
    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 177
    iput-object p3, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 179
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->v:Z

    .line 181
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 182
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 183
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->C:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 184
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

    .line 132
    sget v0, Lcom/huawei/android/sns/R$layout;->fragment_health_event_share:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 133
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->e(Landroid/view/View;)V

    .line 134
    return-object v2
.end method
