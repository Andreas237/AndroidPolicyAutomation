.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;Ljava/lang/String;)V
    .locals 0

    .line 585
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 588
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v2

    .line 589
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)V

    .line 590
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Ljava/lang/String;)V

    .line 591
    return-void
.end method
