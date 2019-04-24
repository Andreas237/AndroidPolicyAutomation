.class Lo/asv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asv;->b(Landroid/content/Context;Lcom/huawei/health/sns/model/group/Group;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/asv;

.field final synthetic d:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/asv;ZLcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/asv$4;->b:Lo/asv;

    iput-boolean p2, p0, Lo/asv$4;->e:Z

    iput-object p3, p0, Lo/asv$4;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 86
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asv$4$5;

    invoke-direct {v1, p0}, Lo/asv$4$5;-><init>(Lo/asv$4;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 140
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 145
    iget-object v0, p0, Lo/asv$4;->b:Lo/asv;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/asv;->a(Lo/asv;III)V

    .line 146
    return-void
.end method
