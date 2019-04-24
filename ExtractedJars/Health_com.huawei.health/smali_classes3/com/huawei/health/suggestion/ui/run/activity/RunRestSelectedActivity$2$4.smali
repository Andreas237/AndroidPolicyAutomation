.class Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2$4;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b(ILjava/lang/String;)V
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
.field final synthetic a:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2$4;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 279
    const-string v0, "Suggestion_RunRestSelectedActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentPlan onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2$4;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;Lcom/huawei/health/suggestion/model/Plan;Z)V

    .line 281
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 273
    const-string v0, "Suggestion_RunRestSelectedActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentPlan onFailure errorCode = "

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

    .line 274
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2$4;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;->b:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v0, p1, p2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;ILjava/lang/String;)V

    .line 275
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 270
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2$4;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
