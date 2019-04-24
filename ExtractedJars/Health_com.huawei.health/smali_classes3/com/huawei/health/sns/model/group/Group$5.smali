.class final Lcom/huawei/health/sns/model/group/Group$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/group/Group;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/group/Group;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 254
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 265
    new-array v0, p1, [Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 259
    new-instance v0, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v0, p1}, Lcom/huawei/health/sns/model/group/Group;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 254
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/group/Group$5;->c(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 254
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/group/Group$5;->a(I)[Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method
