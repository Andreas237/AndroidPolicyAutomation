.class Lo/etn$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/etn;


# direct methods
.method private constructor <init>(Lo/etn;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lo/etn$c;->d:Lo/etn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/etn;Lo/etn$4;)V
    .locals 0

    .line 322
    invoke-direct {p0, p1}, Lo/etn$c;-><init>(Lo/etn;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 5

    .line 336
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    iget-object v0, p0, Lo/etn$c;->d:Lo/etn;

    invoke-static {v0}, Lo/etn;->a(Lo/etn;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 338
    iget-object v0, p0, Lo/etn$c;->d:Lo/etn;

    invoke-static {v0}, Lo/etn;->a(Lo/etn;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 339
    iget-object v0, p0, Lo/etn$c;->d:Lo/etn;

    invoke-static {v0}, Lo/etn;->a(Lo/etn;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 341
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 326
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 331
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lo/etn$c;->d:Lo/etn;

    invoke-static {v0}, Lo/etn;->b(Lo/etn;)V

    .line 333
    return-void
.end method
