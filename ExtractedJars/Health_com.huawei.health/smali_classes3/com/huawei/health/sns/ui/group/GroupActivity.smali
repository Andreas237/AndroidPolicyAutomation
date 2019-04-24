.class public Lcom/huawei/health/sns/ui/group/GroupActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/bgv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/GroupActivity$b;
    }
.end annotation


# instance fields
.field private f:Z

.field private g:Lcom/huawei/health/sns/model/group/Group;

.field private h:Z

.field private k:Lcom/huawei/health/sns/ui/group/GroupFragment;

.field private l:Z

.field private m:Landroid/os/Handler;

.field private n:Z

.field private o:Z

.field private p:Z

.field private r:Lo/bio;

.field private s:Z

.field private t:Lo/bgi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->k:Lcom/huawei/health/sns/ui/group/GroupFragment;

    .line 115
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->h:Z

    .line 125
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->f:Z

    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->p:Z

    .line 145
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/GroupActivity$b;-><init>(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->m:Landroid/os/Handler;

    .line 150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->o:Z

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->n:Z

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->r:Lo/bio;

    return-void
.end method

.method private a()V
    .locals 3

    .line 448
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    new-instance v2, Lcom/huawei/health/sns/ui/group/GroupActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/GroupActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->e(Lo/brd;Lo/brc;)Lo/bqy;

    .line 466
    return-void
.end method

.method private a(II)V
    .locals 1

    .line 792
    const/16 v0, 0x3f0

    if-eq p2, v0, :cond_0

    const/16 v0, 0x3f2

    if-ne p2, v0, :cond_1

    .line 795
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->u()V

    .line 796
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->t()V

    goto :goto_0

    .line 800
    :cond_1
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 802
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 1

    .line 270
    if-eqz p1, :cond_0

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->k:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(Landroid/content/Intent;)V

    .line 274
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->t()V

    return-void
.end method

.method private b()V
    .locals 2

    .line 331
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/axf;->d(I)V

    .line 332
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .line 281
    if-eqz p1, :cond_4

    .line 286
    const-string v0, "activity_open_from_notification_flag"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    const-string v0, "activity_open_from_notification_flag"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->p:Z

    .line 293
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 294
    if-nez v2, :cond_1

    .line 296
    return-void

    .line 307
    :cond_1
    const-string v0, "sns_sdk_key_caller_info"

    :try_start_1
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 310
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->c()Lo/bgi;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/bgi;->c(Landroid/os/Bundle;)V

    .line 311
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->n:Z

    .line 314
    :cond_2
    const-string v0, "isFromHmsCreate"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 316
    const-string v0, "isFromHmsCreate"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->s:Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 322
    :cond_3
    goto :goto_0

    .line 319
    :catch_0
    move-exception v2

    .line 321
    const-string v0, "GroupActivity"

    const-string v1, "getIntentData Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    :cond_4
    :goto_0
    return-void
.end method

.method private b(Landroid/view/MenuItem;)V
    .locals 1

    .line 413
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 414
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->e()V

    return-void
.end method

.method private b(Z)V
    .locals 0

    .line 852
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->o:Z

    .line 853
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->w()V

    .line 854
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupActivity;Z)Z
    .locals 0

    .line 73
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->f:Z

    return p1
.end method

.method private c()Lo/bgi;
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->t:Lo/bgi;

    if-nez v0, :cond_0

    .line 338
    new-instance v0, Lo/bgi;

    invoke-direct {v0}, Lo/bgi;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->t:Lo/bgi;

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->t:Lo/bgi;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->w()V

    return-void
.end method

.method private d(Landroid/view/MenuItem;)V
    .locals 1

    .line 423
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 424
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->v()V

    return-void
.end method

.method private e()V
    .locals 2

    .line 232
    new-instance v1, Landroid/content/Intent;

    const-string v0, "QUIT_GROUP_ACTION"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 233
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 234
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 235
    return-void
.end method

