.class final Lcom/sina/weibo/sdk/auth/AuthInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/auth/AuthInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/sina/weibo/sdk/auth/AuthInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/sina/weibo/sdk/auth/AuthInfo;
    .locals 1

    .line 101
    new-instance v0, Lcom/sina/weibo/sdk/auth/AuthInfo;

    invoke-direct {v0, p1}, Lcom/sina/weibo/sdk/auth/AuthInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 98
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/auth/AuthInfo$1;->createFromParcel(Landroid/os/Parcel;)Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/sina/weibo/sdk/auth/AuthInfo;
    .locals 1

    .line 106
    new-array v0, p1, [Lcom/sina/weibo/sdk/auth/AuthInfo;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 98
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/auth/AuthInfo$1;->newArray(I)[Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v0

    return-object v0
.end method
