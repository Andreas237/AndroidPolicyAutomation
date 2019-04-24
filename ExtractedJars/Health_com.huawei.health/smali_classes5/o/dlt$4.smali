.class Lo/dlt$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlt;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlt;


# direct methods
.method constructor <init>(Lo/dlt;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lo/dlt$4;->d:Lo/dlt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 426
    iget-object v0, p0, Lo/dlt$4;->d:Lo/dlt;

    const-string v1, "run_user"

    const-string v2, "ai-info-005"

    invoke-static {v0, v1, v2}, Lo/dlt;->b(Lo/dlt;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 428
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    iget-object v0, p0, Lo/dlt$4;->d:Lo/dlt;

    const v1, 0x9c44

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 430
    return-void

    .line 434
    :cond_0
    const-string v0, "ai-info-005"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v4

    .line 435
    const-string v0, "ai-info-005"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 437
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runRecommend priority = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", recommendedTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    invoke-static {}, Lo/dlj;->b()Z

    move-result v6

    .line 442
    iget-object v0, p0, Lo/dlt$4;->d:Lo/dlt;

    iget-object v0, v0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v7

    .line 444
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runRecommend isMidRunLabel = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", isFocusRun = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    if-nez v6, :cond_1

    if-eqz v7, :cond_2

    .line 447
    :cond_1
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "run insert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lo/dlt$4;->d:Lo/dlt;

    const-string v1, "IC2"

    const v2, 0x9c44

    invoke-static {v0, v1, v2, v5, v4}, Lo/dlt;->d(Lo/dlt;Ljava/lang/String;ILjava/lang/String;I)V

    goto :goto_0

    .line 451
    :cond_2
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    iget-object v0, p0, Lo/dlt$4;->d:Lo/dlt;

    const v1, 0x9c44

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 454
    :goto_0
    return-void
.end method
