.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c(Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

.field final synthetic b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/os/Handler;)V
    .locals 0

    .line 633
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 636
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/chc;

    move-result-object v0

    invoke-interface {v0}, Lo/chc;->e()V

    .line 637
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/chc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;->b:Landroid/os/Handler;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cgt;

    move-result-object v2

    invoke-virtual {v2}, Lo/cgt;->b()Lo/cew;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/chc;->c(Landroid/os/Handler;Lo/cew;)V

    .line 638
    return-void
.end method
