.class public final synthetic Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SLBDqrCHhWg9uRpMsQPA_J-18Fk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/GlobalStateListener;

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/GlobalStateListener;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SLBDqrCHhWg9uRpMsQPA_J-18Fk;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iput-boolean p2, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SLBDqrCHhWg9uRpMsQPA_J-18Fk;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SLBDqrCHhWg9uRpMsQPA_J-18Fk;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iget-boolean v1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SLBDqrCHhWg9uRpMsQPA_J-18Fk;->f$1:Z

    invoke-static {v0, v1}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->lambda$onAuthenticationLost$0(Lcom/ibotta/android/state/GlobalStateListener;Z)V

    return-void
.end method
