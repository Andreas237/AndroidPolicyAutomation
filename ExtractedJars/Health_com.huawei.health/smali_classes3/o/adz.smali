.class public Lo/adz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 22
    const/16 v0, 0xe1

    if-ne p0, v0, :cond_0

    const-string v0, "\u8896\u5e26\u7f20\u7ed5\u4e0d\u6b63\u786e\uff0c\u8bf7\u5c06\u8896\u5e26\u7ed1\u7d27"

    goto :goto_0

    :cond_0
    const/16 v0, 0xe2

    if-ne p0, v0, :cond_1

    const-string v0, "\u8896\u5957\u7f20\u7ed5\u592a\u677e\uff1b\u8bf7\u5c06\u8896\u5e26\u7ed1\u7d27"

    goto :goto_0

    :cond_1
    const/16 v0, 0xe3

    if-ne p0, v0, :cond_2

    const-string v0, "\u8bf7\u4e0d\u8981\u6643\u52a8\u624b\u81c2\uff0c\u8bf7\u5c06\u8896\u5e26\u7ed1\u7d27"

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    if-ne p0, v0, :cond_3

    const-string v0, "\u4fe1\u53f7\u592a\u5f31"

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    if-ne p0, v0, :cond_4

    const-string v0, "\u9519\u8bef\u4fe1\u53f7"

    goto :goto_0

    :cond_4
    const/4 v0, 0x3

    if-ne p0, v0, :cond_5

    const-string v0, "\u81c2\u5e26\u4e2d\u65e0\u538b\u529b"

    goto :goto_0

    :cond_5
    const/4 v0, 0x5

    if-ne p0, v0, :cond_6

    const-string v0, "\u5f02\u5e38\u7ed3\u679c"

    goto :goto_0

    :cond_6
    const/16 v0, 0xe4

    if-ne p0, v0, :cond_7

    const-string v0, "\u7535\u6c60\u7535\u538b\u8fc7\u4f4e\uff0c\u8bf7\u66f4\u6362\u7535\u6c60"

    goto :goto_0

    :cond_7
    const-string v0, "\u8bbe\u5907\u8fde\u63a5\u9519\u8bef"

    :goto_0
    return-object v0
.end method

.method public static d(I)Z
    .locals 1

    .line 18
    const/16 v0, 0xe1

    if-eq p0, v0, :cond_0

    const/16 v0, 0xe2

    if-eq p0, v0, :cond_0

    const/16 v0, 0xe3

    if-eq p0, v0, :cond_0

    const/16 v0, 0xe4

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
