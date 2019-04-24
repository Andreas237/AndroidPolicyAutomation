.class public interface abstract Lcom/microblink/internal/services/google/GoogleQueryRepository$Listener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/services/google/GoogleQueryRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onComplete(Lcom/microblink/internal/services/google/GoogleLookupResponse;)V
    .param p1    # Lcom/microblink/internal/services/google/GoogleLookupResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
