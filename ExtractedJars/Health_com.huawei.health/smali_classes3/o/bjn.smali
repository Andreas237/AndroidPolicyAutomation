.class public Lo/bjn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 24
    if-nez p0, :cond_0

    .line 26
    const-string v0, ""

    return-object v0

    .line 28
    :cond_0
    move-object v5, p0

    .line 29
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->k()I

    move-result v6

    .line 30
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v6, :cond_1

    .line 32
    const/4 v0, 0x0

    invoke-virtual {v5, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 33
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v7

    .line 34
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_share_textmsg_too_long:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 35
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 34
    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 36
    invoke-static {v7, v8}, Lo/brh;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 38
    :cond_1
    return-object v5
.end method
