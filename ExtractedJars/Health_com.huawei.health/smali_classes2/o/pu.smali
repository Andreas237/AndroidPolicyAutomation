.class public final Lo/pu;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method

.method private static b(Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Ljava/lang/String;>;Ljava/util/Collection<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 92
    const/16 v0, 0x3b

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 93
    if-gez v1, :cond_0

    .line 94
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 95
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 97
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 100
    const-string v0, "via="

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 103
    :cond_1
    const/4 v3, 0x0

    .line 105
    :goto_0
    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    :goto_1
    return-void
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 41
    invoke-virtual {p0, p1}, Lo/pu;->e(Lo/or;)Lo/pv;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/or;)Lo/pv;
    .locals 15

    .line 45
    invoke-static/range {p1 .. p1}, Lo/pu;->i(Lo/or;)Ljava/lang/String;

    move-result-object v3

    .line 46
    const-string v0, "sms:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "SMS:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mms:"

    .line 47
    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MMS:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    invoke-static {v3}, Lo/pu;->e(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 57
    const-string v0, "subject"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 58
    const-string v0, "body"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 59
    const/4 v7, 0x1

    .line 63
    :cond_1
    const/16 v0, 0x3f

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v8

    .line 66
    if-ltz v8, :cond_2

    if-nez v7, :cond_3

    .line 67
    :cond_2
    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 69
    :cond_3
    const/4 v0, 0x4

    invoke-virtual {v3, v0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 72
    :goto_0
    const/4 v10, -0x1

    .line 74
    new-instance v12, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v13, v0

    .line 76
    :goto_1
    add-int/lit8 v0, v10, 0x1

    const/16 v1, 0x2c

    invoke-virtual {v9, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    move v11, v0

    if-le v0, v10, :cond_4

    .line 77
    add-int/lit8 v0, v10, 0x1

    invoke-virtual {v9, v0, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 78
    invoke-static {v12, v13, v14}, Lo/pu;->b(Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/String;)V

    .line 79
    move v10, v11

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    add-int/lit8 v0, v10, 0x1

    invoke-virtual {v9, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v13, v0}, Lo/pu;->b(Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/String;)V

    .line 83
    new-instance v0, Lo/pv;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v12, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 84
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v13, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    invoke-direct {v0, v1, v2, v5, v6}, Lo/pv;-><init>([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
