.class public Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;
.super Ljava/lang/Object;
.source "LaunchInfo.java"


# instance fields
.field private clickedOfferId:Ljava/lang/Integer;

.field private launchedAt:Ljava/lang/String;

.field private offers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;",
            ">;"
        }
    .end annotation
.end field

.field private retailerId:I

.field private srcToken:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->offers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getClickedOfferId()Ljava/lang/Integer;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->clickedOfferId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getLaunchedAt()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->launchedAt:Ljava/lang/String;

    return-object v0
.end method

.method public getOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->offers:Ljava/util/List;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->retailerId:I

    return v0
.end method

.method public getSrcToken()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->srcToken:Ljava/lang/String;

    return-object v0
.end method

.method public setClickedOfferId(Ljava/lang/Integer;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->clickedOfferId:Ljava/lang/Integer;

    return-void
.end method

.method public setLaunchedAt(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->launchedAt:Ljava/lang/String;

    return-void
.end method

.method public setOffers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;",
            ">;)V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->offers:Ljava/util/List;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->retailerId:I

    return-void
.end method

.method public setSrcToken(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->srcToken:Ljava/lang/String;

    return-void
.end method
