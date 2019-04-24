.class public Lcom/stripe/android/model/ShippingInformation;
.super Lcom/stripe/android/model/StripeJsonModel;
.source "ShippingInformation.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ShippingInformation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mAddress:Lcom/stripe/android/model/Address;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mPhone:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 109
    new-instance v0, Lcom/stripe/android/model/ShippingInformation$1;

    invoke-direct {v0}, Lcom/stripe/android/model/ShippingInformation$1;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ShippingInformation;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 103
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 104
    const-class v0, Lcom/stripe/android/model/Address;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/Address;

    iput-object v0, p0, Lcom/stripe/android/model/ShippingInformation;->mAddress:Lcom/stripe/android/model/Address;

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/ShippingInformation;->mName:Ljava/lang/String;

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/model/ShippingInformation;->mPhone:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Lcom/stripe/android/model/Address;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 34
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/model/ShippingInformation;->mAddress:Lcom/stripe/android/model/Address;

    .line 36
    iput-object p2, p0, Lcom/stripe/android/model/ShippingInformation;->mName:Ljava/lang/String;

    .line 37
    iput-object p3, p0, Lcom/stripe/android/model/ShippingInformation;->mPhone:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/ShippingInformation;
    .locals 2
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 61
    :cond_0
    new-instance v0, Lcom/stripe/android/model/ShippingInformation;

    invoke-direct {v0}, Lcom/stripe/android/model/ShippingInformation;-><init>()V

    const-string v1, "name"

    .line 62
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/ShippingInformation;->mName:Ljava/lang/String;

    const-string v1, "phone"

    .line 63
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/ShippingInformation;->mPhone:Ljava/lang/String;

    const-string v1, "address"

    .line 65
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Address;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Address;

    move-result-object p0

    iput-object p0, v0, Lcom/stripe/android/model/ShippingInformation;->mAddress:Lcom/stripe/android/model/Address;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAddress()Lcom/stripe/android/model/Address;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/stripe/android/model/ShippingInformation;->mAddress:Lcom/stripe/android/model/Address;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/stripe/android/model/ShippingInformation;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getPhone()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/stripe/android/model/ShippingInformation;->mPhone:Ljava/lang/String;

    return-object v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 72
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "name"

    .line 73
    iget-object v2, p0, Lcom/stripe/android/model/ShippingInformation;->mName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "phone"

    .line 74
    iget-object v2, p0, Lcom/stripe/android/model/ShippingInformation;->mPhone:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address"

    .line 75
    iget-object v2, p0, Lcom/stripe/android/model/ShippingInformation;->mAddress:Lcom/stripe/android/model/Address;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/ShippingInformation;->putStripeJsonModelIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Lcom/stripe/android/model/StripeJsonModel;)V

    return-object v0
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 82
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "name"

    .line 83
    iget-object v2, p0, Lcom/stripe/android/model/ShippingInformation;->mName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "phone"

    .line 84
    iget-object v2, p0, Lcom/stripe/android/model/ShippingInformation;->mPhone:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address"

    .line 85
    iget-object v2, p0, Lcom/stripe/android/model/ShippingInformation;->mAddress:Lcom/stripe/android/model/Address;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/ShippingInformation;->putStripeJsonModelMapIfNotNull(Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/StripeJsonModel;)V

    .line 86
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/stripe/android/model/ShippingInformation;->mAddress:Lcom/stripe/android/model/Address;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 99
    iget-object p2, p0, Lcom/stripe/android/model/ShippingInformation;->mName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 100
    iget-object p2, p0, Lcom/stripe/android/model/ShippingInformation;->mPhone:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
