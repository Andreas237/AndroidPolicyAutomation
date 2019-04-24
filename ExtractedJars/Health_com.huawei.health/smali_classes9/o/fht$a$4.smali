.class Lo/fht$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fht$a;->d()Landroid/support/v4/view/PagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fht$a;


# direct methods
.method constructor <init>(Lo/fht$a;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 130
    iget-object v0, p0, Lo/fht$a$4;->b:Lo/fht$a;

    iget-object v0, v0, Lo/fht$a;->c:Lo/fht;

    invoke-virtual {v0}, Lo/fht;->dismiss()V

    .line 131
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 132
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fht$a$4;->b:Lo/fht$a;

    .line 134
    invoke-static {v1}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ew:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 135
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v1}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 136
    new-instance v0, Lo/fhl;

    iget-object v1, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v1}, Lo/fht$a;->b(Lo/fht$a;)Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fhl;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v1}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fhl;->b(Landroid/content/Context;)V

    .line 137
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 138
    iget-object v0, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v0}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_wether_to_auth"

    .line 139
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 140
    iget-object v0, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v0}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_wether_to_auth"

    .line 141
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 140
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 142
    iget-object v0, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v0}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_show_update_ove_terms"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 144
    iget-object v0, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v0}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_last_query_time"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 146
    iget-object v0, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v0}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "if_first_agr_sign"

    const-string v3, ""

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 148
    iget-object v0, p0, Lo/fht$a$4;->b:Lo/fht$a;

    iget-object v1, p0, Lo/fht$a$4;->b:Lo/fht$a;

    invoke-static {v1}, Lo/fht$a;->c(Lo/fht$a;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fht$a;->e(Lo/fht$a;Landroid/content/Context;)V

    .line 149
    return-void
.end method
