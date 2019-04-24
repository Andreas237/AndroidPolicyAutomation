.class public Lo/fur;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fty;


# instance fields
.field private a:Ljava/lang/reflect/Method;

.field private b:Ljava/lang/Boolean;

.field private volatile c:Lo/fty;

.field private d:Lo/fug;

.field private final e:Ljava/lang/String;

.field private h:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lo/fuk;>;"
        }
    .end annotation
.end field

.field private final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Queue;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Queue<Lo/fuk;>;Z)V"
        }
    .end annotation

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lo/fur;->e:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lo/fur;->h:Ljava/util/Queue;

    .line 61
    iput-boolean p3, p0, Lo/fur;->i:Z

    .line 62
    return-void
.end method

.method private k()Lo/fty;
    .locals 2

    .line 344
    iget-object v0, p0, Lo/fur;->d:Lo/fug;

    if-nez v0, :cond_0

    .line 345
    new-instance v0, Lo/fug;

    iget-object v1, p0, Lo/fur;->h:Ljava/util/Queue;

    invoke-direct {v0, p0, v1}, Lo/fug;-><init>(Lo/fur;Ljava/util/Queue;)V

    iput-object v0, p0, Lo/fur;->d:Lo/fug;

    .line 347
    :cond_0
    iget-object v0, p0, Lo/fur;->d:Lo/fug;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/fur;->e:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 121
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 122
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 269
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 270
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 177
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 233
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 234
    return-void
.end method

.method public varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 133
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void
.end method

.method public a(Lo/fty;)V
    .locals 0

    .line 355
    iput-object p1, p0, Lo/fur;->c:Lo/fty;

    .line 356
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 217
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fty;->b(Ljava/lang/String;)V

    .line 218
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 125
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 129
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 89
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    return-void
.end method

.method public varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 85
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-void
.end method

.method public b()Z
    .locals 1

    .line 69
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 73
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fty;->c(Ljava/lang/String;)V

    .line 74
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 173
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 174
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 281
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 282
    return-void
.end method

.method public varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 181
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void
.end method

.method public c(Lo/fuf;)V
    .locals 5

    .line 372
    invoke-virtual {p0}, Lo/fur;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 374
    :try_start_0
    iget-object v0, p0, Lo/fur;->a:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lo/fur;->c:Lo/fty;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    .line 378
    goto :goto_0

    .line 375
    :catch_0
    move-exception v4

    .line 378
    goto :goto_0

    .line 376
    :catch_1
    move-exception v4

    .line 378
    goto :goto_0

    .line 377
    :catch_2
    move-exception v4

    .line 380
    :cond_0
    :goto_0
    return-void
.end method

.method public c()Z
    .locals 1

    .line 117
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 265
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 266
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 77
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 81
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 137
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    return-void
.end method

.method public d()Z
    .locals 1

    .line 165
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0}, Lo/fty;->d()Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 169
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fty;->e(Ljava/lang/String;)V

    .line 170
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 221
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 273
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    return-void
.end method

.method public varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 229
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    return-void
.end method

.method public e()Z
    .locals 1

    .line 213
    invoke-virtual {p0}, Lo/fur;->f()Lo/fty;

    move-result-object v0

    invoke-interface {v0}, Lo/fty;->e()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 310
    if-ne p0, p1, :cond_0

    .line 311
    const/4 v0, 0x1

    return v0

    .line 312
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 313
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 315
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fur;

    .line 317
    iget-object v0, p0, Lo/fur;->e:Ljava/lang/String;

    iget-object v1, v2, Lo/fur;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 318
    const/4 v0, 0x0

    return v0

    .line 320
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method f()Lo/fty;
    .locals 1

    .line 333
    iget-object v0, p0, Lo/fur;->c:Lo/fty;

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lo/fur;->c:Lo/fty;

    return-object v0

    .line 336
    :cond_0
    iget-boolean v0, p0, Lo/fur;->i:Z

    if-eqz v0, :cond_1

    .line 337
    sget-object v0, Lo/fum;->c:Lo/fum;

    return-object v0

    .line 339
    :cond_1
    invoke-direct {p0}, Lo/fur;->k()Lo/fty;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 6

    .line 359
    iget-object v0, p0, Lo/fur;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 360
    iget-object v0, p0, Lo/fur;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 363
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/fur;->c:Lo/fty;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "log"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Lo/fuf;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lo/fur;->a:Ljava/lang/reflect/Method;

    .line 364
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lo/fur;->b:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    goto :goto_0

    .line 365
    :catch_0
    move-exception v5

    .line 366
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lo/fur;->b:Ljava/lang/Boolean;

    .line 368
    :goto_0
    iget-object v0, p0, Lo/fur;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    .line 384
    iget-object v0, p0, Lo/fur;->c:Lo/fty;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 325
    iget-object v0, p0, Lo/fur;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    .line 388
    iget-object v0, p0, Lo/fur;->c:Lo/fty;

    instance-of v0, v0, Lo/fum;

    return v0
.end method
