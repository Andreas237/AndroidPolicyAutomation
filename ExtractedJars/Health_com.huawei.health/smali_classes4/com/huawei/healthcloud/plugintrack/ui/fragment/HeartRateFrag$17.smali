.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->c()V
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

    .line 591
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$17;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 594
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$17;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$17;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    move-result-object v1

    const-string v2, "BASELINE_PULL_FREQ"

    const/4 v3, 0x5

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Ljava/lang/String;I)V

    .line 595
    return-void
.end method
