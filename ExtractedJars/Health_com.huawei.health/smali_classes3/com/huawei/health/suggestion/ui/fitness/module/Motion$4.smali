.class final Lcom/huawei/health/suggestion/ui/fitness/module/Motion$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/module/Motion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 576
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)[Lcom/huawei/health/suggestion/ui/fitness/module/Motion;
    .locals 1

    .line 584
    new-array v0, p1, [Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 576
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion$4;->d(Landroid/os/Parcel;)Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/health/suggestion/ui/fitness/module/Motion;
    .locals 1

    .line 579
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-direct {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 576
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion$4;->b(I)[Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    move-result-object v0

    return-object v0
.end method
