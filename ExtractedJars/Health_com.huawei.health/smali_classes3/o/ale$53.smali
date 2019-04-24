.class Lo/ale$53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/ale;I)V
    .locals 0

    .line 3870
    iput-object p1, p0, Lo/ale$53;->b:Lo/ale;

    iput p2, p0, Lo/ale$53;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 3873
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iget v1, p0, Lo/ale$53;->c:I

    invoke-virtual {v0, v1}, Lo/dde;->c(I)V

    .line 3874
    return-void
.end method
