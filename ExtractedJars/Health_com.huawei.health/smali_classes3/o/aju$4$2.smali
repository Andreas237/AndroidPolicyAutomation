.class Lo/aju$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aju$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/aju$4;


# direct methods
.method constructor <init>(Lo/aju$4;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lo/aju$4$2;->b:Lo/aju$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queueIdle()Z
    .locals 4

    .line 114
    iget-object v0, p0, Lo/aju$4$2;->b:Lo/aju$4;

    iget-object v0, v0, Lo/aju$4;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/aju$4$2;->b:Lo/aju$4;

    iget-object v1, v1, Lo/aju$4;->e:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 115
    const/4 v0, 0x1

    return v0
.end method
