.class final Lcom/huawei/sns/sdk/modelmsg/GroupInfo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sns/sdk/modelmsg/GroupInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/GroupInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/sns/sdk/modelmsg/GroupInfo;
    .locals 1

    .line 71
    new-array v0, p1, [Lcom/huawei/sns/sdk/modelmsg/GroupInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 63
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/GroupInfo$2;->e(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/GroupInfo;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/GroupInfo;
    .locals 2

    .line 66
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;-><init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/GroupInfo$2;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 63
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/GroupInfo$2;->a(I)[Lcom/huawei/sns/sdk/modelmsg/GroupInfo;

    move-result-object v0

    return-object v0
.end method
