.class public Lo/evb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/euy;


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/evb;->e:Landroid/os/Handler;

    return-void
.end method

.method private e(Ljava/util/List;JLo/evj;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/evp;>;JLo/evj<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 39
    invoke-static {p1}, Lo/eva;->e(Ljava/util/List;)Lo/evp;

    move-result-object v4

    .line 40
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 42
    iget-object v0, p0, Lo/evb;->e:Landroid/os/Handler;

    const-string v1, "\u4e0b\u8f7d\u5df2\u5b8c\u6210"

    invoke-virtual {p4, v0, v1}, Lo/evj;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 43
    return-void

    .line 45
    :cond_0
    const-string v0, "ljt"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadTask"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    new-instance v0, Lo/evg;

    invoke-direct {v0, p1, p2, p3, p4}, Lo/evg;-><init>(Ljava/util/List;JLo/evj;)V

    invoke-virtual {v0}, Lo/evg;->b()V

    .line 47
    return-void
.end method


# virtual methods
.method public d(Lo/evj;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/evj<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 22
    invoke-static {}, Lo/eve;->c()Ljava/util/List;

    move-result-object v4

    .line 24
    const-string v0, "ljt"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadWorkoutMediaFiles files"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    const-wide/32 v0, 0xa00000

    invoke-direct {p0, v4, v0, v1, p1}, Lo/evb;->e(Ljava/util/List;JLo/evj;)V

    .line 29
    return-void
.end method
