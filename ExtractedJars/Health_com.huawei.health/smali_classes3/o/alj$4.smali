.class Lo/alj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alj;->c(Landroid/content/Context;Lo/alj$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic d:Lo/alj$d;

.field final synthetic e:Lo/alj;


# direct methods
.method constructor <init>(Lo/alj;Landroid/content/Context;Lo/alj$d;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lo/alj$4;->e:Lo/alj;

    iput-object p2, p0, Lo/alj$4;->b:Landroid/content/Context;

    iput-object p3, p0, Lo/alj$4;->d:Lo/alj$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 342
    iget-object v0, p0, Lo/alj$4;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/alj$4;->d:Lo/alj$d;

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lo/alj;->d(Landroid/content/Context;ILo/alj$d;)V

    .line 343
    return-void
.end method
