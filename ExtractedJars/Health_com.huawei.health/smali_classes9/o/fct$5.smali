.class Lo/fct$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fct;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/acu;

.field final synthetic d:Lo/fct;


# direct methods
.method constructor <init>(Lo/fct;Lo/acu;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lo/fct$5;->d:Lo/fct;

    iput-object p2, p0, Lo/fct$5;->c:Lo/acu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 266
    iget-object v0, p0, Lo/fct$5;->d:Lo/fct;

    invoke-static {v0}, Lo/fct;->e(Lo/fct;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/fct$5;->c:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/feh;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 267
    return-void
.end method
