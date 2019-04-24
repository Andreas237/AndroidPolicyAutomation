.class Lcom/shopkick/sdk/zone/query/EqualZoneQuery;
.super Lcom/shopkick/sdk/zone/query/ZoneQuery;
.source "EqualZoneQuery.java"


# instance fields
.field private final attributeName:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final value:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 18
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/query/ZoneQuery;-><init>()V

    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 22
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    iput-object p1, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->attributeName:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->value:Ljava/lang/String;

    .line 27
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%1$s=%2$s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->id:Ljava/lang/String;

    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'value\' can not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'attributeName\' can not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->id:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 46
    instance-of v1, p1, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;

    if-nez v1, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v1, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v0
.end method

.method protected getId()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isValid(Lcom/shopkick/sdk/zone/Zone;)Z
    .locals 1
    .param p1    # Lcom/shopkick/sdk/zone/Zone;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->attributeName:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 40
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;->value:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
