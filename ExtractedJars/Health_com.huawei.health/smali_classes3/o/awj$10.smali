.class Lo/awj$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->n()Lo/brd;
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
.field final synthetic d:Lo/awj;


# direct methods
.method constructor <init>(Lo/awj;)V
    .locals 0

    .line 557
    iput-object p1, p0, Lo/awj$10;->d:Lo/awj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 557
    invoke-virtual {p0, p1}, Lo/awj$10;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 561
    iget-object v0, p0, Lo/awj$10;->d:Lo/awj;

    invoke-virtual {v0}, Lo/awj;->i()Ljava/lang/String;

    move-result-object v2

    .line 562
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 565
    new-instance v0, Lo/aww;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aww;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, v2}, Lo/aww;->c(Ljava/lang/String;)V

    .line 567
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
