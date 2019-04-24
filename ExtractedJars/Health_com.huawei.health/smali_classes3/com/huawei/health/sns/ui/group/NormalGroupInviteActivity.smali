.class public Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$e;,
        Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;
    }
.end annotation


# static fields
.field private static final h:Ljava/lang/String;


# instance fields
.field private f:I

.field private g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

.field private k:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

.field private l:Landroid/widget/TextView;

.field private m:Lo/egd;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/os/Handler;

.field private u:Lo/bio;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 68
    sget-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->b:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->k:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->u:Lo/bio;

    .line 118
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$e;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->r:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 1

    .line 207
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_send_invite_group_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->setContentView(I)V

    .line 208
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->b()V

    .line 210
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->q:Landroid/widget/LinearLayout;

    .line 211
    sget v0, Lcom/huawei/android/sns/R$id;->group_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->p:Landroid/widget/ImageView;

    .line 212
    sget v0, Lcom/huawei/android/sns/R$id;->group_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->o:Landroid/widget/TextView;

    .line 213
    sget v0, Lcom/huawei/android/sns/R$id;->group_member_count:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->n:Landroid/widget/TextView;

    .line 214
    sget v0, Lcom/huawei/android/sns/R$id;->group_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->l:Landroid/widget/TextView;

    .line 215
    sget v0, Lcom/huawei/android/sns/R$id;->apply_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->m:Lo/egd;

    .line 217
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->c()V

    .line 218
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->m()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;II)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->c(II)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 236
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 237
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 241
    :cond_0
    return-void
.end method

.method private b(II)V
    .locals 1

    .line 459
    const/16 v0, 0x3f1

    if-ne p2, v0, :cond_0

    .line 461
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->p()V

    .line 462
    return-void

    .line 464
    :cond_0
    const/16 v0, 0x3f0

    if-ne p2, v0, :cond_1

    .line 466
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 467
    return-void

    .line 470
    :cond_1
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 471
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;II)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->b(II)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)Lcom/huawei/health/sns/model/chat/GrpInviteMessage;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 225
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->m:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 227
    invoke-static {p0}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v5

    .line 228
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->p:Landroid/widget/ImageView;

    int-to-double v1, v5

    const-wide v3, 0x3fc0a3d70a3d70a4L    # 0.13

    mul-double/2addr v1, v3

    double-to-int v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 229
    return-void
.end method

.method private c(II)V
    .locals 4

    .line 483
    const/4 v3, 0x0

    .line 485
    if-eqz p1, :cond_0

    .line 487
    sget v0, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 489
    :cond_0
    const/16 v0, 0x3ec

    if-ne p2, v0, :cond_1

    .line 491
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_authority:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 493
    :cond_1
    const/16 v0, 0x3f0

    if-ne p2, v0, :cond_2

    .line 495
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atb;->b(J)V

    .line 496
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 498
    :cond_2
    const/16 v0, 0x3f8

    if-ne p2, v0, :cond_3

    .line 500
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 504
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_normao_groupinfo_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 506
    :goto_0
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)V

    invoke-static {p0, v3, v0}, Lo/boj;->e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;

    .line 514
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;Ljava/lang/String;ILjava/util/ArrayList;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->d(Ljava/lang/String;ILjava/util/ArrayList;)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->u:Lo/bio;

    if-nez v0, :cond_0

    .line 403
    new-instance v0, Lo/bio;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->u:Lo/bio;

    goto :goto_0

    .line 407
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->u:Lo/bio;

    invoke-virtual {v0, p1}, Lo/bio;->d(Ljava/lang/String;)V

    .line 409
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->u:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 410
    return-void
.end method

