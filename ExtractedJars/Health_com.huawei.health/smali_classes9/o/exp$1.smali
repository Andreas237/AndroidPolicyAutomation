.class Lo/exp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->d(JJLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic b:Lo/exn$d;

.field final synthetic d:Lo/exp;


# direct methods
.method constructor <init>(Lo/exp;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 2473
    iput-object p1, p0, Lo/exp$1;->d:Lo/exp;

    iput-object p2, p0, Lo/exp$1;->b:Lo/exn$d;

    iput-object p3, p0, Lo/exp$1;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 2476
    sget-object v0, Lo/exp$9;->a:[I

    iget-object v1, p0, Lo/exp$1;->b:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 2478
    :sswitch_0
    iget-object v0, p0, Lo/exp$1;->d:Lo/exp;

    iget-object v1, p0, Lo/exp$1;->a:Lo/egg;

    invoke-static {v0, p1, p2, v1}, Lo/exp;->d(Lo/exp;ILjava/lang/Object;Lo/egg;)V

    .line 2479
    goto :goto_1

    .line 2481
    :goto_0
    iget-object v0, p0, Lo/exp$1;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2482
    iget-object v0, p0, Lo/exp$1;->a:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 2486
    :cond_0
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
