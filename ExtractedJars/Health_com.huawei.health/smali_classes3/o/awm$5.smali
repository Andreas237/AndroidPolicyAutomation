.class final Lo/awm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awm;->b(Landroid/content/Context;Lo/awm$d;Lo/aws;Lo/bfh;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lo/awm$d;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/bfh;

.field final synthetic i:Lo/aws;


# direct methods
.method constructor <init>(Lo/awm$d;Ljava/lang/String;Landroid/content/Context;Lo/bfh;Ljava/lang/String;Lo/aws;)V
    .locals 0

    .line 374
    iput-object p1, p0, Lo/awm$5;->b:Lo/awm$d;

    iput-object p2, p0, Lo/awm$5;->d:Ljava/lang/String;

    iput-object p3, p0, Lo/awm$5;->a:Landroid/content/Context;

    iput-object p4, p0, Lo/awm$5;->e:Lo/bfh;

    iput-object p5, p0, Lo/awm$5;->c:Ljava/lang/String;

    iput-object p6, p0, Lo/awm$5;->i:Lo/aws;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/EditText;)V
    .locals 0

    .line 396
    return-void
.end method

.method public d(Landroid/widget/EditText;)V
    .locals 5

    .line 378
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 379
    iget-object v0, p0, Lo/awm$5;->b:Lo/awm$d;

    if-eqz v0, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 381
    :cond_0
    return-void

    .line 383
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 385
    iget-object v0, p0, Lo/awm$5;->d:Ljava/lang/String;

    invoke-static {v0, v4}, Lo/awm;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    iget-object v0, p0, Lo/awm$5;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/awm$5;->e:Lo/bfh;

    iget-object v2, p0, Lo/awm$5;->b:Lo/awm$d;

    iget-object v3, p0, Lo/awm$5;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v4, v3}, Lo/awm;->d(Landroid/content/Context;Lo/bfh;Lo/awm$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    iget-object v0, p0, Lo/awm$5;->i:Lo/aws;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 389
    iget-object v0, p0, Lo/awm$5;->i:Lo/aws;

    invoke-interface {v0}, Lo/aws;->c()V

    .line 391
    :cond_2
    return-void
.end method
