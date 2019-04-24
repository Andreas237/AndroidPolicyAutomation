.class public Lcom/huawei/openalliance/ad/m/a/c;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;
    .locals 1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance v0, Lcom/huawei/openalliance/ad/m/a/f;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/m/a/f;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :pswitch_1
    new-instance v0, Lcom/huawei/openalliance/ad/m/a/d;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/m/a/d;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :goto_0
    :pswitch_2
    new-instance v0, Lcom/huawei/openalliance/ad/m/a/e;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/m/a/e;-><init>(Landroid/content/Context;)V

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
