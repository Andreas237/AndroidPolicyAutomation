.class public abstract Lo/fnl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fod;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fnl$e;
    }
.end annotation


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private b:Lo/fod;

.field private c:Lo/fod;

.field protected d:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Lo/fnl;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnl;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-static {}, Lo/fnl$e;->b()Lo/fnl$e;

    move-result-object v0

    iput-object v0, p0, Lo/fnl;->b:Lo/fod;

    .line 59
    invoke-static {}, Lo/fnl$e;->b()Lo/fnl$e;

    move-result-object v0

    iput-object v0, p0, Lo/fnl;->c:Lo/fod;

    .line 171
    return-void
.end method

.method static synthetic a()Lo/fty;
    .locals 1

    .line 50
    sget-object v0, Lo/fnl;->a:Lo/fty;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/fnl;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 137
    return-void
.end method

.method public a(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 71
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 72
    return-void
.end method

.method public a(Lo/fmb;Lo/fma;)V
    .locals 1

    .line 81
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fma;)V

    .line 82
    return-void
.end method

.method final b()Lo/fod;
    .locals 1

    .line 111
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    return-object v0
.end method

.method public final b(Lo/fod;)V
    .locals 2

    .line 96
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    if-eq v0, p1, :cond_1

    .line 97
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fod;->c(Lo/fod;)V

    .line 100
    :cond_0
    iput-object p1, p0, Lo/fnl;->c:Lo/fod;

    .line 101
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    invoke-interface {v0, p0}, Lo/fod;->c(Lo/fod;)V

    .line 103
    :cond_1
    return-void
.end method

.method final c()Lo/fod;
    .locals 1

    .line 131
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    return-object v0
.end method

.method public c(Lo/fmb;Lo/flo;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    invoke-interface {v0, p1, p2}, Lo/fod;->c(Lo/fmb;Lo/flo;)V

    .line 77
    return-void
.end method

.method public final c(Lo/fod;)V
    .locals 2

    .line 116
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    if-eq v0, p1, :cond_1

    .line 117
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fod;->b(Lo/fod;)V

    .line 120
    :cond_0
    iput-object p1, p0, Lo/fnl;->b:Lo/fod;

    .line 121
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    invoke-interface {v0, p0}, Lo/fod;->b(Lo/fod;)V

    .line 123
    :cond_1
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/flo;)V

    .line 92
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 86
    iget-object v0, p0, Lo/fnl;->b:Lo/fod;

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 87
    return-void
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 1

    .line 66
    iget-object v0, p0, Lo/fnl;->c:Lo/fod;

    invoke-interface {v0, p1, p2}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 67
    return-void
.end method