.method private e(Landroid/view/Menu;)V
    .locals 2

    .line 350
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->s()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->s:Z

    if-eqz v0, :cond_1

    .line 352
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_group_menu_sdk50:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    goto :goto_0

    .line 356
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_group_menu_emui50:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 358
    :goto_0
    return-void
.end method

.method private e(Landroid/view/MenuItem;)V
    .locals 1

    .line 433
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    if-eqz v0, :cond_0

    .line 435
    sget v0, Lcom/huawei/android/sns/R$string;->sns_menu_group_dismiss:I

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    goto :goto_0

    .line 439
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_menu_grp_exit:I

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    .line 441
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->u()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupActivity;II)V
    .locals 0

    .line 73
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->a(II)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupActivity;Z)Z
    .locals 0

    .line 73
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->h:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/GroupActivity;)Landroid/os/Handler;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->m:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 599
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 600
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 601
    const-string v0, "groupId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 602
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/GroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 603
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/GroupActivity;)Z
    .locals 1

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->k()Z

    move-result v0

    return v0
.end method

.method private h()Z
    .locals 3

    .line 477
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 478
    if-eqz v2, :cond_0

    .line 480
    const-string v0, "com.huawei.locationsharing"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 481
    const/4 v0, 0x1

    return v0

    .line 487
    :cond_0
    goto :goto_0

    .line 484
    :catch_0
    move-exception v2

    .line 486
    const-string v0, "GroupActivity"

    const-string v1, "location sharing is not exist."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 489
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/GroupActivity;)Z
    .locals 1

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->q()V

    return-void
.end method

