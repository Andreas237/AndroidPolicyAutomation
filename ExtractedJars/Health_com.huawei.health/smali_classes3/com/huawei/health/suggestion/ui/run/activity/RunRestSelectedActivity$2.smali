.class Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 267
    const-string v0, "Suggestion_RunRestSelectedActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ". errorInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    const v0, 0x30d4a

    if-ne p1, v0, :cond_0

    .line 269
    const-string v0, "Suggestion_RunRestSelectedActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure plan is exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2$4;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;)V

    invoke-interface {v0, v1}, Lo/bsp;->e(Lo/bui;)Lcom/huawei/health/suggestion/model/Plan;

    goto :goto_0

    .line 284
    :cond_0
    const-string v0, "Suggestion_RunRestSelectedActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure plan is NOT exist "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v0, p1, p2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;ILjava/lang/String;)V

    .line 287
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 264
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->e(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method

.method public e(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 291
    const-string v0, "Suggestion_RunRestSelectedActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onSuccess data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 295
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 297
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;Lcom/huawei/health/suggestion/model/Plan;Z)V

    .line 301
    return-void
.end method
