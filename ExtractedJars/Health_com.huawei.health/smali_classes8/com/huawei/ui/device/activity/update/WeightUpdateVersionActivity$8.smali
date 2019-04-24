.class Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 910
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$8;->d:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 914
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showAppIsLowdialog, user click Negative button! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 915
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$8;->d:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->i(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 916
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$8;->d:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Lo/egv;)Lo/egv;

    .line 917
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$8;->d:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 918
    return-void
.end method
