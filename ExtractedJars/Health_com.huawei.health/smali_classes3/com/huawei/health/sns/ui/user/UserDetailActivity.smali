.class public Lcom/huawei/health/sns/ui/user/UserDetailActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/bly;
.implements Lo/avk$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/UserDetailActivity$a;
    }
.end annotation


# instance fields
.field private f:J

.field private g:I

.field private h:J

.field private k:I

.field private l:Lcom/huawei/health/sns/model/user/User;

.field private m:Lcom/huawei/health/sns/server/user/Origin;

.field private n:Lo/axd;

.field private o:Z

.field private p:Lcom/huawei/health/sns/server/user/Origin;

.field private q:Lo/bkm;

.field private r:Z

.field private s:Lo/blq;

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Lo/bko;

.field private x:Ljava/lang/String;

.field private z:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 156
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    .line 161
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k:I

    .line 166
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->f:J

    .line 171
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->g:I

    .line 191
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->n:Lo/axd;

    .line 196
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->o:Z

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    .line 211
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->u:Z

    .line 216
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->t:Z

    .line 221
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->r:Z

    .line 226
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->v:Z

    .line 231
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity$a;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    return-void
.end method

.method private A()V
    .locals 5

    .line 1101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 1103
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 1104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->setRelation(I)V

    .line 1105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 1106
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e()Lo/axd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/axd;->c(Lcom/huawei/health/sns/model/user/User;)V

    .line 1107
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w()V

    .line 1108
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/blq;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 1109
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->i()V

    .line 1110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/bko;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 1112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->f:J

    iget-object v4, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bko;->b(Lo/blq;JLjava/lang/String;)V

    .line 1114
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->m()V

    .line 1116
    :cond_0
    return-void
.end method

.method private a(I)V
    .locals 1

    .line 1010
    const/16 v0, 0x3ed

    if-ne p1, v0, :cond_1

    .line 1012
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->t:Z

    if-eqz v0, :cond_0

    .line 1014
    sget v0, Lcom/huawei/android/sns/R$string;->sns_can_not_view_user_detail:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 1018
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_user_not_exist:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1021
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->finish()V

    goto :goto_1

    .line 1023
    :cond_1
    const/16 v0, 0x406

    if-ne p1, v0, :cond_2

    .line 1025
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->y()V

    goto :goto_1

    .line 1029
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    invoke-virtual {v0, p1}, Lo/bko;->d(I)V

    .line 1031
    :goto_1
    return-void
.end method

