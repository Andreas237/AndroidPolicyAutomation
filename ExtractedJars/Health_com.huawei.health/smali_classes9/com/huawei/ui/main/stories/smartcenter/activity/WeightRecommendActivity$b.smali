.class public Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)V
    .locals 0

    .line 286
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 287
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Landroid/os/Message;)V
    .locals 4

    .line 291
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 293
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_device:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->d(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    invoke-static {p1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_suggest_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    invoke-static {p1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)V

    .line 296
    goto :goto_0

    .line 298
    :sswitch_1
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHOW_WEIGHT_SUGGEST_SERVICE_DIALOG release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    invoke-static {p1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_service_suggest_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->d(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    invoke-static {p1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_service_suggest_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    invoke-static {p1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->b(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)V

    .line 302
    goto :goto_0

    .line 304
    :sswitch_2
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->finish()V

    .line 305
    .line 309
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x6e -> :sswitch_0
        0x6f -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 283
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$b;->d(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Landroid/os/Message;)V

    return-void
.end method
