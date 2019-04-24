.class final Lcom/nytimes/android/external/cache/Ticker$1;
.super Lcom/nytimes/android/external/cache/Ticker;
.source "Ticker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/Ticker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/Ticker;-><init>()V

    return-void
.end method


# virtual methods
.method public read()J
    .locals 2

    .line 48
    invoke-static {}, Lcom/nytimes/android/external/cache/Platform;->systemNanoTime()J

    move-result-wide v0

    return-wide v0
.end method
