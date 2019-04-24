.class Lcom/shopkick/app/store/MCommerceManager$3;
.super Ljava/lang/Object;
.source "MCommerceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/MCommerceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/MCommerceManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/MCommerceManager;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$700(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$500(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    .line 133
    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    .line 134
    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 132
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/application/AppPreferences;->setLastOnlineStoreRedirectionInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$700(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v1}, Lcom/shopkick/app/store/MCommerceManager;->access$600(Lcom/shopkick/app/store/MCommerceManager;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/webviewsdk/WebviewAction;->invokeAction(Landroid/content/Context;)V

    goto :goto_0

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    .line 141
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/store/MCommerceManager;->access$702(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/sdk/webviewsdk/WebviewAction;)Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$3;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/store/MCommerceManager;->access$302(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method
