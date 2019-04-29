.class Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;
.super Ljava/lang/Object;
.source "MoPubRequestQueue.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;-><init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;ILandroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;

.field final synthetic val$request:Lcom/mopub/volley/Request;

.field final synthetic val$this$0:Lcom/mopub/network/MoPubRequestQueue;


# direct methods
.method constructor <init>(Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;->this$1:Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;

    iput-object p2, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;->val$this$0:Lcom/mopub/network/MoPubRequestQueue;

    iput-object p3, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;->val$request:Lcom/mopub/volley/Request;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;->this$1:Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;

    iget-object v0, v0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->this$0:Lcom/mopub/network/MoPubRequestQueue;

    invoke-static {v0}, Lcom/mopub/network/MoPubRequestQueue;->access$000(Lcom/mopub/network/MoPubRequestQueue;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;->val$request:Lcom/mopub/volley/Request;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;->this$1:Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;

    iget-object v0, v0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->this$0:Lcom/mopub/network/MoPubRequestQueue;

    iget-object v1, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;->val$request:Lcom/mopub/volley/Request;

    invoke-virtual {v0, v1}, Lcom/mopub/network/MoPubRequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    return-void
.end method
