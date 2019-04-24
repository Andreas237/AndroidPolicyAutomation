.class final Lo/axd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd;->a(Ljava/lang/String;JLjava/lang/String;)Lo/brd;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lo/axd$2;->a:Ljava/lang/String;

    iput-wide p2, p0, Lo/axd$2;->c:J

    iput-object p4, p0, Lo/axd$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 351
    invoke-virtual {p0, p1}, Lo/axd$2;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 355
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-object v1, p0, Lo/axd$2;->a:Ljava/lang/String;

    iget-wide v2, p0, Lo/axd$2;->c:J

    iget-object v4, p0, Lo/axd$2;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/axi;->d(Ljava/lang/String;JLjava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
