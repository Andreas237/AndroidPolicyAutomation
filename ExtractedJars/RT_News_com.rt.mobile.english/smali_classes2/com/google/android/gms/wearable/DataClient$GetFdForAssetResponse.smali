.class public abstract Lcom/google/android/gms/wearable/DataClient$GetFdForAssetResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Releasable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/DataClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "GetFdForAssetResponse"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getFdForAsset()Landroid/os/ParcelFileDescriptor;
.end method

.method public abstract getInputStream()Ljava/io/InputStream;
.end method
