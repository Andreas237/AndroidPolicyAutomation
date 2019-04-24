.class Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/buv$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;->b:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bvr;ILjava/lang/Object;)V
    .locals 5

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;->b:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Lo/buv;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/buv;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 162
    const-string v0, "Suggestion_PostureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAdapter.setOnItemClickListener1: null==mAdapter.get(position).getDescription() = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 164
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 165
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v0, "postureId"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;->b:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    iget v1, v1, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v0, "actionId"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;->b:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Lo/buv;

    move-result-object v1

    invoke-virtual {v1, p2}, Lo/buv;->a(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    const-string v0, "1130025"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;->b:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$1;->b:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(ILjava/util/List;)V

    .line 171
    :goto_0
    return-void
.end method
