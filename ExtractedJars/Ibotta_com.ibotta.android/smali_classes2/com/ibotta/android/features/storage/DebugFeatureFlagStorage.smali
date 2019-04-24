.class public interface abstract Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;
.super Ljava/lang/Object;
.source "DebugFeatureFlagStorage.java"


# virtual methods
.method public abstract getFeatureFlagState(Ljava/lang/String;)Lcom/ibotta/android/features/storage/DebugFeatureFlagState;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract hasStateFor(Ljava/lang/String;)Z
.end method

.method public abstract saveFeatureFlagState(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagState;)V
.end method
