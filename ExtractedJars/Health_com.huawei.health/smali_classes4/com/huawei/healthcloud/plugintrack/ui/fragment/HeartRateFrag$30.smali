.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 834
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 837
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 838
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 839
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 840
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 841
    return-void
.end method
