.class public Lcom/ibotta/api/model/customer/Device;
.super Ljava/lang/Object;
.source "Device.java"


# instance fields
.field private id:I

.field private token:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 9
    iget v0, p0, Lcom/ibotta/api/model/customer/Device;->id:I

    return v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Device;->token:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Device;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 13
    iput p1, p0, Lcom/ibotta/api/model/customer/Device;->id:I

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Device;->token:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Device;->type:Ljava/lang/String;

    return-void
.end method
