.class Lo/bxb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxb;->b(ILandroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bxb;

.field final synthetic d:Landroid/view/View$OnClickListener;


# direct methods
.method constructor <init>(Lo/bxb;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 667
    iput-object p1, p0, Lo/bxb$2;->a:Lo/bxb;

    iput-object p2, p0, Lo/bxb$2;->d:Landroid/view/View$OnClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 670
    iget-object v0, p0, Lo/bxb$2;->d:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 671
    iget-object v0, p0, Lo/bxb$2;->d:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 673
    :cond_0
    return-void
.end method
