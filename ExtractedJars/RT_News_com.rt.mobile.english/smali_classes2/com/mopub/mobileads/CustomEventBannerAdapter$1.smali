.class Lcom/mopub/mobileads/CustomEventBannerAdapter$1;
.super Ljava/lang/Object;
.source "CustomEventBannerAdapter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/CustomEventBannerAdapter;-><init>(Lcom/mopub/mobileads/MoPubView;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/CustomEventBannerAdapter;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/CustomEventBannerAdapter;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter$1;->this$0:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "Third-party network timed out."

    .line 52
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter$1;->this$0:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->onBannerFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 54
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter$1;->this$0:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->invalidate()V

    return-void
.end method
