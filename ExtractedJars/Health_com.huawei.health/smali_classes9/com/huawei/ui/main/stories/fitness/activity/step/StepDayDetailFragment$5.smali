.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 352
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepDayDetailFragment onClick mLeftArrowIV"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d()V

    .line 354
    return-void
.end method
