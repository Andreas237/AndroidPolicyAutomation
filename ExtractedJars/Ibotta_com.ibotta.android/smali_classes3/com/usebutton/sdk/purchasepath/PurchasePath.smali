.class public Lcom/usebutton/sdk/purchasepath/PurchasePath;
.super Ljava/lang/Object;
.source "PurchasePath.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;
    }
.end annotation


# instance fields
.field protected final appAction:Lcom/usebutton/sdk/internal/models/AppAction;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/PurchasePath;->appAction:Lcom/usebutton/sdk/internal/models/AppAction;

    return-void
.end method


# virtual methods
.method public getAttributionToken()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/PurchasePath;->appAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public start(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/purchasepath/PurchasePath;->start(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;)V

    return-void
.end method

.method public start(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;)V
    .locals 2
    .param p2    # Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/PurchasePath;->appAction:Lcom/usebutton/sdk/internal/models/AppAction;

    new-instance v1, Lcom/usebutton/sdk/purchasepath/PurchasePath$1;

    invoke-direct {v1, p0, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePath$1;-><init>(Lcom/usebutton/sdk/purchasepath/PurchasePath;Lcom/usebutton/sdk/purchasepath/PurchasePath$Listener;)V

    invoke-virtual {v0, p1, v1}, Lcom/usebutton/sdk/internal/models/AppAction;->invokeAction(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    return-void
.end method
