.class public Lcom/ibotta/api/model/sharing/AppMessage;
.super Ljava/lang/Object;
.source "AppMessage.java"


# instance fields
.field private body:Ljava/lang/String;

.field private id:I

.field private key:Ljava/lang/String;

.field private subject:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/model/sharing/AppMessage;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/ibotta/api/model/sharing/AppMessage;->id:I

    return v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/model/sharing/AppMessage;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getSubject()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/model/sharing/AppMessage;->subject:Ljava/lang/String;

    return-object v0
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/model/sharing/AppMessage;->body:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/ibotta/api/model/sharing/AppMessage;->id:I

    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/api/model/sharing/AppMessage;->key:Ljava/lang/String;

    return-void
.end method

.method public setSubject(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/api/model/sharing/AppMessage;->subject:Ljava/lang/String;

    return-void
.end method
