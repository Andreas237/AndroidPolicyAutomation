.class Lo/afq$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->e(Lo/afr;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lo/afq;


# direct methods
.method constructor <init>(Lo/afq;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lo/afq$10;->d:Lo/afq;

    iput-object p2, p0, Lo/afq$10;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/afq$10;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 610
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    iget-object v1, p0, Lo/afq$10;->d:Lo/afq;

    invoke-static {v1}, Lo/afq;->e(Lo/afq;)Lo/aey;

    move-result-object v1

    iget-object v2, p0, Lo/afq$10;->b:Ljava/lang/String;

    iget-object v3, p0, Lo/afq$10;->a:Ljava/lang/String;

    iget-object v4, p0, Lo/afq$10;->d:Lo/afq;

    invoke-static {v4}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afn;->e(Lo/aey;Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 611
    return-void
.end method
