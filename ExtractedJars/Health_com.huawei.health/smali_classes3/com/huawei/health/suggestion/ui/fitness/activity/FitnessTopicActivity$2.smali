.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/emr$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$2;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 149
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$2;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 150
    return-void
.end method
