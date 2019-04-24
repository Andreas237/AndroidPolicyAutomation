.class public final Lo/fon;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fom;


# static fields
.field private static final c:Lo/fty;


# instance fields
.field private final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<Lo/flz;Lo/fok;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Lo/fon;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fon;->c:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/fon;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 40
    return-void
.end method


# virtual methods
.method public a(Lo/flz;Lo/fok;)Lo/fok;
    .locals 3

    .line 44
    if-nez p1, :cond_0

    .line 45
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "token must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    if-nez p2, :cond_1

    .line 47
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "observation must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_1
    iget-object v0, p0, Lo/fon;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fok;

    .line 50
    if-nez v2, :cond_2

    .line 51
    sget-object v0, Lo/fon;->c:Lo/fty;

    const-string v1, "added observation for token {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 53
    :cond_2
    sget-object v0, Lo/fon;->c:Lo/fty;

    const-string v1, "kept observation for token {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    :goto_0
    return-object v2
.end method

.method public b(Lo/flz;)V
    .locals 2

    .line 91
    if-eqz p1, :cond_0

    .line 92
    iget-object v0, p0, Lo/fon;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lo/fon;->c:Lo/fty;

    const-string v1, "removed observation for token {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    :cond_0
    return-void
.end method

.method public b(Lo/flz;Lo/fow;)V
    .locals 4

    .line 125
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 126
    iget-object v0, p0, Lo/fon;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fok;

    .line 127
    if-eqz v3, :cond_0

    .line 128
    iget-object v0, p0, Lo/fon;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lo/fok;

    invoke-virtual {v3}, Lo/fok;->d()Lo/fma;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Lo/fok;-><init>(Lo/fma;Lo/fow;)V

    invoke-interface {v0, p1, v3, v1}, Ljava/util/concurrent/ConcurrentMap;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    :cond_0
    return-void
.end method

.method public e(Lo/flz;)Lo/fok;
    .locals 3

    .line 78
    if-nez p1, :cond_0

    .line 79
    const/4 v0, 0x0

    return-object v0

    .line 81
    :cond_0
    sget-object v0, Lo/fon;->c:Lo/fty;

    const-string v1, "looking up observation for token {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/fon;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fok;

    .line 85
    invoke-static {v2}, Lo/for;->c(Lo/fok;)Lo/fok;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/flz;Lo/fok;)Lo/fok;
    .locals 3

    .line 61
    if-nez p1, :cond_0

    .line 62
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "token must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_0
    if-nez p2, :cond_1

    .line 64
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "observation must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_1
    iget-object v0, p0, Lo/fon;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fok;

    .line 67
    if-nez v2, :cond_2

    .line 68
    sget-object v0, Lo/fon;->c:Lo/fty;

    const-string v1, "added observation for token {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 70
    :cond_2
    sget-object v0, Lo/fon;->c:Lo/fty;

    const-string v1, "replaced observation for token {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    :goto_0
    return-object v2
.end method
