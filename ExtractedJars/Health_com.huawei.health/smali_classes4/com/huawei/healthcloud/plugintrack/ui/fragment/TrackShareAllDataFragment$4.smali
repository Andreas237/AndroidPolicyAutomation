.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;F)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    iput p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 184
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chu;

    move-result-object v0

    invoke-virtual {v0}, Lo/chu;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->a:F

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 186
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chu;

    move-result-object v1

    invoke-virtual {v1}, Lo/chu;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->a:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 187
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 189
    :cond_0
    return-void
.end method
