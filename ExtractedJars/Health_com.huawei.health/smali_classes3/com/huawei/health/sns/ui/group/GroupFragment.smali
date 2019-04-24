.class public Lcom/huawei/health/sns/ui/group/GroupFragment;
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
        Lcom/huawei/health/sns/ui/group/GroupFragment$c;
    }
.end annotation


# instance fields
.field private A:Lo/bio;

.field private B:Landroid/view/View;

.field private C:Landroid/app/AlertDialog;

.field private D:Landroid/content/BroadcastReceiver;

.field private a:Lo/bgn;

.field private j:Landroid/os/Handler;

.field private l:Lo/bkj;

.field private m:Lo/bgp;

.field private o:J

.field private p:Lcom/huawei/health/sns/model/group/Group;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/view/View;

.field private t:Landroid/view/View;

.field private u:Landroid/widget/ImageView;

.field private v:Lo/bgv;

.field private w:Landroid/widget/TextView;

.field private x:Z

.field private y:Lo/bgt;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 207
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->r:Landroid/widget/TextView;

    .line 222
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->q:Landroid/widget/TextView;

    .line 227
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->s:Landroid/view/View;

    .line 232
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->t:Landroid/view/View;

    .line 237
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->u:Landroid/widget/ImageView;

    .line 242
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->w:Landroid/widget/TextView;

    .line 247
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->v:Lo/bgv;

    .line 257
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->x:Z

    .line 262
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->z:Z

    .line 267
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->B:Landroid/view/View;

    .line 282
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupFragment$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment$c;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    .line 1666
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment$5;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->D:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private a(I)V
    .locals 3

    .line 834
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    invoke-virtual {v0, p1, v1, v2}, Lo/atb;->e(IJ)V

    .line 835
    return-void
.end method

