.class public abstract Lo/fcu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/os/Handler;

.field public e:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lo/fcu;->e:Landroid/app/Activity;

    .line 45
    iput-object p2, p0, Lo/fcu;->c:Landroid/os/Handler;

    .line 46
    return-void
.end method


# virtual methods
.method public abstract a()Landroid/view/View;
.end method

.method public abstract a(I)V
.end method

.method public abstract a(Ljava/lang/Object;)V
.end method

.method public abstract b()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation
.end method

.method public abstract c()V
.end method

.method public abstract c(I)V
.end method

.method public abstract c(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
.end method

.method public abstract c(Ljava/util/Date;)V
.end method

.method public d()V
    .locals 2

    .line 62
    iget-object v0, p0, Lo/fcu;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 63
    const/4 v0, 0x5

    iput v0, v1, Landroid/os/Message;->what:I

    .line 64
    iget-object v0, p0, Lo/fcu;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 65
    return-void
.end method

.method public e()V
    .locals 2

    .line 53
    iget-object v0, p0, Lo/fcu;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 54
    const/4 v0, 0x6

    iput v0, v1, Landroid/os/Message;->what:I

    .line 55
    iget-object v0, p0, Lo/fcu;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 56
    return-void
.end method

.method public abstract e(Ljava/util/Date;)V
.end method

.method public abstract f()Z
.end method

.method public abstract h()Lo/fcv;
.end method

.method public abstract k()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end method
