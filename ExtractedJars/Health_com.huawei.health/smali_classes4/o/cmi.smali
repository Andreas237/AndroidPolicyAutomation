.class public Lo/cmi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[[Ljava/lang/Object;

.field private static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/cmi;->e:Ljava/util/Map;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/cmi;->c:Ljava/util/Map;

    .line 51
    const/4 v0, 0x3

    new-array v0, v0, [[Ljava/lang/Object;

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    .line 52
    const v2, 0x11171

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_1

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    .line 53
    const v2, 0x11172

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    .line 54
    const v2, 0x11173

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/cmi;->b:[[Ljava/lang/Object;

    .line 58
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    const v1, 0x11171

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    const v1, 0x11172

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    const v1, 0x11173

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lo/cmi;->c:Ljava/util/Map;

    const v1, 0x13881

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Lo/cmi;->c:Ljava/util/Map;

    const v1, 0x13882

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    return-void

    nop

    :array_0
    .array-data 4
        0x13881
    .end array-data

    :array_1
    .array-data 4
        0x2
    .end array-data

    :array_2
    .array-data 4
        0x13882
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 6

    .line 101
    sget-object v0, Lo/cmi;->c:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 102
    sget-object v0, Lo/cmi;->b:[[Ljava/lang/Object;

    aget-object v0, v0, v2

    const/4 v1, 0x5

    aget-object v0, v0, v1

    check-cast v0, [I

    move-object v3, v0

    check-cast v3, [I

    .line 103
    sget-object v0, Lo/cmi;->b:[[Ljava/lang/Object;

    aget-object v0, v0, v2

    const/4 v1, 0x6

    aget-object v0, v0, v1

    check-cast v0, [I

    move-object v4, v0

    check-cast v4, [I

    .line 104
    const/4 v5, 0x0

    :goto_0
    array-length v0, v3

    if-ge v5, v0, :cond_1

    .line 105
    aget v0, v3, v5

    if-ne p0, v0, :cond_0

    .line 106
    aget v0, v4, v5

    return v0

    .line 104
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 109
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public static b(I)Z
    .locals 2

    .line 94
    sget-object v0, Lo/cmi;->c:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static c(II)Ljava/lang/Object;
    .locals 1

    .line 113
    sget-object v0, Lo/cmi;->b:[[Ljava/lang/Object;

    aget-object v0, v0, p0

    aget-object v0, v0, p1

    return-object v0
.end method

.method public static c(I)Z
    .locals 4

    .line 70
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    const/4 v0, 0x0

    return v0

    .line 73
    :cond_0
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 74
    sget-object v0, Lo/cmi;->b:[[Ljava/lang/Object;

    aget-object v0, v0, v2

    const/16 v1, 0x8

    aget-object v0, v0, v1

    move-object v3, v0

    check-cast v3, Ljava/lang/Boolean;

    .line 75
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 76
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static d(I)[Ljava/lang/Object;
    .locals 1

    .line 117
    sget-object v0, Lo/cmi;->b:[[Ljava/lang/Object;

    aget-object v0, v0, p0

    return-object v0
.end method

.method public static e(I)[I
    .locals 4

    .line 82
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    const/4 v0, 0x0

    return-object v0

    .line 85
    :cond_0
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 86
    sget-object v0, Lo/cmi;->b:[[Ljava/lang/Object;

    aget-object v0, v0, v2

    const/4 v1, 0x5

    aget-object v0, v0, v1

    check-cast v0, [I

    move-object v3, v0

    check-cast v3, [I

    .line 87
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 88
    const/4 v0, 0x0

    return-object v0

    .line 90
    :cond_1
    return-object v3
.end method

.method public static f(I)Z
    .locals 2

    .line 133
    sget-object v0, Lo/cmi;->c:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static h(I)Z
    .locals 2

    .line 125
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static i(I)Ljava/lang/Integer;
    .locals 2

    .line 121
    sget-object v0, Lo/cmi;->e:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public static k(I)Ljava/lang/Integer;
    .locals 2

    .line 129
    sget-object v0, Lo/cmi;->c:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method
