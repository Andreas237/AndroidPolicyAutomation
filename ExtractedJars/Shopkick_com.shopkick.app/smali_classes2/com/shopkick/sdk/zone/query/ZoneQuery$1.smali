.class final Lcom/shopkick/sdk/zone/query/ZoneQuery$1;
.super Lcom/shopkick/sdk/zone/query/ZoneQuery;
.source "ZoneQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/query/ZoneQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/query/ZoneQuery;-><init>()V

    const-string/jumbo v0, "true"

    .line 28
    iput-object v0, p0, Lcom/shopkick/sdk/zone/query/ZoneQuery$1;->id:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I
    .locals 1

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string/jumbo v0, "true"

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 27
    check-cast p1, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/query/ZoneQuery$1;->compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 34
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/query/ZoneQuery$1;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected getId()Ljava/lang/String;
    .locals 1

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string/jumbo v0, "true"

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string/jumbo v0, "true"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isValid(Lcom/shopkick/sdk/zone/Zone;)Z
    .locals 0
    .param p1    # Lcom/shopkick/sdk/zone/Zone;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method
