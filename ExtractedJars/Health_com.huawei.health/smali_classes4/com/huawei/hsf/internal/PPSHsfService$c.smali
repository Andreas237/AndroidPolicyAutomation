.class Lcom/huawei/hsf/internal/PPSHsfService$c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hsf/internal/PPSHsfService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hsf/internal/PPSHsfService;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hsf/internal/PPSHsfService$3;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hsf/internal/PPSHsfService$c;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Parcel;)Lcom/huawei/hsf/internal/PPSHsfService;
    .locals 4

    new-instance v3, Lcom/huawei/hsf/internal/PPSHsfService;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/hsf/internal/PPSHsfService;-><init>(Ljava/lang/String;Landroid/os/IBinder;I)V

    return-object v3
.end method

.method public c(I)[Lcom/huawei/hsf/internal/PPSHsfService;
    .locals 1

    new-array v0, p1, [Lcom/huawei/hsf/internal/PPSHsfService;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/huawei/hsf/internal/PPSHsfService$c;->b(Landroid/os/Parcel;)Lcom/huawei/hsf/internal/PPSHsfService;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/huawei/hsf/internal/PPSHsfService$c;->c(I)[Lcom/huawei/hsf/internal/PPSHsfService;

    move-result-object v0

    return-object v0
.end method
