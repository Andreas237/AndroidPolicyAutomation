.class public Lcom/sina/weibo/sdk/auth/AuthInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/sina/weibo/sdk/auth/AuthInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppKey:Ljava/lang/String;

.field private mKeyHash:Ljava/lang/String;

.field private mPackageName:Ljava/lang/String;

.field private mRedirectUrl:Ljava/lang/String;

.field private mScope:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 98
    new-instance v0, Lcom/sina/weibo/sdk/auth/AuthInfo$1;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/auth/AuthInfo$1;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/auth/AuthInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mAppKey:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mRedirectUrl:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mScope:Ljava/lang/String;

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mKeyHash:Ljava/lang/String;

    .line 32
    iput-object p2, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mAppKey:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mRedirectUrl:Ljava/lang/String;

    .line 34
    iput-object p4, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mScope:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    .line 36
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/sina/weibo/sdk/utils/Utility;->getSign(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mKeyHash:Ljava/lang/String;

    .line 37
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mAppKey:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mRedirectUrl:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mScope:Ljava/lang/String;

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mKeyHash:Ljava/lang/String;

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mAppKey:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mRedirectUrl:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mScope:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mKeyHash:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public static parseBundleData(Landroid/content/Context;Landroid/os/Bundle;)Lcom/sina/weibo/sdk/auth/AuthInfo;
    .locals 4

    .line 70
    const-string v0, "appKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 71
    const-string v0, "redirectUri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 72
    const-string v0, "scope"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 73
    new-instance v0, Lcom/sina/weibo/sdk/auth/AuthInfo;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/sina/weibo/sdk/auth/AuthInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method public getAppKey()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mAppKey:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthBundle()Landroid/os/Bundle;
    .locals 3

    .line 60
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 61
    const-string v0, "appKey"

    iget-object v1, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mAppKey:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "redirectUri"

    iget-object v1, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mRedirectUrl:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v0, "scope"

    iget-object v1, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mScope:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "packagename"

    iget-object v1, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "key_hash"

    iget-object v1, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mKeyHash:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    return-object v2
.end method

.method public getKeyHash()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mKeyHash:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getRedirectUrl()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mRedirectUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getScope()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mScope:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mAppKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mRedirectUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mScope:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mPackageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/AuthInfo;->mKeyHash:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    return-void
.end method
