.class Lo/afq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->c(Ljava/util/ArrayList;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/afq;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/afq;Z)V
    .locals 0

    .line 340
    iput-object p1, p0, Lo/afq$1;->d:Lo/afq;

    iput-boolean p2, p0, Lo/afq$1;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 5

    .line 343
    iget-object v0, p0, Lo/afq$1;->d:Lo/afq;

    invoke-static {v0}, Lo/afq;->a(Lo/afq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 344
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 345
    invoke-static {p2}, Lo/aet;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 346
    if-eqz v4, :cond_0

    .line 347
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownResZipGetSize is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lo/afq$1;->d:Lo/afq;

    iget-boolean v1, p0, Lo/afq$1;->e:Z

    invoke-static {v0, v4, v1}, Lo/afq;->b(Lo/afq;Ljava/util/List;Z)V

    .line 352
    :cond_0
    return-void
.end method
