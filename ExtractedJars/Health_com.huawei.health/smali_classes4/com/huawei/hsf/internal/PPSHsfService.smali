.class public Lcom/huawei/hsf/internal/PPSHsfService;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hsf/internal/PPSHsfService$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hsf/internal/PPSHsfService;>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/os/IBinder;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/hsf/internal/PPSHsfService$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hsf/internal/PPSHsfService$c;-><init>(Lcom/huawei/hsf/internal/PPSHsfService$3;)V

    sput-object v0, Lcom/huawei/hsf/internal/PPSHsfService;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/IBinder;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hsf/internal/PPSHsfService;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hsf/internal/PPSHsfService;->b:Landroid/os/IBinder;

    iput p3, p0, Lcom/huawei/hsf/internal/PPSHsfService;->c:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hsf/internal/PPSHsfService;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hsf/internal/PPSHsfService;->b:Landroid/os/IBinder;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hsf/internal/PPSHsfService;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hsf/internal/PPSHsfService;->b:Landroid/os/IBinder;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    iget v0, p0, Lcom/huawei/hsf/internal/PPSHsfService;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
