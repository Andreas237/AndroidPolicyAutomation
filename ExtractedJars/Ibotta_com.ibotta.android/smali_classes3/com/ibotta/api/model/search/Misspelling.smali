.class public abstract Lcom/ibotta/api/model/search/Misspelling;
.super Ljava/lang/Object;
.source "Misspelling.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/search/Misspelling$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/api/model/search/Misspelling;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 8
    invoke-static {}, Lcom/ibotta/api/model/search/Misspelling;->builder()Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object v0

    const-string v1, ""

    .line 9
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/Misspelling$Builder;->original(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object v0

    const-string v1, ""

    .line 10
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/Misspelling$Builder;->suggested(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object v0

    const-string v1, ""

    .line 11
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/Misspelling$Builder;->confidence(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/ibotta/api/model/search/Misspelling$Builder;->build()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v0

    sput-object v0, Lcom/ibotta/api/model/search/Misspelling;->EMPTY:Lcom/ibotta/api/model/search/Misspelling;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/search/Misspelling$Builder;
    .locals 1

    .line 19
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getConfidence()Ljava/lang/String;
.end method

.method public abstract getOriginal()Ljava/lang/String;
.end method

.method public abstract getSuggested()Ljava/lang/String;
.end method
