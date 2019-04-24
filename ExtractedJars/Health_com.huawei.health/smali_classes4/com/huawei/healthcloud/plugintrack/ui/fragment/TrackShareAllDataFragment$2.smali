.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/chf$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:F

.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;F)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    iput p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/widget/ScrollView;IIII)V
    .locals 3

    .line 172
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chu;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chu;

    move-result-object v0

    invoke-virtual {v0}, Lo/chu;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->c:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)I

    move-result v1

    sub-int v2, v0, v1

    .line 174
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chf;

    move-result-object v0

    invoke-virtual {v0}, Lo/chf;->getScrollY()I

    move-result v0

    if-le v0, v2, :cond_0

    .line 175
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chf;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/chf;->setScrollY(I)V

    .line 178
    :cond_0
    return-void
.end method
