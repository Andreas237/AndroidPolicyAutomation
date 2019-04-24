.class public Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;
.super Ljava/lang/Object;
.source "OnboardingModuleParcel.java"


# annotations
.annotation runtime Lorg/parceler/Parcel;
.end annotation


# instance fields
.field private final onboardingRetailerParcels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lorg/parceler/ParcelConstructor;
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;->title:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;->onboardingRetailerParcels:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getOnboardingRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;->onboardingRetailerParcels:Ljava/util/List;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;->title:Ljava/lang/String;

    return-object v0
.end method
