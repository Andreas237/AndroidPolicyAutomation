.class Lo/eud$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eud;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:Ljava/lang/StringBuffer;

.field final synthetic c:Lo/eud;


# direct methods
.method constructor <init>(Lo/eud;Ljava/util/concurrent/CountDownLatch;Ljava/lang/StringBuffer;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lo/eud$4;->c:Lo/eud;

    iput-object p2, p0, Lo/eud$4;->a:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lo/eud$4;->b:Ljava/lang/StringBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    .line 227
    iget-object v0, p0, Lo/eud$4;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 228
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 6

    .line 207
    move-object v4, p1

    :try_start_0
    check-cast v4, Lorg/json/JSONObject;

    .line 208
    const-string v0, "nickname"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 209
    iget-object v0, p0, Lo/eud$4;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 218
    goto :goto_0

    .line 211
    :catch_0
    move-exception v4

    .line 213
    invoke-static {}, Lo/eud;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onComplete JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    goto :goto_0

    .line 215
    :catch_1
    move-exception v4

    .line 217
    invoke-static {}, Lo/eud;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onComplete Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    :goto_0
    iget-object v0, p0, Lo/eud$4;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 220
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 1

    .line 197
    iget-object v0, p0, Lo/eud$4;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 198
    return-void
.end method
