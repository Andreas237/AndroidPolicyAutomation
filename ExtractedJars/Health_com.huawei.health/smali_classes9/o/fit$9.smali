.class Lo/fit$9;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fit;->g(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fit;


# direct methods
.method constructor <init>(Lo/fit;)V
    .locals 0

    .line 610
    iput-object p1, p0, Lo/fit$9;->c:Lo/fit;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 613
    iget-object v0, p0, Lo/fit$9;->c:Lo/fit;

    invoke-static {v0}, Lo/fit;->d(Lo/fit;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xca

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 614
    return-void
.end method
