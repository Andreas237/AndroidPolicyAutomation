.class public Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;
.super Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$c;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/TextView;

.field private C:Landroid/view/View;

.field private E:Lo/bio;

.field private F:Z

.field private G:Z

.field private H:Landroid/app/AlertDialog;

.field private I:Z

.field private J:Lcom/huawei/health/sns/model/user/User;

.field private K:Landroid/os/Handler;

.field private L:J

.field private M:Ljava/lang/String;

.field private N:I

.field private S:Landroid/widget/AdapterView$OnItemClickListener;

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;-><init>()V

    .line 127
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->j:I

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->I:Z

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->F:Z

    .line 147
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->G:Z

    .line 177
    new-instance v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$c;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    .line 1161
    new-instance v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$7;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->S:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method private B()V
    .locals 3

    .line 1534
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->N:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1536
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_manager_toast:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 1540
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_group_toast:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1542
    :goto_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1543
    const-string v0, "TRANSFER_GROUP_ACTION"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1544
    invoke-static {v2}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 1545
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 1546
    return-void
.end method

.method private a(Z)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 471
    new-instance v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Z)V

    return-object v0
.end method

.method private a(I)V
    .locals 1

    .line 1036
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 1038
    sget v0, Lcom/huawei/android/sns/R$string;->sns_create_normal_group_max_info:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 1040
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1042
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_to_many_people:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 1044
    :cond_1
    const/16 v0, 0x406

    if-ne p1, v0, :cond_2

    .line 1046
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->r()V

    goto :goto_0

    .line 1050
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_create_group_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1052
    :goto_0
    return-void
.end method

.method private a(JLjava/lang/String;I)V
    .locals 5

    .line 904
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-nez v0, :cond_0

    .line 906
    return-void

    .line 909
    :cond_0
    new-instance v2, Lo/axv;

    invoke-direct {v2, p1, p2, p4, p3}, Lo/axv;-><init>(JILjava/lang/String;)V

    .line 910
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0, v1}, Lo/bji;->c(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Ljava/util/ArrayList;

    move-result-object v3

    .line 912
    new-instance v4, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;

    invoke-direct {v4, p0, p1, p2, p4}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JI)V

    .line 927
    new-instance v0, Lo/bjs;

    invoke-direct {v0, p0}, Lo/bjs;-><init>(Landroid/content/Context;)V

    .line 928
    invoke-virtual {v0, v2}, Lo/bjs;->a(Lo/axv;)Lo/bjs;

    move-result-object v0

    .line 929
    invoke-virtual {v0, v3}, Lo/bjs;->e(Ljava/util/ArrayList;)Lo/bjs;

    move-result-object v0

    .line 930
    invoke-virtual {v0, v4}, Lo/bjs;->d(Lo/bjw;)Lo/bjs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    .line 931
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 932
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JILjava/lang/String;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(JILjava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Landroid/os/Message;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 503
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 505
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->r:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 507
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Z)V

    .line 510
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->A:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 511
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    if-eqz v0, :cond_2

    .line 513
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->A:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_selector_no_member:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 515
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->z:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 516
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 517
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 521
    :cond_3
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->r:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 523
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Z)V

    .line 525
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->z:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 526
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 530
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->D:Z

    if-eqz v0, :cond_5

    .line 532
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_chat_all_group_member:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 535
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0, p1}, Lo/bjd;->b(Ljava/util/List;)V

    .line 536
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w:Lo/bjd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->v:[J

    invoke-virtual {v0, v1}, Lo/bjd;->e([J)V

    .line 537
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0}, Lo/bjd;->notifyDataSetChanged()V

    .line 538
    return-void
.end method

.method private a(Landroid/os/Message;)Z
    .locals 3

    .line 255
    const/4 v2, 0x0

    .line 256
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 260
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->t()V

    .line 261
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B()V

    .line 262
    const/4 v2, 0x1

    .line 263
    goto :goto_1

    .line 267
    :sswitch_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->t()V

    .line 268
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(I)V

    .line 269
    const/4 v2, 0x1

    .line 270
    goto :goto_1

    .line 274
    :sswitch_2
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Landroid/os/Message;)V

    .line 275
    const/4 v2, 0x1

    .line 276
    goto :goto_1

    .line 280
    :sswitch_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->t()V

    .line 281
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(II)V

    .line 282
    const/4 v2, 0x1

    .line 283
    goto :goto_1

    .line 287
    :sswitch_4
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->t()V

    .line 288
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(I)V

    .line 289
    const/4 v2, 0x1

    .line 290
    goto :goto_1

    .line 293
    :goto_0
    const/4 v2, 0x0

    .line 296
    :goto_1
    return v2

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0xd1 -> :sswitch_0
        0xd2 -> :sswitch_1
        0xe2 -> :sswitch_4
        0xaaa -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->I:Z

    return v0
