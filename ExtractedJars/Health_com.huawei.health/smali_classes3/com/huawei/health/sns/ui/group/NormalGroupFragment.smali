.class public Lcom/huawei/health/sns/ui/group/NormalGroupFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Lo/avk$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/NormalGroupFragment$e;
    }
.end annotation


# instance fields
.field private B:Landroid/app/ActionBar;

.field private C:Landroid/widget/TextView;

.field private a:Lo/bgn;

.field private j:Landroid/content/BroadcastReceiver;

.field private l:J

.field private m:Lo/bkj;

.field private o:Lcom/huawei/health/sns/model/group/Group;

.field private p:Lo/bgp;

.field private q:Lo/bgs;

.field private r:Lo/bio;

.field private s:I

.field private t:Lo/bgr;

.field private u:Lo/atv;

.field private v:Landroid/app/AlertDialog;

.field private w:Landroid/app/AlertDialog;

.field private x:Landroid/os/Handler;

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 167
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    .line 182
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    .line 202
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$e;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    .line 207
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->z:Z

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->w:Landroid/app/AlertDialog;

    .line 221
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->v:Landroid/app/AlertDialog;

    .line 226
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->y:Z

    .line 1399
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$10;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->j:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private A()V
    .locals 3

    .line 1425
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 1426
    const-string v0, "QUIT_GROUP_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1427
    const-string v0, "TRANSFER_GROUP_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1428
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->B()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 1429
    if-eqz v2, :cond_0

    .line 1431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1433
    :cond_0
    return-void
.end method

.method private B()Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    .line 1442
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)J
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    return-wide v0
.end method

.method private a(I)V
    .locals 3

    .line 872
    const/4 v2, 0x0

    .line 874
    const/16 v0, 0x3ec

    if-ne p1, v0, :cond_0

    .line 876
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_authority:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 878
    :cond_0
    const/16 v0, 0x3f0

    if-ne p1, v0, :cond_1

    .line 880
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 882
    :cond_1
    const/16 v0, 0x3f8

    if-eq p1, v0, :cond_2

    .line 884
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_normao_groupinfo_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 887
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 889
    return-void

    .line 892
    :cond_3
    const/16 v0, 0x3f0

    if-ne p1, v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Ljava/lang/String;ZZ)V

    .line 893
    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 3

    .line 814
    if-nez p1, :cond_0

    .line 816
    return-void

    .line 818
    :cond_0
    const-string v0, "bundleKeyGroup"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 819
    if-eqz v2, :cond_1

    .line 821
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 822
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 824
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 827
    :cond_1
    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 1121
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(I)V

    .line 1122
    new-instance v0, Lo/asr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asr;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lo/asr;->c(JLjava/util/ArrayList;)V

    .line 1123
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z
    .locals 1

    .line 90
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z

    move-result v0

    return v0
.end method

.method private b()V
    .locals 2

    .line 332
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->y:Z

    if-nez v0, :cond_0

    .line 334
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normalgrp_quit_succeed:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 336
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t()V

    .line 337
    return-void
.end method

.method private b(Landroid/os/Bundle;)V
    .locals 3

    .line 836
    if-nez p1, :cond_0

    .line 838
    return-void

    .line 840
    :cond_0
    const-string v0, "bundleKeyGroup"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/model/group/Group;

    .line 841
    if-eqz v1, :cond_1

    .line 844
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    .line 845
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 846
    if-eqz v2, :cond_1

    .line 848
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Ljava/lang/String;)V

    .line 851
    :cond_1
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 2

    .line 422
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q()V

    .line 423
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d()V

    .line 424
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 425
    if-eqz v1, :cond_0

    .line 427
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Ljava/lang/String;)V

    .line 429
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o()V

    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 1065
    if-nez p1, :cond_0

    .line 1067
    return-void

    .line 1069
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 1070
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->l()I

    move-result v2

    .line 1073
    iget v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->s:I

    add-int v3, v1, v0

    .line 1075
    if-lt v3, v2, :cond_1

    .line 1077
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 1081
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a(Ljava/util/ArrayList;)V

    .line 1083
    :goto_0
    return-void
