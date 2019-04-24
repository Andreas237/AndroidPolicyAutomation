.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 106
    const-string v0, "SCUI_ClimbDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClimbDayDetailFragment onClick leftListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->c()V

    .line 108
    return-void
.end method
