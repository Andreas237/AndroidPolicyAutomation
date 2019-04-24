.class Lcom/shopkick/app/store/MCommerceManager$2;
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

    .line 110
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$400(Lcom/shopkick/app/store/MCommerceManager;)Lcom/usebutton/sdk/purchasepath/PurchasePath;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$500(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    .line 115
    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    .line 116
    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 114
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/application/AppPreferences;->setLastOnlineStoreRedirectionInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$400(Lcom/shopkick/app/store/MCommerceManager;)Lcom/usebutton/sdk/purchasepath/PurchasePath;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v1}, Lcom/shopkick/app/store/MCommerceManager;->access$600(Lcom/shopkick/app/store/MCommerceManager;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/purchasepath/PurchasePath;->start(Landroid/content/Context;)V

    goto :goto_0

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    .line 123
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/store/MCommerceManager;->access$402(Lcom/shopkick/app/store/MCommerceManager;Lcom/usebutton/sdk/purchasepath/PurchasePath;)Lcom/usebutton/sdk/purchasepath/PurchasePath;

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$2;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/store/MCommerceManager;->access$302(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method
