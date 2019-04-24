.class public Lo/zf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/yz;


# direct methods
.method public constructor <init>(Lo/yz;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lo/zf;->b:Lo/yz;

    .line 38
    return-void
.end method

.method private b(Ljava/lang/String;Lo/za;)Lo/zd;
    .locals 2

    .line 128
    invoke-virtual {p2}, Lo/za;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/zf;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 129
    new-instance v0, Lo/zd;

    invoke-direct {v0, v1, p2}, Lo/zd;-><init>(Ljava/util/List;Lo/za;)V

    return-object v0
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;>;>;"
        }
    .end annotation

    .line 142
    new-instance v1, Ljava/util/ArrayList;

    const/16 v0, 0x10

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    iget-object v0, p0, Lo/zf;->b:Lo/yz;

    invoke-virtual {v0, p1}, Lo/yz;->e(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 145
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 147
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    :cond_0
    return-object v1
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lo/yu;
    .locals 2

    .line 49
    iget-object v0, p0, Lo/zf;->b:Lo/yz;

    if-nez v0, :cond_0

    .line 51
    const-string v0, "getApplication applicationMgr is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->a(Ljava/lang/String;Z)V

    .line 52
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_0
    iget-object v0, p0, Lo/zf;->b:Lo/yz;

    invoke-virtual {v0, p1}, Lo/yz;->c(Ljava/lang/String;)Lo/yu;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Long;
    .locals 3

    .line 84
    invoke-virtual {p0, p1}, Lo/zf;->b(Ljava/lang/String;)Lo/yu;

    move-result-object v2

    .line 85
    if-nez v2, :cond_0

    .line 87
    const-string v0, "getCacheControl application is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->a(Ljava/lang/String;Z)V

    .line 88
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 90
    :cond_0
    invoke-virtual {v2}, Lo/yu;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 66
    invoke-virtual {p0, p1}, Lo/zf;->b(Ljava/lang/String;)Lo/yu;

    move-result-object v2

    .line 67
    if-nez v2, :cond_0

    .line 69
    const-string v0, "getApplicationServiceList application is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 70
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    invoke-virtual {v2}, Lo/yu;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lo/zd;
    .locals 3

    .line 104
    iget-object v0, p0, Lo/zf;->b:Lo/yz;

    invoke-virtual {v0, p1, p2}, Lo/yz;->b(Ljava/lang/String;Ljava/lang/String;)Lo/za;

    move-result-object v2

    .line 106
    if-eqz v2, :cond_0

    .line 108
    const-string v0, "getApplicationServiceInfo service is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 109
    invoke-direct {p0, p1, v2}, Lo/zf;->b(Ljava/lang/String;Lo/za;)Lo/zd;

    move-result-object v0

    return-object v0

    .line 113
    :cond_0
    const-string v0, "getApplicationServiceInfo is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 115
    const/4 v0, 0x0

    return-object v0
.end method
