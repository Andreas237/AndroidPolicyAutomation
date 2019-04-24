.class public Lcom/huawei/hwid/core/b/a/a/e;
.super Lcom/huawei/hwid/core/b/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/b/a/a/e$a;,
        Lcom/huawei/hwid/core/b/a/a/e$b;
    }
.end annotation


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:I

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 82
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 54
    const-string v0, "com.huawei.hwid"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->j:Ljava/lang/String;

    .line 56
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->l:I

    .line 63
    const-string v0, "/IUserPwdMng/uidVerifyPassword"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->s:Ljava/lang/String;

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->t:Ljava/lang/String;

    .line 84
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->v:Landroid/content/Context;

    .line 85
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/e;->a(Lcom/huawei/hwid/core/b/a/a$c;)V

    .line 86
    invoke-direct {p0, p4}, Lcom/huawei/hwid/core/b/a/a/e;->g(Ljava/lang/String;)V

    .line 90
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    invoke-direct {p0, p3}, Lcom/huawei/hwid/core/b/a/a/e;->f(Ljava/lang/String;)V

    .line 93
    :cond_0
    invoke-direct {p0, p2}, Lcom/huawei/hwid/core/b/a/a/e;->h(Ljava/lang/String;)V

    .line 99
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->b()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v2

    .line 100
    if-eqz v2, :cond_1

    .line 101
    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/e;->c(I)V

    .line 103
    :cond_1
    invoke-direct {p0, p5}, Lcom/huawei/hwid/core/b/a/a/e;->i(Ljava/lang/String;)V

    .line 104
    invoke-direct {p0, p7}, Lcom/huawei/hwid/core/b/a/a/e;->j(Ljava/lang/String;)V

    .line 105
    invoke-direct {p0, p8}, Lcom/huawei/hwid/core/b/a/a/e;->k(Ljava/lang/String;)V

    .line 106
    invoke-direct {p0, p9}, Lcom/huawei/hwid/core/b/a/a/e;->l(Ljava/lang/String;)V

    .line 107
    const v0, 0x42c2553

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/e;->b(I)V

    .line 108
    const v0, 0x42c258a

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/e;->b(I)V

    .line 109
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/HashMap;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 200
    const-string v0, "salt"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    const-string v0, "salt"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 202
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->u:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->u:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    new-instance v4, Lcom/huawei/hwid/core/b/a/a/e$a;

    invoke-direct {v4, p1}, Lcom/huawei/hwid/core/b/a/a/e$a;-><init>(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v4}, Lcom/huawei/hwid/core/b/a/a/e$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v4, Lcom/huawei/hwid/core/b/a/a/e$a;->a:Ljava/lang/String;

    iget-object v1, v4, Lcom/huawei/hwid/core/b/a/a/e$a;->b:Ljava/lang/String;

    const-string v2, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp/+96hx/XKdWBKS6yh14vERYLhg84G52FNXS1YKEll0VFdMHAVWRZlOLguYptqd+1LZePWvgXUEXws+/ibetjhBWG0n85UyhSC8r0g4/gRTQcNna0HbPRx9WMS2XkMWD33T24BZSuEnPOBjOwJrHCVnJDqZVrw3g+gfYygXo1KVJOM0VRA97zbQxsLQIZhTj7DUG5ySj5ltrPVmpLydppYQxp+JUG2vwo2ifqYvcPzVjRcw44rK1gT6d+DHeziw7ZmnOwog2uUyDULNbMWc1e4RFYssRS8yV2vSJNyTKwZw5IdfPBBCpoX9M7Fp6ivUkZVEtVJQHXcompv37KxoUVwIDAQAB"

    invoke-static {v0, v1, v2}, Lo/uy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    const/4 v0, 0x1

    return v0

    .line 209
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->j:Ljava/lang/String;

    .line 114
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->i:Ljava/lang/String;

    .line 214
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->h:Ljava/lang/String;

    .line 218
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->k:Ljava/lang/String;

    .line 222
    return-void
.end method

.method private j(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->n:Ljava/lang/String;

    .line 226
    return-void
.end method

.method private k(Ljava/lang/String;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->p:Ljava/lang/String;

    .line 230
    return-void
.end method

.method private l(Ljava/lang/String;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/e;->o:Ljava/lang/String;

    .line 234
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 253
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/e$b;

    invoke-direct {v0, p1, p4}, Lcom/huawei/hwid/core/b/a/a/e$b;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/hwid/core/b/a/a/e;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V

    .line 254
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

    .line 124
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 10

    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    const-string v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 157
    :cond_0
    return-void

    .line 159
    :goto_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 160
    const/4 v4, 0x0

    .line 161
    const-string v5, ""

    .line 162
    move-object v6, v2

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 164
    const-string v0, "="

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 165
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const/4 v0, 0x0

    aget-object v5, v4, v0

    .line 162
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 168
    :cond_1
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 169
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->b:I

    .line 171
    :cond_2
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 172
    const-string v0, "userID"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->r:Ljava/lang/String;

    .line 173
    const-string v0, "st"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->m:Ljava/lang/String;

    .line 174
    const-string v0, "siteID"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 176
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->q:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    goto :goto_2

    .line 177
    :catch_0
    move-exception v7

    .line 178
    const-string v0, "TGC"

    const-string v1, "pares siteId Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :goto_2
    invoke-direct {p0, p1, v3}, Lcom/huawei/hwid/core/b/a/a/e;->a(Ljava/lang/String;Ljava/util/HashMap;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 183
    const v0, 0x42c2553

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->b:I

    .line 184
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->b:I

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->c:I

    .line 185
    const-string v0, "Failed to verify signature."

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->d:Ljava/lang/String;

    .line 186
    const-string v0, "UidVerifyPasswordRequest"

    const-string v1, "Failed to verify the digital signature of VerifyPassword response."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    :cond_3
    goto :goto_3

    .line 189
    :cond_4
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->b:I

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->c:I

    .line 192
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->d:Ljava/lang/String;

    .line 194
    :goto_3
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

    .line 118
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 3

    .line 134
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 135
    const-string v0, "ver="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "pw="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "clT="

    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "dvT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "dvID="

    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "fg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 138
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    const-string v0, "&"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "dvID2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 141
    :cond_0
    invoke-static {}, Lo/uy;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->u:Ljava/lang/String;

    .line 142
    const-string v0, "&salt="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->t:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 3

    .line 243
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->v:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/encrypt/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e;->m:Ljava/lang/String;

    .line 244
    invoke-super {p0}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v2

    .line 245
    const-string v0, "serviceToken"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->m:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->r:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    const-string v0, "siteID"

    iget v1, p0, Lcom/huawei/hwid/core/b/a/a/e;->q:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 248
    return-object v2
.end method
