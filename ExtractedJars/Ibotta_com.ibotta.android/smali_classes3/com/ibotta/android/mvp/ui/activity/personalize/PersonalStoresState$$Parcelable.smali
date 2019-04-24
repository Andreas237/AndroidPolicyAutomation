.class public Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;
.super Ljava/lang/Object;
.source "PersonalStoresState$$Parcelable.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lorg/parceler/ParcelWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lorg/parceler/ParcelWrapper<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private personalStoresState$$0:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;->personalStoresState$$0:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    return-void
.end method

.method public static read(Landroid/os/Parcel;Lorg/parceler/IdentityCollection;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;
    .locals 10

    .line 87
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 88
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->containsKey(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 89
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->isReserved(I)Z

    move-result p0

    if-nez p0, :cond_0

    .line 92
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    return-object p0

    .line 90
    :cond_0
    new-instance p0, Lorg/parceler/ParcelerRuntimeException;

    const-string p1, "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."

    invoke-direct {p0, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 95
    :cond_1
    invoke-virtual {p1}, Lorg/parceler/IdentityCollection;->reserve()I

    move-result v1

    .line 96
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;-><init>()V

    .line 97
    invoke-virtual {p1, v1, v2}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    .line 98
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->personalStoreModeStr:Ljava/lang/String;

    .line 99
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v3, 0x0

    if-gez v1, :cond_2

    goto :goto_4

    .line 104
    :cond_2
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v1, :cond_6

    .line 106
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-gez v7, :cond_3

    move-object v7, v3

    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 114
    :goto_1
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-gez v8, :cond_4

    move-object v8, v3

    goto :goto_3

    .line 119
    :cond_4
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_5

    goto :goto_2

    :cond_5
    const/4 v9, 0x0

    :goto_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 122
    :goto_3
    invoke-virtual {v4, v7, v8}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_6
    move-object v3, v4

    .line 125
    :goto_4
    iput-object v3, v2, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->retailerSelections:Ljava/util/LinkedHashMap;

    .line 127
    invoke-virtual {p1, v0, v2}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    return-object v2
.end method

.method public static write(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V
    .locals 2

    .line 48
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->getKey(Ljava/lang/Object;)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 50
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    .line 52
    :cond_0
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->put(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->personalStoreModeStr:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 54
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->retailerSelections:Ljava/util/LinkedHashMap;

    if-nez p2, :cond_1

    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    .line 57
    :cond_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->retailerSelections:Ljava/util/LinkedHashMap;

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->retailerSelections:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 59
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    const/4 v1, 0x1

    if-nez p3, :cond_2

    .line 60
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    :goto_1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_3

    .line 66
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParcel()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;->personalStoresState$$0:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    return-object v0
.end method

.method public bridge synthetic getParcel()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;->getParcel()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;->personalStoresState$$0:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    new-instance v1, Lorg/parceler/IdentityCollection;

    invoke-direct {v1}, Lorg/parceler/IdentityCollection;-><init>()V

    invoke-static {v0, p1, p2, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState$$Parcelable;->write(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V

    return-void
.end method
