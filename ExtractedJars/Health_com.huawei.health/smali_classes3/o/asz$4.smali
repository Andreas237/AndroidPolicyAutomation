.class Lo/asz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asz;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/asz;


# direct methods
.method constructor <init>(Lo/asz;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lo/asz$4;->b:Lo/asz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 189
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/asz$4$1;

    invoke-direct {v1, p0}, Lo/asz$4$1;-><init>(Lo/asz$4;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 199
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 204
    return-void
.end method
