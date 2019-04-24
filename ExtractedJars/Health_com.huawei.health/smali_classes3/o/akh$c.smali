.class Lo/akh$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aiq$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/akh;

.field private b:I

.field private c:Lo/aix;


# direct methods
.method public constructor <init>(Lo/akh;Lo/aix;I)V
    .locals 0

    .line 448
    iput-object p1, p0, Lo/akh$c;->a:Lo/akh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 449
    iput-object p2, p0, Lo/akh$c;->c:Lo/aix;

    .line 450
    iput p3, p0, Lo/akh$c;->b:I

    .line 451
    return-void
.end method


# virtual methods
.method public c(Lo/air;)V
    .locals 10

    .line 455
    const/4 v4, 0x0

    .line 456
    if-eqz p1, :cond_3

    instance-of v0, p1, Lo/aiu;

    if-eqz v0, :cond_3

    .line 457
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createSessionInterface: response not null, errCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object v2, p1

    check-cast v2, Lo/aiu;

    .line 458
    invoke-virtual {v2}, Lo/aiu;->d()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 457
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 459
    move-object v0, p1

    check-cast v0, Lo/aiu;

    invoke-virtual {v0}, Lo/aiu;->d()Ljava/lang/Integer;

    move-result-object v5

    .line 460
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    .line 461
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createSessionInterface: success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 462
    move-object v4, p1

    check-cast v4, Lo/aiu;

    .line 463
    invoke-virtual {v4}, Lo/aiu;->c()Ljava/lang/String;

    move-result-object v6

    .line 464
    invoke-virtual {v4}, Lo/aiu;->e()Ljava/lang/String;

    move-result-object v7

    .line 465
    invoke-virtual {v4}, Lo/aiu;->a()Ljava/lang/Long;

    move-result-object v8

    .line 466
    invoke-virtual {v4}, Lo/aiu;->b()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 467
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceCreatSession: sn2 is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "; getSessId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; seq = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v8, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 469
    iget-object v0, p0, Lo/akh$c;->c:Lo/aix;

    invoke-virtual {v0, v6}, Lo/aix;->e(Ljava/lang/String;)V

    .line 470
    iget-object v0, p0, Lo/akh$c;->c:Lo/aix;

    invoke-virtual {v0, v7}, Lo/aix;->k(Ljava/lang/String;)V

    .line 471
    iget-object v0, p0, Lo/akh$c;->c:Lo/aix;

    invoke-virtual {v0, v8}, Lo/aix;->d(Ljava/lang/Long;)V

    .line 472
    iget-object v0, p0, Lo/akh$c;->c:Lo/aix;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aix;->b(Ljava/lang/Integer;)V

    .line 473
    iget-object v0, p0, Lo/akh$c;->c:Lo/aix;

    invoke-virtual {v4}, Lo/aiu;->h()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aix;->a(Ljava/lang/Integer;)V

    .line 474
    iget-object v0, p0, Lo/akh$c;->a:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lo/akh$c;->a:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    iget-object v1, p0, Lo/akh$c;->c:Lo/aix;

    invoke-interface {v0, v1}, Lo/akh$e;->c(Lo/aix;)V

    .line 477
    :cond_0
    return-void

    .line 479
    :cond_1
    if-eqz v5, :cond_2

    .line 480
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createSessionInterface: fail errcode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 483
    :cond_2
    goto :goto_1

    .line 485
    :cond_3
    iget v0, p0, Lo/akh$c;->b:I

    add-int/lit8 v5, v0, -0x1

    .line 486
    if-lez v5, :cond_4

    .line 487
    iget-object v0, p0, Lo/akh$c;->a:Lo/akh;

    iget-object v1, p0, Lo/akh$c;->c:Lo/aix;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v5, v2}, Lo/akh;->e(Lo/aix;IZ)V

    goto :goto_0

    .line 489
    :cond_4
    iget-object v0, p0, Lo/akh$c;->a:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 490
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521b\u5efa\u4f1a\u8bdd\u5931\u8d25"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 491
    iget-object v0, p0, Lo/akh$c;->a:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/16 v2, 0xc21

    invoke-interface {v0, v2, v1}, Lo/akh$e;->e(I[Ljava/lang/String;)V

    .line 494
    :cond_5
    :goto_0
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceCreatSession: create session fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 496
    :goto_1
    return-void
.end method
