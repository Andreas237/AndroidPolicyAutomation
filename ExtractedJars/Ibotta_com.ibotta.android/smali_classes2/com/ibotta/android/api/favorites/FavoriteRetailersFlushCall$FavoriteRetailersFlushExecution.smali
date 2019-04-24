.class Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$FavoriteRetailersFlushExecution;
.super Ljava/lang/Object;
.source "FavoriteRetailersFlushCall.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FavoriteRetailersFlushExecution"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$FavoriteRetailersFlushExecution;->this$0:Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$1;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$FavoriteRetailersFlushExecution;-><init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;)V

    return-void
.end method


# virtual methods
.method public abort()V
    .locals 0

    return-void
.end method

.method public executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 54
    iget-object p1, p0, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$FavoriteRetailersFlushExecution;->this$0:Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;

    invoke-static {p1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;->access$100(Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->flushNow()V

    .line 55
    new-instance p1, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;

    invoke-direct {p1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;-><init>()V

    return-object p1
.end method

.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isAborted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
