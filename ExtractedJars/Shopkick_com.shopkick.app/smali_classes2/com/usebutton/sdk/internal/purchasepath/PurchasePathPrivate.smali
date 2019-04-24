.class public Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;
.super Lcom/usebutton/sdk/purchasepath/PurchasePath;
.source "PurchasePathPrivate.java"


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePath;-><init>(Lcom/usebutton/sdk/internal/models/AppAction;)V

    return-void
.end method

.method private replaceLink(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 53
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public replaceAll(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;->appAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/AppAction;->getLink()Lcom/usebutton/sdk/models/Link;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 37
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 39
    invoke-direct {p0, v1, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;->replaceLink(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 43
    :goto_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 45
    invoke-direct {p0, v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;->replaceLink(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 49
    :cond_2
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;->appAction:Lcom/usebutton/sdk/internal/models/AppAction;

    new-instance p2, Lcom/usebutton/sdk/models/Link;

    invoke-direct {p2, v1, v2}, Lcom/usebutton/sdk/models/Link;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/models/AppAction;->setLink(Lcom/usebutton/sdk/models/Link;)V

    return-void
.end method
