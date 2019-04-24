.class Lo/efd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efd;->a(Lo/eew;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/efd;

.field final synthetic c:Lo/eew;


# direct methods
.method constructor <init>(Lo/efd;Lo/eew;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lo/efd$1;->a:Lo/efd;

    iput-object p2, p0, Lo/efd$1;->c:Lo/eew;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 24
    iget-object v0, p0, Lo/efd$1;->c:Lo/eew;

    invoke-virtual {v0}, Lo/eew;->f()V

    .line 25
    iget-object v0, p0, Lo/efd$1;->c:Lo/eew;

    iget-object v1, p0, Lo/efd$1;->a:Lo/efd;

    iget v1, v1, Lo/efd;->c:I

    iget-object v2, p0, Lo/efd$1;->a:Lo/efd;

    iget v2, v2, Lo/efd;->b:I

    invoke-virtual {v0, v1, v2}, Lo/eew;->d(II)V

    .line 26
    return-void
.end method
