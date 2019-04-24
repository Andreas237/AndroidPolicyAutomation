.class final Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 116
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightDialog err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    invoke-static {}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 118
    return-void

    .line 120
    :cond_0
    if-nez p1, :cond_1

    .line 121
    invoke-static {}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 122
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 123
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 124
    const/4 v0, 0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    .line 125
    const-string v0, "commodityList"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->c(Ljava/util/List;)Ljava/util/List;

    .line 126
    const-string v0, "commodityTime"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b(J)J

    .line 127
    invoke-static {}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 128
    goto :goto_0

    .line 129
    :cond_1
    invoke-static {}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 130
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 131
    invoke-static {}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 133
    :goto_0
    return-void
.end method
