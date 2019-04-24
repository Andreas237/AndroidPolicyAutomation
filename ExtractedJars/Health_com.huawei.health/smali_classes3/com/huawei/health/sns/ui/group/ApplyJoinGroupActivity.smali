.class public Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$c;
    }
.end annotation


# instance fields
.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/ImageView;

.field private k:Lo/bio;

.field private l:Lo/egd;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/os/Handler;

.field private o:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k:Lo/bio;

    .line 103
    new-instance v0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$c;-><init>(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->n:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 4

    .line 267
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 268
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 269
    const-string v0, "groupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->o:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 270
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 271
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->finish()V

    .line 272
    return-void
.end method

.method private a(II)V
    .locals 1

    .line 333
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 334
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->a()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;II)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->c(II)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;Ljava/lang/String;ILjava/util/ArrayList;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->e(Ljava/lang/String;ILjava/util/ArrayList;)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->l:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->h()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;II)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->a(II)V

    return-void
.end method

.method private c()V
    .locals 6

    .line 231
    sget v0, Lcom/huawei/android/sns/R$id;->group_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->h:Landroid/widget/ImageView;

    .line 232
    sget v0, Lcom/huawei/android/sns/R$id;->group_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->f:Landroid/widget/TextView;

    .line 233
    sget v0, Lcom/huawei/android/sns/R$id;->group_count:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->g:Landroid/widget/TextView;

    .line 234
    sget v0, Lcom/huawei/android/sns/R$id;->apply_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->l:Lo/egd;

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->l:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 237
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->m:Landroid/widget/LinearLayout;

    .line 239
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 242
    invoke-static {p0}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v5

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->h:Landroid/widget/ImageView;

    int-to-double v1, v5

    const-wide v3, 0x3fc0a3d70a3d70a4L    # 0.13

    mul-double/2addr v1, v3

    double-to-int v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 245
    :cond_0
    return-void
.end method

.method private c(II)V
    .locals 1

    .line 313
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 315
    sget v0, Lcom/huawei/android/sns/R$string;->sns_join_num_limite_normal:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 317
    :cond_0
    const/16 v0, 0x3f1

    if-ne p2, v0, :cond_1

    .line 320
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->a()V

    goto :goto_0

    .line 324
    :cond_1
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 326
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;II)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->e(II)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 395
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k:Lo/bio;

    if-nez v0, :cond_0

    .line 397
    new-instance v0, Lo/bio;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k:Lo/bio;

    goto :goto_0

    .line 401
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k:Lo/bio;

    invoke-virtual {v0, p1}, Lo/bio;->d(Ljava/lang/String;)V

    .line 403
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 404
    return-void
.end method

.method private e()V
    .locals 4

    .line 204
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 205
    if-eqz v2, :cond_1

    .line 207
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 208
    if-nez v3, :cond_0

    .line 210
    return-void

    .line 212
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->o:J

    .line 217
    :cond_1
    return-void
.end method

.method private e(II)V
    .locals 4

    .line 346
    const/4 v3, 0x0

    .line 348
    if-eqz p1, :cond_0

    .line 350
    sget v0, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 352
    :cond_0
    const/16 v0, 0x3ec

    if-ne p2, v0, :cond_1

    .line 354
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_authority:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 356
    :cond_1
    const/16 v0, 0x3f0

    if-ne p2, v0, :cond_2

    .line 358
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->o:J

    invoke-virtual {v0, v1, v2}, Lo/atb;->b(J)V

    .line 359
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 361
    :cond_2
    const/16 v0, 0x3f8

    if-ne p2, v0, :cond_3

    .line 363
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 367
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_normao_groupinfo_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 369
    :goto_0
    new-instance v0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V

    invoke-static {p0, v3, v0}, Lo/boj;->e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;

    .line 377
    return-void
.end method

.method private e(Ljava/lang/String;ILjava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 301
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getResources()Landroid/content/res/Resources;

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

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->h:Landroid/widget/ImageView;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->o:J

    invoke-static {v0, v1, v2, p3}, Lo/bpg;->a(Landroid/widget/ImageView;JLjava/util/ArrayList;)V

    .line 304
    return-void
.end method

.method private g()V
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k:Lo/bio;

    if-eqz v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 388
    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    .line 279
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->d(Ljava/lang/String;)V

    .line 280
    new-instance v0, Lo/ass;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->n:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ass;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->o:J

    const/16 v3, 0x104

    invoke-virtual {v0, v3, v1, v2}, Lo/ass;->e(IJ)V

    .line 281
    return-void
.end method

.method private k()V
    .locals 6

    .line 288
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->d(Ljava/lang/String;)V

    .line 289
    new-instance v0, Lo/asx;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->n:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asx;-><init>(Landroid/os/Handler;)V

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->o:J

    const/16 v1, 0x103

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/asx;->d(IJZZ)V

    .line 290
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 178
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 179
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 180
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 184
    :cond_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 186
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_apply_join_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->setContentView(I)V

    goto :goto_0

    .line 190
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_apply_join_group_emui50:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->setContentView(I)V

    .line 193
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->c()V

    .line 194
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->e()V

    .line 195
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->b()V

    .line 196
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->k()V

    .line 197
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 222
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->g()V

    .line 223
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 224
    return-void
.end method
