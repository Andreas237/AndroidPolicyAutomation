.class public Lo/bgr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Landroid/app/Activity;

.field private c:Lcom/huawei/health/sns/model/group/Group;

.field private d:Ljava/lang/String;

.field private e:Lcom/huawei/health/sns/model/group/GroupMember;

.field private h:Landroid/app/AlertDialog;

.field private k:J


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;J)V
    .locals 1

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    .line 119
    iput-object p1, p0, Lo/bgr;->b:Landroid/app/Activity;

    .line 120
    iput-object p2, p0, Lo/bgr;->a:Landroid/os/Handler;

    .line 121
    iput-wide p3, p0, Lo/bgr;->k:J

    .line 122
    return-void
.end method

.method static synthetic a(Lo/bgr;)Landroid/os/Handler;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bgr;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private a(JLjava/lang/String;)V
    .locals 2

    .line 412
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lo/bgr;->a:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    const/16 v1, 0x245

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/atq;->c(IJLjava/lang/String;)V

    .line 413
    return-void
.end method

.method static synthetic a(Lo/bgr;JLjava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3}, Lo/bgr;->a(JLjava/lang/String;)V

    return-void
.end method

.method private b()V
    .locals 5

    .line 236
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 237
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 238
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 239
    const-string v0, "bundleKeyGroupId"

    iget-wide v1, p0, Lo/bgr;->k:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 240
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 241
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 242
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 340
    const/4 v6, 0x1

    .line 341
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 343
    const/4 v6, 0x0

    .line 345
    :cond_0
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    move-object v1, p1

    const-string v2, ""

    move-object v3, p2

    new-instance v4, Lo/bgr$1;

    invoke-direct {v4, p0, p3, p2}, Lo/bgr$1;-><init>(Lo/bgr;ILjava/lang/String;)V

    move v5, v6

    invoke-static/range {v0 .. v5}, Lo/bok;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/bgr;->h:Landroid/app/AlertDialog;

    .line 394
    return-void
.end method

.method static synthetic b(Lo/bgr;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/bgr;->g()V

    return-void
.end method

.method static synthetic c(Lo/bgr;)Landroid/app/AlertDialog;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bgr;->h:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 3

    .line 251
    const/4 v2, 0x0

    .line 252
    if-eqz p1, :cond_0

    .line 254
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v2

    .line 255
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 262
    :cond_0
    iget-object v2, p0, Lo/bgr;->d:Ljava/lang/String;

    .line 264
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_edit_user_group_nickname:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v2, v1}, Lo/bgr;->b(Ljava/lang/String;Ljava/lang/String;I)V

    .line 265
    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 299
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 300
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 301
    const-string v0, "select_mode"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 302
    if-eqz p1, :cond_0

    .line 305
    const-string v0, "isContainSelf"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 306
    const-string v0, "isTransferGroup"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 307
    const-string v0, "transferGroupType"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 312
    :cond_0
    const-string v0, "isContainSelf"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 313
    const-string v0, "isAllGroupMember"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 315
    :goto_0
    const-string v0, "groupId"

    iget-object v1, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 316
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 317
    return-void
.end method