.method private k()Z
    .locals 13

    .line 499
    const/4 v6, 0x0

    .line 502
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    .line 503
    const-string v8, "content://com.huawei.gallery3d.photoshare.provider/is_support_family_share"

    .line 504
    move-object v0, v7

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v6, v0

    .line 506
    if-nez v6, :cond_0

    .line 508
    const-string v0, "GroupActivity"

    const-string v1, "isGallerySupportFamilyShare cursor is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    :cond_0
    :goto_0
    if-eqz v6, :cond_4

    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 513
    const-string v0, "is_support_family_share"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 514
    const/4 v0, -0x1

    if-ne v9, v0, :cond_1

    .line 516
    const-string v0, "GroupActivity"

    const-string v1, "index -1"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    goto :goto_0

    .line 519
    :cond_1
    invoke-interface {v6, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 520
    const-string v0, "GroupActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isSupportFamilyShare:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "true"

    .line 522
    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 524
    const/4 v11, 0x1

    .line 538
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 540
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 541
    const/4 v6, 0x0

    .line 524
    :cond_2
    return v11

    .line 526
    :cond_3
    goto :goto_0

    .line 538
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 540
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 541
    const/4 v6, 0x0

    goto :goto_1

    .line 528
    :catch_0
    move-exception v7

    .line 530
    const-string v0, "GroupActivity"

    const-string v1, "isGallerySupportFamilyShare SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 538
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 540
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 541
    const/4 v6, 0x0

    goto :goto_1

    .line 532
    :catch_1
    move-exception v7

    .line 534
    const-string v0, "GroupActivity"

    const-string v1, "isGallerySupportFamilyShare IllegalArgumentException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 538
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 540
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 541
    const/4 v6, 0x0

    goto :goto_1

    .line 538
    :catchall_0
    move-exception v12

    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 540
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 541
    const/4 v6, 0x0

    .line 543
    :cond_5
    throw v12

    .line 545
    :cond_6
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private l()V
    .locals 5

    .line 641
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 642
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 643
    const-string v0, "com.huawei.category.locationsharing"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 644
    const-string v0, "com.huawei.locationsharing"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 646
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 647
    const-string v0, "groupId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 649
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 650
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/GroupActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 655
    goto :goto_0

    .line 652
    :catch_0
    move-exception v3

    .line 654
    const-string v0, "GroupActivity"

    const-string v1, "openLocationShareApp exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    :goto_0
    return-void
.end method

.method private m()V
    .locals 4

    .line 752
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 753
    const-string v0, "complain_category_type"

    const/4 v1, 0x3

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 754
    const-string v0, "complain_id"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 755
    const-string v0, "complain_info"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 756
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/GroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 757
    return-void
.end method

.method private n()V
    .locals 7

    .line 610
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v3

    .line 614
    :try_start_0
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 615
    const-string v0, "com.huawei.android.intent.action.GET_FAMILY_PHOTOS"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 616
    const-string v0, "com.android.gallery3d"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 617
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 619
    const-string v0, "familyID"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    const-string v0, "userID"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    const-string v0, "groupName"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 623
    const/high16 v0, 0x4000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 624
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 625
    invoke-virtual {p0, v5}, Lcom/huawei/health/sns/ui/group/GroupActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 630
    goto :goto_0

    .line 627
    :catch_0
    move-exception v5

    .line 629
    const-string v0, "GroupActivity"

    const-string v1, "openGalleryShareApp exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 632
    :goto_0
    return-void
.end method

.method private o()V
    .locals 4

    .line 739
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 740
    const-class v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 741
    const-string v0, "select_mode"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 742
    const-string v0, "isContainSelf"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 743
    const-string v0, "isTransferGroup"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 744
    const-string v0, "groupId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 745
    const-string v0, "transferGroupType"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 746
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/GroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 747
    return-void
.end method

.method private p()V
    .locals 9

    .line 663
    const/4 v6, 0x0

    .line 664
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 666
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    if-eqz v0, :cond_0

    .line 668
    sget v0, Lcom/huawei/android/sns/R$string;->sns_menu_group_dismiss:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 669
    sget v0, Lcom/huawei/android/sns/R$string;->sns_confirm_dismiss_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 670
    sget v8, Lcom/huawei/android/sns/R$string;->sns_next_button:I

    goto :goto_0

    .line 674
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_menu_grp_exit:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 675
    sget v0, Lcom/huawei/android/sns/R$string;->sns_confirm_quit_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 676
    sget v8, Lcom/huawei/android/sns/R$string;->sns_btn_quit:I

    .line 678
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_alert_group_name:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 680
    move-object v0, p0

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v6

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    move v4, v8

    new-instance v5, Lcom/huawei/health/sns/ui/group/GroupActivity$1;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/group/GroupActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 704
    return-void
.end method

.method private q()V
    .locals 3

    .line 834
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    if-nez v0, :cond_0

    .line 836
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->z()V

    .line 839
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 841
    new-instance v0, Lo/asv;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->m:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asv;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    iget-boolean v2, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    invoke-virtual {v0, p0, v1, v2}, Lo/asv;->b(Landroid/content/Context;Lcom/huawei/health/sns/model/group/Group;Z)V

    .line 843
    :cond_1
    return-void
.end method

.method private r()V
    .locals 1

    .line 825
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->c()Lo/bgi;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bgi;->b(Landroid/app/Activity;)V

    .line 826
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->finish()V

    .line 827
    return-void
.end method

.method private s()Z
    .locals 1

    .line 781
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->n:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->c()Lo/bgi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bgi;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private t()V
    .locals 1

    .line 809
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 812
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->r()V

    goto :goto_0

    .line 816
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->finish()V

    .line 818
    :goto_0
    return-void
.end method

.method private u()V
    .locals 1

    .line 764
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    if-eqz v0, :cond_0

    .line 766
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_dismiss_succeed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 770
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_grp_quit_succeed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 772
    :goto_0
    return-void
.end method

.method private v()V
    .locals 1

    .line 896
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->r:Lo/bio;

    if-eqz v0, :cond_0

    .line 898
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->r:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 900
    :cond_0
    return-void
.end method

.method private w()V
    .locals 2

    .line 861
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 862
    return-void
.end method

.method private x()V
    .locals 5

    .line 869
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->k:Lcom/huawei/health/sns/ui/group/GroupFragment;

    .line 870
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 871
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 872
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_grouplist_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->k:Lcom/huawei/health/sns/ui/group/GroupFragment;

    const-string v2, "groupFragment"

    invoke-virtual {v4, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 873
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 874
    return-void
.end method

.method private y()V
    .locals 3

    .line 961
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 962
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 963
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 964
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 965
    return-void
.end method

.method private z()V
    .locals 4

    .line 907
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->r:Lo/bio;

    if-nez v0, :cond_0

    .line 909
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->r:Lo/bio;

    .line 911
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->r:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 912
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 879
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    .line 880
    if-eqz p1, :cond_1

    .line 882
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->l:Z

    .line 883
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Z)V

    goto :goto_1

    .line 887
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Z)V

    .line 889
    :goto_1
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 939
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 941
    const/16 v0, 0x7d3

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7d5

    if-ne p1, v0, :cond_1

    .line 944
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->q()V

    goto :goto_0

    .line 946
    :cond_1
    const/16 v0, 0x7d4

    if-ne p1, v0, :cond_2

    .line 948
    const-string v0, "GroupActivity"

    const-string v1, "onSuccess, bind phone result."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 950
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->a()V

    .line 953
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 954
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 924
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 926
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->r()V

    .line 929
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->p:Z

    if-eqz v0, :cond_1

    .line 931
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->y()V

    .line 933
    :cond_1
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 934
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 917
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 918
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 919
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 240
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 242
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 243
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 248
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_list_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->setContentView(I)V

    .line 249
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->a()V

    .line 250
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Landroid/content/Intent;)V

    .line 251
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b()V

    .line 252
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->x()V

    .line 253
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 258
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 259
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Landroid/content/Intent;)V

    .line 260
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->a(Landroid/content/Intent;)V

    .line 261
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 551
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 552
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    if-ne v1, v0, :cond_0

    .line 554
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->g()V

    goto :goto_0

    .line 556
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_gallery:I

    if-ne v1, v0, :cond_1

    .line 559
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->n()V

    goto :goto_0

    .line 561
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_location:I

    if-ne v1, v0, :cond_2

    .line 564
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->l()V

    goto :goto_0

    .line 566
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_exit:I

    if-ne v1, v0, :cond_3

    .line 568
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->p()V

    goto :goto_0

    .line 570
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_complete:I

    if-ne v1, v0, :cond_5

    .line 572
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 574
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->r()V

    goto :goto_0

    .line 578
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->finish()V

    goto :goto_0

    .line 581
    :cond_5
    sget v0, Lcom/huawei/android/sns/R$id;->menu_transfer_group:I

    if-ne v1, v0, :cond_6

    .line 583
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->o()V

    goto :goto_0

    .line 585
    :cond_6
    sget v0, Lcom/huawei/android/sns/R$id;->menu_complain:I

    if-ne v1, v0, :cond_7

    .line 587
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->m()V

    .line 589
    :cond_7
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 5

    .line 363
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 364
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->o:Z

    if-eqz v0, :cond_6

    .line 366
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->e(Landroid/view/Menu;)V

    .line 368
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v1

    .line 369
    const/4 v2, 0x0

    .line 370
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_6

    .line 372
    invoke-interface {p1, v3}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 373
    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    .line 374
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    if-ne v4, v0, :cond_0

    .line 376
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 377
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Landroid/view/MenuItem;)V

    goto :goto_1

    .line 379
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_gallery:I

    if-ne v4, v0, :cond_1

    .line 381
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->h:Z

    invoke-interface {v2, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_1

    .line 383
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_location:I

    if-ne v4, v0, :cond_2

    .line 385
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity;->f:Z

    invoke-interface {v2, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_1

    .line 387
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_exit:I

    if-ne v4, v0, :cond_3

    .line 389
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->e(Landroid/view/MenuItem;)V

    goto :goto_1

    .line 391
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$id;->menu_transfer_group:I

    if-ne v4, v0, :cond_4

    .line 393
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->d(Landroid/view/MenuItem;)V

    goto :goto_1

    .line 395
    :cond_4
    sget v0, Lcom/huawei/android/sns/R$id;->menu_complain:I

    if-ne v4, v0, :cond_5

    .line 397
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 398
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Landroid/view/MenuItem;)V

    .line 370
    :cond_5
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 402
    :cond_6
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method
