.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$2;
.super Lo/ezw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->f()Lo/ezh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;Landroid/app/Activity;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$2;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    invoke-direct {p0, p2}, Lo/ezw;-><init>(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public d(F)Ljava/lang/String;
    .locals 4

    .line 425
    float-to-int v0, p1

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
