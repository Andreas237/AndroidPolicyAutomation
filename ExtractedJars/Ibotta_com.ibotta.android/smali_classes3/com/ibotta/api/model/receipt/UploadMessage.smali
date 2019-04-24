.class public Lcom/ibotta/api/model/receipt/UploadMessage;
.super Ljava/lang/Object;
.source "UploadMessage.java"


# instance fields
.field private body:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/UploadMessage;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/UploadMessage;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/UploadMessage;->body:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/UploadMessage;->title:Ljava/lang/String;

    return-void
.end method
