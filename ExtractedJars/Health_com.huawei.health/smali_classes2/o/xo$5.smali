.class Lo/xo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/xo;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/xo;


# direct methods
.method constructor <init>(Lo/xo;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/xo$5;->d:Lo/xo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 59
    iget-object v0, p0, Lo/xo$5;->d:Lo/xo;

    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v1

    invoke-virtual {v1}, Lo/wr;->b()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/xo;->a(Lo/xo;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 61
    return-void
.end method
