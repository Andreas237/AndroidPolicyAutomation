.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$MiscModule$jne8NyTSCAdC2geVIE4Kph7mLF8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/app/config/AppConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$MiscModule$jne8NyTSCAdC2geVIE4Kph7mLF8;->f$0:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$MiscModule$jne8NyTSCAdC2geVIE4Kph7mLF8;->f$0:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {v0}, Lcom/ibotta/android/di/MiscModule;->lambda$provideTrackingQueue$3(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
