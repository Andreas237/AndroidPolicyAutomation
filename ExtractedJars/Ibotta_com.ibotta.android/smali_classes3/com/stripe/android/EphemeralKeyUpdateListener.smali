.class public interface abstract Lcom/stripe/android/EphemeralKeyUpdateListener;
.super Ljava/lang/Object;
.source "EphemeralKeyUpdateListener.java"


# virtual methods
.method public abstract onKeyUpdate(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onKeyUpdateFailure(ILjava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
