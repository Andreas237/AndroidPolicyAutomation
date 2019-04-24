.class public Lo/blq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aws;


# instance fields
.field private a:Lo/bln;

.field private b:Lo/blm;

.field private c:Lo/blr;

.field private d:Lo/blp;

.field private e:Lo/blg;

.field private f:Lo/blj;

.field private g:Lo/blo;

.field private h:Lo/blt;

.field private i:J

.field private k:Lo/bll;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field private p:Lo/blu;

.field private q:Lcom/huawei/health/sns/ui/user/UserDetailActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Lo/bly;Landroid/os/Handler;JLjava/lang/String;)V
    .locals 1

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->b:Lo/blm;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->d:Lo/blp;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->c:Lo/blr;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->e:Lo/blg;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->a:Lo/bln;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->h:Lo/blt;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->k:Lo/bll;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->g:Lo/blo;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blq;->f:Lo/blj;

    .line 89
    sget-object v0, Lo/blu;->c:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 94
    const/4 v0, 0x4

    iput v0, p0, Lo/blq;->m:I

    .line 120
    iput-object p1, p0, Lo/blq;->q:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    .line 121
    invoke-direct {p0, p1, p2, p3}, Lo/blq;->c(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Lo/bly;Landroid/os/Handler;)V

    .line 122
    iput-wide p4, p0, Lo/blq;->i:J

    .line 123
    iput-object p6, p0, Lo/blq;->l:Ljava/lang/String;

    .line 124
    return-void
.end method

.method private c(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Lo/bly;Landroid/os/Handler;)V
    .locals 2

    .line 161
    new-instance v0, Lo/blm;

    invoke-direct {v0, p1, p3, p2}, Lo/blm;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->b:Lo/blm;

    .line 162
    new-instance v0, Lo/blp;

    invoke-direct {v0, p1, p3, p2}, Lo/blp;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->d:Lo/blp;

    .line 163
    new-instance v0, Lo/blr;

    invoke-direct {v0, p1, p3, p2}, Lo/blr;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->c:Lo/blr;

    .line 164
    new-instance v0, Lo/blg;

    invoke-direct {v0, p1, p3, p2}, Lo/blg;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->e:Lo/blg;

    .line 165
    new-instance v0, Lo/bln;

    invoke-direct {v0, p1, p3, p2}, Lo/bln;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->a:Lo/bln;

    .line 166
    new-instance v0, Lo/blt;

    invoke-direct {v0, p1, p3, p2}, Lo/blt;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->h:Lo/blt;

    .line 167
    new-instance v0, Lo/bll;

    invoke-direct {v0, p1, p3, p2}, Lo/bll;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->k:Lo/bll;

    .line 168
    new-instance v0, Lo/blo;

    invoke-direct {v0, p1, p3, p2}, Lo/blo;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    iput-object v0, p0, Lo/blq;->g:Lo/blo;

    .line 169
    new-instance v0, Lo/blj;

    iget-object v1, p0, Lo/blq;->l:Ljava/lang/String;

    invoke-direct {v0, p1, p3, p2, v1}, Lo/blj;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;Ljava/lang/String;)V

    iput-object v0, p0, Lo/blq;->f:Lo/blj;

    .line 170
    iget-object v0, p0, Lo/blq;->f:Lo/blj;

    invoke-virtual {v0, p0}, Lo/blj;->b(Lo/aws;)V

    .line 171
    return-void
.end method

