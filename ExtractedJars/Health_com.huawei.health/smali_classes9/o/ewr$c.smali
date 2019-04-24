.class Lo/ewr$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ewr;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ewr;)V
    .locals 1

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 233
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ewr$c;->e:Ljava/lang/ref/WeakReference;

    .line 234
    return-void
.end method


# virtual methods
.method public b(ILjava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lo/ews;>;)V"
        }
    .end annotation

    .line 239
    iget-object v0, p0, Lo/ewr$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ewr;

    .line 240
    if-nez v4, :cond_0

    .line 241
    const-string v0, "MiddleAndHighStrengthDa"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataInteractor is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    return-void

    .line 246
    :cond_0
    invoke-static {v4, p2}, Lo/ewr;->b(Lo/ewr;Ljava/util/List;)Lo/ews;

    move-result-object v5

    .line 247
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 248
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 249
    const/16 v0, 0x65

    iput v0, v6, Landroid/os/Message;->what:I

    .line 250
    iget-object v0, v4, Lo/ewr;->c:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 251
    return-void
.end method
