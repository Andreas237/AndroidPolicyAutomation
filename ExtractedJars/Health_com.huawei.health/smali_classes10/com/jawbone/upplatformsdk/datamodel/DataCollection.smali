.class public Lcom/jawbone/upplatformsdk/datamodel/DataCollection;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public links:Lcom/jawbone/upplatformsdk/datamodel/Links;

.field public size:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLinks()Lcom/jawbone/upplatformsdk/datamodel/Links;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/datamodel/DataCollection;->links:Lcom/jawbone/upplatformsdk/datamodel/Links;

    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/jawbone/upplatformsdk/datamodel/DataCollection;->size:I

    return v0
.end method

.method public setLinks(Lcom/jawbone/upplatformsdk/datamodel/Links;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/datamodel/DataCollection;->links:Lcom/jawbone/upplatformsdk/datamodel/Links;

    .line 20
    return-void
.end method

.method public setSize(I)V
    .locals 0

    .line 27
    iput p1, p0, Lcom/jawbone/upplatformsdk/datamodel/DataCollection;->size:I

    .line 28
    return-void
.end method
