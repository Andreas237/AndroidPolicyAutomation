.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eyk$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;Ljava/util/List;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;->d:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/eyk$e;)Lo/ejf;
    .locals 2

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    const/4 v0, 0x0

    return-object v0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    return-object v0

    .line 168
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)Lo/eya;

    move-result-object v0

    return-object v0
.end method
