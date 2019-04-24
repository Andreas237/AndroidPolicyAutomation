.class public Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;
.super Ljava/lang/Object;
.source "CustomerRetailerLaunch.java"


# instance fields
.field private ibottaToken:Ljava/lang/String;

.field private percentBackString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIbottaToken()Ljava9/util/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Optional<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;->ibottaToken:Ljava/lang/String;

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getPercentBackString()Ljava9/util/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Optional<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;->percentBackString:Ljava/lang/String;

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public setIbottaToken(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;->ibottaToken:Ljava/lang/String;

    return-void
.end method

.method public setPercentBackString(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;->percentBackString:Ljava/lang/String;

    return-void
.end method
