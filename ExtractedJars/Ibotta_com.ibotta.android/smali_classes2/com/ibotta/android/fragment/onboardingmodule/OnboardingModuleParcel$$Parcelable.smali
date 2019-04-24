.class public Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;
.super Ljava/lang/Object;
.source "OnboardingModuleParcel$$Parcelable.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lorg/parceler/ParcelWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lorg/parceler/ParcelWrapper<",
        "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private onboardingModuleParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable$1;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;->onboardingModuleParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    return-void
.end method

.method public static read(Landroid/os/Parcel;Lorg/parceler/IdentityCollection;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;
    .locals 7

    .line 78
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 79
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->containsKey(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 80
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->isReserved(I)Z

    move-result p0

    if-nez p0, :cond_0

    .line 83
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    return-object p0

    .line 81
    :cond_0
    new-instance p0, Lorg/parceler/ParcelerRuntimeException;

    const-string p1, "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."

    invoke-direct {p0, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 86
    :cond_1
    invoke-virtual {p1}, Lorg/parceler/IdentityCollection;->reserve()I

    move-result v1

    .line 87
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 88
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-gez v3, :cond_2

    const/4 p0, 0x0

    goto :goto_1

    .line 93
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_3

    .line 95
    invoke-static {p0, p1}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->read(Landroid/os/Parcel;Lorg/parceler/IdentityCollection;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    move-result-object v6

    .line 96
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    move-object p0, v4

    .line 100
    :goto_1
    new-instance v3, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    invoke-direct {v3, v2, p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 101
    invoke-virtual {p1, v1, v3}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    .line 103
    invoke-virtual {p1, v0, v3}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    return-object v3
.end method

.method public static write(Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V
    .locals 4

    .line 50
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->getKey(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->put(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 55
    const-class v0, Ljava/lang/String;

    const-class v2, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    const-string v3, "title"

    invoke-static {v0, v2, p0, v3}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    const-class v0, Ljava/util/List;

    const-class v2, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    const-string v3, "onboardingRetailerParcels"

    invoke-static {v0, v2, p0, v3}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 57
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    .line 59
    :cond_1
    const-class v0, Ljava/util/List;

    const-class v1, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    const-string v2, "onboardingRetailerParcels"

    invoke-static {v0, v1, p0, v2}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    const-class v0, Ljava/util/List;

    const-class v1, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    const-string v2, "onboardingRetailerParcels"

    invoke-static {v0, v1, p0, v2}, Lorg/parceler/InjectionUtil;->getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    .line 61
    invoke-static {v0, p1, p2, p3}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel$$Parcelable;->write(Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParcel()Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;->onboardingModuleParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    return-object v0
.end method

.method public bridge synthetic getParcel()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;->getParcel()Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;->onboardingModuleParcel$$0:Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    new-instance v1, Lorg/parceler/IdentityCollection;

    invoke-direct {v1}, Lorg/parceler/IdentityCollection;-><init>()V

    invoke-static {v0, p1, p2, v1}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel$$Parcelable;->write(Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V

    return-void
.end method
