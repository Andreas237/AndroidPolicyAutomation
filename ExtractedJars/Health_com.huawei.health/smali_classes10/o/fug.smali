.class public Lo/fug;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fty;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lo/fuk;>;"
        }
    .end annotation
.end field

.field d:Lo/fur;


# direct methods
.method public constructor <init>(Lo/fur;Ljava/util/Queue;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fur;Ljava/util/Queue<Lo/fuk;>;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lo/fug;->d:Lo/fur;

    .line 17
    invoke-virtual {p1}, Lo/fur;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fug;->b:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lo/fug;->c:Ljava/util/Queue;

    .line 19
    return-void
.end method

.method private e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 6

    .line 26
    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fug;->e(Lo/fue;Lo/fuh;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 27
    return-void
.end method

.method private e(Lo/fue;Lo/fuh;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    .line 31
    new-instance v2, Lo/fuk;

    invoke-direct {v2}, Lo/fuk;-><init>()V

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/fuk;->e(J)V

    .line 33
    invoke-virtual {v2, p1}, Lo/fuk;->d(Lo/fue;)V

    .line 34
    iget-object v0, p0, Lo/fug;->d:Lo/fur;

    invoke-virtual {v2, v0}, Lo/fuk;->c(Lo/fur;)V

    .line 35
    iget-object v0, p0, Lo/fug;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lo/fuk;->e(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v2, p2}, Lo/fuk;->e(Lo/fuh;)V

    .line 37
    invoke-virtual {v2, p3}, Lo/fuk;->b(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v2, p4}, Lo/fuk;->d([Ljava/lang/Object;)V

    .line 39
    invoke-virtual {v2, p5}, Lo/fuk;->c(Ljava/lang/Throwable;)V

    .line 40
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fuk;->a(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lo/fug;->c:Ljava/util/Queue;

    invoke-interface {v0, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 42
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 99
    sget-object v0, Lo/fue;->d:Lo/fue;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 100
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 252
    sget-object v0, Lo/fue;->c:Lo/fue;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 254
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 157
    sget-object v0, Lo/fue;->e:Lo/fue;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 158
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 215
    sget-object v0, Lo/fue;->a:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 216
    return-void
.end method

.method public varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 113
    sget-object v0, Lo/fue;->b:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 114
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 198
    sget-object v0, Lo/fue;->a:Lo/fue;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 199
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 103
    sget-object v0, Lo/fue;->b:Lo/fue;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 105
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 108
    sget-object v0, Lo/fue;->b:Lo/fue;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 110
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 65
    sget-object v0, Lo/fue;->d:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 66
    return-void
.end method

.method public varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 61
    sget-object v0, Lo/fue;->d:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 62
    return-void
.end method

.method public b()Z
    .locals 1

    .line 45
    const/4 v0, 0x1

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 49
    sget-object v0, Lo/fue;->d:Lo/fue;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 50
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 153
    sget-object v0, Lo/fue;->e:Lo/fue;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 154
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 267
    sget-object v0, Lo/fue;->c:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 268
    return-void
.end method

.method public varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 161
    sget-object v0, Lo/fue;->e:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 162
    return-void
.end method

.method public c()Z
    .locals 1

    .line 95
    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    .line 248
    sget-object v0, Lo/fue;->c:Lo/fue;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 249
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 53
    sget-object v0, Lo/fue;->d:Lo/fue;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 54
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 57
    sget-object v0, Lo/fue;->d:Lo/fue;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 58
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 117
    sget-object v0, Lo/fue;->b:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 118
    return-void
.end method

.method public d()Z
    .locals 1

    .line 145
    const/4 v0, 0x1

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 3

    .line 149
    sget-object v0, Lo/fue;->e:Lo/fue;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 150
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 202
    sget-object v0, Lo/fue;->a:Lo/fue;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 204
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 257
    sget-object v0, Lo/fue;->c:Lo/fue;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 259
    return-void
.end method

.method public varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 211
    sget-object v0, Lo/fue;->a:Lo/fue;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lo/fug;->e(Lo/fue;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 212
    return-void
.end method

.method public e()Z
    .locals 1

    .line 194
    const/4 v0, 0x1

    return v0
.end method
