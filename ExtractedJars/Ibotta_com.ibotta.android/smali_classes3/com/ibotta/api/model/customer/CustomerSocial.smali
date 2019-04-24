.class public Lcom/ibotta/api/model/customer/CustomerSocial;
.super Ljava/lang/Object;
.source "CustomerSocial.java"


# annotations
.annotation runtime Lcom/ibotta/api/security/Confidential;
.end annotation


# instance fields
.field private displayName:Ljava/lang/String;

.field private id:I

.field private identifier:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->id:I

    return v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->identifier:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/auth/AuthType;
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->type:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 79
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/auth/AuthType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v1
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->username:Ljava/lang/String;

    return-object v0
.end method

.method public setDisplayName(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->displayName:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->id:I

    return-void
.end method

.method public setIdentifier(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->identifier:Ljava/lang/String;

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->type:Ljava/lang/String;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->url:Ljava/lang/String;

    return-void
.end method

.method public setUsername(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSocial;->username:Ljava/lang/String;

    return-void
.end method
