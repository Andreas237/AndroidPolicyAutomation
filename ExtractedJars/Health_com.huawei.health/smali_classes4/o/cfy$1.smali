.class Lo/cfy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cfy;->d(Ljava/lang/String;Ljava/lang/String;ZIIZLo/cfy$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cfy;

.field final synthetic e:Lo/cfy$d;


# direct methods
.method constructor <init>(Lo/cfy;Lo/cfy$d;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lo/cfy$1;->b:Lo/cfy;

    iput-object p2, p0, Lo/cfy$1;->e:Lo/cfy$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 314
    iget-object v0, p0, Lo/cfy$1;->e:Lo/cfy$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 315
    iget-object v0, p0, Lo/cfy$1;->e:Lo/cfy$d;

    sget-object v1, Lo/cfy$a;->b:Lo/cfy$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/cfy$d;->c(Lo/cfy$a;Ljava/lang/Object;)V

    .line 318
    :cond_0
    return-void
.end method