.method private a(ILjava/lang/String;)V
    .locals 1

    .line 710
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0, p1, p2}, Lo/blq;->b(ILjava/lang/String;)V

    .line 714
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 5

    .line 604
    if-eqz p1, :cond_b

    .line 606
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->d(Landroid/content/Intent;)V

    .line 608
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 609
    if-nez v3, :cond_0

    .line 611
    return-void

    .line 613
    :cond_0
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 615
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    .line 617
    :cond_1
    const-string v0, "bundleKeysrcType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 619
    const-string v0, "bundleKeysrcType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k:I

    .line 621
    :cond_2
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 623
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->f:J

    .line 625
    :cond_3
    const-string v0, "bundleKeyFriendAddType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 627
    const-string v0, "bundleKeyFriendAddType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->g:I

    .line 629
    iget v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->g:I

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 631
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->g:I

    .line 634
    :cond_4
    const-string v0, "bundleKeyIsNeedGobackToHomeActivity"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 636
    const-string v0, "bundleKeyIsNeedGobackToHomeActivity"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->v:Z

    .line 639
    :cond_5
    const-string v0, "sns_frd_origin"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 641
    const-string v0, "sns_frd_origin"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/Origin;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->p:Lcom/huawei/health/sns/server/user/Origin;

    .line 644
    :cond_6
    const-string v0, "sns_my_origin"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 646
    const-string v0, "sns_my_origin"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/Origin;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->m:Lcom/huawei/health/sns/server/user/Origin;

    .line 647
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->m:Lcom/huawei/health/sns/server/user/Origin;

    if-eqz v0, :cond_7

    .line 648
    const-string v0, ""

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UserDetailView myOrigin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->m:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 650
    :cond_7
    const-string v0, ""

    const-string v1, "UserDetailView myOrigin:null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    :cond_8
    :goto_0
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 656
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x:Ljava/lang/String;

    .line 657
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x:Ljava/lang/String;

    invoke-static {p0, v0}, Lo/bnx;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 658
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    const/16 v1, 0x8

    invoke-direct {v0, v1, v4}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->p:Lcom/huawei/health/sns/server/user/Origin;

    .line 659
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    const/16 v1, 0x8

    invoke-direct {v0, v1, v4}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->m:Lcom/huawei/health/sns/server/user/Origin;

    .line 660
    const-string v0, ""

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UserDetailView third business frdOrigin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->p:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    :cond_9
    const-string v0, "sns_sdk_key_friend_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 671
    const-string v0, "sns_sdk_key_friend_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    .line 675
    :cond_a
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->t:Z

    invoke-static {p1, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->t:Z

    .line 677
    :cond_b
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 3

    .line 377
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 378
    const/4 v2, 0x0

    .line 379
    if-eqz v1, :cond_0

    .line 381
    const-string v0, "userCircleListBundleKey"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 382
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->d(Ljava/util/List;)V

    .line 384
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->t()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Bundle;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method private b(I)V
    .locals 1

    .line 807
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0, p1}, Lo/blq;->c(I)V

    .line 808
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 4

    .line 486
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 487
    if-eqz v1, :cond_0

    .line 489
    const-string v0, "bundleKeyNotifyNoteList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 490
    const-string v0, "bundle_sensitive_tip"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 491
    if-eqz v2, :cond_0

    .line 493
    invoke-direct {p0, v2, v3}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->c(Ljava/util/List;Ljava/lang/String;)V

    .line 496
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Bundle;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Message;)Z
    .locals 1

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->d(Landroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 2

    .line 355
    if-eqz p1, :cond_1

    .line 357
    const-string v0, "bundleKeyUser"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/model/user/User;

    .line 358
    if-eqz v1, :cond_0

    .line 360
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e(Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_0

    .line 365
    :cond_0
    const/16 v0, 0x3ed

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a(I)V

    .line 368
    :cond_1
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/user/UserNotify$b;)V
    .locals 1

    .line 817
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0, p1}, Lo/blq;->c(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 818
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 940
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 942
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 943
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/blq;->c(Lcom/huawei/health/sns/model/user/User;)V

    .line 944
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/bko;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 945
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->h()V

    .line 949
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e()Lo/axd;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    invoke-virtual {v0, v1, v2, p1}, Lo/axd;->b(JLjava/lang/String;)V

    .line 950
    return-void
.end method

.method private c(Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 828
    iget v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->r()Z

    move-result v0

    if-nez v0, :cond_1

    .line 830
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 832
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0, p1, p2}, Lo/blq;->e(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    .line 836
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/blq;->e(Ljava/util/List;Ljava/lang/String;)V

    .line 839
    :cond_1
    :goto_0
    return-void
.end method

.method private c(Z)V
    .locals 2

    .line 985
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->o:Z

    .line 986
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 987
    return-void
.end method

.method private c(Landroid/os/Message;)Z
    .locals 4

    .line 408
    const/4 v1, 0x0

    .line 409
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 413
    :sswitch_0
    iget v2, p1, Landroid/os/Message;->arg1:I

    .line 414
    iget v3, p1, Landroid/os/Message;->arg2:I

    .line 415
    invoke-static {v2, v3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 416
    const/4 v1, 0x1

    .line 417
    goto :goto_0

    .line 423
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a(I)V

    .line 424
    const/4 v1, 0x1

    .line 425
    goto :goto_0

    .line 429
    :sswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_cisserver_busy:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 430
    const/4 v1, 0x1

    .line 431
    .line 436
    :goto_0
    return v1

    :sswitch_data_0
    .sparse-switch
        0x23 -> :sswitch_1
        0xc1 -> :sswitch_1
        0xe2 -> :sswitch_1
        0x4b2 -> :sswitch_2
        0xaaa -> :sswitch_0
    .end sparse-switch
.end method

.method private d(Landroid/content/Intent;)V
    .locals 2

    .line 681
    const-string v0, "activity_open_from_notification_flag"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 683
    const-string v0, "activity_open_from_notification_flag"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->r:Z

    .line 686
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/User;Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)V"
        }
    .end annotation

    .line 733
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    .line 736
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k:I

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->r()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/blq;->e(IZ)V

    .line 739
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->n()V

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0, p1}, Lo/blq;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 744
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0, p2}, Lo/blq;->e(Ljava/util/List;)V

    .line 746
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    invoke-virtual {v0, p1}, Lo/bko;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 749
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->o()V

    .line 752
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->m()V

    .line 755
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->u()V

    .line 756
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)V"
        }
    .end annotation

    .line 773
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0, p1}, Lo/blq;->e(Ljava/util/List;)V

    .line 774
    return-void
