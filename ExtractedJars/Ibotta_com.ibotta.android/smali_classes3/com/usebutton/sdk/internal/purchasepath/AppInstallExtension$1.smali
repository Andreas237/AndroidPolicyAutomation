.class Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;
.super Ljava/lang/Object;
.source "AppInstallExtension.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

.field final synthetic val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;->this$0:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;->val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;->val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 64
    :cond_0
    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCards()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return-void

    .line 66
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;->val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->showTopCard()V

    .line 67
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;->this$0:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->access$000(Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;)Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;->onAppInstallCardShown()V

    return-void
.end method
