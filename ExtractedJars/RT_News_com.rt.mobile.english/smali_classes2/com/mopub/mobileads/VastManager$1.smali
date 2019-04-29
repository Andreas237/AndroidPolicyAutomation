.class Lcom/mopub/mobileads/VastManager$1;
.super Ljava/lang/Object;
.source "VastManager.java"

# interfaces
.implements Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/VastManager;->onAggregationComplete(Lcom/mopub/mobileads/VastVideoConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/VastManager;

.field final synthetic val$vastVideoConfig:Lcom/mopub/mobileads/VastVideoConfig;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastManager;Lcom/mopub/mobileads/VastVideoConfig;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/mopub/mobileads/VastManager$1;->this$0:Lcom/mopub/mobileads/VastManager;

    iput-object p2, p0, Lcom/mopub/mobileads/VastManager$1;->val$vastVideoConfig:Lcom/mopub/mobileads/VastVideoConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 118
    iget-object p1, p0, Lcom/mopub/mobileads/VastManager$1;->this$0:Lcom/mopub/mobileads/VastManager;

    iget-object v0, p0, Lcom/mopub/mobileads/VastManager$1;->val$vastVideoConfig:Lcom/mopub/mobileads/VastVideoConfig;

    invoke-static {p1, v0}, Lcom/mopub/mobileads/VastManager;->access$000(Lcom/mopub/mobileads/VastManager;Lcom/mopub/mobileads/VastVideoConfig;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 119
    iget-object p1, p0, Lcom/mopub/mobileads/VastManager$1;->this$0:Lcom/mopub/mobileads/VastManager;

    invoke-static {p1}, Lcom/mopub/mobileads/VastManager;->access$100(Lcom/mopub/mobileads/VastManager;)Lcom/mopub/mobileads/VastManager$VastManagerListener;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/VastManager$1;->val$vastVideoConfig:Lcom/mopub/mobileads/VastVideoConfig;

    invoke-interface {p1, v0}, Lcom/mopub/mobileads/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/VastVideoConfig;)V

    goto :goto_0

    :cond_0
    const-string p1, "Failed to download VAST video."

    .line 121
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 122
    iget-object p1, p0, Lcom/mopub/mobileads/VastManager$1;->this$0:Lcom/mopub/mobileads/VastManager;

    invoke-static {p1}, Lcom/mopub/mobileads/VastManager;->access$100(Lcom/mopub/mobileads/VastManager;)Lcom/mopub/mobileads/VastManager$VastManagerListener;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/mopub/mobileads/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/VastVideoConfig;)V

    :goto_0
    return-void
.end method
