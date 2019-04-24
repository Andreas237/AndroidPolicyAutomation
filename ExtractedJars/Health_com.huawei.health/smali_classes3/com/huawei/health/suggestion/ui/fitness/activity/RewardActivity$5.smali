.class Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->b(FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:I

.field final synthetic f:Ljava/lang/Integer;

.field final synthetic h:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->h:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;

    iput p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->b:F

    iput-object p3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->c:Ljava/lang/String;

    iput p4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->e:I

    iput p5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->a:F

    iput-object p6, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->d:Ljava/util/List;

    iput-object p7, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->f:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 175
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->h:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->b:F

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->c:Ljava/lang/String;

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->e:I

    iget v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->a:F

    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->d:Ljava/util/List;

    iget-object v6, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;->f:Ljava/lang/Integer;

    invoke-static/range {v0 .. v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V

    .line 176
    return-void
.end method
