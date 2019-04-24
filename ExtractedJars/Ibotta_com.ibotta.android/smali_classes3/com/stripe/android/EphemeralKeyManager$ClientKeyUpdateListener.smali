.class Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;
.super Ljava/lang/Object;
.source "EphemeralKeyManager.java"

# interfaces
.implements Lcom/stripe/android/EphemeralKeyUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/EphemeralKeyManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ClientKeyUpdateListener"
.end annotation


# instance fields
.field private mActionString:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mArguments:Ljava/util/Map;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mEphemeralKeyManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/stripe/android/EphemeralKeyManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/stripe/android/EphemeralKeyManager;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1    # Lcom/stripe/android/EphemeralKeyManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/EphemeralKeyManager;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;->mEphemeralKeyManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 100
    iput-object p2, p0, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;->mActionString:Ljava/lang/String;

    .line 101
    iput-object p3, p0, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;->mArguments:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public onKeyUpdate(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 106
    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;->mEphemeralKeyManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/EphemeralKeyManager;

    if-eqz v0, :cond_0

    .line 108
    iget-object v1, p0, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;->mActionString:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;->mArguments:Ljava/util/Map;

    invoke-static {v0, p1, v1, v2}, Lcom/stripe/android/EphemeralKeyManager;->access$000(Lcom/stripe/android/EphemeralKeyManager;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onKeyUpdateFailure(ILjava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 114
    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;->mEphemeralKeyManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/EphemeralKeyManager;

    if-eqz v0, :cond_0

    .line 116
    invoke-static {v0, p1, p2}, Lcom/stripe/android/EphemeralKeyManager;->access$100(Lcom/stripe/android/EphemeralKeyManager;ILjava/lang/String;)V

    :cond_0
    return-void
.end method
