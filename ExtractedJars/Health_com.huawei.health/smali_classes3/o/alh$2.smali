.class Lo/alh$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alh;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/alh;


# direct methods
.method constructor <init>(Lo/alh;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/alh$2;->a:Lo/alh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 66
    iget-object v0, p0, Lo/alh$2;->a:Lo/alh;

    invoke-static {v0}, Lo/alh;->c(Lo/alh;)Lo/fit;

    move-result-object v0

    iget-object v1, p0, Lo/alh$2;->a:Lo/alh;

    invoke-static {v1}, Lo/alh;->e(Lo/alh;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fit;->c(Landroid/content/Context;)V

    .line 67
    return-void
.end method
