.class public Lo/don;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/don$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Lo/don$e;)V
    .locals 2

    .line 23
    invoke-static {}, Lo/doa;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/don$1;

    invoke-direct {v1, p1, p0, p2}, Lo/don$1;-><init>(Ljava/lang/String;Landroid/content/Context;Lo/don$e;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 48
    return-void
.end method
