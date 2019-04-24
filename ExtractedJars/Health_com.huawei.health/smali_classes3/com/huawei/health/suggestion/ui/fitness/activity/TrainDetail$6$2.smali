.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;)V
    .locals 0

    .line 1847
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1850
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1851
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->T(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 1852
    return-void
.end method
