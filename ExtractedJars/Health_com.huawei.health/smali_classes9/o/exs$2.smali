.class Lo/exs$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exs;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exs;


# direct methods
.method constructor <init>(Lo/exs;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lo/exs$2;->a:Lo/exs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 144
    iget-object v0, p0, Lo/exs$2;->a:Lo/exs;

    invoke-static {v0}, Lo/exs;->e(Lo/exs;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/exs$2$3;

    invoke-direct {v2, p0}, Lo/exs$2$3;-><init>(Lo/exs$2;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 165
    return-void
.end method
