.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbd$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fbi;

.field final synthetic d:Lo/fbd;

.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;Lo/fbi;Lo/fbd;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;->a:Lo/fbi;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;->d:Lo/fbd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;->a:Lo/fbi;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;->d:Lo/fbd;

    invoke-virtual {v0, v1}, Lo/fbi;->setHistoryDataTree(Lo/fbd;)V

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;->a:Lo/fbi;

    invoke-virtual {v0}, Lo/fbi;->getCount()I

    move-result v2

    .line 46
    if-lez v2, :cond_0

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;->a:Lo/fbi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fbi;->expandGroup(I)Z

    .line 49
    :cond_0
    return-void
.end method
