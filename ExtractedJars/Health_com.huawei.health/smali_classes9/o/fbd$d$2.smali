.class Lo/fbd$d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbs$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbd$d;->d(Lo/fbd$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fbd$d;

.field final synthetic e:Lo/fbs;


# direct methods
.method constructor <init>(Lo/fbd$d;Lo/fbs;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lo/fbd$d$2;->c:Lo/fbd$d;

    iput-object p2, p0, Lo/fbd$d$2;->e:Lo/fbs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 275
    const/4 v0, -0x1

    return v0
.end method

.method public e(Ljava/util/Map;)V
    .locals 9

    .line 280
    iget-object v0, p0, Lo/fbd$d$2;->c:Lo/fbd$d;

    invoke-static {v0}, Lo/fbd$d;->a(Lo/fbd$d;)Lo/fbp;

    move-result-object v8

    .line 281
    if-nez v8, :cond_0

    .line 282
    iget-object v0, p0, Lo/fbd$d$2;->e:Lo/fbs;

    invoke-virtual {v0}, Lo/fbs;->a()V

    .line 283
    return-void

    .line 285
    :cond_0
    iget-object v0, p0, Lo/fbd$d$2;->c:Lo/fbd$d;

    iget-object v0, v0, Lo/fbd$d;->b:Lo/fbd;

    sget-object v1, Lo/fbh;->b:Lo/fbh;

    .line 286
    invoke-interface {v8}, Lo/fbp;->d()J

    move-result-wide v2

    .line 287
    invoke-interface {v8}, Lo/fbp;->b()J

    move-result-wide v4

    new-instance v7, Lo/fbd$d$2$3;

    invoke-direct {v7, p0}, Lo/fbd$d$2$3;-><init>(Lo/fbd$d$2;)V

    .line 285
    const/4 v6, 0x1

    invoke-static/range {v0 .. v7}, Lo/fbd;->e(Lo/fbd;Lo/fbh;JJZLo/fbd$b;)V

    .line 294
    return-void
.end method
