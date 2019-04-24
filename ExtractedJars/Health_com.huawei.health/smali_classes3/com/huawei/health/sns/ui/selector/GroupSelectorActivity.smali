.class public Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;
.super Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;
.source "SourceFile"

# interfaces
.implements Lo/bni$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$d;
    }
.end annotation


# instance fields
.field private D:Landroid/os/Handler;

.field private j:Lo/bio;

.field protected l:Landroid/widget/FrameLayout;

.field protected n:Lo/bni;

.field private q:Lo/atd;

.field private r:I

.field private s:Lo/asz;

.field private t:Landroid/widget/ListView;

.field private u:Lo/bjg;

.field private v:Z

.field private w:Landroid/app/AlertDialog;

.field private x:Lo/bgp;

.field private y:Lo/bgn;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;-><init>()V

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    .line 108
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->r:I

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->u:Lo/bjg;

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->q:Lo/atd;

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->s:Lo/asz;

    .line 148
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    .line 153
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->v:Z

    .line 163
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->j:Lo/bio;

    .line 168
    new-instance v0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$d;-><init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->D:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)Lo/bjg;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->u:Lo/bjg;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 357
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 358
    if-eqz v2, :cond_1

    .line 360
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 362
    sget v0, Lcom/huawei/android/sns/R$string;->sns_select_family:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 366
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_select_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 369
    :cond_1
    :goto_0
    return-void
.end method

.method private a(JLjava/lang/String;)V
    .locals 2

    .line 1010
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    if-eqz v0, :cond_0

    .line 1012
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, p2, v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->setShareInfo(JI)V

    .line 1013
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, p3, v1}, Lo/apz;->d(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)V

    .line 1015
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;JLjava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->d(JLjava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/GroupListData;I)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e(Lcom/huawei/health/sns/model/group/GroupListData;I)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    .line 901
    const/16 v2, 0x71

    .line 902
    if-eqz p1, :cond_0

    .line 904
    const/16 v2, 0x72

    .line 907
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 909
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t()Lo/atd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lo/atd;->b(II)V

    goto :goto_0

    .line 911
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    if-nez v0, :cond_2

    .line 914
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t()Lo/atd;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/atd;->d(I)V

    goto :goto_0

    .line 918
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t()Lo/atd;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v2, v1}, Lo/atd;->b(II)V

    .line 920
    :goto_0
    return-void
.end method

.method private b()V
    .locals 4

    .line 387
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->j:Lo/bio;

    if-nez v0, :cond_0

    .line 389
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->j:Lo/bio;

    .line 392
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 394
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 396
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->j:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 399
    :cond_1
    return-void
.end method

.method private b(I)V
    .locals 0

    .line 281
    if-nez p1, :cond_0

    .line 283
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->m()V

    goto :goto_0

    .line 287
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->p()V

    .line 289
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 7

    .line 651
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 653
    return-void

    .line 655
    :cond_0
    iget-object v4, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->h:Ljava/util/ArrayList;

    .line 656
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 658
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, v1}, Lo/bji;->a(Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Ljava/util/ArrayList;

    move-result-object v4

    goto :goto_0

    .line 660
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_2

    .line 662
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bji;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 664
    :cond_2
    :goto_0
    new-instance v5, Lo/axv;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    .line 665
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v5, v0, v1, v3, v2}, Lo/axv;-><init>(JILjava/lang/String;)V

    .line 667
    new-instance v6, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$3;

    invoke-direct {v6, p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$3;-><init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/Group;)V

    .line 681
    new-instance v0, Lo/bjs;

    invoke-direct {v0, p0}, Lo/bjs;-><init>(Landroid/content/Context;)V

    .line 682
    invoke-virtual {v0, v5}, Lo/bjs;->a(Lo/axv;)Lo/bjs;

    move-result-object v0

    .line 683
    invoke-virtual {v0, v4}, Lo/bjs;->e(Ljava/util/ArrayList;)Lo/bjs;

    move-result-object v0

    .line 684
    invoke-virtual {v0, v6}, Lo/bjs;->d(Lo/bjw;)Lo/bjs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    .line 685
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 686
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->h()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;III)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(III)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Z)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a(Z)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->r:I

    return v0
.end method

