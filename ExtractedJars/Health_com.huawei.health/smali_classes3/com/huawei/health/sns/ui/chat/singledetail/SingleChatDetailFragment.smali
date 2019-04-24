.class public Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$b;
    }
.end annotation


# instance fields
.field protected a:Lcom/huawei/health/sns/model/user/User;

.field private l:J

.field private m:Lo/bdp;

.field private o:Lo/bed;

.field private p:Landroid/os/Handler;

.field private r:Lo/bio;

.field private s:Lo/axc;

.field private u:Lo/bdq;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    .line 88
    new-instance v0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$b;-><init>(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)J
    .locals 2

    .line 41
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->l:J

    return-wide v0
.end method

.method private a(I)Z
    .locals 2

    .line 330
    const/4 v1, 0x0

    .line 331
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 335
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->q()V

    .line 336
    const/4 v1, 0x1

    .line 337
    goto :goto_0

    .line 341
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->n()V

    .line 342
    const/4 v1, 0x1

    .line 343
    goto :goto_0

    .line 347
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o()V

    .line 348
    const/4 v1, 0x1

    .line 349
    .line 354
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0xdd01
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b()V
    .locals 4

    .line 154
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 155
    if-eqz v2, :cond_1

    .line 157
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 158
    if-nez v3, :cond_0

    .line 160
    return-void

    .line 162
    :cond_0
    const-string v0, "userId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    const-string v0, "userId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->l:J

    .line 167
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->n()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p()V

    return-void
.end method

.method private d()V
    .locals 3

    .line 124
    new-instance v0, Lo/bed;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lo/bed;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o:Lo/bed;

    .line 125
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->l()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;I)Z
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->a(I)Z

    move-result v0

    return v0
.end method

.method private f()V
    .locals 3

    .line 229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->s:Lo/axc;

    if-nez v0, :cond_0

    .line 231
    new-instance v0, Lo/axc;

    invoke-direct {v0}, Lo/axc;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->s:Lo/axc;

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->s:Lo/axc;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->l:J

    invoke-virtual {v0, v1, v2}, Lo/axc;->d(J)V

    .line 234
    return-void
.end method

.method private g()V
    .locals 4

    .line 190
    new-instance v0, Lo/bdq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bdq;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->u:Lo/bdq;

    .line 191
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->u:Lo/bdq;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 192
    return-void
.end method

.method private h()V
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 183
    return-void
.end method

.method private i()V
    .locals 2

    .line 199
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->u:Lo/bdq;

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->u:Lo/bdq;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 203
    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 175
    return-void
.end method

.method private l()V
    .locals 5

    .line 420
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->r:Lo/bio;

    if-nez v0, :cond_0

    .line 422
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->r:Lo/bio;

    .line 424
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->r:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 425
    return-void
.end method

.method private m()V
    .locals 1

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o:Lo/bed;

    if-eqz v0, :cond_0

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o:Lo/bed;

    invoke-virtual {v0}, Lo/bed;->b()V

    .line 456
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->p()V

    .line 457
    return-void
.end method

.method private n()V
    .locals 2

    .line 369
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 371
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;-><init>(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 382
    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 390
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 392
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->a:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_1

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    if-eqz v0, :cond_0

    .line 396
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->a:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/bdp;->c(Lcom/huawei/health/sns/model/user/User;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    invoke-virtual {v0}, Lo/bdp;->a()Lo/bfq$c;

    move-result-object v0

    invoke-interface {v0}, Lo/bfq$c;->b()V

    goto :goto_0

    .line 401
    :cond_0
    const-string v0, "SingleChatDetailFragment"

    const-string v1, "normalSingleProvider is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o:Lo/bed;

    if-eqz v0, :cond_2

    .line 405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o:Lo/bed;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->a:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/bed;->e(Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_1

    .line 410
    :cond_1
    const-string v0, "SingleChatDetailFragment"

    const-string v1, "updateBindUserData.The user query from DB is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    :cond_2
    :goto_1
    return-void
.end method

.method private p()V
    .locals 1

    .line 432
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->r:Lo/bio;

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->r:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 436
    :cond_0
    return-void
.end method

.method private q()V
    .locals 2

    .line 475
    new-instance v1, Landroid/content/Intent;

    const-string v0, "delete_msg_record"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 476
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 477
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 478
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 208
    new-instance v0, Lo/bdp;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bdp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->c:Lo/bfq;

    .line 210
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bdp;->b(Lo/bfn;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m:Lo/bdp;

    invoke-virtual {v0}, Lo/bdp;->d()V

    .line 212
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 2

    .line 441
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o:Lo/bed;

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->o:Lo/bed;

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v1

    invoke-virtual {v1}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bed;->b(Lo/bfp$c;)V

    .line 448
    :cond_0
    return-void
.end method

.method public e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 2

    .line 218
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_group_info:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->b:Landroid/view/View;

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->list_group:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->e:Landroid/widget/ListView;

    .line 220
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 113
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreate(Landroid/os/Bundle;)V

    .line 115
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->b()V

    .line 117
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 130
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 132
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    sget v3, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->r:Lo/bio;

    .line 133
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->d:Lo/bfm;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 137
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->k()V

    .line 139
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->g()V

    .line 141
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->f()V

    .line 143
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->d()V

    .line 145
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->n()V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 0

    .line 462
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->i()V

    .line 463
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->h()V

    .line 464
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->m()V

    .line 465
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroy()V

    .line 466
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 360
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onResume()V

    .line 361
    return-void
.end method
