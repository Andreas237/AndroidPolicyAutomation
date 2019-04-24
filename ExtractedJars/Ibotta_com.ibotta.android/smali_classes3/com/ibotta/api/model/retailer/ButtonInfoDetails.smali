.class public Lcom/ibotta/api/model/retailer/ButtonInfoDetails;
.super Ljava/lang/Object;
.source "ButtonInfoDetails.java"


# instance fields
.field private id:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->id:Ljava/lang/String;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->url:Ljava/lang/String;

    return-void
.end method
