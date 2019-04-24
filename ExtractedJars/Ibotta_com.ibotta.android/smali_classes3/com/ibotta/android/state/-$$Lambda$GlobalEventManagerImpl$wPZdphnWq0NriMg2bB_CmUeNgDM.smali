.class public final synthetic Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$wPZdphnWq0NriMg2bB_CmUeNgDM;
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

    iput-object p1, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$wPZdphnWq0NriMg2bB_CmUeNgDM;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$wPZdphnWq0NriMg2bB_CmUeNgDM;->f$0:Lcom/ibotta/android/state/GlobalStateListener;

    invoke-static {v0}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->lambda$onMaintenanceMode$3(Lcom/ibotta/android/state/GlobalStateListener;)V

    return-void
.end method
