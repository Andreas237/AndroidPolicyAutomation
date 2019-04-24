.class public Lcom/ibotta/api/ApiResponse;
.super Ljava/lang/Object;
.source "ApiResponse.java"


# static fields
.field public static final RESPONSE_CODE_APP_VERSION_DEPRECATED:I = 0x1aa

.field public static final RESPONSE_CODE_AUTH_LOST:I = 0x191

.field public static final RESPONSE_CODE_EXPIRED:I = 0x199

.field public static final RESPONSE_CODE_MAINTENANCE_MODE:I = 0x1f7

.field public static final RESPONSE_CODE_TIMEOUT:I = 0x1f8


# instance fields
.field private responseCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getResponseCode()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/ibotta/api/ApiResponse;->responseCode:I

    return v0
.end method

.method public setResponseCode(I)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/ibotta/api/ApiResponse;->responseCode:I

    return-void
.end method