.method private g()V
    .locals 1

    .line 208
    iget-object v0, p0, Lo/blq;->b:Lo/blm;

    invoke-virtual {v0}, Lo/blm;->a()V

    .line 209
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    invoke-virtual {v0}, Lo/blp;->a()V

    .line 210
    iget-object v0, p0, Lo/blq;->c:Lo/blr;

    invoke-virtual {v0}, Lo/blr;->a()V

    .line 211
    iget-object v0, p0, Lo/blq;->e:Lo/blg;

    invoke-virtual {v0}, Lo/blg;->a()V

    .line 212
    iget-object v0, p0, Lo/blq;->a:Lo/bln;

    invoke-virtual {v0}, Lo/bln;->a()V

    .line 213
    iget-object v0, p0, Lo/blq;->h:Lo/blt;

    invoke-virtual {v0}, Lo/blt;->a()V

    .line 214
    iget-object v0, p0, Lo/blq;->k:Lo/bll;

    invoke-virtual {v0}, Lo/bll;->a()V

    .line 215
    iget-object v0, p0, Lo/blq;->g:Lo/blo;

    invoke-virtual {v0}, Lo/blo;->a()V

    .line 216
    iget-object v0, p0, Lo/blq;->f:Lo/blj;

    invoke-virtual {v0}, Lo/blj;->a()V

    .line 217
    invoke-direct {p0}, Lo/blq;->p()V

    .line 218
    return-void
.end method

.method private l()V
    .locals 2

    .line 358
    iget-object v0, p0, Lo/blq;->p:Lo/blu;

    sget-object v1, Lo/blu;->e:Lo/blu;

    if-ne v0, v1, :cond_0

    .line 360
    invoke-virtual {p0}, Lo/blq;->f()V

    goto :goto_0

    .line 362
    :cond_0
    iget-object v0, p0, Lo/blq;->p:Lo/blu;

    sget-object v1, Lo/blu;->d:Lo/blu;

    if-ne v0, v1, :cond_1

    .line 364
    invoke-virtual {p0}, Lo/blq;->k()V

    .line 366
    :cond_1
    :goto_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 373
    iget-object v0, p0, Lo/blq;->f:Lo/blj;

    iget-object v1, p0, Lo/blq;->p:Lo/blu;

    invoke-virtual {v0, v1}, Lo/blj;->d(Lo/blu;)V

    .line 374
    iget-object v0, p0, Lo/blq;->h:Lo/blt;

    iget-object v1, p0, Lo/blq;->p:Lo/blu;

    invoke-virtual {v0, v1}, Lo/blt;->a(Lo/blu;)V

    .line 375
    iget-object v0, p0, Lo/blq;->b:Lo/blm;

    iget-object v1, p0, Lo/blq;->p:Lo/blu;

    sget-object v2, Lo/blu;->b:Lo/blu;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/blm;->a(Z)V

    .line 376
    return-void
.end method

.method private p()V
    .locals 2

    .line 235
    iget-object v0, p0, Lo/blq;->c:Lo/blr;

    iget-object v1, p0, Lo/blq;->e:Lo/blg;

    iget-boolean v1, v1, Lo/blg;->g:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lo/blq;->a:Lo/bln;

    iget-boolean v1, v1, Lo/bln;->g:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lo/blq;->h:Lo/blt;

    iget-boolean v1, v1, Lo/blt;->g:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lo/blq;->k:Lo/bll;

    iget-boolean v1, v1, Lo/bll;->g:Z

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/blr;->a(Z)V

    .line 236
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 198
    invoke-virtual {p0, p1}, Lo/blq;->c(Lcom/huawei/health/sns/model/user/User;)V

    .line 200
    invoke-direct {p0}, Lo/blq;->g()V

    .line 201
    return-void
.end method

.method public a()Z
    .locals 2

    .line 143
    iget-object v0, p0, Lo/blq;->p:Lo/blu;

    sget-object v1, Lo/blu;->e:Lo/blu;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    .line 153
    iget v0, p0, Lo/blq;->m:I

    return v0
.end method

.method public b(ILjava/lang/String;)V
    .locals 1

    .line 276
    iget-object v0, p0, Lo/blq;->b:Lo/blm;

    invoke-virtual {v0, p1, p2}, Lo/blm;->a(ILjava/lang/String;)V

    .line 277
    return-void
.end method

