.class public Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "NetworkConnectionStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/network/NetworkConnectionState;


# instance fields
.field private final context:Landroid/content/Context;

.field private final networkChangedIntent:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;->context:Landroid/content/Context;

    .line 15
    iput-object p2, p0, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;->networkChangedIntent:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    .line 20
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    .line 21
    iget-object p1, p0, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;->networkChangedIntent:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    .line 26
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;->networkChangedIntent:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
