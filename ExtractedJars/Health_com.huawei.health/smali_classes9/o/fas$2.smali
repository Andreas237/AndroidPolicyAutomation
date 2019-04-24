.class Lo/fas$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fas;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fas;


# direct methods
.method constructor <init>(Lo/fas;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/fas$2;->a:Lo/fas;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 75
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 76
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 78
    :sswitch_0
    iget-object v0, p0, Lo/fas$2;->a:Lo/fas;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lo/fas;->c(Lo/fas;Ljava/util/List;)Ljava/util/List;

    .line 79
    const-string v0, "FitnessDataOriginView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage mListdata.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fas$2;->a:Lo/fas;

    invoke-static {v3}, Lo/fas;->e(Lo/fas;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/fas$2;->a:Lo/fas;

    invoke-static {v0}, Lo/fas;->c(Lo/fas;)Lo/faq;

    move-result-object v0

    iget-object v1, p0, Lo/fas$2;->a:Lo/fas;

    invoke-static {v1}, Lo/fas;->e(Lo/fas;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/faq;->c(Ljava/util/List;)V

    .line 81
    .line 85
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method
