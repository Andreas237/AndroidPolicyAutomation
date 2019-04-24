.class final Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;
.super Lcom/ibotta/api/model/pwi/PwiError$Builder;
.source "AutoValue_PwiError.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/AutoValue_PwiError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private body:Ljava/lang/String;

.field private code:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/PwiError$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public body(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiError$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 96
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->body:Ljava/lang/String;

    return-object p0

    .line 94
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null body"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/ibotta/api/model/pwi/PwiError;
    .locals 5

    const-string v0, ""

    .line 110
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->title:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " title"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->body:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " body"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 116
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->code:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 117
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " code"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 119
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 122
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->body:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->code:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/pwi/AutoValue_PwiError$1;)V

    return-object v0

    .line 120
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

.method public code(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiError$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 104
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->code:Ljava/lang/String;

    return-object p0

    .line 102
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null code"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public title(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiError$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 88
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;->title:Ljava/lang/String;

    return-object p0

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null title"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
