.class Lcom/usebutton/sdk/internal/InternalRewardsExtension$1;
.super Ljava/lang/Object;
.source "InternalRewardsExtension.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInternalRewardCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/models/BrowserCardType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/InternalRewardsExtension;

.field final synthetic val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/InternalRewardsExtension;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension$1;->this$0:Lcom/usebutton/sdk/internal/InternalRewardsExtension;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension$1;->val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension$1;->val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    return-void
.end method
