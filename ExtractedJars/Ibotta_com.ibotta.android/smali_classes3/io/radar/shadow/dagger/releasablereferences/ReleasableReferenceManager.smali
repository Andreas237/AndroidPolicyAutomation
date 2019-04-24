.class public interface abstract Lio/radar/shadow/dagger/releasablereferences/ReleasableReferenceManager;
.super Ljava/lang/Object;
.source "ReleasableReferenceManager.java"


# annotations
.annotation build Lio/radar/shadow/dagger/internal/GwtIncompatible;
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# virtual methods
.method public abstract releaseStrongReferences()V
.end method

.method public abstract restoreStrongReferences()V
.end method

.method public abstract scope()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end method
