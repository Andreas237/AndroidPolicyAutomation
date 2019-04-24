.class Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 160
    :cond_0
    return-void
.end method
