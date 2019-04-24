.class Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 779
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 783
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showExitUpdateDialog, user click Negative button! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;

    move-result-object v0

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 785
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;

    move-result-object v0

    invoke-virtual {v0}, Lo/eof;->g()V

    .line 786
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;

    const/4 v1, 0x0

    iput v1, v0, Lo/eof;->f:I

    .line 787
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showExitUpdateDialog,cancle downloading  file!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 789
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->f(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 790
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Lo/egv;)Lo/egv;

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;->b:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->finish()V

    .line 792
    return-void
.end method
