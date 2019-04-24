.class Lo/azo$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lo/azo;


# direct methods
.method constructor <init>(Lo/azo;Landroid/os/Looper;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/azo$e;->d:Lo/azo;

    .line 113
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 114
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 119
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 120
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 124
    :pswitch_0
    iget-object v0, p0, Lo/azo$e;->d:Lo/azo;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/azn;

    invoke-static {v0, v1}, Lo/azo;->b(Lo/azo;Lo/azn;)V

    .line 125
    goto :goto_0

    .line 130
    :pswitch_1
    iget-object v0, p0, Lo/azo$e;->d:Lo/azo;

    invoke-static {v0}, Lo/azo;->a(Lo/azo;)V

    .line 131
    goto :goto_0

    .line 135
    :pswitch_2
    iget-object v0, p0, Lo/azo$e;->d:Lo/azo;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/jivesoftware/smack/packet/Stanza;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/azo;->b(Lo/azo;Lorg/jivesoftware/smack/packet/Stanza;Z)V

    .line 136
    goto :goto_0

    .line 140
    :pswitch_3
    iget-object v0, p0, Lo/azo$e;->d:Lo/azo;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/jivesoftware/smack/packet/Stanza;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/azo;->b(Lo/azo;Lorg/jivesoftware/smack/packet/Stanza;Z)V

    .line 141
    .line 148
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
