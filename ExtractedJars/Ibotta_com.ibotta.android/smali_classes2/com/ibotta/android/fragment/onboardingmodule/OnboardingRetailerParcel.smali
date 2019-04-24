.class public Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;
.super Ljava/lang/Object;
.source "OnboardingRetailerParcel.java"


# annotations
.annotation runtime Lorg/parceler/Parcel;
.end annotation


# instance fields
.field private description:Ljava/lang/String;

.field private id:I

.field private modelCImageUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lorg/parceler/ParcelConstructor;
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->id:I

    .line 16
    iput-object p2, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->name:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->description:Ljava/lang/String;

    .line 18
    iput-object p4, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->modelCImageUrl:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->id:I

    return v0
.end method

.method public getModelCImageUrl()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->modelCImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;->name:Ljava/lang/String;

    return-object v0
.end method
