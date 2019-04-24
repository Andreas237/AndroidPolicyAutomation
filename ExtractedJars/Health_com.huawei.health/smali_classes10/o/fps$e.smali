.class Lo/fps$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private b:Lo/fqp;

.field final synthetic d:Lo/fps;


# direct methods
.method constructor <init>(Lo/fps;Lo/fqp;)V
    .locals 0

    .line 1645
    iput-object p1, p0, Lo/fps$e;->d:Lo/fps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1646
    iput-object p2, p0, Lo/fps$e;->b:Lo/fqp;

    .line 1647
    return-void
.end method

.method static synthetic e(Lo/fps$e;)Lo/fqp;
    .locals 1

    .line 1641
    iget-object v0, p0, Lo/fps$e;->b:Lo/fqp;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1651
    iget-object v0, p0, Lo/fps$e;->d:Lo/fps;

    invoke-static {v0}, Lo/fps;->d(Lo/fps;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/fps$e$5;

    invoke-direct {v1, p0}, Lo/fps$e$5;-><init>(Lo/fps$e;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1665
    return-void
.end method
