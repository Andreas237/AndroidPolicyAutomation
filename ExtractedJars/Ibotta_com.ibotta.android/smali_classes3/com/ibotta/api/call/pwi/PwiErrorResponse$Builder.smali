.class public abstract Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;
.super Ljava/lang/Object;
.source "PwiErrorResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/PwiErrorResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/call/pwi/PwiErrorResponse;
.end method

.method public abstract pwiError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;
.end method
