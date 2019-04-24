.class public final synthetic Lcom/ibotta/android/social/facebook/-$$Lambda$FacebookManager$3$WXrSUBMwKfri1N6gHPfF6eQrbiM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/api/ApiResponse;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/api/ApiResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/social/facebook/-$$Lambda$FacebookManager$3$WXrSUBMwKfri1N6gHPfF6eQrbiM;->f$0:Lcom/ibotta/api/ApiResponse;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/social/facebook/-$$Lambda$FacebookManager$3$WXrSUBMwKfri1N6gHPfF6eQrbiM;->f$0:Lcom/ibotta/api/ApiResponse;

    invoke-static {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$3;->lambda$onApiJobFinished$0(Lcom/ibotta/api/ApiResponse;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
