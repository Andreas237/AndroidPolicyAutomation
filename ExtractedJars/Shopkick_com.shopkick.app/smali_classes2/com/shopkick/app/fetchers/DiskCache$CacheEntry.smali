.class Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;
.super Ljava/lang/Object;
.source "DiskCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/fetchers/DiskCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CacheEntry"
.end annotation


# instance fields
.field public data:[B

.field public expirationTimestamp:J

.field public isPinned:Z

.field public key:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
