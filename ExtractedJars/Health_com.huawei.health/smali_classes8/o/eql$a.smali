.class Lo/eql$a;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eql;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/eql;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/eql;)V
    .locals 0

    .line 279
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 280
    return-void
.end method


# virtual methods
.method protected a(Lo/eql;Landroid/os/Message;)V
    .locals 5

    .line 284
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 286
    :sswitch_0
    invoke-static {}, Lo/eql;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetCardStressHandler()  handleMessageWhenReferenceNotNull :  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\u5237\u65b0\u6570\u636e\u4e86\u3002\u3002\u3002"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    invoke-static {p1}, Lo/eql;->c(Lo/eql;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lo/eqa;->b:Lo/eqa;

    iget-object v2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lo/epx;

    invoke-virtual {p1, v0, v1, v2}, Lo/eql;->a(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v4

    .line 288
    invoke-static {p1, v4}, Lo/eql;->a(Lo/eql;Ljava/util/List;)V

    .line 289
    .line 293
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 276
    move-object v0, p1

    check-cast v0, Lo/eql;

    invoke-virtual {p0, v0, p2}, Lo/eql$a;->a(Lo/eql;Landroid/os/Message;)V

    return-void
.end method
