.class public final Lcom/huawei/openalliance/ad/g/e;
.super Lcom/huawei/openalliance/ad/g/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/g/a;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/openalliance/ad/g/h;
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/g/e;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/g/e;-><init>()V

    return-object v0
.end method

.method private a(Ljava/lang/String;ILjava/lang/String;)V
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
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/e;->a:Lcom/huawei/openalliance/ad/g/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/e;->a:Lcom/huawei/openalliance/ad/g/h;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/g/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;

    :cond_0
    return-object p0
.end method

.method public a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/g/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2, p3}, Lcom/huawei/openalliance/ad/g/e;->a(Ljava/lang/String;ILjava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/e;->a:Lcom/huawei/openalliance/ad/g/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/e;->a:Lcom/huawei/openalliance/ad/g/h;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/openalliance/ad/g/h;->a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V

    :cond_1
    return-void
.end method
