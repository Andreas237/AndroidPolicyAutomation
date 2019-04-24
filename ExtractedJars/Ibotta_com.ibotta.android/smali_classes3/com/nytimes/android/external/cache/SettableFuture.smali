.class public final Lcom/nytimes/android/external/cache/SettableFuture;
.super Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;
.source "SettableFuture.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture<",
        "TV;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;-><init>()V

    return-void
.end method

.method public static create()Lcom/nytimes/android/external/cache/SettableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/nytimes/android/external/cache/SettableFuture<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 13
    new-instance v0, Lcom/nytimes/android/external/cache/SettableFuture;

    invoke-direct {v0}, Lcom/nytimes/android/external/cache/SettableFuture;-><init>()V

    return-object v0
.end method


# virtual methods
.method public set(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .line 23
    invoke-super {p0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;->set(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public setException(Ljava/lang/Throwable;)Z
    .locals 0

    .line 27
    invoke-super {p0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;->setException(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
