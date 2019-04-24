.class final Lcom/huawei/operation/OpAnalyticsUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/OpAnalyticsUtil;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$builder:Lo/cjy$b;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/cjy$b;Landroid/content/Context;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$builder:Lo/cjy$b;

    iput-object p2, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 3

    .line 92
    const-string v0, "OpAnalyticsUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCallBackFail i = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 3

    .line 51
    const-string v0, "Login_OpAnalyticsUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getUrl success isFirstInit = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lo/cjz;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const-string v0, "OpAnalyticsUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "url"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cxg;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-static {}, Lo/cjz;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 54
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$builder:Lo/cjy$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 56
    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 57
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cjy$b;->c(Z)Lo/cjy$b;

    move-result-object v0

    .line 58
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->b(Z)Lo/cjy$b;

    move-result-object v0

    .line 59
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->e(Z)Lo/cjy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$context:Landroid/content/Context;

    .line 60
    invoke-static {v1}, Lo/dbf;->H(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cjy$b;->a(Ljava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lo/cjy$b;->c()V

    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$builder:Lo/cjy$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 64
    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 65
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->c(Z)Lo/cjy$b;

    move-result-object v0

    .line 66
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->b(Z)Lo/cjy$b;

    move-result-object v0

    .line 67
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->e(Z)Lo/cjy$b;

    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lo/cjy$b;->c()V

    goto :goto_0

    .line 71
    :cond_1
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$builder:Lo/cjy$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 73
    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 74
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cjy$b;->c(Z)Lo/cjy$b;

    move-result-object v0

    .line 75
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->b(Z)Lo/cjy$b;

    move-result-object v0

    .line 76
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->e(Z)Lo/cjy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$context:Landroid/content/Context;

    .line 77
    invoke-static {v1}, Lo/dbf;->H(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cjy$b;->a(Ljava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 78
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->a(Z)V

    goto :goto_0

    .line 80
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/OpAnalyticsUtil$1;->val$builder:Lo/cjy$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 81
    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    .line 82
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->c(Z)Lo/cjy$b;

    move-result-object v0

    .line 83
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->b(Z)Lo/cjy$b;

    move-result-object v0

    .line 84
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->e(Z)Lo/cjy$b;

    move-result-object v0

    .line 85
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->a(Z)V

    .line 88
    :goto_0
    return-void
.end method
