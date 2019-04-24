.class Lo/ahs$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahs;->d(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ahs;

.field final synthetic b:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lo/ahs;Landroid/os/Bundle;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lo/ahs$2;->a:Lo/ahs;

    iput-object p2, p0, Lo/ahs$2;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 237
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    iget-object v1, p0, Lo/ahs$2;->b:Landroid/os/Bundle;

    const-string v2, "devId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahs;->b(Ljava/lang/String;)V

    .line 238
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 239
    return-void
.end method
