.class public abstract Lo/ciz;
.super Ljava/lang/Object;


# direct methods
.method public static e(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "D"

    return-object v0

    :pswitch_1
    const-string v0, "I"

    return-object v0

    :pswitch_2
    const-string v0, "W"

    return-object v0

    :pswitch_3
    const-string v0, "E"

    return-object v0

    :goto_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
