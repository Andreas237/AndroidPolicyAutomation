.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/os/Handler;

.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/os/Handler;)V
    .locals 0

    .line 674
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->d:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 677
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->s(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->u(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 678
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 693
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->d:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 695
    :goto_0
    return-void
.end method
