.class public Lcom/stripe/android/RequestOptions;
.super Ljava/lang/Object;
.source "RequestOptions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;,
        Lcom/stripe/android/RequestOptions$RequestType;
    }
.end annotation


# instance fields
.field private final mApiVersion:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mGuid:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mIdempotencyKey:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mPublishableApiKey:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mRequestType:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mStripeAccount:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/RequestOptions;->mApiVersion:Ljava/lang/String;

    .line 36
    iput-object p2, p0, Lcom/stripe/android/RequestOptions;->mGuid:Ljava/lang/String;

    .line 37
    iput-object p3, p0, Lcom/stripe/android/RequestOptions;->mIdempotencyKey:Ljava/lang/String;

    .line 38
    iput-object p4, p0, Lcom/stripe/android/RequestOptions;->mPublishableApiKey:Ljava/lang/String;

    .line 39
    iput-object p5, p0, Lcom/stripe/android/RequestOptions;->mRequestType:Ljava/lang/String;

    .line 40
    iput-object p6, p0, Lcom/stripe/android/RequestOptions;->mStripeAccount:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/RequestOptions$1;)V
    .locals 0

    .line 13
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/RequestOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "source"

    .line 94
    invoke-static {p0, v0}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static builder(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 115
    new-instance v0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static builder(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 101
    new-instance v0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-virtual {v0, p1}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setStripeAccount(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method getApiVersion()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/stripe/android/RequestOptions;->mApiVersion:Ljava/lang/String;

    return-object v0
.end method

.method getGuid()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/stripe/android/RequestOptions;->mGuid:Ljava/lang/String;

    return-object v0
.end method

.method getIdempotencyKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/stripe/android/RequestOptions;->mIdempotencyKey:Ljava/lang/String;

    return-object v0
.end method

.method getPublishableApiKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/stripe/android/RequestOptions;->mPublishableApiKey:Ljava/lang/String;

    return-object v0
.end method

.method getRequestType()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/stripe/android/RequestOptions;->mRequestType:Ljava/lang/String;

    return-object v0
.end method

.method getStripeAccount()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/stripe/android/RequestOptions;->mStripeAccount:Ljava/lang/String;

    return-object v0
.end method
