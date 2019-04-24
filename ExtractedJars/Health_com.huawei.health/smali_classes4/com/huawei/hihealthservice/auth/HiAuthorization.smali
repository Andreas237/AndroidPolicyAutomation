.class public Lcom/huawei/hihealthservice/auth/HiAuthorization;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealthservice/auth/HiAuthorization;>;"
        }
    .end annotation
.end field


# instance fields
.field private appAttr:Lcom/huawei/hihealthservice/auth/HiAppAttr;

.field private certFingerprint:Ljava/lang/String;

.field private scopes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/auth/HiScope;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lcom/huawei/hihealthservice/auth/HiAuthorization$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/auth/HiAuthorization$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->certFingerprint:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 69
    const/4 v0, 0x0

    return v0
.end method

.method public getAppAttr()Lcom/huawei/hihealthservice/auth/HiAppAttr;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->appAttr:Lcom/huawei/hihealthservice/auth/HiAppAttr;

    return-object v0
.end method

.method public getCertFingerprint()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->certFingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public getScopes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/auth/HiScope;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->scopes:Ljava/util/List;

    return-object v0
.end method

.method public setAppAttr(Lcom/huawei/hihealthservice/auth/HiAppAttr;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->appAttr:Lcom/huawei/hihealthservice/auth/HiAppAttr;

    .line 59
    return-void
.end method

.method public setCertFingerprint(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->certFingerprint:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setScopes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealthservice/auth/HiScope;>;)V"
        }
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->scopes:Ljava/util/List;

    .line 43
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HiAuthorization [scopes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->scopes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", certFingerprint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->certFingerprint:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appAttr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->appAttr:Lcom/huawei/hihealthservice/auth/HiAppAttr;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthorization;->certFingerprint:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 75
    return-void
.end method
