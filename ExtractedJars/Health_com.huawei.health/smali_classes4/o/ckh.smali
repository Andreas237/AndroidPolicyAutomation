.class public Lo/ckh;
.super Ljava/lang/Object;


# instance fields
.field private a:Lo/ckk;

.field private b:Lo/cki;

.field private c:Lo/ckf;

.field private d:Ljava/lang/String;

.field private e:[Lo/cke;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ckh;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lo/ckf;)V
    .locals 0

    iput-object p1, p0, Lo/ckh;->c:Lo/ckf;

    return-void
.end method

.method public a(Lo/cki;)V
    .locals 0

    iput-object p1, p0, Lo/ckh;->b:Lo/cki;

    return-void
.end method

.method public a(Lo/ckk;)V
    .locals 0

    iput-object p1, p0, Lo/ckh;->a:Lo/ckk;

    return-void
.end method

.method public a()[Lo/cke;
    .locals 5

    iget-object v3, p0, Lo/ckh;->e:[Lo/cke;

    if-nez v3, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lo/cke;

    return-object v0

    :cond_0
    array-length v0, v3

    new-array v4, v0, [Lo/cke;

    array-length v0, v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v3, v1, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v4
.end method

.method public c()Lorg/json/JSONObject;
    .locals 10

    iget-object v0, p0, Lo/ckh;->e:[Lo/cke;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    iget-object v0, p0, Lo/ckh;->a:Lo/ckk;

    if-eqz v0, :cond_2

    const-string v4, ""

    iget-object v0, p0, Lo/ckh;->e:[Lo/cke;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/cke;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ckh;->e:[Lo/cke;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/cke;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuffer;

    const-string v0, "hmshi"

    invoke-direct {v5, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "qrt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lo/ckh;->a:Lo/ckk;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ckk;->b(Ljava/lang/String;)V

    :cond_1
    const-string v0, "header"

    iget-object v1, p0, Lo/ckh;->a:Lo/ckk;

    invoke-virtual {v1}, Lo/ckk;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    iget-object v0, p0, Lo/ckh;->b:Lo/cki;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/ckh;->c:Lo/ckf;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/ckh;->c:Lo/ckf;

    invoke-virtual {v0}, Lo/ckf;->b()Lorg/json/JSONObject;

    move-result-object v4

    const-string v0, "properties"

    iget-object v1, p0, Lo/ckh;->b:Lo/cki;

    invoke-virtual {v1}, Lo/cki;->d()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "events_common"

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/ckh;->e:[Lo/cke;

    array-length v0, v0

    if-ge v5, v0, :cond_4

    iget-object v0, p0, Lo/ckh;->e:[Lo/cke;

    aget-object v6, v0, v5

    invoke-virtual {v6}, Lo/cke;->d()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    const-string v0, "events"

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v0, "UTF-8"

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/cka;->e([B)[B

    move-result-object v6

    invoke-static {}, Lo/cjq;->c()[B

    move-result-object v7

    iget-object v0, p0, Lo/ckh;->d:Ljava/lang/String;

    invoke-static {v0, v7, v6}, Lo/cjq;->d(Ljava/lang/String;[B[B)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lo/cjq;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "event"

    invoke-virtual {v2, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "UploadData"

    const-string v1, "toJsonObj(): JSONException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "UploadData"

    const-string v1, "getBitZip(): UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-object v2
.end method

.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cke;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lo/ckh;->e:[Lo/cke;

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lo/cke;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/cke;

    iput-object v0, p0, Lo/ckh;->e:[Lo/cke;

    return-void
.end method