.method private d(Ljava/lang/String;ILjava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getResources()Landroid/content/res/Resources;

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

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p3}, Lo/bpg;->a(Landroid/widget/ImageView;JLjava/util/ArrayList;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setGroupName(Ljava/lang/String;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setGrpMemCount(I)V

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0, p3}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setMemberList(Ljava/util/ArrayList;)V

    .line 330
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->k()V

    .line 331
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->f:I

    return v0
.end method

.method private e(I)V
    .locals 1

    .line 420
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 424
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->p()V

    .line 425
    goto :goto_0

    .line 429
    :pswitch_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_overdue:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 430
    goto :goto_0

    .line 434
    :pswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_join_normal_num_limite:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 435
    .line 440
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->e(I)V

    return-void
.end method

.method private e()Z
    .locals 4

    .line 248
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 249
    if-nez v2, :cond_0

    .line 251
    const/4 v0, 0x0

    return v0

    .line 253
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 254
    if-nez v3, :cond_1

    .line 256
    const/4 v0, 0x0

    return v0

    .line 259
    :cond_1
    const-string v0, "bundleKey_msg_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 261
    const-string v0, "bundleKey_msg_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->f:I

    .line 264
    :cond_2
    const-string v0, "bundleKey_grp_invite_msg"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 266
    const-string v0, "bundleKey_grp_invite_msg"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    .line 269
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    if-nez v0, :cond_4

    .line 271
    sget-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->h:Ljava/lang/String;

    const-string v1, "get intent data ths grpInviteMessage is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    const/4 v0, 0x0

    return v0

    .line 274
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private g()V
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->m:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 363
    return-void
.end method

.method private h()V
    .locals 11

    .line 282
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getOperatorId()J

    move-result-wide v6

    .line 283
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-nez v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->b:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    :goto_0
    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->k:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    .line 285
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGrpMemCount()I

    move-result v8

    .line 286
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getMemberList()Ljava/util/ArrayList;

    move-result-object v9

    .line 288
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupName()Ljava/lang/String;

    move-result-object v10

    .line 289
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    invoke-static {v9}, Lo/ati;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v10

    .line 293
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    if-nez v8, :cond_2

    if-eqz v9, :cond_2

    .line 298
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 300
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v8, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->l:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->o()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 303
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_group_invite_over_num_info:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_1

    .line 304
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_group_sent_already:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    .line 302
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->m:Lo/egd;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->o()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    goto :goto_2

    :cond_4
    const/16 v1, 0x8

    :goto_2
    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2, v9}, Lo/bpg;->a(Landroid/widget/ImageView;JLjava/util/ArrayList;)V

    .line 309
    return-void
.end method

.method private k()V
    .locals 3

    .line 338
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/brb;->e(Lo/brd;Lo/brc;)Lo/bqy;

    .line 355
    return-void
.end method

.method private m()V
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->u:Lo/bio;

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->u:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 394
    :cond_0
    return-void
.end method

.method private n()V
    .locals 9

    .line 370
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->d(Ljava/lang/String;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v6

    .line 372
    new-instance v8, Lo/asx;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->r:Landroid/os/Handler;

    invoke-direct {v8, v0}, Lo/asx;-><init>(Landroid/os/Handler;)V

    .line 373
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 376
    move-object v0, v8

    move-wide v2, v6

    const/16 v1, 0x2320

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/asx;->d(IJZZ)V

    goto :goto_0

    .line 381
    :cond_0
    const/16 v0, 0x2320

    invoke-virtual {v8, v0, v6, v7}, Lo/asx;->d(IJ)V

    .line 383
    :goto_0
    return-void
.end method

.method private o()Z
    .locals 2

    .line 537
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->k:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    sget-object v1, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->b:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private p()V
    .locals 4

    .line 447
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 448
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 449
    const-string v0, "groupId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 450
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->startActivity(Landroid/content/Intent;)V

    .line 451
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->finish()V

    .line 452
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 519
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->d(Ljava/lang/String;)V

    .line 520
    new-instance v0, Lo/asp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->r:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asp;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/asp;->b(J)V

    .line 521
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 187
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 189
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->a()V

    .line 190
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->e()Z

    move-result v0

    .line 191
    if-nez v0, :cond_0

    .line 193
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->finish()V

    .line 194
    return-void

    .line 196
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->h()V

    .line 198
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->n()V

    .line 199
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->g()V

    .line 200
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 526
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->m()V

    .line 527
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 528
    return-void
.end method
