.class public Lcom/huawei/hwid/core/b/a/a/c;
.super Lcom/huawei/hwid/core/b/a/a;
.source "SourceFile"


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/serviceLogout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/c;->l:Ljava/lang/String;

    .line 51
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/c;->h:Ljava/lang/String;

    .line 52
    iput-object p2, p0, Lcom/huawei/hwid/core/b/a/a/c;->i:Ljava/lang/String;

    .line 53
    iput-object p3, p0, Lcom/huawei/hwid/core/b/a/a/c;->j:Ljava/lang/String;

    .line 55
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/hwid/core/helper/handler/a;)V
    .locals 1

    .line 145
    invoke-virtual {p0, p1, p2, p4}, Lcom/huawei/hwid/core/b/a/a/c;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V

    .line 146
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/m;->a([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 83
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 84
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v3, :cond_4

    .line 85
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 86
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    .line 90
    :pswitch_0
    const-string v0, "result"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v2, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/c;->b:I

    .line 94
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/c;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 96
    const-string v0, "delTGCCount"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/c;->k:Ljava/lang/String;

    goto :goto_1

    .line 104
    :cond_1
    const-string v0, "errorCode"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/c;->c:I

    goto :goto_1

    .line 106
    :cond_2
    const-string v0, "errorDesc"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 107
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/c;->d:Ljava/lang/String;

    goto :goto_1

    .line 113
    :pswitch_1
    nop

    .line 117
    .line 122
    :cond_3
    :goto_1
    :pswitch_2
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 123
    goto/16 :goto_0

    .line 125
    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public d()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 59
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 60
    invoke-static {v2}, Lcom/huawei/hwid/core/d/m;->a(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v3

    .line 61
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 63
    const-string v0, "ServiceLogoutReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 65
    const-string v0, "version"

    const-string v1, "12000"

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/c;->h:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "appID"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/c;->i:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v0, "tokenOrST"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/c;->j:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v0, "ServiceLogoutReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 72
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 74
    const-string v0, "UTF-8"

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 77
    return-object v4
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/c;->l:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 3

    .line 150
    invoke-super {p0}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v2

    .line 151
    const-string v0, "delCount"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/c;->k:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    return-object v2
.end method
