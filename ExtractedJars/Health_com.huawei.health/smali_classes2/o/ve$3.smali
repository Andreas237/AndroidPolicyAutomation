.class Lo/ve$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ve;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ve;


# direct methods
.method constructor <init>(Lo/ve;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/ve$3;->c:Lo/ve;

    .line 1017
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1019
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1021
    :pswitch_0
    iget-object v0, p0, Lo/ve$3;->c:Lo/ve;

    invoke-static {v0}, Lo/ve;->c(Lo/ve;)V

    .line 1022
    goto :goto_0

    .line 1024
    :pswitch_1
    iget-object v0, p0, Lo/ve$3;->c:Lo/ve;

    invoke-static {v0}, Lo/ve;->a(Lo/ve;)V

    .line 1025
    .line 1029
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
