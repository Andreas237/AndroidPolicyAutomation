.class final Lcom/huawei/hms/support/api/client/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hms/support/api/client/Status;
    .locals 4

    .line 65
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Landroid/app/PendingIntent;->readPendingIntentOrNullFromParcel(Landroid/os/Parcel;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    return-object v0
.end method

.method public a(I)[Lcom/huawei/hms/support/api/client/Status;
    .locals 1

    .line 69
    new-array v0, p1, [Lcom/huawei/hms/support/api/client/Status;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 63
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/client/a;->a(Landroid/os/Parcel;)Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 63
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/client/a;->a(I)[Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    return-object v0
.end method
