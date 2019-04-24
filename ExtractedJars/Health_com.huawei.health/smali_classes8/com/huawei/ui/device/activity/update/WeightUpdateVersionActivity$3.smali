.class Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 746
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$3;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 749
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start wifiDialog, user click Negative button! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 751
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$3;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 752
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$3;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Lo/egv;)Lo/egv;

    .line 753
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$3;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 754
    return-void
.end method
