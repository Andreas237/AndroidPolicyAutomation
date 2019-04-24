.class Lcom/shopkick/sdk/core/ServerFlags$1;
.super Ljava/lang/Object;
.source "ServerFlags.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/core/ServerFlags;->fetchServerFlags()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/core/ServerFlags;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/core/ServerFlags;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/shopkick/sdk/core/ServerFlags$1;->this$0:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    move-object/from16 v0, p0

    .line 89
    iget-object v1, v0, Lcom/shopkick/sdk/core/ServerFlags$1;->this$0:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-static {v1}, Lcom/shopkick/sdk/core/ServerFlags;->access$000(Lcom/shopkick/sdk/core/ServerFlags;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    new-instance v4, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequestV2;

    invoke-direct {v4}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequestV2;-><init>()V

    .line 91
    iget-object v1, v0, Lcom/shopkick/sdk/core/ServerFlags$1;->this$0:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-static {v1}, Lcom/shopkick/sdk/core/ServerFlags;->access$100(Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object v2

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v5, v0, Lcom/shopkick/sdk/core/ServerFlags$1;->this$0:Lcom/shopkick/sdk/core/ServerFlags;

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 99
    :cond_0
    new-instance v12, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequest;

    invoke-direct {v12}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequest;-><init>()V

    .line 100
    iget-object v1, v0, Lcom/shopkick/sdk/core/ServerFlags$1;->this$0:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-static {v1}, Lcom/shopkick/sdk/core/ServerFlags;->access$100(Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object v10

    sget-object v11, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v13, v0, Lcom/shopkick/sdk/core/ServerFlags$1;->this$0:Lcom/shopkick/sdk/core/ServerFlags;

    const/4 v14, 0x1

    sget-object v15, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v16, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v17, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v10 .. v17}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :goto_0
    return-void
.end method
