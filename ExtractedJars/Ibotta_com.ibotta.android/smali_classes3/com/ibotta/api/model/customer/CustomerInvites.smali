.class public Lcom/ibotta/api/model/customer/CustomerInvites;
.super Ljava/lang/Object;
.source "CustomerInvites.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/customer/CustomerInvites$Hash;,
        Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;
    }
.end annotation


# instance fields
.field private hashes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerInvites$Hash;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/CustomerInvites;->hashes:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getHashes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerInvites$Hash;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerInvites;->hashes:Ljava/util/List;

    return-object v0
.end method

.method public setHashes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerInvites$Hash;",
            ">;)V"
        }
    .end annotation

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerInvites;->hashes:Ljava/util/List;

    return-void
.end method
