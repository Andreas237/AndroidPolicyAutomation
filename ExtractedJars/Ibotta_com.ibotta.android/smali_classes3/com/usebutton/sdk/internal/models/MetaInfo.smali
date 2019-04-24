.class public Lcom/usebutton/sdk/internal/models/MetaInfo;
.super Ljava/lang/Object;
.source "MetaInfo.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/MetaInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final TAP_SIGNAL_REQUIRE_ACK:Ljava/lang/String; = "require-ack"

.field public static final TAP_SIGNAL_SEND:Ljava/lang/String; = "send"


# instance fields
.field private final mAppName:Ljava/lang/String;

.field private final mBrowser:Lcom/usebutton/sdk/internal/models/Browser;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mIcon:Lcom/usebutton/sdk/internal/models/Asset;

.field private final mId:Ljava/lang/String;

.field private final mMaxAgeSeconds:I

.field private final mRequestTime:Ljava/lang/String;

.field private final mSourceToken:Ljava/lang/String;

.field private final mStoreId:Ljava/lang/String;

.field private final mTapSignal:Ljava/lang/String;

.field private final mTarget:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 117
    new-instance v0, Lcom/usebutton/sdk/internal/models/MetaInfo$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/MetaInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Browser;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Asset;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mMaxAgeSeconds:I

    .line 35
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mId:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mStoreId:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mSourceToken:Ljava/lang/String;

    .line 38
    iput-object p6, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mAppName:Ljava/lang/String;

    .line 39
    iput-object p7, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTarget:Ljava/lang/String;

    .line 40
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    .line 41
    iput-object p8, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    .line 42
    iput-object p9, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mRequestTime:Ljava/lang/String;

    .line 43
    iput-object p10, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTapSignal:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mMaxAgeSeconds:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mId:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mStoreId:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mSourceToken:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mAppName:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTarget:Ljava/lang/String;

    .line 53
    const-class v0, Lcom/usebutton/sdk/internal/models/Browser;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Browser;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    .line 54
    const-class v0, Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Asset;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mRequestTime:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTapSignal:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mAppName:Ljava/lang/String;

    return-object v0
.end method

.method public getBrowser()Lcom/usebutton/sdk/internal/models/Browser;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    return-object v0
.end method

.method public getIcon()Lcom/usebutton/sdk/internal/models/Asset;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mId:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxAgeSeconds()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mMaxAgeSeconds:I

    return v0
.end method

.method public getRequestTime()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mRequestTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSourceToken()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mSourceToken:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreId()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mStoreId:Ljava/lang/String;

    return-object v0
.end method

.method public getTapSignal()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTapSignal:Ljava/lang/String;

    return-object v0
.end method

.method public getTarget()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTarget:Ljava/lang/String;

    return-object v0
.end method

.method public isTargetBrowser()Z
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->isTargetBrowser()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isTargetWebview()Z
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->isTargetWebView()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isTargetWebviewOnly()Z
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->isTargetWebViewOnly()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MetaInfo{mMaxAgeSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mMaxAgeSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mStoreId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mStoreId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mSourceToken=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mSourceToken:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mAppName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mAppName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mTarget=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTarget:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mBrowser="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mIcon="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mRequestTime=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mRequestTime:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mTapSignal=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTapSignal:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 136
    iget v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mMaxAgeSeconds:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 137
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mStoreId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mSourceToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mAppName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTarget:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 143
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 144
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mRequestTime:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/MetaInfo;->mTapSignal:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
