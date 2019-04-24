.class public abstract Lcom/shopkick/sdk/zone/query/ZoneQuery;
.super Ljava/lang/Object;
.source "ZoneQuery.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/shopkick/sdk/zone/query/ZoneQuery;",
        ">;"
    }
.end annotation


# static fields
.field public static final ALWAYS_TRUE:Lcom/shopkick/sdk/zone/query/ZoneQuery;

.field private static final AND:Ljava/util/regex/Pattern;

.field private static final COMMA:Ljava/util/regex/Pattern;

.field private static final IN:Ljava/util/regex/Pattern;

.field public static final NEVER_TRUE:Lcom/shopkick/sdk/zone/query/ZoneQuery;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\\s+and\\s*"

    const/4 v1, 0x2

    .line 22
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->AND:Ljava/util/regex/Pattern;

    const-string v0, "in\\s*\\("

    .line 23
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->IN:Ljava/util/regex/Pattern;

    const-string v0, ",\\s*"

    .line 24
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->COMMA:Ljava/util/regex/Pattern;

    .line 27
    new-instance v0, Lcom/shopkick/sdk/zone/query/ZoneQuery$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/zone/query/ZoneQuery$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->ALWAYS_TRUE:Lcom/shopkick/sdk/zone/query/ZoneQuery;

    .line 42
    new-instance v0, Lcom/shopkick/sdk/zone/query/ZoneQuery$2;

    invoke-direct {v0}, Lcom/shopkick/sdk/zone/query/ZoneQuery$2;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->NEVER_TRUE:Lcom/shopkick/sdk/zone/query/ZoneQuery;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parse(Ljava/lang/String;)Lcom/shopkick/sdk/zone/query/ZoneQuery;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 65
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    sget-object p0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->ALWAYS_TRUE:Lcom/shopkick/sdk/zone/query/ZoneQuery;

    return-object p0

    .line 69
    :cond_0
    sget-object v0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->AND:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    .line 70
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v1, v3, :cond_2

    .line 71
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->parse(Ljava/lang/String;)Lcom/shopkick/sdk/zone/query/ZoneQuery;

    move-result-object v3

    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 75
    :cond_1
    new-instance v0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/zone/query/AndZoneQuery;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_2
    const-string v0, "="

    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "="

    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 80
    new-instance v0, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;

    aget-object v1, p0, v2

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    aget-object p0, p0, v3

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/shopkick/sdk/zone/query/EqualZoneQuery;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 83
    :cond_3
    sget-object v0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->IN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p0

    .line 84
    array-length v0, p0

    if-le v0, v3, :cond_5

    .line 85
    aget-object v0, p0, v3

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 86
    sget-object v1, Lcom/shopkick/sdk/zone/query/ZoneQuery;->COMMA:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {v4, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    move v1, v2

    .line 87
    :goto_1
    array-length v3, v0

    if-ge v1, v3, :cond_4

    .line 88
    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 90
    :cond_4
    new-instance v1, Lcom/shopkick/sdk/zone/query/InZoneQuery;

    aget-object p0, p0, v2

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Lcom/shopkick/sdk/zone/query/InZoneQuery;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-object v1

    .line 93
    :cond_5
    sget-object p0, Lcom/shopkick/sdk/zone/query/ZoneQuery;->NEVER_TRUE:Lcom/shopkick/sdk/zone/query/ZoneQuery;

    return-object p0
.end method


# virtual methods
.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method protected abstract getId()Ljava/lang/String;
.end method

.method public abstract hashCode()I
.end method

.method public abstract isValid(Lcom/shopkick/sdk/zone/Zone;)Z
    .param p1    # Lcom/shopkick/sdk/zone/Zone;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
