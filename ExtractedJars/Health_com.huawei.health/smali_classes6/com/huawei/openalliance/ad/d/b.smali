.class public Lcom/huawei/openalliance/ad/d/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/d/a/a;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    return-void
.end method

.method private a()Lcom/huawei/openalliance/ad/d/a;
    .locals 9

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v4, Lcom/huawei/openalliance/ad/d/a;

    invoke-direct {v4}, Lcom/huawei/openalliance/ad/d/a;-><init>()V

    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss.SSSZ"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    const-string v0, "3.4.20.301"

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->l(Ljava/lang/String;)V

    iget-object v0, v6, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->j(Ljava/lang/String;)V

    const-string v0, "android"

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->d(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->h(Ljava/lang/String;)V

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->e(Ljava/lang/String;)V

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->i(Ljava/lang/String;)V

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->f(Ljava/lang/String;)V

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->c(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->e(Landroid/content/Context;)Landroid/util/Pair;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    iget-object v0, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Landroid/util/Pair;

    if-eqz v8, :cond_1

    iget-object v0, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->n(Ljava/lang/String;)V

    iget-object v0, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/d/a;->o(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    return-object v4

    :catch_0
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createExceptionInfo RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createExceptionInfo Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 5

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    const-string v0, "7"

    :try_start_1
    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lcom/huawei/openalliance/ad/d/a;->t(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    new-instance v4, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v1, p2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v3, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdRequestSuccess RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdRequestSuccess Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;IJ)V
    .locals 5

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    const-string v0, "6"

    :try_start_1
    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lcom/huawei/openalliance/ad/d/a;->t(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    invoke-virtual {v3, p3, p4}, Lcom/huawei/openalliance/ad/d/a;->a(J)V

    new-instance v4, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v1, p2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v4, v3, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdRequest RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdRequest Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 13

    if-nez p6, :cond_0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResDownloadFailed, contentRecord is null"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :cond_0
    :try_start_1
    invoke-virtual/range {p6 .. p6}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSlotId_()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p6 .. p6}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p6 .. p6}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v8

    if-nez v8, :cond_1

    return-void

    :cond_1
    const-string v0, "2"

    :try_start_2
    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Lcom/huawei/openalliance/ad/d/a;->p(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Lcom/huawei/openalliance/ad/d/a;->q(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Lcom/huawei/openalliance/ad/d/a;->r(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "httpCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reason:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->s(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    if-eqz p4, :cond_2

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v11, v9, v0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResDownloadFailed - adReqToContentDownloadDuration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->u(Ljava/lang/String;)V

    :cond_2
    if-eqz p5, :cond_3

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v11, v9, v0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResDownloadFailed - contentDownloadDuration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->v(Ljava/lang/String;)V

    :cond_3
    new-instance v11, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v1, v7}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v11, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    move-object/from16 v0, p6

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v11, v8, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdResDownloadFailed RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v5

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdResDownloadFailed Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 13

    if-nez p4, :cond_0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResDownloadSuccess, contentRecord is null"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :cond_0
    :try_start_1
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSlotId_()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p4 .. p4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p4 .. p4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v8

    if-nez v8, :cond_1

    return-void

    :cond_1
    const-string v0, "5"

    :try_start_2
    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Lcom/huawei/openalliance/ad/d/a;->p(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Lcom/huawei/openalliance/ad/d/a;->q(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Lcom/huawei/openalliance/ad/d/a;->r(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v11, v9, v0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResDownloadSuccess - adReqToContentDownloadDuration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->u(Ljava/lang/String;)V

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v11, v9, v0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResDownloadSuccess - contentDownloadDuration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->v(Ljava/lang/String;)V

    :cond_3
    new-instance v11, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v1, v7}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v11, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    move-object/from16 v0, p4

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v11, v8, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdResDownloadSuccess RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v5

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdResDownloadSuccess Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 8

    if-nez p3, :cond_0

    const-string v0, "ExceptionReport"

    const-string v1, "onUploadThirdPartyEventFail, contentRecord is null"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    :try_start_2
    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSlotId_()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v6

    invoke-virtual {v3, v4}, Lcom/huawei/openalliance/ad/d/a;->p(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lcom/huawei/openalliance/ad/d/a;->q(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    const-string v0, "9"

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Lcom/huawei/openalliance/ad/d/a;->x(Ljava/lang/String;)V

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->w(Ljava/lang/String;)V

    new-instance v7, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v1, v6}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v7, v3, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUploadThirdPartyEventFail RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUploadThirdPartyEventFail Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 8

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    const-string v0, "1"

    :try_start_1
    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v5

    const/4 v7, 0x0

    :goto_0
    array-length v0, v5

    if-ge v7, v0, :cond_1

    aget-object v0, v5, v7

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->s(Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    new-instance v7, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    const/4 v2, -0x1

    invoke-static {v1, v2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v7, v3, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onException RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onException Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 5

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    const-string v0, "8"

    :try_start_1
    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lcom/huawei/openalliance/ad/d/a;->t(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    new-instance v4, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v1, p2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v4, v3, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdRequestFail RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "ExceptionReport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdRequestFail Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 13

    if-nez p4, :cond_0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResCheckFailed, contentRecord is null"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :cond_0
    :try_start_1
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSlotId_()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p4 .. p4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p4 .. p4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/d/b;->a()Lcom/huawei/openalliance/ad/d/a;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v8

    if-nez v8, :cond_1

    return-void

    :cond_1
    const-string v0, "3"

    :try_start_2
    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->a(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Lcom/huawei/openalliance/ad/d/a;->p(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Lcom/huawei/openalliance/ad/d/a;->q(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Lcom/huawei/openalliance/ad/d/a;->r(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Lcom/huawei/openalliance/ad/d/a;->a(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v11, v9, v0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResCheckFailed - adReqToContentDownloadDuration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->u(Ljava/lang/String;)V

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v11, v9, v0

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResCheckFailed - contentDownloadDuration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/d/a;->v(Ljava/lang/String;)V

    :cond_3
    new-instance v11, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/d/b;->a:Landroid/content/Context;

    invoke-static {v1, v7}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v11, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    move-object/from16 v0, p4

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v11, v8, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResCheckFailed RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v5

    const-string v0, "ExceptionReport"

    const-string v1, "onAdResCheckFailed Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
