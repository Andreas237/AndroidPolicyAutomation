.class public final Lo/cja;
.super Lo/cjb;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo/cjb;-><init>()V

    return-void
.end method

.method public static e()Lo/cjc;
    .locals 1

    new-instance v0, Lo/cja;

    invoke-direct {v0}, Lo/cja;-><init>()V

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :pswitch_1
    invoke-static {p3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :pswitch_2
    invoke-static {p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :pswitch_3
    invoke-static {p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :goto_0
    invoke-static {p3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object v0, p0, Lo/cja;->c:Lo/cjc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cja;->c:Lo/cjc;

    invoke-interface {v0, p1, p2, p3, p4}, Lo/cjc;->c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lo/cjc;
    .locals 1

    iget-object v0, p0, Lo/cja;->c:Lo/cjc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cja;->c:Lo/cjc;

    invoke-interface {v0, p1, p2}, Lo/cjc;->d(Landroid/content/Context;Ljava/lang/String;)Lo/cjc;

    :cond_0
    return-object p0
.end method
