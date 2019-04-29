.class Lcom/mopub/network/ScribeRequestManager$2;
.super Ljava/lang/Object;
.source "ScribeRequestManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/network/ScribeRequestManager;->onErrorResponse(Lcom/mopub/volley/VolleyError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/network/ScribeRequestManager;

.field final synthetic val$volleyError:Lcom/mopub/volley/VolleyError;


# direct methods
.method constructor <init>(Lcom/mopub/network/ScribeRequestManager;Lcom/mopub/volley/VolleyError;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/mopub/network/ScribeRequestManager$2;->this$0:Lcom/mopub/network/ScribeRequestManager;

    iput-object p2, p0, Lcom/mopub/network/ScribeRequestManager$2;->val$volleyError:Lcom/mopub/volley/VolleyError;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 49
    :try_start_0
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager$2;->this$0:Lcom/mopub/network/ScribeRequestManager;

    iget-object v0, v0, Lcom/mopub/network/ScribeRequestManager;->mBackoffPolicy:Lcom/mopub/network/BackoffPolicy;

    iget-object v1, p0, Lcom/mopub/network/ScribeRequestManager$2;->val$volleyError:Lcom/mopub/volley/VolleyError;

    invoke-virtual {v0, v1}, Lcom/mopub/network/BackoffPolicy;->backoff(Lcom/mopub/volley/VolleyError;)V

    .line 50
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager$2;->this$0:Lcom/mopub/network/ScribeRequestManager;

    invoke-virtual {v0}, Lcom/mopub/network/ScribeRequestManager;->makeRequestInternal()V
    :try_end_0
    .catch Lcom/mopub/volley/VolleyError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 52
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to Scribe events: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mopub/network/ScribeRequestManager$2;->val$volleyError:Lcom/mopub/volley/VolleyError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager$2;->this$0:Lcom/mopub/network/ScribeRequestManager;

    invoke-virtual {v0}, Lcom/mopub/network/ScribeRequestManager;->clearRequest()V

    :goto_0
    return-void
.end method
