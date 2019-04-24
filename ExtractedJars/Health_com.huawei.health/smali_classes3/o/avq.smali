.class public Lo/avq;
.super Lo/avm;
.source "SourceFile"


# static fields
.field private static final g:Ljava/lang/String;


# instance fields
.field private l:J

.field private m:Ljava/lang/String;

.field private n:J

.field private o:Ljava/lang/String;

.field private p:I

.field private r:J

.field private t:Landroid/graphics/Bitmap;

.field private u:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const-class v0, Lo/avq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/avq;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lo/avm;-><init>(Ljava/lang/String;)V

    .line 98
    return-void
.end method

.method private b(J)Z
    .locals 5

    .line 473
    const/4 v3, 0x0

    .line 474
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v4

    .line 475
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 477
    const/4 v3, 0x1

    .line 479
    :cond_0
    return v3
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    .line 370
    const/4 v5, 0x1

    .line 371
    invoke-direct {p0, p1}, Lo/avq;->g(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 373
    const/4 v0, 0x0

    return v0

    .line 375
    :cond_0
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    iget-wide v3, p0, Lo/avq;->n:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v6

    .line 377
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Lo/avq;->l:J

    invoke-direct {p0, v0, v1}, Lo/avq;->b(J)Z

    move-result v0

    if-nez v0, :cond_1

    .line 379
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "has joined the family, do not show notification!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    const/4 v5, 0x0

    goto :goto_0

    .line 384
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_invite_notify:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/avq;->o:Ljava/lang/String;

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->k:Ljava/lang/String;

    .line 385
    sget-object v0, Lo/auu$b;->c:Lo/auu$b;

    iput-object v0, p0, Lo/avq;->a:Lo/auu$b;

    .line 387
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    iget-wide v3, p0, Lo/avq;->r:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ave;->e(JJ)V

    .line 389
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0}, Lo/avk;->b()V

    .line 391
    :goto_0
    return v5
.end method

.method private c(Landroid/content/Context;Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;
    .locals 2

    .line 438
    const-string v1, ""

    .line 440
    if-eqz p2, :cond_0

    .line 442
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    .line 445
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 447
    iget-object v1, p0, Lo/avq;->m:Ljava/lang/String;

    .line 449
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 452
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 454
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 459
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 462
    :cond_3
    :goto_0
    return-object v1
.end method

.method private c()V
    .locals 5

    .line 584
    new-instance v4, Lo/atb;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/atb;-><init>(Landroid/os/Handler;)V

    .line 585
    iget-wide v0, p0, Lo/avq;->l:J

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v4, v2, v0, v1, v3}, Lo/atb;->b(IJZ)V

    .line 586
    return-void
.end method

.method private d(Landroid/content/Context;Lcom/huawei/health/sns/model/group/Group;)Ljava/lang/String;
    .locals 5

    .line 301
    const/4 v4, 0x0

    .line 302
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 312
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    if-nez v0, :cond_2

    .line 315
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lo/avq;->o:Ljava/lang/String;

    .line 316
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 318
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_notify_title:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 321
    :cond_2
    :goto_1
    return-object v4
.end method

