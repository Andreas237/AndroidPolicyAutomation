.class public final synthetic Lcom/ibotta/android/service/work/favorites/-$$Lambda$FavoriteRetailerSettingsFlushWorker$z_DiqgvsbLHUZ_yYVDHfzRe0QfI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/work/favorites/-$$Lambda$FavoriteRetailerSettingsFlushWorker$z_DiqgvsbLHUZ_yYVDHfzRe0QfI;->f$0:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    iput-boolean p2, p0, Lcom/ibotta/android/service/work/favorites/-$$Lambda$FavoriteRetailerSettingsFlushWorker$z_DiqgvsbLHUZ_yYVDHfzRe0QfI;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/-$$Lambda$FavoriteRetailerSettingsFlushWorker$z_DiqgvsbLHUZ_yYVDHfzRe0QfI;->f$0:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    iget-boolean v1, p0, Lcom/ibotta/android/service/work/favorites/-$$Lambda$FavoriteRetailerSettingsFlushWorker$z_DiqgvsbLHUZ_yYVDHfzRe0QfI;->f$1:Z

    invoke-static {v0, v1}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->lambda$schedule$0(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Z)V

    return-void
.end method
