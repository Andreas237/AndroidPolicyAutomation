.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 739
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 742
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 743
    return-void
.end method
