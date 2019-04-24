.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 2241
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 2244
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/bzy;->c(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2246
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 2247
    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_connect_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 2248
    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_push_need_connect:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_connect_go:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;)V

    .line 2249
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;)V

    .line 2255
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 2260
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    .line 2261
    invoke-virtual {v0}, Lo/egv;->show()V

    goto :goto_0

    .line 2263
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ddd;->c(Landroid/content/Context;)Lo/ddd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddd;->d()V

    .line 2265
    const-string v0, "1130024"

    invoke-static {v0}, Lo/bzm;->e(Ljava/lang/String;)V

    .line 2267
    :goto_0
    return-void
.end method
