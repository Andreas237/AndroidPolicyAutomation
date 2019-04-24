.class public abstract Lcom/ibotta/api/JsonParamApiCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "JsonParamApiCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/ApiResponse;",
        ">",
        "Lcom/ibotta/api/BaseApiCall<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private jsonParam:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    return-void
.end method


# virtual methods
.method public getJsonParam()Ljava/lang/Object;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ibotta/api/JsonParamApiCall;->jsonParam:Ljava/lang/Object;

    return-object v0
.end method

.method public setJsonParam(Ljava/lang/Object;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/ibotta/api/JsonParamApiCall;->jsonParam:Ljava/lang/Object;

    return-void
.end method