.end method

.method private d(Landroid/os/Message;)Z
    .locals 2

    .line 446
    const/4 v1, 0x0

    .line 447
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 451
    :sswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->b(Landroid/os/Message;)V

    .line 452
    const/4 v1, 0x1

    .line 453
    goto :goto_0

    .line 457
    :sswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a()V

    .line 458
    const/4 v1, 0x1

    .line 459
    goto :goto_0

    .line 463
    :sswitch_2
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e(Landroid/os/Message;)V

    .line 464
    const/4 v1, 0x1

    .line 465
    goto :goto_0

    .line 469
    :sswitch_3
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a(Landroid/os/Message;)V

    .line 470
    const/4 v1, 0x1

    .line 471
    .line 476
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x21 -> :sswitch_2
        0x28 -> :sswitch_0
        0x4b0 -> :sswitch_1
        0x4b1 -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Message;)Z
    .locals 1

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->c(Landroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method private e(Landroid/os/Bundle;)V
    .locals 4

    .line 323
    const/4 v2, 0x0

    .line 324
    const/4 v3, 0x0

    .line 325
    if-eqz p1, :cond_3

    .line 327
    const-string v0, "bundleKeyUser"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 328
    const-string v0, "userCircleListBundleKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    const-string v0, "userCircleListBundleKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 332
    :cond_0
    const-string v0, "bundleKeyNotifySide"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    const-string v0, "bundleKeyNotifySide"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->b(I)V

    .line 336
    :cond_1
    const-string v0, "bundleKeyNotifyType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 338
    const-string v0, "bundleKeyNotifyType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->e(I)Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->c(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 340
    :cond_2
    const-string v0, "bundleKeyNotifyType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "bundleKeyGroupNickname"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 342
    const-string v0, "bundleKeyNotifyType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "bundleKeyGroupNickname"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a(ILjava/lang/String;)V

    .line 345
    :cond_3
    invoke-direct {p0, v2, v3}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->d(Lcom/huawei/health/sns/model/user/User;Ljava/util/List;)V

    .line 346
    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 3

    .line 393
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 394
    if-eqz v1, :cond_0

    .line 396
    const-string v0, "keyBundleremarkName"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 397
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->c(Ljava/lang/String;)V

    .line 399
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 883
    new-instance v0, Lo/bki;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v0, v1, p1}, Lo/bki;-><init>(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/user/User;)V

    invoke-virtual {v0}, Lo/bki;->d()Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    .line 884
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/bko;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 885
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/blq;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 886
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z()V

    return-void
.end method

