.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;Landroid/content/Context;)V
    .locals 0

    .line 724
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 727
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->d:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 728
    :cond_0
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mapSuccessCutScreen mRelativeLayout is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    return-void

    .line 732
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 733
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_2

    .line 734
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share mBitmap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    return-void

    .line 737
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->t(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V

    .line 739
    return-void
.end method
