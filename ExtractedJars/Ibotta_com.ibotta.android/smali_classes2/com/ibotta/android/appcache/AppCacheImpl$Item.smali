.class Lcom/ibotta/android/appcache/AppCacheImpl$Item;
.super Ljava/lang/Object;
.source "AppCacheImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/appcache/AppCacheImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Item"
.end annotation


# instance fields
.field family:Ljava/lang/String;

.field response:Lcom/ibotta/api/CacheableApiResponse;

.field saved:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 892
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/appcache/AppCacheImpl$1;)V
    .locals 0

    .line 892
    invoke-direct {p0}, Lcom/ibotta/android/appcache/AppCacheImpl$Item;-><init>()V

    return-void
.end method
