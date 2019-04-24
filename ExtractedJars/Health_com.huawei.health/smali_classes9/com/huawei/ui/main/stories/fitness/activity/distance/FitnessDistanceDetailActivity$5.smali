.class Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)F
    .locals 5

    .line 228
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 229
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 230
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 231
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->roll(II)V

    .line 232
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method
