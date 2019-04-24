.class public Lcom/twitter/sdk/android/core/models/ApiError;
.super Ljava/lang/Object;
.source "ApiError.java"


# instance fields
.field private final code:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "code"
    .end annotation
.end field


# virtual methods
.method public getCode()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/twitter/sdk/android/core/models/ApiError;->code:I

    return v0
.end method
