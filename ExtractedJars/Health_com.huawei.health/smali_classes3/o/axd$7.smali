.class Lo/axd$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd;->b(JLjava/lang/String;)V
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
.field final synthetic a:J

.field final synthetic b:Lo/axd;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/axd;JLjava/lang/String;)V
    .locals 0

    .line 496
    iput-object p1, p0, Lo/axd$7;->b:Lo/axd;

    iput-wide p2, p0, Lo/axd$7;->a:J

    iput-object p4, p0, Lo/axd$7;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 496
    invoke-virtual {p0, p1}, Lo/axd$7;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 500
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/axd$7;->a:J

    iget-object v3, p0, Lo/axd$7;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->c(JLjava/lang/String;)Z

    move-result v4

    .line 501
    if-eqz v4, :cond_0

    .line 503
    iget-object v0, p0, Lo/axd$7;->b:Lo/axd;

    iget-wide v1, p0, Lo/axd$7;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axd;->b(J)V

    .line 505
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
