.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$34;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ekw$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 429
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$34;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 432
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$34;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$34;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    move-result-object v1

    const-string v2, "BASELINE_STEP_FRE"

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Ljava/lang/String;I)V

    .line 433
    const/4 v0, 0x1

    return v0
.end method
