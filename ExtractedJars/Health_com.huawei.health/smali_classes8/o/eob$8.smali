.class Lo/eob$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eob;


# direct methods
.method constructor <init>(Lo/eob;)V
    .locals 0

    .line 416
    iput-object p1, p0, Lo/eob$8;->b:Lo/eob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 418
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNeedTransferE err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    const/4 v4, 0x0

    .line 420
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 421
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 422
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const-string v0, "2"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    const/4 v4, 0x0

    goto :goto_0

    .line 425
    :cond_0
    const/4 v4, 0x1

    .line 428
    :cond_1
    :goto_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNeedTransfer get auto ota checkbox status,isAutoupdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    if-nez v4, :cond_2

    .line 431
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WLAN auto update close, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    return-void

    .line 435
    :cond_2
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->b(Lo/eob;)Lo/dpb;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 436
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    iget-object v1, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v1}, Lo/eob;->c(Lo/eob;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eob;->e(Lo/eob;Lo/dpb;)Lo/dpb;

    .line 438
    :cond_3
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->b(Lo/eob;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->p()Ljava/lang/String;

    move-result-object v5

    .line 439
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->b(Lo/eob;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 440
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band new package is not exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    return-void

    .line 443
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 444
    :cond_5
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band new package version is not exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    return-void

    .line 447
    :cond_6
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    if-eqz v0, :cond_7

    .line 448
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is manaual updating updateStatus:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$8;->b:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    return-void

    .line 452
    :cond_7
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is transfering :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v3}, Lo/eob;->e(Lo/eob;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->e(Lo/eob;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 454
    return-void

    .line 456
    :cond_8
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {}, Lo/djg;->b()Lo/djg;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eob;->a(Lo/eob;Lo/djg;)Lo/djg;

    .line 457
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->a(Lo/eob;)Lo/djg;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_9

    .line 458
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWOTABaseMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    return-void

    .line 461
    :cond_9
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNeedTransfer() new mHWOTABaseMgr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v3}, Lo/eob;->a(Lo/eob;)Lo/djg;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    iget-object v1, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v1}, Lo/eob;->a(Lo/eob;)Lo/djg;

    move-result-object v1

    invoke-virtual {v1}, Lo/djg;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/eob;->a(Lo/eob;I)I

    .line 463
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNeedTransfer() new mOtaType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v3}, Lo/eob;->g(Lo/eob;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    iget-object v0, p0, Lo/eob$8;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->a(Lo/eob;)Lo/djg;

    move-result-object v0

    new-instance v1, Lo/eob$8$3;

    invoke-direct {v1, p0}, Lo/eob$8$3;-><init>(Lo/eob$8;)V

    invoke-virtual {v0, v5, v1}, Lo/djg;->a(Ljava/lang/String;Lo/djx;)V

    .line 475
    return-void
.end method
