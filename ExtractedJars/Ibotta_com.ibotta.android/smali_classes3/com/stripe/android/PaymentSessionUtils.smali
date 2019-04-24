.class Lcom/stripe/android/PaymentSessionUtils;
.super Ljava/lang/Object;
.source "PaymentSessionUtils.java"


# direct methods
.method public static paymentResultFromString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6f4abffd

    if-eq v0, v1, :cond_3

    const v1, -0x3c33b6a2

    if-eq v0, v1, :cond_2

    const v1, 0x5c4d208

    if-eq v0, v1, :cond_1

    const v1, 0x79d00ddd

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "user_cancelled"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "error"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x2

    goto :goto_1

    :cond_2
    const-string v0, "incomplete"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x3

    goto :goto_1

    :cond_3
    const-string v0, "success"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, -0x1

    :goto_1
    packed-switch p0, :pswitch_data_0

    const-string p0, "error"

    return-object p0

    :pswitch_0
    const-string p0, "incomplete"

    return-object p0

    :pswitch_1
    const-string p0, "error"

    return-object p0

    :pswitch_2
    const-string p0, "user_cancelled"

    return-object p0

    :pswitch_3
    const-string p0, "success"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
