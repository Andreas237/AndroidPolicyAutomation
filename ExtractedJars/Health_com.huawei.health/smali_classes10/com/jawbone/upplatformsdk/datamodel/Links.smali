.class public Lcom/jawbone/upplatformsdk/datamodel/Links;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public next:Ljava/lang/String;

.field public prev:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getNext()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/datamodel/Links;->next:Ljava/lang/String;

    return-object v0
.end method

.method public getPrev()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/datamodel/Links;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public setNext(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/datamodel/Links;->next:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public setPrev(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/datamodel/Links;->prev:Ljava/lang/String;

    .line 27
    return-void
.end method