.end method

.method private c(IILjava/lang/Object;)V
    .locals 3

    .line 1282
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 1286
    :sswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_num_limite_normal:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1287
    goto :goto_1

    .line 1292
    :sswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_group_member:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1293
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 1294
    goto :goto_1

    .line 1298
    :sswitch_2
    if-eqz p3, :cond_0

    .line 1300
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Ljava/lang/String;ZZ)V

    goto :goto_1

    .line 1306
    :sswitch_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->p()V

    .line 1307
    goto :goto_1

    .line 1311
    :sswitch_4
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->w()V

    .line 1312
    goto :goto_1

    .line 1317
    :sswitch_5
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->v()V

    .line 1318
    goto :goto_1

    .line 1322
    :goto_0
    const/16 v0, 0x3f8

    if-eq p2, v0, :cond_0

    .line 1324
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1329
    :cond_0
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe3 -> :sswitch_0
        0xe6 -> :sswitch_2
        0x3f0 -> :sswitch_1
        0x3f1 -> :sswitch_3
        0x3f2 -> :sswitch_1
        0x405 -> :sswitch_4
        0x406 -> :sswitch_5
    .end sparse-switch
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 9

    .line 966
    if-nez p1, :cond_0

    .line 968
    return-void

    .line 970
    :cond_0
    const/4 v4, 0x0

    .line 971
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 972
    const-string v0, "bundleKeySelfNickName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 973
    if-nez v4, :cond_1

    .line 975
    return-void

    .line 978
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->f()V

    .line 980
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 982
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    if-eqz v0, :cond_2

    .line 984
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v4, v1, v5}, Lo/bgs;->b(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V

    .line 986
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    if-eqz v0, :cond_5

    .line 988
    const/4 v6, 0x0

    .line 989
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 991
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 992
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 994
    move-object v6, v8

    .line 995
    goto :goto_1

    .line 989
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 998
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    invoke-virtual {v0, v6, v5}, Lo/bgr;->c(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/lang/String;)V

    .line 1001
    :cond_5
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 758
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 760
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->p()V

    .line 762
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->m()V

    .line 763
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->f()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;I)V
    .locals 0

    .line 90
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(I)V

    return-void
.end method

.method private c(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z
    .locals 4

    .line 439
    const/4 v3, 0x0

    .line 440
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 446
    :sswitch_0
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q()V

    .line 447
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-direct {p2, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(IILjava/lang/Object;)V

    .line 448
    const/4 v3, 0x1

    .line 449
    goto :goto_0

    .line 453
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p2, v0, v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(II)V

    .line 454
    const/4 v3, 0x1

    .line 455
    goto :goto_0

    .line 460
    :sswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(I)V

    .line 461
    const/4 v3, 0x1

    .line 462
    goto :goto_0

    .line 466
    :sswitch_3
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d()V

    .line 467
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q()V

    .line 468
    const/4 v3, 0x1

    .line 469
    goto :goto_0

    .line 476
    :sswitch_4
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q()V

    .line 477
    const/4 v3, 0x1

    .line 478
    .line 483
    :goto_0
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xb2 -> :sswitch_1
        0xc2 -> :sswitch_0
        0xc3 -> :sswitch_0
        0xc4 -> :sswitch_3
        0xe2 -> :sswitch_0
        0xe4 -> :sswitch_4
        0x155 -> :sswitch_2
        0x246 -> :sswitch_2
        0x2a1 -> :sswitch_4
        0x2a2 -> :sswitch_4
        0xaaa -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;I)I
    .locals 0

    .line 90
    iput p1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->s:I

    return p1
.end method

.method private d(I)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StringFormatMatches"
        }
    .end annotation

    .line 585
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    .line 591
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->C:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_chat_info:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5, v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 592
    return-void