.method private g()V
    .locals 2

    .line 524
    sget v0, Lcom/huawei/android/sns/R$id;->null_bottom_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 526
    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 528
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 532
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 534
    :goto_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 594
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 595
    const/4 v0, 0x1

    invoke-static {p0, v0, v2}, Lo/biq;->c(Landroid/app/Activity;I[Ljava/lang/String;)V

    .line 597
    return-void
.end method

.method private j()V
    .locals 7

    .line 1201
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    move-object v1, p0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    iget-object v6, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lo/aow;->a(Landroid/content/Context;JJLjava/lang/String;)V

    .line 1203
    return-void
.end method

.method private k()V
    .locals 3

    .line 567
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 572
    goto :goto_0

    .line 569
    :catch_0
    move-exception v2

    .line 571
    const-string v0, "UserDetailActivity"

    const-string v1, "loadUserInfo Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h()V

    .line 578
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->p()V

    .line 581
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l()V

    .line 583
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 585
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->j()V

    .line 587
    :cond_0
    return-void
.end method

.method private l()V
    .locals 7

    .line 721
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e()Lo/axd;

    move-result-object v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->f:J

    iget v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k:I

    const/4 v6, 0x1

    if-ne v1, v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const/16 v1, 0x26

    invoke-virtual/range {v0 .. v6}, Lo/axd;->d(IJJZ)V

    .line 723
    return-void
.end method

.method private m()V
    .locals 4

    .line 763
    invoke-static {}, Lo/aru;->d()Lo/aru;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    const/16 v3, 0x4b1

    invoke-virtual {v0, v1, v3, v2}, Lo/aru;->d(Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)V

    .line 764
    return-void
.end method

.method private n()V
    .locals 1

    .line 781
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->d()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->c(Z)V

    .line 782
    return-void
.end method

.method private o()V
    .locals 5

    .line 789
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 791
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    invoke-virtual {v0}, Lo/bko;->a()V

    goto :goto_0

    .line 796
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->f:J

    iget-object v4, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bko;->b(Lo/blq;JLjava/lang/String;)V

    .line 798
    :goto_0
    return-void
.end method

.method private p()V
    .locals 7

    .line 693
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    if-nez v0, :cond_0

    .line 695
    new-instance v0, Lo/blq;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    iget-object v6, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->x:Ljava/lang/String;

    move-object v1, p0

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lo/blq;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Lo/bly;Landroid/os/Handler;JLjava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    .line 698
    :cond_0
    new-instance v0, Lo/bko;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bko;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Handler;J)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    .line 699
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->g:I

    iget v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k:I

    invoke-virtual {v0, v1, v2}, Lo/blq;->d(II)V

    .line 700
    return-void
.end method

.method private q()V
    .locals 4

    .line 893
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->u:Z

    if-nez v0, :cond_0

    .line 895
    new-instance v0, Lo/bkm;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkm;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->q:Lo/bkm;

    .line 898
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$l;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->q:Lo/bkm;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 900
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->u:Z

    .line 902
    :cond_0
    return-void
.end method

.method private r()Z
    .locals 1

    .line 848
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    .line 849
    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->isAlreadyFriend()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 848
    :goto_0
    return v0
.end method

.method private s()V
    .locals 2

    .line 909
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->u:Z

    if-eqz v0, :cond_0

    .line 911
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->q:Lo/bkm;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 913
    :cond_0
    return-void
.end method

.method private t()V
    .locals 4

    .line 873
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e()Lo/axd;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    const/16 v3, 0x28

    invoke-virtual {v0, v3, v1, v2}, Lo/axd;->d(IJ)V

    .line 874
    return-void
.end method

.method private u()V
    .locals 2

    .line 858
    iget v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->r()Z

    move-result v0

    if-nez v0, :cond_0

    .line 861
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/bap;->a(Landroid/os/Handler;)V

    .line 863
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->t()V

    .line 864
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->q()V

    .line 866
    :cond_0
    return-void
.end method

.method private v()V
    .locals 1

    .line 931
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->e()V

    .line 932
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    invoke-virtual {v0}, Lo/bko;->e()V

    .line 933
    return-void
.end method

.method private w()V
    .locals 1

    .line 1060
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->k()V

    .line 1061
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->c(Z)V

    .line 1062
    return-void
.end method

.method private x()V
    .locals 1

    .line 1001
    sget v0, Lcom/huawei/android/sns/R$string;->sns_have_invited:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1002
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->finish()V

    .line 1003
    return-void
.end method

.method private y()V
    .locals 6

    .line 1038
    move-object v0, p0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_manager_family_group_member_bind_phone_tip:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_set_up_later:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_set_up_now:I

    new-instance v5, Lcom/huawei/health/sns/ui/user/UserDetailActivity$1;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity$1;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1053
    return-void
