.class public final synthetic Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$33C6XhuxFl3e6V4oH3_hgebI5n4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/GlobalStateListener;

.field private final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/GlobalStateListener;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$33C6XhuxFl3e6V4oH3_hgebI5n4;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iput-object p2, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$33C6XhuxFl3e6V4oH3_hgebI5n4;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$33C6XhuxFl3e6V4oH3_hgebI5n4;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    iget-object v1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$33C6XhuxFl3e6V4oH3_hgebI5n4;->f$1:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->lambda$onUpgradeAvailable$4(Lcom/ibotta/android/state/GlobalStateListener;Ljava/lang/String;)V

    return-void
.end method
