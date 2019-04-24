.class public Lcom/usebutton/sdk/internal/functional/Pair;
.super Ljava/lang/Object;
.source "Pair.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<First:",
        "Ljava/lang/Object;",
        "Second:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final mFirst:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TFirst;"
        }
    .end annotation
.end field

.field private final mSecond:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TSecond;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFirst;TSecond;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mFirst:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mSecond:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_3

    .line 25
    :cond_1
    check-cast p1, Lcom/usebutton/sdk/internal/functional/Pair;

    .line 27
    iget-object v2, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mFirst:Ljava/lang/Object;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/usebutton/sdk/internal/functional/Pair;->mFirst:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/usebutton/sdk/internal/functional/Pair;->mFirst:Ljava/lang/Object;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 28
    :cond_3
    iget-object v2, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mSecond:Ljava/lang/Object;

    if-eqz v2, :cond_4

    iget-object p1, p1, Lcom/usebutton/sdk/internal/functional/Pair;->mSecond:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lcom/usebutton/sdk/internal/functional/Pair;->mSecond:Ljava/lang/Object;

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x0

    :cond_6
    :goto_2
    return v0

    :cond_7
    :goto_3
    return v1
.end method

.method public first()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TFirst;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mFirst:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mFirst:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 34
    iget-object v2, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mSecond:Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public second()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TSecond;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mSecond:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Pair{mFirst=%s, mSecond=%s}"

    const/4 v1, 0x2

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mFirst:Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/usebutton/sdk/internal/functional/Pair;->mSecond:Ljava/lang/Object;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
