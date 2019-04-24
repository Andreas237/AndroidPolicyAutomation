.class Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c()V
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

    .line 436
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$2;->d:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$2;->d:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->onBackPressed()V

    .line 440
    return-void
.end method
