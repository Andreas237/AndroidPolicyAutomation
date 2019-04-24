.class final Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;
.super Lcom/ibotta/api/model/search/Misspelling$Builder;
.source "AutoValue_Misspelling.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/search/AutoValue_Misspelling;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private confidence:Ljava/lang/String;

.field private original:Ljava/lang/String;

.field private suggested:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/ibotta/api/model/search/Misspelling$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/search/Misspelling;
    .locals 5

    const-string v0, ""

    .line 106
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->original:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " original"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 109
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->suggested:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " suggested"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 112
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->confidence:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " confidence"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 115
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 118
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->original:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->suggested:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->confidence:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/api/model/search/AutoValue_Misspelling;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/search/AutoValue_Misspelling$1;)V

    return-object v0

    .line 116
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public confidence(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 100
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->confidence:Ljava/lang/String;

    return-object p0

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null confidence"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public original(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->original:Ljava/lang/String;

    return-object p0

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null original"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public suggested(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 92
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;->suggested:Ljava/lang/String;

    return-object p0

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null suggested"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
