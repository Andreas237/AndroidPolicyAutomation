.class Lo/fkg$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fkg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/fkg;


# direct methods
.method private constructor <init>(Lo/fkg;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fkg;Lo/fkg$3;)V
    .locals 0

    .line 347
    invoke-direct {p0, p1}, Lo/fkg$a;-><init>(Lo/fkg;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 395
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 9

    .line 351
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_1

    .line 353
    :cond_0
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyIExecuteResult object or handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    return-void

    .line 356
    :cond_1
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_5

    .line 357
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "step"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 358
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "carior"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 359
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "distance"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 360
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 361
    const-string v0, "step"

    invoke-virtual {v7, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 362
    const-string v0, "carior"

    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 363
    const-string v0, "distance"

    invoke-virtual {v7, v0, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 365
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->h(Lo/fkg;)I

    move-result v0

    if-nez v0, :cond_2

    .line 367
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 368
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 369
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 370
    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->h(Lo/fkg;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 371
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 372
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 373
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 374
    goto :goto_0

    :cond_3
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->h(Lo/fkg;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 375
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 376
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 377
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 378
    goto :goto_0

    .line 379
    :cond_4
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 380
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 381
    iget-object v0, p0, Lo/fkg$a;->d:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->g(Lo/fkg;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 386
    :cond_5
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 390
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    return-void
.end method
