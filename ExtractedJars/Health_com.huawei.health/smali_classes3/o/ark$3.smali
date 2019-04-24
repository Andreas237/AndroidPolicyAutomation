.class Lo/ark$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ark;->c(JI)V
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

.field final synthetic c:Lo/ark;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/ark;JI)V
    .locals 0

    .line 236
    iput-object p1, p0, Lo/ark$3;->c:Lo/ark;

    iput-wide p2, p0, Lo/ark$3;->a:J

    iput p4, p0, Lo/ark$3;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 236
    invoke-virtual {p0, p1}, Lo/ark$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 241
    iget-object v0, p0, Lo/ark$3;->c:Lo/ark;

    iget-wide v1, p0, Lo/ark$3;->a:J

    iget v3, p0, Lo/ark$3;->d:I

    invoke-static {v0, v1, v2, v3}, Lo/ark;->c(Lo/ark;JI)V

    .line 242
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
