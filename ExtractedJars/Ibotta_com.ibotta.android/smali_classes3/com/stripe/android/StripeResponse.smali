.class Lcom/stripe/android/StripeResponse;
.super Ljava/lang/Object;
.source "StripeResponse.java"


# instance fields
.field private mResponseBody:Ljava/lang/String;

.field private mResponseCode:I

.field private mResponseHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/util/Map;)V
    .locals 0
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Lcom/stripe/android/StripeResponse;->mResponseCode:I

    .line 29
    iput-object p2, p0, Lcom/stripe/android/StripeResponse;->mResponseBody:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lcom/stripe/android/StripeResponse;->mResponseHeaders:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method getResponseBody()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/StripeResponse;->mResponseBody:Ljava/lang/String;

    return-object v0
.end method

.method getResponseCode()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/stripe/android/StripeResponse;->mResponseCode:I

    return v0
.end method

.method getResponseHeaders()Ljava/util/Map;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/stripe/android/StripeResponse;->mResponseHeaders:Ljava/util/Map;

    return-object v0
.end method
