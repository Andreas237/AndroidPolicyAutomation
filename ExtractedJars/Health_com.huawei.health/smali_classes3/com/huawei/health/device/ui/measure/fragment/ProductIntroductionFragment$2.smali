.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showDilog(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 394
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 398
    return-void
.end method
