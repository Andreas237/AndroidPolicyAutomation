.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V
    .locals 0

    .line 816
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSnapshotReady(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 819
    if-nez p1, :cond_0

    .line 820
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z

    .line 821
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z

    goto :goto_0

    .line 823
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 824
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 854
    :goto_0
    return-void
.end method
