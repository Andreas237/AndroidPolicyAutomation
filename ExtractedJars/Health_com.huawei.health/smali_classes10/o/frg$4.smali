.class Lo/frg$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fpo$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/frg;->d(Lo/fsa;)Lo/fqq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/fpo$c<Lo/fqq;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/fsa;

.field final synthetic c:Lo/frg;


# direct methods
.method constructor <init>(Lo/frg;Lo/fsa;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lo/frg$4;->c:Lo/frg;

    iput-object p2, p0, Lo/frg$4;->b:Lo/fsa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .line 205
    move-object v0, p1

    check-cast v0, Lo/fqq;

    invoke-virtual {p0, v0}, Lo/frg$4;->e(Lo/fqq;)Z

    move-result v0

    return v0
.end method

.method public e(Lo/fqq;)Z
    .locals 3

    .line 208
    invoke-virtual {p1}, Lo/fqq;->d()Lo/fqr;

    move-result-object v2

    .line 209
    if-eqz v2, :cond_0

    iget-object v0, p0, Lo/frg$4;->b:Lo/fsa;

    invoke-virtual {v2}, Lo/fqr;->e()Lo/fsa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fsa;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
