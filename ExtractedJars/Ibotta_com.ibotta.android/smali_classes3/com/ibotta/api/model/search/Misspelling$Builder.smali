.class public abstract Lcom/ibotta/api/model/search/Misspelling$Builder;
.super Ljava/lang/Object;
.source "Misspelling.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/search/Misspelling;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/search/Misspelling;
.end method

.method public abstract confidence(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;
.end method

.method public abstract original(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;
.end method

.method public abstract suggested(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;
.end method
