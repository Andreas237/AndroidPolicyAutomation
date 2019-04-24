.class public Lcom/huawei/feedback/logic/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "AppLogApi/CaptureThirdAPPThread"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Landroid/os/Bundle;

.field private i:Ljava/io/BufferedWriter;

.field private j:Landroid/os/Handler;

.field private k:Landroid/content/Context;

.field private l:Z

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/ArrayList;Landroid/os/Handler;Landroid/content/Context;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/ArrayList<Ljava/lang/String;>;Landroid/os/Handler;Landroid/content/Context;Z)V"
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->b:Ljava/lang/String;

    .line 38
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->c:Ljava/lang/String;

    .line 39
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    .line 40
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->e:Ljava/lang/String;

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->f:Ljava/lang/String;

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->g:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->h:Landroid/os/Bundle;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->j:Landroid/os/Handler;

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/a;->l:Z

    .line 65
    iput-object p1, p0, Lcom/huawei/feedback/logic/a;->b:Ljava/lang/String;

    .line 66
    iput-object p2, p0, Lcom/huawei/feedback/logic/a;->c:Ljava/lang/String;

    .line 67
    iput-object p3, p0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    .line 68
    iput-object p4, p0, Lcom/huawei/feedback/logic/a;->e:Ljava/lang/String;

    .line 69
    iput-object p5, p0, Lcom/huawei/feedback/logic/a;->h:Landroid/os/Bundle;

    .line 70
    iput-object p7, p0, Lcom/huawei/feedback/logic/a;->j:Landroid/os/Handler;

    .line 71
    iput-object p8, p0, Lcom/huawei/feedback/logic/a;->k:Landroid/content/Context;

    .line 72
    iput-object p6, p0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    .line 73
    iput-boolean p9, p0, Lcom/huawei/feedback/logic/a;->l:Z

    .line 74
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLandroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;ZLandroid/content/Context;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->b:Ljava/lang/String;

    .line 38
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->c:Ljava/lang/String;

    .line 39
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    .line 40
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->e:Ljava/lang/String;

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->f:Ljava/lang/String;

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->g:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->h:Landroid/os/Bundle;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/a;->j:Landroid/os/Handler;

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/a;->l:Z

    .line 52
    iput-object p1, p0, Lcom/huawei/feedback/logic/a;->b:Ljava/lang/String;

    .line 53
    iput-object p2, p0, Lcom/huawei/feedback/logic/a;->c:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    .line 55
    iput-object p4, p0, Lcom/huawei/feedback/logic/a;->e:Ljava/lang/String;

    .line 56
    iput-object p5, p0, Lcom/huawei/feedback/logic/a;->f:Ljava/lang/String;

    .line 57
    iput-object p6, p0, Lcom/huawei/feedback/logic/a;->g:Ljava/lang/String;

    .line 58
    iput-object p7, p0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    .line 59
    iput-boolean p8, p0, Lcom/huawei/feedback/logic/a;->l:Z

    .line 60
    iput-object p9, p0, Lcom/huawei/feedback/logic/a;->k:Landroid/content/Context;

    .line 61
    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 18

    .line 182
    const-string v0, "LogVersion"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 183
    const-string v0, "LogSubversion"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 184
    const-string v0, "ProductName"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 185
    const-string v0, "ProductVersion"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 186
    const-string v0, "SN"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 187
    const-string v0, "IMEI"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 188
    const-string v0, "MetaData"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 189
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 191
    const-string v0, "LogVersion"

    :try_start_0
    invoke-virtual {v10, v0, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 192
    const-string v0, "LogSubversion"

    invoke-virtual {v10, v0, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    const-string v0, "ProductName"

    invoke-virtual {v10, v0, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 194
    const-string v0, "ProductVersion"

    invoke-virtual {v10, v0, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    const-string v0, "SN"

    invoke-virtual {v10, v0, v7}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    const-string v0, "IMEI"

    invoke-virtual {v10, v0, v8}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    goto :goto_0

    .line 197
    :catch_0
    move-exception v11

    .line 199
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "creatEventlog JSONException!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    :goto_0
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    .line 203
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    .line 204
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 205
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 207
    :cond_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/eventinfo.log"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v13, v0

    .line 213
    const/4 v14, 0x0

    .line 215
    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v14, v0

    .line 216
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    const-string v2, "UTF-8"

    invoke-direct {v1, v14, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    invoke-virtual {v0, v9}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 230
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    invoke-static {v14, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileOutputStream;Ljava/lang/String;)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_2

    .line 233
    move-object/from16 v0, p0

    :try_start_2
    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 236
    goto/16 :goto_2

    .line 234
    :catch_1
    move-exception v15

    .line 235
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "shutdown IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    goto/16 :goto_2

    .line 220
    :catch_2
    move-exception v15

    .line 222
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "creatEventlog FileNotFoundException!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 230
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    invoke-static {v14, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileOutputStream;Ljava/lang/String;)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_2

    .line 233
    move-object/from16 v0, p0

    :try_start_4
    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 236
    goto/16 :goto_2

    .line 234
    :catch_3
    move-exception v15

    .line 235
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "shutdown IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    goto/16 :goto_2

    .line 223
    :catch_4
    move-exception v15

    .line 225
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "creatEventlog UnsupportedEncodingException!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 230
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    invoke-static {v14, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileOutputStream;Ljava/lang/String;)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_2

    .line 233
    move-object/from16 v0, p0

    :try_start_6
    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 236
    goto :goto_2

    .line 234
    :catch_5
    move-exception v15

    .line 235
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "shutdown IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    goto :goto_2

    .line 226
    :catch_6
    move-exception v15

    .line 228
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    :try_start_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "creatEventlog IOException!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 230
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    invoke-static {v14, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileOutputStream;Ljava/lang/String;)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_2

    .line 233
    move-object/from16 v0, p0

    :try_start_8
    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 236
    goto :goto_2

    .line 234
    :catch_7
    move-exception v15

    .line 235
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "shutdown IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    goto :goto_2

    .line 230
    :catchall_0
    move-exception v16

    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    invoke-static {v14, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileOutputStream;Ljava/lang/String;)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_1

    .line 233
    move-object/from16 v0, p0

    :try_start_9
    iget-object v0, v0, Lcom/huawei/feedback/logic/a;->i:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 236
    goto :goto_1

    .line 234
    :catch_8
    move-exception v17

    .line 235
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "shutdown IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    :cond_1
    :goto_1
    throw v16

    .line 240
    :cond_2
    :goto_2
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/os/Handler;)V
    .locals 6

    .line 145
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 147
    invoke-static {p1}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 148
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 150
    iget-boolean v0, p0, Lcom/huawei/feedback/logic/a;->l:Z

    iget-object v1, p0, Lcom/huawei/feedback/logic/a;->k:Landroid/content/Context;

    invoke-static {p3, v3, v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(Ljava/io/File;Ljava/lang/String;ZLandroid/content/Context;)Ljava/io/File;

    move-result-object v4

    .line 152
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-direct {p0, v4, v5}, Lcom/huawei/feedback/logic/a;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 155
    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    .line 156
    const/4 v0, 0x1

    invoke-virtual {p4, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 159
    :cond_0
    goto :goto_0

    .line 160
    :cond_1
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "encryptKey null,encryptFile failed!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :cond_2
    :goto_0
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 166
    const/4 v3, 0x0

    :goto_1
    const/4 v0, 0x2

    if-ge v3, v0, :cond_4

    .line 167
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    move-result v4

    .line 168
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resultZipFile delete success ? "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    if-eqz v4, :cond_3

    .line 170
    goto :goto_2

    .line 166
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 174
    :cond_4
    :goto_2
    return-void
.end method

.method private a(Ljava/io/File;Ljava/io/File;)Z
    .locals 1

    .line 141
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 78
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    sget-object v0, Lcom/huawei/feedback/d;->aq:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/feedback/logic/a;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/feedback/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->g:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/feedback/logic/a;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/feedback/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/feedback/logic/a;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "feedbackuploadlogs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 86
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->f:Ljava/lang/String;

    invoke-static {v3, v0}, Lcom/huawei/feedback/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->h:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 90
    new-instance v3, Lcom/huawei/feedback/a/a/a;

    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->k:Landroid/content/Context;

    invoke-direct {v3, v0}, Lcom/huawei/feedback/a/a/a;-><init>(Landroid/content/Context;)V

    .line 91
    sget-object v4, Lcom/huawei/feedback/d;->ag:Ljava/lang/Object;

    monitor-enter v4

    .line 93
    :try_start_0
    invoke-static {v3}, Lcom/huawei/feedback/a/a/b;->a(Lcom/huawei/feedback/a/a/a;)Ljava/util/List;

    move-result-object v5

    .line 94
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1f4

    if-lt v0, v1, :cond_1

    .line 95
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "logList size over max length!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    monitor-exit v4

    return-void

    .line 98
    :cond_1
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 99
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->h:Landroid/os/Bundle;

    invoke-direct {p0, v0}, Lcom/huawei/feedback/logic/a;->a(Landroid/os/Bundle;)V

    .line 101
    :cond_2
    const/4 v3, 0x0

    .line 102
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 103
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "logwritePathList"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->m:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/huawei/feedback/e;->a(Ljava/util/ArrayList;)[Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 105
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 106
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "logwritePath"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/feedback/e;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 109
    :cond_4
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v3, :cond_5

    .line 110
    return-void

    .line 113
    :cond_5
    array-length v4, v3

    .line 114
    if-lez v4, :cond_9

    .line 115
    new-array v5, v4, [Ljava/io/File;

    .line 116
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v4, :cond_6

    .line 117
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fileName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, v3, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    new-instance v0, Ljava/io/File;

    aget-object v1, v3, v6

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object v0, v5, v6

    .line 116
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 120
    :cond_6
    new-instance v6, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->c:Ljava/lang/String;

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 121
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "waitUploadZipfile"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const/4 v7, 0x0

    :goto_3
    const/4 v0, 0x2

    if-ge v7, v0, :cond_9

    .line 124
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->k:Landroid/content/Context;

    invoke-static {v5, v6, v0}, Lcom/huawei/feedback/e;->a([Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Z

    move-result v8

    .line 125
    if-eqz v8, :cond_7

    .line 126
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "waitUploadZipfile zipflag good"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/feedback/logic/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/feedback/logic/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/feedback/logic/a;->j:Landroid/os/Handler;

    invoke-direct {p0, v0, v1, v6, v2}, Lcom/huawei/feedback/logic/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/os/Handler;)V

    .line 128
    goto :goto_4

    .line 131
    :cond_7
    const/4 v0, 0x1

    if-ne v7, v0, :cond_8

    .line 133
    const-string v0, "AppLogApi/CaptureThirdAPPThread"

    const-string v1, "zipflag fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 138
    :cond_9
    :goto_4
    return-void
.end method
