.class Lo/ale$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;I)V
    .locals 0

    .line 1061
    iput-object p1, p0, Lo/ale$7;->b:Lo/ale;

    iput p2, p0, Lo/ale$7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1064
    iget-object v0, p0, Lo/ale$7;->b:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->P()V

    .line 1065
    iget v0, p0, Lo/ale$7;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1066
    iget-object v0, p0, Lo/ale$7;->b:Lo/ale;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;I)V

    goto :goto_0

    .line 1067
    :cond_0
    iget v0, p0, Lo/ale$7;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1068
    iget-object v0, p0, Lo/ale$7;->b:Lo/ale;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;I)V

    .line 1070
    :cond_1
    :goto_0
    return-void
.end method
