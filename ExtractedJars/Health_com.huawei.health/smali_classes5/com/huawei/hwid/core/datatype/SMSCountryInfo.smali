.class public Lcom/huawei/hwid/core/datatype/SMSCountryInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/SMSCountryInfo;>;"
        }
    .end annotation
.end field

.field public static final TAG_COUNTRYCODE:Ljava/lang/String; = "countryCode"

.field public static final TAG_COUNTRYINFO:Ljava/lang/String; = "CountryInfo"

.field public static final TAG_COUNTRY_CALLINGCODE:Ljava/lang/String; = "countryCallingCode"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    new-instance v0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/SMSCountryInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->a:Ljava/lang/String;

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->b:Ljava/lang/String;

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/SMSCountryInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/SMSCountryInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/hwid/core/datatype/SMSCountryInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->c:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 41
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    return-void
.end method
