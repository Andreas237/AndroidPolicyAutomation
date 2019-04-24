.class Lo/cbo$5;
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
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lo/cbo;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/cbo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/content/Context;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lo/cbo$5;->b:Lo/cbo;

    iput-object p2, p0, Lo/cbo$5;->c:Ljava/lang/String;

    iput-object p3, p0, Lo/cbo$5;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/cbo$5;->a:Ljava/util/List;

    iput-object p5, p0, Lo/cbo$5;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 159
    iget-object v0, p0, Lo/cbo$5;->b:Lo/cbo;

    iget-object v1, p0, Lo/cbo$5;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/cbo$5;->d:Ljava/lang/String;

    iget-object v4, p0, Lo/cbo$5;->a:Ljava/util/List;

    new-instance v5, Lo/cbo$5$2;

    invoke-direct {v5, p0}, Lo/cbo$5$2;-><init>(Lo/cbo$5;)V

    const/4 v3, 0x1

    invoke-static/range {v0 .. v5}, Lo/cbo;->a(Lo/cbo;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lo/czi;)V

    .line 166
    iget-object v0, p0, Lo/cbo$5;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_if_agree_authorize"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 168
    iget-object v0, p0, Lo/cbo$5;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_wether_to_auth"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 169
    iget-object v0, p0, Lo/cbo$5;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_wether_to_auth"

    .line 170
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 169
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 171
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 172
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    return-void
.end method
