.class Lo/bbh$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bbh;->h()V
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
.field final synthetic a:Lo/bbh;


# direct methods
.method constructor <init>(Lo/bbh;)V
    .locals 0

    .line 561
    iput-object p1, p0, Lo/bbh$2;->a:Lo/bbh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 561
    invoke-virtual {p0, p1}, Lo/bbh$2;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 565
    iget-object v0, p0, Lo/bbh$2;->a:Lo/bbh;

    invoke-virtual {v0}, Lo/bbh;->f()Ljava/lang/String;

    move-result-object v1

    .line 566
    invoke-static {v1}, Lo/bot;->c(Ljava/lang/String;)Z

    .line 567
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
