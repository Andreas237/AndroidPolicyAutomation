.class Lo/avv$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/avv$5;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/avv$5;


# direct methods
.method constructor <init>(Lo/avv$5;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/avv$5$2;->b:Lo/avv$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 60
    invoke-virtual {p0, p1}, Lo/avv$5$2;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 65
    const/4 v0, 0x2

    new-array v6, v0, [J

    .line 66
    iget-object v0, p0, Lo/avv$5$2;->b:Lo/avv$5;

    iget-object v0, v0, Lo/avv$5;->a:Ljava/lang/String;

    invoke-static {v0, v6}, Lo/avv;->c(Ljava/lang/String;[J)I

    move-result v7

    .line 67
    iget-object v0, p0, Lo/avv$5$2;->b:Lo/avv$5;

    iget-object v0, v0, Lo/avv$5;->e:Lo/avv$e;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lo/avv$5$2;->b:Lo/avv$5;

    iget-object v0, v0, Lo/avv$5;->e:Lo/avv$e;

    move v1, v7

    const/4 v2, 0x0

    aget-wide v2, v6, v2

    const/4 v4, 0x1

    aget-wide v4, v6, v4

    invoke-interface/range {v0 .. v5}, Lo/avv$e;->a(IJJ)V

    .line 71
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
