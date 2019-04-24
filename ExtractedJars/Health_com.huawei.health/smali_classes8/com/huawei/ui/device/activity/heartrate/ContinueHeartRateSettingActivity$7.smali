.class Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V
    .locals 0

    .line 362
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->k(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    .line 367
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 368
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)I

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->i(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)V

    .line 372
    return-void

    .line 374
    :cond_0
    goto :goto_0

    .line 375
    :cond_1
    return-void
.end method
