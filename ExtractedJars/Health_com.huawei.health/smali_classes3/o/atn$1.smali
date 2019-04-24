.class final Lo/atn$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atn;->e(Landroid/app/Activity;Lo/atn;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lo/atn;


# direct methods
.method constructor <init>(Lo/atn;Landroid/app/Activity;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/atn$1;->b:Lo/atn;

    iput-object p2, p0, Lo/atn$1;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 101
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/atn$1;->b:Lo/atn;

    invoke-static {v1}, Lo/atn;->e(Lo/atn;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 102
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 107
    iget-object v0, p0, Lo/atn$1;->a:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 108
    return-void
.end method
