.class Lo/exh$13;
.super Lo/evj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exh;->a()Lo/evj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/evj<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/exh;


# direct methods
.method constructor <init>(Lo/exh;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lo/exh$13;->a:Lo/exh;

    invoke-direct {p0}, Lo/evj;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 5

    .line 372
    invoke-super {p0, p1, p2, p3, p4}, Lo/evj;->a(JJ)V

    .line 374
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->e(Lo/exh;)Lo/egu$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->m(Lo/exh;)I

    move-result v0

    if-nez v0, :cond_0

    .line 375
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    long-to-double v1, p1

    iget-object v3, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v3}, Lo/exh;->p(Lo/exh;)J

    move-result-wide v3

    long-to-double v3, v3

    div-double/2addr v1, v3

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    mul-double/2addr v1, v3

    double-to-int v1, v1

    invoke-static {v0, v1}, Lo/exh;->e(Lo/exh;I)I

    .line 376
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->e(Lo/exh;)Lo/egu$a;

    move-result-object v0

    iget-object v1, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v1}, Lo/exh;->n(Lo/exh;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egu$a;->e(I)Lo/egu$a;

    .line 377
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->e(Lo/exh;)Lo/egu$a;

    move-result-object v0

    iget-object v1, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v1}, Lo/exh;->n(Lo/exh;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egu$a;->b(I)Lo/egu$a;

    .line 378
    invoke-static {}, Lo/exh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onProgress() handleBytes = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " contentLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v3}, Lo/exh;->p(Lo/exh;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " num = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v3}, Lo/exh;->n(Lo/exh;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    :cond_0
    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 1

    .line 344
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/exh$13;->e(Ljava/lang/String;)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 347
    invoke-static {}, Lo/exh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadWorkoutMediaFiles onFailure: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->e(Lo/exh;)Lo/egu$a;

    move-result-object v0

    iget-object v1, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v1}, Lo/exh;->d(Lo/exh;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->Stress_game_base_measure_download_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egu$a;->d(Ljava/lang/String;)Lo/egu$a;

    .line 352
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->e(Lo/exh;)Lo/egu$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egu$a;->a(I)Lo/egu$a;

    .line 353
    return-void
.end method

.method public b()Z
    .locals 1

    .line 383
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->l(Lo/exh;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    .line 357
    invoke-static {}, Lo/exh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadWorkoutMediaFiles onSuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, "cancel"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    invoke-static {}, Lo/exh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u5230\u53d6\u6d88\u4fe1\u606f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 362
    :cond_0
    const-string v0, "data/data/com.huawei.health/files/stress/audiosBase/open_source.zip"

    invoke-static {v0}, Lo/exg;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 363
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->k(Lo/exh;)V

    goto :goto_0

    .line 365
    :cond_1
    invoke-static {}, Lo/exh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6587\u4ef6\u4e0b\u8f7d\u5931\u8d25\u65e0\u6cd5\u8df3\u8f6c\u6d4b\u91cf\u754c\u9762"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    iget-object v0, p0, Lo/exh$13;->a:Lo/exh;

    invoke-virtual {v0}, Lo/exh;->c()V

    .line 369
    :goto_0
    return-void
.end method
