.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 116
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClimbMonthDetailFragment onClick rightListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->d()V

    .line 118
    return-void
.end method
