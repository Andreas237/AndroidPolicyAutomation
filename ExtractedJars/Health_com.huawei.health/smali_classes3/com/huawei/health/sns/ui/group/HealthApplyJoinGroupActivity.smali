.class public Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$e;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lo/egn;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private g:Landroid/os/Handler;

.field private h:Lo/egd;

.field private i:Landroid/widget/TextView;

.field private k:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    .line 117
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$e;-><init>(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->g:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 4

    .line 332
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b(Ljava/lang/String;)V

    .line 333
    new-instance v0, Lo/ass;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->g:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ass;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    const/16 v3, 0x104

    invoke-virtual {v0, v3, v1, v2}, Lo/ass;->e(IJ)V

    .line 334
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;II)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(II)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;Ljava/lang/String;ILjava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Ljava/lang/String;ILjava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)J
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    return-wide v0
.end method

.method private b()V
    .locals 4

    .line 210
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 211
    if-eqz v2, :cond_1

    .line 212
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 213
    if-nez v3, :cond_0

    .line 214
    return-void

    .line 216
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    .line 220
    :cond_1
    return-void
.end method

.method private b(II)V
    .locals 2

    .line 401
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 402
    sget v0, Lcom/huawei/android/sns/R$string;->sns_join_num_limite_normal:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 403
    :cond_0
    const/16 v0, 0x3f1

    if-ne p2, v0, :cond_1

    .line 405
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->c(J)V

    goto :goto_0

    .line 407
    :cond_1
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 409
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;J)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->c(J)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 468
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 469
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 472
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 474
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 475
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 484
    :cond_1
    return-void
.end method

.method private c()V
    .locals 1

    .line 232
    sget v0, Lcom/huawei/android/sns/R$id;->img_group_head:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->e:Landroid/widget/ImageView;

    .line 233
    sget v0, Lcom/huawei/android/sns/R$id;->txt_group_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->c:Landroid/widget/TextView;

    .line 234
    sget v0, Lcom/huawei/android/sns/R$id;->txt_member_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d:Landroid/widget/TextView;

    .line 235
    sget v0, Lcom/huawei/android/sns/R$id;->txt_group_id:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->i:Landroid/widget/TextView;

    .line 236
    sget v0, Lcom/huawei/android/sns/R$id;->btn_join_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->h:Lo/egd;

    .line 237
    return-void
.end method

.method private c(J)V
    .locals 5

    .line 278
    const-string v0, "HealthApplyJoinGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "groupId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 280
    return-void

    .line 282
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 283
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;J)V

    invoke-static {v4, v0}, Lo/anz;->a(Ljava/util/List;Lo/aog;)V

    .line 326
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->e()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;II)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->e(II)V

    return-void
.end method

.method private d()V
    .locals 2

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->h:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    return-void
.end method

.method private d(II)V
    .locals 1

    .line 415
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 416
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;II)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b(II)V

    return-void
.end method

.method private d(Ljava/lang/String;ILjava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/Group;)V"
        }
    .end annotation

    .line 352
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, p2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->i:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    if-eqz p4, :cond_4

    .line 358
    const-string v6, ""

    .line 359
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 360
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 361
    :cond_0
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 362
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 363
    :cond_1
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 364
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v6

    .line 366
    :cond_2
    :goto_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 367
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 368
    invoke-virtual {v0, v6}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 369
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    goto :goto_1

    .line 387
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->e:Landroid/widget/ImageView;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-static {v0, v1, v2, p3}, Lo/bpg;->a(Landroid/widget/ImageView;JLjava/util/ArrayList;)V

    .line 389
    :goto_1
    goto :goto_2

    .line 390
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->e:Landroid/widget/ImageView;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-static {v0, v1, v2, p3}, Lo/bpg;->a(Landroid/widget/ImageView;JLjava/util/ArrayList;)V

    .line 393
    :cond_5
    :goto_2
    return-void
.end method

.method private e()V
    .locals 4

    .line 266
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 267
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 268
    const-string v0, "EXTRA_GROUP_ID"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 269
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 270
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->finish()V

    .line 271
    return-void
.end method

.method private e(II)V
    .locals 4

    .line 427
    const/4 v3, 0x0

    .line 429
    if-eqz p1, :cond_0

    .line 430
    sget v0, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 431
    :cond_0
    const/16 v0, 0x3ec

    if-ne p2, v0, :cond_1

    .line 432
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_authority:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 433
    :cond_1
    const/16 v0, 0x3f0

    if-ne p2, v0, :cond_2

    .line 434
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-virtual {v0, v1, v2}, Lo/atb;->b(J)V

    .line 435
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 436
    :cond_2
    const/16 v0, 0x3f8

    if-ne p2, v0, :cond_3

    .line 437
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 439
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_normao_groupinfo_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 441
    :goto_0
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    invoke-static {p0, v3, v0}, Lo/boj;->e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;

    .line 447
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->f()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 490
    const-string v0, "HealthApplyJoinGroupActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reportShareBI groupID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " joinType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/boa;->d(Landroid/content/Context;Ljava/lang/Long;I)V

    .line 492
    return-void
.end method

.method private g()V
    .locals 6

    .line 340
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b(Ljava/lang/String;)V

    .line 341
    new-instance v0, Lo/asx;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->g:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asx;-><init>(Landroid/os/Handler;)V

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k:J

    const/16 v1, 0x103

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/asx;->d(IJZZ)V

    .line 342
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)Landroid/os/Handler;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)Landroid/app/Activity;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a:Landroid/app/Activity;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 455
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b:Lo/egn;

    .line 457
    :cond_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 196
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 197
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a:Landroid/app/Activity;

    .line 198
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->activity_health_apply_join_group:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(I)V

    .line 199
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->c()V

    .line 200
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b()V

    .line 201
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d()V

    .line 202
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->g()V

    .line 203
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 224
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->k()V

    .line 225
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 226
    return-void
.end method
