.class public interface abstract Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/services/ip/LocationLookupRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onLocationChange(Lcom/microblink/internal/services/ip/LocationResult;)V
    .param p1    # Lcom/microblink/internal/services/ip/LocationResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
