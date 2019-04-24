.class public Lo/ckv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ckv$d;
    }
.end annotation


# direct methods
.method private static b(Lo/ckf;Lo/cit;Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    return-void

    :cond_0
    const-string v1, ""

    const-string v2, ""

    invoke-virtual {p1}, Lo/cit;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo/cit;->n()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/cit;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lo/cit;->t()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lo/cit;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Lo/cjn;->c(Lo/cit;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1, p2}, Lo/cjn;->d(Lo/cit;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lo/cit;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lo/cit;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lo/cit;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lo/cit;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lo/cjx;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lo/cit;->f(Ljava/lang/String;)V

    :cond_4
    move-object v2, v3

    :cond_5
    :goto_0
    invoke-static {p1, p2}, Lo/cjn;->b(Lo/cit;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ckf;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ckf;->h(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lo/ckf;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ckf;->e(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lo/ckf;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ckf;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static c(Lo/cit;Landroid/content/Context;)Lo/ckf;
    .locals 1

    new-instance v0, Lo/ckf;

    invoke-direct {v0}, Lo/ckf;-><init>()V

    invoke-static {v0, p0, p1}, Lo/ckv;->b(Lo/ckf;Lo/cit;Landroid/content/Context;)V

    return-object v0
.end method

.method static d([Lo/ckd;[Lo/cke;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lo/ckd;[Lo/cke;)Ljava/util/List<Lo/ckn;>;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    new-instance v0, Lo/cko;

    invoke-direct {v0, v6}, Lo/cko;-><init>(Lo/ckd;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    move-object v3, p1

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    new-instance v0, Lo/ckj;

    invoke-direct {v0, v6}, Lo/ckj;-><init>(Lo/cke;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method static d(Ljava/util/List;Landroid/content/Context;)Lo/ckh;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ckn;>;Landroid/content/Context;)Lo/ckh;"
        }
    .end annotation

    invoke-static {}, Lo/ckt;->b()Lo/cky;

    move-result-object v0

    invoke-interface {v0}, Lo/cky;->d()Lo/cit;

    move-result-object v2

    invoke-virtual {v2}, Lo/cit;->u()J

    move-result-wide v5

    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {}, Lo/cjq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/cjq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v6, v3, v4, v2}, Lo/cjn;->e(JLjava/lang/String;Ljava/lang/String;Lo/cit;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long v9, v7, v5

    const-wide/32 v0, 0x2932e00

    cmp-long v0, v9, v0

    if-lez v0, :cond_1

    invoke-static {}, Lo/cjq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/cjq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v8, v3, v4, v2}, Lo/cjn;->e(JLjava/lang/String;Ljava/lang/String;Lo/cit;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lo/cit;->r()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lo/cit;->q()Ljava/lang/String;

    move-result-object v4

    :goto_0
    new-instance v7, Lo/ckh;

    invoke-direct {v7, v3}, Lo/ckh;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lo/ckv;->e(Ljava/lang/String;)Lo/ckk;

    move-result-object v8

    invoke-virtual {v7, v8}, Lo/ckh;->a(Lo/ckk;)V

    invoke-static {v2}, Lo/ckv;->e(Lo/cit;)Lo/cki;

    move-result-object v9

    invoke-virtual {v7, v9}, Lo/ckh;->a(Lo/cki;)V

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lo/ckv;->c(Lo/cit;Landroid/content/Context;)Lo/ckf;

    move-result-object v10

    invoke-virtual {v7, v10}, Lo/ckh;->a(Lo/ckf;)V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/ckn;

    invoke-interface {v15, v12, v13}, Lo/ckn;->a(J)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v15, v3}, Lo/ckn;->d(Ljava/lang/String;)Lo/cke;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    goto :goto_1

    :cond_3
    invoke-virtual {v7, v11}, Lo/ckh;->d(Ljava/util/List;)V

    return-object v7
.end method

.method private static d(Lo/cki;Lo/cit;)V
    .locals 1

    invoke-virtual {p1}, Lo/cit;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cki;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cki;->k(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cki;->i(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cki;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cki;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cki;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/cit;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cki;->b(Ljava/lang/String;)V

    return-void
.end method

.method private static e(Lo/cit;)Lo/cki;
    .locals 1

    new-instance v0, Lo/cki;

    invoke-direct {v0}, Lo/cki;-><init>()V

    invoke-static {v0, p0}, Lo/ckv;->d(Lo/cki;Lo/cit;)V

    return-object v0
.end method

.method private static e(Ljava/lang/String;)Lo/ckk;
    .locals 7

    new-instance v3, Lo/ckk;

    invoke-direct {v3}, Lo/ckk;-><init>()V

    invoke-virtual {v3, p0}, Lo/ckk;->e(Ljava/lang/String;)V

    invoke-static {}, Lo/ckt;->b()Lo/cky;

    move-result-object v4

    invoke-interface {v4}, Lo/cky;->d()Lo/cit;

    move-result-object v0

    invoke-virtual {v0}, Lo/cit;->l()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lo/ckk;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v3}, Lo/ckk;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4}, Lo/cky;->d()Lo/cit;

    move-result-object v1

    invoke-virtual {v1}, Lo/cit;->v()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ckv$d;

    invoke-direct {v2, v3}, Lo/ckv$d;-><init>(Lo/ckk;)V

    invoke-static {v0, v1, v2}, Lcom/huawei/hianalytics/hmacgen/HmacGenerator;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hianalytics/hmacgen/HmacGenerator$HmacCallback;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "HiAnalytics"

    const-string v1, "generateHeadData(): NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v6

    const-string v0, "HiAnalytics"

    const-string v1, "generateHeadData(): UnsatisfiedLinkError"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v3
.end method
