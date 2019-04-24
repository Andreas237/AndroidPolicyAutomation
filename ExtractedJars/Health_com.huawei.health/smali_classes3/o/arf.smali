.class public Lo/arf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/arf$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/widget/ImageView;Landroid/net/Uri;)V
    .locals 3

    .line 24
    if-eqz p0, :cond_0

    .line 26
    new-instance v2, Lo/arf$c;

    invoke-direct {v2, p0, p1}, Lo/arf$c;-><init>(Landroid/widget/ImageView;Landroid/net/Uri;)V

    .line 27
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v2, v0, v1}, Lo/arf$c;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 29
    :cond_0
    return-void
.end method