.method private a(II)V
    .locals 2

    .line 1483
    const/16 v0, 0xe3

    if-ne p2, v0, :cond_0

    .line 1485
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_num_limite:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto/16 :goto_0

    .line 1487
    :cond_0
    const/16 v0, 0xe5

    if-ne p2, v0, :cond_1

    .line 1489
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_more_req:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 1491
    :cond_1
    const/16 v0, 0x3f0

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3f2

    if-ne p2, v0, :cond_3

    .line 1494
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_family_member:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1495
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    .line 1497
    :cond_3
    const/16 v0, 0x3f1

    if-ne p2, v0, :cond_4

    .line 1500
    const/4 v0, 0x1

    if-le p1, v0, :cond_7

    .line 1502
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_user_part_member:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1503
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->p()V

    goto :goto_0

    .line 1506
    :cond_4
    const/16 v0, 0x405

    if-ne p2, v0, :cond_5

    .line 1508
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    if-eqz v0, :cond_7

    .line 1510
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    invoke-static {v0}, Lo/bok;->e(Landroid/app/AlertDialog;)V

    goto :goto_0

    .line 1513
    :cond_5
    const/16 v0, 0x406

    if-ne p2, v0, :cond_6

    .line 1516
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->r()V

    goto :goto_0

    .line 1520
    :cond_6
    const/16 v0, 0x3f8

    if-eq p2, v0, :cond_7

    .line 1522
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1525
    :cond_7
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->i(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    return-void
.end method

.method private static a(Lcom/huawei/health/sns/ui/group/GroupFragment;Z[J)V
    .locals 4

    .line 1186
    const/4 v2, 0x0

    .line 1187
    if-eqz p0, :cond_0

    .line 1189
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 1191
    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1193
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 1195
    if-eqz p1, :cond_1

    .line 1197
    const-class v0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-virtual {v3, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 1202
    :cond_1
    const-class v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v3, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1203
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1205
    :goto_0
    const-string v0, "ignore_list"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    .line 1207
    const/4 v0, 0x1

    invoke-virtual {p0, v3, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1210
    :cond_2
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1558
    const/4 v0, 0x2

    if-ne p4, v0, :cond_0

    .line 1560
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    new-instance v4, Lcom/huawei/health/sns/ui/group/GroupFragment$11;

    invoke-direct {v4, p0, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment$11;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;Ljava/lang/String;)V

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/bok;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    goto :goto_0

    .line 1584
    :cond_0
    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    .line 1586
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    new-instance v4, Lcom/huawei/health/sns/ui/group/GroupFragment$3;

    invoke-direct {v4, p0, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment$3;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/bok;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    .line 1614
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 1146
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {p1, v1, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/GroupFragment;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1147
    return-void
.end method

.method private a(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z
    .locals 4

    .line 428
    const/4 v3, 0x0

    .line 429
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 433
    :sswitch_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_have_invited:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 434
    const/4 v3, 0x1

    .line 435
    goto :goto_0

    .line 439
    :sswitch_1
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->v()V

    .line 440
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 441
    const/4 v3, 0x1

    .line 442
    goto :goto_0

    .line 448
    :sswitch_2
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->v()V

    .line 449
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p2, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(II)V

    .line 450
    const/4 v3, 0x1

    .line 451
    goto :goto_0

    .line 455
    :sswitch_3
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b()V

    .line 456
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->v()V

    .line 457
    const/4 v3, 0x1

    .line 458
    .line 463
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

.method private static b(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/GroupFragment;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/GroupFragment;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 1151
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupFragment$7;

    invoke-direct {v0, p1, p2, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment$7;-><init>(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/GroupFragment;Z)V

    return-object v0
.end method

.method private b(JLjava/lang/String;)V
    .locals 2

    .line 1646
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->j()V

    .line 1647
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    const/16 v1, 0x345

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/atq;->c(IJLjava/lang/String;)V

    .line 1648
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 921
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    .line 922
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->v:Lo/bgv;

    if-eqz v0, :cond_0

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->v:Lo/bgv;

    invoke-interface {v0, p1}, Lo/bgv;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 926
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 928
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->x:Z

    .line 929
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Z)V

    .line 930
    sget v0, Lcom/huawei/android/sns/R$string;->sns_edit_family_group_image:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(I)V

    goto :goto_0

    .line 934
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->x:Z

    .line 935
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Z)V

    .line 936
    sget v0, Lcom/huawei/android/sns/R$string;->sns_family_group_image:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(I)V

    .line 939
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->u()V

    .line 941
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->l()V

    .line 943
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->n()V

    .line 945
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->p()V

    .line 946
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->n()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 1623
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1625
    return-void

    .line 1627
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 1629
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1631
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

    .line 1261
    new-instance v0, Lo/asr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asr;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lo/asr;->c(JLjava/util/ArrayList;)V

    .line 1262
    return-void
.end method

.method private b(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z
    .locals 2

    .line 379
    const/4 v1, 0x0

    .line 380
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 384
    :pswitch_0
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 385
    const/4 v1, 0x1

    .line 386
    goto :goto_0

    .line 390
    :pswitch_1
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 391
    const/4 v1, 0x1

    .line 392
    goto :goto_0

    .line 397
    :pswitch_2
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 398
    const/4 v1, 0x1

    .line 399
    goto :goto_0

    .line 403
    :pswitch_3
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->h(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 404
    const/4 v1, 0x1

    .line 405
    goto :goto_0

    .line 409
    :pswitch_4
    invoke-direct {p2, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->k(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 410
    const/4 v1, 0x1

    .line 411
    .line 416
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

.method private c(JJLjava/lang/String;)V
    .locals 6

    .line 1659
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->j()V

    .line 1660
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/atq;->d(JJLjava/lang/String;)V

    .line 1661
    return-void
.end method

.method private c(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 4

    .line 512
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 513
    if-eqz v2, :cond_1

    .line 515
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 516
    if-eqz v3, :cond_1

    .line 518
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 520
    invoke-direct {p2, v3}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 525
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x3f0

    invoke-direct {p2, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(II)V

    .line 529
    :cond_1
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 869
    new-instance v0, Lo/bgg;

    invoke-direct {v0}, Lo/bgg;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v1, p1}, Lo/bgg;->a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/group/Group;)V

    .line 872
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->l()V

    .line 873
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->f()V

    .line 874
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 7

    .line 1327
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1329
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1330
    return-void

    .line 1333
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 1335
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_delete_member_title:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_delete_member_message:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 1336
    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_delete:I

    new-instance v5, Lcom/huawei/health/sns/ui/group/GroupFragment$9;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment$9;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1335
    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1351
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->s()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupFragment;I)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z
    .locals 1

    .line 105
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupFragment;)J
    .locals 2

    .line 105
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    return-wide v0
.end method

.method private d(I)V
    .locals 3

    .line 968
    const/4 v2, 0x0

    .line 970
    const/16 v0, 0x3ec

    if-ne p1, v0, :cond_0

    .line 972
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_authority:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 974
    :cond_0
    const/16 v0, 0x3f0

    if-ne p1, v0, :cond_1

    .line 976
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_not_exist:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 978
    :cond_1
    const/16 v0, 0x3f8

    if-eq p1, v0, :cond_2

    .line 980
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_groupinfo_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 983
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 985
    return-void

    .line 988
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupFragment$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment$4;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;I)V

    invoke-static {v0, v2, v1}, Lo/boj;->e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;

    .line 1000
    return-void
.end method

.method private d(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 3

    .line 540
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 541
    if-eqz v1, :cond_0

    .line 543
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 544
    if-eqz v2, :cond_0

    .line 546
    invoke-direct {p2, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 549
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 3

    .line 1472
    new-instance v0, Lo/asw;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asw;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lo/asw;->a(Landroid/content/Context;ILcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1473
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(Lcom/huawei/health/sns/model/group/GroupMember;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 105
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupFragment;Z)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Z)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;I)V"
        }
    .end annotation

    .line 1027
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1029
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->w:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 1031
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/android/sns/R$string;->sns_family_member_name:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_member_count:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 1032
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1031
    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1033
    invoke-static {}, Lo/bmo;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1035
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->w:Landroid/widget/TextView;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v5, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1039
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1043
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    if-eqz v0, :cond_2

    .line 1045
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    invoke-virtual {v0, p1}, Lo/bgt;->e(Ljava/util/ArrayList;)V

    .line 1047
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->x:Z

    if-eqz v0, :cond_2

    .line 1049
    new-instance v5, Lo/axx;

    sget-object v0, Lo/bfp$c;->r:Lo/bfp$c;

    invoke-direct {v5, v0}, Lo/axx;-><init>(Lo/bfp$c;)V

    .line 1050
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    invoke-virtual {v0, v5}, Lo/bgt;->e(Lo/bfh;)V

    .line 1053
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->f()V

    .line 1055
    :cond_3
    return-void
.end method

.method private d(Z)V
    .locals 3

    .line 796
    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    .line 797
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 799
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->image_arrow_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->image_arrow_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 802
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z
    .locals 1

    .line 105
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z

    move-result v0

    return v0
.end method

.method private e(I)V
    .locals 1

    .line 955
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->q:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 957
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 959
    :cond_0
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 3

    .line 809
    if-eqz p1, :cond_2

    .line 811
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 812
    if-nez v2, :cond_0

    .line 814
    return-void

    .line 816
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 818
    const-string v0, "groupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    .line 822
    :cond_1
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 824
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    .line 827
    :cond_2
    return-void
.end method

.method private e(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 4

    .line 475
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 476
    if-eqz v2, :cond_2

    .line 478
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 479
    if-eqz v3, :cond_1

    .line 481
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 484
    invoke-direct {p2, v3}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Lcom/huawei/health/sns/model/group/Group;)V

    .line 487
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->o()V

    goto :goto_0

    .line 492
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x3f0

    invoke-direct {p2, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(II)V

    goto :goto_0

    .line 498
    :cond_1
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->m()V

    .line 501
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->i()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupFragment;I)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupFragment;JJLjava/lang/String;)V
    .locals 0

    .line 105
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(JJLjava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupFragment;JLjava/lang/String;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(JLjava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupFragment;Z[J)V
    .locals 0

    .line 105
    invoke-static {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Lcom/huawei/health/sns/ui/group/GroupFragment;Z[J)V

    return-void
.end method

.method private f()V
    .locals 3

    .line 881
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->u:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 883
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->u:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 885
    :cond_0
    return-void
.end method

.method private g()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 744
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->z:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 746
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->B:Landroid/view/View;

    .line 747
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->B:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 748
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->z:Z

    .line 750
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->m()V

    return-void
.end method

.method private h()V
    .locals 4

    .line 842
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    const/16 v3, 0x377

    invoke-virtual {v0, v3, v1, v2}, Lo/atb;->e(IJ)V

    .line 843
    return-void
.end method

.method private h(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 4

    .line 559
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 560
    const/4 v2, 0x0

    .line 561
    if-eqz v1, :cond_0

    .line 563
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 564
    const-string v0, "bundleKeyNormalMemberCount"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 565
    if-eqz v2, :cond_0

    .line 567
    invoke-direct {p2, v2, v3}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Ljava/util/ArrayList;I)V

    .line 570
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/GroupFragment;)Landroid/app/AlertDialog;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private i()V
    .locals 1

    .line 671
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 673
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 675
    :cond_0
    return-void
.end method

.method private i(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 3

    .line 598
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 599
    if-eqz v1, :cond_0

    .line 601
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 602
    if-nez v2, :cond_0

    .line 604
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->k()V

    .line 607
    :cond_0
    return-void
.end method

.method private j()V
    .locals 5

    .line 1794
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->A:Lo/bio;

    if-nez v0, :cond_0

    .line 1796
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->A:Lo/bio;

    .line 1798
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->A:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 1802
    :cond_1
    return-void
.end method

.method private k()V
    .locals 0

    .line 663
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->i()V

    .line 664
    return-void
.end method

.method private k(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 2

    .line 580
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->v()V

    .line 581
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b()V

    .line 582
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 583
    if-eqz v1, :cond_0

    .line 585
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Ljava/lang/String;)V

    .line 587
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->f()V

    return-void
.end method

.method private l()V
    .locals 2

    .line 892
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 894
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 896
    :cond_0
    return-void
.end method

.method private m()V
    .locals 5

    .line 1007
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    const/16 v3, 0x349

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 1008
    return-void
.end method

.method private n()V
    .locals 3

    .line 903
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x343

    invoke-virtual {v0, v2, v1}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 904
    return-void
.end method

.method private o()V
    .locals 5

    .line 1015
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    const/16 v3, 0x351

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 1016
    return-void
.end method

.method private p()V
    .locals 3

    .line 911
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    .line 912
    return-void
.end method

.method private q()V
    .locals 3

    .line 1700
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 1701
    const-string v0, "GROUP_IMAGE_REFRESH_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1702
    const-string v0, "TRANSFER_GROUP_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1703
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->x()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 1704
    if-eqz v2, :cond_0

    .line 1706
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->D:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1708
    :cond_0
    return-void
.end method

.method private r()V
    .locals 6

    .line 1532
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_manager_family_group_member_bind_phone_tip:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_set_up_later:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_set_up_now:I

    new-instance v5, Lcom/huawei/health/sns/ui/group/GroupFragment$6;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment$6;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1547
    return-void
.end method

.method private s()V
    .locals 2

    .line 1422
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 1423
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1426
    :cond_0
    return-void

    .line 1463
    :cond_1
    return-void
.end method

.method private t()V
    .locals 2

    .line 1246
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->v()V

    .line 1247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 1249
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 1250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1252
    :cond_0
    return-void
.end method

.method private u()V
    .locals 2

    .line 1062
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->x:Z

    if-eqz v0, :cond_0

    .line 1064
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->s:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment$1;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1076
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->s:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_item_none_selector:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1079
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->t:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment$2;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1091
    return-void
.end method

.method private v()V
    .locals 1

    .line 1783
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->A:Lo/bio;

    if-eqz v0, :cond_0

    .line 1785
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->A:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 1787
    :cond_0
    return-void
.end method

.method private w()V
    .locals 4

    .line 1737
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->a:Lo/bgn;

    .line 1738
    new-instance v0, Lo/bkj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkj;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->l:Lo/bkj;

    .line 1739
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->m:Lo/bgp;

    .line 1740
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->a:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1742
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->l:Lo/bkj;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1744
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->m:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1745
    return-void
.end method

.method private x()Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    .line 1717
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    return-object v0
.end method

.method private y()V
    .locals 2

    .line 1725
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->x()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 1726
    if-eqz v1, :cond_0

    .line 1728
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->D:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1730
    :cond_0
    return-void
.end method

.method private z()V
    .locals 2

    .line 1752
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->a:Lo/bgn;

    if-eqz v0, :cond_0

    .line 1754
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->a:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1756
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->l:Lo/bkj;

    if-eqz v0, :cond_1

    .line 1758
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->l:Lo/bkj;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1760
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->m:Lo/bgp;

    if-eqz v0, :cond_2

    .line 1762
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->m:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1764
    :cond_2
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1809
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 1811
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 1812
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->C:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1814
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 3

    .line 1290
    const/4 v2, 0x0

    .line 1292
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 1294
    sget v2, Lcom/huawei/android/sns/R$array;->remove_member_dialog_items:I

    goto :goto_0

    .line 1298
    :cond_0
    sget v2, Lcom/huawei/android/sns/R$array;->remove_invite_member_dialog_items:I

    .line 1300
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupFragment$10;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment$10;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V

    invoke-static {v0, v2, v1}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 1319
    return-void
.end method

.method public c()V
    .locals 2

    .line 848
    new-instance v0, Lo/bgt;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bgt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    .line 849
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->c:Lo/bfq;

    .line 850
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bgt;->b(Lo/bfn;)V

    .line 851
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->y:Lo/bgt;

    invoke-virtual {v0}, Lo/bgt;->d()V

    .line 852
    return-void
.end method

.method public c(Landroid/content/Intent;)V
    .locals 5

    .line 706
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 711
    goto :goto_0

    .line 708
    :catch_0
    move-exception v4

    .line 710
    const-string v0, "GroupFragment"

    const-string v1, "GroupFragment get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    :goto_0
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(I)V

    .line 715
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-virtual {v0, v1, v2, v3}, Lo/auu;->a(J[I)V

    .line 718
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method public c(Lo/bfl;)V
    .locals 6

    .line 1267
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1269
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v4

    .line 1270
    invoke-virtual {v4}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    instance-of v0, v4, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_0

    .line 1272
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1274
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    .line 1275
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1277
    invoke-virtual {p0, v5}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1281
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

    .line 1373
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$array;->add_group_member:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/GroupFragment$8;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/GroupFragment$8;-><init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    invoke-static {v0, v1, v2}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 1395
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 9

    .line 1096
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1098
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v4

    .line 1099
    invoke-virtual {v4}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_2

    instance-of v0, v4, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_2

    .line 1101
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1103
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1105
    sget v0, Lcom/huawei/android/sns/R$string;->sns_edit_group_nickname:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_edit_group_nickname_info:I

    .line 1106
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1105
    const/4 v3, 0x2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 1111
    :cond_0
    new-instance v6, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1112
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 1113
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1114
    const/4 v8, 0x2

    .line 1116
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1118
    const/4 v8, 0x4

    .line 1121
    :cond_1
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1122
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1124
    const-string v0, "bundleKeysrcType"

    invoke-virtual {v7, v0, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1125
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1126
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1128
    invoke-virtual {v6, v7}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1129
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 1131
    :goto_0
    goto :goto_1

    .line 1132
    :cond_2
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_3

    .line 1134
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d()V

    .line 1137
    :cond_3
    :goto_1
    return-void
.end method

.method public e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 2

    .line 858
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_group_info:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->b:Landroid/view/View;

    .line 859
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->list_group:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->e:Landroid/widget/ListView;

    .line 860
    return-void
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 5

    .line 612
    sget-object v0, Lo/auu$b;->e:Lo/auu$b;

    if-ne p1, v0, :cond_3

    .line 614
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->e(Landroid/os/Bundle;)I

    move-result v2

    .line 616
    const/16 v0, 0x11

    if-ne v2, v0, :cond_0

    .line 618
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->h()V

    .line 619
    return-void

    .line 622
    :cond_0
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->d(Landroid/os/Bundle;)J

    move-result-wide v3

    .line 623
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    cmp-long v0, v0, v3

    if-eqz v0, :cond_2

    .line 625
    :cond_1
    return-void

    .line 627
    :cond_2
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 632
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->p()V

    .line 633
    goto :goto_0

    .line 637
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    const/16 v1, 0x375

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 638
    goto :goto_0

    .line 642
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->j:Landroid/os/Handler;

    const/16 v1, 0x376

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 643
    goto :goto_0

    .line 648
    :pswitch_3
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(I)V

    .line 649
    const-string v0, "GroupFragment"

    const-string v1, "group transfer,get local group info to refresh view."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    .line 656
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

    .line 1215
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 1217
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1219
    if-eqz p3, :cond_0

    .line 1221
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 1222
    if-eqz v1, :cond_0

    .line 1224
    const-string v0, "userList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 1226
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Ljava/util/ArrayList;)V

    .line 1231
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1232
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .line 1356
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onAttach(Landroid/app/Activity;)V

    .line 1359
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/health/sns/ui/group/GroupActivity;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->v:Lo/bgv;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1364
    goto :goto_0

    .line 1361
    :catch_0
    move-exception v2

    .line 1363
    const-string v0, "GroupFragment"

    const-string v1, "GroupFrame onAttach ClassCastException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1365
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 755
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 756
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 759
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->B:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 761
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->z:Z

    .line 762
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->B:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    goto :goto_0

    .line 767
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->g()V

    .line 769
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e()V

    .line 770
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 681
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreate(Landroid/os/Bundle;)V

    .line 682
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(Landroid/content/Intent;)V

    .line 684
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_group_info_head_view:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    .line 685
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->image_group:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->u:Landroid/widget/ImageView;

    .line 686
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->text_family_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->r:Landroid/widget/TextView;

    .line 687
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->text_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->w:Landroid/widget/TextView;

    .line 689
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_tag:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->q:Landroid/widget/TextView;

    .line 691
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Z)V

    .line 692
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_family_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->s:Landroid/view/View;

    .line 693
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_family_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->t:Landroid/view/View;

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 695
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 724
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 725
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 727
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->d:Lo/bfm;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 729
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->q()V

    .line 730
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->w()V

    .line 732
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->d:Lo/avk$b;

    invoke-virtual {v0, v1, p0}, Lo/avk;->c(Lo/avk$b;Lo/avk$d;)V

    .line 734
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->g()V

    .line 735
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1237
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->y()V

    .line 1238
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->z()V

    .line 1239
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->d:Lo/avk$b;

    invoke-virtual {v0, v1}, Lo/avk;->c(Lo/avk$b;)V

    .line 1240
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->t()V

    .line 1241
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroy()V

    .line 1242
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 785
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onPause()V

    .line 786
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    invoke-virtual {v0}, Lo/aut;->b()V

    .line 787
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1769
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1771
    if-eqz p3, :cond_0

    array-length v0, p3

    if-lez v0, :cond_0

    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1773
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->s()V

    .line 1776
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 775
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onResume()V

    .line 777
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-virtual {v0, v1, v2, v3}, Lo/auu;->a(J[I)V

    .line 779
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/GroupFragment;->o:J

    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->e(Lo/auu$b;J)V

    .line 780
    return-void

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method
