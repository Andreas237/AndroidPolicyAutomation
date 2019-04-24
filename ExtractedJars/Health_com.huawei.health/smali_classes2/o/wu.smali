.class public Lo/wu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Lo/wv;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {}, Lo/wv;->b()Lo/wv;

    move-result-object v0

    iput-object v0, p0, Lo/wu;->d:Lo/wv;

    .line 24
    return-void
.end method


# virtual methods
.method public e(Ljava/util/ArrayList;Landroid/content/Context;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/xf;>;Landroid/content/Context;J)V"
        }
    .end annotation

    .line 28
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 29
    const-string v0, "SocialDataInsertion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialUserDetails size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->h()V

    .line 32
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p4}, Lo/wr;->c(Ljava/util/ArrayList;J)J

    .line 34
    iget-object v0, p0, Lo/wu;->d:Lo/wv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/wv;->d(I)V

    .line 37
    :cond_0
    return-void
.end method
