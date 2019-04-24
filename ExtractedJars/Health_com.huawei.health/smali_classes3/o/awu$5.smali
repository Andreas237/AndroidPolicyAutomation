.class final Lo/awu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awu;->b(Landroid/app/Activity;Landroid/os/Handler;Ljava/lang/String;I)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic e:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;Ljava/lang/String;I)V
    .locals 0

    .line 211
    iput-object p1, p0, Lo/awu$5;->e:Landroid/os/Handler;

    iput-object p2, p0, Lo/awu$5;->b:Ljava/lang/String;

    iput p3, p0, Lo/awu$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 216
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/awu$5;->e:Landroid/os/Handler;

    iget-object v2, p0, Lo/awu$5;->b:Ljava/lang/String;

    iget v3, p0, Lo/awu$5;->a:I

    invoke-static {v1, v2, v3}, Lo/awu;->a(Landroid/os/Handler;Ljava/lang/String;I)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 217
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 222
    iget-object v0, p0, Lo/awu$5;->e:Landroid/os/Handler;

    const/16 v1, 0x303

    invoke-static {v0, v1, p1, p2}, Lo/awu;->e(Landroid/os/Handler;III)V

    .line 223
    return-void
.end method
