.class public Lcom/huawei/health/sns/ui/selector/TransmitListFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lo/bmj$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;,
        Lcom/huawei/health/sns/ui/selector/TransmitListFragment$a;,
        Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;
    }
.end annotation


# instance fields
.field protected a:Landroid/widget/ListView;

.field private b:Lcom/huawei/health/sns/model/user/User;

.field protected c:Lo/bjm;

.field protected d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;"
        }
    .end annotation
.end field

.field private g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

.field private h:Ljava/lang/String;

.field private i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

.field private k:Landroid/app/AlertDialog;

.field private l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Landroid/os/Handler;

.field private p:Lo/bgp;

.field private q:Ljava/lang/String;

.field private r:Landroid/view/View;

.field private s:Z

.field private t:Z

.field private u:Lcom/huawei/health/sns/ui/selector/TransmitActivity;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b:Lcom/huawei/health/sns/model/user/User;

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e:Ljava/lang/String;

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->f:Ljava/util/ArrayList;

    .line 149
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->h:Ljava/lang/String;

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;

    .line 191
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 211
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$a;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->o:Landroid/os/Handler;

    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->q:Ljava/lang/String;

    .line 233
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->t:Z

    .line 238
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->s:Z

    .line 243
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->r:Landroid/view/View;

    return-void
.end method

.method private a(J)V
    .locals 7

    .line 1100
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    move-wide v4, p1

    iget-object v6, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lo/aow;->c(Landroid/content/Context;JJLjava/lang/String;)V

    .line 1102
    return-void
.end method

.method private a(JILjava/lang/String;)V
    .locals 7

    .line 766
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-static {p1, p2, p4, v0}, Lo/bjk;->a(JLjava/lang/String;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Z

    move-result v6

    .line 767
    if-eqz v6, :cond_0

    .line 769
    return-void

    .line 772
    :cond_0
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-wide v1, p1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-object v4, p4

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/apz;->c(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Ljava/lang/String;I)V

    .line 774
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(I)V

    .line 775
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 776
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 779
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(J)V

    .line 781
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 783
    invoke-static {p0, p1, p2, p3}, Lo/bjl;->a(Landroid/support/v4/app/Fragment;JI)V

    .line 785
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->o()V

    .line 786
    return-void
.end method

.method private a(Landroid/app/Activity;Ljava/util/ArrayList;Lo/axv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;Lo/axv;)V"
        }
    .end annotation

    .line 711
    new-instance v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;

    invoke-direct {v1, p0, p3}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Lo/axv;)V

    .line 726
    new-instance v0, Lo/bjs;

    invoke-direct {v0, p1}, Lo/bjs;-><init>(Landroid/content/Context;)V

    .line 727
    invoke-virtual {v0, p3}, Lo/bjs;->a(Lo/axv;)Lo/bjs;

    move-result-object v0

    .line 728
    invoke-virtual {v0, p2}, Lo/bjs;->e(Ljava/util/ArrayList;)Lo/bjs;

    move-result-object v0

    .line 729
    invoke-virtual {v0, v1}, Lo/bjs;->d(Lo/bjw;)Lo/bjs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    .line 730
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 731
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;JILjava/lang/String;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(JILjava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;JI)V
    .locals 5

    .line 871
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    if-eqz v0, :cond_1

    .line 873
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareTitle()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareText()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/bjk;->e([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 874
    invoke-static {p2, p3, v3}, Lo/bjk;->d(JLjava/lang/String;)Z

    move-result v4

    .line 875
    if-eqz v4, :cond_0

    .line 877
    return-void

    .line 879
    :cond_0
    invoke-static {p0, p2, p3, p4}, Lo/bjl;->a(Landroid/support/v4/app/Fragment;JI)V

    .line 880
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, p2, p3, p4}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->setShareInfo(JI)V

    .line 881
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, p1, v1}, Lo/apz;->d(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)V

    .line 883
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 886
    invoke-direct {p0, p2, p3}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(J)V

    .line 888
    :cond_2
    return-void
