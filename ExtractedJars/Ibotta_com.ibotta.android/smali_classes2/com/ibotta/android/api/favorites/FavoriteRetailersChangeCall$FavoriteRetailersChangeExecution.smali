.class Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$FavoriteRetailersChangeExecution;
.super Ljava/lang/Object;
.source "FavoriteRetailersChangeCall.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FavoriteRetailersChangeExecution"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$FavoriteRetailersChangeExecution;->this$0:Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$1;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$FavoriteRetailersChangeExecution;-><init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;)V

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

    .line 65
    new-instance p1, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;

    invoke-direct {p1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;-><init>()V

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
