.class final Lo/axv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axv;->b(JLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J


# direct methods
.method constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 404
    iput-wide p1, p0, Lo/axv$3;->c:J

    iput-object p3, p0, Lo/axv$3;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 404
    invoke-virtual {p0, p1}, Lo/axv$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 409
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-wide v1, p0, Lo/axv$3;->c:J

    iget-object v3, p0, Lo/axv$3;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lo/ast;->e(JLjava/lang/String;)Z

    .line 410
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
