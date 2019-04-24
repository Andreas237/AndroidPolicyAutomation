.class Lo/cbo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbo;->b(Ljava/lang/String;Landroid/content/Context;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lo/cbo;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cbo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/cbo$4;->c:Lo/cbo;

    iput-object p2, p0, Lo/cbo$4;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/cbo$4;->a:Ljava/lang/String;

    iput-object p4, p0, Lo/cbo$4;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 119
    iget-object v0, p0, Lo/cbo$4;->c:Lo/cbo;

    iget-object v1, p0, Lo/cbo$4;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/cbo$4;->a:Ljava/lang/String;

    iget-object v4, p0, Lo/cbo$4;->b:Ljava/util/List;

    new-instance v5, Lo/cbo$4$1;

    invoke-direct {v5, p0}, Lo/cbo$4$1;-><init>(Lo/cbo$4;)V

    const/4 v3, 0x1

    invoke-static/range {v0 .. v5}, Lo/cbo;->a(Lo/cbo;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lo/czi;)V

    .line 125
    return-void
.end method
