.class Lo/flx$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/flx;->e(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/flx;

.field final synthetic c:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lo/flx;Ljava/lang/Runnable;)V
    .locals 0

    .line 999
    iput-object p1, p0, Lo/flx$4;->a:Lo/flx;

    iput-object p2, p0, Lo/flx$4;->c:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1003
    :try_start_0
    iget-object v0, p0, Lo/flx$4;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1006
    goto :goto_0

    .line 1004
    :catch_0
    move-exception v3

    .line 1005
    invoke-static {}, Lo/flx;->h()Lo/fty;

    move-result-object v0

    const-string v1, "exception in protocol stage thread: {}"

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1007
    :goto_0
    return-void
.end method
