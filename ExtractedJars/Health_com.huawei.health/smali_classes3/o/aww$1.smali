.class Lo/aww$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aww;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aww;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/aww;Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/aww$1;->a:Lo/aww;

    iput-object p2, p0, Lo/aww$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 80
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aww$1$1;

    invoke-direct {v1, p0}, Lo/aww$1$1;-><init>(Lo/aww$1;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 110
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 115
    move v1, p1

    .line 116
    if-nez v1, :cond_0

    .line 118
    move v1, p2

    .line 120
    :cond_0
    iget-object v0, p0, Lo/aww$1;->a:Lo/aww;

    invoke-static {v0, v1}, Lo/aww;->b(Lo/aww;I)V

    .line 121
    return-void
.end method