.method private f(Landroid/content/Context;)Z
    .locals 2

    .line 331
    iget-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 333
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "receive Group transfer push message,but local group is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const/4 v0, 0x0

    return v0

    .line 336
    :cond_0
    iget-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0, p1, v0}, Lo/avq;->d(Landroid/content/Context;Lcom/huawei/health/sns/model/group/Group;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->h:Ljava/lang/String;

    .line 337
    iget-object v0, p0, Lo/avq;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 339
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "receive Group transfer push message, group title is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    const/4 v0, 0x0

    return v0

    .line 343
    :cond_1
    iget-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 346
    sget v0, Lcom/huawei/android/sns/R$string;->sns_family_group_transfer_content:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->k:Ljava/lang/String;

    goto :goto_0

    .line 348
    :cond_2
    iget-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    if-nez v0, :cond_3

    .line 351
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_transfer_content:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->k:Ljava/lang/String;

    .line 353
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/avq;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 355
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "receive Group transfer push message, group title is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    const/4 v0, 0x0

    return v0

    .line 358
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private g(Landroid/content/Context;)Z
    .locals 5

    .line 283
    const/4 v4, 0x0

    .line 284
    iget-object v0, p0, Lo/avq;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 286
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_notify_title:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/avq;->o:Ljava/lang/String;

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->h:Ljava/lang/String;

    .line 287
    const/4 v4, 0x1

    .line 289
    :cond_0
    return v4
.end method

.method private h(Landroid/content/Context;)Z
    .locals 6

    .line 191
    const/4 v4, 0x0

    .line 193
    invoke-direct {p0, p1}, Lo/avq;->k(Landroid/content/Context;)Z

    move-result v5

    .line 195
    if-eqz v5, :cond_1

    iget-boolean v0, p0, Lo/avq;->c:Z

    if-eqz v0, :cond_1

    .line 197
    iget v0, p0, Lo/avq;->p:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 198
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    iget-object v1, p0, Lo/avq;->a:Lo/auu$b;

    iget-wide v2, p0, Lo/avq;->l:J

    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->a(Lo/auu$b;J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 200
    const/4 v4, 0x1

    goto :goto_0

    .line 202
    :cond_0
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    iget-object v1, p0, Lo/avq;->a:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/aut;->c(Lo/auu$b;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 204
    const/4 v4, 0x1

    .line 207
    :cond_1
    :goto_0
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "is need show notification == "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    return v4
.end method

.method private i(Landroid/content/Context;)Z
    .locals 2

    .line 419
    const/4 v1, 0x1

    .line 420
    invoke-direct {p0, p1}, Lo/avq;->g(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    const/4 v0, 0x0

    return v0

    .line 424
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_removed_by_manager:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->k:Ljava/lang/String;

    .line 425
    return v1
.end method

.method private k(Landroid/content/Context;)Z
    .locals 8

    .line 220
    const/4 v4, 0x1

    .line 221
    const-string v5, ""

    .line 222
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->n:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v6

    .line 223
    invoke-direct {p0, p1, v6}, Lo/avq;->c(Landroid/content/Context;Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;

    move-result-object v5

    .line 224
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    .line 225
    iget v0, p0, Lo/avq;->p:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 228
    :pswitch_0
    invoke-direct {p0, p1, v5}, Lo/avq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 229
    goto :goto_1

    .line 231
    :pswitch_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v7

    .line 232
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 240
    :cond_0
    const/4 v4, 0x0

    .line 241
    sget-object v0, Lo/auu$b;->a:Lo/auu$b;

    iput-object v0, p0, Lo/avq;->a:Lo/auu$b;

    .line 244
    :goto_0
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    iget v3, p0, Lo/avq;->p:I

    invoke-virtual {v0, v1, v2, v3}, Lo/avk;->d(JI)V

    .line 245
    goto :goto_1

    .line 251
    :pswitch_2
    const/4 v4, 0x0

    .line 252
    goto :goto_1

    .line 254
    :pswitch_3
    invoke-direct {p0, p1}, Lo/avq;->i(Landroid/content/Context;)Z

    move-result v4

    .line 255
    sget-object v0, Lo/auu$b;->c:Lo/auu$b;

    iput-object v0, p0, Lo/avq;->a:Lo/auu$b;

    .line 256
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    iget v3, p0, Lo/avq;->p:I

    invoke-virtual {v0, v1, v2, v3}, Lo/avk;->a(JI)V

    .line 257
    goto :goto_1

    .line 259
    :pswitch_4
    invoke-direct {p0, p1}, Lo/avq;->f(Landroid/content/Context;)Z

    move-result v4

    .line 260
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    iget v3, p0, Lo/avq;->p:I

    invoke-virtual {v0, v1, v2, v3}, Lo/avk;->b(JI)V

    .line 262
    sget-object v0, Lo/auu$b;->a:Lo/auu$b;

    iput-object v0, p0, Lo/avq;->a:Lo/auu$b;

    .line 263
    .line 267
    :goto_1
    if-eqz v4, :cond_1

    iget-object v0, p0, Lo/avq;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "showNotify(), notifyContent empty!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const/4 v4, 0x0

    .line 273
    :cond_1
    return v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private p(Landroid/content/Context;)V
    .locals 3

    .line 574
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "sync group member from server."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    new-instance v2, Lo/atg;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/atg;-><init>(Landroid/os/Handler;)V

    .line 576
    iget-wide v0, p0, Lo/avq;->l:J

    invoke-virtual {v2, v0, v1}, Lo/atg;->a(J)V

    .line 577
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 106
    invoke-super {p0}, Lo/avm;->a()V

    .line 107
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "parse group invite push message."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const/4 v4, 0x0

    .line 111
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lo/avq;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 112
    const-string v0, "GroupInvatationNotify"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 120
    goto :goto_0

    .line 114
    :catch_0
    move-exception v5

    .line 116
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "parse exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse GroupInvatationNotify exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 119
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 118
    invoke-static {v0}, Lo/bpj;->d(Ljava/lang/String;)V

    .line 121
    :goto_0
    if-eqz v4, :cond_1

    .line 123
    const-string v0, "pushUID"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avq;->d:J

    .line 124
    const-string v0, "userID"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avq;->n:J

    .line 125
    const-string v0, "nickName"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->m:Ljava/lang/String;

    .line 126
    const-string v0, "grpID"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avq;->l:J

    .line 127
    const-string v0, "grpName"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->o:Ljava/lang/String;

    .line 128
    const-string v0, "type"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/avq;->p:I

    .line 129
    const-string v0, "expireDate"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    const-string v0, "expireDate"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avq;->r:J

    .line 133
    :cond_0
    iget-wide v0, p0, Lo/avq;->r:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x240c8400

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/avq;->r:J

    .line 138
    :cond_1
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    .line 157
    invoke-super {p0, p1}, Lo/avm;->a(Landroid/content/Context;)V

    .line 159
    invoke-direct {p0, p1}, Lo/avq;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    invoke-virtual {p0}, Lo/avq;->e()V

    .line 162
    iget-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0}, Lo/bpg;->a(Lcom/huawei/health/sns/model/group/Group;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->t:Landroid/graphics/Bitmap;

    .line 165
    iget-object v0, p0, Lo/avq;->t:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 168
    invoke-static {}, Lo/bom;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    iget-object v0, p0, Lo/avq;->u:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/avq;->t:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lo/boe;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/avq;->t:Landroid/graphics/Bitmap;

    .line 176
    :cond_0
    iget-object v0, p0, Lo/avq;->i:Lo/aye;

    iget-object v1, p0, Lo/avq;->t:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lo/aye;->c(Landroid/graphics/Bitmap;)V

    .line 179
    :cond_1
    invoke-virtual {p0, p1}, Lo/avq;->c(Landroid/content/Context;)V

    .line 181
    :cond_2
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 5

    .line 497
    invoke-virtual {p0}, Lo/avq;->a()V

    .line 498
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Grp Invite Push Notification message. type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/avq;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 500
    const/4 v4, 0x1

    .line 501
    iget v0, p0, Lo/avq;->p:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 507
    :pswitch_0
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;

    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 508
    goto :goto_1

    .line 512
    :pswitch_1
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;

    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 513
    goto :goto_1

    .line 515
    :goto_0
    :pswitch_2
    const/4 v4, 0x0

    .line 518
    :goto_1
    if-eqz v4, :cond_0

    .line 520
    const-string v0, "activity_open_from_notification_flag"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 521
    invoke-virtual {p0, p1, v3}, Lo/avq;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 522
    invoke-super {p0, p1}, Lo/avm;->b(Landroid/content/Context;)V

    .line 524
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(Landroid/content/Context;)V
    .locals 2

    .line 485
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    const-string v1, "showNotification."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    invoke-virtual {p0}, Lo/avq;->f()V

    .line 487
    iget-object v0, p0, Lo/avq;->i:Lo/aye;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/aye;->c(Z)V

    .line 488
    invoke-super {p0, p1}, Lo/avm;->c(Landroid/content/Context;)V

    .line 489
    return-void
.end method

.method protected e()V
    .locals 3

    .line 146
    invoke-super {p0}, Lo/avm;->e()V

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lo/avq;->n:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/avq;->p:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, p0, Lo/avq;->e:I

    .line 148
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    iget-object v1, p0, Lo/avq;->a:Lo/auu$b;

    iget v2, p0, Lo/avq;->e:I

    invoke-virtual {v0, v1, v2}, Lo/auu;->e(Lo/auu$b;I)V

    .line 149
    return-void
.end method

.method protected e(Landroid/content/Context;)V
    .locals 4

    .line 529
    invoke-super {p0, p1}, Lo/avm;->e(Landroid/content/Context;)V

    .line 531
    sget-object v0, Lo/avq;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sync group member, pushType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/avq;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    iget v0, p0, Lo/avq;->p:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 540
    :pswitch_0
    invoke-direct {p0, p1}, Lo/avq;->p(Landroid/content/Context;)V

    .line 541
    goto :goto_0

    .line 545
    :pswitch_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/avq;->l:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 548
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    if-nez v0, :cond_1

    .line 550
    :cond_0
    invoke-direct {p0, p1}, Lo/avq;->p(Landroid/content/Context;)V

    goto :goto_0

    .line 556
    :pswitch_2
    invoke-direct {p0, p1}, Lo/avq;->p(Landroid/content/Context;)V

    .line 557
    invoke-direct {p0}, Lo/avq;->c()V

    .line 558
    .line 565
    :cond_1
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
