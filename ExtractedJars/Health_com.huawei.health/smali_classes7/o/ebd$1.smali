.class Lo/ebd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebd;->b(Landroid/os/Handler;Lo/ebd$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ebd$a;

.field final synthetic c:Landroid/os/Handler;

.field final synthetic e:Lo/ebd;


# direct methods
.method constructor <init>(Lo/ebd;Lo/ebd$a;Landroid/os/Handler;)V
    .locals 0

    .line 312
    iput-object p1, p0, Lo/ebd$1;->e:Lo/ebd;

    iput-object p2, p0, Lo/ebd$1;->b:Lo/ebd$a;

    iput-object p3, p0, Lo/ebd$1;->c:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 315
    iget v0, p2, Lo/eba;->c:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 317
    :sswitch_0
    const-string v0, "Login_DownloadPluginHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDescrption file success, uuid="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ebd$1;->b:Lo/ebd$a;

    iget-object v2, v2, Lo/ebd$a;->d:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    iget-object v0, p0, Lo/ebd$1;->b:Lo/ebd$a;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ebd$a;->a:Lo/eay;

    .line 319
    iget-object v0, p0, Lo/ebd$1;->b:Lo/ebd$a;

    invoke-virtual {p2}, Lo/eba;->d()I

    move-result v1

    iput v1, v0, Lo/ebd$a;->e:I

    .line 320
    iget-object v0, p0, Lo/ebd$1;->b:Lo/ebd$a;

    iget-object v0, v0, Lo/ebd$a;->c:Lo/ebd$b;

    iget-object v0, v0, Lo/ebd$b;->h:Lo/eap;

    invoke-virtual {p2}, Lo/eba;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eap;->a(Ljava/lang/String;)V

    .line 321
    iget-object v0, p0, Lo/ebd$1;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/ebd$1;->c:Landroid/os/Handler;

    iget-object v2, p0, Lo/ebd$1;->b:Lo/ebd$a;

    const/16 v3, 0x3ec

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 322
    goto :goto_1

    .line 324
    :sswitch_1
    iget-object v0, p0, Lo/ebd$1;->b:Lo/ebd$a;

    iput-object p1, v0, Lo/ebd$a;->a:Lo/eay;

    .line 325
    iget-object v0, p0, Lo/ebd$1;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/ebd$1;->c:Landroid/os/Handler;

    iget-object v2, p0, Lo/ebd$1;->b:Lo/ebd$a;

    const/16 v3, 0x3ee

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 326
    goto :goto_1

    .line 328
    :goto_0
    const-string v0, "Login_DownloadPluginHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDescrption file fail("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Lo/eba;->c:I

    invoke-static {v2}, Lo/ebd;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "), uuid="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ebd$1;->b:Lo/ebd$a;

    iget-object v2, v2, Lo/ebd$a;->d:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lo/ebd$1;->b:Lo/ebd$a;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ebd$a;->a:Lo/eay;

    .line 330
    iget-object v0, p0, Lo/ebd$1;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/ebd$1;->c:Landroid/os/Handler;

    iget-object v2, p0, Lo/ebd$1;->b:Lo/ebd$a;

    const/16 v3, 0x3ed

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 333
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
