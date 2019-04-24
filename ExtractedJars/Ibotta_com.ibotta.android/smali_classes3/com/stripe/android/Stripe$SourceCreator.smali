.class interface abstract Lcom/stripe/android/Stripe$SourceCreator;
.super Ljava/lang/Object;
.source "Stripe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/Stripe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "SourceCreator"
.end annotation


# virtual methods
.method public abstract create(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/stripe/android/SourceCallback;)V
    .param p1    # Lcom/stripe/android/model/SourceParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/SourceCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
