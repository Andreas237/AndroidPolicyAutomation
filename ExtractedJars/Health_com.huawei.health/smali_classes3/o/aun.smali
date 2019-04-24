.class public Lo/aun;
.super Lo/auo;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Lo/auo;-><init>()V

    .line 55
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lo/aun;->h:Ljava/lang/String;

    .line 139
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lo/aun;->f:Ljava/lang/String;

    .line 151
    return-object v0
.end method

.method public c([B)V
    .locals 6

    .line 65
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 67
    :cond_0
    return-void

    .line 69
    :cond_1
    new-instance v3, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v3, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 70
    const-string v0, "MediaUploadRsp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parserUploadPicPath \u89e3\u6790\u4e0a\u4f20\u56fe\u7247\u5230MTS\u670d\u52a1\u5668\u8fd4\u56de\u7684\u7ed3\u679c:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 73
    const/4 v4, 0x0

    .line 76
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 77
    const-string v0, "errcode"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/aun;->c:I

    .line 78
    const-string v0, "errmsg"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aun;->d:Ljava/lang/String;

    .line 79
    const-string v0, "res"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/aun;->b:I

    .line 81
    iget v0, p0, Lo/aun;->b:I

    if-eqz v0, :cond_2

    .line 83
    const-string v0, "MediaUploadRsp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "upload picture error. resCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aun;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 84
    return-void

    .line 86
    :cond_2
    const-string v0, "mid"

    :try_start_1
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aun;->a:Ljava/lang/String;

    .line 87
    const-string v0, "url"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aun;->e:Ljava/lang/String;

    .line 88
    const-string v0, "thumb_flag"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aun;->h:Ljava/lang/String;

    .line 89
    const-string v0, "forwardUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aun;->f:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 98
    goto :goto_0

    .line 91
    :catch_0
    move-exception v5

    .line 93
    const-string v0, "MediaUploadRsp"

    const-string v1, "upload picture error. prase response res code error "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    goto :goto_0

    .line 95
    :catch_1
    move-exception v5

    .line 97
    const-string v0, "MediaUploadRsp"

    const-string v1, "upload picture error. JSONException. "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :goto_0
    goto :goto_1

    .line 102
    :cond_3
    const-string v0, "MediaUploadRsp"

    const-string v1, "upload picture error. server response data is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :goto_1
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lo/aun;->e:Ljava/lang/String;

    .line 127
    return-object v0
.end method
