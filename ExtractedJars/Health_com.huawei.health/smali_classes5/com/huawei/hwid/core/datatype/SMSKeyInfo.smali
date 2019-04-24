.class public Lcom/huawei/hwid/core/datatype/SMSKeyInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/SMSKeyInfo;>;"
        }
    .end annotation
.end field

.field public static final TAG_KEY:Ljava/lang/String; = "key"

.field public static final TAG_LANG:Ljava/lang/String; = "lang"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/SMSKeyInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo;->a:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/SMSKeyInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/SMSKeyInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo;->b:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 35
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/SMSKeyInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 41
    return-void
.end method
