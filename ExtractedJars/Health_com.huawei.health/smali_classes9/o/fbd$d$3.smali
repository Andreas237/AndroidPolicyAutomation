.class Lo/fbd$d$3;
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
.field final synthetic a:Lo/fbs;

.field final synthetic c:Lo/fbd$d;


# direct methods
.method constructor <init>(Lo/fbd$d;Lo/fbs;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lo/fbd$d$3;->c:Lo/fbd$d;

    iput-object p2, p0, Lo/fbd$d$3;->a:Lo/fbs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 254
    const/4 v0, -0x1

    return v0
.end method

.method public e(Ljava/util/Map;)V
    .locals 8

    .line 260
    iget-object v0, p0, Lo/fbd$d$3;->c:Lo/fbd$d;

    iget-object v0, v0, Lo/fbd$d;->b:Lo/fbd;

    sget-object v1, Lo/fbh;->d:Lo/fbh;

    .line 261
    invoke-static {}, Lo/fbt;->d()J

    move-result-wide v2

    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v7, Lo/fbd$d$3$3;

    invoke-direct {v7, p0}, Lo/fbd$d$3$3;-><init>(Lo/fbd$d$3;)V

    .line 260
    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Lo/fbd;->e(Lo/fbd;Lo/fbh;JJZLo/fbd$b;)V

    .line 269
    return-void
.end method