.method private static c(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 878
    new-instance v0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;

    invoke-direct {v0, p1, p2, p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;-><init>(JLcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V

    return-object v0
.end method

.method private c()V
    .locals 1

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->j:Lo/bio;

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->j:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 380
    :cond_0
    return-void
.end method

.method private c(III)V
    .locals 1

    .line 300
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 302
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(I)V

    goto :goto_0

    .line 306
    :cond_0
    const/16 v0, 0x3f8

    if-ne p2, v0, :cond_1

    .line 308
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->p()V

    .line 309
    return-void

    .line 311
    :cond_1
    if-nez p3, :cond_2

    .line 313
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o()V

    goto :goto_0

    .line 317
    :cond_2
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 318
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->p()V

    .line 322
    :goto_0
    return-void
.end method

.method private c(J)V
    .locals 2

    .line 866
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 867
    return-void
.end method

.method private c(JLjava/lang/String;)V
    .locals 7

    .line 696
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_2

    .line 698
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 700
    return-void

    .line 702
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a(JLjava/lang/String;)V

    .line 704
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 706
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->d(J)V

    .line 708
    :cond_1
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 709
    const-string v0, "is_share_msg"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 710
    const-string v0, "groupId"

    invoke-virtual {v6, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 711
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v6}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 712
    goto :goto_0

    .line 713
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_3

    .line 715
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-object v1, p3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->h:Ljava/util/ArrayList;

    invoke-static {v2}, Lo/bfg;->e(Ljava/util/ArrayList;)[Ljava/lang/String;

    move-result-object v2

    move-wide v3, p1

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/apz;->d(Ljava/lang/String;[Ljava/lang/String;JI)V

    .line 716
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setResult(I)V

    goto :goto_0

    .line 718
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_4

    .line 720
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-object v1, p3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->p:Ljava/lang/String;

    move-wide v3, p1

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/apz;->d(Ljava/lang/String;Ljava/lang/String;JI)V

    .line 721
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setResult(I)V

    .line 723
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e()V

    .line 724
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->finish()V

    .line 725
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 7

    .line 760
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 762
    return-void

    .line 764
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/axa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 765
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 767
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 770
    :cond_1
    move-object v0, p0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_send_vcard:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 771
    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 770
    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    new-instance v5, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;-><init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/Group;)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    .line 793
    return-void
.end method

.method private d(JLjava/lang/String;)V
    .locals 8

    .line 840
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-static {p1, p2, p3, v0}, Lo/bjk;->a(JLjava/lang/String;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Z

    move-result v6

    .line 841
    if-eqz v6, :cond_0

    .line 843
    return-void

    .line 846
    :cond_0
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-wide v1, p1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-object v4, p3

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/apz;->c(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Ljava/lang/String;I)V

    .line 849
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 851
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->d(J)V

    .line 853
    :cond_1
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 854
    const-string v0, "groupId"

    invoke-virtual {v7, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 855
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v7}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 856
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->finish()V

    .line 857
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 619
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-eqz v0, :cond_2

    .line 621
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_0

    .line 623
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 625
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 627
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 631
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 637
    :cond_2
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 638
    const-string v0, "group"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 639
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 640
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->finish()V

    .line 642
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;JLjava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(JLjava/lang/String;)V

    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 7

    .line 802
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-nez v0, :cond_0

    .line 804
    return-void

    .line 807
    :cond_0
    new-instance v4, Lo/axv;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    .line 808
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v4, v0, v1, v3, v2}, Lo/axv;-><init>(JILjava/lang/String;)V

    .line 809
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0, v1}, Lo/bji;->c(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Ljava/util/ArrayList;

    move-result-object v5

    .line 811
    new-instance v6, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;

    invoke-direct {v6, p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;-><init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/Group;)V

    .line 825
    new-instance v0, Lo/bjs;

    invoke-direct {v0, p0}, Lo/bjs;-><init>(Landroid/content/Context;)V

    .line 826
    invoke-virtual {v0, v4}, Lo/bjs;->a(Lo/axv;)Lo/bjs;

    move-result-object v0

    .line 827
    invoke-virtual {v0, v5}, Lo/bjs;->e(Ljava/util/ArrayList;)Lo/bjs;

    move-result-object v0

    .line 828
    invoke-virtual {v0, v6}, Lo/bjs;->d(Lo/bjw;)Lo/bjs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    .line 829
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 830
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/GroupListData;I)V
    .locals 2

    .line 250
    if-nez p1, :cond_0

    .line 252
    return-void

    .line 255
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupListData;->getGroupList()Ljava/util/ArrayList;

    move-result-object v1

    .line 256
    const/16 v0, 0x72

    if-ne p2, v0, :cond_2

    .line 259
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 261
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b()V

    .line 263
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->v()V

    .line 264
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->r()V

    goto :goto_0

    .line 268
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(I)V

    .line 271
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->u:Lo/bjg;

    invoke-virtual {v0, v1}, Lo/bjg;->a(Ljava/util/ArrayList;)V

    .line 272
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;J)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(J)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)Z
    .locals 1

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->g()Z

    move-result v0

    return v0
.end method

.method private g()Z
    .locals 1

    .line 416
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->v:Z

    return v0
.end method

.method private h()V
    .locals 1

    .line 406
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->v:Z

    .line 407
    return-void
.end method

.method private l()V
    .locals 5

    .line 479
    sget v0, Lcom/huawei/android/sns/R$id;->list_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    .line 480
    sget v0, Lcom/huawei/android/sns/R$id;->no_result_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    .line 481
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 483
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 484
    sget v3, Lcom/huawei/android/sns/R$layout;->sns_group_no_result:I

    .line 485
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 487
    sget v3, Lcom/huawei/android/sns/R$layout;->sns_group_no_family:I

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->d:Landroid/view/View;

    check-cast v0, Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v2, v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 490
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c:Landroid/widget/LinearLayout;

    .line 491
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 494
    sget v0, Lcom/huawei/android/sns/R$id;->network_error_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bni;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    .line 496
    new-instance v0, Lo/bjg;

    invoke-direct {v0, p0}, Lo/bjg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->u:Lo/bjg;

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->u:Lo/bjg;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 498
    return-void
.end method

.method private m()V
    .locals 2

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 520
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 522
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    if-eqz v0, :cond_1

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 526
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    .line 528
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 530
    :cond_2
    return-void
.end method

.method private n()V
    .locals 5

    .line 424
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 425
    if-eqz v2, :cond_6

    .line 427
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 428
    if-nez v3, :cond_0

    .line 430
    return-void

    .line 432
    :cond_0
    const-string v0, "select_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 434
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->r:I

    .line 436
    :cond_1
    const-string v0, "group_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 438
    const-string v0, "group_type"

    const/4 v1, 0x3

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    .line 441
    :cond_2
    const-string v0, "msgType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 443
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a(Landroid/os/Bundle;)V

    .line 447
    :cond_3
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 450
    const-string v0, "sns_sdk_key_group_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 452
    const-string v0, "sns_sdk_key_group_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 453
    if-nez v4, :cond_4

    .line 455
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    goto :goto_0

    .line 457
    :cond_4
    const/4 v0, 0x1

    if-ne v4, v0, :cond_5

    .line 459
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    goto :goto_0

    .line 463
    :cond_5
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->z:I

    .line 467
    :goto_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->r:I

    .line 472
    :cond_6
    return-void
.end method

.method private o()V
    .locals 2

    .line 556
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 558
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 560
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    if-eqz v0, :cond_1

    .line 562
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 563
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    invoke-virtual {v0, p0}, Lo/bni;->setCallBack(Lo/bni$d;)V

    .line 565
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    .line 567
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 569
    :cond_2
    return-void
.end method

.method private p()V
    .locals 2

    .line 537
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 539
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 541
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    if-eqz v0, :cond_1

    .line 543
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 545
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 549
    :cond_2
    return-void
.end method

.method private q()Lo/asz;
    .locals 2

    .line 943
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->s:Lo/asz;

    if-nez v0, :cond_0

    .line 945
    new-instance v0, Lo/asz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->D:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asz;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->s:Lo/asz;

    .line 947
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->s:Lo/asz;

    return-object v0
.end method

.method private r()V
    .locals 1

    .line 955
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->q()Lo/asz;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/asz;->d(Landroid/content/Context;)V

    .line 956
    return-void
.end method

.method private s()Z
    .locals 1

    .line 734
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 736
    const/4 v0, 0x1

    return v0

    .line 738
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private t()Lo/atd;
    .locals 2

    .line 929
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->q:Lo/atd;

    if-nez v0, :cond_0

    .line 931
    new-instance v0, Lo/atd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->D:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atd;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->q:Lo/atd;

    .line 933
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->q:Lo/atd;

    return-object v0
.end method

.method private u()V
    .locals 2

    .line 576
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->t:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;-><init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 610
    return-void
.end method

.method private v()V
    .locals 4

    .line 971
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->D:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->x:Lo/bgp;

    .line 972
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->D:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->y:Lo/bgn;

    .line 973
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->x:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 974
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->y:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 975
    return-void
.end method

.method private x()V
    .locals 2

    .line 982
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->x:Lo/bgp;

    if-eqz v0, :cond_0

    .line 984
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->x:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 986
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->y:Lo/bgn;

    if-eqz v0, :cond_1

    .line 988
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->y:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 990
    :cond_1
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 510
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->d:Landroid/view/View;

    .line 511
    return-void
.end method

.method public e()V
    .locals 1

    .line 746
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 750
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->w:Landroid/app/AlertDialog;

    .line 751
    return-void
.end method

.method public k()V
    .locals 2

    .line 1029
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 1030
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->v:Z

    .line 1031
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b()V

    .line 1032
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->r()V

    .line 1033
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 999
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onBackPressed()V

    .line 1000
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 503
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 505
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 327
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onCreate(Landroid/os/Bundle;)V

    .line 329
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 332
    if-eqz v2, :cond_0

    .line 334
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 338
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_group_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setContentView(I)V

    .line 342
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->n()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 347
    goto :goto_0

    .line 344
    :catch_0
    move-exception v2

    .line 346
    const-string v0, "BackToSDKCallerEvent"

    const-string v1, "GroupSelectorActivity get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a()V

    .line 350
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->l()V

    .line 351
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->u()V

    .line 352
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a(Z)V

    .line 353
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 961
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->x()V

    .line 962
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e()V

    .line 963
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onDestroy()V

    .line 964
    return-void
.end method