.end method

.method private b(I)V
    .locals 4

    .line 1553
    const/16 v0, 0x406

    if-ne p1, v0, :cond_0

    .line 1555
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->N:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(I)V

    .line 1556
    return-void

    .line 1558
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->N:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1560
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_manager_failure_toast:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->M:Ljava/lang/String;

    .line 1561
    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1560
    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 1565
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_group_failure_toast:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->M:Ljava/lang/String;

    .line 1566
    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1565
    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1568
    :goto_0
    return-void
.end method

.method private b(J)V
    .locals 2

    .line 987
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 988
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 989
    const-string v0, "groupId"

    invoke-virtual {v1, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 990
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 991
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 992
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 993
    return-void
.end method

.method private b(JILjava/lang/String;)V
    .locals 3

    .line 1514
    const-string v0, "UserSelectorActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendShareMessage chatType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1515
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    if-eqz v0, :cond_0

    .line 1517
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->setShareInfo(JI)V

    .line 1518
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, p4, v1}, Lo/apz;->d(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)V

    .line 1520
    :cond_0
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 4

    .line 329
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 330
    if-eqz v2, :cond_1

    .line 332
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 333
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->t()V

    .line 334
    if-eqz v3, :cond_1

    .line 337
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w()Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 339
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 343
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(J)V

    .line 347
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 5

    .line 757
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_0

    .line 759
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(JLjava/lang/String;I)V

    goto :goto_0

    .line 761
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 763
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(JLjava/lang/String;I)V

    goto :goto_0

    .line 767
    :cond_1
    new-instance v4, Lo/axv;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    .line 768
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v4, v0, v1, v3, v2}, Lo/axv;-><init>(JILjava/lang/String;)V

    .line 769
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Lo/axv;)V

    .line 772
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;)V
    .locals 4

    .line 694
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 695
    const-class v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 696
    const-string v0, "userId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 697
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 698
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 699
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->t()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->g(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method private b(Ljava/lang/Object;)V
    .locals 3

    .line 1407
    if-nez p1, :cond_0

    .line 1409
    return-void

    .line 1411
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1412
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Ljava/lang/String;)V

    .line 1413
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->F:Z

    if-eqz v0, :cond_3

    .line 1415
    const-string v0, "0"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-eqz v0, :cond_1

    .line 1419
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_creat_new_chat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 1423
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_menu_group_chat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 1428
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_photo_chosed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1431
    :cond_3
    :goto_0
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 683
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->q()V

    .line 684
    new-instance v0, Lo/asu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asu;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1}, Lo/asu;->c(Ljava/util/ArrayList;)V

    .line 685
    return-void
.end method

.method private c(I)V
    .locals 1

    .line 307
    const/16 v0, 0xe3

    if-ne p1, v0, :cond_0

    .line 309
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_num_limite_normal:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 311
    :cond_0
    const/16 v0, 0x3f1

    if-ne p1, v0, :cond_1

    .line 313
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    goto :goto_0

    .line 317
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 319
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/user/User;)V
    .locals 7

    .line 1222
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 1223
    move-object v0, p0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_send_vcard:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    new-instance v5, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1242
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->v()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Landroid/os/Message;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Landroid/os/Message;)V

    return-void
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 632
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 634
    :cond_0
    return-void

    .line 637
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v2, v0, 0x1

    .line 638
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->l()I

    move-result v3

    .line 640
    if-lt v2, v3, :cond_2

    .line 642
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 646
    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Ljava/util/ArrayList;)V

    .line 648
    :goto_0
    return-void
