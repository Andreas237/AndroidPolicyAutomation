.class Lo/dix$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dir$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dix;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dix;


# direct methods
.method constructor <init>(Lo/dix;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lo/dix$3;->a:Lo/dix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 4

    .line 227
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMusicChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lo/dix$3;->a:Lo/dix;

    invoke-virtual {v0}, Lo/dix;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 230
    iget-object v0, p0, Lo/dix$3;->a:Lo/dix;

    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v1

    invoke-virtual {v1}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dix;->d(Lo/dix;Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;)V

    .line 232
    :cond_0
    return-void
.end method
