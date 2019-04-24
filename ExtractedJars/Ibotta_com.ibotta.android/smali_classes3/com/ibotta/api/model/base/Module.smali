.class public Lcom/ibotta/api/model/base/Module;
.super Lcom/ibotta/api/model/base/BaseModule;
.source "Module.java"


# instance fields
.field private content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseContent;",
            ">;"
        }
    .end annotation
.end field

.field private dynamicContentId:Ljava/lang/Integer;

.field private id:I

.field private menuActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;"
        }
    .end annotation
.end field

.field private moreAction:Lcom/ibotta/api/model/content/Action;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerId:Ljava/lang/Integer;

.field private sponsored:Ljava/lang/Boolean;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseModule;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/base/Module;->content:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseContent;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->content:Ljava/util/List;

    if-nez v0, :cond_0

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/base/Module;->content:Ljava/util/List;

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->content:Ljava/util/List;

    return-object v0
.end method

.method public getDynamicContentId()Ljava/lang/Integer;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->dynamicContentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/ibotta/api/model/base/Module;->id:I

    return v0
.end method

.method public getMenuActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->menuActions:Ljava/util/List;

    return-object v0
.end method

.method public getMenuActionsAsActionables()Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->menuActions:Ljava/util/List;

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 92
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method public getMoreAction()Lcom/ibotta/api/model/content/Action;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->moreAction:Lcom/ibotta/api/model/content/Action;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->url:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 69
    iput-object v0, p0, Lcom/ibotta/api/model/base/Module;->url:Ljava/lang/String;

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->url:Ljava/lang/String;

    return-object v0
.end method

.method public isSponsored()Ljava/lang/Boolean;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/model/base/Module;->sponsored:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setContent(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseContent;",
            ">;)V"
        }
    .end annotation

    .line 112
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->content:Ljava/util/List;

    return-void
.end method

.method public setDynamicContentId(Ljava/lang/Integer;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->dynamicContentId:Ljava/lang/Integer;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/ibotta/api/model/base/Module;->id:I

    return-void
.end method

.method public setMenuActions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;)V"
        }
    .end annotation

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->menuActions:Ljava/util/List;

    return-void
.end method

.method public setMoreAction(Lcom/ibotta/api/model/content/Action;)V
    .locals 0
    .param p1    # Lcom/ibotta/api/model/content/Action;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->moreAction:Lcom/ibotta/api/model/content/Action;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->retailerId:Ljava/lang/Integer;

    return-void
.end method

.method public setSponsored(Ljava/lang/Boolean;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->sponsored:Ljava/lang/Boolean;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->type:Ljava/lang/String;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/ibotta/api/model/base/Module;->url:Ljava/lang/String;

    return-void
.end method