.method public c()V
    .locals 7

    .line 479
    iget-object v0, p0, Lo/blq;->l:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 481
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lo/blq;->q:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lo/blq;->i:J

    iget-object v6, p0, Lo/blq;->l:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lo/aow;->b(Landroid/content/Context;JJLjava/lang/String;)V

    .line 484
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 245
    iput p1, p0, Lo/blq;->n:I

    .line 246
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    invoke-virtual {v0, p1}, Lo/blp;->e(I)V

    .line 247
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 180
    iget-object v0, p0, Lo/blq;->b:Lo/blm;

    invoke-virtual {v0, p1}, Lo/blm;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 181
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    invoke-virtual {v0, p1}, Lo/blp;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 182
    iget-object v0, p0, Lo/blq;->c:Lo/blr;

    invoke-virtual {v0, p1}, Lo/blr;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 183
    iget-object v0, p0, Lo/blq;->e:Lo/blg;

    invoke-virtual {v0, p1}, Lo/blg;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 184
    iget-object v0, p0, Lo/blq;->a:Lo/bln;

    invoke-virtual {v0, p1}, Lo/bln;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 185
    iget-object v0, p0, Lo/blq;->h:Lo/blt;

    invoke-virtual {v0, p1}, Lo/blt;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 186
    iget-object v0, p0, Lo/blq;->k:Lo/bll;

    invoke-virtual {v0, p1}, Lo/bll;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 187
    iget-object v0, p0, Lo/blq;->g:Lo/blo;

    invoke-virtual {v0, p1}, Lo/blo;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 188
    iget-object v0, p0, Lo/blq;->f:Lo/blj;

    invoke-virtual {v0, p1}, Lo/blj;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 189
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/user/UserNotify$b;)V
    .locals 1

    .line 256
    iput-object p1, p0, Lo/blq;->o:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 257
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    invoke-virtual {v0, p1}, Lo/blp;->e(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 258
    return-void
.end method

.method public d(II)V
    .locals 1

    .line 286
    iget-object v0, p0, Lo/blq;->f:Lo/blj;

    invoke-virtual {v0, p1}, Lo/blj;->c(I)V

    .line 287
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    invoke-virtual {v0, p1}, Lo/blp;->c(I)V

    .line 289
    iget-object v0, p0, Lo/blq;->b:Lo/blm;

    invoke-virtual {v0, p2}, Lo/blm;->a(I)V

    .line 290
    iget-object v0, p0, Lo/blq;->h:Lo/blt;

    invoke-virtual {v0, p2}, Lo/blt;->a(I)V

    .line 291
    return-void
.end method

.method public d()Z
    .locals 2

    .line 133
    iget-object v0, p0, Lo/blq;->p:Lo/blu;

    sget-object v1, Lo/blu;->d:Lo/blu;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 1

    .line 225
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    invoke-virtual {v0}, Lo/blp;->c()V

    .line 226
    iget-object v0, p0, Lo/blq;->c:Lo/blr;

    invoke-virtual {v0}, Lo/blr;->c()V

    .line 227
    iget-object v0, p0, Lo/blq;->f:Lo/blj;

    invoke-virtual {v0}, Lo/blj;->c()V

    .line 228
    return-void
.end method

.method public e(IZ)V
    .locals 4

    .line 387
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 391
    :pswitch_0
    sget-object v0, Lo/blu;->d:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 392
    const/4 v0, 0x0

    iput v0, p0, Lo/blq;->m:I

    .line 394
    if-nez p2, :cond_2

    .line 396
    sget-object v0, Lo/blu;->c:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 397
    const/4 v0, 0x4

    iput v0, p0, Lo/blq;->m:I

    goto/16 :goto_0

    .line 404
    :pswitch_1
    iget-object v0, p0, Lo/blq;->o:Lcom/huawei/health/sns/model/user/UserNotify$b;

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_0

    .line 406
    sget-object v0, Lo/blu;->c:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 407
    const/4 v0, 0x4

    iput v0, p0, Lo/blq;->m:I

    goto :goto_0

    .line 410
    :cond_0
    iget v0, p0, Lo/blq;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 412
    sget-object v0, Lo/blu;->b:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 413
    const/4 v0, 0x1

    iput v0, p0, Lo/blq;->m:I

    goto :goto_0

    .line 418
    :cond_1
    sget-object v0, Lo/blu;->c:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 419
    const/4 v0, 0x4

    iput v0, p0, Lo/blq;->m:I

    .line 421
    goto :goto_0

    .line 426
    :pswitch_2
    sget-object v0, Lo/blu;->c:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 427
    const/4 v0, 0x2

    iput v0, p0, Lo/blq;->m:I

    .line 428
    goto :goto_0

    .line 433
    :pswitch_3
    sget-object v0, Lo/blu;->c:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 434
    const/4 v0, 0x4

    iput v0, p0, Lo/blq;->m:I

    .line 435
    goto :goto_0

    .line 439
    :pswitch_4
    sget-object v0, Lo/blu;->a:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 440
    const/4 v0, 0x4

    iput v0, p0, Lo/blq;->m:I

    .line 441
    goto :goto_0

    .line 445
    :pswitch_5
    sget-object v0, Lo/blu;->c:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 446
    const/4 v0, 0x4

    iput v0, p0, Lo/blq;->m:I

    .line 447
    const-string v0, "DetailViewManager"

    const-string v1, "DetailSourceType.UNKWON"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    .line 455
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 457
    const/4 v0, 0x0

    iput v0, p0, Lo/blq;->m:I

    .line 459
    const/4 v0, 0x5

    if-eq p1, v0, :cond_3

    .line 461
    sget-object v0, Lo/blu;->d:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 466
    :cond_3
    iget-wide v0, p0, Lo/blq;->i:J

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 468
    sget-object v0, Lo/blu;->e:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 471
    :cond_4
    invoke-direct {p0}, Lo/blq;->l()V

    .line 473
    invoke-direct {p0}, Lo/blq;->m()V

    .line 474
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)V"
        }
    .end annotation

    .line 311
    iget-object v0, p0, Lo/blq;->g:Lo/blo;

    invoke-virtual {v0, p1}, Lo/blo;->d(Ljava/util/List;)V

    .line 312
    return-void