.end method

.method private d(Landroid/os/Bundle;)V
    .locals 4

    .line 517
    if-eqz p1, :cond_2

    .line 519
    const-string v0, "bundleKeyGroup"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 520
    if-eqz v3, :cond_1

    .line 522
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->z:Z

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    if-eqz v0, :cond_0

    .line 524
    const/4 v0, 0x0

    const/16 v1, 0x3f0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(IILjava/lang/Object;)V

    goto :goto_0

    .line 529
    :cond_0
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 531
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->n()V

    goto :goto_0

    .line 536
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->r()V

    .line 539
    :cond_2
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 1

    .line 772
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    .line 774
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    invoke-virtual {v0, p1}, Lo/bgr;->b(Lcom/huawei/health/sns/model/group/Group;)V

    .line 776
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o()V

    .line 777
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->u()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 90
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;Z)V
    .locals 0

    .line 90
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(Z)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 679
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    if-eqz v0, :cond_0

    .line 681
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    invoke-virtual {v0, p1}, Lo/bgs;->a(Ljava/lang/String;)V

    .line 683
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 685
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    .line 687
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    if-eqz v0, :cond_1

    .line 689
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v1}, Lo/bgr;->b(Lcom/huawei/health/sns/model/group/Group;)V

    .line 692
    :cond_1
    return-void
.end method

.method private d(Ljava/lang/String;ZZ)V
    .locals 2

    .line 904
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;

    invoke-direct {v1, p0, p3, p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;ZZ)V

    invoke-static {v0, p1, v1}, Lo/boj;->e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->w:Landroid/app/AlertDialog;

    .line 920
    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 1054
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(I)V

    .line 1055
    new-instance v0, Lo/asw;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asw;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/16 v2, 0x144

    invoke-virtual {v0, v1, v2, p1}, Lo/asw;->a(Landroid/content/Context;ILjava/util/ArrayList;)V

    .line 1056
    return-void
.end method

.method private e(I)V
    .locals 6

    .line 1172
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    .line 1173
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1175
    :cond_0
    return-void

    .line 1177
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->r:Lo/bio;

    if-nez v0, :cond_2

    .line 1179
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    const-string v3, ""

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->r:Lo/bio;

    .line 1181
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->r:Lo/bio;

    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bio;->d(Ljava/lang/String;)V

    .line 1182
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->r:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 1183
    return-void
.end method

.method private e(II)V
    .locals 2

    .line 1240
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q()V

    .line 1241
    const/16 v0, 0x3f0

    if-eq p2, v0, :cond_0

    const/16 v0, 0x3f2

    if-ne p2, v0, :cond_1

    .line 1243
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normalgrp_quit_succeed:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1244
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    .line 1246
    :cond_1
    const/16 v0, 0x406

    if-ne p2, v0, :cond_2

    .line 1248
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->y()V

    goto :goto_0

    .line 1252
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1254
    :goto_0
    return-void
.end method

.method private e(Landroid/os/Bundle;)V
    .locals 4

    .line 787
    if-nez p1, :cond_0

    .line 789
    return-void

    .line 791
    :cond_0
    const-string v0, "bundleKeyGroup"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 792
    if-eqz v3, :cond_2

    .line 794
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->z:Z

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    if-eqz v0, :cond_1

    .line 797
    const/4 v0, 0x0

    const/16 v1, 0x3f0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(IILjava/lang/Object;)V

    goto :goto_0

    .line 802
    :cond_1
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 808
    :cond_2
    const/4 v0, 0x0

    const/16 v1, 0x3f0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(IILjava/lang/Object;)V

    .line 810
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b()V

    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 1092
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    .line 1093
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1095
    :cond_0
    return-void

    .line 1097
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_grp_invite_dialog_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1098
    move-object v0, v6

    move-object v2, v7

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_btn_invite:I

    new-instance v5, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$4;

    invoke-direct {v5, p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$4;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;Ljava/util/ArrayList;)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1112
    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 1212
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->y:Z

    .line 1213
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 1215
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(I)V

    .line 1216
    new-instance v0, Lo/asv;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asv;-><init>(Landroid/os/Handler;)V

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v1, v2, p1}, Lo/asv;->b(Landroid/content/Context;Lcom/huawei/health/sns/model/group/Group;Z)V

    .line 1218
    :cond_0
    return-void
