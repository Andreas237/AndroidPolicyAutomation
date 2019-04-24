.class final Lo/akl$e;
.super Lo/ajf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ajf<Lo/akl;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akl;)V
    .locals 0

    .line 413
    invoke-direct {p0, p1}, Lo/ajf;-><init>(Ljava/lang/Object;)V

    .line 414
    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;I)V
    .locals 1

    .line 410
    move-object v0, p1

    check-cast v0, Lo/akl;

    invoke-virtual {p0, v0, p2}, Lo/akl$e;->d(Lo/akl;I)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;I)V
    .locals 1

    .line 410
    move-object v0, p1

    check-cast v0, Lo/akl;

    invoke-virtual {p0, v0, p2}, Lo/akl$e;->b(Lo/akl;I)V

    return-void
.end method

.method public b(Lo/akl;I)V
    .locals 0

    .line 467
    return-void
.end method

.method public b(Lo/akl;Ljava/lang/Object;)V
    .locals 8

    .line 418
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 419
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGetVerifyCodeSuccess SoftApOuthManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 420
    return-void

    .line 422
    :cond_0
    move-object v4, p2

    check-cast v4, Landroid/os/Bundle;

    .line 423
    if-nez v4, :cond_1

    .line 424
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGetVerifyCodeSuccess bundle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 425
    return-void

    .line 427
    :cond_1
    const-string v0, "device_register_verifycode"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;

    .line 428
    if-nez v5, :cond_2

    .line 429
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGetVerifyCodeSuccess entity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 430
    return-void

    .line 431
    :cond_2
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    invoke-static {p1}, Lo/akl;->e(Lo/akl;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 432
    :cond_3
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGetVerifyCodeSuccess mHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 433
    return-void

    .line 437
    :cond_4
    new-instance v6, Lo/aih;

    invoke-direct {v6}, Lo/aih;-><init>()V

    .line 438
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;->getDevId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lo/aih;->b:Ljava/lang/String;

    .line 439
    invoke-static {p1}, Lo/akl;->b(Lo/akl;)Lo/ajd;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;->getDevId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ajd;->e(Ljava/lang/String;)V

    .line 440
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;->getVerifyCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lo/aih;->d:Ljava/lang/String;

    .line 441
    invoke-static {p1}, Lo/akl;->a(Lo/akl;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthAPPToDeviceUrl"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lo/aih;->e:Ljava/lang/String;

    .line 442
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;->getPsk()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lo/aih;->a:Ljava/lang/String;

    .line 443
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " softApRegisterInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 444
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 445
    const-class v0, Lo/aih;

    invoke-virtual {v7, v6, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/akl;->c(Lo/akl;Ljava/lang/String;)Ljava/lang/String;

    .line 446
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lo/akl;->e(Lo/akl;J)J

    .line 447
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 448
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 449
    return-void
.end method

.method public synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 410
    move-object v0, p1

    check-cast v0, Lo/akl;

    invoke-virtual {p0, v0, p2}, Lo/akl$e;->b(Lo/akl;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Lo/akl;I)V
    .locals 4

    .line 453
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 454
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGetVerifyonFailure SoftApOuthManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 455
    return-void

    .line 457
    :cond_0
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 458
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGetVerifyonFailure mHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 459
    return-void

    .line 461
    :cond_1
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 462
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 463
    return-void
.end method
