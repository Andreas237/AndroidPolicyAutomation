.class final Lcom/huawei/bone/social/manager/db/AssistentTable$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/manager/db/AssistentTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/bone/social/manager/db/AssistentTable;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/bone/social/manager/db/AssistentTable;
    .locals 3

    .line 69
    new-instance v2, Lcom/huawei/bone/social/manager/db/AssistentTable;

    invoke-direct {v2}, Lcom/huawei/bone/social/manager/db/AssistentTable;-><init>()V

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Lcom/huawei/bone/social/manager/db/AssistentTable;->access$002(Lcom/huawei/bone/social/manager/db/AssistentTable;J)J

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->access$102(Lcom/huawei/bone/social/manager/db/AssistentTable;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->access$202(Lcom/huawei/bone/social/manager/db/AssistentTable;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->access$302(Lcom/huawei/bone/social/manager/db/AssistentTable;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    return-object v2
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 65
    invoke-virtual {p0, p1}, Lcom/huawei/bone/social/manager/db/AssistentTable$5;->c(Landroid/os/Parcel;)Lcom/huawei/bone/social/manager/db/AssistentTable;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/bone/social/manager/db/AssistentTable;
    .locals 1

    .line 79
    new-array v0, p1, [Lcom/huawei/bone/social/manager/db/AssistentTable;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 65
    invoke-virtual {p0, p1}, Lcom/huawei/bone/social/manager/db/AssistentTable$5;->d(I)[Lcom/huawei/bone/social/manager/db/AssistentTable;

    move-result-object v0

    return-object v0
.end method
