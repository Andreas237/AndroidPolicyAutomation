.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d;->c(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d;

.field final synthetic d:Lcom/huawei/health/suggestion/model/Topic;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d;Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 0

    .line 426
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d$1;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    iput-object p3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d$1;->d:Lcom/huawei/health/suggestion/model/Topic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 429
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d$1;->d:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 430
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->q(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    .line 431
    return-void
.end method
