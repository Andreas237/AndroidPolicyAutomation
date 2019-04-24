.class Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 168
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CalorieDayDetailFragment mRightArrowIV onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c()V

    .line 170
    return-void
.end method
