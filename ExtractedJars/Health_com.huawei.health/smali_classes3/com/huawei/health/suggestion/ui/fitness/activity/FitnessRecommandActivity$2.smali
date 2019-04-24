.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/emr$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d(I)V

    .line 117
    return-void
.end method
