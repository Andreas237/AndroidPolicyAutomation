.class public Lcom/ibotta/api/model/customer/CustomerInvites$Hash;
.super Ljava/lang/Object;
.source "CustomerInvites.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/CustomerInvites;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Hash"
.end annotation


# instance fields
.field private addressHash:Ljava/lang/String;

.field private addressType:Ljava/lang/String;

.field private createdAt:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddressHash()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerInvites$Hash;->addressHash:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressType()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerInvites$Hash;->addressType:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressTypeEnum()Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerInvites$Hash;->addressType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    move-result-object v0

    return-object v0
.end method

.method public getCreatedAt()Ljava/util/Date;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerInvites$Hash;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public setAddressHash(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerInvites$Hash;->addressHash:Ljava/lang/String;

    return-void
.end method

.method public setAddressType(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerInvites$Hash;->addressType:Ljava/lang/String;

    return-void
.end method

.method public setCreatedAt(Ljava/util/Date;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerInvites$Hash;->createdAt:Ljava/util/Date;

    return-void
.end method
