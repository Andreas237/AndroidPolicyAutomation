.class Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 320
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 305
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "confirmClearCache   delUseCache onFailure errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", errorInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 302
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->a(Ljava/lang/Boolean;)V

    return-void
.end method
