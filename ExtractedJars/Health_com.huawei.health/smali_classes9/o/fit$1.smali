.class Lo/fit$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fit;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fit;


# direct methods
.method constructor <init>(Lo/fit;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lo/fit$1;->d:Lo/fit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 333
    iget-object v0, p0, Lo/fit$1;->d:Lo/fit;

    const-string v1, "https://healthdata.hicloud.com/dataOpen/weixin/createQrcodeTicketsNew"

    invoke-static {v0, v1}, Lo/fit;->e(Lo/fit;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 334
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket ticketStr is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    const-string v5, ""

    .line 337
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 338
    const-string v0, "ticket"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 341
    goto :goto_0

    .line 339
    :catch_0
    move-exception v6

    .line 340
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket ticketStr JSONException,e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    :cond_0
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket getTicketByMac failed ! being use SN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lo/fit$1;->d:Lo/fit;

    invoke-static {v0}, Lo/fit;->e(Lo/fit;)V

    goto :goto_2

    .line 347
    :cond_1
    const-string v6, ""

    .line 349
    :try_start_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 350
    const-string v0, "resultCode"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 351
    if-eqz v6, :cond_2

    const-string v0, "601010"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 352
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket ticketStr account changed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lo/fit$1;->d:Lo/fit;

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 354
    iget-object v0, p0, Lo/fit$1;->d:Lo/fit;

    invoke-static {v0}, Lo/fit;->d(Lo/fit;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xcd

    invoke-virtual {v0, v1, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v8

    .line 355
    iget-object v0, p0, Lo/fit$1;->d:Lo/fit;

    invoke-static {v0}, Lo/fit;->d(Lo/fit;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 356
    goto :goto_1

    .line 357
    :cond_2
    iget-object v0, p0, Lo/fit$1;->d:Lo/fit;

    invoke-static {v0, v5}, Lo/fit;->d(Lo/fit;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 361
    :goto_1
    goto :goto_2

    .line 359
    :catch_1
    move-exception v7

    .line 360
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doQrcodeTicket ticketStr JSONException,e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :goto_2
    return-void
.end method
