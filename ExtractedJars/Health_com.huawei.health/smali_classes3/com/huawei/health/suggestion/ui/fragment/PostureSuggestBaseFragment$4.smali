.class Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;Ljava/util/List;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->e:Ljava/util/List;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    .line 205
    if-nez v4, :cond_0

    .line 206
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback onFailure null == RuningPostureSuggestActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    return-void

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 210
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback onFailure,and local has success download data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    return-void

    .line 213
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d()V

    .line 214
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 201
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;)V"
        }
    .end annotation

    .line 218
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    .line 219
    if-nez v4, :cond_0

    .line 220
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback onFailure null == RuningPostureSuggestActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    return-void

    .line 223
    :cond_0
    if-nez p1, :cond_1

    .line 224
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d()V

    .line 225
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    return-void

    .line 228
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 229
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d()V

    .line 230
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "partly of the data is return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-void

    .line 233
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;Ljava/util/List;Ljava/util/List;)V

    .line 234
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f()V

    .line 235
    new-instance v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4$5;-><init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;)V

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 243
    return-void
.end method
