.class Lo/wz$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/wz;->e(Lo/wr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/wr;

.field final synthetic c:Lo/wz;


# direct methods
.method constructor <init>(Lo/wz;Lo/wr;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lo/wz$3;->c:Lo/wz;

    iput-object p2, p0, Lo/wz$3;->a:Lo/wr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 42
    new-instance v1, Lo/wt;

    invoke-direct {v1}, Lo/wt;-><init>()V

    .line 43
    iget-object v0, p0, Lo/wz$3;->a:Lo/wr;

    invoke-virtual {v1, v0}, Lo/wt;->a(Lo/wr;)V

    .line 46
    new-instance v2, Lo/wy;

    invoke-direct {v2}, Lo/wy;-><init>()V

    .line 47
    iget-object v0, p0, Lo/wz$3;->a:Lo/wr;

    invoke-virtual {v2, v0}, Lo/wy;->e(Lo/wr;)V

    .line 50
    new-instance v3, Lo/xc;

    invoke-direct {v3}, Lo/xc;-><init>()V

    .line 51
    iget-object v0, p0, Lo/wz$3;->a:Lo/wr;

    invoke-virtual {v3, v0}, Lo/xc;->a(Lo/wr;)V

    .line 54
    new-instance v4, Lo/wx;

    invoke-direct {v4}, Lo/wx;-><init>()V

    .line 55
    iget-object v0, p0, Lo/wz$3;->a:Lo/wr;

    invoke-virtual {v4, v0}, Lo/wx;->c(Lo/wr;)V

    .line 56
    return-void
.end method
