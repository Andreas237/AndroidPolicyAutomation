.class public interface abstract Lcom/j256/ormlite/dao/CloseableWrappedIterable;
.super Ljava/lang/Object;
.source "CloseableWrappedIterable.java"

# interfaces
.implements Lcom/j256/ormlite/dao/CloseableIterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/j256/ormlite/dao/CloseableIterable<",
        "TT;>;"
    }
.end annotation


# virtual methods
.method public abstract close()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation
.end method
