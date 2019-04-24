.class Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 144
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CalorieWeekDetailFragment mLeftArrowIV onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d()V

    .line 146
    return-void
.end method