.end method

.method private e(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z
    .locals 3

    .line 347
    const/4 v1, 0x0

    .line 348
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 353
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 354
    invoke-direct {p2, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Landroid/os/Bundle;)V

    .line 355
    const/4 v1, 0x1

    .line 356
    goto :goto_0

    .line 361
    :sswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(Landroid/os/Bundle;)V

    .line 362
    const/4 v1, 0x1

    .line 363
    goto :goto_0

    .line 369
    :sswitch_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b(Landroid/os/Bundle;)V

    .line 370
    const/4 v1, 0x1

    .line 371
    goto :goto_0

    .line 375
    :sswitch_3
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a(Landroid/os/Bundle;)V

    .line 376
    const/4 v1, 0x1

    .line 377
    goto :goto_0

    .line 381
    :sswitch_4
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l()V

    .line 382
    const/4 v1, 0x1

    .line 383
    goto :goto_0

    .line 387
    :sswitch_5
    invoke-direct {p2, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b(Landroid/os/Message;)V

    .line 388
    const/4 v1, 0x1

    .line 389
    goto :goto_0

    .line 393
    :sswitch_6
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a(I)V

    .line 394
    const/4 v1, 0x1

    .line 395
    goto :goto_0

    .line 399
    :sswitch_7
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(Landroid/os/Bundle;)V

    .line 400
    const/4 v1, 0x1

    .line 401
    goto :goto_0

    .line 405
    :sswitch_8
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q()V

    .line 406
    const/4 v1, 0x1

    .line 407
    .line 412
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_4
        0xc1 -> :sswitch_6
        0x143 -> :sswitch_7
        0x144 -> :sswitch_8
        0x148 -> :sswitch_0
        0x149 -> :sswitch_1
        0x151 -> :sswitch_3
        0x152 -> :sswitch_2
        0x245 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z
    .locals 1

    .line 90
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z

    move-result v0

    return v0
.end method

.method private f()V
    .locals 2

    .line 601
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 619
    return-void
.end method

.method private g()V
    .locals 4

    .line 699
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    const/16 v3, 0x148

    invoke-virtual {v0, v3, v1, v2}, Lo/atb;->e(IJ)V

    .line 700
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)I
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->s:I

    return v0
.end method

.method private h()V
    .locals 5

    .line 626
    new-instance v0, Lo/bgr;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bgr;-><init>(Landroid/app/Activity;Landroid/os/Handler;J)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    .line 627
    return-void
.end method

.method private i()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StringFormatMatches"
        }
    .end annotation

    .line 549
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 550
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->B:Landroid/app/ActionBar;

    .line 551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->B:Landroid/app/ActionBar;

    if-eqz v0, :cond_1

    .line 553
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 555
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 557
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_action_bar_title_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    goto :goto_0

    .line 562
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_manager_actionbar_title:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 564
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_chat_user_name:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->C:Landroid/widget/TextView;

    .line 565
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->C:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_chat_info:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 566
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->B:Landroid/app/ActionBar;

    invoke-static {v0, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 567
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->B:Landroid/app/ActionBar;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->toolbar_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 568
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 570
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v6

    .line 571
    const/high16 v0, -0x80000000

    invoke-virtual {v6, v0}, Landroid/view/Window;->addFlags(I)V

    .line 572
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_toolbar_bg_end_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 575
    :cond_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->n()V

    return-void
.end method

.method private j()V
    .locals 2

    .line 1450
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->B()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 1451
    if-eqz v1, :cond_0

    .line 1453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1455
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Landroid/os/Handler;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 648
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 649
    if-eqz v2, :cond_3

    .line 651
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 652
    if-nez v3, :cond_0

    .line 654
    return-void

    .line 656
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 658
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    .line 662
    :cond_1
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 664
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    .line 665
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->z:Z

    .line 668
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->z:Z

    invoke-static {v2, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->z:Z

    .line 670
    :cond_3
    return-void
.end method

.method private l()V
    .locals 4

    .line 715
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    const/16 v3, 0x151

    invoke-virtual {v0, v3, v1, v2}, Lo/atb;->e(IJ)V

    .line 716
    return-void
.end method

.method private m()V
    .locals 3

    .line 858
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->u:Lo/atv;

    if-nez v0, :cond_0

    .line 860
    new-instance v0, Lo/atv;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atv;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->u:Lo/atv;

    .line 862
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->u:Lo/atv;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/atv;->d(Ljava/lang/Long;)V

    .line 863
    return-void
.end method

.method private n()V
    .locals 5

    .line 707
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    const/16 v3, 0x152

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 708
    return-void
.end method

.method private o()V
    .locals 3

    .line 740
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x143

    invoke-virtual {v0, v2, v1}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 741
    return-void
.end method

.method private p()V
    .locals 3

    .line 748
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    .line 749
    return-void
.end method

.method private q()V
    .locals 1

    .line 1161
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->r:Lo/bio;

    if-eqz v0, :cond_0

    .line 1163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->r:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 1165
    :cond_0
    return-void
.end method

.method private r()V
    .locals 5

    .line 956
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    const/16 v3, 0x149

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 957
    return-void
.end method

.method private s()V
    .locals 1

    .line 927
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->w:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->w:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 929
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->w:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 932
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->v:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->v:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 934
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->v:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 937
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d()V

    .line 938
    return-void
.end method

.method private t()V
    .locals 3

    .line 1225
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1226
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1228
    const-string v0, "refresh_searchView"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1229
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->startActivity(Landroid/content/Intent;)V

    .line 1230
    return-void
.end method

.method private u()V
    .locals 6

    .line 1190
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_quit_group_info:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_confirm:I

    new-instance v5, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$3;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$3;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->v:Landroid/app/AlertDialog;

    .line 1204
    return-void
.end method

.method private v()V
    .locals 6

    .line 1336
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_manager_group_member_bind_phone_tip:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_set_up_later:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_set_up_now:I

    new-instance v5, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$7;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$7;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1351
    return-void
.end method

.method private w()V
    .locals 1

    .line 1358
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    if-eqz v0, :cond_0

    .line 1360
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    invoke-virtual {v0}, Lo/bgr;->a()V

    .line 1362
    :cond_0
    return-void
.end method

.method private x()V
    .locals 4

    .line 1369
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->p:Lo/bgp;

    .line 1370
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a:Lo/bgn;

    .line 1371
    new-instance v0, Lo/bkj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkj;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->m:Lo/bkj;

    .line 1372
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->p:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1373
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1374
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->m:Lo/bkj;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1375
    return-void
.end method

.method private y()V
    .locals 6

    .line 1261
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_quit_group_bind_phone_tip:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_menu_group_dismiss:I

    new-instance v5, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$5;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$5;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 1275
    return-void
.end method

.method private z()V
    .locals 2

    .line 1382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->p:Lo/bgp;

    if-eqz v0, :cond_0

    .line 1384
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->p:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1386
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a:Lo/bgn;

    if-eqz v0, :cond_1

    .line 1388
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1390
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->m:Lo/bkj;

    if-eqz v0, :cond_2

    .line 1392
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->m:Lo/bkj;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1394
    :cond_2
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 721
    new-instance v0, Lo/bgs;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bgs;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    .line 722
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c:Lo/bfq;

    .line 723
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bgs;->b(Lo/bfn;)V

    .line 724
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q:Lo/bgs;

    invoke-virtual {v0}, Lo/bgs;->d()V

    .line 725
    return-void
.end method

.method public d()V
    .locals 1

    .line 945
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    if-eqz v0, :cond_0

    .line 947
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    invoke-virtual {v0}, Lo/bgr;->c()V

    .line 949
    :cond_0
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 1

    .line 1006
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    if-eqz v0, :cond_0

    .line 1008
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->t:Lo/bgr;

    invoke-virtual {v0, p1}, Lo/bgr;->a(Lo/bfl;)V

    .line 1010
    :cond_0
    return-void
.end method

.method public e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 2

    .line 731
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_group_info:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b:Landroid/view/View;

    .line 732
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->list_group:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e:Landroid/widget/ListView;

    .line 733
    return-void
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 5

    .line 1460
    sget-object v0, Lo/auu$b;->e:Lo/auu$b;

    if-ne p1, v0, :cond_2

    .line 1462
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->e(Landroid/os/Bundle;)I

    move-result v2

    .line 1463
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/avk;->d(Landroid/os/Bundle;)J

    move-result-wide v3

    .line 1464
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l:J

    cmp-long v0, v0, v3

    if-eqz v0, :cond_1

    .line 1466
    :cond_0
    return-void

    .line 1469
    :cond_1
    const/16 v0, 0x9

    if-ne v2, v0, :cond_2

    .line 1472
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->l()V

    .line 1473
    const-string v0, "NormalGroupFragment"

    const-string v1, "group transfer,get local group info to refresh view."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1476
    :cond_2
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1015
    const/4 v0, -0x1

    if-ne p2, v0, :cond_4

    .line 1017
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1019
    if-eqz p3, :cond_4

    .line 1021
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 1022
    if-eqz v2, :cond_0

    .line 1024
    const-string v0, "userList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 1025
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b(Ljava/util/ArrayList;)V

    .line 1027
    :cond_0
    goto :goto_0

    .line 1029
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 1031
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 1032
    if-eqz v2, :cond_2

    .line 1034
    const-string v0, "memberList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 1035
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Ljava/util/ArrayList;)V

    .line 1037
    :cond_2
    goto :goto_0

    .line 1038
    :cond_3
    const/16 v0, 0x7d4

    if-ne p1, v0, :cond_4

    .line 1040
    const-string v0, "NormalGroupFragment"

    const-string v1, "onSuccess, bind phone result."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1042
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->a()V

    .line 1045
    :cond_4
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1046
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1481
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1482
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e()V

    .line 1483
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 489
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreate(Landroid/os/Bundle;)V

    .line 493
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->k()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 498
    goto :goto_0

    .line 495
    :catch_0
    move-exception v2

    .line 497
    const-string v0, "NormalGroupFragment"

    const-string v1, "NormalGroupFragment get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->i()V

    .line 502
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->h()V

    .line 504
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->g()V

    .line 506
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 507
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 632
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 633
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 635
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d:Lo/bfm;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 637
    :cond_0
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->d:Lo/avk$b;

    invoke-virtual {v0, v1, p0}, Lo/avk;->c(Lo/avk$b;Lo/avk$d;)V

    .line 638
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x()V

    .line 639
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->A()V

    .line 640
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1128
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->z()V

    .line 1129
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->j()V

    .line 1130
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->d:Lo/avk$b;

    invoke-virtual {v0, v1}, Lo/avk;->c(Lo/avk$b;)V

    .line 1131
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->x:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 1132
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->q()V

    .line 1133
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->s()V

    .line 1134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->y:Z

    .line 1135
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroy()V

    .line 1136
    return-void
.end method
