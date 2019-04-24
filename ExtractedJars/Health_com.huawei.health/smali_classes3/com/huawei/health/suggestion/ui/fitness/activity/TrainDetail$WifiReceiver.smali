.class public Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "WifiReceiver"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 2948
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 2952
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/CheckBox;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2953
    :cond_0
    return-void

    .line 2956
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2957
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2958
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2959
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->t(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2960
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->r(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2961
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2962
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2963
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ab(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 2964
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i()V

    .line 2967
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 2968
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 2969
    return-void
.end method
