.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 136
    const-string v0, "SCUI_ClimbYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClimbYearDetailFragment onClick rightListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->d()V

    .line 138
    return-void
.end method
