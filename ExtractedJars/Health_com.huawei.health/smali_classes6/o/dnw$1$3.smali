.class Lo/dnw$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw$1;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:Landroid/content/Context;

.field final synthetic e:Lo/dnw$1;


# direct methods
.method constructor <init>(Lo/dnw$1;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lo/dnw$1$3;->e:Lo/dnw$1;

    iput-object p2, p0, Lo/dnw$1$3;->c:Landroid/content/Context;

    iput-object p3, p0, Lo/dnw$1$3;->b:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 155
    iget-object v0, p0, Lo/dnw$1$3;->e:Lo/dnw$1;

    iget-object v1, p0, Lo/dnw$1$3;->c:Landroid/content/Context;

    iget-object v2, p0, Lo/dnw$1$3;->b:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2}, Lo/dnw$1;->c(Landroid/content/Context;Landroid/content/Intent;)V

    .line 157
    return-void
.end method
