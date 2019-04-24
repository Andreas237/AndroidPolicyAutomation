.class Lo/bwa$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bwa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/bwa;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/bwa;)V
    .locals 1

    .line 1842
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1843
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bwa$e;->a:Ljava/lang/ref/WeakReference;

    .line 1844
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1848
    if-nez p1, :cond_0

    .line 1849
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UpdateUiHandler msg is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1851
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1852
    iget-object v0, p0, Lo/bwa$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1853
    iget-object v0, p0, Lo/bwa$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bwa;

    .line 1854
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x4b0

    if-ne v0, v1, :cond_1

    .line 1855
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "last updateTime is 5mins ago"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1857
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x4b1

    if-ne v0, v1, :cond_2

    .line 1858
    iget-object v0, v4, Lo/bwa;->t:Lo/bwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, v4, Lo/bwa;->t:Lo/bwr;

    invoke-virtual {v0}, Lo/bwr;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 1859
    iget-object v0, v4, Lo/bwa;->t:Lo/bwr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwr;->setVisibility(I)V

    .line 1864
    :cond_2
    :goto_0
    return-void
.end method
