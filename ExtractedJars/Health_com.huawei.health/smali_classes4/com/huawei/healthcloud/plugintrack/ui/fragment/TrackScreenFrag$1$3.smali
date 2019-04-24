.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;)V
    .locals 0

    .line 319
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$3;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 322
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$3;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/content/Context;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    .line 323
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    :cond_0
    return-void

    .line 326
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$3;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/AnimatorSet;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 327
    return-void
.end method
