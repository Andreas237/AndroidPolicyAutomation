.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$s5dX6c36sZ11LWlvPSBr_PGIXnE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/app/config/AppConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$s5dX6c36sZ11LWlvPSBr_PGIXnE;->f$0:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$s5dX6c36sZ11LWlvPSBr_PGIXnE;->f$0:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getPixelTrackingMaxAttempts()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
