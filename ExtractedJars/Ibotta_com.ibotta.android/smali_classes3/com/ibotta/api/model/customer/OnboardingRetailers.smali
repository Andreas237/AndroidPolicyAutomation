.class public Lcom/ibotta/api/model/customer/OnboardingRetailers;
.super Ljava/lang/Object;
.source "OnboardingRetailers.java"


# instance fields
.field private retailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Retailer;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Retailer;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/api/model/customer/OnboardingRetailers;->retailers:Ljava/util/List;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/customer/OnboardingRetailers;->title:Ljava/lang/String;

    return-object v0
.end method
