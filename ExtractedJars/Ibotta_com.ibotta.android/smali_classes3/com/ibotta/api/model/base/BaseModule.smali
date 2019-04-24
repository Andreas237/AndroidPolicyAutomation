.class public abstract Lcom/ibotta/api/model/base/BaseModule;
.super Ljava/lang/Object;
.source "BaseModule.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonSubTypes;
    value = {
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "banner"
            value = Lcom/ibotta/api/model/base/Module;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "circles"
            value = Lcom/ibotta/api/model/base/Module;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "boxed"
            value = Lcom/ibotta/api/model/module/RetailerModule;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "rows"
            value = Lcom/ibotta/api/model/base/Module;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "small_banner"
            value = Lcom/ibotta/api/model/base/Module;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "quests"
            value = Lcom/ibotta/api/model/base/Module;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "grid"
            value = Lcom/ibotta/api/model/base/Module;
        .end subannotation
    }
.end annotation

.annotation runtime Lcom/fasterxml/jackson/annotation/JsonTypeInfo;
    include = .enum Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;->PROPERTY:Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;
    property = "display_type"
    use = .enum Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;->NAME:Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;
    visible = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/base/BaseModule$DisplayType;
    }
.end annotation


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

.field private displayType:Ljava/lang/String;

.field private transient displayTypeEnum:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field private moduleId:I

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    .line 96
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->content:Ljava/util/List;

    if-nez v0, :cond_0

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->content:Ljava/util/List;

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->content:Ljava/util/List;

    return-object v0
.end method

.method public getContentType()Lcom/ibotta/api/model/ContentModel$Type;
    .locals 2

    .line 107
    invoke-virtual {p0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/base/BaseContent;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseContent;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDisplayType()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->displayType:Ljava/lang/String;

    return-object v0
.end method

.method public getDisplayTypeEnum()Lcom/ibotta/api/model/base/BaseModule$DisplayType;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->displayTypeEnum:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    if-eqz v0, :cond_0

    return-object v0

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->displayType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->displayTypeEnum:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->displayTypeEnum:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    return-object v0
.end method

.method public getModuleId()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/ibotta/api/model/base/BaseModule;->moduleId:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseModule;->name:Ljava/lang/String;

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

    .line 103
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseModule;->content:Ljava/util/List;

    return-void
.end method

.method public setDisplayType(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseModule;->displayType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseModule;->displayTypeEnum:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    return-void
.end method

.method public setDisplayTypeEnum(Lcom/ibotta/api/model/base/BaseModule$DisplayType;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseModule;->displayTypeEnum:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    return-void
.end method

.method public setModuleId(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/ibotta/api/model/base/BaseModule;->moduleId:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseModule;->name:Ljava/lang/String;

    return-void
.end method
