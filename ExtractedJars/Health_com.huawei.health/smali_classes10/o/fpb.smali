.class public Lo/fpb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/foz;


# instance fields
.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lo/fpb;->e:Ljava/lang/String;

    .line 54
    invoke-static {p2}, Lo/fpb;->e([Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lo/fpb;->b:Ljava/util/Set;

    .line 55
    return-void
.end method

.method public static varargs e([Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 89
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final e(Lo/fow;Lo/fow;)Z
    .locals 2

    .line 76
    invoke-interface {p1}, Lo/fow;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    const/4 v0, 0x1

    return v0

    .line 79
    :cond_0
    invoke-virtual {p0}, Lo/fpb;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/fpb;->b:Ljava/util/Set;

    invoke-static {v0, v1, p1, p2}, Lo/fpc;->a(Ljava/lang/String;Ljava/util/Set;Lo/fow;Lo/fow;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public c(Lo/fow;Lo/fow;)Z
    .locals 1

    .line 64
    invoke-direct {p0, p1, p2}, Lo/fpb;->e(Lo/fow;Lo/fow;)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/fpb;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(Lo/fow;Lo/fow;)Z
    .locals 1

    .line 69
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 70
    invoke-interface {p1}, Lo/fow;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 72
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/fpb;->e(Lo/fow;Lo/fow;)Z

    move-result v0

    return v0
.end method
