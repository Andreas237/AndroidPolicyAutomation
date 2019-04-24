.class public abstract Lcom/ibotta/api/model/pwi/PwiError$Builder;
.super Ljava/lang/Object;
.source "PwiError.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/PwiError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract body(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiError$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "body"
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/api/model/pwi/PwiError;
.end method

.method public abstract code(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiError$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "code"
    .end annotation
.end method

.method public abstract title(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiError$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation
.end method
