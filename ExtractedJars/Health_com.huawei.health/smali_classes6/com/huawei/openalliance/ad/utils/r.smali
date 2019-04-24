.class public abstract Lcom/huawei/openalliance/ad/utils/r;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;I)V
    .locals 3

    const/4 v0, 0x4

    if-ge p1, v0, :cond_0

    const/4 p1, 0x4

    :cond_0
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ab;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "LogTool"

    const-string v1, "enable log failed, due to root path is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "HiAd"

    invoke-static {p1, v2, v0}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