.end method

.method private c(Lo/axv;)V
    .locals 3

    .line 781
    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->h:Ljava/util/ArrayList;

    .line 782
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_0

    .line 784
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, v1}, Lo/bji;->a(Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_0

    .line 786
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 788
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bji;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 791
    :cond_1
    :goto_0
    new-instance v0, Lo/bjs;

    invoke-direct {v0, p0}, Lo/bjs;-><init>(Landroid/content/Context;)V

    .line 792
    invoke-virtual {v0, p1}, Lo/bjs;->a(Lo/axv;)Lo/bjs;

    move-result-object v0

    .line 793
    invoke-virtual {v0, v2}, Lo/bjs;->e(Ljava/util/ArrayList;)Lo/bjs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lo/axv;)V

    .line 794
    invoke-virtual {v0, v1}, Lo/bjs;->d(Lo/bjw;)Lo/bjs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    .line 845
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 846
    return-void
.end method

.method private d(JILjava/lang/String;)V
    .locals 8

    .line 943
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-static {p1, p2, p4, v0}, Lo/bjk;->a(JLjava/lang/String;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Z

    move-result v6

    .line 944
    if-eqz v6, :cond_0

    .line 946
    return-void

    .line 949
    :cond_0
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-wide v1, p1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-object v4, p4

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/apz;->c(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Ljava/lang/String;I)V

    .line 950
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 951
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 953
    const-string v0, "userId"

    invoke-virtual {v7, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_0

    .line 955
    :cond_1
    const/4 v0, 0x2

    if-ne p3, v0, :cond_2

    .line 957
    const-string v0, "groupId"

    invoke-virtual {v7, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 960
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 962
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(J)V

    .line 964
    :cond_3
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v7}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 965
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 966
    return-void
.end method

.method private d(JLjava/lang/String;I)V
    .locals 12

    .line 857
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/axa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 858
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 860
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 863
    :cond_0
    move-object v0, p0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_send_vcard:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v11}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    new-instance v5, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;

    move-object v6, p0

    move-wide v7, p1

    move-object v9, p3

    move/from16 v10, p4

    invoke-direct/range {v5 .. v10}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JLjava/lang/String;I)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 893
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 7

    .line 1458
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 1459
    const/4 v5, 0x0

    .line 1460
    if-eqz v4, :cond_4

    .line 1462
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 1464
    const-string v0, "keySearchFriendList"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    goto :goto_1

    .line 1466
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 1468
    const-string v0, "keySearchGroupMemberMatchList"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 1469
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    if-eqz v0, :cond_2

    .line 1471
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 1473
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 1475
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1476
    goto :goto_1

    .line 1471
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1481
    :cond_2
    :goto_1
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1483
    invoke-virtual {p0, v5}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Ljava/util/ArrayList;)V

    goto :goto_2

    .line 1487
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Z)V

    .line 1490
    :cond_4
    :goto_2
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 4

    .line 1209
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1210
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1211
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x2

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1212
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 1213
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->p()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JILjava/lang/String;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(JILjava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Ljava/lang/Object;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 655
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 657
    return-void

    .line 659
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_grp_invite_dialog_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 660
    move-object v0, p0

    move-object v2, v6

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_btn_invite:I

    new-instance v5, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$1;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$1;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Ljava/util/ArrayList;)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 674
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)J
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->L:J

    return-wide v0
.end method

.method private static e(Z)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 440
    new-instance v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$5;-><init>(Z)V

    return-object v0
.end method

