.class public interface abstract Lcom/stripe/android/EphemeralKeyProvider;
.super Ljava/lang/Object;
.source "EphemeralKeyProvider.java"


# virtual methods
.method public abstract createEphemeralKey(Ljava/lang/String;Lcom/stripe/android/EphemeralKeyUpdateListener;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            min = 0x4L
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/EphemeralKeyUpdateListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