.method private d()V
    .locals 7

    .line 272
    iget-object v0, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    sget v6, Lcom/huawei/android/sns/R$string;->sns_clear_group_record:I

    goto :goto_0

    :cond_0
    sget v6, Lcom/huawei/android/sns/R$string;->sns_clear_family_record:I

    .line 274
    :goto_0
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    const-string v1, ""

    iget-object v2, p0, Lo/bgr;->b:Landroid/app/Activity;

    invoke-virtual {v2, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_clear:I

    new-instance v5, Lo/bgr$5;

    invoke-direct {v5, p0}, Lo/bgr$5;-><init>(Lo/bgr;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 290
    return-void
.end method

.method static synthetic d(Lo/bgr;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/bgr;->i()V

    return-void
.end method

.method static synthetic e(Lo/bgr;)Landroid/app/Activity;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 224
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 225
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 226
    const-string v0, "groupId"

    iget-object v1, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 227
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 228
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 229
    return-void
.end method

.method private e(I)V
    .locals 4

    .line 324
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 325
    const-string v0, "complain_category_type"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 326
    const-string v0, "complain_id"

    iget-object v1, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 327
    const-string v0, "complain_info"

    iget-object v1, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 329
    return-void
.end method

.method private e(JJLjava/lang/String;)V
    .locals 6

    .line 424
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lo/bgr;->a:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/atq;->d(JJLjava/lang/String;)V

    .line 425
    return-void
.end method

.method static synthetic e(Lo/bgr;JJLjava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct/range {p0 .. p5}, Lo/bgr;->e(JJLjava/lang/String;)V

    return-void
.end method

.method static synthetic f(Lo/bgr;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/bgr;->k()V

    return-void
.end method

.method private g()V
    .locals 3

    .line 432
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bgr$2;

    invoke-direct {v1, p0}, Lo/bgr$2;-><init>(Lo/bgr;)V

    new-instance v2, Lo/bgr$4;

    invoke-direct {v2, p0}, Lo/bgr$4;-><init>(Lo/bgr;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 468
    return-void
.end method

.method static synthetic i(Lo/bgr;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private i()V
    .locals 2

    .line 477
    new-instance v1, Landroid/content/Intent;

    const-string v0, "delete_msg_record"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 478
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 479
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 480
    return-void
.end method

.method static synthetic k(Lo/bgr;)J
    .locals 2

    .line 55
    iget-wide v0, p0, Lo/bgr;->k:J

    return-wide v0
.end method

.method private k()V
    .locals 2

    .line 401
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 402
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 487
    iget-object v0, p0, Lo/bgr;->h:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 489
    iget-object v0, p0, Lo/bgr;->h:Landroid/app/AlertDialog;

    invoke-static {v0}, Lo/bok;->e(Landroid/app/AlertDialog;)V

    .line 491
    :cond_0
    return-void
.end method

.method public a(Lo/bfl;)V
    .locals 4

    .line 152
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-nez v0, :cond_1

    .line 154
    :cond_0
    return-void

    .line 157
    :cond_1
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v2

    .line 159
    sget-object v0, Lo/bfp$c;->s:Lo/bfp$c;

    if-ne v2, v0, :cond_3

    .line 161
    const-string v3, ""

    .line 162
    iget-object v0, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGrpNameFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 164
    iget-object v0, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v3

    .line 166
    :cond_2
    iget-object v0, p0, Lo/bgr;->b:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_edit_group_normal_name:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v3, v1}, Lo/bgr;->b(Ljava/lang/String;Ljava/lang/String;I)V

    .line 167
    goto :goto_0

    .line 168
    :cond_3
    sget-object v0, Lo/bfp$c;->t:Lo/bfp$c;

    if-ne v2, v0, :cond_4

    .line 170
    invoke-direct {p0}, Lo/bgr;->b()V

    goto :goto_0

    .line 172
    :cond_4
    sget-object v0, Lo/bfp$c;->q:Lo/bfp$c;

    if-ne v2, v0, :cond_5

    .line 174
    iget-object v0, p0, Lo/bgr;->e:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0, v0}, Lo/bgr;->c(Lcom/huawei/health/sns/model/group/GroupMember;)V

    goto :goto_0

    .line 176
    :cond_5
    sget-object v0, Lo/bfp$c;->x:Lo/bfp$c;

    if-ne v2, v0, :cond_6

    .line 178
    invoke-direct {p0}, Lo/bgr;->e()V

    goto :goto_0

    .line 180
    :cond_6
    sget-object v0, Lo/bfp$c;->y:Lo/bfp$c;

    if-ne v2, v0, :cond_7

    .line 182
    invoke-direct {p0}, Lo/bgr;->d()V

    goto :goto_0

    .line 184
    :cond_7
    sget-object v0, Lo/bfp$c;->B:Lo/bfp$c;

    if-ne v2, v0, :cond_8

    .line 186
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bgr;->c(Z)V

    goto :goto_0

    .line 188
    :cond_8
    sget-object v0, Lo/bfp$c;->A:Lo/bfp$c;

    if-ne v2, v0, :cond_9

    .line 190
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/bgr;->c(Z)V

    goto :goto_0

    .line 192
    :cond_9
    sget-object v0, Lo/bfp$c;->H:Lo/bfp$c;

    if-ne v2, v0, :cond_a

    .line 194
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/bgr;->e(I)V

    goto :goto_0

    .line 196
    :cond_a
    sget-object v0, Lo/bfp$c;->G:Lo/bfp$c;

    if-ne v2, v0, :cond_b

    .line 198
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/bgr;->e(I)V

    .line 200
    :cond_b
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lo/bgr;->c:Lcom/huawei/health/sns/model/group/Group;

    .line 143
    return-void
.end method

.method public c()V
    .locals 2

    .line 498
    iget-object v0, p0, Lo/bgr;->h:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lo/bgr;->h:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 501
    iget-object v0, p0, Lo/bgr;->h:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 503
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lo/bgr;->e:Lcom/huawei/health/sns/model/group/GroupMember;

    .line 132
    iput-object p2, p0, Lo/bgr;->d:Ljava/lang/String;

    .line 133
    return-void
.end method
