.class Lo/alt$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ala;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/alt;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/alt;)V
    .locals 1

    .line 694
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 692
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt$d;->a:Ljava/lang/ref/WeakReference;

    .line 696
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/alt$d;->a:Ljava/lang/ref/WeakReference;

    .line 697
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 5

    .line 717
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FlushCallbackInter onFailed, continue work"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    iget-object v0, p0, Lo/alt$d;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 720
    iget-object v0, p0, Lo/alt$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/alt;

    .line 721
    if-eqz v4, :cond_0

    .line 722
    invoke-virtual {v4}, Lo/alt;->a()V

    .line 725
    :cond_0
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .line 702
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FlushCallbackInter onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    iget-object v0, p0, Lo/alt$d;->a:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 706
    iget-object v0, p0, Lo/alt$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/alt;

    .line 707
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 708
    invoke-virtual {v4}, Lo/alt;->a()V

    .line 712
    :cond_0
    return-void
.end method
