.class public Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Lo/avk$d;
.implements Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ResourceAsColor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$d;
    }
.end annotation


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/content/BroadcastReceiver;

.field private C:Landroid/os/Handler;

.field private D:Landroid/app/AlertDialog;

.field private a:Lo/bgn;

.field private j:Lo/bio;

.field private l:J

.field private m:Lo/bgp;

.field private o:Lo/bkj;

.field private p:Lcom/huawei/health/sns/model/group/Group;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/view/View;

.field private t:Landroid/view/View;

.field private u:Landroid/widget/TextView;

.field private v:Z

.field private w:Lo/bgt;

.field private x:Lo/bgv;

.field private y:Z

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    .line 225
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->u:Landroid/widget/TextView;

    .line 230
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->q:Landroid/widget/TextView;

    .line 235
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->t:Landroid/view/View;

    .line 240
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->s:Landroid/view/View;

    .line 245
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->r:Landroid/widget/ImageView;

    .line 250
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z:Landroid/widget/TextView;

    .line 255
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    .line 260
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->x:Lo/bgv;

    .line 265
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->y:Z

    .line 270
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->v:Z

    .line 275
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->A:Landroid/view/View;

    .line 290
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$d;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    .line 1674
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$2;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->B:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private A()V
    .locals 5

    .line 1802
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->j:Lo/bio;

    if-nez v0, :cond_0

    .line 1804
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->j:Lo/bio;

    .line 1806
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1808
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->j:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 1810
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private static a(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 1159
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;

    invoke-direct {v0, p1, p2, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;-><init>(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z)V

    return-object v0
.end method

.method private a(I)V
    .locals 3

    .line 976
    const/4 v2, 0x0

    .line 978
    const/16 v0, 0x3ec

    if-ne p1, v0, :cond_0

    .line 980
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_authority:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 982
    :cond_0
    const/16 v0, 0x3f0

    if-ne p1, v0, :cond_1

    .line 984
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_not_exist:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 986
    :cond_1
    const/16 v0, 0x3f8

    if-eq p1, v0, :cond_2

    .line 988
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_groupinfo_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 991
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 993
    return-void

    .line 996
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$1;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;I)V

    invoke-static {v0, v2, v1}, Lo/boj;->e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;

    .line 1008
    return-void
.end method

.method private a(JJLjava/lang/String;)V
    .locals 6

    .line 1667
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->A()V

    .line 1668
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/atq;->d(JJLjava/lang/String;)V

    .line 1669
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 113
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z[J)V
    .locals 0

    .line 113
    invoke-static {p0, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z[J)V

    return-void
.end method

.method private a(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Z
    .locals 4

    .line 436
    const/4 v3, 0x0

    .line 437
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 441
    :sswitch_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_have_invited:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 442
    const/4 v3, 0x1

    .line 443
    goto :goto_0

    .line 447
    :sswitch_1
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z()V

    .line 448
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 449
    const/4 v3, 0x1

    .line 450
    goto :goto_0

    .line 456
    :sswitch_2
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z()V

    .line 457
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p2, v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(II)V

    .line 458
    const/4 v3, 0x1

    .line 459
    goto :goto_0

    .line 463
    :sswitch_3
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b()V

    .line 464
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z()V

    .line 465
    const/4 v3, 0x1

    .line 466
    .line 471
    :goto_0
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xc2 -> :sswitch_2
        0xc3 -> :sswitch_2
        0xc4 -> :sswitch_3
        0xe2 -> :sswitch_2
        0xe4 -> :sswitch_0
        0xaaa -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Z
    .locals 1

    .line 113
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Z

    move-result v0

    return v0
.end method

.method private b(I)V
    .locals 3

    .line 842
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    invoke-virtual {v0, p1, v1, v2}, Lo/atb;->e(IJ)V

    .line 843
    return-void
.end method

.method private b(II)V
    .locals 2

    .line 1491
    const/16 v0, 0xe3

    if-ne p2, v0, :cond_0

    .line 1493
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_num_limite:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto/16 :goto_0

    .line 1495
    :cond_0
    const/16 v0, 0xe5

    if-ne p2, v0, :cond_1

    .line 1497
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_more_req:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 1499
    :cond_1
    const/16 v0, 0x3f0

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3f2

    if-ne p2, v0, :cond_3

    .line 1502
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_family_member:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1503
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    .line 1505
    :cond_3
    const/16 v0, 0x3f1

    if-ne p2, v0, :cond_4

    .line 1508
    const/4 v0, 0x1

    if-le p1, v0, :cond_7

    .line 1510
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_user_part_member:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1511
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->m()V

    goto :goto_0

    .line 1514
    :cond_4
    const/16 v0, 0x405

    if-ne p2, v0, :cond_5

    .line 1516
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    if-eqz v0, :cond_7

    .line 1518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    invoke-static {v0}, Lo/bok;->e(Landroid/app/AlertDialog;)V

    goto :goto_0

    .line 1521
    :cond_5
    const/16 v0, 0x406

    if-ne p2, v0, :cond_6

    .line 1524
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->u()V

    goto :goto_0

    .line 1528
    :cond_6
    const/16 v0, 0x3f8

    if-eq p2, v0, :cond_7

    .line 1530
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1533
    :cond_7
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->f()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;I)V
    .locals 0

    .line 113
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;JJLjava/lang/String;)V
    .locals 0

    .line 113
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(JJLjava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 113
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->c(Lcom/huawei/health/sns/model/group/GroupMember;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 113
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z)V
    .locals 0

    .line 113
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e(Z)V

    return-void
.end method

.method private static b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z[J)V
    .locals 4

    .line 1194
    const/4 v2, 0x0

    .line 1195
    if-eqz p0, :cond_0

    .line 1197
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 1199
    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1201
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 1203
    if-eqz p1, :cond_1

    .line 1205
    const-class v0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-virtual {v3, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 1210
    :cond_1
    const-class v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v3, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1211
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1213
    :goto_0
    const-string v0, "ignore_list"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    .line 1215
    const/4 v0, 0x1

    invoke-virtual {p0, v3, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1218
    :cond_2
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 1631
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1633
    return-void

    .line 1635
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 1637
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->u:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1639
    :cond_1
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 1269
    new-instance v0, Lo/asr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asr;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lo/asr;->c(JLjava/util/ArrayList;)V

    .line 1270
    return-void
.end method

.method private b(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Z
    .locals 2

    .line 387
    const/4 v1, 0x0

    .line 388
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 392
    :pswitch_0
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    .line 393
    const/4 v1, 0x1

    .line 394
    goto :goto_0

    .line 398
    :pswitch_1
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    .line 399
    const/4 v1, 0x1

    .line 400
    goto :goto_0

    .line 405
    :pswitch_2
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->c(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    .line 406
    const/4 v1, 0x1

    .line 407
    goto :goto_0

    .line 411
    :pswitch_3
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->f(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    .line 412
    const/4 v1, 0x1

    .line 413
    goto :goto_0

    .line 417
    :pswitch_4
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->k(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    .line 418
    const/4 v1, 0x1

    .line 419
    .line 424
    :goto_0
    :pswitch_5
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x343
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)J
    .locals 2

    .line 113
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    return-wide v0
.end method

.method private c(JLjava/lang/String;)V
    .locals 2

    .line 1654
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->A()V

    .line 1655
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    const/16 v1, 0x345

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/atq;->c(IJLjava/lang/String;)V

    .line 1656
    return-void
.end method

.method private c(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 3

    .line 548
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 549
    if-eqz v1, :cond_0

    .line 551
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 552
    if-eqz v2, :cond_0

    .line 554
    invoke-direct {p2, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 557
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 7

    .line 1335
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1337
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1338
    return-void

    .line 1341
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 1343
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_delete_member_title:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_delete_member_message:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 1344
    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_delete:I

    new-instance v5, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$10;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$10;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1343
    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1359
    return-void
.end method

.method private c(Ljava/util/ArrayList;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;I)V"
        }
    .end annotation

    .line 1035
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1037
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 1039
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/android/sns/R$string;->sns_family_member_name:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_member_count:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 1040
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1039
    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1041
    invoke-static {}, Lo/bmo;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1043
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z:Landroid/widget/TextView;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v5, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1047
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1051
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    if-eqz v0, :cond_2

    .line 1053
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    invoke-virtual {v0, p1}, Lo/bgt;->e(Ljava/util/ArrayList;)V

    .line 1055
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->y:Z

    if-eqz v0, :cond_2

    .line 1057
    new-instance v5, Lo/axx;

    sget-object v0, Lo/bfp$c;->r:Lo/bfp$c;

    invoke-direct {v5, v0}, Lo/axx;-><init>(Lo/bfp$c;)V

    .line 1058
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    invoke-virtual {v0, v5}, Lo/bgt;->e(Lo/bfh;)V

    .line 1061
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->g()V

    .line 1063
    :cond_3
    return-void
.end method

.method private d(I)V
    .locals 1

    .line 963
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->q:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 965
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 967
    :cond_0
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 3

    .line 817
    if-eqz p1, :cond_2

    .line 819
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 820
    if-nez v2, :cond_0

    .line 822
    return-void

    .line 824
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 826
    const-string v0, "groupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    .line 830
    :cond_1
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 832
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    .line 835
    :cond_2
    return-void
.end method

.method private d(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 4

    .line 520
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 521
    if-eqz v2, :cond_1

    .line 523
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 524
    if-eqz v3, :cond_1

    .line 526
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 528
    invoke-direct {p2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 533
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x3f0

    invoke-direct {p2, v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(II)V

    .line 537
    :cond_1
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 929
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    .line 930
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->x:Lo/bgv;

    if-eqz v0, :cond_0

    .line 932
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->x:Lo/bgv;

    invoke-interface {v0, p1}, Lo/bgv;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 934
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 936
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->y:Z

    .line 937
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Z)V

    .line 938
    sget v0, Lcom/huawei/android/sns/R$string;->sns_edit_family_group_image:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(I)V

    goto :goto_0

    .line 942
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->y:Z

    .line 943
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Z)V

    .line 944
    sget v0, Lcom/huawei/android/sns/R$string;->sns_family_group_image:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(I)V

    .line 947
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->t()V

    .line 949
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l()V

    .line 951
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p()V

    .line 953
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->m()V

    .line 954
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 3

    .line 1480
    new-instance v0, Lo/asw;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asw;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lo/asw;->a(Landroid/content/Context;ILcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1481
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;I)V
    .locals 0

    .line 113
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 113
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->i(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1566
    const/4 v0, 0x2

    if-ne p4, v0, :cond_0

    .line 1568
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    new-instance v4, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;

    invoke-direct {v4, p0, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/lang/String;)V

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/bok;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    goto :goto_0

    .line 1592
    :cond_0
    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    .line 1594
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    new-instance v4, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;

    invoke-direct {v4, p0, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/bok;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    .line 1622
    :cond_1
    :goto_0
    return-void
.end method

.method private d(Z)V
    .locals 3

    .line 804
    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    .line 805
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 807
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->image_arrow_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 808
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->image_arrow_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 810
    :cond_1
    return-void
.end method

.method private e(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 4

    .line 483
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 484
    if-eqz v2, :cond_2

    .line 486
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 487
    if-eqz v3, :cond_1

    .line 489
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 492
    invoke-direct {p2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 495
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n()V

    goto :goto_0

    .line 500
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x3f0

    invoke-direct {p2, v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(II)V

    goto :goto_0

    .line 506
    :cond_1
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->o()V

    .line 509
    :cond_2
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 877
    new-instance v0, Lo/bif;

    invoke-direct {v0}, Lo/bif;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v1, p1}, Lo/bif;->e(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/group/Group;)V

    .line 880
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l()V

    .line 881
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->g()V

    .line 882
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->q()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;JLjava/lang/String;)V
    .locals 0

    .line 113
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->c(JLjava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 113
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private e(Z)V
    .locals 2

    .line 1154
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {p1, v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1155
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Z
    .locals 1

    .line 113
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Z

    move-result v0

    return v0
.end method

.method private f()V
    .locals 1

    .line 679
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 681
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 683
    :cond_0
    return-void
.end method

.method private f(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 4

    .line 567
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 568
    const/4 v2, 0x0

    .line 569
    if-eqz v1, :cond_0

    .line 571
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 572
    const-string v0, "bundleKeyNormalMemberCount"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 573
    if-eqz v2, :cond_0

    .line 575
    invoke-direct {p2, v2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->c(Ljava/util/ArrayList;I)V

    .line 578
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->g()V

    return-void
.end method

.method private g()V
    .locals 3

    .line 889
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->r:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 891
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 893
    :cond_0
    return-void
.end method

.method private h()V
    .locals 0

    .line 671
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->f()V

    .line 672
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Landroid/app/AlertDialog;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 850
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    const/16 v3, 0x377

    invoke-virtual {v0, v3, v1, v2}, Lo/atb;->e(IJ)V

    .line 851
    return-void
.end method

.method private i(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 3

    .line 606
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 607
    if-eqz v1, :cond_0

    .line 609
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 610
    if-nez v2, :cond_0

    .line 612
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->h()V

    .line 615
    :cond_0
    return-void
.end method

.method private k()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 752
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->v:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 754
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->A:Landroid/view/View;

    .line 755
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->A:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 756
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->v:Z

    .line 758
    :cond_0
    return-void
.end method

.method private k(Landroid/os/Message;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 2

    .line 588
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z()V

    .line 589
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b()V

    .line 590
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 591
    if-eqz v1, :cond_0

    .line 593
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Ljava/lang/String;)V

    .line 595
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->o()V

    return-void
.end method

.method private l()V
    .locals 2

    .line 900
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 902
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 904
    :cond_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 919
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    .line 920
    return-void
.end method

.method private n()V
    .locals 5

    .line 1023
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    const/16 v3, 0x351

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 1024
    return-void
.end method

.method private o()V
    .locals 5

    .line 1015
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    const/16 v3, 0x349

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 1016
    return-void
.end method

.method private p()V
    .locals 3

    .line 911
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x343

    invoke-virtual {v0, v2, v1}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 912
    return-void
.end method

.method private q()V
    .locals 2

    .line 1430
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 1431
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1434
    :cond_0
    return-void

    .line 1471
    :cond_1
    return-void
.end method

.method private r()V
    .locals 3

    .line 1708
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 1709
    const-string v0, "GROUP_IMAGE_REFRESH_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1710
    const-string v0, "TRANSFER_GROUP_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1711
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 1712
    if-eqz v2, :cond_0

    .line 1714
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->B:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1716
    :cond_0
    return-void
.end method

.method private s()V
    .locals 2

    .line 1254
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z()V

    .line 1255
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 1257
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 1258
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1260
    :cond_0
    return-void
.end method

.method private t()V
    .locals 2

    .line 1070
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->y:Z

    if-eqz v0, :cond_0

    .line 1072
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->t:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$5;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1084
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->t:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_item_none_selector:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1087
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->s:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$3;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1099
    return-void
.end method

.method private u()V
    .locals 6

    .line 1540
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_manager_family_group_member_bind_phone_tip:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_set_up_later:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_set_up_now:I

    new-instance v5, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$7;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$7;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1555
    return-void
.end method

.method private v()V
    .locals 4

    .line 1745
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a:Lo/bgn;

    .line 1746
    new-instance v0, Lo/bkj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkj;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->o:Lo/bkj;

    .line 1747
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->m:Lo/bgp;

    .line 1748
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1750
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->o:Lo/bkj;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1752
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->m:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1753
    return-void
.end method

.method private w()Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    .line 1725
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    return-object v0
.end method

.method private x()V
    .locals 2

    .line 1733
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 1734
    if-eqz v1, :cond_0

    .line 1736
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->B:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1738
    :cond_0
    return-void
.end method

.method private y()V
    .locals 2

    .line 1760
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a:Lo/bgn;

    if-eqz v0, :cond_0

    .line 1762
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1764
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->o:Lo/bkj;

    if-eqz v0, :cond_1

    .line 1766
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->o:Lo/bkj;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1768
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->m:Lo/bgp;

    if-eqz v0, :cond_2

    .line 1770
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->m:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1772
    :cond_2
    return-void
.end method

.method private z()V
    .locals 1

    .line 1791
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->j:Lo/bio;

    if-eqz v0, :cond_0

    .line 1793
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->j:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 1795
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 5

    .line 714
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 719
    goto :goto_0

    .line 716
    :catch_0
    move-exception v4

    .line 718
    const-string v0, "GroupFragment"

    const-string v1, "GroupFragment get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    :goto_0
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(I)V

    .line 723
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-virtual {v0, v1, v2, v3}, Lo/auu;->a(J[I)V

    .line 726
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method public b()V
    .locals 2

    .line 1817
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 1819
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 1820
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->D:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1822
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 3

    .line 1298
    const/4 v2, 0x0

    .line 1300
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 1302
    sget v2, Lcom/huawei/android/sns/R$array;->remove_member_dialog_items:I

    goto :goto_0

    .line 1306
    :cond_0
    sget v2, Lcom/huawei/android/sns/R$array;->remove_invite_member_dialog_items:I

    .line 1308
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V

    invoke-static {v0, v2, v1}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 1327
    return-void
.end method

.method public c()V
    .locals 2

    .line 856
    new-instance v0, Lo/bgt;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bgt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    .line 857
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->c:Lo/bfq;

    .line 858
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bgt;->b(Lo/bfn;)V

    .line 859
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->w:Lo/bgt;

    invoke-virtual {v0}, Lo/bgt;->d()V

    .line 860
    return-void
.end method

.method public c(Lo/bfl;)V
    .locals 6

    .line 1275
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1277
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v4

    .line 1278
    invoke-virtual {v4}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    instance-of v0, v4, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_0

    .line 1280
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1282
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    .line 1283
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1285
    invoke-virtual {p0, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1289
    :cond_0
    return-void
.end method

.method public d()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1381
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$array;->add_group_member:I

    new-instance v2, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$9;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$9;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    invoke-static {v0, v1, v2}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 1403
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 9

    .line 1104
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1106
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v4

    .line 1107
    invoke-virtual {v4}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_2

    instance-of v0, v4, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_2

    .line 1109
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1111
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1113
    sget v0, Lcom/huawei/android/sns/R$string;->sns_edit_group_nickname:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_edit_group_nickname_info:I

    .line 1114
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1113
    const/4 v3, 0x2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 1119
    :cond_0
    new-instance v6, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1120
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 1121
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1122
    const/4 v8, 0x2

    .line 1124
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1126
    const/4 v8, 0x4

    .line 1129
    :cond_1
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1130
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1132
    const-string v0, "bundleKeysrcType"

    invoke-virtual {v7, v0, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1133
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1134
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1136
    invoke-virtual {v6, v7}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1137
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 1139
    :goto_0
    goto :goto_1

    .line 1140
    :cond_2
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_3

    .line 1142
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d()V

    .line 1145
    :cond_3
    :goto_1
    return-void
.end method

.method public e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 2

    .line 866
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_group_info:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b:Landroid/view/View;

    .line 867
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->list_group:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e:Landroid/widget/ListView;

    .line 868
    return-void
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 5

    .line 620
    sget-object v0, Lo/auu$b;->e:Lo/auu$b;

    if-ne p1, v0, :cond_3

    .line 622
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->e(Landroid/os/Bundle;)I

    move-result v2

    .line 624
    const/16 v0, 0x11

    if-ne v2, v0, :cond_0

    .line 626
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->i()V

    .line 627
    return-void

    .line 630
    :cond_0
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->d(Landroid/os/Bundle;)J

    move-result-wide v3

    .line 631
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    cmp-long v0, v0, v3

    if-eqz v0, :cond_2

    .line 633
    :cond_1
    return-void

    .line 635
    :cond_2
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 640
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->m()V

    .line 641
    goto :goto_0

    .line 645
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    const/16 v1, 0x375

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 646
    goto :goto_0

    .line 650
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->C:Landroid/os/Handler;

    const/16 v1, 0x376

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 651
    goto :goto_0

    .line 656
    :pswitch_3
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(I)V

    .line 657
    const-string v0, "GroupFragment"

    const-string v1, "group transfer,get local group info to refresh view."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    .line 664
    :cond_3
    :goto_0
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 1223
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 1225
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1227
    if-eqz p3, :cond_0

    .line 1229
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 1230
    if-eqz v1, :cond_0

    .line 1232
    const-string v0, "userList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 1234
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Ljava/util/ArrayList;)V

    .line 1239
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1240
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .line 1364
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onAttach(Landroid/app/Activity;)V

    .line 1367
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/health/sns/ui/group/GroupActivity;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->x:Lo/bgv;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1372
    goto :goto_0

    .line 1369
    :catch_0
    move-exception v2

    .line 1371
    const-string v0, "GroupFragment"

    const-string v1, "GroupFrame onAttach ClassCastException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1373
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 763
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 764
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 767
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->v:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->A:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 769
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->v:Z

    .line 770
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->A:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    goto :goto_0

    .line 775
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->k()V

    .line 777
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e()V

    .line 778
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 689
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreate(Landroid/os/Bundle;)V

    .line 690
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Landroid/content/Intent;)V

    .line 692
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_group_info_head_view:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    .line 693
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->image_group:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->r:Landroid/widget/ImageView;

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->text_family_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->u:Landroid/widget/TextView;

    .line 695
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->text_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->z:Landroid/widget/TextView;

    .line 697
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_tag:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->q:Landroid/widget/TextView;

    .line 699
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Z)V

    .line 700
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_family_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->t:Landroid/view/View;

    .line 701
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_family_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->s:Landroid/view/View;

    .line 702
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 703
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 732
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 733
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 735
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d:Lo/bfm;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 737
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->r()V

    .line 738
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->v()V

    .line 740
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->d:Lo/avk$b;

    invoke-virtual {v0, v1, p0}, Lo/avk;->c(Lo/avk$b;Lo/avk$d;)V

    .line 742
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->k()V

    .line 743
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1245
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->x()V

    .line 1246
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->y()V

    .line 1247
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->d:Lo/avk$b;

    invoke-virtual {v0, v1}, Lo/avk;->c(Lo/avk$b;)V

    .line 1248
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->s()V

    .line 1249
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroy()V

    .line 1250
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 793
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onPause()V

    .line 794
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    invoke-virtual {v0}, Lo/aut;->b()V

    .line 795
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1777
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1779
    if-eqz p3, :cond_0

    array-length v0, p3

    if-lez v0, :cond_0

    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1781
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->q()V

    .line 1784
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 783
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onResume()V

    .line 785
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-virtual {v0, v1, v2, v3}, Lo/auu;->a(J[I)V

    .line 787
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->l:J

    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->e(Lo/auu$b;J)V

    .line 788
    return-void

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method
