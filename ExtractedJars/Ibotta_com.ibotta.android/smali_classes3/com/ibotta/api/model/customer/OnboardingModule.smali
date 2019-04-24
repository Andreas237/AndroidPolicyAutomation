.class public Lcom/ibotta/api/model/customer/OnboardingModule;
.super Ljava/lang/Object;
.source "OnboardingModule.java"


# instance fields
.field protected onboardingRetailers:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/OnboardingRetailer;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/OnboardingModule;->onboardingRetailers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getOnboardingRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/OnboardingRetailer;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/api/model/customer/OnboardingModule;->onboardingRetailers:Ljava/util/List;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/model/customer/OnboardingModule;->title:Ljava/lang/String;

    return-object v0
.end method
