.class public Lcom/huawei/hwid/core/b/a/a/g;
.super Lcom/huawei/hwid/core/b/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/b/a/a/g$a;
    }
.end annotation


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 37
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 28
    const-string v0, "7"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->h:Ljava/lang/String;

    .line 34
    const-string v0, "/IUserPwdMng/verifyPassword"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->l:Ljava/lang/String;

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/g;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->m:Ljava/lang/String;

    .line 38
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/g;->a(Lcom/huawei/hwid/core/b/a/a$c;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 28
    const-string v0, "7"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->h:Ljava/lang/String;

    .line 34
    const-string v0, "/IUserPwdMng/verifyPassword"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->l:Ljava/lang/String;

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/g;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->m:Ljava/lang/String;

    .line 51
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/g;->a(Lcom/huawei/hwid/core/b/a/a$c;)V

    .line 52
    invoke-direct {p0, p3}, Lcom/huawei/hwid/core/b/a/a/g;->f(Ljava/lang/String;)V

    .line 53
    invoke-direct {p0, p2}, Lcom/huawei/hwid/core/b/a/a/g;->g(Ljava/lang/String;)V

    .line 54
    invoke-direct {p0, p4}, Lcom/huawei/hwid/core/b/a/a/g;->h(Ljava/lang/String;)V

    .line 55
    invoke-direct {p0, p5}, Lcom/huawei/hwid/core/b/a/a/g;->i(Ljava/lang/String;)V

    .line 56
    const v0, 0x42c2553

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/g;->b(I)V

    .line 57
    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/g;->j:Ljava/lang/String;

    .line 105
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/g;->i:Ljava/lang/String;

    .line 109
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/g;->k:Ljava/lang/String;

    .line 114
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/g;->h:Ljava/lang/String;

    .line 118
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 136
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/g$a;

    invoke-direct {v0, p1, p4}, Lcom/huawei/hwid/core/b/a/a/g$a;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/hwid/core/b/a/a/g;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V

    .line 137
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 127
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 10

    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    const-string v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 81
    :cond_0
    return-void

    .line 83
    :goto_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 84
    const/4 v4, 0x0

    .line 85
    const-string v5, ""

    .line 86
    move-object v6, v2

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 88
    const-string v0, "="

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 89
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const/4 v0, 0x0

    aget-object v5, v4, v0

    .line 86
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 92
    :cond_1
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->b:I

    .line 95
    :cond_2
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->b:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 96
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->b:I

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->c:I

    .line 99
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->d:Ljava/lang/String;

    .line 101
    :cond_3
    return-void
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

    .line 122
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 3

    .line 65
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 66
    const-string v0, "ver="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "acT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/g;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "ac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/g;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "pw="

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/g;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "clT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/g;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/g;->m:Ljava/lang/String;

    return-object v0
.end method
