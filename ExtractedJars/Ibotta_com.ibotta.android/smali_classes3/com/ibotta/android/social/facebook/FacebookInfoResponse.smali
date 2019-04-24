.class public Lcom/ibotta/android/social/facebook/FacebookInfoResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "FacebookInfoResponse.java"


# instance fields
.field private final fbInfo:Lcom/ibotta/android/state/social/FacebookInfo;

.field private final graphResponse:Lcom/facebook/GraphResponse;


# direct methods
.method public constructor <init>(Lcom/facebook/GraphResponse;Lcom/ibotta/android/state/social/FacebookInfo;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookInfoResponse;->graphResponse:Lcom/facebook/GraphResponse;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/social/facebook/FacebookInfoResponse;->fbInfo:Lcom/ibotta/android/state/social/FacebookInfo;

    return-void
.end method


# virtual methods
.method public getFbInfo()Lcom/ibotta/android/state/social/FacebookInfo;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookInfoResponse;->fbInfo:Lcom/ibotta/android/state/social/FacebookInfo;

    return-object v0
.end method

.method public getGraphResponse()Lcom/facebook/GraphResponse;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookInfoResponse;->graphResponse:Lcom/facebook/GraphResponse;

    return-object v0
.end method
