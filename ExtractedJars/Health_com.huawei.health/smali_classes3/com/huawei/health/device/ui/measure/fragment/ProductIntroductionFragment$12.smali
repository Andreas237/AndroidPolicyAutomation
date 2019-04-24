.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showOtherUnBindDialog(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

.field final synthetic val$mapProductIntroductFragment:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/util/Map;)V
    .locals 0

    .line 871
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$12;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$12;->val$mapProductIntroductFragment:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 874
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$12;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$12;->val$mapProductIntroductFragment:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/util/Map;)V

    .line 875
    return-void
.end method
