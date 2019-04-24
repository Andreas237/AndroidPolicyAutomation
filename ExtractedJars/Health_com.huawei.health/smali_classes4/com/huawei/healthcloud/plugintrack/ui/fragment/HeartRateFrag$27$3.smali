.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;)V
    .locals 0

    .line 817
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 820
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->k(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 821
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 822
    return-void
.end method
