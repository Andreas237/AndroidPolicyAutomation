.class Lo/exh$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exh;->d(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/exh;


# direct methods
.method constructor <init>(Lo/exh;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lo/exh$6;->c:Lo/exh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 198
    iget-object v0, p0, Lo/exh$6;->c:Lo/exh;

    invoke-static {v0}, Lo/exh;->a(Lo/exh;)V

    .line 199
    iget-object v0, p0, Lo/exh$6;->c:Lo/exh;

    invoke-static {v0}, Lo/exh;->c(Lo/exh;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 200
    iget-object v0, p0, Lo/exh$6;->c:Lo/exh;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exh;->a(Lo/exh;Lo/egy;)Lo/egy;

    .line 201
    return-void
.end method