.end method

.method public e(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 300
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    invoke-virtual {v0, p1, p2}, Lo/blp;->e(Ljava/util/List;Ljava/lang/String;)V

    .line 301
    return-void
.end method

.method public f()V
    .locals 2

    .line 348
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/blp;->a(Z)V

    .line 349
    iget-object v0, p0, Lo/blq;->c:Lo/blr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/blr;->d(Z)V

    .line 350
    iget-object v0, p0, Lo/blq;->c:Lo/blr;

    invoke-virtual {v0}, Lo/blr;->b()V

    .line 351
    return-void
.end method

.method public h()V
    .locals 1

    .line 265
    iget-object v0, p0, Lo/blq;->b:Lo/blm;

    invoke-virtual {v0}, Lo/blm;->d()V

    .line 266
    return-void
.end method

.method public i()V
    .locals 1

    .line 319
    iget-object v0, p0, Lo/blq;->g:Lo/blo;

    invoke-virtual {v0}, Lo/blo;->d()V

    .line 320
    return-void
.end method

.method public k()V
    .locals 2

    .line 337
    sget-object v0, Lo/blu;->d:Lo/blu;

    iput-object v0, p0, Lo/blq;->p:Lo/blu;

    .line 338
    invoke-direct {p0}, Lo/blq;->m()V

    .line 339
    const/4 v0, 0x0

    iput v0, p0, Lo/blq;->m:I

    .line 340
    iget-object v0, p0, Lo/blq;->d:Lo/blp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/blp;->a(Z)V

    .line 341
    return-void
.end method
