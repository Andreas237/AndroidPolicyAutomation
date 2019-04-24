.class public Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final JAVA_SCRIPT:Ljava/lang/String; = "javascript:"

.field private static final TAG:Ljava/lang/String; = "Opera_JSRegisterFuctionResUti"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static callBackResStatus(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 12
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    :cond_0
    const-string v0, "Opera_JSRegisterFuctionResUti"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "param is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    return-void

    .line 16
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 17
    new-instance v0, Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil$1;

    invoke-direct {v0, p0, v4}, Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil$1;-><init>(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 23
    return-void
.end method