.end method

.method private a(Lo/axv;)V
    .locals 8

    .line 895
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    .line 896
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 898
    :cond_0
    return-void

    .line 901
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 903
    return-void

    .line 905
    :cond_2
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/axa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 906
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 908
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 910
    :cond_3
    move-object v0, v6

    sget v1, Lcom/huawei/android/sns/R$string;->sns_send_vcard:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v7}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    new-instance v5, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Lo/axv;)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    .line 933
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b:Lcom/huawei/health/sns/model/user/User;

    return-object v0
.end method

.method public static b()Lcom/huawei/health/sns/ui/selector/TransmitListFragment;
    .locals 1

    .line 291
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;-><init>()V

    return-object v0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 2

    .line 537
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 539
    const-string v0, "share"

    const-string v1, "TransmitListFragment getIntentData intent.getType() is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    return-void

    .line 544
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 547
    const-string v0, "text/plain"

    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 549
    new-instance v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    sget-object v1, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-direct {v0, v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;-><init>(Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    .line 550
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->initShareData(Landroid/content/Intent;Z)V

    .line 551
    const-string v0, "share"

    const-string v1, "System share single text messgae"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 553
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "image/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 556
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u()V

    .line 558
    new-instance v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    sget-object v1, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-direct {v0, v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;-><init>(Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    .line 559
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->initShareData(Landroid/content/Intent;Z)V

    .line 560
    const-string v0, "share"

    const-string v1, "System share single image messgae"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Landroid/app/Activity;Ljava/util/ArrayList;Lo/axv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;Lo/axv;)V"
        }
    .end annotation

    .line 797
    new-instance v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;

    invoke-direct {v1, p0, p3, p2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Lo/axv;Ljava/util/ArrayList;)V

    .line 814
    new-instance v0, Lo/bjs;

    invoke-direct {v0, p1}, Lo/bjs;-><init>(Landroid/content/Context;)V

    .line 815
    invoke-virtual {v0, p3}, Lo/bjs;->a(Lo/axv;)Lo/bjs;

    move-result-object v0

    .line 816
    invoke-virtual {v0, p2}, Lo/bjs;->e(Ljava/util/ArrayList;)Lo/bjs;

    move-result-object v0

    .line 817
    invoke-virtual {v0, v1}, Lo/bjs;->d(Lo/bjw;)Lo/bjs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    .line 818
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 819
    return-void
.end method

.method private c(Landroid/content/Intent;)V
    .locals 4

    .line 502
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 503
    if-eqz v2, :cond_3

    .line 505
    const-string v0, "mediaMsgType"

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 506
    if-nez v3, :cond_0

    .line 509
    invoke-static {v2}, Lo/bjl;->d(Landroid/os/Bundle;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 510
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 511
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->t()V

    .line 515
    :cond_0
    const-string v0, "sns_sdk_key_need_result"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 517
    const-string v0, "sns_sdk_key_need_result"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->m:Z

    .line 521
    :cond_1
    const-string v0, "key_share_token"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 523
    const-string v0, "key_share_token"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->n:Ljava/lang/String;

    .line 525
    :cond_2
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 527
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e:Ljava/lang/String;

    .line 530
    :cond_3
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 5

    .line 608
    sget v0, Lcom/huawei/android/sns/R$id;->transmit_alllistview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    .line 609
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_subtitle_card_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 610
    sget v0, Lcom/huawei/android/sns/R$id;->title_textview:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 611
    sget v0, Lcom/huawei/android/sns/R$string;->sns_current_chat:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 612
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 613
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->p()V

    .line 614
    return-void
.end method

.method private d(JILjava/lang/String;[Ljava/lang/String;)V
    .locals 6

    .line 831
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_0

    .line 833
    invoke-direct {p0, p4, p1, p2, p3}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(Ljava/lang/String;JI)V

    goto :goto_0

    .line 835
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 838
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-object v1, p4

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->h:Ljava/lang/String;

    move-wide v3, p1

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/apz;->d(Ljava/lang/String;Ljava/lang/String;JI)V

    goto :goto_0

    .line 843
    :cond_1
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-object v1, p4

    move-object v2, p5

    move-wide v3, p1

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/apz;->d(Ljava/lang/String;[Ljava/lang/String;JI)V

    .line 845
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 846
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->o()V

    .line 847
    return-void
.end method

.method private d(Lo/axv;)V
    .locals 4

    .line 687
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l()Landroid/app/Activity;

    move-result-object v2

    .line 688
    if-nez v2, :cond_0

    .line 690
    return-void

    .line 693
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-nez v0, :cond_1

    .line 695
    return-void

    .line 698
    :cond_1
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0, v1}, Lo/bji;->c(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Ljava/util/ArrayList;

    move-result-object v3

    .line 699
    invoke-direct {p0, v2, v3, p1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(Landroid/app/Activity;Ljava/util/ArrayList;Lo/axv;)V

    .line 700
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 2

    .line 474
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    const-string v0, "share"

    const-string v1, "TransmitListFragment getIntentData intent.getType() is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    return-void

    .line 481
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 484
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "image/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u()V

    .line 489
    new-instance v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    sget-object v1, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-direct {v0, v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;-><init>(Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->initShareData(Landroid/content/Intent;Z)V

    .line 491
    const-string v0, "share"

    const-string v1, "System share multi image message."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    :cond_1
    return-void
.end method

.method private e(Landroid/os/Bundle;)V
    .locals 1

    .line 458
    const-string v0, "photoLink"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 460
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 461
    const-string v0, "photoLink"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->h:Ljava/lang/String;

    .line 463
    :cond_0
    const-string v0, "needResult"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 465
    const-string v0, "needResult"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->m:Z

    .line 467
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;JILjava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 68
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d(JILjava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method private e(Lo/axv;)V
    .locals 4

    .line 738
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l()Landroid/app/Activity;

    move-result-object v2

    .line 739
    if-nez v2, :cond_0

    .line 741
    return-void

    .line 744
    :cond_0
    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->f:Ljava/util/ArrayList;

    .line 745
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 747
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0, v1}, Lo/bji;->a(Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_0

    .line 749
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_2

    .line 751
    new-instance v0, Lo/bji;

    invoke-direct {v0}, Lo/bji;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bji;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 754
    :cond_2
    :goto_0
    invoke-direct {p0, v2, v3, p1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c(Landroid/app/Activity;Ljava/util/ArrayList;Lo/axv;)V

    .line 755
    return-void
.end method

.method private g()V
    .locals 5

    .line 569
    new-instance v0, Lo/bjm;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lo/bjm;-><init>(Landroid/content/Context;Landroid/database/Cursor;ZLandroid/widget/ListView;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c:Lo/bjm;

    .line 570
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c:Lo/bjm;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 571
    return-void
.end method

.method private h()V
    .locals 4

    .line 578
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->o:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->p:Lo/bgp;

    .line 579
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->p:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 581
    return-void
.end method

.method private i()V
    .locals 3

    .line 337
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    invoke-static {}, Lo/bmj;->a()Lo/bmj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bmj;->b(Lo/bmj$e;)V

    .line 340
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->t:Z

    .line 341
    invoke-static {}, Lo/bmj;->a()Lo/bmj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bmj;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    :cond_0
    return-void
.end method

.method private k()Z
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private l()Landroid/app/Activity;
    .locals 2

    .line 667
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 668
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 670
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 673
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 675
    const/4 v0, 0x0

    return-object v0

    .line 677
    :cond_2
    return-object v1
.end method

.method private m()V
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 600
    return-void
.end method

.method private n()V
    .locals 2

    .line 588
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->p:Lo/bgp;

    if-eqz v0, :cond_0

    .line 590
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->p:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 592
    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 854
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 855
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 857
    :cond_0
    return-void

    .line 859
    :cond_1
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 860
    return-void
.end method

.method private p()V
    .locals 4

    .line 621
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->s:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 623
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->r:Landroid/view/View;

    .line 624
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->r:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 625
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->s:Z

    .line 627
    :cond_0
    return-void
.end method

.method private t()V
    .locals 2

    .line 1124
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-nez v0, :cond_0

    .line 1126
    return-void

    .line 1128
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1130
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u()V

    goto :goto_0

    .line 1134
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v1

    .line 1135
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 1137
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u()V

    .line 1140
    :cond_2
    :goto_0
    return-void
.end method

.method private u()V
    .locals 2

    .line 1110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1112
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {v0, v1}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1114
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->b()V

    .line 1117
    :cond_0
    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 1

    .line 942
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected b(I)V
    .locals 4

    .line 1084
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1086
    :goto_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 1087
    const-string v0, "local_broadcast_share_result"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1088
    const-string v0, "key_share_token"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->n:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1089
    const-string v0, "key_share_result"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1090
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 1091
    return-void
.end method

.method protected b(Lo/axv;)V
    .locals 2

    .line 646
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_0

    .line 648
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(Lo/axv;)V

    goto :goto_0

    .line 650
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 652
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d(Lo/axv;)V

    goto :goto_0

    .line 656
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e(Lo/axv;)V

    .line 658
    :goto_0
    return-void
.end method

.method public c()V
    .locals 1

    .line 950
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 952
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 954
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k:Landroid/app/AlertDialog;

    .line 955
    return-void
.end method

.method public c(Ljava/lang/String;Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V
    .locals 2

    .line 369
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    if-eqz p2, :cond_0

    .line 374
    const-string v0, "share"

    const-string v1, "update linkMessage Image"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    .line 376
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->t:Z

    .line 379
    :cond_0
    return-void
.end method

.method public d()V
    .locals 5

    .line 383
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 384
    if-eqz v2, :cond_9

    .line 386
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 387
    if-nez v3, :cond_0

    .line 389
    return-void

    .line 393
    :cond_0
    const-string v0, "msgItems"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 395
    const-string v0, "msgItems"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->f:Ljava/util/ArrayList;

    .line 397
    :cond_1
    const-string v0, "vCardUser"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 399
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 400
    const-string v0, "vCardUser"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/User;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b:Lcom/huawei/health/sns/model/user/User;

    .line 402
    :cond_2
    const-string v0, "isNeedStoragePermission"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 404
    const-string v0, "isNeedStoragePermission"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 405
    if-eqz v4, :cond_3

    .line 407
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u()V

    .line 410
    :cond_3
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e(Landroid/os/Bundle;)V

    .line 413
    const-string v0, "action_shareLink"

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 416
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 417
    invoke-static {v3}, Lo/bjl;->d(Landroid/os/Bundle;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 418
    const-string v0, "needResult"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->m:Z

    .line 419
    const-string v0, "downloadUrl"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->q:Ljava/lang/String;

    .line 420
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->t()V

    .line 423
    :cond_4
    const-string v0, "android.intent.action.SEND"

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 425
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(Landroid/content/Intent;)V

    goto :goto_0

    .line 427
    :cond_5
    const-string v0, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 429
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e(Landroid/content/Intent;)V

    .line 432
    :cond_6
    :goto_0
    const-string v0, "sns_sdk_key_viewType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 435
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c(Landroid/content/Intent;)V

    .line 439
    :cond_7
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 442
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 448
    :cond_8
    goto :goto_1

    .line 445
    :catch_0
    move-exception v4

    .line 447
    const-string v0, "share"

    const-string v1, "getIntentData error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    :cond_9
    :goto_1
    return-void
.end method

.method protected e()V
    .locals 10

    .line 998
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;

    const/16 v1, 0x709

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;->cancelOperation(I)V

    .line 1002
    const-string v8, "t_user.user_type= ? or t_conversation.chat_type=?"

    .line 1005
    const/4 v0, 0x2

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 1007
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;

    sget-object v3, Lo/bbz$e;->c:Landroid/net/Uri;

    new-instance v1, Lo/axv;

    invoke-direct {v1}, Lo/axv;-><init>()V

    .line 1008
    invoke-virtual {v1}, Lo/axv;->d()[Ljava/lang/String;

    move-result-object v4

    move-object v5, v8

    move-object v6, v9

    const-string v7, "top_time desc,last_message_date desc"

    .line 1007
    const/16 v1, 0x709

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;->startQuery(ILjava/lang/Object;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1014
    goto :goto_0

    .line 1011
    :catch_0
    move-exception v8

    .line 1013
    const-string v0, "share"

    const-string v1, "startAsyncQuery"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1015
    :goto_0
    return-void
.end method

.method protected e(II)V
    .locals 4

    .line 1022
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1023
    const-string v0, "msgType"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1024
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_0

    .line 1026
    const-string v0, "msgItems"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 1028
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_1

    .line 1030
    const-string v0, "systemShareMsg"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 1032
    :cond_1
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_2

    .line 1034
    const-string v0, "vCardUser"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 1036
    :cond_2
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_3

    .line 1038
    const-string v0, "msgLink"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->l:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1039
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->t:Z

    if-nez v0, :cond_4

    .line 1041
    const-string v0, "webImageStatus"

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->t:Z

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 1044
    :cond_3
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_4

    .line 1046
    const-string v0, "photoLink"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->h:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1049
    :cond_4
    :goto_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_5

    .line 1051
    const-string v0, "isCreateGroup"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1052
    const-string v0, "select_mode"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1053
    const-string v0, "key_sns_pkg_name"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1054
    const-class v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p0, v0, v3, v1, v2}, Lo/bjl;->e(Landroid/support/v4/app/Fragment;Ljava/lang/Class;Landroid/os/Bundle;ZI)V

    goto :goto_1

    .line 1059
    :cond_5
    const-string v0, "group_type"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1060
    const-string v0, "key_sns_pkg_name"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1061
    const-class v0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p0, v0, v3, v1, v2}, Lo/bjl;->e(Landroid/support/v4/app/Fragment;Ljava/lang/Class;Landroid/os/Bundle;ZI)V

    .line 1065
    :goto_1
    return-void
.end method

.method protected f()Z
    .locals 1

    .line 1074
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->m:Z

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1145
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1146
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1149
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->s:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->r:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 1151
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->s:Z

    .line 1152
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->r:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    goto :goto_0

    .line 1157
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->p()V

    .line 1159
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 297
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 298
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 312
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_transmit_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 313
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->u:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    .line 316
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    goto :goto_0

    .line 318
    :catch_0
    move-exception v3

    .line 320
    const-string v0, "share"

    const-string v1, "TransmitListFragment get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->i()V

    .line 325
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c(Landroid/view/View;)V

    .line 326
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->g()V

    .line 327
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->m()V

    .line 328
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->h()V

    .line 329
    return-object v2
.end method

.method public onDestroyView()V
    .locals 1

    .line 357
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->n()V

    .line 358
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 359
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    invoke-static {}, Lo/bmj;->a()Lo/bmj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bmj;->d(Lo/bmj$e;)V

    .line 363
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 364
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 633
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/axv;

    if-nez v0, :cond_1

    .line 635
    :cond_0
    return-void

    .line 637
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/axv;

    .line 638
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(Lo/axv;)V

    .line 639
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 303
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 304
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;-><init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;

    .line 305
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e()V

    .line 307
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 989
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 990
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c:Lo/bjm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bjm;->changeCursor(Landroid/database/Cursor;)V

    .line 991
    return-void
.end method
