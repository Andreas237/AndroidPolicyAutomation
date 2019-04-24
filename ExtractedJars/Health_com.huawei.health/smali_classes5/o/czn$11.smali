.class Lo/czn$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czn;->b(DDLo/cyx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/czn;

.field final synthetic b:D

.field final synthetic d:Lo/cyx;

.field final synthetic e:D


# direct methods
.method constructor <init>(Lo/czn;DDLo/cyx;)V
    .locals 0

    .line 4387
    iput-object p1, p0, Lo/czn$11;->a:Lo/czn;

    iput-wide p2, p0, Lo/czn$11;->b:D

    iput-wide p4, p0, Lo/czn$11;->e:D

    iput-object p6, p0, Lo/czn$11;->d:Lo/cyx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 4390
    iget-object v0, p0, Lo/czn$11;->a:Lo/czn;

    iget-wide v1, p0, Lo/czn$11;->b:D

    iget-wide v3, p0, Lo/czn$11;->e:D

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/czn;->b(DD)Lo/czo;

    move-result-object v5

    .line 4392
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Lo/czo;->a()I

    move-result v0

    const/16 v1, -0x63

    if-eq v0, v1, :cond_0

    invoke-virtual {v5}, Lo/czo;->h()I

    move-result v0

    const/16 v1, -0x63

    if-eq v0, v1, :cond_0

    invoke-virtual {v5}, Lo/czo;->i()I

    move-result v0

    const/16 v1, -0x63

    if-eq v0, v1, :cond_0

    .line 4393
    iget-object v0, p0, Lo/czn$11;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v5, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    goto :goto_0

    .line 4395
    :cond_0
    iget-object v0, p0, Lo/czn$11;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 4397
    :goto_0
    return-void
.end method
