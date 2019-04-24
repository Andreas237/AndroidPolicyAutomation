.class Lo/exo$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->c(JLo/exn$d;Lo/exn$a;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exn$d;

.field final synthetic b:Lo/exn$a;

.field final synthetic c:Lo/exo;

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lo/exo;Lo/exn$d;Lo/exn$a;Lo/egg;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lo/exo$19;->c:Lo/exo;

    iput-object p2, p0, Lo/exo$19;->a:Lo/exn$d;

    iput-object p3, p0, Lo/exo$19;->b:Lo/exn$a;

    iput-object p4, p0, Lo/exo$19;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 246
    sget-object v0, Lo/exo$25;->c:[I

    iget-object v1, p0, Lo/exo$19;->a:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 255
    :pswitch_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 256
    iget-object v0, p0, Lo/exo$19;->c:Lo/exo;

    iget-object v1, p0, Lo/exo$19;->b:Lo/exn$a;

    iget-object v2, p0, Lo/exo$19;->d:Lo/egg;

    invoke-static {v0, v1, v2, p2}, Lo/exo;->d(Lo/exo;Lo/exn$a;Lo/egg;Ljava/lang/Object;)V

    goto :goto_0

    .line 258
    :cond_0
    iget-object v0, p0, Lo/exo$19;->d:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 259
    iget-object v0, p0, Lo/exo$19;->d:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 269
    :pswitch_1
    iget-object v0, p0, Lo/exo$19;->d:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 270
    iget-object v0, p0, Lo/exo$19;->d:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 276
    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
