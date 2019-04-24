.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->d(Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Integer;

.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;Ljava/lang/Integer;)V
    .locals 0

    .line 676
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;->a:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 679
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)V

    .line 680
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b()V

    .line 681
    return-void
.end method