.method private e(I)V
    .locals 5

    .line 1576
    const-string v4, ""

    .line 1577
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1579
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_family_group_bind_phone_tip:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->M:Ljava/lang/String;

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 1583
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_group_bind_phone_tip:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->M:Ljava/lang/String;

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1585
    :goto_0
    const-string v0, ""

    sget v1, Lcom/huawei/android/sns/R$string;->sns_know:I

    const/4 v2, 0x0

    invoke-static {p0, v0, v4, v1, v2}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILo/boj$d;)Landroid/app/AlertDialog;

    .line 1586
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 9

    .line 730
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 731
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_0

    .line 733
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v7, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(JLjava/lang/String;I)V

    goto :goto_0

    .line 735
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 738
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(JLjava/lang/String;I)V

    goto :goto_0

    .line 742
    :cond_1
    new-instance v0, Lo/axv;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    move-object v3, v7

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 743
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lo/axv;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    .line 744
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v0

    invoke-virtual {v8, v0}, Lo/axv;->a(I)V

    .line 745
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/axv;->e(I)V

    .line 746
    invoke-direct {p0, v8}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Lo/axv;)V

    .line 748
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->i(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Landroid/os/Message;)Z
    .locals 1

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(Landroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)Landroid/os/Handler;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    return-object v0
.end method

.method private f(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 708
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 710
    :cond_0
    return-void

    .line 712
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 714
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 715
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 716
    goto :goto_0

    .line 719
    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Ljava/util/ArrayList;)V

    .line 721
    :goto_0
    return-void
.end method

