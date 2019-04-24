.class public abstract Lcom/ibotta/api/call/pwi/PwiErrorResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "PwiErrorResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getPwiError()Lcom/ibotta/api/model/pwi/PwiError;
.end method
