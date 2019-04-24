.class public final synthetic Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$F4d_xswmUnTbLz3QR74RQmPg0DE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/GlobalStateListener;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$F4d_xswmUnTbLz3QR74RQmPg0DE;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$F4d_xswmUnTbLz3QR74RQmPg0DE;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    invoke-static {v0}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->lambda$onOfferExpired$1(Lcom/ibotta/android/state/GlobalStateListener;)V

    return-void
.end method
