.class final Lo/ebd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebd;->e(Landroid/os/Handler;Lo/ebd$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ebd$a;

.field final synthetic e:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lo/ebd$a;Landroid/os/Handler;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lo/ebd$2;->c:Lo/ebd$a;

    iput-object p2, p0, Lo/ebd$2;->e:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 236
    iget v0, p2, Lo/eba;->c:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 238
    :sswitch_0
    const-string v0, "Login_DownloadPluginHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateIndex file success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lo/ebd$2;->c:Lo/ebd$a;

    iget-object v0, v0, Lo/ebd$a;->c:Lo/ebd$b;

    iget-object v0, v0, Lo/ebd$b;->h:Lo/eap;

    invoke-virtual {v0}, Lo/eap;->h()Z

    .line 240
    iget-object v0, p0, Lo/ebd$2;->c:Lo/ebd$a;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ebd$a;->a:Lo/eay;

    .line 241
    iget-object v0, p0, Lo/ebd$2;->c:Lo/ebd$a;

    iget-object v0, v0, Lo/ebd$a;->c:Lo/ebd$b;

    iget-object v0, v0, Lo/ebd$b;->h:Lo/eap;

    invoke-virtual {p2}, Lo/eba;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eap;->a(Ljava/lang/String;)V

    .line 242
    iget-object v0, p0, Lo/ebd$2;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ebd$2;->e:Landroid/os/Handler;

    iget-object v2, p0, Lo/ebd$2;->c:Lo/ebd$a;

    const/16 v3, 0x3e9

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 243
    goto :goto_1

    .line 245
    :sswitch_1
    iget-object v0, p0, Lo/ebd$2;->c:Lo/ebd$a;

    iput-object p1, v0, Lo/ebd$a;->a:Lo/eay;

    .line 246
    iget-object v0, p0, Lo/ebd$2;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ebd$2;->e:Landroid/os/Handler;

    iget-object v2, p0, Lo/ebd$2;->c:Lo/ebd$a;

    const/16 v3, 0x3eb

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 247
    goto :goto_1

    .line 249
    :goto_0
    const-string v0, "Login_DownloadPluginHelper"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateIndex file fail("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Lo/eba;->c:I

    invoke-static {v2}, Lo/ebd;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ")"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    iget-object v0, p0, Lo/ebd$2;->c:Lo/ebd$a;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ebd$a;->a:Lo/eay;

    .line 251
    iget-object v0, p0, Lo/ebd$2;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ebd$2;->e:Landroid/os/Handler;

    iget-object v2, p0, Lo/ebd$2;->c:Lo/ebd$a;

    const/16 v3, 0x3ea

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 254
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
