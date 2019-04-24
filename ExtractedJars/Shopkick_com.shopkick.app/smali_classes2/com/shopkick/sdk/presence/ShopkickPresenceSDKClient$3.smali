.class final Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$3;
.super Ljava/lang/Object;
.source "ShopkickPresenceSDKClient.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/AppStateProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->getPresenceSDKClient(Landroid/content/Context;Ljava/lang/String;Z)Lcom/shopkick/sdk/presence/PresenceSDKClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$appStatusManager:Lcom/shopkick/app/application/AppStatusManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/AppStatusManager;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$3;->val$appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addStateListener(Lcom/shopkick/sdk/presence/AppStateListener;)V
    .locals 0

    return-void
.end method

.method public isAppInForeground()Z
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$3;->val$appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppStatusManager;->isAppInForeground()Z

    move-result v0

    return v0
.end method

.method public removeStateListener(Lcom/shopkick/sdk/presence/AppStateListener;)V
    .locals 0

    return-void
.end method
