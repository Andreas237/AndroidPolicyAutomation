.class Lo/bsq$12;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->d(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/health/suggestion/model/Userinfo;

.field final synthetic c:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/bui;

.field final synthetic h:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Ljava/lang/String;Lcom/huawei/health/suggestion/model/Userinfo;Ljava/lang/String;Lcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;)V
    .locals 0

    .line 1974
    iput-object p1, p0, Lo/bsq$12;->h:Lo/bsq;

    iput-object p2, p0, Lo/bsq$12;->d:Ljava/lang/String;

    iput-object p3, p0, Lo/bsq$12;->b:Lcom/huawei/health/suggestion/model/Userinfo;

    iput-object p4, p0, Lo/bsq$12;->a:Ljava/lang/String;

    iput-object p5, p0, Lo/bsq$12;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p6, p0, Lo/bsq$12;->e:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 1982
    invoke-static {p1}, Lo/bso;->b(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 1983
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1984
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$12;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$12;->b:Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Userinfo;->getGender()I

    move-result v2

    invoke-static {v2}, Lo/bsu;->e(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/bsq$12;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lo/bta;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1986
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$12;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/btg;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 1987
    iget-object v0, p0, Lo/bsq$12;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$12;->h:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$12;->h:Lo/bsq;

    iget-object v3, p0, Lo/bsq$12;->d:Ljava/lang/String;

    iget-object v4, p0, Lo/bsq$12;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lo/bsq;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 1989
    :cond_0
    iget-object v0, p0, Lo/bsq$12;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$12;->h:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x270f

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x270f

    invoke-virtual {v0, v1, v3, v2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1991
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1977
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutCount(final String workoutId, String version, final UICallback<Integer> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1978
    return-void
.end method
