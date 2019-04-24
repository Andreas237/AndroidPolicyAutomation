.class Lo/dlf$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;I)V
    .locals 0

    .line 139
    iput-object p1, p0, Lo/dlf$3;->d:Lo/dlf;

    iput p2, p0, Lo/dlf$3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 142
    iget-object v0, p0, Lo/dlf$3;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iget v1, p0, Lo/dlf$3;->c:I

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 143
    return-void
.end method
