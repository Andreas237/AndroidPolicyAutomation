.class Lo/bsq$45;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->d(IILjava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lo/bui;

.field final synthetic e:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic g:Lo/bsq;

.field final synthetic i:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bsq;II[Ljava/lang/String;Lcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 880
    iput-object p1, p0, Lo/bsq$45;->g:Lo/bsq;

    iput p2, p0, Lo/bsq$45;->c:I

    iput p3, p0, Lo/bsq$45;->b:I

    iput-object p4, p0, Lo/bsq$45;->a:[Ljava/lang/String;

    iput-object p5, p0, Lo/bsq$45;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p6, p0, Lo/bsq$45;->d:Lo/bui;

    iput-object p7, p0, Lo/bsq$45;->i:Ljava/lang/String;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 7

    .line 892
    invoke-static {p1}, Lo/bso;->a(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v5

    .line 893
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "searchWorkoutList onSuccess size :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 894
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 895
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$45;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1, v2}, Lo/btg;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 894
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 897
    :cond_0
    const-string v0, "fuzzyKeyWords"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 898
    iget-object v0, p0, Lo/bsq$45;->i:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 899
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "searchWorkoutList onSuccess !finalSearchText.equals(fuzzyKeyWords)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 900
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    iget v1, p0, Lo/bsq$45;->c:I

    iget v2, p0, Lo/bsq$45;->b:I

    iget-object v3, p0, Lo/bsq$45;->a:[Ljava/lang/String;

    iget-object v4, p0, Lo/bsq$45;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/btg;->b(II[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    .line 901
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 902
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "searchWorkoutList onSuccess workouts.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 903
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    iget v1, p0, Lo/bsq$45;->c:I

    iget v2, p0, Lo/bsq$45;->b:I

    iget-object v3, p0, Lo/bsq$45;->a:[Ljava/lang/String;

    iget-object v4, p0, Lo/bsq$45;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/btg;->b(II[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 906
    :cond_2
    :goto_1
    iget-object v0, p0, Lo/bsq$45;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$45;->g:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 907
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 6

    .line 884
    const-string v0, "DataImpl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "searchWorkoutList onFailure :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ""

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    iget v1, p0, Lo/bsq$45;->c:I

    iget v2, p0, Lo/bsq$45;->b:I

    iget-object v3, p0, Lo/bsq$45;->a:[Ljava/lang/String;

    iget-object v4, p0, Lo/bsq$45;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/btg;->b(II[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 886
    iget-object v0, p0, Lo/bsq$45;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$45;->g:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 888
    return-void
.end method