.end method

.method private z()V
    .locals 2

    .line 957
    sget v0, Lcom/huawei/android/sns/R$string;->sns_have_deleted:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 958
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->v:Z

    if-eqz v0, :cond_0

    .line 962
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bko;->c(Z)V

    .line 964
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->finish()V

    .line 965
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1093
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->A()V

    .line 1094
    return-void
.end method

.method public b()V
    .locals 4

    .line 1121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 1123
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1124
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1125
    new-instance v0, Lo/asr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asr;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lo/asr;->c(JLjava/util/ArrayList;)V

    .line 1127
    :cond_0
    return-void
.end method

.method public c()[Lcom/huawei/health/sns/server/user/Origin;
    .locals 3

    .line 1132
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/health/sns/server/user/Origin;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->p:Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->m:Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 547
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->d:Landroid/view/View;

    .line 548
    return-void
.end method

.method public e()Lo/axd;
    .locals 2

    .line 1071
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->n:Lo/axd;

    if-nez v0, :cond_0

    .line 1073
    new-instance v0, Lo/axd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/axd;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->n:Lo/axd;

    .line 1075
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->n:Lo/axd;

    return-object v0
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 6

    .line 1140
    sget-object v0, Lo/auu$b;->b:Lo/auu$b;

    if-eq p1, v0, :cond_0

    .line 1142
    return-void

    .line 1146
    :cond_0
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->b(Landroid/os/Bundle;)J

    move-result-wide v2

    .line 1147
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    .line 1149
    return-void

    .line 1153
    :cond_1
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->e(Landroid/os/Bundle;)I

    move-result v4

    .line 1154
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    if-eq v4, v0, :cond_2

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    if-ne v4, v0, :cond_3

    .line 1156
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 1157
    const/16 v0, 0x4b0

    iput v0, v5, Landroid/os/Message;->what:I

    .line 1158
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->z:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1160
    :cond_3
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1208
    const/16 v0, 0x7d4

    if-ne p1, v0, :cond_0

    .line 1210
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 1212
    const-string v0, "UserDetailActivity"

    const-string v1, "onSuccess, bind phone result."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->a()V

    .line 1217
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1218
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1169
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->r:Z

    if-eqz v0, :cond_0

    .line 1171
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bko;->c(Z)V

    .line 1173
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 1174
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1179
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1180
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->g()V

    .line 1181
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 501
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 503
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 504
    if-eqz v3, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 506
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 509
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_detail_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->setContentView(I)V

    .line 510
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->g()V

    .line 511
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k()V

    .line 514
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->i:Lo/avk$b;

    invoke-virtual {v0, v1, p0}, Lo/avk;->c(Lo/avk$b;Lo/avk$d;)V

    .line 517
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.sns.local_action_read_notify"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 518
    const-string v0, "userId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->h:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 519
    invoke-static {v4}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 520
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 918
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s()V

    .line 921
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->i:Lo/avk$b;

    invoke-virtual {v0, v1}, Lo/avk;->c(Lo/avk$b;)V

    .line 922
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->v()V

    .line 923
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 924
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1081
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->t:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 1085
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->finish()V

    .line 1087
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 539
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 540
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->setIntent(Landroid/content/Intent;)V

    .line 541
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->k()V

    .line 542
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    invoke-virtual {v0, p1}, Lo/bko;->d(Landroid/view/MenuItem;)V

    .line 993
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 970
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 971
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->o:Z

    if-eqz v0, :cond_0

    .line 973
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->w:Lo/bko;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->l:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, p1, v1}, Lo/bko;->e(Landroid/view/Menu;Lcom/huawei/health/sns/model/user/User;)V

    .line 975
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1186
    if-eqz p3, :cond_0

    array-length v0, p3

    if-lez v0, :cond_0

    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1188
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1190
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    .line 1191
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->i()V

    .line 1194
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 553
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 554
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->s:Lo/blq;

    invoke-virtual {v0}, Lo/blq;->i()V

    .line 555
    return-void
.end method
