.class Lo/asz$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asz;->b(ZLandroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/asz;

.field final synthetic c:Z

.field final synthetic e:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lo/asz;ZLandroid/os/Handler;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lo/asz$3;->b:Lo/asz;

    iput-boolean p2, p0, Lo/asz$3;->c:Z

    iput-object p3, p0, Lo/asz$3;->e:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 443
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asz$3$1;

    invoke-direct {v1, p0}, Lo/asz$3$1;-><init>(Lo/asz$3;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 454
    return-void
.end method

.method public e(II)V
    .locals 4

    .line 459
    move v2, p1

    .line 460
    move v3, p2

    .line 461
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asz$3$4;

    invoke-direct {v1, p0, v2, v3}, Lo/asz$3$4;-><init>(Lo/asz$3;II)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 470
    return-void
.end method
