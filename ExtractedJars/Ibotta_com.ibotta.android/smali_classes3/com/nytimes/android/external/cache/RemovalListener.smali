.class public interface abstract Lcom/nytimes/android/external/cache/RemovalListener;
.super Ljava/lang/Object;
.source "RemovalListener.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onRemoval(Lcom/nytimes/android/external/cache/RemovalNotification;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/RemovalNotification<",
            "TK;TV;>;)V"
        }
    .end annotation
.end method
