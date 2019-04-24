.class public Lcom/stripe/android/model/ShippingMethod;
.super Lcom/stripe/android/model/StripeJsonModel;
.source "ShippingMethod.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mAmount:J

.field private mCurrencyCode:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/Size;
        max = 0x3L
        min = 0x0L
    .end annotation
.end field

.field private mDetail:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mIdentifier:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mLabel:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 138
    new-instance v0, Lcom/stripe/android/model/ShippingMethod$1;

    invoke-direct {v0}, Lcom/stripe/android/model/ShippingMethod$1;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ShippingMethod;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 149
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 150
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/stripe/android/model/ShippingMethod;->mAmount:J

    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/ShippingMethod;->mCurrencyCode:Ljava/lang/String;

    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/ShippingMethod;->mDetail:Ljava/lang/String;

    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/ShippingMethod;->mIdentifier:Ljava/lang/String;

    .line 154
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/model/ShippingMethod;->mLabel:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/stripe/android/model/ShippingMethod$1;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/stripe/android/model/ShippingMethod;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAmount()J
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/stripe/android/model/ShippingMethod;->mAmount:J

    return-wide v0
.end method

.method public getCurrency()Ljava/util/Currency;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/stripe/android/model/ShippingMethod;->mCurrencyCode:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v0

    return-object v0
.end method

.method public getDetail()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/stripe/android/model/ShippingMethod;->mDetail:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/stripe/android/model/ShippingMethod;->mLabel:Ljava/lang/String;

    return-object v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 102
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "amount"

    .line 103
    iget-wide v2, p0, Lcom/stripe/android/model/ShippingMethod;->mAmount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putLongIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "currency_code"

    .line 104
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mCurrencyCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "detail"

    .line 105
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mDetail:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "identifier"

    .line 106
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mIdentifier:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "label"

    .line 107
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toMap()Ljava/util/Map;
    .locals 4
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

    .line 114
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "amount"

    .line 115
    iget-wide v2, p0, Lcom/stripe/android/model/ShippingMethod;->mAmount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "currency_code"

    .line 116
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mCurrencyCode:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "detail"

    .line 117
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mDetail:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "identifier"

    .line 118
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mIdentifier:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "label"

    .line 119
    iget-object v2, p0, Lcom/stripe/android/model/ShippingMethod;->mLabel:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/stripe/android/model/ShippingMethod;->mAmount:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 132
    iget-object p2, p0, Lcom/stripe/android/model/ShippingMethod;->mCurrencyCode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 133
    iget-object p2, p0, Lcom/stripe/android/model/ShippingMethod;->mDetail:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 134
    iget-object p2, p0, Lcom/stripe/android/model/ShippingMethod;->mIdentifier:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 135
    iget-object p2, p0, Lcom/stripe/android/model/ShippingMethod;->mLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
