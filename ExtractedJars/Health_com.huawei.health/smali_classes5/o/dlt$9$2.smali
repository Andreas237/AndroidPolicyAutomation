.class Lo/dlt$9$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlt$9;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic e:Lo/dlt$9;


# direct methods
.method constructor <init>(Lo/dlt$9;Ljava/lang/String;I)V
    .locals 0

    .line 547
    iput-object p1, p0, Lo/dlt$9$2;->e:Lo/dlt$9;

    iput-object p2, p0, Lo/dlt$9$2;->a:Ljava/lang/String;

    iput p3, p0, Lo/dlt$9$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 550
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bloodSugarRecommend onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 552
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 553
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 554
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodSugarRecommend have data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    iget-object v0, p0, Lo/dlt$9$2;->e:Lo/dlt$9;

    iget-object v0, v0, Lo/dlt$9;->e:Lo/dlt;

    const-string v1, "IC6"

    iget-object v2, p0, Lo/dlt$9$2;->a:Ljava/lang/String;

    iget v3, p0, Lo/dlt$9$2;->b:I

    const v4, 0x9c46

    invoke-static {v0, v1, v4, v2, v3}, Lo/dlt;->d(Lo/dlt;Ljava/lang/String;ILjava/lang/String;I)V

    goto :goto_0

    .line 558
    :cond_0
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodSugarRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    iget-object v0, p0, Lo/dlt$9$2;->e:Lo/dlt$9;

    iget-object v0, v0, Lo/dlt$9;->e:Lo/dlt;

    const v1, 0x9c46

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 561
    :goto_0
    goto :goto_1

    .line 563
    :cond_1
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodSugarRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    iget-object v0, p0, Lo/dlt$9$2;->e:Lo/dlt$9;

    iget-object v0, v0, Lo/dlt$9;->e:Lo/dlt;

    const v1, 0x9c46

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 566
    :goto_1
    return-void
.end method
