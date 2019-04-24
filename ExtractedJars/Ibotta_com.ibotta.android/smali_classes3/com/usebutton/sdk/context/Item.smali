.class public Lcom/usebutton/sdk/context/Item;
.super Lcom/usebutton/sdk/internal/models/BaseEntity;
.source "Item.java"


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 17
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    .line 18
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/context/Item;->setUrl(Landroid/net/Uri;)Lcom/usebutton/sdk/context/Item;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 12
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    .line 13
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/context/Item;->setSku(Ljava/lang/String;)Lcom/usebutton/sdk/context/Item;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method protected getType()Ljava/lang/String;
    .locals 1

    const-string v0, "item"

    return-object v0
.end method

.method public setName(Ljava/lang/String;)Lcom/usebutton/sdk/context/Item;
    .locals 1

    const-string v0, "name"

    .line 34
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Item;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setSku(Ljava/lang/String;)Lcom/usebutton/sdk/context/Item;
    .locals 1

    const-string v0, "sku"

    .line 29
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Item;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setUrl(Landroid/net/Uri;)Lcom/usebutton/sdk/context/Item;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "url"

    .line 39
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Item;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
