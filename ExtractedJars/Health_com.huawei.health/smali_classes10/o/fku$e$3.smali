.class Lo/fku$e$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fku$e;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic e:Lo/fku$e;


# direct methods
.method constructor <init>(Lo/fku$e;Ljava/lang/Runnable;)V
    .locals 0

    .line 457
    iput-object p1, p0, Lo/fku$e$3;->e:Lo/fku$e;

    iput-object p2, p0, Lo/fku$e$3;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 460
    :try_start_0
    iget-object v0, p0, Lo/fku$e$3;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 462
    iget-object v0, p0, Lo/fku$e$3;->e:Lo/fku$e;

    invoke-static {v0}, Lo/fku$e;->b(Lo/fku$e;)V

    .line 463
    goto :goto_0

    .line 462
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lo/fku$e$3;->e:Lo/fku$e;

    invoke-static {v0}, Lo/fku$e;->b(Lo/fku$e;)V

    throw v1

    .line 464
    :goto_0
    return-void
.end method
