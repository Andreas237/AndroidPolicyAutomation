.class Lo/bsq$36;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->a(ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic b:Lo/bui;

.field final synthetic c:Lo/bsq;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/bsq;ILcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;)V
    .locals 0

    .line 815
    iput-object p1, p0, Lo/bsq$36;->c:Lo/bsq;

    iput p2, p0, Lo/bsq$36;->e:I

    iput-object p3, p0, Lo/bsq$36;->a:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p4, p0, Lo/bsq$36;->b:Lo/bui;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 10

    .line 820
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->o()Lo/bth;

    move-result-object v0

    iget v2, p0, Lo/bsq$36;->e:I

    iget-object v1, p0, Lo/bsq$36;->a:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v8

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/bth;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 821
    iget-object v0, p0, Lo/bsq$36;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$36;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v9}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 822
    const-string v0, "DataImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRecommendWorkouts(int count, UICallback<List<FitWorkout>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "onFailure:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 815
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bsq$36;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 827
    iget-object v0, p0, Lo/bsq$36;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$36;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 828
    return-void
.end method
