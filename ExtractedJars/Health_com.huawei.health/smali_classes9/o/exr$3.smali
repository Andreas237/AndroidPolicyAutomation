.class Lo/exr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/exr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/exr;


# direct methods
.method constructor <init>(Lo/exr;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/exr$3;->c:Lo/exr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 163
    iget-object v0, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v0}, Lo/exr;->b(Lo/exr;)V

    .line 164
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestLastHeartRateDetail onResponse ... err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mRequestReportCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v3}, Lo/exr;->e(Lo/exr;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    instance-of v0, p2, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    if-eqz v0, :cond_0

    .line 167
    move-object v4, p2

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    .line 168
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestLastHeartRateDetail onResponse lastHR = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget-object v0, p0, Lo/exr$3;->c:Lo/exr;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->getHeartRate()I

    move-result v1

    invoke-static {v0, v1}, Lo/exr;->a(Lo/exr;I)I

    .line 170
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestLastHeartRateDetail onResponse mLastHeartRateValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v3}, Lo/exr;->d(Lo/exr;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    goto :goto_0

    .line 172
    :cond_0
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestLastHeartRateDetail onResponse error,need modify lastheartvalue to 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lo/exr$3;->c:Lo/exr;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exr;->a(Lo/exr;I)I

    .line 176
    :goto_0
    const/4 v4, 0x2

    .line 177
    sget-object v0, Lo/exn$d;->a:Lo/exn$d;

    iget-object v1, p0, Lo/exr$3;->c:Lo/exr;

    iget-object v1, v1, Lo/exr;->c:Lo/exn$d;

    if-ne v0, v1, :cond_1

    .line 178
    const/4 v4, 0x3

    .line 180
    :cond_1
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestLastHeartRateDetail onResponse responseCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mRequestReportCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v3}, Lo/exr;->e(Lo/exr;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v0}, Lo/exr;->e(Lo/exr;)I

    move-result v0

    if-ne v4, v0, :cond_2

    iget-object v0, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v0}, Lo/exr;->a(Lo/exr;)Lo/egg;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 182
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestHeartRateDetailUIData requestLastHeartRateDetail onResponse sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v0}, Lo/exr;->a(Lo/exr;)Lo/egg;

    move-result-object v0

    iget-object v1, p0, Lo/exr$3;->c:Lo/exr;

    invoke-static {v1}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 185
    :cond_2
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestHeartRateDetailUIData requestLastHeartRateDetail onResponse over !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void
.end method
