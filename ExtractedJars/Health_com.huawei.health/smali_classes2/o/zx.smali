.class public Lo/zx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Lo/zd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 180
    new-instance v0, Lo/zx$5;

    invoke-direct {v0}, Lo/zx$5;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lo/zx;->d:Ljava/util/Set;

    .line 188
    return-void
.end method

.method public constructor <init>(Lo/zd;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lo/zx;->e:Lo/zd;

    .line 62
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 160
    const-string v2, ""

    .line 161
    const-string v0, ">"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 163
    const-string v0, ">"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 164
    const/4 v4, 0x0

    goto :goto_0

    .line 166
    :cond_0
    sget-object v0, Lo/zx;->d:Ljava/util/Set;

    aget-object v1, v3, v4

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    aget-object v0, v3, v4

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 169
    aget-object v2, v3, v4

    .line 170
    goto :goto_1

    .line 164
    :cond_1
    add-int/lit8 v4, v4, 0x1

    :goto_0
    array-length v0, v3

    if-lt v4, v0, :cond_0

    .line 174
    :cond_2
    :goto_1
    return-object v2
.end method


# virtual methods
.method public a(Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lo/zx;->e:Lo/zd;

    if-nez v0, :cond_0

    .line 108
    const-string v0, "getRouteContryGroup serviceInfo null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 109
    const-string v0, ""

    return-object v0

    .line 111
    :cond_0
    const/4 v2, 0x0

    .line 113
    iget-object v0, p0, Lo/zx;->e:Lo/zd;

    invoke-virtual {v0}, Lo/zd;->a()Ljava/lang/String;

    move-result-object v3

    .line 115
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ">"

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 117
    invoke-direct {p0, v3, p1}, Lo/zx;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    .line 120
    :cond_1
    const-string v0, "reg_country"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 122
    new-instance v2, Lo/zw;

    invoke-direct {v2}, Lo/zw;-><init>()V

    .line 123
    goto :goto_0

    .line 124
    :cond_2
    const-string v0, "ser_country"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    new-instance v2, Lo/zu;

    invoke-direct {v2}, Lo/zu;-><init>()V

    .line 127
    goto :goto_0

    .line 128
    :cond_3
    const-string v0, "issue_country"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 130
    new-instance v2, Lo/zr;

    invoke-direct {v2}, Lo/zr;-><init>()V

    .line 131
    goto :goto_0

    .line 135
    :cond_4
    const-string v0, "getRouteContryGroup router is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->a(Ljava/lang/String;Z)V

    .line 136
    const/4 v0, 0x0

    return-object v0

    .line 139
    :goto_0
    invoke-interface {v2, p1}, Lo/zv;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    .line 140
    if-nez v4, :cond_5

    .line 143
    const-string v0, "getRouteContryGroup servingCountryGroup is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->a(Ljava/lang/String;Z)V

    .line 144
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_5
    return-object v4
.end method

.method public d(Ljava/util/Map;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 73
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 74
    iget-object v0, p0, Lo/zx;->e:Lo/zd;

    if-nez v0, :cond_0

    .line 75
    const-string v0, "serviceInfo null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 76
    return-object v2

    .line 78
    :cond_0
    const-string v0, "no_route"

    iget-object v1, p0, Lo/zx;->e:Lo/zd;

    invoke-virtual {v1}, Lo/zd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    const-string v0, "getAddress(Map<String, String> params) NO_ROUTE_POLICY."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 81
    iget-object v0, p0, Lo/zx;->e:Lo/zd;

    invoke-virtual {v0}, Lo/zd;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 84
    :cond_1
    invoke-virtual {p0, p1}, Lo/zx;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    .line 86
    iget-object v0, p0, Lo/zx;->e:Lo/zd;

    invoke-virtual {v0, v3}, Lo/zd;->e(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 89
    if-nez v4, :cond_2

    .line 92
    const-string v0, "getAddress addresses is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 94
    :cond_2
    return-object v4
.end method
