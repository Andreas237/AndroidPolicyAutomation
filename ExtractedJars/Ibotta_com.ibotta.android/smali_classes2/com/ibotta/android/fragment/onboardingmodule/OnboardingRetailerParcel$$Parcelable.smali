.class public Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;
.super Ljava/lang/Object;
.source "OnboardingRetailerParcel$$Parcelable.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lorg/parceler/ParcelWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lorg/parceler/ParcelWrapper<",
        "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private onboardingRetailerParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable$1;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->onboardingRetailerParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    return-void
.end method

.method public static read(Landroid/os/Parcel;Lorg/parceler/IdentityCollection;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;
    .locals 6

    .line 72
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 73
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->containsKey(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 74
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->isReserved(I)Z

    move-result p0

    if-nez p0, :cond_0

    .line 77
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    return-object p0

    .line 75
    :cond_0
    new-instance p0, Lorg/parceler/ParcelerRuntimeException;

    const-string p1, "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."

    invoke-direct {p0, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 80
    :cond_1
    invoke-virtual {p1}, Lorg/parceler/IdentityCollection;->reserve()I

    move-result v1

    .line 81
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 82
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 83
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 84
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p0

    .line 85
    new-instance v5, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    invoke-direct {v5, v2, v3, v4, p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1, v1, v5}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    .line 88
    invoke-virtual {p1, v0, v5}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    return-object v5
.end method

.method public static write(Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V
    .locals 1

    .line 49
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->getKey(Ljava/lang/Object;)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 51
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->put(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class p3, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    const-string v0, "id"

    invoke-static {p2, p3, p0, v0}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 55
    const-class p2, Ljava/lang/String;

    const-class p3, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    const-string v0, "name"

    invoke-static {p2, p3, p0, v0}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    const-class p2, Ljava/lang/String;

    const-class p3, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    const-string v0, "description"

    invoke-static {p2, p3, p0, v0}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 57
    const-class p2, Ljava/lang/String;

    const-class p3, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    const-string v0, "modelCImageUrl"

    invoke-static {p2, p3, p0, v0}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParcel()Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->onboardingRetailerParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    return-object v0
.end method

.method public bridge synthetic getParcel()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->getParcel()Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->onboardingRetailerParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    new-instance v1, Lorg/parceler/IdentityCollection;

    invoke-direct {v1}, Lorg/parceler/IdentityCollection;-><init>()V

    invoke-static {v0, p1, p2, v1}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->write(Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V

    return-void
.end method
