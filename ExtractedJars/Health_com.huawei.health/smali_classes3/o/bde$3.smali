.class final Lo/bde$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bde;->d(Landroid/content/Context;J)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(JLandroid/content/Context;)V
    .locals 0

    .line 316
    iput-wide p1, p0, Lo/bde$3;->a:J

    iput-object p3, p0, Lo/bde$3;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 316
    invoke-virtual {p0, p1}, Lo/bde$3;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 320
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bde$3;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 321
    iget-object v0, p0, Lo/bde$3;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 322
    if-eqz v3, :cond_0

    .line 324
    iget-object v0, p0, Lo/bde$3;->c:Landroid/content/Context;

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 326
    :cond_0
    iget-object v0, p0, Lo/bde$3;->c:Landroid/content/Context;

    iget-wide v1, p0, Lo/bde$3;->a:J

    invoke-static {v0, v3, v1, v2, v4}, Lo/bde;->e(Landroid/content/Context;Lcom/huawei/health/sns/model/user/User;JLjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v5

    .line 327
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 328
    const/4 v0, 0x1

    const v1, 0x310dc

    invoke-static {v0, v1, v5}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 330
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
