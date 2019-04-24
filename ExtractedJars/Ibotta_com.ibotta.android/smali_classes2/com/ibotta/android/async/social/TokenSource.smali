.class public interface abstract Lcom/ibotta/android/async/social/TokenSource;
.super Ljava/lang/Object;
.source "TokenSource.java"


# virtual methods
.method public abstract getExpiration()Ljava/lang/Long;
.end method

.method public abstract getToken()Ljava/lang/String;
.end method

.method public abstract load()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