.method private g(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 1292
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->J:Lcom/huawei/health/sns/model/user/User;

    .line 1320
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->N:I

    return v0
.end method

.method private i(Lcom/huawei/health/sns/model/user/User;)V
    .locals 5

    .line 1327
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->q()V

    .line 1328
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v3

    .line 1329
    new-instance v0, Lo/ato;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ato;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->L:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ato;->c(JJ)V

    .line 1330
    return-void
.end method

.method private k(Lcom/huawei/health/sns/model/user/User;)V
    .locals 7

    .line 1251
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->M:Ljava/lang/String;

    .line 1253
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->N:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1255
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_manager:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->M:Ljava/lang/String;

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 1259
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transfer_group:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->M:Ljava/lang/String;

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1261
    :goto_0
    move-object v0, p0

    move-object v2, v6

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_button_transfer:I

    new-instance v5, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1285
    return-void
.end method

.method private k(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 1371
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1372
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1374
    new-instance v0, Lo/atp;

    invoke-direct {v0}, Lo/atp;-><init>()V

    invoke-virtual {v0, v3}, Lo/atp;->c(Lcom/huawei/health/sns/model/group/GroupMember;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 1375
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1376
    goto :goto_0

    .line 1377
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1378
    const-string v0, "userList"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1379
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 1380
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 1382
    return-void
.end method

.method private l()V
    .locals 2

    .line 576
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->N:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 578
    sget v0, Lcom/huawei/android/sns/R$string;->sns_selector_new_manager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setTitle(I)V

    goto :goto_0

    .line 582
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_selector_new_group_manager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setTitle(I)V

    .line 584
    :goto_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 423
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->D:Z

    if-eqz v0, :cond_1

    .line 425
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->G:Z

    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(Z)Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    goto :goto_0

    .line 429
    :cond_1
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->G:Z

    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Z)Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 431
    :goto_0
    return-void
.end method

.method private n()V
    .locals 6

    .line 591
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0}, Lo/bjd;->d()Ljava/util/ArrayList;

    move-result-object v2

    .line 593
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-eqz v0, :cond_0

    .line 595
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->f(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 599
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 600
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->v:[J

    if-eqz v0, :cond_1

    .line 602
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->v:[J

    array-length v0, v0

    add-int/2addr v3, v0

    .line 604
    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    .line 607
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_1

    .line 609
    :cond_2
    const/4 v0, 0x1

    if-le v3, v0, :cond_4

    .line 611
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->v:[J

    if-eqz v0, :cond_3

    .line 613
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->v:[J

    array-length v0, v0

    if-ge v4, v0, :cond_3

    .line 615
    new-instance v5, Lcom/huawei/health/sns/model/user/User;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->v:[J

    aget-wide v0, v0, v4

    invoke-direct {v5, v0, v1}, Lcom/huawei/health/sns/model/user/User;-><init>(J)V

    .line 616
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 619
    :cond_3
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Ljava/util/ArrayList;)V

    .line 622
    :cond_4
    :goto_1
    return-void
.end method

.method private p()V
    .locals 1

    .line 973
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 975
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 977
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->H:Landroid/app/AlertDialog;

    .line 978
    return-void
.end method

.method private q()V
    .locals 1

    .line 1000
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->u()Lo/bio;

    move-result-object v0

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 1001
    return-void
.end method

.method private r()V
    .locals 6

    .line 1059
    move-object v0, p0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_create_group_bind_phone_tip:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_set_up_later:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_set_up_now:I

    new-instance v5, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$9;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$9;-><init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1074
    return-void
.end method

.method private s()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "InflateParams"
        }
    .end annotation

    .line 1129
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_friendselector_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setContentView(I)V

    .line 1131
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a()V

    .line 1133
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->A:Landroid/widget/TextView;

    .line 1134
    sget v0, Lcom/huawei/android/sns/R$id;->sns_fast_search_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    .line 1135
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnd;->setHasBottomBlank(Z)V

    .line 1136
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->D:Z

    if-eqz v0, :cond_2

    .line 1139
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->d()V

    .line 1140
    new-instance v0, Lo/bjj;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->r:I

    const/4 v3, 0x0

    if-ne v3, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/bjj;-><init>(Landroid/content/Context;ZZ)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w:Lo/bjd;

    goto :goto_2

    .line 1144
    :cond_2
    new-instance v0, Lo/bjj;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->r:I

    const/4 v3, 0x0

    if-ne v3, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/bjj;-><init>(Landroid/content/Context;ZZ)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w:Lo/bjd;

    .line 1147
    :goto_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_select_group_head:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->C:Landroid/view/View;

    .line 1148
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->x()V

    .line 1150
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0, v1}, Lo/bnd;->setAdapter(Landroid/widget/BaseAdapter;)V

    .line 1151
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->S:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Lo/bnd;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1155
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->z()V

    .line 1156
    return-void
.end method

.method private t()V
    .locals 1

    .line 1023
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->E:Lo/bio;

    if-eqz v0, :cond_0

    .line 1025
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->E:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 1027
    :cond_0
    return-void
.end method

.method private u()Lo/bio;
    .locals 4

    .line 1010
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->E:Lo/bio;

    if-nez v0, :cond_0

    .line 1013
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->E:Lo/bio;

    .line 1015
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->E:Lo/bio;

    return-object v0
.end method

.method private v()V
    .locals 4

    .line 1389
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1390
    const/4 v3, 0x1

    .line 1391
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->j:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1393
    const/4 v3, 0x0

    .line 1395
    :cond_0
    const-class v0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1396
    const-string v0, "select_type"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1397
    const/4 v0, 0x1

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1398
    return-void
.end method

.method private w()Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;
    .locals 1

    .line 1502
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    return-object v0
.end method

.method private x()V
    .locals 2

    .line 1357
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1359
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->C:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/bnd;->c(Landroid/view/View;)V

    .line 1360
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->I:Z

    .line 1362
    :cond_0
    return-void
.end method

.method private y()V
    .locals 2

    .line 1345
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->C:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/bnd;->a(Landroid/view/View;)V

    .line 1348
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->I:Z

    .line 1350
    :cond_0
    return-void
.end method

.method private z()V
    .locals 2

    .line 1335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y:Lo/bnd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 1337
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->m()V

    .line 1338
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 1

    .line 356
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 357
    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 1188
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    if-eqz v0, :cond_0

    .line 1190
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->k(Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_0

    .line 1192
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->D:Z

    if-eqz v0, :cond_1

    .line 1194
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_0

    .line 1198
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Lcom/huawei/health/sns/model/user/User;)V

    .line 1200
    :goto_0
    return-void
.end method

.method protected c()V
    .locals 5

    .line 382
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c()V

    .line 383
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 384
    if-eqz v3, :cond_5

    .line 386
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 387
    if-nez v4, :cond_0

    .line 389
    return-void

    .line 391
    :cond_0
    const-string v0, "select_type"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 393
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->j:I

    .line 395
    :cond_1
    const-string v0, "isCreateGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 397
    const-string v0, "isCreateGroup"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->F:Z

    .line 399
    :cond_2
    const-string v0, "isContainSelf"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 401
    const-string v0, "isContainSelf"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->G:Z

    .line 403
    :cond_3
    const-string v0, "isTransferGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 405
    const-string v0, "isTransferGroup"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    .line 406
    const-string v0, "groupId"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->L:J

    .line 407
    const-string v0, "transferGroupType"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->N:I

    .line 409
    :cond_4
    const-string v0, "isAllGroupMember"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 411
    const-string v0, "isAllGroupMember"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->D:Z

    .line 412
    const-string v0, "groupId"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->L:J

    .line 416
    :cond_5
    return-void
.end method

.method protected d(Ljava/lang/String;)V
    .locals 3

    .line 1440
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->y()V

    .line 1441
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->D:Z

    if-eqz v0, :cond_1

    .line 1443
    :cond_0
    new-instance v0, Lo/bjc;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bjc;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->L:J

    invoke-virtual {v0, p1, v1, v2}, Lo/bjc;->d(Ljava/lang/String;J)V

    goto :goto_0

    .line 1447
    :cond_1
    new-instance v0, Lo/biy;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->K:Landroid/os/Handler;

    invoke-direct {v0, v1, p1}, Lo/biy;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->G:Z

    invoke-virtual {v0, v1}, Lo/biy;->b(Z)V

    .line 1449
    :goto_0
    return-void
.end method

.method protected e()V
    .locals 5

    .line 543
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->e()V

    .line 544
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->F:Z

    if-eqz v0, :cond_1

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-eqz v0, :cond_0

    .line 549
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_creat_new_chat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 554
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_menu_group_chat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 557
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->B:Z

    if-eqz v0, :cond_2

    .line 559
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->l()V

    goto :goto_0

    .line 561
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->D:Z

    if-eqz v0, :cond_3

    .line 563
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_chat_all_group_member:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "0"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 567
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_user_friend_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 569
    :goto_0
    return-void
.end method

.method g()Z
    .locals 1

    .line 1591
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->F:Z

    if-eqz v0, :cond_0

    .line 1593
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->n()V

    .line 1594
    const/4 v0, 0x1

    return v0

    .line 1596
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 1080
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1081
    const/4 v0, -0x1

    if-ne p2, v0, :cond_5

    .line 1083
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 1085
    if-eqz p3, :cond_2

    .line 1087
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 1088
    if-eqz v2, :cond_2

    .line 1090
    const-string v0, "groupMemberList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1092
    const-string v0, "groupMemberList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 1094
    if-eqz v3, :cond_0

    .line 1096
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->k(Ljava/util/ArrayList;)V

    .line 1098
    :cond_0
    goto :goto_0

    .line 1099
    :cond_1
    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1101
    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 1102
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1103
    const-string v0, "group"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1104
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 1105
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 1110
    :cond_2
    :goto_0
    const/16 v0, 0x7d3

    if-eq p1, v0, :cond_3

    const/16 v0, 0x7d5

    if-ne p1, v0, :cond_4

    .line 1113
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->J:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->i(Lcom/huawei/health/sns/model/user/User;)V

    .line 1114
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->J:Lcom/huawei/health/sns/model/user/User;

    .line 1116
    :cond_4
    const/16 v0, 0x7d4

    if-ne p1, v0, :cond_5

    .line 1118
    const-string v0, "UserSelectorActivity"

    const-string v1, "onSuccess, bind phone result."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1120
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->a()V

    .line 1124
    :cond_5
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 1495
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->x()V

    .line 1496
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onClose()Z

    .line 1497
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 362
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onCreate(Landroid/os/Bundle;)V

    .line 365
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 370
    goto :goto_0

    .line 367
    :catch_0
    move-exception v2

    .line 369
    const-string v0, "UserSelectorActivity"

    const-string v1, "UserSelectorActivity get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e()V

    .line 373
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->s()V

    .line 374
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d()V

    .line 375
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1525
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->t()V

    .line 1526
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onDestroy()V

    .line 1527
    return-void
.end method
