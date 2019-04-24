.class Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$4;->a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$4;->a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->e(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Lo/dlz;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->c()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dlz;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 108
    return-void
.end method
