.class public Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/emr;

.field private c:Landroid/support/v7/widget/RecyclerView;

.field private d:Lo/bhk;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private f:Lo/egn;

.field private g:I

.field private h:Lcom/huawei/health/sns/model/group/Group;

.field private i:Ljava/lang/String;

.field private k:J

.field private l:Lo/bgn;

.field private o:Landroid/os/Handler;

.field private p:Lo/bgp;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 65
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->k:J

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->g:I

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    .line 121
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Lo/bhk;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d:Lo/bhk;

    return-object v0
.end method

.method private a()V
    .locals 1

    .line 310
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e(I)V

    .line 311
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 6

    .line 386
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 387
    if-eqz v4, :cond_1

    .line 388
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 389
    if-eqz v5, :cond_1

    .line 390
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 393
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group.getGroupType() == Group.TYPE_FAMILY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 396
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/model/group/Group;)V

    .line 400
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e(Ljava/util/ArrayList;)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 306
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/axf;->d(I)V

    .line 307
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 514
    move-object v4, p0

    .line 515
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 516
    :cond_0
    return-void

    .line 518
    :cond_1
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 520
    invoke-static {v4}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    .line 521
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    invoke-virtual {v4, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 522
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 523
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 525
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 526
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 537
    :cond_3
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 349
    if-nez p1, :cond_0

    .line 350
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    return-void

    .line 353
    :cond_0
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    .line 354
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 357
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d:Lo/bhk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bhk;->a(Z)V

    goto :goto_0

    .line 359
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d:Lo/bhk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bhk;->a(Z)V

    .line 361
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f()V

    .line 362
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o()V

    .line 363
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->k()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;I)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Landroid/os/Message;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Landroid/os/Message;)V

    return-void
.end method

.method private c()V
    .locals 5

    .line 369
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->k:J

    const/16 v3, 0x351

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 370
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 4

    .line 322
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 323
    if-eqz v2, :cond_2

    .line 324
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 325
    if-eqz v3, :cond_1

    .line 326
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 332
    :cond_0
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/model/group/Group;)V

    .line 334
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c()V

    goto :goto_0

    .line 338
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->g()V

    .line 341
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 6

    .line 451
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferGroupTask start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b(I)V

    .line 453
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v4

    .line 454
    new-instance v0, Lo/ato;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ato;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->k:J

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/ato;->c(JJ)V

    .line 455
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->i()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;I)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Landroid/os/Message;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Lcom/huawei/health/sns/model/group/GroupMember;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->i:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 6

    .line 200
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    .line 201
    sget v0, Lcom/huawei/android/sns/R$id;->group_member_rcy:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c:Landroid/support/v7/widget/RecyclerView;

    .line 202
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 203
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e:Ljava/util/List;

    .line 205
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 206
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 207
    const-string v0, "EXTRA_GROUP_ID"

    const-wide/16 v1, 0x0

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->k:J

    .line 208
    const-string v0, "EXTRA_MEMB_LIST_TYPE"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->g:I

    goto :goto_0

    .line 210
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->finish()V

    .line 211
    return-void

    .line 213
    :goto_0
    new-instance v0, Lo/bhk;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e:Ljava/util/List;

    iget v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->g:I

    invoke-direct {v0, v1, v2, v3}, Lo/bhk;-><init>(Landroid/content/Context;Ljava/util/List;I)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d:Lo/bhk;

    .line 214
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d:Lo/bhk;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d:Lo/bhk;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    invoke-virtual {v0, v1}, Lo/bhk;->c(Lo/bhk$d;)V

    .line 233
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 267
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->g:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_member:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_1

    .line 269
    :cond_2
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->g:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 271
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_group_member_select:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 276
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    :cond_3
    :goto_1
    return-void
.end method

.method private d(I)V
    .locals 5

    .line 479
    const/16 v0, 0x406

    if-ne p1, v0, :cond_0

    .line 480
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->h()V

    .line 481
    return-void

    .line 483
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_transfer_group_failure_toast:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->i:Ljava/lang/String;

    .line 484
    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 483
    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/brh;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 491
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 6

    .line 408
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 409
    const/4 v5, 0x0

    .line 410
    if-eqz v4, :cond_0

    .line 411
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 413
    if-eqz v5, :cond_0

    .line 416
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d(Ljava/util/ArrayList;)V

    .line 420
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f()V

    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 563
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 564
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 565
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d:Lo/bhk;

    invoke-virtual {v0}, Lo/bhk;->notifyDataSetChanged()V

    .line 566
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Lo/emr;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b:Lo/emr;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 295
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->l:Lo/bgn;

    .line 296
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->p:Lo/bgp;

    .line 297
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->l:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 299
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->p:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 300
    return-void
.end method

.method private e(I)V
    .locals 3

    .line 317
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->k:J

    invoke-virtual {v0, p1, v1, v2}, Lo/atb;->e(IJ)V

    .line 318
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Landroid/os/Message;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d(Landroid/os/Message;)V

    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 428
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delMembers start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b(I)V

    .line 430
    new-instance v0, Lo/asw;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asw;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    const/16 v2, 0x144

    invoke-virtual {v0, v1, v2, p1}, Lo/asw;->a(Landroid/content/Context;ILjava/util/ArrayList;)V

    .line 431
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Landroid/content/Context;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method private f()V
    .locals 3

    .line 543
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x343

    invoke-virtual {v0, v2, v1}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 544
    return-void
.end method

.method private g()V
    .locals 5

    .line 376
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->k:J

    const/16 v3, 0x349

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 377
    return-void
.end method

.method private h()V
    .locals 5

    .line 498
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_group_cannot_transfer_group:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_group_cannot_transfer_group_tips:I

    .line 500
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_user_permission_know:I

    .line 501
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 506
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 507
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egv;->setCancelable(Z)V

    .line 508
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 509
    return-void
.end method

.method private i()V
    .locals 4

    .line 437
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 440
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f:Lo/egn;

    .line 445
    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    .line 461
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_transfer_group_succese:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 462
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 463
    const-string v0, "TRANSFER_GROUP_ACTION"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 464
    invoke-static {v2}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 467
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v3

    .line 468
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 469
    const-string v0, "HEALTH_ACTION_TRANSFER_GROUP_SUCCESS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 470
    invoke-virtual {v3, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 472
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->finish()V

    .line 473
    return-void
.end method

.method private o()V
    .locals 4

    .line 550
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 551
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->h:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    goto :goto_0

    .line 553
    :cond_0
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGroupMember group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 190
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 191
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_group_memb_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->setContentView(I)V

    .line 192
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a:Landroid/content/Context;

    .line 193
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d()V

    .line 194
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b()V

    .line 195
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a()V

    .line 196
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e()V

    .line 197
    return-void
.end method
