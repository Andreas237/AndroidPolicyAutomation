.class Lo/fcx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcx;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fcx;


# direct methods
.method constructor <init>(Lo/fcx;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lo/fcx$3;->d:Lo/fcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 240
    iget-object v0, p0, Lo/fcx$3;->d:Lo/fcx;

    invoke-static {v0}, Lo/fcx;->c(Lo/fcx;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 241
    const/4 v0, 0x4

    iput v0, v1, Landroid/os/Message;->what:I

    .line 242
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 243
    iget-object v0, p0, Lo/fcx$3;->d:Lo/fcx;

    invoke-static {v0}, Lo/fcx;->c(Lo/fcx;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 244
    return-void
.end method
