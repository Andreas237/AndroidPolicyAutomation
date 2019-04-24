.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 3067
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$23;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 3070
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$23;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 3071
    return-void
.end method
