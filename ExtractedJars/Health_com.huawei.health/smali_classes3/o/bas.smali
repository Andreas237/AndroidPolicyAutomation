.class final Lo/bas;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/bas;


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Lo/bam;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const/4 v0, 0x0

    sput-object v0, Lo/bas;->e:Lo/bas;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bas;->b:Ljava/util/Map;

    return-void
.end method

.method public static declared-synchronized a()Lo/bas;
    .locals 3

    const-class v1, Lo/bas;

    monitor-enter v1

    .line 27
    :try_start_0
    sget-object v0, Lo/bas;->e:Lo/bas;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lo/bas;

    invoke-direct {v0}, Lo/bas;-><init>()V

    sput-object v0, Lo/bas;->e:Lo/bas;

    .line 31
    :cond_0
    sget-object v0, Lo/bas;->e:Lo/bas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .line 90
    iget-object v0, p0, Lo/bas;->b:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/bas;->b:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    :cond_0
    return-void
.end method

.method public b(JLjava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lo/ban;>;)Ljava/util/List<Lo/ban;>;"
        }
    .end annotation

    .line 43
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 45
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_1
    iget-object v0, p0, Lo/bas;->b:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bam;

    .line 48
    if-eqz v2, :cond_4

    .line 50
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ban;

    .line 53
    invoke-virtual {v5}, Lo/ban;->c()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/bam;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_2
    goto :goto_0

    .line 58
    :cond_3
    return-object v3

    .line 62
    :cond_4
    return-object p3
.end method

.method public b(JI)V
    .locals 3

    .line 74
    iget-object v0, p0, Lo/bas;->b:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bam;

    .line 75
    if-nez v2, :cond_0

    .line 77
    new-instance v2, Lo/bam;

    invoke-direct {v2}, Lo/bam;-><init>()V

    .line 79
    :cond_0
    invoke-virtual {v2, p3}, Lo/bam;->b(I)V

    .line 80
    iget-object v0, p0, Lo/bas;->b:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    return-void
.end method
