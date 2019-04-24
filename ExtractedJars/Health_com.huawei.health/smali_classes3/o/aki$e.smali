.class Lo/aki$e;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aki;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/aki;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/aki;)V
    .locals 1

    .line 116
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 117
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aki$e;->b:Ljava/lang/ref/WeakReference;

    .line 118
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 122
    iget-object v0, p0, Lo/aki$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aki;

    .line 123
    if-nez v4, :cond_0

    .line 124
    return-void

    .line 126
    :cond_0
    invoke-static {}, Lo/aki;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check ota update result..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-static {v4}, Lo/aki;->a(Lo/aki;)V

    .line 128
    return-void
.end method
