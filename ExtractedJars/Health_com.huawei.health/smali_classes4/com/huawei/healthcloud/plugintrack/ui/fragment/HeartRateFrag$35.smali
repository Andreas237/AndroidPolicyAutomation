.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$35;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 883
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$35;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 886
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHeartRateList is empty  null=========="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 887
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$35;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->q(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 888
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$35;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 889
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$35;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->s(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 891
    return-void
.end method
