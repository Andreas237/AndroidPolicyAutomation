.class final Lcom/sina/weibo/sdk/web/BaseWebViewRequestData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;
    .locals 1

    .line 111
    new-instance v0, Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;

    invoke-direct {v0, p1}, Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 108
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/web/BaseWebViewRequestData$1;->createFromParcel(Landroid/os/Parcel;)Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;
    .locals 1

    .line 116
    new-array v0, p1, [Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 108
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/web/BaseWebViewRequestData$1;->newArray(I)[Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;

    move-result-object v0

    return-object v0
.end method
