.class Lo/few$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fev$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/few;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lo/few;


# direct methods
.method private constructor <init>(Lo/few;)V
    .locals 0

    .line 594
    iput-object p1, p0, Lo/few$e;->d:Lo/few;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/few;Lo/few$1;)V
    .locals 0

    .line 594
    invoke-direct {p0, p1}, Lo/few$e;-><init>(Lo/few;)V

    return-void
.end method


# virtual methods
.method public c(Lo/fev;IIII)V
    .locals 1

    .line 597
    iget-object v0, p0, Lo/few$e;->d:Lo/few;

    invoke-static {v0}, Lo/few;->i(Lo/few;)Lo/fev;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 598
    iget-object v0, p0, Lo/few$e;->d:Lo/few;

    invoke-static {v0}, Lo/few;->f(Lo/few;)Lo/fev;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/fev;->scrollTo(II)V

    goto :goto_0

    .line 600
    :cond_0
    iget-object v0, p0, Lo/few$e;->d:Lo/few;

    invoke-static {v0}, Lo/few;->i(Lo/few;)Lo/fev;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/fev;->scrollTo(II)V

    .line 602
    :goto_0
    return-void
.end method
