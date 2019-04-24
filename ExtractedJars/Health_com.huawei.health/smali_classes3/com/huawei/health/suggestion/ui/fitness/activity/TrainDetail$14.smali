.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 2226
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$14;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 2229
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPlanFinishedDialog onClick not remind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2230
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "not_remind_push_course_key"

    .line 2231
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    .line 2230
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 2232
    return-void
.end method
