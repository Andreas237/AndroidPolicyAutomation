.class Lo/arj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arj;->c(JZ)Lo/brd;
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
.field final synthetic a:Z

.field final synthetic b:Lo/arj;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/arj;JZ)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/arj$2;->b:Lo/arj;

    iput-wide p2, p0, Lo/arj$2;->e:J

    iput-boolean p4, p0, Lo/arj$2;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 110
    invoke-virtual {p0, p1}, Lo/arj$2;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 114
    iget-object v0, p0, Lo/arj$2;->b:Lo/arj;

    iget-wide v1, p0, Lo/arj$2;->e:J

    iget-boolean v3, p0, Lo/arj$2;->a:Z

    invoke-virtual {v0, v1, v2, v3}, Lo/arj;->d(JZ)V

    .line 115
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
