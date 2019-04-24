.class Lo/atd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atd;->i(II)Lo/brd;
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
.field final synthetic a:I

.field final synthetic c:Lo/atd;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/atd;II)V
    .locals 0

    .line 172
    iput-object p1, p0, Lo/atd$1;->c:Lo/atd;

    iput p2, p0, Lo/atd$1;->a:I

    iput p3, p0, Lo/atd$1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 172
    invoke-virtual {p0, p1}, Lo/atd$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 176
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 181
    :cond_0
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v2

    .line 182
    iget v0, p0, Lo/atd$1;->a:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lo/atc;->d(IZ)Ljava/util/ArrayList;

    move-result-object v3

    .line 184
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 189
    :cond_1
    iget-object v0, p0, Lo/atd$1;->c:Lo/atd;

    iget v1, p0, Lo/atd$1;->d:I

    invoke-static {v0, v3, v1}, Lo/atd;->d(Lo/atd;Ljava/util/ArrayList;I)V

    .line 190
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
