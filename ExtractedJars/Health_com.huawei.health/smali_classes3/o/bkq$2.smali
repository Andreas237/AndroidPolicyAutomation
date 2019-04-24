.class Lo/bkq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkq;->d(Lo/bfh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/bkq;


# direct methods
.method constructor <init>(Lo/bkq;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/bkq$2;->c:Lo/bkq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 164
    iget-object v0, p0, Lo/bkq$2;->c:Lo/bkq;

    invoke-static {v0}, Lo/bkq;->d(Lo/bkq;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 165
    const/16 v0, 0x252

    iput v0, v1, Landroid/os/Message;->what:I

    .line 166
    iget-object v0, p0, Lo/bkq$2;->c:Lo/bkq;

    invoke-static {v0}, Lo/bkq;->d(Lo/bkq;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 167
    return-void
.end method
