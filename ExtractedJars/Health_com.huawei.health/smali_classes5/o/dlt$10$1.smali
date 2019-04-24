.class Lo/dlt$10$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlt$10;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/dlt$10;


# direct methods
.method constructor <init>(Lo/dlt$10;Ljava/lang/String;I)V
    .locals 0

    .line 626
    iput-object p1, p0, Lo/dlt$10$1;->d:Lo/dlt$10;

    iput-object p2, p0, Lo/dlt$10$1;->c:Ljava/lang/String;

    iput p3, p0, Lo/dlt$10$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 8

    .line 630
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSleepData onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 632
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSleepData data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    return-void

    .line 636
    :cond_0
    move-object v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 637
    const v0, 0xabe4

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 638
    const v0, 0xac49

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 639
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 640
    :cond_2
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommend have data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    iget-object v0, p0, Lo/dlt$10$1;->d:Lo/dlt$10;

    iget-object v0, v0, Lo/dlt$10;->d:Lo/dlt;

    const-string v1, "IC7"

    iget-object v2, p0, Lo/dlt$10$1;->c:Ljava/lang/String;

    iget v3, p0, Lo/dlt$10$1;->b:I

    const v4, 0x9c47

    invoke-static {v0, v1, v4, v2, v3}, Lo/dlt;->d(Lo/dlt;Ljava/lang/String;ILjava/lang/String;I)V

    goto :goto_0

    .line 643
    :cond_3
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommend no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    iget-object v0, p0, Lo/dlt$10$1;->d:Lo/dlt$10;

    iget-object v0, v0, Lo/dlt$10;->d:Lo/dlt;

    const v1, 0x9c47

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 648
    :goto_0
    return-void
.end method
