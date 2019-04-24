.class Lo/amb$5;
.super Landroid/os/RemoteCallbackList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/RemoteCallbackList<Lo/abg;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/amb;


# direct methods
.method constructor <init>(Lo/amb;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/amb$5;->c:Lo/amb;

    invoke-direct {p0}, Landroid/os/RemoteCallbackList;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/abg;)V
    .locals 4

    .line 48
    invoke-super {p0, p1}, Landroid/os/RemoteCallbackList;->onCallbackDied(Landroid/os/IInterface;)V

    .line 49
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RemoteCallbackList unregister when onCallbackDied:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-virtual {p0, p1}, Lo/amb$5;->unregister(Landroid/os/IInterface;)Z

    .line 51
    return-void
.end method

.method public synthetic onCallbackDied(Landroid/os/IInterface;)V
    .locals 1

    .line 45
    move-object v0, p1

    check-cast v0, Lo/abg;

    invoke-virtual {p0, v0}, Lo/amb$5;->b(Lo/abg;)V

    return-void
.end method
