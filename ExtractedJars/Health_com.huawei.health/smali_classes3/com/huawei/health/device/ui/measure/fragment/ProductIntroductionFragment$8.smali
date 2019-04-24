.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showOpenGpsLocationDialog()V
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

    .line 783
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$8;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 786
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 787
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$8;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 788
    return-void
.end method
