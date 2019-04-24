.class Lo/exv$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exv;->e(JJILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic d:Lo/exv;


# direct methods
.method constructor <init>(Lo/exv;Lo/egg;)V
    .locals 0

    .line 1504
    iput-object p1, p0, Lo/exv$2;->d:Lo/exv;

    iput-object p2, p0, Lo/exv$2;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 1509
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1510
    if-nez p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1511
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 1513
    iget-object v0, p0, Lo/exv$2;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1514
    iget-object v0, p0, Lo/exv$2;->a:Lo/egg;

    invoke-interface {v0, p1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 1517
    :cond_0
    iget-object v0, p0, Lo/exv$2;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1518
    iget-object v0, p0, Lo/exv$2;->a:Lo/egg;

    invoke-interface {v0, p1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1521
    :cond_1
    :goto_0
    return-void
.end method
