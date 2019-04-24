.class public Lcom/ibotta/tracking/generated/invoker/Configuration;
.super Ljava/lang/Object;
.source "Configuration.java"


# static fields
.field private static defaultApiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiClient;

    invoke-direct {v0}, Lcom/ibotta/tracking/generated/invoker/ApiClient;-><init>()V

    sput-object v0, Lcom/ibotta/tracking/generated/invoker/Configuration;->defaultApiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDefaultApiClient()Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/tracking/generated/invoker/Configuration;->defaultApiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    return-object v0
.end method

.method public static setDefaultApiClient(Lcom/ibotta/tracking/generated/invoker/ApiClient;)V
    .locals 0

    .line 37
    sput-object p0, Lcom/ibotta/tracking/generated/invoker/Configuration;->defaultApiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    return-void
.end method
