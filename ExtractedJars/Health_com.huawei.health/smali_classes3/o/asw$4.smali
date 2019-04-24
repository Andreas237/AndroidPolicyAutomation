.class Lo/asw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asw;->a(Landroid/content/Context;ILjava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lo/asw;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/asw;Ljava/util/ArrayList;I)V
    .locals 0

    .line 176
    iput-object p1, p0, Lo/asw$4;->b:Lo/asw;

    iput-object p2, p0, Lo/asw$4;->a:Ljava/util/ArrayList;

    iput p3, p0, Lo/asw$4;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 180
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asw$4$5;

    invoke-direct {v1, p0}, Lo/asw$4$5;-><init>(Lo/asw$4;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 198
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 203
    if-eqz p1, :cond_0

    .line 205
    iget-object v0, p0, Lo/asw$4;->b:Lo/asw;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/asw;->b(Lo/asw;III)V

    .line 207
    :cond_0
    return-void
.end method
