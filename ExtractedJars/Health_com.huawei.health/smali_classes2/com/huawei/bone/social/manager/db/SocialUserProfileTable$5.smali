.class final Lcom/huawei/bone/social/manager/db/SocialUserProfileTable$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 73
    invoke-virtual {p0, p1}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable$5;->e(Landroid/os/Parcel;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;
    .locals 1

    .line 82
    new-array v0, p1, [Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;
    .locals 1

    .line 77
    new-instance v0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    invoke-direct {v0, p1}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 73
    invoke-virtual {p0, p1}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable$5;->d(I)[Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v0

    return-object v0
.end method
