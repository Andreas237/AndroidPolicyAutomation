.class public Lcom/huawei/hwid/core/b/a/a/b;
.super Lcom/huawei/hwid/core/b/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/b/a/a/b$a;
    }
.end annotation


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 83
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/opLog"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/b;->h:Ljava/lang/String;

    .line 84
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/b;->d(I)V

    .line 85
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/b;->i:Ljava/lang/String;

    .line 86
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 2

    .line 90
    invoke-virtual {p2}, Lcom/huawei/hwid/core/b/a/a;->r()I

    move-result v0

    if-gtz v0, :cond_1

    .line 92
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    .line 93
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    invoke-static {p1}, Lcom/huawei/hwid/core/d/h;->a(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/huawei/hwid/core/b/a/a;->c(I)V

    goto :goto_0

    .line 98
    :cond_0
    const-string v0, "OpLogRequest"

    const-string v1, "has alreacdy accountName logined in"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwid/core/b/a/a/b$a;

    invoke-direct {v1, p1}, Lcom/huawei/hwid/core/b/a/a/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v1}, Lcom/huawei/hwid/core/b/a/a/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v1

    invoke-static {v0, p2, p3, v1}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V

    .line 102
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

    .line 45
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/m;->a([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 46
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 48
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v3, :cond_3

    .line 49
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 50
    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    .line 52
    :sswitch_0
    goto :goto_1

    .line 55
    :sswitch_1
    const-string v0, "result"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v2, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/b;->b:I

    .line 58
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/b;->b:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 59
    const-string v0, "errorCode"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/b;->c:I

    goto :goto_1

    .line 61
    :cond_1
    const-string v0, "errorDesc"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/b;->d:Ljava/lang/String;

    .line 69
    :cond_2
    :goto_1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 70
    goto/16 :goto_0

    .line 71
    :cond_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public d()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 1

    .line 80
    invoke-super {p0}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
