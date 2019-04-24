.class final Lo/aru$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aru;->c(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aru;

.field final synthetic c:Landroid/os/Handler;

.field final synthetic d:Lcom/huawei/health/sns/model/user/User;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lo/aru$3;->a:Lo/aru;

    iput-object p2, p0, Lo/aru$3;->d:Lcom/huawei/health/sns/model/user/User;

    iput p3, p0, Lo/aru$3;->e:I

    iput-object p4, p0, Lo/aru$3;->c:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 189
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/aru$3;->a:Lo/aru;

    iget-object v2, p0, Lo/aru$3;->d:Lcom/huawei/health/sns/model/user/User;

    iget v3, p0, Lo/aru$3;->e:I

    iget-object v4, p0, Lo/aru$3;->c:Landroid/os/Handler;

    invoke-static {v1, v2, v3, v4}, Lo/aru;->a(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 190
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 196
    return-void
.end method
