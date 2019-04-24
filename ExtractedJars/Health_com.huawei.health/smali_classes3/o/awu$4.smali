.class final Lo/awu$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awu;->b(IIILandroid/os/Handler;Ljava/lang/String;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroid/os/Handler;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(IIILandroid/os/Handler;Ljava/lang/String;)V
    .locals 0

    .line 296
    iput p1, p0, Lo/awu$4;->c:I

    iput p2, p0, Lo/awu$4;->d:I

    iput p3, p0, Lo/awu$4;->a:I

    iput-object p4, p0, Lo/awu$4;->b:Landroid/os/Handler;

    iput-object p5, p0, Lo/awu$4;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 301
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget v1, p0, Lo/awu$4;->c:I

    iget v2, p0, Lo/awu$4;->d:I

    iget v3, p0, Lo/awu$4;->a:I

    iget-object v4, p0, Lo/awu$4;->b:Landroid/os/Handler;

    iget-object v5, p0, Lo/awu$4;->e:Ljava/lang/String;

    invoke-static {v1, v2, v3, v4, v5}, Lo/awu;->d(IIILandroid/os/Handler;Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 302
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 307
    iget-object v0, p0, Lo/awu$4;->b:Landroid/os/Handler;

    const/16 v1, 0x303

    invoke-static {v0, v1, p1, p2}, Lo/awu;->e(Landroid/os/Handler;III)V

    .line 308
    return-void
.end method
