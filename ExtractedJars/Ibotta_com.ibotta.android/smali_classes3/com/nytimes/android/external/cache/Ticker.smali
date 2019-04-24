.class public abstract Lcom/nytimes/android/external/cache/Ticker;
.super Ljava/lang/Object;
.source "Ticker.java"


# static fields
.field private static final SYSTEM_TICKER:Lcom/nytimes/android/external/cache/Ticker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Lcom/nytimes/android/external/cache/Ticker$1;

    invoke-direct {v0}, Lcom/nytimes/android/external/cache/Ticker$1;-><init>()V

    sput-object v0, Lcom/nytimes/android/external/cache/Ticker;->SYSTEM_TICKER:Lcom/nytimes/android/external/cache/Ticker;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static systemTicker()Lcom/nytimes/android/external/cache/Ticker;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 41
    sget-object v0, Lcom/nytimes/android/external/cache/Ticker;->SYSTEM_TICKER:Lcom/nytimes/android/external/cache/Ticker;

    return-object v0
.end method


# virtual methods
.method public abstract read()J
.end method
