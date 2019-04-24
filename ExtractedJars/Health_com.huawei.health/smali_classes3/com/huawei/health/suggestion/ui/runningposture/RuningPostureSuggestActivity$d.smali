.class Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public c:Z

.field final synthetic d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V
    .locals 1

    .line 487
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 489
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->c:Z

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 494
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "errorCode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "errorInfo:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    invoke-static {}, Lo/cad;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lo/cad;->b()I

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    goto :goto_0

    .line 500
    :cond_0
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 503
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->c:Z

    .line 504
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_video_load_fail:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 505
    return-void
.end method

.method public c(JJ)V
    .locals 5

    .line 522
    invoke-super {p0, p1, p2, p3, p4}, Lo/bui;->c(JJ)V

    .line 523
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBytes:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "-contentLength:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    cmp-long v0, p1, p3

    if-gtz v0, :cond_0

    .line 525
    long-to-float v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    long-to-float v1, p3

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 526
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/bvl;->e(Ljava/lang/String;)V

    .line 528
    :cond_0
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 487
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 509
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bvl;->a(Z)V

    .line 510
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvl;->notifyDataSetChanged()V

    .line 511
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->d:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 512
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MediaFileItemDownLoadCallBack_success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    return-void
.end method

.method public e()Z
    .locals 1

    .line 517
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->c:Z

    return v0
.end method
