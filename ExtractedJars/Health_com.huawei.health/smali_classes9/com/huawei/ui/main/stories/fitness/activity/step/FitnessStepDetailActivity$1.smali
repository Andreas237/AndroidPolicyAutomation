.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 0

    .line 1025
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)F
    .locals 5

    .line 1029
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 1030
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1031
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1032
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->roll(II)V

    .line 1033
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method