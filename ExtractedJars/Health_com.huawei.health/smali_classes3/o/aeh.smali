.class public Lo/aeh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private b:Ljava/lang/String;

.field private e:B


# direct methods
.method public constructor <init>(B)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-byte p1, p0, Lo/aeh;->e:B

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 14
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 16
    :pswitch_0
    const-string v0, "\u8840\u538b\u6a21\u5757\u81ea\u68c0\u9519\u8bef\uff0c\u53ef\u80fd\u662f\u4f20\u611f\u5668\u6216A/D\u9519\u8bef"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 17
    goto :goto_1

    .line 19
    :pswitch_1
    const-string v0, "\u8896\u5e26\u677e\u6216\u8005\u672a\u8fde\u63a5\u8896\u5e26"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 20
    goto :goto_1

    .line 22
    :pswitch_2
    const-string v0, "\u6f0f\u6c14\uff08\u9600\u95e8\u7b49\u5904\uff09"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 23
    goto :goto_1

    .line 25
    :pswitch_3
    const-string v0, "\u6c14\u538b\u9519\u8bef\uff08\u53ef\u80fd\u662f\u9600\u95e8\u6ca1\u6709\u6b63\u5e38\u6253\u5f00\uff09"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 28
    :pswitch_4
    const-string v0, "\u5f31\u4fe1\u53f7\uff08\u53ef\u80fd\u662f\u8896\u5e26\u592a\u677e\u7b49, \u53ef\u80fd\u4e0e\u9519\u8bef0x02\u6709\u5173\uff09"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 29
    goto :goto_1

    .line 31
    :pswitch_5
    const-string v0, "\u8d85\u8303\u56f4 \uff08\u6d4b\u91cf\u5bf9\u8c61\u8d85\u8fc7\u8bbe\u5907\u6d4b\u91cf\u8303\u56f4\uff09"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 32
    goto :goto_1

    .line 34
    :pswitch_6
    const-string v0, "\u8fc7\u5206\u8fd0\u52a8\uff08\u6709\u4fe1\u53f7\u5e72\u6270\u7b49\uff09"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 35
    goto :goto_1

    .line 37
    :pswitch_7
    const-string v0, "\u8fc7\u538b"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 38
    goto :goto_1

    .line 40
    :pswitch_8
    const-string v0, "\u4fe1\u53f7\u9971\u548c"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 41
    goto :goto_1

    .line 43
    :pswitch_9
    const-string v0, "\u6f0f\u6c14\uff08\u7c7b\u4f3c\u4e8e\u9519\u8bef0x03\uff09"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 44
    goto :goto_1

    .line 46
    :pswitch_a
    const-string v0, "\u7cfb\u7edf\u9519\u8bef"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 47
    goto :goto_1

    .line 49
    :pswitch_b
    const-string v0, "\u6d4b\u91cf\u8d85\u65f6"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 50
    goto :goto_1

    .line 52
    :goto_0
    :pswitch_c
    const-string v0, "\u672a\u77e5\u9519\u8bef"

    iput-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    .line 56
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/aeh;->b:Ljava/lang/String;

    return-object v0
.end method
