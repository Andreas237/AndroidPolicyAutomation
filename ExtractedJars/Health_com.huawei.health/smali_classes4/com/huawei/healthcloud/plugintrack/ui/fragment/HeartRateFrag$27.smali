.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 813
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 816
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goneSwolfChart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 817
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27$3;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 826
    return-void
.end method
