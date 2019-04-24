.class Lo/exh$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exh;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic e:Lo/exh;


# direct methods
.method constructor <init>(Lo/exh;Landroid/content/Context;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lo/exh$3;->e:Lo/exh;

    iput-object p2, p0, Lo/exh$3;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 164
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/exh$3;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 165
    const-string v0, "url"

    const-string v1, "https://messagecenter.hicloud.com/messageH5/sleephtml/salesPromotion.html"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 166
    iget-object v0, p0, Lo/exh$3;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 167
    return-void
.end method
