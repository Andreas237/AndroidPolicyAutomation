.class public final Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;
.super Ljava/lang/Object;
.source "RequestOptions.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/RequestOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestOptionsBuilder"
.end annotation


# instance fields
.field private apiVersion:Ljava/lang/String;

.field private guid:Ljava/lang/String;

.field private idempotencyKey:Ljava/lang/String;

.field private publishableApiKey:Ljava/lang/String;

.field private requestType:Ljava/lang/String;

.field private stripeAccount:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->publishableApiKey:Ljava/lang/String;

    .line 141
    iput-object p2, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->requestType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/RequestOptions;
    .locals 9

    .line 208
    new-instance v8, Lcom/stripe/android/RequestOptions;

    iget-object v1, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->apiVersion:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->guid:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->idempotencyKey:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->publishableApiKey:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->requestType:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->stripeAccount:Ljava/lang/String;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/RequestOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/RequestOptions$1;)V

    return-object v8
.end method

.method setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 190
    invoke-static {p1}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput-object p1, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->apiVersion:Ljava/lang/String;

    return-object p0
.end method

.method setGuid(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 177
    iput-object p1, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->guid:Ljava/lang/String;

    return-object p0
.end method

.method setStripeAccount(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 198
    iput-object p1, p0, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->stripeAccount:Ljava/lang/String;

    return-object p0
.end method
