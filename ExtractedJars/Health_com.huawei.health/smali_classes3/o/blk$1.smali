.class Lo/blk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/blk;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/blk;


# direct methods
.method constructor <init>(Lo/blk;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lo/blk$1;->c:Lo/blk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 315
    iget-object v0, p0, Lo/blk$1;->c:Lo/blk;

    invoke-virtual {v0}, Lo/blk;->d()V

    .line 316
    return-void
.end method

.method public d()V
    .locals 0

    .line 321
    return-void
.end method
