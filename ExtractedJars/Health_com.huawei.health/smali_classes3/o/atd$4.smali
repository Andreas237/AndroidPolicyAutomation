.class Lo/atd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atd;->d(II)Lo/brd;
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

.field final synthetic d:Lo/atd;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/atd;II)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/atd$4;->d:Lo/atd;

    iput p2, p0, Lo/atd$4;->a:I

    iput p3, p0, Lo/atd$4;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 146
    invoke-virtual {p0, p1}, Lo/atd$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 150
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 155
    :cond_0
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v2

    .line 156
    iget v0, p0, Lo/atd$4;->a:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v3

    .line 158
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 163
    :cond_1
    iget-object v0, p0, Lo/atd$4;->d:Lo/atd;

    iget v1, p0, Lo/atd$4;->e:I

    invoke-static {v0, v3, v1}, Lo/atd;->d(Lo/atd;Ljava/util/ArrayList;I)V

    .line 164
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
