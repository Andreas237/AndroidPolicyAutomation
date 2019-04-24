.class Lcom/huawei/health/MainActivity$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 3026
    iput-object p1, p0, Lcom/huawei/health/MainActivity$b;->c:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 3029
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FeatureBroadcastRecever"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3030
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 3031
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FeatureBroadcastRecever is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3032
    return-void

    .line 3034
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 3035
    const-string v0, "com.huawei.plugin.operation.action_jumt_to_fearture_page"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3036
    iget-object v0, p0, Lcom/huawei/health/MainActivity$b;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->s(Lcom/huawei/health/MainActivity;)Lo/abc;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V

    .line 3037
    iget-object v0, p0, Lcom/huawei/health/MainActivity$b;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->J(Lcom/huawei/health/MainActivity;)Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a()V

    .line 3038
    iget-object v0, p0, Lcom/huawei/health/MainActivity$b;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->I(Lcom/huawei/health/MainActivity;)Lo/elw;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/elw;->setItemChecked(I)V

    .line 3040
    :cond_1
    return-void
.end method
